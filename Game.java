public class Game {
    public static void main(String[] args) {

        // Create characters using the factory
        Character warrior = CharacterFactory.createCharacter("warrior");
        Character mage = CharacterFactory.createCharacter("mage");

        // Equip weapons using decorators
        warrior.equipWeapon(new Sword()); // Cast to Warrior to access equipWeapon
        mage.equipWeapon(new MagicWand());   // Cast to Mage to access equipWeapon

        // Upgrade weapons
        warrior.getWeapon().upgrade();  // Cast to Sword and Warrior to upgrade
        mage.getWeapon().upgrade();    // Cast to MagicWand and Mage to upgrade

        // Simple fight simulation
        while (warrior.isAlive() && mage.isAlive()) {
            warrior.attack(mage);
            mage.attack(warrior);
        }

        if (warrior.isAlive()) {
            System.out.println("Warrior wins!");
        } else {
            System.out.println("Mage wins!");
        }
    }
}

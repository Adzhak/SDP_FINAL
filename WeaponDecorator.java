public class WeaponDecorator extends Character {
    protected Character character;
    protected Weapon weapon; // New field for the weapon

    public WeaponDecorator(Character character, Weapon weapon) {
        super(character.health, character.baseDamage, character.damageStrategy);
        this.character = character;
        this.weapon = weapon;
    }

    @Override
    public void attack(Character target) {
        // Delegate the attack to the original character
        character.attack(target);
    }

    @Override
    public int getBaseDamage() {
        // Access the baseDamage of the original character directly
        return character.getBaseDamage();
    }

    @Override
    public int getUpgradedDamage() {
        return weapon.getUpgradedDamage(); // Access the upgraded damage of the weapon
    }

    @Override
    public void upgrade() {
        weapon.upgrade();
    }

    @Override
    public boolean isUpgraded() {
        return weapon.isUpgraded();
    }

    @Override
    public DamageStrategy getDamageStrategy() {
        return character.getDamageStrategy();
    }
}

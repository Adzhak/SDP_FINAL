public class Warrior extends Character {
    public Warrior() {
        super(100, new PhysicalDamageStrategy());
    }

    @Override
    public void attack(Character target) {
        int baseDamage = weapon != null ? weapon.getBaseDamage() : 0;
        int totalDamage = damageStrategy.calculateDamage(baseDamage);

        if (weapon != null && weapon.isUpgraded()) {
            totalDamage += weapon.getUpgradedDamage();
        }

        target.takeDamage(totalDamage);
    }
}
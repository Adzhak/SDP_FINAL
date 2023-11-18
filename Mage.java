public class Mage extends Character {
    public Mage() {
        super(50, new MagicDamageStrategy());
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
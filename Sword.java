public class Sword implements Weapon {
    private int baseDamage = 20;
    private int upgradedDamage = 30;
    private boolean isUpgraded = false;
    private DamageStrategy damageStrategy = new PhysicalDamageStrategy();

    @Override
    public int getBaseDamage() {
        return baseDamage;
    }

    @Override
    public int getUpgradedDamage() {
        return upgradedDamage;
    }

    @Override
    public void upgrade() {
        isUpgraded = true;
    }

    @Override
    public boolean isUpgraded() {
        return isUpgraded;
    }

    @Override
    public DamageStrategy getDamageStrategy() {
        return damageStrategy;
    }
}
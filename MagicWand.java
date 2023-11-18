public class MagicWand implements Weapon {
    private int baseDamage = 30;
    private int upgradedDamage = 40;
    private boolean isUpgraded = false;
    private DamageStrategy damageStrategy = new MagicDamageStrategy();

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
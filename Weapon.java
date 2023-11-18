public interface Weapon {
    int getBaseDamage();
    int getUpgradedDamage();
    void upgrade();
    boolean isUpgraded();
    DamageStrategy getDamageStrategy();
}
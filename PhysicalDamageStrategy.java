public class PhysicalDamageStrategy implements DamageStrategy {
    @Override
    public int calculateDamage(int baseDamage) {
        // Calculate physical damage (no additional calculations)
        return baseDamage;
    }
}

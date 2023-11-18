public class SwordDecorator extends WeaponDecorator {
    public SwordDecorator(Character character, Sword sword) {
        super(character, sword);
    }

    @Override
    public int getBaseDamage() {
        // Add Sword-specific bonus if needed
        return super.getBaseDamage();
    }
}

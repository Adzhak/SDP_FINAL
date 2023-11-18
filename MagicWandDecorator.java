public class MagicWandDecorator extends WeaponDecorator {
    public MagicWandDecorator(Character character, MagicWand magicWand) {
        super(character, magicWand);
    }

    @Override
    public int getBaseDamage() {
        // Add MagicWand-specific bonus if needed
        return super.getBaseDamage();
    }
}

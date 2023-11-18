public abstract class Character {
    protected int health;
    protected int baseDamage; // Retain the baseDamage field
    protected DamageStrategy damageStrategy;
    protected Weapon weapon; // New field for the weapon

    public Character(int health, int baseDamage, DamageStrategy damageStrategy) {
        this.health = health;
        this.baseDamage = baseDamage;
        this.damageStrategy = damageStrategy;
        this.weapon = null; // Initialize with no weapon
    }

    public void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public abstract void attack(Character target);

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    public boolean isAlive() {
        return this.health > 0;
    }
}
public class CharacterFactory {
    public static Character createCharacter(String type) {
        switch (type) {
            case "warrior":
                return new Warrior();
            case "mage":
                return new Mage();
            default:
                throw new IllegalArgumentException("Unknown character type");
        }
    }
}

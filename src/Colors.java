import java.security.SecureRandom;
public enum Colors {
    YELLOW,
    RED,
    GREEN,
    BLUE,
    WHITE,
    BLACK,
    PURPLE,
    ORANGE,
    GREY;
    private static final SecureRandom random = new SecureRandom();
    public static Colors getRandomColor () {
        int x = random.nextInt(Colors.class.getEnumConstants().length);
        return Colors.class.getEnumConstants()[x];
    }
}

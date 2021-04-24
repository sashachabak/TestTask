import java.util.*;

public class Main {
    private static final double RANGE_MIN = 1;
    private static final double RANGE_MAX = 100;

    private static final Random random = new Random();

    public static Shape getRandomShape() throws Exception {
        switch (random.nextInt(4)) {
            case 0:
                return new Square(getRandomValue());
            case 1:
                return new Circle(getRandomValue());
            case 2:
                return new Triangle(getRandomValue(), getRandomValue());
            case 3:
                return new Trapezoid(getRandomValue(), getRandomValue(), getRandomValue());
            default:
                throw new Exception("FALSE RANDOM VALUE!");
        }
    }

    public static double getRandomValue () {
        return Math.round(RANGE_MIN + (RANGE_MAX - RANGE_MIN) * random.nextDouble() * 100) / 100.00;
    }

    public static void printShapes (HashSet figures) {
        Iterator<Shape> i = figures.iterator();
        while (i.hasNext()) {
            i.next().draw();
        }

    }
    public static void main(String[] args) throws Exception {
        HashSet<Shape> figures = new HashSet<>();
        int capacity = random.nextInt(10000);
        for(int i = 0; i < capacity; i++) {
            figures.add(getRandomShape());
        }
        printShapes(figures);
    }
}

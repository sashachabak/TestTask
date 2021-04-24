import java.util.Arrays;

public abstract class Shape {
    protected String color;

    Shape() {
        color = null;
    }
    Shape (String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public abstract double getArea();
    public void draw() {
        System.out.println(this);
    }
    public String toString() {
        return "Shape: " + this.getClass().getSimpleName() + ", color: " + getColor();
    }
}

class Square extends Shape {
    private double side;

    Square(double side) {
        super(Colors.YELLOW.name());
        this.side = side;
    }
    public double getSide() {
        return side;
    }
    @Override
    public double getArea() {
        return Math.round(side * side * 100)/100.00;
    }
    @Override
    public String toString() {
        return super.toString() + ", side: " + getSide() + ", area: " + getArea();
    }

}

class Circle extends Shape {
    private double radius;

    Circle (double radius) {
        super(Colors.BLUE.name());
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getDiameter() {
        return radius * 2;
    }

    @Override
    public double getArea() {
        return Math.round(Math.pow(radius, 2) * Math.PI * 100) / 100.00;
    }
    @Override
    public String toString() {
        return super.toString() + ", radius: " + getRadius() + "s " + ", diameter: " + getDiameter() + ", area: " + getArea();
    }
}

class Triangle extends Shape {
    private double katet1, katet2, hipotenuse;

    public Triangle(double katet1, double katet2) {
        super(Colors.BLUE.name());
        this.katet1 = katet1;
        this.katet2 = katet2;
        this.hipotenuse = Math.sqrt(Math.pow(katet1, 2) + Math.pow(katet2, 2));
    }

    public double[] getSideSet() {
        return new double[]{katet1, katet2, hipotenuse};
    }
    public double getHipotenuse() {
        return hipotenuse;
    }
    @Override
    public double getArea() {
        double pp = (katet1 + katet2 + hipotenuse) / 2.0; // полупериметр
        return Math.round(Math.sqrt(pp * (pp - katet1) * (pp - katet2) * (pp - hipotenuse)) * 100) % 100.00;
    }
    @Override
    public String toString() {
        return super.toString() + ", sideSet: " + Arrays.toString(getSideSet()) + ", hipotenuse:  " + getHipotenuse() + ", area: " + getArea();
    }
}

class Trapezoid extends Shape {
    double side1, side2, h;

    Trapezoid(double side1, double side2, double h) {
        super(Colors.BLUE.name());
        this.side1 = side1;
        this.side2 = side2;
        this.h = h;
    }

    @Override
    public double getArea() {
        return Math.round((side1+side2)/2*h * 100) / 100.00;
    }
    @Override
    public String toString() {
        return super.toString() + ", area: " + getArea();
    }
}

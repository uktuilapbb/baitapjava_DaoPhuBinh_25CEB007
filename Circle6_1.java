public class Circle6_1 extends Shape6_1 {
    private double radius;

    public Circle6_1() {
        super();
        radius = 1.0;
    }

    public Circle6_1(double radius) {
        super();
        this.radius = radius;
    }

    public Circle6_1(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", " + super.toString() + "]";
    }
}

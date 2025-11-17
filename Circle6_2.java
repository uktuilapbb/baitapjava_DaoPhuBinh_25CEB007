public class Circle6_2 implements GeometricObject6_2 {
    private double radius;

    public Circle6_2() {
        radius = 1.0;
    }

    public Circle6_2(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle2[radius=" + radius + "]";
    }
}

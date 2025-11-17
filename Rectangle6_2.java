public class Rectangle6_2 implements GeometricObject6_2 {
    private double width;
    private double length;

    public Rectangle6_2() {
        width = 1.0;
        length = 1.0;
    }

    public Rectangle6_2(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }


    public String toString() {
        return "Rectangle2[width=" + width + ", length=" + length + "]";
    }
}

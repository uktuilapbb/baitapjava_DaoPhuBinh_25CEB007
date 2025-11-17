public class Rectangle6_1 extends Shape6_1 {
    private double width;
    private double length;

    public Rectangle6_1() {
        super();
        width = 1.0;
        length = 1.0;
    }

    public Rectangle6_1(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle6_1(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle[width=" + width + ", length=" + length + ", " + super.toString() + "]";
    }
}

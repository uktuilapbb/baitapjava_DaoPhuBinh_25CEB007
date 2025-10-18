public class Rectangle1_3 {
    private float length;
    private float width;

    public Rectangle1_3() {
        this.length = 1.0f;
        this.width = 1.0f;
    }

    public Rectangle1_3(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength() {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    //dientich
    public double getArea() {
        return (length * width);
    }

    // chu vi
    public double getPerimeter() {
        return (2 * (length + width));
    }

    public String toString() {
        return "Rectangle[length= " + length + " ,width= " + width+ "]";
    }
}


public abstract class Shape6_1 {
    protected String color ;
    protected Boolean filled ;

    public Shape6_1(){
        color = "red" ;
        filled = true ;
    }

    public Shape6_1(String color , boolean filled){
        this.color = color ;
        this.filled = filled ;
    }
    public String getColor(){
        return color ;
    }
    public void setColor(String color){
        this.color = color ;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape[color=" + color + ", filled=" + filled + "]";
    }
}

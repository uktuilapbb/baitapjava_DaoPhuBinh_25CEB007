public class Circle {
    private double radius ;
    private String color ;

    public Circle(){
        radius = 1.0;
        color = "red";
    }
    public Circle(double radius){
        this.radius = radius ;
        this.color = "red" ;
    }
    public Circle(double radius , String color){
        this.radius = radius ;
        this.color = color ;
    }

    public double getRadius() {
        return radius;
    }
    public String color(){
        return color;
    }
    public void setRadius(){
        this.radius = radius;
    }
    public void setColor(){
        this.color = color ;
    }

    public double getArea(){
        return Math.PI*Math.pow(radius , 2);
    }
    public String toString(){
        return("Circle[radius= "+radius + " , color= "+color+"]");
    }
}

public class Circle5_2 {
    private double radius ;
    private String color ;

    public Circle5_2(){
        this.radius = 1.0 ;
        this.color = "red" ;
    }
    public Circle5_2(double radius){
        this.radius = radius ;
        this.color = "red" ;
    }
    public Circle5_2(double radius , String color){
        this.radius = radius ;
        this.color = color ;
    }

    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color ;
    }
    public void setRadius(double radius){
        this.radius = radius ;
    }
    public void setColor(String color){
        this.color = color ;
    }
    public double getArea(){
        return radius*radius*Math.PI ;
    }

    public String toString(){
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }
}

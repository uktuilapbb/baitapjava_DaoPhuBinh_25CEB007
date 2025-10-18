public class Circle1_2 {
    private double radius ;

    public Circle1_2(){
        this.radius = 1.0 ;
    }
    public Circle1_2(double radius) {
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    //diện tích hình tròn
    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }
    //chu vi hình tròn
    public double getCircumference() {
        return 2*Math.PI*radius ;
    }
    public String toString(){
        return("Circle[radius = "+radius+"]");
    }

}


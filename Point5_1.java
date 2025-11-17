public class Point5_1 {
    private int x ;
    private int y;

    public  Point5_1(){
        this.x = 0;
        this.y = 0;
    }
    public Point5_1(int x , int y){
        this.x = x ;
        this.y = y;
    }
    //getters
    public int getX(){
        return x;
    }
    public int getY(){
        return y ;
    }
    //setters
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void setXY(int x , int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "Point: (" + x + "," + y + ")";
    }

}

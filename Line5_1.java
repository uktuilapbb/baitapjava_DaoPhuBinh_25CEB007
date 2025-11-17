public class Line5_1 {
    private Point5_1 begin ;
    private Point5_1 end;

    public Line5_1(Point5_1 begin , Point5_1 end){
        this.begin = begin ;
        this.end = end;
    }
    public Line5_1(int x1 , int x2 , int y1 , int y2){
        this.begin = new Point5_1(x1 , y1);
        this.end = new Point5_1(x2 , y2) ;
    }

    //getters
    public Point5_1 getBegin(){
        return begin ;
    }
    public Point5_1 getEnd(){
        return end;
    }
    public void setBegin(){
        this.begin = begin ;
    }
    public void setEnd(){
        this.end = end ;
    }
    public int getBeginX(){
        return begin.getX() ;
    }
    public int getBeginY(){
        return begin.getY();
    }
    public int getEndX(){
        return end.getX();
    }
    public int getEndY(){
        return end.getY() ;
    }

    public void setBegin(Point5_1 begin){
        this.begin = begin ;
    }
    public void setEnd(Point5_1 end){
        this.end = end ;
    }
    public void setBeginXY(int x , int y){
        begin.setXY(x,y) ;
    }
    public void setEndXY(int x , int y){
        end.setXY(x,y) ;
    }

    //Tính độ dài đt điểm đầu tới điểm cuối
    //Tính băng căn bậc 2 ( (x2-x1)^2 + (y2 - y1)^2 )
    public int getLength(){
        int xDiff = getEndX() - getBeginX() ; // x2 - x1
        int yDiff = getEndY() - getBeginY() ; // y2 - y1
        return(int) Math.sqrt(xDiff*xDiff + yDiff*yDiff) ; // ép double về int
    }
    //Tính độ dốc đoạn thẳng
    // công thức tính là : arctan((y2-y1)/(x2-x1))
    public double getGradient(){
        int xDiff = getEndX() - getBeginX() ; // x2 - x1
        int yDiff = getEndY() - getBeginY() ; // y2 - y1
        return Math.atan2(yDiff , xDiff) ;
    }

}

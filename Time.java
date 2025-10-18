public class Time {
   private int hour ;
   private int minute ;
   private int second ;

   public Time(int hour , int minute , int second){
       this.hour = hour ;
       this.minute = minute ;
       this.second = second ;
   }
   public int getHour(){
       return hour;
   }
   public int getMinute(){
       return minute;
   }
   public int getSecond(){
       return second;
   }

   public void setHour(int hour){
       if(hour >= 0 && hour <= 24) {
           this.hour = hour;
       }else {
           System.out.println("Giờ chỉ nhận giá trị ");
       }
   }
   public void setMinute(int minute){
    if (minute >= 0 && minute < 60) {
        this.minute = minute;
    } else {
        System.out.println("Phút phải trong khoảng 0–59!");
    }
}
    public void setSecond(int second) {
        if (second >= 0 && second < 60) {
            this.second = second;
        } else {
            System.out.println(" Giây phải trong khoảng 0–59!");
        }
    }
    public void setTime(int hour , int minute , int second){
        if (hour >= 0 && hour < 24 &&
                minute >= 0 && minute < 60 &&
                second >= 0 && second < 60) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            System.out.println(" Thời gian không hợp lệ (0≤h<24, 0≤m<60, 0≤s<60)!");
        }
    }
    // hh:mm:ss
    public String toString(){
       String hh = (hour <10 ? "0" + hour : ""+hour);
       String mm = (minute <10 ? "0" +minute : "" +minute);
       String ss = (second <10 ? "0" +second : "" +second);
       return (hh + ":"+mm+":"+ss);
    }
    //điều kiện để giờ k trên 24 , phút k trên 60 , giây k trên 60
    //nextSecond
    public Time nextSecond(){
       second ++ ;
       if (second >= 60){
           second = 0;
           minute ++ ;
           if(minute >= 60){
               minute = 0;
               second ++ ;
               if(hour >= 24){
                   hour =0;
               }
           }
       }
       return this;
    }
    //previousSecond
    public Time previousSecond(){
       second-- ;
       if(second <0){
           second =59 ;
           minute-- ;
           if(minute <0 ){
               minute = 59;
               hour-- ;
               if(hour <0) {
                   hour = 23;
               }
           }
       }
       return this;

    }
}

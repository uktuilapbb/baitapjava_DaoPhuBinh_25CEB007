public class Customer2_5 {
    private int id ;
    private String name;
    private char gender ;
    private int discount;

    public Customer2_5(int id , String name , int discount){
        this.id = id;
        this.name = name ;
        this.discount = discount;
    }
    public int getId(){
        return id ;
    }
    public String getName(){
        return name ;
    }
    public int getDiscount() {
        return discount;
    }
    public void setDiscount(int discount){
        this.discount = discount;
    }
    public char getGender(){
        return gender;
    }
    public String toSting(){
        return ( name+"("+id+")" );
    }


}

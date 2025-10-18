public class Book2_1 {
    private String name;
    private Author2_1 author;
    private double price;
    private int qty = 0;

    public Book2_1(String name , Author2_1 author , double price){
        this.name = name ;
        this.author = author ;
        this.price = price ;
    }
    public Book2_1(String name , Author2_1 author , double price , int qty){
        this.name=name;
        this.author=author;
        this.price=price;
        this.qty=qty;
    }
    public String getName(){
        return name;
    }
    public Author2_1 getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public int getQty(){
        return qty;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public void setQty(int qty){
        this.qty=qty;
    }
    public void setQty(){
        this.qty=qty;
    }
    public String toString(){
        return("Book[name= "+name+" ,Author[name= "+author.getName()+",email= " + author.getEmail()+" ,gender= "+author.getGender()+"],price= "+price+" ,qty= "+qty+"]");
    }
}

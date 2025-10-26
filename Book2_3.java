public class Book2_3 {
    private String isbn ;
    private String name ;
    private Author2_3 author ;
    private double price;
    private int qty=0;

    public Book2_3(String isbn , String name , Author2_3 author , double price){
        this.isbn = isbn ;
        this.name = name ;
        this.author = author ;
        this.price = price ;
    }
    public Book2_3(String isbn , String name , Author2_3 author , double price , int qty){
        this.isbn = isbn;
        this.name = name ;
        this.author = author ;
        this.price = price ;
        this.qty = qty ;
    }
    public String getIsbn(){
        return isbn;
    }
    public String getName(){
        return name ;
    }
    public Author2_3 getAuthor(){
        return author ;
    }
    public double getPrice(){
        return price ;
    }
    public void setPrice(double price){
        this.price = price ;
    }
    public int getQty(){
        return qty ;
    }
    public void setQty(int qty){
        this.qty = qty ;
    }
    public String getAuthorName(){
        return author.getName();
    }
    public String toString(){
        return("Book[isbn= "+isbn+" ,name= "+name+" ,"+author+" ,price= "+price+" ,qty= "+qty+"]");

    }

}

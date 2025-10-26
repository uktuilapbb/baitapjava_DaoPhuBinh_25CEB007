import java.awt.print.Book;

public class Book2_2 {
    private String name ;
    private Author[] authors;
    private double price ;
    private int qty = 0;

    public Book2_2(String name , Author[] authors ,double price){
        this.name = name;
        this.authors=authors ;
        this.price = price ;
    }
    public Book2_2(String name , Author[] authors , double price , int qty ){
        this.name = name ;
        this.authors = authors;
        this.price = price ;
        this.qty=qty ;
    }
    public String getName(){
        return name ;
    }
    public Author[] getAuthors(){
        return authors ;
    }
    public double getPrice() {
        return price;
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
    public String getAuthorNames() {
        return java.util.Arrays.stream(authors)
                .map(Author::getName)
                .collect(java.util.stream.Collectors.joining(", "));
    }

    public String toString() {
        return "Book[name=" + name +
                ", authors={" + getAuthorNames() + "}" +
                ", price=" + price +
                ", qty=" + qty + "]";
    }

}

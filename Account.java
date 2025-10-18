public class Account {
    private String id ;
    private String name ;
    private int balance ;

    //constructor
    public Account (String id , String name){
        this.id = id;
        this.name = name;
        this.balance = 0;
    }
    public Account(String id , String name , int balance){
        this.id = id;
        this.name = name;
        this.balance = balance ;
    }

    //getter
    public String getId() {
        return id;
    }
    public String getName(){
        return name;
    }
    public int getBalance(){
        return balance ;
    }

    //credit
    public int credit(int amount){
        this.balance += amount;
        return balance;
    }

    //debit
    public int debit(int amount){
        if(amount <= this.balance){
            this.balance -= amount ;
        }else {
            System.out.println("Ban khong du so du");
        }
        return this.balance;
    }

    //transfer
    public int transferTo(Account another , int amount){
        if(amount <= this.balance){
            this.balance -= amount;
        }else {
            System.out.println("Ban khong du so du");
        }
        return this.balance;
    }
    public String toString(){
        return("Account[id= "+this.id+" name= "+this.name+" balance= "+this.balance+"]");
    }

}

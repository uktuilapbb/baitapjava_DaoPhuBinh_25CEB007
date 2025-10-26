public class Account2_5 {
    private int id ;
    private Customer2_5 customer ;
    private double balance = 0 ;

    public Account2_5(int id , Customer2_5 customer , double balance){
        this.id = id ;
        this.customer = customer ;
        this.balance = balance ;
    }
    public Account2_5(int id , Customer2_5 customer ){
        this.id = id;
        this.customer = customer ;
    }
    public int getId(){
        return id;
    }
    public Customer2_5 getCustomer(){
        return customer;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public String getCustomerName(){
        return customer.getName();
    }
    //Nap tien vao tai khoan
    public void credit(double amount){
        balance += amount ;
    }
    //rut tien ra tk
    public void debit(double amount){
        if(amount <= balance){
            balance -= amount;
        }else{
            System.out.println("Amount withdrawn exceeds the current balance");
        }
    }
    public void transferTo(Account2_5 another,double amount){
        if (amount <= balance) {
            this.debit(amount);
            another.credit(amount);
        } else {
            System.out.println("Transfer failed: insufficient funds");
        }
    }
    public String toString(){
        return "Account[id=" + id + ",customer=" + customer + ",balance=" + balance + "]";
    }
}

public class Invoice2_4 {
    private int id;
    private Customer2_4 customer;
    private double amount;

    public Invoice2_4(int id, Customer2_4 customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer2_4 getCustomer() {
        return customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerId() {
        return customer.getId();
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public int getCustomerDiscount() {
        return customer.getDiscount();
    }

    public double getAmountAfterDiscount() {
        double discountPerc = customer.getDiscount() / 100.0;
        return amount * (1 - discountPerc);
    }

    @Override
    public String toString() {
        return "Invoice[id=" + id
                + ",customer=" + customer.toString()
                + ",amount=" + amount + "]";
    }
}

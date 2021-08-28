package course.entities;

public class Account {

    //Attributes
    private Integer number;
    private String holder;
    private Double balance;

    //Constructor
    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Account(Integer number, String holder) {
        this.holder = holder;
        this.number = number;
    }

    //Getters and Setters
    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    protected void setBalance(Double balance) {
        this.balance = balance;
    }

    //Methods
    public void deposit(double value) {
        setBalance(getBalance() + value);
    }

    public void withdraw(double value) {
        setBalance(getBalance() - (value + 5));
    }

    @Override
    public String toString() {
        return "Account " + getNumber() +" , Holder: " + getHolder() + " , Balance: $ " + getBalance();
    }
}

package model.entities;

public class Account {

    //Attributes
    private int number;
    private String holder;
    private double balance;

    //Constructor
    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    //Getters and Setters
    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    //Methods
    public void deposit(double value) {
        balance += value;
    }

    public void withdraw(double value) {
        balance -= value + 5;
    }

    @Override
    public String toString() {
        return "Account " + getNumber() +" , Holder: " + getHolder() + " , Balance: $ " + getBalance();
    }
}

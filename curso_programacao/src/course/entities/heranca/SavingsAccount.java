package course.entities.heranca;

public final class SavingsAccount extends Account {

    private Double interestRace;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRace) {
        super(number, holder, balance);
        this.interestRace = interestRace;
    }

    public Double getInterestRace() {
        return interestRace;
    }

    public void setInterestRace(Double interestRace) {
        this.interestRace = interestRace;
    }

    public void updateBalance() {
        balance += balance * interestRace;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }
}

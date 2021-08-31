package course.entities.heranca;

public class SavingsAccount extends Account {

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
    public void withDraw(double amount) {
        super.withDraw(amount);
        balance -= 2.0;
    }
}

package model.entities;

public class Company extends TaxPayer{

    private Integer numberOfEmployees;

    public Company(String name, Double annualIncome, Integer numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployee() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployee(Integer numberOfEmployee) {
        this.numberOfEmployees = numberOfEmployee;
    }

    @Override
    public double tax() {
        if (numberOfEmployees > 10) {
            return getAnnualIncome() * 0.14;
        }
        else {
            return getAnnualIncome() * 0.16;
        }
    }
}

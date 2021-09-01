package model.entities;

public class ImportProduct extends Product3 {

    private Double customFee;

    public ImportProduct(String name, Double price, Double customFee) {
        super(name, price);
        this.customFee = customFee;
    }

    public Double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(Double customFee) {
        this.customFee = customFee;
    }

    public Double totalPrice() {
        return customFee + getPrice();
    }

    @Override
    public String priceTag() {
        return getName()
                + " $ "
                + String.format("%.2f", totalPrice())
                + " (Customs fee: $ "
                + String.format("%.2f", customFee)
                + ")";
    }

}

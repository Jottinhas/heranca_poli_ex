package entities;

public class individual extends TaxPay {

    private Double health;

    public individual(){}

    public individual(String name, Double annualIncome, Double health) {
        super(name, annualIncome);
        this.health = health;
    }

    public Double getHealth() {
        return health;
    }

    public void setHealth(Double health) {
        this.health = health;
    }

    @Override
    public double tax() {
        if (getAnnualIncome() < 200000){
           return getAnnualIncome() * 0.15 - health * 0.5;
        } else {
            return getAnnualIncome() + 0.25 - health * 0.5;
        }
    }
}

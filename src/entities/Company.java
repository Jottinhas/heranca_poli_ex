package entities;

public class Company extends TaxPay {

    private Integer employers;

    public Company() {
    }

    public Company(String name, Double annualIncome, Integer employers) {
        super(name, annualIncome);
        this.employers = employers;
    }

    public Integer getEmployers() {
        return employers;
    }

    public void setEmployers(Integer employers) {
        this.employers = employers;
    }

    @Override
    public double tax() {
        if (employers < 10){
            return getAnnualIncome() * 0.16;
        }else {
            return getAnnualIncome() * 0.14;
        }
    }


}

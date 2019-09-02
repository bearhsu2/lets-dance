package idv.kuma.employee;

public class AnnuallyPaidEmployee implements Employee {


    private double amount;

    public AnnuallyPaidEmployee(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public double getPay() {
        return amount;
    }
}

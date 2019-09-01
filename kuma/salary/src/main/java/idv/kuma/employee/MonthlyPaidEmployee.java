package idv.kuma.employee;

public class MonthlyPaidEmployee implements Employee {

    private double monthlyPay;

    public MonthlyPaidEmployee(MonthlyPay monthlyPay) {
        this.monthlyPay = monthlyPay.getAmount();
    }

    @Override
    public double getPay() {
        return monthlyPay * 12;
    }
}

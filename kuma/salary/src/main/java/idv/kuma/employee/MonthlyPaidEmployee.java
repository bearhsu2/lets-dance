package idv.kuma.employee;

public class MonthlyPaidEmployee implements Employee {

    private double monthlyPay;

    public MonthlyPaidEmployee(double monthlyPay) {
        this.monthlyPay = monthlyPay;
    }


    @Override
    public double getPay() {
        return monthlyPay * 12;
    }
}

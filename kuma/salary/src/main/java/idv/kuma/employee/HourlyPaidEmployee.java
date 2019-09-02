package idv.kuma.employee;

public class HourlyPaidEmployee implements Employee {


    private double hourlyAmount;
    private int hours;

    public HourlyPaidEmployee(double hourlyAmount, int hours) {
        this.hourlyAmount = hourlyAmount;
        this.hours = hours;
    }

    @Override
    public double getPay() {
        return hourlyAmount * hours;
    }
}

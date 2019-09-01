package idv.kuma;

import idv.kuma.employee.Employee;

public class HourlyPaidEmployee implements Employee {


    private HourlyPay hourlyPay;
    private int hours;

    public HourlyPaidEmployee(HourlyPay hourlyPay, int hours) {
        this.hourlyPay = hourlyPay;
        this.hours = hours;
    }

    @Override
    public double getPay() {
        return hourlyPay.getHourlyPay() * hours;
    }
}

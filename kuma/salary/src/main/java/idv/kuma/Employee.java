package idv.kuma;

public class Employee {

    String name;

    double monthlyPay;

    double annualPay;

    double hourlyPay;
    int hours;


    public Employee(AnnualPay annualPay) {
        this.annualPay = annualPay.getAnnualPay();
    }

    public Employee(MonthlyPay monthlyPay) {
        this.monthlyPay = monthlyPay.getMonthlyPay();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMonthlyPay() {
        return monthlyPay;
    }

    public void setMonthlyPay(double monthlyPay) {
        this.monthlyPay = monthlyPay;
    }

    public double getAnnualPay() {
        return annualPay;
    }

    public void setAnnualPay(double annualPay) {
        this.annualPay = annualPay;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    double getPay() {

        double pay = 0;


        if (getAnnualPay() > 0) {
            pay = getAnnualPay();
        } else {
            pay = getMonthlyPay() * 12;
        }
        return pay;
    }
}

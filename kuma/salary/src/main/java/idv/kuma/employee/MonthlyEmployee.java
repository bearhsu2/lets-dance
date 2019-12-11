package idv.kuma.employee;

public class MonthlyEmployee implements IEmployee {

    private double monthly;


    public MonthlyEmployee(double monthly) {
        this.monthly = monthly;
    }


    @Override
    public double getPayment() {

            return getMonthly() * 12;
    }


    public double getMonthly() {
        return monthly;
    }


    public void setMonthly(double monthly) {

        this.monthly = monthly;


    }
}



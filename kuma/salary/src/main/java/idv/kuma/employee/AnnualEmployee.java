package idv.kuma.employee;

public class AnnualEmployee implements IEmployee {

    private double annual;


    public AnnualEmployee(double annual) {
        this.annual = annual;
    }


    @Override
    public double getPayment() {
        return getAnnual();

    }


    public double getAnnual() {
        return annual;
    }


    public void setAnnual(double annual) {
        this.annual = annual;
    }
}


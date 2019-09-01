package idv.kuma;

public class AnnuallyPaidEmployee implements Employee {


    private double annualPay;


    public AnnuallyPaidEmployee(AnnualPay annualPay) {
        this.annualPay = annualPay.getAmount();
    }


    public double getAnnualPay() {
        return annualPay;
    }

    public void setAnnualPay(double annualPay) {
        this.annualPay = annualPay;
    }


    @Override
    public double getPay() {
        return annualPay;
    }
}

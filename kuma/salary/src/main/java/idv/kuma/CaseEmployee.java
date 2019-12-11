package idv.kuma;

import idv.kuma.employee.IEmployee;

public class CaseEmployee implements IEmployee {
    private double unit;
    private int times;


    public double getUnit() {
        return unit;
    }


    public void setUnit(double unit) {
        this.unit = unit;
    }


    public int getTimes() {
        return times;
    }


    public void setTimes(int times) {
        this.times = times;
    }


    public CaseEmployee(double unit, int times) {
        this.unit = unit;
        this.times = times;
    }


    @Override
    public double getPayment() {
        return unit * times;
    }
}

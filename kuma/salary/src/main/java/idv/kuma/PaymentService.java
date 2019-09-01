package idv.kuma;

/**
 * Hello world!
 */
public class PaymentService {

    private EmployeeRepo employeeRepo;

    public PaymentService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public double getAll() {


        Employee employee = employeeRepo.getAll().get(0);

        double pay = 0;
        if (employee.getAnnualPay() > 0) {
            pay = employee.getAnnualPay();
        } else {
            pay = employee.getMonthlyPay() * 12;
        }

        return pay;

    }

}

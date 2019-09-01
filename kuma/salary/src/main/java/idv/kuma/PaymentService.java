package idv.kuma;

import java.util.List;

/**
 * Hello world!
 */
public class PaymentService {

    private EmployeeRepo employeeRepo;

    public PaymentService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public double getAll() {

        double pay = employeeRepo.getAll().get(0).getAnnualPay();

        return pay;

    }

}

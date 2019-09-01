package idv.kuma;

import java.util.List;

/**
 * Hello world!
 */
public class SalaryService {

    private EmployeeRepo employeeRepo;

    public SalaryService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public double getAll() {

        double pay = employeeRepo.getAll().get(0).annualPay;

        return pay;

    }

}

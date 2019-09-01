package idv.kuma;

import idv.kuma.employee.Employee;

/**
 * Hello world!
 */
public class PaymentService {

    private EmployeeRepo employeeRepo;

    public PaymentService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public double getAll() {
        
        return employeeRepo
                .getAll()
                .stream()
                .mapToDouble(Employee::getPay)
                .sum();


    }

}

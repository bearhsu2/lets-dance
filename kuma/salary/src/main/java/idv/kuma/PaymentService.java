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

        return employee.getPay();

    }

}

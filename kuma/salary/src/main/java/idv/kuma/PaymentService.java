package idv.kuma;

public class PaymentService {

    private EmployeeRepo employeeRepo;


    public PaymentService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }


}

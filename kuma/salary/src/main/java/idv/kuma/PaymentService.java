package idv.kuma;

import idv.kuma.employee.IEmployee;

public class PaymentService {

    private EmployeeRepo employeeRepo;


    public PaymentService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }


    public double allPayment() {

        return employeeRepo.getAll()
                .stream()
                .mapToDouble(IEmployee::getPayment)
                .sum();

    }


}

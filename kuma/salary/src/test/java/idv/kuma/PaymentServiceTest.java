package idv.kuma;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;

import static org.mockito.Mockito.when;

/**
 * Unit test for simple App.
 */
public class PaymentServiceTest {


    private final double DELTA = 0.001;

    @Test
    public void When_Annual_Then_Direct_AnnualPay() {

        EmployeeRepo mockedEmployeeRepo = prepareEmployeeRepo(
                new Employee(300)
        );


        PaymentService paymentService = new PaymentService(mockedEmployeeRepo);

        Assert.assertEquals(300, paymentService.getAll(), DELTA);
    }


    @Test
    public void When_Monthly_Then_MonthlyPay_Times_12() {


        Employee employee = new Employee(0);
        employee.setMonthlyPay(10);
        EmployeeRepo mockedEmployeeRepo = prepareEmployeeRepo(
                employee
        );


        PaymentService paymentService = new PaymentService(mockedEmployeeRepo);

        Assert.assertEquals(120, paymentService.getAll(), DELTA);
    }

    private EmployeeRepo prepareEmployeeRepo(Employee... employees) {
        EmployeeRepo mockedEmployeeRepo = Mockito.mock(EmployeeRepo.class);

        when(mockedEmployeeRepo.getAll()).thenReturn(
                Arrays.asList(employees)
        );
        return mockedEmployeeRepo;
    }

}

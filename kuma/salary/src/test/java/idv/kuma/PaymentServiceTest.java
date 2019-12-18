package idv.kuma;

import idv.kuma.employee.Employee;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Unit test for simple App.
 */
public class PaymentServiceTest {


    private static final double DELTA = 0.001;


    @Test
    public void Given_Annual_100_Then_100() {

        EmployeeRepo employeeRepo = mock(EmployeeRepo.class);
        Employee employee = new Employee();
        employee.setAnnual(100D);
        when(employeeRepo.getAll()).thenReturn(
                Arrays.asList(
                        employee
                )
        );
        PaymentService service = new PaymentService(employeeRepo);
        
        double actual  = service.getTotalPayment();

        Assert.assertEquals(100D, actual, DELTA);
    }
}

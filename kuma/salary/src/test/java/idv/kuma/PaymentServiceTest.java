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
    private EmployeeRepo mockedEmployeeRepo;
    private PaymentService paymentService;

    @Test
    public void When_Annual_Then_Direct_AnnualPay() {

        prepareEmployRepo(
                new Employee(new AnnualPay(300))
        );

        runAndCheck(300);
    }

    private void prepareEmployRepo(Employee... employees) {
        mockedEmployeeRepo = Mockito.mock(EmployeeRepo.class);

        when(mockedEmployeeRepo.getAll()).thenReturn(
                Arrays.asList(
                        employees
                )
        );
    }

    private void runAndCheck(int expectedPayment) {
        paymentService = new PaymentService(mockedEmployeeRepo);

        Assert.assertEquals(expectedPayment, paymentService.getAll(), DELTA);
    }


    @Test
    public void When_Monthly_Then_MonthlyPay_Times_12() {


        prepareEmployRepo(
                new Employee(new MonthlyPay(10))
        );

        runAndCheck(120);
    }

}

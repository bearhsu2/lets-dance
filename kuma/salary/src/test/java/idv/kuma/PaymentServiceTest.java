package idv.kuma;

import idv.kuma.employee.AnnualEmployee;
import idv.kuma.employee.IEmployee;
import idv.kuma.employee.MonthlyEmployee;
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
    private EmployeeRepo employeeRepo;


    @Test
    public void Given_Annual_100_Monthly_10_Case_10_5_Then_270() {

        prepareEmployeeRepo(
                makeCase(10D, 5),
                makeAnnual(100D),
                makeMonthly(10D)
        );

        runAndCheck(270D);

    }


    private void prepareEmployeeRepo(IEmployee... employee) {
        employeeRepo = Mockito.mock(EmployeeRepo.class);
        when(employeeRepo.getAll()).thenReturn(
                Arrays.asList(
                        employee
                )
        );
    }


    private IEmployee makeCase(double unit, int times) {
        return new CaseEmployee(unit, times);
    }


    private IEmployee makeAnnual(double annual) {
        AnnualEmployee employee = new AnnualEmployee(annual);
        return employee;
    }


    private IEmployee makeMonthly(double monthly) {
        MonthlyEmployee employee = new MonthlyEmployee(monthly);
        return employee;
    }


    private void runAndCheck(double expected) {
        Assert.assertEquals(expected, new PaymentService(employeeRepo).allPayment(), DELTA);
    }


    @Test
    public void Given_Case_10_5_Then_50() {

        prepareEmployeeRepo(makeCase(10D, 5));

        runAndCheck(50d);

    }


    @Test
    public void Given_Monthly_10_Then_120() {

        prepareEmployeeRepo(makeMonthly(10D));

        runAndCheck(120d);

    }


    @Test
    public void Given_Annual_100_Then_100() {

        prepareEmployeeRepo(makeAnnual(100D));

        runAndCheck(100d);

    }
}

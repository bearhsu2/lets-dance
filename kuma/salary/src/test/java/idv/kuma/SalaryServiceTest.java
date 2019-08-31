package idv.kuma;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;

import static org.mockito.Mockito.when;

/**
 * Unit test for simple App.
 */
public class SalaryServiceTest {


    @Test
    public void When_Annual_Then_Direct_AnnualSalary() {

        EmployeeRepo employeeRepo = Mockito.mock(EmployeeRepo.class);
        when(employeeRepo.getAll()).thenReturn(Arrays.asList(
                new Employee(300)
        ));


        SalaryService salaryService = new SalaryService(employeeRepo);

        Assert.assertEquals(300, salaryService.getAll(), 0.001);
    }

}

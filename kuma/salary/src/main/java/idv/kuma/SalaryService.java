package idv.kuma;

import java.time.YearMonth;
import java.util.List;

/**
 * Hello world!
 */
public class SalaryService {


    private SalaryProfileRepo salaryProfileRepo;

    public SalaryService(SalaryProfileRepo salaryProfileRepo) {
        this.salaryProfileRepo = salaryProfileRepo;
    }

    public double getAll() {

        List<SalaryProfile> profiles = salaryProfileRepo.getAll();


        double total = 0.0;
        for (SalaryProfile profile : profiles) {


            if (profile.annualSalary > 0) {
                total += profile.annualSalary;
            } else {
                total += profile.monthlySalary * 12;
            }

        }

        return total;

    }

}

package idv.kuma;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void When_1_Then_1() {

        runAndCheck("1", 1);
    }

    @Test
    public void When_2_Then_2() {

        runAndCheck("2", 2);
    }


    @Test
    public void When_3_Then_Fizz() {

        runAndCheck("Fizz", 3);
    }

    @Test
    public void When_5_Then_Buzz() {

        runAndCheck("Buzz", 5);
    }

    @Test
    public void When_15_Then_FizzBuzz() {

        runAndCheck("FizzBuzz", 15);
    }

    private void runAndCheck(String output, int input) {
        Assert.assertEquals(output, new FizzBuzz().calculate(input));
    }
}
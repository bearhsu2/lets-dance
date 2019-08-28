package idv.kuma;

public class FizzBuzz {


    private int input;
    private StringBuffer sb;

    public String calculate(int input) {

        this.input = input;
        this.sb = new StringBuffer();

        attemptToAppend(3, "Fizz");
        attemptToAppend(5, "Buzz");

        checkEmpty();

        return makeString();
    }

    private String makeString() {
        return sb.toString();
    }

    private void checkEmpty() {
        if (isEmpty(sb)) sb.append(input);
    }

    private void attemptToAppend(int divider, String string) {
        if (isDivisible(input, divider)) sb.append(string);
    }

    private boolean isEmpty(StringBuffer stringBuffer) {
        return stringBuffer.length() == 0;
    }

    private boolean isDivisible(int input, int i) {
        return input % i == 0;
    }
}

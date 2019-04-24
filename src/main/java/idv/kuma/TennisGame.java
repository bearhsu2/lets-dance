package idv.kuma;

public class TennisGame {

    int a;
    int b;


    public String getScore() {
        return getA() + " : " + getB();
    }

    private int getB() {
        if (b == 0) {
            return 0;
        } else if (b == 1) {
            return 15;
        } else if (b == 2) {
            return 30;
        } else {
            return 40;
        }
    }

    private int getA() {
        if (a == 0) {
            return 0;
        } else if (a == 1) {
            return 15;
        } else if (a == 2) {
            return 30;
        } else {
            return 40;
        }
    }

    public TennisGame a() {
        a++;
        return this;
    }

    public TennisGame b() {
        b++;
        return this;
    }
}

package idv.kuma;

public class TennisGame {

    int a;


    public String getScore() {
        return getA() + " : 0";
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
}

package idv.kuma;

public class TennisGame {

    int aHits;
    int bHits;


    public String getScore() {
        return getA() + " : " + getB();
    }

    private int getB() {
        if (bHits == 0) {
            return 0;
        } else if (bHits == 1) {
            return 15;
        } else if (bHits == 2) {
            return 30;
        } else {
            return 40;
        }
    }

    private int getA() {
        if (aHits == 0) {
            return 0;
        } else if (aHits == 1) {
            return 15;
        } else if (aHits == 2) {
            return 30;
        } else {
            return 40;
        }
    }

    public TennisGame a() {
        aHits++;
        return this;
    }

    public TennisGame b() {
        bHits++;
        return this;
    }
}

package idv.kuma;

public class TennisGame {

    int aPoints = 0;
    int bPoints = 0;

    public TennisGame a() {
        aPoints += 15;
        return this;
    }

    public TennisGame b() {
        bPoints += 15;
        return this;
    }

    public String show() {
        return aPoints + ":" + bPoints;
    }
}

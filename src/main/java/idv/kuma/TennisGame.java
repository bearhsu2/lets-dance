package idv.kuma;

public class TennisGame {

    int aPoint = 0;
    int bPoint = 0;


    public TennisGame a() {
        aPoint += 15;
        return this;
    }

    public String getResult() {
        return aPoint + ":" + bPoint;
    }
}

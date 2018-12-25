package idv.kuma;

public class TennisGame {


    private int aHits = 0;
    private int bHits = 0;


    public TennisGame a() {
        aHits += 15;
        return this;
    }

    public String getScores() {
        return aHits + ":" + bHits;
    }
}

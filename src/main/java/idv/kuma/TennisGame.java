package idv.kuma;

public class TennisGame {


    private int aHits = 0;
    private int bHits = 0;

    public TennisGame a() {
        aHits++;
        return this;
    }

    public TennisGame b() {
        bHits++;
        return this;
    }

    public String show() {

        return aHits * 15 + ":" + bHits * 15 ;
    }
}

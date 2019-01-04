package idv.kuma;

public class TennisGame {


    private int aHits = 0;
    private int bHits = 0;

    public void a() {
        aHits++;
    }

    public void b() {
        bHits++;
    }

    public String show() {

        return aHits * 15 + ":" + bHits * 15 ;
    }
}

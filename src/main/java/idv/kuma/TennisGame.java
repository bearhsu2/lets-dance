package idv.kuma;

import java.util.HashMap;
import java.util.Map;

public class TennisGame {


    private int aHits = 0;
    private int bHits = 0;

    private Map<Integer, Integer> hitsToScore = new HashMap<>();


    {

        hitsToScore.put(0, 0);
        hitsToScore.put(1, 15);
        hitsToScore.put(2, 30);
        hitsToScore.put(3, 40);
    }

    public TennisGame a() {
        aHits++;
        return this;
    }

    public TennisGame b() {
        bHits++;
        return this;
    }

    public String show() {

        return hitsToScore.get(aHits) + ":" + hitsToScore.get(bHits);
    }
}

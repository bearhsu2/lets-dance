package idv.kuma;

import java.util.HashMap;
import java.util.Map;

public class TennisGame {

    static Map<Integer, Integer> hitsToScore = new HashMap<>();

    static {
        hitsToScore.put(0, 0);
        hitsToScore.put(1, 15);
        hitsToScore.put(2, 30);
        hitsToScore.put(3, 40);
    }

    int aHits = 0;
    int bHits = 0;

    public TennisGame a() {
        aHits++;
        return this;
    }

    public TennisGame b() {
        bHits++;
        return this;
    }

    public String show() {

        if (aHits == 3 && bHits == 3){ return "Deuce";}

        if (aHits == 4 && bHits < 3) return "A Wins";
        if (aHits == 4 && bHits == 3) return "A Plus";
        if (bHits == 4 && aHits < 3) return "B Wins";
        if (bHits == 4 && aHits == 3) return "B Plus";

        return hitsToScore.get(aHits) + ":" + hitsToScore.get(bHits);
    }
}

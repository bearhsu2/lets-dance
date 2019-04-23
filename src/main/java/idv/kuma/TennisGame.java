package idv.kuma;

import java.util.HashMap;
import java.util.Map;

public class TennisGame {

    private static Map<Integer, Integer> hitToScore = new HashMap<>();

    static {
        hitToScore.put(0, 0);
        hitToScore.put(1, 15);
        hitToScore.put(2, 30);
        hitToScore.put(3, 40);
    }


    private int aHit = 0;
    private int bHit = 0;

    public String getScore() {
        return hitToScore.get(aHit) + " : " + hitToScore.get(bHit);
    }

    public TennisGame a() {
        aHit++;
        return this;
    }

    public TennisGame b() {
        bHit++;
        return this;
    }
}

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

        if (checkDeuce()) return "Deuce";

        if (checkAdv(aHit, bHit)) return "A Adv";

        if (checkAdv(bHit, aHit)) return "B Adv";


        return hitToScore.get(aHit) + " : " + hitToScore.get(bHit);
    }

    private boolean checkAdv(int hit, int anotherHit) {
        return hit == 4 && anotherHit == 3;
    }

    private boolean checkDeuce() {
        return aHit == 3 && bHit == 3;
    }

    public TennisGame a() {
        aHit++;

        attemptBackToDeuce();

        return this;
    }

    private void attemptBackToDeuce() {
        if (aHit == 4 && bHit == 4) {
            aHit = 3;
            bHit = 3;
        }
    }

    public TennisGame b() {
        bHit++;
        
        attemptBackToDeuce();

        return this;
    }
}

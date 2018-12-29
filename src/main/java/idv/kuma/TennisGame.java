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

        if (aHits == 4 && bHits == 4){
            aHits = 3;
            bHits = 3;
        }

        return this;
    }

    public TennisGame b() {
        bHits++;


        if (aHits == 4 && bHits == 4){
            aHits = 3;
            bHits = 3;
        }
        
        return this;
    }

    public String show() {

        if (aHits == 3 && bHits == 3) {
            return "Deuce";
        }

        if (aHits == 4) return (bHits < 3 ? "A Wins" : "A Plus");
        if (bHits == 4) return (aHits < 3 ? "B Wins" : "B Plus");

        if (aHits == 5) return "A Wins";
        if (bHits == 5) return "B Wins";

        return hitsToScore.get(aHits) + ":" + hitsToScore.get(bHits);
    }
}

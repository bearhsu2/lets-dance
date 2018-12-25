package idv.kuma;

import java.util.HashMap;
import java.util.Map;

public class TennisGame {


    private int aHits = 0;
    private int bHits = 0;

    private static Map<Integer, String> numHitsToPoints = new HashMap<>();

    {
        numHitsToPoints.put(0, "0");
        numHitsToPoints.put(1, "15");
        numHitsToPoints.put(2, "30");
        numHitsToPoints.put(3, "40");

    }


    public TennisGame a() {
        aHits ++;
        return this;
    }

    public String getScores() {

        if (aHits == 4) {return "A Wins";}


        return getPoints(aHits) + ":" + getPoints(bHits);

    }

    private static String getPoints(int hits) {


        return numHitsToPoints.get(hits);
    }


}

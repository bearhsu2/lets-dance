package idv.kuma;

import java.util.HashMap;
import java.util.Map;

public class TennisGame {


    private static Map<Integer, String> numHitsToPoints = new HashMap<>();
    private int aHits = 0;
    private int bHits = 0;

    {
        numHitsToPoints.put(0, "0");
        numHitsToPoints.put(1, "15");
        numHitsToPoints.put(2, "30");
        numHitsToPoints.put(3, "40");

    }

    private static String getPoints(int hits) {


        return numHitsToPoints.get(hits);
    }

    public TennisGame a() {
        aHits++;


        tryJumpBackToDeuce();
        return this;
    }

    private void tryJumpBackToDeuce() {
        if (aHits == 4 && bHits == 4) {
            aHits = 3;
            bHits = 3;
        }
    }

    public TennisGame b() {
        bHits++;

        tryJumpBackToDeuce();

        return this;
    }

    public String getScores() {

        if (aHits == 4 && bHits < 3) return "A Wins";
        if (aHits == 4 && bHits == 3) return "A Plus";

        if (bHits == 4 && aHits < 3) return "B Wins";
        if (bHits == 4 && aHits == 3) return "B Plus";


        if (aHits == 3 && bHits == 3) return "Deuce";

        return getPoints(aHits) + ":" + getPoints(bHits);

    }

}

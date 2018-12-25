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

        if (aHits == 4 && bHits == 4) {
            aHits = 3;
            bHits = 3;
        }

        return this;
    }

    public String getScores() {

        if (checkWin(aHits, bHits)) return "A Wins";
        if (checkPlus(aHits, bHits)) return "A Plus";

        if (checkWin(bHits, aHits)) return "B Wins";
        if (checkPlus(bHits, aHits)) return "B Plus";

        if (checkDeuce(aHits, bHits)) return "Deuce";

        return getPoints(aHits) + ":" + getPoints(bHits);

    }

    private boolean checkDeuce(int hit1, int hit2) {
        return hit1 == 3 && hit2 == 3;
    }

    private boolean checkPlus(int hit1, int hit2) {
        return hit1 == 4 && hit2 == 3;
    }

    private boolean checkWin(int hit1, int hit2) {
        return hit1 == 4 && hit2 < 3;
    }

}

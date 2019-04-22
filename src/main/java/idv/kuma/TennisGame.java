package idv.kuma;

import java.util.HashMap;
import java.util.Map;

public class TennisGame {

    private static Map<Integer, String> hitsToShow = new HashMap<>();

    static {
        hitsToShow.put(0, "Love");
        hitsToShow.put(1, "15");
        hitsToShow.put(2, "30");
        hitsToShow.put(3, "40");
    }


    private int aHits;
    private int bHits;

    public String getScore() {

        if (checkWin(aHits, bHits)) return "A Wins";
        if (checkWin(bHits, aHits)) return "B Wins";

        if (checkAdv(aHits, bHits)) return "A Adv";
        if (checkAdv(bHits, aHits)) return "B Adv";

        if (checkDeuce()) return "Deuce";

        return toShow(aHits) + " : " + toShow(bHits);
    }

    private boolean checkWin(int hits, int anotherHits) {
        return  (hits > 4 && anotherHits == 3) || (hits == 4 && anotherHits < 3);
    }

    private boolean checkDeuce() {
        return aHits == 3 && bHits == 3;
    }

    private boolean checkAdv(int hits, int anotherHits) {
        return hits == 4 && anotherHits == 3;
    }

    private String toShow(int hits) {

        return hitsToShow.get(hits);
    }

    public void a() {
        aHits++;
        attemptToStepBack();

    }

    public void b() {
        bHits++;

        attemptToStepBack();
    }

    private void attemptToStepBack() {
        if (aHits == 4 && bHits == 4) {
            aHits--;
            bHits--;
        }
    }
}

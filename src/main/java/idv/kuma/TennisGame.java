package idv.kuma;

import java.util.HashMap;
import java.util.Map;

public class TennisGame {


    private int aHit = 0;

    public String getScore() {
        return aHit * 15 + " : 0";
    }

    public void a() {
        aHit++;
    }
}

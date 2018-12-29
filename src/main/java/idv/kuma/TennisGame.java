package idv.kuma;

public class TennisGame {

    int aPoints = 0;
    int bPoints = 0;

    public void a() {
        aPoints += 15;
    }

    public void b() {
        bPoints += 15;
    }

    public String show() {
        return aPoints + ":" + bPoints;
    }
}

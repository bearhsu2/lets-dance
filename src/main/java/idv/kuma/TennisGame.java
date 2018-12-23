package idv.kuma;

public class TennisGame {

    int aPoint = 0;
    int bPoint = 0;


    public TennisGame a() {
        aPoint = getNext(aPoint);
        return this;
    }


    public TennisGame b() {
        bPoint = getNext(bPoint);
        return this;
    }


    private int getNext(int current) {
        if (current == 30) {
            return 40;
        } else {
            return current + 15;
        }
    }

    public String getResult() {
        if (aPoint == 55) return "A Win";
        if (bPoint == 55) return "B Win";

        return aPoint + ":" + bPoint;
    }
}


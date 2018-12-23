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
        if (aPoint == 55 && bPoint < 40) return "A Win";
        if (aPoint == 55 && bPoint == 40) return "A+";
        if (bPoint == 55) return "B Win";
        if (aPoint == 40 && bPoint == 40) return "Deuce";

        return aPoint + ":" + bPoint;
    }
}


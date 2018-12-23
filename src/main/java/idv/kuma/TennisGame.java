package idv.kuma;

public class TennisGame {

    int aPoint = 0;
    int bPoint = 0;


    public TennisGame a() {
        aPoint = getNext(aPoint);
        checkDeuce();
        return this;
    }

    private void checkDeuce() {
        if (aPoint == 55 && bPoint == 55) {
            aPoint = 40;
            bPoint = 40;
        }
    }


    public TennisGame b() {
        bPoint = getNext(bPoint);
        checkDeuce();
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
        
        if (bPoint == 55 && aPoint < 40) return "B Win";
        if (bPoint == 55 && aPoint == 40) return "B+";

        if (aPoint == 40 && bPoint == 40) return "Deuce";

        return aPoint + ":" + bPoint;
    }
}


package idv.kuma;

public class TennisGame {

    TennisPoint aPoint = new TennisPoint();
    TennisPoint bPoint = new TennisPoint();


    public TennisGame a() {
        aPoint.next();
        checkDeuce();
        return this;
    }

    public TennisGame b() {
        bPoint.next();
        checkDeuce();
        return this;
    }

    private void checkDeuce() {
        if (aPoint.getValue() == 55 && bPoint.getValue() == 55) {
            aPoint.setValue(40);
            bPoint.setValue(40);
        }
    }


    public String getResult() {
        if (aPoint.getValue() == 55 && bPoint.getValue() < 40) return "A Win";
        if (aPoint.getValue() == 70 && bPoint.getValue() == 40) return "A Win";
        if (aPoint.getValue() == 55 && bPoint.getValue() == 40) return "A+";

        if (bPoint.getValue() == 55 && aPoint.getValue() < 40) return "B Win";
        if (bPoint.getValue() == 70 && aPoint.getValue() == 40) return "B Win";
        if (bPoint.getValue() == 55 && aPoint.getValue() == 40) return "B+";

        if (aPoint.getValue() == 40 && bPoint.getValue() == 40) return "Deuce";

        return aPoint + ":" + bPoint;
    }

    class TennisPoint {
        int value;

        void next() {
            value = value == 30 ? 40 : value + 15;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "" + value;
        }
    }
}


package idv.kuma;

import java.util.HashMap;
import java.util.Map;

public class TennisGame {


    Map<String, TennisPoint> nameToPoint = new HashMap<>();

    public TennisGame() {
        this.nameToPoint.put("A", new TennisPoint());
        this.nameToPoint.put("B", new TennisPoint());

    }

    public TennisGame a() {
        getPoint("A").next();
        checkDeuce();
        return this;
    }

    public TennisGame b() {
        getPoint("B").next();
        checkDeuce();
        return this;
    }

    private TennisPoint getPoint(String name) {
        return nameToPoint.get(name);
    }

    private void checkDeuce() {
        if (getPoint("A").getValue() == 55 && getPoint("B").getValue() == 55) {
            getPoint("A").setValue(40);
            getPoint("B").setValue(40);
        }
    }


    public String getResult() {
        if (isWin("A", "B")) return "A Win";
        if (isPlus("A", "B")) return "A+";

        if (isWin("B", "A")) return "B Win";
        if (isPlus("B", "A")) return "B+";

        if (isDeuce("A", "B")) return "Deuce";

        return getPoint("A") + ":" + getPoint("B");
    }

    private boolean isDeuce(String name1, String name2) {
        return getPoint(name1).getValue() == 40 && getPoint(name2).getValue() == 40;
    }

    private boolean isPlus(String name1, String b) {
        return getPoint(name1).getValue() == 55 && getPoint(b).getValue() == 40;
    }

    private boolean isWin(String name1, String name2) {
        return getPoint(name1).getValue() == 55 && getPoint(name2).getValue() < 40 ||
                getPoint(name1).getValue() == 70 && getPoint(name2).getValue() == 40;
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


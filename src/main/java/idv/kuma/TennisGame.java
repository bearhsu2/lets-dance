package idv.kuma;

public class TennisGame {

    int aPoint = 0;
    int bPoint = 0;


    public void a() {
        aPoint += 15;
    }

    public String getResult() {
        return aPoint + ":" + bPoint;
    }
}

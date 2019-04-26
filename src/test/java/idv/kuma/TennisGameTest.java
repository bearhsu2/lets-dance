package idv.kuma;

import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest {


    @Test
    public void Init_0_0() {
        TennisGame tennisGame = new TennisGame();

        Assert.assertEquals("0 : 0", tennisGame.getScore());
    }
}
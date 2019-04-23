package idv.kuma;

import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest {

    @Test
    public void When_Init_Then_0_0() {
        TennisGame game = new TennisGame();

        Assert.assertEquals("0 : 0", game.getScore());
    }

    @Test
    public void When_A_Then_15_0() {
        TennisGame game = new TennisGame();

        game.a();

        Assert.assertEquals("15 : 0", game.getScore());
    }
}
package idv.kuma;

import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest {

    @Test
    public void Init_0_0() {
        TennisGame game = new TennisGame();

        Assert.assertEquals("0 : 0", game.getScore());
    }

    @Test
    public void A_15_0() {
        TennisGame game = new TennisGame();

        game.a();

        Assert.assertEquals("15 : 0", game.getScore());
    }

    @Test
    public void AA_30_0() {
        TennisGame game = new TennisGame();

        game.a().a();

        Assert.assertEquals("30 : 0", game.getScore());
    }

    @Test
    public void AAA_40_0() {
        TennisGame game = new TennisGame();

        game.a().a().a();

        Assert.assertEquals("40 : 0", game.getScore());
    }


    @Test
    public void B_0_15() {
        TennisGame game = new TennisGame();

        game.b();

        Assert.assertEquals("0 : 15", game.getScore());
    }


    @Test
    public void BBB_0_40() {
        TennisGame game = new TennisGame();

        game.b().b().b();

        Assert.assertEquals("0 : 40", game.getScore());
    }
}
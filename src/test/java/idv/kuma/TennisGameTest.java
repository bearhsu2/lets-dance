package idv.kuma;

import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest {

    private TennisGame game;

    @Test
    public void When_Init_Then_0_0() {
        game = new TennisGame();

        Assert.assertEquals("0 : 0", game.getScore());
    }

    @Test
    public void When_A_Then_15_0() {
        game = new TennisGame();

        game.a();

        Assert.assertEquals("15 : 0", game.getScore());
    }


    @Test
    public void When_B_Then_0_15() {
        game = new TennisGame();

        game.b();

        Assert.assertEquals("0 : 15", game.getScore());
    }

    @Test
    public void When_AAA_Then_40_0() {
        game = new TennisGame();

        game.a().a().a();

        Assert.assertEquals("40 : 0", game.getScore());
    }

    @Test
    public void When_BBB_Then_0_40() {
        game = new TennisGame();

        game.b().b().b();

        Assert.assertEquals("0 : 40", game.getScore());
    }

    @Test
    public void When_AAABBB_Then_Deuce() {
        game = new TennisGame();

        game.a().a().a().b().b().b();

        Assert.assertEquals("Deuce", game.getScore());
    }

    @Test
    public void When_AAABBBA_Then_Aadv() {
        game = new TennisGame();

        game.a().a().a().b().b().b().a();

        Assert.assertEquals("A Adv", game.getScore());
    }
    @Test
    public void When_AAABBBB_Then_Badv() {
        game = new TennisGame();

        game.a().a().a().b().b().b().b();

        Assert.assertEquals("B Adv", game.getScore());
    }

    @Test
    public void When_AAABBBBA_Then_Deuce() {
        game = new TennisGame();

        game.a().a().a().b().b().b().b().a();

        Assert.assertEquals("Deuce", game.getScore());
    }
}
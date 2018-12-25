package idv.kuma;

import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest {


    @Test
    public void When_Init_Then_0_0() throws Exception {

        TennisGame game = createTennisGame();


        Assert.assertEquals("0:0", game.getScores());

    }
    @Test
    public void When_A_Then_15_0() throws Exception {

        TennisGame game = createTennisGame();

        game.a();

        Assert.assertEquals("15:0", game.getScores());

    }

    @Test
    public void When_AA_Then_30_0() throws Exception {

        TennisGame game = createTennisGame();

        game.a().a();

        Assert.assertEquals("30:0", game.getScores());

    }

    @Test
    public void When_AAA_Then_40_0() throws Exception {

        TennisGame game = createTennisGame();

        game.a().a().a();

        Assert.assertEquals("40:0", game.getScores());

    }

    @Test
    public void When_AAAA_Then_A_Wins() throws Exception {

        TennisGame game = createTennisGame();

        game.a().a().a().a();

        Assert.assertEquals("A Wins", game.getScores());

    }

    @Test
    public void When_BBBB_Then_B_Wins() throws Exception {

        TennisGame game = createTennisGame();

        game.b().b().b().b();

        Assert.assertEquals("B Wins", game.getScores());

    }

    @Test
    public void When_AAABB_Then_40_30() throws Exception {

        TennisGame game = createTennisGame();

        game.a().a().a().b().b();

        Assert.assertEquals("40:30", game.getScores());

    }

    @Test
    public void When_AAABBB_Then_Deuce() throws Exception {

        TennisGame game = createTennisGame();

        game.a().a().a().b().b().b();

        Assert.assertEquals("Deuce", game.getScores());

    }

    @Test
    public void When_AAABBBA_Then_A_Plus() throws Exception {

        TennisGame game = createTennisGame();

        game.a().a().a().b().b().b().a();

        Assert.assertEquals("A Plus", game.getScores());

    }

    private TennisGame createTennisGame() {
        return new TennisGame();
    }


}
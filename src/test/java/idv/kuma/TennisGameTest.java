package idv.kuma;

import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest {


    @Test
    public void When_A_Then_15_0() throws Exception {
        TennisGame game = createGame();

        game.a();

        Assert.assertEquals("15:0", game.getResult());
    }

    @Test
    public void When_B_Then_0_15() throws Exception {
        TennisGame game = createGame();

        game.b();

        Assert.assertEquals("0:15", game.getResult());
    }

    private TennisGame createGame() {
        return new TennisGame();
    }

    @Test
    public void When_AA_Then_30_0() throws Exception {
        TennisGame game = createGame();

        game.a().a();

        Assert.assertEquals("30:0", game.getResult());
    }
    @Test
    public void When_BB_Then_0_30() throws Exception {
        TennisGame game = createGame();

        game.b().b();

        Assert.assertEquals("0:30", game.getResult());
    }

    @Test
    public void When_AAA_Then_40_0() throws Exception {
        TennisGame game = createGame();

        game.a().a().a();

        Assert.assertEquals("40:0", game.getResult());
    }

    @Test
    public void When_BBB_Then_0_40() throws Exception {
        TennisGame game = createGame();

        game.b().b().b();

        Assert.assertEquals("0:40", game.getResult());
    }

    @Test
    public void When_AAAA_Then_A_WIN() throws Exception {
        TennisGame game = createGame();

        game.a().a().a().a();

        Assert.assertEquals("A Win", game.getResult());
    }


    @Test
    public void When_BBBB_Then_B_WIN() throws Exception {
        TennisGame game = createGame();

        game.b().b().b().b();

        Assert.assertEquals("B Win", game.getResult());
    }


}
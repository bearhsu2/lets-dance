package idv.kuma;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TennisGameTest {



    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void When_A_Then_15_0() throws Exception {
        TennisGame game = new TennisGame();

        game.a();

        checkScore("15:0", game);

    }


    @Test
    public void When_AA_Then_30_0() throws Exception {
        TennisGame game = new TennisGame();

        game.a().a();

        checkScore("30:0", game);

    }

    @Test
    public void When_AAA_Then_40_0() throws Exception {
        TennisGame game = new TennisGame();

        game.a().a().a();

        checkScore("40:0", game);

    }

    @Test
    public void When_AAAA_Then_A_Wins() throws Exception {
        TennisGame game = new TennisGame();

        game.a().a().a().a();

        checkScore("A Wins", game);

    }

    @Test
    public void When_AAABBB_Then_Deuce() throws Exception {
        TennisGame game = new TennisGame();

        game.a().a().a().b().b().b();

        checkScore("Deuce", game);

    }

    private void checkScore(String expected, TennisGame game) {
        Assert.assertEquals(expected, game.show());
    }






}
package idv.kuma;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TennisGameTest {


    private TennisGame game;

    @Before
    public void setUp() throws Exception {
        this.game = new TennisGame();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void When_A_Then_15_0() throws Exception {

        game.a();

        checkScore("15:0");

    }


    @Test
    public void When_AA_Then_30_0() throws Exception {

        game.a().a();

        checkScore("30:0");

    }

    @Test
    public void When_AAA_Then_40_0() throws Exception {

        game.a().a().a();

        checkScore("40:0");

    }

    @Test
    public void When_AAAA_Then_A_Wins() throws Exception {

        game.a().a().a().a();

        checkScore("A Wins");

    }

    @Test
    public void When_AAABBB_Then_Deuce() throws Exception {

        game.a().a().a().b().b().b();

        checkScore("Deuce");

    }

    @Test
    public void When_AAABBBA_Then_A_Plus() throws Exception {

        game.a().a().a().b().b().b().a();

        checkScore("A Plus");

    }

    @Test
    public void When_AAABBBAA_Then_A_Wins() throws Exception {

        game.a().a().a().b().b().b().a().a();

        checkScore("A Wins");

    }

    @Test
    public void When_AAABBBAB_Then_Deuce() throws Exception {

        game.a().a().a().b().b().b().a().b();

        checkScore("Deuce");

    }

    private void checkScore(String expected) {
        Assert.assertEquals(expected, game.show());
    }






}
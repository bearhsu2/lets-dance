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

        String score = game.show();

        Assert.assertEquals("15:0", score);

    }


    @Test
    public void When_AA_Then_30_0() throws Exception {
        TennisGame game = new TennisGame();

        game.a().a();

        String score = game.show();

        Assert.assertEquals("30:0", score);

    }






}
package idv.kuma;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TennisGameTest {


    TennisGame game;

    @Before
    public void setUp() throws Exception {
        game = new TennisGame();
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void test_A_Get_1_Score() throws Exception {
        game.aGetScore();

        String[] scores = game.getCurrentScores();

        Assert.assertEquals("15", scores[0]);
        Assert.assertEquals("0", scores[1]);

    }




}
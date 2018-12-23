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
    public void test_A_Get_1_Score() throws Exception {
        TennisGame game = new TennisGame();

        game.a();

        String result = game.getResult();


        Assert.assertEquals("15:0", result);
    }


}
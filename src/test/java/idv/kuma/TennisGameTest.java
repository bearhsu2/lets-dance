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

        Assert.assertEquals("15:0", game.show());

    }


}
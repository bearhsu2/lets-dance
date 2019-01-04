package idv.kuma;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TennisGameTest {


    private TennisGame game;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void When_A_Then_15_0() throws Exception {

        this.game = new TennisGame();

        game.a();

        Assert.assertEquals("15:0", game.show());

    }

    @Test
    public void When_AA_Then_30_0() throws Exception {

        this.game = new TennisGame();

        game.a().a();

        Assert.assertEquals("30:0", game.show());

    }

    @Test
    public void When_AAA_Then_40_0() throws Exception {

        this.game = new TennisGame();

        game.a().a().a();

        Assert.assertEquals("40:0", game.show());

    }


}
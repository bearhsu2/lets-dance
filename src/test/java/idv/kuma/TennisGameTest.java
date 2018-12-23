package idv.kuma;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TennisGameTest {



    @Test
    public void When_A_Then_15_0() throws Exception {
        TennisGame game = createGame();

        game.a();
        
        Assert.assertEquals("15:0", game.getResult());
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


}
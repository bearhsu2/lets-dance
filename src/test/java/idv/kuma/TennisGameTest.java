package idv.kuma;

import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest {


    @Test
    public void When_A_Then_15_0() throws Exception {

        TennisGame game = createTennisGame();

        game.a();

        Assert.assertEquals("15:0", game.getScores());

    }

    private TennisGame createTennisGame() {
        return new TennisGame();
    }


}
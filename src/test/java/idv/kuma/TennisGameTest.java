package idv.kuma;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TennisGameTest {





    @Test
    public void When_A_Then_15_0() throws Exception {

        TennisGame game = new TennisGame();
        game.a();


        String scores = game.getScores();

        Assert.assertEquals("15:0", scores);

    }




}
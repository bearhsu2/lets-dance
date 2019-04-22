package idv.kuma;

import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest {

    private TennisGame game;

    @Test
    public void When_Init_Then_Love_Love() {

        game = new TennisGame();

        checkScore("Love : Love");
    }

    private void checkScore(String s) {
        Assert.assertEquals(s, game.getScore());
    }


    @Test
    public void When_A_Then_15_Love() {

        game = new TennisGame();

        aScores(1);

        checkScore("15 : Love");
    }

    @Test
    public void When_B_Then_Love_15() {

        game = new TennisGame();
        bScores(1);

        checkScore("Love : 15");
    }

    @Test
    public void When_AB_Then_15_15() {

        game = new TennisGame();

        aScores(1);
        bScores(1);

        checkScore("15 : 15");
    }

    @Test
    public void When_AABA_Then_40_15() {

        game = new TennisGame();

        aScores(2);
        bScores(1);
        aScores(1);

        checkScore("40 : 15");
    }

    private void bScores(int times) {
        for (int i = 0; i < times; i++) {
            game.b();
        }
    }


    @Test
    public void When_AABABB_Then_Deuce() {

        game = new TennisGame();

        aScores(2);
        bScores(1);
        aScores(1);
        bScores(2);

        checkScore("Deuce");
    }

    @Test
    public void When_AABABBB_Then_B_Adv() {

        game = new TennisGame();

        aScores(2);
        bScores(1);
        aScores(1);
        bScores(3);

        checkScore("B Adv");
    }

    @Test
    public void When_AABABBBA_Then_Deuce() {

        game = new TennisGame();

        aScores(2);
        bScores(1);
        aScores(1);
        bScores(3);
        aScores(1);

        checkScore("Deuce");
    }


    @Test
    public void When_AABABBA_Then_A_Adv() {

        game = new TennisGame();

        aScores(2);
        bScores(1);
        aScores(1);
        bScores(2);
        aScores(1);

        checkScore("A Adv");
    }


    @Test
    public void When_AABABBAB_Then_Deuce() {

        game = new TennisGame();

        aScores(2);
        bScores(1);
        aScores(1);
        bScores(2);
        aScores(1);
        bScores(1);

        checkScore("Deuce");
    }

    @Test
    public void When_AABABBAA_Then_A_Wins() {

        game = new TennisGame();

        aScores(2);
        bScores(1);
        aScores(1);
        bScores(2);
        aScores(2);

        checkScore("A Wins");
    }

    @Test
    public void When_AAAA_Then_A_Wins() {

        game = new TennisGame();

        aScores(4);

        checkScore("A Wins");
    }

    @Test
    public void When_BBBB_Then_B_Wins() {

        game = new TennisGame();

        bScores(4);

        checkScore("B Wins");
    }

    private void aScores(int times) {
        for (int i = 0; i < times; i++) {
            game.a();
        }
    }
}
package fr.p10.miage.rps.tests;

import fr.p10.miage.rps.model.RPSEnum;
import fr.p10.miage.rps.model.Result;
import fr.p10.miage.rps.model.RockPaperScissors;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class RockPaperScissorsTest {
    @DataProvider(name = "WinData")
    public static Object[][] createWinData() {
        return new Object[][]{
                {"PAPER", "ROCK"},
                {"ROCK", "SCISSORS"},
                {"SCISSORS", "PAPER"}
        };
    }

    @DataProvider(name = "LostData")
    public static Object[][] createLostData() {
        return new Object[][]{
                {"ROCK", "PAPER"},
                {"SCISSORS", "ROCK"},
                {"PAPER", "SCISSORS"}
        };
    }

    @DataProvider(name = "TieData")
    public static Object[][] createTieData() {
        return new Object[][]{
                {"ROCK", "ROCK"},
                {"SCISSORS", "SCISSORS"},
                {"PAPER", "PAPER"}
        };
    }


    private RockPaperScissors rps;

    @BeforeMethod
    public void setUp() {
        rps = new RockPaperScissors();
    }

    @AfterMethod
    public void tearDown() {
        rps = null;
    }

    @Test(dataProvider = "WinData")
    public void testWinPlay(String p1, String p2) {
        assertEquals(rps.ResultPlay(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.WIN);
    }

    @Test(dataProvider = "LostData")
    public void testLostPlay(String p1, String p2) {
        assertEquals(rps.ResultPlay(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.LOST);
    }

    @Test(dataProvider = "TieData")
    public void testTiePlay(String p1, String p2) {
        assertEquals(rps.ResultPlay(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.TIE);
    }


}

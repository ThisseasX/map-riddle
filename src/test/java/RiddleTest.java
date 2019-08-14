import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class RiddleTest {

    @Test
    public void levelOne() {
        List<Integer> solution = Riddle.solveLevelOne(Riddle.map);
        assertEquals(Riddle.LEVEL_ONE_OUTPUT, solution);
    }

    @Test
    public void levelTwo() {
        String solution = Riddle.solveLevelTwo(Riddle.map);
        assertEquals(Riddle.LEVEL_TWO_OUTPUT, solution);
    }

    @Test
    public void levelThree() {
        String solution = Riddle.solveLevelThree(Riddle.map);
        assertEquals(Riddle.LEVEL_THREE_OUTPUT, solution);
    }

    @Test
    public void levelFour() {
        String solution = Riddle.solveLevelFour(Riddle.map);
        assertEquals(Riddle.LEVEL_FOUR_OUTPUT, solution);
    }
}

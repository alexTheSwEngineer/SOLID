import abstractions.GameState;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by atrposki on 0017,17 Jul/ 17-7-2017.
 */
public class GameStateTest {
    @Test
    public void stableSquare() {
        boolean[][] square=InitialGameStates.getSquare();
        testIterations(square, square, square, square, square);
    }

    @Test
    public void stableBeeHive() {
        boolean[][] beeHive = InitialGameStates.getBeeHive();
        testIterations(beeHive, beeHive, beeHive, beeHive, beeHive);
    }

    @Test
    public void rotatingStick() {
        boolean[][] verticalStick = InitialGameStates.getVerticalStick();
        boolean[][] horisontalStick = InitialGameStates.getHorisontalStick();
        testIterations(verticalStick, horisontalStick, verticalStick, horisontalStick, verticalStick, horisontalStick, verticalStick, horisontalStick);
    }



    private static void assertEqual(GameState gameState, boolean[][] expected, String msg) {
        boolean[][] visited = new boolean[expected.length][expected[0].length];
        gameState.getCells().stream().forEach(x -> {
            visited[x.getX()][x.getY()] = true;
            boolean expectedValue = expected[x.getX()][x.getY()];
            boolean actualValue = x.isAlive();
            Assert.assertEquals(msg + " Wrong cell at (" + x.getX() + "," + x.getY(), actualValue, expectedValue);
        });

        for (boolean[] row : visited) {
            for (boolean visitedFlag : row) {
                Assert.assertTrue(visitedFlag);
            }
        }

    }

    private void testIterations(boolean[][] initial, boolean[][]... iterations) {
        GameState gameState = Main.createGameState();
        gameState.init(initial);

        int ordinal = 0;
        for (boolean[][] iteration : iterations) {
            gameState.tick();
            assertEqual(gameState, iteration, " itteration " + ordinal);
            ordinal++;
        }
    }

}

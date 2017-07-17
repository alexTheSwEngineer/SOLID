import abstractions.GameState;
import impl.atr.GameStateImpl;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by atrposki on 0017,17 Jul/ 17-7-2017.
 */
public class GameStateTest {
    private boolean[][] square = new boolean[][]{new boolean[]{true,true},
                                                       new boolean[]{true,true}};

    private boolean[][] beeHive = new boolean[][]{new boolean[]{false,true,true,false},
                                                       new boolean[]{true,false,false,true},
                                                       new boolean[]{false,true,true,false}};

    private boolean[][] verticalStick = new boolean[][]{new boolean[]{false,true,false},
                                                          new boolean[]{false,true,false},
                                                          new boolean[]{false,true,false}};
    private boolean[][] horisontalStick= new boolean[][]{new boolean[]{false,false,false},
                                                            new boolean[]{true,true,true},
                                                            new boolean[]{false,false,false}};


    private void testIterations(boolean[][] initial, boolean[][]... iterations){
        GameState gameState = null;//TODO instantiate your game state implementation
        gameState.init(initial);

        int ordinal = 0;
        for (boolean[][] iteration : iterations) {
            gameState.tick();
            assertEqual(gameState,iteration," itteration "+ordinal);
            ordinal++;
        }
    }

    @Test
    public void stableSquare(){
        testIterations(square,square,square,square,square);
    }

    @Test
    public void stableBeeHive(){
        testIterations(beeHive,beeHive,beeHive,beeHive,beeHive);
    }

    @Test
    public void rotatingStick(){
        testIterations(verticalStick,horisontalStick,verticalStick,horisontalStick,verticalStick,horisontalStick,verticalStick,horisontalStick);
    }



    private static void assertEqual(GameState gameState,boolean[][] expected,String msg){
        boolean[][] visited = new boolean[expected.length][expected[0].length];
        gameState.getCells().stream().forEach(x->{
            visited[x.getX()][x.getY()]=true;
            boolean expectedValue = expected[x.getX()][x.getY()];
            boolean actualValue = x.isAlive();
            Assert.assertEquals(msg+" Wrong cell at ("+x.getX()+","+x.getY(),actualValue,expectedValue);
        });

        for (boolean[] row : visited) {
            for (boolean visitedFlag : row) {
                Assert.assertTrue(visitedFlag);
            }
        }

    }

}

import abstractions.GameState;
import abstractions.GameView;

/**
 * Created by atrposki on 0017,17 Jul/ 17-7-2017.
 */
public class Main {
    private static final  int MaxLifeCycles = 100;
    private static final  long CycleDurationInMilisec = 500l;

    static boolean[][] pulsarPeriod3;

    public static void main(String[] args){
        GameState gameState = null;
        GameView gameView = null;
        gameState.init(pulsarPeriod3);
        for (int i = 0; i < MaxLifeCycles && !gameState.isLifeExtinct() ; i++) {
            gameState.tick();
            gameView.draw(gameState);
        }
    }

    private static GameState createGameState(){
        //YOUR CODE GOES HERE
        return null;
    }

    private static GameView createGameView(){
        //YOUR CODE GOES HERE
        return null;
    }
}

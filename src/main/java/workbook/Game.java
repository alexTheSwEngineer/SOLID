package workbook;

import workbook.abstractions.GameState;
import workbook.abstractions.GameView;

/**
 * Created by atrposki on 0017,17 Jul/ 17-7-2017.
 */
public class Game implements Runnable {
    private final long MaxLifeCycles;
    private final long CycleDurationInMilisec;
    GameState gameState;
    GameView gameView;

    public Game(GameState gameState, GameView gameView, boolean[][] initialGameState, long maxLifeCycles, long cycleDurationInMilisec) {
        this.MaxLifeCycles = maxLifeCycles;
        this.CycleDurationInMilisec = cycleDurationInMilisec;
        this.gameState = gameState;
        this.gameView = gameView;
        gameState.init(initialGameState);
        gameView.init(gameState);
    }

    private static boolean tryPause(long duration) {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    @Override
    public void run() {
        gameView.draw(gameState);
        for (int i = 0; i < MaxLifeCycles; i++) {
            if (gameState.isLifeExtinct()) {
                break;
            }
            tryPause(CycleDurationInMilisec);
            gameState.tick();
            gameView.draw(gameState);
        }
    }
}

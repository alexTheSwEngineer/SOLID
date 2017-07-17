import abstractions.GameState;
import abstractions.GameView;
import impl.atr.ConsoleGameViewImpl;
import impl.atr.GameStateImpl;
import impl.atr.JavaSwingGameView;

/**
 * Created by atrposki on 0017,17 Jul/ 17-7-2017.
 */
public class Main {

    public static final long MaxCycles = 500l;
    public static final long CycleDuration = 500l;
    public static void main(String[] args) {
        Game game = new Game(createGameState(), createGameView(), InitialGameStates.getChaos1ToStableSquares(), MaxCycles, CycleDuration);
        game.run();
    }

    private static GameState createGameState() {
        return new GameStateImpl();
    }

    private static GameView createGameView() {
        return new JavaSwingGameView();
    }
}

package workbook;

import workbook.abstractions.GameState;
import workbook.abstractions.GameView;
import workbook.impl.atr.ConsoleGameViewImpl;
import workbook.impl.atr.GameStateImpl;

/**
 * Created by atrposki on 0017,17 Jul/ 17-7-2017.
 */
public class Main {

    public static final long MaxCycles = 500l;
    public static final long CycleDuration = 500l;

    public static void main(String[] args) {
        Game game = new Game(createGameState(), createGameView(), InitialGameStates.getGlider(), MaxCycles, CycleDuration);
        game.run();
    }

    public static GameState createGameState() {
        return new GameStateImpl();
    }

    public static GameView createGameView() {
        return new ConsoleGameViewImpl(System.out);
    }
}

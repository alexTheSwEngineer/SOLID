package workbook;

import workbook.abstractions.GameState;
import workbook.abstractions.GameView;
import workbook.implementation.example.ExampleConsoleGameViewImpl;
import workbook.implementation.example.ExampleGameStateImpl;

/**
 * Created by atrposki on 0017,17 Jul/ 17-7-2017.
 */
public class Main {

    public static final long MaxCycles = 500l;
    public static final long CycleDuration = 500l;

    public static void main(String[] args) {
        Game game = new Game(createGameState(), createGameView(),InitialGameStates.getPulsarWithPeriod3(),300,300);//new Game(createGameState(), createGameView(), InitialGameStates.getGlider(), MaxCycles, CycleDuration);
        game.run();
    }

    //TODO instantiate your implementation of GameState
    public static GameState createGameState() {
        return new ExampleGameStateImpl();
    }

    //TODO instantiate your implementation of GameView
    public static GameView createGameView() {
        return new ExampleConsoleGameViewImpl(System.out);
    }
}

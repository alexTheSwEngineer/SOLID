package abstractions;

/**
 * Created by atrposki on 0017,17 Jul/ 17-7-2017.
 */
public interface GameView {
    void init(GameState gameState);
    void draw(GameState gameState);
}

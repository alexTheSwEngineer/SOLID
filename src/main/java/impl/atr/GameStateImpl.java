package impl.atr;

import abstractions.GameState;
import abstractions.ICell;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by atrposki on 0017,17 Jul/ 17-7-2017.
 */
public class GameStateImpl implements GameState {
    private IBoard<Cell> board = new BoardImpl();

    public void init(boolean[][] cells) {
        board.init(cells);
    }

    public void tick() {
        for (Cell cell : board.getAllCells()) {
            cell.calculateFate(board);
        }

        for (Cell cell : board.getAllCells()) {
            cell.tick();
        }
    }

    public Collection<ICell> getCells() {
        return new ArrayList<>(board.getAllCells());
    }

    public boolean isAlive(int x, int y) {
        return board.get(x, y).isAlive();
    }

    public boolean isLifeExtinct() {
        return !getCells().stream().filter(ICell::isAlive).anyMatch(x -> true);
    }

    private Cell get(int i, int j) {
        return board.get(i, j);
    }
}

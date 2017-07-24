package workbook.implementation.example;

import workbook.abstractions.GameState;
import workbook.abstractions.ICell;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by atrposki on 0017,17 Jul/ 17-7-2017.
 */
public class ExampleGameStateImpl implements GameState {
    private IBoard<Cell> board = new BoardImpl<Cell>(Cell::fromICell,Cell::fromICell);

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

    public boolean isLifeExtinct() {
        return !getCells().stream().filter(ICell::isAlive).anyMatch(x -> true);
    }
}

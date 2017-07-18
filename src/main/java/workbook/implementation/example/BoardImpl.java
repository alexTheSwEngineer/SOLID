package workbook.implementation.example;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by atrposki on 0017,17 Jul/ 17-7-2017.
 */
public class BoardImpl implements IBoard<Cell> {

    private Cell cells[][];
    private int maxI;
    private int maxJ;

    @Override
    public Cell get(int x, int y) {
        if (!indexInBounds(x, this.maxI)) {
            return deadCell(x, y);
        }

        if (!indexInBounds(y, this.maxJ)) {
            return deadCell(x, y);
        }

        return cells[x][y];
    }

    @Override
    public Collection<Cell> getAllCells() {
        ArrayList<Cell> allCells = new ArrayList<>();
        for (Cell[] row : cells) {
            for (Cell cell : row) {
                allCells.add(cell);
            }
        }

        return allCells;
    }

    @Override
    public void init(boolean[][] cells) {
        this.maxI = cells.length;
        this.maxJ = cells[0].length;
        this.cells = new Cell[maxI][maxJ];
        for (int i = 0; i < maxI; i++) {
            for (int j = 0; j < maxJ; j++) {
                this.cells[i][j] = new Cell(i, j, cells[i][j]);
            }
        }
    }

    private boolean indexInBounds(int value, int max) {
        return value >= 0 && value < max;
    }

    private Cell deadCell(int x, int y) {
        return new Cell(x, y, false);
    }
}

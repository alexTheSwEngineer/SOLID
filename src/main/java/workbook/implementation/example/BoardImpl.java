package workbook.implementation.example;

import workbook.abstractions.ICell;
import workbook.implementation.example.util.MatrixIterator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by atrposki on 0017,17 Jul/ 17-7-2017.
 */
public class BoardImpl<T extends ICell> implements IBoard<T> {

    private Function<ICell,T> cellFactory;
    private Function<ICell,T> defaultCellFactory;
    private List<List<T>> cells;
    private int maxI;
    private int maxJ;

    public BoardImpl(Function<ICell,T> cellFactory, Function<ICell,T> defaultCellFactory){
        this.cellFactory = cellFactory;
        this.defaultCellFactory = defaultCellFactory;
    }

    @Override
    public T get(int x, int y) {
        if (!indexInBounds(x, this.maxI)) {
            return defaultCellFactory.apply(deadCell(x,y));
        }

        if (!indexInBounds(y, this.maxJ)) {
            return defaultCellFactory.apply(deadCell(x,y));
        }

        return cells.get(x).get(y);
    }

    @Override
    public Collection<T> getAllCells() {
        List<T> allCells = new ArrayList<>();
        new MatrixIterator<T>()
           .forEachCell(allCells::add)
           .applyTo(cells);
        return allCells;
    }

    @Override
    public void init(boolean[][] cells) {
        this.maxI = cells.length;
        this.maxJ = cells[0].length;
        this.cells = new ArrayList<List<T>>();
        for (int i = 0; i < maxI; i++) {
            List<T> row = new ArrayList<T>();
            this.cells.add(row);
            for (int j = 0; j < maxJ; j++) {
                boolean isAlive = cells[i][j];
                ICell iCell = cell(i,j,isAlive);
                row.add(cellFactory.apply(iCell));
            }
        }
    }

    private boolean indexInBounds(int value, int max) {
        return value >= 0 && value < max;
    }

    private ICell deadCell(int x, int y) {
        return cell(x, y, false);
    }
    private ICell aliveCell(int x, int y) {
        return cell(x,y,true);
    }
    private ICell cell(int x,int y, boolean isAlive){
        return new ICell() {
            @Override
            public int getX() {
                return x;
            }

            @Override
            public int getY() {
                return y;
            }

            @Override
            public boolean isAlive() {
                return isAlive;
            }
        };
    }
}

package workbook.implementation.example;

import workbook.abstractions.ICell;

import java.util.Collection;

/**
 * Created by atrposki on 0017,17 Jul/ 17-7-2017.
 */
public interface IBoard<T extends ICell> {
    T get(int x, int y);

    Collection<T> getAllCells();

    void init(boolean[][] cells);
}
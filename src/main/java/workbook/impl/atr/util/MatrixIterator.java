package workbook.impl.atr.util;

import java.util.function.Consumer;

/**
 * Created by atrposki on 0017,17 Jul/ 17-7-2017.
 */
public class MatrixIterator<T> {
    private Consumer<T> onEachCell = MatrixIterator::noop;
    private Runnable onLineBreak = MatrixIterator::noop;

    public MatrixIterator() {
    }

    public MatrixIterator(MatrixIterator<T> other) {
        this.onEachCell = other.onEachCell;
        this.onLineBreak = other.onLineBreak;
    }

    private static <T> void noop(T input) {
        return;
    }

    private static void noop() {
        return;
    }

    public MatrixIterator<T> forEachCell(Consumer<T> consumer) {
        MatrixIterator<T> newIterator = new MatrixIterator<>(this);
        newIterator.onEachCell = consumer;
        return newIterator;
    }

    public MatrixIterator<T> forEachRow(Runnable runnable) {
        MatrixIterator<T> newIterator = new MatrixIterator<>(this);
        newIterator.onLineBreak = runnable;
        return newIterator;
    }

    public void applyTo(T[][] cells) {
        for (T[] row : cells) {
            onLineBreak.run();
            for (T cell : row) {
                onEachCell.accept(cell);
            }
        }
    }
}

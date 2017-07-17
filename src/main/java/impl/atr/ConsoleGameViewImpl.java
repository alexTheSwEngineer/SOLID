package impl.atr;

import abstractions.GameState;
import abstractions.GameView;
import abstractions.ICell;
import impl.atr.util.MatrixIterator;

import java.io.PrintStream;
import java.util.Collection;

/**
 * Created by atrposki on 0017,17 Jul/ 17-7-2017.
 */
public class ConsoleGameViewImpl implements GameView {
    private MatrixIterator<ICell> clearScreen;
    private MatrixIterator<ICell> drawCells;
    private static final String ALIVE = "* ";
    private static final String DEAD = "  ";

    private PrintStream stream;

    public ConsoleGameViewImpl(PrintStream printStream) {
        this.stream = printStream;
        this.drawCells = new MatrixIterator<ICell>()
                            .forEachCell(this::drawCell)
                            .forEachRow(this.stream::println);

        this.clearScreen = new MatrixIterator<ICell>()
                              .forEachRow(this.stream::println);
    }


    @Override
    public void init(GameState gameState) {
        stream.print("**GAME OF LIFE**");
    }

    @Override
    public void draw(GameState gameState) {
        ICell[][] matrixRepresentation = createMatrix(gameState.getCells());
        clearScreen.applyTo(matrixRepresentation);
        drawCells.applyTo(matrixRepresentation);
    }

    private void drawCell(ICell cell) {
        this.stream.print(cell.isAlive() ? ALIVE : DEAD);
    }

    public ICell[][] createMatrix(Collection<ICell> cellsCollection) {
        Integer maxI = cellsCollection.stream().map(ICell::getX).max(Integer::compare).orElse(0);
        Integer maxJ = cellsCollection.stream().map(ICell::getY).max(Integer::compare).orElse(0);
        ICell[][] cellsMatrix = new ICell[maxI + 1][maxJ + 1];
        cellsCollection.stream().forEach(x -> cellsMatrix[x.getX()][x.getY()] = x);
        return cellsMatrix;
    }


}

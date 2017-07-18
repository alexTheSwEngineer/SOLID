package impl.atr;

import abstractions.GameState;
import abstractions.GameView;
import abstractions.ICell;

import javax.swing.*;
import java.awt.*;
import java.util.Collection;

/**
 * Created by atrposki on 0017,17 Jul/ 17-7-2017.
 */
public class JavaSwingGameView extends JPanel implements GameView {
    // Name-constants;
    public static final String TITLE = "***CONWAY'S GAME OF LIFE***";
    public static final int cellSize = 30;
    public static final int paddingSize = 5;
    public static final int cellWithPading = cellSize + paddingSize;
    private static final Color BackgroundColor = Color.black;
    private static final Color CellColor = Color.orange;
    private GameState curentGameState;

    public JavaSwingGameView() {
        super();
    }


    @Override
    public void draw(GameState gameState) {
        this.curentGameState = gameState;
        this.repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);  // paint background
        setBackground(BackgroundColor);
        if (this.curentGameState == null) {
            return;
        }

        for (ICell iCell : this.curentGameState.getCells()) {
            drawCell(g, iCell);
        }

    }

    private void drawCell(Graphics g, ICell iCell) {
        if (!iCell.isAlive()) {
            return;
        }
        int xCoord = cellWithPading * iCell.getX();
        int yCoord = cellWithPading * iCell.getY();
        g.setColor(CellColor);
        g.fillOval(xCoord, yCoord, cellSize, cellSize);
    }

    @Override
    public void init(GameState gameState) {
        this.curentGameState = gameState;
        Collection<ICell> cells = this.curentGameState.getCells();
        Integer maxI = cells.stream().map(ICell::getX).max(Integer::compare).orElseThrow(() -> new RuntimeException());
        Integer maxJ = cells.stream().map(ICell::getY).max(Integer::compare).orElseThrow(() -> new RuntimeException());

        this.setPreferredSize(new Dimension(cellWithPading * maxJ, cellWithPading * maxI));
        JFrame frame = new JFrame(TITLE);
        frame.setContentPane(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


}

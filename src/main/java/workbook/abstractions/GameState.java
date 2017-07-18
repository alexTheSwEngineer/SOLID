package workbook.abstractions;

import java.util.Collection;

/**
 * Created by atrposki on 0017,17 Jul/ 17-7-2017.
 */
public interface GameState {
    void init(boolean[][] cells);

    void tick();

    Collection<ICell> getCells();

    boolean isLifeExtinct();
}

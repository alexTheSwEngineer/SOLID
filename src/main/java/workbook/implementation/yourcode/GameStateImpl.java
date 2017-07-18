package workbook.implementation.yourcode;

import workbook.abstractions.GameState;
import workbook.abstractions.ICell;

import java.util.Collection;

/**
 * Created by atrposki on 0017,17 Jul/ 17-7-2017.
 */
public class GameStateImpl implements GameState
{  //TODO implement the methods
    @Override
    public void init(boolean[][] cells) {

    }

    @Override
    public void tick() {

    }

    @Override
    public Collection<ICell> getCells() {
        return null;
    }

    @Override
    public boolean isLifeExtinct() {
        return false;
    }
}

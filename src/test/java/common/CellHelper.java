package common;

import abstractions.GameState;
import abstractions.ICell;

import java.util.Collection;

/**
 * Created by atrposki on 0017,17 Jul/ 17-7-2017.
 */
public class CellHelper {
    public static ICell cell(int i, int j, boolean alive) {
        return new ICell() {
            @Override
            public int getX() {
                return i;
            }

            @Override
            public int getY() {
                return j;
            }

            @Override
            public boolean isAlive() {
                return alive;
            }
        };
    }

    public static ICell alive(int i, int j) {
        return cell(i, j, true);
    }

    public static ICell dead(int i, int j) {
        return cell(i, j, false);
    }


    public static GameState state(Collection<ICell> cells) {
        return new GameState() {
            @Override
            public void init(boolean[][] cells) {
                return;
            }

            @Override
            public void tick() {
                return;
            }

            @Override
            public Collection<ICell> getCells() {
                return cells;
            }

            @Override
            public boolean isLifeExtinct() {
                return false;
            }
        };
    }
}

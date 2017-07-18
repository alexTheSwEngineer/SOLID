package impl.atr;

import abstractions.ICell;

/**
 * Created by atrposki on 0017,17 Jul/ 17-7-2017.
 */
public class Cell implements ICell {
    public static int ALIVE = 1;
    public static int DEAD = 0;
    private int lives = 0;
    private int x;
    private int y;
    private int livingNeighbours;

    public Cell(int x, int y, boolean alive) {
        this.lives = alive ? ALIVE : DEAD;
        this.x = x;
        this.y = y;
    }

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
        return lives > DEAD;
    }

    public void calculateFate(IBoard board) {
        this.livingNeighbours = 0;
        for (int verticalOffset = -1; verticalOffset <= 1; verticalOffset++) {
            for (int horisontalOffset = -1; horisontalOffset <= 1; horisontalOffset++) {
                if (verticalOffset == 0 && horisontalOffset == 0) {
                    continue;
                }

                ICell neighbour = board.get(x + verticalOffset, y + horisontalOffset);
                if (neighbour.isAlive()) {
                    livingNeighbours++;
                }
            }
        }
    }

    public void tick() {
        if (this.isAlive()) {
            if (this.livingNeighbours < 2) {
                this.lives = DEAD;
                return;
            }

            if (this.livingNeighbours > 3) {
                this.lives = DEAD;
            }
        } else {
            if (this.livingNeighbours == 3) {
                this.lives = ALIVE;
            }
        }
    }

    @Override
    public String toString() {
        return "";
    }
}

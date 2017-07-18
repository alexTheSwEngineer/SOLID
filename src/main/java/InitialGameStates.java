/**
 * Created by atrposki on 0017,17 Jul/ 17-7-2017.
 */
public class InitialGameStates {

    public static boolean[][] getGlider() {
        boolean[][] pattern = new boolean[25][25];
        pattern[24][1] = true;
        pattern[23][2] = true;
        pattern[22][0] = true;
        pattern[22][1] = true;
        pattern[22][2] = true;
        return pattern;
    }

    public static boolean[][] getSquare() {
        return new boolean[][]{
                new boolean[]{true, true},
                new boolean[]{true, true}};
    }

    public static boolean[][] getBeeHive() {
        return new boolean[][]{
                new boolean[]{false, true, true, false},
                new boolean[]{true, false, false, true},
                new boolean[]{false, true, true, false}};
    }

    public static boolean[][] getVerticalStick() {
        return new boolean[][]{
                new boolean[]{false, true, false},
                new boolean[]{false, true, false},
                new boolean[]{false, true, false}};
    }

    public static boolean[][] getHorisontalStick() {
        return new boolean[][]{
                new boolean[]{false, false, false},
                new boolean[]{true, true, true},
                new boolean[]{false, false, false}};
    }

    public static boolean[][] getChaos1ToStableSquares() {
        boolean[][] pattern = new boolean[17][17];
        for (int i = 0; i < 17; i++) {
            for (int j = 0; j < 17; j++) {
                pattern[i][j] = false;
            }
        }
        int[] liveJ = {4, 5, 6, 4, 5, 6, 2, 2, 2, 7, 7, 7};
        int[] liveI = {2, 2, 2, 7, 7, 7, 4, 5, 6, 4, 5, 6};

        for (int i = 0; i < liveI.length; i++) {
            pattern[liveI[i]][liveJ[i]] = true;
            pattern[liveI[i] + 7][liveJ[i]] = true;
        }

        for (int i = 0; i < 17; i++) {
            for (int j = 0; j < 8; j++) {
                pattern[i][17 - j - 1] = pattern[i][j];
            }
        }

        return pattern;
    }

    public static boolean[][] getPulsarWithPeriod3() {
        boolean[][] pattern = new boolean[17][17];
        for (int i = 0; i < 17; i++) {
            for (int j = 0; j < 17; j++) {
                pattern[i][j] = false;
            }
        }
        int[] liveJ = {4, 5, 6, 4, 5, 6, 2, 2, 2, 7, 7, 7};
        int[] liveI = {2, 2, 2, 7, 7, 7, 4, 5, 6, 4, 5, 6};

        for (int i = 0; i < liveI.length; i++) {
            pattern[liveI[i]][liveJ[i]] = true;
        }

        for (int i = 0; i < 17; i++) {
            for (int j = 0; j < 8; j++) {
                pattern[i][17 - j - 1] = pattern[i][j];
            }
        }

        for (int j = 0; j < 17; j++) {
            for (int i = 0; i < 8; i++) {
                pattern[17 - i - 1][j] = pattern[i][j];
            }
        }


        return pattern;
    }
}

/**
 * Created by atrposki on 0017,17 Jul/ 17-7-2017.
 */
public class InitialGameStates {

    public static boolean[][] getChaos1ToStableSquares() {
        boolean[][] pattern = new boolean[17][17];
        for (int i = 0; i < 17; i++) {
            for (int j = 0; j < 17; j++) {
                pattern[i][j]=false;
            }
        }
        int[] liveJ ={4,5,6,4,5,6,2,2,2,7,7,7};
        int[] liveI ={2,2,2,7,7,7,4,5,6,4,5,6};

        for (int i = 0; i < liveI.length; i++) {
            pattern[liveI[i]][liveJ[i]]=true;
            pattern[liveI[i]+7][liveJ[i]]=true;
        }

        for (int i = 0; i < 17; i++) {
            for (int j = 0; j < 8; j++) {
                pattern[i][17-j-1]= pattern[i][j];
            }
        }

        return pattern;
    }

    public static boolean[][] getPulsarWithPeriod3() {
        boolean[][] pattern = new boolean[17][17];
        for (int i = 0; i < 17; i++) {
            for (int j = 0; j < 17; j++) {
                pattern[i][j]=false;
            }
        }
        int[] liveJ ={4,5,6,4,5,6,2,2,2,7,7,7};
        int[] liveI ={2,2,2,7,7,7,4,5,6,4,5,6};

        for (int i = 0; i < liveI.length; i++) {
            pattern[liveI[i]][liveJ[i]]=true;
        }

        for (int i = 0; i < 17; i++) {
            for (int j = 0; j < 8; j++) {
                pattern[i][17-j-1]= pattern[i][j];
            }
        }

        for (int j = 0; j < 17; j++) {
            for (int i = 0; i < 8; i++) {
                pattern[17-i-1][j]= pattern[i][j];
            }
        }


        return pattern;
    }
}

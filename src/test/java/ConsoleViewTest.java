import workbook.Main;
import workbook.abstractions.GameState;
import workbook.abstractions.GameView;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import static common.CellHelper.*;

/**
 * Created by atrposki on 0017,17 Jul/ 17-7-2017.
 */
public class ConsoleViewTest {
    GameState chesBoard4X4 = state(Arrays.asList(alive(0, 0), dead(0, 1), alive(0, 2), dead(0, 3),
            dead(1, 0), alive(1, 1), dead(1, 2), alive(1, 3),
            alive(2, 0), dead(2, 1), alive(2, 2), dead(2, 3),
            dead(3, 0), alive(3, 1), dead(3, 2), alive(3, 3)));
    //TODO change this to suit your implementation
    private String aliveCell = "* ";
    private String lineBreak = "\r\n";
    private String deadCell = "  ";
    String chesBoard4X4String = new StringBuilder()
            .append(aliveCell).append(deadCell).append(aliveCell).append(deadCell).append(lineBreak)
            .append(deadCell).append(aliveCell).append(deadCell).append(aliveCell).append(lineBreak)
            .append(aliveCell).append(deadCell).append(aliveCell).append(deadCell).append(lineBreak)
            .append(deadCell).append(aliveCell).append(deadCell).append(aliveCell).append(lineBreak)
            .toString();

    @Test
    public void ConsolePrintsGameState() {

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        GameView gw = Main.createGameView();
        
        gw.draw(chesBoard4X4);

        String actual = new String(baos.toByteArray(), StandardCharsets.UTF_8);

        Assert.assertEquals(chesBoard4X4String.trim(), actual.trim());
    }


}

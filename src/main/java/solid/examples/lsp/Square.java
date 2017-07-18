package solid.examples.lsp;

/**
 * Created by atrposki on 0017,17 Jul/ 17-7-2017.
 */
public class Square extends Rectangle {
    @Override
    public void setBreadth(int breadth) {
        super.setBreadth(breadth);
        super.setLength(breadth);
    }
    @Override
    public void setLength(int length) {
        super.setLength(length);
        super.setBreadth(length);
    }
}
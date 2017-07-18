package solid.examples.openClosed.parameters;

import solid.examples.common.Book;

import java.io.PrintStream;

/**
 * Created by atrposki on 0017,17 Jul/ 17-7-2017.
 */
public class GoodParametricPrinter {
    private PrintStream stream;
    public GoodParametricPrinter(PrintStream stream){
        this.stream = stream;
    }

    public void print(Book book){
        this.stream.println(book);
    }
}

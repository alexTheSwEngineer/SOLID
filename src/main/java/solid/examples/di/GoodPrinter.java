package solid.examples.di;

import solid.examples.common.Book;

import java.io.PrintStream;

/**
 * Created by atrposki on 0017,17 Jul/ 17-7-2017.
 */
public class GoodPrinter {
    private PrintStream printStream;

    public GoodPrinter(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void print(Book book){
        this.printStream.println(book);
    }
}

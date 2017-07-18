package solid.examples.openClosed.parametricPolymorphism;

import solid.examples.srp.GoodBook;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Created by atrposki on 0017,17 Jul/ 17-7-2017.
 */
public class GoodParametericPolymorphismPrinter {
    private Consumer<String> printMethod;
    public GoodParametericPolymorphismPrinter(Consumer<String> printMethod){
        this.printMethod=printMethod;
    }

    public void print(GoodBook book){
        String bookStringRepresentation = book.toString();
        printMethod.accept(bookStringRepresentation);
    }
}

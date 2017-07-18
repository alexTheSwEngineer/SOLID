package solid.examples.openClosed.polymorphism;

import solid.examples.srp.GoodBook;

/**
 * Created by atrposki on 0017,17 Jul/ 17-7-2017.
 */
public abstract class GoodPolymorphicPrinter {
    public void print(GoodBook book){
        String stringRepresentation = book.toString();
        print(stringRepresentation);
    }
    protected abstract void print(String book);
}

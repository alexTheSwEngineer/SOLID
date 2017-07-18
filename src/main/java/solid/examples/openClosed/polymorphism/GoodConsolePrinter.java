package solid.examples.openClosed.polymorphism;

import solid.examples.openClosed.polymorphism.GoodPolymorphicPrinter;

/**
 * Created by atrposki on 0017,17 Jul/ 17-7-2017.
 */
public class GoodConsolePrinter extends GoodPolymorphicPrinter {
    @Override
    protected void print(String book) {
        System.out.println(book);
    }
}

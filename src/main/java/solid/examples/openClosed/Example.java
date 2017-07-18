package solid.examples.openClosed;

import solid.examples.common.Book;
import solid.examples.openClosed.parameters.GoodParametricPrinter;
import solid.examples.openClosed.parametricPolymorphism.GoodParametericPolymorphismPrinter;
import solid.examples.openClosed.polymorphism.GoodConsolePrinter;
import solid.examples.openClosed.polymorphism.GoodFilePrinter;
import solid.examples.openClosed.polymorphism.GoodPolymorphicPrinter;

/**
 * Created by atrposki on 0017,17 Jul/ 17-7-2017.
 */
public class Example {
    public static void main(String args[]){

    }

    private static void printToConsole(Book book){
        GoodPolymorphicPrinter polymorphism = new GoodConsolePrinter();
        GoodParametericPolymorphismPrinter parametricPolymorphism = new GoodParametericPolymorphismPrinter(System.out::println);
        GoodParametricPrinter parametricPrinter = new GoodParametricPrinter(System.out);
    }

    private static void printToFile(Book book){
        GoodPolymorphicPrinter polymorphism = new GoodFilePrinter();
        GoodParametericPolymorphismPrinter parametricPolymorphism = new GoodParametericPolymorphismPrinter(System.out::println);
        GoodParametricPrinter parametricPrinter = new GoodParametricPrinter(System.out);
    }
}

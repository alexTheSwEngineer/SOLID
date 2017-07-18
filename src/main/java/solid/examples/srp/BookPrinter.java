package solid.examples.srp;

import solid.examples.common.Book;

/**
 * Created by atrposki on 0017,17 Jul/ 17-7-2017.
 */
public class BookPrinter {

    public void print(Book book){
        System.out.print(book.toString());
    }

    public void printToFile(Book book){
        System.out.print(book.toString());
    }

    public void printToConsole(Book book){
        System.out.print(book.toString());
    }
}
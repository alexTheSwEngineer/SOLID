package solid.examples.openClosed;


import solid.examples.srp.GoodBook;

/**
 * Created by atrposki on 0017,17 Jul/ 17-7-2017.
 */
public class BadBookPrinter {
    public void print(GoodBook book){

    }

    public void printToConsole(GoodBook book){
        System.out.println(book.toString());
    }

    public void printToFile(GoodBook book){
        System.out.println(book.toString());
    }
}

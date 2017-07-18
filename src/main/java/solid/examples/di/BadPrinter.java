package solid.examples.di;

import solid.examples.common.Book;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by atrposki on 0017,17 Jul/ 17-7-2017.
 */
public class BadPrinter {
    public void print(Book book) {
        System.out.println(book);
    }
}

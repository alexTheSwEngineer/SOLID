package solid.examples.srp;

import solid.examples.common.Book;

/**
 * Created by atrposki on 0017,17 Jul/ 17-7-2017.
 */
public class GoodBook extends Book{

    //Notice the absence of the print method. Voila, SRP.

    @Override
    public String toString() {
        return "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", size=" + size;
    }
}
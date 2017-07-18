package solid.examples.srp;

import solid.examples.common.Book;

/**
 * Created by atrposki on 0017,17 Jul/ 17-7-2017.
 */
public class BadBook extends Book{

    public void print(){
        //Book not only cares for storing book data but for printing it too.
        System.out.println(this.toString());
    }


    public void printToConsole(){
        System.out.println(this.toString());
    }

    public void printToFile(){
        // your code goes here. But it shouldn't;
    }

    @Override
    public String toString() {
        return "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", size=" + size;
    }
}
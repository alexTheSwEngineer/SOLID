package solid.examples.srp;

/**
 * Created by atrposki on 0018,18 Jul/ 18-7-2017.
 */
public class BadBook {
    private String author;
    private String title;
    private int size;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

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

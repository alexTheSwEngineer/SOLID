package solid.examples.srp;

/**
 * Created by atrposki on 0018,18 Jul/ 18-7-2017.
 */
public class GoodBook {
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

    //Notice the absence of the print method. Voila, SRP.

    @Override
    public String toString() {
        return "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", size=" + size;
    }
}
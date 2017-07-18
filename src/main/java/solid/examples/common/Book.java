package solid.examples.common;

/**
 * Created by atrposki on 0017,17 Jul/ 17-7-2017.
 */
public class Book {
    protected String author;
    protected String title;
    protected int size;

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

    @Override
    public String toString() {
        return "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", size=" + size;
    }
}
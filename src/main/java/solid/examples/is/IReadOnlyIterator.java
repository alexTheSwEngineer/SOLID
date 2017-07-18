package solid.examples.is;

/**
 * Created by atrposki on 0017,17 Jul/ 17-7-2017.
 */
public interface IReadOnlyIterator<T> {
    boolean hasNext();
    T next();
}

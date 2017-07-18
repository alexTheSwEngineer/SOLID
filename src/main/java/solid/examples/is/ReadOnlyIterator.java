package solid.examples.is;

import java.util.Iterator;

/**
 * Created by atrposki on 0017,17 Jul/ 17-7-2017.
 */
public class ReadOnlyIterator<T> implements IReadOnlyIterator<T> {
    private Iterator<T> iterator;
    public ReadOnlyIterator(Iterator<T> iterator){
        this.iterator = iterator;
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public T next() {
        return iterator.next();
    }
}

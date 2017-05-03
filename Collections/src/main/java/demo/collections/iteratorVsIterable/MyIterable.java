package demo.collections.iteratorVsIterable;

import sun.text.bidi.BidiBase;

import java.util.Iterator;

/**
 * Created by User on 5/3/2017.
 */
public class MyIterable<T> implements Iterable<T> {

    private T[] array = null;

    public MyIterable(T[] array) {
        this.array = array;
    }

    public MyIterable() {
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int count = 0;
            @Override
            public boolean hasNext() {
                return count < array.length;
            }

            @Override
            public T next() {
                return array[count++];
            }
        };
    }
}

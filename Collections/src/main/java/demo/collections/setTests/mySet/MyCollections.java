package demo.collections.setTests.mySet;

import java.util.Iterator;

/**
 * Created by User on 5/22/2017.
 */
public interface MyCollections<E> extends Iterable<E> {
    int size();
    boolean isEmpty();
    boolean contains(Object o);

    @Override
    Iterator<E> iterator();

    Object[] toArray();
    <T> T[] toArray(T[] a);
    boolean add(E e);
    boolean remove(E e);
}

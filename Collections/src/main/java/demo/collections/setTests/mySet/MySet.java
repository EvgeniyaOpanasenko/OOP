package demo.collections.setTests.mySet;

import java.util.Iterator;

/**
 * Created by User on 5/22/2017.
 */
public interface MySet extends MyCollections {
// Query Operations

    @Override
    int size();

    @Override
    boolean isEmpty();

    @Override
    boolean contains(Object o);

    @Override
    Iterator iterator();

    @Override
    Object[] toArray();

    @Override
    Object[] toArray(Object[] a);

    @Override
    boolean add(Object o);

    @Override
    boolean remove(Object o);
}

package com.ua.arrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MyArrayListTest {

    private int[] array;
    private MyArrayList list;

    @Before
    public void setUp() throws Exception {
        array = new int[]{1, 2, 3, 4};
        list = new MyArrayListImpl();
    }

    @After
    public void tearDown() throws Exception {
        array = null;
    }

    @Test
    public void revert() throws Exception {
        int[] expected = {4, 3, 2, 1};
        assertEquals(Arrays.toString(expected), Arrays.toString(list.revert(array)));

    }

    @Test
    public void sumArray() throws Exception {

    }

    @Test
    public void indexOf() throws Exception {
        assertEquals(0, list.indexOf(array, 1));

    }

    @Test
    public void min() throws Exception {
        int min = 1;
        assertEquals(min, list.min(array));
    }

    @Test
    public void sum() throws Exception {

    }

    @Test
    public void multAndSum() throws Exception {

    }

    @Test
    public void sort() throws Exception {
        int[] mixedArr = {23, 65, 1, 5, 3};
        int[] expected = {1, 3, 5, 23, 65};

    }

}
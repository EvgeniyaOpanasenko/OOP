package com.ua.arrayList;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyArrayListImpl implements MyArrayList {

    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
    private static final int DEFAULT_CAPACITY = 10;
    private int mas[];
    //size return number of not empty cells
    private int size;
    private Object[] elementData;
    // count the number of cells
    private int modCount;
    private int capasity;

    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    public MyArrayListImpl(int capasity) {
        this.capasity = DEFAULT_CAPACITY;
        this.elementData = new Object[capasity];
    }

    public MyArrayListImpl() {
        //mas = new int[DEFAULT_CAPASITY];
        this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
        size = 0;
    }

    @Override
    public boolean add(int element) {
        ensureCapasity(size + 1);
        elementData[size++] = element;
        return true;

    }

    private void ensureCapasity(int minCapasity) {
        if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA){
            minCapasity = Math.max(DEFAULT_CAPACITY, minCapasity);
        }

        increaseCapasity(minCapasity);

    }

    private void increaseCapasity(int minCapasity) {
        if (minCapasity - elementData.length > 0){
           grow(minCapasity);
        }
    }

    private void grow(int minCapacity) {
        // overflow-conscious code
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
       /* if (newCapacity - minCapacity < 0)
            newCapacity = minCapacity;
        if (newCapacity - MAX_ARRAY_SIZE > 0)*/
            //newCapacity = hugeCapacity(minCapacity);
        // minCapacity is usually close to size, so this is a win:
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    private boolean isEpty(int element) {
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void print() {
        System.out.println(Arrays.toString(mas));
    }

    //{1,2,3,4}; {1,2) => 2
    @Override
    public int[] subArray(int[] mas, int start, int end) {
        int[] res = new int[end - start];

        for (int i = start; i < res.length; i++, start++) {
            res[i] = start;
        }
        return new int[0];
    }

    public int size() {
        return size;
    }

    @Override
    public String toString(int[] mas) {

        return Arrays.toString(mas);
    }

    @Override
    public int[] revert(int[] mas) {
        for (int i = 0; i < mas.length / 2; i++) {
            int temp = mas[mas.length - i - 1];
            mas[mas.length - i - 1] = mas[i];
            mas[i] = temp;

        }
        return mas;
    }

    @Override
    public int[] sumArray(int[] mas, int start, int end) {
        return new int[0];
    }

    @Override
    public int indexOf(int[] mas, int element) {
        if (mas != null) {
            for (int i = 0; i < mas.length; i++) {
                if (mas[i] == element)
                    return i;
            }
        }
        throw new NoSuchElementException();
    }

    @Override
    public void print(int[] mas) {
        System.out.println(toString(mas));

    }

    @Override
    public void printUsingStream(int[] mas) {
        System.out.println(Arrays.stream(mas));
    }

    @Override
    public int min(int[] mas) throws EmptyArrayException {
        if (mas != null) {
            int min = mas[0];
            for (int i = 0; i < mas.length; i++) {
                if (mas[i] < min) {
                    min = mas[i];
                    return min;
                }
            }
        }
        throw new EmptyArrayException();
    }


    @Override
    public int sum(int[] a, int[] b) {
        return 0;
    }

    @Override
    public int multAndSum(int[] a, int operand) {

        int res = 0;
        for (int i = 0; i < a.length; i++) {
            res += a[i] * operand;
        }
        return res;
    }

    @Override
    public void sortQiuck() {
        //Arrays.sort((E[]) elementData, 0, size, c);
        //return Arrays.sort((mas[])elementData , 0, size);
        Arrays.sort(mas);
    }
}

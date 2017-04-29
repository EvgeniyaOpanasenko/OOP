package com.ua.arrayList;

public interface MyArrayList {

    String toString(int[] mas);

    int[] revert(int[] mas);

    int[] sumArray(int[] mas, int start, int end);

    int indexOf(int[] mas, int element);

    void print(int[] mas);

    void printUsingStream(int[] mas);

    int min(int[] mas) throws EmptyArrayException;

    int sum(int[] a, int[] b);

    // 1 2 3 4 * 3 = 3 + 6 + 9+ 12 = 30
    int multAndSum(int[] a, int[] b);

    public int[] sort();

    boolean add(int i);

    void print();
}

package com.ua.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Lisa on 4/27/2017.
 */
public class Run {
    public static void main(String[] args) {
        /*System.out.println("Hello, this is ma array");
        MyArrayList list = new MyArrayListImpl();
        int[] array = {1, 2 ,3 ,4};
        System.out.println(Arrays.toString(array));

        System.out.println("array length" + array.length);
        int element = 2;

        System.out.println(list.indexOf(array, element));

        System.out.println(Arrays.toString(list.revert(array)));*/

        MyArrayList arr = new MyArrayListImpl();
        arr.add(1);
        arr.print();


    }
}

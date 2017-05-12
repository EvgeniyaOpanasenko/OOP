package artcode.ua.arrayList;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyArrayListImpl implements MyArrayList {

    private final int defaultCapasity = 10;
    private int mas[];
    //size return number of not empty cells
    private int size;

    public MyArrayListImpl() {
        mas = new int[defaultCapasity];
        size = 0;
    }

    @Override
    public boolean add(int element) {
        size++;

        for (int i = 0; i < mas.length; i++) {
            if (isEpty(mas[i])) {
                mas[i] = element;
                return true;
            }
        }
        return false;
        /*create(biggerMas(mas));
        for (int i = 0; i < biggerMas.length; i++) {
            if(!(is))
        }
        mas[defaultCapasity + 1] = element;*/
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

        for (int i = start; i < res.length; i++, start ++) {
            res[i] = start;
        }
        return new int[0];
    }

    public int size() {
        return defaultCapasity;
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
    public int multAndSum(int[] a, int[] b) {
        return 0;
    }

    @Override
    public int[] sort() {
        return mas;
    }

}

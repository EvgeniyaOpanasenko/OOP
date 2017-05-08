package com.ua.finalTest;

/**
 * Created by User on 5/8/2017.
 */
public class Ram {
    private int size;


    @Override
    public String toString() {
        return "Ram{" +
                "size=" + size +
                '}';
    }

    public Ram(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

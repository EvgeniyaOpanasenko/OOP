package com.ua.finalTest;

/**
 * Created by User on 5/8/2017.
 */
public class ScreenIphone {
    private int width;
    private int height;

    public ScreenIphone(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "ScreenIphone{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

package com.ua.staticBlockTests;

/**
 * Created by User on 5/8/2017.
 */
public class StatickBlockTets {
    public static void main(String[] args) {
       StaticContainer container =  new StaticContainer();

        System.out.println(StaticContainer.i);

        System.out.println(container.getI());


    }
}

class StaticContainer {
    static int i = 45;


    public static int getI() {
        return i;
    }

    static {
        System.out.println("Static block initialization");

        i = i/2;
    }
}

package com.ua.finalTest;

/**
 * Created by User on 5/8/2017.
 */
public class TestIStore {

    public static void main(String[] args) {
        Istore store = new Istore();

        store.sellIphone();

        store.buyIphone(new Xiomi("123", "123456", "123488",
                new Ram(12),
                new ScreenIphone(25, 25)));

        IPhone iPhone = store.sellIphone();
        iPhone.playGame();

    }
}

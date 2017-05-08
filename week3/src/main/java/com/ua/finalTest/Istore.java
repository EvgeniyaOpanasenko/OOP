package com.ua.finalTest;

/**
 * Created by User on 5/8/2017.
 */
public class Istore {

    private IPhone iPhone = new IPhone("123", "123456", "123488",
            new Ram(12),
            new ScreenIphone(25, 25));;

    public IPhone sellIphone() {

        System.out.println("phone sold");
        IPhone forSale = iPhone;
        iPhone = null;
        return forSale;
    }

    public void buyIphone(IPhone newIphone) {
        System.out.println("phone bought");
        this.iPhone = newIphone;
    }
}

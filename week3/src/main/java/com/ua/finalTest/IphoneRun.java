package com.ua.finalTest;

/**
 * Created by User on 5/8/2017.
 */
public class IphoneRun {
    public static void main(String[] args) {
        IPhone phone = new IPhone("123", "123456", "123488",
                                    new Ram(12),
                                    new ScreenIphone(25, 25));

        System.out.println(phone);
        phone.getRam().setSize(256);
        System.out.println(phone);
    }
}

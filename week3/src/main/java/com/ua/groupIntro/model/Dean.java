package com.ua.groupIntro.model;

import java.util.Date;

/**
 * Created by User on 5/4/2017.
 */
public class Dean extends Worker {

    private long blackMoney;
    //private Secretary secretary;

    public Dean(String name, Address address, Date birthday,
                ContactData contacts, long blackMoney, double salary) {
        super(name, address, birthday, contacts, salary);
        this.blackMoney = 2000;

    }

    public Dean() {
    }


    @Override
    public void work() {
        super.work();
        System.out.println("dean works");
    }

    public long getBlackMoney() {
        return blackMoney;
    }

    public void setBlackMoney(long blackMoney) {
        this.blackMoney = blackMoney;
    }

}

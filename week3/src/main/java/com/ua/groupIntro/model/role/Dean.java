package com.ua.groupIntro.model.role;

import com.ua.groupIntro.model.common.Address;

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
        //super.work();
        System.out.println("dean works in Dean class");
    }

    @Override
    public void makeReport() {
        System.out.println("Dean repoet");
    }

    public long getBlackMoney() {
        return blackMoney;
    }

    public void setBlackMoney(long blackMoney) {
        this.blackMoney = blackMoney;
    }

    public void deanWork(){
        System.out.println("Dean works");
    }

}

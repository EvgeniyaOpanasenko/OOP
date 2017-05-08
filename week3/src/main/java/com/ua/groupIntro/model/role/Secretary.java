package com.ua.groupIntro.model.role;

import com.ua.groupIntro.model.common.Address;

import java.util.Date;

/**
 * Created by User on 5/6/2017.
 */
public class Secretary extends Worker {

    public Secretary() {
    }

    public Secretary(String name, Address address, Date birthday, ContactData contacts, double salary) {
        super(name, address, birthday, contacts, salary);
    }

    @Override
    public void work() {
        System.out.println("Secretary works");
    }

    @Override
    public void makeReport() {
        System.out.println("Secretary report");
    }
}

package com.ua.groupIntro.model;

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
}

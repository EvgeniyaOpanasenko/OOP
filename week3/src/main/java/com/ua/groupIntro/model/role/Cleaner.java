package com.ua.groupIntro.model.role;

import com.ua.groupIntro.model.common.Address;
import com.ua.groupIntro.model.role.Worker;

import java.util.Date;

/**
 * Created by User on 5/6/2017.
 */
public class Cleaner extends Worker {

    public Cleaner() {
    }

    public Cleaner(String name, Address address,
                   Date birthday, ContactData contacts,
                   double salary) {
        super(name, address, birthday, contacts, salary);
    }

    @Override
    public void makeReport() {
        System.out.println("Cleaner report");
    }

}

package com.ua.groupIntro.model.role;

import com.ua.groupIntro.model.common.Address;

import java.util.Date;

/**
 * Created by User on 5/6/2017.
 */
public class Manager extends Worker {

    private Worker[] places;
    private int size = 0;

    public Manager(Worker[] places) {
        this.places = places;
    }

    public Manager(String name, Address address, Date birthday,
                   ContactData contacts, double salary) {
        super(name, address, birthday, contacts, salary);

        this.places = new Worker[10];
    }


    @Override
    public void work() {
        doTeamWork();
    }

    @Override
    public void makeReport() {
        System.out.println("Manager report");
    }

    public Manager() {

    }

    public void addWorker(Worker worker) {
        // доступ до комірки, запис в комірку а потім ++
        places[size++] = worker;

    }

    public void doTeamWork() {
        for (int i = 0; i < size; i++) {
            places[i].work();
        }
    }
}

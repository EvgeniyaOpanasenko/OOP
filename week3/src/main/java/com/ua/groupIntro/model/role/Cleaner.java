package com.ua.groupIntro.model.role;

import com.ua.groupIntro.model.role.Worker;

/**
 * Created by User on 5/6/2017.
 */
public class Cleaner extends Worker {

    @Override
    public void makeReport() {
        System.out.println("Cleaner report");
    }
}

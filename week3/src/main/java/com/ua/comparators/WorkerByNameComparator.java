package com.ua.comparators;

import com.ua.groupIntro.model.role.Human;
import com.ua.groupIntro.model.role.Worker;

import java.util.Comparator;

/**
 * Created by User on 5/8/2017.
 */
public class WorkerByNameComparator implements Comparator<Human> {

    @Override
    public int compare(Human worker, Human anotherWorker) {
        return worker.getName().compareTo(anotherWorker.getName());
    }

}

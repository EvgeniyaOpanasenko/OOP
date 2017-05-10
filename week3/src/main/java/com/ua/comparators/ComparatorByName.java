package com.ua.comparators;

import com.ua.groupIntro.model.role.Human;

import java.util.Comparator;

/**
 * Created by User on 5/10/2017.
 */
public class ComparatorByName implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

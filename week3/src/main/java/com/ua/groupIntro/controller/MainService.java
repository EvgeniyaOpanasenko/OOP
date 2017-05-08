package com.ua.groupIntro.controller;

import com.ua.groupIntro.model.role.Dean;
import com.ua.groupIntro.model.role.Worker;

import java.util.List;

/**
 * Created by User on 5/4/2017.
 */
public interface MainService {
    /*boolean create(Student student);
    boolean create(Dean dean);*/
    boolean create(Worker worker);

    List<Worker> getAllStudents();
    List<Dean> getAllDeans();
}

package com.ua.groupIntro.controller;

import com.ua.groupIntro.model.role.Dean;
import com.ua.groupIntro.model.role.Human;
import com.ua.groupIntro.model.role.Student;
import com.ua.groupIntro.model.role.Worker;

import java.util.List;

/**
 * Created by User on 5/4/2017.
 */
public interface MainService {
    /*boolean create(Student student);
    boolean create(Dean dean);*/
    boolean create(Human human);

    List<Student> getAllStudents();
    List<Dean> getAllDeans();
    List<Worker> filterByName();
    List<Human> getAllWorkers();
    //List<Worker> sort();
    List<Human> sortWorker();
}

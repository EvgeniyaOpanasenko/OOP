package com.ua.groupIntro.controller;

import com.ua.groupIntro.model.Dean;
import com.ua.groupIntro.model.Student;

import java.util.List;

/**
 * Created by User on 5/4/2017.
 */
public interface MainService {
    boolean create(Student student);
    boolean create(Dean dean);

    List<Student> getAllStudents();
    List<Dean> getAllDeans();
}

package com.ua.groupIntro.controller;

import com.ua.groupIntro.model.Dean;
import com.ua.groupIntro.model.Student;
import com.ua.groupIntro.utils.FileSaver;

import java.util.List;

/**
 * Created by User on 5/4/2017.
 */
public class MainServiceImpl implements MainService {

    private FileSaver fileSaver;
    private List<Student> students;

    public MainServiceImpl() {
        this.fileSaver = new FileSaver();
        this.students = fileSaver.read();
    }

    @Override
    public boolean create(Student student) {
        students.add(student);
        fileSaver.save(students);
        return true;
    }

    @Override
    public boolean create(Dean dean) {
        return false;
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public List<Dean> getAllDeans() {
        return null;
    }
}

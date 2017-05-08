package com.ua.groupIntro.controller;

import com.ua.groupIntro.model.role.Dean;
import com.ua.groupIntro.model.role.Worker;
import com.ua.groupIntro.utils.FileSaver;

import java.util.List;

/**
 * Created by User on 5/4/2017.
 */
public class MainServiceImpl implements MainService {

    private FileSaver fileSaver;
    private List<Worker> workers;

    public MainServiceImpl() {
        this.fileSaver = new FileSaver();
        this.workers = fileSaver.read();
    }

   /* @Override
    public boolean create(Student student) {
        workers.add(student);
        fileSaver.save(workers);
        return true;
    }

    @Override
    public boolean create(Dean dean) {
        return false;
    }*/

    @Override
    public boolean create(Worker worker) {
        workers.add(worker);
        fileSaver.save(workers);
        return true;
    }

    @Override
    public List<Worker> getAllStudents() {

        return workers;
    }

    @Override
    public List<Dean> getAllDeans() {
        return null;
    }
}

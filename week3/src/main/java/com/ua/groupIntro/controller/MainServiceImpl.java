package com.ua.groupIntro.controller;

import com.ua.groupIntro.model.role.Dean;
import com.ua.groupIntro.model.role.Human;
import com.ua.groupIntro.model.role.Student;
import com.ua.groupIntro.model.role.Worker;
import com.ua.groupIntro.utils.FileSaver;

import java.util.ArrayList;
import java.util.List;

public class MainServiceImpl implements MainService {

    private FileSaver fileSaver;
    private List<Human> workers;
    private List<Dean> deans;

    public MainServiceImpl() {
        this.fileSaver = new FileSaver();
        this.workers = new ArrayList<>(fileSaver.read());

    }

    @Override
    public boolean create(Human human) {
        workers.add(human);
        fileSaver.save(workers);
        return true;
    }

    @Override
    public List<Student> getAllStudents() {

        //workers.stream().forEach(student -> s);

        return null;
    }

    @Override
    public List<Dean> getAllDeans() {

        return null;
    }

    @Override
    public List<Worker> filterByName() {
        List<Worker> result = new ArrayList<>();
        return null;
    }

    @Override
    public List<Human> getAllWorkers() {
        return workers;
    }

    @Override
    public List<Human> sortWorker() {

       return null;
    }
}

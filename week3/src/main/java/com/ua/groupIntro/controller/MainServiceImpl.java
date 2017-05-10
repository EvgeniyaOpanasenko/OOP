package com.ua.groupIntro.controller;

import com.ua.comparators.ComparatorByCountryComparator;
import com.ua.comparators.ComparatorByNameComparator;
import com.ua.groupIntro.model.role.Dean;
import com.ua.groupIntro.model.role.Human;
import com.ua.groupIntro.model.role.Student;
import com.ua.groupIntro.model.role.Worker;
import com.ua.groupIntro.utils.FileSaver;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainServiceImpl implements MainService {

    private FileSaver fileSaver;
    private List<Human> humanList;
    private List<Dean> deans;

    public MainServiceImpl() {
        this.fileSaver = new FileSaver();
        this.humanList = new ArrayList<>(fileSaver.read());

    }

    @Override
    public boolean create(Human human) {
        humanList.add(human);
        fileSaver.save(humanList);
        return true;
    }

    @Override
    public List<Student> getAllStudents() {

        humanList.stream().filter(human -> "STUDENT".equals(human)).collect(Collectors.toList());

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

        return humanList;
    }

  /*  @Override
    public List<Human> sortWorkerByName() {
        humanList.sort(new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        return humanList;
    }*/

    @Override
    public List<Human> sortWorkerByName() {
        humanList.sort(new ComparatorByNameComparator());
        return humanList;
    }

    @Override
    public List<Human> sortWorkerByCountry() {
        humanList.sort(new ComparatorByCountryComparator());
        return humanList;
    }
}

package com.ua.groupIntro.run;

import com.ua.groupIntro.controller.MainService;
import com.ua.groupIntro.controller.MainServiceImpl;
import com.ua.groupIntro.model.role.Human;
import com.ua.groupIntro.model.role.Student;

import java.util.ArrayList;
import java.util.List;

import static com.ua.groupIntro.utils.InitDb.initDB;

/**
 * Created by User on 5/10/2017.
 */
public class TestComparators {
    public static void main(String[] args) {
        initDB();

        MainService service = new MainServiceImpl();

        List<Human> university = service.getAllWorkers();

        List<Student> students = service.getAllStudents();

        System.out.println(university);
        System.out.println(service.sortWorker());

    }
}

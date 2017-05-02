package com.ua.groupIntro.utils;

import com.ua.groupIntro.model.Student;

import java.util.ArrayList;
import java.util.List;


public class ListInit {

    private static final List<Student> INSTANCE = new ArrayList<Student>();

    public static List<Student> getStudentsList() {

        return INSTANCE;
    }

}

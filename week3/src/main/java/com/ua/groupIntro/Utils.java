package com.ua.groupIntro;

import com.ua.groupIntro.model.Student;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    private final static List<Student> INSTANCE = new ArrayList<>();

    public static List<Student> getInstance() {
        return INSTANCE;
    }
}

package com.ua.groupIntro;

import com.ua.groupIntro.model.role.Student;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    private final static List<Student> INSTANCE = new ArrayList<>();

    public static List<Student> getInstance() {
        return INSTANCE;
    }

    private final static double INSTANCE_ACCOUNT_BALANCE = 0;

    public static double getInstanceAccountBalance() {
        return INSTANCE_ACCOUNT_BALANCE;
    }
}


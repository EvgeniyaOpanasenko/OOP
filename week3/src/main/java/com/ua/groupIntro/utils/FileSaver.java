package com.ua.groupIntro.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.ua.groupIntro.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static com.ua.groupIntro.Utils.getInstance;

/**
 * two main methods read from DB
 * and write into DB
 * using Gson lib
 */
public class FileSaver {

    private String studentDB = "week3/src/main/resources/student.db";
    private Gson gson;
    //private List<Student> students;

    public FileSaver() {
        this.studentDB = studentDB;
        this.gson = new GsonBuilder().setPrettyPrinting().create();
        //List<Student> students = getInstance();
    }

    public List<Student> read() {
        List<Student> students;
        try {
            BufferedReader br = new BufferedReader(new FileReader(studentDB));
            students = gson.fromJson(br, new TypeToken<List<Student>>() {
            }.getType());
            if (students == null) {
                students = new ArrayList<>();
            }return students;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

    public void save(List<Student> students) {
        String json = gson.toJson(students);

        try (FileWriter writer = new FileWriter(studentDB)) {
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
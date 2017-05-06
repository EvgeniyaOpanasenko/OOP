package com.ua.groupIntro.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.ua.groupIntro.model.Student;
import com.ua.groupIntro.model.Worker;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * two main methods read from DB
 * and write into DB
 * using Gson lib
 */
public class FileSaver {

    private String pathDB = "week3/src/main/resources/university.db";
    private Gson gson;
    //private List<Student> students;

    public FileSaver() {
        this.pathDB = pathDB;
        this.gson = new GsonBuilder().setPrettyPrinting().create();
        //List<Student> students = getInstance();
    }

    public List<Worker> read() {
        List<Worker> workers;
        try {
            BufferedReader br = new BufferedReader(new FileReader(pathDB));
            workers = gson.fromJson(br, new TypeToken<List<Worker>>() {
            }.getType());
            if (workers == null) {
                workers = new ArrayList<>();
            }return workers;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

    public void save(List<Worker> workers) {
        String json = gson.toJson(workers);

        try (FileWriter writer = new FileWriter(pathDB)) {
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
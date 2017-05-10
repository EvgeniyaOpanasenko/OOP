package com.ua.groupIntro.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.ua.groupIntro.model.role.Human;
import com.ua.groupIntro.model.role.Worker;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * two main methods read from DB
 * and write into DB
 * using Gson lib
 */
public class FileSaver {

    private String pathDB = "week3/src/main/resources/workers.db";
    private Gson gson;
    //private List<Student> students;

    public FileSaver() {
        this.pathDB = pathDB;
        this.gson = new GsonBuilder().setPrettyPrinting().create();
    }

    public List<Human> read() {
        //List<Worker> workers = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(pathDB));
            List<Human> workers = gson.fromJson(br, new TypeToken<List<Human>>(){}.getType());
            if(workers == null){
                workers = new ArrayList<>();
            }
            return workers;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

    public void save(List<Human> workers) {
        String json = gson.toJson(workers);

        try (FileWriter writer = new FileWriter(pathDB)) {
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
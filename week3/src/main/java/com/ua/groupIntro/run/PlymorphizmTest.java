package com.ua.groupIntro.run;

import com.ua.groupIntro.model.Dean;
import com.ua.groupIntro.model.Student;
import com.ua.groupIntro.model.Worker;

/**
 * Created by User on 5/6/2017.
 */
public class PlymorphizmTest {
    public static void main(String[] args) {

        Worker workerDean = new Dean();
        workerDean.work();

        // no work method overwriting
        Worker workerStudent = new Student();
        workerStudent.work();
    }
}

package com.ua.composition;

/**
 * Created by User on 5/2/2017.
 */
public class Person {

    //composition has-a relationship
    private Job job;

    public Person() {
        this.job = new Job();
        job.setSalary(100);
    }

    public long getSalary(){
        return job.getSalary();
    }
}

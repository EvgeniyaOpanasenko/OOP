package com.ua.composition;

/**
 * Created by User on 5/2/2017.
 */
public class Job {
    private String role;
    private long salary;
    private int id;

    public Job() {
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

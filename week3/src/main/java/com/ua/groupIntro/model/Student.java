package com.ua.groupIntro.model;

/**
 * Created by User on 4/28/2017.
 */
public class Student extends Human{


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                '}';
    }

    public Student(String name, int age, int phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }
    
}

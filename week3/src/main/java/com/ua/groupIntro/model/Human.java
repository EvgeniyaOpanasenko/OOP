package com.ua.groupIntro.model;

/**
 * Created by User on 5/4/2017.
 */
public class Human {
    private String name;
    private int age;
    private int phone;

    public Human(String name, int age, int phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public Human() {
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    //protected and private mrthods will not be available for kid's class
    protected void checkOut (){

    }
}

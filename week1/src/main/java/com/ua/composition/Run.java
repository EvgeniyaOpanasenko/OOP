package com.ua.composition;

/**
 * Created by User on 5/2/2017.
 */
public class Run {
    public static void main(String[] args) {
        Person person = new Person();
        long salary = person.getSalary();

        System.out.println(salary);
    }
}

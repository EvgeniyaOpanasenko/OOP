package com.ua.groupIntro.views;

import com.ua.groupIntro.exceptions.NoStudentsFoundException;
import com.ua.groupIntro.model.Student;
import com.ua.groupIntro.service.MainService;
import com.ua.groupIntro.service.MainServiceImpl;
import com.ua.groupIntro.utils.ListInit;

import java.util.List;
import java.util.Scanner;

/**
 * Created by User on 4/28/2017.
 */
public class AddStudentView {
    private Scanner scanner;
    private int size;
    private String name;
    private int age;
    private int phone;

    public AddStudentView() {
        this.size = size;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.scanner = new Scanner(System.in);
    }

    public void showAddStudentMassage() {
        System.out.println("Enter student name");
        name = scanner.next();
        System.out.println("Enter student age");
        age = scanner.nextInt();
        System.out.println("Enter student phone");
        phone = scanner.nextInt();
    }

    public void showAllStudent() {


    }


    public void printHelloMessage() {
        System.out.println("Hello");
        System.out.println("Enter group size");
        size = scanner.nextInt();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPhone() {
        return phone;
    }

    public int getSize() {
        return size;
    }
}

package com.ua.groupIntro.views;

import com.ua.groupIntro.model.Student;
import com.ua.groupIntro.service.MainService;
import com.ua.groupIntro.service.MainServiceImpl;

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
        initScanner();
    }

    private void initScanner() {
        scanner = new Scanner(System.in);
    }

    public void showAddStudentMassage() {
        System.out.println("Enter student name");
        name = scanner.next();
        System.out.println("Enter student age");
        age = scanner.nextInt();
        System.out.println("Enter student phone");
        phone = scanner.nextInt();
    }

    public void showAllStudent(List<Student> students) {
        System.out.println("Students list");
        System.out.println(students);
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

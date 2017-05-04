package com.ua.groupIntro.service;

import com.ua.groupIntro.exceptions.DuplicateDatException;
import com.ua.groupIntro.exceptions.InvalidInputOrNoSuchDtudentException;
import com.ua.groupIntro.exceptions.NoStudentsFoundException;
import com.ua.groupIntro.model.Student;
import com.ua.groupIntro.utils.ListInit;
import com.ua.groupIntro.views.AddStudentView;

import java.util.List;
import java.util.Optional;

/**
 * Created by User on 4/28/2017.
 */
public class MainServiceImpl implements MainService {

    private Student student;

    private ListInit list;
    private List<Student> students;
    private AddStudentView view;
    private int studentCount;

    public MainServiceImpl() {
        this.list = new ListInit();
        this.students = list.getStudentsList();
        this.view = new AddStudentView();
        this.studentCount = 0;

    }

    @Override
    public List<Student> showAllStudents()  {

        return students;
    }

    @Override
    public boolean addStudent(Student student) {
        if (student != null ){
            students.add(student); return true;
        } else try {
            throw new DuplicateDatException("Such student already exist");
        } catch (DuplicateDatException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean removeStudent(Student student) {
        if(student != null && students.contains(student)){
            students.remove(student); return true;
        } else try {
            throw new NoStudentsFoundException("No student");
        } catch (NoStudentsFoundException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Optional<Student> findStudentByName(Student student) throws InvalidInputOrNoSuchDtudentException {
        try {
           Optional<Student> search = students.stream().filter(s -> s.equals(student.getName())).findFirst();
           return search;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void startApp() {
        view.printHelloMessage();
        createGroup();
        view.showAllStudent(showAllStudents());
    }

    private void createGroup() {
        int size = view.getSize();
        do {
            view.showAddStudentMassage();
            addStudent(new Student(view.getName(), view.getAge(), view.getPhone()));
            studentCount ++;
        }while (studentCount < size);
    }
}

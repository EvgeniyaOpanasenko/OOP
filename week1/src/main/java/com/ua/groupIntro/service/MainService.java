package com.ua.groupIntro.service;

import com.ua.groupIntro.exceptions.DuplicateDatException;
import com.ua.groupIntro.exceptions.InvalidInputOrNoSuchDtudentException;
import com.ua.groupIntro.exceptions.NoStudentsFoundException;
import com.ua.groupIntro.model.Student;

import java.util.List;
import java.util.Optional;

/**
 * Created by User on 4/28/2017.
 */
public interface MainService {
    List<Student> showAllStudents() throws NoStudentsFoundException;
    boolean addStudent(Student student) throws DuplicateDatException;
    boolean removeStudent(Student student) throws InvalidInputOrNoSuchDtudentException;
    Optional<Student> findStudentByName(Student student) throws InvalidInputOrNoSuchDtudentException;
}

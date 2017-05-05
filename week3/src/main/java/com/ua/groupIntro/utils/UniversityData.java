package com.ua.groupIntro.utils;

import com.ua.groupIntro.model.Dean;
import com.ua.groupIntro.model.Student;

/**
 * Created by User on 5/4/2017.
 */
public class UniversityData {
    private Student student;
    private Dean dean;

    public UniversityData(Student student, Dean dean) {
        this.student = student;
        this.dean = dean;
    }

    public UniversityData() {
    }

    @Override
    public String toString() {
        return "UniversityData{" +
                "student=" + student +
                ", dean=" + dean +
                '}';
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Dean getDean() {
        return dean;
    }

    public void setDean(Dean dean) {
        this.dean = dean;
    }
}

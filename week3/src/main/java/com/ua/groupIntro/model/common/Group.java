package com.ua.groupIntro.model.common;

import com.ua.groupIntro.model.role.Student;

import java.util.List;


public class Group {

    private int size;
    private List<Student> students;

    public Group(int size, List<Student> students) {
        this.size = size;
        this.students = students;
    }

    public String getName(int index){
        return students.get(index).getName();
    }

    @Override
    public String toString() {
        return "Group{" +
                "size=" + size +
                ", students=" + students +
                '}';
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}

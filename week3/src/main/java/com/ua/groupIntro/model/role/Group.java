package com.ua.groupIntro.model.role;

import com.ua.groupIntro.model.role.Student;

import java.util.List;


public class Group {

    private String name;
    private int size;
    private List<Student> students;

    public Group(String name, List<Student> students) {
        this.name = name;
        this.students = students;
        this.size = students.size();
    }


    public String getName(int index){
        return students.get(index).getName();
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", students=" + students +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}

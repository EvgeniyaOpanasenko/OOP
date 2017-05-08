package com.ua.groupIntro.model;

import java.util.Date;

/**
 * Created by User on 5/2/2017.
 */
public class Student extends Worker {

    private static double monthMoney = 790;
    private int rank;
    private ParentsData parentsData;

    public Student(String name, Address address, Date birthday,
                   ContactData contacts, int rank, ParentsData parentsData, double salary) {
        super(name, address, birthday, contacts, salary);
        this.rank = rank;
        this.parentsData = parentsData;
    }

   public Student() {

    }

    @Override
    public void makeReport() {
        System.out.println("Student report");
    }

    @Override
    public String toString() {
        return "Student{" +
                "rank=" + rank +
                ", parentsData=" + parentsData +
                '}';
    }

    public static double getMonthMoney() {
        return monthMoney;
    }

    public static void setMonthMoney(double monthMoney) {
        Student.monthMoney = monthMoney;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public ParentsData getParentsData() {
        return parentsData;
    }

    public void setParentsData(ParentsData parentsData) {
        this.parentsData = parentsData;
    }
}

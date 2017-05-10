package com.ua.groupIntro.model.role;

import com.ua.groupIntro.model.common.Address;
import com.ua.groupIntro.model.common.ParentsData;
import com.ua.groupIntro.model.enums.Role;
import com.ua.groupIntro.world.role.IAlcoholic;
import com.ua.groupIntro.world.role.ISportsman;

import java.util.Date;

public class Student extends Human implements ISportsman, IAlcoholic {

    private static double monthMoney = 790;
    private int rank;
    private ParentsData parentsData;
    private Enum role;

   public Student(String name, Address address, Date birthday,
                          ContactData contacts, int rank, ParentsData parentsData) {
        super(name, address, birthday, contacts);
        this.rank = rank;
        this.parentsData = parentsData;
        this.role = Role.STUDENT;
    }

    public Student() {
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

    @Override
    public void doExercise() {
        System.out.println("Jump");
    }

    @Override
    public void spendMoney() {
        System.out.println("Drink");
    }
}

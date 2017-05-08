package com.ua.groupIntro.model.role;

import com.ua.groupIntro.model.common.Address;

import java.util.Date;

import static com.ua.groupIntro.Utils.getInstanceAccountBalance;

/**
 * Created by User on 5/5/2017.
 */
public abstract class Worker extends Human {

    public static final int WORK_DAY_HOURS = 8;
    private double salary;
    private int amountHours;
    private double accountBalance;

    public Worker() {

    }


    public Worker(String name, Address address, Date birthday,
                  ContactData contacts, double salary) {
        super(name, address, birthday, contacts);
        this.salary = salary;

        this.accountBalance = getInstanceAccountBalance();

    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAmountHours() {
        return amountHours;
    }

    public void setAmountHours(int amountHours) {
        this.amountHours = amountHours;
    }


    public void work() {
        amountHours += WORK_DAY_HOURS;
        System.out.println("Work hard in Worker class");
    }

    public abstract void makeReport();
}

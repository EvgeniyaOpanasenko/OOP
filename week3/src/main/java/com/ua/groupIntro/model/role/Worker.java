package com.ua.groupIntro.model.role;

import com.ua.groupIntro.model.common.Address;
import com.ua.groupIntro.model.enums.Role;

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
    private Enum role;
    private String position;

    public Worker() {
    }

    public Worker(String name, Address address, Date birthday,
                  ContactData contacts, double salary) {
        super(name, address, birthday, contacts);
        this.salary = salary;
        this.accountBalance = getInstanceAccountBalance();
        this.role = Role.WORKER;
        this.position = this.getClass().getSimpleName();

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

    public String getPosition() {
        return position;
    }

    public void work() {
        amountHours += WORK_DAY_HOURS;
        System.out.println("Work hard in Worker class");
    }

    public abstract void makeReport();

    @Override
    public String toString() {
        return "Worker{" +
                "salary=" + salary +
                ", amountHours=" + amountHours +
                ", accountBalance=" + accountBalance +
                ", role=" + role +
                ", position='" + position + '\'' +
                '}';
    }
}

package com.ua.groupIntro.model;

/**
 * Created by User on 5/4/2017.
 */
public class Dean extends Human {
    private long blackMoney;
    private Human secretary;

    public Dean(String name, int age, int phone) {
        super(name, age, phone);
    }

    public Dean() {
    }

    public long getBlackMoney() {
        return blackMoney;
    }

    public void setBlackMoney(long blackMoney) {
        this.blackMoney = blackMoney;
    }

    public Human getSecretary() {
        return secretary;
    }

    public void setSecretary(Human secretary) {
        this.secretary = secretary;
    }
}

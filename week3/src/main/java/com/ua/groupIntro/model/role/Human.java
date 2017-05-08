package com.ua.groupIntro.model.role;

import com.ua.groupIntro.model.common.Address;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by User on 5/4/2017.
 */
public class Human implements Serializable{
    private String name;
    private Address address;
    private Date birthday;
    private ContactData contacts;
    private String idNum;
    private static int idCounter = 0;

    public Human() {
    }

    public Human(String name, Address address,
                 Date birthday, ContactData contacts) {
        this.name = name;
        this.address = address;
        this.birthday = birthday;
        this.contacts = contacts;
        this.idNum = String.valueOf(idCounter);
        idCounter++;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", birthday=" + birthday +
                ", contacts=" + contacts +
                ", idNum='" + idNum + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public ContactData getContacts() {
        return contacts;
    }

    public void setContacts(ContactData contacts) {
        this.contacts = contacts;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Human.idCounter = idCounter;
    }
}

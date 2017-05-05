package com.ua.groupIntro.model;

/**
 * Created by User on 5/4/2017.
 */
public class Contacts {
    private String mail;
    private String phone;

    public Contacts(String mail, String phone) {
        this.mail = mail;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "mail='" + mail + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

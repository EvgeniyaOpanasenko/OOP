package com.ua.groupIntro.utils;

import com.ua.groupIntro.controller.MainService;
import com.ua.groupIntro.controller.MainServiceImpl;
import com.ua.groupIntro.model.common.Address;
import com.ua.groupIntro.model.common.ParentsData;
import com.ua.groupIntro.model.role.*;

import java.util.Date;

public class InitDb {

    public static void initDB(){
        MainService service = new MainServiceImpl();
        Accountant accountant = new Accountant();

        Dean dean1 = new Dean("l",
                new Address("USA", "Kiev", "kiev", 12),
                new Date(192, 12, 12),
                new ContactData("Contact", "contact"), 12, 4000);

        Worker dean12 = new Dean("l",
                new Address("UK", "Kiev", "kiev", 12),
                new Date(412, 12, 12),
                new ContactData("Contact", "contact"), 12, 4000);


        Student student1 = new Student("h",
                new Address("Ukraine", "Kiev", "kiev", 12),
                new Date(162, 12, 12),
                new ContactData("Contact", "contact"), 12,
                new ParentsData("mama", "papa"));


        Student student2 = new Student("f",
                new Address("Moldova", "Kiev", "kiev", 12),
                new Date(128, 12, 12),
                new ContactData("Contact", "contact"), 12,
                new ParentsData("mama", "papa"));

        Human human = new Dean("a",
                new Address("Gergia", "Kiev", "kiev", 12),
                new Date(182, 12, 12),
                new ContactData("Contact", "contact"), 12, 4000);


        Student student3 = new Student("s",
                new Address("Turkey", "Kiev", "kiev", 12),
                new Date(127,12,12),
                new ContactData("Contact", "contact"),12,
                new ParentsData("mama", "papa"));

        Student student4 = new Student("d",
                new Address("USA", "Kiev", "kiev", 12),
                new Date(125,12,12),
                new ContactData("Contact", "contact"),12,
                new ParentsData("mama", "papa"));

        Student student5 = new Student("f",
                new Address("GB", "Kiev", "kiev", 12),
                new Date(1,12,12),
                new ContactData("Contact", "contact"),12,
                new ParentsData("mama", "papa"));

        Student student6 = new Student("g",
                new Address("GB", "Kiev", "kiev", 12),
                new Date(125,12,12),
                new ContactData("Contact", "contact"),12,
                new ParentsData("mama", "papa"));

        Worker dean2 = new Dean("d",
                new Address("Russia", "Kiev", "kiev", 12),
                new Date(112,12,12),
                new ContactData("Contact", "contact"),12,4000);

        Accountant accountant1 = new Accountant("Kate",
                new Address("Greece", "Kiev", "kiev", 12),
                new Date(10,12,12),
                new ContactData("Contact", "contact"),4000);

        Cleaner cleaner = new Cleaner("j",
                new Address("Ukraine", "Kiev", "kiev", 12),
                new Date(12,12,12),
                new ContactData("Contact", "contact"),4000);


        service.create(dean12);
        service.create(student1);
        service.create(student2);
        service.create(student3);
        service.create(student4);
        service.create(student5);
        service.create(student6);
        service.create(accountant1);
        service.create(cleaner);

    }

}

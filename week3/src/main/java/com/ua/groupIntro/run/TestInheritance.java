package com.ua.groupIntro.run;

import com.ua.groupIntro.controller.MainService;
import com.ua.groupIntro.controller.MainServiceImpl;
import com.ua.groupIntro.model.*;

import java.util.Date;

/**
 * Created by User on 5/4/2017.
 */
public class TestInheritance {
    public static void main(String[] args) {
        Dean dean = new Dean();

        // dean method
        dean.getBlackMoney();

        //parent
        dean.getBirthday();

        Student student1 = new Student("Eva",
                new Address("Kiev", "Kiev", "kiev", 12),
                new Date(12,12,12),
                new ContactData("Contact", "contact"),12,
                new ParentsData("mama", "papa"));

        Student student2 = new Student("Eva",
                new Address("Kiev", "Kiev", "kiev", 12),
                new Date(12,12,12),
                new ContactData("Contact", "contact"),12,
                new ParentsData("mama", "papa"));

        Student student3 = new Student("Vila",
                new Address("Kiev", "Kiev", "kiev", 12),
                new Date(12,12,12),
                new ContactData("Contact", "contact"),12,
                new ParentsData("mama", "papa"));

        Student student4 = new Student("Mishaka",
                new Address("Kiev", "Kiev", "kiev", 12),
                new Date(12,12,12),
                new ContactData("Contact", "contact"),12,
                new ParentsData("mama", "papa"));


        MainService service = new MainServiceImpl();
        service.create(student1);
        service.create(student2);
        service.create(student3);
        service.create(student4);






    }
}

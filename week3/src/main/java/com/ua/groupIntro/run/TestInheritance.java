package com.ua.groupIntro.run;

import com.ua.groupIntro.controller.MainService;
import com.ua.groupIntro.controller.MainServiceImpl;
import com.ua.groupIntro.model.common.Address;
import com.ua.groupIntro.model.common.ParentsData;
import com.ua.groupIntro.model.role.*;

import java.util.Date;

/**
 * Created by User on 5/4/2017.
 */
public class TestInheritance {
    public static void main(String[] args) {

        MainService service = new MainServiceImpl();
        Accountant accountant = new Accountant();

        Dean dean12 = new Dean("Eva",
                new Address("Kiev", "Kiev", "kiev", 12),
                new Date(12,12,12),
                new ContactData("Contact", "contact"),12,4000);

        Worker dean14 = new Dean("Eva",
                new Address("Kiev", "Kiev", "kiev", 12),
                new Date(12,12,12),
                new ContactData("Contact", "contact"),12,4000);

        accountant.paySalary(dean12);
        accountant.paySalary(dean14);
        System.out.println("dean 14 = " + dean14.getAccountBalance());
        System.out.println("dean 12 = " + dean12.getAccountBalance());



        Student student = new Student("Eva",
                new Address("Kiev", "Kiev", "kiev", 12),
                new Date(12,12,12),
                new ContactData("Contact", "contact"),12,
                new ParentsData("mama", "papa"), 4000);

        Human human = new Dean("Eva",
                new Address("Kiev", "Kiev", "kiev", 12),
                new Date(12,12,12),
                new ContactData("Contact", "contact"),12,4000);


       /* Worker student1 = new Student("Eva",
                new Address("Kiev", "Kiev", "kiev", 12),
                new Date(12,12,12),
                new ContactData("Contact", "contact"),12,
                new ParentsData("mama", "papa"), 4000);

        Worker student2 = new Student("Eva",
                new Address("Kiev", "Kiev", "kiev", 12),
                new Date(12,12,12),
                new ContactData("Contact", "contact"),12,
                new ParentsData("mama", "papa"), 4000);

        Worker student3 = new Student("Vila",
                new Address("Kiev", "Kiev", "kiev", 12),
                new Date(12,12,12),
                new ContactData("Contact", "contact"),12,
                new ParentsData("mama", "papa"), 4000);

        Worker student4 = new Student("Mishaka",
                new Address("Kiev", "Kiev", "kiev", 12),
                new Date(12,12,12),
                new ContactData("Contact", "contact"),12,
                new ParentsData("mama", "papa"), 4000);

        Worker dean2 = new Dean("Eva",
                new Address("Kiev", "Kiev", "kiev", 12),
                new Date(12,12,12),
                new ContactData("Contact", "contact"),12,4000);*/







    }
}

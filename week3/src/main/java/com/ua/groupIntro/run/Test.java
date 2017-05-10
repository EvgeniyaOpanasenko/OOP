package com.ua.groupIntro.run;

import com.ua.groupIntro.controller.MainService;
import com.ua.groupIntro.controller.MainServiceImpl;
import com.ua.groupIntro.model.common.Address;
import com.ua.groupIntro.model.role.ContactData;
import com.ua.groupIntro.model.role.Dean;
import com.ua.groupIntro.model.role.Worker;

import java.util.Date;

/**
 * Created by User on 5/8/2017.
 */
public class Test {
    public static void main(String[] args) {

        MainService service = new MainServiceImpl();

        Worker dean = new Dean("Eva",
                new Address("Kiev", "Kiev", "kiev", 12),
                new Date(12,12,12),
                new ContactData("Contact", "contact"),12,4000);

        service.create(dean);

        System.out.println(service.getAllWorkers());


    }
}

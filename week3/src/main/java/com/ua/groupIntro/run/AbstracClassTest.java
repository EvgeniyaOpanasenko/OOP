package com.ua.groupIntro.run;

import com.ua.groupIntro.model.common.Address;
import com.ua.groupIntro.model.role.ContactData;
import com.ua.groupIntro.model.role.Dean;
import com.ua.groupIntro.model.role.Manager;
import com.ua.groupIntro.model.role.Worker;

import java.util.Date;

/**
 * Created by User on 5/6/2017.
 */
public class AbstracClassTest {
    public static void main(String[] args) {

        Dean dean = new Dean("Eva",
                new Address("Kiev", "Kiev", "kiev", 12),
                new Date(12,12,12),
                new ContactData("Contact", "contact"),12,4000);

        Manager manager = new Manager();

        Worker worker = new Dean();

        worker.work();
    }
}

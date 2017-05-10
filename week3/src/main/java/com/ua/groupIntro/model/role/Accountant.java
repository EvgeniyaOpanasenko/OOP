package com.ua.groupIntro.model.role;

import com.ua.groupIntro.model.common.Address;

import java.util.Date;

/**
 * Created by User on 5/6/2017.
 */
public class Accountant extends Worker {

    public Accountant() {
    }

    public Accountant(String name, Address address, Date birthday,
                      ContactData contacts, double salary) {
        super(name, address, birthday, contacts, salary);
    }

    public void paySalary(Worker worker){

       double salary =  worker.getSalary();
       double newAccountBalance = worker.getAccountBalance() + salary;
       worker.setAccountBalance(newAccountBalance);

    }

    public void testVisitor (Worker worker){
        // instance of

        if (worker instanceof Dean){
            Dean ref = (Dean) worker;
            ref.setBlackMoney(23333);
            System.out.println("Dean came");
        }else if(worker instanceof Secretary) {
            System.out.println("Secretary in");
        }
    }

    @Override
    public void makeReport() {
        System.out.println("Accountant report");
    }
}

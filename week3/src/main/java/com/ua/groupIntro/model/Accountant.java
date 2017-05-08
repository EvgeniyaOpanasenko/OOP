package com.ua.groupIntro.model;

/**
 * Created by User on 5/6/2017.
 */
public class Accountant extends Worker {


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

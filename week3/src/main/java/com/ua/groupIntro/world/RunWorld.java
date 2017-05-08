package com.ua.groupIntro.world;

import com.ua.groupIntro.world.role.Alcoholic;

/**
 * Created by User on 5/8/2017.
 */
public class RunWorld {
    public static void main(String[] args) {
        Pub pub = new Pub();

        Client client = new Alcoholic();

        client.spendMoney();
    }
}

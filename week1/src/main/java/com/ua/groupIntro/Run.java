package com.ua.groupIntro;

import com.ua.groupIntro.exceptions.DuplicateDatException;
import com.ua.groupIntro.model.Group;
import com.ua.groupIntro.model.Student;
import com.ua.groupIntro.service.MainService;
import com.ua.groupIntro.service.MainServiceImpl;

/**
 * Created by User on 4/28/2017.
 */
public class Run {
    public static void main(String[] args) throws DuplicateDatException {

        MainService service = new MainServiceImpl();
        service.startApp();

    }
}

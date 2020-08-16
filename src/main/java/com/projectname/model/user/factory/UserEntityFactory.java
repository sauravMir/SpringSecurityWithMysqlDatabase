package com.projectname.model.user.factory;

import com.projectname.model.user.aggregate.UserEntity;
import com.projectname.model.user.vo.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserEntityFactory {

    public static UserEntity createUserEntity(String name, String password, int role) {
        return new UserEntity(0, new Name(name), new Password(password),
                new Role(role), new Created(getCurrentDate()), new Updated(getCurrentDate()));
    }

    //FIXME remove this method as it does not comply to DDD
    public static Date getCurrentDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        return date;
    }


}

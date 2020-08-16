package com.projectname.model.user.factory;

import com.projectname.model.user.aggregate.UserEntity;
import com.projectname.model.user.aggregate.UserMinified;
import com.projectname.model.user.vo.Name;
import com.projectname.model.user.vo.Password;

public class UserMinifiedFactory {

    public static UserMinified createUserMinified (UserEntity user) {
        return  new UserMinified(user.getName(), user.getPassword());
    }

    public static UserMinified createUserMinified (String name, String password) {
        return  new UserMinified(new Name(name), new Password(password));
    }

}

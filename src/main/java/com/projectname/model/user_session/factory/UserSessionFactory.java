package com.projectname.model.user_session.factory;

import com.projectname.model.user.aggregate.UserEntity;
import com.projectname.model.user_session.aggregate.UserSessionEntity;
import com.projectname.model.user_session.vo.Created;
import com.projectname.model.user_session.vo.Token;

public class UserSessionFactory {

    public static UserSessionEntity createUserSession(Token token, UserEntity user) {
        return new UserSessionEntity(0, token, Created.getCreated(), user);
    }
}

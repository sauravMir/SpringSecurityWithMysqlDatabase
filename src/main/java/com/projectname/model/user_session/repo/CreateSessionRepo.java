package com.projectname.model.user_session.repo;

import com.projectname.model.user_session.aggregate.UserSessionEntity;

public interface CreateSessionRepo {
    public UserSessionEntity createUserSession(UserSessionEntity userSessionEntity);
}

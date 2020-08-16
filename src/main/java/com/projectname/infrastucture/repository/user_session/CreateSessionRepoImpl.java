package com.projectname.infrastucture.repository.user_session;

import com.projectname.model.user_session.aggregate.UserSessionEntity;
import com.projectname.model.user_session.repo.CreateSessionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CreateSessionRepoImpl implements CreateSessionRepo {

    @Autowired
    UserSessionCrudRepo userSessionCrudRepo;

    @Override
    public UserSessionEntity createUserSession(UserSessionEntity userSessionEntity) {
        return userSessionCrudRepo.save(userSessionEntity);
    }
}

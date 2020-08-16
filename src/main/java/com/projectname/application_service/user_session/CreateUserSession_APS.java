package com.projectname.application_service.user_session;

import com.projectname.application_service.user_session.command.CreateSessionCommand;
import com.projectname.model.user_session.aggregate.UserSessionEntity;
import com.projectname.model.user_session.factory.UserSessionFactory;
import com.projectname.model.user_session.repo.CreateSessionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateUserSession_APS {

    @Autowired
    CreateSessionRepo createSessionRepo;

    public UserSessionEntity execute(CreateSessionCommand createSessionCommand) {
        return createSessionRepo.createUserSession(UserSessionFactory.createUserSession(createSessionCommand.getToken(),
                createSessionCommand.getUserEntity()));
    }

}

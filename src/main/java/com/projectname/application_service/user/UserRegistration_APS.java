package com.projectname.application_service.user;

import com.projectname.application_service.user.command.UserRegistrationCommand;
import com.projectname.model.user.aggregate.UserMinified;
import com.projectname.model.user.factory.UserEntityFactory;
import com.projectname.model.user.repo.CreateUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegistration_APS {
    @Autowired
    CreateUserRepo createUserRepo;

    public UserMinified execute(UserRegistrationCommand userRegistrationCommand) {
        return  createUserRepo.createUser(UserEntityFactory.createUserEntity(userRegistrationCommand.getUsername(),
                userRegistrationCommand.getPassword(), userRegistrationCommand.getRole()));
    }
}

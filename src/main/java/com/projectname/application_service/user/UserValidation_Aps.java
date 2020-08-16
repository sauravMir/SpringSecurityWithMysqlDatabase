package com.projectname.application_service.user;

import com.projectname.application_service.user.command.UserValidationCommand;
import com.projectname.model.user.aggregate.UserEntity;
import com.projectname.model.user.factory.UserMinifiedFactory;
import com.projectname.model.user.repo.UserValidationRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@RequiredArgsConstructor
public class UserValidation_Aps {
    @Autowired
    private final UserValidationRepo userValidationRepo;

    public Optional<UserEntity> execute(UserValidationCommand userValidationCommand) {
        return  userValidationRepo.verifyUser(UserMinifiedFactory.createUserMinified(userValidationCommand.getUsername(),
                userValidationCommand.getPassword()));
    }
}

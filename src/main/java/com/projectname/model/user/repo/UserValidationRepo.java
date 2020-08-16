package com.projectname.model.user.repo;

import com.projectname.model.user.aggregate.UserEntity;
import com.projectname.model.user.aggregate.UserMinified;

import java.util.Optional;

public interface UserValidationRepo {
    Optional<UserEntity> verifyUser(UserMinified user);
}

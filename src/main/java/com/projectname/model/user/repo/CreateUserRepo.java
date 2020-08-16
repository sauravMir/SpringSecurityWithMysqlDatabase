package com.projectname.model.user.repo;

import com.projectname.model.user.aggregate.UserEntity;
import com.projectname.model.user.aggregate.UserMinified;

public interface CreateUserRepo {

    UserMinified createUser(UserEntity userEntity);

}

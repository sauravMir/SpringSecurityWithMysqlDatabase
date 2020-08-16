package com.projectname.infrastucture.repository.user;

import com.projectname.model.user.aggregate.UserEntity;
import com.projectname.model.user.aggregate.UserMinified;
import com.projectname.model.user.factory.UserMinifiedFactory;
import com.projectname.model.user.repo.CreateUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class CreateUserRepoImpl implements CreateUserRepo {
    @Autowired
    UserCrudRepo userCrudRepo;
    @Transactional
    @Override
    public UserMinified createUser(UserEntity userEntity) {
        UserEntity user= userCrudRepo.save(userEntity);
        return UserMinifiedFactory.createUserMinified(user);
    }
}

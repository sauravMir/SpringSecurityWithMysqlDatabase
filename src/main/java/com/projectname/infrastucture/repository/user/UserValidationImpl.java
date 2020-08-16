package com.projectname.infrastucture.repository.user;

import com.projectname.model.user.aggregate.UserEntity;
import com.projectname.model.user.aggregate.UserMinified;
import com.projectname.model.user.repo.UserValidationRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class UserValidationImpl implements UserValidationRepo {
    @Autowired
    private final UserCrudRepo userCrudRepo;
    @Override
    public Optional<UserEntity> verifyUser(UserMinified user) {
        return userCrudRepo.findByNameAndPassword(user.getMinifiedUsername(), user.getMinifiedPassword());
    }
}

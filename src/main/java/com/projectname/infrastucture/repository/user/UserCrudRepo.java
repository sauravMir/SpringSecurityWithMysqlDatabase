package com.projectname.infrastucture.repository.user;

import com.projectname.model.user.aggregate.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserCrudRepo extends CrudRepository<UserEntity, Integer> {

    @Override
    Optional<UserEntity> findById(Integer id);

    @Override
    <S extends UserEntity> S save(S entity);
}

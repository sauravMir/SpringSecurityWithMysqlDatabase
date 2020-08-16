package com.projectname.infrastucture.repository.user;

import com.projectname.model.user.aggregate.UserEntity;
import com.projectname.model.user.vo.Name;
import com.projectname.model.user.vo.Password;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserCrudRepo extends CrudRepository<UserEntity, Integer> {

    @Override
    Optional<UserEntity> findById(Integer id);

    Optional<UserEntity> findByNameAndPassword(Name name, Password password);

    @Override
    <S extends UserEntity> S save(S entity);
}

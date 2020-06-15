package com.projectname.infrastucture.repository.user_session;

import com.projectname.model.user_session.aggregate.UserSessionEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserSessionCrudRepo extends CrudRepository<UserSessionEntity, Integer> {

    @Override
    Optional<UserSessionEntity> findById(Integer id);

    @Override
    <S extends UserSessionEntity> S save(S entity);
}

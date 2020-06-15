package com.projectname.model.user.aggregate;


import com.projectname.model.user.vo.*;
import com.projectname.model.user_session.aggregate.UserSessionEntity;
import lombok.Data;

import javax.persistence.*;
import javax.persistence.Id;
import java.util.List;

@Entity(name = "user")
@Data
public class UserEntity {
    @Id
    private int id;
    @Embedded
    private Name name;
    @Embedded
    private Password password;
    @Embedded
    private Role role;
    @Embedded
    private Created created;
    @Embedded
    private Updated updated;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "userEntity")
    List<UserSessionEntity> userSessionEntityList;
}

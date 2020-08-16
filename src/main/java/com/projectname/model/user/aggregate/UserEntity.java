package com.projectname.model.user.aggregate;


import com.projectname.model.user.vo.*;
import com.projectname.model.user_session.aggregate.UserSessionEntity;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Id;
import javax.persistence.*;
import java.util.List;

@Entity(name = "user")
@Data
@RequiredArgsConstructor
public class UserEntity {
    // for hibernate
    public UserEntity() {
        this.id =0;
        this.name = null;
        this.password = null;
        this.role = null;
        this.created = null;
        this.updated = null;
    }
    @Id
    protected final int id;
    @Embedded
    protected final Name name;
    @Embedded
    protected final Password password;
    @Embedded
    protected final Role role;
    @Embedded
    protected final Created created;
    @Embedded
    protected final Updated updated;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "userEntity")
    List<UserSessionEntity> userSessionEntityList;
}

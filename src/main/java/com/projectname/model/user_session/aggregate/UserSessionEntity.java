package com.projectname.model.user_session.aggregate;

import com.projectname.model.user.aggregate.UserEntity;
import com.projectname.model.user_session.vo.Created;
import com.projectname.model.user_session.vo.Token;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity(name = "user_session")
@Data
@AllArgsConstructor
public class UserSessionEntity {

    @Id
    int id;

    @Embedded
    Token token;

    @Embedded
    Created created;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name="user_id", nullable=false)
    UserEntity userEntity;

}

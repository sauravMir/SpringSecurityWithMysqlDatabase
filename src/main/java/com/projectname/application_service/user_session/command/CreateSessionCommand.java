package com.projectname.application_service.user_session.command;

import com.projectname.model.user.aggregate.UserEntity;
import com.projectname.model.user_session.vo.Created;
import com.projectname.model.user_session.vo.Token;
import lombok.Value;

@Value
public class CreateSessionCommand {
    Token token;
    Created createDate;
    UserEntity userEntity;
}

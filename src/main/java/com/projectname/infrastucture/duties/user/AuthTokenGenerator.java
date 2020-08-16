package com.projectname.infrastucture.duties.user;

import com.projectname.application_service.user_session.TokenGenerator_APS;
import com.projectname.model.user_session.vo.Token;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AuthTokenGenerator implements com.projectname.model.user_session.AuthTokenGenerator {
    @Autowired
    TokenGenerator_APS tokenGenerator_aps;
    @Override
    public Token generatesAuthToken() {
        return tokenGenerator_aps.execute();
    }
}

package com.projectname.application_service.user_session;

import com.projectname.model.user_session.factory.TokenGenerationFactory;
import com.projectname.model.user_session.vo.Token;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class TokenGenerator_APS {

    public Token execute() {
        final String token = UUID.randomUUID().toString();
        return TokenGenerationFactory.genrateToken((token));
    }

}

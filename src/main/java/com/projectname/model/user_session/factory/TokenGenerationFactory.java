package com.projectname.model.user_session.factory;

import com.projectname.model.user_session.vo.Token;

public class TokenGenerationFactory {
    public static Token genrateToken(String token) {
        return new Token(token);
    }
}

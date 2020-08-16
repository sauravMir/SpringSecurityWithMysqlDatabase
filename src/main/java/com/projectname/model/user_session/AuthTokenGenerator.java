package com.projectname.model.user_session;

import com.projectname.model.user_session.vo.Token;

public interface AuthTokenGenerator {
    Token generatesAuthToken();
}

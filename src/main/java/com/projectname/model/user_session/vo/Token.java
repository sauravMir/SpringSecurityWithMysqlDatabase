package com.projectname.model.user_session.vo;


import lombok.RequiredArgsConstructor;
import lombok.Value;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Value
@RequiredArgsConstructor
public class Token {
    @Column(name = "token")
    private final String token;

    @SuppressWarnings("unused")
    private Token() {
        this.token = null
        ;
    }
}

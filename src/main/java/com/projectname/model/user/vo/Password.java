package com.projectname.model.user.vo;

import lombok.RequiredArgsConstructor;
import lombok.Value;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@RequiredArgsConstructor
public class Password {
    @Column(name = "password")
    private final String value;

    @SuppressWarnings("unused")
    private Password() {
        value = null;
    }
}

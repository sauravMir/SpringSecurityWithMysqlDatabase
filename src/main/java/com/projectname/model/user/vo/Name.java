package com.projectname.model.user.vo;

import lombok.RequiredArgsConstructor;
import lombok.Value;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Value
@RequiredArgsConstructor
public class Name {
    @Column(name = "name")
    private final String value;

    @SuppressWarnings("unused")
    private Name() {
        this.value = null
        ;
    }
}

package com.projectname.model.user.vo;

import lombok.RequiredArgsConstructor;
import lombok.Value;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@RequiredArgsConstructor
public class Role {
    @Column(name = "role")
    private final int value;

    @SuppressWarnings("unused")
    private Role() {
        value = 0;
    }

//     enum RoleType {
//        RoleType(int type) {
//
//        }
//    }
}

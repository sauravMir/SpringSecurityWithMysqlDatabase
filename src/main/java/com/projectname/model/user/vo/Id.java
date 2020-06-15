package com.projectname.model.user.vo;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Embeddable
public class Id {
//
//    @GeneratedValue(strategy= GenerationType.IDENTITY)
//    @GeneratedValue(generator = "increment")
//    @GenericGenerator(name = "increment", strategy = "increment")
    //@Column(name = "id")
    private final int id;
    @SuppressWarnings("unused")
    private Id() {
        this.id = 0;
    }
    private Id(int id) {
        this.id = id;
    }
}

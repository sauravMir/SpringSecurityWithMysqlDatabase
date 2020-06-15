package com.projectname.model.user.vo;

import lombok.RequiredArgsConstructor;
import lombok.Value;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Embeddable
@RequiredArgsConstructor
public class Updated {
    @Column(name = "updated")
    @Temporal(TemporalType.TIMESTAMP)
    private final Date value;

    @SuppressWarnings("unused")
    private Updated() {
        value = null;
    }

}

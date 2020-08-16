package com.projectname.model.user_session.vo;

import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Embeddable
@RequiredArgsConstructor
public class Created {

    @Column(name = "created")
    @Temporal(TemporalType.TIMESTAMP)
    private final Date value;

    @SuppressWarnings("unused")
    private Created() {
        value = null;
    }
    //FIXME remove this method as it does not comply to DDD
    public static Created getCreated() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        return new Created(date);
    }
}
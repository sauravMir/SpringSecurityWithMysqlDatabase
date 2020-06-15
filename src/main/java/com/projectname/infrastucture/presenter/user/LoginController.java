package com.projectname.infrastucture.presenter.user;

import com.projectname.infrastucture.repository.user.UserCrudRepo;
import com.projectname.infrastucture.repository.user_session.UserSessionCrudRepo;
import com.projectname.model.user.aggregate.UserEntity;
import com.projectname.model.user.vo.*;
import com.projectname.model.user_session.aggregate.UserSessionEntity;
import com.projectname.model.user_session.vo.Token;
import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

@RestController
public class LoginController {
    @Autowired
    UserCrudRepo userCrudRepo;

    @Autowired
    UserSessionCrudRepo userSessionCrudRepo;


    @PostMapping("/register")
    public String register(@RequestParam("username") String username,
                           @RequestParam("password") String password) {
        return "asd";
    }

    @PostMapping("/login")
    public String login(@RequestParam("username") String username,
                           @RequestParam("password") String password) {
        return "asd";
    }


    //FIXME remove this method as it does not comply to DDD
    public Date getCurrentDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        return date;
    }

    public void exteriment() {
        UserEntity u = new UserEntity();
        u.setName(new Name("moumita"));
        u.setPassword(new Password("moumita"));
        u.setRole(new Role(1));
        u.setName(new Name("moumita"));
        u.setCreated(new Created(getCurrentDate()));
        u.setUpdated(new Updated(getCurrentDate()));
        //userCrudRepo.save(u);

        Optional<UserEntity> ss = userCrudRepo.findById(1);
        UserSessionEntity session = new UserSessionEntity();
        session.setCreated(new com.projectname.model.user_session.vo.Created(getCurrentDate()));
        session.setToken(new Token("asdasd"));
        session.setUserEntity(ss.get());
        userSessionCrudRepo.save(session);
    }

}

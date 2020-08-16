package com.projectname.infrastucture.presenter.user;

import com.projectname.application_service.user.UserRegistration_APS;
import com.projectname.application_service.user.UserValidation_Aps;
import com.projectname.application_service.user.command.UserRegistrationCommand;
import com.projectname.application_service.user.command.UserValidationCommand;
import com.projectname.application_service.user_session.CreateUserSession_APS;
import com.projectname.application_service.user_session.TokenGenerator_APS;
import com.projectname.application_service.user_session.command.CreateSessionCommand;
import com.projectname.model.user.aggregate.UserEntity;
import com.projectname.model.user.aggregate.UserMinified;
import com.projectname.model.user_session.aggregate.UserSessionEntity;
import com.projectname.model.user_session.vo.Created;
import com.projectname.model.user_session.vo.Token;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

@RestController
public class LoginController {
    @Autowired
    UserRegistration_APS registerAPS;
    @Autowired
    UserValidation_Aps userValidation_aps;

    @Autowired
    CreateUserSession_APS createUserSession_aps;

    @Autowired
    TokenGenerator_APS tokenGenerator_aps;

    // FIXME do the validation of values
    @PostMapping("/register")
    String register(
            @RequestParam("username") final String username,
            @RequestParam("password") final String password,
            @RequestParam("role") final int role
            ) {

        UserMinified userMinified = registerAPS.execute(new UserRegistrationCommand(username, password, role));
        if (userMinified != null) {
            Optional<UserEntity> verifiedUser = userValidation_aps.execute(new UserValidationCommand(userMinified.getUsername(),
                    userMinified.getPassword()));
            if(verifiedUser.isPresent()) {
                Token token = tokenGenerator_aps.execute();
                UserSessionEntity userSessionEntity =
                        createUserSession_aps.execute(new CreateSessionCommand(token, Created.getCreated(), verifiedUser.get()));
                if(userSessionEntity != null)
                System.out.println("The token is : " + token.getToken());
            }
        } else {
            //FIXME throw exception
        }
        return "login(user)";
    }

    @PostMapping("/login")
    public String login(@RequestBody UserMinified user) {
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
//        UserEntity u = new UserEntity();
//        u.setName(new Name("moumita"));
//        u.setPassword(new Password("moumita"));
//        u.setRole(new Role(1));
//        u.setName(new Name("moumita"));
//        u.setCreated(new Created(getCurrentDate()));
//        u.setUpdated(new Updated(getCurrentDate()));
//        //userCrudRepo.save(u);
//
//        //Optional<UserEntity> ss = userCrudRepo.findById(1);
//        UserSessionEntity session = new UserSessionEntity();
//        session.setCreated(new com.projectname.model.user_session.vo.Created(getCurrentDate()));
//        session.setToken(new Token("asdasd"));
//        //session.setUserEntity(ss.get());
//        userSessionCrudRepo.save(session);
    }

}

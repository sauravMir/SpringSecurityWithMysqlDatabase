package com.projectname.infrastucture.presenter.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogInViewController {
    @GetMapping("/register")
    public String register() {
        return "login";
    }
}

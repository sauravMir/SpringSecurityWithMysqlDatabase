package com.projectname.application_service.user.command;

import lombok.Value;

@Value
public class UserLoginCommand {
    private final String username;
    private final String password;
}

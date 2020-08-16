package com.projectname.application_service.user.command;

import lombok.Value;

@Value
public class UserValidationCommand {
    private final String username;
    private final String password;
}

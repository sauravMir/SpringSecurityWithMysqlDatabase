package com.projectname.application_service.user.command;

import lombok.Data;

@Data
public class UserRegistrationCommand {
    private final String username;
    private final String password;
    private final int role ;
}

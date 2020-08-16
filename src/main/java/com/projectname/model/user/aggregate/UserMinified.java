package com.projectname.model.user.aggregate;

import com.projectname.model.user.vo.Name;
import com.projectname.model.user.vo.Password;
import com.sun.istack.NotNull;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;



public class UserMinified implements UserDetails {
    @NotNull
    private final Name username;
    @NotNull
    private final Password password;

    public UserMinified(Name username, Password password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String getPassword() {
        return password.asText();
    }
    @Override
    public String getUsername() {
        return this.username.asText();
    }


    public Password getMinifiedPassword() {
        return password;
    }

    public Name getMinifiedUsername() {
        return this.username;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}

package com.sbu.ece.secureandscalabewebapp.secureapp.config;

import com.sbu.ece.secureandscalabewebapp.secureapp.entities.User;
import org.springframework.security.core.GrantedAuthority;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

public class MyUserDetails implements UserDetails {

    private User user;
    public MyUserDetails(User user){
        super();
        this.user=user;
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if(user.getRole().equalsIgnoreCase("user")) {
            return Collections.singleton(new SimpleGrantedAuthority("ROLE_USER"));
        }else if (user.getRole().equalsIgnoreCase("admin")) {
            return Collections.singleton(new SimpleGrantedAuthority("ROLE_ADMIN"));
        }else {
            return Collections.singleton(new SimpleGrantedAuthority("ROLE_GUEST"));
        }
    }

    @Override
    public String getPassword() {

        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return user.getEnabled();
    }

    @Override
    public boolean isAccountNonLocked() {
        return user.getEnabled();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return user.getEnabled();
    }

    @Override
    public boolean isEnabled() {
        return user.getEnabled();
    }
}

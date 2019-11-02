package com.sbu.ece.secureandscalabewebapp.secureapp.config;

import com.sbu.ece.secureandscalabewebapp.secureapp.entities.User;
import com.sbu.ece.secureandscalabewebapp.secureapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

//@Service
public class MyUserDetailService implements  UserDetailsService {
    @Autowired
    UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user= userRepository.findUserByUsername(s);
        if(user==null){
            throw  new UsernameNotFoundException("user not found");
        }
        return new MyUserDetails(user);
    }
}

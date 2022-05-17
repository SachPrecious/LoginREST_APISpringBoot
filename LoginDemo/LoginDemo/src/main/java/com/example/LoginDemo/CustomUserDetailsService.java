package com.example.LoginDemo;

import com.example.LoginDemo.model.AppUser;
import com.example.LoginDemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        AppUser appUser=userRepository.findByUsername(username);
        if (appUser==null){
            throw new UsernameNotFoundException("User Not Found!");
        }

        return new CustomUserDetails(appUser);
    }
}

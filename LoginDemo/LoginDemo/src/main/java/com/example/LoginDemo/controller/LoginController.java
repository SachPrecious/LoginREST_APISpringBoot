package com.example.LoginDemo.controller;

import com.example.LoginDemo.model.AppUser;
import com.example.LoginDemo.repository.LoginRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LoginController {

    private LoginRepository loginRepository;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(AppUser appUser,String error,String logout){


        return "login";
    }



}

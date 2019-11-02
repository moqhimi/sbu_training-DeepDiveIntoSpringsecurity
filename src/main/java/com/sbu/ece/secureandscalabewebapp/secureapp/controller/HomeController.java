package com.sbu.ece.secureandscalabewebapp.secureapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String homeController(){
        return "home.jsp";
    }

//    @RequestMapping("/login")
//    public String loginController() {
//        return "login.jsp";
//    }
//    @RequestMapping("/logout-success")
//    public  String logoutController(){
//        return "logout.jsp";
//    }
//
//    @RequestMapping("/contactus")
//    public String contactController(){
//        return "contact.jsp";
//    }

    @RequestMapping("/admin")
    public String adminController(){
        return "admin.jsp";
    }


    @RequestMapping("/user")
    public Principal userController(Principal principal){
        return principal;
    }
}

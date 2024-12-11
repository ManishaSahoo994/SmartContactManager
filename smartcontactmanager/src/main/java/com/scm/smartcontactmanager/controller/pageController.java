package com.scm.smartcontactmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class pageController {

    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("Home page handler");
        model.addAttribute("name", "Substring Technologies");
        model.addAttribute("youtubeChannel", "manishablogger");
        model.addAttribute("githubRepository", "https://github.com/manishasahoo994/");
        return "home";
    }
    @RequestMapping("/about")
    public String aboutPage(Model model){
        model.addAttribute("isLogin", false);
        System.out.println("About page loading");
        return "about";
    }
    @RequestMapping("/services")
    public String servicesPage(){
        System.out.println("Services page loading");
        return "services";
    }
    //contact page
    @GetMapping("/contact")
    public String contact() {
        return new String("contact");
    }
    //login
    @GetMapping("/login")
    public String login() {
        return new String("login");
    }
    //register
    @GetMapping("/register")
    public String register() {
        return new String("register");
    }
    
    

}

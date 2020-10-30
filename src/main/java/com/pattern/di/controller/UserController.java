package com.pattern.di.controller;

import com.pattern.di.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/user")
public class UserController {

    /**
     * Greeting service is used via dependency injection here
     */
    @Autowired
    private GreetingService greetingService;

    @GetMapping(path="/greet")
    public @ResponseBody
    String getAllUsers() {
        return greetingService.greetUser();
    }

}

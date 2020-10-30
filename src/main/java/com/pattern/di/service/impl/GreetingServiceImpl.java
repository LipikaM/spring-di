package com.pattern.di.service.impl;


import com.pattern.di.service.GreetingService;
import org.springframework.stereotype.Component;

@Component
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String greetUser() {
        return "Greetings!!";
    }

}

package com.example.SpringEsercizi20.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

public class BasicService {
    @Autowired
    Environment environment;

    public String getProperty() {
        return environment.getProperty("myCustomVar.devName")
                + " " +
                environment.getProperty("myCustomVar.authCode");
    }

    public String getWelcome() {
        return environment.getProperty("myCustomVar.welcomeMsg");
    }
}


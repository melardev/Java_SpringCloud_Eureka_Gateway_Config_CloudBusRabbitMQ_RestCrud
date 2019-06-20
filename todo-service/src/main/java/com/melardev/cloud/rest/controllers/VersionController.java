package com.melardev.cloud.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {

    @Autowired
    Environment environment;

    @GetMapping("version")
    public String getVersion() {
        return environment.getProperty("app.config.version");
    }

}

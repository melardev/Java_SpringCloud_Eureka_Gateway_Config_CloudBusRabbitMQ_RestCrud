package com.melardev.cloud.gateway.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope // To make @Value refreshable, if you don't like that then read from @Autowired Environment
public class VersionController {
    @Value("${app.config.version}")
    String version;

    @GetMapping("version")
    public String getVersion() {
        return version;
    }
}

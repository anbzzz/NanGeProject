package com.zq.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZQ
 * @create 2019-09-08
 */
@RestController
@RequestMapping("/native")
public class NativeConfigHandler {
    @Value("${server.port}")
    private String port;
    @Value("${foo}")
    private String foo;

    @GetMapping("/index")
    public String index() {
        return this.port + this.foo;
    }
}

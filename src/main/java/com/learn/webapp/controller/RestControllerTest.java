package com.learn.webapp.controller;

import com.learn.webapp.service.DoubleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerTest {
    @Autowired
    private DoubleService doubleService;

    @RequestMapping("/v1/test")
    public String interface1(String req) {
        System.out.println("************" + doubleService.getAtMethod());
        return doubleService.getString(req);
    }
    @RequestMapping("/v2/test")
    public String interface2(String req) {
        System.out.println("************" + doubleService.getMe());
        return doubleService.getString(req);
    }
}

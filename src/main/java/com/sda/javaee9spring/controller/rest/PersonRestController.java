package com.sda.javaee9spring.controller.rest;

import com.sda.javaee9spring.service.RealPersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class PersonRestController {

    private final RealPersonService realPersonService;

    @Autowired
    public PersonRestController(RealPersonService realPersonService) {
        this.realPersonService = realPersonService;
    }
}

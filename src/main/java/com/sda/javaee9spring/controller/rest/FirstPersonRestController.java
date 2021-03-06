package com.sda.javaee9spring.controller.rest;

import com.sda.javaee9spring.entity.Person;
import com.sda.javaee9spring.entity.PersonEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/first-person-rest")
public class FirstPersonRestController {

    @GetMapping("/one-person")
    public ResponseEntity<Person> onePerson() {
        return ResponseEntity.ok(new Person("Anton", "Losman", 37));
    }

    @GetMapping("/one-person-404")
    public ResponseEntity<Person> onePerson404() {
        log.info("onePerson404");
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/custom")
    public ResponseEntity<Person> customResponseEntity() {
        return new ResponseEntity<>(new Person("maniek", "p", 10), HttpStatus.OK);
    }

    @GetMapping("/with-headers")
    public ResponseEntity<Person> customResponseEntityWithHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("name", "james");
        return new ResponseEntity<>(new Person("james", "bond", 007), headers, HttpStatus.OK);
    }

}

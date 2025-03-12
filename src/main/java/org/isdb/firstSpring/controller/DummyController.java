package org.isdb.firstSpring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@CrossOrigin(origins = "*")
public class DummyController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/bye")
    public String bye() {
        return "TaTa Bye Bye";
    }

    @GetMapping("/square")
    public int square(@RequestParam int number) {
        return number * number;
    }

    @GetMapping("/hi")
    public String hi(@RequestParam(name = "a") String myName,
                     @RequestParam String fName,
                     @RequestParam(required = false) int age
    ) {
        return "My name is " + myName + " " + "and " + "my father's name is " + fName;
    }

}

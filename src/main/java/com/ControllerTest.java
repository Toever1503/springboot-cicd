package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {

    @GetMapping
    public String getTest() {
        return "Home Test";
    }

    @GetMapping("shiki")
    public String helloShiki() {
        return "Hello Shiki";
    }

    @GetMapping("oris")
    public String helloOris() {
        return "Hello Ori";
    }

}

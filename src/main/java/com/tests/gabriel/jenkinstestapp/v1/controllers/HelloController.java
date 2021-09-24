package com.tests.gabriel.jenkinstestapp.v1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("hello")
public class HelloController {
    @GetMapping
    public ModelAndView home(){
        ModelAndView mav = new ModelAndView("hello/index");
        return mav;
    }
}

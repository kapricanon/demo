package com.spring;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by JSK on 04-Feb-16.
 */
@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping ("/hello")
    public String hello(Model model) {

        model.addAttribute("greeting", "Hello Spring MVC");

        return "helloworld";

    }
}

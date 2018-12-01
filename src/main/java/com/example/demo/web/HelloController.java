package com.example.demo.web;

import com.example.demo.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class HelloController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

}

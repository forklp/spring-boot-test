package com.example.demo.web;

import com.example.demo.domain.User;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping(value = "/login")
public class LoginController {
    @PostMapping(value = "/login")
    User login(@RequestBody User user, HttpSession session) {
        session.setAttribute("login", user);
        return user;
    }

    @GetMapping(value = "/logout")
    String logout(HttpSession session) {
        session.removeAttribute("login");

        return "success";
    }

    @GetMapping(value = "/index")
    User index(HttpSession session) {
        if (session == null) {
            User user = new User();
            return user;
        }
        else {
            Object obj = session.getAttribute("login");
            User user = (User) obj;
            return user;
        }
    }
}

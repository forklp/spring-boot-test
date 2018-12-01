package com.example.demo.web;

import com.example.demo.domain.Test;
import com.example.demo.domain.User;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    static Map<Long, User> users = Collections.synchronizedMap(new HashMap<Long, User>());
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Test postUser(@RequestBody Test test) {
        System.out.println(test.getFirstName());
        Test r = new Test();
        r.setFirstName(test.getFirstName());
        r.setLastName(test.getLastName());
        return r;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public User getUserList() {
        User r = new User();
        r.setAge(20);
        r.setName("klp");
        return r;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable Long id) {
        return users.get(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String putUser(@PathVariable Long id, @ModelAttribute User user) {
        User u = users.get(id);
        u.setAge(user.getAge());
        u.setName(user.getName());
        users.put(id, u);
        return "success";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable Long id) {
        users.remove(id);
        return "success";
    }

}

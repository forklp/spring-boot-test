package com.example.demo.web;

import com.example.demo.domain.Test;
import com.example.demo.entity.Article;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.List;

@RestController
public class DataTest {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserRepository userRepository;
    @RequestMapping("/test")
    public User test() {
//        int page = 1, size = 2;
//        Sort sort = new Sort(Sort.Direction.DESC,"id");
//        Pageable pageable = new PageRequest(page, size, sort);
//        Page<User> page1 = userRepository.findAll(pageable);
//        String s = userRepository.findAll(pageable).toString();
//        System.out.println(s);
        User user = new User();
        user.setUserAccount("klp");
        user.setUserPassword("123456");
        userRepository.save(user);
        return user;
    }
}

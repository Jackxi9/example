package com.gavin.controller;

import com.gavin.po.User;
import com.gavin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.jws.soap.SOAPBinding;
import java.util.List;

/**
 * @author gavin
 * @date 2021/5/18 11:20
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<User> findUserAll() {
        return userService.findUserAll();
    }

    @GetMapping("/user/{id}")
    public User findById(@PathVariable("id") Integer id) {
        return userService.findById(id);
    }

    @GetMapping("/user/index")
    public String uIndex() {
        return "index";
    }
    @GetMapping("/user/login")
    public String uLogin() {
        return "login";
    }

}

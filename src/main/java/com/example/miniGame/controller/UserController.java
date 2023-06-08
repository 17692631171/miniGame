package com.example.miniGame.controller;


import com.example.miniGame.base.ResultBase;
import com.example.miniGame.entity.User;
import com.example.miniGame.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * 用户类请求
 */
@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }
    @PostMapping("/getUser")
    public User getUser(User user){
        ResultBase resultBase = new ResultBase();
        User resultUser = userService.getUser(user);
        System.out.println(resultUser);
        return resultUser;
    }
    @RequestMapping("/regUser")
    public String regUser(User user){
        ResultBase resultBase = new ResultBase();
        Integer result = userService.regUser(user);
        return "成功";
    }
}

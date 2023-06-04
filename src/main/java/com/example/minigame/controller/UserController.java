package com.example.minigame.controller;


import com.example.minigame.base.ResultBase;
import com.example.minigame.dao.User;
import com.example.minigame.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * 用户类请求
 */
@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }
    @PostMapping("/user/getUser")
    public User getUser(User user){
        ResultBase resultBase = new ResultBase();
        User resultUser = userService.getUser(user);
        System.out.println(resultUser);
        return resultUser;
    }
    @RequestMapping("/user/regUser")
    public String regUser(User user){
        ResultBase resultBase = new ResultBase();
        Integer result = userService.regUser(user);
        return "成功";
    }
}

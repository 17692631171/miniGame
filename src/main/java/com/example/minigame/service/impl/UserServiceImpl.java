package com.example.minigame.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.minigame.dao.User;
import com.example.minigame.mapper.UserMapper;
import com.example.minigame.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper){
        this.userMapper = userMapper;
    }

    @Override
    public User getUser(User user) {
        QueryWrapper<User> qw = new QueryWrapper<>();
        qw.eq("username",user.getUsername());
        return userMapper.selectOne(qw);
    }

    @Override
    public Integer regUser(User user) {
        return null;
    }
}

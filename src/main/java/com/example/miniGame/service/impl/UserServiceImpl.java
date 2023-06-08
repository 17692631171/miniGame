package com.example.miniGame.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.miniGame.entity.User;
import com.example.miniGame.mapper.UserMapper;
import com.example.miniGame.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author zhangyu
 * 用户注册相关实现
 */
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

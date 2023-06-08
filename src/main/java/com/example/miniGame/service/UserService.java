package com.example.miniGame.service;

import com.example.miniGame.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    /**
     * 获取用户信息
     * @param user 用户实体类的某些属性
     * @return 该用户信息
     */
    User getUser(User user);

    /**
     * 注册用户
     * @param user 用户信息
     * @return 注册成功数
     */
    Integer regUser(User user);
}

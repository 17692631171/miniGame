package com.example.miniGame.service;

import com.example.miniGame.dao.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User getUser(User user);
    Integer regUser(User user);
}

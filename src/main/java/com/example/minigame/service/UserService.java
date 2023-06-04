package com.example.minigame.service;

import com.example.minigame.dao.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User getUser(User user);
    Integer regUser(User user);
}

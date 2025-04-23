package com.vishal.springmvc.repository;

import com.vishal.springmvc.model.User;

public interface UserRepository {
    void save(User user);
    User findByUsernameAndPassword(String username, String password);

    boolean existsByUsername(String username);
}

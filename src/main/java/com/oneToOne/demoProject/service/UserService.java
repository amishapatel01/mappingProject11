package com.oneToOne.demoProject.service;

import com.oneToOne.demoProject.entity.UserEntity;

public interface UserService {
    UserEntity createUser(UserEntity user);
    UserEntity getUserById(Long id);
    void deleteUser(Long id);
}

package com.dengwenjin.resume.service;

import com.dengwenjin.resume.pojo.User;

import java.util.List;

public interface UserService {
    List<User> getUserList(User user);
    void addUserList(User user);

}

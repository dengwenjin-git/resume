package com.dengwenjin.resume.service.impl;

import com.dengwenjin.resume.dao.UserDao;
import com.dengwenjin.resume.pojo.User;
import com.dengwenjin.resume.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author dj
 * @Description 〈〉
 * @create 2020/4/13 0013 1:19
 * @since
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public List<User> getUserList(User user) {
        return userDao.getUserList(user);
    }

    @Override
    public void addUserList(User user) {
        userDao.addUserList(user);
    }


}
package com.dengwenjin.resume.dao;

import com.dengwenjin.resume.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author
 * @Description 〈〉
 * @create 2020/4/13 0013 0:32
 * @since
 */
@Mapper
public interface UserDao {
    List<User> getUserList(User user) ;
    void addUserList(User user);
}
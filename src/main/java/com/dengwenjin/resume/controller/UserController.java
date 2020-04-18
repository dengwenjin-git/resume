package com.dengwenjin.resume.controller;

import com.dengwenjin.resume.pojo.User;
import com.dengwenjin.resume.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author dj
 * @Description 〈〉
 * @create 2020/4/13 0013 1:47
 * @since
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("user")
    @ResponseBody()
    public String userList(User user){
        userService.getUserList(user);
        System.out.println(userService.getUserList(user));
        return "";
    }

    @RequestMapping("add")
    public String addUser(User user, Model model){
        System.out.println(user);
        try{
            userService.addUserList(user);
            model.addAttribute("message","提交成功");
        }catch (Exception e){
            model.addAttribute("message","提交失败");
            return "contact";
        }
        return "contact";
    }

}
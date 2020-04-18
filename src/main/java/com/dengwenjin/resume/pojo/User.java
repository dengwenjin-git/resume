package com.dengwenjin.resume.pojo;

import lombok.Data;

/**
 * @author dj
 * @Description 〈谁给我发的消息〉
 * @create 2020/4/13 0013 0:27
 * @since 1.0
 */
@Data
public class User {
    private Integer id;
    private String name; //用户名
    private String email; //邮箱
    private String phone; //电话
    private String matter; //事件

}
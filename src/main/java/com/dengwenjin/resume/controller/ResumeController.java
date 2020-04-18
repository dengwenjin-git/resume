package com.dengwenjin.resume.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author dj
 * @date 2019/7/31 0031 16:56
 */
@Controller
public class ResumeController {
    @RequestMapping("index")
    public String index(){
        return "index";
    }

    @RequestMapping("about")
    public String about(){
        return "about";
    }

    @RequestMapping("contact")
    public String contact(){
        return "contact";
    }

    @RequestMapping("education")
    public String education(){
        return "education";
    }

    @RequestMapping("experience")
    public String experience(){
        return "experience";
    }

    @RequestMapping("portfolio")
    public String portfolio(){
        return "portfolio";
    }

    @RequestMapping("skills")
    public String skills(){
        return "skills";
    }

    @RequestMapping("picture")
    public String picture(){
        return "picture";
    }

}

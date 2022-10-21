package com.example.hrms.controller;

import com.example.hrms.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeComtroller {
    @Autowired
    private AccountService accountService;

    @GetMapping("/")
    public String indexpage(HttpServletRequest request){
        return "login";
    }
    @GetMapping("/login")
    public String loginpage(HttpServletRequest request){
        if (request.getSession().getAttribute("user")!=null){
            return "home";
        }
        return "login";
    }
    @GetMapping("/home")
    public String home(){
        return "home";
    }
    @PostMapping("/register")
    @ResponseBody
    public String register(){
        return "register";
    }
    @PostMapping("/login")
    public String Login(String username, String password, HttpServletRequest request){
        boolean result= accountService.login(username,password);
        if (result){
            request.getSession().setAttribute("user",username);
            return "redirect:home";
        }else {
            System.out.println("账号或者密码错误");
            request.setAttribute("msg","账号或者密码错误");
            return "redirect:login";
        }
    }

}

package com.protry.shiro.controller;

import com.protry.shiro.entity.SysUserPo;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @PostMapping("login")
    public String login(String username, String password, String vCode, Boolean rememberMe) {
        System.out.println(username);
        UsernamePasswordToken token = new UsernamePasswordToken(username, password,rememberMe);
        SecurityUtils.getSubject().login(token);

        return "loginSuccess";
    }

    @GetMapping("index")
    public String home() {
        Subject subject = SecurityUtils.getSubject();
        SysUserPo sysUserPo = (SysUserPo)subject.getPrincipal();

        return "home";
    }
}

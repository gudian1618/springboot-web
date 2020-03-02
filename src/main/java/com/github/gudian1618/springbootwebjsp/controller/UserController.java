package com.github.gudian1618.springbootwebjsp.controller;

import com.github.gudian1618.springbootwebjsp.pojo.User;
import com.github.gudian1618.springbootwebjsp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2020/2/29 10:02 下午
 */

// 需要跳转页面
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    // 用户通过localhost:8091/findAll获取用户数
    @RequestMapping("/findAll")
    public String findAll(Model model) {
        List<User> userList = userService.findAll();
        // model底层将数据保存到了request域中
        model.addAttribute("userList", userList);
        // 逻辑名称
        return "userList";
    }

}

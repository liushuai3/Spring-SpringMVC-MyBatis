package cn.lcools.demo.controller;

import cn.lcools.demo.bean.User;
import cn.lcools.demo.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Copyright: Copyright (c) 2019 Asiainfo-Linkage
 *
 * @ClassName: UserController
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: liushuai3
 * @date: 2019/8/22 15:40
 * *****
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2019/8/22     liushuai3           v1.0.0               修改原因
 */

@Controller
@RequestMapping("/user")
public class UserController {

    private static Logger log=LoggerFactory.getLogger(UserController.class);

    @Resource
    private IUserService userService;

    @RequestMapping(value="/test",method=RequestMethod.GET)
    public String test(HttpServletRequest request,Model model){

        int userId = Integer.parseInt(request.getParameter("id"));

        System.out.println("userId:"+userId);

        User user=null;

        if (userId==1) {

            user = new User();

            user.setAge(11);

            user.setId(1);

            user.setPassword("123");

            user.setUserName("javen");

        }
        log.debug(user.toString());
        model.addAttribute("user", user);
        return "index";
    }

    @RequestMapping(value="/showUser",method=RequestMethod.GET)
    public String toIndex(HttpServletRequest request,Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = this.userService.getUserById(userId);
        model.addAttribute("user", user);
        return "showUser";
    }
}
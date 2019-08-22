package cn.lcools.demo.controller;

import cn.lcools.demo.bean.User;
import cn.lcools.demo.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Copyright: Copyright (c) 2019 Asiainfo-Linkage
 *
 * @ClassName: IndexController
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: liushuai3
 * @date: 2019/8/22 16:43
 * *****
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2019/8/22     liushuai3           v1.0.0               修改原因
 */
@Controller
@RequestMapping("/")
public class IndexController {
    @Resource
    private IUserService userService;

    @RequestMapping(method= RequestMethod.GET)
    public String toIndex(HttpServletRequest request, Model model){
        //int userId = Integer.parseInt(request.getParameter("id"));
        User user = this.userService.getUserById(1);
        model.addAttribute("user", user);
        return "showUser";
    }

}

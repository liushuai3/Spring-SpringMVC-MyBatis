package cn.lcools.demo.service;

/**
 * Copyright: Copyright (c) 2019 Asiainfo-Linkage
 *
 * @ClassName: UserServiceImpl
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: liushuai3
 * @date: 2019/8/22 16:05
 * *****
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2019/8/22     liushuai3           v1.0.0               修改原因
 */


import cn.lcools.demo.bean.User;
import cn.lcools.demo.dao.IUserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;

    @Override
    public User getUserById(int userId) {
        return this.userDao.selectByPrimaryKey(userId);
    }

}

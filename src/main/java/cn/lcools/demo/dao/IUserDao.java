package cn.lcools.demo.dao;

import cn.lcools.demo.bean.User;

/**
 * Copyright: Copyright (c) 2019 Asiainfo-Linkage
 *
 * @ClassName: IUserDao
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: liushuai3
 * @date: 2019/8/22 16:06
 * *****
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2019/8/22     liushuai3           v1.0.0               修改原因
 */
public interface IUserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}

package cn.lcools.demo.service;

import cn.lcools.demo.bean.User;
import org.springframework.stereotype.Service;

/**
 * Copyright: Copyright (c) 2019 Asiainfo-Linkage
 *
 * @ClassName: IUserService
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
@Service
public interface IUserService {
    User getUserById(int userId);
}

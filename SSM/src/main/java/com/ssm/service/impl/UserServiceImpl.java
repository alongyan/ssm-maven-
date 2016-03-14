package com.ssm.service.impl;

import com.ssm.dao.UserTMapper;
import com.ssm.pojo.UserT;
import com.ssm.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by jack on 16-3-11.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private UserTMapper userDao;

    public UserT getUserById(int userId) {

        return this.userDao.selectByPrimaryKey(userId);
    }
}

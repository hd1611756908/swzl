package com.swzl.service;

import com.swzl.entity.User;
import com.swzl.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Auther: hushuang
 * @Date: 2019/2/14 11:26
 * @Description:
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Transactional
    public User queryUserByOpenId(String openid){
        return userMapper.queryUserByOpenId(openid);
    }

    @Transactional
    public int addUser(User user){
        return userMapper.addUser(user);
    }
}

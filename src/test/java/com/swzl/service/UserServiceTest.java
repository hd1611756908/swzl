package com.swzl.service;

import com.swzl.SwzlApplicationTests;
import com.swzl.entity.User;
import com.swzl.mapper.UserMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * @Auther: hushuang
 * @Date: 2019/2/16 19:25
 * @Description:
 */
public class UserServiceTest extends SwzlApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void queryUserByOpenId() {

        User user = userMapper.queryUserByOpenId("o3Okb5LPzUZhCjVp-Stw-o2EBu34");
        System.out.println(user);

    }
}
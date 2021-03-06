package com.swzl.mapper;

import com.swzl.SwzlApplicationTests;
import com.swzl.entity.User;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * @Auther: hushuang
 * @Date: 2019/1/31 22:13
 * @Description:
 */
public class UserMapperTest extends SwzlApplicationTests {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserMapperTest.class);

    @Autowired
    private UserMapper userMapper;

    @Test
    public void queryUserById() {

        User user = userMapper.queryUserById(1000);
        LOGGER.info("user = {}",user);

    }

    @Test
    public void queryUserByOpenId() {

        User user = userMapper.queryUserByOpenId("100dsadasdasdas01");
        LOGGER.info("user = {}",user);

    }

    @Test
    public void addUser(){

        User user = new User();

        user.setName("李雷");
        user.setGender(1);
        user.setOpenId("d=dsad=sadas");
        int row = userMapper.addUser(user);
        System.out.println(row);
    }

}
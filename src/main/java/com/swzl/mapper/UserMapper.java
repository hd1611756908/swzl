package com.swzl.mapper;

import com.swzl.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @Auther: hushuang
 * @Date: 2019/1/31 22:13
 * @Description:
 */
@Mapper
@Component
public interface UserMapper {

    /**
     * 通过用户ID查询用户详情
     * @param userId
     * @return
     */
    User queryUserById(Integer userId);
}

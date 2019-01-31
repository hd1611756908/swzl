package com.swzl.mapper;

import com.swzl.entity.ItemType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Auther: hushuang
 * @Date: 2019/1/31 15:31
 * @Description:
 */
@Mapper
@Component
public interface ItemTypeMapper {

    /**
     * 获取列表
     * @return
     */
    List<ItemType> queryItemTypelist();

    /**
     * 通过名字获取详情
     * @param name
     * @return
     */
    ItemType queryItemTypeByName(String name);

    /**
     * 通过id查询类型
     * @param typeId
     * @return
     */
    ItemType queryItemById(Integer typeId);

}

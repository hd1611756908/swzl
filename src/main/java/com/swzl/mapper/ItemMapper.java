package com.swzl.mapper;

import com.swzl.entity.Item;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Auther: hushuang
 * @Date: 2019/1/31 19:41
 * @Description:
 */
@Mapper
@Component
public interface ItemMapper {

    /**
     * 添加项目
     * @param item
     * @return
     */
    int addItem(Item item);

    /**
     * 更新Item
     * @param item
     * @return
     */
    int updateItem(Item item);

    /**
     * 根据itemid删除项目
     * @param itemId
     * @return
     */
    int deleteItem(Integer itemId);


    /**
     * 获取项目列表
     * @param userId
     * @return
     */
    List<Item> queryItemList(@Param("userId") Integer userId);

    /**
     * 根据typeID获取项目列表
     * @param typeId
     * @return
     */
    List<Item> queryItemListByTypeId(@Param("typeId") Integer typeId);


    /**
     * 根据项目ID获取项目详情
     * @param itemId
     * @return
     */
    Item queryItemByItemId(Integer itemId);

}

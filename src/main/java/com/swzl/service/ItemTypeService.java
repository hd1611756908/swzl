package com.swzl.service;

import com.swzl.entity.ItemType;
import com.swzl.mapper.ItemTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther: hushuang
 * @Date: 2019/1/31 16:13
 * @Description:
 */
@Service
public class ItemTypeService {

    @Autowired
    private ItemTypeMapper itemTypeMapper;

    /**
     * 获取列表
     * @return
     */
    @Transactional
    public List<ItemType> queryItemTypelist(){
        return itemTypeMapper.queryItemTypelist();
    }

    /**
     * 通过名字获取详情
     * @param name
     * @return
     */
    @Transactional
    public ItemType queryItemTypeByName(String name){
        return itemTypeMapper.queryItemTypeByName(name);
    }

}

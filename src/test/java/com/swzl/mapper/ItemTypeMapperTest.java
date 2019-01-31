package com.swzl.mapper;

import com.swzl.SwzlApplicationTests;
import com.swzl.entity.ItemType;
import com.swzl.enums.ItemTypeEnums;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Auther: hushuang
 * @Date: 2019/1/31 15:39
 * @Description:
 */
public class ItemTypeMapperTest extends SwzlApplicationTests {

    private static final Logger LOGGER = LoggerFactory.getLogger(ItemTypeMapperTest.class);


    @Autowired
    private ItemTypeMapper itemTypeMapper;

    @Test
    public void queryItemTypelist() {
        List<ItemType> itemTypes = itemTypeMapper.queryItemTypelist();
        LOGGER.info("itemTypes={}",itemTypes);
    }

    @Test
    public void queryItemTypeByName() {
        ItemType itemType = itemTypeMapper.queryItemTypeByName(ItemTypeEnums.XCQS.getMssage());
        LOGGER.info("itemType={}",itemType);
    }
}
package com.swzl.service;

import com.swzl.SwzlApplicationTests;
import com.swzl.entity.ItemType;
import com.swzl.mapper.ItemTypeMapper;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Auther: hushuang
 * @Date: 2019/1/31 16:14
 * @Description:
 */
public class ItemTypeServiceTest extends SwzlApplicationTests {

    private static final Logger LOGGER = LoggerFactory.getLogger(ItemTypeServiceTest.class);

    @Autowired
    private ItemTypeService itemTypeService;

    @Test
    public void queryItemTypelist() {
        List<ItemType> itemTypes = itemTypeService.queryItemTypelist();
        LOGGER.info("itemTypes = {}",itemTypes);
    }

    @Test
    public void queryItemTypeByName() {
        ItemType itemType = itemTypeService.queryItemTypeByName("寻人启事");
        LOGGER.info("itemType = {}",itemType);
    }
}
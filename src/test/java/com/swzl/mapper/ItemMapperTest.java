package com.swzl.mapper;

import com.swzl.SwzlApplicationTests;
import com.swzl.entity.Item;
import com.swzl.entity.ItemType;
import com.swzl.entity.User;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Auther: hushuang
 * @Date: 2019/1/31 19:45
 * @Description:
 */
public class ItemMapperTest extends SwzlApplicationTests {

    private static final Logger LOGGER = LoggerFactory.getLogger(ItemMapperTest.class);

    @Autowired
    private ItemMapper itemMapper;

    @Test
    public void addItem() {

        Item item = new Item();
        ItemType itemType = new ItemType();
        itemType.setId(1000);
        item.setItemType(itemType);
        User user = new User();
        user.setId(1000);
        item.setUser(user);
        item.setProvider("发布人测试1");
        item.setTitle("标题测试1");
        item.setCategory("手机测试1");
        item.setProvince("[黑龙江省,哈尔滨市,南岗区]");
        item.setAddress("详细地址测试1");
        item.setCreatetime(new Date());
        item.setLoseTime("2019-01-01");
        item.setDetaildesc("详细描述测试1");
        item.setImg1("测试图片1");
        item.setImg2("测试图片2");
        item.setImg3("测试图片3");

        int row = itemMapper.addItem(item);
        LOGGER.info("row = {}",row);
    }

    @Test
    public void updateItem() {

        Item item = new Item();
        item.setItemId(1001);
        ItemType itemType = new ItemType();
        itemType.setId(1000);
        item.setItemType(itemType);
        User user = new User();
        user.setId(1000);
        item.setUser(user);
        item.setProvider("发布人测试2");
        item.setTitle("标题测试2");
        item.setCategory("手机测试2");
        item.setProvince("[黑龙江省,哈尔滨市,南岗区1]");
        item.setAddress("详细地址测试2");
        item.setCreatetime(new Date());
        item.setLoseTime("2019-01-02");
        item.setDetaildesc("详细描述测试2");
        item.setImg1("测试图片2");
        item.setImg2("测试图片3");
        item.setImg3("测试图片4");

        int row = itemMapper.updateItem(item);

        LOGGER.info("row = {}",row);
    }

    @Test
    public void deleteItem() {
        int row = itemMapper.deleteItem(1001);
        LOGGER.info("row = {}",row);
    }

    @Test
    public void queryItemList() {
        List<Item> items = itemMapper.queryItemList();
        LOGGER.info("items = {}",items);
    }

    @Test
    public void queryItemByItemId() {
        Item item = itemMapper.queryItemByItemId(1001);
        LOGGER.info("item = {}",item);
    }
}
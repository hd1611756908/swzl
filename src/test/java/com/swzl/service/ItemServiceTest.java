package com.swzl.service;

import com.swzl.SwzlApplicationTests;
import com.swzl.dto.ItemPage;
import com.swzl.entity.Item;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Auther: hushuang
 * @Date: 2019/2/14 16:18
 * @Description:
 */
public class ItemServiceTest extends SwzlApplicationTests {

    @Autowired
    private ItemService itemService;

    @Test
    public void queryItemListByTypeId() {
        ItemPage itemPage = itemService.queryItemListByTypeId(1, 2,1001);
        List<Item> items = itemPage.getItems();
        for (Item item : items) {
            System.out.println(item);
        }

    }
}
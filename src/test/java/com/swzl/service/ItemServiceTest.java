package com.swzl.service;

import com.swzl.SwzlApplicationTests;
import com.swzl.dto.ItemPage;
import com.swzl.dto.ItemResult;
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
        List<ItemResult> items = itemPage.getItems();
        for (ItemResult item : items) {
            System.out.println(item);
        }

    }

    @Test
    public void queryItemList(){
        List<ItemResult> itemResults = itemService.queryItemList(1000);
        for (ItemResult itemResult : itemResults) {
            System.out.println(itemResult);
        }
    }
}
package com.swzl.service;

import com.swzl.SwzlApplicationTests;
import com.swzl.dto.Page;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * @Auther: hushuang
 * @Date: 2019/2/14 16:18
 * @Description:
 */
public class ItemServiceTest extends SwzlApplicationTests {

    @Autowired
    private ItemService itemService;

    @Test
    public void queryItemList_() {
        Page page = itemService.queryItemList_(1, 4);
        System.out.println(page);
    }
}
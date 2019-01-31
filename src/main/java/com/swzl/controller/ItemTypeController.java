package com.swzl.controller;

import com.swzl.entity.ItemType;
import com.swzl.service.ItemTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: hushuang
 * @Date: 2019/1/31 19:28
 * @Description:
 */
@RestController
public class ItemTypeController {

    @Autowired
    private ItemTypeService itemTypeService;

    @GetMapping(value = "/queryItemTypelist")
    public List<ItemType> queryItemTypelist(){
        return itemTypeService.queryItemTypelist();
    }


}

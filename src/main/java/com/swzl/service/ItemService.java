package com.swzl.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.swzl.dto.ItemPage;
import com.swzl.entity.Item;
import com.swzl.mapper.ItemMapper;
import com.swzl.mapper.ItemTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther: hushuang
 * @Date: 2019/2/14 10:29
 * @Description:
 */
@Service
public class ItemService {

    @Autowired
    private ItemMapper itemMapper;
    @Autowired
    private ItemTypeMapper itemTypeMapper;

    @Transactional
    public int addItem(Item item){
        int row = itemMapper.addItem(item);
        return row;
    }

    @Transactional
    public ItemPage queryItemListByTypeId(int pageNo, int pageSize,int typeId){
        ItemPage page = new ItemPage();

        PageHelper.startPage(pageNo,pageSize);
        List<Item> items = itemMapper.queryItemListByTypeId(typeId);
        PageInfo pageInfo = new PageInfo(items);
        page.setHasnext(pageInfo.isHasNextPage());
        page.setPageno(pageInfo.getPageNum());
        page.setPagesize(pageInfo.getPageSize());
        page.setItems(pageInfo.getList());

        return page;
    }

}

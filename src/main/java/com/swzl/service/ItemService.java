package com.swzl.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.swzl.dto.ItemPage;
import com.swzl.dto.Page;
import com.swzl.entity.Item;
import com.swzl.entity.ItemType;
import com.swzl.enums.ItemTypeEnums;
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
    public Page queryItemList_(int pageNo,int pageSize){
        Page page = new Page();

        //寻物启事
        ItemPage itemPagexw = new ItemPage();
        ItemType itemTypexw = itemTypeMapper.queryItemTypeByName(ItemTypeEnums.XWQS.getMssage());

        PageHelper.startPage(pageNo,pageSize);
        List<Item> itemsxw = itemMapper.queryItemListByTypeId(itemTypexw.getId());

        PageInfo pageInfoxw = new PageInfo(itemsxw);
        itemPagexw.setHasnext(pageInfoxw.isHasNextPage());
        itemPagexw.setPageno(pageInfoxw.getPageNum());
        itemPagexw.setPagesize(pageInfoxw.getPageSize());
        itemPagexw.setItems(pageInfoxw.getList());
        page.setXw(itemPagexw);

        //寻人启事
        ItemPage itemPagexr = new ItemPage();
        ItemType itemTypexr = itemTypeMapper.queryItemTypeByName(ItemTypeEnums.XRQS.getMssage());

        PageHelper.startPage(pageNo,pageSize);
        List<Item> itemsxr = itemMapper.queryItemListByTypeId(itemTypexr.getId());

        PageInfo pageInfoxr = new PageInfo(itemsxr);
        itemPagexr.setHasnext(pageInfoxr.isHasNextPage());
        itemPagexr.setPageno(pageInfoxr.getPageNum());
        itemPagexr.setPagesize(pageInfoxr.getPageSize());
        itemPagexr.setItems(pageInfoxr.getList());
        page.setXr(itemPagexr);

        //寻宠启事
        ItemPage itemPagexc = new ItemPage();
        ItemType itemTypexc = itemTypeMapper.queryItemTypeByName(ItemTypeEnums.XCQS.getMssage());
        System.out.println(itemTypexc);
        PageHelper.startPage(pageNo,pageSize);
        List<Item> itemsxc = itemMapper.queryItemListByTypeId(itemTypexc.getId());

        PageInfo pageInfoxc = new PageInfo(itemsxc);
        itemPagexc.setHasnext(pageInfoxc.isHasNextPage());
        itemPagexc.setPageno(pageInfoxc.getPageNum());
        itemPagexc.setPagesize(pageInfoxc.getPageSize());
        itemPagexc.setItems(pageInfoxc.getList());
        page.setXc(itemPagexc);

        //失物招领
        ItemPage itemPagesz = new ItemPage();
        ItemType itemTypesz = itemTypeMapper.queryItemTypeByName(ItemTypeEnums.SWZL.getMssage());

        PageHelper.startPage(pageNo,pageSize);
        List<Item> itemssz = itemMapper.queryItemListByTypeId(itemTypesz.getId());

        PageInfo pageInfosz = new PageInfo(itemssz);
        itemPagesz.setHasnext(pageInfosz.isHasNextPage());
        itemPagesz.setPageno(pageInfosz.getPageNum());
        itemPagesz.setPagesize(pageInfosz.getPageSize());
        itemPagesz.setItems(pageInfosz.getList());
        page.setSz(itemPagesz);

        return page;
    }

}

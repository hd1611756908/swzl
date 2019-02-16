package com.swzl.service;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.swzl.dto.ItemPage;
import com.swzl.dto.ItemResult;
import com.swzl.entity.Item;
import com.swzl.mapper.ItemMapper;
import com.swzl.mapper.ItemTypeMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
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

    @Transactional
    public int addItem(Item item){
        int row = itemMapper.addItem(item);
        return row;
    }

    @Transactional
    public int updateItem(Item item){
        int row = itemMapper.updateItem(item);
        return row;
    }


    @Transactional
    public int deleteItem(Integer itemId){
        return itemMapper.deleteItem(itemId);
    }

    @Transactional
    public List<ItemResult> queryItemList(Integer userId){
        List<ItemResult> itemResults = new ArrayList<>();
        List<Item> items = itemMapper.queryItemList(userId);

        for (Item item : items) {

            ItemResult itemResult = new ItemResult();
            itemResult.setItemId(item.getItemId());
            itemResult.setItemType(item.getItemType());
            itemResult.setUser(item.getUser());
            itemResult.setProvider(item.getProvider());
            itemResult.setTitle(item.getTitle());
            itemResult.setCategory(item.getCategory());
            String province = item.getProvince();

            province = province.substring(1, province.length() - 1);
            String[] split = province.split(",");
            province=split[split.length-2]+"-"+split[split.length-1];

            itemResult.setProvince(province);
            itemResult.setAddress(item.getAddress());
            itemResult.setCreatetime(item.getCreatetime());
            itemResult.setLoseTime(item.getLoseTime());
            itemResult.setDetaildesc(item.getDetaildesc());
            //图片处理
            String img1 = item.getImg1();
            String img2 = item.getImg2();
            String img3 = item.getImg3();

            List<String> imgs = new ArrayList<>();
            if(img1!=null && !"".equals(img1)){
                imgs.add(img1);
            }
            if(img2!=null && !"".equals(img2)){
                imgs.add(img2);
            }
            if(img3!=null && !"".equals(img3)){
                imgs.add(img3);
            }
            itemResult.setImgs(imgs);
            itemResults.add(itemResult);
        }
        return itemResults;
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
        List<Item> list = pageInfo.getList();

        List<ItemResult> itemResults = new ArrayList<>();

        for (Item item : list) {
            ItemResult itemResult = new ItemResult();
            itemResult.setItemId(item.getItemId());
            itemResult.setItemType(item.getItemType());
            itemResult.setUser(item.getUser());
            itemResult.setProvider(item.getProvider());
            itemResult.setTitle(item.getTitle());
            itemResult.setCategory(item.getCategory());
            String province = item.getProvince();

            province = province.substring(1, province.length() - 1);
            String[] split = province.split(",");
            province=split[split.length-2]+"-"+split[split.length-1];

            itemResult.setProvince(province);
            itemResult.setAddress(item.getAddress());
            itemResult.setCreatetime(item.getCreatetime());
            itemResult.setLoseTime(item.getLoseTime());
            itemResult.setDetaildesc(item.getDetaildesc());
            //图片处理
            String img1 = item.getImg1();
            String img2 = item.getImg2();
            String img3 = item.getImg3();

            List<String> imgs = new ArrayList<>();
            if(img1!=null && !"".equals(img1)){
                imgs.add(img1);
            }
            if(img2!=null && !"".equals(img2)){
                imgs.add(img2);
            }
            if(img3!=null && !"".equals(img3)){
                imgs.add(img3);
            }
            itemResult.setImgs(imgs);
            itemResults.add(itemResult);
        }

        System.out.println(itemResults);
        page.setItems(itemResults);

        return page;
    }

    @Transactional
    public ItemResult queryItemByItemId(Integer itemId){
        ItemResult itemResult = new ItemResult();

        Item item = itemMapper.queryItemByItemId(itemId);

        itemResult.setItemId(item.getItemId());
        itemResult.setItemType(item.getItemType());
        itemResult.setUser(item.getUser());
        itemResult.setProvider(item.getProvider());
        itemResult.setTitle(item.getTitle());
        itemResult.setCategory(item.getCategory());
        String province = item.getProvince();

        province = province.substring(1, province.length() - 1);
        String[] split = province.split(",");
        province=split[split.length-2]+"-"+split[split.length-1];

        itemResult.setProvince(province);
        itemResult.setAddress(item.getAddress());
        itemResult.setCreatetime(item.getCreatetime());
        itemResult.setLoseTime(item.getLoseTime());
        itemResult.setDetaildesc(item.getDetaildesc());
        //图片处理
        String img1 = item.getImg1();
        String img2 = item.getImg2();
        String img3 = item.getImg3();

        List<String> imgs = new ArrayList<>();
        if(img1!=null && !"".equals(img1)){
            imgs.add(img1);
        }
        if(img2!=null && !"".equals(img2)){
            imgs.add(img2);
        }
        if(img3!=null && !"".equals(img3)){
            imgs.add(img3);
        }
        itemResult.setImgs(imgs);

        return itemResult;

    }

    @Transactional
    public ItemResult queryItemByItemId_(Integer itemId){
        ItemResult itemResult = new ItemResult();

        Item item = itemMapper.queryItemByItemId(itemId);

        itemResult.setItemId(item.getItemId());
        itemResult.setItemType(item.getItemType());
        itemResult.setUser(item.getUser());
        itemResult.setProvider(item.getProvider());
        itemResult.setTitle(item.getTitle());
        itemResult.setCategory(item.getCategory());
        String province = item.getProvince();
        itemResult.setProvince(province);
        itemResult.setAddress(item.getAddress());
        itemResult.setCreatetime(item.getCreatetime());
        itemResult.setLoseTime(item.getLoseTime());
        itemResult.setDetaildesc(item.getDetaildesc());
        //图片处理
        String img1 = item.getImg1();
        String img2 = item.getImg2();
        String img3 = item.getImg3();

        List<String> imgs = new ArrayList<>();
        if(img1!=null && !"".equals(img1)){
            imgs.add(img1);
        }
        if(img2!=null && !"".equals(img2)){
            imgs.add(img2);
        }
        if(img3!=null && !"".equals(img3)){
            imgs.add(img3);
        }
        itemResult.setImgs(imgs);

        return itemResult;

    }

}

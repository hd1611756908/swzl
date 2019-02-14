package com.swzl.controller;

import com.swzl.dto.ItemRequest;
import com.swzl.dto.Page;
import com.swzl.entity.Item;
import com.swzl.entity.ItemType;
import com.swzl.entity.User;
import com.swzl.service.ItemService;
import com.swzl.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @Auther: hushuang
 * @Date: 2019/2/14 09:21
 * @Description:
 */
@RestController
public class ItemController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ItemController.class);

    @Autowired
    private ItemService itemService;
    @Autowired
    private UserService userService;


    @PostMapping("/publishItem")
    public String publishItem(@RequestBody ItemRequest request){
        LOGGER.info("request={}",request);
        Item item = new Item();
        //分类ID
        ItemType itemType = new ItemType();
        itemType.setId(request.getItemtypeid());
        item.setItemType(itemType);
        //用户ID
        String openid = request.getOpenid();
        User user = userService.queryUserByOpenId(openid);
        item.setUser(user);
        //发布人
        item.setProvider(request.getUsername());
        //标题
        item.setTitle(request.getTitle());
        //分类
        item.setCategory(request.getCategory());
        //省市区
        item.setProvince(request.getProvince()+"");
        //详细地址
        item.setAddress(request.getAddress());
        item.setCreatetime(new Date());
        //丢失时间
        item.setLoseTime(request.getLosetime());
        //详情描述
        item.setDetaildesc(request.getDetaildesc());
        //图片
        List<String> imgs = request.getImglist();
        if(imgs!=null && imgs.size()==1){
            item.setImg1(imgs.get(0));
        }
        if(imgs!=null && imgs.size()==2){
            item.setImg1(imgs.get(0));
            item.setImg2(imgs.get(1));
        }
        if(imgs!=null && imgs.size()==3){
            item.setImg1(imgs.get(0));
            item.setImg2(imgs.get(1));
            item.setImg3(imgs.get(2));
        }

        int row = itemService.addItem(item);
        if(row>0){ //插入成功
            return "ok";
        }else {
            return "defail";
        }
    }


    /**
     * 获取项目列表/或者获取我的项目列表
     * @param pageNo : 当前页
     * @param pageSize : 每页的页容量
     * @param userId : 用户ID
     * @return
     */
    public Page getPageItems(int pageNo,int pageSize,Integer userId){

        return null;
    }


    /**
     * 图片上传
     */
    @PostMapping("/uploadImages")
    public String uploadImages(@RequestParam("file") MultipartFile file, HttpServletRequest request){
        //判断文件是否存在
        if(file.isEmpty()){
            return "false";
        }
        //获取文件名
        String filename = file.getOriginalFilename();
        //获取文件后缀名
        String suffixName = filename.substring(filename.lastIndexOf("."));
        //重新生成文件名
        filename = UUID.randomUUID()+suffixName;
        //设置存储路径
        String path = request.getServletContext().getRealPath("/upload");
        System.out.println(path);
        File file1 = new File(path);
        if(!file1.exists()){
            file1.mkdirs();
        }
        try {
            file.transferTo(new File(path+"/"+filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String imgUrl = "http://localhost:8080/upload/"+filename;

        return imgUrl;
    }
}

package com.swzl.dto;

import com.swzl.entity.ItemType;
import com.swzl.entity.User;

import java.util.Date;
import java.util.List;

/**
 * @Auther: hushuang
 * @Date: 2019/2/14 11:00
 * @Description:
 */
public class ItemRequest {


    private int itemtypeid; //项目类型
    private String openid;  //openid
    private String username;//发布人姓名
    private String title;   //标题
    private String category; //分类
    private List<String> province; //省市区
    private String address;  //详细地点
    private String losetime;  //丢失时间
    private String detaildesc; //详情描述
    private List<String> imgs;   //图片列表
    private List<String> imglist; //http图片

    public ItemRequest() {
    }

    public int getItemtypeid() {
        return itemtypeid;
    }

    public void setItemtypeid(int itemtypeid) {
        this.itemtypeid = itemtypeid;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<String> getProvince() {
        return province;
    }

    public void setProvince(List<String> province) {
        this.province = province;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLosetime() {
        return losetime;
    }

    public void setLosetime(String losetime) {
        this.losetime = losetime;
    }

    public String getDetaildesc() {
        return detaildesc;
    }

    public void setDetaildesc(String detaildesc) {
        this.detaildesc = detaildesc;
    }

    public List<String> getImgs() {
        return imgs;
    }

    public void setImgs(List<String> imgs) {
        this.imgs = imgs;
    }

    public List<String> getImglist() {
        return imglist;
    }

    public void setImglist(List<String> imglist) {
        this.imglist = imglist;
    }

    @Override
    public String toString() {
        return "ItemRequest{" +
                "itemtypeid=" + itemtypeid +
                ", openid='" + openid + '\'' +
                ", username='" + username + '\'' +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", province=" + province +
                ", address='" + address + '\'' +
                ", losetime='" + losetime + '\'' +
                ", detaildesc='" + detaildesc + '\'' +
                ", imgs=" + imgs +
                ", imglist=" + imglist +
                '}';
    }
}

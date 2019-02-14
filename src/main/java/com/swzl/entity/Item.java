package com.swzl.entity;

import java.util.Date;

/**
 * @Auther: hushuang
 * @Date: 2019/1/31 15:29
 * @Description:
 */
public class Item {

    private Integer itemId;
    private ItemType itemType; //项目类型
    private User user; //发布设备用户
    private String provider;//发布人姓名
    private String title; //标题
    private String category; //分类
    private String province; //省市区
    private String address;  //详细地点
    private Date createtime;  //创建时间
    private Date updatetime; //更新时间
    private String loseTime;  //丢失时间
    private String detaildesc; //详情描述
    private String img1;   //图片1
    private String img2;   //图片2
    private String img3;   //图片3

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
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

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getLoseTime() {
        return loseTime;
    }

    public void setLoseTime(String loseTime) {
        this.loseTime = loseTime;
    }

    public String getDetaildesc() {
        return detaildesc;
    }

    public void setDetaildesc(String detaildesc) {
        this.detaildesc = detaildesc;
    }

    public String getImg1() {
        return img1;
    }

    public void setImg1(String img1) {
        this.img1 = img1;
    }

    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }

    public String getImg3() {
        return img3;
    }

    public void setImg3(String img3) {
        this.img3 = img3;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", itemType=" + itemType +
                ", user=" + user +
                ", provider='" + provider + '\'' +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", province='" + province + '\'' +
                ", address='" + address + '\'' +
                ", createtime=" + createtime +
                ", updatetime=" + updatetime +
                ", loseTime='" + loseTime + '\'' +
                ", detaildesc='" + detaildesc + '\'' +
                ", img1='" + img1 + '\'' +
                ", img2='" + img2 + '\'' +
                ", img3='" + img3 + '\'' +
                '}';
    }
}

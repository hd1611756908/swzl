package com.swzl.entity;

import java.util.Date;

/**
 * @Auther: hushuang
 * @Date: 2019/1/31 15:29
 * @Description:
 */
public class Item {

    private Integer itemId;
    private ItemType itemType;
    private User user;
    private String title;
    private String category;
    private String province;
    private String address;
    private Date createtime;
    private String loseTime;
    private String detaildesc;
    private String img1;
    private String img2;
    private String img3;

    public Integer getItemId() {
        return itemId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", province='" + province + '\'' +
                ", address='" + address + '\'' +
                ", createtime=" + createtime +
                ", loseTime='" + loseTime + '\'' +
                ", detaildesc='" + detaildesc + '\'' +
                ", img1='" + img1 + '\'' +
                ", img2='" + img2 + '\'' +
                ", img3='" + img3 + '\'' +
                '}';
    }
}

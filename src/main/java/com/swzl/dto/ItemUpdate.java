package com.swzl.dto;

import com.swzl.entity.ItemType;
import com.swzl.entity.User;

import java.util.Date;
import java.util.List;

/**
 * @Auther: hushuang
 * @Date: 2019/2/16 14:49
 * @Description:
 */
public class ItemUpdate {
    private Integer itemId;
    private ItemType itemType; //项目类型
    private User user; //发布设备用户
    private String provider;//发布人姓名
    private String title; //标题
    private String category; //分类
    private List<String> province; //省市区
    private String address;  //详细地点
    private Date createtime;  //创建时间
    private String loseTime;  //丢失时间
    private String detaildesc; //详情描述
    private List<String> imgs;   //图片

    public ItemUpdate() {
    }

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

    public List<String> getImgs() {
        return imgs;
    }

    public void setImgs(List<String> imgs) {
        this.imgs = imgs;
    }

    @Override
    public String toString() {
        return "ItemUpdate{" +
                "itemId=" + itemId +
                ", itemType=" + itemType +
                ", user=" + user +
                ", provider='" + provider + '\'' +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", province=" + province +
                ", address='" + address + '\'' +
                ", createtime=" + createtime +
                ", loseTime='" + loseTime + '\'' +
                ", detaildesc='" + detaildesc + '\'' +
                ", imgs=" + imgs +
                '}';
    }
}

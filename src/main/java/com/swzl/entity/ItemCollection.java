package com.swzl.entity;

/**
 * @Auther: hushuang
 * @Date: 2019/1/31 16:09
 * @Description:
 */
public class ItemCollection {
    private Integer id;
    private User user;
    private Item item;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "ItemCollection{" +
                "id=" + id +
                ", user=" + user +
                ", item=" + item +
                '}';
    }
}

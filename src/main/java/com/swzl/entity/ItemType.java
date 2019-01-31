package com.swzl.entity;

/**
 * @Auther: hushuang
 * @Date: 2019/1/31 15:28
 * @Description:
 */
public class ItemType {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ItemType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

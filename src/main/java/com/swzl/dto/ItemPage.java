package com.swzl.dto;

import com.swzl.entity.Item;

import java.util.List;

/**
 * @Auther: hushuang
 * @Date: 2019/2/14 09:44
 * @Description:
 */
public class ItemPage {

    private boolean hasnext;
    private Integer pageno;
    private Integer pagesize;
    private List<ItemResult> items;

    public ItemPage() {
    }

    public boolean isHasnext() {
        return hasnext;
    }

    public void setHasnext(boolean hasnext) {
        this.hasnext = hasnext;
    }

    public Integer getPageno() {
        return pageno;
    }

    public void setPageno(Integer pageno) {
        this.pageno = pageno;
    }

    public Integer getPagesize() {
        return pagesize;
    }

    public void setPagesize(Integer pagesize) {
        this.pagesize = pagesize;
    }

    public List<ItemResult> getItems() {
        return items;
    }

    public void setItems(List<ItemResult> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "ItemPage{" +
                "hasnext=" + hasnext +
                ", pageno=" + pageno +
                ", pagesize=" + pagesize +
                ", items=" + items +
                '}';
    }
}

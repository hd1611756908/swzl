package com.swzl.dto;

/**
 * @Auther: hushuang
 * @Date: 2019/2/14 09:22
 * @Description:
 */
public class Page {

    private ItemPage xw;//寻物启事
    private ItemPage xr;//寻人启事
    private ItemPage xc;//寻宠启事
    private ItemPage sz;//失物招领

    public Page() {
    }

    public ItemPage getXw() {
        return xw;
    }

    public void setXw(ItemPage xw) {
        this.xw = xw;
    }

    public ItemPage getXr() {
        return xr;
    }

    public void setXr(ItemPage xr) {
        this.xr = xr;
    }

    public ItemPage getXc() {
        return xc;
    }

    public void setXc(ItemPage xc) {
        this.xc = xc;
    }

    public ItemPage getSz() {
        return sz;
    }

    public void setSz(ItemPage sz) {
        this.sz = sz;
    }

    @Override
    public String toString() {
        return "Page{" +
                "xw=" + xw +
                ", xr=" + xr +
                ", xc=" + xc +
                ", sz=" + sz +
                '}';
    }
}

package com.swzl.enums;

/**
 * @Auther: hushuang
 * @Date: 2019/1/31 15:42
 * @Description:
 */
public enum ItemTypeEnums {

    XWQS("寻物启事"),
    XRQS("寻人启事"),
    XCQS("寻宠启事"),
    SWZL("失物招领"),
    ;
    private String mssage;

    ItemTypeEnums(String mssage) {
        this.mssage = mssage;
    }

    public String getMssage() {
        return mssage;
    }

    public void setMssage(String mssage) {
        this.mssage = mssage;
    }
}

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFDateTime
 */
package nc.vo.arap.goldentax;

import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDateTime;

public class GoldTaxFormatVO
extends SuperVO {
    private static final long serialVersionUID = 1L;
    private String pk_org;
    private String name;
    private String code;
    private boolean isSelected;
    private boolean isHead;
    private Integer showOrder;
    private String pk_goldtaxformat;
    private UFDateTime ts;

    public GoldTaxFormatVO() {
    }

    public GoldTaxFormatVO(String code, String name, boolean isSelected, boolean isHead, Integer index) {
        this.code = code;
        this.name = name;
        this.isSelected = isSelected;
        this.isHead = isHead;
        this.showOrder = index;
    }

    public String getCode() {
        return this.code;
    }

    public boolean getIsHead() {
        return this.isHead;
    }

    public boolean getIsSelected() {
        return this.isSelected;
    }

    public String getName() {
        return this.name;
    }

    public String getPk_goldtaxformat() {
        return this.pk_goldtaxformat;
    }

    public String getPk_org() {
        return this.pk_org;
    }

    public String getPKFieldName() {
        return "pk_goldtaxformat";
    }

    public String getPrimaryKey() {
        return this.getPk_goldtaxformat();
    }

    public Integer getShowOrder() {
        return this.showOrder;
    }

    public String getTableName() {
        return "arap_goldtaxfomat";
    }

    public UFDateTime getTs() {
        return this.ts;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setIsHead(boolean isHead) {
        this.isHead = isHead;
    }

    public void setIsSelected(boolean isDefault) {
        this.isSelected = isDefault;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPk_goldtaxformat(String pk_goldtaxformat) {
        this.pk_goldtaxformat = pk_goldtaxformat;
    }

    public void setPk_org(String pk_org) {
        this.pk_org = pk_org;
    }

    public void setShowOrder(Integer index) {
        this.showOrder = index;
    }

    public void setTs(UFDateTime ts) {
        this.ts = ts;
    }

    public String toString() {
        return this.getName();
    }
}


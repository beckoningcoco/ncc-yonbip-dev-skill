/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.vo.productTpl.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.ext.UPCPager;
import java.util.Date;
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductTplQueryVO
extends UPCPager {
    public Long id;
    public String name;
    public List<Long> idList;
    public List<String> nameList;
    public Date beginTime;
    public Date pubts;
    public Date endTime;

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public List<Long> getIdList() {
        return this.idList;
    }

    public List<String> getNameList() {
        return this.nameList;
    }

    public Date getBeginTime() {
        return this.beginTime;
    }

    public Date getPubts() {
        return this.pubts;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdList(List<Long> idList) {
        this.idList = idList;
    }

    public void setNameList(List<String> nameList) {
        this.nameList = nameList;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public void setPubts(Date pubts) {
        this.pubts = pubts;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductTplQueryVO)) {
            return false;
        }
        ProductTplQueryVO other = (ProductTplQueryVO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        List<Long> this$idList = this.getIdList();
        List<Long> other$idList = other.getIdList();
        if (this$idList == null ? other$idList != null : !((Object)this$idList).equals(other$idList)) {
            return false;
        }
        List<String> this$nameList = this.getNameList();
        List<String> other$nameList = other.getNameList();
        if (this$nameList == null ? other$nameList != null : !((Object)this$nameList).equals(other$nameList)) {
            return false;
        }
        Date this$beginTime = this.getBeginTime();
        Date other$beginTime = other.getBeginTime();
        if (this$beginTime == null ? other$beginTime != null : !((Object)this$beginTime).equals(other$beginTime)) {
            return false;
        }
        Date this$pubts = this.getPubts();
        Date other$pubts = other.getPubts();
        if (this$pubts == null ? other$pubts != null : !((Object)this$pubts).equals(other$pubts)) {
            return false;
        }
        Date this$endTime = this.getEndTime();
        Date other$endTime = other.getEndTime();
        return !(this$endTime == null ? other$endTime != null : !((Object)this$endTime).equals(other$endTime));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof ProductTplQueryVO;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        List<Long> $idList = this.getIdList();
        result = result * 59 + ($idList == null ? 43 : ((Object)$idList).hashCode());
        List<String> $nameList = this.getNameList();
        result = result * 59 + ($nameList == null ? 43 : ((Object)$nameList).hashCode());
        Date $beginTime = this.getBeginTime();
        result = result * 59 + ($beginTime == null ? 43 : ((Object)$beginTime).hashCode());
        Date $pubts = this.getPubts();
        result = result * 59 + ($pubts == null ? 43 : ((Object)$pubts).hashCode());
        Date $endTime = this.getEndTime();
        result = result * 59 + ($endTime == null ? 43 : ((Object)$endTime).hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "ProductTplQueryVO(id=" + this.getId() + ", name=" + this.getName() + ", idList=" + this.getIdList() + ", nameList=" + this.getNameList() + ", beginTime=" + this.getBeginTime() + ", pubts=" + this.getPubts() + ", endTime=" + this.getEndTime() + ")";
    }
}


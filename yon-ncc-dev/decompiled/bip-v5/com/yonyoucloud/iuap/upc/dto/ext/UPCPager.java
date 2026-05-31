/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto.ext;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class UPCPager<T> {
    public Integer pageIndex;
    public Integer pageSize;
    public Integer pageCount;
    public Integer beginPageIndex;
    public Integer endPageIndex;
    public Integer recordCount;
    public Boolean haveNextPage;
    public List<T> recordList;
    private Boolean needCount = false;

    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public Integer getPageCount() {
        return this.pageCount;
    }

    public Integer getBeginPageIndex() {
        return this.beginPageIndex;
    }

    public Integer getEndPageIndex() {
        return this.endPageIndex;
    }

    public Integer getRecordCount() {
        return this.recordCount;
    }

    public Boolean getHaveNextPage() {
        return this.haveNextPage;
    }

    public List<T> getRecordList() {
        return this.recordList;
    }

    public Boolean getNeedCount() {
        return this.needCount;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public void setBeginPageIndex(Integer beginPageIndex) {
        this.beginPageIndex = beginPageIndex;
    }

    public void setEndPageIndex(Integer endPageIndex) {
        this.endPageIndex = endPageIndex;
    }

    public void setRecordCount(Integer recordCount) {
        this.recordCount = recordCount;
    }

    public void setHaveNextPage(Boolean haveNextPage) {
        this.haveNextPage = haveNextPage;
    }

    public void setRecordList(List<T> recordList) {
        this.recordList = recordList;
    }

    public void setNeedCount(Boolean needCount) {
        this.needCount = needCount;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof UPCPager)) {
            return false;
        }
        UPCPager other = (UPCPager)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$pageIndex = this.getPageIndex();
        Integer other$pageIndex = other.getPageIndex();
        if (this$pageIndex == null ? other$pageIndex != null : !((Object)this$pageIndex).equals(other$pageIndex)) {
            return false;
        }
        Integer this$pageSize = this.getPageSize();
        Integer other$pageSize = other.getPageSize();
        if (this$pageSize == null ? other$pageSize != null : !((Object)this$pageSize).equals(other$pageSize)) {
            return false;
        }
        Integer this$pageCount = this.getPageCount();
        Integer other$pageCount = other.getPageCount();
        if (this$pageCount == null ? other$pageCount != null : !((Object)this$pageCount).equals(other$pageCount)) {
            return false;
        }
        Integer this$beginPageIndex = this.getBeginPageIndex();
        Integer other$beginPageIndex = other.getBeginPageIndex();
        if (this$beginPageIndex == null ? other$beginPageIndex != null : !((Object)this$beginPageIndex).equals(other$beginPageIndex)) {
            return false;
        }
        Integer this$endPageIndex = this.getEndPageIndex();
        Integer other$endPageIndex = other.getEndPageIndex();
        if (this$endPageIndex == null ? other$endPageIndex != null : !((Object)this$endPageIndex).equals(other$endPageIndex)) {
            return false;
        }
        Integer this$recordCount = this.getRecordCount();
        Integer other$recordCount = other.getRecordCount();
        if (this$recordCount == null ? other$recordCount != null : !((Object)this$recordCount).equals(other$recordCount)) {
            return false;
        }
        Boolean this$haveNextPage = this.getHaveNextPage();
        Boolean other$haveNextPage = other.getHaveNextPage();
        if (this$haveNextPage == null ? other$haveNextPage != null : !((Object)this$haveNextPage).equals(other$haveNextPage)) {
            return false;
        }
        Boolean this$needCount = this.getNeedCount();
        Boolean other$needCount = other.getNeedCount();
        if (this$needCount == null ? other$needCount != null : !((Object)this$needCount).equals(other$needCount)) {
            return false;
        }
        List<T> this$recordList = this.getRecordList();
        List<T> other$recordList = other.getRecordList();
        return !(this$recordList == null ? other$recordList != null : !((Object)this$recordList).equals(other$recordList));
    }

    protected boolean canEqual(Object other) {
        return other instanceof UPCPager;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $pageIndex = this.getPageIndex();
        result = result * 59 + ($pageIndex == null ? 43 : ((Object)$pageIndex).hashCode());
        Integer $pageSize = this.getPageSize();
        result = result * 59 + ($pageSize == null ? 43 : ((Object)$pageSize).hashCode());
        Integer $pageCount = this.getPageCount();
        result = result * 59 + ($pageCount == null ? 43 : ((Object)$pageCount).hashCode());
        Integer $beginPageIndex = this.getBeginPageIndex();
        result = result * 59 + ($beginPageIndex == null ? 43 : ((Object)$beginPageIndex).hashCode());
        Integer $endPageIndex = this.getEndPageIndex();
        result = result * 59 + ($endPageIndex == null ? 43 : ((Object)$endPageIndex).hashCode());
        Integer $recordCount = this.getRecordCount();
        result = result * 59 + ($recordCount == null ? 43 : ((Object)$recordCount).hashCode());
        Boolean $haveNextPage = this.getHaveNextPage();
        result = result * 59 + ($haveNextPage == null ? 43 : ((Object)$haveNextPage).hashCode());
        Boolean $needCount = this.getNeedCount();
        result = result * 59 + ($needCount == null ? 43 : ((Object)$needCount).hashCode());
        List<T> $recordList = this.getRecordList();
        result = result * 59 + ($recordList == null ? 43 : ((Object)$recordList).hashCode());
        return result;
    }

    public String toString() {
        return "UPCPager(pageIndex=" + this.getPageIndex() + ", pageSize=" + this.getPageSize() + ", pageCount=" + this.getPageCount() + ", beginPageIndex=" + this.getBeginPageIndex() + ", endPageIndex=" + this.getEndPageIndex() + ", recordCount=" + this.getRecordCount() + ", haveNextPage=" + this.getHaveNextPage() + ", recordList=" + this.getRecordList() + ", needCount=" + this.getNeedCount() + ")";
    }
}


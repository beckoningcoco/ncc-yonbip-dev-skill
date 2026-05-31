/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MaterialStatusQueryVO {
    private String id;
    private List<String> idList;
    private String code;
    private List<String> codeList;
    private Integer systemFlag;

    public String getId() {
        return this.id;
    }

    public List<String> getIdList() {
        return this.idList;
    }

    public String getCode() {
        return this.code;
    }

    public List<String> getCodeList() {
        return this.codeList;
    }

    public Integer getSystemFlag() {
        return this.systemFlag;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setIdList(List<String> idList) {
        this.idList = idList;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCodeList(List<String> codeList) {
        this.codeList = codeList;
    }

    public void setSystemFlag(Integer systemFlag) {
        this.systemFlag = systemFlag;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MaterialStatusQueryVO)) {
            return false;
        }
        MaterialStatusQueryVO other = (MaterialStatusQueryVO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$systemFlag = this.getSystemFlag();
        Integer other$systemFlag = other.getSystemFlag();
        if (this$systemFlag == null ? other$systemFlag != null : !((Object)this$systemFlag).equals(other$systemFlag)) {
            return false;
        }
        String this$id = this.getId();
        String other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) {
            return false;
        }
        List<String> this$idList = this.getIdList();
        List<String> other$idList = other.getIdList();
        if (this$idList == null ? other$idList != null : !((Object)this$idList).equals(other$idList)) {
            return false;
        }
        String this$code = this.getCode();
        String other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) {
            return false;
        }
        List<String> this$codeList = this.getCodeList();
        List<String> other$codeList = other.getCodeList();
        return !(this$codeList == null ? other$codeList != null : !((Object)this$codeList).equals(other$codeList));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MaterialStatusQueryVO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $systemFlag = this.getSystemFlag();
        result = result * 59 + ($systemFlag == null ? 43 : ((Object)$systemFlag).hashCode());
        String $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        List<String> $idList = this.getIdList();
        result = result * 59 + ($idList == null ? 43 : ((Object)$idList).hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        List<String> $codeList = this.getCodeList();
        result = result * 59 + ($codeList == null ? 43 : ((Object)$codeList).hashCode());
        return result;
    }

    public String toString() {
        return "MaterialStatusQueryVO(id=" + this.getId() + ", idList=" + this.getIdList() + ", code=" + this.getCode() + ", codeList=" + this.getCodeList() + ", systemFlag=" + this.getSystemFlag() + ")";
    }
}


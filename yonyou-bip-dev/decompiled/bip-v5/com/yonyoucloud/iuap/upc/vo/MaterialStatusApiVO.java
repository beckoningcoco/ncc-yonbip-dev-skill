/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 *  com.yonyou.iuap.international.MultiLangText
 */
package com.yonyoucloud.iuap.upc.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyou.iuap.international.MultiLangText;
import com.yonyoucloud.iuap.upc.vo.MaterialStatusDetailVO;
import com.yonyoucloud.iuap.upc.vo.MultilingualVO;
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MaterialStatusApiVO {
    private String id;
    private String code;
    @Deprecated
    private MultilingualVO name;
    private MultiLangText name_multiLangText;
    private Integer systemFlag;
    private Integer stopstatus;
    private List<MaterialStatusDetailVO> materialStatusDetail;
    private String entityStatus;

    public String getId() {
        return this.id;
    }

    public String getCode() {
        return this.code;
    }

    @Deprecated
    public MultilingualVO getName() {
        return this.name;
    }

    public MultiLangText getName_multiLangText() {
        return this.name_multiLangText;
    }

    public Integer getSystemFlag() {
        return this.systemFlag;
    }

    public Integer getStopstatus() {
        return this.stopstatus;
    }

    public List<MaterialStatusDetailVO> getMaterialStatusDetail() {
        return this.materialStatusDetail;
    }

    public String getEntityStatus() {
        return this.entityStatus;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Deprecated
    public void setName(MultilingualVO name) {
        this.name = name;
    }

    public void setName_multiLangText(MultiLangText name_multiLangText) {
        this.name_multiLangText = name_multiLangText;
    }

    public void setSystemFlag(Integer systemFlag) {
        this.systemFlag = systemFlag;
    }

    public void setStopstatus(Integer stopstatus) {
        this.stopstatus = stopstatus;
    }

    public void setMaterialStatusDetail(List<MaterialStatusDetailVO> materialStatusDetail) {
        this.materialStatusDetail = materialStatusDetail;
    }

    public void setEntityStatus(String entityStatus) {
        this.entityStatus = entityStatus;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MaterialStatusApiVO)) {
            return false;
        }
        MaterialStatusApiVO other = (MaterialStatusApiVO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$systemFlag = this.getSystemFlag();
        Integer other$systemFlag = other.getSystemFlag();
        if (this$systemFlag == null ? other$systemFlag != null : !((Object)this$systemFlag).equals(other$systemFlag)) {
            return false;
        }
        Integer this$stopstatus = this.getStopstatus();
        Integer other$stopstatus = other.getStopstatus();
        if (this$stopstatus == null ? other$stopstatus != null : !((Object)this$stopstatus).equals(other$stopstatus)) {
            return false;
        }
        String this$id = this.getId();
        String other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) {
            return false;
        }
        String this$code = this.getCode();
        String other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) {
            return false;
        }
        MultilingualVO this$name = this.getName();
        MultilingualVO other$name = other.getName();
        if (this$name == null ? other$name != null : !((Object)this$name).equals(other$name)) {
            return false;
        }
        MultiLangText this$name_multiLangText = this.getName_multiLangText();
        MultiLangText other$name_multiLangText = other.getName_multiLangText();
        if (this$name_multiLangText == null ? other$name_multiLangText != null : !this$name_multiLangText.equals(other$name_multiLangText)) {
            return false;
        }
        List<MaterialStatusDetailVO> this$materialStatusDetail = this.getMaterialStatusDetail();
        List<MaterialStatusDetailVO> other$materialStatusDetail = other.getMaterialStatusDetail();
        if (this$materialStatusDetail == null ? other$materialStatusDetail != null : !((Object)this$materialStatusDetail).equals(other$materialStatusDetail)) {
            return false;
        }
        String this$entityStatus = this.getEntityStatus();
        String other$entityStatus = other.getEntityStatus();
        return !(this$entityStatus == null ? other$entityStatus != null : !this$entityStatus.equals(other$entityStatus));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MaterialStatusApiVO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $systemFlag = this.getSystemFlag();
        result = result * 59 + ($systemFlag == null ? 43 : ((Object)$systemFlag).hashCode());
        Integer $stopstatus = this.getStopstatus();
        result = result * 59 + ($stopstatus == null ? 43 : ((Object)$stopstatus).hashCode());
        String $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        MultilingualVO $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        MultiLangText $name_multiLangText = this.getName_multiLangText();
        result = result * 59 + ($name_multiLangText == null ? 43 : $name_multiLangText.hashCode());
        List<MaterialStatusDetailVO> $materialStatusDetail = this.getMaterialStatusDetail();
        result = result * 59 + ($materialStatusDetail == null ? 43 : ((Object)$materialStatusDetail).hashCode());
        String $entityStatus = this.getEntityStatus();
        result = result * 59 + ($entityStatus == null ? 43 : $entityStatus.hashCode());
        return result;
    }

    public String toString() {
        return "MaterialStatusApiVO(id=" + this.getId() + ", code=" + this.getCode() + ", name=" + this.getName() + ", name_multiLangText=" + this.getName_multiLangText() + ", systemFlag=" + this.getSystemFlag() + ", stopstatus=" + this.getStopstatus() + ", materialStatusDetail=" + this.getMaterialStatusDetail() + ", entityStatus=" + this.getEntityStatus() + ")";
    }
}


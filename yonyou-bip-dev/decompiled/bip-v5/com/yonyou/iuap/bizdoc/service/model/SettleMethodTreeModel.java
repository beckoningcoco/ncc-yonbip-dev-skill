/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.international.MultiLangText
 */
package com.yonyou.iuap.bizdoc.service.model;

import com.yonyou.iuap.bizdoc.service.model.BaseDaoModel;
import com.yonyou.iuap.international.MultiLangText;
import java.util.List;

public class SettleMethodTreeModel
extends BaseDaoModel {
    private Integer serviceAttr;
    private String erpCode;
    @Deprecated
    private String comment;
    @Deprecated
    private String comment2;
    @Deprecated
    private String comment3;
    private MultiLangText comment_multilangText;
    private Long parentId;
    private String path;
    private Boolean isEnd;
    private Boolean isEnabled;
    private Integer sourcetype;
    private Boolean isDefault;
    private Integer directConnection;
    private List<SettleMethodTreeModel> childrens;

    public Integer getServiceAttr() {
        return this.serviceAttr;
    }

    public String getErpCode() {
        return this.erpCode;
    }

    @Deprecated
    public String getComment() {
        return this.comment;
    }

    @Deprecated
    public String getComment2() {
        return this.comment2;
    }

    @Deprecated
    public String getComment3() {
        return this.comment3;
    }

    public MultiLangText getComment_multilangText() {
        return this.comment_multilangText;
    }

    public Long getParentId() {
        return this.parentId;
    }

    public String getPath() {
        return this.path;
    }

    public Boolean getIsEnd() {
        return this.isEnd;
    }

    public Boolean getIsEnabled() {
        return this.isEnabled;
    }

    public Integer getSourcetype() {
        return this.sourcetype;
    }

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public Integer getDirectConnection() {
        return this.directConnection;
    }

    public List<SettleMethodTreeModel> getChildrens() {
        return this.childrens;
    }

    public void setServiceAttr(Integer serviceAttr) {
        this.serviceAttr = serviceAttr;
    }

    public void setErpCode(String erpCode) {
        this.erpCode = erpCode;
    }

    @Deprecated
    public void setComment(String comment) {
        this.comment = comment;
    }

    @Deprecated
    public void setComment2(String comment2) {
        this.comment2 = comment2;
    }

    @Deprecated
    public void setComment3(String comment3) {
        this.comment3 = comment3;
    }

    public void setComment_multilangText(MultiLangText comment_multilangText) {
        this.comment_multilangText = comment_multilangText;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setIsEnd(Boolean isEnd) {
        this.isEnd = isEnd;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public void setSourcetype(Integer sourcetype) {
        this.sourcetype = sourcetype;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public void setDirectConnection(Integer directConnection) {
        this.directConnection = directConnection;
    }

    public void setChildrens(List<SettleMethodTreeModel> childrens) {
        this.childrens = childrens;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SettleMethodTreeModel)) {
            return false;
        }
        SettleMethodTreeModel other = (SettleMethodTreeModel)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$serviceAttr = this.getServiceAttr();
        Integer other$serviceAttr = other.getServiceAttr();
        if (this$serviceAttr == null ? other$serviceAttr != null : !((Object)this$serviceAttr).equals(other$serviceAttr)) {
            return false;
        }
        Long this$parentId = this.getParentId();
        Long other$parentId = other.getParentId();
        if (this$parentId == null ? other$parentId != null : !((Object)this$parentId).equals(other$parentId)) {
            return false;
        }
        Boolean this$isEnd = this.getIsEnd();
        Boolean other$isEnd = other.getIsEnd();
        if (this$isEnd == null ? other$isEnd != null : !((Object)this$isEnd).equals(other$isEnd)) {
            return false;
        }
        Boolean this$isEnabled = this.getIsEnabled();
        Boolean other$isEnabled = other.getIsEnabled();
        if (this$isEnabled == null ? other$isEnabled != null : !((Object)this$isEnabled).equals(other$isEnabled)) {
            return false;
        }
        Integer this$sourcetype = this.getSourcetype();
        Integer other$sourcetype = other.getSourcetype();
        if (this$sourcetype == null ? other$sourcetype != null : !((Object)this$sourcetype).equals(other$sourcetype)) {
            return false;
        }
        Boolean this$isDefault = this.getIsDefault();
        Boolean other$isDefault = other.getIsDefault();
        if (this$isDefault == null ? other$isDefault != null : !((Object)this$isDefault).equals(other$isDefault)) {
            return false;
        }
        Integer this$directConnection = this.getDirectConnection();
        Integer other$directConnection = other.getDirectConnection();
        if (this$directConnection == null ? other$directConnection != null : !((Object)this$directConnection).equals(other$directConnection)) {
            return false;
        }
        String this$erpCode = this.getErpCode();
        String other$erpCode = other.getErpCode();
        if (this$erpCode == null ? other$erpCode != null : !this$erpCode.equals(other$erpCode)) {
            return false;
        }
        String this$comment = this.getComment();
        String other$comment = other.getComment();
        if (this$comment == null ? other$comment != null : !this$comment.equals(other$comment)) {
            return false;
        }
        String this$comment2 = this.getComment2();
        String other$comment2 = other.getComment2();
        if (this$comment2 == null ? other$comment2 != null : !this$comment2.equals(other$comment2)) {
            return false;
        }
        String this$comment3 = this.getComment3();
        String other$comment3 = other.getComment3();
        if (this$comment3 == null ? other$comment3 != null : !this$comment3.equals(other$comment3)) {
            return false;
        }
        MultiLangText this$comment_multilangText = this.getComment_multilangText();
        MultiLangText other$comment_multilangText = other.getComment_multilangText();
        if (this$comment_multilangText == null ? other$comment_multilangText != null : !this$comment_multilangText.equals(other$comment_multilangText)) {
            return false;
        }
        String this$path = this.getPath();
        String other$path = other.getPath();
        if (this$path == null ? other$path != null : !this$path.equals(other$path)) {
            return false;
        }
        List<SettleMethodTreeModel> this$childrens = this.getChildrens();
        List<SettleMethodTreeModel> other$childrens = other.getChildrens();
        return !(this$childrens == null ? other$childrens != null : !((Object)this$childrens).equals(other$childrens));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof SettleMethodTreeModel;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $serviceAttr = this.getServiceAttr();
        result = result * 59 + ($serviceAttr == null ? 43 : ((Object)$serviceAttr).hashCode());
        Long $parentId = this.getParentId();
        result = result * 59 + ($parentId == null ? 43 : ((Object)$parentId).hashCode());
        Boolean $isEnd = this.getIsEnd();
        result = result * 59 + ($isEnd == null ? 43 : ((Object)$isEnd).hashCode());
        Boolean $isEnabled = this.getIsEnabled();
        result = result * 59 + ($isEnabled == null ? 43 : ((Object)$isEnabled).hashCode());
        Integer $sourcetype = this.getSourcetype();
        result = result * 59 + ($sourcetype == null ? 43 : ((Object)$sourcetype).hashCode());
        Boolean $isDefault = this.getIsDefault();
        result = result * 59 + ($isDefault == null ? 43 : ((Object)$isDefault).hashCode());
        Integer $directConnection = this.getDirectConnection();
        result = result * 59 + ($directConnection == null ? 43 : ((Object)$directConnection).hashCode());
        String $erpCode = this.getErpCode();
        result = result * 59 + ($erpCode == null ? 43 : $erpCode.hashCode());
        String $comment = this.getComment();
        result = result * 59 + ($comment == null ? 43 : $comment.hashCode());
        String $comment2 = this.getComment2();
        result = result * 59 + ($comment2 == null ? 43 : $comment2.hashCode());
        String $comment3 = this.getComment3();
        result = result * 59 + ($comment3 == null ? 43 : $comment3.hashCode());
        MultiLangText $comment_multilangText = this.getComment_multilangText();
        result = result * 59 + ($comment_multilangText == null ? 43 : $comment_multilangText.hashCode());
        String $path = this.getPath();
        result = result * 59 + ($path == null ? 43 : $path.hashCode());
        List<SettleMethodTreeModel> $childrens = this.getChildrens();
        result = result * 59 + ($childrens == null ? 43 : ((Object)$childrens).hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "SettleMethodTreeModel(serviceAttr=" + this.getServiceAttr() + ", erpCode=" + this.getErpCode() + ", comment=" + this.getComment() + ", comment2=" + this.getComment2() + ", comment3=" + this.getComment3() + ", comment_multilangText=" + this.getComment_multilangText() + ", parentId=" + this.getParentId() + ", path=" + this.getPath() + ", isEnd=" + this.getIsEnd() + ", isEnabled=" + this.getIsEnabled() + ", sourcetype=" + this.getSourcetype() + ", isDefault=" + this.getIsDefault() + ", directConnection=" + this.getDirectConnection() + ", childrens=" + this.getChildrens() + ")";
    }
}


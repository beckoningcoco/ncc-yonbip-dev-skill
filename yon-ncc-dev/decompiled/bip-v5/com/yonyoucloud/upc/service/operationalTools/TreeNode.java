/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.imeta.biz.base.BizContext
 *  org.imeta.core.model.Entity
 */
package com.yonyoucloud.upc.service.operationalTools;

import java.util.List;
import org.imeta.biz.base.BizContext;
import org.imeta.core.model.Entity;

public class TreeNode {
    private String fullname;
    String tableName;
    String[] selectFields;
    String externalField;
    String cExtProps;
    String fieldMapping;
    List<TreeNode> childNodes;
    String parentFullname;
    Entity entity;
    private boolean longIdType = true;

    public void setFullname(String fullname) {
        Entity tenantEntity;
        this.fullname = fullname;
        this.entity = tenantEntity = BizContext.getMetaRepository().entity(fullname);
    }

    public String getFullname() {
        return this.fullname;
    }

    public String getTableName() {
        return this.tableName;
    }

    public String[] getSelectFields() {
        return this.selectFields;
    }

    public String getExternalField() {
        return this.externalField;
    }

    public String getCExtProps() {
        return this.cExtProps;
    }

    public String getFieldMapping() {
        return this.fieldMapping;
    }

    public List<TreeNode> getChildNodes() {
        return this.childNodes;
    }

    public String getParentFullname() {
        return this.parentFullname;
    }

    public Entity getEntity() {
        return this.entity;
    }

    public boolean isLongIdType() {
        return this.longIdType;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public void setSelectFields(String[] selectFields) {
        this.selectFields = selectFields;
    }

    public void setExternalField(String externalField) {
        this.externalField = externalField;
    }

    public void setCExtProps(String cExtProps) {
        this.cExtProps = cExtProps;
    }

    public void setFieldMapping(String fieldMapping) {
        this.fieldMapping = fieldMapping;
    }

    public void setChildNodes(List<TreeNode> childNodes) {
        this.childNodes = childNodes;
    }

    public void setParentFullname(String parentFullname) {
        this.parentFullname = parentFullname;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    public void setLongIdType(boolean longIdType) {
        this.longIdType = longIdType;
    }
}


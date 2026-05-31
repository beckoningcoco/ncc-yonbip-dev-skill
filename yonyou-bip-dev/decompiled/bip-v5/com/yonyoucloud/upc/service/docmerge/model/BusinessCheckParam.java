/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.upc.merge.model.MergeDocTypeEnum
 */
package com.yonyoucloud.upc.service.docmerge.model;

import com.yonyou.iuap.upc.merge.model.MergeDocTypeEnum;
import java.io.Serializable;

public class BusinessCheckParam
implements Serializable {
    private static final long serialVersionUID = 8506452960366862296L;
    private String docMergeId;
    private MergeDocTypeEnum docType;
    private String sourceDocId;
    private String microServiceCode;

    public BusinessCheckParam(String docMergeId, MergeDocTypeEnum docType, String sourceDocId, String microServiceCode) {
        this.docMergeId = docMergeId;
        this.docType = docType;
        this.sourceDocId = sourceDocId;
        this.microServiceCode = microServiceCode;
    }

    public BusinessCheckParam() {
    }

    public String getDocMergeId() {
        return this.docMergeId;
    }

    public void setDocMergeId(String docMergeId) {
        this.docMergeId = docMergeId;
    }

    public MergeDocTypeEnum getDocType() {
        return this.docType;
    }

    public void setDocType(MergeDocTypeEnum docType) {
        this.docType = docType;
    }

    public String getSourceDocId() {
        return this.sourceDocId;
    }

    public void setSourceDocId(String sourceDocId) {
        this.sourceDocId = sourceDocId;
    }

    public String getMicroServiceCode() {
        return this.microServiceCode;
    }

    public void setMicroServiceCode(String microServiceCode) {
        this.microServiceCode = microServiceCode;
    }
}


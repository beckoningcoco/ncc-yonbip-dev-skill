/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.doc.check.dto;

import com.yonyou.iuap.apdoc.sdk.constant.RpcRetStatus;
import com.yonyou.iuap.doc.check.dto.CheckResultData;
import java.util.List;

public class DocCheckResult {
    private RpcRetStatus checkStatus;
    private String docId;
    private String orgId;
    private List<String> checkFields;
    private String errorMsg;
    private String errorCode;
    private List<CheckResultData> checkResultDataList;

    public RpcRetStatus getCheckStatus() {
        return this.checkStatus;
    }

    public String getDocId() {
        return this.docId;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public List<String> getCheckFields() {
        return this.checkFields;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public List<CheckResultData> getCheckResultDataList() {
        return this.checkResultDataList;
    }

    public void setCheckStatus(RpcRetStatus checkStatus) {
        this.checkStatus = checkStatus;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public void setCheckFields(List<String> checkFields) {
        this.checkFields = checkFields;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public void setCheckResultDataList(List<CheckResultData> checkResultDataList) {
        this.checkResultDataList = checkResultDataList;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof DocCheckResult)) {
            return false;
        }
        DocCheckResult other = (DocCheckResult)o;
        if (!other.canEqual(this)) {
            return false;
        }
        RpcRetStatus this$checkStatus = this.getCheckStatus();
        RpcRetStatus other$checkStatus = other.getCheckStatus();
        if (this$checkStatus == null ? other$checkStatus != null : !((Object)((Object)this$checkStatus)).equals((Object)other$checkStatus)) {
            return false;
        }
        String this$docId = this.getDocId();
        String other$docId = other.getDocId();
        if (this$docId == null ? other$docId != null : !this$docId.equals(other$docId)) {
            return false;
        }
        String this$orgId = this.getOrgId();
        String other$orgId = other.getOrgId();
        if (this$orgId == null ? other$orgId != null : !this$orgId.equals(other$orgId)) {
            return false;
        }
        List<String> this$checkFields = this.getCheckFields();
        List<String> other$checkFields = other.getCheckFields();
        if (this$checkFields == null ? other$checkFields != null : !((Object)this$checkFields).equals(other$checkFields)) {
            return false;
        }
        String this$errorMsg = this.getErrorMsg();
        String other$errorMsg = other.getErrorMsg();
        if (this$errorMsg == null ? other$errorMsg != null : !this$errorMsg.equals(other$errorMsg)) {
            return false;
        }
        String this$errorCode = this.getErrorCode();
        String other$errorCode = other.getErrorCode();
        if (this$errorCode == null ? other$errorCode != null : !this$errorCode.equals(other$errorCode)) {
            return false;
        }
        List<CheckResultData> this$checkResultDataList = this.getCheckResultDataList();
        List<CheckResultData> other$checkResultDataList = other.getCheckResultDataList();
        return !(this$checkResultDataList == null ? other$checkResultDataList != null : !((Object)this$checkResultDataList).equals(other$checkResultDataList));
    }

    protected boolean canEqual(Object other) {
        return other instanceof DocCheckResult;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        RpcRetStatus $checkStatus = this.getCheckStatus();
        result = result * 59 + ($checkStatus == null ? 43 : ((Object)((Object)$checkStatus)).hashCode());
        String $docId = this.getDocId();
        result = result * 59 + ($docId == null ? 43 : $docId.hashCode());
        String $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        List<String> $checkFields = this.getCheckFields();
        result = result * 59 + ($checkFields == null ? 43 : ((Object)$checkFields).hashCode());
        String $errorMsg = this.getErrorMsg();
        result = result * 59 + ($errorMsg == null ? 43 : $errorMsg.hashCode());
        String $errorCode = this.getErrorCode();
        result = result * 59 + ($errorCode == null ? 43 : $errorCode.hashCode());
        List<CheckResultData> $checkResultDataList = this.getCheckResultDataList();
        result = result * 59 + ($checkResultDataList == null ? 43 : ((Object)$checkResultDataList).hashCode());
        return result;
    }

    public String toString() {
        return "DocCheckResult(checkStatus=" + (Object)((Object)this.getCheckStatus()) + ", docId=" + this.getDocId() + ", orgId=" + this.getOrgId() + ", checkFields=" + this.getCheckFields() + ", errorMsg=" + this.getErrorMsg() + ", errorCode=" + this.getErrorCode() + ", checkResultDataList=" + this.getCheckResultDataList() + ")";
    }
}


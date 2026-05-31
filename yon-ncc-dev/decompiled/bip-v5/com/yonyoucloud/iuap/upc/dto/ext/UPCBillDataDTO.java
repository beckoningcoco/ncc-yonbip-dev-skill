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
import java.util.Map;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class UPCBillDataDTO {
    private List<Map<String, Object>> data;
    private String callbackid;
    private String tenantId;
    private String fullname;
    private String tableview;

    public List<Map<String, Object>> getData() {
        return this.data;
    }

    public String getCallbackid() {
        return this.callbackid;
    }

    public String getTenantId() {
        return this.tenantId;
    }

    public String getFullname() {
        return this.fullname;
    }

    public String getTableview() {
        return this.tableview;
    }

    public void setData(List<Map<String, Object>> data) {
        this.data = data;
    }

    public void setCallbackid(String callbackid) {
        this.callbackid = callbackid;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setTableview(String tableview) {
        this.tableview = tableview;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof UPCBillDataDTO)) {
            return false;
        }
        UPCBillDataDTO other = (UPCBillDataDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        List<Map<String, Object>> this$data = this.getData();
        List<Map<String, Object>> other$data = other.getData();
        if (this$data == null ? other$data != null : !((Object)this$data).equals(other$data)) {
            return false;
        }
        String this$callbackid = this.getCallbackid();
        String other$callbackid = other.getCallbackid();
        if (this$callbackid == null ? other$callbackid != null : !this$callbackid.equals(other$callbackid)) {
            return false;
        }
        String this$tenantId = this.getTenantId();
        String other$tenantId = other.getTenantId();
        if (this$tenantId == null ? other$tenantId != null : !this$tenantId.equals(other$tenantId)) {
            return false;
        }
        String this$fullname = this.getFullname();
        String other$fullname = other.getFullname();
        if (this$fullname == null ? other$fullname != null : !this$fullname.equals(other$fullname)) {
            return false;
        }
        String this$tableview = this.getTableview();
        String other$tableview = other.getTableview();
        return !(this$tableview == null ? other$tableview != null : !this$tableview.equals(other$tableview));
    }

    protected boolean canEqual(Object other) {
        return other instanceof UPCBillDataDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        List<Map<String, Object>> $data = this.getData();
        result = result * 59 + ($data == null ? 43 : ((Object)$data).hashCode());
        String $callbackid = this.getCallbackid();
        result = result * 59 + ($callbackid == null ? 43 : $callbackid.hashCode());
        String $tenantId = this.getTenantId();
        result = result * 59 + ($tenantId == null ? 43 : $tenantId.hashCode());
        String $fullname = this.getFullname();
        result = result * 59 + ($fullname == null ? 43 : $fullname.hashCode());
        String $tableview = this.getTableview();
        result = result * 59 + ($tableview == null ? 43 : $tableview.hashCode());
        return result;
    }

    public String toString() {
        return "UPCBillDataDTO(data=" + this.getData() + ", callbackid=" + this.getCallbackid() + ", tenantId=" + this.getTenantId() + ", fullname=" + this.getFullname() + ", tableview=" + this.getTableview() + ")";
    }
}


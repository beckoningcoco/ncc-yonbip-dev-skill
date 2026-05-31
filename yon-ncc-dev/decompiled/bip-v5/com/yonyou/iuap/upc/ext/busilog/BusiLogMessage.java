/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.imeta.orm.base.BizObject
 */
package com.yonyou.iuap.upc.ext.busilog;

import com.yonyou.ucf.mdd.ext.model.BillContext;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;

public class BusiLogMessage {
    private BillContext billContext;
    private Map<String, Object> paramMap;
    private String token;
    private String clientIp;
    private List<BizObject> bills;
    private String serviceCode;
    private String tenantId;
    private String userId;

    public BillContext getBillContext() {
        return this.billContext;
    }

    public Map<String, Object> getParamMap() {
        return this.paramMap;
    }

    public String getToken() {
        return this.token;
    }

    public String getClientIp() {
        return this.clientIp;
    }

    public List<BizObject> getBills() {
        return this.bills;
    }

    public String getServiceCode() {
        return this.serviceCode;
    }

    public String getTenantId() {
        return this.tenantId;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setBillContext(BillContext billContext) {
        this.billContext = billContext;
    }

    public void setParamMap(Map<String, Object> paramMap) {
        this.paramMap = paramMap;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public void setBills(List<BizObject> bills) {
        this.bills = bills;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof BusiLogMessage)) {
            return false;
        }
        BusiLogMessage other = (BusiLogMessage)o;
        if (!other.canEqual(this)) {
            return false;
        }
        BillContext this$billContext = this.getBillContext();
        BillContext other$billContext = other.getBillContext();
        if (this$billContext == null ? other$billContext != null : !this$billContext.equals(other$billContext)) {
            return false;
        }
        Map<String, Object> this$paramMap = this.getParamMap();
        Map<String, Object> other$paramMap = other.getParamMap();
        if (this$paramMap == null ? other$paramMap != null : !((Object)this$paramMap).equals(other$paramMap)) {
            return false;
        }
        String this$token = this.getToken();
        String other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) {
            return false;
        }
        String this$clientIp = this.getClientIp();
        String other$clientIp = other.getClientIp();
        if (this$clientIp == null ? other$clientIp != null : !this$clientIp.equals(other$clientIp)) {
            return false;
        }
        List<BizObject> this$bills = this.getBills();
        List<BizObject> other$bills = other.getBills();
        if (this$bills == null ? other$bills != null : !((Object)this$bills).equals(other$bills)) {
            return false;
        }
        String this$serviceCode = this.getServiceCode();
        String other$serviceCode = other.getServiceCode();
        if (this$serviceCode == null ? other$serviceCode != null : !this$serviceCode.equals(other$serviceCode)) {
            return false;
        }
        String this$tenantId = this.getTenantId();
        String other$tenantId = other.getTenantId();
        if (this$tenantId == null ? other$tenantId != null : !this$tenantId.equals(other$tenantId)) {
            return false;
        }
        String this$userId = this.getUserId();
        String other$userId = other.getUserId();
        return !(this$userId == null ? other$userId != null : !this$userId.equals(other$userId));
    }

    protected boolean canEqual(Object other) {
        return other instanceof BusiLogMessage;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        BillContext $billContext = this.getBillContext();
        result = result * 59 + ($billContext == null ? 43 : $billContext.hashCode());
        Map<String, Object> $paramMap = this.getParamMap();
        result = result * 59 + ($paramMap == null ? 43 : ((Object)$paramMap).hashCode());
        String $token = this.getToken();
        result = result * 59 + ($token == null ? 43 : $token.hashCode());
        String $clientIp = this.getClientIp();
        result = result * 59 + ($clientIp == null ? 43 : $clientIp.hashCode());
        List<BizObject> $bills = this.getBills();
        result = result * 59 + ($bills == null ? 43 : ((Object)$bills).hashCode());
        String $serviceCode = this.getServiceCode();
        result = result * 59 + ($serviceCode == null ? 43 : $serviceCode.hashCode());
        String $tenantId = this.getTenantId();
        result = result * 59 + ($tenantId == null ? 43 : $tenantId.hashCode());
        String $userId = this.getUserId();
        result = result * 59 + ($userId == null ? 43 : $userId.hashCode());
        return result;
    }

    public String toString() {
        return "BusiLogMessage(billContext=" + this.getBillContext() + ", paramMap=" + this.getParamMap() + ", token=" + this.getToken() + ", clientIp=" + this.getClientIp() + ", bills=" + this.getBills() + ", serviceCode=" + this.getServiceCode() + ", tenantId=" + this.getTenantId() + ", userId=" + this.getUserId() + ")";
    }

    public BusiLogMessage(BillContext billContext, Map<String, Object> paramMap, String token, String clientIp, List<BizObject> bills, String serviceCode, String tenantId, String userId) {
        this.billContext = billContext;
        this.paramMap = paramMap;
        this.token = token;
        this.clientIp = clientIp;
        this.bills = bills;
        this.serviceCode = serviceCode;
        this.tenantId = tenantId;
        this.userId = userId;
    }

    public BusiLogMessage() {
    }
}


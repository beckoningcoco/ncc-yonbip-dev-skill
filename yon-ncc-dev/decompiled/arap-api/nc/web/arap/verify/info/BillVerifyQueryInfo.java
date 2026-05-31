/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.lang.UFDateTime
 *  nccloud.dto.arap.arappub.BillVerifyConditionVO
 *  nccloud.dto.baseapp.querytree.dataformat.QueryTreeFormatVO
 */
package nc.web.arap.verify.info;

import nc.vo.pub.lang.UFDateTime;
import nccloud.dto.arap.arappub.BillVerifyConditionVO;
import nccloud.dto.baseapp.querytree.dataformat.QueryTreeFormatVO;

public class BillVerifyQueryInfo {
    private String pageId;
    private String templetId;
    private String pk_bill;
    private String pk_item;
    private String billType;
    private UFDateTime ts;
    private QueryTreeFormatVO queryTreeFormatVO;
    private BillVerifyConditionVO verifyConditionVO;

    public String getPk_bill() {
        return this.pk_bill;
    }

    public void setPk_bill(String pk_bill) {
        this.pk_bill = pk_bill;
    }

    public String getPk_item() {
        return this.pk_item;
    }

    public void setPk_item(String pk_item) {
        this.pk_item = pk_item;
    }

    public String getBillType() {
        return this.billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public QueryTreeFormatVO getQueryTreeFormatVO() {
        return this.queryTreeFormatVO;
    }

    public void setQueryTreeFormatVO(QueryTreeFormatVO queryTreeFormatVO) {
        this.queryTreeFormatVO = queryTreeFormatVO;
    }

    public BillVerifyConditionVO getVerifyConditionVO() {
        return this.verifyConditionVO;
    }

    public void setVerifyConditionVO(BillVerifyConditionVO verifyConditionVO) {
        this.verifyConditionVO = verifyConditionVO;
    }

    public String getPageId() {
        return this.pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

    public UFDateTime getTs() {
        return this.ts;
    }

    public void setTs(UFDateTime ts) {
        this.ts = ts;
    }

    public String getTempletId() {
        return this.templetId;
    }

    public void setTempletId(String templetId) {
        this.templetId = templetId;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.lang.UFDateTime
 *  nc.vo.pub.lang.UFDouble
 *  nccloud.dto.arap.arappub.BillVerifyLinkDataVO
 */
package nc.web.arap.verify.info;

import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nccloud.dto.arap.arappub.BillVerifyLinkDataVO;

public class BillVerifyLinkDataInfo {
    private String pageId;
    private String pk_bill;
    private String pk_item;
    private String billType;
    private String tradeType;
    private UFDateTime ts;
    private UFDouble this_sett;
    private BillVerifyLinkDataVO[] linkVOs;

    public String getPageId() {
        return this.pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

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

    public UFDouble getThis_sett() {
        return this.this_sett;
    }

    public void setThis_sett(UFDouble this_sett) {
        this.this_sett = this_sett;
    }

    public BillVerifyLinkDataVO[] getLinkVOs() {
        return this.linkVOs;
    }

    public void setLinkVOs(BillVerifyLinkDataVO[] linkVOs) {
        this.linkVOs = linkVOs;
    }

    public UFDateTime getTs() {
        return this.ts;
    }

    public void setTs(UFDateTime ts) {
        this.ts = ts;
    }

    public String getTradeType() {
        return this.tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.CircularlyAccessibleValueObject
 */
package nc.vo.arap.goldentax;

import nc.vo.arap.goldentax.GoldTaxBodyVO;
import nc.vo.arap.goldentax.GoldTaxHeadVO;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.CircularlyAccessibleValueObject;

public class AggGoldTaxHeadVO
extends AggregatedValueObject {
    private static final long serialVersionUID = 4872292392712839246L;
    private String billIdentifier;
    private String billName;
    private String sellCorpName;
    private String sellCorpId;
    private String annotations;
    private String sourceModule;
    private String pkFinancialOrg;
    private GoldTaxHeadVO headVO;
    private GoldTaxBodyVO[] bodyVOs;

    public String getAnnotations() {
        return this.annotations;
    }

    public String getBillIdentifier() {
        return this.billIdentifier;
    }

    public String getBillName() {
        return this.billName;
    }

    public GoldTaxBodyVO[] getChildrenVO() {
        return this.bodyVOs;
    }

    public GoldTaxHeadVO getParentVO() {
        return this.headVO;
    }

    public String getPkFinancialOrg() {
        return this.pkFinancialOrg;
    }

    public String getSellCorpId() {
        return this.sellCorpId;
    }

    public String getSellCorpName() {
        if (this.sellCorpName == null) {
            this.sellCorpName = this.getParentVO().getSellcorpname();
        }
        return this.sellCorpName;
    }

    public String getSourceModule() {
        return this.sourceModule;
    }

    public void setAnnotations(String annotations) {
        this.annotations = annotations;
    }

    public void setBillIdentifier(String billIdentifier) {
        this.billIdentifier = billIdentifier;
    }

    public void setBillName(String billName) {
        this.billName = billName;
    }

    public void setChildrenVO(CircularlyAccessibleValueObject[] children) {
        this.bodyVOs = (GoldTaxBodyVO[])children;
        if (this.getParentVO() != null && children != null) {
            this.getParentVO().setBodynum(children.length);
        }
    }

    public void setParentVO(CircularlyAccessibleValueObject parent) {
        this.headVO = (GoldTaxHeadVO)parent;
    }

    public void setPkFinancialOrg(String pkFinancialOrg) {
        this.pkFinancialOrg = pkFinancialOrg;
    }

    public void setSellCorpId(String sellCorpId) {
        this.sellCorpId = sellCorpId;
    }

    public void setSellCorpName(String sellCorpName) {
        this.sellCorpName = sellCorpName;
    }

    public void setSourceModule(String sourceModule) {
        this.sourceModule = sourceModule;
    }
}


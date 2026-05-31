/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFDouble
 */
package nc.vo.arap.comreport;

import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDouble;

public class CreditVO
extends SuperVO {
    private static final long serialVersionUID = 1L;
    private String pk_org = null;
    private String org = null;
    private String pk_climittype = null;
    private String climittype = null;
    private UFDouble nlimitmny = null;
    private String pk_csaleorg = null;
    private String csaleorg = null;
    private String pk_cdept = null;
    private String cdept = null;
    private String pk_cemployee = null;
    private String cemployee = null;
    private String pk_customer = null;
    private String customer = null;
    private String pk_currency = null;
    private String currency = null;
    private UFDouble nmny = null;
    private UFDouble nestarmny = null;
    private UFDouble narmny = null;
    private UFDouble nnoverifymny = null;
    private UFDouble nengrossmny = null;
    private UFDouble nbalancemny = null;
    private static boolean showZeroLikeNull = true;

    public String getPk_org() {
        return this.pk_org;
    }

    public void setPk_org(String pkOrg) {
        this.pk_org = pkOrg;
    }

    public String getOrg() {
        return this.org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public String getPk_climittype() {
        return this.pk_climittype;
    }

    public void setPk_climittype(String pkClimittype) {
        this.pk_climittype = pkClimittype;
    }

    public String getClimittype() {
        return this.climittype;
    }

    public void setClimittype(String climittype) {
        this.climittype = climittype;
    }

    public UFDouble getNlimitmny() {
        return this.getUFDouble(this.nlimitmny);
    }

    public void setNlimitmny(UFDouble nlimitmny) {
        this.nlimitmny = nlimitmny;
    }

    public String getPk_csaleorg() {
        return this.pk_csaleorg;
    }

    public void setPk_csaleorg(String pkCsaleorg) {
        this.pk_csaleorg = pkCsaleorg;
    }

    public String getCsaleorg() {
        return this.csaleorg;
    }

    public void setCsaleorg(String csaleorg) {
        this.csaleorg = csaleorg;
    }

    public String getPk_cdept() {
        return this.pk_cdept;
    }

    public void setPk_cdept(String pkCdept) {
        this.pk_cdept = pkCdept;
    }

    public String getCdept() {
        return this.cdept;
    }

    public void setCdept(String cdept) {
        this.cdept = cdept;
    }

    public String getPk_cemployee() {
        return this.pk_cemployee;
    }

    public void setPk_cemployee(String pkCemployee) {
        this.pk_cemployee = pkCemployee;
    }

    public String getCemployee() {
        return this.cemployee;
    }

    public void setCemployee(String cemployee) {
        this.cemployee = cemployee;
    }

    public String getPk_customer() {
        return this.pk_customer;
    }

    public void setPk_customer(String pkCustomer) {
        this.pk_customer = pkCustomer;
    }

    public String getCustomer() {
        return this.customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getPk_currency() {
        return this.pk_currency;
    }

    public void setPk_currency(String pkCurrency) {
        this.pk_currency = pkCurrency;
    }

    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public UFDouble getNmny() {
        return this.getUFDouble(this.nmny);
    }

    public void setNmny(UFDouble nmny) {
        this.nmny = nmny;
    }

    public UFDouble getNestarmny() {
        return this.getUFDouble(this.nestarmny);
    }

    public void setNestarmny(UFDouble nestarmny) {
        this.nestarmny = nestarmny;
    }

    public UFDouble getNarmny() {
        return this.getUFDouble(this.narmny);
    }

    public void setNarmny(UFDouble narmny) {
        this.narmny = narmny;
    }

    public UFDouble getNnoverifymny() {
        return this.getUFDouble(this.nnoverifymny);
    }

    public void setNnoverifymny(UFDouble nnoverifymny) {
        this.nnoverifymny = nnoverifymny;
    }

    public UFDouble getNengrossmny() {
        return this.getUFDouble(this.nengrossmny);
    }

    public void setNengrossmny(UFDouble nengrossmny) {
        this.nengrossmny = nengrossmny;
    }

    public UFDouble getNbalancemny() {
        return this.getUFDouble(this.nbalancemny);
    }

    public void setNbalancemny(UFDouble nbalancemny) {
        this.nbalancemny = nbalancemny;
    }

    private UFDouble getUFDouble(UFDouble src) {
        if (UFDouble.ZERO_DBL.equals((Object)src) && showZeroLikeNull) {
            return null;
        }
        if (src == null && !showZeroLikeNull) {
            return UFDouble.ZERO_DBL;
        }
        return src;
    }

    public static boolean isShowZeroLikeNull() {
        return showZeroLikeNull;
    }

    public static void setShowZeroLikeNull(boolean showZeroLikeNull) {
        CreditVO.showZeroLikeNull = showZeroLikeNull;
    }
}


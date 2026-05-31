/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nccloud.dto.arap.arappub.CancelLinkInfo
 *  nccloud.dto.arap.arappub.info.VerifyInfo
 */
package nc.web.arap.verify.info;

import nccloud.dto.arap.arappub.CancelLinkInfo;
import nccloud.dto.arap.arappub.info.VerifyInfo;

public class CancleVerifyVO
extends VerifyInfo {
    private CancelLinkInfo[] linkVOs;
    private String[] pk_verifys;
    private String[] cancelKeys;
    private String[] allpks;
    private String detailCode;
    private String actType;

    public CancelLinkInfo[] getLinkVOs() {
        return this.linkVOs;
    }

    public void setLinkVOs(CancelLinkInfo[] linkVOs) {
        this.linkVOs = linkVOs;
    }

    public String[] getPk_verifys() {
        return this.pk_verifys;
    }

    public void setPk_verifys(String[] pk_verifys) {
        this.pk_verifys = pk_verifys;
    }

    public String[] getCancelKeys() {
        return this.cancelKeys;
    }

    public void setCancelKeys(String[] cancelKeys) {
        this.cancelKeys = cancelKeys;
    }

    public String[] getAllpks() {
        return this.allpks;
    }

    public void setAllpks(String[] allpks) {
        this.allpks = allpks;
    }

    public String getDetailCode() {
        return this.detailCode;
    }

    public void setDetailCode(String detailCode) {
        this.detailCode = detailCode;
    }

    public String getActType() {
        return this.actType;
    }

    public void setActType(String actType) {
        this.actType = actType;
    }
}


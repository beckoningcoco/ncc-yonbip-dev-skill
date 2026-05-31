/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.arap.verify.VaryMoneyFilterVO
 */
package nc.web.arap.verify.info;

import nc.vo.arap.verify.VaryMoneyFilterVO;
import nc.web.arap.verify.info.BillVerifyLinkDataInfo;

public class VaryMoneyLinkInfo
extends BillVerifyLinkDataInfo {
    private VaryMoneyFilterVO varyMoneyFilterVO;
    private int result;
    private String pk_subjcode;
    private String pj_jsfs;

    public VaryMoneyFilterVO getVaryMoneyFilterVO() {
        return this.varyMoneyFilterVO;
    }

    public void setVaryMoneyFilterVO(VaryMoneyFilterVO varyMoneyFilterVO) {
        this.varyMoneyFilterVO = varyMoneyFilterVO;
    }

    public int getResult() {
        return this.result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getPk_subjcode() {
        return this.pk_subjcode;
    }

    public void setPk_subjcode(String pk_subjcode) {
        this.pk_subjcode = pk_subjcode;
    }

    public String getPj_jsfs() {
        return this.pj_jsfs;
    }

    public void setPj_jsfs(String pj_jsfs) {
        this.pj_jsfs = pj_jsfs;
    }
}


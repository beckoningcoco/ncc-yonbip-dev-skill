/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.arap.billconfer;

import java.io.Serializable;
import nc.vo.arap.pub.BillEnumCollection;

public class BCParamVO
implements Serializable {
    private static final long serialVersionUID = 4858055297053610224L;
    private BillEnumCollection.ObjType objType;
    private String srcCustsup;
    private String srcorg;
    private String busitype;
    private String srcTradetype;

    public BillEnumCollection.ObjType getObjType() {
        return this.objType;
    }

    public void setObjType(BillEnumCollection.ObjType objType) {
        this.objType = objType;
    }

    public String getSrcCustsup() {
        return this.srcCustsup;
    }

    public void setSrcCustsup(String srcCustsup) {
        this.srcCustsup = srcCustsup;
    }

    public String getSrcorg() {
        return this.srcorg;
    }

    public void setSrcorg(String srcorg) {
        this.srcorg = srcorg;
    }

    public String getBusitype() {
        return this.busitype;
    }

    public void setBusitype(String busitype) {
        this.busitype = busitype;
    }

    public String getSrcTradetype() {
        return this.srcTradetype;
    }

    public void setSrcTradetype(String srcTradetype) {
        this.srcTradetype = srcTradetype;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.pub.IVOMeta
 *  nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory
 */
package nc.vo.arap.supreceivable;

import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.pub.IVOMeta;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

public class SupReceivableBillVO
extends BaseBillVO {
    private static final long serialVersionUID = 1L;
    private String pk_suprecbill;

    public String getPk_suprecbill() {
        return this.pk_suprecbill;
    }

    public void setPk_suprecbill(String pkSuprecbill) {
        this.pk_suprecbill = pkSuprecbill;
    }

    public String getParentPKFieldName() {
        return null;
    }

    public String getPKFieldName() {
        return "pk_suprecbill";
    }

    public String getTableName() {
        return "ar_suprecbill";
    }

    public SupReceivableBillVO() {
        this.setBillclass("ys");
    }

    public IVOMeta getMetaData() {
        IVOMeta meta = VOMetaFactory.getInstance().getVOMeta("arap.suprecbill");
        return meta;
    }
}


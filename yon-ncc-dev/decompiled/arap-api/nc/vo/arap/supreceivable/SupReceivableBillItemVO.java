/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.pub.IVOMeta
 *  nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory
 */
package nc.vo.arap.supreceivable;

import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.pub.IVOMeta;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

public class SupReceivableBillItemVO
extends BaseItemVO {
    private static final long serialVersionUID = 1L;
    private String pk_suprecbill;
    private String pk_suprecitem;
    public static final String PK_SUPRECBILL = "pk_suprecbill";

    public String getPk_suprecbill() {
        return this.pk_suprecbill;
    }

    public void setPk_suprecbill(String newPk_suprecbill) {
        this.pk_suprecbill = newPk_suprecbill;
    }

    public String getPk_suprecitem() {
        return this.pk_suprecitem;
    }

    public void setPk_suprecitem(String pkSuprecitem) {
        this.pk_suprecitem = pkSuprecitem;
    }

    public SupReceivableBillItemVO() {
        this.setBillclass("ys");
    }

    public IVOMeta getMetaData() {
        IVOMeta meta = VOMetaFactory.getInstance().getVOMeta("arap.suprecitem");
        return meta;
    }

    public String getChildrenPK() {
        return this.getPk_suprecitem();
    }

    public String getParentPK() {
        return this.getPk_suprecbill();
    }

    public void setChildrenPK(String newChildrenPK) {
        this.setPk_suprecitem(newChildrenPK);
    }

    public void setParentPK(String newParentPK) {
        this.setPk_suprecbill(newParentPK);
    }
}


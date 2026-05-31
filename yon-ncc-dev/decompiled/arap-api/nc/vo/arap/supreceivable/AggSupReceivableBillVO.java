/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.annotation.AggVoInfo
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pubapp.pattern.model.meta.entity.bill.BillMetaFactory
 *  nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta
 */
package nc.vo.arap.supreceivable;

import nc.vo.annotation.AggVoInfo;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.supreceivable.SupReceivableBillItemVO;
import nc.vo.arap.supreceivable.SupReceivableBillVO;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pubapp.pattern.model.meta.entity.bill.BillMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta;

@AggVoInfo(parentVO="nc.vo.arap.supreceivable.SupReceivableBillVO")
public class AggSupReceivableBillVO
extends BaseAggVO {
    private static final long serialVersionUID = 1L;

    public IBillMeta getMetaData() {
        IBillMeta billMeta = BillMetaFactory.getInstance().getBillMeta("arap.suprecbill");
        return billMeta;
    }

    public AggSupReceivableBillVO clone() {
        AggSupReceivableBillVO aggvo = new AggSupReceivableBillVO();
        aggvo.setParentVO((CircularlyAccessibleValueObject)((SupReceivableBillVO)((Object)this.getParentVO().clone())));
        SupReceivableBillItemVO[] children = new SupReceivableBillItemVO[this.getChildrenVO().length];
        for (int i = 0; i < this.getChildrenVO().length; ++i) {
            children[i] = (SupReceivableBillItemVO)((Object)this.getChildrenVO()[i].clone());
        }
        aggvo.setChildrenVO((CircularlyAccessibleValueObject[])children);
        return aggvo;
    }
}


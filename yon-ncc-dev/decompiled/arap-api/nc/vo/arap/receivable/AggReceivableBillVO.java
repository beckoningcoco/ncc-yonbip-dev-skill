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
package nc.vo.arap.receivable;

import nc.vo.annotation.AggVoInfo;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.receivable.ReceivableBillItemVO;
import nc.vo.arap.receivable.ReceivableBillVO;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pubapp.pattern.model.meta.entity.bill.BillMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta;

@AggVoInfo(parentVO="nc.vo.arap.receivable.ReceivableBillVO")
public class AggReceivableBillVO
extends BaseAggVO {
    private static final long serialVersionUID = 1L;

    public IBillMeta getMetaData() {
        IBillMeta billMeta = BillMetaFactory.getInstance().getBillMeta("arap.recbill");
        return billMeta;
    }

    public AggReceivableBillVO clone() {
        AggReceivableBillVO aggvo = new AggReceivableBillVO();
        aggvo.setParentVO((CircularlyAccessibleValueObject)((ReceivableBillVO)((Object)this.getParentVO().clone())));
        ReceivableBillItemVO[] children = new ReceivableBillItemVO[this.getChildrenVO().length];
        for (int i = 0; i < this.getChildrenVO().length; ++i) {
            children[i] = (ReceivableBillItemVO)((Object)this.getChildrenVO()[i].clone());
        }
        aggvo.setChildrenVO((CircularlyAccessibleValueObject[])children);
        return aggvo;
    }

    public ReceivableBillVO getHeadVO() {
        return (ReceivableBillVO)super.getParent();
    }

    public ReceivableBillItemVO[] getBodyVOs() {
        try {
            return (ReceivableBillItemVO[])super.getChildrenVO();
        }
        catch (ClassCastException e) {
            int length = super.getChildrenVO().length;
            ReceivableBillItemVO[] ret = new ReceivableBillItemVO[length];
            System.arraycopy(super.getChildrenVO(), 0, ret, 0, length);
            this.setChildrenVO((CircularlyAccessibleValueObject[])ret);
            return ret;
        }
    }

    public CircularlyAccessibleValueObject[] getChildrenVO() {
        return this.getBodyVOs();
    }
}


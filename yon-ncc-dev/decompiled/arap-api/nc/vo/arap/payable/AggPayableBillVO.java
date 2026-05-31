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
package nc.vo.arap.payable;

import nc.vo.annotation.AggVoInfo;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.payable.PayableBillItemVO;
import nc.vo.arap.payable.PayableBillVO;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pubapp.pattern.model.meta.entity.bill.BillMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta;

@AggVoInfo(parentVO="nc.vo.arap.payable.PayableBillVO")
public class AggPayableBillVO
extends BaseAggVO {
    private static final long serialVersionUID = 1L;

    public IBillMeta getMetaData() {
        IBillMeta billMeta = BillMetaFactory.getInstance().getBillMeta("arap.payablebill");
        return billMeta;
    }

    public AggPayableBillVO clone() {
        AggPayableBillVO aggvo = new AggPayableBillVO();
        aggvo.setParentVO((CircularlyAccessibleValueObject)((PayableBillVO)((Object)this.getParentVO().clone())));
        PayableBillItemVO[] children = new PayableBillItemVO[this.getChildrenVO().length];
        for (int i = 0; i < this.getChildrenVO().length; ++i) {
            children[i] = (PayableBillItemVO)((Object)this.getChildrenVO()[i].clone());
        }
        aggvo.setChildrenVO((CircularlyAccessibleValueObject[])children);
        return aggvo;
    }

    public PayableBillVO getHeadVO() {
        return (PayableBillVO)super.getParent();
    }

    public PayableBillItemVO[] getBodyVOs() {
        try {
            return (PayableBillItemVO[])super.getChildrenVO();
        }
        catch (ClassCastException e) {
            int length = super.getChildrenVO().length;
            PayableBillItemVO[] ret = new PayableBillItemVO[length];
            System.arraycopy(super.getChildrenVO(), 0, ret, 0, length);
            this.setChildrenVO((CircularlyAccessibleValueObject[])ret);
            return ret;
        }
    }

    public CircularlyAccessibleValueObject[] getChildrenVO() {
        return this.getBodyVOs();
    }
}


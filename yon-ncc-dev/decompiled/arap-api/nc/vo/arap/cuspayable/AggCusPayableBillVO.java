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
package nc.vo.arap.cuspayable;

import nc.vo.annotation.AggVoInfo;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.cuspayable.CusPayableBillItemVO;
import nc.vo.arap.cuspayable.CusPayableBillVO;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pubapp.pattern.model.meta.entity.bill.BillMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta;

@AggVoInfo(parentVO="nc.vo.arap.cuspayable.CusPayableBillVO")
public class AggCusPayableBillVO
extends BaseAggVO {
    private static final long serialVersionUID = 1L;

    public IBillMeta getMetaData() {
        IBillMeta billMeta = BillMetaFactory.getInstance().getBillMeta("arap.cuspayablebill");
        return billMeta;
    }

    public AggCusPayableBillVO clone() {
        AggCusPayableBillVO aggvo = new AggCusPayableBillVO();
        aggvo.setParentVO((CircularlyAccessibleValueObject)((CusPayableBillVO)((Object)this.getParentVO().clone())));
        CusPayableBillItemVO[] children = new CusPayableBillItemVO[this.getChildrenVO().length];
        for (int i = 0; i < this.getChildrenVO().length; ++i) {
            children[i] = (CusPayableBillItemVO)((Object)this.getChildrenVO()[i].clone());
        }
        aggvo.setChildrenVO((CircularlyAccessibleValueObject[])children);
        return aggvo;
    }
}


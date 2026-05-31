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
package nc.vo.arap.reminder;

import nc.vo.annotation.AggVoInfo;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.reminder.ArapNoticeItemVO;
import nc.vo.arap.reminder.ArapNoticeVO;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pubapp.pattern.model.meta.entity.bill.BillMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta;

@AggVoInfo(parentVO="nc.vo.arap.reminder.ArapNoticeVO")
public class AggArapNoticeVO
extends BaseAggVO {
    private static final long serialVersionUID = 1L;

    public IBillMeta getMetaData() {
        return BillMetaFactory.getInstance().getBillMeta("arap.ArapNotice");
    }

    public AggArapNoticeVO clone() {
        AggArapNoticeVO aggvo = new AggArapNoticeVO();
        aggvo.setParentVO((CircularlyAccessibleValueObject)((ArapNoticeVO)((Object)this.getParentVO().clone())));
        ArapNoticeItemVO[] children = new ArapNoticeItemVO[this.getChildrenVO().length];
        for (int i = 0; i < this.getChildrenVO().length; ++i) {
            children[i] = (ArapNoticeItemVO)((Object)this.getChildrenVO()[i].clone());
        }
        aggvo.setChildrenVO((CircularlyAccessibleValueObject[])children);
        return aggvo;
    }

    public ArapNoticeVO getHeadVO() {
        return (ArapNoticeVO)super.getParent();
    }

    public ArapNoticeItemVO[] getBodyVOs() {
        try {
            return (ArapNoticeItemVO[])super.getChildrenVO();
        }
        catch (ClassCastException e) {
            int length = super.getChildrenVO().length;
            ArapNoticeItemVO[] ret = new ArapNoticeItemVO[length];
            System.arraycopy(super.getChildrenVO(), 0, ret, 0, length);
            return ret;
        }
    }

    public ArapNoticeItemVO[] getChildrenVO() {
        return this.getBodyVOs();
    }
}


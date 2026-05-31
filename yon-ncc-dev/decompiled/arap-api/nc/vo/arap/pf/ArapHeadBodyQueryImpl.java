/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.md.data.access.NCObject
 *  nc.uap.pf.metadata.HeadBodyQueryImpl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 */
package nc.vo.arap.pf;

import nc.bs.arap.util.ArapBillVOUtils;
import nc.md.data.access.NCObject;
import nc.uap.pf.metadata.HeadBodyQueryImpl;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;

public class ArapHeadBodyQueryImpl
extends HeadBodyQueryImpl {
    public ArapHeadBodyQueryImpl(NCObject ncObj) {
        super(ncObj);
    }

    public AggregatedValueObject queryAggData(String billType, String billId) throws BusinessException {
        AggregatedValueObject bills = super.queryAggData(billType, billId);
        ArapBillVOUtils.dealVoScaleAndHtb((BaseAggVO)bills);
        return bills;
    }
}


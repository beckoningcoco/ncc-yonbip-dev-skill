/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.global.ArapBillReflectorServiceImpl
 *  nc.bs.arap.util.ArapBillVOUtils
 *  nc.vo.arap.receivable.AggReceivableBillVO
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pubapp.pattern.model.entity.bill.AbstractBill
 */
package nc.bs.arap.pfcallback;

import nc.bs.arap.global.ArapBillReflectorServiceImpl;
import nc.bs.arap.receiveablebp.RecBillBO;
import nc.bs.arap.util.ArapBillVOUtils;
import nc.vo.arap.receivable.AggReceivableBillVO;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;

public class ArapRecBillReflectorServiceImpl
extends ArapBillReflectorServiceImpl {
    protected AbstractBill[] getBusiBill(String[] keys) throws BusinessException {
        if (null == keys || keys.length == 0) {
            return null;
        }
        AggReceivableBillVO[] vos = new RecBillBO().findBillByPrimaryKey(keys);
        ArapBillVOUtils.removeDebetTransferinfo((AggregatedValueObject[])vos);
        if ("querySrc".equals(this.SCIENCE)) {
            return vos;
        }
        return super.getnewVOByTerm((AggregatedValueObject[])vos) == null ? vos : (AbstractBill[])super.getnewVOByTerm((AggregatedValueObject[])vos).toArray(new AggReceivableBillVO[0]);
    }
}


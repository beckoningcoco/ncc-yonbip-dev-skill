/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.itf.cmp.busi.IBusi4CMPAutoSettleServcie
 *  nc.vo.cmp.settlement.SettlementAggVO
 *  nc.vo.pub.BusinessException
 */
package nc.bs.arap.bill;

import nc.itf.cmp.busi.IBusi4CMPAutoSettleServcie;
import nc.vo.arap.cache.FiPubDataCache;
import nc.vo.arap.djlx.DjLXVO;
import nc.vo.cmp.settlement.SettlementAggVO;
import nc.vo.pub.BusinessException;

public class ArapAutoSettleImp
implements IBusi4CMPAutoSettleServcie {
    public boolean isAutoSettle(String pk_group, String pk_tradetype, SettlementAggVO ... vos) throws BusinessException {
        DjLXVO billType = FiPubDataCache.getBillType(pk_tradetype, pk_group);
        if (billType == null || billType.getIscommit() == null) {
            return false;
        }
        return billType.getIscommit().booleanValue();
    }

    public boolean isSuportBilltype(String billtype) throws BusinessException {
        return billtype.equals("F2") || billtype.equals("F3");
    }
}


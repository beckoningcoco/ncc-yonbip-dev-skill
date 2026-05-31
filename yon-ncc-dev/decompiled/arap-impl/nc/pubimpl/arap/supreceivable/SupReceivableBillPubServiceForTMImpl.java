/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.bill.ArapBillDAO
 *  nc.pubitf.arap.supreceivable.IArapSupReceivableBillPubServiceForTM
 *  nc.vo.pub.BusinessException
 */
package nc.pubimpl.arap.supreceivable;

import java.util.Map;
import nc.bs.arap.bill.ArapBillDAO;
import nc.pubitf.arap.supreceivable.IArapSupReceivableBillPubServiceForTM;
import nc.vo.pub.BusinessException;

public class SupReceivableBillPubServiceForTMImpl
implements IArapSupReceivableBillPubServiceForTM {
    public Map<String, Integer> queryBalanceBySupplier(String[] pkSuppliers) throws BusinessException {
        return ArapBillDAO.getInstance().queryBalanceByCustomers(pkSuppliers);
    }
}


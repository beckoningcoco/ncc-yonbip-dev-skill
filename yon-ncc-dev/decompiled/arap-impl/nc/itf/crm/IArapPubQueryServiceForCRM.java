/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package nc.itf.crm;

import nc.vo.crm.CrmArapBillVO;
import nc.vo.crm.CrmArapVO;
import nc.vo.crm.CrmConditionVO;
import nc.vo.pub.BusinessException;

public interface IArapPubQueryServiceForCRM {
    public CrmArapVO[] queryCustomerAccountInfo(CrmConditionVO var1) throws BusinessException;

    public CrmArapVO[] queryGatheringBillInfo(CrmConditionVO var1) throws BusinessException;

    public CrmArapVO[] queryPayBillInfo(CrmConditionVO var1) throws BusinessException;

    public CrmArapBillVO findGatheringBillByPrimaryKey(String var1) throws BusinessException;

    public CrmArapBillVO findPayBillByPrimaryKey(String var1) throws BusinessException;
}


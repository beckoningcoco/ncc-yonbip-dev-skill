/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.pubitf.arap.receivable.IArapReceivableBillPubQueryService
 *  nc.vo.arap.pfflow.ArapBillMapVO
 *  nc.vo.arap.receivable.AggReceivableBillVO
 *  nc.vo.arap.receivable.ReceivableBillItemVO
 *  nc.vo.arap.receivable.ReceivableBillVO
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDouble
 */
package nc.pubimpl.arap.receivable;

import java.util.Map;
import nc.bs.arap.receiveablebp.RecBillBO;
import nc.pubitf.arap.receivable.IArapReceivableBillPubQueryService;
import nc.vo.arap.pfflow.ArapBillMapVO;
import nc.vo.arap.receivable.AggReceivableBillVO;
import nc.vo.arap.receivable.ReceivableBillItemVO;
import nc.vo.arap.receivable.ReceivableBillVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDouble;

public class ArapReceivableBillPubQueryServiceImpl
implements IArapReceivableBillPubQueryService {
    private final RecBillBO bo = new RecBillBO();

    public AggReceivableBillVO[] findBillByPrimaryKey(String[] keys) throws BusinessException {
        return this.bo.findBillByPrimaryKey(keys);
    }

    public AggReceivableBillVO[] queryBillsBySourceBillID(String[] srcBillIDs) throws BusinessException {
        return this.bo.queryBillsBySourceBillID(srcBillIDs);
    }

    public AggReceivableBillVO[] queryBillsBySourceRowID(String[] srcRowIDs, String pk_org) throws BusinessException {
        return this.bo.queryBillsBySourceRowID(srcRowIDs, pk_org);
    }

    public ReceivableBillItemVO[] queryRecieableBillItem(String[] bodyids) throws BusinessException {
        return this.bo.findBillItemByPrimarykey(bodyids);
    }

    public AggReceivableBillVO[] queryBillsBySrcBillID(String[] srcBillIDs) throws BusinessException {
        return this.bo.queryBillsBySrcBillID(srcBillIDs);
    }

    public AggReceivableBillVO[] queryBillsBySrcRowID(String[] srcRowIDs, String pkOrg) throws BusinessException {
        return this.bo.queryBillsBySrcRowID(srcRowIDs, pkOrg);
    }

    public boolean checkTradetypeUsed(String pkTradetype, String pkGroup) throws BusinessException {
        return this.bo.checkTradetypeUsed(pkTradetype, pkGroup);
    }

    public ArapBillMapVO[] queryArapBillmap(String[] topids) throws BusinessException {
        return this.bo.queryArapBillmap(topids);
    }

    public Map<String, UFDouble> queryMoneyBalBySrcitemids(String[] srcids) throws Exception {
        return this.bo.queryMoneyBalBySrcitemids(srcids);
    }

    public ReceivableBillVO[] findUnConfirmBillsByPeriod(String pk_org, UFDate begindate, UFDate enddate) throws BusinessException {
        return this.bo.findUnConfirmBillsByPeriod(pk_org, begindate, enddate);
    }

    public boolean isDebtTransfer(String pk_bill) throws BusinessException {
        return this.bo.isDebtTransfer(pk_bill);
    }

    public Map<String, UFBoolean> isEffect(String[] pk_bills) throws BusinessException {
        return this.bo.isEffect(pk_bills);
    }
}


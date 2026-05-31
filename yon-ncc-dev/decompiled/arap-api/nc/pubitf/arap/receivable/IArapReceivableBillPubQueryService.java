/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.arap.pfflow.ArapBillMapVO
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDouble
 *  nc.web.arap.bill.pub.IArapBillPubQueryService
 */
package nc.pubitf.arap.receivable;

import java.util.Map;
import nc.vo.arap.pfflow.ArapBillMapVO;
import nc.vo.arap.receivable.AggReceivableBillVO;
import nc.vo.arap.receivable.ReceivableBillItemVO;
import nc.vo.arap.receivable.ReceivableBillVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDouble;
import nc.web.arap.bill.pub.IArapBillPubQueryService;

public interface IArapReceivableBillPubQueryService
extends IArapBillPubQueryService {
    public AggReceivableBillVO[] findBillByPrimaryKey(String[] var1) throws BusinessException;

    public AggReceivableBillVO[] queryBillsBySourceRowID(String[] var1, String var2) throws BusinessException;

    public AggReceivableBillVO[] queryBillsBySourceBillID(String[] var1) throws BusinessException;

    public AggReceivableBillVO[] queryBillsBySrcRowID(String[] var1, String var2) throws BusinessException;

    public AggReceivableBillVO[] queryBillsBySrcBillID(String[] var1) throws BusinessException;

    public ReceivableBillItemVO[] queryRecieableBillItem(String[] var1) throws BusinessException;

    public boolean checkTradetypeUsed(String var1, String var2) throws BusinessException;

    public ArapBillMapVO[] queryArapBillmap(String[] var1) throws BusinessException;

    public Map<String, UFDouble> queryMoneyBalBySrcitemids(String[] var1) throws Exception;

    public ReceivableBillVO[] findUnConfirmBillsByPeriod(String var1, UFDate var2, UFDate var3) throws BusinessException;

    public boolean isDebtTransfer(String var1) throws BusinessException;

    public Map<String, UFBoolean> isEffect(String[] var1) throws BusinessException;
}


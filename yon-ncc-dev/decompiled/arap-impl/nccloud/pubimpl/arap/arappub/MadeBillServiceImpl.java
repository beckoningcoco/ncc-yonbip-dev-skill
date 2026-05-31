/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.arap.pub.IArapBillService
 *  nc.itf.fip.opreatinglog.IGenerateBillService
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.pub.ArapConstant
 *  nc.vo.arap.pub.BillEnumCollection$BillSatus
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.lang.UFBoolean
 *  nccloud.commons.lang.ArrayUtils
 *  nccloud.pubitf.arap.arappub.IArapBillPubUtilService
 *  nccloud.pubitf.arap.arappub.IMadeBillService
 *  nccloud.pubitf.arap.baddebts.IBaddebtsBillQueryService
 */
package nccloud.pubimpl.arap.arappub;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import nc.bs.framework.common.NCLocator;
import nc.itf.arap.pub.IArapBillService;
import nc.itf.fip.opreatinglog.IGenerateBillService;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFBoolean;
import nccloud.commons.lang.ArrayUtils;
import nccloud.pubitf.arap.arappub.IArapBillPubUtilService;
import nccloud.pubitf.arap.arappub.IMadeBillService;
import nccloud.pubitf.arap.baddebts.IBaddebtsBillQueryService;

public class MadeBillServiceImpl
implements IMadeBillService {
    public HashMap<String, Object> getPageMessage(String[] allPks, String billType) throws BusinessException {
        ArrayList<String> pks = new ArrayList<String>();
        Object[] bills = ((IArapBillService)NCLocator.getInstance().lookup(IArapBillService.class)).queryArapBillByPKs(allPks, billType);
        if (ArrayUtils.isEmpty((Object[])bills)) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0882"));
        }
        ((IArapBillPubUtilService)NCLocator.getInstance().lookup(IArapBillPubUtilService.class)).interceptorVaildator((AggregatedValueObject[])bills, ArapConstant.MAKEBILL);
        HashMap tradetype2Id = new HashMap();
        for (Object bill : bills) {
            CircularlyAccessibleValueObject[] childrenVO;
            if (BillEnumCollection.BillSatus.TEMPEORARY.VALUE == (Integer)bill.getParentVO().getAttributeValue("billstatus")) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0018"));
            }
            for (CircularlyAccessibleValueObject child : childrenVO = bill.getAllChildrenVO()) {
                if (!((UFBoolean)child.getAttributeValue("pausetransact")).equals((Object)UFBoolean.valueOf((String)"Y"))) continue;
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0883"));
            }
            MadeBillServiceImpl.checkFrozenBills((BaseAggVO[])bills);
            Object[] newBills = MadeBillServiceImpl.filterSagaErrorBill((BaseAggVO[])bills);
            if (ArrayUtils.isEmpty((Object[])newBills)) {
                throw new BusinessException(bills[0].getSagaErrorMsg());
            }
            pks.add(bill.getHeadVO().getPrimaryKey());
            LinkedList<String> deque = (LinkedList<String>)tradetype2Id.get(bill.getHeadVO().getPk_tradetype());
            if (deque == null) {
                deque = new LinkedList<String>();
                deque.add(bill.getHeadVO().getPrimaryKey());
                tradetype2Id.put(bill.getHeadVO().getPk_tradetype(), deque);
                continue;
            }
            ((Deque)tradetype2Id.get(bill.getHeadVO().getPk_tradetype())).add(bill.getHeadVO().getPrimaryKey());
        }
        if (pks.size() < 1) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0004"));
        }
        String[][] datas = new String[tradetype2Id.size()][];
        int i = 0;
        for (Map.Entry entry : tradetype2Id.entrySet()) {
            ((Deque)entry.getValue()).addFirst(entry.getKey());
            datas[i++] = ((Deque)entry.getValue()).toArray(new String[0]);
        }
        Map map = ((IGenerateBillService)NCLocator.getInstance().lookup(IGenerateBillService.class)).getAppInfoMap(datas);
        if (map == null) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0882"));
        }
        return (HashMap)map;
    }

    public HashMap<String, Object> getDebtPageMessage(String[] allPks, String billType) throws BusinessException {
        ArrayList<String> pks = new ArrayList<String>();
        Object[] bills = ((IBaddebtsBillQueryService)NCLocator.getInstance().lookup(IBaddebtsBillQueryService.class)).queryBillsByPKs(allPks, billType);
        if (ArrayUtils.isEmpty((Object[])bills)) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0882"));
        }
        MadeBillServiceImpl.checkFrozenBills((AggregatedValueObject[])bills);
        Object[] newBills = MadeBillServiceImpl.filterSagaErrorBill((AggregatedValueObject[])bills);
        if (ArrayUtils.isEmpty((Object[])newBills)) {
            throw new BusinessException((String)bills[0].getParentVO().getAttributeValue("SagaErrorMsg"));
        }
        ((IArapBillPubUtilService)NCLocator.getInstance().lookup(IArapBillPubUtilService.class)).interceptorVaildator((AggregatedValueObject[])bills, ArapConstant.MAKEBILL);
        HashMap billtype2Id = new HashMap();
        for (Object bill : newBills) {
            if (BillEnumCollection.BillSatus.TEMPEORARY.VALUE == (Integer)bill.getParentVO().getAttributeValue("billstatus")) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0018"));
            }
            CircularlyAccessibleValueObject headVO = bill.getParentVO();
            String pk_billtype = (String)headVO.getAttributeValue("pk_billtype");
            pks.add(headVO.getPrimaryKey());
            LinkedList<String> deque = (LinkedList<String>)billtype2Id.get(pk_billtype);
            if (deque == null) {
                deque = new LinkedList<String>();
                deque.add(headVO.getPrimaryKey());
                billtype2Id.put(pk_billtype, deque);
                continue;
            }
            ((Deque)billtype2Id.get(pk_billtype)).add(headVO.getPrimaryKey());
        }
        if (pks.size() < 1) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0004"));
        }
        String[][] datas = new String[billtype2Id.size()][];
        int i = 0;
        for (Map.Entry entry : billtype2Id.entrySet()) {
            ((Deque)entry.getValue()).addFirst(entry.getKey());
            datas[i++] = ((Deque)entry.getValue()).toArray(new String[0]);
        }
        Map map = ((IGenerateBillService)NCLocator.getInstance().lookup(IGenerateBillService.class)).getAppInfoMap(datas);
        if (map == null) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0882"));
        }
        return (HashMap)map;
    }

    private static void checkFrozenBills(BaseAggVO[] aggvos) {
        String sagaErrorMsg = null;
        ArrayList<String> frozenlist = new ArrayList<String>();
        ArrayList<String> statuslist = new ArrayList<String>();
        for (BaseAggVO aggVO : aggvos) {
            Integer saga_status = aggVO.getHeadVO().getSaga_status();
            Integer saga_frozen = aggVO.getHeadVO().getSaga_frozen();
            if (saga_status != null && saga_status == 1) {
                statuslist.add(aggVO.getHeadVO().getBillno());
                continue;
            }
            if (saga_frozen == null || saga_frozen != 1) continue;
            frozenlist.add(aggVO.getHeadVO().getBillno());
        }
        if (statuslist.size() != 0) {
            sagaErrorMsg = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1086");
            for (int i = 0; i < statuslist.size(); ++i) {
                sagaErrorMsg = sagaErrorMsg + (String)statuslist.get(i) + ",";
            }
            sagaErrorMsg = sagaErrorMsg + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1087");
        } else if (frozenlist.size() != 0) {
            sagaErrorMsg = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1088");
            for (int i = 0; i < frozenlist.size(); ++i) {
                sagaErrorMsg = sagaErrorMsg + (String)frozenlist.get(i) + ",";
            }
            sagaErrorMsg = sagaErrorMsg + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1089");
        }
        for (BaseAggVO aggVO : aggvos) {
            aggVO.setSagaErrorMsg(sagaErrorMsg);
        }
    }

    private static void checkFrozenBills(AggregatedValueObject[] aggVos) {
        String sagaErrorMsg = null;
        ArrayList<String> frozenlist = new ArrayList<String>();
        ArrayList<String> statuslist = new ArrayList<String>();
        for (AggregatedValueObject aggVO : aggVos) {
            Integer saga_status = (Integer)aggVO.getParentVO().getAttributeValue("saga_status");
            Integer saga_frozen = (Integer)aggVO.getParentVO().getAttributeValue("saga_frozen");
            if (saga_status != null && saga_status == 1) {
                statuslist.add((String)aggVO.getParentVO().getAttributeValue("billno"));
                continue;
            }
            if (saga_frozen == null || saga_frozen != 1) continue;
            frozenlist.add((String)aggVO.getParentVO().getAttributeValue("billno"));
        }
        if (statuslist.size() != 0) {
            sagaErrorMsg = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0019");
            for (int i = 0; i < statuslist.size(); ++i) {
                sagaErrorMsg = sagaErrorMsg + (String)statuslist.get(i) + ",";
            }
            sagaErrorMsg = sagaErrorMsg + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1090");
        } else if (frozenlist.size() != 0) {
            sagaErrorMsg = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0019");
            for (int i = 0; i < frozenlist.size(); ++i) {
                sagaErrorMsg = sagaErrorMsg + (String)frozenlist.get(i) + ",";
            }
            sagaErrorMsg = sagaErrorMsg + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1091");
        }
        for (AggregatedValueObject aggVO : aggVos) {
            aggVO.getParentVO().setAttributeValue("SagaErrorMsg", (Object)sagaErrorMsg);
        }
    }

    private static AggregatedValueObject[] filterSagaErrorBill(AggregatedValueObject[] bills) {
        if (ArrayUtils.isEmpty((Object[])bills)) {
            return null;
        }
        ArrayList<AggregatedValueObject> voList = new ArrayList<AggregatedValueObject>();
        for (AggregatedValueObject aggVO : bills) {
            Integer saga_status = (Integer)aggVO.getParentVO().getAttributeValue("saga_status");
            Integer saga_frozen = (Integer)aggVO.getParentVO().getAttributeValue("saga_frozen");
            if ((saga_status == 1 || saga_frozen == 1) && (saga_status != null || saga_frozen != null)) continue;
            voList.add(aggVO);
        }
        if (voList.size() == bills.length) {
            return bills;
        }
        return voList.toArray(new AggregatedValueObject[0]);
    }

    private static BaseAggVO[] filterSagaErrorBill(BaseAggVO[] bills) {
        if (ArrayUtils.isEmpty((Object[])bills)) {
            return null;
        }
        ArrayList<BaseAggVO> voList = new ArrayList<BaseAggVO>();
        for (BaseAggVO aggVO : bills) {
            Integer saga_status = aggVO.getHeadVO().getSaga_status();
            Integer saga_frozen = aggVO.getHeadVO().getSaga_frozen();
            if ((saga_status == 1 || saga_frozen == 1) && (saga_status != null || saga_frozen != null)) continue;
            voList.add(aggVO);
        }
        if (voList.size() == bills.length) {
            return bills;
        }
        return voList.toArray(new BaseAggVO[0]);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.actions.BillEffectBatchBSAction
 *  nc.bs.arap.actions.BillUnEffectBatchBSAction
 *  nc.bs.arap.util.BillRetiveInfoUtils
 *  nc.bs.arap.util.BillSettlementUtils
 *  nc.bs.businessevent.BdUpdateEvent
 *  nc.bs.businessevent.BusinessEvent
 *  nc.bs.businessevent.IBusinessEvent
 *  nc.bs.businessevent.IBusinessListener
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.cmp.utils.CmpInterfaceProxy
 *  nc.impl.pubapp.env.BSContext
 *  nc.itf.arap.pub.IArapBillService
 *  nc.itf.cmp.settlement.ISettlement
 *  nc.md.persist.framework.MDPersistenceService
 *  nc.pubitf.accperiod.AccountCalendar
 *  nc.pubitf.org.IOrgUnitPubService
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.arap.pub.BillEnumCollection$BillSatus
 *  nc.vo.arap.pub.BillEnumCollection$InureSign
 *  nc.vo.arap.utils.ARAPModuleEnableUtil
 *  nc.vo.cmp.settlement.CmpMsg
 *  nc.vo.cmp.settlement.SettleEnumCollection$OperateType
 *  nc.vo.cmp.settlement.SettlementAggVO
 *  nc.vo.cmp.settlement.SettlementBodyVO
 *  nc.vo.cmp.settlement.SettlementHeadVO
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDouble
 *  nccloud.bs.arap.sagas.util.SagasUtils
 *  nccloud.commons.lang.ArrayUtils
 *  org.apache.commons.collections4.CollectionUtils
 */
package nc.bs.arap.busireg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import nc.bs.arap.actions.BillEffectBatchBSAction;
import nc.bs.arap.actions.BillUnEffectBatchBSAction;
import nc.bs.arap.util.BillRetiveInfoUtils;
import nc.bs.arap.util.BillSettlementUtils;
import nc.bs.businessevent.BdUpdateEvent;
import nc.bs.businessevent.BusinessEvent;
import nc.bs.businessevent.IBusinessEvent;
import nc.bs.businessevent.IBusinessListener;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.cmp.utils.CmpInterfaceProxy;
import nc.impl.pubapp.env.BSContext;
import nc.itf.arap.pub.IArapBillService;
import nc.itf.cmp.settlement.ISettlement;
import nc.md.persist.framework.MDPersistenceService;
import nc.pubitf.accperiod.AccountCalendar;
import nc.pubitf.org.IOrgUnitPubService;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.utils.ARAPModuleEnableUtil;
import nc.vo.cmp.settlement.CmpMsg;
import nc.vo.cmp.settlement.SettleEnumCollection;
import nc.vo.cmp.settlement.SettlementAggVO;
import nc.vo.cmp.settlement.SettlementBodyVO;
import nc.vo.cmp.settlement.SettlementHeadVO;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDouble;
import nccloud.bs.arap.sagas.util.SagasUtils;
import nccloud.commons.lang.ArrayUtils;
import org.apache.commons.collections4.CollectionUtils;

public class NotifySettleHandleListener
implements IBusinessListener {
    private static final List<String> EVENTTYPE = Arrays.asList("200602", "1002", "1004", "1006", "1020", "1021");
    private String errorMessage = null;

    protected AggregatedValueObject[] getOriginBill(AggregatedValueObject[] bills) throws BusinessException {
        String[] pks = new String[bills.length];
        for (int index = 0; index < pks.length; ++index) {
            pks[index] = bills[index].getParentVO().getPrimaryKey();
        }
        Collection vo = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPKs(bills[0].getClass(), pks, false);
        HashMap<String, AggregatedValueObject> map = new HashMap<String, AggregatedValueObject>();
        ArrayList<BaseItemVO> rets = new ArrayList<BaseItemVO>();
        for (Object object : vo) {
            AggregatedValueObject bill = (AggregatedValueObject)object;
            for (CircularlyAccessibleValueObject item : bill.getChildrenVO()) {
                if (Integer.valueOf(1).equals(item.getAttributeValue("dr"))) continue;
                rets.add((BaseItemVO)item);
            }
            bill.setChildrenVO((CircularlyAccessibleValueObject[])rets.toArray(new BaseItemVO[0]));
            rets.clear();
            map.put(bill.getParentVO().getPrimaryKey(), bill);
        }
        ArrayList list = new ArrayList();
        for (int i = 0; i < pks.length; ++i) {
            list.add(map.get(pks[i]));
        }
        return (AggregatedValueObject[])list.toArray(new BaseAggVO[0]);
    }

    /*
     * WARNING - void declaration
     */
    public void doAction(IBusinessEvent event) throws BusinessException {
        Object[] bills = this.getBills(event);
        String eventType = event.getEventType();
        if (ArrayUtils.isEmpty((Object[])bills) || !EVENTTYPE.contains(eventType)) {
            return;
        }
        UFBoolean isinit = ((BaseAggVO)bills[0]).getHeadVO().getIsinit();
        if (isinit != null && isinit.booleanValue()) {
            return;
        }
        UFBoolean transferWriteBack = (UFBoolean)BSContext.getInstance().getSession("transferWriteBack");
        if (transferWriteBack != null && transferWriteBack.booleanValue()) {
            return;
        }
        boolean isCmpEnable = ARAPModuleEnableUtil.isCMPEnable((String)((String)bills[0].getParentVO().getAttributeValue("pk_group")));
        ArrayList<Object> settAggvos = new ArrayList<Object>();
        ArrayList<Object> nosettAggvos = new ArrayList<Object>();
        ArrayList<Object> editOldSettVOs = new ArrayList<Object>();
        ArrayList<Object> editOldNoSettVOs = new ArrayList<Object>();
        if (isCmpEnable) {
            Object billsMap;
            block66: {
                IOrgUnitPubService orgUnitPubService = (IOrgUnitPubService)NCLocator.getInstance().lookup(IOrgUnitPubService.class);
                String createdrt = null;
                try {
                    String org = (String)bills[0].getParentVO().getAttributeValue("pk_org");
                    createdrt = orgUnitPubService.getOrgModulePeriodByOrgIDAndModuleID(org, "3607");
                    if (createdrt != null) {
                        String initEnabledYear = createdrt.substring(0, 4);
                        String initEnabledMonth = createdrt.substring(5, 7);
                        AccountCalendar accountCalendar = AccountCalendar.getInstanceByPk_org((String)org);
                        accountCalendar.set(initEnabledYear, initEnabledMonth);
                        UFDate createDate2 = accountCalendar.getMonthVO().getBegindate();
                        if (createDate2.after((UFDate)bills[0].getParentVO().getAttributeValue("billdate"))) {
                            isCmpEnable = false;
                        }
                        break block66;
                    }
                    throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0119"));
                }
                catch (BusinessException e) {
                    isCmpEnable = false;
                    this.errorMessage = e.getMessage();
                }
            }
            if ("1021".equals(eventType)) {
                billsMap = new HashMap();
                ArrayList<Object> nosettlebills = new ArrayList<Object>();
                ArrayList settlebills = new ArrayList();
                for (Object object : bills) {
                    billsMap.put(object.getParentVO().getPrimaryKey(), object);
                }
                SettlementAggVO[] settlementAggVOArray = CmpInterfaceProxy.INSTANCE.getQueryService().querySettlementAggsByPk_busibills(billsMap.keySet().toArray(new String[0]));
                if (settlementAggVOArray == null || settlementAggVOArray.length == 0) {
                    nosettlebills.addAll(Arrays.asList(bills));
                } else {
                    void var19_42;
                    SettlementAggVO[] createDate2 = settlementAggVOArray;
                    int n = createDate2.length;
                    boolean bl = false;
                    while (var19_42 < n) {
                        SettlementAggVO settlementAggVO = createDate2[var19_42];
                        SettlementHeadVO headVO = (SettlementHeadVO)settlementAggVO.getParentVO();
                        if (billsMap.keySet().contains(headVO.getPk_busibill())) {
                            settlebills.add(billsMap.get(headVO.getPk_busibill()));
                        } else {
                            nosettlebills.add(billsMap.get(headVO.getPk_busibill()));
                        }
                        ++var19_42;
                    }
                }
                if (nosettlebills.size() > 0) {
                    this.settVOsWithoutCMP(nosettlebills.toArray(new AggregatedValueObject[0]), eventType);
                }
                if (settlebills.size() == 0) {
                    return;
                }
                bills = settlebills.toArray(new AggregatedValueObject[0]);
            } else if ("1020".equals(eventType)) {
                billsMap = new HashMap();
                HashMap<String, Object> originbillsMap = new HashMap<String, Object>();
                ArrayList<Object> nosettlebills = new ArrayList<Object>();
                ArrayList<Object> arrayList = new ArrayList<Object>();
                AggregatedValueObject[] orginBills = this.getOriginBill((AggregatedValueObject[])bills);
                for (Object bill : bills) {
                    billsMap.put(bill.getParentVO().getPrimaryKey(), bill);
                }
                for (Object bill : orginBills) {
                    originbillsMap.put(bill.getParentVO().getPrimaryKey(), bill);
                }
                SettlementAggVO[] aggVOs = CmpInterfaceProxy.INSTANCE.getQueryService().querySettlementAggsByPk_busibills(billsMap.keySet().toArray(new String[0]));
                if (aggVOs == null || aggVOs.length == 0) {
                    for (Object object : bills) {
                        BaseBillVO originBill = (BaseBillVO)((AggregatedValueObject)originbillsMap.get(object.getParentVO().getPrimaryKey())).getParentVO();
                        UFBoolean isrefund = (UFBoolean)originBill.getAttributeValue("isrefund");
                        UFDouble money = (UFDouble)originBill.getAttributeValue("money");
                        String pk_billtype = (String)originBill.getAttributeValue("pk_billtype");
                        if (isrefund != null && isrefund.booleanValue() && money.compareTo((Object)UFDouble.ZERO_DBL) < 0 && ("F0".equals(pk_billtype) || "F2".equals(pk_billtype))) {
                            nosettlebills.add(object);
                            continue;
                        }
                        if (originBill.getEffectstatus() != BillEnumCollection.InureSign.OKINURE.VALUE) {
                            nosettlebills.add(object);
                            continue;
                        }
                        arrayList.add(object);
                    }
                } else {
                    for (SettlementAggVO settlementAggVO : aggVOs) {
                        SettlementHeadVO headVO = (SettlementHeadVO)settlementAggVO.getParentVO();
                        BaseBillVO originBill = (BaseBillVO)((AggregatedValueObject)originbillsMap.get(headVO.getPk_busibill())).getParentVO();
                        UFBoolean isrefund = (UFBoolean)originBill.getAttributeValue("isrefund");
                        UFDouble money = (UFDouble)originBill.getAttributeValue("money");
                        String pk_billtype = (String)originBill.getAttributeValue("pk_billtype");
                        if (isrefund != null && isrefund.booleanValue() && money.compareTo((Object)UFDouble.ZERO_DBL) < 0 && ("F0".equals(pk_billtype) || "F2".equals(pk_billtype))) {
                            nosettlebills.add(billsMap.get(headVO.getPk_busibill()));
                            continue;
                        }
                        if (billsMap.keySet().contains(headVO.getPk_busibill()) || originBill.getEffectstatus() == BillEnumCollection.InureSign.OKINURE.VALUE) {
                            arrayList.add(billsMap.get(headVO.getPk_busibill()));
                            continue;
                        }
                        nosettlebills.add(billsMap.get(headVO.getPk_busibill()));
                    }
                }
                if (nosettlebills.size() > 0) {
                    this.settVOsWithoutCMP(nosettlebills.toArray(new AggregatedValueObject[0]), eventType);
                }
                if (arrayList.size() == 0) {
                    return;
                }
                bills = arrayList.toArray(new AggregatedValueObject[0]);
            }
            for (Object object : bills) {
                if (!this.isSettleBill((AggregatedValueObject)object)) {
                    nosettAggvos.add(object);
                    continue;
                }
                settAggvos.add(object);
            }
            if ("1004".equals(eventType)) {
                for (AggregatedValueObject aggregatedValueObject : this.getOrigBills(event)) {
                    if (!"1004".equals(eventType)) continue;
                    if (!this.isSettleBill(aggregatedValueObject)) {
                        editOldNoSettVOs.add(aggregatedValueObject);
                        continue;
                    }
                    editOldSettVOs.add(aggregatedValueObject);
                }
            }
        }
        if (!isCmpEnable) {
            this.settVOsWithoutCMP((AggregatedValueObject[])bills, eventType);
            if (!CollectionUtils.isEmpty(settAggvos) && this.errorMessage != null) {
                throw new BusinessException(this.errorMessage);
            }
            return;
        }
        if (nosettAggvos.size() != 0) {
            this.settVOsWithoutCMP((AggregatedValueObject[])nosettAggvos.toArray(new BaseAggVO[0]), eventType);
        }
        if (SagasUtils.isCompensateStage()) {
            return;
        }
        ISettlement settleServ = CmpInterfaceProxy.INSTANCE.getSettlement();
        if ("1004".equals(eventType)) {
            if (settAggvos.size() == 0 && editOldSettVOs.size() == 0) {
                return;
            }
            if (settAggvos.size() != 0) {
                if (((BaseAggVO)settAggvos.get(0)).getHeadVO().getBillstatus().intValue() == BillEnumCollection.BillSatus.SAVE.VALUE.intValue()) {
                    settleServ.notifySettlementBatchSave(BillSettlementUtils.settleInfo4Insert((AggregatedValueObject[])((AggregatedValueObject[])settAggvos.toArray(new BaseAggVO[0])), null));
                } else {
                    settleServ.notifySettlementBatchTempSave(BillSettlementUtils.settleInfo4Insert((AggregatedValueObject[])((AggregatedValueObject[])settAggvos.toArray(new BaseAggVO[0])), null));
                }
            } else if (settAggvos.size() == 0 && editOldSettVOs.size() != 0) {
                settleServ.notifySettlementBatchDelete(this.getCmpMsgs(editOldSettVOs.toArray(new AggregatedValueObject[0])));
            }
        }
        if ((bills = (AggregatedValueObject[])settAggvos.toArray(new BaseAggVO[0])).length == 0) {
            return;
        }
        if ("200602".equals(eventType)) {
            settleServ.notifySettlementBatchTempSave(BillSettlementUtils.settleInfo4Insert((AggregatedValueObject[])bills, (SettleEnumCollection.OperateType)SettleEnumCollection.OperateType.ADD));
        } else if ("1002".equals(eventType)) {
            settleServ.notifySettlementBatchSave(BillSettlementUtils.settleInfo4Insert((AggregatedValueObject[])bills, (SettleEnumCollection.OperateType)SettleEnumCollection.OperateType.ADD));
        } else if ("1020".equals(eventType)) {
            settleServ.notifySettlementBatchAudit(this.getCmpMsgs((AggregatedValueObject[])bills));
            new BillRetiveInfoUtils().retryInfos((AggregatedValueObject[])bills);
        } else if ("1006".equals(eventType)) {
            ArrayList<Object> fromSettleInfos = new ArrayList<Object>();
            ArrayList<Object> vos = new ArrayList<Object>();
            ArrayList<Object> saveToTemporailyVOs = new ArrayList<Object>();
            for (Object bill : bills) {
                boolean bl;
                UFBoolean uFBoolean = ((BaseAggVO)bill).getHeadVO().getIsfromindependent();
                UFBoolean saveToTemporailyObj = ((BaseAggVO)bill).getHeadVO().getSaveToTemporarily();
                boolean saveToTemporaily = saveToTemporailyObj != null && saveToTemporailyObj.booleanValue();
                boolean bl2 = bl = uFBoolean != null && uFBoolean.booleanValue();
                if (bl && (saveToTemporailyObj == null || saveToTemporailyObj != null && !saveToTemporaily)) {
                    fromSettleInfos.add(bill);
                }
                if (saveToTemporaily) {
                    saveToTemporailyVOs.add(bill);
                    continue;
                }
                vos.add(bill);
            }
            if (fromSettleInfos.size() > 0) {
                settleServ.notifySettlementBatchUnAssociate(this.getCmpMsgs(fromSettleInfos.toArray(new AggregatedValueObject[0])));
            } else if (vos.size() > 0) {
                settleServ.notifySettlementBatchDelete(this.getCmpMsgs(vos.toArray(new AggregatedValueObject[0])));
            }
            if (saveToTemporailyVOs.size() > 0) {
                settleServ.notifySettlementBatchTempSave(BillSettlementUtils.settleInfo4Insert((AggregatedValueObject[])bills, null));
            }
        } else if ("1021".equals(eventType)) {
            settleServ.notifySettlementBatchReserveAudit(this.getCmpMsgs((AggregatedValueObject[])bills));
            String[] pks = new String[bills.length];
            for (int i = 0; i < bills.length; ++i) {
                pks[i] = bills[i].getParentVO().getPrimaryKey();
            }
            BaseAggVO[] newAggVOs = ((IArapBillService)NCLocator.getInstance().lookup(IArapBillService.class)).queryArapBillByPKs(pks, (String)bills[0].getParentVO().getAttributeValue("pk_billtype"));
            for (int i = 0; i < newAggVOs.length; ++i) {
                newAggVOs[i].getParentVO().setAttributeValue("modifiedtime", (Object)new UFDate());
                newAggVOs[i].getParentVO().setAttributeValue("modifier", (Object)InvocationInfoProxy.getInstance().getUserId());
                newAggVOs[i].getParentVO().setAttributeValue("billstatus", (Object)BillEnumCollection.BillSatus.SAVE.VALUE);
            }
            settleServ.notifySettlementBatchSave(BillSettlementUtils.settleInfo4Insert((AggregatedValueObject[])newAggVOs, null));
            new BillRetiveInfoUtils().retryInfos((AggregatedValueObject[])bills);
        }
    }

    private boolean isSettleBill(AggregatedValueObject bill) {
        BaseItemVO[] items;
        UFBoolean isrefund = (UFBoolean)bill.getParentVO().getAttributeValue("isrefund");
        UFDouble money = (UFDouble)bill.getParentVO().getAttributeValue("money");
        String pk_billtype = (String)bill.getParentVO().getAttributeValue("pk_billtype");
        if (isrefund != null && isrefund.booleanValue() && money.compareTo((Object)UFDouble.ZERO_DBL) < 0 && ("F0".equals(pk_billtype) || "F2".equals(pk_billtype))) {
            return false;
        }
        SettlementBodyVO metavo = new SettlementBodyVO();
        ArrayList<SettlementBodyVO> metasList = new ArrayList<SettlementBodyVO>();
        for (BaseItemVO item : items = (BaseItemVO[])bill.getChildrenVO()) {
            if (item.getIsdiscount() != null && !UFBoolean.FALSE.equals((Object)item.getIsdiscount())) continue;
            metasList.add(metavo);
        }
        return !metasList.isEmpty();
    }

    private void settVOsWithoutCMP(AggregatedValueObject[] bills, String eventType) throws BusinessException {
        if ("1020".equals(eventType)) {
            for (AggregatedValueObject vo : bills) {
                BaseBillVO parent = (BaseBillVO)vo.getParentVO();
                parent.setBillstatus(BillEnumCollection.BillSatus.SIGN.VALUE);
                parent.setEffectstatus(BillEnumCollection.InureSign.OKINURE.VALUE);
                parent.setEffectuser(parent.getApprover());
                parent.setEffectdate(parent.getApprovedate().getDate());
                parent.setSigndate(parent.getApprovedate().getDate());
                parent.setSignuser(parent.getApprover());
            }
            if (!SagasUtils.isCompensateStage()) {
                new BillEffectBatchBSAction().updateVO(bills);
            }
        } else if ("1021".equals(eventType)) {
            for (AggregatedValueObject vo : bills) {
                BaseBillVO parent = (BaseBillVO)vo.getParentVO();
                parent.setBillstatus(BillEnumCollection.BillSatus.AUDIT.VALUE);
                parent.setEffectstatus(BillEnumCollection.InureSign.NOINURE.VALUE);
                parent.setSigndate(null);
                parent.setSignuser(null);
            }
            if (!SagasUtils.isCompensateStage()) {
                new BillUnEffectBatchBSAction().updateVO(bills);
            }
        }
    }

    private CmpMsg[] getCmpMsgs(AggregatedValueObject[] bills) {
        CmpMsg[] msgs = new CmpMsg[bills.length];
        for (int i = 0; i < bills.length; ++i) {
            msgs[i] = BillSettlementUtils.settleInfo4Query((AggregatedValueObject)bills[i]);
        }
        return msgs;
    }

    protected AggregatedValueObject[] getBills(IBusinessEvent event) {
        BusinessEvent e;
        Object object = null;
        if (event instanceof BusinessEvent) {
            e = (BusinessEvent)event;
            object = e.getObject();
        } else if (event instanceof BdUpdateEvent) {
            e = (BdUpdateEvent)event;
            object = e.getNewObject();
        }
        AggregatedValueObject[] bills = null;
        if (null != object) {
            bills = object.getClass().isArray() ? (AggregatedValueObject[])object : new AggregatedValueObject[]{(AggregatedValueObject)object};
        }
        return bills;
    }

    protected AggregatedValueObject[] getOrigBills(IBusinessEvent event) {
        Object object = null;
        if (!(event instanceof BdUpdateEvent)) {
            return null;
        }
        BdUpdateEvent e = (BdUpdateEvent)event;
        object = e.getOldObject();
        AggregatedValueObject[] bills = null;
        if (null != object) {
            bills = object.getClass().isArray() ? (AggregatedValueObject[])object : new AggregatedValueObject[]{(AggregatedValueObject)object};
        }
        return bills;
    }
}


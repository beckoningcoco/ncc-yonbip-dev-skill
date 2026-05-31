/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.businessevent.BdUpdateEvent
 *  nc.bs.businessevent.BusinessEvent
 *  nc.bs.businessevent.EventDispatcher
 *  nc.bs.businessevent.IBusinessEvent
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.impl.pubapp.env.BSContext
 *  nc.itf.imag.lightbus.IImagPubService
 *  nc.md.MDBaseQueryFacade
 *  nc.md.model.IAttribute
 *  nc.md.model.IBean
 *  nc.pubitf.para.SysInitQuery
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.lang.UFBoolean
 */
package nc.bs.arap.actions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.arap.billact.IValidatorFactory;
import nc.bs.arap.billact.UpdateBatchBSAction;
import nc.bs.arap.busireg.ArapBillUpdateChecker;
import nc.bs.arap.busireg.BillUpdateChecker;
import nc.bs.arap.util.ArapBillVOUtils;
import nc.bs.arap.util.ArapBusiLogUtils;
import nc.bs.arap.util.ArapVOUtils;
import nc.bs.arap.util.BillAccountCalendarUtils;
import nc.bs.arap.util.BillBankUtils;
import nc.bs.arap.util.BillStatusUtils;
import nc.bs.arap.util.BillTermUtils;
import nc.bs.arap.validator.CrossRuleCheckValidator;
import nc.bs.arap.validator.ValidatorFactory;
import nc.bs.businessevent.BdUpdateEvent;
import nc.bs.businessevent.BusinessEvent;
import nc.bs.businessevent.EventDispatcher;
import nc.bs.businessevent.IBusinessEvent;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.impl.pubapp.env.BSContext;
import nc.itf.imag.lightbus.IImagPubService;
import nc.md.MDBaseQueryFacade;
import nc.md.model.IAttribute;
import nc.md.model.IBean;
import nc.pubitf.para.SysInitQuery;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.utils.ARAPModuleEnableUtil;
import nc.vo.arap.utils.StringUtil;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFBoolean;

public abstract class BillUpdateBatchBSAction
extends UpdateBatchBSAction {
    protected static int TEMP_2_TEMP = 0;
    protected static int TEMP_2_SAVE = 1;
    protected static int SAVE_2_TEMP = 2;
    protected static int SAVE_2_SAVE = 3;
    protected Map<String, Integer> childvostatmap;

    public BillUpdateBatchBSAction() {
        this.validatorCode.add(77);
        this.validatorCode.add(84);
        this.validatorCode.add(66);
        this.validatorCode.add(15);
        this.validatorCode.add(8);
        this.validatorCode.add(44);
        this.validatorCode.add(39);
        this.validatorCode.add(26);
        this.validatorCode.add(49);
        this.validatorCode.add(78);
        this.validatorCode.add(79);
        this.validatorCode.add(81);
        this.childvostatmap = null;
    }

    @Override
    protected IValidatorFactory getValidatorFactory() {
        ValidatorFactory vf = new ValidatorFactory();
        return vf;
    }

    @Override
    protected void doAfterFireEvent(AggregatedValueObject[] bills, AggregatedValueObject[] orginBills) throws BusinessException {
        int updateType = this.getUpdateType(bills, orginBills);
        if (updateType == TEMP_2_SAVE) {
            EventDispatcher.fireEvent((IBusinessEvent)new BusinessEvent((String)this.tmpMap.get("beanid"), "1002", (Object[])bills));
        } else if (updateType == SAVE_2_TEMP) {
            EventDispatcher.fireEvent((IBusinessEvent)new BusinessEvent((String)this.tmpMap.get("beanid"), "1006", (Object[])orginBills));
        } else if (updateType == SAVE_2_SAVE) {
            this.afterEventSave2Save(bills, orginBills);
        }
    }

    protected void afterEventSave2Save(AggregatedValueObject[] bills, AggregatedValueObject[] orginBills) throws BusinessException {
        EventDispatcher.fireEvent((IBusinessEvent)new BdUpdateEvent((String)this.tmpMap.get("beanid"), "1004", (Object)orginBills, (Object)bills));
    }

    @Override
    protected void doBeforeFireEvent(AggregatedValueObject[] bills, AggregatedValueObject[] orginBills) throws BusinessException {
        int updateType = this.getUpdateType(bills, orginBills);
        ArapConstant constant = new ArapConstant();
        BSContext.getInstance().setSession(ArapConstant.ARAP_TBB_ACTIONNAME, (Object)constant.ARAP_NTB_EDIT_KEY);
        if (bills != null && bills.length > 0 && ((BaseAggVO)bills[0]).isAlarmPassed()) {
            BSContext.getInstance().setSession(ArapConstant.ARAP_TBB_FLAG, (Object)ArapConstant.ARAP_TBB_NOCHECK);
        }
        if (updateType == TEMP_2_SAVE) {
            EventDispatcher.fireEvent((IBusinessEvent)new BusinessEvent((String)this.tmpMap.get("beanid"), "1005", (Object[])orginBills));
            EventDispatcher.fireEvent((IBusinessEvent)new BusinessEvent((String)this.tmpMap.get("beanid"), "1006", (Object[])orginBills));
            EventDispatcher.fireEvent((IBusinessEvent)new BusinessEvent((String)this.tmpMap.get("beanid"), "1001", (Object[])bills));
        } else if (updateType == SAVE_2_TEMP) {
            EventDispatcher.fireEvent((IBusinessEvent)new BusinessEvent((String)this.tmpMap.get("beanid"), "1005", (Object[])bills));
        } else if (updateType == SAVE_2_SAVE) {
            this.beforeEventSave2Save(bills, orginBills);
        }
    }

    protected void beforeEventSave2Save(AggregatedValueObject[] bills, AggregatedValueObject[] orginBills) throws BusinessException {
        EventDispatcher.fireEvent((IBusinessEvent)new BdUpdateEvent((String)this.tmpMap.get("beanid"), "1003", (Object)orginBills, (Object)bills));
    }

    public int getUpdateType(AggregatedValueObject[] bills, AggregatedValueObject[] orginBills) {
        int oldStatus = ((BaseBillVO)orginBills[0].getParentVO()).getBillstatus();
        int newStatus = ((BaseBillVO)bills[0].getParentVO()).getBillstatus();
        if (oldStatus == BillEnumCollection.BillSatus.TEMPEORARY.VALUE || oldStatus == BillEnumCollection.BillSatus.UNCOMFIRM.VALUE) {
            if (newStatus == BillEnumCollection.BillSatus.TEMPEORARY.VALUE || newStatus == BillEnumCollection.BillSatus.UNCOMFIRM.VALUE) {
                return TEMP_2_TEMP;
            }
            return TEMP_2_SAVE;
        }
        if (newStatus == BillEnumCollection.BillSatus.TEMPEORARY.VALUE || newStatus == BillEnumCollection.BillSatus.UNCOMFIRM.VALUE) {
            return SAVE_2_TEMP;
        }
        return SAVE_2_SAVE;
    }

    @Override
    protected void doAfterUpdate(AggregatedValueObject[] bills, AggregatedValueObject[] orginBills) throws BusinessException {
        BillTermUtils.dealBillTerm((AggregatedValueObject[])bills, this.childvostatmap, (AggregatedValueObject[])orginBills);
        BillTermUtils.retBodyTermVOS(bills);
        BillBankUtils.fillSettleBankrelated_code(bills);
        ArapBusiLogUtils.insertSmartBusiLogs(ArapConstant.ARAP_ACTION_EDIT, (BaseAggVO)bills[0], (BaseAggVO)orginBills[0], ArapConstant.SYS_NAME);
        for (AggregatedValueObject bill : bills) {
            if (bill.getParentVO().getAttributeValue("coordflag") == null || !"1".equals(bill.getParentVO().getAttributeValue("coordflag").toString()) || !ARAPModuleEnableUtil.isImagEnabled(InvocationInfoProxy.getInstance().getGroupId())) continue;
            IImagPubService imagService = (IImagPubService)NCLocator.getInstance().lookup(IImagPubService.class);
            imagService.updateBillNo(bill.getParentVO().getPrimaryKey(), (String)bill.getParentVO().getAttributeValue("billno"));
        }
    }

    @Override
    protected void doBeforeUpdate(AggregatedValueObject[] bills, AggregatedValueObject[] orginBills) throws BusinessException {
        ArapBillPubUtil.fillTradeTypeInfo(bills);
        for (AggregatedValueObject bill : bills) {
            ArapBillPubUtil.processMoneyOnlySum(bill);
        }
        ArapBillVOUtils.prepareDefaultInfo(bills, true);
        int updateType = this.getUpdateType(bills, orginBills);
        for (AggregatedValueObject bill : bills) {
            bill.getParentVO().setStatus(1);
        }
        if (updateType == TEMP_2_SAVE || updateType == SAVE_2_SAVE) {
            for (AggregatedValueObject bill : bills) {
                for (CircularlyAccessibleValueObject item : bill.getChildrenVO()) {
                    if (item.getStatus() == 2 || item.getStatus() == 3) continue;
                    item.setStatus(1);
                }
            }
        }
        if (updateType == TEMP_2_SAVE || updateType == SAVE_2_SAVE) {
            BillAccountCalendarUtils.setAccperiodYearMonth(bills);
        }
        this.checkIsCorrdBillMoneyControl(bills, orginBills);
        this.checkOtherSystemBill(bills, orginBills);
        new CrossRuleCheckValidator().validate(bills);
    }

    protected void checkOtherSystemBill(AggregatedValueObject[] bills, AggregatedValueObject[] orginBills) throws BusinessException {
        ArapBillUpdateChecker defaultCheck = new ArapBillUpdateChecker();
        try {
            int i = 0;
            for (AggregatedValueObject newbill : bills) {
                BaseAggVO bill = (BaseAggVO)newbill;
                BaseAggVO oriBill = (BaseAggVO)orginBills[i++];
                BaseItemVO[] vosOld = (BaseItemVO[])oriBill.getChildrenVO();
                String top_billtype = vosOld[0].getTop_billtype();
                ArrayList<ArapBillUpdateChecker> executeCheckers = new ArrayList<ArapBillUpdateChecker>();
                executeCheckers.add(defaultCheck);
                Map<String, List<BaseItemVO>> rowsChangeMap = this.getBillRowsChangeMap((AggregatedValueObject)bill, (AggregatedValueObject)oriBill);
                List<BaseItemVO> addlines = rowsChangeMap.get("bodyAddvos");
                List<BaseItemVO> deletelines = rowsChangeMap.get("bodyDeletevos");
                Map<String, Map<String, Object[]>> bodyfieldchange = this.getBodyFieldValueChangeMap(bill, oriBill);
                Map<String, Object[]> headfieldchange = this.getHeadFieldValueChangeMap(bill, oriBill);
                for (BillUpdateChecker billUpdateChecker : executeCheckers) {
                    String errmsg;
                    if (billUpdateChecker.canUpdateBillWithoutCtrl(bill)) continue;
                    if (!addlines.isEmpty() && !StringUtil.isEmpty(errmsg = billUpdateChecker.canAddLine(top_billtype, addlines))) {
                        throw new BusinessException(errmsg);
                    }
                    if (!deletelines.isEmpty() && !StringUtil.isEmpty(errmsg = billUpdateChecker.canDeleteLine(top_billtype, deletelines))) {
                        throw new BusinessException(errmsg);
                    }
                    if (!bodyfieldchange.isEmpty() && !StringUtil.isEmpty(errmsg = billUpdateChecker.canUpdateBodyFieldValue(bodyfieldchange, bill, oriBill))) {
                        throw new BusinessException(errmsg);
                    }
                    if (headfieldchange.isEmpty() || StringUtil.isEmpty(errmsg = billUpdateChecker.canUpdateHeadFieldValue(headfieldchange, bill, oriBill))) continue;
                    throw new BusinessException(errmsg);
                }
            }
        }
        catch (BusinessException e) {
            throw new BusinessException(e.getMessage(), (Throwable)e);
        }
    }

    private Map<String, Object[]> getHeadFieldValueChangeMap(BaseAggVO bill, BaseAggVO oriBill) throws BusinessException {
        HashMap<String, Object[]> headfieldchange = new HashMap<String, Object[]>();
        BaseBillVO pvo = (BaseBillVO)bill.getParentVO();
        BaseBillVO pvoold = (BaseBillVO)oriBill.getParentVO();
        IBean bean = MDBaseQueryFacade.getInstance().getBeanByFullClassName(pvo.getClass().getName());
        List attrs = bean.getAttributesOfModel();
        for (IAttribute attr : attrs) {
            Object oldvalue;
            Object value;
            String fieldcode;
            if (attr.isCalculation() || BaseBillVO.UPDATEIGNORE_LIST.contains(fieldcode = attr.getName()) || this.simpEquals(value = pvo.getAttributeValue(fieldcode), oldvalue = pvoold.getAttributeValue(fieldcode))) continue;
            headfieldchange.put(fieldcode, new Object[]{value, oldvalue});
        }
        return headfieldchange;
    }

    private Map<String, Map<String, Object[]>> getBodyFieldValueChangeMap(BaseAggVO bill, BaseAggVO oriBill) throws BusinessException {
        HashMap<String, Map<String, Object[]>> map = new HashMap<String, Map<String, Object[]>>();
        BaseItemVO[] vosNew = (BaseItemVO[])bill.getChildrenVO();
        BaseItemVO[] vosOld = (BaseItemVO[])oriBill.getChildrenVO();
        HashMap<String, BaseItemVO> mapOld = new HashMap<String, BaseItemVO>();
        for (BaseItemVO vo : vosOld) {
            mapOld.put(vo.getPrimaryKey(), vo);
        }
        IBean bean = MDBaseQueryFacade.getInstance().getBeanByFullClassName(vosNew[0].getClass().getName());
        List attrs = bean.getAttributesOfModel();
        for (BaseItemVO itemvo : vosNew) {
            if (itemvo.getPrimaryKey() == null) continue;
            HashMap<String, Object[]> bodyfieldchange = new HashMap<String, Object[]>();
            map.put(itemvo.getPrimaryKey(), bodyfieldchange);
            BaseItemVO itemvoOld = (BaseItemVO)mapOld.get(itemvo.getPrimaryKey());
            for (IAttribute attr : attrs) {
                if (attr.isCalculation()) continue;
                String fieldcode = attr.getName();
                Object oldvalue = itemvoOld.getAttributeValue(fieldcode);
                Object value = itemvo.getAttributeValue(fieldcode);
                if (this.simpEquals(value, oldvalue)) continue;
                bodyfieldchange.put(fieldcode, new Object[]{value, oldvalue});
            }
        }
        return map;
    }

    private Map<String, List<BaseItemVO>> getBillRowsChangeMap(AggregatedValueObject bill, AggregatedValueObject orginBill) throws BusinessException {
        HashMap<String, List<BaseItemVO>> map = new HashMap<String, List<BaseItemVO>>();
        ArrayList<BaseItemVO> addlist = new ArrayList<BaseItemVO>();
        ArrayList deletelist = new ArrayList();
        map.put("bodyAddvos", addlist);
        map.put("bodyDeletevos", deletelist);
        BaseItemVO[] vosOld = (BaseItemVO[])orginBill.getChildrenVO();
        HashMap<String, BaseItemVO> mapOld = new HashMap<String, BaseItemVO>();
        BaseItemVO[] vosNew = (BaseItemVO[])bill.getChildrenVO();
        for (BaseItemVO vo : vosOld) {
            mapOld.put(vo.getPrimaryKey(), vo);
        }
        for (BaseItemVO vo : vosNew) {
            if (vo.getPrimaryKey() == null) {
                addlist.add(vo);
                continue;
            }
            mapOld.remove(vo.getPrimaryKey());
        }
        if (mapOld.size() > 0) {
            for (Map.Entry entry : mapOld.entrySet()) {
                deletelist.add(entry.getValue());
            }
        }
        return map;
    }

    private boolean simpEquals(Object s1, Object s2) {
        if (s1 == null && s2 == null) {
            return true;
        }
        if (s1 == null || s2 == null) {
            return false;
        }
        return s1.equals(s2);
    }

    protected void checkIsCorrdBillMoneyControl(AggregatedValueObject[] bills, AggregatedValueObject[] orginBills) throws BusinessException {
        try {
            int i = 0;
            for (AggregatedValueObject bill : bills) {
                AggregatedValueObject oriBill = orginBills[i++];
                BaseBillVO billVO = (BaseBillVO)bill.getParentVO();
                BaseBillVO billOriVO = (BaseBillVO)oriBill.getParentVO();
                if (billVO.getSrc_syscode().intValue() != BillEnumCollection.FromSystem.XTDJ.VALUE.intValue() || !this.isCorrdBillMoneyControl(billVO)) continue;
                if (!billVO.getMoney().equals((Object)billOriVO.getMoney())) {
                    throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0434"));
                }
                CircularlyAccessibleValueObject[] childrenVO = bill.getChildrenVO();
                CircularlyAccessibleValueObject[] orichildrenVO = oriBill.getChildrenVO();
                for (int j = 0; j < Math.min(childrenVO.length, orichildrenVO.length); ++j) {
                    if (Objects.equals(childrenVO[j].getAttributeValue("pk_currtype"), orichildrenVO[j].getAttributeValue("pk_currtype"))) continue;
                    throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0029"));
                }
            }
        }
        catch (BusinessException e) {
            throw new BusinessException(e.getMessage(), (Throwable)e);
        }
    }

    private boolean isCorrdBillMoneyControl(BaseBillVO headVO) throws BusinessException {
        UFBoolean flag = UFBoolean.FALSE;
        boolean exp = headVO.getSyscode().intValue() == BillEnumCollection.FromSystem.AR.VALUE.intValue() || ArapBillPubUtil.isARSysBilltype(headVO.getPk_billtype());
        flag = SysInitQuery.getParaBoolean((String)headVO.getPk_org(), (String)(exp ? "AR18" : "AP18"));
        return flag.booleanValue();
    }

    @Override
    protected AggregatedValueObject[] doUpdate(AggregatedValueObject[] bills, AggregatedValueObject[] orginBills) throws BusinessException {
        this.childvostatmap = BillStatusUtils.enUpdateVOStauts((AggregatedValueObject[])bills, (AggregatedValueObject[])orginBills);
        this.beforeUpdateDefValue(bills, orginBills);
        ArapVOUtils.resetMoneyBal(bills);
        return super.doUpdate(bills, orginBills);
    }

    protected void beforeUpdateDefValue(AggregatedValueObject[] bills, AggregatedValueObject[] orginBills) {
        BillStatusUtils.enCUDVODefVals((AggregatedValueObject[])bills, (boolean)true, (AggregatedValueObject[])orginBills);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Log
 *  nc.bs.logging.Logger
 *  nc.bs.pf.pub.PfDataCache
 *  nc.itf.fi.pub.Currency
 *  nc.pubitf.cmp.settlement.ICmpSettlementPubQueryService
 *  nc.vo.arap.gathering.AggGatheringBillVO
 *  nc.vo.arap.pay.AggPayBillVO
 *  nc.vo.cmp.settlement.SettlementAggVO
 *  nc.vo.fip.service.FipMessageVO
 *  nc.vo.fip.service.FipMsgResultVO
 *  nc.vo.fip.service.FipRelationInfoVO
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.fipub.utils.ArrayUtil
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.ml.MultiLangContext
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.billtype.BilltypeVO
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pubapp.calculator.Calculator
 *  nc.vo.pubapp.calculator.Condition
 *  nc.vo.pubapp.calculator.data.IRelationForItems
 *  nc.vo.pubapp.pattern.pub.MapList
 *  nc.vo.pubapp.scale.ScaleUtils
 *  nccloud.commons.lang.ArrayUtils
 *  nccloud.pubitf.arap.arappub.IArapBillRefundService
 *  nccloud.pubitf.arap.arappub.IArapLinkCmpService
 */
package nc.bs.arap.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import nc.bs.arap.bill.ArapBillCalUtil;
import nc.bs.arap.bill.ArapBillDAO;
import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.arap.util.BillRetiveInfoUtils;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Log;
import nc.bs.logging.Logger;
import nc.bs.pf.pub.PfDataCache;
import nc.itf.fi.pub.Currency;
import nc.pubitf.arap.bill.IArapBillPubService;
import nc.pubitf.cmp.settlement.ICmpSettlementPubQueryService;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.cal.BillMathCalculator;
import nc.vo.arap.gathering.AggGatheringBillVO;
import nc.vo.arap.pay.AggPayBillVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.utils.ARAPModuleEnableUtil;
import nc.vo.arappub.calculator.data.RelationItemForCal_Credit;
import nc.vo.cmp.settlement.SettlementAggVO;
import nc.vo.fip.service.FipMessageVO;
import nc.vo.fip.service.FipMsgResultVO;
import nc.vo.fip.service.FipRelationInfoVO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.fipub.utils.ArrayUtil;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.ml.MultiLangContext;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.SuperVO;
import nc.vo.pub.billtype.BilltypeVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.calculator.Calculator;
import nc.vo.pubapp.calculator.Condition;
import nc.vo.pubapp.calculator.data.IRelationForItems;
import nc.vo.pubapp.pattern.pub.MapList;
import nc.vo.pubapp.scale.ScaleUtils;
import nccloud.bs.arap.util.FipMessageUtils;
import nccloud.commons.lang.ArrayUtils;
import nccloud.pubitf.arap.arappub.IArapBillRefundService;
import nccloud.pubitf.arap.arappub.IArapLinkCmpService;

public final class BillEffectUtils {
    static AggregatedValueObject[] filterBills(AggregatedValueObject[] bills) {
        for (AggregatedValueObject bill : bills) {
            BaseBillVO parentVO = (BaseBillVO)bill.getParentVO();
            String pkbilltype = (String)parentVO.getAttributeValue("pk_billtype");
            UFBoolean isrefund = (UFBoolean)parentVO.getAttributeValue("isrefund");
            if ((parentVO.getIsinit() == null || !parentVO.getIsinit().booleanValue()) && (!"F3".equals(pkbilltype) && !"F1".equals(pkbilltype) || isrefund == null || !isrefund.booleanValue())) continue;
            return new AggregatedValueObject[0];
        }
        return bills;
    }

    public static <T extends AggregatedValueObject> void sendDAPMessgeDel(T[] bills) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])BillEffectUtils.filterBills(bills))) {
            return;
        }
        ArrayList<FipMessageVO> messageVOs = new ArrayList<FipMessageVO>();
        for (int i = 0; i < bills.length; ++i) {
            CircularlyAccessibleValueObject[] childrenVO;
            String pk_tradetype = (String)bills[i].getParentVO().getAttributeValue("pk_tradetype");
            FipRelationInfoVO reVO = BillEffectUtils.constructFipRalactionInfo(bills[i], pk_tradetype);
            FipMessageVO messageVO = new FipMessageVO();
            messageVO.setBillVO(bills[i]);
            messageVO.setMessagetype(1);
            messageVO.setMessageinfo(reVO);
            messageVOs.add(messageVO);
            if (!(bills[i] instanceof AggGatheringBillVO) && !(bills[i] instanceof AggPayBillVO)) continue;
            String transType = "DE";
            if (bills[i] instanceof AggPayBillVO) {
                transType = "DF";
            }
            for (CircularlyAccessibleValueObject child : childrenVO = bills[i].getChildrenVO()) {
                Integer isPrePay = (Integer)child.getAttributeValue("prepay");
                if (!isPrePay.equals(BillEnumCollection.PreSigns.ISPRE.VALUE)) continue;
                FipRelationInfoVO reVO4Pre = BillEffectUtils.constructFipRalactionInfo(bills[i], transType);
                FipMessageVO messageVO4Pre = new FipMessageVO();
                messageVO4Pre.setBillVO(bills[i]);
                messageVO4Pre.setMessagetype(1);
                messageVO4Pre.setMessageinfo(reVO4Pre);
                messageVOs.add(messageVO4Pre);
            }
        }
        BillEffectUtils.invokeFipMessage(messageVOs.toArray(new FipMessageVO[0]));
    }

    private static FipRelationInfoVO constructFipRalactionInfo(AggregatedValueObject bill, String TransType) throws BusinessException {
        FipRelationInfoVO reVO = new FipRelationInfoVO();
        SuperVO head = (SuperVO)bill.getParentVO();
        String pk_tradetype = TransType;
        String pk_group = (String)head.getAttributeValue("pk_group");
        UFDate effectdate = (UFDate)head.getAttributeValue("effectdate");
        BilltypeVO billType = PfDataCache.getBillType((String)pk_tradetype);
        if (billType == null) {
            billType = PfDataCache.getBillTypeInfo((String)pk_group, (String)pk_tradetype);
        }
        reVO.setPk_group(pk_group);
        reVO.setPk_org((String)head.getAttributeValue("pk_org"));
        reVO.setRelationID(head.getPrimaryKey());
        reVO.setPk_system(billType.getSystemcode());
        reVO.setBusidate(effectdate == null ? new UFDate() : effectdate);
        reVO.setPk_billtype(pk_tradetype);
        reVO.setPk_operator(InvocationInfoProxy.getInstance().getUserId());
        reVO.setFreedef1((String)head.getAttributeValue("billno"));
        reVO.setFreedef2(BillEffectUtils.translateScomment((String)head.getAttributeValue("scomment")));
        UFDouble money = (UFDouble)head.getAttributeValue("money");
        if (null == head.getAttributeValue("pk_currtype")) {
            head.setAttributeValue("pk_currtype", bill.getChildrenVO()[0].getAttributeValue("pk_currtype"));
        }
        money = Currency.getFormaUfValue((String)((String)head.getAttributeValue("pk_currtype")), (UFDouble)money);
        reVO.setFreedef3(money.toString());
        return reVO;
    }

    private static FipMsgResultVO[] invokeFipMessage(FipMessageVO[] messageVOs) throws BusinessException {
        if (Logger.isDebugEnabled()) {
            Logger.debug((Object)"sendMessage is over!");
        }
        return FipMessageUtils.sendMessages(messageVOs);
    }

    public static void sendDAPMessge(AggregatedValueObject[] bills) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])BillEffectUtils.filterBills(bills))) {
            return;
        }
        BaseBillVO headVO = ((BaseAggVO)bills[0]).getHeadVO();
        if (headVO.getEffectstatus() != null && BillEnumCollection.InureSign.OKINURE.VALUE.equals(headVO.getEffectstatus())) {
            String pkbilltype = (String)headVO.getAttributeValue("pk_billtype");
            UFBoolean isrefund = (UFBoolean)headVO.getAttributeValue("isrefund");
            if (("F3".equals(pkbilltype) || "F1".equals(pkbilltype)) && isrefund != null && isrefund.booleanValue()) {
                return;
            }
            if ("F2".equals(pkbilltype) || "F3".equals(pkbilltype)) {
                BillEffectUtils.dealCheckNo(bills);
                String pkgroup = (String)headVO.getAttributeValue("pk_group");
                if (ARAPModuleEnableUtil.isCMPEnable(pkgroup)) {
                    SettlementAggVO[] settvos = ((ICmpSettlementPubQueryService)NCLocator.getInstance().lookup(ICmpSettlementPubQueryService.class)).queryBillsBySourceBillID(BaseAggVO.getParentPks(bills));
                    BillEffectUtils.fipMsgWithSettInfo((AggregatedValueObject[])bills, (AggregatedValueObject[])settvos);
                    return;
                }
                BillEffectUtils.fipMessage((AggregatedValueObject[])bills);
            } else if ("F1".equals(pkbilltype) || "F0".equals(pkbilltype)) {
                List<Object> newList = new ArrayList();
                try {
                    newList = ((IArapBillPubService)NCLocator.getInstance().lookup(IArapBillPubService.class)).getChildConstrByTerm(bills);
                }
                catch (Exception e) {
                    ExceptionHandler.handleException((Exception)e);
                }
                BillEffectUtils.fipMessage((AggregatedValueObject[])newList.toArray(new AggregatedValueObject[0]));
            } else {
                BillEffectUtils.fipMessage((AggregatedValueObject[])bills);
            }
        }
    }

    static <T extends AggregatedValueObject> void fipMsgWithSettInfo(T[] bills, AggregatedValueObject[] settles) throws BusinessException {
        if (null == bills || bills.length == 0) {
            return;
        }
        AggregatedValueObject[] clonebills = (AggregatedValueObject[])bills.clone();
        if (!ArrayUtils.isEmpty((Object[])settles)) {
            BaseAggVO[] splitVobySettinfo = BillEffectUtils.splitVobySettinfo((BaseAggVO[])ArrayUtil.convertSupers2Subs((Object[])((AggregatedValueObject[])bills), BaseAggVO.class), settles);
            for (int j = 0; j < Math.min(clonebills.length, splitVobySettinfo.length); ++j) {
                clonebills[j] = splitVobySettinfo[j];
            }
        }
        BillEffectUtils.fipMessage((AggregatedValueObject[])clonebills);
    }

    static <T extends AggregatedValueObject> void fipMessage(T[] bills) throws BusinessException {
        FipMessageVO[] messageVOs = new FipMessageVO[bills.length];
        new BillRetiveInfoUtils().retryInfos((AggregatedValueObject[])bills);
        ArapBillPubUtil.refreshChildVO2HeadVO(bills);
        for (int i = 0; i < bills.length; ++i) {
            CircularlyAccessibleValueObject head = bills[i].getParentVO();
            UFDate effectdate = (UFDate)head.getAttributeValue("effectdate");
            String pk_tradetype = (String)head.getAttributeValue("pk_tradetype");
            String pk_group = (String)head.getAttributeValue("pk_group");
            FipRelationInfoVO reVO = new FipRelationInfoVO();
            reVO.setPk_group((String)head.getAttributeValue("pk_group"));
            reVO.setPk_org((String)head.getAttributeValue("pk_org"));
            reVO.setRelationID(head.getPrimaryKey());
            reVO.setPk_system(PfDataCache.getBillTypeInfo((String)pk_group, (String)pk_tradetype).getSystemcode());
            reVO.setBusidate(effectdate == null ? new UFDate() : effectdate);
            reVO.setPk_billtype(pk_tradetype);
            reVO.setPk_operator(InvocationInfoProxy.getInstance().getUserId());
            reVO.setFreedef1((String)head.getAttributeValue("billno"));
            String scomment = (String)head.getAttributeValue("scomment");
            if (StringUtil.isEmptyWithTrim((String)scomment)) {
                CircularlyAccessibleValueObject childrenVO;
                CircularlyAccessibleValueObject[] childrenVOs;
                CircularlyAccessibleValueObject[] circularlyAccessibleValueObjectArray = childrenVOs = bills[i].getChildrenVO();
                int n = circularlyAccessibleValueObjectArray.length;
                for (int j = 0; j < n && StringUtil.isEmptyWithTrim((String)(scomment = (String)(childrenVO = circularlyAccessibleValueObjectArray[j]).getAttributeValue("scomment"))); ++j) {
                }
            }
            scomment = BillEffectUtils.translateScomment(scomment);
            reVO.setFreedef2(scomment);
            UFDouble money = (UFDouble)head.getAttributeValue("money");
            if (null == head.getAttributeValue("pk_currtype")) {
                head.setAttributeValue("pk_currtype", bills[i].getChildrenVO()[0].getAttributeValue("pk_currtype"));
            }
            money = Currency.getFormaUfValue((String)((String)head.getAttributeValue("pk_currtype")), (UFDouble)money);
            reVO.setFreedef3(money.toString());
            if (pk_tradetype != null && (pk_tradetype.equals("DE") || pk_tradetype.equals("DF"))) {
                reVO.setFreedef4((String)bills[i].getParentVO().getAttributeValue("ChangeItemKeys"));
            }
            reVO.setDefdoc1((String)head.getAttributeValue("pk_busitype"));
            FipMessageVO messageVO = new FipMessageVO();
            messageVO.setBillVO(bills[i]);
            messageVO.setMessagetype(0);
            messageVO.setMessageinfo(reVO);
            messageVOs[i] = messageVO;
        }
        BillEffectUtils.invokeFipMessage(messageVOs);
    }

    private static String translateScomment(String scomment) throws BusinessException {
        ArapBillDAO dao = new ArapBillDAO();
        String ret = null;
        Object[] vos = dao.getSummoryVOBypk(new String[]{scomment});
        if (ArrayUtils.isNotEmpty((Object[])vos)) {
            int currLangIndex = MultiLangContext.getInstance().getCurrentLangSeq();
            String nameField = "summaryname";
            if (currLangIndex != 1) {
                nameField = "name" + currLangIndex;
            }
            return (ret = (String)vos[0].getAttributeValue(nameField)) == null ? scomment : ret;
        }
        return scomment;
    }

    public static AggregatedValueObject[] dealCheckNo(AggregatedValueObject[] bills) throws BusinessException {
        String pk_group = (String)bills[0].getParentVO().getAttributeValue("pk_group");
        if (ARAPModuleEnableUtil.isEnable(pk_group, "3618")) {
            HashSet<String> checkNoSet = new HashSet<String>();
            for (AggregatedValueObject bill : bills) {
                CircularlyAccessibleValueObject[] items;
                for (CircularlyAccessibleValueObject item : items = bill.getChildrenVO()) {
                    String checkno = (String)item.getAttributeValue("checkno");
                    if (StringUtil.isEmpty((String)checkno)) continue;
                    checkNoSet.add(checkno);
                }
            }
            if (checkNoSet.size() > 0) {
                HashMap<String, String> checkNoMap = new HashMap<String, String>();
                Object[] vos = ((IArapLinkCmpService)NCLocator.getInstance().lookup(IArapLinkCmpService.class)).getBaseInfoBatchByPks(checkNoSet.toArray(new String[0]));
                if (ArrayUtils.isNotEmpty((Object[])vos)) {
                    for (Object vo : vos) {
                        checkNoMap.put(vo.getPk_register(), vo.getFbmbillno());
                    }
                    for (AggregatedValueObject bill : bills) {
                        CircularlyAccessibleValueObject[] items;
                        for (CircularlyAccessibleValueObject item : items = bill.getChildrenVO()) {
                            String checkno = (String)item.getAttributeValue("checkno");
                            if (StringUtil.isEmpty((String)checkno) || !checkNoMap.containsKey(checkno)) continue;
                            item.setAttributeValue("checkno", checkNoMap.get(checkno));
                        }
                    }
                }
            }
            return bills;
        }
        return bills;
    }

    private static Map<String, AggregatedValueObject> constMap(AggregatedValueObject[] bills, String key) {
        HashMap<String, AggregatedValueObject> map = new HashMap<String, AggregatedValueObject>();
        for (AggregatedValueObject bill : bills) {
            map.put((String)bill.getParentVO().getAttributeValue(key), bill);
        }
        return map;
    }

    private static BaseAggVO[] splitVobySettinfo(BaseAggVO[] vos, AggregatedValueObject[] settles) {
        Map<String, AggregatedValueObject> map = BillEffectUtils.constMap(settles, "pk_busibill");
        ArrayList<BaseAggVO> retvos = new ArrayList<BaseAggVO>();
        for (BaseAggVO io : vos) {
            AggregatedValueObject settvo = map.get(io.getHeadVO().getPrimaryKey());
            if (settvo == null) {
                retvos.add(io);
                continue;
            }
            retvos.add(BillEffectUtils.splitVobySettinfo(io, settvo));
        }
        BaseAggVO[] array = retvos.toArray(new BaseAggVO[0]);
        ArapBillPubUtil.refreshChildVO2HeadVO((AggregatedValueObject[])array);
        BillEffectUtils.calTax(array);
        return array;
    }

    public static BaseAggVO[] splitVobySettinfo(BaseAggVO[] vos) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])vos)) {
            return new BaseAggVO[0];
        }
        boolean iscmpused = ARAPModuleEnableUtil.isCMPEnable(vos[0].getHeadVO().getPk_group());
        if (!iscmpused) {
            return vos;
        }
        try {
            SettlementAggVO[] settvos = ((ICmpSettlementPubQueryService)NCLocator.getInstance().lookup(ICmpSettlementPubQueryService.class)).queryBillsBySourceBillID(BaseAggVO.getParentPks((AggregatedValueObject[])vos));
            if (settvos == null || settvos.length == 0) {
                return vos;
            }
            return BillEffectUtils.splitVobySettinfo(vos, (AggregatedValueObject[])settvos);
        }
        catch (BusinessException e) {
            ExceptionHandler.handleException((Exception)((Object)e));
            return vos;
        }
    }

    public static BaseAggVO splitVobySettinfo(BaseAggVO vo, AggregatedValueObject settle) {
        if (settle == null) {
            throw new IllegalArgumentException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0580"));
        }
        CircularlyAccessibleValueObject[] settitemvos = settle.getChildrenVO();
        BaseItemVO[] itemvos = vo.getItems();
        MapList tables = new MapList();
        for (CircularlyAccessibleValueObject item : settitemvos) {
            tables.put((Object)((String)item.getAttributeValue("pk_billdetail")), (Object)((SuperVO)item));
        }
        ArrayList<BaseItemVO> splits = new ArrayList<BaseItemVO>();
        HashSet<String> settleDetailSet = new HashSet<String>();
        for (BaseItemVO iterator : itemvos) {
            if (tables.get((Object)iterator.getPrimaryKey()) == null || tables.get((Object)iterator.getPrimaryKey()).size() == 0) {
                splits.add(iterator);
            }
            for (SuperVO jo : tables.get((Object)iterator.getPrimaryKey()) == null ? new ArrayList() : tables.get((Object)iterator.getPrimaryKey())) {
                if (settleDetailSet.contains(jo.getPrimaryKey())) continue;
                BaseItemVO copy = BillEffectUtils.copy(iterator, jo);
                splits.add(copy);
                settleDetailSet.add(jo.getPrimaryKey());
            }
        }
        BaseAggVO clone = (BaseAggVO)((Object)vo.clone());
        clone.getHeadVO().setSettleHead((SuperVO)settle.getParentVO());
        clone.setChildrenVO((CircularlyAccessibleValueObject[])splits.toArray(new BaseItemVO[0]));
        clone.setSettlevo(settle);
        return clone;
    }

    private static BaseItemVO copy(BaseItemVO assist, SuperVO main) {
        BaseItemVO clone = (BaseItemVO)assist.clone();
        clone.setMoney_de((UFDouble)main.getAttributeValue("pay"));
        clone.setMoney_cr((UFDouble)main.getAttributeValue("receive"));
        clone.setLocal_money_cr((UFDouble)main.getAttributeValue("receivelocal"));
        clone.setLocal_money_de((UFDouble)main.getAttributeValue("paylocal"));
        if (BillEffectUtils.isDirectionDebt(clone)) {
            clone.setMoney_bal((UFDouble)main.getAttributeValue("pay"));
            clone.setLocal_money_bal((UFDouble)main.getAttributeValue("paylocal"));
            clone.setGroupbalance((UFDouble)main.getAttributeValue("grouppaylocal"));
            clone.setGlobalbalance((UFDouble)main.getAttributeValue("globalpaylocal"));
            clone.setOccupationmny((UFDouble)main.getAttributeValue("pay"));
            clone.setGroupdebit((UFDouble)main.getAttributeValue("grouppaylocal"));
            clone.setGlobaldebit((UFDouble)main.getAttributeValue("globalpaylocal"));
        } else {
            clone.setMoney_bal((UFDouble)main.getAttributeValue("receive"));
            clone.setLocal_money_bal((UFDouble)main.getAttributeValue("receivelocal"));
            clone.setGroupbalance((UFDouble)main.getAttributeValue("groupreceivelocal"));
            clone.setGlobalbalance((UFDouble)main.getAttributeValue("globalreceivelocal"));
            clone.setOccupationmny((UFDouble)main.getAttributeValue("receive"));
            clone.setGroupcrebit((UFDouble)main.getAttributeValue("groupreceivelocal"));
            clone.setGlobalcrebit((UFDouble)main.getAttributeValue("globalreceivelocal"));
        }
        clone.setStatus(2);
        clone.setSettleBody(main);
        return clone;
    }

    private static boolean isDirectionDebt(BaseItemVO baseItemVO) {
        int direction = baseItemVO.getDirection();
        boolean isdebt = direction == BillEnumCollection.Direction.DEBIT.VALUE;
        return isdebt;
    }

    private static void calTax(BaseAggVO[] baseAggVOs) {
        Condition cond = new Condition();
        cond.setCalOrigCurr(false);
        cond.setIsCalLocalCurr(true);
        cond.setIsChgPriceOrDiscount(false);
        cond.setIsFixNchangerate(false);
        cond.setIsFixNqtunitrate(false);
        String pk_group = baseAggVOs[0].getHeadVO().getPk_group();
        String pk_org = baseAggVOs[0].getHeadVO().getPk_org();
        cond.setGroupLocalCurrencyEnable(ArapBillCalUtil.isUseGroupMoney(pk_group));
        cond.setGlobalLocalCurrencyEnable(ArapBillCalUtil.isUseGlobalMoney());
        cond.setOrigCurToGlobalMoney(ArapBillCalUtil.isOrigCurToGlobalMoney());
        cond.setOrigCurToGroupMoney(ArapBillCalUtil.isOrigCurToGroupMoney(pk_group));
        boolean isInterNational = BillEnumCollection.BuySellType.OUT_BUY.VALUE.equals(baseAggVOs[0].getHeadVO().getAttributeValue("buysellflag")) || BillEnumCollection.BuySellType.OUT_SELL.VALUE.equals(baseAggVOs[0].getHeadVO().getAttributeValue("buysellflag"));
        cond.setInternational(isInterNational);
        try {
            cond.setIsTaxOrNet(BillMathCalculator.getProior(0, pk_org));
        }
        catch (Exception e) {
            Log.getInstance((String)"arapExceptionLog").error((Object)e);
        }
        for (BaseAggVO bill : baseAggVOs) {
            for (BaseItemVO item : bill.getItems()) {
                Calculator tool = new Calculator(new CircularlyAccessibleValueObject[]{item}, (IRelationForItems)RelationItemForCal_Credit.getInstance());
                tool.calculate(cond, "money_cr", new ScaleUtils(pk_group));
            }
        }
    }

    public static void refundF3TOF2(AggregatedValueObject[] bills) throws BusinessException {
        ((IArapBillRefundService)NCLocator.getInstance().lookup(IArapBillRefundService.class)).refundF3TOF2(bills);
    }

    public static void cancelRefundF3TOF2(AggregatedValueObject[] bills) throws BusinessException {
        ((IArapBillRefundService)NCLocator.getInstance().lookup(IArapBillRefundService.class)).cancelRefundF3TOF2(bills);
    }
}


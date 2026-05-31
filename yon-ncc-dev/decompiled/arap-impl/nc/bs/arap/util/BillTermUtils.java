/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.dao.BaseDAO
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Logger
 *  nc.itf.bd.cust.finance.ICustFinanceQueryService
 *  nc.itf.fi.pub.Currency
 *  nc.itf.pmpub.payableservice.IPMForArapTermService
 *  nc.md.persist.framework.MDPersistenceService
 *  nc.pubitf.et.m5790.arap.f0.IM5790ForF0
 *  nc.pubitf.it.arap.QueryPayInfoForArap
 *  nc.pubitf.uapbd.IMaterialPubService
 *  nc.pubitf.uapbd.IPaytermPubService
 *  nc.pubitf.uapbd.MeasdocUtil
 *  nc.vo.arap.estipayable.AggEstiPayableBillVO
 *  nc.vo.arap.estireceivable.AggEstiReceivableBillVO
 *  nc.vo.bd.cust.finance.CustFinanceVO
 *  nc.vo.bd.income.IncomeChVO
 *  nc.vo.bd.income.IncomeVO
 *  nc.vo.bd.material.MaterialVO
 *  nc.vo.bd.payment.PaymentChVO
 *  nc.vo.bd.payment.PaymentVO
 *  nc.vo.bd.rate.RateSchemaVO
 *  nc.vo.fipub.annotation.Business
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pm.common.data.PMForArapTermData
 *  nc.vo.pm.util.CollectionUtils
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.BusinessRuntimeException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pubapp.pattern.pub.MapList
 *  nccloud.commons.lang.ArrayUtils
 *  nccloud.commons.lang.StringUtils
 */
package nc.bs.arap.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.arap.cache.ArapBusiPluginCenter;
import nc.bs.arap.global.CurrencyControlBO;
import nc.bs.arap.util.ArapBillVOUtils;
import nc.bs.arap.util.BillStatusUtils;
import nc.bs.arap.util.SqlUtils;
import nc.bs.dao.BaseDAO;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.itf.arap.bill.IArapBillQueryBaseService;
import nc.itf.bd.cust.finance.ICustFinanceQueryService;
import nc.itf.fi.pub.Currency;
import nc.itf.pmpub.payableservice.IPMForArapTermService;
import nc.md.persist.framework.MDPersistenceService;
import nc.pubitf.arap.termitem.IArapTermItemPubQueryService;
import nc.pubitf.arap.termitem.IArapTermItemPubService;
import nc.pubitf.et.m5790.arap.f0.IM5790ForF0;
import nc.pubitf.it.arap.QueryPayInfoForArap;
import nc.pubitf.uapbd.IMaterialPubService;
import nc.pubitf.uapbd.IPaytermPubService;
import nc.pubitf.uapbd.MeasdocUtil;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.estipayable.AggEstiPayableBillVO;
import nc.vo.arap.estireceivable.AggEstiReceivableBillVO;
import nc.vo.arap.global.ArapCommonTool;
import nc.vo.arap.pub.ArapBillTypeInfo;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.termitem.ArapTermDateVO;
import nc.vo.arap.termitem.TermVO;
import nc.vo.arap.utils.StringUtil;
import nc.vo.bd.cust.finance.CustFinanceVO;
import nc.vo.bd.income.IncomeChVO;
import nc.vo.bd.income.IncomeVO;
import nc.vo.bd.material.MaterialVO;
import nc.vo.bd.payment.PaymentChVO;
import nc.vo.bd.payment.PaymentVO;
import nc.vo.bd.rate.RateSchemaVO;
import nc.vo.fipub.annotation.Business;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pm.common.data.PMForArapTermData;
import nc.vo.pm.util.CollectionUtils;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.BusinessRuntimeException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.pub.MapList;
import nccloud.commons.lang.ArrayUtils;
import nccloud.commons.lang.StringUtils;

public class BillTermUtils {
    private static volatile CurrencyControlBO bzCon;
    private static final String CT_ORDER_BILLTYPE = "Z2";
    private static final String INNER_ORDER_BILLTYPE = "5X";
    private static final String PU_INVOICE_BILLTYPE = "25";
    private static final String PU_ORDER_BILLTYPE = "21";
    private static final String SO_ORDER_BILLTYPE = "30";
    static final String ISFROMSOBILL = "isFromSOBill";
    static final String ISNOTESTBILL = "isNotEstBill";

    @Business(business="\u57fa\u7840\u5355\u636e", subBusiness="\u6536\u4ed8\u6b3e\u534f\u8bae\u5904\u7406", description="\u6839\u636e\u5355\u636e\u4fe1\u606f\uff0c\u62c6\u5206\u6536\u4ed8\u6b3e\u534f\u8bae\u4fe1\u606f", type="\u5de5\u5177")
    public static <T extends AggregatedValueObject> void dealBillTerm(T[] bills, Map<String, Integer> childvostatusmap, T[] billsOld) throws BusinessException {
        TermVO termVO;
        BaseItemVO item;
        int i;
        if (ArrayUtils.isEmpty((Object[])bills)) {
            return;
        }
        Map<String, BaseItemVO> items4Now = BillTermUtils.construtBaseMap(bills);
        Map<String, BaseItemVO> itemsOld = BillTermUtils.construtBaseMap(billsOld);
        ArrayList<BaseItemVO> newItemlist = new ArrayList<BaseItemVO>();
        ArrayList<String> deleteItemlist = new ArrayList<String>();
        ArrayList<String> clearItemList = new ArrayList<String>();
        List<String> clearFields = Arrays.asList("expiredate");
        BaseItemVO[] items = items4Now.values().toArray(new BaseItemVO[0]);
        for (i = 0; i < items.length; ++i) {
            item = items[i];
            String statusKey = BillStatusUtils.getStatusKey(item);
            Logger.debug((Object)statusKey, BillTermUtils.class, (String)"dealBillTerm");
            Integer status = childvostatusmap.get(statusKey);
            if (status == null || status == 2) {
                newItemlist.add(item);
                continue;
            }
            if (status == 3) {
                deleteItemlist.add(item.getPrimaryKey());
                continue;
            }
            if (status != 1 && status != 0) continue;
            if (ArrayUtils.isEmpty((Object[])billsOld)) {
                deleteItemlist.add(item.getPrimaryKey());
                newItemlist.add(item);
                continue;
            }
            if (BillTermUtils.isPaytermNeedChange(item, itemsOld.get(item.getPrimaryKey()), (BaseBillVO)bills[0].getParentVO(), (BaseBillVO)billsOld[0].getParentVO())) {
                deleteItemlist.add(item.getPrimaryKey());
                newItemlist.add(item);
            }
            if (!BillTermUtils.isNeedClear(item, itemsOld.get(item.getPrimaryKey()), (BaseBillVO)bills[0].getParentVO(), (BaseBillVO)billsOld[0].getParentVO())) continue;
            clearItemList.add(item.getPrimaryKey());
        }
        items = itemsOld.values().toArray(new BaseItemVO[0]);
        for (i = 0; i < items.length; ++i) {
            item = items[i];
            if (items4Now.get(item.getPrimaryKey()) != null) continue;
            deleteItemlist.add(item.getPrimaryKey());
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(BillEnumCollection.BillSatus.TEMPEORARY.VALUE, BillEnumCollection.BillSatus.SAVE.VALUE);
        map.put(BillEnumCollection.BillSatus.UNCOMFIRM.VALUE, BillEnumCollection.BillSatus.SAVE.VALUE);
        if (deleteItemlist.size() > 0) {
            termVO = new TermVO();
            new BaseDAO().executeUpdate("delete from " + termVO.getTableName() + " where " + SqlUtils.getInStr("pk_item", deleteItemlist.toArray(new String[0])));
        }
        if (clearItemList.size() > 0) {
            int i2;
            termVO = new TermVO();
            StringBuilder sql = new StringBuilder();
            for (i2 = 0; i2 < clearFields.size() - 2; ++i2) {
                sql.append(clearFields.get(i2)).append(" = null ,");
            }
            sql.append(clearFields.get(i2)).append(" = null ");
            new BaseDAO().executeUpdate("update " + termVO.getTableName() + " set " + sql.toString() + " where " + SqlUtils.getInStr("pk_item", clearItemList.toArray(new String[0])));
        }
        if (newItemlist.size() > 0) {
            TermContext context = new TermContext();
            Integer estiflag = (Integer)bills[0].getParentVO().getAttributeValue("estflag");
            context.putBoolean(ISNOTESTBILL, estiflag != null && estiflag.intValue() == BillEnumCollection.EstiType.NOTEST.VALUE.intValue());
            Integer fromSystem = (Integer)bills[0].getParentVO().getAttributeValue("src_syscode");
            context.putBoolean(ISFROMSOBILL, BillEnumCollection.FromSystem.SO.VALUE.equals(fromSystem));
            ArrayList<UFDate> itemBusiDateList = new ArrayList<UFDate>();
            ArrayList<BaseItemVO> updateItemBusiDateList = new ArrayList<BaseItemVO>();
            for (BaseItemVO item2 : newItemlist) {
                itemBusiDateList.add(item2.getBusidate());
            }
            List<TermVO> termVOList = BillTermUtils.getTermVOList(newItemlist, context);
            HashSet<String> itemSet = new HashSet<String>();
            for (BaseItemVO itemVO : newItemlist) {
                if (UFDouble.ZERO_DBL.compareTo((Object)itemVO.getMoney_bal()) != 0) continue;
                itemSet.add(itemVO.getPrimaryKey());
            }
            for (TermVO termVO2 : termVOList) {
                if (!itemSet.contains(termVO2.getPk_item())) continue;
                termVO2.setOccupationmny(UFDouble.ZERO_DBL);
                termVO2.setMoney_bal(UFDouble.ZERO_DBL);
                termVO2.setGroupbalance(UFDouble.ZERO_DBL);
                termVO2.setGlobalbalance(UFDouble.ZERO_DBL);
            }
            BillTermUtils.validatorMoney(termVOList, bills);
            new BaseDAO().insertVOList(termVOList);
            int idx = 0;
            for (BaseItemVO item3 : newItemlist) {
                if (item3.getBusidate() == null || item3.getBusidate().equals(itemBusiDateList.get(idx++))) continue;
                updateItemBusiDateList.add(item3);
            }
            if (updateItemBusiDateList.size() != 0) {
                new BaseDAO().updateVOArray((SuperVO[])updateItemBusiDateList.toArray(new BaseItemVO[0]), new String[]{"busidate"});
            }
        }
    }

    private static void validatorMoney(List<TermVO> termVOList, AggregatedValueObject[] bills) throws BusinessException {
        MapList bid2TermList = new MapList();
        ArrayList<BaseItemVO> vos = new ArrayList<BaseItemVO>();
        for (AggregatedValueObject bill : bills) {
            vos.addAll(Arrays.asList(((BaseAggVO)bill).getItems()));
        }
        for (TermVO term : termVOList) {
            bid2TermList.put((Object)term.getPk_item(), (Object)term);
        }
        Map<Object, Object> moneyMap = new HashMap();
        for (BaseItemVO item : vos) {
            moneyMap = BillTermUtils.getMoney(bid2TermList.get((Object)item.getPrimaryKey()), item.getPk_billtype(), item.getRate());
            if (moneyMap == null) continue;
            for (Map.Entry<Object, Object> parm : moneyMap.entrySet()) {
                UFDouble money = (UFDouble)item.getAttributeValue((String)parm.getKey());
                UFDouble termMoney = (UFDouble)parm.getValue();
                if (termMoney.abs().equals((Object)money.abs()) || UFDouble.ZERO_DBL.equals((Object)money)) continue;
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1209") + (String)parm.getKey() + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1210"));
            }
        }
    }

    public static List<TermVO> getTermVOList(List<BaseItemVO> newItemlist, IContext context) throws BusinessException {
        Map<BaseItemVO, List<TermVO>> terms = ArapBillPubUtil.isARSysBilltype(newItemlist.get(0).getPk_billtype()) ? ("4D65".equals(newItemlist.get(0).getTop_billtype()) ? BillTermUtils.constructPMTerms(newItemlist, context) : BillTermUtils.constructIncomeTerms(newItemlist, context)) : (BillTermUtils.isFromPM(newItemlist.get(0).getPk_billtype(), newItemlist.get(0).getSrc_billtype(), newItemlist.get(0).getTop_billtype()) ? BillTermUtils.constructPMTerms(newItemlist, context) : BillTermUtils.constructPaymentTerms(newItemlist, context));
        BillTermUtils.dealMoneyDig(terms);
        ArrayList<TermVO> termsList = new ArrayList<TermVO>();
        for (List<TermVO> tlist : terms.values()) {
            termsList.addAll(tlist);
        }
        return termsList;
    }

    private static Map<BaseItemVO, List<TermVO>> constructPMTerms(List<BaseItemVO> items, IContext context) throws BusinessException {
        ArrayList<TermVO> terms = null;
        HashMap<BaseItemVO, List<TermVO>> termMaps = new HashMap<BaseItemVO, List<TermVO>>();
        ArrayList<String> PMBillID = new ArrayList<String>();
        for (BaseItemVO item : items) {
            PMBillID.add(item.getAttributeValue("top_itemid").toString());
        }
        MapList pmData = ((IPMForArapTermService)NCLocator.getInstance().lookup(IPMForArapTermService.class)).getPMData(PMBillID, items.get(0).getTop_billtype());
        for (BaseItemVO item : items) {
            terms = new ArrayList<TermVO>();
            List pmForArapTermDataVOs = pmData.get((Object)item.getAttributeValue("top_itemid").toString());
            for (PMForArapTermData vo : pmForArapTermDataVOs) {
                TermVO term = BillTermUtils.constructTermVO4PM(item, vo);
                terms.add(term);
            }
            termMaps.put(item, terms);
        }
        return termMaps;
    }

    private static boolean isFromPM(String billtype, String src_billtype, String top_billtype) {
        if ("23E0".equals(top_billtype) || "23E1".equals(top_billtype)) {
            return false;
        }
        if (StringUtils.isEmpty((CharSequence)billtype) || !Arrays.asList("F1").contains(billtype)) {
            return false;
        }
        List<String> pm2F1 = Arrays.asList("4D48", "4D50", "4D83", "4D52", "4D53");
        return StringUtils.isEmpty((CharSequence)top_billtype) ? false : pm2F1.contains(top_billtype);
    }

    public static void retBodyTermVOS(AggregatedValueObject[] bills) {
        ArrayList<BaseItemVO> vos = new ArrayList<BaseItemVO>();
        ArrayList<String> headpks = new ArrayList<String>();
        for (AggregatedValueObject bill : bills) {
            vos.addAll(Arrays.asList(((BaseAggVO)bill).getItems()));
            headpks.add(((SuperVO)bill.getParentVO()).getPrimaryKey());
        }
        try {
            TermVO[] terms = ((IArapTermItemPubQueryService)NCLocator.getInstance().lookup(IArapTermItemPubQueryService.class)).queryTermVOByBillParentPK(headpks.toArray(new String[0]));
            HashMap<String, TermVO> map = new HashMap<String, TermVO>();
            for (int i = 0; i < terms.length; ++i) {
                TermVO termVO = terms[i];
                map.put(termVO.getPk_item(), termVO);
            }
            MapList bid2TermList = new MapList();
            for (TermVO term : terms) {
                bid2TermList.put((Object)term.getPk_item(), (Object)term);
            }
            for (BaseItemVO item : vos) {
                if (null == bid2TermList.get((Object)item.getPrimaryKey())) continue;
                item.setTerm(bid2TermList.get((Object)item.getPrimaryKey()).toArray(new TermVO[0]));
            }
        }
        catch (BusinessException e) {
            ExceptionHandler.consume((Throwable)e);
        }
    }

    private static Map<String, UFDouble> getMoney(List<TermVO> vos, String billtype, UFDouble rate) {
        if (CollectionUtils.isEmpty(vos)) {
            return null;
        }
        UFDouble money = UFDouble.ZERO_DBL;
        UFDouble localmoney = UFDouble.ZERO_DBL;
        HashMap<String, UFDouble> moneyMap = new HashMap<String, UFDouble>();
        for (TermVO vo : vos) {
            if ("F1".equals(billtype) || "F2".equals(billtype) || "23E1".equals(billtype)) {
                money = money.add((UFDouble)vo.getAttributeValue("money_cr"));
                localmoney = localmoney.add((UFDouble)vo.getAttributeValue("local_money_cr"));
                continue;
            }
            money = money.add((UFDouble)vo.getAttributeValue("money_de"));
            localmoney = localmoney.add((UFDouble)vo.getAttributeValue("local_money_de"));
        }
        if ("F1".equals(billtype) || "F2".equals(billtype) || "23E1".equals(billtype)) {
            moneyMap.put("money_cr", money);
            moneyMap.put("local_money_cr", localmoney);
            moneyMap.put("money_de", UFDouble.ZERO_DBL);
            moneyMap.put("local_money_de", UFDouble.ZERO_DBL);
        } else {
            moneyMap.put("money_cr", UFDouble.ZERO_DBL);
            moneyMap.put("local_money_cr", UFDouble.ZERO_DBL);
            moneyMap.put("money_de", money);
            moneyMap.put("local_money_de", localmoney);
        }
        return moneyMap;
    }

    public static void setBusiDate(AggregatedValueObject[] bills) {
        for (AggregatedValueObject bill : bills) {
            for (CircularlyAccessibleValueObject vo : bill.getChildrenVO()) {
                if (null == vo.getAttributeValue("billdate")) {
                    vo.setAttributeValue("billdate", bill.getParentVO().getAttributeValue("billdate"));
                }
                if (null != vo.getAttributeValue("busidate")) continue;
                vo.setAttributeValue("busidate", bill.getParentVO().getAttributeValue("billdate"));
            }
        }
    }

    @Business(business="\u57fa\u7840\u5355\u636e", subBusiness="\u6536\u4ed8\u6b3e\u534f\u8bae\u5904\u7406", description="\u6839\u636e\u5355\u636e\u4fe1\u606f\uff0c\u62c6\u5206\u6536\u6b3e\u534f\u8bae\u4fe1\u606f", type="\u5de5\u5177")
    private static Map<BaseItemVO, List<TermVO>> constructIncomeTerms(List<BaseItemVO> items, IContext context) throws BusinessException {
        BillDateObj billdateObj;
        ArrayList<TermVO> terms = null;
        HashMap<BaseItemVO, List<TermVO>> termMaps = new HashMap<BaseItemVO, List<TermVO>>();
        HashSet<String> termIds = new HashSet<String>();
        HashSet<String> etinvoiceids = new HashSet<String>();
        HashMap<String, String> toppaymentMap = new HashMap<String, String>();
        for (BaseItemVO item : items) {
            if (BillTermUtils.isFromETInvoice(items.get(0).getPk_billtype(), items.get(0).getSrc_billtype(), items.get(0).getTop_billtype())) {
                if (item.getAttributeValue("top_billid") != null && !nc.vo.jcom.lang.StringUtil.isEmpty((String)item.getAttributeValue("top_billid").toString())) {
                    etinvoiceids.add(item.getAttributeValue("top_billid").toString());
                }
            } else if (item.getAttributeValue("pk_payterm") != null && !nc.vo.jcom.lang.StringUtil.isEmpty((String)item.getAttributeValue("pk_payterm").toString())) {
                termIds.add(item.getAttributeValue("pk_payterm").toString());
            }
            String top_itemid = item.getTop_itemid();
            String pk_payterm = item.getPk_payterm();
            if (nc.vo.jcom.lang.StringUtil.isEmpty((String)top_itemid)) continue;
            toppaymentMap.put(top_itemid, pk_payterm);
        }
        Map<String, ArapTermDateVO[]> pluginTermVOMap = ArapBusiPluginCenter.queryTermDateVOs(items.get(0).getTop_billtype(), toppaymentMap, true);
        if (pluginTermVOMap != null && !pluginTermVOMap.isEmpty()) {
            return BillTermUtils.constructIncomeTermsByPlugin(items, pluginTermVOMap, context);
        }
        HashMap<Object, Object> paymentVOs = null;
        paymentVOs = termIds.size() == 0 ? (etinvoiceids.size() == 0 ? new HashMap() : ((paymentVOs = ((IM5790ForF0)NCLocator.getInstance().lookup(IM5790ForF0.class)).queryInCome(etinvoiceids.toArray(new String[0]))) == null ? new HashMap<String, IncomeVO>() : paymentVOs)) : ((paymentVOs = ((IPaytermPubService)NCLocator.getInstance().lookup(IPaytermPubService.class)).queryIncomeByPk(termIds.toArray(new String[0]))) == null ? new HashMap<String, IncomeVO>() : paymentVOs);
        Map<String, UFDate> map = null;
        Map<Object, Object> item2Busidate = new HashMap();
        boolean isResetBusidate = false;
        if (BillTermUtils.isRecFromSO(items.get(0).getPk_billtype(), items.get(0).getSrc_billtype(), items.get(0).getTop_billtype()) && context.getBoolean(ISFROMSOBILL)) {
            isResetBusidate = true;
            if (BillTermUtils.isConfirmBill(items.get(0).getPk_billtype(), items.get(0).getSrc_billtype(), items.get(0).getTop_billtype()) || BillTermUtils.isNotEstBill(context)) {
                billdateObj = BillTermUtils.queryEstiBillDateObj(items, paymentVOs);
                item2Busidate = billdateObj.item2Busidate;
            }
            map = ((IArapTermItemPubService)NCLocator.getInstance().lookup(IArapTermItemPubService.class)).queryAccountDate(items, paymentVOs);
        }
        if (BillTermUtils.isFromInnerTrans(items.get(0).getPk_billtype(), items.get(0).getSrc_billtype(), items.get(0).getTop_billtype()) && (BillTermUtils.isConfirmBill(items.get(0).getPk_billtype(), items.get(0).getSrc_billtype(), items.get(0).getTop_billtype()) || BillTermUtils.isNotEstBill(context))) {
            isResetBusidate = true;
            billdateObj = BillTermUtils.queryEstiBillDateObj(items, paymentVOs);
            map = billdateObj.itemPlusPayterm2Busidate;
            item2Busidate = billdateObj.item2Busidate;
        }
        if (BillTermUtils.isFromETInvoice(items.get(0).getPk_billtype(), items.get(0).getSrc_billtype(), items.get(0).getTop_billtype())) {
            isResetBusidate = true;
            map = ((IArapTermItemPubService)NCLocator.getInstance().lookup(IArapTermItemPubService.class)).queryETAccountDate(items, paymentVOs);
        }
        ArrayList<String> rateschemalist = new ArrayList<String>();
        Collection values = paymentVOs.values();
        for (IncomeVO payment : values) {
            for (IncomeChVO payItem : payment.getPaymentch()) {
                if (!StringUtils.isNotEmpty((CharSequence)payItem.getPk_rate())) continue;
                rateschemalist.add(payItem.getPk_rate());
            }
        }
        String[] rateschema = rateschemalist.toArray(new String[0]);
        HashMap queryRateByPk = ((IPaytermPubService)NCLocator.getInstance().lookup(IPaytermPubService.class)).queryRateByPk(rateschema);
        if (queryRateByPk == null) {
            queryRateByPk = new HashMap();
        }
        Map<String, Integer> innerEffectDate = BillTermUtils.constructInnerEffectDate(items);
        TreeMap<Integer, UFDate> writeBackMap = new TreeMap<Integer, UFDate>();
        UFDate busidate = null;
        MapList termList = new MapList();
        if (BillTermUtils.isNotEstBill(context)) {
            TermVO[] topVOs;
            ArrayList<String> itemids = new ArrayList<String>();
            for (BaseItemVO baseItemVO : items) {
                String topItemid = baseItemVO.getTop_itemid();
                if (StringUtil.isEmpty(topItemid)) continue;
                itemids.add(topItemid);
            }
            for (TermVO term : topVOs = ((IArapTermItemPubQueryService)NCLocator.getInstance().lookup(IArapTermItemPubQueryService.class)).queryTermVOByBillItemPK(itemids.toArray(new String[0]))) {
                termList.put((Object)term.getPk_item(), (Object)term);
            }
        }
        for (BaseItemVO item : items) {
            terms = new ArrayList<TermVO>();
            Object object = item.getAttributeValue("pk_payterm");
            Object pk_top_billid = item.getAttributeValue("top_billid");
            Integer innerdays = innerEffectDate.get(item.getPrimaryKey());
            innerdays = innerdays == null ? 0 : innerdays;
            if (paymentVOs.get(object) == null && paymentVOs.get(pk_top_billid) == null) {
                TermVO termvo = BillTermUtils.constructTermVO(item, new UFDouble(100));
                if (isResetBusidate) {
                    busidate = item2Busidate.get(item.getPrimaryKey()) == null ? item.getBusidate() : (UFDate)item2Busidate.get(item.getPrimaryKey());
                    item.setBusidate(busidate);
                }
                if ("F2".equals(item.getPk_billtype())) {
                    UFBoolean prepay = BillEnumCollection.PreSigns.ISPRE.VALUE.equals(item.getPrepay()) ? UFBoolean.TRUE : UFBoolean.FALSE;
                    termvo.setPrepay(prepay);
                }
                termvo.setExpiredate(item.getBusidate());
                termvo.setInnerctldeferdays(termvo.getExpiredate().getDateAfter(innerdays.intValue()));
                terms.add(termvo);
            } else {
                IncomeChVO[] paymentch = BillTermUtils.isFromETInvoice(items.get(0).getPk_billtype(), items.get(0).getSrc_billtype(), items.get(0).getTop_billtype()) ? ((IncomeVO)paymentVOs.get(pk_top_billid)).getPaymentch() : ((IncomeVO)paymentVOs.get(object)).getPaymentch();
                for (IncomeChVO payItem : paymentch) {
                    Object[] rateschemach;
                    UFDate expiredate;
                    TermVO termvo = null;
                    UFDouble rate = payItem.getAccrate();
                    if (ArapCommonTool.isZero(rate)) continue;
                    busidate = item.getBusidate();
                    if (isResetBusidate) {
                        busidate = map.get(BillTermUtils.getPaymentKey(item, (SuperVO)payItem));
                        if (busidate != null) {
                            writeBackMap.put(payItem.getShoworder(), busidate.getDateAfter(payItem.getEffectdateadddate().intValue()));
                        }
                        UFDate uFDate = busidate = busidate == null ? item.getBusidate() : busidate;
                    }
                    if (null != payItem.getCheckdata() && 0 <= payItem.getCheckdata()) {
                        termvo = BillTermUtils.constructTermVO(item, payItem.getAccrate());
                        boolean nextmonth = "1".equals(payItem.getEffectmonth());
                        expiredate = BillTermUtils.getDate(busidate, payItem.getCheckdata(), payItem.getAccountday(), nextmonth, payItem.getEffectaddmonth(), payItem.getEffectdateadddate());
                        termvo.setExpiredate(expiredate);
                    } else {
                        termvo = BillTermUtils.constructTermVO(item, rate);
                        expiredate = busidate.getDateAfter((payItem.getPaymentday() == null ? 0 : payItem.getPaymentday()) + (payItem.getEffectdateadddate() == null ? 0 : payItem.getEffectdateadddate()));
                        termvo.setExpiredate(expiredate);
                    }
                    termvo.setInsurance(payItem.getIsdeposit());
                    termvo.setInnerctldeferdays(expiredate.getDateAfter(innerdays.intValue()));
                    if (StringUtils.isNotEmpty((CharSequence)payItem.getPk_rate()) && !ArrayUtils.isEmpty((Object[])(rateschemach = ((RateSchemaVO)queryRateByPk.get(payItem.getPk_rate())).getRateschemach()))) {
                        termvo.setLastdiscount(rateschemach[rateschemach.length - 1].getRate());
                        termvo.setLastdiscountdate(busidate.getDateAfter(rateschemach[rateschemach.length - 1].getRdata().intValue()));
                    }
                    if ("F0".equals(item.getPk_billtype()) || "23E0".equals(item.getPk_billtype())) {
                        termvo.setPrepay(payItem.getPrepayment());
                    } else if ("F2".equals(item.getPk_billtype())) {
                        UFBoolean prepay = BillEnumCollection.PreSigns.ISPRE.VALUE.equals(item.getPrepay()) ? UFBoolean.TRUE : UFBoolean.FALSE;
                        termvo.setPrepay(prepay);
                    }
                    termvo.setPk_term_b(payItem.getPk_paymentch());
                    terms.add(termvo);
                }
            }
            if (writeBackMap.size() > 0 && writeBackMap.get(writeBackMap.firstKey()) != null) {
                item.setBusidate((UFDate)writeBackMap.get(writeBackMap.firstKey()));
            }
            writeBackMap.clear();
            BillTermUtils.setEstiWashBillDate((MapList<String, TermVO>)termList, terms, item);
            termMaps.put(item, terms);
        }
        return termMaps;
    }

    private static Map<BaseItemVO, List<TermVO>> constructIncomeTermsByPlugin(List<BaseItemVO> items, Map<String, ArapTermDateVO[]> pluginTermVOMap, IContext context) throws BusinessException {
        ArrayList<String> rateschemalist = new ArrayList<String>();
        for (Map.Entry<String, ArapTermDateVO[]> entry : pluginTermVOMap.entrySet()) {
            ArapTermDateVO[] termdatevos = entry.getValue();
            for (int i = 0; i < termdatevos.length; ++i) {
                ArapTermDateVO arapTermDateVO = termdatevos[i];
                IncomeChVO payItem = arapTermDateVO.getIncomevo();
                if (!StringUtils.isNotEmpty((CharSequence)payItem.getPk_rate())) continue;
                rateschemalist.add(payItem.getPk_rate());
            }
        }
        String[] rateschema = rateschemalist.toArray(new String[0]);
        HashMap queryRateByPk = ((IPaytermPubService)NCLocator.getInstance().lookup(IPaytermPubService.class)).queryRateByPk(rateschema);
        if (queryRateByPk == null) {
            queryRateByPk = new HashMap();
        }
        Map<String, Integer> innerEffectDate = BillTermUtils.constructInnerEffectDate(items);
        MapList termList = new MapList();
        if (BillTermUtils.isNotEstBill(context)) {
            TermVO[] topVOs;
            ArrayList<String> itemids = new ArrayList<String>();
            for (BaseItemVO item : items) {
                String topItemid = item.getTop_itemid();
                if (StringUtil.isEmpty(topItemid)) continue;
                itemids.add(topItemid);
            }
            for (TermVO term : topVOs = ((IArapTermItemPubQueryService)NCLocator.getInstance().lookup(IArapTermItemPubQueryService.class)).queryTermVOByBillItemPK(itemids.toArray(new String[0]))) {
                termList.put((Object)term.getPk_item(), (Object)term);
            }
        }
        ArrayList<TermVO> terms = null;
        HashMap<BaseItemVO, List<TermVO>> termMaps = new HashMap<BaseItemVO, List<TermVO>>();
        for (BaseItemVO item : items) {
            ArapTermDateVO[] termdatevos;
            terms = new ArrayList<TermVO>();
            Object pk_top_itemid = item.getAttributeValue("top_itemid");
            Integer innerdays = innerEffectDate.get(item.getPrimaryKey());
            innerdays = innerdays == null ? 0 : innerdays;
            for (ArapTermDateVO termDateItem : termdatevos = pluginTermVOMap.get(pk_top_itemid)) {
                Object[] rateschemach;
                IncomeChVO payItem = termDateItem.getIncomevo();
                UFDouble rate = payItem.getAccrate();
                if (ArapCommonTool.isZero(rate)) continue;
                TermVO termvo = BillTermUtils.constructTermVO(item, rate);
                UFDate busidate = termDateItem.getPaydate();
                UFDate expiredate = termDateItem.getExpiredate();
                termvo.setExpiredate(expiredate);
                termvo.setInsurance(payItem.getIsdeposit());
                termvo.setInnerctldeferdays(expiredate.getDateAfter(innerdays.intValue()));
                item.setBusidate(busidate);
                if (StringUtils.isNotEmpty((CharSequence)payItem.getPk_rate()) && !ArrayUtils.isEmpty((Object[])(rateschemach = ((RateSchemaVO)queryRateByPk.get(payItem.getPk_rate())).getRateschemach()))) {
                    termvo.setLastdiscount(rateschemach[rateschemach.length - 1].getRate());
                    termvo.setLastdiscountdate(busidate.getDateAfter(rateschemach[rateschemach.length - 1].getRdata().intValue()));
                }
                if ("F0".equals(item.getPk_billtype()) || "23E0".equals(item.getPk_billtype())) {
                    termvo.setPrepay(payItem.getPrepayment());
                } else if ("F2".equals(item.getPk_billtype())) {
                    UFBoolean prepay = BillEnumCollection.PreSigns.ISPRE.VALUE.equals(item.getPrepay()) ? UFBoolean.TRUE : UFBoolean.FALSE;
                    termvo.setPrepay(prepay);
                }
                termvo.setPk_term_b(payItem.getPk_paymentch());
                terms.add(termvo);
            }
            BillTermUtils.setEstiWashBillDate((MapList<String, TermVO>)termList, terms, item);
            termMaps.put(item, terms);
        }
        return termMaps;
    }

    private static Map<String, Integer> constructInnerEffectDate(List<BaseItemVO> items) {
        HashSet<String> customers = new HashSet<String>();
        MapList customerMap = new MapList();
        for (BaseItemVO itemVO : items) {
            if (!StringUtils.isNotEmpty((CharSequence)itemVO.getCustomer())) continue;
            customers.add(itemVO.getCustomer());
            customerMap.put((Object)itemVO.getCustomer(), (Object)itemVO.getPrimaryKey());
        }
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        if (customers.size() == 0) {
            return result;
        }
        StringBuffer wheresql = new StringBuffer();
        try {
            wheresql.append("pk_org").append(" ='").append(items.get(0).getPk_org()).append("' and ");
            wheresql.append(SqlUtils.getInStr("pk_customer", customers.toArray(new String[0]), true));
            ICustFinanceQueryService service = (ICustFinanceQueryService)NCLocator.getInstance().lookup(ICustFinanceQueryService.class);
            Object[] pks = service.queryCustFinancePks(wheresql.toString());
            if (!ArrayUtils.isEmpty((Object[])pks)) {
                Collection vos = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPKs(CustFinanceVO.class, (String[])pks, false);
                for (CustFinanceVO vo : vos) {
                    List list = customerMap.get((Object)vo.getPk_customer());
                    if (list == null || list.size() == 0) continue;
                    for (String itemPk : list) {
                        result.put(itemPk, vo.getInnerctldeferdays() == null ? 0 : vo.getInnerctldeferdays());
                    }
                }
            }
        }
        catch (Exception e) {
            ExceptionHandler.consume((Throwable)e);
        }
        return result;
    }

    @Business(business="\u57fa\u7840\u5355\u636e", subBusiness="\u6536\u4ed8\u6b3e\u534f\u8bae\u5904\u7406", description="\u6839\u636e\u5355\u636e\u4fe1\u606f\uff0c\u62c6\u5206\u4ed8\u6b3e\u534f\u8bae\u4fe1\u606f", type="\u5de5\u5177")
    private static Map<BaseItemVO, List<TermVO>> constructPaymentTerms(List<BaseItemVO> items, IContext context) throws BusinessException {
        BillDateObj billdateObj;
        Map<BaseItemVO, List<TermVO>> estBackTerms;
        Set<BaseItemVO> keySet;
        ArrayList<BaseItemVO> restItems;
        ArrayList<TermVO> terms = null;
        HashMap<BaseItemVO, List<TermVO>> termMaps = new HashMap<BaseItemVO, List<TermVO>>();
        HashSet<String> termIds = new HashSet<String>();
        HashSet<String> etinvoiceids = new HashSet<String>();
        HashMap<String, String> toppaymentMap = new HashMap<String, String>();
        for (BaseItemVO item : items) {
            if (BillTermUtils.isFromITInvoice(items.get(0).getPk_billtype(), items.get(0).getSrc_billtype(), items.get(0).getTop_billtype())) {
                if (item.getAttributeValue("top_billid") != null && !nc.vo.jcom.lang.StringUtil.isEmpty((String)item.getAttributeValue("top_billid").toString())) {
                    etinvoiceids.add(item.getAttributeValue("top_billid").toString());
                }
            } else if (item.getAttributeValue("pk_payterm") != null && !nc.vo.jcom.lang.StringUtil.isEmpty((String)item.getAttributeValue("pk_payterm").toString())) {
                termIds.add(item.getAttributeValue("pk_payterm").toString());
            }
            String top_itemid = item.getTop_itemid();
            String pk_payterm = item.getPk_payterm();
            if (nc.vo.jcom.lang.StringUtil.isEmpty((String)top_itemid)) continue;
            toppaymentMap.put(top_itemid, pk_payterm);
        }
        Map<String, ArapTermDateVO[]> pluginTermVOMap = ArapBusiPluginCenter.queryTermDateVOs(items.get(0).getTop_billtype(), toppaymentMap, false);
        if (pluginTermVOMap != null && !pluginTermVOMap.isEmpty()) {
            Map<BaseItemVO, List<TermVO>> pluginRes = BillTermUtils.constructPaymentTermsByPlugin(items, pluginTermVOMap);
            restItems = new ArrayList<BaseItemVO>();
            keySet = pluginRes.keySet();
            for (BaseItemVO item : items) {
                if (keySet.contains(item)) continue;
                restItems.add(item);
            }
            if (!restItems.isEmpty()) {
                if (pluginRes != null && !pluginRes.isEmpty()) {
                    termMaps.putAll(pluginRes);
                }
                items = restItems;
            } else {
                return pluginRes;
            }
        }
        if (("23E1".equals(items.get(0).getTop_billtype()) && "23E1".equals(items.get(0).getPk_billtype()) || "23E0".equals(items.get(0).getTop_billtype()) && "23E0".equals(items.get(0).getPk_billtype())) && (estBackTerms = BillTermUtils.getEstBackTerms(items, termMaps)) != null && estBackTerms.size() > 0) {
            restItems = new ArrayList();
            keySet = estBackTerms.keySet();
            for (BaseItemVO item : items) {
                if (keySet.contains(item)) continue;
                restItems.add(item);
            }
            if (!restItems.isEmpty()) {
                if (estBackTerms != null && !estBackTerms.isEmpty()) {
                    termMaps.putAll(estBackTerms);
                }
                items = restItems;
            } else {
                return estBackTerms;
            }
        }
        HashMap<Object, Object> paymentVOs = null;
        paymentVOs = termIds.size() == 0 ? (etinvoiceids.size() == 0 ? new HashMap() : ((paymentVOs = ((QueryPayInfoForArap)NCLocator.getInstance().lookup(QueryPayInfoForArap.class)).queryPaymentVO(etinvoiceids.toArray(new String[0]))) == null ? new HashMap<String, PaymentVO>() : paymentVOs)) : ((paymentVOs = ((IPaytermPubService)NCLocator.getInstance().lookup(IPaytermPubService.class)).queryPaymentByPk(termIds.toArray(new String[0]))) == null ? new HashMap<String, PaymentVO>() : paymentVOs);
        Map<String, UFDate> map = null;
        Map<Object, Object> item2Busidate = new HashMap();
        boolean isResetBusidate = false;
        if (BillTermUtils.isPayFromPU(items.get(0).getPk_billtype(), items.get(0).getSrc_billtype(), items.get(0).getTop_billtype())) {
            isResetBusidate = true;
            if (BillTermUtils.isConfirmBill(items.get(0).getPk_billtype(), items.get(0).getSrc_billtype(), items.get(0).getTop_billtype()) || BillTermUtils.isNotEstBill(context)) {
                billdateObj = BillTermUtils.queryEstiBillDateObj2(items, paymentVOs);
                item2Busidate = billdateObj.item2Busidate;
            }
            map = ((IArapTermItemPubService)NCLocator.getInstance().lookup(IArapTermItemPubService.class)).queryPaymentAccountDate(items, paymentVOs);
        }
        if (BillTermUtils.isFromInnerTrans(items.get(0).getPk_billtype(), items.get(0).getSrc_billtype(), items.get(0).getTop_billtype()) && (BillTermUtils.isConfirmBill(items.get(0).getPk_billtype(), items.get(0).getSrc_billtype(), items.get(0).getTop_billtype()) || BillTermUtils.isNotEstBill(context))) {
            isResetBusidate = true;
            billdateObj = BillTermUtils.queryEstiBillDateObj2(items, paymentVOs);
            map = billdateObj.itemPlusPayterm2Busidate;
            item2Busidate = billdateObj.item2Busidate;
        }
        if (BillTermUtils.isFromITInvoice(items.get(0).getPk_billtype(), items.get(0).getSrc_billtype(), items.get(0).getTop_billtype())) {
            isResetBusidate = true;
            map = ((IArapTermItemPubService)NCLocator.getInstance().lookup(IArapTermItemPubService.class)).queryITAccountDate(items, paymentVOs);
        }
        ArrayList<String> rateschemalist = new ArrayList<String>();
        Collection values = paymentVOs.values();
        for (PaymentVO payment : values) {
            for (PaymentChVO payItem : payment.getPaymentch()) {
                if (!StringUtils.isNotEmpty((CharSequence)payItem.getPk_rate())) continue;
                rateschemalist.add(payItem.getPk_rate());
            }
        }
        String[] rateschema = rateschemalist.toArray(new String[0]);
        HashMap queryRateByPk = ((IPaytermPubService)NCLocator.getInstance().lookup(IPaytermPubService.class)).queryRateByPk(rateschema);
        if (queryRateByPk == null) {
            queryRateByPk = new HashMap();
        }
        TreeMap<Integer, UFDate> writeBackMap = new TreeMap<Integer, UFDate>();
        UFDate busidate = null;
        for (BaseItemVO item : items) {
            terms = new ArrayList<TermVO>();
            Object pk_payterm = item.getAttributeValue("pk_payterm");
            Object pk_top_billid = item.getAttributeValue("top_billid");
            if (paymentVOs.get(pk_payterm) == null && paymentVOs.get(pk_top_billid) == null) {
                TermVO termvo = BillTermUtils.constructTermVO(item, new UFDouble(100));
                if (isResetBusidate) {
                    busidate = item2Busidate.get(item.getPrimaryKey()) == null ? item.getBusidate() : (UFDate)item2Busidate.get(item.getPrimaryKey());
                    item.setBusidate(busidate);
                }
                if ("F3".equals(item.getPk_billtype())) {
                    UFBoolean prepay = BillEnumCollection.PreSigns.ISPRE.VALUE.equals(item.getPrepay()) ? UFBoolean.TRUE : UFBoolean.FALSE;
                    termvo.setPrepay(prepay);
                }
                termvo.setExpiredate(item.getBusidate());
                terms.add(termvo);
            } else {
                PaymentVO paymentVO2 = (PaymentVO)paymentVOs.get(pk_payterm);
                if (paymentVO2 == null) {
                    paymentVO2 = (PaymentVO)paymentVOs.get(pk_top_billid);
                }
                for (PaymentChVO paychVO : paymentVO2.getPaymentch()) {
                    Object[] rateschemach;
                    UFDate expiredate;
                    TermVO termvo = null;
                    UFDouble rate = paychVO.getAccrate();
                    if (ArapCommonTool.isZero(rate)) continue;
                    busidate = item.getBusidate();
                    if (isResetBusidate) {
                        busidate = map.get(BillTermUtils.getPaymentKey(item, (SuperVO)paychVO));
                        if (busidate != null) {
                            writeBackMap.put(paychVO.getShoworder(), busidate.getDateAfter(paychVO.getEffectdateadddate().intValue()));
                        }
                        busidate = busidate == null ? item.getBusidate() : busidate;
                    }
                    termvo = BillTermUtils.constructTermVO(item, paychVO.getAccrate());
                    if (null != paychVO.getCheckdata() && 0 <= paychVO.getCheckdata()) {
                        boolean nextmonth = "1".equals(paychVO.getEffectmonth());
                        expiredate = BillTermUtils.getDate(busidate, paychVO.getCheckdata(), paychVO.getAccountday(), nextmonth, paychVO.getEffectaddmonth(), paychVO.getEffectdateadddate());
                        termvo.setExpiredate(expiredate);
                    } else {
                        expiredate = busidate.getDateAfter((paychVO.getPaymentday() == null ? 0 : paychVO.getPaymentday()) + (paychVO.getEffectdateadddate() == null ? 0 : paychVO.getEffectdateadddate()));
                        termvo.setExpiredate(expiredate);
                    }
                    termvo.setInnerctldeferdays(null);
                    termvo.setInsurance(paychVO.getIsdeposit());
                    if (StringUtils.isNotEmpty((CharSequence)paychVO.getPk_rate()) && !ArrayUtils.isEmpty((Object[])(rateschemach = ((RateSchemaVO)queryRateByPk.get(paychVO.getPk_rate())).getRateschemach()))) {
                        termvo.setLastdiscount(rateschemach[rateschemach.length - 1].getRate());
                        termvo.setLastdiscountdate(busidate.getDateAfter(rateschemach[rateschemach.length - 1].getRdata().intValue()));
                    }
                    if ("F1".equals(item.getPk_billtype())) {
                        termvo.setPrepay(paychVO.getPrepayment());
                    } else if ("F3".equals(item.getPk_billtype()) || "23E1".equals(item.getPk_billtype())) {
                        UFBoolean prepay = BillEnumCollection.PreSigns.ISPRE.VALUE.equals(item.getPrepay()) ? UFBoolean.TRUE : UFBoolean.FALSE;
                        termvo.setPrepay(prepay);
                    }
                    termvo.setPk_term_b(paychVO.getPk_paymentch());
                    terms.add(termvo);
                }
                if (writeBackMap.size() > 0 && writeBackMap.get(writeBackMap.firstKey()) != null) {
                    item.setBusidate((UFDate)writeBackMap.get(writeBackMap.firstKey()));
                }
                writeBackMap.clear();
            }
            termMaps.put(item, terms);
        }
        return termMaps;
    }

    private static Map<BaseItemVO, List<TermVO>> constructPaymentTermsByPlugin(List<BaseItemVO> items, Map<String, ArapTermDateVO[]> pluginTermVOMap) throws BusinessException {
        ArrayList<String> rateschemalist = new ArrayList<String>();
        for (Map.Entry<String, ArapTermDateVO[]> entry : pluginTermVOMap.entrySet()) {
            ArapTermDateVO[] termdatevos = entry.getValue();
            if (termdatevos == null || termdatevos.length == 0) continue;
            for (int i = 0; i < termdatevos.length; ++i) {
                PaymentChVO payItem;
                ArapTermDateVO arapTermDateVO = termdatevos[i];
                if (arapTermDateVO == null || !StringUtils.isNotEmpty((CharSequence)(payItem = arapTermDateVO.getPaymentvo()).getPk_rate())) continue;
                rateschemalist.add(payItem.getPk_rate());
            }
        }
        String[] rateschema = rateschemalist.toArray(new String[0]);
        HashMap queryRateByPk = ((IPaytermPubService)NCLocator.getInstance().lookup(IPaytermPubService.class)).queryRateByPk(rateschema);
        if (queryRateByPk == null) {
            queryRateByPk = new HashMap();
        }
        HashMap<BaseItemVO, List<TermVO>> termMaps = new HashMap<BaseItemVO, List<TermVO>>();
        ArrayList<TermVO> terms = null;
        for (BaseItemVO item : items) {
            terms = new ArrayList<TermVO>();
            Object pk_top_itemid = item.getAttributeValue("top_itemid");
            ArapTermDateVO[] paychlist = pluginTermVOMap.get(pk_top_itemid);
            if (paychlist == null || paychlist.length == 0) continue;
            for (ArapTermDateVO termpaychVO : paychlist) {
                Object[] rateschemach;
                PaymentChVO paychVO = termpaychVO.getPaymentvo();
                UFDouble rate = paychVO.getAccrate();
                if (ArapCommonTool.isZero(rate)) continue;
                TermVO termvo = BillTermUtils.constructTermVO(item, paychVO.getAccrate());
                termvo.setExpiredate(termpaychVO.getExpiredate());
                UFDate busidate = termpaychVO.getPaydate();
                item.setBusidate(busidate);
                termvo.setInnerctldeferdays(null);
                termvo.setInsurance(paychVO.getIsdeposit());
                if (StringUtils.isNotEmpty((CharSequence)paychVO.getPk_rate()) && !ArrayUtils.isEmpty((Object[])(rateschemach = ((RateSchemaVO)queryRateByPk.get(paychVO.getPk_rate())).getRateschemach()))) {
                    termvo.setLastdiscount(rateschemach[rateschemach.length - 1].getRate());
                    termvo.setLastdiscountdate(busidate.getDateAfter(rateschemach[rateschemach.length - 1].getRdata().intValue()));
                }
                if ("F1".equals(item.getPk_billtype())) {
                    termvo.setPrepay(paychVO.getPrepayment());
                } else if ("F3".equals(item.getPk_billtype()) || "23E1".equals(item.getPk_billtype())) {
                    UFBoolean prepay = BillEnumCollection.PreSigns.ISPRE.VALUE.equals(item.getPrepay()) ? UFBoolean.TRUE : UFBoolean.FALSE;
                    termvo.setPrepay(prepay);
                }
                termvo.setPk_term_b(paychVO.getPk_paymentch());
                terms.add(termvo);
            }
            termMaps.put(item, terms);
        }
        return termMaps;
    }

    private static Map<BaseItemVO, List<TermVO>> constructPaymentBackTermsByPlugin(List<BaseItemVO> items, List<BaseItemVO> topItems, Map<String, ArapTermDateVO[]> pluginTermVOMap) throws BusinessException {
        ArrayList<String> rateschemalist = new ArrayList<String>();
        for (Map.Entry<String, ArapTermDateVO[]> entry : pluginTermVOMap.entrySet()) {
            ArapTermDateVO[] termdatevos = entry.getValue();
            if (termdatevos == null || termdatevos.length == 0) continue;
            for (int i = 0; i < termdatevos.length; ++i) {
                PaymentChVO payItem;
                ArapTermDateVO arapTermDateVO = termdatevos[i];
                if (arapTermDateVO == null || !StringUtils.isNotEmpty((CharSequence)(payItem = arapTermDateVO.getPaymentvo()).getPk_rate())) continue;
                rateschemalist.add(payItem.getPk_rate());
            }
        }
        String[] rateschema = rateschemalist.toArray(new String[0]);
        HashMap queryRateByPk = ((IPaytermPubService)NCLocator.getInstance().lookup(IPaytermPubService.class)).queryRateByPk(rateschema);
        if (queryRateByPk == null) {
            queryRateByPk = new HashMap();
        }
        HashMap<String, BaseItemVO> topItemMap = new HashMap<String, BaseItemVO>();
        for (BaseItemVO topItem : topItems) {
            topItemMap.put(topItem.getPrimaryKey(), topItem);
        }
        HashMap<BaseItemVO, List<TermVO>> termMaps = new HashMap<BaseItemVO, List<TermVO>>();
        ArrayList<TermVO> terms = null;
        for (int i = 0; i < items.size(); ++i) {
            BaseItemVO topItem;
            BaseItemVO item = items.get(i);
            Object top_itemid = item.getAttributeValue("top_itemid");
            if (top_itemid == null || (topItem = (BaseItemVO)topItemMap.get(top_itemid)) == null) continue;
            terms = new ArrayList<TermVO>();
            Object pk_top_itemid = topItem.getAttributeValue("top_itemid");
            ArapTermDateVO[] paychlist = pluginTermVOMap.get(pk_top_itemid);
            if (paychlist == null || paychlist.length == 0) continue;
            for (ArapTermDateVO termpaychVO : paychlist) {
                Object[] rateschemach;
                PaymentChVO paychVO = termpaychVO.getPaymentvo();
                UFDouble rate = paychVO.getAccrate();
                if (ArapCommonTool.isZero(rate)) continue;
                TermVO termvo = BillTermUtils.constructTermVO(item, paychVO.getAccrate());
                termvo.setExpiredate(termpaychVO.getExpiredate());
                UFDate busidate = termpaychVO.getPaydate();
                item.setBusidate(busidate);
                termvo.setInnerctldeferdays(null);
                termvo.setInsurance(paychVO.getIsdeposit());
                if (StringUtils.isNotEmpty((CharSequence)paychVO.getPk_rate()) && !ArrayUtils.isEmpty((Object[])(rateschemach = ((RateSchemaVO)queryRateByPk.get(paychVO.getPk_rate())).getRateschemach()))) {
                    termvo.setLastdiscount(rateschemach[rateschemach.length - 1].getRate());
                    termvo.setLastdiscountdate(busidate.getDateAfter(rateschemach[rateschemach.length - 1].getRdata().intValue()));
                }
                if ("F1".equals(item.getPk_billtype())) {
                    termvo.setPrepay(paychVO.getPrepayment());
                } else if ("F3".equals(item.getPk_billtype()) || "23E1".equals(item.getPk_billtype())) {
                    UFBoolean prepay = BillEnumCollection.PreSigns.ISPRE.VALUE.equals(item.getPrepay()) ? UFBoolean.TRUE : UFBoolean.FALSE;
                    termvo.setPrepay(prepay);
                }
                termvo.setPk_term_b(paychVO.getPk_paymentch());
                terms.add(termvo);
            }
            termMaps.put(item, terms);
        }
        return termMaps;
    }

    private static TermVO constructTermVO(BaseItemVO item, UFDouble rate) throws BusinessException {
        TermVO termvo = new TermVO();
        int direction = ArapBillPubUtil.isDf(item.getPk_billtype());
        termvo.setPk_org(item.getPk_org());
        termvo.setPk_group(item.getPk_group());
        termvo.setPk_bill(item.getParentPK());
        termvo.setPk_item(item.getChildrenPK());
        termvo.setLocal_money_bal(BillTermUtils.getDRate(item.getLocal_money_bal(), rate));
        termvo.setMoney_bal(BillTermUtils.getDRate(item.getMoney_bal(), rate));
        if (item.getOccupationmny() != null && UFDouble.ZERO_DBL.compareTo((Object)item.getOccupationmny()) == 0) {
            termvo.setOccupationmny(TermVO.UF_DOUBLE_ZERO);
        } else {
            termvo.setOccupationmny(BillTermUtils.getDRate(item.getOccupationmny() == null ? UFDouble.ZERO_DBL : item.getOccupationmny(), rate));
        }
        termvo.setQuantity_bal(BillTermUtils.getDRate(item.getQuantity_bal(), rate));
        UFDouble group = null;
        UFDouble global = null;
        switch (direction) {
            case 0: {
                termvo.setLocal_money_cr(BillTermUtils.getDRate(item.getLocal_money_cr(), rate));
                termvo.setMoney_cr(BillTermUtils.getDRate(item.getMoney_cr(), rate));
                termvo.setQuantity_cr(BillTermUtils.getDRate(item.getQuantity_cr(), rate));
                group = BillTermUtils.getDRate(item.getGroupcrebit(), rate);
                global = BillTermUtils.getDRate(item.getGlobalcrebit(), rate);
                termvo.setGroupcredit(group);
                termvo.setGroupbalance(group);
                termvo.setGrouplocal(group);
                termvo.setGlobalcredit(global);
                termvo.setGlobalbalance(global);
                termvo.setGloballocal(global);
                break;
            }
            case 1: {
                termvo.setLocal_money_de(BillTermUtils.getDRate(item.getLocal_money_de(), rate));
                termvo.setMoney_de(BillTermUtils.getDRate(item.getMoney_de(), rate));
                termvo.setQuantity_de(BillTermUtils.getDRate(item.getQuantity_de(), rate));
                group = BillTermUtils.getDRate(item.getGroupdebit(), rate);
                global = BillTermUtils.getDRate(item.getGlobaldebit(), rate);
                termvo.setGroupdebit(group);
                termvo.setGroupbalance(group);
                termvo.setGrouplocal(group);
                termvo.setGlobaldebit(global);
                termvo.setGlobalbalance(global);
                termvo.setGloballocal(global);
                break;
            }
        }
        return termvo;
    }

    private static TermVO constructTermVO4PM(BaseItemVO item, PMForArapTermData vo) throws BusinessException {
        TermVO termvo = new TermVO();
        int direction = ArapBillPubUtil.isDf(item.getPk_billtype());
        termvo.setPk_org(item.getPk_org());
        termvo.setPk_group(item.getPk_group());
        termvo.setPk_bill(item.getParentPK());
        termvo.setPk_item(item.getChildrenPK());
        termvo.setMoney_bal(vo.getMoney());
        if (item.getOccupationmny().compareTo((Object)UFDouble.ZERO_DBL) == 0) {
            termvo.setOccupationmny(TermVO.UF_DOUBLE_ZERO);
        } else {
            termvo.setOccupationmny(vo.getMoney());
        }
        termvo.setPrepay(UFBoolean.valueOf((boolean)vo.isExpe()));
        termvo.setInsurance(UFBoolean.valueOf((boolean)vo.isQual()));
        UFDate expiredate = vo.getQual_pay_date();
        if (vo.getQual_length() != null) {
            expiredate = vo.getQual_pay_date().getDateAfter(vo.getQual_length().intValue());
        }
        termvo.setExpiredate(expiredate);
        termvo.setInnerctldeferdays(expiredate);
        UFDouble local = null;
        UFDouble group = null;
        UFDouble global = null;
        UFDouble quantity = null;
        try {
            quantity = item.getPrice() != null && !UFDouble.ZERO_DBL.equals((Object)item.getPrice()) ? vo.getMoney().div(item.getPrice()) : UFDouble.ZERO_DBL;
        }
        catch (Exception e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
        }
        try {
            UFDouble[] yfbs = Currency.computeYFB((String)item.getPk_org(), (int)2, (String)item.getPk_currtype(), (UFDouble)vo.getMoney(), null, null, null, (UFDouble)item.getRate(), (UFDate)item.getBilldate());
            local = yfbs[2];
            UFDouble[] group_global = Currency.computeGroupGlobalAmount((UFDouble)vo.getMoney(), (UFDouble)local, (String)item.getPk_currtype(), (UFDate)item.getBilldate(), (String)item.getPk_org(), (String)item.getPk_group(), (UFDouble)item.getGlobalrate(), (UFDouble)item.getGrouprate());
            group = group_global[0];
            global = group_global[1];
        }
        catch (BusinessException e) {
            ExceptionHandler.handleException((Exception)((Object)e));
        }
        switch (direction) {
            case 0: {
                termvo.setMoney_cr(vo.getMoney());
                termvo.setQuantity_cr(quantity);
                termvo.setLocal_money_cr(local);
                termvo.setGroupcredit(group);
                termvo.setGroupbalance(group);
                termvo.setGrouplocal(group);
                termvo.setGlobalcredit(global);
                termvo.setGlobalbalance(global);
                termvo.setGloballocal(global);
                break;
            }
            case 1: {
                termvo.setMoney_de(vo.getMoney());
                termvo.setQuantity_de(quantity);
                termvo.setLocal_money_de(local);
                termvo.setGroupdebit(group);
                termvo.setGroupbalance(group);
                termvo.setGrouplocal(group);
                termvo.setGlobaldebit(global);
                termvo.setGlobalbalance(global);
                termvo.setGloballocal(global);
                break;
            }
        }
        termvo.setQuantity_bal(quantity);
        termvo.setLocal_money_bal(local);
        return termvo;
    }

    private static Map<String, BaseItemVO> construtBaseMap(AggregatedValueObject[] billsOld) {
        HashMap<String, BaseItemVO> itemsOld = new HashMap<String, BaseItemVO>();
        if (!ArrayUtils.isEmpty((Object[])billsOld)) {
            for (AggregatedValueObject t : billsOld) {
                for (SuperVO item : (SuperVO[])t.getChildrenVO()) {
                    itemsOld.put(item.getPrimaryKey(), (BaseItemVO)item);
                }
            }
        }
        return itemsOld;
    }

    private static void dealMoneyDig(Map<BaseItemVO, List<TermVO>> baseTerms) throws BusinessException {
        HashMap<String, Integer> itemMaterial = new HashMap<String, Integer>();
        HashSet<String> materials = new HashSet<String>();
        Set<BaseItemVO> itemSet = baseTerms.keySet();
        String orgCurrPk = null;
        String groupCurrpk = null;
        String globalCurrPk = null;
        if (itemSet.size() > 0) {
            BaseItemVO base = itemSet.toArray(new BaseItemVO[0])[0];
            groupCurrpk = Currency.getGroupCurrpk((String)base.getPk_group());
            globalCurrPk = Currency.getGlobalCurrPk((String)base.getPk_org());
            orgCurrPk = Currency.getLocalCurrPK((String)base.getPk_org());
        }
        for (BaseItemVO item : itemSet) {
            if (!StringUtils.isNotEmpty((CharSequence)item.getMaterial())) continue;
            materials.add(item.getMaterial());
        }
        if (materials.size() > 0) {
            int i;
            String[] meterialsArray = materials.toArray(new String[0]);
            Map vo = ((IMaterialPubService)NCLocator.getInstance().lookup(IMaterialPubService.class)).queryMaterialBaseInfoByPks(meterialsArray, new String[]{"pk_measdoc"});
            String[] pkMeasdocs = new String[vo.size()];
            for (i = 0; i < meterialsArray.length; ++i) {
                if (vo.get(meterialsArray[i]) == null) continue;
                pkMeasdocs[i] = ((MaterialVO)vo.get(meterialsArray[i])).getPk_measdoc();
            }
            Integer[] precisionByPks = MeasdocUtil.getInstance().getPrecisionByPks(pkMeasdocs);
            for (i = 0; i < meterialsArray.length; ++i) {
                itemMaterial.put(meterialsArray[i], precisionByPks == null || precisionByPks[i] == null ? 2 : precisionByPks[i]);
            }
        }
        bzCon = new CurrencyControlBO();
        for (Map.Entry<BaseItemVO, List<TermVO>> entry : baseTerms.entrySet()) {
            BaseItemVO itemVO = entry.getKey();
            List<TermVO> value = entry.getValue();
            TermVO computeIermVO = new TermVO();
            BillTermUtils.formatBaseItemVO(itemVO);
            for (int i = 0; i < value.size(); ++i) {
                TermVO termVO = value.get(i);
                Integer materialpower = itemVO.getMaterial() != null && itemMaterial.size() != 0 ? (Integer)itemMaterial.get(itemVO.getMaterial()) : Integer.valueOf(8);
                if (value.size() == 1) {
                    BillTermUtils.formatTermVO(termVO, itemVO.getPk_currtype(), orgCurrPk, groupCurrpk, globalCurrPk, materialpower);
                    continue;
                }
                if (i == 0) {
                    BillTermUtils.formatTermVO(computeIermVO, itemVO.getPk_currtype(), orgCurrPk, groupCurrpk, globalCurrPk, materialpower);
                }
                if (i == value.size() - 1 && value.size() > 1) {
                    BillTermUtils.reverseMoney(computeIermVO, itemVO, termVO, materialpower);
                    continue;
                }
                BillTermUtils.formatTermVO(termVO, itemVO.getPk_currtype(), orgCurrPk, groupCurrpk, globalCurrPk, materialpower);
                BillTermUtils.sumMoney(computeIermVO, termVO);
            }
        }
    }

    private static void formatBaseItemVO(BaseItemVO itemVO) {
        if (itemVO.getDirection() == null) {
            throw new BusinessRuntimeException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0584"));
        }
        String[] field1 = new String[]{"local_money_cr", "money_cr", "groupcrebit", "globalcrebit"};
        String[] field2 = new String[]{"local_money_de", "money_de", "groupdebit", "globaldebit"};
        if (itemVO.getDirection().intValue() == BillEnumCollection.Direction.DEBIT.VALUE.intValue()) {
            for (int i = 0; i < field1.length; ++i) {
                String f1 = field1[i];
                String f2 = field2[i];
                UFDouble f1value = (UFDouble)itemVO.getAttributeValue(f1);
                UFDouble f2value = (UFDouble)itemVO.getAttributeValue(f2);
                itemVO.setAttributeValue(f1, f1value.setScale(f2value.getPower(), 4));
            }
        } else {
            for (int i = 0; i < field1.length; ++i) {
                String f1 = field1[i];
                String f2 = field2[i];
                UFDouble f1value = (UFDouble)itemVO.getAttributeValue(f1);
                UFDouble f2value = (UFDouble)itemVO.getAttributeValue(f2);
                itemVO.setAttributeValue(f2, f2value.setScale(f1value.getPower(), 4));
            }
        }
    }

    private static void formatTermVO(TermVO termVO, String currtype, String orgCurrPk, String groupCurrpk, String globalCurrPk, Integer materialpower) {
        CurrencyControlBO bzCon = BillTermUtils.getCurrencyControlBO();
        termVO.setMoney_bal(bzCon.getFormat(currtype, termVO.getMoney_bal()));
        termVO.setMoney_cr(bzCon.getFormat(currtype, termVO.getMoney_cr()));
        termVO.setMoney_de(bzCon.getFormat(currtype, termVO.getMoney_de()));
        termVO.setOccupationmny(bzCon.getFormat(currtype, termVO.getOccupationmny()));
        termVO.setLocal_money_bal(bzCon.getFormat(orgCurrPk, termVO.getLocal_money_bal()));
        termVO.setLocal_money_cr(bzCon.getFormat(orgCurrPk, termVO.getLocal_money_cr()));
        termVO.setLocal_money_de(bzCon.getFormat(orgCurrPk, termVO.getLocal_money_de()));
        termVO.setGroupbalance(bzCon.getFormat(groupCurrpk, termVO.getGroupbalance()));
        termVO.setGroupcredit(bzCon.getFormat(groupCurrpk, termVO.getGroupcredit()));
        termVO.setGroupdebit(bzCon.getFormat(groupCurrpk, termVO.getGroupdebit()));
        termVO.setGlobalbalance(bzCon.getFormat(globalCurrPk, termVO.getGlobalbalance()));
        termVO.setGlobalcredit(bzCon.getFormat(globalCurrPk, termVO.getGlobalcredit()));
        termVO.setGlobaldebit(bzCon.getFormat(globalCurrPk, termVO.getGlobaldebit()));
        termVO.setQuantity_bal(termVO.getQuantity_bal().setScale(materialpower.intValue(), 4));
        termVO.setQuantity_cr(termVO.getQuantity_cr().setScale(materialpower.intValue(), 4));
        termVO.setQuantity_de(termVO.getQuantity_de().setScale(materialpower.intValue(), 4));
    }

    private static CurrencyControlBO getCurrencyControlBO() {
        if (bzCon == null) {
            bzCon = new CurrencyControlBO();
        }
        return bzCon;
    }

    private static UFDate getDate(UFDate effectdate, Integer fixedDate, Integer accountDate, boolean nextMonth, Integer afterMonth, Integer afterdate) {
        int totalMonth;
        int fixedDay;
        int countMonth = 0;
        UFDate date = effectdate.getDateAfter(afterdate.intValue());
        int dayOfDate = date.getDay();
        int monthOfDate = date.getMonth();
        int yearOfDate = date.getYear();
        if (accountDate != null) {
            int accountDay = accountDate;
            if (accountDay != 0 && dayOfDate > accountDay) {
                if (monthOfDate + 1 > 12) {
                    ++yearOfDate;
                }
                if ((monthOfDate = (monthOfDate + 1) % 12) == 0) {
                    monthOfDate = 12;
                }
            }
            if (UFDate.getDaysMonth((int)yearOfDate, (int)monthOfDate) < accountDay) {
                accountDay = UFDate.getDaysMonth((int)yearOfDate, (int)monthOfDate);
            }
            dayOfDate = accountDay;
        }
        if (nextMonth) {
            ++countMonth;
        }
        if ((fixedDay = fixedDate.intValue()) == 0) {
            fixedDay = dayOfDate;
        }
        if (dayOfDate > fixedDay) {
            ++countMonth;
        }
        if (afterMonth != null) {
            countMonth += afterMonth.intValue();
        }
        if ((totalMonth = monthOfDate + countMonth) > 12) {
            yearOfDate += totalMonth / 12;
        }
        if ((monthOfDate = totalMonth % 12) == 0) {
            monthOfDate = 12;
        }
        if (UFDate.getDaysMonth((int)yearOfDate, (int)monthOfDate) < fixedDay) {
            fixedDay = UFDate.getDaysMonth((int)yearOfDate, (int)monthOfDate);
        }
        return new UFDate(yearOfDate + "-" + monthOfDate + "-" + fixedDay);
    }

    private static UFDouble getDRate(UFDouble je, UFDouble r1) {
        if (je == null) {
            je = new UFDouble(0.0);
        }
        return je.multiply(r1).div(new UFDouble(100.0));
    }

    private static String getPaymentKey(BaseItemVO item, SuperVO payItem) {
        if (payItem.getPrimaryKey() == null) {
            return item.getPrimaryKey();
        }
        return item.getPrimaryKey() + payItem.getPrimaryKey();
    }

    private static boolean isConfirmBill(String pk_billtype, String src_billtype, String top_billtype) {
        if (StringUtils.isEmpty((CharSequence)pk_billtype) || !pk_billtype.equals("F0") && !pk_billtype.equals("F1")) {
            return false;
        }
        if (PU_INVOICE_BILLTYPE.equals(top_billtype)) {
            return true;
        }
        return Arrays.asList(SO_ORDER_BILLTYPE, PU_ORDER_BILLTYPE, CT_ORDER_BILLTYPE, INNER_ORDER_BILLTYPE).contains(src_billtype);
    }

    private static boolean isFromETInvoice(String pk_billtype, String src_billtype, String top_billtype) {
        if ("23E0".equals(top_billtype) || "23E1".equals(top_billtype)) {
            return false;
        }
        if (StringUtils.isEmpty((CharSequence)pk_billtype) || !Arrays.asList("F0", "F1", "23E0", "23E1").contains(pk_billtype)) {
            return false;
        }
        return StringUtils.isEmpty((CharSequence)top_billtype) ? false : top_billtype.equals("5790");
    }

    private static boolean isFromITInvoice(String pk_billtype, String src_billtype, String top_billtype) {
        if ("23E0".equals(top_billtype) || "23E1".equals(top_billtype)) {
            return false;
        }
        if (StringUtils.isEmpty((CharSequence)pk_billtype) || !Arrays.asList("F0", "F1", "23E0", "23E1").contains(pk_billtype)) {
            return false;
        }
        return StringUtils.isEmpty((CharSequence)top_billtype) || StringUtils.isEmpty((CharSequence)src_billtype) ? false : top_billtype.equals(PU_INVOICE_BILLTYPE) && src_billtype.equals("5801");
    }

    private static boolean isFromInnerTrans(String pk_billtype, String src_billtype, String top_billtype) {
        if ("23E0".equals(top_billtype) || "23E1".equals(top_billtype)) {
            return false;
        }
        if (StringUtils.isEmpty((CharSequence)pk_billtype) || !Arrays.asList("F0", "F1", "23E0", "23E1").contains(pk_billtype)) {
            return false;
        }
        return StringUtils.isEmpty((CharSequence)src_billtype) ? false : src_billtype.equals(INNER_ORDER_BILLTYPE);
    }

    private static boolean isNeedClear(BaseItemVO baseItemVO, BaseItemVO oldItemVO, BaseBillVO baseBillVO, BaseBillVO oldBaseBillVO) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        if ("F0".equals(baseItemVO.getPk_billtype()) || "F2".equals(baseItemVO.getPk_billtype())) {
            map.put(BillEnumCollection.BillSatus.SAVE.VALUE, BillEnumCollection.BillSatus.TEMPEORARY.VALUE);
        }
        return null != map.get(oldBaseBillVO.getBillstatus()) && null != baseBillVO.getBillstatus() && baseBillVO.getBillstatus().equals(map.get(oldBaseBillVO.getBillstatus()));
    }

    private static boolean isNotEstBill(IContext context) {
        return context.getBoolean(ISNOTESTBILL);
    }

    private static boolean isPayFromPU(String pk_billtype, String src_billtype, String top_billtype) {
        boolean b;
        if ("23E1".equals(top_billtype)) {
            return false;
        }
        if (StringUtils.isEmpty((CharSequence)pk_billtype) || !pk_billtype.equals("F1") && !pk_billtype.equals("23E1")) {
            return false;
        }
        boolean bl = b = StringUtils.isEmpty((CharSequence)src_billtype) ? false : src_billtype.equals(PU_ORDER_BILLTYPE);
        if (!b) {
            b = CT_ORDER_BILLTYPE.equals(src_billtype);
        }
        if (!b) {
            b = PU_INVOICE_BILLTYPE.equals(top_billtype);
        }
        return b;
    }

    private static boolean isPaytermNeedChange(BaseItemVO baseItemVO, BaseItemVO oldItemVO, BaseBillVO baseBillVO, BaseBillVO oldBaseBillVO) {
        String[] keyField;
        if (oldItemVO == null) {
            return true;
        }
        for (String key : keyField = new String[]{"pk_payterm", "busidate", "money_cr", "money_de", "local_money_de", "local_money_cr", "groupcrebit", "groupdebit", "globalcrebit", "globaldebit", "customer", "supplier", "prepay", "pk_recpaytype", "quantity_de", "quantity_cr"}) {
            if (ArapBillVOUtils.simpleEquals(baseItemVO.getAttributeValue(key), oldItemVO.getAttributeValue(key))) continue;
            return true;
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(BillEnumCollection.BillSatus.TEMPEORARY.VALUE, BillEnumCollection.BillSatus.SAVE.VALUE);
        map.put(BillEnumCollection.BillSatus.UNCOMFIRM.VALUE, BillEnumCollection.BillSatus.SAVE.VALUE);
        return null != map.get(oldBaseBillVO.getBillstatus()) && null != baseBillVO.getBillstatus() && baseBillVO.getBillstatus().equals(map.get(oldBaseBillVO.getBillstatus()));
    }

    private static boolean isRecFromSO(String pk_billtype, String src_billtype, String top_billtype) {
        if ("23E0".equals(top_billtype)) {
            return false;
        }
        if (StringUtils.isEmpty((CharSequence)pk_billtype) || !pk_billtype.equals("F0") && !pk_billtype.equals("23E0")) {
            return false;
        }
        boolean b = StringUtils.isEmpty((CharSequence)src_billtype) ? false : src_billtype.equals(SO_ORDER_BILLTYPE);
        return b;
    }

    private static BillDateObj queryEstiBillDateObj(List<BaseItemVO> items, Map<String, IncomeVO> incomenVOs) {
        BillDateObj obj = new BillDateObj();
        obj.item2Busidate = ((IArapBillQueryBaseService)NCLocator.getInstance().lookup(ArapBillTypeInfo.getInstance("23E0").getBillQueryService())).queryBusiDate(items.toArray(new BaseItemVO[0]));
        obj.itemPlusPayterm2Busidate = new HashMap<String, UFDate>();
        for (BaseItemVO item : items) {
            IncomeVO incomeVO = incomenVOs.get(item.getAttributeValue("pk_payterm"));
            for (SuperVO superVO : incomeVO == null ? new SuperVO[]{} : incomeVO.getPaymentch()) {
                UFDate value = obj.item2Busidate.get(item.getPrimaryKey());
                if (value == null) continue;
                obj.itemPlusPayterm2Busidate.put(BillTermUtils.getPaymentKey(item, superVO), value);
            }
        }
        return obj;
    }

    private static BillDateObj queryEstiBillDateObj2(List<BaseItemVO> items, Map<String, PaymentVO> paymentVOs) {
        BillDateObj obj = new BillDateObj();
        obj.item2Busidate = ((IArapBillQueryBaseService)NCLocator.getInstance().lookup(ArapBillTypeInfo.getInstance("23E1").getBillQueryService())).queryBusiDate(items.toArray(new BaseItemVO[0]));
        obj.itemPlusPayterm2Busidate = new HashMap<String, UFDate>();
        for (BaseItemVO item : items) {
            PaymentVO paymentVO = paymentVOs.get(item.getAttributeValue("pk_payterm"));
            for (SuperVO superVO : paymentVO == null ? new SuperVO[]{} : paymentVO.getPaymentch()) {
                obj.itemPlusPayterm2Busidate.put(BillTermUtils.getPaymentKey(item, superVO), obj.item2Busidate.get(item.getPrimaryKey()));
            }
        }
        return obj;
    }

    private static void reverseMoney(TermVO computeIermVO, BaseItemVO itemVO, TermVO termVO, Integer materialpower) {
        termVO.setMoney_bal((itemVO.getMoney_bal() == null ? UFDouble.ZERO_DBL : itemVO.getMoney_bal()).sub(computeIermVO.getMoney_bal()));
        termVO.setMoney_cr((itemVO.getMoney_cr() == null ? UFDouble.ZERO_DBL : itemVO.getMoney_cr()).sub(computeIermVO.getMoney_cr()));
        termVO.setMoney_de((itemVO.getMoney_de() == null ? UFDouble.ZERO_DBL : itemVO.getMoney_de()).sub(computeIermVO.getMoney_de()));
        termVO.setOccupationmny((itemVO.getOccupationmny() == null ? UFDouble.ZERO_DBL : itemVO.getOccupationmny()).sub(computeIermVO.getOccupationmny()));
        termVO.setLocal_money_bal((itemVO.getLocal_money_bal() == null ? UFDouble.ZERO_DBL : itemVO.getLocal_money_bal()).sub(computeIermVO.getLocal_money_bal()));
        termVO.setLocal_money_cr((itemVO.getLocal_money_cr() == null ? UFDouble.ZERO_DBL : itemVO.getLocal_money_cr()).sub(computeIermVO.getLocal_money_cr()));
        termVO.setLocal_money_de((itemVO.getLocal_money_de() == null ? UFDouble.ZERO_DBL : itemVO.getLocal_money_de()).sub(computeIermVO.getLocal_money_de()));
        termVO.setGroupbalance((itemVO.getGroupbalance() == null ? UFDouble.ZERO_DBL : itemVO.getGroupbalance()).sub(computeIermVO.getGroupbalance()));
        termVO.setGroupcredit((itemVO.getGroupcrebit() == null ? UFDouble.ZERO_DBL : itemVO.getGroupcrebit()).sub(computeIermVO.getGroupcredit()));
        termVO.setGroupdebit((itemVO.getGroupdebit() == null ? UFDouble.ZERO_DBL : itemVO.getGroupdebit()).sub(computeIermVO.getGroupdebit()));
        termVO.setGlobalbalance((itemVO.getGlobalbalance() == null ? UFDouble.ZERO_DBL : itemVO.getGlobalbalance()).sub(computeIermVO.getGlobalbalance()));
        termVO.setGlobalcredit((itemVO.getGlobalcrebit() == null ? UFDouble.ZERO_DBL : itemVO.getGlobalcrebit()).sub(computeIermVO.getGlobalcredit()));
        termVO.setGlobaldebit((itemVO.getGlobaldebit() == null ? UFDouble.ZERO_DBL : itemVO.getGlobaldebit()).sub(computeIermVO.getGlobaldebit()));
        termVO.setQuantity_bal((itemVO.getQuantity_bal() == null ? UFDouble.ZERO_DBL : itemVO.getQuantity_bal()).setScale(materialpower.intValue(), 4).sub(computeIermVO.getQuantity_bal()));
        termVO.setQuantity_cr((itemVO.getQuantity_cr() == null ? UFDouble.ZERO_DBL : itemVO.getQuantity_cr()).setScale(materialpower.intValue(), 4).sub(computeIermVO.getQuantity_cr()));
        termVO.setQuantity_de((itemVO.getQuantity_de() == null ? UFDouble.ZERO_DBL : itemVO.getQuantity_de()).setScale(materialpower.intValue(), 4).sub(computeIermVO.getQuantity_de()));
    }

    private static void setEstiWashBillDate(MapList<String, TermVO> termList, List<TermVO> terms, BaseItemVO item) throws BusinessException {
        String topItemid = item.getTop_itemid();
        if (termList.size() != 0 && !StringUtil.isEmpty(topItemid)) {
            List topVOs = termList.get((Object)topItemid);
            for (int i = 0; i < topVOs.size() && topVOs.size() == terms.size(); ++i) {
                TermVO termVO = terms.get(i);
                termVO.setExpiredate(((TermVO)((Object)topVOs.get(i))).getExpiredate());
                termVO.setInnerctldeferdays(((TermVO)((Object)topVOs.get(i))).getInnerctldeferdays());
                termVO.setLastdiscountdate(((TermVO)((Object)topVOs.get(i))).getLastdiscountdate());
            }
        }
    }

    private static void sumMoney(TermVO computeIermVO, TermVO termVO) {
        computeIermVO.setMoney_bal(computeIermVO.getMoney_bal().add(termVO.getMoney_bal()));
        computeIermVO.setMoney_cr(computeIermVO.getMoney_cr().add(termVO.getMoney_cr()));
        computeIermVO.setMoney_de(computeIermVO.getMoney_de().add(termVO.getMoney_de()));
        computeIermVO.setLocal_money_bal(computeIermVO.getLocal_money_bal().add(termVO.getLocal_money_bal()));
        computeIermVO.setLocal_money_cr(computeIermVO.getLocal_money_cr().add(termVO.getLocal_money_cr()));
        computeIermVO.setLocal_money_de(computeIermVO.getLocal_money_de().add(termVO.getLocal_money_de()));
        computeIermVO.setGroupbalance(computeIermVO.getGroupbalance().add(termVO.getGroupbalance()));
        computeIermVO.setGroupcredit(computeIermVO.getGroupcredit().add(termVO.getGroupcredit()));
        computeIermVO.setGroupdebit(computeIermVO.getGroupdebit().add(termVO.getGroupdebit()));
        computeIermVO.setGlobalbalance(computeIermVO.getGlobalbalance().add(termVO.getGlobalbalance()));
        computeIermVO.setGlobalcredit(computeIermVO.getGlobalcredit().add(termVO.getGlobalcredit()));
        computeIermVO.setGlobaldebit(computeIermVO.getGlobaldebit().add(termVO.getGlobaldebit()));
        computeIermVO.setQuantity_bal(computeIermVO.getQuantity_bal().add(termVO.getQuantity_bal()));
        computeIermVO.setQuantity_cr(computeIermVO.getQuantity_cr().add(termVO.getQuantity_cr()));
        computeIermVO.setQuantity_de(computeIermVO.getQuantity_de().add(termVO.getQuantity_de()));
        computeIermVO.setOccupationmny(computeIermVO.getOccupationmny().add(termVO.getOccupationmny()));
    }

    public static UFDate getExpiredateByTermDateVO(ArapTermDateVO termDateVO) {
        UFDate busidate = termDateVO.getPaydate();
        UFDate expiredate = null;
        if (termDateVO.isIncome()) {
            IncomeChVO payItem = termDateVO.getIncomevo();
            if (null != payItem.getCheckdata() && 0 <= payItem.getCheckdata()) {
                boolean nextmonth = "1".equals(payItem.getEffectmonth());
                expiredate = BillTermUtils.getDate(busidate, payItem.getCheckdata(), payItem.getAccountday(), nextmonth, payItem.getEffectaddmonth(), payItem.getEffectdateadddate());
            } else {
                expiredate = busidate.getDateAfter((payItem.getPaymentday() == null ? 0 : payItem.getPaymentday()) + (payItem.getEffectdateadddate() == null ? 0 : payItem.getEffectdateadddate()));
            }
        } else {
            PaymentChVO paychVO = termDateVO.getPaymentvo();
            if (null != paychVO.getCheckdata() && 0 <= paychVO.getCheckdata()) {
                boolean nextmonth = "1".equals(paychVO.getEffectmonth());
                expiredate = BillTermUtils.getDate(busidate, paychVO.getCheckdata(), paychVO.getAccountday(), nextmonth, paychVO.getEffectaddmonth(), paychVO.getEffectdateadddate());
            } else {
                expiredate = busidate.getDateAfter((paychVO.getPaymentday() == null ? 0 : paychVO.getPaymentday()) + (paychVO.getEffectdateadddate() == null ? 0 : paychVO.getEffectdateadddate()));
            }
        }
        termDateVO.setExpiredate(expiredate);
        return expiredate;
    }

    private static Map<BaseItemVO, List<TermVO>> getEstBackTerms(List<BaseItemVO> items, Map<BaseItemVO, List<TermVO>> termMaps) throws BusinessException {
        String top_billid;
        BaseItemVO[] topItems = null;
        Map<String, ArapTermDateVO[]> pluginTermVOMap = null;
        if ("23E1".equals(items.get(0).getTop_billtype())) {
            top_billid = items.get(0).getTop_billid();
            AggEstiPayableBillVO estPaybill = (AggEstiPayableBillVO)MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPK(AggEstiPayableBillVO.class, top_billid, false);
            topItems = estPaybill.getItems();
            HashMap<String, String> toppaymentMap = new HashMap<String, String>();
            for (BaseItemVO item : topItems) {
                String top_itemid = item.getTop_itemid();
                String pk_payterm = item.getPk_payterm();
                if (nc.vo.jcom.lang.StringUtil.isEmpty((String)top_itemid)) continue;
                toppaymentMap.put(top_itemid, pk_payterm);
            }
            pluginTermVOMap = ArapBusiPluginCenter.queryTermDateVOs("45", toppaymentMap, false);
        } else if ("23E0".equals(items.get(0).getTop_billtype())) {
            top_billid = items.get(0).getTop_billid();
            AggEstiReceivableBillVO estRecbill = (AggEstiReceivableBillVO)MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPK(AggEstiReceivableBillVO.class, top_billid, false);
            topItems = estRecbill.getItems();
            HashMap<String, String> toppaymentMap = new HashMap<String, String>();
            for (BaseItemVO item : topItems) {
                String top_itemid = item.getTop_itemid();
                String pk_payterm = item.getPk_payterm();
                if (nc.vo.jcom.lang.StringUtil.isEmpty((String)top_itemid)) continue;
                toppaymentMap.put(top_itemid, pk_payterm);
            }
            pluginTermVOMap = ArapBusiPluginCenter.queryTermDateVOs("4C", toppaymentMap, false);
        }
        if (pluginTermVOMap != null && !pluginTermVOMap.isEmpty()) {
            Map<BaseItemVO, List<TermVO>> pluginRes = BillTermUtils.constructPaymentBackTermsByPlugin(items, Arrays.asList(topItems), pluginTermVOMap);
            return pluginRes;
        }
        return null;
    }

    static class TermContext
    implements IContext {
        Map<String, Object> context = new HashMap<String, Object>();

        TermContext() {
        }

        @Override
        public boolean getBoolean(String key) {
            return this.getValue(key) == null ? false : (Boolean)this.getValue(key);
        }

        @Override
        public int getIngeter(String key) {
            return (Integer)this.getValue(key);
        }

        @Override
        public String getString(String key) {
            return (String)this.getValue(key);
        }

        @Override
        public void putBoolean(String key, boolean value) {
            this.putValue(key, value);
        }

        @Override
        public void putIngeter(String key, int value) {
            this.putValue(key, value);
        }

        @Override
        public void putString(String key, String value) {
            this.putValue(key, value);
        }

        private Object getValue(String key) {
            return this.context.get(key);
        }

        private void putValue(String key, Object value) {
            this.context.put(key, value);
        }
    }

    static interface IContext {
        public boolean getBoolean(String var1);

        public int getIngeter(String var1);

        public String getString(String var1);

        public void putBoolean(String var1, boolean var2);

        public void putIngeter(String var1, int var2);

        public void putString(String var1, String var2);
    }

    private static class BillDateObj {
        Map<String, UFDate> item2Busidate = new HashMap<String, UFDate>();
        Map<String, UFDate> itemPlusPayterm2Busidate = new HashMap<String, UFDate>();

        private BillDateObj() {
        }
    }
}


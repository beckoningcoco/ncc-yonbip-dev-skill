/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.bill.ArapBillDAO
 *  nc.bs.arap.billact.BillBaseBSAction
 *  nc.bs.arap.billact.IValidatorFactory
 *  nc.bs.dao.BaseDAO
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.uap.pf.IPFBusiAction
 *  nc.pubitf.arap.termitem.IArapTermItemPubService
 *  nc.pubitf.et.pub.arap.f0.IQueryAccountDateFromET
 *  nc.pubitf.it.arap.QueryPayInfoForArap
 *  nc.pubitf.pu.m25.ap.f1.IInvoiceQuery4F1
 *  nc.pubitf.so.m33.arap.AccountDateType
 *  nc.pubitf.so.m33.arap.IQueryAccountDateFromM33
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.arap.termitem.PaymentDateVO
 *  nc.vo.arap.termitem.PaymentDateVO$AccountDate
 *  nc.vo.arap.termitem.TermVO
 *  nc.vo.bd.income.IncomeChVO
 *  nc.vo.bd.income.IncomeVO
 *  nc.vo.bd.payment.PaymentChVO
 *  nc.vo.bd.payment.PaymentVO
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.BusinessRuntimeException
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pubapp.pattern.pub.MapList
 *  nc.vo.pubapp.pflow.PfUserObject
 *  nccloud.commons.lang.StringUtils
 */
package nc.pubimpl.arap.termitem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import nc.bs.arap.bill.ArapBillDAO;
import nc.bs.arap.billact.BillBaseBSAction;
import nc.bs.arap.billact.IValidatorFactory;
import nc.bs.dao.BaseDAO;
import nc.bs.framework.common.NCLocator;
import nc.itf.uap.pf.IPFBusiAction;
import nc.pubitf.arap.termitem.IArapTermItemPubService;
import nc.pubitf.et.pub.arap.f0.IQueryAccountDateFromET;
import nc.pubitf.it.arap.QueryPayInfoForArap;
import nc.pubitf.pu.m25.ap.f1.IInvoiceQuery4F1;
import nc.pubitf.so.m33.arap.AccountDateType;
import nc.pubitf.so.m33.arap.IQueryAccountDateFromM33;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.termitem.PaymentDateVO;
import nc.vo.arap.termitem.TermVO;
import nc.vo.bd.income.IncomeChVO;
import nc.vo.bd.income.IncomeVO;
import nc.vo.bd.payment.PaymentChVO;
import nc.vo.bd.payment.PaymentVO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.BusinessRuntimeException;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDate;
import nc.vo.pubapp.pattern.pub.MapList;
import nc.vo.pubapp.pflow.PfUserObject;
import nccloud.commons.lang.StringUtils;

public class ArapTermItemPubServiceImp
implements IArapTermItemPubService {
    public void deleteTermItem(String[] billpk) throws BusinessException {
        ArapBillDAO.getInstance().deleteTermItemByPK(billpk);
    }

    public void deleteTermVOs(TermVO[] terms) throws BusinessException {
        new BaseDAO().deleteVOArray((SuperVO[])terms);
    }

    public TermVO[] insertTermVO(TermVO[] terms) throws BusinessException {
        ArapBillDAO.getInstance().insertTermVOs(terms);
        return terms;
    }

    public Map<String, UFDate> queryAccountDate(List<BaseItemVO> items, Map<String, IncomeVO> incomeMap) {
        HashMap paramMap = new HashMap();
        for (BaseItemVO item : items) {
            Iterator<BaseItemVO> pk_income = item.getAttributeValue("pk_payterm");
            if (incomeMap.get(pk_income) == null) continue;
            ArrayList<AccountDateType> accountDateType = new ArrayList<AccountDateType>();
            for (IncomeChVO payItem : incomeMap.get(pk_income).getPaymentch()) {
                AccountDateType convertIncomeDate = this.convertIncomeDate(payItem.getPk_incomeperiod());
                if (convertIncomeDate == null) continue;
                accountDateType.add(convertIncomeDate);
            }
            paramMap.put(item.getTop_itemid(), accountDateType);
        }
        HashMap<String, UFDate> returnMap = new HashMap<String, UFDate>();
        if (paramMap.size() != 0) {
            try {
                Map accountDate = ((IQueryAccountDateFromM33)NCLocator.getInstance().lookup(IQueryAccountDateFromM33.class)).queryAccountDate(paramMap, items.get(0).getTop_billtype());
                for (BaseItemVO item : items) {
                    UFDate[] ufDates = (UFDate[])accountDate.get(item.getTop_itemid());
                    Object pk_income = item.getAttributeValue("pk_payterm");
                    if (incomeMap.get(pk_income) == null) continue;
                    int i = 0;
                    for (IncomeChVO payItem : incomeMap.get(pk_income).getPaymentch()) {
                        AccountDateType convertIncomeDate = this.convertIncomeDate(payItem.getPk_incomeperiod());
                        if (convertIncomeDate == null) continue;
                        returnMap.put(item.getPrimaryKey() + payItem.getPrimaryKey(), ufDates[i]);
                        ++i;
                    }
                }
            }
            catch (BusinessException e) {
                ExceptionHandler.consume((Throwable)e);
            }
        }
        return returnMap;
    }

    public Map<String, UFDate> queryETAccountDate(List<BaseItemVO> items, Map<String, IncomeVO> incomeVOs) {
        HashMap paramMap = new HashMap();
        for (BaseItemVO item : items) {
            Iterator<BaseItemVO> pk_income = item.getAttributeValue("top_billid");
            if (incomeVOs.get(pk_income) == null) continue;
            ArrayList<String> accountDateType = new ArrayList<String>();
            for (IncomeChVO payItem : incomeVOs.get(pk_income).getPaymentch()) {
                if (payItem.getPk_incomeperiod() == null) continue;
                accountDateType.add(payItem.getPk_incomeperiod());
            }
            paramMap.put(item.getTop_itemid(), accountDateType);
        }
        Map accountDate = new HashMap();
        HashMap<String, UFDate> returnMap = new HashMap<String, UFDate>();
        if (paramMap.size() != 0) {
            try {
                accountDate = ((IQueryAccountDateFromET)NCLocator.getInstance().lookup(IQueryAccountDateFromET.class)).queryAccountDate(paramMap, items.get(0).getTop_billtype());
                for (BaseItemVO item : items) {
                    UFDate[] ufDates = (UFDate[])accountDate.get(item.getTop_itemid());
                    Object pk_income = item.getAttributeValue("top_billid");
                    if (incomeVOs.get(pk_income) == null) continue;
                    int i = 0;
                    for (IncomeChVO payItem : incomeVOs.get(pk_income).getPaymentch()) {
                        if (null == ufDates || null == ufDates[0]) continue;
                        returnMap.put(item.getPrimaryKey() + payItem.getPrimaryKey(), ufDates[i]);
                        ++i;
                    }
                }
            }
            catch (Exception e) {
                ExceptionHandler.consume((Throwable)e);
            }
        }
        return returnMap;
    }

    public Map<String, UFDate> queryITAccountDate(List<BaseItemVO> items, Map<String, PaymentVO> incomeVOs) {
        HashMap paramMap = new HashMap();
        for (BaseItemVO item : items) {
            Iterator<BaseItemVO> pk_income = item.getAttributeValue("top_billid");
            if (incomeVOs.get(pk_income) == null) continue;
            ArrayList<String> accountDateType = new ArrayList<String>();
            for (PaymentChVO payItem : incomeVOs.get(pk_income).getPaymentch()) {
                if (payItem.getPk_payperiod() == null) continue;
                accountDateType.add(payItem.getPk_payperiod());
            }
            paramMap.put(item.getTop_itemid(), accountDateType);
        }
        Map accountDate = new HashMap();
        HashMap<String, UFDate> returnMap = new HashMap<String, UFDate>();
        if (paramMap.size() != 0) {
            try {
                accountDate = ((QueryPayInfoForArap)NCLocator.getInstance().lookup(QueryPayInfoForArap.class)).queryAccountDate(paramMap, items.get(0).getTop_billtype());
                for (BaseItemVO item : items) {
                    UFDate[] ufDates = (UFDate[])accountDate.get(item.getTop_itemid());
                    Object pk_income = item.getAttributeValue("top_billid");
                    if (incomeVOs.get(pk_income) == null) continue;
                    int i = 0;
                    for (PaymentChVO payItem : incomeVOs.get(pk_income).getPaymentch()) {
                        if (null == ufDates || null == ufDates[0]) continue;
                        returnMap.put(item.getPrimaryKey() + payItem.getPrimaryKey(), ufDates[i]);
                        ++i;
                    }
                }
            }
            catch (Exception e) {
                ExceptionHandler.consume((Throwable)e);
            }
        }
        return returnMap;
    }

    public Map<String, UFDate> queryPaymentAccountDate(List<BaseItemVO> items, Map<String, PaymentVO> payments) {
        MapList middleMap = new MapList();
        ArrayList<PaymentDateVO> paymentDateVOList = new ArrayList<PaymentDateVO>();
        for (BaseItemVO item : items) {
            Iterator pk_income = item.getAttributeValue("pk_payterm");
            if (payments.get(pk_income) == null) continue;
            for (PaymentChVO payItem : payments.get(pk_income).getPaymentch()) {
                PaymentDateVO paymentDate = this.convertPaymentDate(item.getTop_billtype(), item.getTop_billid(), item.getTop_itemid(), payItem.getPk_payperiod());
                if (paymentDate == null) continue;
                paymentDateVOList.add(paymentDate);
                middleMap.put((Object)this.constPaymentPK(paymentDate), (Object)(item.getPrimaryKey() + payItem.getPrimaryKey()));
            }
        }
        HashMap<String, UFDate> returnMap = new HashMap<String, UFDate>();
        Map paytermDate = null;
        if (paymentDateVOList.size() > 0) {
            try {
                paytermDate = ((IInvoiceQuery4F1)NCLocator.getInstance().lookup(IInvoiceQuery4F1.class)).queryPaytermDate(paymentDateVOList);
                for (String key : paytermDate.keySet()) {
                    if (middleMap.get((Object)key) == null) continue;
                    List list = middleMap.get((Object)key);
                    for (String st : list) {
                        returnMap.put(st, (UFDate)paytermDate.get(key));
                    }
                }
            }
            catch (BusinessException e) {
                ExceptionHandler.consume((Throwable)e);
            }
        }
        return returnMap;
    }

    public BaseAggVO updateTermItem(TermVO[] terms, BaseAggVO billvo) throws BusinessException {
        TempBaseBSAction billaction = new TempBaseBSAction();
        billaction.checkTs((AggregatedValueObject)billvo);
        billaction.checkFrozen((AggregatedValueObject)billvo);
        ArapBillDAO instance = ArapBillDAO.getInstance();
        instance.deleteTermItemByItemPK(new String[]{terms[0].getPk_item()});
        instance.insertTermVOs(terms);
        String billType = (String)billvo.getParentVO().getAttributeValue("pk_tradetype");
        ((IPFBusiAction)NCLocator.getInstance().lookup(IPFBusiAction.class)).processAction("SAVE", billType, null, (AggregatedValueObject)billvo, (Object)new PfUserObject(), null);
        return billvo;
    }

    private String constPaymentPK(PaymentDateVO paymentDate) {
        HashMap<PaymentDateVO.AccountDate, String> dateTypeMap = new HashMap<PaymentDateVO.AccountDate, String>();
        dateTypeMap.put(PaymentDateVO.AccountDate.PURCHASE_CONTRACT_EFFECTIVE_DATE, "1001Z01000000000F04J");
        dateTypeMap.put(PaymentDateVO.AccountDate.PURCHASE_INVOICE_APPROVE_DATE, "1001Z01000000000F04M");
        dateTypeMap.put(PaymentDateVO.AccountDate.PURCHASE_INVOICE_DATE, "1001Z01000000000F04L");
        dateTypeMap.put(PaymentDateVO.AccountDate.PURCHASE_ORDER_APPROVE_DATE, "1001Z01000000000F04K");
        dateTypeMap.put(PaymentDateVO.AccountDate.RECEIPT_APPROVE_DATE, "1001Z01000000000F04N");
        dateTypeMap.put(PaymentDateVO.AccountDate.STORE_RECEIPT_DATE, "1001Z01000000000F04O");
        dateTypeMap.put(PaymentDateVO.AccountDate.STORE_RECEIPT_SIGNATURE_DATE, "1001Z01000000000F04P");
        String key = paymentDate.getItemid() + (String)dateTypeMap.get(PaymentDateVO.AccountDate.valueOf((int)paymentDate.getDateType()));
        return key;
    }

    private AccountDateType convertIncomeDate(String effectdate) {
        if (StringUtils.isEmpty((CharSequence)effectdate)) {
            throw new BusinessRuntimeException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0370"));
        }
        AccountDateType dataType = null;
        if (effectdate.equals(String.valueOf("1001Z01000000000E4JX"))) {
            dataType = AccountDateType.OUT_STORE_DATE;
        } else if (effectdate.equals(String.valueOf("1001Z01000000000E4JY"))) {
            dataType = AccountDateType.OUTSTORE_SIGNATURE_DATE;
        } else if (effectdate.equals(String.valueOf("1001Z01000000000E4JZ"))) {
            dataType = AccountDateType.SALE_MAKE_BILL_DATE;
        } else if (effectdate.equals(String.valueOf("1001Z01000000000E4K0"))) {
            dataType = AccountDateType.SALE_INVOICE_APPROVE_DATE;
        } else if (effectdate.equals(String.valueOf("1001Z01000000000E4K1"))) {
            dataType = AccountDateType.SALE_ORDER_DATE;
        } else if (effectdate.equals(String.valueOf("1001Z01000000000E4K2"))) {
            dataType = AccountDateType.SALE_CONTRACT_EFFECTIVE_DATE;
        } else if (effectdate.equals(String.valueOf("1001Z01000000000E4M5"))) {
            dataType = AccountDateType.ORDER_APPROVE_DATE;
        } else if (effectdate.equals(String.valueOf("1001Z01000000000E4M6"))) {
            dataType = AccountDateType.SEND_DATE;
        } else if (effectdate.equals(String.valueOf("1001Z01000000000E4M7"))) {
            dataType = AccountDateType.SEND_APPROVE_DATE;
        }
        return dataType;
    }

    private PaymentDateVO convertPaymentDate(String billtype, String billid, String itemid, String effectdate) {
        if (StringUtils.isEmpty((CharSequence)billtype) || StringUtils.isEmpty((CharSequence)billid) || StringUtils.isEmpty((CharSequence)itemid) || StringUtils.isEmpty((CharSequence)effectdate)) {
            throw new BusinessRuntimeException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61008_0", "02006v61008-0122"));
        }
        PaymentDateVO.AccountDate dateType = this.convertPaymentDateVO(effectdate);
        if (dateType == null) {
            return null;
        }
        PaymentDateVO vo = new PaymentDateVO();
        vo.setDateType(dateType.getValue());
        vo.setBillid(billid);
        vo.setBilltype(billtype);
        vo.setItemid(itemid);
        return vo;
    }

    private PaymentDateVO.AccountDate convertPaymentDateVO(String effectdate) {
        PaymentDateVO.AccountDate dateType = null;
        if (effectdate.equals(String.valueOf("1001Z01000000000F04J"))) {
            dateType = PaymentDateVO.AccountDate.PURCHASE_CONTRACT_EFFECTIVE_DATE;
        } else if (effectdate.equals(String.valueOf("1001Z01000000000F04M"))) {
            dateType = PaymentDateVO.AccountDate.PURCHASE_INVOICE_APPROVE_DATE;
        } else if (effectdate.equals(String.valueOf("1001Z01000000000F04L"))) {
            dateType = PaymentDateVO.AccountDate.PURCHASE_INVOICE_DATE;
        } else if (effectdate.equals(String.valueOf("1001Z01000000000F04K"))) {
            dateType = PaymentDateVO.AccountDate.PURCHASE_ORDER_APPROVE_DATE;
        } else if (effectdate.equals(String.valueOf("1001Z01000000000F04N"))) {
            dateType = PaymentDateVO.AccountDate.RECEIPT_APPROVE_DATE;
        } else if (effectdate.equals(String.valueOf("1001Z01000000000F04O"))) {
            dateType = PaymentDateVO.AccountDate.STORE_RECEIPT_DATE;
        } else if (effectdate.equals(String.valueOf("1001Z01000000000F04P"))) {
            dateType = PaymentDateVO.AccountDate.STORE_RECEIPT_SIGNATURE_DATE;
        }
        return dateType;
    }

    class TempBaseBSAction
    extends BillBaseBSAction {
        TempBaseBSAction() {
        }

        public void checkTs(AggregatedValueObject bill) throws BusinessException {
            AggregatedValueObject[] bills = new AggregatedValueObject[]{bill};
            this.setbillsLock(bills);
            this.checkBillsTs(bills);
        }

        public void checkFrozen(AggregatedValueObject bill) throws BusinessException {
            Integer saga_frozen = (Integer)bill.getParentVO().getAttributeValue("saga_frozen");
            if (saga_frozen != null && 1 == saga_frozen) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1080"));
            }
        }

        protected IValidatorFactory getValidatorFactory() {
            return null;
        }
    }
}


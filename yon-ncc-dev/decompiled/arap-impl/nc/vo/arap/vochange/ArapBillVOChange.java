/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Log
 *  nc.bs.logging.Logger
 *  nc.itf.uap.pf.IPFBillItfDef
 *  nc.itf.uap.pf.IPFConfig
 *  nc.itf.uap.pf.IPfExchangeService
 *  nc.md.model.MetaDataException
 *  nc.md.persist.framework.MDPersistenceService
 *  nc.pubitf.accperiod.AccountCalendar
 *  nc.vo.bd.cust.CustomerVO
 *  nc.vo.bd.rate.util.RateReturnObject
 *  nc.vo.bd.supplier.SupplierVO
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pf.change.BillItfDefVO
 *  nc.vo.pf.change.ChangeVOAdjustContext
 *  nc.vo.pf.change.IChangeVOAdjust
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pub.lang.UFLiteralDate
 *  nc.vo.pubapp.calculator.data.IRelationForItems
 *  nc.vo.pubapp.pattern.exception.ExceptionUtils
 *  nc.vo.trade.checkrule.VOChecker
 *  nccloud.commons.lang.ArrayUtils
 *  nccloud.commons.lang.StringUtils
 *  nccloud.pubitf.arap.arappub.IArapRatePubService
 *  nccloud.pubitf.arap.arappub.ICurrencyService
 *  org.apache.commons.collections4.CollectionUtils
 */
package nc.vo.arap.vochange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import nc.bs.arap.bill.ArapBillCalUtil;
import nc.bs.arap.bill.ArapBillDAO;
import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.arap.util.ArapBillVOUtils;
import nc.bs.arap.util.BillEuroUtils;
import nc.bs.arap.util.BillMoneyVUtils;
import nc.bs.arap.util.BillOrgVUtils;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Log;
import nc.bs.logging.Logger;
import nc.itf.uap.pf.IPFBillItfDef;
import nc.itf.uap.pf.IPFConfig;
import nc.itf.uap.pf.IPfExchangeService;
import nc.md.model.MetaDataException;
import nc.md.persist.framework.MDPersistenceService;
import nc.pubitf.accperiod.AccountCalendar;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.pub.RateTypeInfoVO;
import nc.vo.arap.utils.StringUtil;
import nc.vo.bd.cust.CustomerVO;
import nc.vo.bd.rate.util.RateReturnObject;
import nc.vo.bd.supplier.SupplierVO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pf.change.BillItfDefVO;
import nc.vo.pf.change.ChangeVOAdjustContext;
import nc.vo.pf.change.IChangeVOAdjust;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pub.lang.UFLiteralDate;
import nc.vo.pubapp.calculator.data.IRelationForItems;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.trade.checkrule.VOChecker;
import nccloud.commons.lang.ArrayUtils;
import nccloud.commons.lang.StringUtils;
import nccloud.pubitf.arap.arappub.IArapRatePubService;
import nccloud.pubitf.arap.arappub.ICurrencyService;
import org.apache.commons.collections4.CollectionUtils;

public class ArapBillVOChange
implements IChangeVOAdjust {
    protected Integer syscode;
    protected String strChange;
    protected String local_money;
    protected boolean reCal = false;
    protected IRelationForItems relationforitem;
    protected Log LOG = Log.getInstance(this.getClass());
    protected String[] billtypes = new String[]{"F0", "F1", "F2", "F3", "23E0", "23E1"};
    protected List<String> arapBillType = Arrays.asList("F0", "F1", "F2", "F3");

    public AggregatedValueObject adjustAfterChange(AggregatedValueObject srcVO, AggregatedValueObject destVO, ChangeVOAdjustContext adjustContext) throws BusinessException {
        if (destVO.getParentVO().getAttributeValue("pk_group") == null) {
            destVO.getParentVO().setAttributeValue("pk_group", (Object)InvocationInfoProxy.getInstance().getGroupId());
        }
        InvocationInfoProxy.getInstance().setProperty("Srctranstype", (String)srcVO.getParentVO().getAttributeValue("vtrantypecode"));
        ArapBillPubUtil.fillTradeTypeInfo(destVO);
        this.checkTranstype(destVO);
        try {
            CircularlyAccessibleValueObject parentVO = srcVO.getParentVO();
            UFBoolean isrefund = (UFBoolean)parentVO.getAttributeValue("isrefund");
            if (isrefund != null && isrefund.booleanValue()) {
                ArapBillPubUtil.dealRefundBillAfterChange(srcVO, destVO);
            }
            CircularlyAccessibleValueObject destParentVO = destVO.getParentVO();
            String srcbillclass = (String)parentVO.getAttributeValue("billclass");
            String destbillclass = (String)destParentVO.getAttributeValue("billclass");
            if (("sk".equals(srcbillclass) && "fk".equals(destbillclass) || "fk".equals(srcbillclass) && "sk".equals(destbillclass)) && destVO.getChildrenVO() != null && destVO.getParentVO() != null) {
                for (CircularlyAccessibleValueObject item : destVO.getChildrenVO()) {
                    if (item.getAttributeValue("checktype") != null) {
                        item.setAttributeValue("checktype", null);
                    }
                    if (item.getAttributeValue("checkno") == null) continue;
                    item.setAttributeValue("checkno", null);
                }
            }
            ArapBillVOUtils.prepareRedundancyFields(new AggregatedValueObject[]{destVO});
            ArapBillPubUtil.fillNeedFlds(destVO);
            if (this.isFillRate()) {
                ArapBillPubUtil.processMoneyWithoutCal(destVO);
                this.reCal = true;
            }
            if (destVO.getChildrenVO() != null && destVO.getParentVO() != null) {
                UFDate busidate = new UFDate(InvocationInfoProxy.getInstance().getBizDateTime());
                for (CircularlyAccessibleValueObject item : destVO.getChildrenVO()) {
                    if (item.getAttributeValue("billdate") != null) continue;
                    item.setAttributeValue("billdate", (Object)busidate);
                }
                if (destVO.getParentVO().getAttributeValue("billdate") == null) {
                    destVO.getParentVO().setAttributeValue("billdate", (Object)busidate);
                }
                if (destVO.getParentVO().getAttributeValue("pk_currtype") == null && !ArrayUtils.isEmpty((Object[])destVO.getChildrenVO()) && destVO.getChildrenVO()[0].getAttributeValue("pk_currtype") != null) {
                    destVO.getParentVO().setAttributeValue("pk_currtype", destVO.getChildrenVO()[0].getAttributeValue("pk_currtype"));
                }
            }
            ArapBillVOUtils.prepareSKFKTaxFields(new AggregatedValueObject[]{destVO});
            if (this.isProcessMny(destVO)) {
                this.reFindRateType(destVO);
                if (destVO.getParentVO() != null && destVO.getChildrenVO() != null) {
                    boolean groupRateIsZero;
                    UFDouble grouprate = (UFDouble)destVO.getParentVO().getAttributeValue("grouprate");
                    UFDouble globalrate = (UFDouble)destVO.getParentVO().getAttributeValue("globalrate");
                    String src_billtypeb = (String)destVO.getChildrenVO()[0].getAttributeValue("src_billtype");
                    String top_billtypeb = (String)destVO.getChildrenVO()[0].getAttributeValue("top_billtype");
                    boolean bl = grouprate == null ? true : (groupRateIsZero = grouprate.compareTo((Object)UFDouble.ZERO_DBL) == 0);
                    boolean globalRateIsZero = globalrate == null ? true : globalrate.compareTo((Object)UFDouble.ZERO_DBL) == 0;
                    List<String> pcmBillType = Arrays.asList("4D83", "4D39");
                    if ((groupRateIsZero || globalRateIsZero || !pcmBillType.contains(src_billtypeb) && !pcmBillType.contains(top_billtypeb)) && !"4D62".equals(top_billtypeb)) {
                        ArapBillPubUtil.processMoney(destVO);
                    }
                }
            }
            ArapBillVOUtils.prepareSKFKTaxFields(new AggregatedValueObject[]{destVO});
            ArapBillCalUtil.processBillScale(destVO);
        }
        catch (Exception e) {
            Logger.error((Object)e);
            throw new BusinessException((Throwable)e);
        }
        String pkorg = (String)destVO.getParentVO().getAttributeValue("pk_org");
        AccountCalendar ac = AccountCalendar.getInstanceByPk_org((String)pkorg);
        String CurNd = ac.getYearVO().getPeriodyear();
        String CurQj = ac.getMonthVO().getAccperiodmth();
        destVO.getParentVO().setAttributeValue("billyear", (Object)CurNd);
        destVO.getParentVO().setAttributeValue("billperiod", (Object)CurQj);
        this.processBusidate(destVO);
        this.setOccuPationmny(destVO);
        this.setDefaultValues(destVO);
        this.adjuestBillStatus(destVO);
        this.adjuestScomments(destVO);
        if (this.isNeedFilter(srcVO, destVO)) {
            this.filterZeroLines(destVO);
        }
        return destVO;
    }

    private void reFindRateType(AggregatedValueObject destVO) throws BusinessException {
        boolean isdeffrentCurrtype;
        String pk_org = (String)destVO.getParentVO().getAttributeValue("pk_org");
        String headRateType = (String)destVO.getParentVO().getAttributeValue("pk_ratetype");
        String bodyRateType = (String)destVO.getChildrenVO()[0].getAttributeValue("pk_ratetype");
        UFLiteralDate ratedate = (UFLiteralDate)destVO.getParentVO().getAttributeValue("ratedate");
        UFLiteralDate ratedatebody = (UFLiteralDate)destVO.getChildrenVO()[0].getAttributeValue("ratedate");
        UFLiteralDate src_rateDate = ratedate == null ? ratedatebody : ratedate;
        String org_currtype = ((ICurrencyService)NCLocator.getInstance().lookup(ICurrencyService.class)).getOrgLocalCurrPK(pk_org);
        String pk_currtypr = (String)destVO.getParentVO().getAttributeValue("pk_currtype");
        boolean bl = isdeffrentCurrtype = !StringUtil.isEmptyWithTrim(pk_currtypr) && !pk_currtypr.equals(org_currtype);
        if (StringUtil.isEmptyWithTrim(headRateType) && StringUtil.isEmptyWithTrim(bodyRateType) && isdeffrentCurrtype) {
            String key = null;
            Integer object = (Integer)destVO.getParentVO().getAttributeValue("objtype");
            if (object == null) {
                String billtype = (String)destVO.getParentVO().getAttributeValue("pk_billtype");
                List<String> apModule = Arrays.asList("F1", "F3", "23E1");
                object = apModule.contains(billtype) ? BillEnumCollection.ObjType.SUPPLIER.VALUE : BillEnumCollection.ObjType.CUSTOMER.VALUE;
            }
            if (BillEnumCollection.ObjType.SUPPLIER.VALUE == object) {
                key = "supplier";
            } else if (BillEnumCollection.ObjType.CUSTOMER.VALUE == object) {
                key = "customer";
            }
            RateTypeInfoVO vo = new RateTypeInfoVO();
            String cusp = destVO.getParentVO().getAttributeValue(key) == null ? (String)destVO.getChildrenVO()[0].getAttributeValue(key) : (String)destVO.getParentVO().getAttributeValue(key);
            vo.setPk_org(pk_org);
            vo.setSrc_pk_currtype((String)destVO.getParentVO().getAttributeValue("pk_currtype"));
            vo.setPk_billtype((String)destVO.getParentVO().getAttributeValue("pk_billtype"));
            vo.setBilldate((UFDate)destVO.getParentVO().getAttributeValue("billdate"));
            vo.setCustomer(cusp);
            vo.setSupplier(cusp);
            vo.setPk_rateType(null);
            vo.setEditKey(key);
            RateReturnObject rateVOByCuSp = ((IArapRatePubService)NCLocator.getInstance().lookup(IArapRatePubService.class)).getRateVoByArapInfoVo(vo);
            if (rateVOByCuSp != null) {
                headRateType = rateVOByCuSp.getPk_ratetype();
                ratedate = rateVOByCuSp.getDate();
                destVO.getParentVO().setAttributeValue("pk_ratetype", (Object)headRateType);
                destVO.getParentVO().setAttributeValue("ratedate", (Object)ratedate);
                for (CircularlyAccessibleValueObject chilvo : destVO.getChildrenVO()) {
                    chilvo.setAttributeValue("pk_ratetype", (Object)headRateType);
                    chilvo.setAttributeValue("ratedate", (Object)ratedate);
                }
            }
        } else if (!StringUtil.isEmptyWithTrim(headRateType) && StringUtil.isEmptyWithTrim(bodyRateType)) {
            for (CircularlyAccessibleValueObject vo : destVO.getChildrenVO()) {
                String rateType = (String)vo.getAttributeValue("pk_ratetype");
                if (StringUtil.isEmptyWithTrim(headRateType) || !StringUtil.isEmptyWithTrim(rateType)) continue;
                vo.setAttributeValue("pk_ratetype", (Object)headRateType);
                vo.setAttributeValue("ratedate", (Object)src_rateDate);
            }
        } else if (StringUtil.isEmptyWithTrim(headRateType) && !StringUtil.isEmptyWithTrim(bodyRateType)) {
            destVO.getParentVO().setAttributeValue("pk_ratetype", (Object)bodyRateType);
            destVO.getParentVO().setAttributeValue("ratedate", (Object)src_rateDate);
        }
    }

    private boolean isNeedFilter(AggregatedValueObject srcVO, AggregatedValueObject destVO) {
        List<String> destbilltypeList = Arrays.asList("F2", "F3");
        List<String> srcbilltypeList = Arrays.asList("36D1", "36D7", "Z3");
        String billtype = (String)destVO.getParentVO().getAttributeValue("pk_billtype");
        String topbillType = (String)destVO.getChildrenVO()[0].getAttributeValue("top_billtype");
        String srcbillType = (String)destVO.getChildrenVO()[0].getAttributeValue("src_billtype");
        if (destbilltypeList.contains(billtype) && (srcbilltypeList.contains(topbillType) || "21".equals(srcbillType))) {
            return true;
        }
        return this.arapBillType.contains(billtype) && this.arapBillType.contains(topbillType);
    }

    private void filterZeroLines(AggregatedValueObject destVO) throws BusinessException {
        SuperVO[] childrenVO = (SuperVO[])destVO.getChildrenVO();
        ArrayList<SuperVO> childWithoutZero = new ArrayList<SuperVO>();
        for (SuperVO child : childrenVO) {
            boolean addFlag;
            UFDouble taxmoney;
            String topbilltype = (String)child.getAttributeValue("top_billtype");
            UFDouble money = (UFDouble)child.getAttributeValue("money_de");
            if (money == null || money.equals((Object)UFDouble.ZERO_DBL)) {
                money = (UFDouble)child.getAttributeValue("money_cr");
            }
            if ((taxmoney = (UFDouble)child.getAttributeValue("local_tax_de")) == null || taxmoney.equals((Object)UFDouble.ZERO_DBL)) {
                taxmoney = (UFDouble)child.getAttributeValue("local_tax_cr");
            }
            boolean bl = addFlag = money != null && !money.equals((Object)UFDouble.ZERO_DBL);
            if (this.arapBillType.contains(topbilltype)) {
                UFDouble occmny = (UFDouble)child.getAttributeValue("occupationmny");
                if (!addFlag && (occmny == null || occmny.equals((Object)UFDouble.ZERO_DBL))) continue;
                childWithoutZero.add(child);
                continue;
            }
            if (!addFlag) continue;
            childWithoutZero.add(child);
        }
        if (childWithoutZero.size() == 0) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0127"));
        }
        destVO.setChildrenVO((CircularlyAccessibleValueObject[])childWithoutZero.toArray(new SuperVO[0]));
        BillMoneyVUtils.sumBodyToHead((BaseBillVO)destVO.getParentVO(), (BaseItemVO[])destVO.getChildrenVO());
    }

    private boolean isFreecust(String pk_billtype, BaseItemVO itemVO) {
        try {
            if (pk_billtype.equals("F3") || pk_billtype.equals("F1")) {
                String supplier = itemVO.getSupplier();
                SupplierVO supplierVO = (SupplierVO)MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPK(SupplierVO.class, supplier, false);
                if (supplierVO != null) {
                    return supplierVO.getIsfreecust() != null && supplierVO.getIsfreecust().booleanValue();
                }
            } else if (pk_billtype.equals("F0") || pk_billtype.equals("F2")) {
                String customer = itemVO.getCustomer();
                CustomerVO customerVO = (CustomerVO)MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPK(CustomerVO.class, customer, false);
                if (customerVO != null) {
                    return customerVO.getIsfreecust() != null && customerVO.getIsfreecust().booleanValue();
                }
            }
        }
        catch (MetaDataException e) {
            ExceptionHandler.consume((Throwable)e);
        }
        return false;
    }

    protected void adjuestOrgV(AggregatedValueObject[] destVOs) {
        String[] v_orgs = new String[]{"pk_org_v", "sett_org_v", "so_org_v", "pu_org_v", "pk_pcorg_v", "so_deptid_v", "pk_deptid_v", "pu_deptid_v", "customer_v", "supplier_v", "ordercubasdoc_v"};
        for (AggregatedValueObject destVO : destVOs) {
            for (String name : v_orgs) {
                if (destVO.getParentVO() != null) {
                    destVO.getParentVO().setAttributeValue(name, null);
                }
                if (destVO.getChildrenVO() == null) continue;
                for (BaseItemVO item : (BaseItemVO[])destVO.getChildrenVO()) {
                    item.setAttributeValue2(name, null);
                }
            }
        }
        try {
            BillOrgVUtils.setOrgV(destVOs);
        }
        catch (BusinessException e) {
            ExceptionHandler.handleRuntimeException((Exception)((Object)e));
        }
    }

    protected void adjuestScomments(AggregatedValueObject destVO) {
        String[] fields;
        String prefix = "ML:";
        if (destVO.getChildrenVO() != null) {
            for (CircularlyAccessibleValueObject item : destVO.getChildrenVO()) {
                String value = (String)item.getAttributeValue("scomment");
                if (!StringUtils.isNotEmpty((CharSequence)value) || !value.startsWith(prefix)) continue;
                item.setAttributeValue("scomment", (Object)NCLangRes4VoTransl.getNCLangRes().getStrByID("common", value.substring(prefix.length())));
            }
        }
        for (String field : fields = new String[]{"scomment", "invoiceno"}) {
            String value = (String)destVO.getParentVO().getAttributeValue(field);
            if (destVO.getChildrenVO() == null || !StringUtils.isEmpty((CharSequence)value) && !"~".equals(value)) continue;
            HashSet<String> childScomments = new HashSet<String>();
            for (CircularlyAccessibleValueObject item : destVO.getChildrenVO()) {
                value = (String)item.getAttributeValue(field);
                if (StringUtils.isEmpty((CharSequence)value) || "~".equals(value)) continue;
                childScomments.add(value);
            }
            Iterator iterator = childScomments.iterator();
            if (!iterator.hasNext()) continue;
            destVO.getParentVO().setAttributeValue(field, iterator.next());
        }
    }

    private void processBusidate(AggregatedValueObject destVO) {
        if (destVO.getChildrenVO() != null) {
            for (BaseItemVO item : (BaseItemVO[])destVO.getChildrenVO()) {
                if (item.getAttributeValue("busidate") == null) {
                    item.setAttributeValue2("busidate", item.getAttributeValue("billdate"));
                }
                if (item.getAttributeValue("rowtype") != null) continue;
                item.setAttributeValue2("rowtype", 0);
            }
        }
    }

    private void adjuestBillStatus(AggregatedValueObject destVO) {
        Integer billstatus = (Integer)destVO.getParentVO().getAttributeValue("billstatus");
        if (billstatus != null && (billstatus.intValue() == BillEnumCollection.BillSatus.AUDIT.VALUE.intValue() || billstatus.intValue() == BillEnumCollection.BillSatus.SIGN.VALUE.intValue())) {
            destVO.getParentVO().setAttributeValue("billstatus", (Object)BillEnumCollection.BillSatus.SAVE.VALUE);
        }
    }

    private void checkTranstype(AggregatedValueObject destVO) throws BusinessException {
        BaseBillVO parentVO = (BaseBillVO)destVO.getParentVO();
        if (StringUtils.isEmpty((CharSequence)parentVO.getPk_tradetype())) {
            this.LOG.info((Object)NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0033", null, new String[]{parentVO.getPk_tradetypeid(), parentVO.getPk_busitype()}));
        }
    }

    public AggregatedValueObject adjustBeforeChange(AggregatedValueObject srcVO, ChangeVOAdjustContext adjustContext) throws BusinessException {
        BaseBillVO parentVO = (BaseBillVO)srcVO.getParentVO();
        if (parentVO.getIsrefund() != null && parentVO.getIsrefund().booleanValue()) {
            ArapBillPubUtil.dealRefundBillBeforeChange(srcVO);
        }
        return srcVO;
    }

    public AggregatedValueObject[] batchAdjustAfterChange(AggregatedValueObject[] srcVOs, AggregatedValueObject[] destVOs, ChangeVOAdjustContext adjustContext) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])destVOs)) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0563"));
        }
        BillEuroUtils.setEuroInfo(destVOs);
        ArrayList<AggregatedValueObject> rtnVOs = new ArrayList<AggregatedValueObject>();
        for (int i = 0; i < destVOs.length; ++i) {
            rtnVOs.add(this.adjustAfterChange(srcVOs[i], destVOs[i], adjustContext));
        }
        HashMap<String, UFBoolean> map = new HashMap<String, UFBoolean>();
        for (AggregatedValueObject vo : srcVOs) {
            UFBoolean isrefund = (UFBoolean)vo.getParentVO().getAttributeValue("isrefund");
            if (isrefund == null) continue;
            map.put(vo.getParentVO().getPrimaryKey(), isrefund);
        }
        if ("4D62".equals(destVOs[0].getChildrenVO()[0].getAttributeValue("top_billtype"))) {
            String pk_dept = (String)destVOs[0].getParentVO().getAttributeValue("pk_deptid");
            String pk_dept_v = (String)destVOs[0].getParentVO().getAttributeValue("pk_deptid_v");
            for (CircularlyAccessibleValueObject vo : destVOs[0].getChildrenVO()) {
                vo.setAttributeValue("pk_deptid", (Object)pk_dept);
                vo.setAttributeValue("pk_deptid_v", (Object)pk_dept_v);
            }
        }
        this.adjuestOrgV(destVOs);
        this.setBiztype(destVOs, adjustContext.getSrcBilltype(), map);
        ArapBillPubUtil.resetDestVODoc(destVOs);
        ArapBillVOUtils.setDefaultRecpaytype(destVOs);
        return rtnVOs.toArray(new AggregatedValueObject[0]);
    }

    public AggregatedValueObject[] batchAdjustBeforeChange(AggregatedValueObject[] srcVOs, ChangeVOAdjustContext adjustContext) throws BusinessException {
        ArrayList<AggregatedValueObject> rtnVOs = new ArrayList<AggregatedValueObject>();
        for (int i = 0; i < srcVOs.length; ++i) {
            rtnVOs.add(this.adjustBeforeChange(srcVOs[i], adjustContext));
        }
        return rtnVOs.toArray(new AggregatedValueObject[0]);
    }

    protected void setOccuPationmny(AggregatedValueObject vo) {
        block3: {
            BaseItemVO[] children;
            Object pk_billtype;
            block2: {
                pk_billtype = vo.getParentVO().getAttributeValue("pk_billtype");
                children = (BaseItemVO[])vo.getChildrenVO();
                if (!"F0".equals(pk_billtype) && !"F3".equals(pk_billtype)) break block2;
                for (BaseItemVO item : children) {
                    item.setOccupationmny(item.getMoney_de());
                    item.setMoney_bal(item.getMoney_de());
                }
                break block3;
            }
            if (!"F1".equals(pk_billtype) && !"F2".equals(pk_billtype)) break block3;
            for (BaseItemVO item : children) {
                item.setOccupationmny(item.getMoney_cr());
                item.setMoney_bal(item.getMoney_cr());
            }
        }
    }

    protected void setBiztype(AggregatedValueObject[] destVOs, String src_billtype, Map<String, UFBoolean> map) {
        if (!this.isSetBiztype() || VOChecker.isEmpty((Object)destVOs)) {
            return;
        }
        IPFBillItfDef itfDefService = (IPFBillItfDef)NCLocator.getInstance().lookup(IPFBillItfDef.class);
        String billtype = (String)destVOs[0].getParentVO().getAttributeValue("pk_billtype");
        BillItfDefVO defVO = new BillItfDefVO();
        defVO.setDest_billtype((String)destVOs[0].getParentVO().getAttributeValue("pk_billtype"));
        defVO.setPk_group((String)destVOs[0].getParentVO().getAttributeValue("pk_group"));
        defVO.setSrc_billtype(src_billtype);
        try {
            Object[] billItfDefVOs = itfDefService.getBillItfDef(defVO);
            if (!(ArrayUtils.isEmpty((Object[])billItfDefVOs) || billtype.equals("23E0") || billtype.equals("23E1"))) {
                for (AggregatedValueObject vo : destVOs) {
                    vo.getParentVO().setAttributeValue("pk_busitype", null);
                }
            }
        }
        catch (BusinessException e) {
            ExceptionUtils.wrappException((Exception)((Object)e));
        }
        String vtrantype = (String)destVOs[0].getParentVO().getAttributeValue("pk_tradetype");
        String pk_org = (String)destVOs[0].getParentVO().getAttributeValue("pk_org");
        String userid = InvocationInfoProxy.getInstance().getUserId();
        if (billtype != null && billtype.trim().length() > 0 && pk_org != null && pk_org.trim().length() > 0) {
            try {
                String cbiztypeid;
                ((IPfExchangeService)NCLocator.getInstance().lookup(IPfExchangeService.class)).jumpBusitype(destVOs);
                String pk_busitype = (String)destVOs[0].getParentVO().getAttributeValue("pk_busitype");
                if (null == pk_busitype) {
                    cbiztypeid = ((IPFConfig)NCLocator.getInstance().lookup(IPFConfig.class)).retBusitypeCanStart(billtype, vtrantype, pk_org, userid);
                    if (cbiztypeid == null && !billtype.equals("23E0") && !billtype.equals("23E1")) {
                        String msg = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0652") + billtype + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0653") + (vtrantype == null ? "" : vtrantype);
                        ExceptionUtils.wrappBusinessException((String)(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0564") + "," + msg));
                    } else {
                        String top_billtype;
                        List<String> top = Arrays.asList("FCT1", "FCT2");
                        if (top.contains(top_billtype = (String)destVOs[0].getChildrenVO()[0].getAttributeValue("top_billtype"))) {
                            ArrayList<String> transtypeList = new ArrayList<String>();
                            List<String> billtypeList = Arrays.asList(billtype, top_billtype);
                            String top_transtype = (String)destVOs[0].getChildrenVO()[0].getAttributeValue("top_tradetype");
                            if (top_transtype != null) {
                                transtypeList.add(top_transtype);
                            }
                            transtypeList.add(vtrantype);
                            List<String> pk_business = new ArapBillDAO().getPkBusinessByBtAndTT(billtypeList.toArray(new String[0]), transtypeList.toArray(new String[0]));
                            if (CollectionUtils.isNotEmpty(pk_business)) {
                                cbiztypeid = pk_business.get(0);
                            }
                        }
                        for (AggregatedValueObject vo : destVOs) {
                            if (null != cbiztypeid && !cbiztypeid.equals("~") && vo.getParentVO().getAttributeValue("pk_busitype") != null) continue;
                            vo.getParentVO().setAttributeValue("pk_busitype", (Object)cbiztypeid);
                        }
                    }
                } else if (map.size() != 0 && (cbiztypeid = ((IPFConfig)NCLocator.getInstance().lookup(IPFConfig.class)).retBusitypeCanStart(billtype, vtrantype, pk_org, userid)) != null) {
                    Logger.info((Object)"--------\u9000\u6b3e\u91cd\u65b0\u8bbe\u7f6e\u6d41\u7a0b\u5f00\u59cb---------");
                    for (AggregatedValueObject vo : destVOs) {
                        CircularlyAccessibleValueObject[] childrenVO;
                        for (CircularlyAccessibleValueObject chilvo : childrenVO = vo.getChildrenVO()) {
                            UFBoolean refundFlag = map.get(chilvo.getAttributeValue("top_billid"));
                            if (refundFlag == null || !refundFlag.booleanValue()) continue;
                            vo.getParentVO().setAttributeValue("pk_busitype", (Object)cbiztypeid);
                        }
                    }
                    Logger.info((Object)"--------\u9000\u6b3e\u91cd\u65b0\u8bbe\u7f6e\u6d41\u7a0b\u7ed3\u675f---------");
                }
            }
            catch (BusinessException e) {
                ExceptionUtils.wrappException((Exception)((Object)e));
            }
        }
    }

    protected void setDefaultValues(AggregatedValueObject vo) {
    }

    protected boolean isSetBiztype() {
        return true;
    }

    protected boolean isProcessMny(AggregatedValueObject destVO) {
        CircularlyAccessibleValueObject[] circularlyAccessibleValueObjectArray;
        int n;
        int n2;
        UFDouble destRate = (UFDouble)destVO.getParentVO().getAttributeValue("rate");
        UFDouble destbodyRate = (UFDouble)destVO.getChildrenVO()[0].getAttributeValue("rate");
        UFDouble occMoney = (UFDouble)destVO.getChildrenVO()[0].getAttributeValue("occupationmny");
        UFDouble bLomoneyCR = destVO.getChildrenVO()[0].getAttributeValue("local_money_cr") == null ? UFDouble.ZERO_DBL : destVO.getChildrenVO()[0].getAttributeValue("local_money_cr");
        UFDouble bLomoneyDE = destVO.getChildrenVO()[0].getAttributeValue("local_money_de") == null ? UFDouble.ZERO_DBL : destVO.getChildrenVO()[0].getAttributeValue("local_money_de");
        UFDouble bodylocalmoney = UFDouble.ZERO_DBL.compareTo((Object)bLomoneyCR) == 0 ? bLomoneyDE : bLomoneyCR;
        String pk_rateType = (String)destVO.getParentVO().getAttributeValue("pk_ratetype");
        String bodypk_rateType = (String)destVO.getChildrenVO()[0].getAttributeValue("pk_ratetype");
        if (StringUtil.isEmptyWithTrim(pk_rateType) || StringUtil.isEmptyWithTrim(bodypk_rateType)) {
            return true;
        }
        if (this.reCal) {
            this.reCal = false;
            return true;
        }
        if (UFDouble.ZERO_DBL.equals((Object)occMoney)) {
            return true;
        }
        if ((destRate == null && destbodyRate == null || destRate != null && destRate.equals((Object)UFDouble.ZERO_DBL) && destbodyRate != null && destbodyRate.equals((Object)UFDouble.ZERO_DBL) || UFDouble.ZERO_DBL.equals((Object)bodylocalmoney)) && (n2 = 0) < (n = (circularlyAccessibleValueObjectArray = destVO.getChildrenVO()).length)) {
            CircularlyAccessibleValueObject vo = circularlyAccessibleValueObjectArray[n2];
            String billtype = (String)vo.getAttributeValue("src_billtype");
            return this.isNotArapBilltype(billtype);
        }
        return false;
    }

    protected boolean isFillRate() {
        return false;
    }

    private boolean isNotArapBilltype(String billtype) {
        for (String type : this.billtypes) {
            if (!type.equals(billtype)) continue;
            return false;
        }
        return true;
    }
}


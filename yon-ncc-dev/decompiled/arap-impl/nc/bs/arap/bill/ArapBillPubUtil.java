/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bd.accperiod.InvalidAccperiodExcetion
 *  nc.bs.dao.BaseDAO
 *  nc.bs.dao.DAOException
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Log
 *  nc.bs.logging.Logger
 *  nc.bs.pf.pub.PfDataCache
 *  nc.impl.pubapp.pattern.database.DataAccessUtils
 *  nc.itf.bd.recpaytype.IRecpaytypeQueryService
 *  nc.itf.bd.userdefitem.IUserdefitemQryService
 *  nc.itf.fi.pub.Currency
 *  nc.itf.fi.pub.SysInit
 *  nc.itf.org.IFinanceOrgQryService
 *  nc.itf.uap.pf.IPFBillItfDef
 *  nc.itf.uap.pf.IPFWorkflowQry
 *  nc.jdbc.framework.processor.BaseProcessor
 *  nc.jdbc.framework.processor.ColumnListProcessor
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.md.model.MetaDataException
 *  nc.md.persist.framework.IMDPersistenceQueryService
 *  nc.md.persist.framework.MDPersistenceService
 *  nc.pub.billcode.itf.IBillcodeManage
 *  nc.pub.billcode.vo.BillCodeContext
 *  nc.pubitf.accperiod.AccountCalendar
 *  nc.pubitf.org.IOrgUnitPubService
 *  nc.pubitf.rbac.IDataPermissionPubService
 *  nc.pubitf.setting.defaultdata.OrgSettingAccessor
 *  nc.pubitf.uapbd.IBankaccPubQueryService
 *  nc.pubitf.uapbd.ICashflowPubService
 *  nc.pubitf.uapbd.ICustomerPubService
 *  nc.pubitf.uapbd.IFundPlanPubService
 *  nc.pubitf.uapbd.IInoutBusiClassPubService
 *  nc.pubitf.uapbd.ISupplierPubService
 *  nc.vo.bd.cust.CustomerVO
 *  nc.vo.bd.defdoc.DefdocVO
 *  nc.vo.bd.period.AccperiodVO
 *  nc.vo.bd.period2.AccperiodmonthVO
 *  nc.vo.bd.supplier.SupplierVO
 *  nc.vo.bd.userdefrule.UserdefitemVO
 *  nc.vo.fibd.RecpaytypeVO
 *  nc.vo.fipub.annotation.Business
 *  nc.vo.fipub.billcode.FinanceBillCodeInfo
 *  nc.vo.fipub.billcode.FinanceBillCodeUtils
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.fipub.utils.SqlBuilder
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.ml.MultiLangContext
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.org.DeptVO
 *  nc.vo.org.FinanceOrgVO
 *  nc.vo.pf.change.BillItfDefVO
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.BusinessRuntimeException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.IColumnMeta
 *  nc.vo.pub.IVOMeta
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.billtype.BilltypeVO
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pubapp.calculator.Calculator
 *  nc.vo.pubapp.calculator.Condition
 *  nc.vo.pubapp.calculator.data.IRelationForItems
 *  nc.vo.pubapp.pattern.data.IRowSet
 *  nc.vo.pubapp.pattern.exception.ExceptionUtils
 *  nc.vo.pubapp.pattern.model.entity.bill.AbstractBill
 *  nc.vo.pubapp.pattern.pub.MathTool
 *  nc.vo.pubapp.scale.ScaleUtils
 *  nc.vo.util.BDVisibleUtil
 *  nccloud.commons.lang.ArrayUtils
 *  nccloud.commons.lang.StringUtils
 */
package nc.bs.arap.bill;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import nc.bd.accperiod.InvalidAccperiodExcetion;
import nc.bs.arap.bill.ArapBillCalUtil;
import nc.bs.arap.bill.CalcMoneyUtil;
import nc.bs.arap.util.ArapBillType2TableMapping;
import nc.bs.arap.util.BillMoneyVUtils;
import nc.bs.arap.util.SqlUtils;
import nc.bs.dao.BaseDAO;
import nc.bs.dao.DAOException;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Log;
import nc.bs.logging.Logger;
import nc.bs.pf.pub.PfDataCache;
import nc.impl.pubapp.pattern.database.DataAccessUtils;
import nc.itf.arap.pub.IArapBillService;
import nc.itf.bd.recpaytype.IRecpaytypeQueryService;
import nc.itf.bd.userdefitem.IUserdefitemQryService;
import nc.itf.fi.pub.Currency;
import nc.itf.fi.pub.SysInit;
import nc.itf.org.IFinanceOrgQryService;
import nc.itf.uap.pf.IPFBillItfDef;
import nc.itf.uap.pf.IPFWorkflowQry;
import nc.jdbc.framework.processor.BaseProcessor;
import nc.jdbc.framework.processor.ColumnListProcessor;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.md.model.MetaDataException;
import nc.md.persist.framework.IMDPersistenceQueryService;
import nc.md.persist.framework.MDPersistenceService;
import nc.pub.billcode.itf.IBillcodeManage;
import nc.pub.billcode.vo.BillCodeContext;
import nc.pubitf.accperiod.AccountCalendar;
import nc.pubitf.arap.bill.IArapBillPubQueryService;
import nc.pubitf.arap.pub.ICurrentVersionService;
import nc.pubitf.org.IOrgUnitPubService;
import nc.pubitf.rbac.IDataPermissionPubService;
import nc.pubitf.setting.defaultdata.OrgSettingAccessor;
import nc.pubitf.uapbd.IBankaccPubQueryService;
import nc.pubitf.uapbd.ICashflowPubService;
import nc.pubitf.uapbd.ICustomerPubService;
import nc.pubitf.uapbd.IFundPlanPubService;
import nc.pubitf.uapbd.IInoutBusiClassPubService;
import nc.pubitf.uapbd.ISupplierPubService;
import nc.vo.arap.basebill.ArapVOFactory;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.bill.util.ArapH2BMapping;
import nc.vo.arap.cal.BillMathCalculator;
import nc.vo.arap.global.ArapBillVOConsts;
import nc.vo.arap.global.ArapCommonTool;
import nc.vo.arap.pub.ArapBillTypeInfo;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.sysinit.SysinitConst;
import nc.vo.arap.termitem.TermVO;
import nc.vo.arap.utils.StringUtil;
import nc.vo.arappub.calculator.data.RelationItemForCal_Credit;
import nc.vo.arappub.calculator.data.RelationItemForCal_Debit;
import nc.vo.bd.cust.CustomerVO;
import nc.vo.bd.defdoc.DefdocVO;
import nc.vo.bd.period.AccperiodVO;
import nc.vo.bd.period2.AccperiodmonthVO;
import nc.vo.bd.supplier.SupplierVO;
import nc.vo.bd.userdefrule.UserdefitemVO;
import nc.vo.fibd.RecpaytypeVO;
import nc.vo.fipub.annotation.Business;
import nc.vo.fipub.billcode.FinanceBillCodeInfo;
import nc.vo.fipub.billcode.FinanceBillCodeUtils;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.fipub.utils.SqlBuilder;
import nc.vo.ml.MultiLangContext;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.org.DeptVO;
import nc.vo.org.FinanceOrgVO;
import nc.vo.pf.change.BillItfDefVO;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.BusinessRuntimeException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.IColumnMeta;
import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.billtype.BilltypeVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.calculator.Calculator;
import nc.vo.pubapp.calculator.Condition;
import nc.vo.pubapp.calculator.data.IRelationForItems;
import nc.vo.pubapp.pattern.data.IRowSet;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.pub.MathTool;
import nc.vo.pubapp.scale.ScaleUtils;
import nc.vo.util.BDVisibleUtil;
import nccloud.commons.lang.ArrayUtils;
import nccloud.commons.lang.StringUtils;

public class ArapBillPubUtil {
    private static volatile IDataPermissionPubService dataPermissionQryService = null;
    private static Map<String, UFDate> dateMap = new HashMap<String, UFDate>();
    private static volatile Map<String, String> htobMap;
    public static final String DOC = "def";
    public static final String BD_DEFDOC = "bd_defdoc";
    public static final String BDMETADATA_DEPT_V = "b26fa3cb-4087-4027-a3b6-c83ab2a086a9";

    public static boolean isSystemCode(String nodeCode) {
        ArrayList<String> systemCodes = new ArrayList<String>();
        systemCodes.add("20060RBR");
        systemCodes.add("20060GBR");
        systemCodes.add("20060RBM");
        systemCodes.add("20060ARO");
        systemCodes.add("20060RO");
        systemCodes.add("20060GBM");
        systemCodes.add("20080PBR");
        systemCodes.add("20080EBR");
        systemCodes.add("20080PBM");
        systemCodes.add("20080EBM");
        systemCodes.add("20080APO");
        systemCodes.add("20080PO");
        return systemCodes.contains(nodeCode);
    }

    public static void checkTransTypeEnable(AggregatedValueObject[] bills) throws BusinessException {
        for (AggregatedValueObject bill : bills) {
            BilltypeVO billTypevo = PfDataCache.getBillType((String)((BaseAggVO)bill).getHeadVO().getPk_tradetype());
            if (null != billTypevo && (billTypevo.getIsLock() == null || !billTypevo.getIsLock().booleanValue())) continue;
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006ver_0", "02006ver-0353"));
        }
    }

    public static String getMultiLangIndex() {
        int intIndex = MultiLangContext.getInstance().getCurrentLangSeq();
        return intIndex == 1 ? "" : String.valueOf(intIndex);
    }

    public static BaseAggVO[] assemBaseAggVOs(List<? extends BaseBillVO> vHead, List<? extends BaseItemVO> vItems) {
        BaseBillVO header = null;
        BaseItemVO item = null;
        BaseAggVO[] vos = null;
        Hashtable<String, ArrayList> hashItems = new Hashtable<String, ArrayList>();
        if (vHead != null && vHead.size() > 0 && vItems != null && vItems.size() > 0) {
            int i;
            ArrayList al = null;
            for (i = 0; i < vItems.size(); ++i) {
                item = vItems.get(i);
                ArrayList oTemp = (ArrayList)hashItems.get(item.getParentPK());
                al = oTemp == null ? new ArrayList() : oTemp;
                al.add(item);
                hashItems.put(item.getParentPK(), al);
            }
            vos = new BaseAggVO[vHead.size()];
            for (i = 0; i < vHead.size(); ++i) {
                BaseAggVO dj = ArapVOFactory.getAggVOInstance(vHead.get(i).getPk_billtype());
                header = vHead.get(i);
                dj.setParentVO((CircularlyAccessibleValueObject)header);
                al = (ArrayList)hashItems.get(header.getPrimaryKey());
                if (al != null && al.size() > 0) {
                    BaseItemVO[] items = new BaseItemVO[al.size()];
                    items = al.toArray(items);
                    dj.setChildrenVO((CircularlyAccessibleValueObject[])items);
                }
                vos[i] = dj;
            }
        }
        return vos;
    }

    public static List<String> getTopBillPKs(BaseItemVO[] children) {
        if (null == children || children.length == 0) {
            return null;
        }
        ArrayList<String> ls = new ArrayList<String>();
        for (BaseItemVO item : children) {
            if (nc.vo.jcom.lang.StringUtil.isEmptyWithTrim((String)item.getTop_itemid())) continue;
            ls.add(item.getTop_itemid());
        }
        return ls;
    }

    public static Map<String, BaseItemVO> getMapByChildren(BaseItemVO[] children) {
        HashMap<String, BaseItemVO> ret = new HashMap<String, BaseItemVO>();
        for (BaseItemVO item : children) {
            ret.put(item.getPrimaryKey(), item);
        }
        return ret;
    }

    public static BaseAggVO[] getWriteBackBillVO(BaseAggVO[] bill, UFDate current, String userid) throws BusinessException {
        ArrayList<BaseAggVO> ret = new ArrayList<BaseAggVO>();
        for (BaseAggVO t : bill) {
            try {
                BaseAggVO writeBackBillVO = ArapBillPubUtil.getWriteBackBillVO(t, current, userid);
                ret.add(writeBackBillVO);
            }
            catch (InvalidAccperiodExcetion e) {
                throw ExceptionHandler.createException((String)e.getMessage());
            }
        }
        return ret.toArray(new BaseAggVO[0]);
    }

    @Business(business="\u57fa\u7840\u5355\u636e", subBusiness="\u7ea2\u51b2", description="\u6839\u636e\u6765\u6e90\u5355\u636e\uff0c\u751f\u6210\u7ea2\u51b2\u7684\u5355\u636e", type="\u5de5\u5177")
    public static <T extends BaseAggVO> BaseAggVO getWriteBackBillVO(T bill, UFDate current, String userid) throws InvalidAccperiodExcetion {
        int i;
        String[] itemQuantityKeys = new String[]{"quantity_de", "quantity_cr", "quantity_bal"};
        String[] itemMnyKeys = new String[]{"money_de", "local_money_de", "local_money_cr", "money_cr", "money_bal", "local_money_bal", "local_tax_de", "notax_de", "local_notax_de", "local_tax_cr", "notax_cr", "local_notax_cr", "groupbalance", "globalbalance", "groupdebit", "globaldebit", "grouptax_de", "globaltax_de", "groupnotax_de", "globalnotax_de", "groupcrebit", "globalcrebit", "grouptax_cre", "globaltax_cre", "groupnotax_cre", "globalnotax_cre", "occupationmny", "caltaxmny", "nosubtax"};
        String[] clearItemKeys = new String[]{"paydate", "payman", "payflag", "billno", "occupationmny", "ts", "rowtype"};
        String[] clearHeadKeys = new String[]{"settlenum", "paydate", "payman", "settleflag", "billno", "approvestatus", "isflowbill", "isfromindependent", "approver", "approvedate", "effectuser", "effectdate", "officialprintuser", "officialprintdate", "confirmuser", "signdate", "signperiod", "signuser", "signyear", "paydate", "payman", "payreason", "cooperflag"};
        BaseAggVO vo = (BaseAggVO)((Object)bill.clone());
        BaseBillVO parent = (BaseBillVO)vo.getParentVO();
        String billno = parent.getBillno();
        String pk_bill = parent.getPrimaryKey();
        String pk_billType = parent.getPk_billtype();
        BaseItemVO[] children = (BaseItemVO[])vo.getChildrenVO();
        UFDouble NEGATIVE = new UFDouble("-1");
        UFDouble ZERO = new UFDouble("0");
        AccountCalendar calendar = AccountCalendar.getInstanceByPk_org((String)parent.getPk_org());
        calendar.setDate(current);
        AccperiodVO accperiod = calendar.getYearVO();
        accperiod.setAccperiodmonth(new AccperiodmonthVO[]{calendar.getMonthVO()});
        for (String key : clearHeadKeys) {
            parent.setAttributeValue(key, null);
        }
        for (int i2 = 0; i2 < children.length; ++i2) {
            if (parent.getSrc_syscode() == null || !parent.getSrc_syscode().equals(BillEnumCollection.FromSystem.AM.VALUE) || children[i2].getSrc_billtype().equals("FCT1") || children[i2].getSrc_billtype().equals("FCT2")) continue;
            children[i2].setSrc_billid(null);
            children[i2].setSrc_billtype(null);
            children[i2].setSrc_itemid(null);
            children[i2].setSrc_tradetype(null);
        }
        parent.setBillmaker(userid);
        parent.setTransientFlag(ArapBillVOConsts.ACT_RED_BILL);
        parent.setPrimaryKey(null);
        parent.setBilldate(current);
        parent.setBusidate(current);
        parent.setApprovestatus((int)BillEnumCollection.ApproveStatus.NOSTATE.VALUE);
        parent.setIsmandatepay(UFBoolean.FALSE);
        parent.setSettletype(0);
        parent.setSrc_syscode(parent.getSyscode());
        parent.setIsreded(ArapBillVOConsts.RED);
        parent.setTs(null);
        parent.setGlobalrate(parent.getGlobalrate() == null ? UFDouble.ZERO_DBL : parent.getGlobalrate());
        parent.setGrouprate(parent.getGrouprate() == null ? UFDouble.ZERO_DBL : parent.getGrouprate());
        boolean reset = false;
        for (i = 0; i < children.length; ++i) {
            if (children[i].getOccupationmny().equals((Object)children[i].getMoney_cr().add(children[i].getMoney_de())) || children[i].getMoney_bal().compareTo((Object)UFDouble.ZERO_DBL) == 0) continue;
            if (children[i].getDirection().equals(BillEnumCollection.Direction.CREDIT.VALUE)) {
                children[i].setMoney_cr(children[i].getOccupationmny());
                children[i].setLocal_money_cr(UFDouble.ZERO_DBL);
            } else if (children[i].getDirection().equals(BillEnumCollection.Direction.DEBIT.VALUE)) {
                children[i].setMoney_de(children[i].getOccupationmny());
                children[i].setLocal_money_de(UFDouble.ZERO_DBL);
            }
            reset = true;
        }
        if (reset) {
            ArapBillPubUtil.redprocessMoney((AggregatedValueObject)vo);
        }
        for (i = 0; i < children.length; ++i) {
            UFDouble moneyCrGlobal;
            UFDouble moneyCrGroup;
            UFDouble moneyCrOrg;
            UFDouble moneyCr;
            UFDouble value;
            children[i].setTop_itemid(children[i].getPrimaryKey());
            children[i].setTop_billid(pk_bill);
            children[i].setTop_billtype(parent.getPk_billtype());
            children[i].setTop_tradetype(parent.getPk_tradetype());
            children[i].setParentPK(null);
            children[i].setPrimaryKey(null);
            children[i].setBusidate(current);
            children[i].setBilldate(current);
            children[i].setIsverifyfinished(UFBoolean.FALSE);
            children[i].setStatus(2);
            children[i].setConfernum(null);
            children[i].setSettlemoney(children[i].getOccupationmny());
            children[i].setSettlecurr(children[i].getPk_currtype());
            for (String key : clearItemKeys) {
                children[i].setAttributeValue(key, null);
            }
            for (String key : itemQuantityKeys) {
                value = (UFDouble)children[i].getAttributeValue(key);
                if (null == value || value.equals((Object)ZERO)) continue;
                children[i].setAttributeValue(key, value.multiply(NEGATIVE));
            }
            for (String key : itemMnyKeys) {
                value = (UFDouble)children[i].getAttributeValue(key);
                if (null == value || value.equals((Object)ZERO)) continue;
                children[i].setAttributeValue(key, value.multiply(NEGATIVE));
            }
            UFDouble balmoney = null;
            UFDouble orgmoney = null;
            UFDouble groupmoney = null;
            UFDouble globalmoney = null;
            if (children[i].getDirection().equals(BillEnumCollection.Direction.CREDIT.VALUE)) {
                moneyCr = children[i].getSettlemoney().multiply(NEGATIVE);
                moneyCrOrg = children[i].getLocal_money_cr();
                moneyCrGroup = children[i].getGroupcrebit();
                moneyCrGlobal = children[i].getGlobalcrebit();
                balmoney = null == moneyCr ? UFDouble.ZERO_DBL : moneyCr;
                orgmoney = null == moneyCrOrg ? UFDouble.ZERO_DBL : moneyCrOrg;
                groupmoney = null == moneyCrGroup ? UFDouble.ZERO_DBL : moneyCrGroup;
                globalmoney = null == moneyCrGlobal ? UFDouble.ZERO_DBL : moneyCrGlobal;
            } else if (children[i].getDirection().equals(BillEnumCollection.Direction.DEBIT.VALUE)) {
                moneyCr = children[i].getSettlemoney().multiply(NEGATIVE);
                moneyCrOrg = children[i].getLocal_money_de();
                moneyCrGroup = children[i].getGroupdebit();
                moneyCrGlobal = children[i].getGlobaldebit();
                balmoney = null == moneyCr ? UFDouble.ZERO_DBL : moneyCr;
                orgmoney = null == moneyCrOrg ? UFDouble.ZERO_DBL : moneyCrOrg;
                groupmoney = null == moneyCrGroup ? UFDouble.ZERO_DBL : moneyCrGroup;
                globalmoney = null == moneyCrGlobal ? UFDouble.ZERO_DBL : moneyCrGlobal;
            }
            children[i].setMoney_bal(balmoney);
            children[i].setOccupationmny(balmoney);
            children[i].setLocal_money_bal(orgmoney);
            children[i].setGroupbalance(groupmoney);
            children[i].setGlobalbalance(globalmoney);
            UFDouble realQuantityBal = null == children[i].getQuantity_bal() ? UFDouble.ZERO_DBL : children[i].getQuantity_bal();
            children[i].setQuantity_bal(realQuantityBal);
            if ("F0".equals(pk_billType) || "F3".equals(pk_billType)) {
                children[i].setQuantity_de(realQuantityBal);
            } else if ("F2".equals(pk_billType) || "F1".equals(pk_billType)) {
                children[i].setQuantity_cr(realQuantityBal);
            }
            children[i].setGlobalrate(children[i].getGlobalrate() == null ? UFDouble.ZERO_DBL : children[i].getGlobalrate());
            children[i].setGrouprate(children[i].getGrouprate() == null ? UFDouble.ZERO_DBL : children[i].getGrouprate());
            children[i].setScomment(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0463") + billno);
        }
        BillMoneyVUtils.sumBodyToHead(parent, children);
        vo.getHeadVO().setBillstatus(BillEnumCollection.BillSatus.SAVE.VALUE);
        vo.getHeadVO().setEffectstatus(BillEnumCollection.InureSign.NOINURE.VALUE);
        return vo;
    }

    public static void processMoney(AggregatedValueObject bill) {
        new CalcMoneyUtil().processMoney((BaseAggVO)bill);
    }

    public static void redprocessMoney(AggregatedValueObject bill) {
        new CalcMoneyUtil().redprocessMoney((BaseAggVO)bill);
    }

    public static void processMoney1(AggregatedValueObject bill) {
        try {
            String localpkCurrtype;
            CircularlyAccessibleValueObject head = bill.getParentVO();
            Object[] items = bill.getChildrenVO();
            if (ArrayUtils.isEmpty((Object[])items)) {
                return;
            }
            String billClass = (String)head.getAttributeValue("billclass");
            UFDouble money = null;
            UFDouble local_money = null;
            UFDouble groupmoney = null;
            UFDouble globalmoney = null;
            Object pk_headorg = head.getAttributeValue("pk_org");
            if (null == pk_headorg) {
                ExceptionUtils.wrappBusinessException((String)NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0466"));
            }
            if (null == (localpkCurrtype = Currency.getOrgLocalCurrPK((String)pk_headorg.toString()))) {
                ExceptionUtils.wrappBusinessException((String)NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0467"));
            }
            for (Object item : items) {
                item.setAttributeValue("pk_org", pk_headorg);
                if (null != (String)item.getAttributeValue("pk_currtype")) continue;
                item.setAttributeValue("pk_currtype", (Object)localpkCurrtype);
            }
            if (null == head.getAttributeValue("pk_currtype")) {
                head.setAttributeValue("pk_currtype", (Object)localpkCurrtype);
            }
            String pk_org = head.getAttributeValue("pk_org").toString();
            String pkCurrtype = Currency.getOrgLocalCurrPK((String)pk_org);
            String pk_group = (String)(head.getAttributeValue("pk_group") == null ? InvocationInfoProxy.getInstance().getGroupId() : head.getAttributeValue("pk_group"));
            String pkCurrtype_group = Currency.getOrgLocalCurrPK((String)pk_group);
            String pkCurrtype_global = Currency.getOrgLocalCurrPK((String)"GLOBLE00000000000000");
            Condition cond = new Condition();
            cond.setCalOrigCurr(false);
            cond.setIsCalLocalCurr(true);
            cond.setIsChgPriceOrDiscount(false);
            cond.setIsFixNchangerate(false);
            cond.setIsFixNqtunitrate(false);
            cond.setGroupLocalCurrencyEnable(ArapBillCalUtil.isUseGroupMoney(pk_group));
            cond.setGlobalLocalCurrencyEnable(ArapBillCalUtil.isUseGlobalMoney());
            cond.setOrigCurToGlobalMoney(ArapBillCalUtil.isOrigCurToGlobalMoney());
            cond.setOrigCurToGroupMoney(ArapBillCalUtil.isOrigCurToGroupMoney(pk_group));
            try {
                cond.setIsTaxOrNet(BillMathCalculator.getProior(0, pk_org));
            }
            catch (Exception e) {
                Log.getInstance((String)"arapExceptionLog").error((Object)e);
            }
            List<String> list = Arrays.asList("F0", "F1", "F2", "F3", "21", "Z2", "Z3", "Z4", "Z5");
            List<String> Ctlist = Arrays.asList("Z2", "Z3", "Z4", "Z5");
            if ("zs".equals(billClass) || "ys".equals(billClass) || "fk".equals(billClass)) {
                for (Object item : items) {
                    if (null == item.getAttributeValue("taxtype")) {
                        item.setAttributeValue("taxtype", (Object)BillEnumCollection.TaxType.TAXOUT.VALUE);
                    }
                    UFDouble[] rates = ArapBillCalUtil.getRate(item.getAttributeValue("pk_currtype").toString(), pk_org, pk_group, item.getAttributeValue("billdate") == null ? new UFDate() : (UFDate)item.getAttributeValue("billdate"), head.getAttributeValue("pk_billtype").toString());
                    UFDouble orgRate = rates[0];
                    UFDouble GROUP_RATE = rates[1];
                    UFDouble GlOBAL_RATE = rates[2];
                    if (item.getAttributeValue("money_de") == null || item.getAttributeValue("money_de").equals(UFDouble.ZERO_DBL)) continue;
                    String top_billtype = (String)item.getAttributeValue("top_billtype");
                    boolean isNeedCalLocal = false;
                    if (top_billtype != null && !list.contains(top_billtype) && null != head.getAttributeValue("sett_org") && head.getAttributeValue("pk_org").equals(head.getAttributeValue("sett_org"))) {
                        item.setAttributeValue("rate", item.getAttributeValue("rate") == null ? orgRate : item.getAttributeValue("rate"));
                    } else {
                        isNeedCalLocal = true;
                        item.setAttributeValue("rate", (Object)orgRate);
                    }
                    if ((UFDouble)item.getAttributeValue("local_money_de") == null || ((UFDouble)item.getAttributeValue("local_money_de")).compareTo((Object)UFDouble.ZERO_DBL) == 0) {
                        isNeedCalLocal = true;
                    }
                    item.setAttributeValue("grouprate", (Object)GROUP_RATE);
                    String NC001 = SysInit.getParaString((String)pk_group, (String)"NC001");
                    UFDouble newGroupdebit = UFDouble.ZERO_DBL;
                    UFDouble newGroupMoneyNotax = UFDouble.ZERO_DBL;
                    UFDouble newGroupMoneyTax = UFDouble.ZERO_DBL;
                    if (SysinitConst.NC001_BASE_ORIG.equals(NC001)) {
                        newGroupdebit = Currency.getAmountByOpp((String)pk_group, (String)((String)item.getAttributeValue("pk_currtype")), (String)pkCurrtype_group, (UFDouble)((UFDouble)item.getAttributeValue("money_de")), (UFDouble)((UFDouble)item.getAttributeValue("grouprate")), (UFDate)new UFDate());
                        newGroupMoneyNotax = Currency.getAmountByOpp((String)pk_group, (String)((String)item.getAttributeValue("pk_currtype")), (String)pkCurrtype_group, (UFDouble)((UFDouble)item.getAttributeValue("notax_de")), (UFDouble)((UFDouble)item.getAttributeValue("grouprate")), (UFDate)new UFDate());
                    } else if (SysinitConst.NC001_BASE_SUPG.equals(NC001)) {
                        newGroupdebit = Currency.getAmountByOpp((String)pk_group, (String)pkCurrtype, (String)pkCurrtype_group, (UFDouble)((UFDouble)item.getAttributeValue("local_money_de")), (UFDouble)((UFDouble)item.getAttributeValue("grouprate")), (UFDate)new UFDate());
                        newGroupMoneyNotax = Currency.getAmountByOpp((String)pk_group, (String)pkCurrtype, (String)pkCurrtype_group, (UFDouble)((UFDouble)item.getAttributeValue("local_notax_de")), (UFDouble)((UFDouble)item.getAttributeValue("grouprate")), (UFDate)new UFDate());
                    }
                    if (!SysinitConst.NC001_NOT_USED.equals(NC001)) {
                        newGroupMoneyTax = Currency.getAmountByOpp((String)pk_group, (String)pkCurrtype, (String)pkCurrtype_group, (UFDouble)((UFDouble)item.getAttributeValue("local_tax_de")), (UFDouble)((UFDouble)item.getAttributeValue("grouprate")), (UFDate)new UFDate());
                    }
                    item.setAttributeValue("groupdebit", (Object)newGroupdebit);
                    item.setAttributeValue("groupnotax_de", (Object)newGroupMoneyNotax);
                    item.setAttributeValue("grouptax_de", (Object)newGroupMoneyTax);
                    item.setAttributeValue("globalrate", (Object)GlOBAL_RATE);
                    String NC002 = SysInit.getParaString((String)"GLOBLE00000000000000", (String)"NC002");
                    UFDouble newGlobaldebit = UFDouble.ZERO_DBL;
                    UFDouble newGlobalMoneyNotax = UFDouble.ZERO_DBL;
                    UFDouble newGlobalMoneyTax = UFDouble.ZERO_DBL;
                    if (SysinitConst.NC002_BASE_ORIG.equals(NC002)) {
                        newGlobaldebit = Currency.getAmountByOpp((String)"GLOBLE00000000000000", (String)((String)item.getAttributeValue("pk_currtype")), (String)pkCurrtype_global, (UFDouble)((UFDouble)item.getAttributeValue("money_de")), (UFDouble)((UFDouble)item.getAttributeValue("globalrate")), (UFDate)new UFDate());
                        newGlobalMoneyNotax = Currency.getAmountByOpp((String)"GLOBLE00000000000000", (String)((String)item.getAttributeValue("pk_currtype")), (String)pkCurrtype_global, (UFDouble)((UFDouble)item.getAttributeValue("notax_de")), (UFDouble)((UFDouble)item.getAttributeValue("globalrate")), (UFDate)new UFDate());
                    } else if (SysinitConst.NC002_BASE_SUPG.equals(NC002)) {
                        newGlobaldebit = Currency.getAmountByOpp((String)"GLOBLE00000000000000", (String)pkCurrtype, (String)pkCurrtype_global, (UFDouble)((UFDouble)item.getAttributeValue("local_money_de")), (UFDouble)((UFDouble)item.getAttributeValue("globalrate")), (UFDate)new UFDate());
                        newGlobalMoneyNotax = Currency.getAmountByOpp((String)"GLOBLE00000000000000", (String)pkCurrtype, (String)pkCurrtype_global, (UFDouble)((UFDouble)item.getAttributeValue("local_notax_de")), (UFDouble)((UFDouble)item.getAttributeValue("globalrate")), (UFDate)new UFDate());
                    }
                    if (!SysinitConst.NC002_NOT_USED.equals(NC002)) {
                        newGlobalMoneyTax = Currency.getAmountByOpp((String)"GLOBLE00000000000000", (String)pkCurrtype, (String)pkCurrtype_global, (UFDouble)((UFDouble)item.getAttributeValue("local_tax_de")), (UFDouble)((UFDouble)item.getAttributeValue("globalrate")), (UFDate)new UFDate());
                    }
                    item.setAttributeValue("globaldebit", (Object)newGlobaldebit);
                    item.setAttributeValue("globalnotax_de", (Object)newGlobalMoneyNotax);
                    item.setAttributeValue("globaltax_de", (Object)newGlobalMoneyTax);
                    item.setAttributeValue("groupnotax_de", (Object)MathTool.sub((UFDouble)((UFDouble)item.getAttributeValue("groupdebit")), (UFDouble)((UFDouble)item.getAttributeValue("grouptax_de"))));
                    item.setAttributeValue("globalnotax_de", (Object)MathTool.sub((UFDouble)((UFDouble)item.getAttributeValue("globaldebit")), (UFDouble)((UFDouble)item.getAttributeValue("globaltax_de"))));
                    item.setAttributeValue("money_bal", (Object)((UFDouble)item.getAttributeValue("money_de") == null ? UFDouble.ZERO_DBL : (UFDouble)item.getAttributeValue("money_de")));
                    item.setAttributeValue("local_money_bal", (Object)((UFDouble)item.getAttributeValue("local_money_de") == null ? UFDouble.ZERO_DBL : (UFDouble)item.getAttributeValue("local_money_de")));
                    item.setAttributeValue("quantity_bal", (Object)((UFDouble)item.getAttributeValue("quantity_de") == null ? UFDouble.ZERO_DBL : (UFDouble)item.getAttributeValue("quantity_de")));
                    item.setAttributeValue("groupbalance", (Object)((UFDouble)item.getAttributeValue("groupdebit") == null ? UFDouble.ZERO_DBL : (UFDouble)item.getAttributeValue("groupdebit")));
                    item.setAttributeValue("globalbalance", (Object)((UFDouble)item.getAttributeValue("globaldebit") == null ? UFDouble.ZERO_DBL : (UFDouble)item.getAttributeValue("globaldebit")));
                    if (null != item.getAttributeValue("top_billtype") && Ctlist.contains(item.getAttributeValue("top_billtype")) && null != item.getAttributeValue("taxprice") && ((UFDouble)item.getAttributeValue("taxprice")).compareTo((Object)UFDouble.ZERO_DBL) != 0 && ((UFDouble)item.getAttributeValue("money_de")).compareTo((Object)UFDouble.ZERO_DBL) != 0) {
                        UFDouble quantity = (UFDouble)item.getAttributeValue("quantity_de");
                        UFDouble newquantity = ((UFDouble)item.getAttributeValue("money_de")).div((UFDouble)item.getAttributeValue("taxprice"));
                        if (null != quantity) {
                            newquantity = newquantity.setScale(quantity.getPower(), 4);
                        }
                        item.setAttributeValue("quantity_de", (Object)newquantity);
                        item.setAttributeValue("quantity_bal", (Object)newquantity);
                    }
                    ArapBillPubUtil.doReCalculatorDe(isNeedCalLocal, pk_group, cond, (CircularlyAccessibleValueObject)item);
                }
                money = ArapBillPubUtil.sumB("money_de", (CircularlyAccessibleValueObject[])items);
                local_money = ArapBillPubUtil.sumB("local_money_de", (CircularlyAccessibleValueObject[])items);
                groupmoney = ArapBillPubUtil.sumB("groupdebit", (CircularlyAccessibleValueObject[])items);
                globalmoney = ArapBillPubUtil.sumB("globaldebit", (CircularlyAccessibleValueObject[])items);
            } else if ("zf".equals(billClass) || "yf".equals(billClass) || "sk".equals(billClass)) {
                for (Object item : items) {
                    if (null == item.getAttributeValue("taxtype")) {
                        item.setAttributeValue("taxtype", (Object)BillEnumCollection.TaxType.TAXOUT.VALUE);
                    }
                    UFDouble[] rates = ArapBillCalUtil.getRate((String)item.getAttributeValue("pk_currtype"), pk_org, pk_group, item.getAttributeValue("billdate") == null ? new UFDate() : (UFDate)item.getAttributeValue("billdate"), head.getAttributeValue("pk_billtype").toString());
                    UFDouble orgRate = rates[0];
                    UFDouble GROUP_RATE = rates[1];
                    UFDouble GlOBAL_RATE = rates[2];
                    if (item.getAttributeValue("money_cr") == null || ((UFDouble)item.getAttributeValue("money_cr")).equals((Object)UFDouble.ZERO_DBL)) continue;
                    String top_billtype = (String)item.getAttributeValue("top_billtype");
                    boolean isNeedCalLocal = false;
                    if (top_billtype != null && !list.contains(top_billtype) && null != head.getAttributeValue("sett_org") && head.getAttributeValue("pk_org").equals(head.getAttributeValue("sett_org"))) {
                        item.setAttributeValue("rate", (Object)((UFDouble)item.getAttributeValue("rate") == null ? orgRate : (UFDouble)item.getAttributeValue("rate")));
                    } else {
                        isNeedCalLocal = true;
                        item.setAttributeValue("rate", (Object)orgRate);
                    }
                    if ((UFDouble)item.getAttributeValue("local_money_cr") == null || ((UFDouble)item.getAttributeValue("local_money_cr")).compareTo((Object)UFDouble.ZERO_DBL) == 0) {
                        isNeedCalLocal = true;
                    }
                    item.setAttributeValue("grouprate", (Object)GROUP_RATE);
                    String NC001 = SysInit.getParaString((String)pk_group, (String)"NC001");
                    UFDouble newGroupcredit = UFDouble.ZERO_DBL;
                    UFDouble newGroupMoneyNotax = UFDouble.ZERO_DBL;
                    UFDouble newGroupMoneyTax = UFDouble.ZERO_DBL;
                    if (SysinitConst.NC001_BASE_ORIG.equals(NC001)) {
                        newGroupcredit = Currency.getAmountByOpp((String)pk_group, (String)((String)item.getAttributeValue("pk_currtype")), (String)pkCurrtype_group, (UFDouble)((UFDouble)item.getAttributeValue("money_cr")), (UFDouble)((UFDouble)item.getAttributeValue("grouprate")), (UFDate)new UFDate());
                        newGroupMoneyNotax = Currency.getAmountByOpp((String)pk_group, (String)((String)item.getAttributeValue("pk_currtype")), (String)pkCurrtype_group, (UFDouble)((UFDouble)item.getAttributeValue("notax_cr")), (UFDouble)((UFDouble)item.getAttributeValue("grouprate")), (UFDate)new UFDate());
                    } else if (SysinitConst.NC001_BASE_SUPG.equals(NC001)) {
                        newGroupcredit = Currency.getAmountByOpp((String)pk_group, (String)pkCurrtype, (String)pkCurrtype_group, (UFDouble)((UFDouble)item.getAttributeValue("local_money_cr")), (UFDouble)((UFDouble)item.getAttributeValue("grouprate")), (UFDate)new UFDate());
                        newGroupMoneyNotax = Currency.getAmountByOpp((String)pk_group, (String)pkCurrtype, (String)pkCurrtype_group, (UFDouble)((UFDouble)item.getAttributeValue("local_notax_cr")), (UFDouble)((UFDouble)item.getAttributeValue("grouprate")), (UFDate)new UFDate());
                    }
                    newGroupMoneyTax = Currency.getAmountByOpp((String)pk_group, (String)pkCurrtype, (String)pkCurrtype_group, (UFDouble)((UFDouble)item.getAttributeValue("local_tax_cr")), (UFDouble)((UFDouble)item.getAttributeValue("grouprate")), (UFDate)new UFDate());
                    item.setAttributeValue("groupcrebit", (Object)newGroupcredit);
                    item.setAttributeValue("groupnotax_cre", (Object)newGroupMoneyNotax);
                    item.setAttributeValue("grouptax_cre", (Object)newGroupMoneyTax);
                    item.setAttributeValue("globalrate", (Object)GlOBAL_RATE);
                    String NC002 = SysInit.getParaString((String)"GLOBLE00000000000000", (String)"NC002");
                    UFDouble newGlobalcredit = UFDouble.ZERO_DBL;
                    UFDouble newGlobalMoneyNotax = UFDouble.ZERO_DBL;
                    UFDouble newGlobalMoneyTax = UFDouble.ZERO_DBL;
                    if (SysinitConst.NC002_BASE_ORIG.equals(NC002)) {
                        newGlobalcredit = Currency.getAmountByOpp((String)"GLOBLE00000000000000", (String)((String)item.getAttributeValue("pk_currtype")), (String)pkCurrtype_global, (UFDouble)((UFDouble)item.getAttributeValue("money_cr")), (UFDouble)((UFDouble)item.getAttributeValue("globalrate")), (UFDate)new UFDate());
                        newGlobalMoneyNotax = Currency.getAmountByOpp((String)"GLOBLE00000000000000", (String)((String)item.getAttributeValue("pk_currtype")), (String)pkCurrtype_global, (UFDouble)((UFDouble)item.getAttributeValue("notax_cr")), (UFDouble)((UFDouble)item.getAttributeValue("globalrate")), (UFDate)new UFDate());
                    } else if (SysinitConst.NC002_BASE_SUPG.equals(NC002)) {
                        newGlobalcredit = Currency.getAmountByOpp((String)"GLOBLE00000000000000", (String)pkCurrtype, (String)pkCurrtype_global, (UFDouble)((UFDouble)item.getAttributeValue("local_money_cr")), (UFDouble)((UFDouble)item.getAttributeValue("globalrate")), (UFDate)new UFDate());
                        newGlobalMoneyNotax = Currency.getAmountByOpp((String)"GLOBLE00000000000000", (String)pkCurrtype, (String)pkCurrtype_global, (UFDouble)((UFDouble)item.getAttributeValue("local_notax_cr")), (UFDouble)((UFDouble)item.getAttributeValue("globalrate")), (UFDate)new UFDate());
                    }
                    newGlobalMoneyTax = Currency.getAmountByOpp((String)"GLOBLE00000000000000", (String)pkCurrtype, (String)pkCurrtype_global, (UFDouble)((UFDouble)item.getAttributeValue("local_tax_cr")), (UFDouble)((UFDouble)item.getAttributeValue("globalrate")), (UFDate)new UFDate());
                    item.setAttributeValue("globalcrebit", (Object)newGlobalcredit);
                    item.setAttributeValue("globalnotax_cre", (Object)newGlobalMoneyNotax);
                    item.setAttributeValue("globaltax_cre", (Object)newGlobalMoneyTax);
                    item.setAttributeValue("groupnotax_cre", (Object)MathTool.sub((UFDouble)((UFDouble)item.getAttributeValue("groupcrebit")), (UFDouble)((UFDouble)item.getAttributeValue("grouptax_cre"))));
                    item.setAttributeValue("globalnotax_cre", (Object)MathTool.sub((UFDouble)((UFDouble)item.getAttributeValue("globalcrebit")), (UFDouble)((UFDouble)item.getAttributeValue("globaltax_cre"))));
                    item.setAttributeValue("money_bal", (Object)((UFDouble)item.getAttributeValue("money_cr") == null ? UFDouble.ZERO_DBL : (UFDouble)item.getAttributeValue("money_cr")));
                    item.setAttributeValue("local_money_bal", (Object)((UFDouble)item.getAttributeValue("local_money_cr") == null ? UFDouble.ZERO_DBL : (UFDouble)item.getAttributeValue("local_money_cr")));
                    item.setAttributeValue("quantity_bal", (Object)((UFDouble)item.getAttributeValue("quantity_cr") == null ? UFDouble.ZERO_DBL : (UFDouble)item.getAttributeValue("quantity_cr")));
                    item.setAttributeValue("groupbalance", (Object)((UFDouble)item.getAttributeValue("groupcrebit") == null ? UFDouble.ZERO_DBL : (UFDouble)item.getAttributeValue("groupcrebit")));
                    item.setAttributeValue("globalbalance", (Object)((UFDouble)item.getAttributeValue("globalcrebit") == null ? UFDouble.ZERO_DBL : (UFDouble)item.getAttributeValue("globalcrebit")));
                    if (null != item.getAttributeValue("top_billtype") && Ctlist.contains(item.getAttributeValue("top_billtype")) && null != item.getAttributeValue("taxprice") && ((UFDouble)item.getAttributeValue("taxprice")).compareTo((Object)UFDouble.ZERO_DBL) != 0 && ((UFDouble)item.getAttributeValue("money_cr")).compareTo((Object)UFDouble.ZERO_DBL) != 0) {
                        UFDouble quantity = (UFDouble)item.getAttributeValue("quantity_cr");
                        UFDouble newquantity = ((UFDouble)item.getAttributeValue("money_cr")).div((UFDouble)item.getAttributeValue("taxprice"));
                        if (null != quantity) {
                            newquantity = newquantity.setScale(quantity.getPower(), 4);
                        }
                        item.setAttributeValue("quantity_cr", (Object)newquantity);
                        item.setAttributeValue("quantity_bal", (Object)newquantity);
                    }
                    ArapBillPubUtil.doReCalculatorCR(isNeedCalLocal, pk_group, cond, (CircularlyAccessibleValueObject)item);
                }
                for (Object item : items) {
                    if (null == item.getAttributeValue("agentreceiveprimal")) continue;
                    UFDouble newLocalMoneytax = Currency.getAmountByOpp((String)pk_org, (String)((String)item.getAttributeValue("pk_currtype")), (String)pkCurrtype, (UFDouble)((UFDouble)item.getAttributeValue("agentreceiveprimal")), (UFDouble)((UFDouble)item.getAttributeValue("rate")), (UFDate)new UFDate());
                    item.setAttributeValue("agentreceivelocal", (Object)newLocalMoneytax);
                    String NC001 = SysInit.getParaString((String)pk_group, (String)"NC001");
                    UFDouble newGroupMoney = UFDouble.ZERO_DBL;
                    pkCurrtype = Currency.getOrgLocalCurrPK((String)pk_group);
                    if (SysinitConst.NC001_BASE_ORIG.equals(NC001)) {
                        newGroupMoney = Currency.getAmountByOpp((String)pk_group, (String)((String)item.getAttributeValue("pk_currtype")), (String)pkCurrtype, (UFDouble)((UFDouble)item.getAttributeValue("agentreceiveprimal")), (UFDouble)((UFDouble)item.getAttributeValue("grouprate")), (UFDate)new UFDate());
                    } else if (SysinitConst.NC001_BASE_SUPG.equals(NC001)) {
                        newGroupMoney = Currency.getAmountByOpp((String)pk_group, (String)((String)item.getAttributeValue("pk_currtype")), (String)pkCurrtype, (UFDouble)((UFDouble)item.getAttributeValue("agentreceivelocal")), (UFDouble)((UFDouble)item.getAttributeValue("grouprate")), (UFDate)new UFDate());
                    }
                    item.setAttributeValue("groupagentreceivelocal", (Object)newGroupMoney);
                    String NC002 = SysInit.getParaString((String)"GLOBLE00000000000000", (String)"NC002");
                    UFDouble newGlobalMoney = UFDouble.ZERO_DBL;
                    pkCurrtype = Currency.getOrgLocalCurrPK((String)"GLOBLE00000000000000");
                    if (SysinitConst.NC002_BASE_ORIG.equals(NC002)) {
                        newGlobalMoney = Currency.getAmountByOpp((String)"GLOBLE00000000000000", (String)((String)item.getAttributeValue("pk_currtype")), (String)pkCurrtype, (UFDouble)((UFDouble)item.getAttributeValue("agentreceiveprimal")), (UFDouble)((UFDouble)item.getAttributeValue("globalrate")), (UFDate)new UFDate());
                    } else if (SysinitConst.NC002_BASE_SUPG.equals(NC002)) {
                        newGlobalMoney = Currency.getAmountByOpp((String)"GLOBLE00000000000000", (String)((String)item.getAttributeValue("pk_currtype")), (String)pkCurrtype, (UFDouble)((UFDouble)item.getAttributeValue("agentreceivelocal")), (UFDouble)((UFDouble)item.getAttributeValue("globalrate")), (UFDate)new UFDate());
                    }
                    item.setAttributeValue("globalagentreceivelocal", (Object)newGlobalMoney);
                }
                money = ArapBillPubUtil.sumB("money_cr", (CircularlyAccessibleValueObject[])items);
                local_money = ArapBillPubUtil.sumB("local_money_cr", (CircularlyAccessibleValueObject[])items);
                groupmoney = ArapBillPubUtil.sumB("groupcrebit", (CircularlyAccessibleValueObject[])items);
                globalmoney = ArapBillPubUtil.sumB("globalcrebit", (CircularlyAccessibleValueObject[])items);
            }
            head.setAttributeValue("money", (Object)money);
            head.setAttributeValue("local_money", (Object)local_money);
            head.setAttributeValue("rate", items[0].getAttributeValue("rate"));
            head.setAttributeValue("grouprate", items[0].getAttributeValue("grouprate"));
            head.setAttributeValue("globalrate", items[0].getAttributeValue("globalrate"));
            head.setAttributeValue("grouplocal", (Object)groupmoney);
            head.setAttributeValue("globallocal", (Object)globalmoney);
        }
        catch (BusinessException e1) {
            ExceptionUtils.wrappException((Exception)((Object)e1));
        }
    }

    private static void doReCalculatorDe(boolean isNeedCalLocal, String pk_group, Condition cond, CircularlyAccessibleValueObject item) {
        boolean isInterNational = BillEnumCollection.BuySellType.OUT_SELL.VALUE.equals(item.getAttributeValue("buysellflag"));
        cond.setInternational(isInterNational);
        if (isNeedCalLocal || ArapBillPubUtil.needReCalCulateDE(item)) {
            Calculator tool = new Calculator(new CircularlyAccessibleValueObject[]{item}, (IRelationForItems)RelationItemForCal_Debit.getInstance());
            tool.calculate(cond, "money_de", new ScaleUtils(pk_group));
        }
    }

    private static void doReCalculatorCR(boolean isNeedCalLocal, String pk_group, Condition cond, CircularlyAccessibleValueObject item) {
        boolean isInterNational = BillEnumCollection.BuySellType.OUT_BUY.VALUE.equals(item.getAttributeValue("buysellflag"));
        cond.setInternational(isInterNational);
        if (isNeedCalLocal || ArapBillPubUtil.needReCalCulateCR(item)) {
            Calculator tool = new Calculator(new CircularlyAccessibleValueObject[]{item}, (IRelationForItems)RelationItemForCal_Credit.getInstance());
            tool.calculate(cond, "money_cr", new ScaleUtils(pk_group));
        }
    }

    public static boolean needReCalCulateCR(CircularlyAccessibleValueObject item) {
        boolean isInterNational = BillEnumCollection.BuySellType.OUT_BUY.VALUE.equals(item.getAttributeValue("buysellflag"));
        boolean isInterNation = isInterNational && ((UFDouble)item.getAttributeValue("local_notax_cr")).compareTo(item.getAttributeValue("local_money_cr")) != 0;
        boolean notInterNation = !isInterNational && MathTool.add((UFDouble)((UFDouble)item.getAttributeValue("local_notax_cr")), (UFDouble)((UFDouble)item.getAttributeValue("local_tax_cr"))).compareTo(item.getAttributeValue("local_money_cr")) != 0;
        return isInterNation || notInterNation;
    }

    public static boolean needReCalCulateDE(CircularlyAccessibleValueObject item) {
        boolean isInterNational = BillEnumCollection.BuySellType.OUT_SELL.VALUE.equals(item.getAttributeValue("buysellflag"));
        boolean isInterNation = isInterNational && ((UFDouble)item.getAttributeValue("local_notax_de")).compareTo(item.getAttributeValue("local_money_de")) != 0;
        boolean notInterNation = !isInterNational && MathTool.add((UFDouble)((UFDouble)item.getAttributeValue("local_notax_de")), (UFDouble)((UFDouble)item.getAttributeValue("local_tax_de"))).compareTo(item.getAttributeValue("local_money_de")) != 0;
        return isInterNation || notInterNation;
    }

    public static void processMoneyWithoutCal(AggregatedValueObject bill) {
        CircularlyAccessibleValueObject[] items = bill.getChildrenVO();
        CircularlyAccessibleValueObject head = bill.getParentVO();
        String pk_billtype = head.getAttributeValue("pk_billtype").toString();
        String pk_org = head.getAttributeValue("pk_org").toString();
        String pk_group = head.getAttributeValue("pk_group").toString();
        for (CircularlyAccessibleValueObject item : items) {
            Integer object = (Integer)item.getAttributeValue("objtype");
            String billtype = (String)item.getAttributeValue("pk_billtype");
            if (object == null) {
                object = "F0".equals(billtype) || "F2".equals(billtype) || "23E0".equals(billtype) ? Integer.valueOf(0) : Integer.valueOf(1);
            }
            String[] cusp = new String[]{(String)item.getAttributeValue("customer"), (String)item.getAttributeValue("supplier")};
            String pk_rateType = (String)item.getAttributeValue("pk_ratetype");
            UFDouble[] rates = ArapBillCalUtil.getRate((String)item.getAttributeValue("pk_currtype"), pk_org, pk_group, item.getAttributeValue("billdate") == null ? new UFDate() : (UFDate)item.getAttributeValue("billdate"), billtype, pk_rateType, object, cusp);
            item.setAttributeValue("rate", (Object)rates[0]);
            item.setAttributeValue("grouprate", (Object)rates[1]);
            item.setAttributeValue("globalrate", (Object)rates[2]);
        }
        UFDouble money = null;
        UFDouble local_money = null;
        UFDouble groupmoney = null;
        UFDouble globalmoney = null;
        if ("F0".equals(pk_billtype) || "F3".equals(pk_billtype)) {
            money = ArapBillPubUtil.sumB("money_de", items);
            local_money = ArapBillPubUtil.sumB("local_money_de", items);
            groupmoney = ArapBillPubUtil.sumB("groupdebit", items);
            globalmoney = ArapBillPubUtil.sumB("globaldebit", items);
        } else if ("F1".equals(pk_billtype) || "F2".equals(pk_billtype)) {
            money = ArapBillPubUtil.sumB("money_cr", items);
            local_money = ArapBillPubUtil.sumB("local_money_cr", items);
            groupmoney = ArapBillPubUtil.sumB("groupcrebit", items);
            globalmoney = ArapBillPubUtil.sumB("globalcrebit", items);
        }
        head.setAttributeValue("money", (Object)money);
        head.setAttributeValue("local_money", (Object)local_money);
        head.setAttributeValue("grouplocal", (Object)groupmoney);
        head.setAttributeValue("globallocal", (Object)globalmoney);
        head.setAttributeValue("rate", items[0].getAttributeValue("rate"));
        head.setAttributeValue("grouprate", items[0].getAttributeValue("grouprate"));
        head.setAttributeValue("globalrate", items[0].getAttributeValue("globalrate"));
    }

    public static void processMoneyOnlySum(AggregatedValueObject bill) {
        CircularlyAccessibleValueObject[] items = bill.getChildrenVO();
        CircularlyAccessibleValueObject head = bill.getParentVO();
        String pk_billtype = head.getAttributeValue("pk_billtype").toString();
        UFDouble money = null;
        UFDouble local_money = null;
        UFDouble groupmoney = null;
        UFDouble globalmoney = null;
        if ("23E0".equals(pk_billtype) || "F0".equals(pk_billtype) || "F3".equals(pk_billtype)) {
            money = ArapBillPubUtil.sumB("money_de", items);
            local_money = ArapBillPubUtil.sumB("local_money_de", items);
            groupmoney = ArapBillPubUtil.sumB("groupdebit", items);
            globalmoney = ArapBillPubUtil.sumB("globaldebit", items);
        } else if ("23E1".equals(pk_billtype) || "F1".equals(pk_billtype) || "F2".equals(pk_billtype)) {
            money = ArapBillPubUtil.sumB("money_cr", items);
            local_money = ArapBillPubUtil.sumB("local_money_cr", items);
            groupmoney = ArapBillPubUtil.sumB("groupcrebit", items);
            globalmoney = ArapBillPubUtil.sumB("globalcrebit", items);
        }
        head.setAttributeValue("money", (Object)money);
        head.setAttributeValue("local_money", (Object)local_money);
        head.setAttributeValue("grouplocal", (Object)groupmoney);
        head.setAttributeValue("globallocal", (Object)globalmoney);
        head.setAttributeValue("rate", items[0].getAttributeValue("rate"));
        head.setAttributeValue("grouprate", items[0].getAttributeValue("grouprate"));
        head.setAttributeValue("globalrate", items[0].getAttributeValue("globalrate"));
    }

    public static UFDouble sumB(String Bkey, CircularlyAccessibleValueObject[] items) {
        UFDouble subValue = ArapCommonTool.getZero();
        for (CircularlyAccessibleValueObject item : items) {
            if (null == item || item.getStatus() == 3) continue;
            try {
                subValue = subValue.add(item.getAttributeValue(Bkey) == null ? ArapCommonTool.getZero() : (UFDouble)item.getAttributeValue(Bkey));
            }
            catch (Exception e1) {
                ExceptionHandler.consume((Throwable)e1);
            }
        }
        return subValue;
    }

    public static FinanceBillCodeUtils getBillCodeUtil(AggregatedValueObject ... aggvos) {
        IColumnMeta column;
        AggregatedValueObject aggvo = aggvos[0];
        String pk_billtype = "pk_billtype";
        String billno = "billno";
        String pk_group = "pk_group";
        String pk_org = "pk_org";
        SuperVO superVO = (SuperVO)aggvo.getParentVO();
        IVOMeta meta = superVO.getMetaData();
        String tableName = null;
        if (meta != null && (column = meta.getPrimaryAttribute().getColumn()) != null) {
            tableName = column.getTable().getName();
        }
        return new FinanceBillCodeUtils(new FinanceBillCodeInfo(pk_billtype, billno, pk_group, pk_org, tableName));
    }

    public static FinanceBillCodeUtils getBillCodeTypeUtil(AggregatedValueObject ... aggvos) {
        IColumnMeta column;
        AggregatedValueObject aggvo = aggvos[0];
        String pk_billtype = "pk_billtype";
        String billno = "billno";
        String pk_group = "pk_group";
        String pk_org = "pk_org";
        AbstractBill abstractBill = (AbstractBill)aggvo;
        String pk_billType = ((BaseAggVO)abstractBill).getHeadVO().getPk_billtype();
        String pk_tradetype = ((BaseAggVO)abstractBill).getHeadVO().getPk_tradetype();
        SuperVO superVO = (SuperVO)aggvo.getParentVO();
        IVOMeta meta = superVO.getMetaData();
        String levelType = pk_billType;
        String subBillType = "pk_tradetype";
        String tableName = null;
        if (meta != null && (column = meta.getPrimaryAttribute().getColumn()) != null) {
            tableName = column.getTable().getName();
        }
        return new FinanceBillCodeUtils(new FinanceBillCodeInfo(pk_billtype, billno, pk_group, pk_org, tableName, subBillType, levelType));
    }

    public static void updateTS(BaseAggVO bill) throws BusinessException {
        AggregatedValueObject aggvo = (AggregatedValueObject)ArapBillPubUtil.getMDQueryService().queryBillOfVOByPK(((Object)((Object)bill)).getClass(), bill.getParentVO().getPrimaryKey(), false);
        bill.setParentVO(aggvo.getParentVO());
    }

    public static void updateBatchTS(AggregatedValueObject ... aggbills) throws BusinessException {
        ArrayList<String> pks = new ArrayList<String>();
        if (null == aggbills || aggbills.length == 0) {
            return;
        }
        for (AggregatedValueObject bill : aggbills) {
            pks.add(bill.getParentVO().getPrimaryKey());
        }
        Collection aggvos = ArapBillPubUtil.getMDQueryService().queryBillOfVOByPKs(aggbills[0].getClass(), pks.toArray(new String[0]), false);
        AggregatedValueObject[] aggvostmp = aggvos.toArray(new AggregatedValueObject[aggvos.size()]);
        for (int i = 0; i < aggbills.length; ++i) {
            aggbills[i].setParentVO(aggvostmp[i].getParentVO());
        }
    }

    public static boolean hasSettleInfo(BaseBillVO head) {
        String billClass = head.getBillclass();
        return ("fk".equals(billClass) || "sk".equals(billClass)) && !UFBoolean.TRUE.equals((Object)head.getIsinit());
    }

    public static ResultSetProcessor getResultSetProcessor() {
        ResultSetProcessor processor = new ResultSetProcessor(){
            private static final long serialVersionUID = 1L;

            public Object handleResultSet(ResultSet rs) throws SQLException {
                HashMap<String, Integer> result = new HashMap<String, Integer>();
                while (rs.next()) {
                    result.put(rs.getString(1), rs.getInt(2));
                }
                return result;
            }
        };
        return processor;
    }

    public static ResultSetProcessor getResultMapListProcessor(final int len) {
        ResultSetProcessor processor = new ResultSetProcessor(){
            private static final long serialVersionUID = 1L;

            public Object handleResultSet(ResultSet rs) throws SQLException {
                HashMap maplist = new HashMap();
                ArrayList<String> innerList = new ArrayList<String>();
                while (rs.next()) {
                    for (int i = 2; i < len + 2; ++i) {
                        innerList.add(rs.getString(i));
                    }
                    maplist.put(rs.getString(1), innerList);
                }
                return maplist;
            }
        };
        return processor;
    }

    public static ResultSetProcessor getResultSetProcessorMap() {
        ResultSetProcessor processor = new ResultSetProcessor(){
            private static final long serialVersionUID = 1L;

            public Object handleResultSet(ResultSet rs) throws SQLException {
                HashMap<String, String> result = new HashMap<String, String>();
                while (rs.next()) {
                    result.put(rs.getString(1), rs.getString(2));
                }
                return result;
            }
        };
        return processor;
    }

    public static ResultSetProcessor getResultSetProcessorDoubleMap() {
        ResultSetProcessor processor = new ResultSetProcessor(){
            private static final long serialVersionUID = 1L;

            public Object handleResultSet(ResultSet rs) throws SQLException {
                HashMap result = new HashMap();
                LinkedHashMap<String, String> innerresult = new LinkedHashMap<String, String>();
                while (rs.next()) {
                    innerresult.put(rs.getString(2), rs.getString(3));
                    result.put(rs.getString(1), innerresult);
                }
                return result;
            }
        };
        return processor;
    }

    public static ResultSetProcessor getProcessorThreeMap() {
        ResultSetProcessor processor = new ResultSetProcessor(){
            private static final long serialVersionUID = 1L;

            public Object handleResultSet(ResultSet rs) throws SQLException {
                HashMap result = new HashMap();
                LinkedHashMap<String, String> innerresultTop = new LinkedHashMap<String, String>();
                LinkedHashMap<String, String> innerresultToptype = new LinkedHashMap<String, String>();
                LinkedHashMap<String, String> innerresultSrc = new LinkedHashMap<String, String>();
                LinkedHashMap<String, LinkedHashMap<String, String>> innermap = new LinkedHashMap<String, LinkedHashMap<String, String>>();
                while (rs.next()) {
                    String key = rs.getString(7);
                    innerresultTop.put(rs.getString(3), rs.getString(2));
                    innermap.put(key, innerresultTop);
                    innerresultToptype.put(rs.getString(3), rs.getString(1));
                    innermap.put(key + "_top", innerresultToptype);
                    result.put(rs.getString(1), innermap);
                    innerresultSrc.put(rs.getString(6), rs.getString(5));
                    innermap.put(key, innerresultSrc);
                    result.put(rs.getString(4), innermap);
                }
                return result;
            }
        };
        return processor;
    }

    public static ResultSetProcessor getResultMapSetProcessorMap() {
        ResultSetProcessor processor = new ResultSetProcessor(){
            private static final long serialVersionUID = 1L;

            public Object handleResultSet(ResultSet rs) throws SQLException {
                HashMap map = new HashMap();
                while (rs.next()) {
                    String billtype = rs.getString(1);
                    String itemid = rs.getString(2);
                    String pk_payableitem = rs.getString(3);
                    if (!map.containsKey(billtype)) {
                        map.put(billtype, new HashMap());
                    }
                    if (!((Map)map.get(billtype)).containsKey(itemid)) {
                        ((Map)map.get(billtype)).put(itemid, new HashSet());
                    }
                    ((Set)((Map)map.get(billtype)).get(itemid)).add(pk_payableitem);
                }
                return map;
            }
        };
        return processor;
    }

    public static boolean isFromArap(BaseBillVO vo, BaseItemVO item) {
        if (vo.getSrc_syscode().intValue() == BillEnumCollection.FromSystem.XTDJ.VALUE.intValue()) {
            return false;
        }
        String top_pk_billtype = item.getTop_billtype();
        String pk_billtype = item.getPk_billtype();
        if (nc.vo.jcom.lang.StringUtil.isEmpty((String)top_pk_billtype) || nc.vo.jcom.lang.StringUtil.isEmpty((String)pk_billtype)) {
            return false;
        }
        UFBoolean isrefund = vo.getIsrefund();
        if ((pk_billtype + top_pk_billtype).equals("F1F2") && isrefund.booleanValue()) {
            return false;
        }
        if ((pk_billtype + top_pk_billtype).equals("F1F0") && isrefund.booleanValue()) {
            return false;
        }
        if ((pk_billtype + top_pk_billtype).equals("F2F3") && isrefund.booleanValue()) {
            return false;
        }
        return ArapBillPubUtil.isArapBilltype(top_pk_billtype);
    }

    @Deprecated
    public static boolean isFromArap(String top_pk_billtype, String pk_billtype) {
        if (nc.vo.jcom.lang.StringUtil.isEmpty((String)top_pk_billtype)) {
            return false;
        }
        if (nc.vo.jcom.lang.StringUtil.isEmpty((String)pk_billtype)) {
            return false;
        }
        if (pk_billtype.equals(top_pk_billtype)) {
            return false;
        }
        if ((pk_billtype + top_pk_billtype).equals("F0F1")) {
            return false;
        }
        if ((pk_billtype + top_pk_billtype).equals("F1F0")) {
            return false;
        }
        if ((pk_billtype + top_pk_billtype).equals("F2F3")) {
            return false;
        }
        if ((pk_billtype + top_pk_billtype).equals("F3F2")) {
            return false;
        }
        return ArapBillPubUtil.isArapBilltype(top_pk_billtype);
    }

    public static boolean isArapBilltype(String pk_billtype) {
        if (nc.vo.jcom.lang.StringUtil.isEmpty((String)pk_billtype)) {
            return false;
        }
        String clone = pk_billtype.trim();
        return "F0".equals(clone) || "F1".equals(clone) || "F2".equals(clone) || "F3".equals(clone);
    }

    public static boolean isARSysBilltype(String pk_billtype) {
        if (nc.vo.jcom.lang.StringUtil.isEmpty((String)pk_billtype)) {
            throw new BusinessRuntimeException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0469"));
        }
        String clone = pk_billtype.trim();
        if ("F0".equals(clone) || "F2".equals(clone) || "23E0".equals(clone) || "23F1".equals(clone) || "23F3".equals(clone)) {
            return true;
        }
        if ("F1".equals(clone) || "F3".equals(clone) || "23E1".equals(clone) || "23F0".equals(clone) || "23F2".equals(clone)) {
            return false;
        }
        throw new BusinessRuntimeException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0470"));
    }

    public static boolean getDirection(String pk_billtype) throws BusinessException {
        String clone;
        if (nc.vo.jcom.lang.StringUtil.isEmpty((String)pk_billtype)) {
            ExceptionHandler.createAndThrowException((String)NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0469"));
        }
        if ("F0".equals(clone = pk_billtype.trim()) || "23E0".equals(clone) || "F3".equals(clone)) {
            return true;
        }
        if ("F1".equals(clone) || "23E1".equals(clone) || "F2".equals(clone)) {
            return false;
        }
        throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0470"));
    }

    public static int isDf(String billType) {
        if (billType.equals("F1") || billType.equals("23E1") || billType.equals("F2")) {
            return 0;
        }
        if (billType.equals("F0") || billType.equals("23E0") || billType.equals("F3")) {
            return 1;
        }
        return 9;
    }

    public static BaseItemVO translate(TermVO termvo, BaseItemVO srcvo) {
        BaseItemVO clone = (BaseItemVO)srcvo.clone();
        clone.setGlobalbalance(termvo.getGlobalbalance());
        clone.setGlobalcrebit(termvo.getGlobalcredit());
        clone.setGlobaldebit(termvo.getGlobaldebit());
        clone.setGroupbalance(termvo.getGroupbalance());
        clone.setGroupcrebit(termvo.getGroupcredit());
        clone.setGroupdebit(termvo.getGroupdebit());
        clone.setLocal_money_bal(termvo.getLocal_money_bal());
        clone.setLocal_money_cr(termvo.getLocal_money_cr());
        clone.setLocal_money_de(termvo.getLocal_money_de());
        clone.setMoney_bal(termvo.getMoney_bal());
        clone.setMoney_cr(termvo.getMoney_cr());
        clone.setMoney_de(termvo.getMoney_de());
        clone.setQuantity_bal(termvo.getQuantity_bal());
        clone.setQuantity_cr(termvo.getQuantity_cr());
        clone.setQuantity_de(termvo.getQuantity_de());
        clone.setLocal_notax_cr(null);
        clone.setLocal_notax_de(null);
        clone.setLocal_tax_cr(null);
        clone.setLocal_tax_de(null);
        return null;
    }

    public static String[] getBillPKs(AggregatedValueObject[] bills) throws BusinessException {
        ArrayList<String> ls = new ArrayList<String>();
        for (AggregatedValueObject bill : bills) {
            ls.add(bill.getParentVO().getPrimaryKey());
        }
        return ls.toArray(new String[ls.size()]);
    }

    public static String[] getBillPKs(BaseAggVO bill) {
        ArrayList<String> ls = new ArrayList<String>();
        ls.add(bill.getPrimaryKey());
        return ls.toArray(new String[ls.size()]);
    }

    private static IMDPersistenceQueryService getMDQueryService() {
        return MDPersistenceService.lookupPersistenceQueryService();
    }

    public static IDataPermissionPubService getDataPermissionQryService() {
        if (dataPermissionQryService == null) {
            dataPermissionQryService = (IDataPermissionPubService)NCLocator.getInstance().lookup(IDataPermissionPubService.class.getName());
        }
        return dataPermissionQryService;
    }

    public static UFDate getArapCreateDate(String pk_org, String pk_billtype) {
        boolean isAr = false;
        if (!nc.vo.jcom.lang.StringUtil.isEmpty((String)pk_billtype)) {
            isAr = ArapBillPubUtil.isARSysBilltype(pk_billtype);
        }
        UFDate billdate = ArapBillPubUtil.getArapCreateDate(isAr, pk_org);
        return billdate;
    }

    public static UFDate getArapCreateDate(boolean isAr, String pk_org) {
        UFDate ufDate = ArapBillPubUtil.getOrgModuleperiodDate(isAr, pk_org);
        UFDate dateBefore = null;
        if (ufDate != null) {
            dateBefore = ufDate.getDateBefore(1);
        }
        return dateBefore;
    }

    public static UFDate getOrgModuleperiodDate(boolean isAr, String pk_org) {
        String createDate;
        block6: {
            dateMap.clear();
            String key = String.valueOf(isAr) + "_" + pk_org;
            UFDate retDate = dateMap.get(key);
            if (null != retDate) {
                return retDate;
            }
            createDate = null;
            String moduleCode = "2008";
            if (isAr) {
                moduleCode = "2006";
            }
            IOrgUnitPubService orgUnitPubService = (IOrgUnitPubService)NCLocator.getInstance().lookup(IOrgUnitPubService.class);
            String createdrt = null;
            try {
                createdrt = orgUnitPubService.getOrgModulePeriodByOrgIDAndModuleID(pk_org, moduleCode);
                if (createdrt != null) {
                    String initEnabledYear = createdrt.substring(0, 4);
                    String initEnabledMonth = createdrt.substring(5, 7);
                    AccountCalendar instanceByPkOrg = AccountCalendar.getInstanceByPk_org((String)pk_org);
                    instanceByPkOrg.set(initEnabledYear, initEnabledMonth);
                    UFDate createDate2 = instanceByPkOrg.getMonthVO().getBegindate();
                    dateMap.put(key, createDate2);
                    return createDate2;
                }
            }
            catch (BusinessException e) {
                ExceptionHandler.consume((Throwable)e);
                if (createdrt == null) break block6;
                createDate = createdrt.trim() + "-01";
            }
        }
        if (null == createDate) {
            return null;
        }
        UFDate ufDate = new UFDate(createDate);
        return ufDate;
    }

    public static UFDate getArapCreateDate(boolean isAr) {
        String pk_org = null;
        try {
            pk_org = OrgSettingAccessor.getDefaultOrgUnit();
        }
        catch (Exception e) {
            ExceptionHandler.consume((Throwable)e);
        }
        if (pk_org == null) {
            pk_org = "GLOBLE00000000000000";
        }
        return ArapBillPubUtil.getArapCreateDate(isAr, pk_org);
    }

    public static void fillInitEstInfo(AggregatedValueObject[] aggvos) {
        for (AggregatedValueObject vo : aggvos) {
            UFBoolean isInit;
            UFBoolean uFBoolean = isInit = vo.getParentVO().getAttributeValue("isinit") == null ? UFBoolean.FALSE : (UFBoolean)vo.getParentVO().getAttributeValue("isinit");
            if (!isInit.booleanValue() || null == vo.getParentVO().getAttributeValue("billclass")) continue;
            String billclass = (String)vo.getParentVO().getAttributeValue("billclass");
            String pk_org = (String)vo.getParentVO().getAttributeValue("pk_org");
            UFDate date = ArapBillPubUtil.getArapCreateDate("zs".equals(billclass), pk_org);
            if (date == null) {
                throw new BusinessRuntimeException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1280", null, new String[]{"zs".equals(billclass) ? "2008" : "2006"}));
            }
            if (vo.getParentVO().getAttributeValue("billdate") == null || ((UFDate)vo.getParentVO().getAttributeValue("billdate")).after(date)) {
                vo.getParentVO().setAttributeValue("billdate", (Object)date);
                for (CircularlyAccessibleValueObject item : vo.getChildrenVO()) {
                    item.setAttributeValue("billdate", (Object)date);
                }
            }
            for (CircularlyAccessibleValueObject item : vo.getChildrenVO()) {
                if (item.getAttributeValue("busidate") != null && !((UFDate)item.getAttributeValue("busidate")).after(date)) continue;
                item.setAttributeValue("busidate", (Object)date);
            }
        }
    }

    public static boolean checkIsMan(AggregatedValueObject[] aggvos) {
        if (ArrayUtils.isEmpty((Object[])aggvos)) {
            return false;
        }
        AggregatedValueObject aggvo = aggvos[0];
        if (aggvo != null) {
            CircularlyAccessibleValueObject parentVO = aggvo.getParentVO();
            try {
                String pk_bill = parentVO.getPrimaryKey();
                String pk_tradetype = (String)parentVO.getAttributeValue("pk_tradetype");
                String userId = InvocationInfoProxy.getInstance().getUserId();
                if (((IPFWorkflowQry)NCLocator.getInstance().lookup(IPFWorkflowQry.class)).isCheckman(pk_bill, pk_tradetype, userId)) {
                    return true;
                }
            }
            catch (BusinessException e) {
                ExceptionHandler.consume((Throwable)e);
            }
        }
        return false;
    }

    public static AggregatedValueObject[] convertObjetcsToAggs(Object ... values) {
        AggregatedValueObject[] aggs = new AggregatedValueObject[values.length];
        System.arraycopy(values, 0, aggs, 0, aggs.length);
        return aggs;
    }

    public static void dealRedFlag(AggregatedValueObject[] bills) {
        for (AggregatedValueObject bill : bills) {
            String pk_billType = bill.getParentVO().getAttributeValue("pk_billtype").toString();
            Object top_billType = bill.getChildrenVO()[0].getAttributeValue("top_billtype");
            if (null == top_billType || !pk_billType.equals(top_billType)) continue;
            DataAccessUtils util = new DataAccessUtils();
            IRowSet row = null;
            String pk_bill = bill.getChildrenVO()[0].getAttributeValue("top_billid").toString();
            try {
                if ("F0".equals(pk_billType)) {
                    row = util.query("SELECT pk_recbill FROM ar_recitem where top_billid='" + pk_bill + "' and dr=0 and pk_billtype='" + top_billType + "'");
                } else if ("F1".equals(pk_billType)) {
                    row = util.query("SELECT pk_payablebill FROM ap_payableitem where top_billid='" + pk_bill + "' and dr=0 and pk_billtype='" + top_billType + "'");
                } else if ("F2".equals(pk_billType)) {
                    row = util.query("SELECT pk_gatherbill FROM ar_gatheritem where top_billid='" + pk_bill + "' and dr=0 and pk_billtype='" + top_billType + "'");
                } else if ("F3".equals(pk_billType)) {
                    row = util.query("SELECT pk_paybill FROM ap_payitem where top_billid='" + pk_bill + "' and dr=0 and pk_billtype='" + top_billType + "'");
                }
                HashSet<String> pkSet = new HashSet<String>();
                if (row != null) {
                    while (row.next()) {
                        pkSet.add(row.getString(0));
                    }
                }
                if (!pkSet.isEmpty()) continue;
                ((nc.itf.arap.bill.IArapBillService)NCLocator.getInstance().lookup(nc.itf.arap.bill.IArapBillService.class)).updateIsredFlag(ArapBillType2TableMapping.getParentTable(pk_billType), ArapBillType2TableMapping.getParentTablePK(pk_billType), pk_bill);
            }
            catch (BusinessException e) {
                ExceptionUtils.wrappException((Exception)((Object)e));
            }
        }
    }

    public static void fillTradeTypeInfo(AggregatedValueObject[] bills) {
        for (AggregatedValueObject bill : bills) {
            Integer src_syscode = (Integer)bill.getParentVO().getAttributeValue("src_syscode");
            if (src_syscode == null) continue;
            if (null == bill.getParentVO().getAttributeValue("pk_tradetype") && src_syscode.intValue() == BillEnumCollection.FromSystem.WSBX.VALUE.intValue()) {
                IPFBillItfDef itfDefService = (IPFBillItfDef)NCLocator.getInstance().lookup(IPFBillItfDef.class);
                BillItfDefVO defVO = new BillItfDefVO();
                defVO.setSrc_billtype("264X");
                defVO.setDest_billtype((String)bill.getParentVO().getAttributeValue("pk_billtype"));
                defVO.setPk_group((String)bill.getParentVO().getAttributeValue("pk_group"));
                try {
                    Object[] billItfDefVOs = itfDefService.getBillItfDef(defVO);
                    if (!ArrayUtils.isEmpty((Object[])billItfDefVOs)) {
                        bill.getParentVO().setAttributeValue("pk_tradetype", (Object)billItfDefVOs[0].getDest_transtype());
                    }
                }
                catch (BusinessException e) {
                    Log.getInstance((String)"ArapBillPubUtil").error((Object)e);
                }
            }
            if (src_syscode.intValue() == BillEnumCollection.FromSystem.CT.VALUE.intValue()) {
                String srctranstype = InvocationInfoProxy.getInstance().getProperty("Srctranstype");
                CircularlyAccessibleValueObject[] itfDefService = (CircularlyAccessibleValueObject[])NCLocator.getInstance().lookup(IPFBillItfDef.class);
                BillItfDefVO defVO = new BillItfDefVO();
                defVO.setSrc_billtype("Z2");
                defVO.setDest_billtype((String)bill.getParentVO().getAttributeValue("pk_billtype"));
                defVO.setPk_group((String)bill.getParentVO().getAttributeValue("pk_group"));
                String destTranstype = null;
                String top_billtype = (String)bill.getChildrenVO()[0].getAttributeValue("top_tradetype");
                try {
                    Object[] billItfDefVOs = itfDefService.getBillItfDef(defVO);
                    if (!ArrayUtils.isEmpty((Object[])billItfDefVOs)) {
                        for (Object vo : billItfDefVOs) {
                            if (srctranstype != null && srctranstype.equals(vo.getSrc_transtype())) {
                                destTranstype = vo.getDest_transtype();
                                continue;
                            }
                            if (top_billtype == null || !top_billtype.equals(vo.getSrc_transtype())) continue;
                            destTranstype = vo.getDest_transtype();
                        }
                        bill.getParentVO().setAttributeValue("pk_tradetype", destTranstype);
                    }
                }
                catch (BusinessException e) {
                    Log.getInstance((String)"ArapBillPubUtil").error((Object)e);
                }
            }
            String pk_tradetype = (String)bill.getParentVO().getAttributeValue("pk_tradetype");
            if (bill.getChildrenVO() != null && (StringUtils.isEmpty((CharSequence)pk_tradetype) || "~".equals(pk_tradetype))) {
                HashSet<String> childScomments = new HashSet<String>();
                for (CircularlyAccessibleValueObject item : bill.getChildrenVO()) {
                    pk_tradetype = (String)item.getAttributeValue("pk_tradetype");
                    if (StringUtils.isEmpty((CharSequence)pk_tradetype) || "~".equals(pk_tradetype)) continue;
                    childScomments.add(pk_tradetype);
                }
                Iterator iterator = childScomments.iterator();
                if (iterator.hasNext()) {
                    bill.getParentVO().setAttributeValue("pk_tradetype", iterator.next());
                }
            }
            if (bill.getParentVO().getAttributeValue("pk_tradetype") == null) {
                bill.getParentVO().setAttributeValue("pk_tradetype", (Object)ArapBillTypeInfo.getInstance(bill).getDefaultTransType());
            }
            if (null == bill.getParentVO().getAttributeValue("pk_tradetype")) continue;
            pk_tradetype = (String)bill.getParentVO().getAttributeValue("pk_tradetype");
            BilltypeVO billTypevo = PfDataCache.getBillType((String)pk_tradetype);
            if (billTypevo == null) {
                String pk_group = (String)bill.getParentVO().getAttributeValue("pk_group");
                billTypevo = PfDataCache.getBillTypeInfo((String)pk_group, (String)pk_tradetype);
            }
            bill.getParentVO().setAttributeValue("pk_tradetypeid", (Object)billTypevo.getPk_billtypeid());
            for (BaseItemVO vo : (BaseItemVO[])bill.getChildrenVO()) {
                vo.setAttributeValue2("pk_billtype", bill.getParentVO().getAttributeValue("pk_billtype").toString());
                vo.setAttributeValue2("pk_tradetype", pk_tradetype);
                vo.setAttributeValue2("pk_tradetypeid", billTypevo.getPk_billtypeid());
            }
        }
    }

    public static void fillTradeTypeInfo(AggregatedValueObject bill) {
        ArapBillPubUtil.fillTradeTypeInfo(new AggregatedValueObject[]{bill});
    }

    public static boolean isRedBill(AggregatedValueObject bill) {
        for (CircularlyAccessibleValueObject item : bill.getChildrenVO()) {
            if (null == item.getAttributeValue("top_billtype")) {
                return false;
            }
            if (!item.getAttributeValue("pk_billtype").equals(item.getAttributeValue("top_billtype"))) continue;
            return true;
        }
        return false;
    }

    public static void fillNeedFlds(AggregatedValueObject destVO) {
        BaseBillVO headvo;
        if (null == destVO.getParentVO().getAttributeValue("effectstatus")) {
            destVO.getParentVO().setAttributeValue("effectstatus", (Object)BillEnumCollection.InureSign.NOINURE.VALUE);
        }
        if (null == destVO.getParentVO().getAttributeValue("billstatus")) {
            destVO.getParentVO().setAttributeValue("billstatus", (Object)BillEnumCollection.BillSatus.SAVE.VALUE);
        }
        if ("F2".equals(destVO.getParentVO().getAttributeValue("pk_billtype")) || "F3".equals(destVO.getParentVO().getAttributeValue("pk_billtype"))) {
            for (CircularlyAccessibleValueObject item : destVO.getChildrenVO()) {
                if (null != item.getAttributeValue("prepay")) continue;
                item.setAttributeValue("prepay", (Object)BillEnumCollection.PreSigns.NOTPRE.VALUE);
            }
        }
        if ((headvo = (BaseBillVO)destVO.getParentVO()).getSyscode() == null || headvo.getSyscode().toString().trim().length() == 0 || headvo.getSrc_syscode() == 0) {
            if (ArapBillPubUtil.isARSysBilltype(headvo.getPk_billtype())) {
                headvo.setSyscode(BillEnumCollection.FromSystem.AR.VALUE);
            } else {
                headvo.setSyscode(BillEnumCollection.FromSystem.AP.VALUE);
            }
        }
    }

    public static void refreshChildVO2HeadVO(AggregatedValueObject ... aggVOs) {
        if (null == aggVOs || aggVOs.length == 0) {
            return;
        }
        HashSet<String> escape = new HashSet<String>();
        escape.add("rate");
        for (int i = 0; i < aggVOs.length; ++i) {
            Object rowtype;
            CircularlyAccessibleValueObject childVO;
            AggregatedValueObject aggVO = aggVOs[i];
            if (aggVO == null) continue;
            CircularlyAccessibleValueObject parentVO = aggVO.getParentVO();
            Object[] childrenVO = aggVO.getChildrenVO();
            CircularlyAccessibleValueObject circularlyAccessibleValueObject = childVO = null != childrenVO && childrenVO.length > 0 ? childrenVO[0] : null;
            if (childVO != null && (rowtype = (Integer)childVO.getAttributeValue("rowtype")) != null && (Integer)rowtype == 5) {
                CircularlyAccessibleValueObject circularlyAccessibleValueObject2 = childVO = null != childrenVO && childrenVO.length > 1 ? childrenVO[1] : null;
            }
            if (childVO != null) {
                rowtype = ArapBillPubUtil.getHTOBMap().entrySet().iterator();
                while (rowtype.hasNext()) {
                    Map.Entry entry = (Map.Entry)rowtype.next();
                    String headKey = (String)entry.getKey();
                    String bodyKey = (String)entry.getValue();
                    Object atrrValue = childVO.getAttributeValue(bodyKey);
                    if (atrrValue == null || StringUtils.isEmpty((CharSequence)atrrValue.toString())) continue;
                    parentVO.setAttributeValue(headKey, atrrValue);
                }
            }
            if (childrenVO == null) continue;
            UFDouble money = UFDouble.ZERO_DBL;
            UFDouble local_money = UFDouble.ZERO_DBL;
            UFDouble grouplocal = UFDouble.ZERO_DBL;
            UFDouble globallocal = UFDouble.ZERO_DBL;
            String subjcode = null;
            for (CircularlyAccessibleValueObject circularlyAccessibleValueObject3 : childrenVO) {
                UFDouble money_de = circularlyAccessibleValueObject3.getAttributeValue("money_de") == null ? UFDouble.ZERO_DBL : (UFDouble)circularlyAccessibleValueObject3.getAttributeValue("money_de");
                UFDouble money_cr = circularlyAccessibleValueObject3.getAttributeValue("money_cr") == null ? UFDouble.ZERO_DBL : (UFDouble)circularlyAccessibleValueObject3.getAttributeValue("money_cr");
                money = money.add(money_de.add(money_cr));
                UFDouble local_money_de = circularlyAccessibleValueObject3.getAttributeValue("local_money_de") == null ? UFDouble.ZERO_DBL : (UFDouble)circularlyAccessibleValueObject3.getAttributeValue("local_money_de");
                UFDouble local_money_cr = circularlyAccessibleValueObject3.getAttributeValue("local_money_cr") == null ? UFDouble.ZERO_DBL : (UFDouble)circularlyAccessibleValueObject3.getAttributeValue("local_money_cr");
                local_money = local_money.add(local_money_de.add(local_money_cr));
                UFDouble globaldebit = circularlyAccessibleValueObject3.getAttributeValue("globaldebit") == null ? UFDouble.ZERO_DBL : (UFDouble)circularlyAccessibleValueObject3.getAttributeValue("globaldebit");
                UFDouble globalcrebit = circularlyAccessibleValueObject3.getAttributeValue("globalcrebit") == null ? UFDouble.ZERO_DBL : (UFDouble)circularlyAccessibleValueObject3.getAttributeValue("globalcrebit");
                globallocal = globallocal.add(globaldebit.add(globalcrebit));
                UFDouble groupdebit = circularlyAccessibleValueObject3.getAttributeValue("groupdebit") == null ? UFDouble.ZERO_DBL : (UFDouble)circularlyAccessibleValueObject3.getAttributeValue("groupdebit");
                UFDouble groupcrebit = circularlyAccessibleValueObject3.getAttributeValue("groupcrebit") == null ? UFDouble.ZERO_DBL : (UFDouble)circularlyAccessibleValueObject3.getAttributeValue("groupcrebit");
                grouplocal = grouplocal.add(groupdebit.add(groupcrebit));
            }
            parentVO.setAttributeValue("money", (Object)money);
            parentVO.setAttributeValue("local_money", (Object)local_money);
            parentVO.setAttributeValue("grouplocal", (Object)grouplocal);
            parentVO.setAttributeValue("globallocal", (Object)globallocal);
            if (!ArrayUtils.isEmpty((Object[])childrenVO)) {
                subjcode = (String)childrenVO[0].getAttributeValue("subjcode");
            }
            if (subjcode == null) continue;
            parentVO.setAttributeValue("subjcode", subjcode);
        }
    }

    private static Map<String, String> getHTOBMap() {
        if (htobMap == null) {
            htobMap = new ArapH2BMapping().getHTOBMap();
        }
        return htobMap;
    }

    public static void checkFinanceOrgEnable(AggregatedValueObject[] bills) {
        String[] financeogIDs = new String[bills.length];
        int i = 0;
        for (AggregatedValueObject bill : bills) {
            financeogIDs[i] = ((BaseAggVO)bill).getHeadVO().getPk_org();
            ++i;
        }
        FinanceOrgVO[] financeOrgVOs = null;
        try {
            HashSet<String> set = new HashSet<String>(Arrays.asList(financeogIDs));
            financeOrgVOs = ((IFinanceOrgQryService)NCLocator.getInstance().lookup(IFinanceOrgQryService.class)).getFinanceOrgVOs(set.toArray(new String[0]));
            if (null == financeOrgVOs) {
                ExceptionHandler.createAndThrowException((String)NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0277"));
            }
            if (set.size() != financeOrgVOs.length) {
                ExceptionHandler.createAndThrowException((String)NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0523_0", "02006arappub0523-0015"));
            } else {
                for (FinanceOrgVO financeOrgVO : financeOrgVOs) {
                    if (2 == financeOrgVO.getEnablestate()) continue;
                    ExceptionHandler.createAndThrowException((String)(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0523_0", "02006arappub0523-0016") + financeOrgVO.getName() + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0523_0", "02006arappub0523-0017")));
                }
            }
        }
        catch (BusinessException e) {
            ExceptionHandler.handleRuntimeException((Exception)((Object)e));
        }
    }

    public static AggregatedValueObject[] resetDestVODoc(AggregatedValueObject[] destVOs) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])destVOs)) {
            return destVOs;
        }
        BaseAggVO billVo = (BaseAggVO)destVOs[0];
        String pk_group = billVo.getHeadVO().getPk_group();
        UserdefitemVO[] buserdefitemVOs = null;
        UserdefitemVO[] tuserdefitemVOs = null;
        try {
            buserdefitemVOs = ((IUserdefitemQryService)NCLocator.getInstance().lookup(IUserdefitemQryService.class)).queryUserdefitemVOsByUserdefruleCode("ARAP_B", pk_group);
            tuserdefitemVOs = ((IUserdefitemQryService)NCLocator.getInstance().lookup(IUserdefitemQryService.class)).queryUserdefitemVOsByUserdefruleCode("ARAP_H", pk_group);
        }
        catch (BusinessException e) {
            ExceptionHandler.handleRuntimeException((Exception)((Object)e));
        }
        HashMap orgMap = new HashMap();
        for (AggregatedValueObject destVo : destVOs) {
            String pk_org = ((BaseAggVO)destVo).getHeadVO().getPk_org();
            if (orgMap.get(pk_org) == null) {
                orgMap.put(pk_org, new ArrayList());
            }
            ((List)orgMap.get(pk_org)).add(destVo);
        }
        for (String pk_org : orgMap.keySet()) {
            if (tuserdefitemVOs != null && tuserdefitemVOs.length > 0) {
                ArapBillPubUtil.setDefDoc(tuserdefitemVOs, (List)orgMap.get(pk_org), pk_org, pk_group, 0);
            }
            if (buserdefitemVOs != null && buserdefitemVOs.length > 0) {
                ArapBillPubUtil.setDefDoc(buserdefitemVOs, (List)orgMap.get(pk_org), pk_org, pk_group, 1);
            }
            ArapBillPubUtil.resetRecpaytype((List)orgMap.get(pk_org), pk_org, pk_group, "pk_recpaytype", 1);
            ArapBillPubUtil.resetSupplies((List)orgMap.get(pk_org), pk_org, pk_group, "supplier", 2);
            ArapBillPubUtil.resetCustomers((List)orgMap.get(pk_org), pk_org, pk_group, "customer", 2);
            ArapBillPubUtil.resetCustomers((List)orgMap.get(pk_org), pk_org, pk_group, "ordercubasdoc", 2);
        }
        return destVOs;
    }

    public static void resetRecpaytype(List<AggregatedValueObject> voList, String pk_org, String pk_group, String defField, int isHeadDef) {
        List<String> pksList = ArapBillPubUtil.getPksLists(voList, defField, isHeadDef);
        if (pksList != null && pksList.size() > 0) {
            String[] pks = pksList.toArray(new String[pksList.size()]);
            RecpaytypeVO[] result = null;
            ArrayList<String> list = new ArrayList<String>();
            try {
                result = ((IRecpaytypeQueryService)NCLocator.getInstance().lookup(IRecpaytypeQueryService.class)).queryRecpaytype(" dr=0 and " + SqlUtils.getInStr("pk_recpaytype", pks, true));
                if (result != null) {
                    for (RecpaytypeVO vo : result) {
                        list.add(vo.getPk_recpaytype());
                    }
                }
                ArapBillPubUtil.resetDocValue(voList, defField, 1, list);
                List<String> pksListNew = ArapBillPubUtil.getPksLists(voList, defField, isHeadDef);
                if (pksList.size() != pksListNew.size()) {
                    throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0886"));
                }
            }
            catch (Exception e) {
                ExceptionHandler.handleRuntimeException((Exception)e);
            }
        }
    }

    public static void setDefDoc(UserdefitemVO[] userdefitemVOs, List<AggregatedValueObject> voList, String pk_org, String pk_group, int isHeadDef) throws BusinessException {
        ArrayList<String> pksList = new ArrayList<String>(userdefitemVOs.length);
        for (UserdefitemVO buserdefitemVO : userdefitemVOs) {
            pksList.add(buserdefitemVO.getClassid());
        }
        Map<String, String> map = null;
        try {
            map = ((IArapBillPubQueryService)NCLocator.getInstance().lookup(IArapBillPubQueryService.class)).getClassMap(pksList);
        }
        catch (BusinessException e) {
            ExceptionHandler.handleRuntimeException((Exception)((Object)e));
        }
        if (userdefitemVOs != null && userdefitemVOs.length > 0 && map != null && map.entrySet() != null && map.entrySet().size() > 0) {
            block3: for (UserdefitemVO buserdefitemVO : userdefitemVOs) {
                for (Map.Entry<String, String> businessEntity : map.entrySet()) {
                    if (!buserdefitemVO.getClassid().equals(businessEntity.getKey())) continue;
                    if (businessEntity.getValue() == null || "".equals(businessEntity.getValue()) || !BD_DEFDOC.equals(businessEntity.getValue())) continue block3;
                    ArapBillPubUtil.resetBaseDefDoc(voList, pk_org, pk_group, DOC + buserdefitemVO.getPropindex(), isHeadDef);
                    continue block3;
                }
            }
        }
    }

    public static void resetBaseDefDoc(List<AggregatedValueObject> voList, String pk_org, String pk_group, String defField, int isHeadDef) throws BusinessException {
        List<String> pksList = ArapBillPubUtil.getPksLists(voList, defField, isHeadDef);
        if (pksList != null && pksList.size() > 0) {
            String condition = " AND ( (PK_ORG ='" + pk_org + "' AND PK_GROUP ='" + pk_group + "' ) OR (PK_ORG ='" + pk_group + "' AND PK_GROUP ='" + pk_group + "') OR PK_ORG = 'GLOBLE00000000000000')";
            String sql = SqlUtils.getInStr("PK_DEFDOC", pksList.toArray(new String[pksList.size()])) + condition;
            ArrayList<String> list = new ArrayList<String>();
            try {
                Collection defdocVOs = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByCond(DefdocVO.class, sql, false);
                for (DefdocVO defdocVO : defdocVOs) {
                    list.add(defdocVO.getPk_defdoc());
                }
                ArapBillPubUtil.resetDocValue(voList, defField, isHeadDef, list);
            }
            catch (MetaDataException e) {
                ExceptionHandler.handleRuntimeException((Exception)((Object)e));
            }
        }
    }

    public static void resetDept(List<AggregatedValueObject> voList, String pk_org, String pk_group, String defField, int isHeadDef) throws BusinessException {
        List<String> pksList = ArapBillPubUtil.getPksLists(voList, defField, isHeadDef);
        if (pksList != null && pksList.size() > 0) {
            String[] pks = pksList.toArray(new String[pksList.size()]);
            String condition = " AND ( (PK_ORG ='" + pk_org + "' AND PK_GROUP ='" + pk_group + "' ) OR (PK_ORG ='" + pk_group + "' AND PK_GROUP ='" + pk_group + "') OR PK_ORG = 'GLOBLE00000000000000')";
            String sql = SqlUtils.getInStr("PK_VID", pks) + condition;
            ArrayList<String> list = new ArrayList<String>();
            try {
                Collection deptVOs = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByCond(DeptVO.class, sql, false);
                for (DeptVO deptVO : deptVOs) {
                    if (null != deptVO.getPk_dept()) {
                        list.add(deptVO.getPk_dept());
                    }
                    list.add(deptVO.getPk_vid());
                }
                ArapBillPubUtil.resetDocValue(voList, defField, isHeadDef, list);
                if ("pk_deptid_v".equals(defField)) {
                    ArapBillPubUtil.resetDocValue(voList, "pk_deptid", isHeadDef, list);
                }
            }
            catch (MetaDataException e) {
                ExceptionHandler.handleRuntimeException((Exception)((Object)e));
            }
        }
    }

    public static void resetPsndoc(List<AggregatedValueObject> voList, String pk_org, String pk_group, String defField, int isHeadDef) throws BusinessException {
        List<String> pksList = ArapBillPubUtil.getPksLists(voList, defField, isHeadDef);
        if (pksList != null && pksList.size() > 0) {
            String[] pks = pksList.toArray(new String[pksList.size()]);
            StringBuffer psnDocSql = new StringBuffer("SELECT BD_PSNDOC.");
            psnDocSql.append("pk_psndoc");
            psnDocSql.append(" FROM BD_PSNDOC LEFT JOIN BD_PSNJOB ON BD_PSNDOC.PK_PSNDOC = BD_PSNJOB.PK_PSNDOC WHERE ");
            String condition = " AND ( (BD_PSNDOC.PK_ORG ='" + pk_org + "' AND BD_PSNDOC.PK_GROUP ='" + pk_group + "' ) OR (BD_PSNDOC.PK_ORG ='" + pk_group + "' AND BD_PSNDOC.PK_GROUP ='" + pk_group + "') OR BD_PSNDOC.PK_ORG = 'GLOBLE00000000000000' OR BD_PSNJOB.PK_ORG = '" + pk_org + "')";
            String sql = SqlUtils.getInStr("BD_PSNDOC.PK_PSNDOC", pks) + condition;
            psnDocSql.append(sql);
            try {
                List list = (List)new BaseDAO().executeQuery(psnDocSql.toString(), (ResultSetProcessor)new BaseProcessor(){
                    private static final long serialVersionUID = 1L;
                    private List<String> resultList = new ArrayList<String>();

                    public Object processResultSet(ResultSet rs) throws SQLException {
                        while (rs.next()) {
                            this.resultList.add(rs.getString(1));
                        }
                        return this.resultList;
                    }
                });
                ArapBillPubUtil.resetDocValue(voList, defField, isHeadDef, list);
            }
            catch (DAOException e) {
                ExceptionHandler.handleRuntimeException((Exception)((Object)e));
            }
        }
    }

    public static void resetFundPlan(List<AggregatedValueObject> voList, String pk_org, String pk_group, String defField, int isHeadDef) {
        List<String> pksList = ArapBillPubUtil.getPksLists(voList, defField, isHeadDef);
        if (pksList != null && pksList.size() > 0) {
            String[] pks = pksList.toArray(new String[pksList.size()]);
            String[] result = null;
            ArrayList<String> list = new ArrayList<String>();
            try {
                result = ((IFundPlanPubService)NCLocator.getInstance().lookup(IFundPlanPubService.class)).queryFundPlanPkByCondition(pks, pk_group, pk_org);
                if (result != null) {
                    list = new ArrayList<String>(Arrays.asList(result));
                }
                ArapBillPubUtil.resetDocValue(voList, defField, 1, list);
            }
            catch (BusinessException e) {
                ExceptionHandler.handleRuntimeException((Exception)((Object)e));
            }
        }
    }

    public static void resetCashflow(List<AggregatedValueObject> voList, String pk_org, String pk_group, String defField, int isHeadDef) {
        List<String> pksList = ArapBillPubUtil.getPksLists(voList, defField, isHeadDef);
        if (pksList != null && pksList.size() > 0) {
            String[] pks = pksList.toArray(new String[pksList.size()]);
            String[] result = null;
            ArrayList<String> list = new ArrayList<String>();
            try {
                result = ((ICashflowPubService)NCLocator.getInstance().lookup(ICashflowPubService.class)).queryCashFlowPkByCondition(pks, pk_group, pk_org);
                if (result != null) {
                    list = new ArrayList<String>(Arrays.asList(result));
                }
                ArapBillPubUtil.resetDocValue(voList, defField, isHeadDef, list);
            }
            catch (BusinessException e) {
                ExceptionHandler.handleRuntimeException((Exception)((Object)e));
            }
        }
    }

    public static void resetInoutBusiClass(List<AggregatedValueObject> voList, String pk_org, String pk_group, String defField, int isHeadDef) {
        List<String> pksList = ArapBillPubUtil.getPksLists(voList, defField, isHeadDef);
        if (pksList != null && pksList.size() > 0) {
            String[] pks = pksList.toArray(new String[pksList.size()]);
            String[] result = null;
            ArrayList<String> list = new ArrayList<String>();
            if (pk_group == null) {
                pk_group = "";
            }
            try {
                result = ((IInoutBusiClassPubService)NCLocator.getInstance().lookup(IInoutBusiClassPubService.class)).queryInoutBusiClassPkByCondition(pks, pk_group, pk_org);
                if (result != null) {
                    list = new ArrayList<String>(Arrays.asList(result));
                }
                ArapBillPubUtil.resetDocValue(voList, defField, isHeadDef, list);
            }
            catch (BusinessException e) {
                ExceptionHandler.handleRuntimeException((Exception)((Object)e));
            }
        }
    }

    public static void resetCustomers(List<AggregatedValueObject> voList, String pk_org, String pk_group, String defField, int isHeadDef) throws BusinessException {
        List<String> pksList = ArapBillPubUtil.getPksLists(voList, defField, isHeadDef);
        if (pksList != null && pksList.size() > 0) {
            String condition = BDVisibleUtil.getRefVisibleCondition((String)pk_group, (String)pk_org, (String)"e4f48eaf-5567-4383-a370-a59cb3e8a451", (boolean)false);
            String sql = SqlUtils.getInStr("PK_CUSTOMER", pksList.toArray(new String[pksList.size()])) + " and " + condition;
            ArrayList<String> list = new ArrayList<String>();
            try {
                Collection customerOrgVOs = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByCond(CustomerVO.class, sql, false);
                for (CustomerVO customerOrgVO : customerOrgVOs) {
                    list.add(customerOrgVO.getPk_customer());
                }
                ArapBillPubUtil.resetDocValue(voList, defField, isHeadDef, list);
            }
            catch (MetaDataException e) {
                ExceptionHandler.handleRuntimeException((Exception)((Object)e));
            }
        }
    }

    public static void resetSupplies(List<AggregatedValueObject> voList, String pk_org, String pk_group, String defField, int isHeadDef) throws BusinessException {
        List<String> pksList = ArapBillPubUtil.getPksLists(voList, defField, isHeadDef);
        if (pksList != null && pksList.size() > 0) {
            String condition = BDVisibleUtil.getRefVisibleCondition((String)pk_group, (String)pk_org, (String)"720dcc7c-ff19-48f4-b9c5-b90906682f45", (boolean)false);
            String sql = SqlUtils.getInStr("PK_SUPPLIER", pksList.toArray(new String[pksList.size()])) + " and " + condition;
            ArrayList<String> list = new ArrayList<String>();
            try {
                StringBuffer fileter_sql = new StringBuffer();
                fileter_sql.append(" pk_supplier in (select pk_supplier from (select pk_supplier from bd_supplier where ").append(sql).append(" ) a where ").append(SqlUtils.getInStr("a.PK_SUPPLIER", pksList.toArray(new String[pksList.size()]))).append(" ) ");
                Collection supplierOrgVOs = new BaseDAO().retrieveByClause(SupplierVO.class, fileter_sql.toString(), new String[]{"pk_supplier", "pk_supplier_v"});
                for (SupplierVO supplierorgvo : supplierOrgVOs) {
                    list.add(supplierorgvo.getPk_supplier());
                }
                ArapBillPubUtil.resetDocValue(voList, defField, isHeadDef, list);
            }
            catch (MetaDataException e) {
                ExceptionHandler.handleRuntimeException((Exception)((Object)e));
            }
        }
    }

    public static List<String> getPksLists(List<AggregatedValueObject> voList, String defField, int flag) {
        ArrayList<String> pksList;
        block7: {
            block8: {
                block6: {
                    pksList = new ArrayList<String>();
                    if (flag != 0) break block6;
                    for (AggregatedValueObject vo : voList) {
                        BaseAggVO bill = (BaseAggVO)vo;
                        if (nc.vo.jcom.lang.StringUtil.isEmpty((String)((String)bill.getHeadVO().getAttributeValue(defField))) || pksList.contains(bill.getHeadVO().getAttributeValue(defField))) continue;
                        pksList.add((String)bill.getHeadVO().getAttributeValue(defField));
                    }
                    break block7;
                }
                if (flag != 1) break block8;
                for (AggregatedValueObject vo : voList) {
                    BaseAggVO bill = (BaseAggVO)vo;
                    for (BaseItemVO itemVo : bill.getItems()) {
                        if (StringUtil.isEmpty((String)itemVo.getAttributeValue(defField)) || pksList.contains(itemVo.getAttributeValue(defField))) continue;
                        pksList.add((String)itemVo.getAttributeValue(defField));
                    }
                }
                break block7;
            }
            if (flag != 2) break block7;
            for (AggregatedValueObject vo : voList) {
                BaseAggVO bill = (BaseAggVO)vo;
                if (!nc.vo.jcom.lang.StringUtil.isEmpty((String)((String)bill.getHeadVO().getAttributeValue(defField))) && !pksList.contains(bill.getHeadVO().getAttributeValue(defField))) {
                    pksList.add((String)bill.getHeadVO().getAttributeValue(defField));
                }
                for (BaseItemVO itemVo : bill.getItems()) {
                    if (StringUtil.isEmpty((String)itemVo.getAttributeValue(defField)) || pksList.contains(itemVo.getAttributeValue(defField))) continue;
                    pksList.add((String)itemVo.getAttributeValue(defField));
                }
            }
        }
        return pksList;
    }

    public static void resetDocValue(List<AggregatedValueObject> voList, String defField, int flag, List<String> list) {
        block16: {
            block17: {
                block15: {
                    if (flag != 0) break block15;
                    for (AggregatedValueObject vo : voList) {
                        BaseBillVO bill = ((BaseAggVO)vo).getHeadVO();
                        if (nc.vo.jcom.lang.StringUtil.isEmpty((String)((String)bill.getAttributeValue(defField))) || list.contains(bill.getAttributeValue(defField))) continue;
                        bill.setAttributeValue(defField, null);
                        if (defField.contains("supplier")) {
                            bill.setAttributeValue("supplier", null);
                        }
                        if (defField.contains("customer")) {
                            bill.setAttributeValue("customer_v", null);
                        }
                        if (!defField.contains("ordercubasdoc")) continue;
                        bill.setAttributeValue("ordercubasdoc_v", null);
                    }
                    break block16;
                }
                if (flag != 1) break block17;
                for (AggregatedValueObject vo : voList) {
                    BaseAggVO bill = (BaseAggVO)vo;
                    for (BaseItemVO itemVo : bill.getItems()) {
                        if (StringUtil.isEmpty((String)itemVo.getAttributeValue(defField)) || list.contains(itemVo.getAttributeValue(defField))) continue;
                        itemVo.setAttributeValue(defField, null);
                        if (defField.contains("supplier")) {
                            itemVo.setAttributeValue("supplier", null);
                        }
                        if (defField.contains("customer")) {
                            itemVo.setAttributeValue("customer_v", null);
                        }
                        if (!defField.contains("ordercubasdoc")) continue;
                        itemVo.setAttributeValue("ordercubasdoc_v", null);
                    }
                }
                break block16;
            }
            if (flag != 2) break block16;
            for (AggregatedValueObject vo : voList) {
                BaseAggVO bill = (BaseAggVO)vo;
                if (!nc.vo.jcom.lang.StringUtil.isEmpty((String)((String)bill.getHeadVO().getAttributeValue(defField))) && !list.contains(bill.getHeadVO().getAttributeValue(defField))) {
                    bill.getHeadVO().setAttributeValue(defField, null);
                    if (defField.contains("supplier")) {
                        bill.getHeadVO().setAttributeValue("supplier", null);
                    }
                    if (defField.contains("customer")) {
                        bill.getHeadVO().setAttributeValue("customer_v", null);
                    }
                    if (defField.contains("ordercubasdoc")) {
                        bill.getHeadVO().setAttributeValue("ordercubasdoc_v", null);
                    }
                }
                for (BaseItemVO itemVo : bill.getItems()) {
                    if (StringUtil.isEmpty((String)itemVo.getAttributeValue(defField)) || list.contains(itemVo.getAttributeValue(defField))) continue;
                    itemVo.setAttributeValue(defField, null);
                    if (defField.contains("supplier")) {
                        itemVo.setAttributeValue("supplier", null);
                    }
                    if (defField.contains("customer")) {
                        itemVo.setAttributeValue("customer_v", null);
                    }
                    if (!defField.contains("ordercubasdoc")) continue;
                    itemVo.setAttributeValue("ordercubasdoc_v", null);
                }
            }
        }
    }

    public static void checkSupplierAndrecaccount(Map<String, String> supplierMap, Map<String, String> recaccountMap) throws BusinessException {
        if (supplierMap.isEmpty()) {
            return;
        }
        Set<String> supplierPKs = supplierMap.keySet();
        SupplierVO[] supplierInfo = ArapBillPubUtil.getSupplierInfo(supplierPKs.toArray(new String[0]));
        if (supplierInfo == null) {
            Logger.error((Object)"can not find any supplier info!");
        } else if (supplierInfo.length != supplierPKs.size()) {
            for (SupplierVO info : supplierInfo) {
                if (info == null) continue;
                supplierMap.remove(info.getPk_supplier());
            }
        } else {
            supplierMap.clear();
        }
        if (!supplierMap.isEmpty()) {
            ArrayList<String> errorSup = new ArrayList<String>();
            for (Map.Entry<String, String> entry : supplierMap.entrySet()) {
                errorSup.add(entry.getValue());
            }
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0523_0", "02006arappub0523-0057", null, errorSup.toArray(new String[0])));
        }
        if (!recaccountMap.isEmpty()) {
            Set<String> recAccPKs = recaccountMap.keySet();
            String[] recaccountInfo = ArapBillPubUtil.getrecaccountInfo(recAccPKs.toArray(new String[0]));
            if (recaccountInfo == null) {
                Logger.error((Object)"can not find any receivable account!");
            } else if (recaccountInfo.length != recAccPKs.size()) {
                for (String info : recaccountInfo) {
                    if (info == null) continue;
                    recaccountMap.remove(info);
                }
            } else {
                recaccountMap.clear();
            }
            if (!recaccountMap.isEmpty()) {
                ArrayList<String> errorSup = new ArrayList<String>();
                for (Map.Entry<String, String> entry : recaccountMap.entrySet()) {
                    if (nc.vo.jcom.lang.StringUtil.isEmpty((String)entry.getKey()) || nc.vo.jcom.lang.StringUtil.isEmpty((String)entry.getValue())) continue;
                    errorSup.add(entry.getValue());
                }
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0523_0", "02006arappub0523-0062", null, errorSup.toArray(new String[0])));
            }
        }
    }

    public static String[] getrecaccountInfo(String[] pk_recaccount) throws BusinessException {
        ArrayList<Object> returnPK;
        block4: {
            block3: {
                returnPK = new ArrayList<Object>();
                if (null == pk_recaccount) {
                    return null;
                }
                Map queryBankAccSubByPkMap = ((IBankaccPubQueryService)NCLocator.getInstance().lookup(IBankaccPubQueryService.class)).queryBankAccSubByPk(new String[]{"PK_BANKACCSUB", "PK_BANKACCBAS"}, pk_recaccount);
                if (queryBankAccSubByPkMap == null || queryBankAccSubByPkMap.isEmpty()) break block3;
                Set entrySet = queryBankAccSubByPkMap.entrySet();
                for (Map.Entry entry : entrySet) {
                    if (entry.getValue() == null) continue;
                    returnPK.add(entry.getKey());
                }
                break block4;
            }
            Object[] queryBankaccsByPks = ((IBankaccPubQueryService)NCLocator.getInstance().lookup(IBankaccPubQueryService.class)).queryBankaccsByPks(pk_recaccount);
            if (ArrayUtils.isEmpty((Object[])queryBankaccsByPks)) break block4;
            for (Object vo : queryBankaccsByPks) {
                returnPK.add(vo.getPk_bankaccbas());
            }
        }
        return returnPK.toArray(new String[0]);
    }

    public static SupplierVO[] getSupplierInfo(String[] pk_supplier) throws BusinessException {
        if (null == pk_supplier) {
            return null;
        }
        return ((ISupplierPubService)NCLocator.getInstance().lookup(ISupplierPubService.class)).getSupplierVO(pk_supplier, new String[]{"name", "pk_supplier"});
    }

    public static void setBillCodes(AggregatedValueObject[] bills) throws BusinessException {
        String pk_billtype = (String)bills[0].getParentVO().getAttributeValue("pk_billtype");
        String pk_org = (String)bills[0].getParentVO().getAttributeValue("pk_org");
        String pk_group = (String)bills[0].getParentVO().getAttributeValue("pk_group");
        boolean isenabletranstypebcr = ArapBillPubUtil.getIsenabletranstypebcr(bills);
        boolean isenablebillcodeTranstype = ArapBillPubUtil.getenablebillcodeTranstype(bills);
        if (isenabletranstypebcr && isenablebillcodeTranstype) {
            ArapBillPubUtil.getBillCodeTypeUtil(bills).createBillCode(bills);
        } else {
            ArapBillPubUtil.getBillCodeUtil(bills).createBillCode(bills);
        }
        IBillcodeManage billCodeManager = (IBillcodeManage)NCLocator.getInstance().lookup(IBillcodeManage.class);
        BillCodeContext codeContext = billCodeManager.getBillCodeContext(pk_billtype, pk_group, pk_org);
        if (codeContext != null && "g".equals(codeContext.getUniquescope())) {
            ArapBillPubUtil.checkBillCode(bills, null, pk_group, isenabletranstypebcr, billCodeManager);
        } else if (codeContext != null && "o".equals(codeContext.getUniquescope())) {
            ArapBillPubUtil.checkBillCode(bills, pk_org, null, isenabletranstypebcr, billCodeManager);
        } else {
            ArapBillPubUtil.checkBillCode(bills, null, null, isenabletranstypebcr, billCodeManager);
        }
    }

    public static void setBadBillCodes(AggregatedValueObject[] bills) throws BusinessException {
        String pk_billtype = (String)bills[0].getParentVO().getAttributeValue("pk_billtype");
        String pk_org = (String)bills[0].getParentVO().getAttributeValue("pk_org");
        String pk_group = (String)bills[0].getParentVO().getAttributeValue("pk_group");
        boolean isenabletranstypebcr = false;
        ArapBillPubUtil.getBillCodeUtil(bills).createBillCode(bills);
        IBillcodeManage billCodeManager = (IBillcodeManage)NCLocator.getInstance().lookup(IBillcodeManage.class);
        BillCodeContext codeContext = billCodeManager.getBillCodeContext(pk_billtype, pk_group, pk_org);
        if ("g".equals(codeContext.getUniquescope())) {
            ArapBillPubUtil.checkBillCode(bills, null, pk_group, isenabletranstypebcr, billCodeManager);
        } else if ("o".equals(codeContext.getUniquescope())) {
            ArapBillPubUtil.checkBillCode(bills, pk_org, null, isenabletranstypebcr, billCodeManager);
        } else {
            ArapBillPubUtil.checkBillCode(bills, null, null, isenabletranstypebcr, billCodeManager);
        }
    }

    private static void checkBillCode(AggregatedValueObject[] bills, String pk_org, String pk_group, boolean isenabletranstypebcr, IBillcodeManage billCodeManager) throws BusinessException {
        String billno = "billno";
        String pk_billtype = (String)bills[0].getParentVO().getAttributeValue("pk_billtype");
        String tableName = ArapBillType2TableMapping.getParentTable(pk_billtype);
        if (tableName == null) {
            return;
        }
        int length = bills.length;
        String[] billCodes = new String[length];
        for (int i = 0; i < length; ++i) {
            billCodes[i] = bills[i].getParentVO().getAttributeValue(billno).toString();
        }
        BaseDAO dao = new BaseDAO();
        SqlBuilder builder = new SqlBuilder();
        builder.append("select DISTINCT a.");
        builder.append(billno);
        builder.append(" from ");
        builder.append(tableName);
        builder.append(" a where a.dr = 0 and ");
        builder.append(billno, billCodes);
        if (null != pk_group) {
            builder.append(" and a.pk_group = '" + pk_group + "' ");
        } else if (null != pk_org) {
            builder.append(" and a.pk_org = '" + pk_org + "' ");
        }
        builder.append(" group by a.");
        builder.append(billno);
        List codes = new ArrayList();
        try {
            codes = (List)dao.executeQuery(builder.toString(), (ResultSetProcessor)new ColumnListProcessor());
        }
        catch (DAOException e) {
            ExceptionHandler.consume((Throwable)e);
        }
        if (codes.size() > 0) {
            for (String billcode : codes) {
                billCodeManager.AbandonBillCode_RequiresNew(pk_billtype, pk_group, pk_org, billcode);
            }
            for (AggregatedValueObject bill : bills) {
                if (!codes.contains(bill.getParentVO().getAttributeValue(billno).toString())) continue;
                bill.getParentVO().setAttributeValue(billno, null);
            }
            if (isenabletranstypebcr) {
                ArapBillPubUtil.getBillCodeTypeUtil(bills).createBillCode(bills);
            } else {
                ArapBillPubUtil.getBillCodeUtil(bills).createBillCode(bills);
            }
            ArapBillPubUtil.checkBillCode(bills, pk_org, pk_group, isenabletranstypebcr, billCodeManager);
        }
    }

    public static boolean getenablebillcodeTranstype(AggregatedValueObject[] bills) throws BusinessException {
        String pk_tradetype = (String)bills[0].getParentVO().getAttributeValue("pk_tradetype");
        SqlBuilder sql = new SqlBuilder();
        sql.append("select billcoderule from bd_billtype where pk_billtypecode = '" + pk_tradetype + "' and isnull(billcoderule,'~')<>'~' ");
        String[] strs = ArapBillPubUtil.getSqlResult(sql.toString());
        return strs != null && (strs == null || strs.length != 0);
    }

    public static boolean getIsenabletranstypebcr(AggregatedValueObject[] bills) throws BusinessException {
        AbstractBill superVO = (AbstractBill)bills[0];
        String pk_billType = ((BaseAggVO)superVO).getHeadVO().getPk_billtype();
        if (pk_billType == null || pk_billType.isEmpty()) {
            return false;
        }
        SqlBuilder sql = new SqlBuilder();
        sql.append("select isenabletranstypebcr from bd_billtype where pk_billtypecode = '" + pk_billType + "'");
        String[] strs = ArapBillPubUtil.getSqlResult(sql.toString());
        if (strs == null || strs != null && strs.length == 0) {
            return false;
        }
        if (strs[0] == null) {
            return false;
        }
        return strs[0].equals("Y");
    }

    private static String[] getSqlResult(String sql) throws BusinessException {
        DataAccessUtils util = new DataAccessUtils();
        IRowSet set = util.query(sql.toString());
        if (set == null) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0970"));
        }
        String[] strs = set.toOneDimensionStringArray();
        return strs;
    }

    public static AggregatedValueObject dealRefundBillBeforeChange(AggregatedValueObject bill) throws BusinessException {
        BaseBillVO parentVO = (BaseBillVO)bill.getParentVO();
        String pk_billtype = parentVO.getPk_billtype();
        Object[] items = (BaseItemVO[])bill.getChildrenVO();
        if ("F0".equals(pk_billtype)) {
            for (int i = 0; i < items.length; ++i) {
                if (((BaseItemVO)items[i]).getOccupationmny().compareTo((Object)UFDouble.ZERO_DBL) < 0) continue;
                items = (BaseItemVO[])ArrayUtils.remove((Object[])items, (int)i);
                --i;
            }
        } else if ("F2".equals(pk_billtype)) {
            for (int i = 0; i < items.length; ++i) {
                if (((BaseItemVO)items[i]).getOccupationmny().compareTo((Object)UFDouble.ZERO_DBL) > 0) continue;
                items = (BaseItemVO[])ArrayUtils.remove((Object[])items, (int)i);
                --i;
            }
        }
        if (ArrayUtils.isEmpty((Object[])items)) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006ver_0", "02006ver-0432"));
        }
        bill.setChildrenVO((CircularlyAccessibleValueObject[])items);
        ArapBillPubUtil.refreshChildVO2HeadVO(bill);
        return bill;
    }

    public static AggregatedValueObject dealRefundBillAfterChange(AggregatedValueObject srcVO, AggregatedValueObject destVO) throws BusinessException {
        block10: {
            String top_billtype;
            BaseItemVO[] items;
            String pk_billtype;
            String[] itemMnyKeys;
            String[] itemQuantityKeys;
            block9: {
                itemQuantityKeys = new String[]{"quantity_de", "quantity_cr", "quantity_bal"};
                itemMnyKeys = new String[]{"money_de", "local_money_de", "local_money_cr", "money_cr", "money_bal", "local_money_bal", "local_tax_de", "notax_de", "local_notax_de", "local_tax_cr", "notax_cr", "local_notax_cr", "groupbalance", "globalbalance", "groupdebit", "globaldebit", "grouptax_de", "globaltax_de", "groupnotax_de", "globalnotax_de", "groupcrebit", "globalcrebit", "grouptax_cre", "globaltax_cre", "groupnotax_cre", "globalnotax_cre", "occupationmny", "caltaxmny", "nosubtax"};
                pk_billtype = (String)destVO.getParentVO().getAttributeValue("pk_billtype");
                items = (BaseItemVO[])destVO.getChildrenVO();
                top_billtype = items[0].getTop_billtype();
                String top_billid = items[0].getTop_billid();
                if (!"F1".equals(pk_billtype) || !"F0".equals(top_billtype)) break block9;
                if (!StringUtils.isNotBlank((CharSequence)top_billtype) || !StringUtils.isNotBlank((CharSequence)top_billid)) break block10;
                BaseAggVO[] topbills = ((IArapBillService)NCLocator.getInstance().lookup(IArapBillService.class)).queryArapBillByPKs(new String[]{top_billid}, top_billtype);
                CircularlyAccessibleValueObject[] childrenVO = topbills[0].getChildrenVO();
                HashMap<String, UFDouble> pk_occupationmny = new HashMap<String, UFDouble>();
                for (int i = 0; i < childrenVO.length; ++i) {
                    String primaryKey = childrenVO[i].getPrimaryKey();
                    UFDouble occupationmny = (UFDouble)childrenVO[i].getAttributeValue("occupationmny");
                    if ("F1".equals(pk_billtype) && "F0".equals(top_billtype)) {
                        pk_occupationmny.put(primaryKey, occupationmny.multiply(new UFDouble("-1")));
                        continue;
                    }
                    pk_occupationmny.put(primaryKey, occupationmny);
                }
                for (BaseItemVO item : items) {
                    String top_itemid = item.getTop_itemid();
                    if (!pk_occupationmny.containsKey(top_itemid)) continue;
                    item.setMoney_cr((UFDouble)pk_occupationmny.get(top_itemid));
                    item.setMoney_bal((UFDouble)pk_occupationmny.get(top_itemid));
                }
                break block10;
            }
            if ("F2".equals(pk_billtype) && "F3".equals(top_billtype)) {
                UFDouble NEGATIVE = new UFDouble("-1");
                UFDouble ZERO = new UFDouble("0");
                for (int i = 0; i < items.length; ++i) {
                    UFDouble value;
                    for (String key : itemQuantityKeys) {
                        value = (UFDouble)items[i].getAttributeValue(key);
                        if (null == value || value.equals((Object)ZERO)) continue;
                        items[i].setAttributeValue(key, value.multiply(NEGATIVE));
                    }
                    String[] stringArray = itemMnyKeys;
                    int n = stringArray.length;
                    for (int occupationmny = 0; occupationmny < n; ++occupationmny) {
                        String key;
                        key = stringArray[occupationmny];
                        value = (UFDouble)items[i].getAttributeValue(key);
                        if (null == value || value.equals((Object)ZERO)) continue;
                        if ("occupationmny".equals(key)) {
                            items[i].setAttributeValue(key, ZERO);
                            continue;
                        }
                        items[i].setAttributeValue(key, value.multiply(NEGATIVE));
                    }
                }
                for (BaseItemVO item : items) {
                    item.setSettlemoney(item.getMoney_bal().multiply(new UFDouble("-1")));
                    item.setSettlecurr(item.getPk_currtype());
                }
            }
        }
        return destVO;
    }

    public static void resetBasedocVid(AggregatedValueObject[] bills) throws BusinessException {
        String ordercubasdoc;
        String supplier;
        String customer;
        UFDate billdate = (UFDate)bills[0].getParentVO().getAttributeValue("billdate");
        String pk_org = (String)bills[0].getParentVO().getAttributeValue("pk_org");
        String pk_org_v = ((ICurrentVersionService)NCLocator.getInstance().lookup(ICurrentVersionService.class)).queryOrgPkVidByPKAndDate(pk_org, billdate);
        if (!nc.vo.jcom.lang.StringUtil.isEmpty((String)pk_org_v)) {
            bills[0].getParentVO().setAttributeValue("pk_org_v", (Object)pk_org_v);
        }
        HashMap<String, UFDate> customerAndDateMap = new HashMap<String, UFDate>();
        HashMap<String, UFDate> supplierAndDateMap = new HashMap<String, UFDate>();
        HashMap<String, UFDate> ordercubasdocAndDateMap = new HashMap<String, UFDate>();
        ArrayList<String> depyoids = new ArrayList<String>();
        for (AggregatedValueObject bill : bills) {
            for (CircularlyAccessibleValueObject circularlyAccessibleValueObject : bill.getChildrenVO()) {
                customer = (String)circularlyAccessibleValueObject.getAttributeValue("customer");
                supplier = (String)circularlyAccessibleValueObject.getAttributeValue("supplier");
                ordercubasdoc = (String)circularlyAccessibleValueObject.getAttributeValue("ordercubasdoc");
                customerAndDateMap.put(customer, billdate);
                supplierAndDateMap.put(supplier, billdate);
                ordercubasdocAndDateMap.put(ordercubasdoc, billdate);
                depyoids.add((String)circularlyAccessibleValueObject.getAttributeValue("pk_deptid"));
            }
        }
        Map customerPKtoVIDMap = ((ICustomerPubService)NCLocator.getInstance().lookup(ICustomerPubService.class)).getCustomerLastVIDByOidAndDate(customerAndDateMap);
        Map supplierPKtoVIDMap = ((ISupplierPubService)NCLocator.getInstance().lookup(ISupplierPubService.class)).getSupplierLastVIDByOidAndDate(supplierAndDateMap);
        Map ordercubasdocPKtoVIDMap = ((ICustomerPubService)NCLocator.getInstance().lookup(ICustomerPubService.class)).getCustomerLastVIDByOidAndDate(ordercubasdocAndDateMap);
        Map<String, String> deptOidAndVid = ((ICurrentVersionService)NCLocator.getInstance().lookup(ICurrentVersionService.class)).queryDeptVidByOidAndDate(depyoids.toArray(new String[0]), billdate);
        for (CircularlyAccessibleValueObject circularlyAccessibleValueObject : bills) {
            boolean isNotHasTop;
            customer = (String)circularlyAccessibleValueObject.getParentVO().getAttributeValue("customer");
            supplier = (String)circularlyAccessibleValueObject.getParentVO().getAttributeValue("supplier");
            ordercubasdoc = (String)circularlyAccessibleValueObject.getParentVO().getAttributeValue("ordercubasdoc");
            String depyid = (String)circularlyAccessibleValueObject.getParentVO().getAttributeValue("pk_deptid");
            boolean bl = isNotHasTop = nc.vo.jcom.lang.StringUtil.isEmptyWithTrim((String)((String)circularlyAccessibleValueObject.getChildrenVO()[0].getAttributeValue("top_billid")));
            if (customerPKtoVIDMap != null && !nc.vo.jcom.lang.StringUtil.isEmpty((String)((String)customerPKtoVIDMap.get(customer))) && (nc.vo.jcom.lang.StringUtil.isEmptyWithTrim((String)((String)circularlyAccessibleValueObject.getParentVO().getAttributeValue("customer_v"))) || isNotHasTop)) {
                circularlyAccessibleValueObject.getParentVO().setAttributeValue("customer_v", customerPKtoVIDMap.get(customer));
            }
            if (supplierPKtoVIDMap != null && !nc.vo.jcom.lang.StringUtil.isEmpty((String)((String)supplierPKtoVIDMap.get(supplier))) && (nc.vo.jcom.lang.StringUtil.isEmptyWithTrim((String)((String)circularlyAccessibleValueObject.getParentVO().getAttributeValue("supplier_v"))) || isNotHasTop)) {
                circularlyAccessibleValueObject.getParentVO().setAttributeValue("supplier_v", supplierPKtoVIDMap.get(supplier));
            }
            if (ordercubasdocPKtoVIDMap != null && !nc.vo.jcom.lang.StringUtil.isEmpty((String)((String)ordercubasdocPKtoVIDMap.get(ordercubasdoc))) && (nc.vo.jcom.lang.StringUtil.isEmptyWithTrim((String)((String)circularlyAccessibleValueObject.getParentVO().getAttributeValue("ordercubasdoc_v"))) || isNotHasTop)) {
                circularlyAccessibleValueObject.getParentVO().setAttributeValue("ordercubasdoc_v", ordercubasdocPKtoVIDMap.get(ordercubasdoc));
            }
            if (deptOidAndVid != null && !nc.vo.jcom.lang.StringUtil.isEmpty((String)deptOidAndVid.get(depyid))) {
                circularlyAccessibleValueObject.getParentVO().setAttributeValue("pk_deptid_v", (Object)deptOidAndVid.get(depyid));
            }
            for (CircularlyAccessibleValueObject vo : circularlyAccessibleValueObject.getChildrenVO()) {
                boolean isNotHasTopB;
                customer = (String)vo.getAttributeValue("customer");
                supplier = (String)vo.getAttributeValue("supplier");
                ordercubasdoc = (String)vo.getAttributeValue("ordercubasdoc");
                depyid = (String)vo.getAttributeValue("pk_deptid");
                String customerV = null;
                String supplierV = null;
                String ordercubasdocV = null;
                boolean bl2 = isNotHasTopB = nc.vo.jcom.lang.StringUtil.isEmptyWithTrim((String)((String)vo.getAttributeValue("top_billid")));
                if (customerPKtoVIDMap != null && (nc.vo.jcom.lang.StringUtil.isEmptyWithTrim((String)((String)vo.getAttributeValue("customer_v"))) || isNotHasTopB)) {
                    customerV = (String)customerPKtoVIDMap.get(customer);
                    vo.setAttributeValue("customer_v", (Object)customerV);
                }
                if (supplierPKtoVIDMap != null && (nc.vo.jcom.lang.StringUtil.isEmptyWithTrim((String)((String)vo.getAttributeValue("supplier_v"))) || isNotHasTopB)) {
                    supplierV = (String)supplierPKtoVIDMap.get(supplier);
                    vo.setAttributeValue("supplier_v", (Object)supplierV);
                }
                if (ordercubasdocPKtoVIDMap != null && (nc.vo.jcom.lang.StringUtil.isEmptyWithTrim((String)((String)vo.getAttributeValue("ordercubasdoc_v"))) || isNotHasTopB)) {
                    ordercubasdocV = (String)ordercubasdocPKtoVIDMap.get(ordercubasdoc);
                    vo.setAttributeValue("ordercubasdoc_v", (Object)ordercubasdocV);
                }
                vo.setAttributeValue("pk_deptid_v", deptOidAndVid == null ? null : deptOidAndVid.get(depyid));
            }
        }
    }

    public static void resetSagasFieldValue(AggregatedValueObject bill) {
        if (bill != null) {
            if (bill.getParentVO().getAttributeValue("saga_status") == null) {
                bill.getParentVO().setAttributeValue("saga_status", (Object)0);
            }
            if (bill.getParentVO().getAttributeValue("saga_frozen") == null) {
                bill.getParentVO().setAttributeValue("saga_frozen", (Object)0);
            }
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.fi.pub.Currency
 *  nc.itf.uap.pf.IPFConfig
 *  nc.pubitf.uapbd.IMaterialPubService
 *  nc.pubitf.uapbd.PriceAccuracyUtil
 *  nc.pubitf.uapbd.PriceAccuracyValuePair
 *  nc.vo.bd.material.MaterialVO
 *  nc.vo.fibd.RecpaytypeVO
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.ml.MultiLangContext
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pubapp.pattern.exception.ExceptionUtils
 *  nc.vo.trade.checkrule.VOChecker
 *  nccloud.commons.lang.ArrayUtils
 */
package nc.bs.arap.util;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import nc.bs.arap.bill.ArapBillCalUtil;
import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.arap.util.ArapVOUtils;
import nc.bs.arap.util.BillEuroUtils;
import nc.bs.arap.util.BillOrgVUtils;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.itf.fi.pub.Currency;
import nc.itf.uap.pf.IPFConfig;
import nc.pubitf.uapbd.IMaterialPubService;
import nc.pubitf.uapbd.PriceAccuracyUtil;
import nc.pubitf.uapbd.PriceAccuracyValuePair;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.bill.util.ArapH2BMapping;
import nc.vo.arap.bill.util.BillEventHandlerUtil;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.bd.material.MaterialVO;
import nc.vo.fibd.RecpaytypeVO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.ml.MultiLangContext;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.trade.checkrule.VOChecker;
import nccloud.commons.lang.ArrayUtils;

public final class ArapBillVOUtils {
    public static void prepareDefaultInfo(AggregatedValueObject[] bills) throws BusinessException {
        ArapBillVOUtils.prepareDefaultInfo(bills, false);
    }

    public static void setMaterialInfo(AggregatedValueObject[] bills) throws BusinessException {
        ArrayList<String> pk_materialList = new ArrayList<String>();
        for (AggregatedValueObject vo : bills) {
            for (CircularlyAccessibleValueObject item : vo.getChildrenVO()) {
                String pk_material = (String)item.getAttributeValue("material");
                if (pk_material == null) continue;
                pk_materialList.add(pk_material);
            }
        }
        Map materialVO = ((IMaterialPubService)NCLocator.getInstance().lookup(IMaterialPubService.class)).queryMaterialBaseInfoByPks(pk_materialList.toArray(new String[0]), new String[]{"pk_source"});
        for (AggregatedValueObject vo : bills) {
            for (CircularlyAccessibleValueObject item : vo.getChildrenVO()) {
                String pk_material = (String)item.getAttributeValue("material");
                if (pk_material == null) continue;
                String material_src = materialVO.get(pk_material) == null ? null : ((MaterialVO)materialVO.get(pk_material)).getPk_source();
                item.setAttributeValue("material_src", (Object)material_src);
            }
        }
    }

    public static boolean simpleEquals(Object attr1, Object attr2) {
        if (attr1 != null && attr1.toString().trim().length() == 0) {
            attr1 = null;
        }
        if (attr2 != null && attr2.toString().trim().length() == 0) {
            attr2 = null;
        }
        if (attr1 == null && attr2 == null) {
            return true;
        }
        if (attr1 == null || attr2 == null) {
            return false;
        }
        if (attr1 instanceof UFDouble) {
            return ((UFDouble)attr1).compareTo(attr2) == 0;
        }
        return attr1.equals(attr2);
    }

    public static void removeDebetTransferinfo(AggregatedValueObject[] bills) {
        for (AggregatedValueObject vo : bills) {
            if (vo.getChildrenVO() == null || vo.getChildrenVO().length == 0) continue;
            boolean needFilter = false;
            for (CircularlyAccessibleValueObject item : vo.getChildrenVO()) {
                Integer rowtype = (Integer)item.getAttributeValue("rowtype");
                if (rowtype == null || rowtype != 5) continue;
                needFilter = true;
            }
            if (!needFilter) continue;
            ArrayList<BaseItemVO> newItems = new ArrayList<BaseItemVO>();
            for (CircularlyAccessibleValueObject sitem : vo.getChildrenVO()) {
                BaseItemVO newItem = (BaseItemVO)sitem;
                if (newItem.getRowtype() != null && newItem.getRowtype() == 5) continue;
                newItems.add(newItem);
            }
            vo.setChildrenVO((CircularlyAccessibleValueObject[])newItems.toArray(new BaseItemVO[0]));
        }
    }

    public static void prepareDefaultInfo(AggregatedValueObject[] bills, boolean isupdate) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])bills)) {
            return;
        }
        if (!isupdate) {
            ArapBillPubUtil.checkFinanceOrgEnable(bills);
            ArapBillPubUtil.checkTransTypeEnable(bills);
            BillEuroUtils.setEuroInfo(bills);
        }
        BillOrgVUtils.setOrgV(bills);
        ArapBillVOUtils.setBiztype(bills);
        ArapBillVOUtils.prepareRedundancyFields(bills);
        ArapBillVOUtils.prepareSKFKTaxFields(bills);
        ArapBillVOUtils.prepareYSYFTaxFields(bills);
        ArapBillVOUtils.setDefaultRecpaytype(bills);
    }

    public static void setDefaultRecpaytype(AggregatedValueObject[] bills) throws BusinessException {
        for (AggregatedValueObject bill : bills) {
            String pk_billtype = (String)bill.getParentVO().getAttributeValue("pk_billtype");
            if (!"F2".equals(pk_billtype) && !"F3".equals(pk_billtype)) continue;
            CircularlyAccessibleValueObject[] childrenVO = bill.getChildrenVO();
            int currLangIndex = MultiLangContext.getInstance().getCurrentLangSeq();
            String nameKey = currLangIndex == 1 ? "name" : "name" + currLangIndex;
            List<Integer> payType = Arrays.asList(3, 4);
            List<Integer> recType = Arrays.asList(1, 2);
            ArrayList<String> recpayTypeList = new ArrayList<String>();
            boolean isVoChanghe = false;
            for (CircularlyAccessibleValueObject vo : childrenVO) {
                String pk_recpaytype = (String)vo.getAttributeValue("pk_recpaytype");
                isVoChanghe = !StringUtil.isEmptyWithTrim((String)pk_recpaytype);
                pk_recpaytype = StringUtil.isEmptyWithTrim((String)pk_recpaytype) ? "GLOBZ300000000000001" : pk_recpaytype;
                recpayTypeList.add(pk_recpaytype);
            }
            Map<String, RecpaytypeVO> recpaytype = null;
            try {
                recpaytype = BillEventHandlerUtil.getRecpaytype(recpayTypeList.toArray(new String[0]));
            }
            catch (SQLException e) {
                throw new BusinessException(e.getMessage());
            }
            if (recpaytype == null || recpaytype != null && recpaytype.size() == 0) {
                return;
            }
            for (CircularlyAccessibleValueObject child : childrenVO) {
                UFBoolean issettle;
                String pk_recpaytype = (String)child.getAttributeValue("pk_recpaytype");
                pk_recpaytype = StringUtil.isEmptyWithTrim((String)pk_recpaytype) ? "GLOBZ300000000000001" : pk_recpaytype;
                RecpaytypeVO vo = recpaytype.get(pk_recpaytype);
                if (vo == null) continue;
                Integer enablestate = vo.getEnablestate();
                if (enablestate != 2) {
                    String name = (String)vo.getAttributeValue(nameKey);
                    if (isVoChanghe) {
                        throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1314", null, new String[]{name}));
                    }
                    throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1315", null, new String[]{name}));
                }
                Integer pretype = vo.getPretype();
                if (("F3".equals(pk_billtype) && !recType.contains(pretype) || "F2".equals(pk_billtype) && !payType.contains(pretype)) && child.getAttributeValue("pk_recpaytype") == null) {
                    child.setAttributeValue("pk_recpaytype", (Object)"GLOBZ300000000000001");
                }
                if ((issettle = vo.getIssettle()) != null && !issettle.booleanValue()) {
                    child.setAttributeValue("isdiscount", (Object)UFBoolean.TRUE);
                    continue;
                }
                child.setAttributeValue("isdiscount", (Object)UFBoolean.FALSE);
            }
        }
    }

    public static void setBiztype(AggregatedValueObject[] vos) {
        for (AggregatedValueObject vo : vos) {
            ArapBillVOUtils.setBiztype(vo);
        }
    }

    public static void setBiztype(AggregatedValueObject vo) {
        if (VOChecker.isEmpty((Object)vo)) {
            return;
        }
        Object pk_busitype = vo.getParentVO().getAttributeValue("pk_busitype");
        if (null != pk_busitype && !pk_busitype.equals("~")) {
            return;
        }
        String billtype = (String)vo.getParentVO().getAttributeValue("pk_billtype");
        String vtrantype = (String)vo.getParentVO().getAttributeValue("pk_tradetype");
        String pk_org = vo.getParentVO().getAttributeValue("pk_org").toString();
        String userid = InvocationInfoProxy.getInstance().getUserId();
        if (billtype != null && billtype.trim().length() > 0 && pk_org != null && pk_org.trim().length() > 0) {
            try {
                String cbiztypeid = ((IPFConfig)NCLocator.getInstance().lookup(IPFConfig.class)).retBusitypeCanStart(billtype, vtrantype, pk_org, userid);
                if (null == cbiztypeid) {
                    if (!billtype.equals("23E0") && !billtype.equals("23E1")) {
                        ExceptionUtils.wrappBusinessException((String)NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0564"));
                    }
                } else {
                    vo.getParentVO().setAttributeValue("pk_busitype", (Object)cbiztypeid);
                }
            }
            catch (BusinessException e) {
                ExceptionUtils.wrappException((Exception)((Object)e));
            }
        }
    }

    public static void prepareRedundancyFields(AggregatedValueObject[] bills) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])bills)) {
            return;
        }
        for (AggregatedValueObject bill : bills) {
            BaseItemVO[] childrenVOs = (BaseItemVO[])bill.getChildrenVO();
            String attributeValue0 = (String)bill.getParentVO().getAttributeValue("pk_org");
            String attributeValue1 = (String)bill.getParentVO().getAttributeValue("pk_org_v");
            String attributeValue4 = (String)bill.getParentVO().getAttributeValue("pk_group");
            UFDate attributeValue5 = (UFDate)bill.getParentVO().getAttributeValue("billdate");
            String attributeValue6 = (String)bill.getParentVO().getAttributeValue("pk_tradetype");
            String attributeValue7 = (String)bill.getParentVO().getAttributeValue("pk_tradetypeid");
            String attributeValue8 = (String)bill.getParentVO().getAttributeValue("pk_billtype");
            String attributeValue9 = (String)bill.getParentVO().getAttributeValue("billclass");
            String attributeValue10 = (String)bill.getParentVO().getAttributeValue("billno");
            for (int j = 0; j < childrenVOs.length; ++j) {
                childrenVOs[j].setPk_org(attributeValue0);
                childrenVOs[j].setPk_org_v(attributeValue1);
                childrenVOs[j].setPk_group(attributeValue4);
                childrenVOs[j].setBilldate(attributeValue5);
                childrenVOs[j].setPk_tradetype(attributeValue6);
                childrenVOs[j].setPk_tradetypeid(attributeValue7);
                childrenVOs[j].setPk_billtype(attributeValue8);
                childrenVOs[j].setBillclass(attributeValue9);
                childrenVOs[j].setBillno(attributeValue10);
                if (null != childrenVOs[j] && childrenVOs[j].getObjtype() == null || childrenVOs[j].getObjtype() != 0 || !StringUtil.isEmptyWithTrim((String)childrenVOs[j].getTop_billid()) && ("4Y".equals(childrenVOs[j].getTop_billid()) || "5F".equals(childrenVOs[j].getTop_billid())) || !StringUtil.isEmptyWithTrim((String)childrenVOs[j].getOrdercubasdoc())) continue;
                childrenVOs[j].setOrdercubasdoc(childrenVOs[j].getCustomer());
            }
        }
    }

    public static void prepareYSYFTaxFields(AggregatedValueObject[] bills) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])bills)) {
            return;
        }
        String billclass = (String)bills[0].getParentVO().getAttributeValue("billclass");
        List<String> asList = Arrays.asList("ys", "yf", "zf", "zs");
        if (asList.contains(billclass)) {
            for (AggregatedValueObject bill : bills) {
                CircularlyAccessibleValueObject[] childrenVOs = bill.getChildrenVO();
                for (int j = 0; j < childrenVOs.length; ++j) {
                    UFDouble calvalue = (UFDouble)childrenVOs[j].getAttributeValue("caltaxmny");
                    if (calvalue != null && calvalue.compareTo((Object)UFDouble.ZERO_DBL) != 0) continue;
                    Object attributeValue = childrenVOs[j].getAttributeValue("taxtype");
                    UFDouble value = null;
                    value = attributeValue != null && BillEnumCollection.TaxType.TAXIN.VALUE.intValue() == ((Integer)attributeValue).intValue() ? (UFDouble)childrenVOs[j].getAttributeValue(billclass.equals("ys") ? "local_money_de" : "local_money_cr") : (UFDouble)childrenVOs[j].getAttributeValue(billclass.equals("ys") ? "local_notax_de" : "local_notax_cr");
                    childrenVOs[j].setAttributeValue("caltaxmny", (Object)value);
                }
            }
        }
    }

    public static void prepareSKFKTaxFields(AggregatedValueObject[] bills) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])bills)) {
            return;
        }
    }

    public static void dealVoScaleAndHtb(BaseAggVO aggvo) {
        if (aggvo == null || aggvo.getHeadVO() == null || aggvo.getItems() == null || aggvo.getItems().length == 0) {
            return;
        }
        BaseBillVO headVO = aggvo.getHeadVO();
        BaseItemVO[] items = aggvo.getItems();
        ArapH2BMapping h2b = new ArapH2BMapping();
        Map<String, String> htobMap = h2b.getHTOBMap();
        for (String key : htobMap.keySet()) {
            headVO.setAttributeValue(key, items[0].getAttributeValue(htobMap.get(key)));
        }
        if (headVO.getGrouprate() == null) {
            headVO.setGrouprate(new UFDouble(0));
        }
        if (headVO.getGlobalrate() == null) {
            headVO.setGlobalrate(new UFDouble(0));
        }
        int currDigit = 2;
        int currDigitOrg = 2;
        int currDigitGroup = 2;
        int currDigitGlobal = 2;
        int currRoundtype = 4;
        int currOrgRoundtype = 4;
        int currGroupRoundtype = 4;
        int currGlobalRoundtype = 4;
        int rateDigit = 4;
        int settlemoneyDigit = 2;
        int[] digitsH = null;
        UFDate billDate = headVO.getBilldate();
        String billType = headVO.getPk_billtype();
        int[] digits = null;
        try {
            digits = Currency.getCurrDigitAndRoundtypeByOrg((String)headVO.getPk_group());
            currDigitGroup = digits[0];
            currGroupRoundtype = digits[1];
            digits = Currency.getCurrDigitAndRoundtypeByOrg((String)"GLOBLE00000000000000");
            currDigitGlobal = digits[0];
            currGlobalRoundtype = digits[1];
            digitsH = ArapBillCalUtil.getRateDigits(headVO.getPk_currtype(), headVO.getPk_org(), headVO.getPk_group(), billDate, billType);
            if (digitsH != null && digitsH.length > 0) {
                rateDigit = digitsH[0];
            }
        }
        catch (BusinessException e) {
            ExceptionHandler.consume((Throwable)e);
        }
        for (BaseItemVO item : items) {
            String pkOrg = item.getPk_org();
            String pkCurrtype = item.getPk_currtype();
            String pkGroup = item.getPk_group();
            String settlecurr = item.getSettlecurr();
            digits = Currency.getCurrDigitAndRoundtype((String)pkCurrtype);
            currDigit = digits[0];
            currRoundtype = digits[1];
            for (String field : BaseItemVO.MONEYFIELD_LIST_NORMAL) {
                if (item.getAttributeValue(field) == null) continue;
                item.setAttributeValue(field, ((UFDouble)item.getAttributeValue(field)).setScale(currDigit, currRoundtype));
            }
            try {
                digits = Currency.getCurrDigitAndRoundtypeByOrg((String)pkOrg);
                currDigitOrg = digits[0];
                currOrgRoundtype = digits[1];
                for (String field : BaseItemVO.MONEYFIELD_LIST_LOCAL) {
                    if (item.getAttributeValue(field) == null) continue;
                    item.setAttributeValue(field, ((UFDouble)item.getAttributeValue(field)).setScale(currDigitOrg, currOrgRoundtype));
                }
            }
            catch (BusinessException e) {
                ExceptionHandler.consume((Throwable)e);
            }
            if (settlecurr != null && !"".equals(settlecurr)) {
                settlemoneyDigit = Currency.getCurrDigit((String)settlecurr);
                if (item.getAttributeValue("settlemoney") != null) {
                    item.setAttributeValue("settlemoney", ((UFDouble)item.getAttributeValue("settlemoney")).setScale(settlemoneyDigit, 4));
                }
            } else if (item.getAttributeValue("settlemoney") != null) {
                item.setAttributeValue("settlemoney", ((UFDouble)item.getAttributeValue("settlemoney")).setScale(settlemoneyDigit, 4));
            }
            for (String field : BaseItemVO.MONEYFIELD_LIST_GROUP) {
                if (item.getAttributeValue(field) == null) continue;
                item.setAttributeValue(field, ((UFDouble)item.getAttributeValue(field)).setScale(currDigitGroup, currGroupRoundtype));
            }
            for (String field : BaseItemVO.MONEYFIELD_LIST_GLOBAL) {
                if (item.getAttributeValue(field) == null) continue;
                item.setAttributeValue(field, ((UFDouble)item.getAttributeValue(field)).setScale(currDigitGlobal, currGlobalRoundtype));
            }
            for (String field : BaseItemVO.MONEYFIELD_LIST_PRICE) {
                if (item.getAttributeValue(field) == null) continue;
                item.setAttributeValue(field, ((UFDouble)item.getAttributeValue(field)).setScale(ArapBillVOUtils.getPriceDecimalFromSource(item.getPk_currtype()), currGroupRoundtype));
            }
            for (String field : BaseItemVO.MONEYFIELD_LIST_QUANTITY) {
                if (item.getAttributeValue(field) == null) continue;
                item.setAttributeValue(field, ((UFDouble)item.getAttributeValue(field)).setScale(ArapBillVOUtils.getQuantityDecimalFromSource(item.getMaterial()), currGroupRoundtype));
            }
            for (String field : new String[]{"taxrate", "nosubtaxrate"}) {
                if (item.getAttributeValue(field) == null) continue;
                item.setAttributeValue(field, ((UFDouble)item.getAttributeValue(field)).setScale(2, currGroupRoundtype));
            }
            int[] ratedigits = ArapBillCalUtil.getRateDigits(pkCurrtype, pkOrg, pkGroup, billDate, billType);
            if (item.getAttributeValue("rate") != null) {
                item.setAttributeValue("rate", ((UFDouble)item.getAttributeValue("rate")).setScale(ratedigits[0], 4));
            }
            if (item.getAttributeValue("grouprate") != null) {
                item.setAttributeValue("grouprate", ((UFDouble)item.getAttributeValue("grouprate")).setScale(ratedigits[1], 4));
            }
            if (item.getAttributeValue("globalrate") == null) continue;
            item.setAttributeValue("globalrate", ((UFDouble)item.getAttributeValue("globalrate")).setScale(ratedigits[2], 4));
        }
        headVO.setMoney(headVO.getMoney().setScale(currDigit, currRoundtype));
        headVO.setLocal_money(headVO.getLocal_money().setScale(currDigitOrg, currOrgRoundtype));
        headVO.setGrouplocal(headVO.getGrouplocal().setScale(currDigitGroup, currGroupRoundtype));
        headVO.setGloballocal(headVO.getGloballocal().setScale(currDigitGlobal, currGlobalRoundtype));
        headVO.setRate(headVO.getRate().setScale(rateDigit, 4));
        headVO.setGrouprate(headVO.getGrouprate().setScale(rateDigit, 4));
        headVO.setGlobalrate(headVO.getGlobalrate().setScale(rateDigit, 4));
    }

    public static int getQuantityDecimalFromSource(Object material) {
        return ArapVOUtils.getDecimalFromSource(material);
    }

    public static int getPriceDecimalFromSource(Object currtype) {
        PriceAccuracyValuePair priceAccuracyValuePair = ArapBillVOUtils.getPriceDigitAndRoundTypeValuePair(currtype);
        if (null != priceAccuracyValuePair) {
            return priceAccuracyValuePair.getPriceAccuracy();
        }
        return 2;
    }

    public static void dealBodyVoScale(BaseAggVO aggvo) {
        if (aggvo == null) {
            return;
        }
        BaseBillVO headVO = aggvo.getHeadVO();
        BaseItemVO[] items = aggvo.getItems();
        int currDigit = 2;
        int currDigitOrg = 2;
        int currDigitGroup = 2;
        int currDigitGlobal = 2;
        int taxrateDigit = 2;
        int taxpriceDigit = 3;
        int roundtype = 4;
        if (items != null && items.length > 0) {
            for (BaseItemVO item : items) {
                int[] digs;
                String pkOrg = item.getPk_org();
                String pkCurrtype = item.getPk_currtype();
                String pkGroup = item.getPk_group();
                UFDate billDate = headVO.getBilldate();
                String billType = headVO.getPk_billtype();
                try {
                    digs = Currency.getCurrDigitAndRoundtype((String)pkCurrtype);
                    currDigit = digs[0];
                    roundtype = digs[1];
                    for (String field : BaseItemVO.MONEYFIELD_LIST_NORMAL) {
                        if (item.getAttributeValue(field) == null) continue;
                        item.setAttributeValue(field, ((UFDouble)item.getAttributeValue(field)).setScale(currDigit, roundtype));
                    }
                }
                catch (Exception e) {
                    ExceptionHandler.consume((Throwable)e);
                }
                try {
                    digs = Currency.getCurrDigitAndRoundtype((String)Currency.getOrgLocalCurrPK((String)pkOrg));
                    currDigitOrg = digs[0];
                    roundtype = digs[1];
                    for (String field : BaseItemVO.MONEYFIELD_LIST_LOCAL) {
                        if (item.getAttributeValue(field) == null) continue;
                        item.setAttributeValue(field, ((UFDouble)item.getAttributeValue(field)).setScale(currDigitOrg, roundtype));
                    }
                }
                catch (BusinessException e) {
                    ExceptionHandler.consume((Throwable)e);
                }
                try {
                    digs = Currency.getCurrDigitAndRoundtype((String)Currency.getOrgLocalCurrPK((String)pkGroup));
                    currDigitGroup = digs[0];
                    roundtype = digs[1];
                    for (String field : BaseItemVO.MONEYFIELD_LIST_GROUP) {
                        if (item.getAttributeValue(field) == null) continue;
                        item.setAttributeValue(field, ((UFDouble)item.getAttributeValue(field)).setScale(currDigitGroup, roundtype));
                    }
                }
                catch (BusinessException e) {
                    ExceptionHandler.consume((Throwable)e);
                }
                try {
                    digs = Currency.getCurrDigitAndRoundtype((String)Currency.getOrgLocalCurrPK((String)"GLOBLE00000000000000"));
                    currDigitGlobal = digs[0];
                    roundtype = digs[1];
                    for (String field : BaseItemVO.MONEYFIELD_LIST_GLOBAL) {
                        if (item.getAttributeValue(field) == null) continue;
                        item.setAttributeValue(field, ((UFDouble)item.getAttributeValue(field)).setScale(currDigitGlobal, roundtype));
                    }
                }
                catch (BusinessException e) {
                    ExceptionHandler.consume((Throwable)e);
                }
                int[] ratedigits = ArapBillCalUtil.getRateDigits(pkCurrtype, pkOrg, pkGroup, billDate, billType);
                if (item.getAttributeValue("rate") != null) {
                    item.setAttributeValue("rate", ((UFDouble)item.getAttributeValue("rate")).setScale(ratedigits[0], 4));
                }
                if (item.getAttributeValue("grouprate") != null) {
                    item.setAttributeValue("grouprate", ((UFDouble)item.getAttributeValue("grouprate")).setScale(ratedigits[1], 4));
                }
                if (item.getAttributeValue("globalrate") != null) {
                    item.setAttributeValue("globalrate", ((UFDouble)item.getAttributeValue("globalrate")).setScale(ratedigits[2], 4));
                }
                if (item.getAttributeValue("taxrate") != null) {
                    item.setAttributeValue("taxrate", ((UFDouble)item.getAttributeValue("taxrate")).setScale(taxrateDigit, 4));
                }
                if (item.getAttributeValue("taxprice") == null || StringUtil.isEmpty((String)pkCurrtype)) continue;
                PriceAccuracyValuePair priceAccuracyValuePair = ArapBillVOUtils.getPriceDigitAndRoundTypeValuePair(pkCurrtype);
                if (null != priceAccuracyValuePair) {
                    taxpriceDigit = priceAccuracyValuePair.getPriceAccuracy();
                    roundtype = priceAccuracyValuePair.getRoundMode();
                } else {
                    taxpriceDigit = -1;
                    roundtype = 4;
                }
                item.setAttributeValue("taxprice", ((UFDouble)item.getAttributeValue("taxprice")).setScale(taxpriceDigit, roundtype));
            }
        }
    }

    public static void dealVoScale(Object ... aggvos) {
        if (aggvos == null || aggvos.length == 0) {
            return;
        }
        for (Object vo : aggvos) {
            BaseAggVO aggvo = (BaseAggVO)((Object)vo);
            BaseBillVO headVO = aggvo.getHeadVO();
            int currDigit = 2;
            int currDigitOrg = 2;
            int currDigitGroup = 2;
            int currDigitGlobal = 2;
            int rateDigit = 4;
            String pkOrg = headVO.getPk_org();
            String pkCurrtype = headVO.getPk_currtype();
            String pkGroup = headVO.getPk_group();
            try {
                currDigit = Currency.getCurrDigit((String)pkCurrtype);
            }
            catch (Exception e) {
                ExceptionHandler.consume((Throwable)e);
            }
            try {
                currDigitOrg = Currency.getCurrDigit((String)Currency.getOrgLocalCurrPK((String)pkOrg));
            }
            catch (BusinessException e) {
                ExceptionHandler.consume((Throwable)e);
            }
            try {
                currDigitGroup = Currency.getCurrDigit((String)Currency.getOrgLocalCurrPK((String)pkGroup));
            }
            catch (BusinessException e) {
                ExceptionHandler.consume((Throwable)e);
            }
            try {
                currDigitGlobal = Currency.getCurrDigit((String)Currency.getOrgLocalCurrPK((String)"GLOBLE00000000000000"));
            }
            catch (BusinessException e) {
                ExceptionHandler.consume((Throwable)e);
            }
            headVO.setMoney(headVO.getMoney().setScale(currDigit, 4));
            headVO.setLocal_money(headVO.getLocal_money().setScale(currDigitOrg, 4));
            headVO.setGrouplocal(headVO.getGrouplocal().setScale(currDigitGroup, 4));
            headVO.setGloballocal(headVO.getGloballocal().setScale(currDigitGlobal, 4));
            headVO.setRate(headVO.getRate().setScale(rateDigit, 4));
            headVO.setGrouprate(headVO.getGrouprate().setScale(rateDigit, 4));
            headVO.setGlobalrate(headVO.getGlobalrate().setScale(rateDigit, 4));
            ArapBillVOUtils.dealBodyVoScale(aggvo);
        }
    }

    public static PriceAccuracyValuePair getPriceDigitAndRoundTypeValuePair(Object pkValue) {
        PriceAccuracyValuePair priceAccuracyValuePair = null;
        try {
            if (pkValue != null) {
                priceAccuracyValuePair = PriceAccuracyUtil.getInstance().getPriceAccuracyValuePair((String)pkValue);
                return priceAccuracyValuePair;
            }
        }
        catch (BusinessException e) {
            ExceptionUtils.wrappException((Exception)((Object)e));
        }
        return priceAccuracyValuePair;
    }

    public static void setDefaultSagaFrozen(AggregatedValueObject[] bills) throws BusinessException {
        for (AggregatedValueObject bill : bills) {
            Integer status;
            Integer frozen = (Integer)bill.getParentVO().getAttributeValue("saga_frozen");
            if (frozen == null) {
                bill.getParentVO().setAttributeValue("saga_frozen", (Object)0);
            }
            if ((status = (Integer)bill.getParentVO().getAttributeValue("saga_status")) != null) continue;
            bill.getParentVO().setAttributeValue("saga_status", (Object)0);
        }
    }

    public static void setDefaultSagaFrozen(SuperVO[] bills) throws BusinessException {
        for (SuperVO bill : bills) {
            Integer status;
            Integer frozen = (Integer)bill.getAttributeValue("saga_frozen");
            if (frozen == null) {
                bill.setAttributeValue("saga_frozen", (Object)0);
            }
            if ((status = (Integer)bill.getAttributeValue("saga_status")) != null) continue;
            bill.setAttributeValue("saga_status", (Object)0);
        }
    }
}


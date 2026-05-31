/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.businessevent.BdUpdateEvent
 *  nc.bs.businessevent.BusinessEvent
 *  nc.bs.businessevent.IBusinessEvent
 *  nc.bs.dao.BaseDAO
 *  nc.bs.dao.DAOException
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Log
 *  nc.bs.logging.Logger
 *  nc.jdbc.framework.processor.ColumnListProcessor
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.pubitf.uapbd.IMaterialPubService
 *  nc.pubitf.uapbd.MeasdocUtil
 *  nc.ui.dbcache.DBCacheFacade
 *  nc.vo.arap.verify.AggverifyVO
 *  nc.vo.arap.verify.VerifyDetailVO
 *  nc.vo.bd.material.MaterialVO
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDouble
 *  nccloud.commons.lang.ArrayUtils
 *  nccloud.commons.lang.StringUtils
 */
package nc.bs.arap.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import nc.bs.arap.util.ArapVOData;
import nc.bs.businessevent.BdUpdateEvent;
import nc.bs.businessevent.BusinessEvent;
import nc.bs.businessevent.IBusinessEvent;
import nc.bs.dao.BaseDAO;
import nc.bs.dao.DAOException;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Log;
import nc.bs.logging.Logger;
import nc.jdbc.framework.processor.ColumnListProcessor;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.pubitf.uapbd.IMaterialPubService;
import nc.pubitf.uapbd.MeasdocUtil;
import nc.ui.dbcache.DBCacheFacade;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.global.ArapBillDealVOConsts;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.utils.ArrayUtil;
import nc.vo.arap.utils.StringUtil;
import nc.vo.arap.verify.AggverifyVO;
import nc.vo.arap.verify.VerifyDetailVO;
import nc.vo.bd.material.MaterialVO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDouble;
import nccloud.commons.lang.ArrayUtils;
import nccloud.commons.lang.StringUtils;

public final class ArapVOUtils {
    private static final String ZB = "zb.";
    private static Map<Object, Integer> materialDecMap = new HashMap<Object, Integer>();

    public static Map<String, Integer> getDecimalFromSource(List<String> pks) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        for (String pk : pks) {
            if (null == materialDecMap.get(pk)) continue;
            result.put(pk, materialDecMap.get(pk));
        }
        try {
            Map vo = ((IMaterialPubService)NCLocator.getInstance().lookup(IMaterialPubService.class)).queryMaterialBaseInfoByPks(pks.toArray(new String[0]), new String[]{"pk_measdoc"});
            for (String pk : vo.keySet()) {
                MaterialVO materialVO = (MaterialVO)vo.get(pk);
                Integer[] num = MeasdocUtil.getInstance().getPrecisionByPks(new String[]{materialVO.getPk_measdoc()});
                if (!StringUtil.isEmptyArry(num)) {
                    materialDecMap.put(pk, num[0]);
                    result.put(pk, num[0]);
                    continue;
                }
                materialDecMap.put(pk, 2);
                result.put(pk, 2);
            }
        }
        catch (Exception e) {
            Logger.debug((Object)e.getMessage());
        }
        return result;
    }

    public static int getDecimalFromSource(Object pk_material) {
        try {
            if ("~".equals(pk_material) || null == pk_material) {
                return 2;
            }
            if (null != materialDecMap.get(pk_material)) {
                return materialDecMap.get(pk_material);
            }
            String pkMeasdoc = "";
            try {
                Vector fromDBCache = DBCacheFacade.matchPK((String)"select pk_measdoc from bd_material where pk_material in(?)", (String[])new String[]{pk_material.toString()}, (String)"pk_measdoc");
                pkMeasdoc = (String)((Vector)fromDBCache.get(0)).get(0);
            }
            catch (Exception e) {
                Map vo = ((IMaterialPubService)NCLocator.getInstance().lookup(IMaterialPubService.class)).queryMaterialBaseInfoByPks(new String[]{pk_material.toString()}, new String[]{"pk_measdoc"});
                pkMeasdoc = ((MaterialVO)vo.get(pk_material.toString())).getPk_measdoc();
            }
            Integer[] num = MeasdocUtil.getInstance().getPrecisionByPks(new String[]{pkMeasdoc});
            if (!StringUtil.isEmptyArry(num)) {
                materialDecMap.put(pk_material, num[0]);
                return num[0];
            }
        }
        catch (Exception e) {
            Logger.debug((Object)e.getMessage());
        }
        return 0;
    }

    public static void validateVoCopyRed(BaseAggVO vo) throws BusinessException {
        CircularlyAccessibleValueObject[] childrenVOs = vo.getChildrenVO();
        BaseBillVO bill = (BaseBillVO)vo.getParentVO();
        for (CircularlyAccessibleValueObject children : childrenVOs) {
            BaseItemVO item = (BaseItemVO)children;
            if (bill.getBillclass().equals(ArapConstant.ARAP_FK_BILLCLASS) && item.getObjtype() == 0 && bill.getIsrefund() != null && bill.getIsrefund().booleanValue()) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0971"));
            }
            if (bill.getBillclass().equals(ArapConstant.ARAP_AP_BILLCLASS) && item.getObjtype() == 0 && bill.getIsrefund() != null && bill.getIsrefund().booleanValue()) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0972"));
            }
            if (!bill.getBillclass().equals(ArapConstant.ARAP_SK_BILLCLASS) || item.getObjtype() != 1 || bill.getIsrefund() == null || !bill.getIsrefund().booleanValue()) continue;
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0973"));
        }
    }

    public static ArapVOData[] getOtherSystemVerifyVOData(IBusinessEvent event, String top_billtype, String idfield, String[] valuefields, boolean srcBillIdMustNull, boolean srcItemIdMustNull) {
        ArrayList agglist = (ArrayList)((BusinessEvent)event).getObject();
        ArrayList<ArapVOData> billList = new ArrayList<ArapVOData>();
        if (agglist == null) {
            return billList.toArray(new ArapVOData[0]);
        }
        for (AggverifyVO agg : agglist) {
            VerifyDetailVO[] childrenVO = (VerifyDetailVO[])agg.getChildrenVO();
            CircularlyAccessibleValueObject headVO = agg.getParentVO();
            for (VerifyDetailVO child : childrenVO) {
                if (child.getBusiflag().equals(ArapBillDealVOConsts.BACKONVERIFY_FLAG) || StringUtils.isEmpty((CharSequence)child.getBusidata().getSrc_billid()) != srcBillIdMustNull || StringUtils.isEmpty((CharSequence)child.getBusidata().getSrc_itemid()) != srcItemIdMustNull || child.getBusidata().getTop_billtype() == null || !child.getBusidata().getTop_billtype().trim().equals(top_billtype)) continue;
                ArapVOData vodata = new ArapVOData();
                vodata.setSrcid((String)child.getBusidata().getAttributeValue(idfield));
                for (String valueField : valuefields) {
                    if (valueField.startsWith(ZB)) {
                        vodata.getHeadData().put(valueField, headVO.getAttributeValue(valueField.substring(ZB.length())));
                        continue;
                    }
                    vodata.getHeadData().put(valueField, child.getAttributeValue(valueField));
                }
                billList.add(vodata);
            }
        }
        return billList.toArray(new ArapVOData[0]);
    }

    public static ArapVOData[] getOtherSystemVerifyVOData(IBusinessEvent event, String top_billtype, String idfield, String[] valuefields, String flag) {
        ArrayList agglist = (ArrayList)((BusinessEvent)event).getObject();
        ArrayList<ArapVOData> billList = new ArrayList<ArapVOData>();
        if (agglist == null) {
            return billList.toArray(new ArapVOData[0]);
        }
        for (AggverifyVO agg : agglist) {
            VerifyDetailVO[] childrenVO = (VerifyDetailVO[])agg.getChildrenVO();
            CircularlyAccessibleValueObject headVO = agg.getParentVO();
            for (VerifyDetailVO child : childrenVO) {
                ArapVOData vodata;
                if (child.getBusiflag().equals(ArapBillDealVOConsts.RBVERIFY_FLAG) || child.getBusiflag().equals(ArapBillDealVOConsts.BACKONVERIFY_FLAG) || child.getBusidata().getTop_billtype() == null || !top_billtype.trim().equals(child.getBusidata().getTop_billtype().trim())) continue;
                if ("0".equals(flag)) {
                    if (child.getBusidata().getInsurance() == null || !child.getBusidata().getInsurance().booleanValue()) continue;
                    vodata = new ArapVOData();
                    vodata.setSrcid((String)child.getBusidata().getAttributeValue(idfield));
                    for (String valueField : valuefields) {
                        if (valueField.startsWith(ZB)) {
                            vodata.getHeadData().put(valueField, headVO.getAttributeValue(valueField.substring(ZB.length())));
                            continue;
                        }
                        vodata.getHeadData().put(valueField, child.getAttributeValue(valueField));
                    }
                    billList.add(vodata);
                    continue;
                }
                if ("1".equals(flag)) {
                    if (child.getBusidata().getPrepay() == null || child.getBusidata().getPrepay() != 1) continue;
                    vodata = new ArapVOData();
                    vodata.setSrcid((String)child.getBusidata().getAttributeValue(idfield));
                    for (String valueField : valuefields) {
                        if (valueField.startsWith(ZB)) {
                            vodata.getHeadData().put(valueField, headVO.getAttributeValue(valueField.substring(ZB.length())));
                            continue;
                        }
                        vodata.getHeadData().put(valueField, child.getAttributeValue(valueField));
                    }
                    billList.add(vodata);
                    continue;
                }
                if (!"2".equals(flag) || child.getBusidata().getPrepay() == null || child.getBusidata().getPrepay() != 0 || child.getBusidata().getInsurance() == null || child.getBusidata().getInsurance().booleanValue()) continue;
                vodata = new ArapVOData();
                vodata.setSrcid((String)child.getBusidata().getAttributeValue(idfield));
                for (String valueField : valuefields) {
                    if (valueField.startsWith(ZB)) {
                        vodata.getHeadData().put(valueField, headVO.getAttributeValue(valueField.substring(ZB.length())));
                        continue;
                    }
                    vodata.getHeadData().put(valueField, child.getAttributeValue(valueField));
                }
                billList.add(vodata);
            }
        }
        return billList.toArray(new ArapVOData[0]);
    }

    public static ArapVOData[] getOtherSystemRBVerifyVOData(IBusinessEvent event, String top_billtype, String idfield, String[] valuefields, String flag) {
        ArrayList agglist = (ArrayList)((BusinessEvent)event).getObject();
        ArrayList<ArapVOData> billList = new ArrayList<ArapVOData>();
        if (agglist == null) {
            return billList.toArray(new ArapVOData[0]);
        }
        for (AggverifyVO agg : agglist) {
            VerifyDetailVO[] childrenVO = (VerifyDetailVO[])agg.getChildrenVO();
            CircularlyAccessibleValueObject headVO = agg.getParentVO();
            for (VerifyDetailVO child : childrenVO) {
                ArapVOData vodata;
                if (child.getBusiflag().equals(ArapBillDealVOConsts.BACKONVERIFY_FLAG) || !child.getBusiflag().equals(ArapBillDealVOConsts.RBVERIFY_FLAG) || child.getBusidata().getTop_billtype() == null || !top_billtype.trim().equals(child.getBusidata().getTop_billtype().trim())) continue;
                if ("0".equals(flag)) {
                    if (child.getBusidata().getInsurance() == null || !child.getBusidata().getInsurance().booleanValue()) continue;
                    vodata = new ArapVOData();
                    vodata.setSrcid((String)child.getBusidata().getAttributeValue(idfield));
                    for (String valueField : valuefields) {
                        if (valueField.startsWith(ZB)) {
                            vodata.getHeadData().put(valueField, headVO.getAttributeValue(valueField.substring(ZB.length())));
                            continue;
                        }
                        vodata.getHeadData().put(valueField, child.getAttributeValue(valueField));
                    }
                    billList.add(vodata);
                    continue;
                }
                if ("1".equals(flag)) {
                    if (child.getBusidata().getPrepay() != 1) continue;
                    vodata = new ArapVOData();
                    vodata.setSrcid((String)child.getBusidata().getAttributeValue(idfield));
                    for (String valueField : valuefields) {
                        if (valueField.startsWith(ZB)) {
                            vodata.getHeadData().put(valueField, headVO.getAttributeValue(valueField.substring(ZB.length())));
                            continue;
                        }
                        vodata.getHeadData().put(valueField, child.getAttributeValue(valueField));
                    }
                    billList.add(vodata);
                    continue;
                }
                if (!"2".equals(flag) || child.getBusidata().getPrepay() != 0 || child.getBusidata().getInsurance() == null || child.getBusidata().getInsurance().booleanValue()) continue;
                vodata = new ArapVOData();
                vodata.setSrcid((String)child.getBusidata().getAttributeValue(idfield));
                for (String valueField : valuefields) {
                    if (valueField.startsWith(ZB)) {
                        vodata.getHeadData().put(valueField, headVO.getAttributeValue(valueField.substring(ZB.length())));
                        continue;
                    }
                    vodata.getHeadData().put(valueField, child.getAttributeValue(valueField));
                }
                billList.add(vodata);
            }
        }
        return billList.toArray(new ArapVOData[0]);
    }

    public static ArapVOData[] getOtherSystemBillVOData(IBusinessEvent event, String src_syscode, String top_billtype, String idfield, String[] valuefields) {
        BaseAggVO[] otherSystemBills = ArapVOUtils.getOtherSystemBills(event, src_syscode, top_billtype);
        ArrayList<ArapVOData> billList = new ArrayList<ArapVOData>();
        if (ArrayUtils.isEmpty((Object[])otherSystemBills)) {
            return billList.toArray(new ArapVOData[0]);
        }
        for (BaseAggVO agg : otherSystemBills) {
            BaseItemVO[] items;
            BaseBillVO headVO = agg.getHeadVO();
            for (BaseItemVO item : items = agg.getItems()) {
                if (!StringUtils.isNotEmpty((CharSequence)((String)item.getAttributeValue(idfield)))) continue;
                ArapVOData vodata = new ArapVOData();
                vodata.setSrcid((String)item.getAttributeValue(idfield));
                for (String valueField : valuefields) {
                    if (valueField.startsWith(ZB)) {
                        vodata.getHeadData().put(valueField, headVO.getAttributeValue(valueField.substring(ZB.length())));
                        continue;
                    }
                    vodata.getHeadData().put(valueField, item.getAttributeValue(valueField));
                }
                billList.add(vodata);
            }
        }
        return billList.toArray(new ArapVOData[0]);
    }

    public static BaseAggVO[] getOtherSystemBills(IBusinessEvent event, String src_syscode, String top_billtype) {
        Object value = null;
        if (event instanceof BusinessEvent) {
            value = ((BusinessEvent)event).getObject();
        } else if (event instanceof BdUpdateEvent) {
            value = ((BdUpdateEvent)event).getNewObject();
        }
        ArrayList<BaseAggVO> billList = new ArrayList<BaseAggVO>();
        BaseAggVO[] bills = new BaseAggVO[]{};
        if (null != value) {
            Object[] objs;
            bills = value.getClass().isArray() ? ((objs = (Object[])value) instanceof BaseAggVO[] ? (BaseAggVO[])objs : ArrayUtil.convertSupers2Subs((AggregatedValueObject[])objs, BaseAggVO.class)) : new BaseAggVO[]{(BaseAggVO)((Object)value)};
        }
        for (BaseAggVO vo : bills) {
            BaseBillVO headVO = vo.getHeadVO();
            Integer billSrcSyscode = headVO.getSrc_syscode();
            if (src_syscode != null && (billSrcSyscode == null || !src_syscode.equals(billSrcSyscode == null ? "" : billSrcSyscode.toString()))) continue;
            BaseItemVO[] items = vo.getItems();
            boolean notMatch = false;
            for (BaseItemVO item : items) {
                String billTopBilltype;
                if (top_billtype == null || (billTopBilltype = item.getTop_billtype()) != null && top_billtype.equals(billTopBilltype)) continue;
                notMatch = true;
                break;
            }
            if (notMatch) continue;
            billList.add(vo);
        }
        return billList.toArray(new BaseAggVO[0]);
    }

    public static BaseAggVO[] getBills(IBusinessEvent event) {
        Object value = null;
        if (event instanceof BusinessEvent) {
            value = ((BusinessEvent)event).getObject();
        } else if (event instanceof BdUpdateEvent) {
            value = ((BdUpdateEvent)event).getNewObject();
        }
        BaseAggVO[] bills = new BaseAggVO[]{};
        if (null != value) {
            Object[] objs;
            bills = value.getClass().isArray() ? ((objs = (Object[])value) instanceof BaseAggVO[] ? (BaseAggVO[])objs : ArrayUtil.convertSupers2Subs((AggregatedValueObject[])objs, BaseAggVO.class)) : new BaseAggVO[]{(BaseAggVO)((Object)value)};
        }
        return bills;
    }

    public static boolean isOtherSystemPushBill(BaseBillVO billvo, String topBilltype) {
        Integer srcSyscode = billvo.getSrc_syscode();
        UFBoolean isflowbill = billvo.getIsflowbill();
        if (isflowbill == null) {
            isflowbill = UFBoolean.FALSE;
        }
        if (srcSyscode == null) {
            Log.getInstance((String)"ArapVOUtils").error((Object)"srcSyscode is null");
            return false;
        }
        if (StringUtils.isNotEmpty((CharSequence)topBilltype) && topBilltype.trim().startsWith("4A")) {
            return true;
        }
        if (isflowbill.booleanValue()) {
            return false;
        }
        if (srcSyscode.intValue() == BillEnumCollection.FromSystem.AR.VALUE.intValue() || srcSyscode.intValue() == BillEnumCollection.FromSystem.AP.VALUE.intValue() || srcSyscode.intValue() == BillEnumCollection.FromSystem.WBJHPT.VALUE.intValue() || srcSyscode.intValue() == BillEnumCollection.FromSystem.XTDJ.VALUE.intValue() || srcSyscode.intValue() == BillEnumCollection.FromSystem.FTS.VALUE.intValue()) {
            Log.getInstance((String)"ArapVOUtils").error((Object)srcSyscode);
            return false;
        }
        return true;
    }

    public static boolean isArapRedBill(BaseBillVO billvo, String topBilltype) {
        boolean isRed = false;
        String pk_billtype = billvo.getPk_billtype();
        if (!StringUtil.isEmptyWithTrim(pk_billtype) && pk_billtype.equals(topBilltype)) {
            isRed = true;
        }
        return isRed;
    }

    public static void resetMoneyBal(AggregatedValueObject[] bills) {
        String pk_billtype = (String)bills[0].getParentVO().getAttributeValue("pk_billtype");
        if ("F2".equals(pk_billtype) || "F3".equals(pk_billtype)) {
            List result = null;
            try {
                result = (List)new BaseDAO().executeQuery("select pk_recpaytype from fi_recpaytype where dr=0 and isverification<>'Y'", (ResultSetProcessor)new ColumnListProcessor());
            }
            catch (DAOException e) {
                ExceptionHandler.consume((Throwable)e);
            }
            for (AggregatedValueObject bill : bills) {
                CircularlyAccessibleValueObject[] bodyVOs;
                for (CircularlyAccessibleValueObject obj : bodyVOs = bill.getChildrenVO()) {
                    BaseItemVO bodyVO = (BaseItemVO)obj;
                    if (!result.contains(bodyVO.getPk_recpaytype())) continue;
                    bodyVO.setOccupationmny(UFDouble.ZERO_DBL);
                    bodyVO.setMoney_bal(UFDouble.ZERO_DBL);
                    bodyVO.setLocal_money_bal(UFDouble.ZERO_DBL);
                    bodyVO.setGroupbalance(UFDouble.ZERO_DBL);
                    bodyVO.setGlobalbalance(UFDouble.ZERO_DBL);
                }
            }
        }
    }

    public static void resetMoneyBal(AggregatedValueObject[] bills, AggregatedValueObject[] orginBills) {
        BaseItemVO[] items;
        String pk_billtype = (String)bills[0].getParentVO().getAttributeValue("pk_billtype");
        HashMap<String, BaseItemVO> orgingitemMap = new HashMap<String, BaseItemVO>();
        for (BaseItemVO item : items = (BaseItemVO[])orginBills[0].getChildrenVO()) {
            orgingitemMap.put(item.getPrimaryKey(), item);
        }
        if ("F2".equals(pk_billtype) || "F3".equals(pk_billtype)) {
            List result = null;
            try {
                result = (List)new BaseDAO().executeQuery("select pk_recpaytype from fi_recpaytype where dr=0 and isverification<>'Y'", (ResultSetProcessor)new ColumnListProcessor());
            }
            catch (DAOException e) {
                ExceptionHandler.consume((Throwable)e);
            }
            for (AggregatedValueObject bill : bills) {
                CircularlyAccessibleValueObject[] bodyVOs;
                for (CircularlyAccessibleValueObject obj : bodyVOs = bill.getChildrenVO()) {
                    BaseItemVO bodyVO = (BaseItemVO)obj;
                    if (result.contains(bodyVO.getPk_recpaytype())) {
                        bodyVO.setOccupationmny(UFDouble.ZERO_DBL);
                        bodyVO.setMoney_bal(UFDouble.ZERO_DBL);
                        bodyVO.setLocal_money_bal(UFDouble.ZERO_DBL);
                        bodyVO.setGroupbalance(UFDouble.ZERO_DBL);
                        bodyVO.setGlobalbalance(UFDouble.ZERO_DBL);
                        continue;
                    }
                    if (orgingitemMap.get(bodyVO.getPrimaryKey()) == null || !result.contains(((BaseItemVO)orgingitemMap.get(bodyVO.getPrimaryKey())).getPk_recpaytype()) || result.contains(bodyVO.getPk_recpaytype())) continue;
                    if ("F2".equals(pk_billtype)) {
                        bodyVO.setOccupationmny(bodyVO.getMoney_cr());
                        bodyVO.setMoney_bal(bodyVO.getMoney_cr());
                        bodyVO.setLocal_money_bal(bodyVO.getMoney_cr());
                        bodyVO.setGroupbalance(bodyVO.getMoney_cr());
                        bodyVO.setGlobalbalance(bodyVO.getMoney_cr());
                        continue;
                    }
                    if (!"F3".equals(pk_billtype)) continue;
                    bodyVO.setOccupationmny(bodyVO.getMoney_de());
                    bodyVO.setMoney_bal(bodyVO.getMoney_de());
                    bodyVO.setLocal_money_bal(bodyVO.getMoney_de());
                    bodyVO.setGroupbalance(bodyVO.getMoney_de());
                    bodyVO.setGlobalbalance(bodyVO.getMoney_de());
                }
            }
        }
    }
}


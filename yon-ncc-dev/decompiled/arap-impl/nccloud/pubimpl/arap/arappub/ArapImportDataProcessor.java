/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.bill.ArapBillPubUtil
 *  nc.bs.arap.bill.CalcMoneyUtil
 *  nc.bs.arap.plugin.ArapExpPfxxValidater
 *  nc.bs.arap.util.ArapVOUtils
 *  nc.bs.arap.util.BillMoneyVUtils
 *  nc.bs.dao.BaseDAO
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Logger
 *  nc.bs.pf.pub.PfDataCache
 *  nc.itf.pubbd.profitcenter.IProfitCenterPubService
 *  nc.itf.uap.pf.IPFConfig
 *  nc.jdbc.framework.processor.ArrayListProcessor
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.pubitf.accperiod.AccountCalendar
 *  nc.pubitf.arap.pub.ICurrentVersionService
 *  nc.pubitf.bd.accessor.GeneralAccessorFactory
 *  nc.pubitf.bd.accessor.IGeneralAccessor
 *  nc.pubitf.resa.factor.IFactorPubService
 *  nc.pubitf.resa.factor.chart.IFactorVersionQueryService
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.arap.pub.ArapConstant
 *  nc.vo.arap.pub.BillEnumCollection$ApproveStatus
 *  nc.vo.arap.pub.BillEnumCollection$BillSatus
 *  nc.vo.arap.pub.BillEnumCollection$Direction
 *  nc.vo.arap.pub.BillEnumCollection$FromSystem
 *  nc.vo.arap.pub.BillEnumCollection$InureSign
 *  nc.vo.arap.pub.BillEnumCollection$ObjType
 *  nc.vo.arap.pub.RateTypeInfoVO
 *  nc.vo.arap.tally.ObjTypeEnum
 *  nc.vo.arap.utils.OrgConsignationUtils
 *  nc.vo.arap.utils.StringUtil
 *  nc.vo.bd.accessor.IBDData
 *  nc.vo.bd.rate.util.RateReturnObject
 *  nc.vo.fi.pub.SqlUtils
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.profitcenter.ProfitCenterVO
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.BusinessRuntimeException
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDateTime
 *  nc.vo.resa.factor.FactorVO
 *  nccloud.bs.excel.IXChangeContext
 *  nccloud.bs.excel.plugin.AbstractImportProceeWithContext
 *  nccloud.commons.lang.StringUtils
 *  nccloud.pubitf.arap.arappub.IArapRatePubService
 *  nccloud.pubitf.arap.arappub.IImportBillService
 *  nccloud.vo.excel.excelconfig.XChangeConfigInfo
 *  org.apache.commons.collections4.CollectionUtils
 */
package nccloud.pubimpl.arap.arappub;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.arap.bill.CalcMoneyUtil;
import nc.bs.arap.plugin.ArapExpPfxxValidater;
import nc.bs.arap.util.ArapVOUtils;
import nc.bs.arap.util.BillMoneyVUtils;
import nc.bs.dao.BaseDAO;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.bs.pf.pub.PfDataCache;
import nc.itf.pubbd.profitcenter.IProfitCenterPubService;
import nc.itf.uap.pf.IPFConfig;
import nc.jdbc.framework.processor.ArrayListProcessor;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.pubitf.accperiod.AccountCalendar;
import nc.pubitf.arap.pub.ICurrentVersionService;
import nc.pubitf.bd.accessor.GeneralAccessorFactory;
import nc.pubitf.bd.accessor.IGeneralAccessor;
import nc.pubitf.resa.factor.IFactorPubService;
import nc.pubitf.resa.factor.chart.IFactorVersionQueryService;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.pub.RateTypeInfoVO;
import nc.vo.arap.tally.ObjTypeEnum;
import nc.vo.arap.utils.OrgConsignationUtils;
import nc.vo.arap.utils.StringUtil;
import nc.vo.bd.accessor.IBDData;
import nc.vo.bd.rate.util.RateReturnObject;
import nc.vo.fi.pub.SqlUtils;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.profitcenter.ProfitCenterVO;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.BusinessRuntimeException;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.resa.factor.FactorVO;
import nccloud.bs.excel.IXChangeContext;
import nccloud.bs.excel.plugin.AbstractImportProceeWithContext;
import nccloud.commons.lang.StringUtils;
import nccloud.pubitf.arap.arappub.IArapRatePubService;
import nccloud.pubitf.arap.arappub.IImportBillService;
import nccloud.vo.excel.excelconfig.XChangeConfigInfo;
import org.apache.commons.collections4.CollectionUtils;

public class ArapImportDataProcessor
extends AbstractImportProceeWithContext {
    private final String[] parentItemKey = new String[]{"isreded", "outbusitype", "payman", "paydate", "isonlinepay", "officialprintuser", "officialprintdate", "settlenum", "approvenote", "modifiedtime", "creationtime", "creator", "modifier", "isflowbill", "confirmuser", "billno", "billstatus", "operator", "approver", "approvestatus", "approvedate", "lastapproveid", "isnetpayready", "lastadjustuser", "signuser", "signyear", "signperiod", "settleflag", "settletype", "effectstatus", "effectuser", "effectdate", "src_syscode", "approvedate", "signuser", "signdate", "isforce", "commpayenddate", "commpaybegindate", "isfromindependent", "sddreversalflag", "reversalreason", "payreason", "failurereason", "sddreversaler", "sddreversaldate", "creditrefstd", "ts"};
    private final String[] childrenItemKey = new String[]{"payflag", "top_tradetype", "src_tradetype", "checkdirection", "transferdate", "src_itemid", "rowtype", "top_itemid", "top_billid", "billno", "coordflag", "ispaytermmodified", "pk_ssitem", "top_billtype", "transferflag", "src_billid", "src_billtype", "dstlsubcs", "isverifyfinished", "pausetransact", "payman", "paydate", "verifyfinisheddate", "innerorderno", "occupationmny", "commpaystatus", "commpaytype", "refuse_reason", "paystaus", "commpaytype", "commpaystatus", "refuse_reason", "commpayer", "isrefused", "confernum", "bankrelated_code", "payreason", "batchcode", "pk_batchcode", "settlemoney", "settlecurr", "ts", "transerial"};

    protected void processBillWithContext(Object vo, IXChangeContext changcontext) throws BusinessException {
        String key;
        Integer objtype;
        String pk_currtype;
        String supplier;
        String customer;
        HashMap<String, String> mapnum08;
        Object mapname08;
        HashMap<String, String> mapnum06;
        List<Object[]> result06;
        String checkelement;
        String subjcode;
        List result;
        Object keyValue;
        Set set;
        BaseAggVO bill = (BaseAggVO)vo;
        String pk_org = bill.getHeadVO().getPk_org();
        BaseItemVO[] childrenVO = (BaseItemVO[])bill.getChildrenVO();
        for (String key2 : this.parentItemKey) {
            bill.getHeadVO().setAttributeValue(key2, null);
        }
        HashSet<String> subjcodeSet = new HashSet<String>();
        HashSet<String> checknoSet = new HashSet<String>();
        HashSet<String> deptSet = new HashSet<String>();
        HashSet<String> deptVSet = new HashSet<String>();
        HashSet<String> checkelementSet = new HashSet<String>();
        HashSet<String> customerSet = new HashSet<String>();
        HashSet<String> customerVSet = new HashSet<String>();
        HashSet<String> supplierSet = new HashSet<String>();
        HashSet<String> supplierVSet = new HashSet<String>();
        HashSet<String> ordercubasdocSet = new HashSet<String>();
        HashSet<String> ordercubasdocVSet = new HashSet<String>();
        HashSet<String> payaccountSet06 = new HashSet<String>();
        HashSet<String> payaccountSet08 = new HashSet<String>();
        HashSet<String> recaccountSet06 = new HashSet<String>();
        HashSet<String> recaccountSet08 = new HashSet<String>();
        UFDate date = bill.getHeadVO().getBilldate();
        String pk_org_v = ((ICurrentVersionService)NCLocator.getInstance().lookup(ICurrentVersionService.class)).queryOrgPkVidByPKAndDate(pk_org, date);
        if (pk_org_v != null) {
            bill.getHeadVO().setPk_org_v(pk_org_v);
        }
        for (BaseItemVO itemVO : childrenVO) {
            String checkelementB;
            String subjcodeB;
            for (String key3 : this.childrenItemKey) {
                itemVO.setAttributeValue(key3, null);
            }
            if (StringUtils.isNotEmpty((CharSequence)itemVO.getCheckno())) {
                checknoSet.add(itemVO.getCheckno());
            }
            if (StringUtils.isNotEmpty((CharSequence)itemVO.getPk_deptid()) || StringUtils.isNotEmpty((CharSequence)itemVO.getSo_deptid()) || StringUtils.isNotEmpty((CharSequence)itemVO.getPu_deptid())) {
                deptSet.add(itemVO.getPk_deptid());
                deptSet.add(itemVO.getSo_deptid());
                deptSet.add(itemVO.getPu_deptid());
            }
            if (StringUtils.isNotEmpty((CharSequence)itemVO.getPk_deptid_v()) || StringUtils.isNotEmpty((CharSequence)itemVO.getSo_deptid_v()) || StringUtils.isNotEmpty((CharSequence)itemVO.getPu_deptid_v())) {
                deptVSet.add(itemVO.getPk_deptid_v());
                deptVSet.add(itemVO.getSo_deptid_v());
                deptVSet.add(itemVO.getPu_deptid_v());
            }
            if (StringUtils.isNotEmpty((CharSequence)(subjcodeB = itemVO.getSubjcode()))) {
                String[] objs = subjcodeB.split("\\\\");
                subjcodeSet.add(objs[0]);
            }
            if (StringUtils.isNotEmpty((CharSequence)(checkelementB = itemVO.getCheckelement()))) {
                String[] objs = checkelementB.split("\\\\");
                checkelementSet.add(objs[0]);
            }
            if (StringUtils.isNotEmpty((CharSequence)itemVO.getCustomer())) {
                customerSet.add(itemVO.getCustomer());
            }
            if (StringUtils.isNotEmpty((CharSequence)itemVO.getCustomer_v())) {
                customerVSet.add(itemVO.getCustomer_v());
            }
            if (StringUtils.isNotEmpty((CharSequence)itemVO.getSupplier())) {
                supplierSet.add(itemVO.getSupplier());
            }
            if (StringUtils.isNotEmpty((CharSequence)itemVO.getSupplier_v())) {
                supplierVSet.add(itemVO.getSupplier_v());
            }
            if (StringUtils.isNotEmpty((CharSequence)itemVO.getOrdercubasdoc())) {
                ordercubasdocSet.add(itemVO.getOrdercubasdoc());
            }
            if (!StringUtils.isNotEmpty((CharSequence)itemVO.getOrdercubasdoc_v())) continue;
            ordercubasdocVSet.add(itemVO.getOrdercubasdoc_v());
        }
        if (deptSet.size() > 0) {
            try {
                set = OrgConsignationUtils.getOrgConsignationList((String)pk_org);
                HashMap<String, String> map = new HashMap<String, String>();
                set.add(pk_org);
                List<Object[]> result2 = this.getDeptInfo(set, deptSet);
                if (CollectionUtils.isEmpty(result2)) {
                    throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1260", null, deptSet.toArray(new String[0])));
                }
                if (result2 != null && result2.size() > 0) {
                    for (Object[] r : result2) {
                        if (!map.containsKey(r[1])) {
                            map.put((String)r[1], (String)r[3]);
                        }
                        if (map.containsKey(r[0])) continue;
                        map.put((String)r[0], (String)r[3]);
                    }
                }
                if (StringUtils.isNotEmpty((CharSequence)bill.getHeadVO().getPk_deptid())) {
                    if (map.containsKey(bill.getHeadVO().getPk_deptid())) {
                        bill.getHeadVO().setPk_deptid((String)map.get(bill.getHeadVO().getPk_deptid()));
                    } else {
                        bill.getHeadVO().setPk_deptid(null);
                    }
                }
                if (StringUtils.isNotEmpty((CharSequence)bill.getHeadVO().getPu_deptid())) {
                    if (map.containsKey(bill.getHeadVO().getPu_deptid())) {
                        bill.getHeadVO().setPu_deptid((String)map.get(bill.getHeadVO().getPu_deptid()));
                    } else {
                        bill.getHeadVO().setPu_deptid(null);
                    }
                }
                if (StringUtils.isNotEmpty((CharSequence)bill.getHeadVO().getSo_deptid())) {
                    if (map.containsKey(bill.getHeadVO().getSo_deptid())) {
                        bill.getHeadVO().setSo_deptid((String)map.get(bill.getHeadVO().getSo_deptid()));
                    } else {
                        bill.getHeadVO().setSo_deptid(null);
                    }
                }
                for (BaseItemVO itemVO : childrenVO) {
                    String pk_deptid = itemVO.getPk_deptid();
                    String so_deptid = itemVO.getSo_deptid();
                    String pu_deptid = itemVO.getPu_deptid();
                    if (StringUtils.isNotEmpty((CharSequence)pk_deptid)) {
                        if (map.containsKey(pk_deptid)) {
                            itemVO.setPk_deptid((String)map.get(pk_deptid));
                        } else {
                            itemVO.setPk_deptid(null);
                        }
                    }
                    if (StringUtils.isNotEmpty((CharSequence)so_deptid)) {
                        if (map.containsKey(so_deptid)) {
                            itemVO.setSo_deptid((String)map.get(so_deptid));
                        } else {
                            itemVO.setSo_deptid(null);
                        }
                    }
                    if (!StringUtils.isNotEmpty((CharSequence)pu_deptid)) continue;
                    if (map.containsKey(pu_deptid)) {
                        itemVO.setPu_deptid((String)map.get(pu_deptid));
                        continue;
                    }
                    itemVO.setPu_deptid(null);
                }
            }
            catch (Exception e) {
                throw new BusinessRuntimeException(e.getMessage(), (Throwable)e);
            }
        }
        if (customerSet.size() > 0) {
            try {
                set = OrgConsignationUtils.getOrgConsignationList((String)pk_org);
                HashMap<String, String> map = new HashMap<String, String>();
                set.add(pk_org);
                List<Object[]> result3 = this.getCustomerInfo(set, customerSet);
                if (CollectionUtils.isEmpty(result3)) {
                    throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1294", null, customerSet.toArray(new String[0])));
                }
                if (result3 != null && result3.size() > 0) {
                    for (Object[] r : result3) {
                        if (!map.containsKey(r[1])) {
                            map.put((String)r[1], (String)r[3]);
                        }
                        if (map.containsKey(r[0])) continue;
                        map.put((String)r[0], (String)r[3]);
                    }
                }
                if (StringUtils.isNotEmpty((CharSequence)bill.getHeadVO().getCustomer()) && map.containsKey(bill.getHeadVO().getCustomer())) {
                    bill.getHeadVO().setCustomer((String)map.get(bill.getHeadVO().getCustomer()));
                }
                for (BaseItemVO itemVO : childrenVO) {
                    String customer2 = itemVO.getCustomer();
                    if (!StringUtils.isNotEmpty((CharSequence)customer2) || !map.containsKey(customer2)) continue;
                    itemVO.setCustomer((String)map.get(customer2));
                }
            }
            catch (Exception e) {
                throw new BusinessRuntimeException(e.getMessage(), (Throwable)e);
            }
        }
        if (supplierSet.size() > 0) {
            try {
                set = OrgConsignationUtils.getOrgConsignationList((String)pk_org);
                HashMap<String, String> map = new HashMap<String, String>();
                set.add(pk_org);
                List<Object[]> result4 = this.getSupplierInfo(set, supplierSet);
                if (CollectionUtils.isEmpty(result4)) {
                    throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1296", null, supplierSet.toArray(new String[0])));
                }
                if (result4 != null && result4.size() > 0) {
                    for (Object[] r : result4) {
                        if (!map.containsKey(r[1])) {
                            map.put((String)r[1], (String)r[3]);
                        }
                        if (map.containsKey(r[0])) continue;
                        map.put((String)r[0], (String)r[3]);
                    }
                }
                if (StringUtils.isNotEmpty((CharSequence)bill.getHeadVO().getSupplier()) && map.containsKey(bill.getHeadVO().getSupplier())) {
                    bill.getHeadVO().setSupplier((String)map.get(bill.getHeadVO().getSupplier()));
                }
                for (BaseItemVO itemVO : childrenVO) {
                    String supplier2 = itemVO.getSupplier();
                    if (!StringUtils.isNotEmpty((CharSequence)supplier2) || !map.containsKey(supplier2)) continue;
                    itemVO.setSupplier((String)map.get(supplier2));
                }
            }
            catch (Exception e) {
                throw new BusinessRuntimeException(e.getMessage(), (Throwable)e);
            }
        }
        if (ordercubasdocSet.size() > 0) {
            try {
                set = OrgConsignationUtils.getOrgConsignationList((String)pk_org);
                HashMap<String, String> map = new HashMap<String, String>();
                set.add(pk_org);
                List<Object[]> result5 = null;
                result5 = "ys".equals(bill.getHeadVO().getBillclass()) || "sk".equals(bill.getHeadVO().getBillclass()) || bill.getHeadVO().getObjtype() == 0 ? this.getCustomerInfo(set, ordercubasdocSet) : this.getSupplierInfo(set, ordercubasdocSet);
                if (CollectionUtils.isEmpty(result5)) {
                    throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1298", null, ordercubasdocSet.toArray(new String[0])));
                }
                if (result5 != null && result5.size() > 0) {
                    for (Object[] r : result5) {
                        if (!map.containsKey(r[1])) {
                            map.put((String)r[1], (String)r[3]);
                        }
                        if (map.containsKey(r[0])) continue;
                        map.put((String)r[0], (String)r[3]);
                    }
                }
                if (StringUtils.isNotEmpty((CharSequence)bill.getHeadVO().getOrdercubasdoc())) {
                    if (map.containsKey(bill.getHeadVO().getOrdercubasdoc())) {
                        bill.getHeadVO().setOrdercubasdoc((String)map.get(bill.getHeadVO().getOrdercubasdoc()));
                    } else {
                        bill.getHeadVO().setOrdercubasdoc(null);
                    }
                }
                for (BaseItemVO itemVO : childrenVO) {
                    String ordercubasdoc = itemVO.getOrdercubasdoc();
                    if (!StringUtils.isNotEmpty((CharSequence)ordercubasdoc) || !map.containsKey(ordercubasdoc)) continue;
                    itemVO.setOrdercubasdoc((String)map.get(ordercubasdoc));
                }
            }
            catch (Exception e) {
                throw new BusinessRuntimeException(e.getMessage(), (Throwable)e);
            }
        }
        if (deptVSet.size() > 0) {
            try {
                set = OrgConsignationUtils.getOrgConsignationList((String)pk_org);
                HashMap<String, String> map = new HashMap<String, String>();
                set.add(pk_org);
                List<Object[]> result6 = this.getDeptVInfo(set, deptVSet);
                if (CollectionUtils.isEmpty(result6)) {
                    throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1261", null, deptSet.toArray(new String[0])));
                }
                if (result6 != null && result6.size() > 0) {
                    for (Object[] r : result6) {
                        if (!map.containsKey(r[1])) {
                            map.put((String)r[1], (String)r[3]);
                        }
                        if (map.containsKey(r[0])) continue;
                        map.put((String)r[0], (String)r[3]);
                    }
                }
                if (map != null && map.size() > 0) {
                    keyValue = null;
                    for (String key4 : map.keySet()) {
                        keyValue = (String)map.get(key4);
                    }
                    if (StringUtils.isNotEmpty((CharSequence)bill.getHeadVO().getPk_deptid_v())) {
                        if (keyValue != null) {
                            bill.getHeadVO().setPk_deptid_v(keyValue);
                        } else {
                            bill.getHeadVO().setPk_deptid(null);
                        }
                    }
                    if (StringUtils.isNotEmpty((CharSequence)bill.getHeadVO().getPu_deptid_v())) {
                        if (map.containsKey(bill.getHeadVO().getPu_deptid_v())) {
                            bill.getHeadVO().setPu_deptid_v((String)map.get(bill.getHeadVO().getPu_deptid_v()));
                        } else {
                            bill.getHeadVO().setPu_deptid_v(null);
                        }
                    }
                    if (StringUtils.isNotEmpty((CharSequence)bill.getHeadVO().getSo_deptid_v())) {
                        if (map.containsKey(bill.getHeadVO().getSo_deptid_v())) {
                            bill.getHeadVO().setSo_deptid_v((String)map.get(bill.getHeadVO().getSo_deptid_v()));
                        } else {
                            bill.getHeadVO().setSo_deptid_v(null);
                        }
                    }
                    for (BaseItemVO itemVO : childrenVO) {
                        String pk_deptid_v = itemVO.getPk_deptid_v();
                        String so_deptid_v = itemVO.getSo_deptid_v();
                        String pu_deptid_v = itemVO.getPu_deptid_v();
                        if (StringUtils.isNotEmpty((CharSequence)pk_deptid_v)) {
                            if (map.containsKey(pk_deptid_v)) {
                                itemVO.setPk_deptid_v((String)map.get(pk_deptid_v));
                            } else {
                                itemVO.setPk_deptid(null);
                            }
                        }
                        if (StringUtils.isNotEmpty((CharSequence)so_deptid_v)) {
                            if (map.containsKey(so_deptid_v)) {
                                itemVO.setSo_deptid_v((String)map.get(so_deptid_v));
                            } else {
                                itemVO.setSo_deptid_v(null);
                            }
                        }
                        if (!StringUtils.isNotEmpty((CharSequence)pu_deptid_v)) continue;
                        if (map.containsKey(pu_deptid_v)) {
                            itemVO.setPu_deptid_v((String)map.get(pu_deptid_v));
                            continue;
                        }
                        itemVO.setPu_deptid_v(null);
                    }
                }
            }
            catch (Exception e) {
                throw new BusinessRuntimeException(e.getMessage(), (Throwable)e);
            }
        }
        if (customerVSet.size() > 0) {
            try {
                set = OrgConsignationUtils.getOrgConsignationList((String)pk_org);
                HashMap<String, String> map = new HashMap<String, String>();
                set.add(pk_org);
                List<Object[]> result7 = this.getCustomerVInfo(set, customerVSet);
                if (CollectionUtils.isEmpty(result7)) {
                    throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1295", null, customerVSet.toArray(new String[0])));
                }
                if (result7 != null && result7.size() > 0) {
                    for (Object[] r : result7) {
                        if (!map.containsKey(r[1])) {
                            map.put((String)r[1], (String)r[3]);
                        }
                        if (map.containsKey(r[0])) continue;
                        map.put((String)r[0], (String)r[3]);
                    }
                }
                if (map != null && map.size() > 0) {
                    keyValue = null;
                    for (String key5 : map.keySet()) {
                        keyValue = (String)map.get(key5);
                    }
                    if (StringUtils.isNotEmpty((CharSequence)bill.getHeadVO().getCustomer_v()) && keyValue != null) {
                        bill.getHeadVO().setCustomer_v((String)keyValue);
                    }
                    for (BaseItemVO itemVO : childrenVO) {
                        String customer_v = itemVO.getCustomer_v();
                        if (!StringUtils.isNotEmpty((CharSequence)customer_v) || !map.containsKey(customer_v)) continue;
                        itemVO.setCustomer_v((String)map.get(customer_v));
                    }
                }
            }
            catch (Exception e) {
                throw new BusinessRuntimeException(e.getMessage(), (Throwable)e);
            }
        }
        if (supplierVSet.size() > 0) {
            try {
                set = OrgConsignationUtils.getOrgConsignationList((String)pk_org);
                HashMap<String, String> map = new HashMap<String, String>();
                set.add(pk_org);
                List<Object[]> result8 = this.getSupplierVInfo(set, supplierVSet);
                if (CollectionUtils.isEmpty(result8)) {
                    throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1297", null, supplierVSet.toArray(new String[0])));
                }
                if (result8 != null && result8.size() > 0) {
                    for (Object[] r : result8) {
                        if (!map.containsKey(r[1])) {
                            map.put((String)r[1], (String)r[3]);
                        }
                        if (map.containsKey(r[0])) continue;
                        map.put((String)r[0], (String)r[3]);
                    }
                }
                if (map != null && map.size() > 0) {
                    keyValue = null;
                    for (String key6 : map.keySet()) {
                        keyValue = (String)map.get(key6);
                    }
                    if (StringUtils.isNotEmpty((CharSequence)bill.getHeadVO().getSupplier_v()) && keyValue != null) {
                        bill.getHeadVO().setSupplier_v((String)keyValue);
                    }
                    for (BaseItemVO itemVO : childrenVO) {
                        String supplier_v = itemVO.getSupplier_v();
                        if (!StringUtils.isNotEmpty((CharSequence)supplier_v) || !map.containsKey(supplier_v)) continue;
                        itemVO.setSupplier_v((String)map.get(supplier_v));
                    }
                }
            }
            catch (Exception e) {
                throw new BusinessRuntimeException(e.getMessage(), (Throwable)e);
            }
        }
        if (ordercubasdocVSet.size() > 0) {
            try {
                set = OrgConsignationUtils.getOrgConsignationList((String)pk_org);
                HashMap<String, String> map = new HashMap<String, String>();
                set.add(pk_org);
                List<Object[]> result9 = null;
                result9 = "ys".equals(bill.getHeadVO().getBillclass()) || "sk".equals(bill.getHeadVO().getBillclass()) || bill.getHeadVO().getObjtype() == 0 ? this.getCustomerVInfo(set, ordercubasdocVSet) : this.getSupplierVInfo(set, ordercubasdocVSet);
                if (CollectionUtils.isEmpty(result9)) {
                    throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1299", null, ordercubasdocVSet.toArray(new String[0])));
                }
                if (result9 != null && result9.size() > 0) {
                    for (Object[] r : result9) {
                        if (!map.containsKey(r[1])) {
                            map.put((String)r[1], (String)r[3]);
                        }
                        if (map.containsKey(r[0])) continue;
                        map.put((String)r[0], (String)r[3]);
                    }
                }
                if (map != null && map.size() > 0) {
                    keyValue = null;
                    for (String key7 : map.keySet()) {
                        keyValue = (String)map.get(key7);
                    }
                    if (StringUtils.isNotEmpty((CharSequence)bill.getHeadVO().getOrdercubasdoc_v())) {
                        if (keyValue != null) {
                            bill.getHeadVO().setOrdercubasdoc_v((String)keyValue);
                        } else {
                            bill.getHeadVO().setOrdercubasdoc_v(null);
                        }
                    }
                    for (BaseItemVO itemVO : childrenVO) {
                        String ordercubasdoc_v = itemVO.getOrdercubasdoc_v();
                        if (!StringUtils.isNotEmpty((CharSequence)ordercubasdoc_v)) continue;
                        if (map.containsKey(ordercubasdoc_v)) {
                            itemVO.setOrdercubasdoc_v((String)map.get(ordercubasdoc_v));
                            continue;
                        }
                        itemVO.setOrdercubasdoc_v(null);
                    }
                }
            }
            catch (Exception e) {
                throw new BusinessRuntimeException(e.getMessage(), (Throwable)e);
            }
        }
        if (checknoSet.size() > 0 && (result = (List)new BaseDAO().executeQuery("select pk_register,fbmbillno  from fbm_register where pk_org = '" + pk_org + "'and " + SqlUtils.getInStr((String)"fbmbillno", (String[])checknoSet.toArray(new String[0]), (boolean)true), (ResultSetProcessor)new ArrayListProcessor())) != null && result.size() > 0) {
            HashMap<String, String> map = new HashMap<String, String>();
            for (Object[] r : result) {
                map.put((String)r[1], (String)r[0]);
            }
            for (BaseItemVO itemVO : childrenVO) {
                String checkno = itemVO.getCheckno();
                if (!StringUtils.isNotEmpty((CharSequence)checkno)) continue;
                if (map.containsKey(checkno)) {
                    itemVO.setCheckno((String)map.get(checkno));
                    continue;
                }
                itemVO.setCheckno(checkno);
            }
        }
        if (StringUtils.isNotEmpty((CharSequence)(subjcode = bill.getHeadVO().getSubjcode()))) {
            String[] objs = subjcode.split("\\\\");
            subjcodeSet.add(objs[0]);
        }
        if (subjcodeSet.size() > 0) {
            IGeneralAccessor accountAccessor = GeneralAccessorFactory.getAccessor((String)"407748f1-1fe8-4f0d-880e-ae8b0960308f");
            IBDData[] datas = accountAccessor.getDocByCodes(pk_org, subjcodeSet.toArray(new String[0]));
            HashMap<String, String> map = new HashMap<String, String>();
            if (datas != null && datas.length > 0) {
                for (IBDData data : datas) {
                    map.put(data.getCode(), data.getPk());
                }
            }
            if (StringUtils.isNotEmpty((CharSequence)subjcode)) {
                String[] objs = subjcode.split("\\\\");
                if (map.containsKey(objs[0])) {
                    bill.getHeadVO().setSubjcode((String)map.get(objs[0]));
                } else {
                    bill.getHeadVO().setSubjcode(null);
                }
            }
            for (BaseItemVO itemVO : childrenVO) {
                String subjcodeB = itemVO.getSubjcode();
                if (!StringUtils.isNotEmpty((CharSequence)subjcodeB)) continue;
                String[] objs = subjcodeB.split("\\\\");
                if (map.containsKey(objs[0])) {
                    itemVO.setSubjcode((String)map.get(objs[0]));
                    continue;
                }
                itemVO.setSubjcode(null);
            }
        }
        if (StringUtils.isNotEmpty((CharSequence)(checkelement = bill.getHeadVO().getCheckelement()))) {
            String[] objs = checkelement.split("\\\\");
            checkelementSet.add(objs[0]);
        }
        IFactorVersionQueryService service = (IFactorVersionQueryService)NCLocator.getInstance().lookup(IFactorVersionQueryService.class);
        IFactorPubService factorPubService = (IFactorPubService)NCLocator.getInstance().lookup(IFactorPubService.class);
        for (BaseItemVO itemVo : childrenVO) {
            BaseItemVO[] factorChartVO;
            if (StringUtils.isEmpty((CharSequence)itemVo.getPk_pcorg()) || (factorChartVO = service.getFactorChartByNewProfitCenter(itemVo.getPk_pcorg(), bill.getHeadVO().getBilldate().toString(), new String[]{"pk_factorchart"})) == null) continue;
            HashMap chart2factorcode = new HashMap();
            HashSet<String> factorchartcodeSet = new HashSet<String>();
            String checkelementB = itemVo.getCheckelement();
            if (StringUtils.isNotEmpty((CharSequence)checkelementB)) {
                String[] objs = checkelementB.split("\\\\");
                factorchartcodeSet.add(objs[0]);
            }
            factorchartcodeSet.add(factorChartVO.getFactorchartcode());
            chart2factorcode.put(factorChartVO.getPk_factorchart(), factorchartcodeSet);
            Map factorMap = factorPubService.qryFactorVObyCode(chart2factorcode);
            if (factorMap == null || factorMap.values() == null || factorMap.values().size() <= 0) continue;
            for (Map fMap : factorMap.values()) {
                for (String key8 : factorchartcodeSet) {
                    FactorVO factorVO = (FactorVO)fMap.get(key8);
                    if (factorVO == null) continue;
                    itemVo.setCheckelement(factorVO.getPk_factorasoa());
                }
            }
        }
        bill.getHeadVO().setPk_group(InvocationInfoProxy.getInstance().getGroupId());
        XChangeConfigInfo xChangeConfigInfo = changcontext.getXChangeConfigInfo();
        String isinitFlg = "false";
        if (xChangeConfigInfo.getAttribute("isinit") != null) {
            isinitFlg = (String)xChangeConfigInfo.getAttribute("isinit");
        }
        BaseBillVO head = this.setHeaderDefault(bill.getHeadVO());
        String pk_billtype = head.getPk_billtype();
        for (BaseItemVO itemVO : childrenVO) {
            String[] objs;
            String payaccountB = itemVO.getPayaccount();
            String recaccountB = itemVO.getRecaccount();
            if (!StringUtils.isNoneEmpty((CharSequence[])new CharSequence[]{payaccountB}) && !StringUtils.isNoneEmpty((CharSequence[])new CharSequence[]{recaccountB})) continue;
            BaseItemVO[] objtype2 = itemVO.getObjtype();
            if (pk_billtype == null) continue;
            if (pk_billtype.equals("F0") || pk_billtype.equals("F2")) {
                if (!objtype2.equals(BillEnumCollection.ObjType.SUPPLIER.VALUE)) {
                    if (payaccountB == null || payaccountB.length() <= 0) continue;
                    objs = payaccountB.split("\\\\");
                    payaccountSet06.add(objs[0]);
                    continue;
                }
                if (payaccountB == null || payaccountB.length() <= 0) continue;
                objs = payaccountB.split("\\\\");
                payaccountSet08.add(objs[0]);
                continue;
            }
            if (!objtype2.equals(BillEnumCollection.ObjType.CUSTOMER.VALUE)) {
                if (recaccountB == null || recaccountB.length() <= 0) continue;
                objs = recaccountB.split("\\\\");
                recaccountSet08.add(objs[0]);
                continue;
            }
            if (recaccountB == null || recaccountB.length() <= 0) continue;
            objs = recaccountB.split("\\\\");
            recaccountSet06.add(objs[0]);
        }
        if (pk_billtype != null && (pk_billtype.equals("F0") || pk_billtype.equals("F2"))) {
            result06 = null;
            List<Object[]> result08 = null;
            if (payaccountSet06.size() > 0) {
                result06 = this.getAccount("1", payaccountSet06);
            }
            if (payaccountSet08.size() > 0) {
                result08 = this.getAccount("3", payaccountSet08);
            }
            HashMap<String, String> mapname06 = new HashMap<String, String>();
            mapnum06 = new HashMap<String, String>();
            if (result06 != null && result06.size() > 0) {
                for (Object[] r : result06) {
                    mapname06.put((String)r[1] + (String)r[2] + (String)r[3], (String)r[4]);
                    mapnum06.put((String)r[0] + (String)r[2] + (String)r[3], (String)r[4]);
                }
            }
            mapname08 = new HashMap();
            mapnum08 = new HashMap<String, String>();
            if (result08 != null && result08.size() > 0) {
                for (Object[] r : result08) {
                    mapname08.put((String)r[1] + (String)r[2] + (String)r[3], (String)r[4]);
                    mapnum08.put((String)r[0] + (String)r[2] + (String)r[3], (String)r[4]);
                }
            }
            for (BaseItemVO baseItemVO : childrenVO) {
                String payaccount = baseItemVO.getPayaccount();
                customer = baseItemVO.getCustomer();
                supplier = baseItemVO.getSupplier();
                pk_currtype = baseItemVO.getPk_currtype();
                objtype = baseItemVO.getObjtype();
                if (!StringUtils.isNotEmpty((CharSequence)payaccount)) continue;
                if (!objtype.equals(BillEnumCollection.ObjType.SUPPLIER.VALUE)) {
                    key = payaccount + customer + pk_currtype;
                    if (mapname06.containsKey(key)) {
                        baseItemVO.setPayaccount((String)mapname06.get(key));
                        continue;
                    }
                    if (!mapnum06.containsKey(key)) continue;
                    baseItemVO.setPayaccount((String)mapnum06.get(key));
                    continue;
                }
                key = payaccount + supplier + pk_currtype;
                if (mapname08.containsKey(key)) {
                    baseItemVO.setPayaccount((String)mapname08.get(key));
                    continue;
                }
                if (!mapnum08.containsKey(key)) continue;
                baseItemVO.setPayaccount((String)mapnum08.get(key));
            }
        } else if (pk_billtype != null && (pk_billtype.equals("F1") || pk_billtype.equals("F3"))) {
            result06 = null;
            List<Object[]> result08 = null;
            if (recaccountSet06.size() > 0) {
                result06 = this.getAccount("1", recaccountSet06);
            }
            if (recaccountSet08.size() > 0) {
                result08 = this.getAccount("3", recaccountSet08);
            }
            HashMap<String, String> mapname06 = new HashMap<String, String>();
            mapnum06 = new HashMap();
            if (result06 != null && result06.size() > 0) {
                for (Object[] r : result06) {
                    mapname06.put((String)r[1] + (String)r[2] + (String)r[3], (String)r[4]);
                    mapnum06.put((String)r[0] + (String)r[2] + (String)r[3], (String)r[4]);
                }
            }
            mapname08 = new HashMap();
            mapnum08 = new HashMap();
            if (result08 != null && result08.size() > 0) {
                for (Object[] r : result08) {
                    mapname08.put((String)r[1] + (String)r[2] + (String)r[3], (String)r[4]);
                    mapnum08.put((String)r[0] + (String)r[2] + (String)r[3], (String)r[4]);
                }
            }
            for (BaseItemVO baseItemVO : childrenVO) {
                String recaccount = baseItemVO.getRecaccount();
                customer = baseItemVO.getCustomer();
                supplier = baseItemVO.getSupplier();
                pk_currtype = baseItemVO.getPk_currtype();
                objtype = baseItemVO.getObjtype();
                if (!StringUtils.isNotEmpty((CharSequence)recaccount)) continue;
                if (!objtype.equals(BillEnumCollection.ObjType.CUSTOMER.VALUE)) {
                    key = recaccount + supplier + pk_currtype;
                    if (mapname08.containsKey(key)) {
                        baseItemVO.setRecaccount((String)mapname08.get(key));
                        continue;
                    }
                    if (!mapnum08.containsKey(key)) continue;
                    baseItemVO.setRecaccount((String)mapnum08.get(key));
                    continue;
                }
                key = recaccount + customer + pk_currtype;
                if (mapname06.containsKey(key)) {
                    baseItemVO.setRecaccount((String)mapname06.get(key));
                    continue;
                }
                if (!mapnum06.containsKey(key)) continue;
                baseItemVO.setRecaccount((String)mapnum06.get(key));
            }
        }
        if (head.getPk_billtype() == null) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0316"));
        }
        if (!(head.getPk_billtype().equals("F0") || head.getPk_billtype().equals("F1") || head.getPk_billtype().equals("F2") || head.getPk_billtype().equals("F3"))) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0650"));
        }
        if (head.getPk_tradetype() == null) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0649"));
        }
        if (head.getPk_group() == null) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0317"));
        }
        if (head.getPk_org() == null) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0318"));
        }
        try {
            IPFConfig ipf = (IPFConfig)NCLocator.getInstance().lookup(IPFConfig.class);
            if (!StringUtils.isEmpty((CharSequence)head.getPk_billtype()) && !StringUtils.isEmpty((CharSequence)head.getPk_tradetype())) {
                String pk_busitype;
                if (head.getCreator() == null) {
                    head.setCreator(InvocationInfoProxy.getInstance().getUserId());
                }
                if ((pk_busitype = ipf.retBusitypeCanStart(head.getPk_billtype(), head.getPk_tradetype(), head.getPk_org(), head.getCreator())) == null) {
                    throw new BusinessException("busitype is null");
                }
                head.setPk_busitype(pk_busitype);
            }
        }
        catch (Exception e) {
            String msg = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0127") + head.getPk_tradetype() + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0239") + head.getPk_tradetype() + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0240");
            throw new BusinessException(msg);
        }
        if (isinitFlg.equals("true")) {
            this.setInitBaseBillVO(bill);
        } else {
            head.setIsinit(UFBoolean.valueOf((boolean)false));
        }
        UFDate period = ArapBillPubUtil.getOrgModuleperiodDate((boolean)this.isARSysBilltype(head.getPk_billtype()), (String)head.getPk_org());
        if (period == null) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1254"));
        }
        boolean beforeFlg = head.getBilldate().before(period);
        if (isinitFlg.equals("true") && !beforeFlg) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0513"));
        }
        if (!isinitFlg.equals("true") && beforeFlg) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0579"));
        }
        if (head.getIsinit().booleanValue()) {
            boolean isAr = ArapBillPubUtil.isARSysBilltype((String)head.getPk_billtype());
            UFDate billdate = ArapBillPubUtil.getArapCreateDate((boolean)isAr, (String)head.getPk_org());
            if (null == billdate) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0007"));
            }
            if (head.getBilldate().after(billdate)) {
                head.setBilldate(billdate);
                for (BaseItemVO item : (BaseItemVO[])bill.getChildrenVO()) {
                    item.setBilldate(billdate);
                }
            }
        }
        this.setChildrenItem(bill);
        this.dealRateTypeField(bill);
        new CalcMoneyUtil().processImpMoney(bill);
        this.setBodyDefault(head, (BaseItemVO[])bill.getChildrenVO());
        BillMoneyVUtils.sumBodyToHead((BaseBillVO)head, (BaseItemVO[])((BaseItemVO[])bill.getChildrenVO()));
        ArapVOUtils.validateVoCopyRed((BaseAggVO)bill);
        ArapExpPfxxValidater.getInstance().validate(bill);
        ArrayList scommentList = new ArrayList();
        for (BaseItemVO item : childrenVO) {
            if (item.getAttributeValue("pk_pcorg_v") != null && item.getAttributeValue("pk_pcorg") == null) {
                ProfitCenterVO pcVo = ((IProfitCenterPubService)NCLocator.getInstance().lookup(IProfitCenterPubService.class)).queryProfitCenterByVID(item.getAttributeValue("pk_pcorg_v").toString());
                item.setAttributeValue("pk_pcorg", (Object)pcVo.getPrimaryKey());
            }
            List<Object[]> queryscoName = this.getScommentName((String)item.getAttributeValue("scomment"), (String)item.getAttributeValue("pk_org"));
            if (item.getAttributeValue("scomment") == null || queryscoName == null || queryscoName.size() < 1) continue;
            String scommentName = null;
            for (Object[] obj : queryscoName) {
                if (obj[0] == null) {
                    scommentName = (String)item.getAttributeValue("scomment");
                    continue;
                }
                scommentName = (String)obj[0];
            }
            item.setAttributeValue("scomment", scommentName);
        }
        ArapBillPubUtil.refreshChildVO2HeadVO((AggregatedValueObject[])new AggregatedValueObject[]{bill});
        ((IImportBillService)NCLocator.getInstance().lookup(IImportBillService.class)).importBill(head, bill);
    }

    private void dealRateTypeField(BaseAggVO bill) throws BusinessException {
        BaseBillVO head = bill.getHeadVO();
        String pk_ratetype = head.getPk_ratetype();
        if (!StringUtil.isEmptyWithTrim((String)pk_ratetype)) {
            Map reatTypeBypks = ((IArapRatePubService)NCLocator.getInstance().lookup(IArapRatePubService.class)).getReatTypeBypks(new String[]{pk_ratetype});
            Integer rateType = (Integer)reatTypeBypks.get(pk_ratetype);
            List<Integer> dataRateType = Arrays.asList(ArapConstant.RATE_TYPE_BUYING, ArapConstant.RATE_TYPE_SELLING, ArapConstant.RATE_TYPE_MIDDLE);
            if (!dataRateType.contains(rateType)) {
                return;
            }
        }
        RateTypeInfoVO infoVO = new RateTypeInfoVO();
        Integer obj = head.getObjtype();
        if (ObjTypeEnum.CUSTOMER.getCode() == obj.intValue()) {
            infoVO.setEditKey("customer");
        } else if (ObjTypeEnum.SUPPLIER.getCode() == obj.intValue()) {
            infoVO.setEditKey("supplier");
        } else {
            infoVO.setEditKey("customer");
        }
        infoVO.setPk_org(head.getPk_org());
        infoVO.setSrc_pk_currtype(head.getPk_currtype());
        infoVO.setPk_billtype(head.getPk_billtype());
        infoVO.setBilldate(head.getBilldate());
        infoVO.setCustomer(head.getCustomer());
        infoVO.setSupplier(head.getSupplier());
        infoVO.setPk_rateType(head.getPk_ratetype());
        RateReturnObject retvo = ((IArapRatePubService)NCLocator.getInstance().lookup(IArapRatePubService.class)).getRateVoByArapInfoVo(infoVO);
        head.setPk_ratetype(retvo.getPk_ratetype());
        head.setRatedate(retvo.getDate());
        head.setRate(retvo.getRate());
    }

    private List<Object[]> getAccount(String accclass, Set<String> accounts) throws BusinessException {
        StringBuffer sql = new StringBuffer();
        sql.append("select distinct accnum, accname, pk_cust, pk_currtype, pk_bankaccsub from (SELECT bd_bankaccsub.accnum, bd_bankaccsub.accname, pk_cust, enablestate, pk_currtype, bd_custbank.pk_bankaccbas AS pk_bankaccbas, bd_custbank.pk_bankaccsub AS pk_bankaccsub, bd_custbank.accclass FROM bd_bankaccbas, bd_bankaccsub, bd_custbank WHERE bd_bankaccbas.pk_bankaccbas = bd_bankaccsub.pk_bankaccbas AND bd_bankaccsub.pk_bankaccsub = bd_custbank.pk_bankaccsub AND bd_bankaccsub.pk_bankaccbas = bd_custbank.pk_bankaccbas AND bd_custbank.pk_bankaccsub != '~') bd_psnbankacctmp");
        sql.append(" where accclass ='" + accclass + "'");
        sql.append(" and enablestate = 2");
        sql.append(" and (" + SqlUtils.getInStr((String)"accnum", (String[])accounts.toArray(new String[0]), (boolean)true) + " or " + SqlUtils.getInStr((String)"accname", (String[])accounts.toArray(new String[0]), (boolean)true) + ")");
        List result = (List)new BaseDAO().executeQuery(sql.toString(), (ResultSetProcessor)new ArrayListProcessor());
        return result;
    }

    private List<Object[]> getScommentName(String scomment, String pk_org) throws BusinessException {
        if (scomment == null) {
            return null;
        }
        StringBuffer sql = new StringBuffer();
        sql.append("select summaryname from fipub_summary where code = '" + scomment + "'");
        sql.append(" and pk_org ='" + pk_org + "'");
        List reslist = (List)new BaseDAO().executeQuery(sql.toString(), (ResultSetProcessor)new ArrayListProcessor());
        return reslist;
    }

    private List<Object[]> getDeptInfo(Set<String> pk_orgs, Set<String> deptSet) throws BusinessException {
        StringBuffer sql = new StringBuffer();
        sql.append("select code, name, mnecode, pk_dept, pk_fatherorg, displayorder, innercode, pk_org from org_dept where 11 = 11 and ( enablestate = 2 ) ");
        sql.append(" and (" + SqlUtils.getInStr((String)"name", (String[])deptSet.toArray(new String[0]), (boolean)true));
        sql.append(" or " + SqlUtils.getInStr((String)"code", (String[])deptSet.toArray(new String[0]), (boolean)true));
        sql.append(" ) and ( pk_group = '" + InvocationInfoProxy.getInstance().getGroupId() + "' ");
        sql.append(" and ( pk_org in ( select pk_adminorg from org_admin_dept where pk_busirole in ");
        sql.append("  ( select pk_busichild from org_busi_func where " + SqlUtils.getInStr((String)"pk_org", (String[])pk_orgs.toArray(new String[0]), (boolean)true) + " ) and enablestate = 2 and isnull ( pk_dept, '~' ) = '~' )");
        sql.append(" or pk_dept in ( select pk_dept from org_admin_dept where pk_busirole in ( select pk_busichild from org_busi_func where " + SqlUtils.getInStr((String)"pk_org", (String[])pk_orgs.toArray(new String[0]), (boolean)true) + " ) and enablestate = 2 )");
        sql.append(" or " + SqlUtils.getInStr((String)"pk_org", (String[])pk_orgs.toArray(new String[0]), (boolean)true) + " ) ) order by displayorder, code");
        List result = (List)new BaseDAO().executeQuery(sql.toString(), (ResultSetProcessor)new ArrayListProcessor());
        return result;
    }

    private List<Object[]> getDeptVInfo(Set<String> pk_orgs, Set<String> deptVSet) throws BusinessException {
        StringBuffer sql = new StringBuffer();
        TimeZone clientTimeZone = TimeZone.getTimeZone(InvocationInfoProxy.getInstance().getTimeZone());
        SimpleDateFormat bf = new SimpleDateFormat("yyyy-MM-dd");
        String date = new UFDate(InvocationInfoProxy.getInstance().getBizDateTime()).toString(clientTimeZone, (DateFormat)bf) + " 23:59:59";
        sql.append("select code, name, mnecode, pk_vid, pk_dept, pk_fatherorg, displayorder, pk_org from org_dept_v where 11 = 11 and ( enablestate = 2 ) ");
        sql.append(" and (" + SqlUtils.getInStr((String)"name", (String[])deptVSet.toArray(new String[0]), (boolean)true));
        sql.append(" or " + SqlUtils.getInStr((String)"code", (String[])deptVSet.toArray(new String[0]), (boolean)true));
        sql.append(" ) and ( pk_group = '" + InvocationInfoProxy.getInstance().getGroupId() + "' ");
        sql.append(" and vstartdate = isnull ( ( select max ( a.vstartdate ) vstartdate from org_dept_v a ");
        sql.append("  where vstartdate <= '" + date + "' and a.pk_dept = org_dept_v.pk_dept ), ");
        sql.append(" ( select min ( a.vstartdate ) vstartdate from org_dept_v a where vstartdate > '" + date + "' and a.pk_dept = org_dept_v.pk_dept ) ) ");
        sql.append(" and org_dept_v.enablestate = 2 and ( pk_org in ( select pk_adminorg from org_admin_dept where pk_busirole in ( select pk_busichild from org_busi_func where ");
        sql.append(SqlUtils.getInStr((String)"pk_org", (String[])pk_orgs.toArray(new String[0]), (boolean)true) + ") and isnull ( pk_dept, '~' ) = '~' ) ");
        sql.append(" or pk_dept in ( select pk_dept from org_admin_dept where pk_busirole in ");
        sql.append(" ( select pk_busichild from org_busi_func where " + SqlUtils.getInStr((String)"pk_org", (String[])pk_orgs.toArray(new String[0]), (boolean)true) + " ) )");
        sql.append("  or " + SqlUtils.getInStr((String)"pk_org", (String[])pk_orgs.toArray(new String[0]), (boolean)true) + " ) ) order by displayorder, code");
        List result = (List)new BaseDAO().executeQuery(sql.toString(), (ResultSetProcessor)new ArrayListProcessor());
        return result;
    }

    private BaseBillVO setHeaderDefault(BaseBillVO header) throws BusinessException {
        Integer ZERO = 0;
        header.setBillstatus(BillEnumCollection.BillSatus.SAVE.VALUE);
        header.setEffectstatus(BillEnumCollection.InureSign.NOINURE.VALUE);
        header.setApprovestatus(BillEnumCollection.ApproveStatus.NOSTATE.VALUE);
        header.setDr(ZERO);
        header.setSrc_syscode(BillEnumCollection.FromSystem.WBJHPT.VALUE);
        header.setCreationtime(new UFDateTime());
        header.setCoordflag(null);
        String userId = InvocationInfoProxy.getInstance().getUserId();
        header.setCreator(userId);
        header.setBillmaker(userId);
        header.setPk_billtype(this.getBillType());
        header.setPk_fiorg(header.getPk_org());
        header.setPk_fiorg_v(header.getPk_org_v());
        header.setSett_org(header.getPk_org());
        header.setSett_org_v(header.getPk_org_v());
        if (header.getPk_billtype().equals("F0")) {
            header.setBillclass("ys");
            header.setPk_billtype("F0");
            header.setSrc_syscode(BillEnumCollection.FromSystem.AR.VALUE);
            header.setSyscode(BillEnumCollection.FromSystem.AR.VALUE);
        } else if (header.getPk_billtype().equals("F1")) {
            header.setBillclass("yf");
            header.setPk_billtype("F1");
            header.setSrc_syscode(BillEnumCollection.FromSystem.AP.VALUE);
            header.setSyscode(BillEnumCollection.FromSystem.AP.VALUE);
        } else if (header.getPk_billtype().equals("F2")) {
            header.setBillclass("sk");
            header.setPk_billtype("F2");
            header.setSrc_syscode(BillEnumCollection.FromSystem.AR.VALUE);
            header.setSyscode(BillEnumCollection.FromSystem.AR.VALUE);
        } else if (header.getPk_billtype().equals("F3")) {
            header.setBillclass("fk");
            header.setPk_billtype("F3");
            header.setSrc_syscode(BillEnumCollection.FromSystem.AP.VALUE);
            header.setSyscode(BillEnumCollection.FromSystem.AP.VALUE);
        }
        try {
            AccountCalendar ac = AccountCalendar.getInstanceByPk_org((String)header.getPk_org());
            ac.setDate(header.getBilldate());
            header.setBillyear(ac.getYearVO().getPeriodyear());
            header.setBillperiod(ac.getMonthVO().getAccperiodmth());
        }
        catch (BusinessException ex) {
            Logger.error((Object)ex.getMessage());
        }
        header.setPk_tradetypeid(PfDataCache.getBillTypeInfo((String)header.getPk_group(), (String)header.getPk_tradetype()).getPk_billtypeid());
        return header;
    }

    public String getBillType() {
        return "";
    }

    void setChildrenItem(BaseAggVO bill) {
        BaseBillVO headvo = bill.getHeadVO();
        String pk_billtype = bill.getHeadVO().getPk_billtype();
        for (BaseItemVO childrenVO : bill.getItems()) {
            if ("F0".equals(pk_billtype)) {
                childrenVO.setDirection(BillEnumCollection.Direction.DEBIT.VALUE);
                childrenVO.setBillclass("ys");
                childrenVO.setPk_billtype("F0");
            } else if ("F1".equals(pk_billtype)) {
                childrenVO.setDirection(BillEnumCollection.Direction.CREDIT.VALUE);
                childrenVO.setBillclass("yf");
                childrenVO.setPk_billtype("F1");
            } else if ("F2".equals(pk_billtype)) {
                childrenVO.setDirection(BillEnumCollection.Direction.CREDIT.VALUE);
                childrenVO.setBillclass("sk");
                childrenVO.setPk_billtype("F2");
            } else if ("F3".equals(pk_billtype)) {
                childrenVO.setDirection(BillEnumCollection.Direction.DEBIT.VALUE);
                childrenVO.setBillclass("fk");
                childrenVO.setPk_billtype("F3");
            }
            childrenVO.setPk_org(headvo.getPk_org());
            childrenVO.setPk_group(headvo.getPk_group());
            childrenVO.setBilldate(headvo.getBilldate());
            if (headvo.getBusidate() == null) {
                childrenVO.setBusidate(headvo.getBilldate());
            } else {
                childrenVO.setBusidate(headvo.getBusidate());
            }
            childrenVO.setPk_tradetype(headvo.getPk_tradetype());
            childrenVO.setPk_tradetypeid(headvo.getPk_tradetypeid());
            childrenVO.setSett_org(headvo.getSett_org());
        }
    }

    void setBodyDefault(BaseBillVO head, BaseItemVO[] items) throws BusinessException {
        int len = items == null ? 0 : items.length;
        for (int i = 0; i < len; ++i) {
            this.setBodyDefault(head, items[i]);
        }
    }

    void setBodyDefault(BaseBillVO head, BaseItemVO item) throws BusinessException {
        item.setPk_org(head.getPk_org());
        item.setDr(Integer.valueOf(0));
        item.setPk_tradetypeid(PfDataCache.getBillTypeInfo((String)head.getPk_group(), (String)head.getPk_tradetype()).getPk_billtypeid());
        item.setCoordflag(null);
    }

    public boolean isARSysBilltype(String pk_billtype) {
        if (StringUtils.isEmpty((CharSequence)pk_billtype)) {
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

    private void setInitBaseBillVO(BaseAggVO bill) {
        BaseBillVO head = bill.getHeadVO();
        head.setIsinit(UFBoolean.valueOf((boolean)true));
        head.setApprovestatus(Integer.valueOf(1));
        head.setApprovedate(new UFDateTime(head.getBilldate().getMillis()));
        head.setEffectdate(new UFDate(head.getBilldate().getMillis()));
        head.setEffectstatus(BillEnumCollection.InureSign.OKINURE.VALUE);
        head.setBillstatus(BillEnumCollection.BillSatus.AUDIT.VALUE);
        String userId = InvocationInfoProxy.getInstance().getUserId();
        head.setApprover(userId);
        for (BaseItemVO itemVO : bill.getItems()) {
            itemVO.setChecktype(null);
            itemVO.setCheckno(null);
        }
    }

    private List<Object[]> getCustomerInfo(Set<String> pk_orgs, Set<String> customerSet) throws BusinessException {
        StringBuffer sql = new StringBuffer();
        sql.append("select code, name , mnecode,pk_customer, pk_org from bd_customer  where   11 = 11 and  ( enablestate = 2 )");
        sql.append("  and  ( " + SqlUtils.getInStr((String)"name", (String[])customerSet.toArray(new String[0]), (boolean)true));
        sql.append("  or  " + SqlUtils.getInStr((String)"code", (String[])customerSet.toArray(new String[0]), (boolean)true));
        sql.append("  or  " + SqlUtils.getInStr((String)"pk_customer", (String[])customerSet.toArray(new String[0]), (boolean)true) + " )");
        List result = (List)new BaseDAO().executeQuery(sql.toString(), (ResultSetProcessor)new ArrayListProcessor());
        return result;
    }

    private List<Object[]> getSupplierInfo(Set<String> pk_orgs, Set<String> supplierSet) throws BusinessException {
        StringBuffer sql = new StringBuffer();
        sql.append("select code, name , mnecode,pk_supplier, pk_org from bd_supplier where 11 = 11  and ( enablestate = 2 )");
        sql.append("  and  ( " + SqlUtils.getInStr((String)"name", (String[])supplierSet.toArray(new String[0]), (boolean)true));
        sql.append("  or  " + SqlUtils.getInStr((String)"code", (String[])supplierSet.toArray(new String[0]), (boolean)true));
        sql.append("  or  " + SqlUtils.getInStr((String)"pk_supplier", (String[])supplierSet.toArray(new String[0]), (boolean)true) + " )");
        List result = (List)new BaseDAO().executeQuery(sql.toString(), (ResultSetProcessor)new ArrayListProcessor());
        return result;
    }

    private List<Object[]> getCustomerVInfo(Set<String> pk_orgs, Set<String> customerVSet) throws BusinessException {
        StringBuffer sql = new StringBuffer();
        TimeZone clientTimeZone = TimeZone.getTimeZone(InvocationInfoProxy.getInstance().getTimeZone());
        SimpleDateFormat bf = new SimpleDateFormat("yyyy-MM-dd");
        String date = new UFDate(InvocationInfoProxy.getInstance().getBizDateTime()).toString(clientTimeZone, (DateFormat)bf) + " 23:59:59";
        sql.append("select code, name , mnecode,pk_customer_v,pk_customer, pk_org from bd_customer_v where 11 = 11  and ( enablestate = 2 )");
        sql.append(" and (" + SqlUtils.getInStr((String)"name", (String[])customerVSet.toArray(new String[0]), (boolean)true));
        sql.append(" or " + SqlUtils.getInStr((String)"code", (String[])customerVSet.toArray(new String[0]), (boolean)true));
        sql.append(" or " + SqlUtils.getInStr((String)"pk_customer_v", (String[])customerVSet.toArray(new String[0]), (boolean)true));
        sql.append(" and begindate<='" + date + "' and enddate>'" + date + "' )");
        List result = (List)new BaseDAO().executeQuery(sql.toString(), (ResultSetProcessor)new ArrayListProcessor());
        return result;
    }

    private List<Object[]> getSupplierVInfo(Set<String> pk_orgs, Set<String> supplierVSet) throws BusinessException {
        StringBuffer sql = new StringBuffer();
        TimeZone clientTimeZone = TimeZone.getTimeZone(InvocationInfoProxy.getInstance().getTimeZone());
        SimpleDateFormat bf = new SimpleDateFormat("yyyy-MM-dd");
        String date = new UFDate(InvocationInfoProxy.getInstance().getBizDateTime()).toString(clientTimeZone, (DateFormat)bf) + " 23:59:59";
        sql.append("select code, name , mnecode,pk_supplier_v,pk_supplier, pk_org from bd_supplier_v where 11 = 11  and  ( enablestate = 2 )");
        sql.append(" and (" + SqlUtils.getInStr((String)"name", (String[])supplierVSet.toArray(new String[0]), (boolean)true));
        sql.append(" or " + SqlUtils.getInStr((String)"code", (String[])supplierVSet.toArray(new String[0]), (boolean)true));
        sql.append(" or " + SqlUtils.getInStr((String)"pk_supplier_v", (String[])supplierVSet.toArray(new String[0]), (boolean)true));
        sql.append(" and begindate<='" + date + "' and enddate>'" + date + "' )");
        List result = (List)new BaseDAO().executeQuery(sql.toString(), (ResultSetProcessor)new ArrayListProcessor());
        return result;
    }
}


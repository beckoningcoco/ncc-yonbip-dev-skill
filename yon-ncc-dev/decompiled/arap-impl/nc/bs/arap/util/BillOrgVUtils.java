/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.dao.BaseDAO
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Log
 *  nc.itf.org.IOrgVersionQryService
 *  nc.itf.pubbd.profitcenter.IProfitCenterPubService
 *  nc.itf.uap.IUAPQueryBS
 *  nc.jdbc.framework.processor.ArrayListProcessor
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.util.fi.pub.SqlUtils
 *  nc.vo.bd.cust.CustomerVersionVO
 *  nc.vo.bd.supplier.SupplierVersionVO
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.profitcenter.ProfitcenterVersionVO
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.vorg.DeptVersionVO
 *  nc.vo.vorg.OrgVersionVO
 *  nccloud.commons.lang.ArrayUtils
 *  nccloud.commons.lang.StringUtils
 */
package nc.bs.arap.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import nc.bs.dao.BaseDAO;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Log;
import nc.itf.org.IOrgVersionQryService;
import nc.itf.pubbd.profitcenter.IProfitCenterPubService;
import nc.itf.uap.IUAPQueryBS;
import nc.jdbc.framework.processor.ArrayListProcessor;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.util.fi.pub.SqlUtils;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.bd.cust.CustomerVersionVO;
import nc.vo.bd.supplier.SupplierVersionVO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.profitcenter.ProfitcenterVersionVO;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDate;
import nc.vo.vorg.DeptVersionVO;
import nc.vo.vorg.OrgVersionVO;
import nccloud.commons.lang.ArrayUtils;
import nccloud.commons.lang.StringUtils;

public final class BillOrgVUtils {
    public static void setOrgV(AggregatedValueObject[] bills) throws BusinessException {
        BaseAggVO vo;
        String sql;
        if (ArrayUtils.isEmpty((Object[])bills)) {
            return;
        }
        IOrgVersionQryService query = (IOrgVersionQryService)NCLocator.getInstance().lookup(IOrgVersionQryService.class);
        HashMap<String, OrgVersionVO[]> orgVersionMap = new HashMap<String, OrgVersionVO[]>();
        HashMap<String, DeptVersionVO[]> depVerionMap = new HashMap<String, DeptVersionVO[]>();
        HashMap<String, CustomerVersionVO[]> customerVerionMap = new HashMap<String, CustomerVersionVO[]>();
        HashMap<String, SupplierVersionVO[]> supplierVerionMap = new HashMap<String, SupplierVersionVO[]>();
        HashSet<String> deptid_v = new HashSet<String>();
        HashSet<String> customer_v = new HashSet<String>();
        HashSet<String> supplier_v = new HashSet<String>();
        HashSet<String> ordercubasdoc_v = new HashSet<String>();
        HashMap<String, String> deptidList = new HashMap<String, String>();
        HashMap<String, String> customerList = new HashMap<String, String>();
        HashMap<String, String> supplierList = new HashMap<String, String>();
        HashMap<String, String> ordercubasdocList = new HashMap<String, String>();
        for (AggregatedValueObject bill : bills) {
            BaseItemVO[] childrenVOs;
            BillOrgVUtils.setOrg_v(query, orgVersionMap, bill, "pk_org", "pk_org_v");
            BillOrgVUtils.setOrg_v(query, orgVersionMap, bill, "sett_org", "sett_org_v");
            BillOrgVUtils.setOrg_v(query, orgVersionMap, bill, "so_org", "so_org_v");
            BillOrgVUtils.setOrg_v(query, orgVersionMap, bill, "pu_org", "pu_org_v");
            BillOrgVUtils.setOrg_v(query, orgVersionMap, bill, "pk_pcorg", "pk_pcorg_v");
            BillOrgVUtils.setDept_v(query, depVerionMap, bill, "pk_deptid", "pk_deptid_v");
            BillOrgVUtils.setDept_v(query, depVerionMap, bill, "pu_deptid", "pu_deptid_v");
            BillOrgVUtils.setDept_v(query, depVerionMap, bill, "so_deptid", "so_deptid_v");
            BillOrgVUtils.setCustomer_v(customerVerionMap, bill, "customer", "customer_v");
            BillOrgVUtils.setSupplier_v(supplierVerionMap, bill, "supplier", "supplier_v");
            if ("ys".equals(bill.getParentVO().getAttributeValue("billclass")) || "sk".equals(bill.getParentVO().getAttributeValue("billclass")) || "zs".equals(bill.getParentVO().getAttributeValue("billclass"))) {
                BillOrgVUtils.setCustomer_v(customerVerionMap, bill, "ordercubasdoc", "ordercubasdoc_v");
            } else {
                BillOrgVUtils.setSupplier_v(supplierVerionMap, bill, "ordercubasdoc", "ordercubasdoc_v");
            }
            BaseAggVO vo2 = (BaseAggVO)bill;
            for (BaseItemVO item : childrenVOs = (BaseItemVO[])vo2.getChildrenVO()) {
                if (!StringUtil.isEmptyWithTrim((String)item.getPk_deptid_v())) {
                    deptid_v.add(item.getPk_deptid_v());
                }
                if (!StringUtil.isEmptyWithTrim((String)item.getCustomer_v())) {
                    customer_v.add(item.getCustomer_v());
                }
                if (!StringUtil.isEmptyWithTrim((String)item.getSupplier_v())) {
                    supplier_v.add(item.getSupplier_v());
                }
                if (StringUtil.isEmptyWithTrim((String)item.getOrdercubasdoc_v())) continue;
                ordercubasdoc_v.add(item.getOrdercubasdoc_v());
            }
        }
        if (deptid_v.size() > 0) {
            sql = "select pk_vid,pk_dept from org_dept_v where " + SqlUtils.getInStr((String)"pk_vid", (String[])deptid_v.toArray(new String[deptid_v.size()]));
            ArrayList arr = (ArrayList)((IUAPQueryBS)NCLocator.getInstance().lookup(IUAPQueryBS.class)).executeQuery(sql, (ResultSetProcessor)new ArrayListProcessor());
            for (Object[] tmp : arr) {
                deptidList.put((String)tmp[0], (String)tmp[1]);
            }
            for (AggregatedValueObject bill : bills) {
                vo = (BaseAggVO)bill;
                BaseItemVO[] childrenVOs = (BaseItemVO[])vo.getChildrenVO();
                String tmpdept_v = "";
                String tmpdept = "";
                for (BaseItemVO item : childrenVOs) {
                    String pk_dept_v = (String)item.getAttributeValue("pk_dept_v");
                    if (StringUtil.isEmptyWithTrim((String)pk_dept_v)) continue;
                    item.setAttributeValue("pk_dept", deptidList.get(pk_dept_v));
                    if (!StringUtil.isEmptyWithTrim((String)tmpdept_v)) continue;
                    tmpdept_v = pk_dept_v;
                    tmpdept = (String)deptidList.get(pk_dept_v);
                }
                vo.getParentVO().setAttributeValue("pk_dept_v", (Object)tmpdept_v);
                vo.getParentVO().setAttributeValue("pk_dept", (Object)tmpdept);
            }
        }
        if (customer_v.size() > 0) {
            sql = "select pk_customer_v,pk_customer from bd_customer_v where " + SqlUtils.getInStr((String)"pk_customer_v", (String[])customer_v.toArray(new String[customer_v.size()]));
            ArrayList arr = (ArrayList)((IUAPQueryBS)NCLocator.getInstance().lookup(IUAPQueryBS.class)).executeQuery(sql, (ResultSetProcessor)new ArrayListProcessor());
            for (Object[] tmp : arr) {
                customerList.put((String)tmp[0], (String)tmp[1]);
            }
            for (AggregatedValueObject bill : bills) {
                vo = (BaseAggVO)bill;
                BaseItemVO[] childrenVOs = (BaseItemVO[])vo.getChildrenVO();
                String tmpcustomer_v = "";
                String tmpcustomer = "";
                for (BaseItemVO item : childrenVOs) {
                    String customer_v1 = (String)item.getAttributeValue("customer_v");
                    if (StringUtil.isEmptyWithTrim((String)customer_v1)) continue;
                    item.setAttributeValue("customer", customerList.get(customer_v1));
                    if (!StringUtil.isEmptyWithTrim((String)tmpcustomer_v)) continue;
                    tmpcustomer_v = customer_v1;
                    tmpcustomer = (String)customerList.get(customer_v1);
                }
                vo.getParentVO().setAttributeValue("customer_v", (Object)tmpcustomer_v);
                vo.getParentVO().setAttributeValue("customer", (Object)tmpcustomer);
            }
        }
        if (supplier_v.size() > 0) {
            sql = "select pk_supplier_v,pk_supplier from bd_supplier_v where " + SqlUtils.getInStr((String)"pk_supplier_v", (String[])supplier_v.toArray(new String[supplier_v.size()]));
            ArrayList arr = (ArrayList)((IUAPQueryBS)NCLocator.getInstance().lookup(IUAPQueryBS.class)).executeQuery(sql, (ResultSetProcessor)new ArrayListProcessor());
            for (Object[] tmp : arr) {
                supplierList.put((String)tmp[0], (String)tmp[1]);
            }
            for (AggregatedValueObject bill : bills) {
                vo = (BaseAggVO)bill;
                BaseItemVO[] childrenVOs = (BaseItemVO[])vo.getChildrenVO();
                String tmpsupplier_v = "";
                String tmpsupplier = "";
                for (BaseItemVO item : childrenVOs) {
                    String supplier_v1 = (String)item.getAttributeValue("supplier_v");
                    if (StringUtil.isEmptyWithTrim((String)supplier_v1)) continue;
                    item.setAttributeValue("supplier", supplierList.get(supplier_v1));
                    if (!StringUtil.isEmptyWithTrim((String)tmpsupplier_v)) continue;
                    tmpsupplier_v = supplier_v1;
                    tmpsupplier = (String)supplierList.get(supplier_v1);
                }
                vo.getParentVO().setAttributeValue("supplier_v", (Object)tmpsupplier_v);
                vo.getParentVO().setAttributeValue("supplier", (Object)tmpsupplier);
            }
        }
        if (ordercubasdoc_v.size() > 0) {
            for (AggregatedValueObject bill : bills) {
                String sql2 = "";
                String billclass = (String)bill.getParentVO().getAttributeValue("billclass");
                sql2 = "ys".equals(billclass) || "sk".equals(billclass) || "zs".equals(billclass) ? "select pk_customer_v,pk_customer from bd_customer_v where " + SqlUtils.getInStr((String)"pk_customer_v", (String[])ordercubasdoc_v.toArray(new String[ordercubasdoc_v.size()])) : "select pk_supplier_v,pk_supplier from bd_supplier_v where " + SqlUtils.getInStr((String)"pk_supplier_v", (String[])ordercubasdoc_v.toArray(new String[ordercubasdoc_v.size()]));
                ArrayList arr = (ArrayList)((IUAPQueryBS)NCLocator.getInstance().lookup(IUAPQueryBS.class)).executeQuery(sql2, (ResultSetProcessor)new ArrayListProcessor());
                for (Object[] tmp : arr) {
                    ordercubasdocList.put((String)tmp[0], (String)tmp[1]);
                }
                BaseAggVO vo3 = (BaseAggVO)bill;
                BaseItemVO[] childrenVOs = (BaseItemVO[])vo3.getChildrenVO();
                String tmpordercubasdoc_v = "";
                String tmpordercubasdoc = "";
                for (BaseItemVO item : childrenVOs) {
                    String ordercubasdoc_v1 = (String)item.getAttributeValue("ordercubasdoc_v");
                    if (StringUtil.isEmptyWithTrim((String)ordercubasdoc_v1)) continue;
                    item.setAttributeValue("ordercubasdoc", ordercubasdocList.get(ordercubasdoc_v1));
                    if (!StringUtil.isEmptyWithTrim((String)tmpordercubasdoc_v)) continue;
                    tmpordercubasdoc_v = ordercubasdoc_v1;
                    tmpordercubasdoc = (String)ordercubasdocList.get(ordercubasdoc_v1);
                }
                vo3.getParentVO().setAttributeValue("ordercubasdoc_v", (Object)tmpordercubasdoc_v);
                vo3.getParentVO().setAttributeValue("ordercubasdoc", (Object)tmpordercubasdoc);
            }
        }
    }

    private static void setOrg_v(IOrgVersionQryService query, Map<String, OrgVersionVO[]> versionMap, AggregatedValueObject bill, String pkOrgField, String pkOrg_VField) throws BusinessException {
        BaseAggVO vo = (BaseAggVO)bill;
        String pk_org = (String)bill.getParentVO().getAttributeValue(pkOrgField);
        if ((StringUtils.isEmpty((CharSequence)pk_org) || StringUtils.isNotEmpty((CharSequence)((String)bill.getParentVO().getAttributeValue(pkOrg_VField)))) && (StringUtils.isEmpty((CharSequence)(pk_org = (String)vo.getItems()[0].getAttributeValue(pkOrgField))) || StringUtils.isEmpty((CharSequence)((String)vo.getItems()[0].getAttributeValue(pkOrg_VField))))) {
            return;
        }
        BaseBillVO parentVO = (BaseBillVO)vo.getParentVO();
        UFDate billdate = null;
        billdate = parentVO.getBilldate();
        if (billdate == null) {
            billdate = new UFDate();
        }
        if ("pk_pcorg".equals(pkOrgField)) {
            ArrayList<String> list = new ArrayList<String>();
            for (BaseItemVO item : vo.getItems()) {
                list.add((String)item.getAttributeValue(pkOrgField));
            }
            Map queryVersion = ((IProfitCenterPubService)NCLocator.getInstance().lookup(IProfitCenterPubService.class)).queryVersion(list.toArray(new String[0]), billdate);
            if (queryVersion.isEmpty()) {
                return;
            }
            String pk_vid = ((ProfitcenterVersionVO)queryVersion.get(pk_org)).getPrimaryKey();
            vo.getHeadVO().setAttributeValue(pkOrg_VField, pk_vid);
            for (BaseItemVO item : vo.getItems()) {
                String value;
                String string = value = queryVersion.get(item.getAttributeValue(pkOrgField)) == null ? null : ((ProfitcenterVersionVO)queryVersion.get(item.getAttributeValue(pkOrgField))).getPrimaryKey();
                if (value == null) continue;
                item.setAttributeValue(pkOrg_VField, value);
            }
        } else {
            String pk_org_v = null;
            Object[] versions = versionMap.get(pk_org);
            if (versions == null) {
                versions = query.queryOrgUnitVersionVOSByOID(pk_org);
                versionMap.put(pk_org, (OrgVersionVO[])(versions == null ? new OrgVersionVO[]{} : versions));
            }
            if (ArrayUtils.isEmpty((Object[])versions)) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0581"));
            }
            for (Object vso : versions) {
                if (vso.getEnablestate() != 2 || (vso.getVstartdate().compareTo(billdate) > 0 || vso.getVenddate().compareTo(billdate) < 0) && !vso.getVstartdate().isSameDate(billdate) && !vso.getVenddate().isSameDate(billdate)) continue;
                pk_org_v = vso.getPk_vid();
            }
            int index = 0;
            if (pk_org_v == null) {
                for (int i = 1; i < versions.length; ++i) {
                    if (versions[index].getVstartdate() == null || !versions[index].getVstartdate().after(versions[i].getVstartdate())) continue;
                    index = i;
                }
                pk_org_v = versions[index].getPk_vid();
            }
            if (pk_org_v == null) {
                pk_org_v = versions[0].getPk_vid();
            }
            vo.getHeadVO().setAttributeValue(pkOrg_VField, pk_org_v);
            for (BaseItemVO item : vo.getItems()) {
                item.setAttributeValue(pkOrg_VField, pk_org_v);
            }
        }
    }

    private static void setDept_v(IOrgVersionQryService query, Map<String, DeptVersionVO[]> versionMap, AggregatedValueObject bill, String pkDeptField, String pkDept_VField) throws BusinessException {
        BaseAggVO vo = (BaseAggVO)bill;
        BaseBillVO parentVO = (BaseBillVO)vo.getParentVO();
        UFDate billdate = parentVO.getBilldate();
        HashMap<String, String> map = new HashMap<String, String>();
        String pk_dept_v = null;
        for (BaseItemVO item : vo.getItems()) {
            String pk_dept = (String)item.getAttributeValue(pkDeptField);
            if (StringUtils.isEmpty((CharSequence)pk_dept)) continue;
            pk_dept_v = BillOrgVUtils.getDept_vid(query, versionMap, pk_dept, billdate);
            map.put(pkDept_VField, pk_dept_v);
            item.setAttributeValue(pkDept_VField, pk_dept_v);
        }
        if (map.size() == 1) {
            parentVO.setAttributeValue(pkDept_VField, pk_dept_v);
        }
    }

    public static String getDept_vid(String pk_dept, UFDate billdate) throws BusinessException {
        HashMap<String, DeptVersionVO[]> versionMap = new HashMap<String, DeptVersionVO[]>();
        IOrgVersionQryService query = (IOrgVersionQryService)NCLocator.getInstance().lookup(IOrgVersionQryService.class);
        return BillOrgVUtils.getDept_vid(query, versionMap, pk_dept, billdate);
    }

    private static String getDept_vid(IOrgVersionQryService query, Map<String, DeptVersionVO[]> versionMap, String pk_dept, UFDate billdate) throws BusinessException {
        if (billdate == null) {
            billdate = new UFDate();
        }
        String pk_dept_v = null;
        Object[] versions = versionMap.get(pk_dept);
        if (ArrayUtils.isEmpty((Object[])versions)) {
            versions = query.queryDeptVersionVOSByOID(pk_dept);
            versionMap.put(pk_dept, (DeptVersionVO[])(versions == null ? new DeptVersionVO[]{} : versions));
        }
        if (ArrayUtils.isEmpty((Object[])versions)) {
            Log.getInstance(BillOrgVUtils.class).error((Object)(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0582") + pk_dept), BillOrgVUtils.class, "setDept_v");
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0583"));
        }
        for (Object vso : versions) {
            if (vso.getEnablestate() != 2 || (vso.getVstartdate().compareTo(billdate) > 0 || vso.getVenddate().compareTo(billdate) < 0) && !vso.getVstartdate().isSameDate(billdate) && !vso.getVenddate().isSameDate(billdate)) continue;
            pk_dept_v = vso.getPk_vid();
        }
        int index = 0;
        if (pk_dept_v == null) {
            for (int i = 1; i < versions.length; ++i) {
                if (versions[index].getVstartdate() == null || !versions[index].getVstartdate().after(versions[i].getVstartdate())) continue;
                index = i;
            }
            pk_dept_v = versions[index].getPk_vid();
        }
        if (pk_dept_v == null) {
            pk_dept_v = versions[0].getPk_vid();
        }
        return pk_dept_v;
    }

    private static void setCustomer_v(Map<String, CustomerVersionVO[]> versionMap, AggregatedValueObject bill, String pkCustomerField, String pkCustomer_VField) {
        BaseAggVO vo = (BaseAggVO)bill;
        BaseBillVO parentVO = (BaseBillVO)vo.getParentVO();
        UFDate billdate = parentVO.getBilldate();
        HashMap<String, String> map = new HashMap<String, String>();
        String pk_customer_v = null;
        for (BaseItemVO item : vo.getItems()) {
            String pk_customer = (String)item.getAttributeValue(pkCustomerField);
            if (StringUtils.isEmpty((CharSequence)pk_customer) || StringUtils.isNotEmpty((CharSequence)((String)item.getAttributeValue(pkCustomer_VField)))) continue;
            try {
                pk_customer_v = BillOrgVUtils.getCustomer_vid(versionMap, pk_customer, billdate);
            }
            catch (BusinessException e) {
                ExceptionHandler.handleRuntimeException((Exception)((Object)e));
            }
            if (!StringUtils.isNotEmpty((CharSequence)pk_customer_v)) continue;
            map.put(pkCustomer_VField, pk_customer_v);
            item.setAttributeValue(pkCustomer_VField, pk_customer_v);
        }
        if (map.size() == 1 && StringUtils.isEmpty((CharSequence)parentVO.getCustomer_v())) {
            parentVO.setAttributeValue(pkCustomer_VField, pk_customer_v);
        }
    }

    private static void setSupplier_v(Map<String, SupplierVersionVO[]> versionMap, AggregatedValueObject bill, String pkSupplierField, String pkSupplier_VField) {
        BaseAggVO vo = (BaseAggVO)bill;
        BaseBillVO parentVO = (BaseBillVO)vo.getParentVO();
        UFDate billdate = parentVO.getBilldate();
        HashMap<String, String> map = new HashMap<String, String>();
        String pk_supplier_v = null;
        for (BaseItemVO item : vo.getItems()) {
            String pk_supplier = (String)item.getAttributeValue(pkSupplierField);
            if (StringUtils.isEmpty((CharSequence)pk_supplier) || StringUtils.isNotEmpty((CharSequence)((String)item.getAttributeValue(pkSupplier_VField)))) continue;
            try {
                pk_supplier_v = BillOrgVUtils.getSupplier_vid(versionMap, pk_supplier, billdate);
            }
            catch (BusinessException e) {
                ExceptionHandler.handleRuntimeException((Exception)((Object)e));
            }
            if (!StringUtils.isNotEmpty((CharSequence)pk_supplier_v)) continue;
            map.put(pkSupplier_VField, pk_supplier_v);
            item.setAttributeValue(pkSupplier_VField, pk_supplier_v);
        }
        if (map.size() == 1 && StringUtils.isEmpty((CharSequence)parentVO.getSupplier_v())) {
            parentVO.setAttributeValue(pkSupplier_VField, pk_supplier_v);
        }
    }

    private static String getCustomer_vid(Map<String, CustomerVersionVO[]> versionMap, String pk_customer, UFDate billdate) throws BusinessException {
        if (billdate == null) {
            billdate = new UFDate();
        }
        String pk_customer_v = null;
        Object[] versions = versionMap.get(pk_customer);
        if (ArrayUtils.isEmpty((Object[])versions)) {
            versions = BillOrgVUtils.queryCustomerVersionVOSByOID(pk_customer);
            versionMap.put(pk_customer, (CustomerVersionVO[])(versions == null ? new CustomerVersionVO[]{} : versions));
        }
        if (ArrayUtils.isEmpty((Object[])versions)) {
            Log.getInstance(BillOrgVUtils.class).error((Object)(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1290") + pk_customer), BillOrgVUtils.class, "setCustomer_v");
            return pk_customer_v;
        }
        for (Object vso : versions) {
            if (vso.getEnablestate() != 2 || (vso.getBegindate().compareTo(billdate) > 0 || vso.getEnddate().compareTo(billdate) < 0) && !vso.getBegindate().isSameDate(billdate) && !vso.getEnddate().isSameDate(billdate)) continue;
            pk_customer_v = vso.getPk_customer_v();
        }
        int index = 0;
        if (pk_customer_v == null) {
            for (int i = 1; i < versions.length; ++i) {
                if (versions[index].getBegindate() == null || !versions[index].getBegindate().after(versions[i].getBegindate())) continue;
                index = i;
            }
            pk_customer_v = versions[index].getPk_customer_v();
        }
        if (pk_customer_v == null) {
            pk_customer_v = versions[0].getPk_customer_v();
        }
        return pk_customer_v;
    }

    private static String getSupplier_vid(Map<String, SupplierVersionVO[]> versionMap, String pk_supplier, UFDate billdate) throws BusinessException {
        if (billdate == null) {
            billdate = new UFDate();
        }
        String pk_supplier_v = null;
        Object[] versions = versionMap.get(pk_supplier);
        if (ArrayUtils.isEmpty((Object[])versions)) {
            versions = BillOrgVUtils.querySupplierVersionVOSByOID(pk_supplier);
            versionMap.put(pk_supplier, (SupplierVersionVO[])(versions == null ? new SupplierVersionVO[]{} : versions));
        }
        if (ArrayUtils.isEmpty((Object[])versions)) {
            Log.getInstance(BillOrgVUtils.class).error((Object)(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1292") + pk_supplier), BillOrgVUtils.class, "setSupplier_v");
            return pk_supplier_v;
        }
        for (Object vso : versions) {
            if (vso.getEnablestate() != 2 || (vso.getBegindate().compareTo(billdate) > 0 || vso.getEnddate().compareTo(billdate) < 0) && !vso.getBegindate().isSameDate(billdate) && !vso.getEnddate().isSameDate(billdate)) continue;
            pk_supplier_v = vso.getPk_supplier_v();
        }
        int index = 0;
        if (pk_supplier_v == null) {
            for (int i = 1; i < versions.length; ++i) {
                if (versions[index].getBegindate() == null || !versions[index].getBegindate().after(versions[i].getBegindate())) continue;
                index = i;
            }
            pk_supplier_v = versions[index].getPk_supplier_v();
        }
        if (pk_supplier_v == null) {
            pk_supplier_v = versions[0].getPk_supplier_v();
        }
        return pk_supplier_v;
    }

    private static CustomerVersionVO[] queryCustomerVersionVOSByOID(String pk_customer) throws BusinessException {
        BaseDAO baseDAO = new BaseDAO();
        String condition = "pk_customer = '" + pk_customer + "'";
        if (StringUtil.isEmpty((String)pk_customer)) {
            return null;
        }
        Collection vc = baseDAO.retrieveByClause(CustomerVersionVO.class, condition);
        if (vc != null && vc.size() > 0) {
            return vc.toArray(new CustomerVersionVO[0]);
        }
        return null;
    }

    private static SupplierVersionVO[] querySupplierVersionVOSByOID(String pk_supplier) throws BusinessException {
        BaseDAO baseDAO = new BaseDAO();
        String condition = "pk_supplier = '" + pk_supplier + "'";
        if (StringUtil.isEmpty((String)pk_supplier)) {
            return null;
        }
        Collection vc = baseDAO.retrieveByClause(SupplierVersionVO.class, condition);
        if (vc != null && vc.size() > 0) {
            return vc.toArray(new SupplierVersionVO[0]);
        }
        return null;
    }
}


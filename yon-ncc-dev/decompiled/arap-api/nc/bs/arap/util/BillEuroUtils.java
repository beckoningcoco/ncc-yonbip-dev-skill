/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.pubitf.org.IOrgUnitPubService
 *  nc.pubitf.org.cache.IOrgUnitPubService_C
 *  nc.pubitf.uapbd.ICustomerPubService
 *  nc.pubitf.uapbd.ISupplierPubService
 *  nc.pubitf.uapbd.ITaxPubService_C
 *  nc.pubitf.uapbd.TaxcodeUtil
 *  nc.pubitf.uapbd.taxcode.AdverseTaxQueryVO
 *  nc.pubitf.uapbd.taxcode.TaxcodeTaxrateQueryVO
 *  nc.pubitf.uapbd.taxcode.TaxrateQueryVO
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.org.OrgVO
 *  nc.vo.org.OrgVatVO
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.BusinessRuntimeException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDouble
 *  nccloud.commons.lang.ArrayUtils
 *  nccloud.commons.lang.StringUtils
 */
package nc.bs.arap.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.itf.arap.pub.IArapBillService;
import nc.pubitf.org.IOrgUnitPubService;
import nc.pubitf.org.cache.IOrgUnitPubService_C;
import nc.pubitf.uapbd.ICustomerPubService;
import nc.pubitf.uapbd.ISupplierPubService;
import nc.pubitf.uapbd.ITaxPubService_C;
import nc.pubitf.uapbd.TaxcodeUtil;
import nc.pubitf.uapbd.taxcode.AdverseTaxQueryVO;
import nc.pubitf.uapbd.taxcode.TaxcodeTaxrateQueryVO;
import nc.pubitf.uapbd.taxcode.TaxrateQueryVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.org.OrgVO;
import nc.vo.org.OrgVatVO;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.BusinessRuntimeException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDouble;
import nccloud.commons.lang.ArrayUtils;
import nccloud.commons.lang.StringUtils;

public final class BillEuroUtils {
    private static final String BILL4816 = "4816";

    public static void setEuroInfo(AggregatedValueObject[] bills) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])bills)) {
            return;
        }
        BillEuroUtils.retriveHead_country(bills);
        BillEuroUtils.retriveBody_Country_VatCode_BuySelltype(bills);
        BillEuroUtils.retriveCusSupVatCode(bills);
        BillEuroUtils.retriveTaxcode_TaxType_TaxRate_NoSubTaxRate(bills);
        BillEuroUtils.retriveOpp_taxFlag(bills);
    }

    private static void retriveOpp_taxFlag(AggregatedValueObject[] bills) {
        if (bills[0].getParentVO().getAttributeValue("billclass").equals("yf") || bills[0].getParentVO().getAttributeValue("billclass").equals("fk")) {
            for (AggregatedValueObject bill : bills) {
                String pk_org = (String)bill.getParentVO().getAttributeValue("pk_org");
                String taxcountry = (String)bill.getParentVO().getAttributeValue("taxcountryid");
                CircularlyAccessibleValueObject[] childrenVOs = bill.getChildrenVO();
                Object[] buysell = new Object[childrenVOs.length];
                for (int j = 0; j < childrenVOs.length; ++j) {
                    buysell[j] = childrenVOs[j].getAttributeValue("buysellflag");
                }
                UFBoolean[] opptaxFlag = BillEuroUtils.getOpptaxFlag(taxcountry, pk_org, buysell);
                for (int j = 0; j < childrenVOs.length; ++j) {
                    if (childrenVOs[j].getAttributeValue("opptaxflag") != null) continue;
                    childrenVOs[j].setAttributeValue("opptaxflag", (Object)opptaxFlag[j]);
                }
            }
        }
    }

    private static void retriveTaxcode_TaxType_TaxRate_NoSubTaxRate(AggregatedValueObject[] bills) {
        block24: {
            block23: {
                String top_billtype = null;
                if (!ArrayUtils.isEmpty((Object[])bills[0].getChildrenVO())) {
                    top_billtype = (String)bills[0].getChildrenVO()[0].getAttributeValue("top_billtype");
                }
                if (!(top_billtype == null || bills[0].getParentVO().getAttributeValue("billclass").equals("yf") && top_billtype != null && top_billtype.equals(BILL4816))) {
                    for (AggregatedValueObject bill : bills) {
                        CircularlyAccessibleValueObject[] childrenVOs = bill.getChildrenVO();
                        for (int j = 0; j < childrenVOs.length; ++j) {
                            if (childrenVOs[j].getAttributeValue("taxcodeid") == null) {
                                childrenVOs[j].setAttributeValue("taxcodeid", (Object)TaxcodeUtil.getZeroTaxrateTaxcode());
                            }
                            if (childrenVOs[j].getAttributeValue("taxrate") == null) {
                                childrenVOs[j].setAttributeValue("taxrate", (Object)UFDouble.ZERO_DBL);
                            }
                            if (childrenVOs[j].getAttributeValue("nosubtaxrate") == null) {
                                childrenVOs[j].setAttributeValue("nosubtaxrate", (Object)UFDouble.ZERO_DBL);
                            }
                            if (childrenVOs[j].getAttributeValue("taxtype") != null) continue;
                            childrenVOs[j].setAttributeValue("taxtype", (Object)BillEnumCollection.TaxType.TAXOUT.VALUE);
                        }
                    }
                    return;
                }
                if (!bills[0].getParentVO().getAttributeValue("billclass").equals("ys") && !bills[0].getParentVO().getAttributeValue("billclass").equals("sk")) break block23;
                for (AggregatedValueObject bill : bills) {
                    CircularlyAccessibleValueObject[] childrenVOs = bill.getChildrenVO();
                    int length = 0;
                    for (int j = 0; j < childrenVOs.length; ++j) {
                        String code = (String)childrenVOs[j].getAttributeValue("taxcodeid");
                        if (!StringUtils.isEmpty((CharSequence)code)) continue;
                        ++length;
                    }
                    UFBoolean[] trialtradetype = new UFBoolean[length];
                    String[] rececountryid = new String[length];
                    UFDate billdate = (UFDate)bill.getParentVO().getAttributeValue("billdate");
                    if (billdate == null) {
                        billdate = new UFDate(InvocationInfoProxy.getInstance().getBizDateTime());
                    }
                    String sendcountryid = (String)bill.getParentVO().getAttributeValue("sendcountryid");
                    Integer[] sells = new Integer[length];
                    String[] material = new String[length];
                    String[] customer = new String[length];
                    String taxcountryid = (String)bill.getParentVO().getAttributeValue("taxcountryid");
                    int i = 0;
                    for (int j = 0; j < childrenVOs.length; ++j) {
                        String code = (String)childrenVOs[j].getAttributeValue("taxcodeid");
                        if (!StringUtils.isEmpty((CharSequence)code)) continue;
                        trialtradetype[i] = (UFBoolean)childrenVOs[j].getAttributeValue("triatradeflag");
                        rececountryid[i] = (String)childrenVOs[j].getAttributeValue("rececountryid");
                        sells[i] = (Integer)childrenVOs[j].getAttributeValue("buysellflag");
                        material[i] = (String)childrenVOs[j].getAttributeValue("material");
                        customer[i] = (String)childrenVOs[j].getAttributeValue("customer");
                        ++i;
                    }
                    String[] cusTaxcode = null;
                    if (length > 0) {
                        cusTaxcode = BillEuroUtils.getCusTaxcode(billdate, rececountryid, material, sells, sendcountryid, customer, taxcountryid, trialtradetype);
                    }
                    i = 0;
                    for (int j = 0; j < childrenVOs.length; ++j) {
                        String code = (String)childrenVOs[j].getAttributeValue("taxcodeid");
                        if (!StringUtils.isEmpty((CharSequence)code)) continue;
                        String taxcode = cusTaxcode[i++];
                        childrenVOs[j].setAttributeValue("taxcodeid", (Object)taxcode);
                        if (!StringUtils.isNotEmpty((CharSequence)taxcode)) continue;
                        try {
                            TaxrateQueryVO vo = new TaxrateQueryVO();
                            vo.setTaxcodeid(taxcode);
                            vo.setBusinessDate(billdate);
                            Object[] rate = TaxcodeUtil.getInstance().getTaxratesByTaxcodeIdAndDates(new TaxrateQueryVO[]{vo});
                            if (ArrayUtils.isEmpty((Object[])rate) || rate[0] == null) continue;
                            childrenVOs[j].setAttributeValue("taxrate", (Object)rate[0].getTaxrate());
                            childrenVOs[j].setAttributeValue("nosubtaxrate", (Object)rate[0].getRealtaxrate());
                            childrenVOs[j].setAttributeValue("taxtype", (Object)rate[0].getTaxtype());
                            continue;
                        }
                        catch (BusinessException e) {
                            ExceptionHandler.handleRuntimeException((Exception)((Object)e));
                        }
                    }
                }
                break block24;
            }
            if (!bills[0].getParentVO().getAttributeValue("billclass").equals("yf") && !bills[0].getParentVO().getAttributeValue("billclass").equals("fk")) break block24;
            for (AggregatedValueObject bill : bills) {
                CircularlyAccessibleValueObject[] childrenVOs = bill.getChildrenVO();
                int length = 0;
                for (int j = 0; j < childrenVOs.length; ++j) {
                    String code = (String)childrenVOs[j].getAttributeValue("taxcodeid");
                    if (!StringUtils.isEmpty((CharSequence)code)) continue;
                    ++length;
                }
                String rececountryid = (String)bill.getParentVO().getAttributeValue("rececountryid");
                UFDate billdate = (UFDate)bill.getParentVO().getAttributeValue("billdate");
                if (billdate == null) {
                    billdate = new UFDate(InvocationInfoProxy.getInstance().getBizDateTime());
                }
                String[] sendcountryid = new String[length];
                Integer[] buys = new Integer[length];
                String[] material = new String[length];
                String[] supplier = new String[length];
                String taxcountryid = (String)bill.getParentVO().getAttributeValue("taxcountryid");
                int i = 0;
                for (int j = 0; j < childrenVOs.length; ++j) {
                    String code = (String)childrenVOs[j].getAttributeValue("taxcodeid");
                    if (!StringUtils.isEmpty((CharSequence)code)) continue;
                    sendcountryid[i] = (String)childrenVOs[j].getAttributeValue("sendcountryid");
                    buys[i] = (Integer)childrenVOs[j].getAttributeValue("buysellflag");
                    material[i] = (String)childrenVOs[j].getAttributeValue("material");
                    supplier[i] = (String)childrenVOs[j].getAttributeValue("supplier");
                    ++i;
                }
                String[] cusTaxcode = null;
                if (length > 0) {
                    cusTaxcode = BillEuroUtils.getSuppTaxcode(billdate, rececountryid, material, buys, sendcountryid, supplier, taxcountryid);
                }
                i = 0;
                for (int j = 0; j < childrenVOs.length; ++j) {
                    String code = (String)childrenVOs[j].getAttributeValue("taxcodeid");
                    if (!StringUtils.isEmpty((CharSequence)code)) continue;
                    String taxcode = cusTaxcode[i++];
                    childrenVOs[j].setAttributeValue("taxcodeid", (Object)taxcode);
                    if (!StringUtils.isNotEmpty((CharSequence)taxcode)) continue;
                    try {
                        TaxrateQueryVO vo = new TaxrateQueryVO();
                        vo.setTaxcodeid(taxcode);
                        vo.setBusinessDate(billdate);
                        Object[] rate = TaxcodeUtil.getInstance().getTaxratesByTaxcodeIdAndDates(new TaxrateQueryVO[]{vo});
                        if (ArrayUtils.isEmpty((Object[])rate) || rate[0] == null) continue;
                        childrenVOs[j].setAttributeValue("taxrate", (Object)rate[0].getTaxrate());
                        childrenVOs[j].setAttributeValue("nosubtaxrate", (Object)rate[0].getRealtaxrate());
                        childrenVOs[j].setAttributeValue("taxtype", (Object)rate[0].getTaxtype());
                        continue;
                    }
                    catch (BusinessException e) {
                        ExceptionHandler.handleRuntimeException((Exception)((Object)e));
                    }
                }
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void retriveCusSupVatCode(AggregatedValueObject[] bills) {
        block18: {
            HashMap<String, String> country_sup_vatcode_map;
            block17: {
                Object childrenVOs;
                HashMap<String, String> country_cus_vatcode_map = new HashMap<String, String>();
                country_sup_vatcode_map = new HashMap<String, String>();
                if (bills[0].getParentVO().getAttributeValue("billclass").equals("ys") || bills[0].getParentVO().getAttributeValue("billclass").equals("sk")) {
                    for (AggregatedValueObject bill : bills) {
                        childrenVOs = bill.getChildrenVO();
                        for (Object childrenVO : childrenVOs) {
                            String customer = (String)childrenVO.getAttributeValue("customer");
                            String rececountry = (String)childrenVO.getAttributeValue("rececountryid");
                            String custvatcode = (String)childrenVO.getAttributeValue("custvatcode");
                            if (!StringUtils.isNotEmpty((CharSequence)customer) || !StringUtils.isNotEmpty((CharSequence)rececountry) || !StringUtils.isEmpty((CharSequence)custvatcode)) continue;
                            country_cus_vatcode_map.put(rececountry + customer, null);
                        }
                    }
                } else if (bills[0].getParentVO().getAttributeValue("billclass").equals("yf") || bills[0].getParentVO().getAttributeValue("billclass").equals("fk")) {
                    for (AggregatedValueObject bill : bills) {
                        for (Object childrenVO : childrenVOs = bill.getChildrenVO()) {
                            String supplier = (String)childrenVO.getAttributeValue("supplier");
                            String sendcountryid = (String)childrenVO.getAttributeValue("sendcountryid");
                            String vendorvatcode = (String)childrenVO.getAttributeValue("vendorvatcode");
                            if (!StringUtils.isNotEmpty((CharSequence)supplier) || !StringUtils.isNotEmpty((CharSequence)sendcountryid) || !StringUtils.isEmpty((CharSequence)vendorvatcode)) continue;
                            country_sup_vatcode_map.put(sendcountryid + supplier, null);
                        }
                    }
                } else {
                    return;
                }
                if (country_cus_vatcode_map.size() == 0 && country_sup_vatcode_map.size() == 0) {
                    return;
                }
                int size = country_cus_vatcode_map.keySet().size();
                String[] customers = new String[size];
                String[] countrys = new String[size];
                int j = 0;
                for (String string : country_cus_vatcode_map.keySet()) {
                    countrys[j] = string.substring(0, 20);
                    customers[j++] = string.substring(20);
                }
                String[] cusVatCode = BillEuroUtils.getCusSuppVatCode(countrys, customers, true);
                boolean bl = false;
                for (String country : countrys) {
                    void var8_18;
                    country_cus_vatcode_map.put(country + customers[++var8_18], cusVatCode[var8_18]);
                }
                size = country_sup_vatcode_map.keySet().size();
                String[] suppliers = new String[size];
                String[] countrys2 = new String[size];
                j = 0;
                for (String org : country_sup_vatcode_map.keySet()) {
                    countrys2[j] = org.substring(0, 20);
                    suppliers[j++] = org.substring(20);
                }
                String[] suppVatCode = BillEuroUtils.getCusSuppVatCode(countrys2, suppliers, false);
                boolean bl2 = false;
                for (String string : countrys2) {
                    void var8_20;
                    country_sup_vatcode_map.put(string + suppliers[++var8_20], suppVatCode[var8_20]);
                }
                if (!bills[0].getParentVO().getAttributeValue("billclass").equals("ys") && !bills[0].getParentVO().getAttributeValue("billclass").equals("sk")) break block17;
                for (String string : bills) {
                    CircularlyAccessibleValueObject[] childrenVOs2;
                    for (CircularlyAccessibleValueObject childrenVO : childrenVOs2 = string.getChildrenVO()) {
                        String customer = (String)childrenVO.getAttributeValue("customer");
                        String rececountry = (String)childrenVO.getAttributeValue("rececountryid");
                        String custvatcode = (String)childrenVO.getAttributeValue("custvatcode");
                        if (!StringUtils.isNotEmpty((CharSequence)customer) || !StringUtils.isNotEmpty((CharSequence)rececountry) || !StringUtils.isEmpty((CharSequence)custvatcode)) continue;
                        childrenVO.setAttributeValue("custvatcode", country_cus_vatcode_map.get(rececountry + customer));
                    }
                }
                break block18;
            }
            if (!bills[0].getParentVO().getAttributeValue("billclass").equals("yf") && !bills[0].getParentVO().getAttributeValue("billclass").equals("fk")) break block18;
            for (String string : bills) {
                CircularlyAccessibleValueObject[] childrenVOs;
                for (CircularlyAccessibleValueObject childrenVO : childrenVOs = string.getChildrenVO()) {
                    String supplier = (String)childrenVO.getAttributeValue("supplier");
                    String sendcountryid = (String)childrenVO.getAttributeValue("sendcountryid");
                    String vendorvatcode = (String)childrenVO.getAttributeValue("vendorvatcode");
                    if (!StringUtils.isNotEmpty((CharSequence)supplier) || !StringUtils.isNotEmpty((CharSequence)sendcountryid) || !StringUtils.isEmpty((CharSequence)vendorvatcode)) continue;
                    childrenVO.setAttributeValue("vendorvatcode", country_sup_vatcode_map.get(sendcountryid + supplier));
                }
            }
        }
    }

    private static void retriveBody_Country_VatCode_BuySelltype(AggregatedValueObject[] bills) {
        block24: {
            CircularlyAccessibleValueObject[] childrenVOs;
            String taxcountry;
            String pk_org;
            Map<Object, Object> org_taxcountry_vatcode_map;
            Map<Object, Object> supplier_country_map;
            Map<Object, Object> customer_country_map;
            block23: {
                Integer objtype;
                CircularlyAccessibleValueObject childrenVO;
                int n;
                int n2;
                CircularlyAccessibleValueObject[] circularlyAccessibleValueObjectArray;
                CircularlyAccessibleValueObject[] childrenVOs2;
                String taxcountry2;
                String pk_org2;
                customer_country_map = new HashMap();
                supplier_country_map = new HashMap();
                org_taxcountry_vatcode_map = new HashMap();
                if (bills[0].getParentVO().getAttributeValue("billclass").equals("ys") || bills[0].getParentVO().getAttributeValue("billclass").equals("sk")) {
                    for (AggregatedValueObject bill : bills) {
                        pk_org2 = (String)bill.getParentVO().getAttributeValue("sett_org");
                        taxcountry2 = (String)bill.getParentVO().getAttributeValue("taxcountryid");
                        org_taxcountry_vatcode_map.put(pk_org2 + taxcountry2, null);
                        circularlyAccessibleValueObjectArray = childrenVOs2 = bill.getChildrenVO();
                        n2 = circularlyAccessibleValueObjectArray.length;
                        for (n = 0; n < n2; ++n) {
                            childrenVO = circularlyAccessibleValueObjectArray[n];
                            objtype = (Integer)childrenVO.getAttributeValue("objtype");
                            String customer = (String)childrenVO.getAttributeValue("customer");
                            if (!BillEnumCollection.ObjType.SUPPLIER.VALUE.equals(objtype) && StringUtils.isNotEmpty((CharSequence)customer) && childrenVO.getAttributeValue("rececountryid") == null) {
                                customer_country_map.put(customer, null);
                                continue;
                            }
                            String supplier = (String)childrenVO.getAttributeValue("supplier");
                            if (!BillEnumCollection.ObjType.SUPPLIER.VALUE.equals(objtype) || !StringUtils.isNotEmpty((CharSequence)supplier) || childrenVO.getAttributeValue("sendcountryid") != null) continue;
                            supplier_country_map.put(supplier, null);
                        }
                    }
                } else if (bills[0].getParentVO().getAttributeValue("billclass").equals("yf") || bills[0].getParentVO().getAttributeValue("billclass").equals("fk")) {
                    for (AggregatedValueObject bill : bills) {
                        pk_org2 = (String)bill.getParentVO().getAttributeValue("sett_org");
                        taxcountry2 = (String)bill.getParentVO().getAttributeValue("taxcountryid");
                        org_taxcountry_vatcode_map.put(pk_org2 + taxcountry2, null);
                        circularlyAccessibleValueObjectArray = childrenVOs2 = bill.getChildrenVO();
                        n2 = circularlyAccessibleValueObjectArray.length;
                        for (n = 0; n < n2; ++n) {
                            childrenVO = circularlyAccessibleValueObjectArray[n];
                            objtype = (Integer)childrenVO.getAttributeValue("objtype");
                            String supplier = (String)childrenVO.getAttributeValue("supplier");
                            if (!BillEnumCollection.ObjType.CUSTOMER.VALUE.equals(objtype) && StringUtils.isNotEmpty((CharSequence)supplier) && childrenVO.getAttributeValue("sendcountryid") == null) {
                                supplier_country_map.put(supplier, null);
                                continue;
                            }
                            String customer = (String)childrenVO.getAttributeValue("customer");
                            if (!BillEnumCollection.ObjType.CUSTOMER.VALUE.equals(objtype) || !StringUtils.isNotEmpty((CharSequence)customer) || childrenVO.getAttributeValue("rececountryid") != null) continue;
                            customer_country_map.put(customer, null);
                        }
                    }
                } else {
                    return;
                }
                Set customers = customer_country_map.keySet();
                Set suppliers = supplier_country_map.keySet();
                customer_country_map = BillEuroUtils.getCountryByCustomerSupplier(customers.toArray(new String[0]), true);
                supplier_country_map = BillEuroUtils.getCountryByCustomerSupplier(suppliers.toArray(new String[0]), false);
                int size = org_taxcountry_vatcode_map.keySet().size();
                String[] taxcountrys = new String[size];
                String[] pk_orgs = new String[size];
                int j = 0;
                for (String org : org_taxcountry_vatcode_map.keySet()) {
                    pk_orgs[j] = org.substring(0, 20);
                    taxcountrys[j++] = org.substring(20);
                }
                org_taxcountry_vatcode_map = BillEuroUtils.getVatCode(taxcountrys, pk_orgs);
                if (!bills[0].getParentVO().getAttributeValue("billclass").equals("ys") && !bills[0].getParentVO().getAttributeValue("billclass").equals("sk")) break block23;
                for (AggregatedValueObject bill : bills) {
                    pk_org = (String)bill.getParentVO().getAttributeValue("sett_org");
                    taxcountry = (String)bill.getParentVO().getAttributeValue("taxcountryid");
                    for (CircularlyAccessibleValueObject childrenVO2 : childrenVOs = bill.getChildrenVO()) {
                        String customer = (String)childrenVO2.getAttributeValue("customer");
                        String vatcode = (String)childrenVO2.getAttributeValue("vatcode");
                        Integer objtype2 = (Integer)childrenVO2.getAttributeValue("objtype");
                        if (!BillEnumCollection.ObjType.SUPPLIER.VALUE.equals(objtype2) && StringUtils.isNotEmpty((CharSequence)customer) && childrenVO2.getAttributeValue("rececountryid") == null) {
                            childrenVO2.setAttributeValue("rececountryid", customer_country_map.get(customer));
                        } else {
                            String supplier = (String)childrenVO2.getAttributeValue("supplier");
                            if (StringUtils.isNotEmpty((CharSequence)supplier) && childrenVO2.getAttributeValue("rececountryid") == null) {
                                childrenVO2.setAttributeValue("rececountryid", supplier_country_map.get(supplier));
                            }
                        }
                        if (StringUtils.isEmpty((CharSequence)vatcode)) {
                            childrenVO2.setAttributeValue("vatcode", org_taxcountry_vatcode_map.get(pk_org + taxcountry));
                        }
                        if (childrenVO2.getAttributeValue("buysellflag") != null) continue;
                        childrenVO2.setAttributeValue("buysellflag", (Object)BillEuroUtils.getSellType(taxcountry, (String)childrenVO2.getAttributeValue("rececountryid")));
                    }
                }
                break block24;
            }
            if (!bills[0].getParentVO().getAttributeValue("billclass").equals("yf") && !bills[0].getParentVO().getAttributeValue("billclass").equals("fk")) break block24;
            for (AggregatedValueObject bill : bills) {
                pk_org = (String)bill.getParentVO().getAttributeValue("sett_org");
                taxcountry = (String)bill.getParentVO().getAttributeValue("taxcountryid");
                for (CircularlyAccessibleValueObject childrenVO : childrenVOs = bill.getChildrenVO()) {
                    String supplier = (String)childrenVO.getAttributeValue("supplier");
                    String vatcode = (String)childrenVO.getAttributeValue("vatcode");
                    Integer objtype = (Integer)childrenVO.getAttributeValue("objtype");
                    if (!BillEnumCollection.ObjType.CUSTOMER.VALUE.equals(objtype) && StringUtils.isNotEmpty((CharSequence)supplier) && childrenVO.getAttributeValue("sendcountryid") == null) {
                        childrenVO.setAttributeValue("sendcountryid", supplier_country_map.get(supplier));
                    } else {
                        String customer = (String)childrenVO.getAttributeValue("customer");
                        if (StringUtils.isNotEmpty((CharSequence)customer) && childrenVO.getAttributeValue("sendcountryid") == null) {
                            childrenVO.setAttributeValue("sendcountryid", customer_country_map.get(customer));
                        }
                    }
                    if (StringUtils.isEmpty((CharSequence)vatcode)) {
                        childrenVO.setAttributeValue("vatcode", org_taxcountry_vatcode_map.get(pk_org + taxcountry));
                    }
                    if (childrenVO.getAttributeValue("buysellflag") != null) continue;
                    childrenVO.setAttributeValue("buysellflag", (Object)BillEuroUtils.getBuyType(taxcountry, (String)childrenVO.getAttributeValue("sendcountryid")));
                }
            }
        }
    }

    private static void retriveHead_country(AggregatedValueObject[] bills) {
        block7: {
            HashMap<String, String> org_country_map;
            block6: {
                org_country_map = new HashMap<String, String>();
                if (!bills[0].getParentVO().getAttributeValue("billclass").equals("ys") && !bills[0].getParentVO().getAttributeValue("billclass").equals("sk")) break block6;
                for (AggregatedValueObject bill : bills) {
                    if (bill.getParentVO().getAttributeValue("sett_org") == null) {
                        bill.getParentVO().setAttributeValue("sett_org", bill.getParentVO().getAttributeValue("pk_org"));
                        bill.getParentVO().setAttributeValue("sett_org_v", bill.getParentVO().getAttributeValue("pk_org_v"));
                    }
                    String pk_org = (String)bill.getParentVO().getAttributeValue("sett_org");
                    if (bill.getParentVO().getAttributeValue("taxcountryid") == null) {
                        bill.getParentVO().setAttributeValue("taxcountryid", BillEuroUtils.getCountryByOrg(pk_org, org_country_map));
                    }
                    if (bill.getParentVO().getAttributeValue("sendcountryid") != null) continue;
                    bill.getParentVO().setAttributeValue("sendcountryid", BillEuroUtils.getCountryByOrg(pk_org, org_country_map));
                }
                break block7;
            }
            if (!bills[0].getParentVO().getAttributeValue("billclass").equals("yf") && !bills[0].getParentVO().getAttributeValue("billclass").equals("fk")) break block7;
            for (AggregatedValueObject bill : bills) {
                if (bill.getParentVO().getAttributeValue("sett_org") == null) {
                    bill.getParentVO().setAttributeValue("sett_org", bill.getParentVO().getAttributeValue("pk_org"));
                    bill.getParentVO().setAttributeValue("sett_org_v", bill.getParentVO().getAttributeValue("pk_org_v"));
                }
                String pk_org = (String)bill.getParentVO().getAttributeValue("sett_org");
                if (bill.getParentVO().getAttributeValue("taxcountryid") == null) {
                    bill.getParentVO().setAttributeValue("taxcountryid", BillEuroUtils.getCountryByOrg(pk_org, org_country_map));
                }
                if (bill.getParentVO().getAttributeValue("rececountryid") != null) continue;
                bill.getParentVO().setAttributeValue("rececountryid", BillEuroUtils.getCountryByOrg(pk_org, org_country_map));
            }
        }
    }

    private static Object getCountryByOrg(String pkOrg, Map<String, String> orgCountryMap) {
        if (orgCountryMap.containsKey(pkOrg)) {
            return orgCountryMap.get(pkOrg);
        }
        String country = BillEuroUtils.getCountry(pkOrg);
        orgCountryMap.put(pkOrg, country);
        return country;
    }

    public static String getCountryByCustomerSupplier(String customer_supplier, boolean iscustomer) {
        if (customer_supplier == null) {
            return null;
        }
        Map<String, String> countryByCustomerSupplier = BillEuroUtils.getCountryByCustomerSupplier(new String[]{customer_supplier}, iscustomer);
        Iterator<String> iterator = countryByCustomerSupplier.values().iterator();
        return iterator.hasNext() ? iterator.next() : null;
    }

    public static Map<String, String> getCountryByCustomerSupplier(String[] customer_supplier, boolean iscustomer) {
        if (ArrayUtils.isEmpty((Object[])customer_supplier)) {
            return new HashMap<String, String>();
        }
        try {
            if (iscustomer) {
                Map customer = ((ICustomerPubService)NCLocator.getInstance().lookup(ICustomerPubService.class)).getCountryByCustID(customer_supplier);
                return customer;
            }
            Map supplier = ((ISupplierPubService)NCLocator.getInstance().lookup(ISupplierPubService.class)).getCountryBySuppID(customer_supplier);
            return supplier;
        }
        catch (BusinessException e) {
            ExceptionHandler.handleRuntimeException((Exception)((Object)e));
            return new HashMap<String, String>();
        }
    }

    public static Map<String, String> getVatCode(String[] taxcountrys, String[] pk_orgs) {
        HashMap<String, String> result = new HashMap<String, String>();
        int i = 0;
        Object[] vatcodesByOrgInCountry = new OrgVatVO[taxcountrys.length];
        for (String taxcountry : taxcountrys) {
            if (taxcountry == null) continue;
            OrgVatVO orgVatVO = new OrgVatVO();
            orgVatVO.setPk_org(pk_orgs[i]);
            orgVatVO.setPk_country(taxcountry);
            vatcodesByOrgInCountry[i++] = orgVatVO;
        }
        try {
            vatcodesByOrgInCountry = ((IOrgUnitPubService_C)NCLocator.getInstance().lookup(IOrgUnitPubService_C.class)).getVatcodesByOrgInCountry((OrgVatVO[])vatcodesByOrgInCountry);
        }
        catch (BusinessException e) {
            throw new BusinessRuntimeException(e.getMessage(), (Throwable)e);
        }
        if (ArrayUtils.isEmpty((Object[])vatcodesByOrgInCountry)) {
            return result;
        }
        if (vatcodesByOrgInCountry[0] == null) {
            return result;
        }
        for (Object v : vatcodesByOrgInCountry) {
            result.put(v.getPk_org() + v.getPk_country(), v.getVatcode());
        }
        return result;
    }

    public static UFBoolean getTriaTradeFlag(String sendcountry, String taxcountry, String rececountry) {
        UFBoolean triaTradeFlags = rececountry != null && taxcountry != null && sendcountry != null && !rececountry.equals(taxcountry) && !sendcountry.equals(taxcountry) ? UFBoolean.TRUE : UFBoolean.FALSE;
        return triaTradeFlags;
    }

    public static String getCountry(String pkOrg) {
        try {
            OrgVO[] orgs = ((IOrgUnitPubService)NCLocator.getInstance().lookup(IOrgUnitPubService.class)).getOrgs(new String[]{pkOrg}, new String[]{"pk_org", "countryzone"});
            return orgs[0].getCountryzone();
        }
        catch (BusinessException e) {
            throw new BusinessRuntimeException(e.getMessage(), (Throwable)e);
        }
    }

    public static UFBoolean[] getOpptaxFlag(String taxcountry, String pk_org, Object[] buysellTypes) {
        UFBoolean[] isAdverseTaxes;
        if (taxcountry == null) {
            return new UFBoolean[buysellTypes.length];
        }
        AdverseTaxQueryVO[] queryVOs = new AdverseTaxQueryVO[buysellTypes.length];
        for (int i = 0; i < queryVOs.length; ++i) {
            AdverseTaxQueryVO adverseTaxQueryVO = new AdverseTaxQueryVO();
            adverseTaxQueryVO.setClossAccOrgId(pk_org);
            adverseTaxQueryVO.setPurSaleType((Integer)buysellTypes[i]);
            adverseTaxQueryVO.setRepTaxCountryId(taxcountry);
            queryVOs[i] = adverseTaxQueryVO;
        }
        try {
            isAdverseTaxes = ((ITaxPubService_C)NCLocator.getInstance().lookup(ITaxPubService_C.class)).getIsAdverseTaxesByATQueryVO(queryVOs);
        }
        catch (BusinessException e) {
            throw new BusinessRuntimeException(e.getMessage(), (Throwable)e);
        }
        return isAdverseTaxes;
    }

    public static Integer getBuyType(String taxcountry, String sendcountry) {
        Integer buySellType = null;
        buySellType = sendcountry != null && taxcountry != null && !sendcountry.equals(taxcountry) ? BillEnumCollection.BuySellType.OUT_BUY.VALUE : BillEnumCollection.BuySellType.IN_BUY.VALUE;
        return buySellType;
    }

    public static Integer getSellType(String taxcountry, String rececountry) {
        Integer buySellType = rececountry != null && taxcountry != null && !rececountry.equals(taxcountry) ? BillEnumCollection.BuySellType.OUT_SELL.VALUE : BillEnumCollection.BuySellType.IN_SELL.VALUE;
        return buySellType;
    }

    public static String[] getCusSuppVatCode(String[] country, String[] customer_supplier, boolean iscustomer) {
        try {
            if (iscustomer) {
                String[] vat = ((ICustomerPubService)NCLocator.getInstance().lookup(ICustomerPubService.class)).getVatcodeByCustomerCountry(customer_supplier, country);
                return vat;
            }
            String[] vat = ((ISupplierPubService)NCLocator.getInstance().lookup(ISupplierPubService.class)).getVatcodeBySupplierCountry(customer_supplier, country);
            return vat;
        }
        catch (BusinessException e) {
            ExceptionHandler.handleRuntimeException((Exception)((Object)e));
            return new String[0];
        }
    }

    public static String[] getSuppTaxcode(UFDate billdate, String rececountryid, String[] material, Integer[] buys, String[] sendcountryid, String[] supplier, String taxcountryid) {
        int length = material.length;
        String[] taxcodeid = new String[length];
        ArrayList<Integer> pos = new ArrayList<Integer>();
        ArrayList<TaxcodeTaxrateQueryVO> queryvos = new ArrayList<TaxcodeTaxrateQueryVO>();
        for (int i = 0; i < length; ++i) {
            TaxcodeTaxrateQueryVO vo = new TaxcodeTaxrateQueryVO();
            vo.setBusinessDate(billdate);
            vo.setCuscountryid(rececountryid);
            vo.setMaterialid(material[i]);
            vo.setPursaletype(buys[i]);
            vo.setSupcountryid(sendcountryid == null ? null : sendcountryid[i]);
            vo.setSupplierid(supplier[i]);
            vo.setReptaxcountryid(taxcountryid);
            vo.setIstriangletrade(UFBoolean.FALSE);
            if (buys[i] == null) {
                taxcodeid[i] = null;
                continue;
            }
            queryvos.add(vo);
            pos.add(i);
        }
        try {
            String[] taxcodeidquery = TaxcodeUtil.getInstance().getTaxcodesByTaxcodeConds(queryvos.toArray(new TaxcodeTaxrateQueryVO[0]));
            int n = 0;
            for (Integer p : pos) {
                taxcodeid[p.intValue()] = taxcodeidquery[n++];
            }
            return taxcodeid;
        }
        catch (BusinessException e) {
            ExceptionHandler.handleRuntimeException((Exception)((Object)e));
            return new String[length];
        }
    }

    public static String[] getCusTaxcode(UFDate billdate, String[] rececountryid, String[] material, Integer[] sells, String sendcountryid, String[] customer, String taxcountryid, UFBoolean[] trialtradetype) {
        int length = material.length;
        String[] taxcodeid = new String[length];
        ArrayList<Integer> pos = new ArrayList<Integer>();
        ArrayList<TaxcodeTaxrateQueryVO> queryvos = new ArrayList<TaxcodeTaxrateQueryVO>();
        for (int i = 0; i < length; ++i) {
            TaxcodeTaxrateQueryVO vo = new TaxcodeTaxrateQueryVO();
            vo.setBusinessDate(billdate);
            vo.setCuscountryid(rececountryid == null ? null : rececountryid[i]);
            vo.setMaterialid(material[i]);
            vo.setPursaletype(sells[i]);
            vo.setSupcountryid(sendcountryid);
            vo.setCustomerid(customer[i]);
            vo.setReptaxcountryid(taxcountryid);
            vo.setIstriangletrade(trialtradetype[i] == null ? UFBoolean.FALSE : trialtradetype[i]);
            if (sells[i] == null) {
                taxcodeid[i] = null;
                continue;
            }
            queryvos.add(vo);
            pos.add(i);
        }
        try {
            String[] taxcodeidquery = TaxcodeUtil.getInstance().getTaxcodesByTaxcodeConds(queryvos.toArray(new TaxcodeTaxrateQueryVO[0]));
            int n = 0;
            for (Integer p : pos) {
                taxcodeid[p.intValue()] = taxcodeidquery[n++];
            }
            return taxcodeid;
        }
        catch (BusinessException e) {
            ExceptionHandler.handleRuntimeException((Exception)((Object)e));
            return new String[length];
        }
    }

    public static Map<String, String> getBodyEuroAfterEditHandler(String pk_customer) {
        Map<String, String> customerMapB = new HashMap<String, String>();
        if (StringUtils.isEmpty((CharSequence)pk_customer)) {
            return customerMapB;
        }
        try {
            customerMapB = ((IArapBillService)NCLocator.getInstance().lookup(IArapBillService.class)).queryCustomerMapB(pk_customer);
        }
        catch (BusinessException e) {
            ExceptionHandler.consume((Throwable)e);
        }
        return customerMapB;
    }
}


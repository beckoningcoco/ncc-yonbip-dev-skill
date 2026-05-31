/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.pubitf.rbac.IDataPermissionPubService
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.BusinessRuntimeException
 */
package nc.bs.arap.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.pubitf.rbac.IDataPermissionPubService;
import nc.vo.arap.pub.ArapBillTypeInfo;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.BusinessRuntimeException;

public class ArapPermissionUtils {
    private static volatile Map<String, String> resourceCodeMap = null;
    private static String PRE_AR = "ar";
    private static String PRE_AP = "ap";

    private static synchronized Map<String, String> getResourceCodeMap() {
        if (resourceCodeMap == null) {
            resourceCodeMap = new HashMap<String, String>();
            resourceCodeMap.put("pk_org", "financeorg");
            resourceCodeMap.put("customer", "customer");
            resourceCodeMap.put("pk_deptid", "dept");
            resourceCodeMap.put("pk_psndoc", "psndoc");
            resourceCodeMap.put("pk_subjcode", "inoutBusiClass");
            resourceCodeMap.put("project", "project");
            resourceCodeMap.put("sett_org", "financeorg");
            resourceCodeMap.put("pk_pcorg", "liabilitycenter");
            resourceCodeMap.put("material", "material_v");
            resourceCodeMap.put("so_org", "saleorg");
            resourceCodeMap.put("supplier", "supplier");
            resourceCodeMap.put("pu_org", "purchaseorg");
            resourceCodeMap.put(PRE_AR + "recaccount", "bankaccsub");
            resourceCodeMap.put(PRE_AR + "payaccount", "custbankacc");
            resourceCodeMap.put(PRE_AP + "recaccount", "supbankacc");
            resourceCodeMap.put(PRE_AP + "payaccount", "bankaccsub");
        }
        return resourceCodeMap;
    }

    public static String getDataPermissionSql(String billType) throws BusinessException {
        return ArapPermissionUtils.getDataPermissionSql(billType, ArapPermissionUtils.getBodyTableByBillType(billType));
    }

    public static String getDataPermissionSql(String billType, String tabname) throws BusinessException {
        StringBuffer sql = new StringBuffer();
        String powerTable = null;
        String userId = InvocationInfoProxy.getInstance().getUserId();
        String pk_group = InvocationInfoProxy.getInstance().getGroupId();
        String bodyTable = ArapPermissionUtils.getBodyTableByBillType(billType);
        String pk_bill = ArapPermissionUtils.getPKNameByBillType(billType);
        List<String> attrs = ArapPermissionUtils.extractCollectionAttrs(billType);
        if (attrs == null || attrs.size() == 0) {
            return "";
        }
        String resourceCode = null;
        String resourceAttr = null;
        Iterator<String> iterator = attrs.iterator();
        while (iterator.hasNext()) {
            String attr;
            resourceAttr = attr = iterator.next();
            if ("recaccount".equals(attr) || "payaccount".equals(attr)) {
                resourceAttr = "F0".equals(billType) || "F2".equals(billType) ? PRE_AR + attr : PRE_AP + attr;
            }
            if ((resourceCode = ArapPermissionUtils.getResourceCodeMap().get(resourceAttr)) == null || (powerTable = ArapPermissionUtils.getDataPermissionPubService().getDataPermProfileTableNameByResourceCode(userId, resourceCode, ArapConstant.ARAP_POWER_CODE, pk_group)) == null) continue;
            sql.append(" and ").append(tabname + "." + pk_bill).append(" in ( SELECT DISTINCT ").append(pk_bill).append(" FROM ").append(bodyTable).append(" WHERE ").append(bodyTable + "." + attr).append(" in ( SELECT pk_doc FROM ").append(powerTable).append("))");
        }
        resourceCode = "materialbasclass";
        powerTable = ArapPermissionUtils.getDataPermissionPubService().getDataPermProfileTableNameByResourceCode(userId, resourceCode, ArapConstant.ARAP_POWER_CODE, pk_group);
        if (powerTable != null) {
            sql.append(" and ").append(tabname + "." + pk_bill).append(" in ( SELECT DISTINCT ").append(pk_bill).append(" FROM ").append(bodyTable).append(" WHERE ").append(bodyTable + "." + "material").append(" in (select pk_material from bd_material where pk_marbasclass in (SELECT pk_doc FROM ").append(powerTable).append(")) or ").append(bodyTable + "." + "material").append("='~')");
        }
        if ("F0".equals(billType) || "F2".equals(billType)) {
            resourceCode = "custclass";
            powerTable = ArapPermissionUtils.getDataPermissionPubService().getDataPermProfileTableNameByResourceCode(userId, resourceCode, ArapConstant.ARAP_POWER_CODE, pk_group);
            if (powerTable != null) {
                sql.append(" and ").append(bodyTable + "." + pk_bill).append(" in ( SELECT DISTINCT ").append(pk_bill).append(" FROM ").append(bodyTable).append(" WHERE ").append(bodyTable + "." + "customer").append(" in (select pk_customer from bd_customer where pk_custclass in (SELECT pk_doc FROM ").append(powerTable).append(")) or ").append(bodyTable + "." + "customer").append("='~')");
            }
        } else {
            resourceCode = "supplierclass";
            powerTable = ArapPermissionUtils.getDataPermissionPubService().getDataPermProfileTableNameByResourceCode(userId, resourceCode, ArapConstant.ARAP_POWER_CODE, pk_group);
            if (powerTable != null) {
                sql.append(" and ").append(bodyTable + "." + pk_bill).append(" in ( SELECT DISTINCT ").append(pk_bill).append(" FROM ").append(bodyTable).append(" WHERE ").append(bodyTable + "." + "supplier").append(" in (select PK_SUPPLIER from BD_SUPPLIER where PK_SUPPLIERCLASS in (SELECT pk_doc FROM ").append(powerTable).append(")) or ").append(bodyTable + "." + "supplier").append("='~')");
            }
        }
        return sql.toString();
    }

    public static String getOtherAttrDataPermissionSql(String billType) throws BusinessException {
        StringBuffer sql = new StringBuffer();
        String powerTable = null;
        String userId = InvocationInfoProxy.getInstance().getUserId();
        String pk_group = InvocationInfoProxy.getInstance().getGroupId();
        String bodyTable = ArapPermissionUtils.getBodyTableByBillType(billType);
        String mainTable = ArapPermissionUtils.getMainTableByBillType(billType);
        String pk_bill = ArapPermissionUtils.getPKNameByBillType(billType);
        List<String> attrs = ArapPermissionUtils.extractCollectionAttrs(billType);
        if (attrs == null || attrs.size() == 0) {
            return "";
        }
        String resourceCode = null;
        String resourceAttr = null;
        sql.append(" and exists ( SELECT 1 FROM ").append(bodyTable).append(" WHERE ").append(pk_bill).append(" = ").append(mainTable).append(".").append(pk_bill);
        Iterator<String> iterator = attrs.iterator();
        while (iterator.hasNext()) {
            String attr;
            resourceAttr = attr = iterator.next();
            if ("recaccount".equals(attr) || "payaccount".equals(attr)) {
                resourceAttr = "F0".equals(billType) || "F2".equals(billType) ? PRE_AR + attr : PRE_AP + attr;
            }
            if ((resourceCode = ArapPermissionUtils.getResourceCodeMap().get(resourceAttr)) == null || (powerTable = ArapPermissionUtils.getDataPermissionPubService().getDataPermProfileTableNameByResourceCode(userId, resourceCode, ArapConstant.ARAP_POWER_CODE, pk_group)) == null) continue;
            sql.append(" and ").append(bodyTable + "." + attr).append(" in ( SELECT pk_doc FROM ").append(powerTable).append(")");
        }
        sql.append(" )");
        resourceCode = "materialbasclass";
        powerTable = ArapPermissionUtils.getDataPermissionPubService().getDataPermProfileTableNameByResourceCode(userId, resourceCode, ArapConstant.ARAP_POWER_CODE, pk_group);
        if (powerTable != null) {
            sql.append(" and ").append(bodyTable + "." + pk_bill).append(" in ( SELECT DISTINCT ").append(pk_bill).append(" FROM ").append(bodyTable).append(" WHERE ").append(bodyTable + "." + "material").append(" in (select pk_material from bd_material where pk_marbasclass in (SELECT pk_doc FROM ").append(powerTable).append(")) or ").append(bodyTable + "." + "material").append("='~')");
        }
        if ("F0".equals(billType) || "F2".equals(billType)) {
            resourceCode = "custclass";
            powerTable = ArapPermissionUtils.getDataPermissionPubService().getDataPermProfileTableNameByResourceCode(userId, resourceCode, ArapConstant.ARAP_POWER_CODE, pk_group);
            if (powerTable != null) {
                sql.append(" and ").append(bodyTable + "." + pk_bill).append(" in ( SELECT DISTINCT ").append(pk_bill).append(" FROM ").append(bodyTable).append(" WHERE ").append(bodyTable + "." + "customer").append(" in (select pk_customer from bd_customer where pk_custclass in (SELECT pk_doc FROM ").append(powerTable).append(")) or ").append(bodyTable + "." + "customer").append("='~')");
            }
        } else {
            resourceCode = "supplierclass";
            powerTable = ArapPermissionUtils.getDataPermissionPubService().getDataPermProfileTableNameByResourceCode(userId, resourceCode, ArapConstant.ARAP_POWER_CODE, pk_group);
            if (powerTable != null) {
                sql.append(" and ").append(bodyTable + "." + pk_bill).append(" in ( SELECT DISTINCT ").append(pk_bill).append(" FROM ").append(bodyTable).append(" WHERE ").append(bodyTable + "." + "supplier").append(" in (select PK_SUPPLIER from BD_SUPPLIER where PK_SUPPLIERCLASS in (SELECT pk_doc FROM ").append(powerTable).append(")) or ").append(bodyTable + "." + "supplier").append("='~')");
            }
        }
        return sql.toString();
    }

    private static IDataPermissionPubService getDataPermissionPubService() {
        return (IDataPermissionPubService)NCLocator.getInstance().lookup(IDataPermissionPubService.class);
    }

    private static String getBodyTableByBillType(String billType) {
        String bodyTable = null;
        bodyTable = ArapBillTypeInfo.getInstance(billType).getTableNameItem();
        return bodyTable;
    }

    private static String getMainTableByBillType(String billType) {
        String mainTable = null;
        mainTable = ArapBillTypeInfo.getInstance(billType).getTableNameBill();
        return mainTable;
    }

    private static String getPKNameByBillType(String billType) {
        String pk_bill = null;
        pk_bill = ArapBillTypeInfo.getInstance(billType).getTablePrimaryKeyBill();
        return pk_bill;
    }

    private static List<String> extractCollectionAttrs(String billType) {
        String[] attrs = null;
        try {
            attrs = ArapBillTypeInfo.getInstance(billType).getItemvoClass().newInstance().getAttributeNames();
        }
        catch (Exception e) {
            throw new BusinessRuntimeException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0577") + billType);
        }
        ArrayList<String> collectionAttrs = new ArrayList<String>();
        if (attrs != null) {
            for (String attr : attrs) {
                collectionAttrs.add(attr);
            }
        }
        return collectionAttrs;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Logger
 *  nc.bs.mw.sqltrans.TempTable
 *  nc.itf.fipub.report.IPubReportConstants
 *  nc.jdbc.framework.ConnectionFactory
 *  nc.pubitf.rbac.IDataPermissionPubService
 *  nc.vo.arap.pub.BillEnumCollection$ObjType
 *  nc.vo.arap.receivable.ReceivableBillItemVO
 *  nc.vo.bd.cust.CustomerVO
 *  nc.vo.bd.material.MaterialVO
 *  nc.vo.pub.BusinessException
 *  nc.vo.util.innercode.NamedParamUtil
 *  nccloud.commons.lang.ArrayUtils
 *  nccloud.commons.lang.StringUtils
 */
package nc.bs.arap.sql;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.bs.mw.sqltrans.TempTable;
import nc.itf.fipub.report.IPubReportConstants;
import nc.jdbc.framework.ConnectionFactory;
import nc.pubitf.rbac.IDataPermissionPubService;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.receivable.ReceivableBillItemVO;
import nc.vo.bd.cust.CustomerVO;
import nc.vo.bd.material.MaterialVO;
import nc.vo.pub.BusinessException;
import nc.vo.util.innercode.NamedParamUtil;
import nccloud.commons.lang.ArrayUtils;
import nccloud.commons.lang.StringUtils;

public class ReminderSqlUtils
implements IPubReportConstants {
    public static final String TABLE = "table";
    public static final String COLUMN = "column";
    private static volatile List<Map<String, Map<String, String>>> powerMap = null;
    public static final String[] RESOURCE_IDS = new String[]{"b941438d-ce1f-4fd7-b972-f4f342fbd04f", "e4f48eaf-5567-4383-a370-a59cb3e8a451", "b26fa3cb-4087-4027-a3b6-c83ab2a086a9", "40d39c26-a2b6-4f16-a018-45664cac1a1f", "985be8a4-3a36-4778-8afe-2d8ed3902659", "2ee58f9b-781b-469f-b1d8-1816842515c3", "283d91a4-a8f4-4763-ac44-aae7401fa09a", "5461ada1-ef2a-419a-af14-656cf0641d34", "c099f7d7-52a9-4b98-bee7-2e3a6c3ea263", "eae040f4-3c88-413d-abc9-b15774463d46", "945f38b6-48ec-43e6-bb09-77ec89a3728f", "b0fa41cd-a649-4309-b685-d341a5d1b0ed"};
    private static int seq = 0;

    private static synchronized List<Map<String, Map<String, String>>> getDataPowerMaps(String[] resIds) {
        if (powerMap == null) {
            powerMap = new ArrayList<Map<String, Map<String, String>>>();
            HashMap<String, String> fldMap = null;
            HashMap<String, HashMap<String, String>> idMap = null;
            String tableName = null;
            String colName = null;
            for (String id : RESOURCE_IDS) {
                if ("b941438d-ce1f-4fd7-b972-f4f342fbd04f".equals(id) || "e4f48eaf-5567-4383-a370-a59cb3e8a451".equals(id)) {
                    tableName = ReceivableBillItemVO.getDefaultTable();
                    colName = "customer";
                } else if ("b26fa3cb-4087-4027-a3b6-c83ab2a086a9".equals(id)) {
                    tableName = ReceivableBillItemVO.getDefaultTable();
                    colName = "pk_deptid";
                } else if ("40d39c26-a2b6-4f16-a018-45664cac1a1f".equals(id)) {
                    tableName = ReceivableBillItemVO.getDefaultTable();
                    colName = "pk_psndoc";
                } else if ("985be8a4-3a36-4778-8afe-2d8ed3902659".equals(id)) {
                    tableName = ReceivableBillItemVO.getDefaultTable();
                    colName = "pk_org";
                } else if ("2ee58f9b-781b-469f-b1d8-1816842515c3".equals(id)) {
                    tableName = ReceivableBillItemVO.getDefaultTable();
                    colName = "project";
                } else if ("283d91a4-a8f4-4763-ac44-aae7401fa09a".equals(id)) {
                    tableName = ReceivableBillItemVO.getDefaultTable();
                    colName = "pk_subjcode";
                } else if ("5461ada1-ef2a-419a-af14-656cf0641d34".equals(id)) {
                    tableName = ReceivableBillItemVO.getDefaultTable();
                    colName = "pk_pcorg";
                } else if ("c099f7d7-52a9-4b98-bee7-2e3a6c3ea263".equals(id)) {
                    tableName = ReceivableBillItemVO.getDefaultTable();
                    colName = "material";
                } else if ("eae040f4-3c88-413d-abc9-b15774463d46".equals(id)) {
                    tableName = ReceivableBillItemVO.getDefaultTable();
                    colName = "material";
                } else if ("945f38b6-48ec-43e6-bb09-77ec89a3728f".equals(id)) {
                    tableName = ReceivableBillItemVO.getDefaultTable();
                    colName = "so_org";
                } else {
                    if (!"b0fa41cd-a649-4309-b685-d341a5d1b0ed".equals(id)) continue;
                    tableName = ReceivableBillItemVO.getDefaultTable();
                    colName = "pk_tradetypeid";
                }
                fldMap = new HashMap<String, String>();
                fldMap.put(TABLE, tableName);
                fldMap.put(COLUMN, colName);
                idMap = new HashMap<String, HashMap<String, String>>();
                idMap.put(id, fldMap);
                powerMap.add(idMap);
            }
        }
        return powerMap;
    }

    public static String getDataPermissionSql(String userID, String pk_group, String[] resIds, String operationCode) throws BusinessException {
        StringBuffer powerSqlBuffer = new StringBuffer("");
        if (StringUtils.isEmpty((CharSequence)userID) || StringUtils.isEmpty((CharSequence)pk_group) || ArrayUtils.isEmpty((Object[])resIds)) {
            return powerSqlBuffer.toString();
        }
        List<Map<String, Map<String, String>>> dataPowerMaps = ReminderSqlUtils.getDataPowerMaps(resIds);
        ArrayList<String> resList = new ArrayList<String>();
        ArrayList<String> tableList = new ArrayList<String>();
        ArrayList<String> colList = new ArrayList<String>();
        for (Map<String, Map<String, String>> map : dataPowerMaps) {
            Iterator<Map.Entry<String, Map<String, String>>> iterator = map.entrySet().iterator();
            if (!iterator.hasNext()) continue;
            Map.Entry<String, Map<String, String>> entry = iterator.next();
            if ("b941438d-ce1f-4fd7-b972-f4f342fbd04f".equals(entry.getKey())) {
                powerSqlBuffer.append(ReminderSqlUtils.getCustomerClassPowerSQL(userID, pk_group, operationCode, entry));
                continue;
            }
            if ("c099f7d7-52a9-4b98-bee7-2e3a6c3ea263".equals(entry.getKey())) {
                powerSqlBuffer.append(ReminderSqlUtils.getMaterialClassPowerSQL(userID, pk_group, operationCode, entry));
                continue;
            }
            resList.add(entry.getKey());
            tableList.add(entry.getValue().get(TABLE));
            colList.add(entry.getValue().get(COLUMN));
        }
        Object[] operationCodes = new String[tableList.size()];
        Arrays.fill(operationCodes, operationCode);
        powerSqlBuffer.append(ReminderSqlUtils.getDataRefSQLWherePart(userID, pk_group, resList.toArray(new String[0]), (String[])operationCodes, tableList.toArray(new String[0]), colList.toArray(new String[0])));
        return powerSqlBuffer.toString();
    }

    private static String getDataRefSQLWherePart(String userID, String pk_group, String[] resCodes, String[] operationCodes, String[] tableAlias, String[] tableColAlias) throws BusinessException {
        Object[] tmpTables = ((IDataPermissionPubService)NCLocator.getInstance().lookup(IDataPermissionPubService.class)).getDataPermProfileTableNameByBeanID(userID, resCodes, operationCodes, pk_group);
        if (ArrayUtils.isEmpty((Object[])tmpTables)) {
            return "";
        }
        StringBuffer sqlBuffer = new StringBuffer();
        for (int i = 0; i < tmpTables.length; ++i) {
            if (StringUtils.isEmpty((CharSequence)tmpTables[i])) continue;
            String sql = "{tableName}.{pk_column} in (select pk_doc from " + (String)tmpTables[i] + ")";
            NamedParamUtil nmu = new NamedParamUtil();
            nmu.addNamedParam("tableName", (Object)tableAlias[i]);
            nmu.addNamedParam("pk_column", (Object)tableColAlias[i]);
            sqlBuffer.append(" and ").append(nmu.format(sql));
        }
        return sqlBuffer.toString();
    }

    public static String getCustomerClassPowerSQL(String userID, String pk_group, String operationCode, Map.Entry<String, Map<String, String>> entry) throws BusinessException {
        String table = ((IDataPermissionPubService)NCLocator.getInstance().lookup(IDataPermissionPubService.class)).getDataPermProfileTableNameByBeanID(userID, entry.getKey(), operationCode, pk_group);
        if (StringUtils.isEmpty((CharSequence)table)) {
            return "";
        }
        String sql = " and " + entry.getValue().get(TABLE) + "." + entry.getValue().get(COLUMN) + " in (select " + "pk_customer" + " from " + CustomerVO.getDefaultTableName() + " where " + "pk_custclass" + " in (select pk_doc from " + table + ")) ";
        return sql;
    }

    public static String getMaterialClassPowerSQL(String userID, String pk_group, String operationCode, Map.Entry<String, Map<String, String>> entry) throws BusinessException {
        String table = ((IDataPermissionPubService)NCLocator.getInstance().lookup(IDataPermissionPubService.class)).getDataPermProfileTableNameByBeanID(userID, entry.getKey(), operationCode, pk_group);
        if (StringUtils.isEmpty((CharSequence)table)) {
            return "";
        }
        String sql = " and " + entry.getValue().get(TABLE) + "." + entry.getValue().get(COLUMN) + " in (select " + "pk_material" + " from " + MaterialVO.getDefaultTableName() + " where " + "pk_marbasclass" + " in (select pk_doc from " + table + ")) ";
        return sql;
    }

    public static String getFixedWhere() {
        return " ar_recitem.dr = 0 ";
    }

    public static synchronized int getTempTableSeq() {
        return seq++;
    }

    public static String createTmpTable(String tableName, String[] colNames, Integer[] colTypes) throws SQLException {
        String[] types = new String[colTypes.length];
        block5: for (int i = 0; i < colTypes.length; ++i) {
            switch (colTypes[i]) {
                case 12: {
                    types[i] = "varchar(100)";
                    continue block5;
                }
                case 3: {
                    types[i] = "decimal(28, 8)";
                    continue block5;
                }
                case 4: {
                    types[i] = "integer";
                    continue block5;
                }
            }
        }
        return ReminderSqlUtils.createTmpTable(tableName, colNames, types);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String createTmpTable(String tableName, String[] colNames, String[] colTypes) throws SQLException {
        Connection conn = null;
        try {
            conn = ConnectionFactory.getConnection();
            TempTable tempTable = new TempTable();
            StringBuffer colsBuffer = new StringBuffer();
            for (int i = 0; i < colTypes.length; ++i) {
                colsBuffer.append(colNames[i]).append(" ").append(colTypes[i]).append(", ");
            }
            String cols = colsBuffer.toString().substring(0, colsBuffer.length() - 2);
            tableName = tempTable.createTempTable(conn, tableName, cols, null);
        }
        finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            }
            catch (Exception e) {
                Logger.error((Object)e.getMessage(), (Throwable)e);
            }
        }
        return tableName;
    }

    public static String getAnalysedateName(String dateCode) {
        String dateName = "expiredate";
        if (dateCode.equals("expiredate")) {
            dateName = "expiredate";
        } else if (dateCode.equals("billdate")) {
            dateName = "ar_recbill.billdate";
        } else if (dateCode.equals("auditdate")) {
            dateName = "ar_recbill.approvedate";
        } else if (dateCode.equals("effectdate")) {
            dateName = "ar_recbill.effectdate";
        } else if (dateCode.equals("withindate")) {
            dateName = "termitem.innerctldeferdays";
        } else if (dateCode.equals("raisedate")) {
            dateName = "ar_recitem.busidate";
        }
        return dateName;
    }

    public static String convertAssoObj(Object assoObj) {
        Integer tempObj = -1;
        if (String.valueOf(0).equals(assoObj)) {
            tempObj = BillEnumCollection.ObjType.CUSTOMER.VALUE;
        } else if (String.valueOf(1).equals(assoObj)) {
            tempObj = BillEnumCollection.ObjType.SUPPLIER.VALUE;
        } else if (String.valueOf(2).equals(assoObj)) {
            tempObj = BillEnumCollection.ObjType.DEP.VALUE;
        } else if (String.valueOf(3).equals(assoObj)) {
            tempObj = BillEnumCollection.ObjType.PERSON.VALUE;
        }
        return tempObj.toString();
    }
}


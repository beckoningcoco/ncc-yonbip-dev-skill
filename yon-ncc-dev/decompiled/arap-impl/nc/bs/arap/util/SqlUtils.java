/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.sec.esapi.NCESAPI
 *  nc.pub.tool.SecureRandomProxy
 *  nc.vo.fi.pub.SqlUtils
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nccloud.commons.lang.ArrayUtils
 *  nccloud.commons.lang.StringUtils
 */
package nc.bs.arap.util;

import java.sql.SQLException;
import java.util.HashSet;
import nc.bs.arap.util.ArapBillType2TableMapping;
import nc.bs.sec.esapi.NCESAPI;
import nc.pub.tool.SecureRandomProxy;
import nc.vo.arap.utils.TempTableDAO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nccloud.commons.lang.ArrayUtils;
import nccloud.commons.lang.StringUtils;

public class SqlUtils {
    public static String getInInt(String fieldName, Integer[] pks, boolean ... useTempTable) throws SQLException {
        if (fieldName == null) {
            fieldName = "";
        }
        if (pks == null || pks.length == 0) {
            return fieldName + " in ('') ";
        }
        int tmpTableMinCount = TempTableDAO.getTmpTableMinCount();
        if (pks.length < tmpTableMinCount) {
            String inStr = SqlUtils.getInInt(fieldName, pks, 0, tmpTableMinCount);
            return inStr;
        }
        if (ArrayUtils.isEmpty((boolean[])useTempTable) || useTempTable[0]) {
            try {
                TempTableDAO tempDAO = new TempTableDAO();
                String mTableName = SqlUtils.getTempTablename(fieldName);
                String tname = tempDAO.createTable(mTableName, "pk", " varchar(20) ", pks);
                return fieldName + " in (select pk from " + tname + ") ";
            }
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            }
        }
        String m_str = " ( ";
        int end = tmpTableMinCount;
        int i = 0;
        while (i < pks.length) {
            String inStr = SqlUtils.getInInt(fieldName, pks, i, end);
            if (i != 0) {
                m_str = m_str + " or ";
            }
            m_str = m_str + inStr;
            i += tmpTableMinCount;
            end += tmpTableMinCount;
        }
        m_str = m_str + " )";
        return m_str;
    }

    public static String getInStr(String fieldName, String[] pks, boolean ... useTempTable) throws SQLException {
        if (fieldName == null) {
            fieldName = "";
        }
        if (pks == null || pks.length == 0) {
            return fieldName + " in ('') ";
        }
        int tmpTableMinCount = TempTableDAO.getTmpTableMinCount();
        if (pks.length < tmpTableMinCount) {
            String inStr = SqlUtils.getInStr(fieldName, pks, 0, tmpTableMinCount);
            return inStr;
        }
        if (ArrayUtils.isEmpty((boolean[])useTempTable) || useTempTable[0]) {
            try {
                TempTableDAO tempDAO = new TempTableDAO();
                String mTableName = SqlUtils.getTempTablename(fieldName);
                String tname = tempDAO.createTable(mTableName, "pk", " varchar(50) ", pks);
                return fieldName + " in (select pk from " + tname + ") ";
            }
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            }
        }
        String m_str = " ( ";
        int end = tmpTableMinCount;
        int i = 0;
        while (i < pks.length) {
            String inStr = SqlUtils.getInStr(fieldName, pks, i, end);
            if (i != 0) {
                m_str = m_str + " or ";
            }
            m_str = m_str + inStr;
            i += tmpTableMinCount;
            end += tmpTableMinCount;
        }
        m_str = m_str + " )";
        return m_str;
    }

    private static String getInInt(String fieldName, Integer[] pks, int start, int end) {
        StringBuffer sb = new StringBuffer();
        sb.append(fieldName + " in (");
        for (int i = 0; i < pks.length; ++i) {
            if (i < start) continue;
            if (i >= end) break;
            sb.append(pks[i]);
            sb.append(",");
        }
        String inStr = sb.substring(0, sb.length() - 1) + ") ";
        return inStr;
    }

    private static String getInStr(String fieldName, String[] pks, int start, int end) {
        StringBuffer sb = new StringBuffer();
        sb.append(fieldName + " in (");
        for (int i = 0; i < pks.length; ++i) {
            if (i < start) continue;
            if (i >= end) break;
            String key = pks[i] == null ? "" : pks[i].trim();
            sb.append("'");
            sb.append(NCESAPI.sqlEncode((String)key));
            sb.append("'");
            sb.append(",");
        }
        String inStr = sb.substring(0, sb.length() - 1) + ") ";
        return inStr;
    }

    public static String getInStr(String fieldName, CircularlyAccessibleValueObject[] vos, String voFieldName) throws SQLException {
        HashSet<String> pks = new HashSet<String>();
        for (int i = 0; i < vos.length; ++i) {
            pks.add(vos[i].getAttributeValue(voFieldName).toString().trim());
        }
        return SqlUtils.getInStr(fieldName, pks.toArray(new String[0]), true);
    }

    public static String getInStr(String fieldName, String[] pks) throws BusinessException {
        if (StringUtils.isEmpty((CharSequence)fieldName)) {
            return "";
        }
        return nc.vo.fi.pub.SqlUtils.getInStr((String)fieldName, (String[])pks, (boolean)true);
    }

    private static String getTempTablename(String fieldName) {
        StringBuffer tableName = new StringBuffer("tmpIn");
        String newFieldName = fieldName.replace('.', '_');
        int sLength = 11;
        if (newFieldName.length() > sLength) {
            newFieldName = newFieldName.substring(newFieldName.length() - sLength);
        }
        tableName.append(newFieldName).append(SecureRandomProxy.getRandomInstance().nextInt(9));
        String mTableName = tableName.toString();
        return mTableName;
    }

    public static String replaceZbVeriStatus(String sqlClause) {
        if (sqlClause.contains("zb.verifystatus = 0")) {
            sqlClause = sqlClause.replace("zb.verifystatus = 0", " fb.ybye=(fb.jfybje+fb.dfybje) ");
        } else if (sqlClause.contains("zb.verifystatus = 1")) {
            sqlClause = sqlClause.replace("zb.verifystatus = 1", " fb.ybye = 0");
        } else if (sqlClause.contains("zb.verifystatus = 2")) {
            sqlClause = sqlClause.replace("zb.verifystatus = 2", " fb.ybye<>(fb.jfybje+fb.dfybje) and fb.ybye <> 0");
        } else if (sqlClause.contains("zb.verifystatus in (0,1)")) {
            sqlClause = sqlClause.replace("zb.verifystatus in (0,1)", " (fb.ybye=(fb.jfybje+fb.dfybje) or fb.ybye = 0)");
        } else if (sqlClause.contains("zb.verifystatus in (0,2)")) {
            sqlClause = sqlClause.replace("zb.verifystatus in (0,2)", " (fb.ybye=(fb.jfybje+fb.dfybje) or (fb.ybye<>(fb.jfybje+fb.dfybje) and fb.ybye <> 0))");
        } else if (sqlClause.contains("zb.verifystatus in (1,2)")) {
            sqlClause = sqlClause.replace("zb.verifystatus in (1,2)", " (fb.ybye = 0 or (fb.ybye<>(fb.jfybje+fb.dfybje) and fb.ybye <> 0))");
        } else if (sqlClause.contains("zb.verifystatus in (0,1,2)")) {
            sqlClause = sqlClause.replace("zb.verifystatus in (0,1,2)", " 1=1");
        }
        return sqlClause;
    }

    public static String convertParentCond(String billType, String cond) {
        return ArapBillType2TableMapping.getParentTable(billType) + "." + cond;
    }

    public static String convertChildrenCond(String billType, String cond) {
        return ArapBillType2TableMapping.getChildrenTable(billType) + "." + cond;
    }
}


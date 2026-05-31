/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Logger
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFDouble
 *  nccloud.pubitf.arap.arappub.IArapBillPubUtilService
 */
package nc.web.arap.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.vo.arap.sysinit.SysinitConst;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDouble;
import nccloud.pubitf.arap.arappub.IArapBillPubUtilService;

public class ArapUtil {
    public static Integer getDisplayMode(String pk_org, Integer systemcode) {
        Integer displayMode = 0;
        try {
            String hxMode;
            String sysinitCode = "AR2";
            if (systemcode == 1) {
                sysinitCode = "AP2";
            }
            displayMode = SysinitConst.VERIFY_BILL.equals((hxMode = ((IArapBillPubUtilService)NCLocator.getInstance().lookup(IArapBillPubUtilService.class)).getParaString(pk_org, sysinitCode)).trim()) ? Integer.valueOf(0) : Integer.valueOf(1);
        }
        catch (Exception e) {
            ExceptionHandler.consume((Throwable)e);
            displayMode = 0;
        }
        return displayMode;
    }

    public static Integer getHxSeq(String pk_org, Integer systemcode) {
        Integer verifySeq = 0;
        String paraCode = "AR1";
        if (systemcode == 1) {
            paraCode = "AP1";
        }
        try {
            String hxSeq = ((IArapBillPubUtilService)NCLocator.getInstance().lookup(IArapBillPubUtilService.class)).getParaString(pk_org, paraCode);
            verifySeq = hxSeq.equals(SysinitConst.VERIFY_ZAO) ? Integer.valueOf(0) : Integer.valueOf(1);
        }
        catch (Exception e) {
            ExceptionHandler.consume((Throwable)e);
        }
        return verifySeq;
    }

    public static UFDouble format(UFDouble a) {
        return a == null ? UFDouble.ZERO_DBL : a;
    }

    public static void setFieldValueByName(String fieldName, String value, Class<?> fieldType, Object obj) {
        try {
            Object val = null;
            val = fieldType.getSimpleName().equals("Integer") ? Integer.valueOf(value) : (fieldType.getSimpleName().equals("Boolean") ? (value.equals("Y") ? Boolean.valueOf(true) : (value.equals("N") ? Boolean.valueOf(false) : Boolean.valueOf(Boolean.parseBoolean(value)))) : value);
            String firstLetter = fieldName.substring(0, 1).toUpperCase();
            String setter = "set" + firstLetter + fieldName.substring(1);
            Method method = obj.getClass().getMethod(setter, fieldType);
            method.invoke(obj, val);
        }
        catch (NoSuchMethodException e) {
            Logger.error((Object)e.getMessage());
        }
        catch (Exception e) {
            Logger.error((Object)e.getMessage());
        }
    }

    public static Object getFieldValueByName(String fieldName, Object o) {
        try {
            String firstLetter = fieldName.substring(0, 1).toUpperCase();
            String getter = "get" + firstLetter + fieldName.substring(1);
            Method method = o.getClass().getMethod(getter, new Class[0]);
            Object value = method.invoke(o, new Object[0]);
            return value;
        }
        catch (Exception e) {
            return null;
        }
    }

    public static String[] getFiledName(Object o) {
        Field[] fields = o.getClass().getDeclaredFields();
        String[] fieldNames = new String[fields.length];
        for (int i = 0; i < fields.length; ++i) {
            fieldNames[i] = fields[i].getName();
        }
        return fieldNames;
    }

    public static List getFiledsInfo(Object o) {
        Field[] fields = o.getClass().getDeclaredFields();
        ArrayList list = new ArrayList();
        HashMap<String, Object> infoMap = null;
        for (int i = 0; i < fields.length; ++i) {
            infoMap = new HashMap<String, Object>();
            infoMap.put("type", fields[i].getType().toString());
            infoMap.put("name", fields[i].getName());
            infoMap.put("value", ArapUtil.getFieldValueByName(fields[i].getName(), o));
            list.add(infoMap);
        }
        return list;
    }

    public static Map<String, Class<?>> getAllFieldType(Object o) {
        Field[] fields;
        HashMap map = new HashMap();
        for (Field field : fields = o.getClass().getDeclaredFields()) {
            map.put(field.getName(), field.getType());
        }
        return map;
    }

    public static Object[] getFiledValues(Object o) {
        String[] fieldNames = ArapUtil.getFiledName(o);
        Object[] value = new Object[fieldNames.length];
        for (int i = 0; i < fieldNames.length; ++i) {
            value[i] = ArapUtil.getFieldValueByName(fieldNames[i], o);
        }
        return value;
    }

    public static String getObjtyepValue(SuperVO vo) {
        String objtypepk = "";
        Integer objtype = (Integer)vo.getAttributeValue("objtype");
        if (objtype == 0) {
            objtypepk = vo.getAttributeValue("customer").toString();
        } else if (objtype == 1) {
            objtypepk = vo.getAttributeValue("supplier").toString();
        } else if (objtype == 2) {
            objtypepk = vo.getAttributeValue("pk_deptid").toString();
        } else if (objtype == 3) {
            objtypepk = vo.getAttributeValue("pk_psndoc").toString();
        }
        return objtypepk;
    }
}


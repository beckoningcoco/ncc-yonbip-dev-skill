/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.logging.Logger
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.ml.MultiLangContext
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.SuperVO
 */
package uap.vo.prealert.util;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.logging.Logger;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.ml.MultiLangContext;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;
import nc.vo.pub.pa.PreAlertException;

public class PreAlertUtil {
    public static boolean isEmpty(Collection<?> col) {
        return col == null || col.size() == 0;
    }

    public static boolean isNotEmpty(Collection<?> col) {
        return !PreAlertUtil.isEmpty(col);
    }

    public static <T> boolean isEmpty(T[] array) {
        return array == null || array.length == 0;
    }

    public static <T> boolean isNotEmpty(T[] array) {
        return !PreAlertUtil.isEmpty(array);
    }

    public static <T> T[] getFieldValues(Class<T> fieldType, SuperVO[] vos, String fieldName) {
        if (PreAlertUtil.isEmpty(vos)) {
            return null;
        }
        int length = vos.length;
        Object[] values = (Object[])Array.newInstance(fieldType, length);
        for (int i = 0; i < length; ++i) {
            values[i] = vos[i].getAttributeValue(fieldName);
        }
        return values;
    }

    public static <T> List<T> getFieldValuesAsList(Class<T> fieldType, SuperVO[] vos, String fieldName) {
        T[] array = PreAlertUtil.getFieldValues(fieldType, vos, fieldName);
        if (array == null) {
            return null;
        }
        ArrayList list = new ArrayList();
        PreAlertUtil.addToCollection(list, array);
        return list;
    }

    public static <T> void addToCollection(Collection<T> col, T[] array) {
        if (col != null && array != null) {
            int length = array.length;
            for (int i = 0; i < length; ++i) {
                col.add(array[i]);
            }
        }
    }

    public static void logAndThrow(Throwable e) throws BusinessException {
        Logger.error((Object)e.getMessage(), (Throwable)e);
        if (e instanceof BusinessException) {
            throw (BusinessException)e;
        }
        throw new PreAlertException(e.getMessage(), e);
    }

    public static String getCurrentLangSeqSuffix() {
        String suffix = "";
        int langSeq = PreAlertUtil.getCurrentLangSeq();
        if (langSeq != 1) {
            suffix = String.valueOf(langSeq);
        }
        return suffix;
    }

    public static int getCurrentLangSeq() {
        return MultiLangContext.getInstance().getCurrentLangSeq();
    }

    public static String getDefaultLangcode() {
        return MultiLangContext.getInstance().getEnableLangVOs()[0].getLangcode();
    }

    public static void doInDefaultLangBs(Runnable command) {
        String langcode = InvocationInfoProxy.getInstance().getLangCode();
        try {
            InvocationInfoProxy.getInstance().setLangCode(PreAlertUtil.getDefaultLangcode());
            command.run();
        }
        finally {
            InvocationInfoProxy.getInstance().setLangCode(langcode);
        }
    }

    public static String getSuperVONameOfCurrentLang(SuperVO vo, String nameField, String defaultName) {
        String suffix = PreAlertUtil.getCurrentLangSeqSuffix();
        String name = (String)vo.getAttributeValue(nameField + suffix);
        if (StringUtil.isEmptyWithTrim((String)name)) {
            return defaultName;
        }
        return name;
    }

    public static String getSuperVONameOfCurrentLang(SuperVO vo, String nameField) {
        String defaultName = (String)vo.getAttributeValue(nameField);
        return PreAlertUtil.getSuperVONameOfCurrentLang(vo, nameField, defaultName);
    }
}


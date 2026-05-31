/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.uap.busibean.ISysInitGetValue
 *  nc.itf.uap.busibean.ISysInitQry
 *  nc.pubitf.para.SysInitQuery
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pub.para.SysInitVO
 *  nc.vo.pubapp.pattern.exception.ExceptionUtils
 */
package nc.itf.arap.goldentax;

import java.util.Map;
import nc.bs.framework.common.NCLocator;
import nc.itf.uap.busibean.ISysInitGetValue;
import nc.itf.uap.busibean.ISysInitQry;
import nc.pubitf.para.SysInitQuery;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pub.para.SysInitVO;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class SysParaInitQuery {
    public static UFBoolean getParaBoolean(String pk_org, String initCode) {
        try {
            return SysInitQuery.getParaBoolean((String)pk_org, (String)initCode);
        }
        catch (BusinessException e) {
            ExceptionHandler.consume((Throwable)e);
            return null;
        }
    }

    public static UFDouble getParaDbl(String pk_org, String initCode) {
        try {
            return SysInitQuery.getParaDbl((String)pk_org, (String)initCode);
        }
        catch (BusinessException e) {
            ExceptionHandler.consume((Throwable)e);
            return null;
        }
    }

    public static Integer getParaInt(String pk_org, String initCode) {
        try {
            return SysInitQuery.getParaInt((String)pk_org, (String)initCode);
        }
        catch (BusinessException e) {
            ExceptionHandler.consume((Throwable)e);
            return null;
        }
    }

    public static String getParaString(String pk_org, String initCode) {
        try {
            return SysInitQuery.getParaString((String)pk_org, (String)initCode);
        }
        catch (BusinessException e) {
            ExceptionHandler.consume((Throwable)e);
            return initCode;
        }
    }

    public static String getParaStringNoCache(String pk_org, String initCode) {
        try {
            ISysInitGetValue isysinitgetvalue = (ISysInitGetValue)NCLocator.getInstance().lookup(ISysInitGetValue.class);
            Map map = isysinitgetvalue.queryBatchParaValues(pk_org, new String[]{initCode});
            if (null == map || map.isEmpty()) {
                return initCode;
            }
            return (String)map.get(initCode);
        }
        catch (BusinessException e) {
            ExceptionHandler.consume((Throwable)e);
            return initCode;
        }
    }

    public static Map<String, String> queryBatchParaValues(String pk_org, String[] initCodeAry) {
        try {
            return SysInitQuery.queryBatchParaValues((String)pk_org, (String[])initCodeAry);
        }
        catch (BusinessException e) {
            ExceptionHandler.consume((Throwable)e);
            return null;
        }
    }

    public static SysInitVO queryByParaCode(String pk_org, String initCode) {
        try {
            return SysInitQuery.querySysinitVO((String)pk_org, (String)initCode);
        }
        catch (BusinessException e) {
            ExceptionHandler.consume((Throwable)e);
            return null;
        }
    }

    public static SysInitVO[] querySysInit(String pk_org, String groupCode) {
        try {
            return SysInitQuery.querySysInit((String)pk_org, (String)groupCode);
        }
        catch (BusinessException e) {
            ExceptionUtils.wrappException((Exception)((Object)e));
            return null;
        }
    }

    public static SysInitVO[] querySysInit(String strWhere) {
        try {
            return ((ISysInitQry)NCLocator.getInstance().lookup(ISysInitQry.class)).getSysInitVOs(strWhere);
        }
        catch (BusinessException e) {
            ExceptionUtils.wrappException((Exception)((Object)e));
            return null;
        }
    }
}


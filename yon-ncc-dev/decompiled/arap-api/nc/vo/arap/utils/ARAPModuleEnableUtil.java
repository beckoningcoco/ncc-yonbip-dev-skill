/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.logging.Logger
 *  nc.pubitf.initgroup.InitGroupQuery
 *  nc.vo.pub.BusinessException
 *  nccloud.commons.lang.ArrayUtils
 */
package nc.vo.arap.utils;

import java.util.HashMap;
import java.util.Map;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.logging.Logger;
import nc.pubitf.initgroup.InitGroupQuery;
import nc.vo.pub.BusinessException;
import nccloud.commons.lang.ArrayUtils;

public class ARAPModuleEnableUtil {
    public static final String AM_FUNCODE = "45";
    public static final String AM_FA_FUNCODE = "2012";
    public static final String AM_AMPUB_FUNCODE = "4501";
    public static final String AM_AIM_FUNCODE = "4510";
    public static final String AM_AUM_FUNCODE = "4520";
    public static final String AM_ALM_FUNCODE = "4530";
    public static final String AM_EOM_FUNCODE = "4540";
    public static final String AM_EMM_FUNCODE = "4550";
    public static final String AM_EWM_FUNCODE = "4560";
    public static final String TM_FUNCODE = "36";
    public static final String TM_PS_FUNCODE = "3612";
    public static final String SO_FUNCODE = "4006";
    public static final String PU_FUNCODE = "4004";
    public static final String CREDIT_FUNCODE = "4032";
    public static final String CMP_MODULE_ID = "3607";
    public static final String OBM_MODULE_ID = "3610";
    public static final String FBM_MODULE_ID = "3618";
    public static final String TBB_MODULE_ID = "1050";
    public static final String IMAG_MODULE_ID = "1054";
    public static final String SSCRP_MODULE_ID = "1056";
    public static final String SSCIVM_MODULE_ID = "1058";
    public static final String SSCTP_MODULE_ID = "7010";
    public static final String GL_MODULE_ID = "2002";
    public static final String AR_MODULE_ID = "2006";
    public static final String REV_MODULE_ID = "2007";
    public static final String AP_MODULE_ID = "2008";
    public static final String ERM_MODULE_ID = "2011";

    public static boolean isEnable(String pk_group, String funcode) {
        try {
            return InitGroupQuery.isEnabled((String)(pk_group == null ? InvocationInfoProxy.getInstance().getGroupId() : pk_group), (String)funcode);
        }
        catch (BusinessException be) {
            Logger.error((Object)((Object)be));
            return false;
        }
    }

    public static Map<String, Boolean> isEnableBatch(String pk_group, String ... funcodes) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])funcodes)) {
            return null;
        }
        if (pk_group == null) {
            pk_group = InvocationInfoProxy.getInstance().getGroupId();
        }
        HashMap<String, Boolean> enableInfo = new HashMap<String, Boolean>();
        for (String funcode : funcodes) {
            enableInfo.put(funcode, ARAPModuleEnableUtil.isEnable(pk_group, funcode));
        }
        return enableInfo;
    }

    public static boolean isSOEnable(String pk_group) {
        return ARAPModuleEnableUtil.isEnable(pk_group, SO_FUNCODE);
    }

    public static boolean isPUEnable(String pk_group) {
        return ARAPModuleEnableUtil.isEnable(pk_group, PU_FUNCODE);
    }

    public static boolean isCREDITEnable(String pk_group) {
        return ARAPModuleEnableUtil.isEnable(pk_group, CREDIT_FUNCODE);
    }

    public static boolean isAMEnable(String pk_group) {
        return ARAPModuleEnableUtil.isEnable(pk_group, AM_FUNCODE);
    }

    public static boolean isFAEnable(String pk_group) {
        return ARAPModuleEnableUtil.isEnable(pk_group, AM_FA_FUNCODE);
    }

    public static boolean isAMPubEnable(String pk_group) {
        return ARAPModuleEnableUtil.isEnable(pk_group, AM_AMPUB_FUNCODE);
    }

    public static boolean isAIMEnable(String pk_group) {
        return ARAPModuleEnableUtil.isEnable(pk_group, AM_AIM_FUNCODE);
    }

    public static boolean isAUMEnable(String pk_group) {
        return ARAPModuleEnableUtil.isEnable(pk_group, AM_AUM_FUNCODE);
    }

    public static boolean isALMEnable(String pk_group) {
        return ARAPModuleEnableUtil.isEnable(pk_group, AM_ALM_FUNCODE);
    }

    public static boolean isEOMEnable(String pk_group) {
        return ARAPModuleEnableUtil.isEnable(pk_group, AM_EOM_FUNCODE);
    }

    public static boolean isEMMEnable(String pk_group) {
        return ARAPModuleEnableUtil.isEnable(pk_group, AM_EMM_FUNCODE);
    }

    public static boolean isEWMEnable(String pk_group) {
        return ARAPModuleEnableUtil.isEnable(pk_group, AM_EWM_FUNCODE);
    }

    public static boolean isTMEnable(String pk_group) {
        return ARAPModuleEnableUtil.isEnable(pk_group, TM_FUNCODE);
    }

    public static boolean isPSEnable(String pk_group) {
        return ARAPModuleEnableUtil.isEnable(pk_group, TM_PS_FUNCODE);
    }

    public static boolean isCMPEnable(String pk_group) {
        return ARAPModuleEnableUtil.isEnable(pk_group, CMP_MODULE_ID);
    }

    public static boolean isSscivmEnabled(String pk_group) {
        return ARAPModuleEnableUtil.isEnable(pk_group, SSCIVM_MODULE_ID);
    }

    public static boolean isSscrpEnabled(String pk_group) {
        return ARAPModuleEnableUtil.isEnable(pk_group, SSCRP_MODULE_ID);
    }

    public static boolean isImagEnabled(String pk_group) {
        return ARAPModuleEnableUtil.isEnable(pk_group, IMAG_MODULE_ID);
    }

    public static boolean isObmEnabled(String pk_group) {
        return ARAPModuleEnableUtil.isEnable(pk_group, OBM_MODULE_ID);
    }

    public static boolean isRevEnabled(String pk_group) {
        return ARAPModuleEnableUtil.isEnable(pk_group, REV_MODULE_ID);
    }

    public static boolean isFbmEnabled(String pk_group) {
        return ARAPModuleEnableUtil.isEnable(pk_group, FBM_MODULE_ID);
    }

    public static boolean isTbbEnabled(String pk_group) {
        return ARAPModuleEnableUtil.isEnable(pk_group, TBB_MODULE_ID);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.arap.closeacc.IArapGlCloseAccCheck
 *  nc.itf.arap.param.IArapParamService
 *  nc.itf.fi.pub.SysInit
 *  nc.itf.org.IAccountingBookQryService
 *  nc.pubitf.org.IOrgUnitPubService
 *  nc.vo.arap.param.ParamConsts
 *  nc.vo.arap.param.ParamVO
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.gl.checkclose.CheckResultVO
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.org.CloseAccBookVO
 *  nc.vo.pub.BusinessException
 *  nccloud.commons.lang.StringUtils
 */
package nc.impl.arap.closeacc;

import java.util.ArrayList;
import nc.bs.framework.common.NCLocator;
import nc.itf.arap.closeacc.IArapGlCloseAccCheck;
import nc.itf.arap.param.IArapParamService;
import nc.itf.fi.pub.SysInit;
import nc.itf.org.IAccountingBookQryService;
import nc.pubitf.org.IOrgUnitPubService;
import nc.vo.arap.param.ParamConsts;
import nc.vo.arap.param.ParamVO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.gl.checkclose.CheckResultVO;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.org.CloseAccBookVO;
import nc.vo.pub.BusinessException;
import nccloud.commons.lang.StringUtils;

public class ArapGlCloseAccCheckImpl
implements IArapGlCloseAccCheck {
    private static final String AP22 = "AP22";
    private static final String AR22 = "AR22";
    private static final String AR_SYSCODE = "2006";
    private static final String AP_SYSCODE = "2008";

    public CheckResultVO[] doCheck(CloseAccBookVO bookVO) throws BusinessException {
        String pk_org = bookVO.getPk_org();
        String glCloseMonth = ((IAccountingBookQryService)NCLocator.getInstance().lookup(IAccountingBookQryService.class)).queryAccperiodmonthVOByPK(bookVO.getPk_accperiodmonth()).getYearmth();
        ArrayList<CheckResultVO> resultVo = new ArrayList<CheckResultVO>();
        try {
            boolean canClose = true;
            boolean cantClose = this.checkSystem(ArapGlCloseAccCheckImpl.getCreateDate(AR_SYSCODE, pk_org), pk_org, glCloseMonth, AR22, ParamConsts.PARAM_CLSACC_AR);
            if (cantClose) {
                canClose = false;
            }
            String sysNameAr = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0473");
            CheckResultVO checkResultVOAr = new CheckResultVO();
            checkResultVOAr.setBookVO(bookVO);
            checkResultVOAr.setIsClosed(Boolean.valueOf(canClose));
            checkResultVOAr.setSysName(sysNameAr);
            resultVo.add(checkResultVOAr);
            cantClose = this.checkSystem(ArapGlCloseAccCheckImpl.getCreateDate(AP_SYSCODE, pk_org), pk_org, glCloseMonth, AP22, ParamConsts.PARAM_CLSACC_AP);
            if (cantClose) {
                canClose = false;
            }
            String sysNameAp = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0474");
            CheckResultVO checkResultVOAp = new CheckResultVO();
            checkResultVOAp.setBookVO(bookVO);
            checkResultVOAp.setIsClosed(Boolean.valueOf(canClose));
            checkResultVOAp.setSysName(sysNameAp);
            resultVo.add(checkResultVOAp);
            return resultVo.toArray(new CheckResultVO[0]);
        }
        catch (Exception e) {
            throw ExceptionHandler.handleException((Exception)e);
        }
    }

    private boolean checkSystem(String arapCreateDate, String pk_org, String glCloseMonth, String paramCode, String paramCode2) throws BusinessException {
        boolean cantClose = false;
        String param = SysInit.getParaString((String)pk_org, (String)paramCode);
        if ("Y".equals(param)) {
            ParamVO param2 = ((IArapParamService)NCLocator.getInstance().lookup(IArapParamService.class)).queryParamByCode(pk_org, paramCode2, null);
            if (param2 == null || StringUtils.isEmpty((CharSequence)param2.getParam_value())) {
                if (arapCreateDate != null && arapCreateDate.compareTo(glCloseMonth) <= 0) {
                    cantClose = true;
                }
            } else {
                String arapCloseDate = param2.getParam_value();
                if (glCloseMonth.compareTo(arapCloseDate) > 0) {
                    cantClose = true;
                }
            }
        }
        return cantClose;
    }

    public static String getCreateDate(String moduleCode, String pk_org) throws BusinessException {
        return ((IOrgUnitPubService)NCLocator.getInstance().lookup(IOrgUnitPubService.class)).getOrgModulePeriodByOrgIDAndModuleID(pk_org, moduleCode);
    }
}


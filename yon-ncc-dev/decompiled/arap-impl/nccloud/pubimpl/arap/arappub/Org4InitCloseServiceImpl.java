/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Log
 *  nc.itf.arap.param.IArapParamService
 *  nc.itf.arap.termendtransact.ICloseAccountService
 *  nc.vo.arap.param.ParamConsts
 *  nc.vo.arap.param.ParamVO
 *  nc.vo.arap.pub.ArapConstant
 *  nc.vo.arap.utils.StringUtil
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFBoolean
 *  nccloud.pubitf.arap.arappub.IOrg4InitCloseService
 */
package nccloud.pubimpl.arap.arappub;

import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Log;
import nc.itf.arap.param.IArapParamService;
import nc.itf.arap.termendtransact.ICloseAccountService;
import nc.vo.arap.param.ParamConsts;
import nc.vo.arap.param.ParamVO;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.arap.utils.StringUtil;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;
import nccloud.pubitf.arap.arappub.IOrg4InitCloseService;

public class Org4InitCloseServiceImpl
implements IOrg4InitCloseService {
    public void initClose(String pk_org, String nodeCode) throws BusinessException {
        if (StringUtil.isEmpty((String)pk_org)) {
            return;
        }
        ParamVO paramVO = this.getParaService().queryParamByCode(pk_org, nodeCode, null);
        if (null != paramVO && "Y".equalsIgnoreCase(paramVO.getParam_value().toString().trim())) {
            Log.getInstance(this.getClass()).debug((Object)NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0077"));
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0077"));
        }
        if (paramVO == null) {
            paramVO = new ParamVO();
            paramVO.setPk_org(pk_org);
            paramVO.setParam_code(nodeCode);
            paramVO.setParam_name(this.getParamName(nodeCode));
            paramVO.setParam_value("Y");
            this.getParaService().insertParams(new ParamVO[]{paramVO});
        } else {
            paramVO.setParam_value("Y");
            this.getParaService().updateParams(new ParamVO[]{paramVO});
        }
    }

    public void cancleInitClose(String org, String nodeCode) throws BusinessException {
        String sParamCode = this.getParamCode(nodeCode);
        ParamVO paramVO = this.getParaService().queryParamByCode(org, sParamCode, null);
        if (null == paramVO || "N".equalsIgnoreCase(paramVO.getParam_value().toString().trim())) {
            Log.getInstance(this.getClass()).debug((Object)NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0074"));
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0074"));
        }
        if (UFBoolean.TRUE.equals((Object)this.isSettleAccounts(paramVO))) {
            Log.getInstance(this.getClass()).debug((Object)NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0075"));
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0075"));
        }
        paramVO.setParam_value("N");
        this.getParaService().updateParams(new ParamVO[]{paramVO});
    }

    public void initClose(String[] orgs, String nodeCode) throws BusinessException {
        for (String org : orgs) {
            this.initClose(org, nodeCode);
        }
    }

    public void cancleInitClose(String[] orgs, String nodeCode) throws BusinessException {
        for (String org : orgs) {
            this.cancleInitClose(org, nodeCode);
        }
    }

    private IArapParamService getParaService() {
        return (IArapParamService)NCLocator.getInstance().lookup(IArapParamService.class);
    }

    private String getParamCode(String nodeCode) {
        String paramCode = null;
        if (ArapConstant.ARAP_FUNCODE_RECBILL_I.equals(nodeCode)) {
            paramCode = ParamConsts.PARAM_INIT_RECEIVE;
        } else if (ArapConstant.ARAP_FUNCODE_GATHERBILL_I.equals(nodeCode)) {
            paramCode = ParamConsts.PARAM_INIT_GATHER;
        } else if (ArapConstant.ARAP_FUNCODE_PAYABLEBILL_I.equals(nodeCode)) {
            paramCode = ParamConsts.PARAM_INIT_PAYABLE;
        } else if (ArapConstant.ARAP_FUNCODE_PAYBILL_I.equals(nodeCode)) {
            paramCode = ParamConsts.PARAM_INIT_PAY;
        }
        return paramCode;
    }

    public UFBoolean isSettleAccounts(ParamVO vo) throws BusinessException {
        String[] period;
        String pk_org = vo.getPk_org();
        String nodeCode = "2006";
        if (vo.getParam_code().startsWith("AP_INIT_")) {
            nodeCode = "2008";
        }
        if (null != (period = ((ICloseAccountService)NCLocator.getInstance().lookup(ICloseAccountService.class)).getCloseAccountInfo(nodeCode, pk_org)) && !"".equals(period[0]) && !"".equals(period[1])) {
            return UFBoolean.TRUE;
        }
        return UFBoolean.FALSE;
    }

    private String getParamName(String paramCode) {
        String paramName = null;
        if (ParamConsts.PARAM_INIT_RECEIVE.equals(paramCode)) {
            paramName = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0078");
        } else if (ParamConsts.PARAM_INIT_CUSPAYABLE.equals(paramCode)) {
            paramName = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0079");
        } else if (ParamConsts.PARAM_INIT_CUSPAY.equals(paramCode)) {
            paramName = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0080");
        } else if (ParamConsts.PARAM_INIT_GATHER.equals(paramCode)) {
            paramName = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0081");
        } else if (ParamConsts.PARAM_INIT_PAYABLE.equals(paramCode)) {
            paramName = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0082");
        } else if (ParamConsts.PARAM_INIT_PAY.equals(paramCode)) {
            paramName = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0083");
        } else if (ParamConsts.PARAM_INIT_SUPRECEIVE.equals(paramCode)) {
            paramName = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0084");
        } else if (ParamConsts.PARAM_INIT_SUPGATHER.equals(paramCode)) {
            paramName = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0085");
        }
        return paramName;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.bill.ArapBillDAO
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.arap.initbill.IInitBillCloseService
 *  nc.itf.arap.param.IArapParamService
 *  nc.vo.arap.param.ParamConsts
 *  nc.vo.arap.param.ParamVO
 *  nc.vo.arap.pub.ArapConstant
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  org.apache.commons.collections4.CollectionUtils
 *  org.apache.commons.lang3.ArrayUtils
 */
package nc.impl.arap.initbill;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import nc.bs.arap.bill.ArapBillDAO;
import nc.bs.framework.common.NCLocator;
import nc.itf.arap.initbill.IInitBillCloseService;
import nc.itf.arap.param.IArapParamService;
import nc.vo.arap.param.ParamConsts;
import nc.vo.arap.param.ParamVO;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.ArrayUtils;

public class InitBillCloseServiceImpl
implements IInitBillCloseService {
    public boolean isInitBillClosed(String nodeCode, String pk_org) throws BusinessException {
        String sParamCode = this.getParamCode(nodeCode);
        if (sParamCode == null) {
            return false;
        }
        ParamVO paramVO = this.getParaService().queryParamByCode(pk_org, sParamCode, null);
        return null != paramVO && "Y".equalsIgnoreCase(paramVO.getParam_value().toString().trim());
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

    private String getParamname(String nodeCode) {
        String paramname = null;
        if (ParamConsts.PARAM_INIT_RECEIVE.equals(nodeCode)) {
            paramname = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0203");
        } else if (ParamConsts.PARAM_INIT_GATHER.equals(nodeCode)) {
            paramname = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0204");
        } else if (ParamConsts.PARAM_INIT_PAYABLE.equals(nodeCode)) {
            paramname = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0201");
        } else if (ParamConsts.PARAM_INIT_PAY.equals(nodeCode)) {
            paramname = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0202");
        }
        return paramname;
    }

    public int isInitBillClosed(String[] nodeCodes, String pkOrg) throws BusinessException {
        for (int i = 0; i < nodeCodes.length; ++i) {
            if (this.isInitBillClosed(nodeCodes[i], pkOrg)) continue;
            return i;
        }
        return -1;
    }

    /*
     * WARNING - void declaration
     */
    public void isInitBillClosedBatch(String[] nodeCodes, String[] pk_orgs) throws BusinessException {
        void var7_9;
        ArrayList<Object> parList = new ArrayList<Object>();
        HashMap<String, String> retmap = new HashMap<String, String>();
        String[] stringArray = nodeCodes;
        int n = stringArray.length;
        boolean bl = false;
        while (var7_9 < n) {
            Object[] paramVO;
            String nodecode = stringArray[var7_9];
            String sParamCode = this.getParamCode(nodecode);
            if (sParamCode != null && !ArrayUtils.isEmpty((Object[])(paramVO = this.getParaService().queryParamByCode(pk_orgs, sParamCode, null)))) {
                parList.addAll(Arrays.asList(paramVO));
            }
            ++var7_9;
        }
        Map orgmap = new ArapBillDAO().getOrgNamebyPks(pk_orgs);
        if (CollectionUtils.isEmpty(parList)) {
            return;
        }
        for (ParamVO paramVO : parList) {
            String value;
            String string = value = paramVO.getParam_value() == null ? " " : paramVO.getParam_value();
            if (null == paramVO || !"N".equalsIgnoreCase(value.toString().trim())) continue;
            retmap.put(paramVO.getPk_org(), this.getParamname(paramVO.getParam_code()));
        }
        if (retmap.size() > 0) {
            ArrayList<String> error = new ArrayList<String>();
            for (Map.Entry parm : retmap.entrySet()) {
                String pkorg = (String)orgmap.get(parm.getKey());
                String nodname = (String)parm.getValue();
                error.add(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1253", null, new String[]{pkorg, nodname}));
            }
            throw new BusinessException(String.join((CharSequence)"\n", error));
        }
    }
}


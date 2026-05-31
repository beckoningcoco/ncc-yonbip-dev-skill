/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bd.accperiod.AccperiodmonthAccessor
 *  nc.bs.arap.util.BillDateUtils
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.arap.param.IArapParamService
 *  nc.itf.arap.termendtransact.CloseAccountVO
 *  nc.itf.arap.termendtransact.ICloseAccountService
 *  nc.pubitf.arap.bill.IArapBillPubQueryService
 *  nc.pubitf.org.ICloseAccQryPubServicer
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.param.ParamVO
 *  nc.vo.bd.period2.AccperiodmonthVO
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.org.closeaccbook.check.CheckResultEnum
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFBoolean
 *  nccloud.commons.lang.ArrayUtils
 *  nccloud.itf.arap.pub.IArapCheckFrozenService
 *  nccloud.pubitf.arap.baddebts.IBaddebtsPubService
 */
package nc.impl.arap.termendtransact;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import nc.bd.accperiod.AccperiodmonthAccessor;
import nc.bs.arap.util.BillDateUtils;
import nc.bs.framework.common.NCLocator;
import nc.itf.arap.param.IArapParamService;
import nc.itf.arap.termendtransact.CloseAccountVO;
import nc.itf.arap.termendtransact.ICloseAccountService;
import nc.pubitf.arap.bill.IArapBillPubQueryService;
import nc.pubitf.org.ICloseAccQryPubServicer;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.param.ParamVO;
import nc.vo.bd.period2.AccperiodmonthVO;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.org.closeaccbook.check.CheckResultEnum;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nccloud.commons.lang.ArrayUtils;
import nccloud.itf.arap.pub.IArapCheckFrozenService;
import nccloud.pubitf.arap.baddebts.IBaddebtsPubService;

public class CloseAccountServiceImpl
implements ICloseAccountService {
    public void updateCloseAccountInfo(String nodeCode, String pk_org, String year, String month) throws Exception {
        String sParamCode = BillDateUtils.getParamCode((String)nodeCode);
        ParamVO paramVO = this.getParaService().queryParamByCode(pk_org, sParamCode, null);
        String period = BillDateUtils.getPeriod((String)year, (String)month);
        if (paramVO == null) {
            paramVO = new ParamVO();
            paramVO.setPk_org(pk_org);
            paramVO.setParam_code(sParamCode);
            paramVO.setParam_name(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0357"));
            paramVO.setParam_value(period);
            this.getParaService().insertParams(new ParamVO[]{paramVO});
        } else {
            paramVO.setParam_value(period);
            this.getParaService().updateParams(new ParamVO[]{paramVO});
        }
    }

    public boolean[] isAccountClosed(CloseAccountVO[] closeAccoutVOs) throws BusinessException {
        CloseAccountVO[] cavos = ArrayUtils.isEmpty((Object[])closeAccoutVOs) ? new CloseAccountVO[]{} : closeAccoutVOs;
        boolean[] results = new boolean[cavos.length];
        boolean isReturn = false;
        ArrayList<String> periods = new ArrayList<String>();
        for (int i = 0; i < cavos.length; ++i) {
            results[i] = true;
            cavos[i].setiSysCode(null);
            periods.add(BillDateUtils.getPeriod((String)cavos[i].getYear(), (String)cavos[i].getMonth()));
        }
        if (isReturn) {
            return results;
        }
        ParamVO[] paramVOs = this.getParaService().queryParamByCode(closeAccoutVOs);
        if (paramVOs == null) {
            return results;
        }
        for (int i = 0; i < paramVOs.length; ++i) {
            ParamVO paramVO = paramVOs[i];
            String period = (String)periods.get(i);
            if (null == paramVO || null == paramVO.getParam_value()) continue;
            if (Integer.valueOf(period.substring(0, 4)) > Integer.valueOf(paramVO.getParam_value().substring(0, 4))) {
                results[i] = Boolean.TRUE;
                continue;
            }
            if (Integer.valueOf(period.substring(0, 4)) < Integer.valueOf(paramVO.getParam_value().substring(0, 4))) {
                results[i] = Boolean.FALSE;
                continue;
            }
            if (Integer.valueOf(period.substring(5, 7)) > Integer.valueOf(paramVO.getParam_value().substring(5, 7))) continue;
            results[i] = Boolean.FALSE;
        }
        return results;
    }

    public boolean isAccountClosed(String nodeCode, String pk_org, String year, String month) throws BusinessException {
        CloseAccountVO[] closeAccoutVOs = new CloseAccountVO[]{new CloseAccountVO()};
        closeAccoutVOs[0].setNodeCode(nodeCode);
        closeAccoutVOs[0].setPk_org(pk_org);
        closeAccoutVOs[0].setYear(year);
        closeAccoutVOs[0].setMonth(month);
        boolean[] accountClosed = this.isAccountClosed(closeAccoutVOs);
        if (ArrayUtils.isEmpty((boolean[])accountClosed)) {
            return true;
        }
        return accountClosed[0];
    }

    public String[] getCloseAccountInfo(String nodeCode, String pk_org) throws BusinessException {
        String sParamCode = BillDateUtils.getParamCode((String)nodeCode);
        ParamVO paramVO = this.getParaService().queryParamByCode(pk_org, sParamCode, null);
        if (null != paramVO) {
            return this.getResult(paramVO.getParam_value());
        }
        return new String[]{"", ""};
    }

    public Map<String, String[]> getCloseAccountInfoBatch(String nodeCode, String[] pk_orgs) throws BusinessException {
        String sParamCode = BillDateUtils.getParamCode((String)nodeCode);
        Object[] paramVO = this.getParaService().queryParamByCode(pk_orgs, sParamCode, null);
        HashMap<String, String[]> retMap = new HashMap<String, String[]>();
        if (ArrayUtils.isNotEmpty((Object[])paramVO)) {
            for (Object vo : paramVO) {
                retMap.put(vo.getPk_org(), this.getResult(vo.getParam_value()));
            }
            return retMap;
        }
        for (String org : pk_orgs) {
            retMap.put(org, new String[]{"", ""});
        }
        return retMap;
    }

    private String[] getResult(String period) {
        String[] res = null;
        res = period != null ? new String[]{period.substring(0, 4), period.substring(5, 7)} : new String[]{"", ""};
        return res;
    }

    private IArapParamService getParaService() {
        return (IArapParamService)NCLocator.getInstance().lookup(IArapParamService.class);
    }

    public CheckResultEnum checkCloseAccResult(String pk_org, String period, boolean isAr, String checkcode) throws BusinessException {
        SuperVO[] frozenbillvos;
        int frozenbills;
        SuperVO[] billvos;
        BaseBillVO[] unconfirmBills;
        UFBoolean isOthersysClose;
        boolean checkAll = false;
        if (checkcode == null) {
            checkAll = true;
        }
        StringBuffer errmsg = new StringBuffer();
        if (("AR1002".equals(checkcode) || "AP1002".equals(checkcode) || checkAll) && (isOthersysClose = this.checkcloseOtherSys(pk_org, period)) != null && !isOthersysClose.booleanValue()) {
            errmsg.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0676") + "@");
        }
        if (("AR1001".equals(checkcode) || "AP1001".equals(checkcode) || checkAll) && (unconfirmBills = this.queryUnconfirmBills(pk_org, period, isAr)) != null && unconfirmBills.length > 0) {
            errmsg.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0677") + "@");
        }
        if (("AR1003".equals(checkcode) || checkAll) && (billvos = this.queryLossandRecVO(pk_org, period)) != null && billvos.length > 0) {
            errmsg.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0961") + "@");
        }
        if (("AR1004".equals(checkcode) || "AP1003".equals(checkcode)) && (frozenbills = this.queryfrozenBills(pk_org, period, isAr)) != 0) {
            errmsg.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1021") + "@");
        }
        if ("AR1005".equals(checkcode) && (frozenbillvos = this.queryfrozenlossandrecBills(pk_org, period)) != null && frozenbillvos.length > 0) {
            errmsg.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1022") + "@");
        }
        CheckResultEnum rst = new CheckResultEnum();
        if (errmsg.length() == 0) {
            rst.setResultType(CheckResultEnum.result_type_success);
        } else {
            rst.setResultType(CheckResultEnum.result_type_failure);
            rst.setMessage(errmsg.toString());
        }
        return rst;
    }

    public Vector<Vector<String>> CheckCloseAccValue(String pk_org, String period, boolean isAr, String checkcode) throws BusinessException {
        SuperVO[] frozenbillvos;
        int frozenbills;
        SuperVO[] billvos;
        Vector<String> vTem2;
        BaseBillVO[] unconfirmBills;
        UFBoolean isOthersysClose;
        Vector<Vector<String>> result = new Vector<Vector<String>>();
        int i = 1;
        if (("AR1002".equals(checkcode) || "AP1002".equals(checkcode)) && (isOthersysClose = this.checkcloseOtherSys(pk_org, period)) != null && !isOthersysClose.booleanValue()) {
            Vector<String> vTem1 = new Vector<String>();
            result.add(vTem1);
            vTem1.addElement("" + i++);
            vTem1.addElement(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0672"));
            vTem1.addElement(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0674"));
        }
        if (("AR1001".equals(checkcode) || "AP1001".equals(checkcode)) && (unconfirmBills = this.queryUnconfirmBills(pk_org, period, isAr)) != null && unconfirmBills.length > 0) {
            vTem2 = new Vector<String>();
            vTem2.addElement("" + i);
            vTem2.addElement(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0675"));
            vTem2.addElement(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0052", null, new String[]{String.valueOf(unconfirmBills.length)}));
            result.add(vTem2);
        }
        if ("AR1003".equals(checkcode) && (billvos = this.queryLossandRecVO(pk_org, period)) != null && billvos.length > 0) {
            vTem2 = new Vector();
            vTem2.addElement("" + i);
            vTem2.addElement(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0962"));
            vTem2.addElement(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0052", null, new String[]{String.valueOf(String.valueOf(billvos.length))}));
            result.add(vTem2);
        }
        if (("AR1004".equals(checkcode) || "AP1003".equals(checkcode)) && (frozenbills = this.queryfrozenBills(pk_org, period, isAr)) != 0) {
            vTem2 = new Vector();
            vTem2.addElement("" + i);
            vTem2.addElement(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1017"));
            vTem2.addElement(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0052", null, new String[]{String.valueOf(frozenbills)}));
            result.add(vTem2);
        }
        if ("AR1005".equals(checkcode) && (frozenbillvos = this.queryfrozenlossandrecBills(pk_org, period)) != null && frozenbillvos.length > 0) {
            vTem2 = new Vector();
            vTem2.addElement("" + i);
            vTem2.addElement(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1018"));
            vTem2.addElement(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0052", null, new String[]{String.valueOf(String.valueOf(frozenbillvos.length))}));
            result.add(vTem2);
        }
        return result;
    }

    private BaseBillVO[] queryUnconfirmBills(String pk_org, String period, boolean isAr) throws BusinessException {
        String[] stringArray;
        if (isAr) {
            String[] stringArray2 = new String[2];
            stringArray2[0] = "F0";
            stringArray = stringArray2;
            stringArray2[1] = "F2";
        } else {
            String[] stringArray3 = new String[2];
            stringArray3[0] = "F1";
            stringArray = stringArray3;
            stringArray3[1] = "F3";
        }
        String[] billtypes = stringArray;
        IArapBillPubQueryService queryservice = (IArapBillPubQueryService)NCLocator.getInstance().lookup(IArapBillPubQueryService.class);
        BaseBillVO[] unconfirmBills = queryservice.findUnConfirmBillsByPeriod(pk_org, period, billtypes);
        return unconfirmBills;
    }

    private SuperVO[] queryLossandRecVO(String pk_org, String period) throws BusinessException {
        IBaddebtsPubService service = (IBaddebtsPubService)NCLocator.getInstance().lookup(IBaddebtsPubService.class);
        AccperiodmonthVO accperiodvo = AccperiodmonthAccessor.getInstance().queryAccperiodmonthVOByPk(period);
        SuperVO[] billvos = service.getLossandRecVOByDate(pk_org, accperiodvo.getBegindate(), accperiodvo.getEnddate());
        return billvos;
    }

    private UFBoolean checkcloseOtherSys(String pk_org, String period) throws BusinessException {
        AccperiodmonthVO accperiodvo = AccperiodmonthAccessor.getInstance().queryAccperiodmonthVOByPk(period);
        if (accperiodvo == null) {
            return null;
        }
        String yearmth = accperiodvo.getYearmth();
        UFBoolean res = ((ICloseAccQryPubServicer)NCLocator.getInstance().lookup(ICloseAccQryPubServicer.class)).isAllCostregionClosedForARAP(pk_org, yearmth);
        return res;
    }

    private int queryfrozenBills(String pk_org, String period, boolean isAr) throws BusinessException {
        String[] stringArray;
        if (isAr) {
            String[] stringArray2 = new String[3];
            stringArray2[0] = "F0";
            stringArray2[1] = "F2";
            stringArray = stringArray2;
            stringArray2[2] = "23E0";
        } else {
            String[] stringArray3 = new String[3];
            stringArray3[0] = "F1";
            stringArray3[1] = "F3";
            stringArray = stringArray3;
            stringArray3[2] = "23E1";
        }
        String[] billtypes = stringArray;
        IArapCheckFrozenService queryservice = (IArapCheckFrozenService)NCLocator.getInstance().lookup(IArapCheckFrozenService.class);
        int count = queryservice.findFrozenBills(pk_org, period, billtypes);
        return count;
    }

    private SuperVO[] queryfrozenlossandrecBills(String pk_org, String period) throws BusinessException {
        IArapCheckFrozenService queryservice = (IArapCheckFrozenService)NCLocator.getInstance().lookup(IArapCheckFrozenService.class);
        AccperiodmonthVO accperiodvo = AccperiodmonthAccessor.getInstance().queryAccperiodmonthVOByPk(period);
        SuperVO[] billvos = queryservice.findFrozenLossAndRecByDate(pk_org, accperiodvo.getBegindate(), accperiodvo.getEnddate());
        return billvos;
    }

    public void updateCloseAccountInfoBatch(String nodeCode, Map<String, String> closeinfoMap) throws Exception {
        ArrayList<String> orglist = new ArrayList<String>();
        HashMap<String, String> orgperiod = new HashMap<String, String>();
        for (Map.Entry<String, String> parm : closeinfoMap.entrySet()) {
            orglist.add(parm.getKey());
            String year = parm.getValue().split("-")[0];
            String month = parm.getValue().split("-")[1];
            String period = BillDateUtils.getPeriod((String)year, (String)month);
            orgperiod.put(parm.getKey(), period);
        }
        String sParamCode = BillDateUtils.getParamCode((String)nodeCode);
        Object[] paramVOs = this.getParaService().queryParamByCode(orglist.toArray(new String[0]), sParamCode, null);
        if (ArrayUtils.isEmpty((Object[])paramVOs)) {
            ArrayList<ParamVO> insertList = new ArrayList<ParamVO>();
            for (Map.Entry p : orgperiod.entrySet()) {
                ParamVO paramVO = new ParamVO();
                paramVO.setPk_org((String)p.getKey());
                paramVO.setParam_code(sParamCode);
                paramVO.setParam_name(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0357"));
                paramVO.setParam_value((String)p.getValue());
                insertList.add(paramVO);
            }
            this.getParaService().insertParams(insertList.toArray(new ParamVO[0]));
        } else {
            for (Object vo : paramVOs) {
                vo.setParam_value((String)orgperiod.get(vo.getPk_org()));
            }
            this.getParaService().updateParams((ParamVO[])paramVOs);
        }
    }
}


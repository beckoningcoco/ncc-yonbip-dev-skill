/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Logger
 *  nc.itf.tb.control.IAccessableBusiVO
 *  nc.itf.tb.control.IBusiSysExecDataProvider
 *  nc.itf.uap.IUAPQueryBS
 *  nc.jdbc.framework.processor.ArrayListProcessor
 *  nc.jdbc.framework.processor.ColumnListProcessor
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.pub.smart.data.DataSet
 *  nc.pub.smart.exception.SmartException
 *  nc.vo.fi.pub.SqlUtils
 *  nc.vo.fipub.report.QryObj
 *  nc.vo.fipub.report.ReportQueryCondVO
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.tb.obj.NtbParamVO
 *  nccloud.commons.lang.StringUtils
 */
package nc.vo.arap.ntb;

import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.itf.arap.report.IBalanceBO;
import nc.itf.tb.control.IAccessableBusiVO;
import nc.itf.tb.control.IBusiSysExecDataProvider;
import nc.itf.uap.IUAPQueryBS;
import nc.jdbc.framework.processor.ArrayListProcessor;
import nc.jdbc.framework.processor.ColumnListProcessor;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.pub.smart.data.DataSet;
import nc.pub.smart.exception.SmartException;
import nc.vo.arap.ntb.ArapNtbUtils;
import nc.vo.arap.ntb.ArapQueryVO;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.arap.pub.UFDoubleTool;
import nc.vo.arap.utils.NtbParamVOConverter;
import nc.vo.fi.pub.SqlUtils;
import nc.vo.fipub.report.QryObj;
import nc.vo.fipub.report.ReportQueryCondVO;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDouble;
import nc.vo.tb.obj.NtbParamVO;
import nccloud.commons.lang.StringUtils;

public class ArapBusiSysExecDataProvider
implements IBusiSysExecDataProvider {
    private IUAPQueryBS dao = (IUAPQueryBS)NCLocator.getInstance().lookup(IUAPQueryBS.class);

    public int getCtlPoint(String pk_org) throws RemoteException {
        return -1;
    }

    public IAccessableBusiVO[] getCvtProvider(IAccessableBusiVO[] runvos) throws RemoteException {
        return null;
    }

    public UFDouble[] getExecData(NtbParamVO ntbParamVO) throws BusinessException {
        if (ntbParamVO == null) {
            return null;
        }
        ArapConstant constant = new ArapConstant();
        UFDouble[] returnData = null;
        if (constant.ARAP_NTB_BILLTYPE_KEY_BALANCE.equals(ntbParamVO.getBill_type())) {
            returnData = this.queryArapBalance(NtbParamVOConverter.convertNtbParam2ReportQueryCondVO(ntbParamVO));
        } else if (constant.ARAP_NTB_CTL_KEY.equals(ntbParamVO.getData_attr())) {
            returnData = this.queryArapOccur(ntbParamVO);
        }
        return returnData;
    }

    public Map<String, UFDouble[]> getExecData(NtbParamVO ntbParamVO, String fieldcode, List<String> pkvalues, Map<String, List<String>> childmap) throws BusinessException {
        Map<Object, Object> res = new HashMap();
        ArapConstant constant = new ArapConstant();
        if (constant.ARAP_NTB_BILLTYPE_KEY_BALANCE.equals(ntbParamVO.getBill_type())) {
            res = this.queryArapBalance(NtbParamVOConverter.convertNtbParam2ReportQueryCondVO(ntbParamVO, fieldcode, childmap.keySet()), fieldcode, pkvalues);
        } else if (constant.ARAP_NTB_CTL_KEY.equals(ntbParamVO.getData_attr())) {
            res = this.queryArapOccur(ntbParamVO, fieldcode, pkvalues, childmap);
        }
        return this.dealResult(pkvalues, childmap, res);
    }

    private Map<String, UFDouble[]> dealResult(List<String> pkvalues, Map<String, List<String>> childmap, Map<String, UFDouble[]> res) {
        HashMap<String, UFDouble[]> combinres = new HashMap<String, UFDouble[]>();
        int index = 0;
        for (Map.Entry<String, UFDouble[]> resentry : res.entrySet()) {
            ++index;
            if (childmap.size() == 0) {
                combinres.put("EMPTY_GROUPDOC", resentry.getValue());
                continue;
            }
            List<String> pids = childmap.get(resentry.getKey());
            if (pids == null) {
                if (res.size() > 1 && index < res.size()) continue;
                return combinres;
            }
            for (String pkvalue : pids) {
                UFDouble[] data = (UFDouble[])combinres.get(pkvalue);
                data = data == null ? resentry.getValue() : this.sumArray(data, resentry.getValue());
                combinres.put(pkvalue, data);
            }
        }
        for (String pkvalue : pkvalues) {
            if (combinres.containsKey(pkvalue)) continue;
            UFDouble[] zeroData = new UFDouble[]{UFDouble.ZERO_DBL, UFDouble.ZERO_DBL, UFDouble.ZERO_DBL, UFDouble.ZERO_DBL};
            combinres.put(pkvalue, zeroData);
        }
        return combinres;
    }

    private UFDouble[] sumArray(UFDouble[] data, UFDouble[] value) {
        UFDouble[] result = new UFDouble[data.length];
        for (int i = 0; i < data.length; ++i) {
            result[i] = UFDoubleTool.sum(data[i], value[i]);
        }
        return result;
    }

    public UFDouble[][] getExecDataBatch(NtbParamVO[] ntbParamVOs) throws BusinessException {
        if (ntbParamVOs == null) {
            return null;
        }
        UFDouble[][] data = new UFDouble[ntbParamVOs.length][];
        for (int i = 0; i < ntbParamVOs.length; ++i) {
            data[i] = this.getExecData(ntbParamVOs[i]);
        }
        return data;
    }

    public UFDouble[] getReadyData(NtbParamVO ntbParamVO) throws BusinessException {
        ArapConstant constant = new ArapConstant();
        if (ntbParamVO == null) {
            return null;
        }
        if (constant.ARAP_NTB_BILLTYPE_KEY_BALANCE.equals(ntbParamVO.getBill_type())) {
            return new UFDouble[]{UFDouble.ZERO_DBL, UFDouble.ZERO_DBL, UFDouble.ZERO_DBL, UFDouble.ZERO_DBL};
        }
        ArapQueryVO queryVO = ArapNtbUtils.analyseParam(ntbParamVO);
        queryVO.setBillstatus(ArapQueryVO.BILLSTATUS_SAVE);
        this.validate(queryVO);
        queryVO.setOrgatt_fld(ntbParamVO.getOrg_Attr());
        return this.getData(queryVO);
    }

    public Map<String, UFDouble[]> getReadyData(NtbParamVO ntbParamVO, String fieldcode, List<String> pkvalues, Map<String, List<String>> childmap) throws BusinessException {
        UFDouble[] zeroValue = new UFDouble[]{UFDouble.ZERO_DBL, UFDouble.ZERO_DBL, UFDouble.ZERO_DBL, UFDouble.ZERO_DBL};
        ArapConstant constant = new ArapConstant();
        if (ntbParamVO == null || constant.ARAP_NTB_BILLTYPE_KEY_BALANCE.equals(ntbParamVO.getBill_type())) {
            HashMap<String, UFDouble[]> resMap = new HashMap<String, UFDouble[]>();
            for (String pk : pkvalues) {
                resMap.put(pk, zeroValue);
            }
            return resMap;
        }
        ArapQueryVO queryVO = ArapNtbUtils.analyseParam(ntbParamVO, fieldcode, childmap.keySet());
        queryVO.setBillstatus(ArapQueryVO.BILLSTATUS_SAVE);
        this.validate(queryVO);
        queryVO.setOrgatt_fld(ntbParamVO.getOrg_Attr());
        Map<String, UFDouble[]> res = this.getData(queryVO, fieldcode);
        return this.dealResult(pkvalues, childmap, res);
    }

    public UFDouble[][] getReadyDataBatch(NtbParamVO[] ntbParamVO) throws BusinessException {
        if (ntbParamVO == null) {
            return null;
        }
        UFDouble[][] data = new UFDouble[ntbParamVO.length][];
        for (int i = 0; i < ntbParamVO.length; ++i) {
            data[i] = this.getReadyData(ntbParamVO[i]);
        }
        return data;
    }

    private UFDouble[] getData(ArapQueryVO queryVO) throws BusinessException {
        UFDouble[] returnData = new UFDouble[4];
        String sql = this.createSql(queryVO);
        List list = (List)this.dao.executeQuery(sql, (ResultSetProcessor)new ArrayListProcessor());
        if (list != null && list.size() == 1) {
            Object[] obj = (Object[])list.get(0);
            returnData[0] = obj[0] == null ? UFDouble.ZERO_DBL : new UFDouble(obj[0].toString());
            returnData[1] = obj[1] == null ? UFDouble.ZERO_DBL : new UFDouble(obj[1].toString());
            returnData[2] = obj[2] == null ? UFDouble.ZERO_DBL : new UFDouble(obj[2].toString());
            returnData[3] = obj[3] == null ? UFDouble.ZERO_DBL : new UFDouble(obj[3].toString());
        }
        return returnData;
    }

    private Map<String, UFDouble[]> getData(ArapQueryVO queryVO, String fieldcode) throws BusinessException {
        HashMap<String, UFDouble[]> resMap = new HashMap<String, UFDouble[]>();
        String sql = this.createSql(queryVO, fieldcode);
        List list = (List)this.dao.executeQuery(sql, (ResultSetProcessor)new ArrayListProcessor());
        if (list != null && !list.isEmpty()) {
            for (Object[] obj : list) {
                UFDouble[] returnData = new UFDouble[4];
                if (obj.length == 4) {
                    returnData[0] = obj[0] == null ? UFDouble.ZERO_DBL : new UFDouble(obj[0].toString());
                    returnData[1] = obj[1] == null ? UFDouble.ZERO_DBL : new UFDouble(obj[1].toString());
                    returnData[2] = obj[2] == null ? UFDouble.ZERO_DBL : new UFDouble(obj[2].toString());
                    returnData[3] = obj[3] == null ? UFDouble.ZERO_DBL : new UFDouble(obj[3].toString());
                    resMap.put("EMPTY_GROUPDOC", returnData);
                    continue;
                }
                String fieldpk = obj[0] == null ? "" : obj[0].toString();
                returnData[0] = obj[1] == null ? UFDouble.ZERO_DBL : new UFDouble(obj[1].toString());
                returnData[1] = obj[2] == null ? UFDouble.ZERO_DBL : new UFDouble(obj[2].toString());
                returnData[2] = obj[3] == null ? UFDouble.ZERO_DBL : new UFDouble(obj[3].toString());
                returnData[3] = obj[4] == null ? UFDouble.ZERO_DBL : new UFDouble(obj[4].toString());
                resMap.put(fieldpk, returnData);
            }
        }
        return resMap;
    }

    private String createSql(ArapQueryVO vo) throws BusinessException {
        return this.createSql(vo, null);
    }

    private String createSql(ArapQueryVO vo, String fieldcode) throws BusinessException {
        String batchfieldName = null;
        ArapQueryVO vonew = (ArapQueryVO)((Object)vo.clone());
        List<Object> list = new ArrayList();
        ArrayList<String> valuelist = new ArrayList();
        if (!StringUtil.isEmpty((String)fieldcode)) {
            batchfieldName = fieldcode.substring(7);
            if ("virtualorg".equals(batchfieldName)) {
                Map<String, List<String>> queryCondMap = vonew.getQueryCondMap();
                valuelist = queryCondMap.get(batchfieldName);
                queryCondMap.remove(batchfieldName);
                batchfieldName = "pk_org";
                list = this.getOrgSql(valuelist);
                vonew.getQueryCondMap().put("pk_org", list);
            }
            batchfieldName = fieldcode.contains("arap_h") ? "fih." + batchfieldName : "fib." + batchfieldName;
        }
        String sql = this.createSelectFrom(vonew.getBill_code(), batchfieldName, vonew.getMoneyattr_fld()) + this.createWherePart(vonew);
        if (batchfieldName != null) {
            sql = sql + " group by " + batchfieldName;
        }
        vo.getQueryCondMap().put(fieldcode, valuelist);
        return sql;
    }

    private List<String> getOrgSql(List<String> value) throws BusinessException {
        StringBuffer sb = new StringBuffer();
        sb.append(" select sourcer  from org_relation where ");
        sb.append(SqlUtils.getInStr((String)"target", (String[])value.toArray(new String[0]), (boolean)true));
        return (List)this.dao.executeQuery(sb.toString(), (ResultSetProcessor)new ColumnListProcessor());
    }

    public String createWherePart(ArapQueryVO vo) throws BusinessException {
        StringBuffer sb = new StringBuffer();
        String[] objs = ArapNtbUtils.getTable(vo.getBill_code());
        sb.append(" inner join ").append(objs[0]).append(" fih on fib.").append(objs[1]).append("=fih.").append(objs[1]);
        sb.append(" where fih.dr = 0 and fib.dr=0 ");
        if ("F1".equals(vo.getBill_code()) || "F3".equals(vo.getBill_code())) {
            sb.append(" and (isnull(fih.isrefund, 'N') = 'N' or (fih.isrefund = 'Y' and fib.objtype <> 0))");
        }
        ArapNtbUtils.getHeadWhereSql(vo, sb);
        if (!StringUtils.isEmpty((CharSequence)vo.getPk_currency())) {
            sb.append(" and ").append(" fib.pk_currtype = '" + vo.getPk_currency() + "'");
        }
        for (Map.Entry<String, List<String>> entry : vo.getQueryCondMap().entrySet()) {
            String field = entry.getKey();
            List<String> value = entry.getValue();
            if ("virtualorg".equals(entry.getKey())) {
                field = "pk_org";
                value = this.getOrgSql(entry.getValue());
            }
            sb.append(" and ").append(SqlUtils.getInStr((String)("fib." + field), (String[])value.toArray(new String[0]), (boolean)true));
        }
        sb.append(" and ").append(SqlUtils.getInStr((String)"fib.pk_tradetype", (String[])vo.getPk_tradetypes(), (boolean)true));
        String[] strs = ArapNtbUtils.getBodyTable(vo.getBill_code());
        sb.append(" and not exists (select 1 from arap_tally tally where tally.pk_item=fib.").append(strs[1]).append(" and tally.busitype = 411) ");
        return sb.toString();
    }

    private String createSelectFrom(String billCode, String batchfieldName, String moneyattr_fld) {
        String tableName = null;
        String money = null;
        String local_money = null;
        String group_money = null;
        String global_money = null;
        ArapConstant constant = new ArapConstant();
        if ("F0".equals(billCode)) {
            tableName = "ar_recitem";
        } else if ("F1".equals(billCode)) {
            tableName = "ap_payableitem";
        } else if ("F2".equals(billCode)) {
            tableName = "ar_gatheritem";
        } else if ("F3".equals(billCode)) {
            tableName = "ap_payitem";
        }
        if ("F0".equals(billCode) || "F3".equals(billCode)) {
            money = "money_de";
            local_money = "local_money_de";
            group_money = "groupdebit";
            global_money = "globaldebit";
            if (!StringUtil.isEmpty((String)moneyattr_fld)) {
                if (constant.ARAP_NTB_CTL_NOTAX_KEY.equals(moneyattr_fld)) {
                    money = "notax_de";
                    local_money = "local_notax_de";
                    group_money = "groupnotax_de";
                    global_money = "globalnotax_de";
                } else if (constant.ARAP_NTB_CTL_TAX_KEY.equals(moneyattr_fld)) {
                    money = "local_tax_de";
                    local_money = "local_tax_de";
                    group_money = "local_tax_de";
                    global_money = "local_tax_de";
                }
            }
        } else if ("F2".equals(billCode) || "F1".equals(billCode)) {
            money = "money_cr";
            local_money = "local_money_cr";
            group_money = "groupcrebit";
            global_money = "globalcrebit";
            if (!StringUtil.isEmpty((String)moneyattr_fld)) {
                if (constant.ARAP_NTB_CTL_NOTAX_KEY.equals(moneyattr_fld)) {
                    money = "notax_cr";
                    local_money = "local_notax_cr";
                    group_money = "groupnotax_cre";
                    global_money = "globalnotax_cre";
                } else if (constant.ARAP_NTB_CTL_TAX_KEY.equals(moneyattr_fld)) {
                    money = "local_tax_cr";
                    local_money = "local_tax_cr";
                    group_money = "local_tax_cr";
                    global_money = "local_tax_cr";
                }
            }
        }
        String sql = "select ";
        if (batchfieldName != null) {
            sql = sql + batchfieldName + ",";
        }
        return sql + "sum(fib." + global_money + "), sum(fib." + group_money + "), sum(fib." + local_money + "), sum(fib." + money + ") from " + tableName + " fib";
    }

    private void validate(ArapQueryVO queryVO) throws BusinessException {
        if (StringUtils.isEmpty((CharSequence)queryVO.getBegdate())) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0366"));
        }
        if (StringUtils.isEmpty((CharSequence)queryVO.getEnddate())) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0367"));
        }
        if (StringUtils.isEmpty((CharSequence)queryVO.getBill_code())) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0368"));
        }
    }

    public UFDouble[] getPointData(NtbParamVO param) throws BusinessException {
        return null;
    }

    public UFDouble[][] getPointDataBatch(NtbParamVO[] param) throws BusinessException {
        return null;
    }

    public void createBillType(NtbParamVO[] arg0) throws BusinessException {
    }

    private UFDouble[] queryArapOccur(NtbParamVO ntbParamVO) throws BusinessException {
        ArapQueryVO queryVO = ArapNtbUtils.analyseParam(ntbParamVO);
        this.validate(queryVO);
        if ("UFIND".equals(ntbParamVO.getMethodCode())) {
            queryVO.setBillstatus(ntbParamVO.isUnInure() ? ArapQueryVO.BILLSTATUS_ALL : ArapQueryVO.BILLSTATUS_EFFECT);
        } else {
            queryVO.setBillstatus(ArapQueryVO.BILLSTATUS_SAVE);
        }
        queryVO.setOrgatt_fld(ntbParamVO.getOrg_Attr());
        return this.getData(queryVO);
    }

    private Map<String, UFDouble[]> queryArapOccur(NtbParamVO ntbParamVO, String fieldcode, List<String> pkvalues, Map<String, List<String>> childmap) throws BusinessException {
        ArapQueryVO queryVO = ArapNtbUtils.analyseParam(ntbParamVO, fieldcode, childmap.keySet());
        this.validate(queryVO);
        if ("UFIND".equals(ntbParamVO.getMethodCode())) {
            queryVO.setBillstatus(ntbParamVO.isUnInure() ? ArapQueryVO.BILLSTATUS_ALL : ArapQueryVO.BILLSTATUS_EFFECT);
        } else {
            queryVO.setBillstatus(ArapQueryVO.BILLSTATUS_SAVE);
        }
        queryVO.setOrgatt_fld(ntbParamVO.getOrg_Attr());
        return this.getData(queryVO, fieldcode);
    }

    private UFDouble[] queryArapBalance(ReportQueryCondVO queryCondVO) throws BusinessException {
        try {
            if (queryCondVO.getQryObjs().size() == 0) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0606"));
            }
            if (queryCondVO.getRepInitContext() == null) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0607"));
            }
            DataSet result = ((IBalanceBO)NCLocator.getInstance().lookup(IBalanceBO.class)).query(queryCondVO, null);
            String[] balanceField = new String[]{"gl_bal_loc", "gr_bal_loc", "bal_loc", "bal_ori"};
            UFDouble[] returnData = new UFDouble[balanceField.length];
            if (result.getDatas() == null || result.getDatas().length == 0) {
                for (int i = 0; i < balanceField.length; ++i) {
                    returnData[i] = UFDouble.ZERO_DBL;
                }
            } else {
                Object[] rowData = result.getDatas()[result.getDatas().length - 1];
                for (int i = 0; i < balanceField.length; ++i) {
                    returnData[i] = new UFDouble(rowData[result.getMetaData().getIndex(balanceField[i])].toString());
                }
            }
            return returnData;
        }
        catch (SmartException e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
            throw new BusinessException(e.getMessage(), (Throwable)e);
        }
    }

    private Map<String, UFDouble[]> queryArapBalance(ReportQueryCondVO queryCondVO, String fieldcode, List<String> pkvalues) throws BusinessException {
        try {
            String fieldName;
            HashMap<String, UFDouble[]> resMap = new HashMap<String, UFDouble[]>();
            if (queryCondVO.getQryObjs().size() == 0) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0606"));
            }
            if (queryCondVO.getRepInitContext() == null) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0607"));
            }
            DataSet result = ((IBalanceBO)NCLocator.getInstance().lookup(IBalanceBO.class)).query(queryCondVO, null);
            String[] balanceField = new String[]{"gl_bal_loc", "gr_bal_loc", "bal_loc", "bal_ori"};
            UFDouble[] returnData = new UFDouble[balanceField.length];
            String string = fieldName = fieldcode != null && (fieldcode.startsWith("arap_h_") || fieldcode.startsWith("arap_b_")) ? fieldcode.substring(7) : fieldcode;
            if (result.getDatas() == null || result.getDatas().length == 0) {
                for (int i = 0; i < balanceField.length; ++i) {
                    returnData[i] = UFDouble.ZERO_DBL;
                }
                for (String pkvalue : pkvalues) {
                    resMap.put(pkvalue, returnData);
                }
            } else {
                for (Object[] rowData : result.getDatas()) {
                    Object rnObj = rowData[result.getMetaData().getIndex("rn")];
                    if (new BigDecimal(rnObj.toString()).compareTo(new BigDecimal(1000000)) >= 0) continue;
                    for (int i = 0; i < queryCondVO.getQryObjs().size(); ++i) {
                        UFDouble[] resdata = null;
                        Object itemPK = null;
                        if (StringUtil.isEmpty((String)fieldcode) || fieldName.equals(((QryObj)queryCondVO.getQryObjs().get(i)).getBillFieldName())) {
                            itemPK = rowData[result.getMetaData().getIndex("qryobj" + i + "pk")];
                        } else {
                            int index = result.getMetaData().getIndex(fieldName);
                            if (index != -1) {
                                itemPK = rowData[result.getMetaData().getIndex(fieldName)];
                            }
                        }
                        if (itemPK != null) {
                            resdata = (UFDouble[])resMap.get(itemPK.toString());
                        }
                        if (resdata == null) {
                            resdata = new UFDouble[balanceField.length];
                        }
                        for (int j = 0; j < balanceField.length; ++j) {
                            resdata[j] = UFDoubleTool.sum(resdata[j], new UFDouble(rowData[result.getMetaData().getIndex(balanceField[j])].toString()));
                        }
                        if (itemPK == null) continue;
                        resMap.put(itemPK.toString(), resdata);
                    }
                }
            }
            return resMap;
        }
        catch (SmartException e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
            throw new BusinessException(e.getMessage(), (Throwable)e);
        }
    }

    public Map<NtbParamVO, Map<String, UFDouble[]>> getExecDataGroupBatch(String fieldcode, Map<NtbParamVO, List<String>> paramap, Map<String, String[]> childmap) throws BusinessException {
        HashMap<NtbParamVO, Map<String, UFDouble[]>> res = new HashMap<NtbParamVO, Map<String, UFDouble[]>>();
        for (Map.Entry<NtbParamVO, List<String>> entry : paramap.entrySet()) {
            NtbParamVO paramvo = entry.getKey();
            List<String> pkvalues = entry.getValue();
            Map<String, List<String>> child2p = this.getChild2Parent(fieldcode, childmap, paramvo, pkvalues);
            Map<String, UFDouble[]> value = this.getExecData(paramvo, pkvalues.size() == 0 ? null : fieldcode, pkvalues, child2p);
            res.put(paramvo, value);
        }
        return res;
    }

    public Map<NtbParamVO, Map<String, UFDouble[]>> getReadyDataGroupBatch(String fieldcode, Map<NtbParamVO, List<String>> paramap, Map<String, String[]> childmap) throws BusinessException {
        HashMap<NtbParamVO, Map<String, UFDouble[]>> res = new HashMap<NtbParamVO, Map<String, UFDouble[]>>();
        for (Map.Entry<NtbParamVO, List<String>> entry : paramap.entrySet()) {
            NtbParamVO paramvo = entry.getKey();
            List<String> pkvalues = entry.getValue();
            Map<String, List<String>> child2p = this.getChild2Parent(fieldcode, childmap, paramvo, pkvalues);
            Map<String, UFDouble[]> value = this.getReadyData(paramvo, pkvalues.size() == 0 ? null : fieldcode, pkvalues, child2p);
            res.put(paramvo, value);
        }
        return res;
    }

    private Map<String, List<String>> getChild2Parent(String fieldcode, Map<String, String[]> childmap, NtbParamVO paramvo, List<String> pkvalues) {
        HashMap<String, List<String>> child2p = new HashMap<String, List<String>>();
        if (pkvalues != null && pkvalues.size() > 0) {
            String[] busiAttrs = paramvo.getBusiAttrs();
            int index = 0;
            for (int i = 0; i < busiAttrs.length; ++i) {
                if (!busiAttrs[i].equals(fieldcode)) continue;
                index = i;
                break;
            }
            boolean includelower = paramvo.getIncludelower()[index];
            for (String pk : pkvalues) {
                if (includelower) {
                    String[] childs = childmap.get(pk);
                    if (childs == null || childs.length == 0) {
                        childs = new String[]{pk};
                    }
                    for (String child : childs) {
                        ArrayList<String> list = (ArrayList<String>)child2p.get(child);
                        if (list == null) {
                            list = new ArrayList<String>();
                            child2p.put(child, list);
                        }
                        list.add(pk);
                    }
                    continue;
                }
                ArrayList<String> list = (ArrayList<String>)child2p.get(pk);
                if (list == null) {
                    list = new ArrayList<String>();
                    child2p.put(pk, list);
                }
                list.add(pk);
            }
        }
        return child2p;
    }
}


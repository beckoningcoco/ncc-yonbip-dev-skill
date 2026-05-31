/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Logger
 *  nc.md.MDBaseQueryFacade
 *  nc.md.model.IBean
 *  nc.md.model.MetaDataException
 *  nc.md.model.type.impl.RefType
 *  nc.pub.report.utils.ReportSqlUtils
 *  nc.pubitf.uapbd.IAccountPubService
 *  nc.vo.bd.account.AccountVO
 *  nc.vo.fi.pub.SqlUtils
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.fipub.report.AggReportInitializeVO
 *  nc.vo.fipub.report.QryObj
 *  nc.vo.fipub.report.ReportInitializeVO
 *  nc.vo.fipub.report.ReportQueryCondVO
 *  nc.vo.gl.busirecon.data.GlBusiReconResultVO
 *  nc.vo.gl.busirecon.query.BridgeQueryVO
 *  nc.vo.gl.busirecon.query.BusiReconQryVO
 *  nc.vo.gl.busirecon.query.BusiRuleVO
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BeanHelper
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.BusinessRuntimeException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.commons.lang3.StringUtils
 */
package nc.vo.arap.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.md.MDBaseQueryFacade;
import nc.md.model.IBean;
import nc.md.model.MetaDataException;
import nc.md.model.type.impl.RefType;
import nc.pub.report.utils.ReportSqlUtils;
import nc.pubitf.uapbd.IAccountPubService;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.tally.TallyAllForBRDealVO;
import nc.vo.arap.tally.TallyAllVO;
import nc.vo.arap.tally.TallyVO;
import nc.vo.arap.utils.NtbParamVOConverter;
import nc.vo.bd.account.AccountVO;
import nc.vo.fi.pub.SqlUtils;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.fipub.report.AggReportInitializeVO;
import nc.vo.fipub.report.QryObj;
import nc.vo.fipub.report.ReportInitializeVO;
import nc.vo.fipub.report.ReportQueryCondVO;
import nc.vo.gl.busirecon.data.GlBusiReconResultVO;
import nc.vo.gl.busirecon.query.BridgeQueryVO;
import nc.vo.gl.busirecon.query.BusiReconQryVO;
import nc.vo.gl.busirecon.query.BusiRuleVO;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BeanHelper;
import nc.vo.pub.BusinessException;
import nc.vo.pub.BusinessRuntimeException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

public class GlBRParamVOConverter {
    private UFDate beginDate = null;
    private UFDate endDate = null;
    private String pk_group = null;
    private String brsystem;
    public String reportType = "balance";
    private String[] pk_currencys;
    private static final Map<String, String[]> BILL2TALLY = new HashMap<String, String[]>();

    public ReportQueryCondVO glParamVOConvert(BridgeQueryVO queryVO) throws BusinessException {
        this.reportType = "detail";
        ReportQueryCondVO condvo = this.glParamVOConvert(queryVO.getQueryVO())[0].getReportQueryCondVO();
        if (queryVO.getResultVO() != null) {
            this.appendWherePart(condvo, queryVO.getResultVO().getFreetype1(), queryVO.getResultVO().getFreevalue1());
            this.appendWherePart(condvo, queryVO.getResultVO().getFreetype2(), queryVO.getResultVO().getFreevalue2());
            this.appendWherePart(condvo, queryVO.getResultVO().getFreetype3(), queryVO.getResultVO().getFreevalue3());
            this.appendWherePart(condvo, queryVO.getResultVO().getFreetype4(), queryVO.getResultVO().getFreevalue4());
            this.appendWherePart(condvo, queryVO.getResultVO().getFreetype5(), queryVO.getResultVO().getFreevalue5());
            this.appendWherePart(condvo, queryVO.getResultVO().getFreetype6(), queryVO.getResultVO().getFreevalue6());
            this.appendWherePart(condvo, queryVO.getResultVO().getFreetype7(), queryVO.getResultVO().getFreevalue7());
            this.appendWherePart(condvo, queryVO.getResultVO().getFreetype8(), queryVO.getResultVO().getFreevalue8());
            this.appendWherePart(condvo, queryVO.getResultVO().getFreetype9(), queryVO.getResultVO().getFreevalue9());
        }
        String whereSql = condvo.getWhereSql();
        Object[] pk_currtypes = queryVO.getResultVO().getPk_currtype();
        if (!ArrayUtils.isEmpty((Object[])pk_currtypes) && pk_currtypes.length == 1) {
            whereSql = whereSql + " and arap_tally.pk_currtype ='" + (String)pk_currtypes[0] + "'";
            condvo.setWhereSql(whereSql);
        }
        condvo.setRepInitContext(this.getRepInitContextVO(condvo));
        return condvo;
    }

    private void resetAccasoa(String pkAccountingbook, TallyAllForBRDealVO datas) {
        try {
            String[] subjcodes = datas.getSubjcode();
            if (subjcodes == null || subjcodes.length == 0 || subjcodes[0] == null) {
                return;
            }
            String busiDate = this.endDate.toStdString();
            IAccountPubService accountservice = (IAccountPubService)NCLocator.getInstance().lookup(IAccountPubService.class.getName());
            AccountVO[] vos = accountservice.queryAccountVOsByPks(subjcodes, busiDate);
            String[] codes = new String[vos.length];
            for (int k = 0; k < vos.length; ++k) {
                codes[k] = vos[k].getCode();
            }
            vos = accountservice.queryAccountVOsByCodes(pkAccountingbook, codes, busiDate);
            String[] pks = new String[codes.length];
            for (int k = 0; k < pks.length; ++k) {
                pks[k] = vos[k].getPk_accasoa();
            }
            datas.setSubjcode(pks);
            datas.getMap().put("subjcode", pks);
        }
        catch (BusinessException e) {
            ExceptionHandler.consume((Throwable)e);
        }
    }

    public ReportQueryCondVOGL[] glParamVOConvert(BusiReconQryVO glReconnQueryVO) throws BusinessException {
        if (glReconnQueryVO == null || ArrayUtils.isEmpty((Object[])glReconnQueryVO.getRules())) {
            return new ReportQueryCondVOGL[0];
        }
        this.parseParams(glReconnQueryVO);
        String stateType = "statebylocal";
        String pk_accountingbook = glReconnQueryVO.getPk_accountingbook();
        ReportQueryCondVOGL[] condVOs = new ReportQueryCondVOGL[glReconnQueryVO.getRules().length];
        for (int i = 0; i < glReconnQueryVO.getRules().length; ++i) {
            BusiRuleVO busiRuleVO = glReconnQueryVO.getRules()[i];
            stateType = busiRuleVO.isAmout() ? "statebyori" : "statebylocal";
            ReportQueryCondVOGL condVO = new ReportQueryCondVOGL();
            if (busiRuleVO.getBrQueryObj() instanceof TallyAllForBRDealVO) {
                TallyAllForBRDealVO datas = (TallyAllForBRDealVO)((Object)busiRuleVO.getBrQueryObj());
                if (datas == null) continue;
                this.resetAccasoa(pk_accountingbook, datas);
                datas.setPk_currtype(this.pk_currencys);
                datas.setPk_orgs(busiRuleVO.getPk_units());
                List<QryObj> qryObjList = null;
                if (!ArrayUtils.isEmpty((Object[])busiRuleVO.getBrFreeTypes())) {
                    if (busiRuleVO.getBrFreeTypes().length > 5) {
                        throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0039", null, new String[]{String.valueOf(5)}));
                    }
                    ArrayList<String> brFreeTypes = new ArrayList<String>(busiRuleVO.getBrFreeTypes().length);
                    for (String brfreetype : busiRuleVO.getBrFreeTypes()) {
                        if (StringUtils.isEmpty((CharSequence)brfreetype)) {
                            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0041"));
                        }
                        brFreeTypes.add(BILL2TALLY.get(brfreetype)[1]);
                    }
                    qryObjList = NtbParamVOConverter.constQryObj(brFreeTypes.toArray(new String[0]), busiRuleVO.getBrFreeValues(), null);
                } else {
                    qryObjList = NtbParamVOConverter.constQryObj(this.constBrfreetype(datas), null, null);
                }
                for (QryObj qryObj : qryObjList) {
                    qryObj.setShowNullQryObj(true);
                }
                this.constQueryCond(condVO.getReportQueryCondVO(), datas);
                condVO.setPk_brsetting(busiRuleVO.getPk_brsetting());
                condVO.setBrFreeTypes(busiRuleVO.getBrFreeTypes());
                condVO.getReportQueryCondVO().getQryObjs().clear();
                condVO.getReportQueryCondVO().getQryObjs().addAll(qryObjList);
                condVO.getReportQueryCondVO().setAnaType(stateType);
                condVO.setStateByori(busiRuleVO.isAmout());
            }
            condVOs[i] = condVO;
        }
        return condVOs;
    }

    private void parseParams(BusiReconQryVO glReconnQueryVO) {
        this.brsystem = glReconnQueryVO.getBrsystem();
        this.pk_group = glReconnQueryVO.getPk_group();
        this.beginDate = glReconnQueryVO.getBeginDate();
        this.endDate = glReconnQueryVO.getEndDate();
        BusiRuleVO[] rules = glReconnQueryVO.getRules();
        TallyAllForBRDealVO brQueryObj = (TallyAllForBRDealVO)((Object)rules[0].getBrQueryObj());
        if (brQueryObj != null && ArrayUtils.isEmpty((Object[])brQueryObj.getPk_currtype()) || brQueryObj == null) {
            this.pk_currencys = glReconnQueryVO.getPk_currtype();
        } else {
            List<String> glpk_currtype = Arrays.asList(glReconnQueryVO.getPk_currtype());
            String[] busipk_currencys = brQueryObj.getPk_currtype();
            ArrayList<String> list = new ArrayList<String>();
            for (String curr : busipk_currencys) {
                if (!glpk_currtype.contains(curr)) continue;
                list.add(curr);
            }
            this.pk_currencys = list.toArray(new String[0]);
        }
    }

    private String[] constBrfreetype(TallyAllForBRDealVO datas) {
        ArrayList<String> brfreetypes = new ArrayList<String>();
        if (null != datas.getObjtype()) {
            if (BillEnumCollection.ObjType.CUSTOMER.VALUE.equals(datas.getObjtype())) {
                brfreetypes.add(BILL2TALLY.get("customer")[1]);
            } else if (BillEnumCollection.ObjType.SUPPLIER.VALUE.equals(datas.getObjtype())) {
                brfreetypes.add(BILL2TALLY.get("supplier")[1]);
            } else if (BillEnumCollection.ObjType.DEP.VALUE.equals(datas.getObjtype())) {
                brfreetypes.add(BILL2TALLY.get("pk_deptid")[1]);
            } else if (BillEnumCollection.ObjType.PERSON.VALUE.equals(datas.getObjtype())) {
                brfreetypes.add(BILL2TALLY.get("pk_psndoc")[1]);
            } else {
                throw new BusinessRuntimeException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0042"));
            }
        }
        return brfreetypes.toArray(new String[0]);
    }

    private String getMutiFieldSql(String table, TallyAllForBRDealVO datas, String field, String[] pkValues) {
        String[] fields;
        String subSql = "";
        for (String fid : fields = field.split("\\.")) {
            if (!"".equals(fid) && fid.length() != 0) continue;
            return subSql;
        }
        try {
            IBean bean;
            if (fields.length == 2) {
                bean = MDBaseQueryFacade.getInstance().getBeanByName("arap", "arap_tally");
                String id1 = ((RefType)bean.getAttributeByName(fields[0]).getDataType()).getRefType().getID();
                IBean bean1 = MDBaseQueryFacade.getInstance().getBeanByID(id1);
                subSql = table + "." + fields[0] + " in (" + this.getSubFieldSql(pkValues, fields[1], bean1.getTable().getName(), bean1.getPrimaryKey().getPKColumn().getName()) + ") and ";
            } else if (fields.length == 3) {
                bean = MDBaseQueryFacade.getInstance().getBeanByName("arap", "arap_tally");
                String id1 = ((RefType)bean.getAttributeByName(fields[0]).getDataType()).getRefType().getID();
                IBean bean1 = MDBaseQueryFacade.getInstance().getBeanByID(id1);
                String id2 = ((RefType)bean1.getAttributeByName(fields[1]).getDataType()).getRefType().getID();
                IBean bean2 = MDBaseQueryFacade.getInstance().getBeanByID(id2);
                String pkValue = this.getSubFieldSql(pkValues, fields[2], bean2.getTable().getName(), bean2.getPrimaryKey().getPKColumn().getName());
                if ("".equals(pkValue)) {
                    return subSql;
                }
                subSql = table + "." + fields[0] + " in (" + this.getSubFieldSql(pkValue, fields[1], bean1.getTable().getName(), bean1.getPrimaryKey().getPKColumn().getName()) + ") and ";
            }
        }
        catch (Exception e) {
            Logger.error((Object)e.getMessage());
        }
        return subSql;
    }

    private String getSubFieldSql(String[] pkValues, String field, String table, String tablepk) throws MetaDataException, BusinessException {
        String subSql = "";
        subSql = "select " + tablepk + " from " + table + " where " + SqlUtils.getInStr((String)field, (String[])pkValues, (boolean)true);
        return subSql;
    }

    private String getSubFieldSql(String pkValues, String field, String table, String tablepk) throws MetaDataException, BusinessException {
        String subSql = "";
        subSql = "select " + tablepk + " from " + table + " where " + field + " in (" + pkValues + ")";
        return subSql;
    }

    private String constructFilterSql(TallyAllForBRDealVO datas) {
        StringBuffer filterSql = new StringBuffer();
        try {
            filterSql.append(" (1 = 1 ) and ");
            if (null != datas.getObjtype() && datas.getObjtype() != 4) {
                filterSql.append(BILL2TALLY.get("objtype")[0]).append(" = '").append(datas.getObjtype()).append("' ").append(" and ");
            }
            if (!ArrayUtils.isEmpty((Object[])datas.getPk_orgs())) {
                filterSql.append(BILL2TALLY.get("pk_org")[0]).append(" in (").append(ReportSqlUtils.getInStr((String[])datas.getPk_orgs())).append(")").append(" and ");
            }
            for (String field : TallyAllForBRDealVO.allfieldList) {
                if (datas.getMap().get(field) == null) continue;
                filterSql.append(SqlUtils.getInStr((String)(TallyAllVO.getDefaultTableName() + "." + field), (String[])datas.getMap().get(field), (boolean)true)).append(" and ");
            }
            for (String field : TallyAllForBRDealVO.tallyfieldList) {
                if (datas.getMap().get(field) == null) continue;
                filterSql.append(SqlUtils.getInStr((String)(TallyVO.getDefaultTableName() + "." + field), (String[])datas.getMap().get(field), (boolean)true)).append(" and ");
            }
            for (String field : datas.getSubmap().keySet()) {
                if (datas.getSubmap().get(field) == null || !field.contains(".")) continue;
                String table = TallyAllForBRDealVO.tallyfieldList.contains(field.split("\\.")[0]) ? TallyVO.getDefaultTableName() : TallyAllVO.getDefaultTableName();
                filterSql.append(this.getMutiFieldSql(table, datas, field, datas.getSubmap().get(field)));
            }
            if (!ArrayUtils.isEmpty((Object[])this.pk_currencys)) {
                filterSql.append(SqlUtils.getInStr((String)BILL2TALLY.get("pk_currtype")[0], (String[])this.pk_currencys, (boolean)true)).append(" and ");
            }
        }
        catch (BusinessException e) {
            Logger.error((Object)e.getMessage());
        }
        filterSql.append(" (1 = 1 )");
        return filterSql.toString();
    }

    private void appendWherePart(ReportQueryCondVO condvo, String freetype, String freeValue) {
        if (StringUtils.isEmpty((CharSequence)freetype) || StringUtils.isEmpty((CharSequence)freeValue) || StringUtils.isEmpty((CharSequence)BILL2TALLY.get(freetype)[0])) {
            return;
        }
        String wheresql = condvo.getWhereSql();
        wheresql = wheresql + " and (" + BILL2TALLY.get(freetype)[0] + " = '" + freeValue + "')";
        condvo.setWhereSql(wheresql);
    }

    private AggReportInitializeVO getRepInitContextVO(ReportQueryCondVO qryCondVO) throws BusinessException {
        AggReportInitializeVO repInitVO = NtbParamVOConverter.getRepInitContextVO(qryCondVO, this.sysArAp() ? "rec" : "pay");
        ((ReportInitializeVO)repInitVO.getParentVO()).setIsshowvoucher(UFBoolean.TRUE);
        return repInitVO;
    }

    public String getFirstFreeType(GlBusiReconResultVO resultVO) {
        String value = null;
        for (int i = 1; i <= 20 && !StringUtils.isNotEmpty((CharSequence)(value = (String)BeanHelper.getProperty((Object)resultVO, (String)("freetype" + i)))); ++i) {
        }
        return value;
    }

    private void constQueryCond(ReportQueryCondVO condvo, TallyAllForBRDealVO datas) {
        condvo.setPk_orgs(datas.getPk_orgs());
        condvo.setWhereSql(this.constructFilterSql(datas));
        if (ArrayUtils.isEmpty((Object[])this.pk_currencys) || this.pk_currencys.length > 1) {
            condvo.setPk_currency(null);
        } else {
            condvo.setPk_currency(this.pk_currencys[0]);
        }
        ReportInitializeVO repInitHeadVO = new ReportInitializeVO();
        this.procDirect(repInitHeadVO);
        AggReportInitializeVO context = new AggReportInitializeVO();
        context.setParentVO((CircularlyAccessibleValueObject)repInitHeadVO);
        this.procQryMode(condvo);
        this.procDate(condvo);
        condvo.setPk_billtypes(datas.getBilltypepks());
        this.procGroup(condvo);
        this.processAssobj(condvo, datas);
        condvo.setBillState("effect");
        condvo.setRepInitContext(context);
        condvo.setLocalCurrencyType("org_local");
        if (null != datas.getAnaDate() && datas.getAnaDate() == 1) {
            condvo.setAnaDate("effectdate");
        } else if (null != datas.getAnaDate() && datas.getAnaDate() == 2) {
            condvo.setAnaDate("billdate");
        }
    }

    public String[] getPk_currencys() {
        return this.pk_currencys;
    }

    public String getPk_group() {
        return this.pk_group;
    }

    public void setPk_group(String pkGroup) {
        this.pk_group = pkGroup;
    }

    public void setPk_currencys(String[] pkCurrencys) {
        this.pk_currencys = pkCurrencys;
    }

    private void procGroup(ReportQueryCondVO condvo) {
        condvo.setPk_group(this.pk_group);
    }

    private void procDirect(ReportInitializeVO repInitHeadVO) {
        repInitHeadVO.setRec_pay_direct(this.sysArAp() ? "rec" : "pay");
        repInitHeadVO.setReportformat("foreign");
    }

    private void procQryMode(ReportQueryCondVO condvo) {
        condvo.setQryMode("byMonth");
    }

    private void procDate(ReportQueryCondVO condvo) {
        condvo.setBeginDate(this.beginDate);
        condvo.setEndDate(this.endDate);
    }

    private boolean sysArAp() {
        return this.brsystem.equalsIgnoreCase("ar");
    }

    private void processAssobj(ReportQueryCondVO condvo, TallyAllForBRDealVO datas) {
        condvo.setAssoObj(String.valueOf(datas.getObjtype()));
    }

    static {
        BILL2TALLY.put("pk_org", new String[]{TallyVO.getDefaultTableName() + "." + "pk_org", ArapConstant.ARAP_ORG});
        BILL2TALLY.put("objtype", new String[]{TallyVO.getDefaultTableName() + "." + "objtype", null});
        BILL2TALLY.put("customer", new String[]{TallyVO.getDefaultTableName() + "." + "customer", ArapConstant.ARAP_CUSTOMER});
        BILL2TALLY.put("ordercubasdoc", new String[]{TallyVO.getDefaultTableName() + "." + "ordercubasdoc", ArapConstant.ARAP_ORDERCUBASDOC});
        BILL2TALLY.put("supplier", new String[]{TallyVO.getDefaultTableName() + "." + "supplier", ArapConstant.ARAP_SUPPLIER});
        BILL2TALLY.put("pk_deptid", new String[]{TallyVO.getDefaultTableName() + "." + "pk_deptid", ArapConstant.ARAP_DEPT});
        BILL2TALLY.put("pk_psndoc", new String[]{TallyVO.getDefaultTableName() + "." + "pk_psndoc", ArapConstant.ARAP_PSNDOC});
        BILL2TALLY.put("pk_billtype", new String[]{TallyVO.getDefaultTableName() + "." + "pk_billtype", null});
        BILL2TALLY.put("pk_tradetype", new String[]{TallyVO.getDefaultTableName() + "." + "pk_tradetype", ArapConstant.ARAP_ARAPBILLTYPE});
        BILL2TALLY.put("pk_currtype", new String[]{TallyVO.getDefaultTableName() + "." + "pk_currtype", ArapConstant.ARAP_CURRTYPE});
        BILL2TALLY.put("innerorderno", new String[]{TallyVO.getDefaultTableName() + "." + "invoiceno", null});
        BILL2TALLY.put("pk_subjcode", new String[]{TallyVO.getDefaultTableName() + "." + "pk_subjcode", ArapConstant.ARAP_PK_SUBJCODE});
        BILL2TALLY.put("material", new String[]{TallyVO.getDefaultTableName() + "." + "material", ArapConstant.ARAP_MATERIAL});
        BILL2TALLY.put("project", new String[]{TallyAllVO.getDefaultTableName() + "." + "project", ArapConstant.ARAP_PK_PROJECT});
        BILL2TALLY.put("subjcode", new String[]{TallyVO.getDefaultTableName() + "." + "subjcode", null});
        BILL2TALLY.put("h_subjcode", new String[]{TallyAllVO.getDefaultTableName() + "." + "h_subjcode", null});
        BILL2TALLY.put("pk_pcorg", new String[]{TallyAllVO.getDefaultTableName() + "." + "pk_pcorg", ArapConstant.ARAP_PK_PCORG});
        BILL2TALLY.put("so_org", new String[]{TallyAllVO.getDefaultTableName() + "." + "so_org", null});
        BILL2TALLY.put("prepay", new String[]{TallyVO.getDefaultTableName() + "." + "prepay", null});
        BILL2TALLY.put("pk_busitype", new String[]{TallyVO.getDefaultTableName() + "." + "busitype", ArapConstant.ARAP_PK_BUSITYPE});
    }

    public static class ReportQueryCondVOGL {
        private String[] brFreeTypes;
        private String pk_brsetting;
        private boolean isStateByori;
        private ReportQueryCondVO reportQueryCondVO;

        public String[] getBrFreeTypes() {
            return this.brFreeTypes;
        }

        public void setBrFreeTypes(String[] brFreeTypes) {
            this.brFreeTypes = brFreeTypes;
        }

        public ReportQueryCondVO getReportQueryCondVO() {
            if (this.reportQueryCondVO == null) {
                this.reportQueryCondVO = new ReportQueryCondVO();
            }
            return this.reportQueryCondVO;
        }

        public void setReportQueryCondVO(ReportQueryCondVO reportQueryCondVO) {
            this.reportQueryCondVO = reportQueryCondVO;
        }

        public String getPk_brsetting() {
            return this.pk_brsetting;
        }

        public void setPk_brsetting(String pkBrsetting) {
            this.pk_brsetting = pkBrsetting;
        }

        public void setStateByori(boolean isStateByori) {
            this.isStateByori = isStateByori;
        }

        public boolean isStateByori() {
            return this.isStateByori;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.fipub.queryobjreg.IReportQueryObjRegQuery
 *  nc.itf.fipub.report.IPubReportConstants
 *  nc.vo.fipub.report.AggReportInitializeVO
 *  nc.vo.fipub.report.QryObj
 *  nc.vo.fipub.report.QueryObjVO
 *  nc.vo.fipub.report.ReportInitializeItemVO
 *  nc.vo.fipub.report.ReportInitializeVO
 *  nc.vo.fipub.report.ReportQueryCondVO
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.tb.obj.NtbParamVO
 *  nccloud.commons.lang.ArrayUtils
 */
package nc.vo.arap.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.itf.fipub.queryobjreg.IReportQueryObjRegQuery;
import nc.itf.fipub.report.IPubReportConstants;
import nc.vo.arap.comreport.ArapBusimanQueryObjRegister;
import nc.vo.arap.comreport.ArapBusitypeQueryObjRegister;
import nc.vo.arap.comreport.ArapCustomerQueryObjRegister;
import nc.vo.arap.comreport.ArapDeptQueryObjRegister;
import nc.vo.arap.comreport.ArapMaterialQueryObjRegister;
import nc.vo.arap.comreport.ArapOrdercusQueryObjRegister;
import nc.vo.arap.comreport.ArapPcorgQueryObjRegister;
import nc.vo.arap.comreport.ArapPksubjQueryObjRegister;
import nc.vo.arap.comreport.ArapProjectQueryObjRegister;
import nc.vo.arap.comreport.ArapSupplierQueryObjRegister;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.tally.TallyAllVO;
import nc.vo.arap.tally.TallyVO;
import nc.vo.arap.utils.ArapReportQryObjUtil;
import nc.vo.arap.utils.StringUtil;
import nc.vo.fipub.report.AggReportInitializeVO;
import nc.vo.fipub.report.QryObj;
import nc.vo.fipub.report.QueryObjVO;
import nc.vo.fipub.report.ReportInitializeItemVO;
import nc.vo.fipub.report.ReportInitializeVO;
import nc.vo.fipub.report.ReportQueryCondVO;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFDate;
import nc.vo.tb.obj.NtbParamVO;
import nccloud.commons.lang.ArrayUtils;

public class NtbParamVOConverter
implements IPubReportConstants {
    public static ReportQueryCondVO convertNtbParam2ReportQueryCondVO(NtbParamVO ntbParamVO) throws BusinessException {
        return NtbParamVOConverter.convertNtbParam2ReportQueryCondVO(ntbParamVO, null, null);
    }

    public static ReportQueryCondVO convertNtbParam2ReportQueryCondVO(NtbParamVO ntbParamVO, String fieldcode, Set<String> pkvalues) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])ntbParamVO.getTypeDim())) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0365"));
        }
        ReportQueryCondVO qryCondVO = new ReportQueryCondVO();
        qryCondVO.setAssoObj(ntbParamVO.getData_attr());
        qryCondVO.setQryMode("byDate");
        qryCondVO.setQryDirect(BillEnumCollection.Direction.DEBIT.VALUE.toString().equals(ntbParamVO.getDirection()) ? "recgat" : "payablepay");
        qryCondVO.setQryScope("allrec");
        qryCondVO.setBeginDate(new UFDate(ntbParamVO.getBegDate(), true));
        qryCondVO.setEndDate(new UFDate(ntbParamVO.getEndDate(), false));
        qryCondVO.setPk_currency(ntbParamVO.getPk_currency());
        qryCondVO.setBillState(ntbParamVO.isUnInure() ? "all" : "effect");
        if ("UFIND".equals(ntbParamVO.getMethodCode())) {
            qryCondVO.setBillState(ntbParamVO.isUnInure() ? "all" : "effect");
        } else {
            qryCondVO.setBillState("save");
        }
        String[] busiAttrs = ntbParamVO.getBusiAttrs();
        HashSet<Object> orgs = new HashSet<Object>();
        if (Arrays.asList(busiAttrs).contains(ArapConstant.ARAP_ORG)) {
            orgs.add(ntbParamVO.getPk_Org());
        }
        for (int i = 0; i < busiAttrs.length; ++i) {
            HashMap lowerArrays;
            String busiAttr = busiAttrs[i];
            if (!ArapConstant.ARAP_ORG.equals(busiAttr) || !ntbParamVO.getIncludelower()[i]) continue;
            if (fieldcode != null && busiAttr.equals(fieldcode)) {
                orgs.addAll(pkvalues);
            }
            if ((lowerArrays = ntbParamVO.getLowerArrays()).get(busiAttr) != null && ((String[])lowerArrays.get(busiAttr)).length != 0) {
                orgs.addAll(Arrays.asList((Object[])lowerArrays.get(busiAttr)));
                continue;
            }
            if (ntbParamVO.getPkDim() == null || ntbParamVO.getPkDim()[i] == null) continue;
            orgs.add(ntbParamVO.getPkDim()[i]);
        }
        if (Arrays.asList(busiAttrs).contains(ArapConstant.ARAP_ORG)) {
            qryCondVO.setPk_orgs(orgs.toArray(new String[0]));
        } else {
            String[] org = new String[]{};
            qryCondVO.setPk_orgs(org);
        }
        qryCondVO.setPk_group(StringUtil.isEmpty(ntbParamVO.getPk_Group()) ? InvocationInfoProxy.getInstance().getGroupId() : ntbParamVO.getPk_Group());
        qryCondVO.setLocalCurrencyType("org_local");
        List<QryObj> qryObjList = NtbParamVOConverter.constQryObj(ntbParamVO, fieldcode, pkvalues);
        for (QryObj qryObj : qryObjList) {
            qryObj.setPk_group(qryCondVO.getPk_group());
            if (ArrayUtils.isEmpty((Object[])qryCondVO.getPk_orgs())) continue;
            qryObj.setPk_org(qryCondVO.getPk_orgs()[0]);
        }
        qryCondVO.getQryObjs().clear();
        qryCondVO.getQryObjs().addAll(qryObjList);
        qryCondVO.setRepInitContext(NtbParamVOConverter.getRepInitContextVO(qryCondVO, NtbParamVOConverter.getRecPayDirect(ntbParamVO.getDirection())));
        return qryCondVO;
    }

    public static AggReportInitializeVO getRepInitContextVO(ReportQueryCondVO qryCondVO, String direction) throws BusinessException {
        List qryObjs = qryCondVO.getQryObjs();
        ReportInitializeVO repInitHeadVO = new ReportInitializeVO();
        ArrayList<ReportInitializeItemVO> repInitBodyVOs = new ArrayList<ReportInitializeItemVO>();
        repInitHeadVO.setReportformat("local");
        repInitHeadVO.setRec_pay_direct(direction);
        repInitHeadVO.setOwnmodule("arap");
        repInitHeadVO.setPk_group(qryCondVO.getPk_group());
        repInitHeadVO.setMultiunitshowmode(Integer.valueOf(0));
        repInitHeadVO.setReporttype("balance");
        StringBuffer whereSqlBuffer = new StringBuffer(" 1 = 1 ");
        whereSqlBuffer.append(" and ").append("ownmodule").append(" = '").append(repInitHeadVO.getOwnmodule()).append("' ");
        whereSqlBuffer.append(" and ").append("bd_mdid").append(" in ('~'");
        for (QryObj qryObj : qryObjs) {
            whereSqlBuffer.append(", '").append(qryObj.getPk_bdinfo()).append("'");
        }
        whereSqlBuffer.append(") ");
        List queryObjVOs = ((IReportQueryObjRegQuery)NCLocator.getInstance().lookup(IReportQueryObjRegQuery.class)).getRegisteredQueryObjByClause(whereSqlBuffer.toString());
        HashMap<String, QueryObjVO> queryObjVOMap = new HashMap<String, QueryObjVO>();
        for (QueryObjVO queryObjVO : queryObjVOs) {
            queryObjVOMap.put(queryObjVO.getBd_mdid() + queryObjVO.getTallyfieldname(), queryObjVO);
        }
        QueryObjVO queryObjVO = null;
        for (int i = 0; i < qryObjs.size(); ++i) {
            queryObjVO = (QueryObjVO)queryObjVOMap.get(((QryObj)qryObjs.get(i)).getPk_bdinfo() + ((QryObj)qryObjs.get(i)).getTallyFieldName());
            if (queryObjVO == null) continue;
            repInitBodyVOs.add(ArapReportQryObjUtil.convertQueryObjVO2ReportInitializeItemVO(queryObjVO, i + 1));
        }
        AggReportInitializeVO repInitContext = new AggReportInitializeVO();
        repInitContext.setParentVO((CircularlyAccessibleValueObject)repInitHeadVO);
        repInitContext.setChildrenVO((CircularlyAccessibleValueObject[])repInitBodyVOs.toArray(new ReportInitializeItemVO[0]));
        return repInitContext;
    }

    public static List<QryObj> constQryObj(NtbParamVO ntbParamVO, String fieldcode, Set<String> pkvalues) throws BusinessException {
        String[] busiAttrs = ntbParamVO.getBusiAttrs();
        String[] values = ntbParamVO.getPkDim();
        boolean[] includeLowers = ntbParamVO.getIncludelower();
        HashMap lowerArrays = ntbParamVO.getLowerArrays();
        return NtbParamVOConverter.constQryObj(busiAttrs, values, includeLowers, lowerArrays, fieldcode, pkvalues);
    }

    public static List<QryObj> constQryObj(String[] busiAttrs, String[] values, boolean[] includeLowers) throws BusinessException {
        return NtbParamVOConverter.constQryObj(busiAttrs, values, includeLowers, null, null, null);
    }

    public static List<QryObj> constQryObj(String[] busiAttrs, String[] values, boolean[] includeLowers, HashMap<String, String[]> lowerArrays, String fieldcode, Set<String> pkvalues) throws BusinessException {
        if (lowerArrays == null) {
            lowerArrays = new HashMap();
        }
        List queryObjs = ((IReportQueryObjRegQuery)NCLocator.getInstance().lookup(IReportQueryObjRegQuery.class)).getRegisteredQueryObjWithTrue("arap");
        HashMap<String, QueryObjVO> queryObjMap = new HashMap<String, QueryObjVO>();
        for (QueryObjVO vo : queryObjs) {
            queryObjMap.put(vo.getBd_mdid() + vo.getTallyfieldname(), vo);
        }
        ArrayList<String> qryObjKey = new ArrayList<String>();
        HashMap<String, QryObj> qryObjMap = new HashMap<String, QryObj>();
        QueryObjVO queryObjVO = null;
        QryObj qryObj = null;
        String busiAttr = null;
        for (int i = 0; i < busiAttrs.length; ++i) {
            busiAttr = busiAttrs[i];
            if (ArapConstant.ARAP_CUSTOMER.equals(busiAttr)) {
                if (qryObjMap.get(ArapConstant.ARAP_CUSTOMER) == null) {
                    queryObjVO = (QueryObjVO)queryObjMap.get("e4f48eaf-5567-4383-a370-a59cb3e8a451" + TallyVO.getDefaultTableName() + "." + "customer");
                    if (queryObjVO == null) {
                        queryObjVO = new ArapCustomerQueryObjRegister().register("arap", null, null, 1);
                    }
                    qryObjMap.put(ArapConstant.ARAP_CUSTOMER, ArapReportQryObjUtil.convertQueryObjVO2QryObj(queryObjVO));
                    qryObjKey.add(ArapConstant.ARAP_CUSTOMER);
                }
                qryObj = (QryObj)qryObjMap.get(ArapConstant.ARAP_CUSTOMER);
            } else if (ArapConstant.ARAP_SUPPLIER.equals(busiAttr)) {
                if (qryObjMap.get(ArapConstant.ARAP_SUPPLIER) == null) {
                    queryObjVO = (QueryObjVO)queryObjMap.get("720dcc7c-ff19-48f4-b9c5-b90906682f45" + TallyVO.getDefaultTableName() + "." + "supplier");
                    if (queryObjVO == null) {
                        queryObjVO = new ArapSupplierQueryObjRegister().register("arap", null, null, 1);
                    }
                    qryObjMap.put(ArapConstant.ARAP_SUPPLIER, ArapReportQryObjUtil.convertQueryObjVO2QryObj(queryObjVO));
                    qryObjKey.add(ArapConstant.ARAP_SUPPLIER);
                }
                qryObj = (QryObj)qryObjMap.get(ArapConstant.ARAP_SUPPLIER);
            } else if (ArapConstant.ARAP_DEPT.equals(busiAttr)) {
                if (qryObjMap.get(ArapConstant.ARAP_DEPT) == null) {
                    queryObjVO = (QueryObjVO)queryObjMap.get("b26fa3cb-4087-4027-a3b6-c83ab2a086a9" + TallyVO.getDefaultTableName() + "." + "pk_deptid");
                    if (queryObjVO == null) {
                        queryObjVO = new ArapDeptQueryObjRegister().register("arap", null, null, 1);
                    }
                    qryObjMap.put(ArapConstant.ARAP_DEPT, ArapReportQryObjUtil.convertQueryObjVO2QryObj(queryObjVO));
                    qryObjKey.add(ArapConstant.ARAP_DEPT);
                }
                qryObj = (QryObj)qryObjMap.get(ArapConstant.ARAP_DEPT);
            } else if (ArapConstant.ARAP_PSNDOC.equals(busiAttr)) {
                if (qryObjMap.get(ArapConstant.ARAP_PSNDOC) == null) {
                    queryObjVO = (QueryObjVO)queryObjMap.get("40d39c26-a2b6-4f16-a018-45664cac1a1f" + TallyVO.getDefaultTableName() + "." + "pk_psndoc");
                    if (queryObjVO == null) {
                        queryObjVO = new ArapBusimanQueryObjRegister().register("arap", null, null, 1);
                    }
                    qryObjMap.put(ArapConstant.ARAP_PSNDOC, ArapReportQryObjUtil.convertQueryObjVO2QryObj(queryObjVO));
                    qryObjKey.add(ArapConstant.ARAP_PSNDOC);
                }
                qryObj = (QryObj)qryObjMap.get(ArapConstant.ARAP_PSNDOC);
            } else if (ArapConstant.ARAP_PK_SUBJCODE.equals(busiAttr)) {
                if (qryObjMap.get(ArapConstant.ARAP_PK_SUBJCODE) == null) {
                    queryObjVO = (QueryObjVO)queryObjMap.get("283d91a4-a8f4-4763-ac44-aae7401fa09a" + TallyVO.getDefaultTableName() + "." + "pk_subjcode");
                    if (queryObjVO == null) {
                        queryObjVO = new ArapPksubjQueryObjRegister().register("arap", null, null, 1);
                    }
                    qryObjMap.put(ArapConstant.ARAP_PK_SUBJCODE, ArapReportQryObjUtil.convertQueryObjVO2QryObj(queryObjVO));
                    qryObjKey.add(ArapConstant.ARAP_PK_SUBJCODE);
                }
                qryObj = (QryObj)qryObjMap.get(ArapConstant.ARAP_PK_SUBJCODE);
            } else if (ArapConstant.ARAP_MATERIAL.equals(busiAttr)) {
                if (qryObjMap.get(ArapConstant.ARAP_MATERIAL) == null) {
                    queryObjVO = (QueryObjVO)queryObjMap.get("eae040f4-3c88-413d-abc9-b15774463d46" + TallyVO.getDefaultTableName() + "." + "material");
                    if (queryObjVO == null) {
                        queryObjVO = new ArapMaterialQueryObjRegister().register("arap", null, null, 1);
                    }
                    qryObjMap.put(ArapConstant.ARAP_MATERIAL, ArapReportQryObjUtil.convertQueryObjVO2QryObj(queryObjVO));
                    qryObjKey.add(ArapConstant.ARAP_MATERIAL);
                }
                qryObj = (QryObj)qryObjMap.get(ArapConstant.ARAP_MATERIAL);
            } else if (ArapConstant.ARAP_ORDERCUBASDOC.equals(busiAttr)) {
                if (qryObjMap.get(ArapConstant.ARAP_ORDERCUBASDOC) == null) {
                    queryObjVO = (QueryObjVO)queryObjMap.get("e4f48eaf-5567-4383-a370-a59cb3e8a451" + TallyVO.getDefaultTableName() + "." + "ordercubasdoc");
                    if (queryObjVO == null) {
                        queryObjVO = new ArapOrdercusQueryObjRegister().register("arap", null, null, 1);
                    }
                    qryObjMap.put(ArapConstant.ARAP_ORDERCUBASDOC, ArapReportQryObjUtil.convertQueryObjVO2QryObj(queryObjVO));
                    qryObjKey.add(ArapConstant.ARAP_ORDERCUBASDOC);
                }
                qryObj = (QryObj)qryObjMap.get(ArapConstant.ARAP_ORDERCUBASDOC);
            } else if (ArapConstant.ARAP_PK_BUSITYPE.equals(busiAttr)) {
                if (qryObjMap.get(ArapConstant.ARAP_PK_BUSITYPE) == null) {
                    queryObjVO = (QueryObjVO)queryObjMap.get("7717f1a3-b777-454e-abb5-ef8705a0f0c2" + TallyAllVO.getDefaultTableName() + "." + "pk_busitype");
                    if (queryObjVO == null) {
                        queryObjVO = new ArapBusitypeQueryObjRegister().register("arap", null, null, 1);
                    }
                    qryObjMap.put(ArapConstant.ARAP_PK_BUSITYPE, ArapReportQryObjUtil.convertQueryObjVO2QryObj(queryObjVO));
                    qryObjKey.add(ArapConstant.ARAP_PK_BUSITYPE);
                }
                qryObj = (QryObj)qryObjMap.get(ArapConstant.ARAP_PK_BUSITYPE);
            } else if (ArapConstant.ARAP_PK_PCORG.equals(busiAttr)) {
                if (qryObjMap.get(ArapConstant.ARAP_PK_PCORG) == null) {
                    queryObjVO = (QueryObjVO)queryObjMap.get("5461ada1-ef2a-419a-af14-656cf0641d34" + TallyAllVO.getDefaultTableName() + "." + "pk_pcorg");
                    if (queryObjVO == null) {
                        queryObjVO = new ArapPcorgQueryObjRegister().register("arap", null, null, 1);
                    }
                    qryObjMap.put(ArapConstant.ARAP_PK_PCORG, ArapReportQryObjUtil.convertQueryObjVO2QryObj(queryObjVO));
                    qryObjKey.add(ArapConstant.ARAP_PK_PCORG);
                }
                qryObj = (QryObj)qryObjMap.get(ArapConstant.ARAP_PK_PCORG);
            } else if (ArapConstant.ARAP_PK_PROJECT.equals(busiAttr)) {
                if (qryObjMap.get(ArapConstant.ARAP_PK_PROJECT) == null) {
                    queryObjVO = (QueryObjVO)queryObjMap.get("2ee58f9b-781b-469f-b1d8-1816842515c3" + TallyAllVO.getDefaultTableName() + "." + "project");
                    if (queryObjVO == null) {
                        queryObjVO = new ArapProjectQueryObjRegister().register("arap", null, null, 1);
                    }
                    qryObjMap.put(ArapConstant.ARAP_PK_PROJECT, ArapReportQryObjUtil.convertQueryObjVO2QryObj(queryObjVO));
                    qryObjKey.add(ArapConstant.ARAP_PK_PROJECT);
                }
                qryObj = (QryObj)qryObjMap.get(ArapConstant.ARAP_PK_PROJECT);
            }
            if (qryObj == null) continue;
            if (includeLowers != null) {
                qryObj.setIncludeLowLevel(includeLowers[i]);
            }
            if (fieldcode != null && busiAttr.equals(fieldcode)) {
                qryObj.getValues().addAll(pkvalues);
            }
            if (lowerArrays.get(busiAttr) != null && ((String[])lowerArrays.get(busiAttr)).length != 0) {
                qryObj.getValues().addAll(Arrays.asList((Object[])lowerArrays.get(busiAttr)));
                continue;
            }
            if (values == null || values[i] == null) continue;
            qryObj.getValues().add(values[i]);
        }
        ArrayList<QryObj> qryObjList = new ArrayList<QryObj>();
        for (String key : qryObjKey) {
            qryObjList.add((QryObj)qryObjMap.get(key));
        }
        return qryObjList;
    }

    private static String getRecPayDirect(String direct) throws BusinessException {
        String recpayDirect = null;
        if (BillEnumCollection.Direction.DEBIT.VALUE.toString().equals(direct)) {
            recpayDirect = "rec";
        } else if (BillEnumCollection.Direction.CREDIT.VALUE.toString().equals(direct)) {
            recpayDirect = "pay";
        } else {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0636"));
        }
        return recpayDirect;
    }
}


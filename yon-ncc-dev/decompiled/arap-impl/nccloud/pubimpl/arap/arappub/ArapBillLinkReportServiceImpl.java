/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.bill.ArapGeneralDAO
 *  nc.bs.arap.util.ArapBillType2TableMapping
 *  nc.bs.dao.BaseDAO
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.jdbc.framework.processor.ArrayListProcessor
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.md.persist.framework.MDPersistenceService
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.arap.pub.BillEnumCollection$ObjType
 *  nc.vo.arap.utils.ArapReportQryObjUtil
 *  nc.vo.fipub.report.AggReportInitializeVO
 *  nc.vo.fipub.report.QryObj
 *  nc.vo.fipub.report.ReportInitializeItemVO
 *  nc.vo.fipub.report.ReportQueryCondVO
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pubapp.pattern.model.entity.bill.IBill
 *  nccloud.commons.lang.StringUtils
 *  nccloud.pubitf.arap.arappub.IArapBillLinkReportService
 */
package nccloud.pubimpl.arap.arappub;

import java.util.ArrayList;
import java.util.List;
import nc.bs.arap.bill.ArapGeneralDAO;
import nc.bs.arap.util.ArapBillType2TableMapping;
import nc.bs.dao.BaseDAO;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.jdbc.framework.processor.ArrayListProcessor;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.md.persist.framework.MDPersistenceService;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.utils.ArapReportQryObjUtil;
import nc.vo.fipub.report.AggReportInitializeVO;
import nc.vo.fipub.report.QryObj;
import nc.vo.fipub.report.ReportInitializeItemVO;
import nc.vo.fipub.report.ReportQueryCondVO;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDate;
import nc.vo.pubapp.pattern.model.entity.bill.IBill;
import nccloud.commons.lang.StringUtils;
import nccloud.pubitf.arap.arappub.IArapBillLinkReportService;

public class ArapBillLinkReportServiceImpl
implements IArapBillLinkReportService {
    public ReportQueryCondVO getQueryVO(String pk_bill, String billType, String objType) throws BusinessException {
        IBill[] query = ArapGeneralDAO.getInstance().query(ArapBillType2TableMapping.getVOClassByBilltype((String)billType), new String[]{pk_bill});
        BaseAggVO[] aggVOs = (BaseAggVO[])((AggregatedValueObject[])query);
        BaseAggVO aggVO = aggVOs[0];
        BaseBillVO parent = (BaseBillVO)aggVO.getParentVO();
        parent.setObjtype(Integer.valueOf(Integer.parseInt(objType)));
        String assoObj = String.valueOf(parent.getObjtype());
        String mdId = this.getMdIdByObjType(assoObj);
        billType = parent.getPk_billtype();
        AggReportInitializeVO reportInitVO = this.getReportInitializeVOByMdid(mdId);
        if (reportInitVO == null) {
            String objName = this.getObjNameByType(assoObj);
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0015") + objName + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0016") + objName + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0017"));
        }
        ReportQueryCondVO qryCondVO = this.createReportQueryCondVO(reportInitVO, mdId, assoObj, billType, aggVO);
        return qryCondVO;
    }

    private String getMdIdByObjType(String objType) {
        if (BillEnumCollection.ObjType.CUSTOMER.VALUE.toString().equals(objType)) {
            return "e4f48eaf-5567-4383-a370-a59cb3e8a451";
        }
        if (BillEnumCollection.ObjType.SUPPLIER.VALUE.toString().equals(objType)) {
            return "720dcc7c-ff19-48f4-b9c5-b90906682f45";
        }
        if (BillEnumCollection.ObjType.DEP.VALUE.toString().equals(objType)) {
            return "b26fa3cb-4087-4027-a3b6-c83ab2a086a9";
        }
        if (BillEnumCollection.ObjType.PERSON.VALUE.toString().equals(objType)) {
            return "40d39c26-a2b6-4f16-a018-45664cac1a1f";
        }
        return null;
    }

    private String getObjNameByType(String objType) {
        if (BillEnumCollection.ObjType.CUSTOMER.VALUE.toString().equals(objType)) {
            return NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "UC000-0001589");
        }
        if (BillEnumCollection.ObjType.SUPPLIER.VALUE.toString().equals(objType)) {
            return NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "UC000-0000275");
        }
        if (BillEnumCollection.ObjType.DEP.VALUE.toString().equals(objType)) {
            return NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "UC000-0004064");
        }
        if (BillEnumCollection.ObjType.PERSON.VALUE.toString().equals(objType)) {
            return NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "UC000-0000129");
        }
        return null;
    }

    private ReportQueryCondVO createReportQueryCondVO(AggReportInitializeVO reportInitializeVO, String mdId, String assoObj, String billType, BaseAggVO aggVO) throws BusinessException {
        ReportQueryCondVO qryCondVO = new ReportQueryCondVO();
        BaseBillVO parent = (BaseBillVO)aggVO.getParentVO();
        String pk_org = parent.getPk_org();
        String pk_group = parent.getPk_group();
        String qryMode = "byDate";
        String billState = "all";
        UFDate busiDate = new UFDate(InvocationInfoProxy.getInstance().getBizDateTime());
        qryCondVO.setAssoObj(assoObj);
        qryCondVO.setQryMode(qryMode);
        qryCondVO.setBillState(billState);
        qryCondVO.setPk_billtypes(new String[]{"F0", "F1", "F2", "F3", "23E0", "23E1"});
        qryCondVO.setBeginDate(new UFDate(busiDate.toString(), true));
        qryCondVO.setEndDate(new UFDate(busiDate.toString(), false));
        qryCondVO.setPk_orgs(new String[]{pk_org});
        qryCondVO.setPk_group(pk_group);
        qryCondVO.setLocalCurrencyType("org_local");
        List qryObjList = ArapReportQryObjUtil.convertReportInitializeItemVO2QryObj((ReportInitializeItemVO[])((ReportInitializeItemVO[])reportInitializeVO.getChildrenVO()));
        ((QryObj)qryObjList.get(0)).setValues(this.getObjPksByObjType(assoObj, (AggregatedValueObject)aggVO));
        qryCondVO.setQryObjs(qryObjList);
        qryCondVO.setRepInitContext(reportInitializeVO);
        return qryCondVO;
    }

    private List getObjPksByObjType(String objType, AggregatedValueObject aggVO) {
        ArrayList<String> result;
        block6: {
            BaseItemVO[] bodys;
            block8: {
                block7: {
                    block5: {
                        if (objType == null || aggVO == null) {
                            return new ArrayList();
                        }
                        bodys = (BaseItemVO[])aggVO.getChildrenVO();
                        result = new ArrayList<String>();
                        if (!BillEnumCollection.ObjType.CUSTOMER.VALUE.toString().equals(objType)) break block5;
                        for (BaseItemVO item : bodys) {
                            if (StringUtils.isEmpty((CharSequence)item.getCustomer()) || result.contains(item.getCustomer())) continue;
                            result.add(item.getCustomer());
                        }
                        break block6;
                    }
                    if (!BillEnumCollection.ObjType.SUPPLIER.VALUE.toString().equals(objType)) break block7;
                    for (BaseItemVO item : bodys) {
                        if (StringUtils.isEmpty((CharSequence)item.getSupplier()) || result.contains(item.getSupplier())) continue;
                        result.add(item.getSupplier());
                    }
                    break block6;
                }
                if (!BillEnumCollection.ObjType.DEP.VALUE.toString().equals(objType)) break block8;
                for (BaseItemVO item : bodys) {
                    if (StringUtils.isEmpty((CharSequence)item.getPk_deptid()) || result.contains(item.getPk_deptid())) continue;
                    result.add(item.getPk_deptid());
                }
                break block6;
            }
            if (!BillEnumCollection.ObjType.PERSON.VALUE.toString().equals(objType)) break block6;
            for (BaseItemVO item : bodys) {
                if (StringUtils.isEmpty((CharSequence)item.getPk_psndoc()) || result.contains(item.getPk_psndoc())) continue;
                result.add(item.getPk_psndoc());
            }
        }
        return result;
    }

    public AggReportInitializeVO getReportInitializeVOByMdid(String bd_mdid) throws BusinessException {
        String sql = "select a.pk_reportinitialize from fipub_reportinitialize a, fipub_reportinitialize_b b where a.pk_reportinitialize in ( select b.pk_reportinitialize from fipub_reportinitialize a, fipub_reportinitialize_b b where a.pk_reportinitialize = b.pk_reportinitialize and reporttype = 'balance' and (isweb = 'Y') group by b.pk_reportinitialize having count(*) = 1 ) and a.pk_reportinitialize = b.pk_reportinitialize\tand b.bd_mdid = '" + bd_mdid + "'";
        Object result = new BaseDAO().executeQuery(sql, (ResultSetProcessor)new ArrayListProcessor());
        if (result == null || !(result instanceof List) || ((List)result).size() == 0) {
            return null;
        }
        List resultList = (List)result;
        String pk_reportinitialize = (String)((Object[])resultList.get(0))[0];
        return (AggReportInitializeVO)MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPK(AggReportInitializeVO.class, pk_reportinitialize, false);
    }
}


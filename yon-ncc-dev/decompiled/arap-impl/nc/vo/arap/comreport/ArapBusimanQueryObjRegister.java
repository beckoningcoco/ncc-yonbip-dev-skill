/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.md.model.IBean
 *  nc.utils.fipub.FipubReportResource
 *  nc.vo.bd.psn.PsndocVO
 *  nc.vo.fipub.report.QueryObjVO
 */
package nc.vo.arap.comreport;

import nc.md.model.IBean;
import nc.utils.fipub.FipubReportResource;
import nc.vo.arap.comreport.ArapBaseQueryObjRegister;
import nc.vo.arap.tally.BalanceVO;
import nc.vo.arap.tally.TallyVO;
import nc.vo.bd.psn.PsndocVO;
import nc.vo.fipub.report.QueryObjVO;

public class ArapBusimanQueryObjRegister
extends ArapBaseQueryObjRegister {
    private static final long serialVersionUID = 1L;
    public final String QRYOBJ_PK_PSNDOC = "qryobj_pk_psndoc";

    public ArapBusimanQueryObjRegister() {
        super("40d39c26-a2b6-4f16-a018-45664cac1a1f");
    }

    @Override
    protected void setQueryObjVO(IBean bean, QueryObjVO queryObjVO) {
        queryObjVO.setQry_objtablename(BalanceVO.getDefaultTableName());
        queryObjVO.setQry_objfieldname("pk_psndoc");
        queryObjVO.setDsp_objtablename(queryObjVO.getQry_objtablename());
        queryObjVO.setDsp_objfieldname(queryObjVO.getQry_objfieldname());
        queryObjVO.setDsp_objname(FipubReportResource.getAssoObjPsnLbl());
        queryObjVO.setBd_refname(bean.getRefModelName());
        queryObjVO.setBd_tablename(new PsndocVO().getTableName());
        queryObjVO.setBd_pkfield("pk_psndoc");
        queryObjVO.setBd_codefield("code");
        queryObjVO.setBd_namefield("name");
        queryObjVO.setResid("qryobj_pk_psndoc");
        queryObjVO.setBillfieldname("pk_psndoc");
        queryObjVO.setBalfieldname(BalanceVO.getDefaultTableName() + "." + "pk_psndoc");
        queryObjVO.setTallyfieldname(TallyVO.getDefaultTableName() + "." + "pk_psndoc");
    }
}


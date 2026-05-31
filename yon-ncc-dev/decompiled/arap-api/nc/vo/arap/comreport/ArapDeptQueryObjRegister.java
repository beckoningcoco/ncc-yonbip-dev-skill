/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.md.model.IBean
 *  nc.utils.fipub.FipubReportResource
 *  nc.vo.fipub.report.QueryObjVO
 *  nc.vo.org.DeptVO
 */
package nc.vo.arap.comreport;

import nc.md.model.IBean;
import nc.utils.fipub.FipubReportResource;
import nc.vo.arap.comreport.ArapBaseQueryObjRegister;
import nc.vo.arap.tally.BalanceVO;
import nc.vo.arap.tally.TallyVO;
import nc.vo.fipub.report.QueryObjVO;
import nc.vo.org.DeptVO;

public class ArapDeptQueryObjRegister
extends ArapBaseQueryObjRegister {
    private static final long serialVersionUID = 1L;
    public final String QRYOBJ_PK_DEPTID = "qryobj_pk_deptid";

    public ArapDeptQueryObjRegister() {
        super("b26fa3cb-4087-4027-a3b6-c83ab2a086a9");
    }

    @Override
    protected void setQueryObjVO(IBean bean, QueryObjVO queryObjVO) {
        queryObjVO.setQry_objtablename(BalanceVO.getDefaultTableName());
        queryObjVO.setQry_objfieldname("pk_deptid");
        queryObjVO.setDsp_objtablename(queryObjVO.getQry_objtablename());
        queryObjVO.setDsp_objfieldname(queryObjVO.getQry_objfieldname());
        queryObjVO.setDsp_objname(FipubReportResource.getAssoObjDeptLbl());
        queryObjVO.setBd_refname("\u90e8\u95e8");
        queryObjVO.setBd_tablename(DeptVO.getDefaultTableName());
        queryObjVO.setBd_pkfield("pk_dept");
        queryObjVO.setBd_codefield("code");
        queryObjVO.setBd_namefield("name");
        queryObjVO.setResid("qryobj_pk_deptid");
        queryObjVO.setBillfieldname("pk_deptid");
        queryObjVO.setBalfieldname(BalanceVO.getDefaultTableName() + "." + "pk_deptid");
        queryObjVO.setTallyfieldname(TallyVO.getDefaultTableName() + "." + "pk_deptid");
    }
}


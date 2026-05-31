/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.md.model.IBean
 *  nc.vo.fipub.report.QueryObjVO
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pmpub.project.ProjectHeadVO
 */
package nc.vo.arap.comreport;

import nc.md.model.IBean;
import nc.vo.arap.comreport.ArapBaseQueryObjRegister;
import nc.vo.arap.tally.TallyAllVO;
import nc.vo.fipub.report.QueryObjVO;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pmpub.project.ProjectHeadVO;

public class ArapProjectQueryObjRegister
extends ArapBaseQueryObjRegister {
    private static final long serialVersionUID = 1L;
    public final String QRYOBJ_PROJECT = "qryobj_project";

    public ArapProjectQueryObjRegister() {
        super("2ee58f9b-781b-469f-b1d8-1816842515c3");
    }

    @Override
    protected void setQueryObjVO(IBean bean, QueryObjVO queryObjVO) {
        queryObjVO.setQry_objtablename(TallyAllVO.getDefaultTableName());
        queryObjVO.setQry_objfieldname("project");
        queryObjVO.setDsp_objtablename(queryObjVO.getQry_objtablename());
        queryObjVO.setDsp_objfieldname(queryObjVO.getQry_objfieldname());
        queryObjVO.setDsp_objname(NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "UC000-0004165"));
        queryObjVO.setBd_tablename(ProjectHeadVO.getDefaultTableName());
        queryObjVO.setBd_pkfield("pk_project");
        queryObjVO.setBd_codefield("project_code");
        queryObjVO.setBd_namefield("project_name");
        queryObjVO.setResid("qryobj_project");
        queryObjVO.setBillfieldname("project");
        queryObjVO.setBalfieldname(null);
        queryObjVO.setTallyfieldname(TallyAllVO.getDefaultTableName() + "." + "project");
    }
}


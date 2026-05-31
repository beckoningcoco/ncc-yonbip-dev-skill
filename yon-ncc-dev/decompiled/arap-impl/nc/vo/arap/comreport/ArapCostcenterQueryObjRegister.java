/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.md.model.IBean
 *  nc.vo.fipub.report.QueryObjVO
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.resa.costcenter.CostCenterVO
 */
package nc.vo.arap.comreport;

import nc.md.model.IBean;
import nc.vo.arap.comreport.ArapBaseQueryObjRegister;
import nc.vo.arap.tally.TallyAllVO;
import nc.vo.fipub.report.QueryObjVO;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.resa.costcenter.CostCenterVO;

public class ArapCostcenterQueryObjRegister
extends ArapBaseQueryObjRegister {
    private static final long serialVersionUID = 1L;
    public final String QRYOBJ_COSTCENTER = "qryobj_costcenter";

    public ArapCostcenterQueryObjRegister() {
        super("de9796b5-bccd-42a1-97dd-808847bfddbd");
    }

    @Override
    protected void setQueryObjVO(IBean bean, QueryObjVO queryObjVO) {
        queryObjVO.setQry_objtablename(TallyAllVO.getDefaultTableName());
        queryObjVO.setQry_objfieldname("costcenter");
        queryObjVO.setDsp_objtablename(queryObjVO.getQry_objtablename());
        queryObjVO.setDsp_objfieldname(queryObjVO.getQry_objfieldname());
        queryObjVO.setDsp_objname(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0038"));
        queryObjVO.setBd_refname("\u7ba1\u4f1a\u6210\u672c\u4e2d\u5fc3");
        queryObjVO.setBd_tablename(CostCenterVO.getDefaultTableName());
        queryObjVO.setBd_pkfield("pk_costcenter");
        queryObjVO.setBd_codefield("cccode");
        queryObjVO.setBd_namefield("ccname");
        queryObjVO.setResid("qryobj_costcenter");
        queryObjVO.setBillfieldname("costcenter");
        queryObjVO.setBalfieldname(null);
        queryObjVO.setTallyfieldname(TallyAllVO.getDefaultTableName() + "." + "costcenter");
    }
}


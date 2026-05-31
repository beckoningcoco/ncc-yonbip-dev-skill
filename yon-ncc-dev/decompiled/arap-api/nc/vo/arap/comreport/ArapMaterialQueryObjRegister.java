/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.md.model.IBean
 *  nc.vo.bd.material.MaterialVO
 *  nc.vo.fipub.report.QueryObjVO
 *  nc.vo.ml.NCLangRes4VoTransl
 */
package nc.vo.arap.comreport;

import nc.md.model.IBean;
import nc.vo.arap.comreport.ArapBaseQueryObjRegister;
import nc.vo.arap.tally.TallyVO;
import nc.vo.bd.material.MaterialVO;
import nc.vo.fipub.report.QueryObjVO;
import nc.vo.ml.NCLangRes4VoTransl;

public class ArapMaterialQueryObjRegister
extends ArapBaseQueryObjRegister {
    private static final long serialVersionUID = 1L;
    public final String QRYOBJ_MATERIAL = "qryobj_material";

    public ArapMaterialQueryObjRegister() {
        super("eae040f4-3c88-413d-abc9-b15774463d46");
    }

    @Override
    protected void setQueryObjVO(IBean bean, QueryObjVO queryObjVO) {
        queryObjVO.setQry_objtablename(TallyVO.getDefaultTableName());
        queryObjVO.setQry_objfieldname("material");
        queryObjVO.setDsp_objtablename(queryObjVO.getQry_objtablename());
        queryObjVO.setDsp_objfieldname(queryObjVO.getQry_objfieldname());
        queryObjVO.setDsp_objname(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0594"));
        queryObjVO.setBd_tablename(MaterialVO.getDefaultTableName());
        queryObjVO.setBd_pkfield("pk_material");
        queryObjVO.setBd_codefield("code");
        queryObjVO.setBd_namefield("name");
        queryObjVO.setResid("qryobj_material");
        queryObjVO.setBillfieldname("material");
        queryObjVO.setBalfieldname(null);
        queryObjVO.setTallyfieldname(TallyVO.getDefaultTableName() + "." + "material");
    }
}


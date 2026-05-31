/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.md.model.IBean
 *  nc.vo.bd.psn.PsndocVO
 *  nc.vo.fipub.report.QueryObjVO
 *  nc.vo.ml.NCLangRes4VoTransl
 */
package nc.vo.arap.comreport;

import nc.md.model.IBean;
import nc.vo.arap.comreport.ArapBaseQueryObjRegister;
import nc.vo.arap.tally.TallyAllVO;
import nc.vo.bd.psn.PsndocVO;
import nc.vo.fipub.report.QueryObjVO;
import nc.vo.ml.NCLangRes4VoTransl;

public class ArapSalesPsndocQueryObjRegister
extends ArapBaseQueryObjRegister {
    private static final long serialVersionUID = 1L;
    public final String QRYOBJ_PK_SOPSN = "qryobj_pk_sopsn";

    public ArapSalesPsndocQueryObjRegister() {
        super("40d39c26-a2b6-4f16-a018-45664cac1a1f");
    }

    @Override
    protected void setQueryObjVO(IBean bean, QueryObjVO queryObjVO) {
        queryObjVO.setQry_objtablename(TallyAllVO.getDefaultTableName());
        queryObjVO.setQry_objfieldname("so_psndoc");
        queryObjVO.setDsp_objtablename(queryObjVO.getQry_objtablename());
        queryObjVO.setDsp_objfieldname(queryObjVO.getQry_objfieldname());
        queryObjVO.setDsp_objname(NCLangRes4VoTransl.getNCLangRes().getStrByID("arap", "1arap0153"));
        queryObjVO.setBd_refname("\u4eba\u5458");
        queryObjVO.setBd_tablename(new PsndocVO().getTableName());
        queryObjVO.setBd_pkfield("pk_psndoc");
        queryObjVO.setBd_codefield("code");
        queryObjVO.setBd_namefield("name");
        queryObjVO.setResid("qryobj_pk_sopsn");
        queryObjVO.setBillfieldname("so_psndoc");
        queryObjVO.setBalfieldname(null);
        queryObjVO.setTallyfieldname(TallyAllVO.getDefaultTableName() + "." + "so_psndoc");
    }
}


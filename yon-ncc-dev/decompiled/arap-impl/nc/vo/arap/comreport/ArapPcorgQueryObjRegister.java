/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.md.model.IBean
 *  nc.vo.fipub.report.QueryObjVO
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.profitcenter.ProfitCenterVO
 */
package nc.vo.arap.comreport;

import nc.md.model.IBean;
import nc.vo.arap.comreport.ArapBaseQueryObjRegister;
import nc.vo.arap.tally.TallyAllVO;
import nc.vo.fipub.report.QueryObjVO;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.profitcenter.ProfitCenterVO;

public class ArapPcorgQueryObjRegister
extends ArapBaseQueryObjRegister {
    private static final long serialVersionUID = 1L;
    public final String QRYOBJ_PK_PCORG = "qryobj_pk_pcorg";

    public ArapPcorgQueryObjRegister() {
        super("5461ada1-ef2a-419a-af14-656cf0641d34");
    }

    @Override
    protected void setQueryObjVO(IBean bean, QueryObjVO queryObjVO) {
        queryObjVO.setQry_objtablename(TallyAllVO.getDefaultTableName());
        queryObjVO.setQry_objfieldname("pk_pcorg");
        queryObjVO.setDsp_objtablename(queryObjVO.getQry_objtablename());
        queryObjVO.setDsp_objfieldname(queryObjVO.getQry_objfieldname());
        queryObjVO.setDsp_objname(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0595"));
        queryObjVO.setBd_refname("\u5229\u6da6\u4e2d\u5fc3");
        queryObjVO.setBd_tablename(ProfitCenterVO.getDefaultTableName());
        queryObjVO.setBd_pkfield("pk_profitcenter");
        queryObjVO.setBd_codefield("code");
        queryObjVO.setBd_namefield("name");
        queryObjVO.setResid("qryobj_pk_pcorg");
        queryObjVO.setBillfieldname("pk_pcorg");
        queryObjVO.setBalfieldname(null);
        queryObjVO.setTallyfieldname(TallyAllVO.getDefaultTableName() + "." + "pk_pcorg");
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.md.model.IBean
 *  nc.vo.fipub.report.QueryObjVO
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.org.OrgVO
 */
package nc.vo.arap.comreport;

import nc.md.model.IBean;
import nc.vo.arap.comreport.ArapBaseQueryObjRegister;
import nc.vo.arap.tally.TallyAllVO;
import nc.vo.fipub.report.QueryObjVO;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.org.OrgVO;

public class ArapSalesOrgQueryObjRegister
extends ArapBaseQueryObjRegister {
    private static final long serialVersionUID = 1L;
    public final String QRYOBJ_PK_SOORG = "qryobj_pk_soorg";

    public ArapSalesOrgQueryObjRegister() {
        super("945f38b6-48ec-43e6-bb09-77ec89a3728f");
    }

    @Override
    protected void setQueryObjVO(IBean bean, QueryObjVO queryObjVO) {
        queryObjVO.setQry_objtablename(TallyAllVO.getDefaultTableName());
        queryObjVO.setQry_objfieldname("so_org");
        queryObjVO.setDsp_objtablename(queryObjVO.getQry_objtablename());
        queryObjVO.setDsp_objfieldname(queryObjVO.getQry_objfieldname());
        queryObjVO.setDsp_objname(NCLangRes4VoTransl.getNCLangRes().getStrByID("arap", "1arap0151"));
        queryObjVO.setBd_refname("\u4e1a\u52a1\u5355\u5143(\u8d22\u52a1\u7ec4\u7ec7\u59d4\u6258)");
        queryObjVO.setBd_tablename(new OrgVO().getTableName());
        queryObjVO.setBd_pkfield("pk_org");
        queryObjVO.setBd_codefield("code");
        queryObjVO.setBd_namefield("name");
        queryObjVO.setResid("qryobj_pk_soorg");
        queryObjVO.setBillfieldname("so_org");
        queryObjVO.setBalfieldname(null);
        queryObjVO.setTallyfieldname(TallyAllVO.getDefaultTableName() + "." + "so_org");
    }
}


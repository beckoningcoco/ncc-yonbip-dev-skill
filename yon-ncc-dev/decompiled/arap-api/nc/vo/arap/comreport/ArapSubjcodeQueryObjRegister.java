/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.md.model.IBean
 *  nc.vo.bd.account.AccountVO
 *  nc.vo.fipub.report.QueryObjVO
 *  nc.vo.ml.NCLangRes4VoTransl
 */
package nc.vo.arap.comreport;

import nc.md.model.IBean;
import nc.vo.arap.comreport.ArapBaseQueryObjRegister;
import nc.vo.arap.tally.TallyVO;
import nc.vo.bd.account.AccountVO;
import nc.vo.fipub.report.QueryObjVO;
import nc.vo.ml.NCLangRes4VoTransl;

public class ArapSubjcodeQueryObjRegister
extends ArapBaseQueryObjRegister {
    private static final long serialVersionUID = 1L;
    public final String QRYOBJ_SUBJCODE = "qryobj_subjcode";

    public ArapSubjcodeQueryObjRegister() {
        super("23a89307-5992-460e-95dd-c628c85f7f95");
    }

    @Override
    protected void setQueryObjVO(IBean bean, QueryObjVO queryObjVO) {
        queryObjVO.setQry_objtablename(TallyVO.getDefaultTableName());
        queryObjVO.setQry_objfieldname("subjcode");
        queryObjVO.setDsp_objtablename(queryObjVO.getQry_objtablename());
        queryObjVO.setDsp_objfieldname(queryObjVO.getQry_objfieldname());
        queryObjVO.setDsp_objname(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0596"));
        queryObjVO.setBd_refname("\u4e8c\u7ea7\u6838\u7b97\u5355\u4f4d\u4f1a\u8ba1\u79d1\u76ee");
        queryObjVO.setBd_tablename(AccountVO.getDefaultTableName());
        queryObjVO.setBd_pkfield("pk_account");
        queryObjVO.setBd_codefield("code");
        queryObjVO.setBd_namefield("name");
        queryObjVO.setResid("qryobj_subjcode");
        queryObjVO.setBillfieldname("subjcode");
        queryObjVO.setBalfieldname(null);
        queryObjVO.setTallyfieldname(TallyVO.getDefaultTableName() + "." + "subjcode");
    }
}


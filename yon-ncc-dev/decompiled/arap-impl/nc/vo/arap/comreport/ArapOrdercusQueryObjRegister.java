/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.md.model.IBean
 *  nc.vo.bd.cust.CustomerVO
 *  nc.vo.fipub.report.QueryObjVO
 *  nc.vo.ml.NCLangRes4VoTransl
 */
package nc.vo.arap.comreport;

import nc.md.model.IBean;
import nc.vo.arap.comreport.ArapBaseQueryObjRegister;
import nc.vo.arap.tally.TallyVO;
import nc.vo.bd.cust.CustomerVO;
import nc.vo.fipub.report.QueryObjVO;
import nc.vo.ml.NCLangRes4VoTransl;

public class ArapOrdercusQueryObjRegister
extends ArapBaseQueryObjRegister {
    public final String QRYOBJ_ORDERCUBASDOC = "qryobj_ordercubasdoc";
    private static final long serialVersionUID = 1L;

    public ArapOrdercusQueryObjRegister() {
        super("e4f48eaf-5567-4383-a370-a59cb3e8a451");
    }

    @Override
    protected void setQueryObjVO(IBean bean, QueryObjVO queryObjVO) {
        queryObjVO.setQry_objtablename(TallyVO.getDefaultTableName());
        queryObjVO.setQry_objfieldname("ordercubasdoc");
        queryObjVO.setDsp_objtablename(queryObjVO.getQry_objtablename());
        queryObjVO.setDsp_objfieldname(queryObjVO.getQry_objfieldname());
        queryObjVO.setDsp_objname(NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "UC000-0003541"));
        queryObjVO.setBd_tablename(CustomerVO.getDefaultTableName());
        queryObjVO.setBd_pkfield("pk_customer");
        queryObjVO.setBd_codefield("code");
        queryObjVO.setBd_namefield("name");
        queryObjVO.setResid("qryobj_ordercubasdoc");
        queryObjVO.setBillfieldname("ordercubasdoc");
        queryObjVO.setBalfieldname(null);
        queryObjVO.setTallyfieldname(TallyVO.getDefaultTableName() + "." + "ordercubasdoc");
    }
}


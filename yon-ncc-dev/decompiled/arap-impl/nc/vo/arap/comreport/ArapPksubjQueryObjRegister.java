/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.md.model.IBean
 *  nc.vo.bd.inoutbusiclass.InoutBusiClassVO
 *  nc.vo.fipub.report.QueryObjVO
 *  nc.vo.ml.NCLangRes4VoTransl
 */
package nc.vo.arap.comreport;

import nc.md.model.IBean;
import nc.vo.arap.comreport.ArapBaseQueryObjRegister;
import nc.vo.arap.tally.TallyVO;
import nc.vo.bd.inoutbusiclass.InoutBusiClassVO;
import nc.vo.fipub.report.QueryObjVO;
import nc.vo.ml.NCLangRes4VoTransl;

public class ArapPksubjQueryObjRegister
extends ArapBaseQueryObjRegister {
    private static final long serialVersionUID = 1L;
    public final String QRYOBJ_PK_SUBJCODE = "qryobj_pk_subjcode";

    public ArapPksubjQueryObjRegister() {
        super("283d91a4-a8f4-4763-ac44-aae7401fa09a");
    }

    @Override
    protected void setQueryObjVO(IBean bean, QueryObjVO queryObjVO) {
        queryObjVO.setQry_objtablename(TallyVO.getDefaultTableName());
        queryObjVO.setQry_objfieldname("pk_subjcode");
        queryObjVO.setDsp_objtablename(queryObjVO.getQry_objtablename());
        queryObjVO.setDsp_objfieldname(queryObjVO.getQry_objfieldname());
        queryObjVO.setDsp_objname(NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "UC000-0002217"));
        queryObjVO.setBd_tablename(InoutBusiClassVO.getDefaultTableName());
        queryObjVO.setBd_pkfield("pk_inoutbusiclass");
        queryObjVO.setBd_codefield("code");
        queryObjVO.setBd_namefield("name");
        queryObjVO.setResid("qryobj_pk_subjcode");
        queryObjVO.setBillfieldname("pk_costsubj");
        queryObjVO.setBalfieldname(null);
        queryObjVO.setTallyfieldname(TallyVO.getDefaultTableName() + "." + "pk_subjcode");
    }
}


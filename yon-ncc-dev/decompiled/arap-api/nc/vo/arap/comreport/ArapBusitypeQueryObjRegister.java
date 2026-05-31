/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.md.model.IBean
 *  nc.vo.fipub.report.QueryObjVO
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pf.pub.BusitypeVO
 */
package nc.vo.arap.comreport;

import nc.md.model.IBean;
import nc.vo.arap.comreport.ArapBaseQueryObjRegister;
import nc.vo.arap.tally.TallyAllVO;
import nc.vo.fipub.report.QueryObjVO;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pf.pub.BusitypeVO;

public class ArapBusitypeQueryObjRegister
extends ArapBaseQueryObjRegister {
    private static final long serialVersionUID = 1L;
    public final String QRYOBJ_PK_BUSITYPE = "qryobj_pk_busitype";

    public ArapBusitypeQueryObjRegister() {
        super("7717f1a3-b777-454e-abb5-ef8705a0f0c2");
    }

    @Override
    protected void setQueryObjVO(IBean bean, QueryObjVO queryObjVO) {
        queryObjVO.setQry_objtablename(TallyAllVO.getDefaultTableName());
        queryObjVO.setQry_objfieldname("pk_busitype");
        queryObjVO.setDsp_objtablename(queryObjVO.getQry_objtablename());
        queryObjVO.setDsp_objfieldname(queryObjVO.getQry_objfieldname());
        queryObjVO.setDsp_objname(NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "UC001-0000003"));
        queryObjVO.setBd_tablename(new BusitypeVO().getTableName());
        queryObjVO.setBd_pkfield("pk_busitype");
        queryObjVO.setBd_codefield("busicode");
        queryObjVO.setBd_namefield("businame");
        queryObjVO.setResid("qryobj_pk_busitype");
        queryObjVO.setBillfieldname("pk_busitype");
        queryObjVO.setBalfieldname(null);
        queryObjVO.setTallyfieldname(TallyAllVO.getDefaultTableName() + "." + "pk_busitype");
    }
}


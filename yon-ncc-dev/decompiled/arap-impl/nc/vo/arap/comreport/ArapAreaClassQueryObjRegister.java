/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.md.model.IBean
 *  nc.vo.bd.cust.CustomerVO
 *  nc.vo.bd.cust.areaclass.AreaclassVO
 *  nc.vo.fipub.report.QueryObjVO
 *  nc.vo.ml.NCLangRes4VoTransl
 */
package nc.vo.arap.comreport;

import nc.md.model.IBean;
import nc.vo.arap.comreport.ArapBaseQueryObjRegister;
import nc.vo.bd.cust.CustomerVO;
import nc.vo.bd.cust.areaclass.AreaclassVO;
import nc.vo.fipub.report.QueryObjVO;
import nc.vo.ml.NCLangRes4VoTransl;

public class ArapAreaClassQueryObjRegister
extends ArapBaseQueryObjRegister {
    private static final long serialVersionUID = 7771800957586791682L;

    public ArapAreaClassQueryObjRegister(String beanID) {
        super("7f91af95-154e-43f9-995e-da76a192be15");
    }

    @Override
    protected void setQueryObjVO(IBean bean, QueryObjVO queryObjVO) {
        queryObjVO.setQry_objtablename(CustomerVO.getDefaultTableName());
        queryObjVO.setQry_objfieldname("pk_areacl");
        queryObjVO.setDsp_objtablename(queryObjVO.getQry_objtablename());
        queryObjVO.setDsp_objfieldname(queryObjVO.getQry_objfieldname());
        queryObjVO.setDsp_objname(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0594"));
        queryObjVO.setBd_tablename(AreaclassVO.getDefaultTableName());
        queryObjVO.setBd_pkfield("pk_areacl");
        queryObjVO.setBd_codefield("code");
        queryObjVO.setBd_namefield("name");
        queryObjVO.setBillfieldname(CustomerVO.getDefaultTableName() + "." + "pk_areacl");
        queryObjVO.setBalfieldname(null);
        queryObjVO.setTallyfieldname(CustomerVO.getDefaultTableName() + "." + "pk_areacl");
    }
}


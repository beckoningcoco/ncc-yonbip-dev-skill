/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.md.model.IBean
 *  nc.vo.bd.material.MaterialVO
 *  nc.vo.bd.material.marbasclass.MarBasClassVO
 *  nc.vo.fipub.report.QueryObjVO
 *  nc.vo.ml.NCLangRes4VoTransl
 */
package nc.vo.arap.comreport;

import nc.md.model.IBean;
import nc.vo.arap.comreport.ArapBaseQueryObjRegister;
import nc.vo.bd.material.MaterialVO;
import nc.vo.bd.material.marbasclass.MarBasClassVO;
import nc.vo.fipub.report.QueryObjVO;
import nc.vo.ml.NCLangRes4VoTransl;

public class ArapMaterialClassQueryObjRegister
extends ArapBaseQueryObjRegister {
    private static final long serialVersionUID = -4709012448862186269L;

    public ArapMaterialClassQueryObjRegister(String beanID) {
        super("c099f7d7-52a9-4b98-bee7-2e3a6c3ea263");
    }

    @Override
    protected void setQueryObjVO(IBean bean, QueryObjVO queryObjVO) {
        queryObjVO.setQry_objtablename(MaterialVO.getDefaultTableName());
        queryObjVO.setQry_objfieldname("pk_marbasclass");
        queryObjVO.setDsp_objtablename(queryObjVO.getQry_objtablename());
        queryObjVO.setDsp_objfieldname(queryObjVO.getQry_objfieldname());
        queryObjVO.setDsp_objname(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0594"));
        queryObjVO.setBd_tablename(MarBasClassVO.getDefaultTableName());
        queryObjVO.setBd_pkfield("pk_marbasclass");
        queryObjVO.setBd_codefield("code");
        queryObjVO.setBd_namefield("name");
        queryObjVO.setBillfieldname(MaterialVO.getDefaultTableName() + "." + "pk_marbasclass");
        queryObjVO.setBalfieldname(null);
        queryObjVO.setTallyfieldname(MaterialVO.getDefaultTableName() + "." + "pk_marbasclass");
    }
}


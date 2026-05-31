/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.md.model.IBean
 *  nc.utils.fipub.FipubReportResource
 *  nc.vo.bd.cust.CustSupplierVO
 *  nc.vo.fipub.report.QueryObjVO
 */
package nc.vo.arap.comreport;

import nc.md.model.IBean;
import nc.utils.fipub.FipubReportResource;
import nc.vo.arap.comreport.ArapBaseQueryObjRegister;
import nc.vo.bd.cust.CustSupplierVO;
import nc.vo.fipub.report.QueryObjVO;

public class ArapCustSupplierQueryObjRegister
extends ArapBaseQueryObjRegister {
    private static final long serialVersionUID = 1L;
    public final String QRYOBJ_PK_CUST_SUP = "qryobj_pk_cust_sup";

    public ArapCustSupplierQueryObjRegister() {
        super("8c6510dd-3b8a-4cfc-a5c5-323d53c6006f");
    }

    @Override
    protected void setQueryObjVO(IBean bean, QueryObjVO queryObjVO) {
        queryObjVO.setQry_objtablename(CustSupplierVO.getDefaultTableName());
        queryObjVO.setQry_objfieldname("pk_cust_sup");
        queryObjVO.setDsp_objtablename(queryObjVO.getQry_objtablename());
        queryObjVO.setDsp_objfieldname(queryObjVO.getQry_objfieldname());
        queryObjVO.setDsp_objname(FipubReportResource.getAssoObjCusSupLbl());
        queryObjVO.setBd_tablename(CustSupplierVO.getDefaultTableName());
        queryObjVO.setBd_pkfield("pk_cust_sup");
        queryObjVO.setBd_codefield("code");
        queryObjVO.setBd_namefield("name");
        queryObjVO.setBd_refname(queryObjVO.getBd_refname().split(";")[0]);
        queryObjVO.setResid("qryobj_pk_cust_sup");
        queryObjVO.setBillfieldname("pk_cust_sup");
        queryObjVO.setBalfieldname("pk_cust_sup");
        queryObjVO.setTallyfieldname("pk_cust_sup");
    }
}


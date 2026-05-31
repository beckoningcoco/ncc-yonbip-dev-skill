/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.md.model.IBean
 *  nc.utils.fipub.FipubReportResource
 *  nc.vo.bd.cust.CustomerVO
 *  nc.vo.fipub.report.QueryObjVO
 */
package nc.vo.arap.comreport;

import nc.md.model.IBean;
import nc.utils.fipub.FipubReportResource;
import nc.vo.arap.comreport.ArapBaseQueryObjRegister;
import nc.vo.arap.tally.BalanceVO;
import nc.vo.arap.tally.TallyVO;
import nc.vo.bd.cust.CustomerVO;
import nc.vo.fipub.report.QueryObjVO;

public class ArapCustomerQueryObjRegister
extends ArapBaseQueryObjRegister {
    private static final long serialVersionUID = 1L;
    public final String QRYOBJ_CUSTOMER = "qryobj_customer";

    public ArapCustomerQueryObjRegister() {
        super("e4f48eaf-5567-4383-a370-a59cb3e8a451");
    }

    @Override
    protected void setQueryObjVO(IBean bean, QueryObjVO queryObjVO) {
        queryObjVO.setQry_objtablename(BalanceVO.getDefaultTableName());
        queryObjVO.setQry_objfieldname("customer");
        queryObjVO.setDsp_objtablename(queryObjVO.getQry_objtablename());
        queryObjVO.setDsp_objfieldname(queryObjVO.getQry_objfieldname());
        queryObjVO.setDsp_objname(FipubReportResource.getAssoObjCusLbl());
        queryObjVO.setBd_tablename(CustomerVO.getDefaultTableName());
        queryObjVO.setBd_pkfield("pk_customer");
        queryObjVO.setBd_codefield("code");
        queryObjVO.setBd_namefield("name");
        queryObjVO.setResid("qryobj_customer");
        queryObjVO.setBillfieldname("customer");
        queryObjVO.setBalfieldname(BalanceVO.getDefaultTableName() + "." + "customer");
        queryObjVO.setTallyfieldname(TallyVO.getDefaultTableName() + "." + "customer");
    }
}


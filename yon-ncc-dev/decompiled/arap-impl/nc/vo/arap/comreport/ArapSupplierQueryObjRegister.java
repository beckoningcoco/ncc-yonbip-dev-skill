/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.md.model.IBean
 *  nc.utils.fipub.FipubReportResource
 *  nc.vo.bd.supplier.SupplierVO
 *  nc.vo.fipub.report.QueryObjVO
 */
package nc.vo.arap.comreport;

import nc.md.model.IBean;
import nc.utils.fipub.FipubReportResource;
import nc.vo.arap.comreport.ArapBaseQueryObjRegister;
import nc.vo.arap.tally.BalanceVO;
import nc.vo.arap.tally.TallyVO;
import nc.vo.bd.supplier.SupplierVO;
import nc.vo.fipub.report.QueryObjVO;

public class ArapSupplierQueryObjRegister
extends ArapBaseQueryObjRegister {
    private static final long serialVersionUID = 1L;
    public final String QRYOBJ_SUPPLIER = "qryobj_supplier";

    public ArapSupplierQueryObjRegister() {
        super("720dcc7c-ff19-48f4-b9c5-b90906682f45");
    }

    @Override
    protected void setQueryObjVO(IBean bean, QueryObjVO queryObjVO) {
        queryObjVO.setQry_objtablename(BalanceVO.getDefaultTableName());
        queryObjVO.setQry_objfieldname("supplier");
        queryObjVO.setDsp_objtablename(queryObjVO.getQry_objtablename());
        queryObjVO.setDsp_objfieldname(queryObjVO.getQry_objfieldname());
        queryObjVO.setDsp_objname(FipubReportResource.getAssoObjSupLbl());
        queryObjVO.setBd_refname("\u4f9b\u5e94\u5546\u6863\u6848");
        queryObjVO.setBd_tablename(new SupplierVO().getTableName());
        queryObjVO.setBd_pkfield("pk_supplier");
        queryObjVO.setBd_codefield("code");
        queryObjVO.setBd_namefield("name");
        queryObjVO.setResid("qryobj_supplier");
        queryObjVO.setBillfieldname("supplier");
        queryObjVO.setBalfieldname(BalanceVO.getDefaultTableName() + "." + "supplier");
        queryObjVO.setTallyfieldname(TallyVO.getDefaultTableName() + "." + "supplier");
    }
}


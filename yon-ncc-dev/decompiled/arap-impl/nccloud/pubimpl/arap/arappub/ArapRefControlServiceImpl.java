/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.md.model.MetaDataException
 *  nc.md.persist.framework.MDPersistenceService
 *  nc.vo.arap.bill.util.BillEventHandlerUtil
 *  nc.vo.bd.cust.CustomerVO
 *  nc.vo.bd.supplier.SupplierVO
 *  nccloud.pubitf.arap.arappub.IArapRefControlService
 */
package nccloud.pubimpl.arap.arappub;

import nc.md.model.MetaDataException;
import nc.md.persist.framework.MDPersistenceService;
import nc.vo.arap.bill.util.BillEventHandlerUtil;
import nc.vo.bd.cust.CustomerVO;
import nc.vo.bd.supplier.SupplierVO;
import nccloud.pubitf.arap.arappub.IArapRefControlService;

public class ArapRefControlServiceImpl
implements IArapRefControlService {
    public SupplierVO getSupplierVO(String pk_supplier) throws MetaDataException {
        return (SupplierVO)MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPK(SupplierVO.class, pk_supplier, false);
    }

    public CustomerVO getCustomerVO(String pk_customer) throws MetaDataException {
        return BillEventHandlerUtil.getCustomerVO((String)pk_customer);
    }
}


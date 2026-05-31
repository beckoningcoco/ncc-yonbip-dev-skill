/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.itf.arap.receivable.IArapReceiveableBillSpQueryService
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDouble
 */
package nc.impl.arap.receivable;

import java.util.Map;
import nc.bs.arap.receiveablebp.RecBillBO;
import nc.itf.arap.receivable.IArapReceiveableBillSpQueryService;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDouble;

public class ArapReceiveableBillSpQueryServiceImpl
implements IArapReceiveableBillSpQueryService {
    public Map<String, UFDouble> getNewCoustomBanlanceByBasDoc(String[] pkCubasdoc, String pk_org) throws BusinessException {
        return this.getRecBillBO().getNewCoustomBanlanceByCubasdoc(pkCubasdoc, pk_org);
    }

    private RecBillBO getRecBillBO() {
        return new RecBillBO();
    }
}


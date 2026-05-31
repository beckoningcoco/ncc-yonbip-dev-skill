/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.pub.BillEnumCollection$Direction
 *  nc.vo.arap.pub.BillEnumCollection$FromSystem
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFBoolean
 *  nccloud.pubitf.arap.openapi.IGatheringbillOpenService
 */
package nccloud.pubimpl.arap.openapi;

import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;
import nccloud.pubimpl.arap.openapi.BillOpenServiceImpl;
import nccloud.pubitf.arap.openapi.IGatheringbillOpenService;

public class GatheringbillOpenServiceImpl
extends BillOpenServiceImpl
implements IGatheringbillOpenService {
    @Override
    protected void setHeadInfo(BaseBillVO headvo) throws BusinessException {
        headvo.setPk_billtype("F2");
        headvo.setBillclass("sk");
        headvo.setIsinit(UFBoolean.FALSE);
        headvo.setSyscode(BillEnumCollection.FromSystem.AR.VALUE);
    }

    @Override
    protected Integer getDirection() throws BusinessException {
        return BillEnumCollection.Direction.DEBIT.VALUE;
    }

    @Override
    protected String getBilltype() throws BusinessException {
        return "F2";
    }
}


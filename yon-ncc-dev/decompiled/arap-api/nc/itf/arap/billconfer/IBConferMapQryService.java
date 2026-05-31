/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package nc.itf.arap.billconfer;

import nc.vo.arap.billconfer.BcMapVO;
import nc.vo.pub.BusinessException;

public interface IBConferMapQryService {
    public BcMapVO[] queryBCMapByIDAndBType(String var1, String var2) throws BusinessException;

    public BcMapVO[] queryBCMapByDestBill(String var1, String var2) throws BusinessException;
}


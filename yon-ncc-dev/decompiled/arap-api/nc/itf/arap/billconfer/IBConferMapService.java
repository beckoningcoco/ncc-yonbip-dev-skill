/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package nc.itf.arap.billconfer;

import nc.vo.arap.billconfer.BcMapVO;
import nc.vo.pub.BusinessException;

public interface IBConferMapService {
    public void deleteBcMapVO(BcMapVO var1) throws BusinessException;

    public BcMapVO findBcMapVOByPK(String var1) throws BusinessException;

    public String insertBcMapVO(BcMapVO var1) throws BusinessException;

    public void updateConfer(BcMapVO var1) throws BusinessException;

    public void deleteByPks(String[] var1, String var2) throws BusinessException;

    public void canelDeleteByPks(String[] var1, String var2) throws BusinessException;

    public void deleteByDestBill(String[] var1, String var2) throws BusinessException;
}


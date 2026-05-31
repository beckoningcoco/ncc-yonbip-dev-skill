/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package nc.itf.arap.billconfer;

import java.util.Vector;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.billconfer.BillconferVO;
import nc.vo.pub.BusinessException;

public interface IBillConferService {
    public void deleteConfer(BillconferVO var1) throws BusinessException;

    public BillconferVO findConferByPK(String var1) throws BusinessException;

    public String insertConfer(BillconferVO var1) throws BusinessException;

    public String[] insertArrayConfer(BillconferVO[] var1) throws BusinessException;

    public BillconferVO[] queryConferByCorpPk(String var1) throws BusinessException;

    public void updateConfer(BillconferVO var1) throws BusinessException;

    public BillconferVO[] queryConfigInfo(String var1, Vector var2) throws BusinessException;

    public void deleteVOS(BaseAggVO[] var1) throws BusinessException;

    public void clearBillConferNum(BaseAggVO[] var1) throws BusinessException;
}


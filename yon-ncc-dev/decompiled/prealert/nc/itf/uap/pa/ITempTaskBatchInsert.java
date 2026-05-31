/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package nc.itf.uap.pa;

import nc.bs.pub.taskcenter.IReportLikeWork;
import nc.vo.pub.BusinessException;
import nc.vo.pub.pa.TimingSettingVO;

public interface ITempTaskBatchInsert {
    public String[] batchAddTempTask(IReportLikeWork[] var1, TimingSettingVO var2) throws BusinessException;

    public String[] batchAddTempTask(IReportLikeWork[] var1, String var2, TimingSettingVO var3) throws BusinessException;

    public int getEnableServerNum() throws BusinessException;
}


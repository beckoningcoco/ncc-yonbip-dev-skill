/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.tb.obj.NtbParamVO
 */
package nccloud.itf.arap.tbb;

import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.tb.obj.NtbParamVO;

public interface ITBBCtrlService {
    public void budgetCheck(AggregatedValueObject[] var1, String var2) throws BusinessException;

    public void budgetUpdate(AggregatedValueObject[] var1, String var2) throws BusinessException;

    public void budgetCtrl(AggregatedValueObject[] var1, String var2) throws BusinessException;

    public NtbParamVO getNtbParamVos(String var1) throws BusinessException;
}


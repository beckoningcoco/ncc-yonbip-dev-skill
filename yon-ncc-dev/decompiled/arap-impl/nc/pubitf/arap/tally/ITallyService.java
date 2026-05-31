/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 */
package nc.pubitf.arap.tally;

import java.util.List;
import nc.itf.arap.tally.ITallySourceData;
import nc.vo.arap.tally.BusiTypeEnum;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;

public interface ITallyService {
    public void registerTally(BusiTypeEnum var1, List<ITallySourceData> var2) throws BusinessException;

    public void deleteTally(BusiTypeEnum var1, List<ITallySourceData> var2) throws BusinessException;

    public void effectTally(BusiTypeEnum var1, List<ITallySourceData> var2) throws BusinessException;

    public void unEffectTally(BusiTypeEnum var1, List<ITallySourceData> var2) throws BusinessException;

    public void verifyTally(BusiTypeEnum var1, List<ITallySourceData> var2) throws BusinessException;

    public void agiotageTally(BusiTypeEnum var1, List<ITallySourceData> var2) throws BusinessException;

    public void badDebtTally(BusiTypeEnum var1, List<ITallySourceData> var2) throws BusinessException;

    public void debtTransferTally(BusiTypeEnum var1, List<ITallySourceData> var2) throws BusinessException;

    public void dealEstiTally(BusiTypeEnum var1, List<ITallySourceData> var2) throws BusinessException;

    public void billRevise4PreTally(List<AggregatedValueObject> var1) throws BusinessException;

    public void registerBadDebtTally(BusiTypeEnum var1, List<ITallySourceData> var2) throws BusinessException;

    public void deleteBadDebtTally(BusiTypeEnum var1, List<ITallySourceData> var2) throws BusinessException;

    public void antiVerifyTally(BusiTypeEnum var1, List<ITallySourceData> var2, Boolean var3) throws BusinessException;
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDouble
 */
package nc.pubitf.arap.tally;

import java.util.List;
import nc.vo.arap.tally.AggTallyVO;
import nc.vo.arap.tally.TallyVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDouble;

public interface IArapQueryTallySerivce {
    public AggTallyVO[] queryTallyByBillPk(String var1) throws BusinessException;

    public TallyVO[] queryDealTallyByBillPk(String var1) throws BusinessException;

    public List<AggTallyVO> queryTallyByBillPkExceptVerify(List<String> var1) throws BusinessException;

    public List<UFDouble> queryVerifiedMoney(String var1, String var2) throws BusinessException;

    public List<TallyVO> querBillNoByPk(List<String> var1) throws BusinessException;
}


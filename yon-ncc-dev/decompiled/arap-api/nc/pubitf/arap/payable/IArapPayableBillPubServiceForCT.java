/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDouble
 */
package nc.pubitf.arap.payable;

import java.util.List;
import java.util.Map;
import nc.pubitf.arap.payable.ct.PayableForContractVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDouble;

public interface IArapPayableBillPubServiceForCT {
    public Map<String, UFDouble> queryBalanceByCTpks(String[] var1) throws BusinessException;

    public List<PayableForContractVO> queryInfosByCtNo(String[] var1) throws BusinessException;
}


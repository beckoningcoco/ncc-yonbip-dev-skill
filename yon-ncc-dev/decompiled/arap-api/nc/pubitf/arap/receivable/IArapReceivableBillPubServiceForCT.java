/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDouble
 */
package nc.pubitf.arap.receivable;

import java.util.Map;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDouble;

public interface IArapReceivableBillPubServiceForCT {
    public Map<String, UFDouble> queryBalanceByCTpks(String[] var1) throws BusinessException;
}


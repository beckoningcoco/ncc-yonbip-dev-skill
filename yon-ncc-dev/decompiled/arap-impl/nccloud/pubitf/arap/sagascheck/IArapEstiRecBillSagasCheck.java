/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.arap.verify.AdjuestVO
 *  nc.vo.pub.BusinessException
 */
package nccloud.pubitf.arap.sagascheck;

import java.util.Map;
import nc.vo.arap.verify.AdjuestVO;
import nc.vo.pub.BusinessException;
import nccloud.pubitf.arap.sagascheck.IArapBillSagasCheck;

public interface IArapEstiRecBillSagasCheck
extends IArapBillSagasCheck {
    public void deleteBillBySrcItemKeyAndOrgSagasCheck(Map<String, String> var1) throws BusinessException;

    public void estiSagasCheck(AdjuestVO[] var1) throws BusinessException;

    public void unEstiSagasCheck(String[] var1) throws BusinessException;
}


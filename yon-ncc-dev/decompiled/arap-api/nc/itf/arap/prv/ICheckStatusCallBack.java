/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.pub.pf.CheckStatusCallbackContext
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 */
package nc.itf.arap.prv;

import nc.bs.pub.pf.CheckStatusCallbackContext;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;

public interface ICheckStatusCallBack {
    public void checkStatus(BaseBillVO var1, CheckStatusCallbackContext var2) throws BusinessException;

    public String generateBillHtml(String var1, String var2, String var3, String var4) throws BusinessException;

    public boolean canCommitOrStartFlow(String var1, String var2) throws BusinessException;

    public boolean isWorkFlowStartup(String var1, String var2) throws BusinessException;

    public boolean isApproveFlowStartup(String var1, String var2) throws BusinessException;

    public boolean isContainWorkFlowStartup(String[] var1, String var2) throws BusinessException;

    public boolean isContainApproveFlowStartup(String[] var1, String var2) throws BusinessException;

    public boolean isapproved(String var1, String var2) throws BusinessException;

    public boolean isCheckman(String var1, String var2, String var3) throws BusinessException;

    public void changeApproveStatus(AggregatedValueObject var1) throws BusinessException;
}


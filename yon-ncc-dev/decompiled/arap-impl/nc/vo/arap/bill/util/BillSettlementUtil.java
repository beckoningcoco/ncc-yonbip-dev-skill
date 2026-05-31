/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.itf.fi.pub.SysInit
 *  nc.vo.arap.gathering.AggGatheringBillVO
 *  nc.vo.arap.pay.AggPayBillVO
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.pub.BusinessException
 */
package nc.vo.arap.bill.util;

import nc.itf.fi.pub.SysInit;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.gathering.AggGatheringBillVO;
import nc.vo.arap.pay.AggPayBillVO;
import nc.vo.arap.sysinit.SysinitConst;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.pub.BusinessException;

public class BillSettlementUtil {
    public static AggPayBillVO processPayBillCreditRefInfo(AggPayBillVO fjVO, String newStructuredstandard, String newCreditorreference) {
        BaseBillVO bean = (BaseBillVO)fjVO.getParentVO();
        BaseItemVO[] itemBeans = (BaseItemVO[])fjVO.getChildrenVO();
        String creditRefInfo = null;
        try {
            creditRefInfo = SysInit.getParaString((String)bean.getPk_org(), (String)SysinitConst.AP36);
        }
        catch (BusinessException e) {
            ExceptionHandler.handleRuntimeException((Exception)((Object)e));
        }
        bean.setCreditrefstd(newStructuredstandard);
        if (null != creditRefInfo) {
            for (BaseItemVO item : itemBeans) {
                item.setAttributeValue(creditRefInfo, newCreditorreference);
            }
        }
        return fjVO;
    }

    public static AggGatheringBillVO processGatheringBillCreditRefInfo(AggGatheringBillVO fjVO, String newStructuredstandard, String newCreditorreference) {
        BaseBillVO bean = (BaseBillVO)fjVO.getParentVO();
        BaseItemVO[] itemBeans = (BaseItemVO[])fjVO.getChildrenVO();
        String creditRefInfo = null;
        try {
            creditRefInfo = SysInit.getParaString((String)bean.getPk_org(), (String)SysinitConst.AR36);
        }
        catch (BusinessException e) {
            ExceptionHandler.handleRuntimeException((Exception)((Object)e));
        }
        bean.setCreditrefstd(newStructuredstandard);
        if (null != creditRefInfo) {
            for (BaseItemVO item : itemBeans) {
                item.setAttributeValue(creditRefInfo, newCreditorreference);
            }
        }
        return fjVO;
    }
}


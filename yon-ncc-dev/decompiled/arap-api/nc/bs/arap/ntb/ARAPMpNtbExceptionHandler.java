/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  uap.iweb.wf.util.IWFAlertExceptionHandler
 */
package nc.bs.arap.ntb;

import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.exception.ArapTbbException;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import uap.iweb.wf.util.IWFAlertExceptionHandler;

public class ARAPMpNtbExceptionHandler
implements IWFAlertExceptionHandler {
    public String getAlertMessageByException(BusinessException e) throws BusinessException {
        if (e instanceof ArapTbbException) {
            return e.getMessage();
        }
        return null;
    }

    public void setAlertForcePass(String checkResult, AggregatedValueObject billvo) throws BusinessException {
        if (null == billvo) {
            return;
        }
        if (null == checkResult || !checkResult.equals("C") && !checkResult.equals("Y")) {
            return;
        }
        if (billvo instanceof BaseAggVO) {
            ((BaseAggVO)billvo).setAlarmPassed(true);
        }
    }
}


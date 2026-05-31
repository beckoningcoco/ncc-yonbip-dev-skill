/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.pub.compiler.AbstractCompiler2
 *  nc.pubitf.credit.accountcheck.IIgnoreAccountCheck
 *  nc.pubitf.credit.creditcheck.IIgnoreCreditCheck
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.BusinessRuntimeException
 *  nc.vo.pubapp.pflow.PfUserObject
 *  nc.vo.scmpub.res.BusinessCheck
 *  nccloud.commons.lang.ArrayUtils
 */
package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.pub.compiler.AbstractCompiler2;
import nc.pubitf.credit.accountcheck.IIgnoreAccountCheck;
import nc.pubitf.credit.creditcheck.IIgnoreCreditCheck;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.BusinessRuntimeException;
import nc.vo.pubapp.pflow.PfUserObject;
import nc.vo.scmpub.res.BusinessCheck;
import nccloud.commons.lang.ArrayUtils;

public class N_F0_ACTION
extends AbstractCompiler2 {
    protected boolean getCreditFlag(BusinessCheck busiCheck) {
        if (this.getUserObj() == null) {
            return false;
        }
        if (!(BusinessCheck.CreditOverPeriodMoneyCheck.equals((Object)busiCheck) || BusinessCheck.CreditCheck.equals((Object)busiCheck) || BusinessCheck.CreditOverPeriodInnerDayCheck.equals((Object)busiCheck) || BusinessCheck.CreditOverPeriodDayCheck.equals((Object)busiCheck))) {
            throw new BusinessRuntimeException(NCLangRes4VoTransl.getNCLangRes().getStrByID("20062006v61013_0", "020062006v61013-0009") + busiCheck);
        }
        PfUserObject userObj = null;
        if (this.getUserObj() instanceof PfUserObject) {
            userObj = (PfUserObject)this.getUserObj();
        } else if (this.getUserObj() instanceof PfUserObject[]) {
            PfUserObject pfUserObject = userObj = ArrayUtils.isEmpty((Object[])((PfUserObject[])this.getUserObj())) ? null : ((PfUserObject[])this.getUserObj())[0];
        }
        Boolean flag = userObj == null ? Boolean.valueOf(false) : (userObj.getBusinessCheckMap().get(busiCheck.getCheckCode()) == null ? Boolean.valueOf(false) : (Boolean)userObj.getBusinessCheckMap().get(busiCheck.getCheckCode()));
        return flag == null ? false : flag;
    }

    protected void doCreditCheck() throws BusinessException {
        IIgnoreCreditCheck service;
        if (this.getCreditFlag(BusinessCheck.CreditCheck)) {
            service = (IIgnoreCreditCheck)NCLocator.getInstance().lookup(IIgnoreCreditCheck.class);
            try {
                service.ignoreCreditCheck();
            }
            catch (BusinessException e) {
                throw ExceptionHandler.handleException((Exception)((Object)e));
            }
        }
        if (this.getCreditFlag(BusinessCheck.CreditOverPeriodMoneyCheck)) {
            service = (IIgnoreAccountCheck)NCLocator.getInstance().lookup(IIgnoreAccountCheck.class);
            try {
                service.ignoreOverPeriodMoneyCheck();
            }
            catch (BusinessException e) {
                throw ExceptionHandler.handleException((Exception)((Object)e));
            }
        }
        if (this.getCreditFlag(BusinessCheck.CreditOverPeriodInnerDayCheck)) {
            service = (IIgnoreAccountCheck)NCLocator.getInstance().lookup(IIgnoreAccountCheck.class);
            try {
                service.ignoreOverPeriodInnerDayCheck();
            }
            catch (BusinessException e) {
                throw ExceptionHandler.handleException((Exception)((Object)e));
            }
        }
        if (this.getCreditFlag(BusinessCheck.CreditOverPeriodDayCheck)) {
            service = (IIgnoreAccountCheck)NCLocator.getInstance().lookup(IIgnoreAccountCheck.class);
            try {
                service.ignoreOverPeriodDayCheck();
            }
            catch (BusinessException e) {
                throw ExceptionHandler.handleException((Exception)((Object)e));
            }
        }
    }
}


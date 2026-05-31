/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.businessevent.CheckEvent
 *  nc.bs.businessevent.IBusinessEvent
 *  nc.bs.businessevent.IBusinessListener
 *  nc.bs.logging.Logger
 *  nc.bs.uif2.validation.IValidationService
 *  nc.bs.uif2.validation.ValidationFrameworkUtil
 *  nc.bs.uif2.validation.Validator
 *  nc.vo.org.BatchCloseAccBookVO
 *  nc.vo.pub.BusinessException
 *  nccloud.impl.arap.baddebts.listener.UnCloseAccProVisionBeforeValidator
 */
package nc.impl.arap.closeaccbook;

import nc.bs.businessevent.CheckEvent;
import nc.bs.businessevent.IBusinessEvent;
import nc.bs.businessevent.IBusinessListener;
import nc.bs.logging.Logger;
import nc.bs.uif2.validation.IValidationService;
import nc.bs.uif2.validation.ValidationFrameworkUtil;
import nc.bs.uif2.validation.Validator;
import nc.vo.org.BatchCloseAccBookVO;
import nc.vo.pub.BusinessException;
import nccloud.impl.arap.baddebts.listener.UnCloseAccProVisionBeforeValidator;

public class BatchUnCloseAccBookBeforeListener
implements IBusinessListener {
    public void doAction(IBusinessEvent event) throws BusinessException {
        if (event instanceof CheckEvent) {
            CheckEvent checkEvent = (CheckEvent)event;
            BatchCloseAccBookVO[] bookVOs = (BatchCloseAccBookVO[])checkEvent.getInputVOs();
            if (bookVOs.length < 1) {
                return;
            }
            IValidationService validateService = ValidationFrameworkUtil.createValidationService((Validator[])new Validator[]{new UnCloseAccProVisionBeforeValidator()});
            for (BatchCloseAccBookVO bookVO : bookVOs) {
                if (!"2006".equals(bookVO.getModuleid())) continue;
                try {
                    validateService.validate((Object)bookVO);
                }
                catch (Exception e) {
                    try {
                        String message = e.getMessage();
                        message = bookVO.getName() + " " + bookVO.getCode() + " " + message;
                        ((CheckEvent)event).addErrorMsg((Object)bookVO, message);
                    }
                    catch (Exception e1) {
                        Logger.error((Object)e1.getMessage(), (Throwable)e1);
                        throw new BusinessException(e1.getMessage(), (Throwable)e1);
                    }
                    Logger.error((Object)e.getMessage(), (Throwable)e);
                }
            }
        }
    }
}


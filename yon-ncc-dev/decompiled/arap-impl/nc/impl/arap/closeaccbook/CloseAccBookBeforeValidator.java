/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Logger
 *  nc.bs.uif2.validation.ValidationFailure
 *  nc.bs.uif2.validation.Validator
 *  nc.itf.org.check.IAccBookCloseCheck
 *  nc.vo.org.BatchCloseAccBookVO
 *  nc.vo.org.CloseResult
 *  nc.vo.org.closeaccbook.CheckItemVO
 *  nc.vo.org.closeaccbook.CheckStragy
 *  nc.vo.org.closeaccbook.check.CheckResultEnum
 *  nc.vo.pub.BusinessException
 */
package nc.impl.arap.closeaccbook;

import java.util.ArrayList;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.bs.uif2.validation.ValidationFailure;
import nc.bs.uif2.validation.Validator;
import nc.itf.org.check.IAccBookCloseCheck;
import nc.vo.org.BatchCloseAccBookVO;
import nc.vo.org.CloseResult;
import nc.vo.org.closeaccbook.CheckItemVO;
import nc.vo.org.closeaccbook.CheckStragy;
import nc.vo.org.closeaccbook.check.CheckResultEnum;
import nc.vo.pub.BusinessException;

public class CloseAccBookBeforeValidator
implements Validator {
    private static final long serialVersionUID = 1L;

    public ValidationFailure validate(Object obj) {
        Logger.info((Object)"***************************************\u5173\u8d26\u9a8c\u8bc1\u5f00\u59cb***************************************");
        if (obj == null) {
            return null;
        }
        try {
            BatchCloseAccBookVO bookVO = (BatchCloseAccBookVO)obj;
            CloseResult cr = ((IAccBookCloseCheck)NCLocator.getInstance().lookup(IAccBookCloseCheck.class)).checkOnClose(bookVO.getModuleid(), bookVO.getPk_accperiodmonth(), bookVO.getPk_org(), bookVO.getPk_storedoc(), bookVO.getCloseorgpks() != null ? bookVO.getCloseorgpks().substring(0, 20) : null);
            if (cr != null) {
                return this.getValidateInfo(bookVO, cr);
            }
        }
        catch (BusinessException e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
            ValidationFailure validateInfo = new ValidationFailure();
            validateInfo.setMessage(e.getMessage());
            return validateInfo;
        }
        Logger.info((Object)"***************************************\u5173\u8d26\u9a8c\u8bc1\u7ed3\u675f***************************************");
        return null;
    }

    private ValidationFailure getValidateInfo(BatchCloseAccBookVO bookVO, CloseResult cr) {
        ArrayList resultList = cr.getResult();
        StringBuilder msg = new StringBuilder();
        resultList.forEach(result -> {
            CheckResultEnum resultEnum = result.getResult();
            String message = resultEnum.getMessage();
            CheckItemVO checkItemVO = result.getItem();
            if (message != null && CheckStragy.ERROR.toInt().equals(checkItemVO.getCheckstrategy())) {
                msg.append(result.getItem().getName());
                msg.append(": ");
                msg.append(message.trim().replaceAll("@", ""));
                msg.append(",");
            }
        });
        if (msg.length() > 0) {
            ValidationFailure validateInfo = new ValidationFailure();
            validateInfo.setMessage(bookVO.getCode() + " " + bookVO.getName() + " " + msg.substring(0, msg.length() - 1));
            return validateInfo;
        }
        return null;
    }
}


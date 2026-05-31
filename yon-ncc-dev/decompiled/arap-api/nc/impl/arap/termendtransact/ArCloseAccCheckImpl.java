/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.org.check.ICloseCheck
 *  nc.vo.org.closeaccbook.CheckItemVO
 *  nc.vo.org.closeaccbook.check.CheckResultEnum
 *  nc.vo.org.closeaccbook.check.CloseParam
 *  nc.vo.pub.BusinessException
 */
package nc.impl.arap.termendtransact;

import nc.bs.framework.common.NCLocator;
import nc.itf.arap.termendtransact.ICloseAccountService;
import nc.itf.org.check.ICloseCheck;
import nc.vo.org.closeaccbook.CheckItemVO;
import nc.vo.org.closeaccbook.check.CheckResultEnum;
import nc.vo.org.closeaccbook.check.CloseParam;
import nc.vo.pub.BusinessException;

public class ArCloseAccCheckImpl
implements ICloseCheck {
    public CheckResultEnum checkClose(CloseParam param) throws BusinessException {
        String pk_org = (String)param.getAttributeValue("pk_org");
        String period = (String)param.getAttributeValue("period");
        CheckItemVO itemvo = (CheckItemVO)param.getAttributeValue("checkitem");
        String checkcode = itemvo == null ? null : itemvo.getCode();
        ICloseAccountService service = (ICloseAccountService)NCLocator.getInstance().lookup(ICloseAccountService.class);
        CheckResultEnum rst = service.checkCloseAccResult(pk_org, period, true, checkcode);
        return rst;
    }
}


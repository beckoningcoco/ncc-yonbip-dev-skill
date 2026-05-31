/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.imag.lightbus.IImagPubService
 *  nc.vo.arap.utils.ARAPModuleEnableUtil
 *  nc.vo.pub.BusinessException
 *  nccloud.itf.arap.bill.image.IArapImagePubService
 */
package nccloud.impl.arap.bill.image;

import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.itf.imag.lightbus.IImagPubService;
import nc.vo.arap.utils.ARAPModuleEnableUtil;
import nc.vo.pub.BusinessException;
import nccloud.itf.arap.bill.image.IArapImagePubService;

public class ArapImagePubServiceImpl
implements IArapImagePubService {
    public Boolean updateBillNo(String billID, String billNo) throws BusinessException {
        Boolean result = true;
        if (ARAPModuleEnableUtil.isImagEnabled((String)InvocationInfoProxy.getInstance().getGroupId())) {
            IImagPubService service = (IImagPubService)NCLocator.getInstance().lookup(IImagPubService.class);
            if (ARAPModuleEnableUtil.isImagEnabled((String)InvocationInfoProxy.getInstance().getGroupId())) {
                result = service.updateBillNo(billID, "");
            }
        }
        return result;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.arap.bill.IArapBillBaseService
 *  nc.itf.arap.billconfer.IBillConferService
 *  nc.itf.framework.ejb.CMTProxy
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.pub.BusinessException
 *  nc.vo.pubapp.pattern.exception.ExceptionUtils
 *  nccloud.pubitf.arap.arappub.IBillRequiresNewDeleteService
 */
package nccloud.pubimpl.arap.arappub;

import java.lang.reflect.Method;
import nc.bs.framework.common.NCLocator;
import nc.itf.arap.bill.IArapBillBaseService;
import nc.itf.arap.billconfer.IBillConferService;
import nc.itf.framework.ejb.CMTProxy;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nccloud.pubitf.arap.arappub.IBillRequiresNewDeleteService;

public class BillRequiresNewDeleteServiceImpl
implements IBillRequiresNewDeleteService {
    public void deleteConfirmVOS_RequiresNew(BaseAggVO aggvo, IBillConferService service) throws Exception {
        CMTProxy proxySrv = (CMTProxy)NCLocator.getInstance().lookup(CMTProxy.class);
        Method method = this.getMethod(this);
        Object[] paras = new Object[]{aggvo, service};
        proxySrv.delegate_RequiresNew((Object)this, method, paras);
    }

    public void deleteInitVOS_RequiresNew(BaseAggVO aggvo, IArapBillBaseService service) throws Exception {
        CMTProxy proxySrv = (CMTProxy)NCLocator.getInstance().lookup(CMTProxy.class);
        Method method = this.getMethod2(this);
        Object[] paras = new Object[]{aggvo, service};
        proxySrv.delegate_RequiresNew((Object)this, method, paras);
    }

    private Method getMethod2(Object target) {
        Class[] parameterTypes = new Class[]{BaseAggVO.class, IArapBillBaseService.class};
        Method method = null;
        try {
            method = target.getClass().getDeclaredMethod("deleteInitVo", parameterTypes);
        }
        catch (Exception e) {
            ExceptionUtils.wrappException((Exception)e);
        }
        return method;
    }

    public void deleteInitVo(BaseAggVO aggvo, IArapBillBaseService service) throws BusinessException {
        service.delete(new BaseAggVO[]{aggvo});
    }

    private Method getMethod(Object target) {
        Class[] parameterTypes = new Class[]{BaseAggVO.class, IBillConferService.class};
        Method method = null;
        try {
            method = target.getClass().getDeclaredMethod("deleteConfirmVo", parameterTypes);
        }
        catch (Exception e) {
            ExceptionUtils.wrappException((Exception)e);
        }
        return method;
    }

    public void deleteConfirmVo(BaseAggVO aggvo, IBillConferService service) throws BusinessException {
        service.deleteVOS(new BaseAggVO[]{aggvo});
    }
}


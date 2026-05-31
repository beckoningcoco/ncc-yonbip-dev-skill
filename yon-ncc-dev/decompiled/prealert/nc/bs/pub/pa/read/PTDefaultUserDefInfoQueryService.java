/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Logger
 *  nc.itf.bd.userdefitem.IUserdefitemQryService
 *  nc.vo.bd.userdefrule.UserdefitemVO
 *  nc.vo.pub.BusinessException
 */
package nc.bs.pub.pa.read;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.itf.bd.userdefitem.IUserdefitemQryService;
import nc.vo.bd.userdefrule.UserdefitemVO;
import nc.vo.pub.BusinessException;

public class PTDefaultUserDefInfoQueryService {
    public Map<String, UserdefitemVO> getUserDefInfoMap(String beanID, List<String> attrpaths) {
        String pk_group = InvocationInfoProxy.getInstance().getGroupId();
        try {
            return this.getQueryService().queryUserdefitemVOsByPropertyNames(beanID, attrpaths, pk_group);
        }
        catch (BusinessException e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
            return new HashMap<String, UserdefitemVO>();
        }
    }

    private IUserdefitemQryService getQueryService() {
        return (IUserdefitemQryService)NCLocator.getInstance().lookup(IUserdefitemQryService.class);
    }
}


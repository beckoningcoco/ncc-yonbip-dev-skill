/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.arap.agiotage.AgiotageVO
 *  nc.vo.pub.BusinessException
 *  nccloud.pubitf.arap.openapi.IPayableAgiotageOpenService
 */
package nccloud.pubimpl.arap.openapi;

import java.util.Map;
import nc.vo.arap.agiotage.AgiotageVO;
import nc.vo.pub.BusinessException;
import nccloud.pubitf.arap.openapi.IPayableAgiotageOpenService;

public class PayableAgiotageOpenServiceImpl
implements IPayableAgiotageOpenService {
    public Map<String, String> CalculateAgiotage(AgiotageVO vo) throws BusinessException {
        return null;
    }

    public Map<String, String> QueryAgiotageDetail(Map<String, String> conditionMap) throws BusinessException {
        return null;
    }

    public Map<String, String> QueryAgiotageSummary(Map<String, String> map) throws BusinessException {
        return null;
    }

    public void CancelAgiotage(String name) throws BusinessException {
    }
}


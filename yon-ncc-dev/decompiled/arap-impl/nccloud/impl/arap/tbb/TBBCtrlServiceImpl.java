/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.ms.tb.control.NtbParadimNccloudCache
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.tb.obj.NtbParamVO
 *  nccloud.commons.lang.ArrayUtils
 *  nccloud.itf.arap.tbb.ITBBCtrlService
 */
package nccloud.impl.arap.tbb;

import nc.ms.tb.control.NtbParadimNccloudCache;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.tb.obj.NtbParamVO;
import nccloud.bs.arap.tbb.TBBCtrlUtils;
import nccloud.commons.lang.ArrayUtils;
import nccloud.itf.arap.tbb.ITBBCtrlService;

public class TBBCtrlServiceImpl
implements ITBBCtrlService {
    public void budgetCheck(AggregatedValueObject[] bills, String eventType) throws BusinessException {
        this.budgetControl(bills, eventType, 2);
    }

    public void budgetUpdate(AggregatedValueObject[] bills, String eventType) throws BusinessException {
        this.budgetControl(bills, eventType, 3);
    }

    public void budgetCtrl(AggregatedValueObject[] bills, String eventType) throws BusinessException {
        this.budgetControl(bills, eventType, 1);
    }

    public NtbParamVO getNtbParamVos(String pk_ntbparadimvo) throws BusinessException {
        return NtbParadimNccloudCache.getNewInstance().getNtbParamVos(pk_ntbparadimvo);
    }

    private void budgetControl(AggregatedValueObject[] bills, String eventType, int isControl) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])bills)) {
            return;
        }
        TBBCtrlUtils util = new TBBCtrlUtils();
        util.budgetControl(bills, eventType, isControl);
    }
}


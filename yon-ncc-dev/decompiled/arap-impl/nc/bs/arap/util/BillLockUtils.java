/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.util.BDPKLockUtil
 *  nc.vo.util.BDVersionValidationUtil
 */
package nc.bs.arap.util;

import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.util.BDPKLockUtil;
import nc.vo.util.BDVersionValidationUtil;

public class BillLockUtils {
    public static void lockAndValidateAggVO(BaseAggVO aggVO) throws BusinessException {
        BillLockUtils.lockAndValidateAggVOs(new BaseAggVO[]{aggVO});
    }

    public static void lockAndValidateAggVOs(BaseAggVO[] aggVOs) throws BusinessException {
        BDPKLockUtil.lockAggVO((AggregatedValueObject[])aggVOs);
        BDVersionValidationUtil.validateObject((Object[])((Object[])aggVOs));
    }
}


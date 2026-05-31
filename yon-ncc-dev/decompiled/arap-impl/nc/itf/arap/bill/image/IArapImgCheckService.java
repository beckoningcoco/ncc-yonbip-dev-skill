/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.uif2.validation.ValidationFailure
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 */
package nc.itf.arap.bill.image;

import nc.bs.uif2.validation.ValidationFailure;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;

public interface IArapImgCheckService {
    public void checkPermissionBeforeScan(AggregatedValueObject var1, String var2) throws Exception;

    public ValidationFailure checkPermissionBeforeSave(AggregatedValueObject var1) throws BusinessException;
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package nc.bs.pub.taskcenter;

import nc.bs.pub.pa.PreAlertObject;
import nc.bs.pub.taskcenter.BgWorkingContext;
import nc.vo.pub.BusinessException;

public interface IBackgroundWorkPlugin {
    public PreAlertObject executeTask(BgWorkingContext var1) throws BusinessException;
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package nc.bs.pub.taskcenter;

import java.io.Serializable;
import nc.bs.pub.taskcenter.ReportLikeWorkInfo;
import nc.vo.pub.BusinessException;

public interface IReportLikeWork
extends Serializable {
    public static final String BACKGROUND_WORK_PLUGIN = "nc.bs.pub.taskcenter.ReportLikeBackgroundPlugin";

    public ReportLikeWorkInfo getReportLikeWorkInfo();

    public String doWork() throws BusinessException;
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package nccloud.pubitf.baseapp.prealertbase;

import nc.vo.pub.BusinessException;

public interface IBgTaskForRobotService {
    public String queryBgTaskByName(String var1) throws BusinessException;

    public String executeTask(String var1) throws BusinessException;
}


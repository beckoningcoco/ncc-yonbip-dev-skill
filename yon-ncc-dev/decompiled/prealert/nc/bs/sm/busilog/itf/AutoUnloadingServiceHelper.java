/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.sm.busilog.itf.IAutoUnloadingBackgroundServer
 *  nc.vo.pub.BusinessException
 */
package nc.bs.sm.busilog.itf;

import nc.bs.framework.common.NCLocator;
import nc.bs.sm.busilog.itf.IAutoUnloadingBackgroundServer;
import nc.vo.pub.BusinessException;
import nc.vo.pub.pa.AlertregistryVO;

public class AutoUnloadingServiceHelper {
    private static AutoUnloadingServiceHelper instance = new AutoUnloadingServiceHelper();
    IAutoUnloadingBackgroundServer serverImpl = (IAutoUnloadingBackgroundServer)NCLocator.getInstance().lookup(IAutoUnloadingBackgroundServer.class);

    public static AutoUnloadingServiceHelper getInstance() {
        return instance;
    }

    private AutoUnloadingServiceHelper() {
    }

    public AlertregistryVO updateTaskByObjType(int objtype, String exectime, String trig_time, String pk_task) throws BusinessException {
        return this.serverImpl.updateTaskByObjType(objtype, exectime, trig_time, pk_task);
    }
}


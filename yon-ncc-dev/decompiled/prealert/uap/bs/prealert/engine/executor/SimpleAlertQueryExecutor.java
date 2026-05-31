/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.vo.pub.BusinessException
 */
package uap.bs.prealert.engine.executor;

import java.util.Map;
import nc.bs.framework.common.NCLocator;
import nc.bs.pub.pa.IAlertSelfRcvConstruct;
import nc.bs.pub.pa.PreAlertObject;
import nc.itf.uap.pa.IPreAlertNCService;
import nc.vo.pub.BusinessException;
import uap.bs.prealert.engine.executor.AlertsfrcvConvertUtil;
import uap.itf.prealert.engine.Executor;
import uap.vo.prealert.engine.EngineContext;

public class SimpleAlertQueryExecutor
implements Executor,
IAlertSelfRcvConstruct {
    @Override
    public PreAlertObject execute(EngineContext context) throws BusinessException {
        IPreAlertNCService srv = (IPreAlertNCService)NCLocator.getInstance().lookup(IPreAlertNCService.class);
        PreAlertObject retObj = srv.executeSimpleAlertQuery(context.getAlertRegistry(), context.getExecutorContext());
        AlertsfrcvConvertUtil.translateSelfrcv(context, retObj);
        return retObj;
    }

    @Override
    public Map<String, String> getAllCodesAndNames(String pk_alerttype) throws BusinessException {
        return AlertsfrcvConvertUtil.getAllSefCodesAndNames(pk_alerttype);
    }
}


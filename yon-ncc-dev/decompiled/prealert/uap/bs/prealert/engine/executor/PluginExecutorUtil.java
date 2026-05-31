/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.framework.core.util.ObjectCreator
 *  nc.bs.logging.Logger
 *  nc.vo.pub.BusinessException
 */
package uap.bs.prealert.engine.executor;

import nc.bs.framework.common.NCLocator;
import nc.bs.framework.core.util.ObjectCreator;
import nc.bs.logging.Logger;
import nc.itf.uap.pa.IPreAlertConfigQueryService;
import nc.vo.pub.BusinessException;
import nc.vo.pub.pa.AlerttypeVO;
import nc.vo.pub.pa.customquery.AlertQueryTypeEnum;
import nc.vo.pub.pa.customquery.IAlertQueryDef;
import uap.bs.prealert.engine.executor.ComplexAlertQueryExecutor;
import uap.bs.prealert.engine.executor.SimpleAlertQueryExecutor;

public class PluginExecutorUtil {
    public static Object instantiatePlugin(AlerttypeVO type) throws BusinessException {
        String pluginName = type.getBusi_plugin().trim();
        String moduleName = type.getBelong_system();
        Object newObject = null;
        Logger.error((Object)("pluginName=============================" + pluginName));
        Logger.error((Object)("moduleName=============================" + moduleName));
        if (moduleName != null) {
            moduleName = moduleName.trim();
            try {
                newObject = ObjectCreator.newInstance((String)moduleName.toLowerCase(), (String)pluginName);
                Logger.error((Object)("newObject1=============================" + newObject));
            }
            catch (Exception e) {
                Logger.error((Object)("Attempts to instantiate plugin [" + pluginName + "] with moduleName[" + moduleName + "] failed!"), (Throwable)e);
            }
            if (newObject == null) {
                IPreAlertConfigQueryService service = (IPreAlertConfigQueryService)NCLocator.getInstance().lookup(IPreAlertConfigQueryService.class.getName());
                String devModule = service.getDevModuleName(moduleName.toLowerCase());
                try {
                    newObject = ObjectCreator.newInstance((String)devModule.toLowerCase(), (String)pluginName);
                    Logger.error((Object)("newObject2=============================" + newObject));
                }
                catch (Exception e) {
                    Logger.error((Object)("Attempts to instantiate plugin [" + pluginName + "] with devModule[" + devModule + "] failed!"), (Throwable)e);
                }
            }
        }
        if (newObject == null) {
            try {
                if (pluginName.equals("N/A")) {
                    IAlertQueryDef query = type.getAlertQueryDefVO();
                    AlertQueryTypeEnum queryType = query.getQuery_typeEnum();
                    if (AlertQueryTypeEnum.Simple.equals((Object)queryType)) {
                        newObject = new SimpleAlertQueryExecutor();
                        Logger.error((Object)("newObject3=============================" + newObject));
                    } else if (AlertQueryTypeEnum.Complex.equals((Object)queryType)) {
                        newObject = new ComplexAlertQueryExecutor();
                        Logger.error((Object)("newObject4=============================" + newObject));
                    }
                } else {
                    newObject = ObjectCreator.newInstance((String)pluginName);
                    Logger.error((Object)("newObject5=============================" + newObject));
                }
            }
            catch (Exception e) {
                Logger.error((Object)e.getMessage(), (Throwable)e);
            }
        }
        if (newObject == null) {
            throw new BusinessException("cannot instiate plugin: " + pluginName + " of module: " + moduleName);
        }
        return newObject;
    }
}


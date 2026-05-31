/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  javax.ws.rs.Consumes
 *  javax.ws.rs.POST
 *  javax.ws.rs.Path
 *  javax.ws.rs.Produces
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Logger
 *  nc.vo.pub.BusinessException
 *  nccloud.api.rest.utils.NCCRestUtils
 *  nccloud.api.rest.utils.ResultMessageUtil
 *  nccloud.ws.rest.resource.AbstractNCCRestResource
 *  org.json.JSONString
 */
package nccloud.api.baseapp.prealertmanage.pa;

import com.google.gson.JsonObject;
import java.util.HashMap;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.itf.uap.pa.IPreAlertConfigQueryService;
import nc.itf.uap.pa.IPreAlertExecutorService;
import nc.vo.pub.BusinessException;
import nc.vo.pub.pa.AlertregistryVO;
import nccloud.api.rest.utils.NCCRestUtils;
import nccloud.api.rest.utils.ResultMessageUtil;
import nccloud.ws.rest.resource.AbstractNCCRestResource;
import org.json.JSONString;

@Path(value="baseapp/prealertmanage/engine")
public class PreAlertManage
extends AbstractNCCRestResource {
    @POST
    @Path(value="execute")
    @Consumes(value={"application/json"})
    @Produces(value={"application/json"})
    public JSONString executeTask(JsonObject jobData) {
        if (jobData == null) {
            return ResultMessageUtil.exceptionToJSON((BusinessException)new BusinessException("JSONString  null!!!!!!!!!"));
        }
        String taskid = jobData.get("taskId").getAsString();
        String tenant = jobData.get("tenant").getAsString();
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("userCode", InvocationInfoProxy.getInstance().getUserCode());
        userMap.put("pkGroup", InvocationInfoProxy.getInstance().getGroupId());
        byte[] token = null;
        try {
            Logger.init((String)"prealert");
            String sWhere = " pk_alertregistry = '" + taskid + "'";
            AlertregistryVO[] registrys = ((IPreAlertConfigQueryService)NCLocator.getInstance().lookup(IPreAlertConfigQueryService.class)).queryRegistriesByClause(sWhere, tenant);
            if (registrys == null || registrys.length <= 0) {
                return null;
            }
            AlertregistryVO registry = registrys[0];
            registry.setDataSource(tenant);
            IPreAlertExecutorService executorService = (IPreAlertExecutorService)NCLocator.getInstance().lookup(IPreAlertExecutorService.class);
            executorService.execute(registry, token, userMap);
        }
        catch (BusinessException e) {
            Logger.error((Object)((Object)e));
            return ResultMessageUtil.exceptionToJSON((BusinessException)e);
        }
        return NCCRestUtils.toJSONString((Object)"true");
    }

    public String getModule() {
        return "baseapp";
    }
}


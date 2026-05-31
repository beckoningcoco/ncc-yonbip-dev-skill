/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.busilog.vo.BusinessLogContext
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFBoolean
 */
package nc.vo.pub.pa.busilog;

import nc.bs.busilog.vo.BusinessLogContext;
import nc.bs.pub.taskcenter.AlertRuntimeInfo;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.pa.AlertregistryVO;
import nc.vo.pub.pa.busilog.AbstractPABusiLogEntity;

public class AlertRuntimeBusiLogEntity
extends AbstractPABusiLogEntity {
    private AlertRuntimeInfo runtimeInfo = null;
    private String operation = null;

    public AlertRuntimeBusiLogEntity(AlertRuntimeInfo runtimeInfo, String operation) {
        this.runtimeInfo = runtimeInfo;
        this.operation = operation;
    }

    @Override
    public BusinessLogContext fillBusiInfo(BusinessLogContext context) {
        context.setPk_busiobj(this.runtimeInfo.getPrimaryKey());
        context.setBusiobjcode(this.runtimeInfo.getPrimaryKey());
        context.setBusiobjname(this.runtimeInfo.getTaskid());
        context.setTypepk_busiobj("96bc0c76-21bb-462c-b7b0-45e8718fd7f0");
        context.setBusiobjvo((Object)this.runtimeInfo);
        context.setPk_operation(this.operation);
        return context;
    }

    @Override
    public String buildLogmsg() throws BusinessException {
        StringBuffer sb = new StringBuffer();
        AlertregistryVO registry = AlertRuntimeBusiLogEntity.queryRegistryByPk(this.runtimeInfo.getRegistryid());
        sb.append(AlertRuntimeBusiLogEntity.getCategoryString(registry.getRegistrytype()));
        sb.append(", ");
        sb.append(AlertRuntimeBusiLogEntity.getAlertTypeNameString(registry.getPk_alerttype()));
        sb.append(", ");
        sb.append(AlertRuntimeBusiLogEntity.getRegistryNameString(registry));
        sb.append(", ");
        String key = NCLangRes4VoTransl.getNCLangRes().getStrByID("prealertres", "AlertRuntimeBusiLogEntity-000000");
        String value = null;
        value = UFBoolean.TRUE.equals((Object)this.runtimeInfo.getActive()) ? NCLangRes4VoTransl.getNCLangRes().getStrByID("prealertres", "AlertRuntimeBusiLogEntity-000001") : NCLangRes4VoTransl.getNCLangRes().getStrByID("prealertres", "TaskAdminUI-000000");
        sb.append(AlertRuntimeBusiLogEntity.getFormattedString(key, value));
        sb.append(", ");
        key = NCLangRes4VoTransl.getNCLangRes().getStrByID("prealertres", "AlertRuntimeBusiLogEntity-000002");
        value = this.runtimeInfo.getServername() + "/" + this.runtimeInfo.getServeraddress();
        sb.append(AlertRuntimeBusiLogEntity.getFormattedString(key, value));
        return sb.toString();
    }
}


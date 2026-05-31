/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.busilog.vo.BusinessLogContext
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 */
package nc.vo.pub.pa.busilog;

import nc.bs.busilog.vo.BusinessLogContext;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.pa.AlertmessageVO;
import nc.vo.pub.pa.AlertregistryVO;
import nc.vo.pub.pa.busilog.AbstractPABusiLogEntity;

public class AlertMessageBusiLogEntity
extends AbstractPABusiLogEntity {
    private AlertmessageVO messagevo = null;
    private String operation = null;

    public AlertMessageBusiLogEntity(AlertmessageVO messagevo, String operation) {
        this.messagevo = messagevo;
        this.operation = operation;
    }

    @Override
    public BusinessLogContext fillBusiInfo(BusinessLogContext context) {
        context.setPk_busiobj(this.messagevo.getPrimaryKey());
        context.setBusiobjcode(this.messagevo.getPrimaryKey());
        context.setBusiobjname(this.messagevo.getAlertname());
        context.setTypepk_busiobj("001a3ef6-02bb-409d-963e-33cf01e31775");
        context.setBusiobjvo((Object)this.messagevo);
        context.setPk_operation(this.operation);
        return context;
    }

    @Override
    public String buildLogmsg() throws BusinessException {
        StringBuffer sb = new StringBuffer();
        AlertregistryVO registry = AlertMessageBusiLogEntity.queryRegistryByPk(this.messagevo.getPk_alertregistry());
        sb.append(AlertMessageBusiLogEntity.getCategoryString(registry.getRegistrytype()));
        sb.append(", ");
        sb.append(AlertMessageBusiLogEntity.getAlertTypeNameString(registry.getPk_alerttype()));
        sb.append(", ");
        sb.append(AlertMessageBusiLogEntity.getRegistryNameString(registry));
        sb.append(", ");
        String key = NCLangRes4VoTransl.getNCLangRes().getStrByID("prealertres", "AlertMessageBusiLogEntity-000000");
        String value = this.messagevo.getSenddate();
        sb.append(AlertMessageBusiLogEntity.getFormattedString(key, value));
        sb.append(", ");
        key = NCLangRes4VoTransl.getNCLangRes().getStrByID("prealertres", "AlertMessageBusiLogEntity-000001");
        value = this.messagevo.getReceivername();
        sb.append(AlertMessageBusiLogEntity.getFormattedString(key, value));
        return sb.toString();
    }
}


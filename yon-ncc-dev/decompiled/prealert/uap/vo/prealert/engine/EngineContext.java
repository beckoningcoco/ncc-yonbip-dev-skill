/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDateTime
 *  nc.vo.pub.lang.UFTime
 */
package uap.vo.prealert.engine;

import java.io.Serializable;
import java.util.UUID;
import nc.bs.pub.pa.PaUtils;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFTime;
import nc.vo.pub.pa.AlertregistryVO;
import nc.vo.pub.pa.AlerttypeVO;
import nc.vo.pub.pa.CurrEnvVO;
import uap.vo.prealert.engine.TriggerMethod;
import uap.vo.prealert.engine.receiver.ReceiverContext;
import uap.vo.prealert.engine.receiver.ReceiverContextFactory;

public class EngineContext
implements Serializable {
    private static final long serialVersionUID = 7319156591606324763L;
    private String executionId;
    private TriggerMethod triggerMethod;
    private ReceiverContext receiverContext;
    private CurrEnvVO executorContext;
    private AlertregistryVO registry;
    private String alertFileName;
    private UFDateTime messageTs;
    private String[] generatedAttachments;

    public EngineContext(AlertregistryVO registry) {
        this.registry = registry;
    }

    public AlertregistryVO getAlertRegistry() {
        return this.registry;
    }

    public AlerttypeVO getAlertType() {
        return this.registry.getAlertTypeVo();
    }

    public CurrEnvVO getExecutorContext() {
        return this.executorContext;
    }

    public void setExecutorContext(CurrEnvVO executorContext) {
        this.executorContext = executorContext;
        if (executorContext != null) {
            executorContext.setEngineContext(this);
        }
    }

    public String[] getGeneratedAttachmentID() {
        return this.generatedAttachments;
    }

    public void setGeneratedAttacchmentID(String[] ids) {
        this.generatedAttachments = ids;
    }

    public TriggerMethod getTriggerMethod() {
        return this.triggerMethod;
    }

    public void setTriggerMethod(TriggerMethod triggerMethod) {
        this.triggerMethod = triggerMethod;
    }

    public String getExecutionId() {
        if (this.executionId == null) {
            this.executionId = UUID.randomUUID().toString();
        }
        return this.executionId;
    }

    public ReceiverContext getReceiverContext() {
        if (this.receiverContext == null) {
            try {
                this.receiverContext = ReceiverContextFactory.getReceiverContext(this.getAlertRegistry().getSendConfigVo());
            }
            catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return this.receiverContext;
    }

    public void setReceiverContext(ReceiverContext receiverContext) {
        this.receiverContext = receiverContext;
    }

    public UFDateTime getMessageTs() {
        if (this.messageTs == null) {
            this.messageTs = new UFDateTime();
        }
        return this.messageTs;
    }

    public String getAlertFileName() {
        if (this.alertFileName == null) {
            String basefileName = this.getAlertRegistry().getFilename();
            if (StringUtil.isEmptyWithTrim((String)basefileName)) {
                basefileName = String.valueOf(this.getAlertRegistry().getMultiLangAlertname()).trim();
            }
            this.alertFileName = PaUtils.bandFileName(basefileName, new UFDate(this.getMessageTs().getMillis()), new UFTime(this.getMessageTs().getMillis()));
            if (!this.alertFileName.endsWith("html")) {
                this.alertFileName = this.alertFileName + ".html";
            }
        }
        return this.alertFileName;
    }

    public void setLogString(String log) {
        this.getExecutorContext().setLogStr(log);
    }

    public void appendLogString(String log) {
        String origin = this.getLogString();
        if (origin == null) {
            this.setLogString(log);
        } else {
            this.setLogString(origin + log);
        }
    }

    public String getLogString() {
        return this.getExecutorContext().getLogString();
    }
}


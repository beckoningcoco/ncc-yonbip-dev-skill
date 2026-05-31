/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.busilog.vo.BusinessLogContext
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.logging.Logger
 *  nc.itf.uap.ml.DataMultiLangAccessor
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.ml.LanguageVO
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 */
package nc.vo.pub.pa.busilog;

import nc.bs.busilog.vo.BusinessLogContext;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.logging.Logger;
import nc.bs.pub.pa.AlertMethod;
import nc.itf.uap.ml.DataMultiLangAccessor;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.ml.LanguageVO;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.pa.AlertregistryVO;
import nc.vo.pub.pa.AlerttypeconfigVO;
import nc.vo.pub.pa.busilog.AbstractPABusiLogEntity;
import nc.vo.pub.pa.busilog.IPABusiLogConst;
import nc.vo.pub.pa.customquery.DatetimeConfigVO;
import uap.vo.prealert.util.PreAlertUtil;

public abstract class RegistryBusiLogEntity
extends AbstractPABusiLogEntity
implements IPABusiLogConst {
    private AlertregistryVO registry;
    private String operation;

    public RegistryBusiLogEntity(AlertregistryVO registry, String operation) {
        this.registry = registry;
        this.operation = operation;
    }

    @Override
    public BusinessLogContext fillBusiInfo(BusinessLogContext context) {
        context.setPk_busiobj(this.registry.getPrimaryKey());
        context.setBusiobjcode(this.registry.getPrimaryKey());
        context.setBusiobjname(this.registry.getAlertname());
        context.setTypepk_busiobj("1f799165-aeea-413e-a3b5-42cd1194a12f");
        context.setBusiobjvo((Object)this.registry);
        context.setPk_operation(this.operation);
        return context;
    }

    protected AlertregistryVO getRegistry() {
        return this.registry;
    }

    protected String getOperation() {
        return this.operation;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected String extractKeyInformation(AlertregistryVO registry) throws BusinessException {
        LanguageVO langvo = DataMultiLangAccessor.getInstance().getDefaultLang();
        String defaultLangcode = langvo.getLangcode();
        String originLangcode = InvocationInfoProxy.getInstance().getLangCode();
        try {
            InvocationInfoProxy.getInstance().setLangCode(defaultLangcode);
            StringBuffer sb = new StringBuffer();
            String str = null;
            sb.append(RegistryBusiLogEntity.getCategoryString(this.getRegistry().getRegistrytype()));
            sb.append(", ");
            sb.append(RegistryBusiLogEntity.getAlertTypeNameString(this.getRegistry().getPk_alerttype()));
            sb.append(", ");
            sb.append(RegistryBusiLogEntity.getRegistryNameString(this.getRegistry()));
            sb.append(", ");
            str = NCLangRes4VoTransl.getNCLangRes().getStrByID("prealertres", "RegistryAddEntity-000006", null, new String[]{this.getRegistry().getPk_org()});
            sb.append(str);
            sb.append(", ");
            AlerttypeconfigVO[] configs = this.getRegistry().getTypeConfigVo();
            if (PreAlertUtil.isNotEmpty(configs)) {
                str = NCLangRes4VoTransl.getNCLangRes().getStrByID("prealertres", "FilterSelectionPanel-000003");
                sb.append(str);
                sb.append(": ");
                for (AlerttypeconfigVO config : configs) {
                    String value = this.getAlerttypeConfigValue(config);
                    if (value == null) continue;
                    sb.append("[");
                    sb.append(config.getFieldname());
                    sb.append("=");
                    sb.append(value);
                    sb.append("]");
                }
                sb.append(", ");
            }
            str = this.getRegistry().getIstiming().booleanValue() ? NCLangRes4VoTransl.getNCLangRes().getStrByID("prealertres", "RegistryAddEntity-000007") : NCLangRes4VoTransl.getNCLangRes().getStrByID("prealertres", "RegistryAddEntity-000008");
            str = NCLangRes4VoTransl.getNCLangRes().getStrByID("prealertres", "RegistryAddEntity-000009", null, new String[]{str});
            sb.append(str);
            sb.append(", ");
            AlertMethod method = this.getRegistry().getAlertMethod();
            if (method != null) {
                str = NCLangRes4VoTransl.getNCLangRes().getStrByID("prealertres", "RegistryAddEntity-000011", null, new String[]{method.toString()});
                sb.append(str);
                sb.append(", ");
            }
            String string = sb.toString();
            return string;
        }
        finally {
            InvocationInfoProxy.getInstance().setLangCode(originLangcode);
        }
    }

    private String getAlerttypeConfigValue(AlerttypeconfigVO config) {
        String configValue = null;
        String type = config.getVartype();
        if ("Datetime".equals(type)) {
            String value = config.getValue();
            try {
                DatetimeConfigVO dtc = DatetimeConfigVO.fromXML(value);
                configValue = dtc.toString();
            }
            catch (Exception e) {
                Logger.error((Object)e);
            }
        } else {
            configValue = StringUtil.isEmptyWithTrim((String)config.getRefervalue()) ? config.getValue() : config.getRefervalue();
        }
        return configValue;
    }
}


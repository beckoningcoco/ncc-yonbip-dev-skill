/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.itf.uap.ml.DataMultiLangAccessor
 *  nc.vo.ml.LanguageVO
 *  nc.vo.pub.BusinessException
 */
package nc.vo.pub.pa.busilog;

import nc.bs.framework.common.InvocationInfoProxy;
import nc.itf.uap.ml.DataMultiLangAccessor;
import nc.vo.ml.LanguageVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.pa.AlertregistryVO;
import nc.vo.pub.pa.busilog.RegistryBusiLogEntity;

public class RegistryDeleteEntity
extends RegistryBusiLogEntity {
    public RegistryDeleteEntity(AlertregistryVO registry) {
        super(registry, "8ec782d7-e041-49f6-9385-cedfecbc6523");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public String buildLogmsg() throws BusinessException {
        LanguageVO langvo = DataMultiLangAccessor.getInstance().getDefaultLang();
        String defaultLangcode = langvo.getLangcode();
        String originLangcode = InvocationInfoProxy.getInstance().getLangCode();
        try {
            InvocationInfoProxy.getInstance().setLangCode(defaultLangcode);
            String string = super.extractKeyInformation(this.getRegistry());
            return string;
        }
        finally {
            InvocationInfoProxy.getInstance().setLangCode(originLangcode);
        }
    }
}


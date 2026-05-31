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

public class RegistryDeactivateEntity
extends RegistryBusiLogEntity {
    public RegistryDeactivateEntity(AlertregistryVO registry) {
        super(registry, "fb9ccd08-1e1b-4d6f-a8a8-67059d432309");
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


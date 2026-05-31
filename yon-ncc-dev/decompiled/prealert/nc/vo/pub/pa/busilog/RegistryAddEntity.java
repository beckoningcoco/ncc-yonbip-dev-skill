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

public class RegistryAddEntity
extends RegistryBusiLogEntity {
    public RegistryAddEntity(AlertregistryVO registry) {
        super(registry, "8b8b3e80-3214-4034-9c8d-69288624dd11");
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
            StringBuffer sb = new StringBuffer();
            sb.append(this.extractKeyInformation(this.getRegistry()));
            String string = sb.toString();
            return string;
        }
        finally {
            InvocationInfoProxy.getInstance().setLangCode(originLangcode);
        }
    }
}


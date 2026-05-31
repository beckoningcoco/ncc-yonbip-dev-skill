/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.ui.bd.ref.AbstractRefModel
 *  nc.ui.bd.ref.model.PsndocDefaultNCRefModel
 *  nc.vo.platform.appsystemplate.FormPropertyVO
 *  nccloud.bs.excel.ITranslateContext
 *  nccloud.bs.excel.bdtranslate.AbstractRefTranslator
 */
package nccloud.pubimpl.arap.arappub;

import nc.ui.bd.ref.AbstractRefModel;
import nc.ui.bd.ref.model.PsndocDefaultNCRefModel;
import nc.vo.platform.appsystemplate.FormPropertyVO;
import nccloud.bs.excel.ITranslateContext;
import nccloud.bs.excel.bdtranslate.AbstractRefTranslator;

public class PsndocAllTranslator
extends AbstractRefTranslator {
    protected void processRefModel(AbstractRefModel refmodel, ITranslateContext translateContext) {
        FormPropertyVO property = translateContext.getProperty();
        String code = property.getCode();
        if ("pk_psndoc".equalsIgnoreCase(code) && refmodel instanceof PsndocDefaultNCRefModel) {
            PsndocDefaultNCRefModel psndocrefmode = (PsndocDefaultNCRefModel)refmodel;
            psndocrefmode.setSetMultiCorpRef(false);
        }
    }
}


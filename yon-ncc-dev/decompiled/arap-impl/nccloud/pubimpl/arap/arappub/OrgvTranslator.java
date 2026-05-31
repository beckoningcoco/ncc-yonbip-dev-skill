/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.bill.ArapBillDAO
 *  nc.bs.dao.DAOException
 *  nc.bs.logging.Logger
 *  nc.ui.bd.ref.AbstractRefModel
 *  nc.vo.pfxx.exception.PfxxException
 *  nc.vo.platform.appsystemplate.FormPropertyVO
 *  nccloud.bs.excel.ITranslateContext
 *  nccloud.bs.excel.bdtranslate.AbstractFilterRefTranslator
 *  nccloud.vo.excel.util.PropertyConvertorUtils
 *  nccloud.vo.excel.util.RefCreatorUtils
 */
package nccloud.pubimpl.arap.arappub;

import java.util.Map;
import nc.bs.arap.bill.ArapBillDAO;
import nc.bs.dao.DAOException;
import nc.bs.logging.Logger;
import nc.ui.bd.ref.AbstractRefModel;
import nc.vo.pfxx.exception.PfxxException;
import nc.vo.platform.appsystemplate.FormPropertyVO;
import nccloud.bs.excel.ITranslateContext;
import nccloud.bs.excel.bdtranslate.AbstractFilterRefTranslator;
import nccloud.vo.excel.util.PropertyConvertorUtils;
import nccloud.vo.excel.util.RefCreatorUtils;

public class OrgvTranslator
extends AbstractFilterRefTranslator {
    private String pk = null;

    protected void processFilterRefModel(AbstractRefModel refmodel, ITranslateContext translateContext, String srcValue) throws PfxxException {
        FormPropertyVO property = translateContext.getProperty();
        if (srcValue != null && PropertyConvertorUtils.isRefItem((FormPropertyVO)property) && "pk_org".equals(property.getCode())) {
            block6: {
                ArapBillDAO dao = new ArapBillDAO();
                try {
                    Map information = dao.getOrgInformation(property.getCode(), srcValue, srcValue);
                    if (information == null || information.size() <= 0) break block6;
                    if (information.get(srcValue) == null) {
                        for (Map.Entry parm : information.entrySet()) {
                            Map map = (Map)parm.getValue();
                            if (map == null) continue;
                            srcValue = (String)map.get(srcValue);
                            break block6;
                        }
                        break block6;
                    }
                    Map map = (Map)information.get(srcValue);
                    for (Map.Entry parm : map.entrySet()) {
                        String newsrcValue = (String)parm.getValue();
                        if (newsrcValue == null) continue;
                        srcValue = newsrcValue;
                        break;
                    }
                }
                catch (DAOException e) {
                    Logger.error((Object)(" Find Org Messae Error :" + e.getMessage()));
                    throw new PfxxException(e.getMessage());
                }
            }
            this.pk = srcValue;
        }
    }

    protected void processRefModel(AbstractRefModel refmodel, ITranslateContext translateContext) {
    }

    public String translateExToNC(String srcValue, String metaDataID, ITranslateContext translateContext) throws PfxxException {
        FormPropertyVO property = translateContext.getProperty();
        AbstractRefModel refmodel = RefCreatorUtils.createRefModel((FormPropertyVO)property);
        metaDataID = property.getMetaid();
        this.processFilterRefModel(refmodel, translateContext, srcValue);
        return this.pk == null ? null : this.pk;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.pfxx.ITranslateContext
 *  nc.bs.pfxx.ITranslatorStrategy
 *  nc.pubitf.bd.accessor.GeneralAccessorFactory
 *  nc.pubitf.bd.accessor.IGeneralAccessor
 *  nc.vo.bd.accessor.IBDData
 *  nc.vo.pfxx.exception.PfxxException
 *  nccloud.commons.lang.StringUtils
 *  org.apache.commons.collections4.CollectionUtils
 */
package nc.bs.arap.pfxx;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import nc.bs.pfxx.ITranslateContext;
import nc.bs.pfxx.ITranslatorStrategy;
import nc.pubitf.bd.accessor.GeneralAccessorFactory;
import nc.pubitf.bd.accessor.IGeneralAccessor;
import nc.vo.arap.utils.OrgConsignationUtils;
import nc.vo.bd.accessor.IBDData;
import nc.vo.pfxx.exception.PfxxException;
import nccloud.commons.lang.StringUtils;
import org.apache.commons.collections4.CollectionUtils;

public class DeptTranslator
implements ITranslatorStrategy {
    public String getStrategyDescription() {
        return null;
    }

    public String translateExToNC(String srcValue, String metaDataID, ITranslateContext translateContext) throws PfxxException {
        if (translateContext.getTranslateRule() == 1) {
            return srcValue;
        }
        IGeneralAccessor accessor = GeneralAccessorFactory.getAccessor((String)metaDataID);
        IBDData doc = null;
        if (translateContext.getTranslateRule() == 2) {
            doc = accessor.getDocByCode(this.getPk_org(translateContext), srcValue);
            if (doc == null) {
                doc = this.getDocByCodeAndOtherOrg(accessor, this.getPk_org(translateContext), srcValue);
            }
        } else if (translateContext.getTranslateRule() == 3 && (doc = accessor.getDocByNameWithMainLang(this.getPk_org(translateContext), srcValue)) == null) {
            doc = this.getDocByNameAndOtherOrg(accessor, this.getPk_org(translateContext), srcValue);
        }
        if (doc != null) {
            return doc.getPk();
        }
        return null;
    }

    public String translateNCToEx(String docPk, String metaDataID, ITranslateContext translateContext) throws PfxxException {
        if (translateContext.getTranslateRule() == 1) {
            return docPk;
        }
        IGeneralAccessor accessor = GeneralAccessorFactory.getAccessor((String)metaDataID);
        IBDData doc = accessor.getDocByPk(docPk);
        if (doc != null) {
            if (translateContext.getTranslateRule() == 2) {
                return doc.getCode();
            }
            if (translateContext.getTranslateRule() == 3) {
                return doc.getName().getText();
            }
        }
        return null;
    }

    private String getPk_org(ITranslateContext paramITranslateContext) {
        String pk_org;
        List params = paramITranslateContext.getTranslatorParams();
        if (CollectionUtils.isEmpty((Collection)params)) {
            return null;
        }
        String string = pk_org = params.get(0) != null ? params.get(0).toString() : null;
        if (StringUtils.isEmpty((CharSequence)pk_org)) {
            pk_org = paramITranslateContext.getOrgPk();
        }
        return pk_org;
    }

    private IBDData getDocByCodeAndOtherOrg(IGeneralAccessor accessor, String pk_org, String srcValue) {
        Set<String> orgSet;
        try {
            orgSet = OrgConsignationUtils.getOrgConsignationList(pk_org);
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
        for (String org : orgSet) {
            IBDData ibdData = accessor.getDocByCode(org, srcValue);
            if (ibdData == null) continue;
            return ibdData;
        }
        return null;
    }

    private IBDData getDocByNameAndOtherOrg(IGeneralAccessor accessor, String pk_org, String srcValue) {
        Set<String> orgSet;
        try {
            orgSet = OrgConsignationUtils.getOrgConsignationList(pk_org);
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
        for (String org : orgSet) {
            IBDData ibdData = accessor.getDocByNameWithMainLang(org, srcValue);
            if (ibdData == null) continue;
            return ibdData;
        }
        return null;
    }
}


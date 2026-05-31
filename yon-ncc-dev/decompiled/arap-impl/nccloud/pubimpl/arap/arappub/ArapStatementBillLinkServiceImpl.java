/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.platform.workbench.AppPageVO
 *  nc.vo.pub.BusinessException
 *  nccloud.pubitf.arap.arappub.IArapStatementBillLinkService
 *  nccloud.putitf.riart.billtype.IDefaultQueryRelatedAppInfoService
 */
package nccloud.pubimpl.arap.arappub;

import java.util.HashMap;
import java.util.Map;
import nc.bs.framework.common.NCLocator;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.platform.workbench.AppPageVO;
import nc.vo.pub.BusinessException;
import nccloud.pubitf.arap.arappub.IArapStatementBillLinkService;
import nccloud.putitf.riart.billtype.IDefaultQueryRelatedAppInfoService;

public class ArapStatementBillLinkServiceImpl
implements IArapStatementBillLinkService {
    public Map<String, String> getLinkMessage(String billType, String billID) throws BusinessException {
        Map resultMap = null;
        try {
            IDefaultQueryRelatedAppInfoService service = (IDefaultQueryRelatedAppInfoService)NCLocator.getInstance().lookup(IDefaultQueryRelatedAppInfoService.class);
            resultMap = service.queryLinkAppInfo(billType, billID);
        }
        catch (BusinessException e) {
            throw new BusinessException(e.getMessage());
        }
        HashMap<String, String> result = new HashMap<String, String>();
        if (resultMap != null && resultMap.get("appcode") == null) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0871"));
        }
        String moduleNode = resultMap.get("appcode").toString();
        if (moduleNode == null) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0872"));
        }
        result.put("appcode", resultMap.get("appcode").toString());
        result.put("pagecode", ((AppPageVO)resultMap.get("appPageVO")).getPagecode());
        result.put("url", ((AppPageVO)resultMap.get("appPageVO")).getPageurl());
        result.put("id", billID);
        return result;
    }
}


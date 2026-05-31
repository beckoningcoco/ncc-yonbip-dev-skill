/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.service.templatedownload;

import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyoucloud.iuap.upc.api.service.IUPCTemplateDownloadService;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UPCTemplateDownloadServiceImpl
implements IUPCTemplateDownloadService {
    @Autowired
    private YMSParamConfig ymsParamConfig;

    @Override
    public Map<String, Object> getProductTemplateDownload(String downloadName, String host) throws Exception {
        HashMap<String, Object> result = new HashMap<String, Object>();
        String defaultLangLocaleCode = InvocationInfoProxy.getLocale();
        String url = "";
        switch (downloadName) {
            case "btnExport": {
                if (BooleanUtil.isTrue((Object)this.ymsParamConfig.getIsPremises())) {
                    url = "iuap-apdoc-material/productEX_CN.zip";
                    break;
                }
                if ("zh_CN".equals(defaultLangLocaleCode)) {
                    url = this.ymsParamConfig.getUrlTemplateDownLoad() + "/templates/productEX_CN.zip";
                }
                if ("en_US".equals(defaultLangLocaleCode)) {
                    url = this.ymsParamConfig.getUrlTemplateDownLoad() + "/templates/productEX_EN.zip";
                }
                if (!"zh_TW".equals(defaultLangLocaleCode)) break;
                url = this.ymsParamConfig.getUrlTemplateDownLoad() + "/templates/productEX_TW.zip";
                break;
            }
            case "btnSKUTemplateExport": {
                if (BooleanUtil.isTrue((Object)this.ymsParamConfig.getIsPremises())) {
                    url = "iuap-apdoc-material/productsku_yb.xlsx";
                    break;
                }
                url = this.ymsParamConfig.getUrlTemplateDownLoad() + "/templates/productsku_yb.xlsx";
                break;
            }
            case "btnUpdateExport": {
                if (BooleanUtil.isTrue((Object)this.ymsParamConfig.getIsPremises())) {
                    url = "iuap-apdoc-material/productAlbum_YS.zip";
                    break;
                }
                url = this.ymsParamConfig.getUrlTemplateDownLoad() + "/templates/productAlbum_YS.zip";
                break;
            }
        }
        result.put("url", url);
        return result;
    }
}


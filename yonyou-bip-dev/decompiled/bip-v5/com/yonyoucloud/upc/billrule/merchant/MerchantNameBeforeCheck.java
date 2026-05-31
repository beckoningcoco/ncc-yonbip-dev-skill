/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.poi.importbiz.annotation.FlowOrderAnnotation
 *  com.yonyou.ucf.mdd.ext.poi.importbiz.pipeline.ForwardingPipeline
 *  com.yonyou.ucf.mdd.ext.poi.importbiz.pipeline.Pipeline
 *  com.yonyou.ucf.mdd.ext.poi.importbiz.pipeline.PreHandleCommand
 *  com.yonyou.ucf.mdd.ext.poi.importbiz.pipeline.PrePipelineContext
 *  com.yonyou.ucf.mdd.ext.util.OptionUtils
 *  org.springframework.lang.NonNull
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.merchant;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.poi.importbiz.annotation.FlowOrderAnnotation;
import com.yonyou.ucf.mdd.ext.poi.importbiz.pipeline.ForwardingPipeline;
import com.yonyou.ucf.mdd.ext.poi.importbiz.pipeline.Pipeline;
import com.yonyou.ucf.mdd.ext.poi.importbiz.pipeline.PreHandleCommand;
import com.yonyou.ucf.mdd.ext.poi.importbiz.pipeline.PrePipelineContext;
import com.yonyou.ucf.mdd.ext.util.OptionUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component(value="merchantNameBeforeCheck")
@FlowOrderAnnotation(order=550)
public class MerchantNameBeforeCheck
extends ForwardingPipeline<PrePipelineContext>
implements PreHandleCommand {
    public static final String SINGLE_DATA_BEFORE_CHECK_NAME = "merchantNameBeforeCheck";
    private String BRAND = "pc_brand";

    public void init(@NonNull String name, Pipeline next) {
        super.init(name, next);
    }

    public void process(PrePipelineContext ctx) throws Exception {
        block14: {
            block13: {
                if (!ctx.getImportContext().getBillno().equals("aa_merchant")) break block13;
                List merchantList = ctx.getGrandchildren();
                Object merchantNameCheckSwitch = OptionUtils.getSystemOption((Object)AppContext.getTenantId(), (String)"merchantNameCheckSwitch");
                if (merchantNameCheckSwitch == null) {
                    throw new CoreDocBusinessException("merchantNameCheckSwitch is null");
                }
                HashMap<String, String> map0 = new HashMap<String, String>();
                HashMap<String, String> map1 = new HashMap<String, String>();
                for (Map map : merchantList) {
                    String str = "";
                    if (map.get("code") == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800389);
                    }
                    String code = map.get("code").toString().trim();
                    if (map1.containsKey(code)) continue;
                    if (map.get("name") == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800390);
                    }
                    if ("0".equals(merchantNameCheckSwitch)) {
                        str = map.get("name").toString().trim();
                    } else if ("1".equals(merchantNameCheckSwitch)) {
                        str = map.get("createOrg_name") != null ? map.get("name").toString().trim() + "," + map.get("createOrg_name").toString().trim() : map.get("name").toString().trim();
                    }
                    if (map0.containsKey(str)) {
                        if ("0".equals(merchantNameCheckSwitch)) {
                            String str1 = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080A1B", (String)"\u5bfc\u5165\u4fe1\u606f\u4e2d\u6b64\u5ba2\u6237:[%s]\u540d\u79f0\u91cd\u590d,\u8bf7\u68c0\u67e5"), map.get("name"));
                            throw new CoreDocBusinessException(str1);
                        }
                        if ("1".equals(merchantNameCheckSwitch)) {
                            String str1 = null;
                            str1 = map.get("createOrg_name") != null ? String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080A1F", (String)"\u5bfc\u5165\u4fe1\u606f\u4e2d\u6b64\u5ba2\u6237:[%s]\u5728[%s]\u7ec4\u7ec7\u4e2d\u5ba2\u6237\u540d\u79f0\u91cd\u590d,\u8bf7\u68c0\u67e5"), map.get("name"), map.get("createOrg_name")) : String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080A1B", (String)"\u5bfc\u5165\u4fe1\u606f\u4e2d\u6b64\u5ba2\u6237:[%s]\u540d\u79f0\u91cd\u590d,\u8bf7\u68c0\u67e5"), map.get("name"));
                            throw new CoreDocBusinessException(str1);
                        }
                    } else {
                        map0.put(str, "0");
                    }
                    map1.put(code, "1");
                }
                break block14;
            }
            if (!this.BRAND.equals(ctx.getImportContext().getBillno())) break block14;
            List brand = ctx.getGrandchildren();
            HashMap<String, String> map0 = new HashMap<String, String>();
            for (Map map : brand) {
                String code = new String();
                if (map.get("code") == null) continue;
                code = map.get("code").toString().trim();
                if (map0.containsKey(code)) {
                    String str1 = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080A1C", (String)"\u5bfc\u5165\u4fe1\u606f\u4e2d:[%s]\u7f16\u7801\u91cd\u590d,\u8bf7\u68c0\u67e5"), map.get("code"));
                    throw new CoreDocBusinessException(str1);
                }
                map0.put(code, "pc_brand");
            }
        }
    }
}


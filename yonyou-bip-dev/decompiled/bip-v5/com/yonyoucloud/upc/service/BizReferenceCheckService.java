/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.util.IrisDynamicInvokeUtil
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.api.interfaces.rpc.IComQueryApi
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.util.OptionUtils
 *  com.yonyoucloud.upc.common.enums.DomainOpenEnum
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.yonyou.cloud.util.IrisDynamicInvokeUtil;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.api.interfaces.rpc.IComQueryApi;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.util.OptionUtils;
import com.yonyoucloud.iuap.upc.api.service.IBizReferenceCheckService;
import com.yonyoucloud.upc.common.enums.DomainOpenEnum;
import com.yonyoucloud.upc.service.utils.ProductUtil;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class BizReferenceCheckService
implements IBizReferenceCheckService {
    private static final Logger log = LoggerFactory.getLogger(BizReferenceCheckService.class);
    private static final String REF_CHECK = "pc.referencecheck.Referencecheck";

    @Override
    public Map<String, Object> checkReference(String fullName, List<Long> ids) {
        HashMap<String, Object> result = new HashMap<String, Object>(1);
        try {
            boolean isOpenUMall;
            QuerySchema schema = QuerySchema.create().addSelect("bizDomain,bizDomainName,bizName,sqlString").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"upcObject").eq((Object)fullName)}).addOrderBy("id desc");
            List query = MetaDaoHelper.query((String)REF_CHECK, (QuerySchema)schema);
            if (!CollectionUtils.isEmpty((Collection)query) && (isOpenUMall = ProductUtil.checkOpenOption("u8c-config", DomainOpenEnum.MALL.getServiceName()))) {
                for (Map map : query) {
                    Map<String, Object> params = BizReferenceCheckService.transferSelectSql(ids, (String)map.get("sqlString"));
                    IComQueryApi comQueryApi = (IComQueryApi)IrisDynamicInvokeUtil.getService((String)map.get("bizDomain").toString(), (String)"c87e2267-1001-4c70-bb2a-ab41f3b81aa3", null, IComQueryApi.class);
                    List selectList = comQueryApi.selectList("com.yonyou.ucf.mdd.ext.meta.dao.selectList", params);
                    if (selectList == null || selectList.size() <= 0 || (Long)((Map)selectList.get(0)).get("total") <= 0L) continue;
                    result.put("error", this.getResultMessage(map));
                    return result;
                }
            }
        }
        catch (Exception e) {
            log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408088D", (String)"\u5f15\u7528\u68c0\u67e5\u670d\u52a1\u62a5\u9519\uff1a{}") + e.getMessage(), (Throwable)e);
            result.put("error", e.getMessage());
            return result;
        }
        result.put("success", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408088A", (String)"\u6821\u9a8c\u901a\u8fc7"));
        return result;
    }

    @Override
    public Map<String, Object> checkReference(String fullName, Long id) throws Exception {
        QuerySchema schema = QuerySchema.create().addSelect("bizDomain,bizDomainName,bizName,sqlString,depends").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"upcObject").eq((Object)fullName)}).addOrderBy("id desc");
        List checkPoints = MetaDaoHelper.query((String)REF_CHECK, (QuerySchema)schema);
        HashMap<String, Object> result = new HashMap<String, Object>();
        if (!CollectionUtils.isEmpty((Collection)checkPoints)) {
            for (Map point : checkPoints) {
                Map<String, Object> sqlMap;
                IComQueryApi queryService;
                List selectList;
                Object dependsVal;
                String depends = (String)point.get("depends");
                if (depends == null || !BooleanUtil.isTrue((Object)(dependsVal = OptionUtils.getSystemOption((Object)AppContext.getTenantId(), (String)depends))) || (selectList = (queryService = (IComQueryApi)IrisDynamicInvokeUtil.getService((String)point.get("bizDomain").toString(), (String)"c87e2267-1001-4c70-bb2a-ab41f3b81aa3", null, IComQueryApi.class)).selectSql((String)(sqlMap = BizReferenceCheckService.transferSql(Arrays.asList(id), point.get("sqlString").toString())).get("sql"), sqlMap.get("param"))) == null || selectList.size() <= 0 || (Long)((Map)selectList.get(0)).get("total") <= 0L) continue;
                result.put("error", String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408088C", (String)"\u8be5\u5546\u54c1\u5b58\u5728SKU\u5728%s\u7684%s\u6a21\u5757\u88ab\u5f15\u7528"), point.get("bizDomainName").toString(), point.get("bizName").toString()));
                return result;
            }
        }
        result.put("success", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408088A", (String)"\u6821\u9a8c\u901a\u8fc7"));
        return result;
    }

    private String getResultMessage(Map<String, Object> map) {
        return String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408088B", (String)"\u8be5\u5546\u54c1\u5728%s\u7684%s\u6a21\u5757\u88ab\u5f15\u7528"), map.get("bizDomainName"), map.get("bizName"));
    }

    private static Map<String, Object> transferSql(List<Long> ids, String sql) {
        HashMap<String, Long> idsMap = new HashMap<String, Long>();
        HashMap<String, Object> resultMaq = new HashMap<String, Object>();
        int a = 0;
        StringBuffer sb = new StringBuffer();
        sb.append(sql);
        sb.append(" in(");
        for (Long id : ids) {
            sb.append("#{p");
            sb.append(a);
            sb.append("},");
            idsMap.put("p" + a, id);
            ++a;
        }
        String str = sb.substring(0, sb.lastIndexOf(","));
        resultMaq.put("sql", str + ")");
        resultMaq.put("param", idsMap);
        return resultMaq;
    }

    private static Map<String, Object> transferSelectSql(List<Long> ids, String sql) {
        HashMap<String, Object> resultMaq = new HashMap<String, Object>(1);
        StringBuffer sb = new StringBuffer();
        sb.append(sql);
        sb.append(" in (");
        for (int a = 0; a < ids.size(); ++a) {
            if (a == ids.size() - 1) {
                sb.append(ids.get(0));
                continue;
            }
            sb.append(ids.get(0) + ", ");
        }
        sb.append(" );");
        resultMaq.put("sql", sb.toString());
        return resultMaq;
    }
}


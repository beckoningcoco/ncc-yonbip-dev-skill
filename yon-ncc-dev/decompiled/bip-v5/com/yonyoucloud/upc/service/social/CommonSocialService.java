/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.diwork.ott.exexutors.RobotExecutors
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.basedoc.social.param.SocialQueryParam
 *  com.yonyou.iuap.basedoc.social.schema.SocialQueryCondition
 *  com.yonyou.ucf.mdd.common.model.Pager
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.option.util.OptionUtils
 *  org.imeta.core.base.ConditionOperator
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QueryPager
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.service.social;

import com.yonyou.diwork.ott.exexutors.RobotExecutors;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.basedoc.social.param.SocialQueryParam;
import com.yonyou.iuap.basedoc.social.schema.SocialQueryCondition;
import com.yonyou.ucf.mdd.common.model.Pager;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.option.util.OptionUtils;
import java.util.Date;
import java.util.List;
import org.imeta.core.base.ConditionOperator;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QueryPager;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.stereotype.Service;

@Service
public class CommonSocialService {
    public Pager query(SocialQueryParam socialQueryParam) {
        Pager pager = new Pager();
        QuerySchema querySchema = this.buildSchema(socialQueryParam);
        try {
            String defaultOpenApp = "false";
            Object isSingleOrg = OptionUtils.getSysOptionByName((String)"singleOrg");
            if (isSingleOrg != null && defaultOpenApp.equals(isSingleOrg.toString())) {
                if ("aa.merchant.Merchant".equals(socialQueryParam.getEntityUri())) {
                    querySchema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"createOrg").eq((Object)"666666")});
                } else if ("aa.custcategory.CustCategory".equals(socialQueryParam.getEntityUri())) {
                    querySchema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"orgId").eq((Object)"666666")});
                } else if ("pc.product.Product".equals(socialQueryParam.getEntityUri())) {
                    querySchema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"orgId").eq((Object)"666666")});
                }
            }
            pager = (Pager)RobotExecutors.runAs((String)socialQueryParam.getSrcTenantid(), () -> MetaDaoHelper.queryByPage((String)socialQueryParam.getEntityUri(), (QuerySchema)querySchema));
        }
        catch (Exception e) {
            throw new CoreDocBusinessException(e.getMessage(), (Throwable)e);
        }
        return pager;
    }

    private QuerySchema buildSchema(SocialQueryParam socialQueryParam) {
        SocialQueryCondition socialQueryCondition;
        String srcTenantid = socialQueryParam.getSrcTenantid();
        QuerySchema querySchema = new QuerySchema();
        querySchema.addSelect("*");
        if (!socialQueryParam.isFullDistribution() && (socialQueryCondition = socialQueryParam.getQueryCondition()) != null) {
            QueryConditionGroup queryConditionGroup = new QueryConditionGroup(ConditionOperator.and);
            CommonSocialService.parseQueryCondition(socialQueryCondition, queryConditionGroup);
            querySchema.addCondition((ConditionExpression)queryConditionGroup);
        }
        if (socialQueryParam.getPage().getPubts() != null) {
            querySchema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"pubts").egt((Object)new Date(socialQueryParam.getPage().getPubts()))});
        }
        QueryPager queryPager = new QueryPager();
        queryPager.setPageIndex(socialQueryParam.getPage().getPageIndex());
        queryPager.setPageSize(socialQueryParam.getPage().getPageSize());
        querySchema.pager(queryPager);
        return querySchema;
    }

    public static void parseQueryCondition(SocialQueryCondition socialQueryCondition, QueryConditionGroup queryConditionGroup) {
        if (socialQueryCondition.isGroup()) {
            QueryConditionGroup conditionGroup = new QueryConditionGroup(ConditionOperator.getOperator((String)socialQueryCondition.getOp().name()));
            queryConditionGroup.appendCondition(new ConditionExpression[]{conditionGroup});
            List conditions = socialQueryCondition.getConditions();
            for (SocialQueryCondition condition : conditions) {
                CommonSocialService.parseQueryCondition(condition, conditionGroup);
            }
        } else {
            QueryCondition fieldCondition = new QueryCondition(socialQueryCondition.getField(), ConditionOperator.getOperator((String)socialQueryCondition.getOp().name()), socialQueryCondition.getValue());
            queryConditionGroup.addCondition((ConditionExpression)fieldCondition);
        }
    }
}


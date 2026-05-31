/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyou.ucf.mdd.ext.poi.model.ExcelStreamingThreadLocalHolder
 *  com.yonyou.ucf.mdd.plugin.base.QuerySchemaExecutorPlugin
 *  org.imeta.core.model.Entity
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QueryField
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.mdd.ext;

import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyou.ucf.mdd.ext.poi.model.ExcelStreamingThreadLocalHolder;
import com.yonyou.ucf.mdd.plugin.base.QuerySchemaExecutorPlugin;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.imeta.core.model.Entity;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QueryField;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
public class UpdateBillContextQuerySchemaExtPlugin
implements QuerySchemaExecutorPlugin {
    private static final Logger log = LoggerFactory.getLogger(UpdateBillContextQuerySchemaExtPlugin.class);

    public void extendQuerySchema(Entity refEntity, QuerySchema querySchema, BillContext billContext) {
        try {
            if (InvocationInfoProxy.getExtendAttribute((String)"setI18ndoc") != null && "true".equals(InvocationInfoProxy.getExtendAttribute((String)"setI18ndoc")) && billContext.getBillnum() != null && !"aa_merchant".equals(billContext.getBillnum())) {
                billContext.setI18ndoc(false);
            }
            if (ExcelStreamingThreadLocalHolder.isStreaming()) {
                if ("query".equals(billContext.getAction()) && "pc_productimport".equals(billContext.getBillnum()) && querySchema != null) {
                    this.modifyProductExportQueryConditions(querySchema);
                }
                if ("query".equals(billContext.getAction()) && "pc_productdetail_import".equals(billContext.getBillnum()) && querySchema != null) {
                    this.modifyProductDetailExportQueryConditions(querySchema);
                }
                if ("listdetail".equals(billContext.getParameter("action")) && querySchema != null && ("aa_merchant_export_range".equals(billContext.getBillnum()) || "aa_merchant".equals(billContext.getBillnum()) || "aa_merchantlist".equals(billContext.getBillnum()))) {
                    this.modifyMerchantRangeExportQueryConditions(billContext, querySchema);
                }
            }
        }
        catch (Exception e) {
            log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040805DC", (String)"UpdateBillContextQuerySchemaExtPlugin\u5904\u7406BillContext\u6570\u636e\u5f02\u5e38\uff0c\u8bf7\u68c0\u67e5\u5904\u7406\u903b\u8f91\uff01\uff01\uff01\u5f02\u5e38\u4e3a\uff1a"), (Object)e.getMessage(), (Object)e);
        }
    }

    public int order() {
        return 1;
    }

    private void modifyProductExportQueryConditions(QuerySchema querySchema) {
        QueryConditionGroup queryConditionGroup = querySchema.queryConditionGroup();
        if (queryConditionGroup != null) {
            List conditions = queryConditionGroup.conditions();
            if (!CollectionUtils.isEmpty((Collection)conditions)) {
                ArrayList<QueryField> selectFields = new ArrayList<QueryField>();
                selectFields.add(new QueryField("id", "id"));
                selectFields.add(new QueryField("productDetail.productApplyRangeId", "detail!productApplyRangeId"));
                querySchema.selectFields(selectFields);
            }
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productDetail.productApplyRangeId.isCreator").eq((Object)1));
        }
    }

    private void modifyProductDetailExportQueryConditions(QuerySchema querySchema) {
        QueryConditionGroup queryConditionGroup = querySchema.queryConditionGroup();
        if (queryConditionGroup != null) {
            LoginUser user = AppContext.getCurrentUser();
            switch (user.getUserType()) {
                case TenantAdmin: {
                    break;
                }
                case TenantEmployee: {
                    queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.rangeType").eq((Object)1));
                    break;
                }
                case JoinUser: 
                case TenantShopuser: {
                    queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.rangeType").eq((Object)2));
                    break;
                }
                case ShopAdminUser: 
                case ShopUser: {
                    queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.rangeType").eq((Object)3));
                    break;
                }
            }
        }
    }

    private void modifyMerchantRangeExportQueryConditions(BillContext billContext, QuerySchema querySchema) {
        QueryConditionGroup queryConditionGroup = querySchema.queryConditionGroup();
        if (billContext != null && "query".equals(billContext.getAction()) && queryConditionGroup != null) {
            ArrayList<QueryField> selectFields;
            LoginUser user = AppContext.getCurrentUser();
            if (user != null && user.getUserType() != null) {
                switch (user.getUserType()) {
                    case ShopAdminUser: 
                    case ShopUser: {
                        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRanges.rangeType").eq((Object)3));
                        break;
                    }
                    default: {
                        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRanges.rangeType").eq((Object)1));
                    }
                }
            }
            if ("aa_merchant_export_range".equals(billContext.getBillnum())) {
                selectFields = new ArrayList<QueryField>();
                selectFields.add(new QueryField("id", "id"));
                selectFields.add(new QueryField("merchantApplyRanges.id", "merchantApplyRangeId"));
                querySchema.selectFields(selectFields);
            }
            if ("aa_merchant".equals(billContext.getBillnum()) || "aa_merchantlist".equals(billContext.getBillnum())) {
                selectFields = new ArrayList();
                selectFields.add(new QueryField("id", "id"));
                selectFields.add(new QueryField("merchantApplyRanges.id", "merchantApplyRangeId"));
                querySchema.selectFields(selectFields);
                queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRanges.isCreator").eq((Object)1));
                querySchema.queryOrderbys(null);
            }
            querySchema.distinct();
        }
    }
}


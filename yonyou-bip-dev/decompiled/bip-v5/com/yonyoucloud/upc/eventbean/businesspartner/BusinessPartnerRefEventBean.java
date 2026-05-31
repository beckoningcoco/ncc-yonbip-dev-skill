/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.Pager
 *  com.yonyou.ucf.mdd.common.model.ref.RefEntity
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.ref.service.IRefEvent
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.eventbean.businesspartner;

import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.Pager;
import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.ref.service.IRefEvent;
import com.yonyoucloud.upc.billrule.businesspartner.BusinessPartnerQueryBeforeRule;
import com.yonyoucloud.upc.service.BusinessPartnerService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="businessPartnerRefEventBean")
public class BusinessPartnerRefEventBean
implements IRefEvent {
    Logger logger = LoggerFactory.getLogger(BusinessPartnerService.class);
    @Autowired
    BusinessPartnerQueryBeforeRule beforeRule;

    public void beforeTreeData(RefEntity refEntity, Map<String, Object> refpara) {
    }

    public void afterTreeData(RefEntity refEntity, Map<String, Object> map, Object o) {
    }

    public void beforeGridData(RefEntity refEntity, Map<String, Object> map) {
        FilterVO gridFilter = (FilterVO)map.get("condition");
        if (gridFilter != null) {
            this.beforeRule.processPartnerRoleClassFilter(gridFilter);
        }
    }

    public void afterGridData(RefEntity refEntity, Map<String, Object> map, Object o) {
        try {
            this.makeRoleClass(o);
        }
        catch (Exception e) {
            this.logger.error("\u6253\u5f00\u4e1a\u52a1\u4f19\u4f34\u53c2\u7167\u5f02\u5e38");
        }
    }

    public void beforeGridMeta(RefEntity refEntity) {
    }

    public void afterGridMeta(RefEntity refEntity, Object o) {
    }

    public void makeRoleClass(Object partner) throws Exception {
        if (null != partner && partner instanceof Pager) {
            String partnerId;
            String locale;
            List partnerList = ((Pager)partner).getRecordList();
            if (partnerList == null || partnerList.size() == 0) {
                return;
            }
            ArrayList<String> partnerIds = new ArrayList<String>();
            for (Map item : partnerList) {
                partnerIds.add(item.get("id").toString());
            }
            QuerySchema roleClassSchema = QuerySchema.create().addSelect("partnerId,isCheck,roleClassName").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"partnerId").in(partnerIds)}));
            List roleClassList = MetaDaoHelper.query((String)"base.businesspartner.RoleClass", (QuerySchema)roleClassSchema, (String)"productcenter");
            HashMap<String, String> partnerRoleClassMap = new HashMap<String, String>();
            String string = locale = InvocationInfoProxy.getLocale() == null ? "zh_CN" : InvocationInfoProxy.getLocale();
            if (roleClassList != null && roleClassList.size() > 0) {
                for (Map item : roleClassList) {
                    if (item.containsKey("isCheck") && !Boolean.parseBoolean(item.get("isCheck").toString())) continue;
                    partnerId = item.get("partnerId").toString();
                    Short roleClassName = Short.valueOf(item.get("roleClassName").toString());
                    String name = this.roleClassMultilingualName(locale, roleClassName);
                    if (partnerRoleClassMap.containsKey(partnerId)) {
                        partnerRoleClassMap.put(partnerId, (String)partnerRoleClassMap.get(partnerId) + name + ";");
                        continue;
                    }
                    partnerRoleClassMap.put(partnerId, name + ";");
                }
            }
            for (Map item : partnerList) {
                partnerId = item.get("id").toString();
                String roleClasses = (String)partnerRoleClassMap.get(partnerId);
                if (roleClasses == null) continue;
                roleClasses = roleClasses.substring(0, roleClasses.length() - 1);
                item.put("roleClass", roleClasses);
            }
        }
    }

    public String roleClassMultilingualName(String local, Short roleClassName) {
        switch (roleClassName) {
            case 0: {
                return InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_21C763D40508000A", (String)"\u5ba2\u6237");
            }
            case 1: {
                return InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_21C763D40508000B", (String)"\u4f9b\u5e94\u5546");
            }
            case 3: {
                return InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_21C763D40508000C", (String)"\u7ec4\u7ec7");
            }
            case 2: {
                return InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1FF4E51604F8000B", (String)"\u8d44\u91d1\u4e1a\u52a1\u4f19\u4f34");
            }
        }
        return "";
    }
}


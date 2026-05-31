/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.ucf.mdd.common.model.ref.RefEntity
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyou.ucf.mdd.ext.ref.service.IRefEvent
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.core.base.ConditionOperator
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySqlCondition
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.eventbean.goodsArchives;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyou.ucf.mdd.ext.ref.service.IRefEvent;
import com.yonyoucloud.upc.billrule.cls.ProductClsUtils;
import com.yonyoucloud.upc.service.ManagementClassTreeQueryService;
import com.yonyoucloud.upc.service.utils.OrgPermissionsUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.imeta.core.base.ConditionOperator;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySqlCondition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="productBaseRefEventBean")
public class ProductBaseRefEventBean
implements IRefEvent {
    private static final Logger log = LoggerFactory.getLogger(ProductBaseRefEventBean.class);
    @Autowired
    private PubOptionService pubOptionService;
    @Autowired
    private OrgPermissionsUtil orgPermissionsUtil;
    @Autowired
    private ManagementClassTreeQueryService managementClassTreeQueryService;
    private String regex = "^[a-zA-Z\\d,-]*$";
    private String SQL = "SELECT DISTINCT T0.id AS `id` FROM product T0 LEFT JOIN product_apply_range_group T1 ON T1.product_id = T0.id AND T1.ytenant_id = T0.ytenant_id LEFT JOIN pub_org_group_detail T3 ON T3.group_id = T1.org_group_id AND T3.ytenant_id = T0.ytenant_id WHERE  T0.iDeleted = 0 ";

    public void beforeTreeData(RefEntity refEntity, Map<String, Object> refpara) {
        this.managementClassTreeQueryService.managementClassQueryCondition(refEntity, refpara);
    }

    public void afterTreeData(RefEntity refEntity, Map<String, Object> refpara, Object o) {
        if (null != o && o instanceof List) {
            ProductClsUtils.getInstance().sortTree((List)o, "managementClass_Code");
        }
    }

    public void beforeGridData(RefEntity refEntity, Map<String, Object> refpara) {
        FilterVO gridFilter = (FilterVO)refpara.get("condition");
        boolean isOrgGlobalShare = this.pubOptionService.getOrgGlobalShare("pc.product.Product");
        if (gridFilter == null) {
            gridFilter = new FilterVO();
        } else {
            this.orgPermissionsUtil.ignoreOrgId(gridFilter, isOrgGlobalShare);
        }
        LoginUser currentUser = AppContext.getCurrentUser();
        if (null == currentUser) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.COMMON_NO_LOGIN);
        }
        if (!isOrgGlobalShare) {
            List<Object> orgIds = new ArrayList();
            QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
            ArrayList ids = new ArrayList();
            Object masterOrgValue = refpara.get("masterOrgValue");
            List<String> orgPermissionList = this.orgPermissionsUtil.getOrgPermissionsNew(false);
            List<String> masterOrgList = new ArrayList<String>();
            if (masterOrgValue != null && !"".equals(masterOrgValue.toString().trim())) {
                String masterOrgs = masterOrgValue.toString();
                if (!masterOrgs.matches(this.regex)) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_REFER_QUERY_MATER_ORG_ERROR);
                }
                if (masterOrgs.contains(",")) {
                    masterOrgList = Arrays.asList(masterOrgs.split(","));
                } else {
                    masterOrgList.add(masterOrgs);
                }
            }
            orgIds = this.getCommonOrgIds(orgPermissionList, masterOrgList);
            String orgIdsStr = StringUtils.join(orgIds, (String)"', '");
            String queryDistinctIdSQL = "(" + this.SQL + " and T0.ytenant_id ='" + currentUser.getYTenantId() + "' and T3.org_id in ('" + orgIdsStr + "'))";
            QueryConditionGroup sqlCondGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{new QuerySqlCondition("id", queryDistinctIdSQL)});
            QueryConditionGroup specCondition = gridFilter.getQueryConditionGroup();
            if (null != specCondition) {
                sqlCondGroup.appendCondition(new ConditionExpression[]{specCondition});
            }
            gridFilter.setQueryConditionGroup(sqlCondGroup);
        }
        if (refEntity.getCode().contains("baseProductRef")) {
            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("productDetail.isCreator", "eq", (Object)1)});
        }
        refpara.put("condition", gridFilter);
    }

    public void afterGridData(RefEntity refEntity, Map<String, Object> refpara, Object result) {
    }

    public void beforeGridMeta(RefEntity refEntity) {
    }

    public void afterGridMeta(RefEntity refEntity, Object result) {
    }

    private List<String> getCommonOrgIds(List<String> orgPermissions, List<String> masterOrgs) {
        if (CollectionUtils.isEmpty(orgPermissions)) {
            return masterOrgs;
        }
        if (CollectionUtils.isEmpty(masterOrgs)) {
            return orgPermissions;
        }
        return masterOrgs.stream().filter(orgId -> orgPermissions.contains(orgId)).collect(Collectors.toList());
    }
}


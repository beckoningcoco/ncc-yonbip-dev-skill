/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyou.ucf.mdd.ext.util.RedisTool
 *  com.yonyoucloud.upc.pc.org.PubOrgGroupDetail
 *  com.yonyoucloud.upc.pc.product.ProductApplyRange
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.transaction.support.TransactionSynchronization
 *  org.springframework.transaction.support.TransactionSynchronizationManager
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.product;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyou.ucf.mdd.ext.util.RedisTool;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.iuap.upc.api.service.IUPCProductQueryService;
import com.yonyoucloud.upc.pc.org.PubOrgGroupDetail;
import com.yonyoucloud.upc.pc.product.ProductApplyRange;
import com.yonyoucloud.upc.service.ProductApplyRangeGroupService;
import com.yonyoucloud.upc.service.utils.ProductUtil;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationManager;
import org.springframework.util.CollectionUtils;

@Component(value="addProSuitOrg")
public class AddProSuitOrg
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(AddProSuitOrg.class);
    @Autowired
    private IUPCProductQueryService upcProductQueryService;
    @Autowired
    private IUPCControlRuleService upcControlRuleService;
    @Autowired
    ProductApplyRangeGroupService productApplyRangeGroupService;
    private static final String ProductApplyRangeCLASS_NAME = "pc.product.ProductApplyRange";
    private static final String ProductCLASS_NAME = "pc.product.Product";

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_PARAM_IS_NULL);
        }
        List bills = this.getBills(billContext, paramMap);
        LoginUser user = AppContext.getCurrentUser();
        switch (user.getUserType()) {
            case TenantAdmin: 
            case TenantEmployee: {
                break;
            }
            case JoinUser: 
            case TenantShopuser: 
            case ShopAdminUser: 
            case ShopUser: {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_NOT_ALLOW_SALE_BY_NOT_CURRENT_ORG, new Object[]{user.getName()});
            }
        }
        RuleExecuteResult result = new RuleExecuteResult();
        final String applyRangeLockKey = "APPLY_RANGE_PRODUCT" + AppContext.getTenantId();
        final String lockValue = UUID.randomUUID().toString();
        TransactionSynchronizationManager.registerSynchronization((TransactionSynchronization)new TransactionSynchronization(){

            public void afterCompletion(int status) {
                RedisTool.releaseLock((String)applyRangeLockKey, (String)lockValue);
            }
        });
        HashSet<String> allProductOrgNew = new HashSet<String>();
        for (int i = 0; i < bills.size(); ++i) {
            if (!((BizObject)bills.get(i)).containsKey((Object)"orgIds") || ((BizObject)bills.get(i)).get("orgIds") == null) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_ORG_IS_NULL);
            }
            if (!((BizObject)bills.get(i)).containsKey((Object)"productId") || ((BizObject)bills.get(i)).get("productId") == null) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_PRODUCT_IS_NULL);
            }
            ArrayList orgIds = (ArrayList)((BizObject)bills.get(i)).get("orgIds");
            orgIds = new ArrayList(new HashSet(orgIds));
            Long productId = Long.valueOf((String)((BizObject)bills.get(i)).get("productId"));
            if (RedisTool.tryGetLock((String)applyRangeLockKey, (String)lockValue, (int)600)) {
                List product = MetaDaoHelper.query((String)ProductCLASS_NAME, (QuerySchema)QuerySchema.create().addSelect(new String[]{"code", "creatorType", "orgId"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)productId)})));
                if (product == null || product.isEmpty()) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_IS_DELETE, (Object[])((BizObject)bills.get(i)).get("product_name"));
                }
                if (!"0".equals(((Map)product.get(0)).get("creatorType").toString()) && !"1".equals(((Map)product.get(0)).get("creatorType").toString())) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_IS_NOT_ORG_CREATE, new Object[]{((Map)product.get(0)).get("code")});
                }
                if (!((Map)product.get(0)).containsKey("orgId") || ((Map)product.get(0)).get("orgId") == null) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_CREATE_ORG_IS_NULL, new Object[]{((Map)product.get(0)).get("code")});
                }
                String creatorOrgId = ((Map)product.get(0)).get("orgId").toString();
                List creatorOrg = MetaDaoHelper.query((String)"bd.adminOrg.BaseOrgVO", (QuerySchema)QuerySchema.create().addSelect(new String[]{"code", "name"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)creatorOrgId)})), (String)"ucf-org-center");
                if (!this.upcControlRuleService.checkVoucherManageShareOrg(ProductCLASS_NAME, creatorOrgId).booleanValue()) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_NOT_ALLOW_SHARE_BY_NOT_OPEN_SHARE_ORG, new Object[]{((Map)product.get(0)).get("code"), ((Map)creatorOrg.get(0)).get("name")});
                }
                List<String> orgRangeShare = this.upcControlRuleService.getOrgRangeShareAllWithoutAutoShare(ProductCLASS_NAME, creatorOrgId);
                if (null == orgRangeShare || orgRangeShare.isEmpty()) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_NOT_ALLOW_SHARE_BY_NOT_SET_SHARE_ORG, new Object[]{((Map)product.get(0)).get("code"), ((Map)creatorOrg.get(0)).get("name")});
                }
                HashSet<String> orgRangeShareSet = new HashSet<String>(orgRangeShare);
                HashSet orgIdSet = new HashSet(orgIds);
                HashSet orgIdInterSet = new HashSet(orgIds);
                orgIdSet.removeAll(orgRangeShareSet);
                orgIdInterSet.retainAll(orgRangeShareSet);
                if (!orgIdInterSet.isEmpty()) {
                    List results = MetaDaoHelper.query((String)ProductApplyRangeCLASS_NAME, (QuerySchema)QuerySchema.create().addSelect(new String[]{"orgId", "orgId.name as org_Name", "productDetailId", "productDepositTimeDetailId", "isCreator"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId)})));
                    ArrayList<ProductApplyRange> ranges2Db = new ArrayList<ProductApplyRange>();
                    if (!CollectionUtils.isEmpty((Collection)results)) {
                        List creatorRangeIdList = results.stream().filter(a -> Boolean.TRUE.equals(a.get("isCreator"))).collect(Collectors.toList());
                        Map creatorRangeIdMap = new HashMap();
                        if (!CollectionUtils.isEmpty((Collection)creatorRangeIdList)) {
                            creatorRangeIdMap = (Map)creatorRangeIdList.get(0);
                        }
                        List orgsInDb = results.stream().map(map -> map.get("orgId").toString()).collect(Collectors.toList());
                        HashSet existsOrgIdSet = new HashSet(orgIds);
                        HashSet orgsInDbSet = new HashSet(orgsInDb);
                        existsOrgIdSet.retainAll(orgsInDbSet);
                        if (!existsOrgIdSet.isEmpty()) {
                            log.info("addProSuitOrg productId:{}, exists ranges:{}", (Object)productId, existsOrgIdSet);
                            orgIds.removeAll(existsOrgIdSet);
                            List exists = MetaDaoHelper.query((String)"bd.adminOrg.BaseOrgVO", (QuerySchema)QuerySchema.create().addSelect(new String[]{"code", "name"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(existsOrgIdSet)})), (String)"ucf-org-center");
                            result.setData((Object)MessageFormat.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080382", (String)"\u7269\u6599[{0}]\u5df2\u5206\u914d\u7ec4\u7ec7{1}"), ((Map)product.get(0)).get("code"), exists.stream().map(map -> map.get("name").toString()).collect(Collectors.toList())));
                        }
                        if (orgIds.size() > 0) {
                            for (String orgid : orgIds) {
                                if (allProductOrgNew.contains(productId.toString() + orgid)) continue;
                                ProductApplyRange range = ProductUtil.buildProductApplyRange(productId, 1, orgid, null);
                                if (creatorRangeIdMap.get("productDetailId") != null) {
                                    range.setProductDetailId(Long.valueOf(Long.parseLong(creatorRangeIdMap.get("productDetailId").toString())));
                                }
                                if (creatorRangeIdMap.get("productDepositTimeDetailId") != null) {
                                    range.setProductDepositTimeDetailId(Long.valueOf(Long.parseLong(creatorRangeIdMap.get("productDepositTimeDetailId").toString())));
                                }
                                ranges2Db.add(range);
                                allProductOrgNew.add(productId + orgid);
                            }
                        }
                    } else {
                        for (String orgid : orgIds) {
                            if (allProductOrgNew.contains(productId + orgid)) continue;
                            ProductApplyRange range = ProductUtil.buildProductApplyRange(productId, 1, orgid, null);
                            ranges2Db.add(range);
                            allProductOrgNew.add(productId + orgid);
                        }
                    }
                    if (!ranges2Db.isEmpty()) {
                        MetaDaoHelper.insert((String)ProductApplyRangeCLASS_NAME, ranges2Db);
                    }
                }
                ArrayList<Long> productIdList = new ArrayList<Long>();
                productIdList.add(productId);
                ArrayList<PubOrgGroupDetail> pubOrgGroupDetailList = new ArrayList<PubOrgGroupDetail>();
                orgIds.forEach(a -> {
                    PubOrgGroupDetail pubOrgGroupDetail = new PubOrgGroupDetail();
                    pubOrgGroupDetail.setOrgId(a);
                    pubOrgGroupDetail.setOrgType("1");
                    pubOrgGroupDetailList.add(pubOrgGroupDetail);
                });
                this.productApplyRangeGroupService.dealProductApplyRangeGroup(productIdList, pubOrgGroupDetailList);
                if (orgIdSet.isEmpty()) continue;
                List notExists = MetaDaoHelper.query((String)"bd.adminOrg.BaseOrgVO", (QuerySchema)QuerySchema.create().addSelect(new String[]{"code", "name"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(orgIdSet)})), (String)"ucf-org-center");
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_NOT_ALLOW_SHARE_BY_NOT_IN_SHARE_ORG, new Object[]{((Map)product.get(0)).get("code"), ((Map)creatorOrg.get(0)).get("name"), notExists.stream().map(map -> map.get("name").toString()).collect(Collectors.toList())});
            }
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.APPLY_RANGE_PARALLEL_DEAL_ERROR);
        }
        return result;
    }
}


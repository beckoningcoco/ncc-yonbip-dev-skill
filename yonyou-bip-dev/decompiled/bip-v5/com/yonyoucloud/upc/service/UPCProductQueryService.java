/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSONObject
 *  com.alibaba.fastjson.serializer.SerializerFeature
 *  com.yonyou.cloud.util.IrisDynamicInvokeUtil
 *  com.yonyou.coredoc.service.utils.OrgPermissionsService
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.LanguagesEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.iuap.apdoc.coredoc.po.unit.UnitPO
 *  com.yonyou.iuap.apdoc.coredoc.utils.MultiLangUtils
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.api.interfaces.rpc.IComQueryApi
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyou.ucf.mdd.ext.option.util.OptionUtils
 *  com.yonyou.ucf.mdd.ext.util.OptionUtils
 *  com.yonyou.ypd.bd.api.IBDQueryRepository
 *  com.yonyoucloud.upc.aa.registInfo.RegisterSourceType
 *  com.yonyoucloud.upc.common.enums.DomainOpenEnum
 *  com.yonyoucloud.upc.pc.product.AssistUnitType
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductApplyRange
 *  com.yonyoucloud.upc.utils.CollectionUtil
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.core.lang.ArrayUtils
 *  org.imeta.core.lang.BooleanUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.jetbrains.annotations.NotNull
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.yonyou.cloud.util.IrisDynamicInvokeUtil;
import com.yonyou.coredoc.service.utils.OrgPermissionsService;
import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.LanguagesEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.iuap.apdoc.coredoc.po.unit.UnitPO;
import com.yonyou.iuap.apdoc.coredoc.utils.MultiLangUtils;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.api.interfaces.rpc.IComQueryApi;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyou.ucf.mdd.ext.util.OptionUtils;
import com.yonyou.ypd.bd.api.IBDQueryRepository;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.iuap.upc.api.service.IUPCProductQueryService;
import com.yonyoucloud.upc.aa.registInfo.RegisterSourceType;
import com.yonyoucloud.upc.cache.BizCache;
import com.yonyoucloud.upc.common.enums.DomainOpenEnum;
import com.yonyoucloud.upc.pc.product.AssistUnitType;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductApplyRange;
import com.yonyoucloud.upc.service.utils.OrgPermissionsUtil;
import com.yonyoucloud.upc.service.utils.ProductUtil;
import com.yonyoucloud.upc.utils.CollectionUtil;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.imeta.core.lang.ArrayUtils;
import org.imeta.core.lang.BooleanUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class UPCProductQueryService
implements IUPCProductQueryService {
    private static final Logger log = LoggerFactory.getLogger(UPCProductQueryService.class);
    @Autowired
    BizCache cache;
    @Autowired
    private IUPCControlRuleService upcControlRuleService;
    @Autowired
    PubOptionService pubOptionService;
    @Autowired
    private YMSParamConfig ymsParamConfig;
    @Autowired
    private OrgPermissionsUtil orgPermissionsUtil;
    @Autowired
    private OrgPermissionsService orgPermissionsService;
    @Autowired
    private IBDQueryRepository billQueryRepository;

    @Override
    public byte[] CheckRegistedInfos() throws Exception {
        String key = "TENANT_REGISTERINFOS_" + AppContext.getTenantId();
        byte[] result = (byte[])JSONObject.parseObject((String)AppContext.cache().get(key), byte[].class);
        if (result == null) {
            List list = MetaDaoHelper.query((String)"aa.registInfo.RegistInfo", (QuerySchema)QuerySchema.create().addSelect("systemCode").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"isRegisted").eq((Object)1)})).addOrderBy("orderNumber"));
            if (list == null || list.isEmpty()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801037, (Object[])AppContext.getYTenantId());
            }
            result = new byte[list.size() + 1];
            for (int i = 0; i < list.size(); ++i) {
                try {
                    RegisterSourceType registerSourceType = RegisterSourceType.valueOf((String)((Map)list.get(i)).get("systemCode").toString());
                    result[i] = Short.valueOf(registerSourceType.getValue()).byteValue();
                    continue;
                }
                catch (IllegalArgumentException e) {
                    log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408098C", (String)"\u6ce8\u518c\u7c7b\u578b\u8f6c\u6362\u9519\u8bef\uff1a") + e.getMessage(), (Throwable)e);
                }
            }
            result[list.size()] = 32;
            AppContext.cache().set(key, JSONObject.toJSONString((Object)result, (SerializerFeature[])new SerializerFeature[]{SerializerFeature.WriteDateUseDateFormat}), 10);
        }
        return result;
    }

    @Override
    public Map getUMemberCenterAppId() throws Exception {
        if (!ProductUtil.checkOpenOption("u8c-config", DomainOpenEnum.MEMBERCENTER.getServiceName())) {
            return null;
        }
        HashMap<String, String> params = new HashMap<String, String>(1);
        params.put("sql", "select cDefaultAppID as appId from mp_enterpriseuser where cYxyTenantID = " + AppContext.getCurrentUser().getYxyTenantId());
        IComQueryApi comQueryApi = (IComQueryApi)IrisDynamicInvokeUtil.getService((String)"uhy", (String)"c87e2267-1001-4c70-bb2a-ab41f3b81aa3", null, IComQueryApi.class);
        List list = comQueryApi.selectList("com.yonyou.ucf.mdd.ext.meta.dao.selectList", params);
        if (list == null || list.size() < 1) {
            return null;
        }
        return (Map)list.get(0);
    }

    @Override
    public List<String> getCouponId(Long productId) throws Exception {
        HashMap<String, Object> params = new HashMap<String, Object>(4);
        params.put("ytenant", AppContext.getYTenantId());
        params.put("product_Id", productId);
        List list = SqlHelper.selectList((String)"com.yonyoucloud.upc.product.dao.ProductQuery.getProductCouponIds", params);
        if (list != null && !list.isEmpty()) {
            return list;
        }
        return null;
    }

    @Override
    public Map GetMallDomain() throws Exception {
        String domain;
        Map data;
        if (!ProductUtil.checkOpenOption("u8c-config", DomainOpenEnum.MALL.getServiceName())) {
            return null;
        }
        HashMap<String, String> values = new HashMap<String, String>();
        values.put("preWebDomain", this.ymsParamConfig.getDomainMallDefault());
        String umallDomain = this.ymsParamConfig.getDomainMallDefault();
        if (StringUtils.isNotBlank((CharSequence)umallDomain)) {
            String[] domains = umallDomain.split("//");
            umallDomain = domains.length > 1 ? domains[1] : domains[0];
        }
        values.put("MallDomain", umallDomain);
        List list = MetaDaoHelper.query((String)"um.storesetting.CorprationModel", (QuerySchema)QuerySchema.create().addSelect(new String[]{"cWebDomain as MallDomain", "preWebDomain as preWebDomain", "iTerminalOfWebDomain as iTerminalOfWebDomain"}), (String)"umall");
        if (!CollectionUtils.isEmpty((Collection)list) && ((Boolean)(data = (Map)list.get(0)).get("iTerminalOfWebDomain")).booleanValue() && StringUtils.isNotEmpty((CharSequence)(domain = (String)data.get("MallDomain")))) {
            values.put("MallDomain", domain);
            String pre = (String)data.get("preWebDomain");
            if (StringUtils.isNotEmpty((CharSequence)pre)) {
                values.put("preWebDomain", pre);
            }
        }
        return values;
    }

    @Override
    public Map GetMallWxId() throws Exception {
        if (!ProductUtil.checkOpenOption("u8c-config", DomainOpenEnum.MALL.getServiceName())) {
            return null;
        }
        List list = MetaDaoHelper.query((String)"um.mallsetting.Corpwid", (QuerySchema)QuerySchema.create().addSelect("wid").addOrderBy("id"), (String)"umall");
        if (list == null || list.isEmpty() || StringUtils.isEmpty((CharSequence)((Map)list.get(0)).get("wid").toString())) {
            return null;
        }
        return (Map)list.get(0);
    }

    @Override
    public List<Map> GetMemberCenterMemberLevel() throws Exception {
        Map appid = this.getUMemberCenterAppId();
        if (appid == null || !ProductUtil.checkOpenOption("u8c-config", DomainOpenEnum.MEMBERCENTER.getServiceName())) {
            return null;
        }
        QueryConditionGroup conditionGroup = new QueryConditionGroup();
        conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"cAppID").eq(appid.get("appId")));
        QuerySchema schema = QuerySchema.create().addSelect(new String[]{"id", "cMemberLevelName as name", "fDiscount discount", "iOrder order"}).addCondition((ConditionExpression)conditionGroup).addOrderBy("iOrder");
        List lvs = MetaDaoHelper.query((String)"uhybase.members.Memberlevel", (QuerySchema)schema, (String)"uhy");
        if (lvs == null || lvs.size() < 1) {
            log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408098A", (String)"\u79df\u6237[{}]\u672a\u83b7\u53d6\u5230U\u4f1a\u5458\u4f1a\u5458\u7b49\u7ea7"), (Object)AppContext.getTenantId().toString());
            return null;
        }
        return lvs;
    }

    @Override
    public List<Map> GetPrivilegedAndNextOrgs() throws Exception {
        List orgs = null;
        LoginUser user = AppContext.getCurrentUser();
        if (null == user) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800108);
        }
        String orgId = user.getOrgId();
        switch (user.getUserType()) {
            case TenantAdmin: {
                QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"path").like((Object)orgId), QueryCondition.name((String)"stopstatus").eq((Object)0)});
                QuerySchema schema = QuerySchema.create().addSelect(new String[]{"id", "name", "code"}).addCondition((ConditionExpression)queryConditionGroup);
                orgs = MetaDaoHelper.query((String)"bd.adminOrg.BaseOrgVO", (QuerySchema)schema);
                if (orgs != null && orgs.size() >= 1) break;
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800473);
            }
            case TenantEmployee: {
                QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"user").eq(user.getId()), QueryCondition.name((String)"org.stopstatus").eq((Object)0)});
                QuerySchema schema = QuerySchema.create().addSelect(new String[]{"org.id as id", "org.name as name", "org.code as code"}).addCondition((ConditionExpression)queryConditionGroup);
                orgs = MetaDaoHelper.query((String)"base.user.UserOrg", (QuerySchema)schema);
                if (null != orgs && orgs.size() >= 1) break;
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800473);
            }
        }
        return orgs;
    }

    @Override
    public List<Map> GetPrivilegedAndNextOrgIds() throws Exception {
        List<Map> list = this.GetPrivilegedAndNextOrgs();
        if (list != null) {
            for (Map org : list) {
                org.remove("code");
                org.remove("org");
                org.remove("name");
            }
        }
        return list;
    }

    @Override
    public List<Map> GetPrivilegedAndNextCustomers() throws Exception {
        if (!ProductUtil.checkOpenOption("u8c-config", "app:SCMSA")) {
            return null;
        }
        List mapCusts = MetaDaoHelper.query((String)"aa.merchant.Merchant", (QuerySchema)QuerySchema.create().addSelect(new String[]{"id", "code", "name"}));
        if (mapCusts == null || mapCusts.isEmpty()) {
            return null;
        }
        return mapCusts;
    }

    @Override
    public List<Map> GetPrivilegedAndNextCustomerIds() throws Exception {
        List<Map> list = this.GetPrivilegedAndNextCustomers();
        if (list != null) {
            for (Map cust : list) {
                cust.remove("code");
                cust.remove("name");
            }
        }
        return list;
    }

    @Override
    public Map<String, Object> GetOrgCustIdByShopId(Long shopId) {
        HashMap<String, Object> result = new HashMap<String, Object>();
        result.put("shopId", shopId);
        result.put("customerId", shopId);
        result.put("orgId", shopId);
        return result;
    }

    @Override
    public List<Map<String, Object>> GetOrgCustIdByShopIds(List<Long> shopIds) {
        ArrayList<Map<String, Object>> result = new ArrayList<Map<String, Object>>(shopIds.size());
        for (Long shopId : shopIds) {
            result.add(this.GetOrgCustIdByShopId(shopId));
        }
        return result;
    }

    @Override
    public Map<String, Object> GetOrgShopIdByCustId(Long customerId) {
        HashMap<String, Object> result = new HashMap<String, Object>();
        result.put("shopId", customerId);
        result.put("customerId", customerId);
        result.put("orgId", customerId);
        return result;
    }

    @Override
    public List<Map<String, Object>> GetOrgShopIdByCustIds(List<Long> customerIds) {
        ArrayList<Map<String, Object>> result = new ArrayList<Map<String, Object>>(customerIds.size());
        for (Long customerId : customerIds) {
            result.add(this.GetOrgShopIdByCustId(customerId));
        }
        return result;
    }

    @Override
    public Map<String, Object> SetParams(Long productId, Long productApplyRangeId, String orgId, Long custId, Long shopId) throws Exception {
        Map result;
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("productId", productId);
        params.put("ytenant", AppContext.getYTenantId());
        if (productApplyRangeId == null || productApplyRangeId == 0L) {
            if (orgId != null) {
                params.put("orgId", orgId);
                result = (Map)SqlHelper.selectFirst((String)"com.yonyoucloud.upc.product.dao.ProductQuery.QueryRangeByorgId", params);
            } else if (custId != null) {
                params.put("custId", custId);
                result = (Map)SqlHelper.selectFirst((String)"com.yonyoucloud.upc.product.dao.ProductQuery.QueryRangeBycustId", params);
            } else if (shopId != null) {
                params.put("shopId", shopId);
                result = (Map)SqlHelper.selectFirst((String)"com.yonyoucloud.upc.product.dao.ProductQuery.QueryRangeByshopId", params);
            } else {
                params.put("isCreator", true);
                result = (Map)SqlHelper.selectFirst((String)"com.yonyoucloud.upc.product.dao.ProductQuery.QueryRangeByIsCreator", params);
            }
            if (result == null || result.isEmpty()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801038);
            }
            productApplyRangeId = (Long)result.get("id");
        } else {
            params.put("productApplyRangeId", productApplyRangeId);
            result = (Map)SqlHelper.selectFirst((String)"com.yonyoucloud.upc.product.dao.ProductQuery.QueryRangeByRangeId", params);
        }
        if (result == null || result.isEmpty()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801039);
        }
        params.put("@productDetailId", (Long)result.get("productDetailId"));
        params.put("@productApplyRangeId", productApplyRangeId);
        params.put("isCreator", result.get("isCreator"));
        params.put("isApplied", result.get("isApplied"));
        return params;
    }

    @Override
    public List<Map> getSKUSaled(List<Map<String, Object>> list) throws Exception {
        return SqlHelper.selectList((String)"com.yonyoucloud.upc.product.dao.ProductQuery.GetSKUSaled", list);
    }

    @Override
    public List<Map> getAssistUnitRateByOrg(List<Map> products) throws Exception {
        Long startTime = System.currentTimeMillis();
        log.info("getAssistUnitRateByOrg recieve data: {}", products);
        List<Map> result = new ArrayList<Map>();
        if (products != null && !products.isEmpty()) {
            HashSet<Long> productIds = new HashSet<Long>(products.size());
            HashSet<String> orgIds = new HashSet<String>(products.size());
            for (Map product : products) {
                if (!product.containsKey("productId") || null == product.get("productId") || "".equals(product.get("productId")) || "undefined".equals(product.get("productId"))) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801040);
                }
                Long productId = Long.valueOf(product.get("productId").toString());
                if (this.pubOptionService.getOrgGlobalShare("pc.product.Product").booleanValue()) {
                    product.remove("orgId");
                }
                if (!product.containsKey("orgId")) {
                    List productorgId = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)QuerySchema.create().addSelect("orgId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)productId)})));
                    if (!productorgId.isEmpty()) {
                        product.put("orgId", ((Map)productorgId.get(0)).get("orgId"));
                    } else {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801041, new Object[]{product.get("productId").toString()});
                    }
                }
                productIds.add(productId);
                orgIds.add(product.get("orgId").toString());
            }
            List productsInDb = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)QuerySchema.create().addSelect(new String[]{"id", "code", "name"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(productIds)})));
            if (productsInDb.isEmpty()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801041, new Object[]{productIds});
            }
            Map<String, List<Map>> productsInDb_map = productsInDb.stream().collect(Collectors.groupingBy(map -> map.get("id").toString()));
            if (productsInDb_map.keySet().size() < productIds.size()) {
                HashSet productIdSet = new HashSet();
                productIds.forEach(a -> productIdSet.add(String.valueOf(a)));
                Set<String> productInDbSet = productsInDb_map.keySet();
                productIdSet.removeAll(productInDbSet);
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801041, new Object[]{Arrays.toString(ArrayUtils.toArray(productIdSet))});
            }
            List ranges = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)QuerySchema.create().addSelect(new String[]{"id as productApplyRangeId", "productId", "orgId"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").in(productIds), QueryCondition.name((String)"orgId").in(orgIds)})));
            List<Map> orgDetailList = this.upcControlRuleService.getOrgDetail(orgIds);
            Map<Object, Object> orgDetails = new HashMap();
            if (null != orgDetailList && !orgDetailList.isEmpty()) {
                orgDetails = orgDetailList.stream().collect(Collectors.toMap(p -> p.get("id").toString(), p -> p));
            }
            if (ranges.isEmpty()) {
                StringBuilder orgNamesBuilder = new StringBuilder();
                for (String org : orgIds) {
                    if (!orgDetails.containsKey(org)) continue;
                    String code = ((Map)orgDetails.get(org)).get("code").toString();
                    String name = ((Map)orgDetails.get(org)).get("name").toString();
                    orgNamesBuilder.append(code).append("+").append(name).append(";");
                }
                String orgNames = orgNamesBuilder.toString();
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801042, new Object[]{productsInDb.stream().map(map -> map.get("code").toString()).collect(Collectors.toList()), StringUtils.isNotEmpty((CharSequence)orgNames) ? orgNames : orgIds});
            }
            Map<String, List<Map>> rangesInDb = ranges.stream().collect(Collectors.groupingBy(map -> map.get("productId").toString()));
            Map<String, List<Map>> productDatas = products.stream().collect(Collectors.groupingBy(map -> map.get("productId").toString()));
            for (Map.Entry<String, List<Map>> entry : productDatas.entrySet()) {
                if (!rangesInDb.keySet().contains(entry.getKey())) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801043, new Object[]{productsInDb_map.get(entry.getKey()).get(0).get("code")});
                }
                Set orgIdDatas = entry.getValue().stream().map(map -> map.get("orgId").toString()).collect(Collectors.toSet());
                Set orgIdsInDb = rangesInDb.get(entry.getKey()).stream().map(map -> map.get("orgId").toString()).collect(Collectors.toSet());
                for (String org : orgIdDatas) {
                    if (orgIdsInDb.contains(org)) continue;
                    String orgName = "";
                    if (orgDetails.containsKey(org)) {
                        String code = ((Map)orgDetails.get(org)).get("code").toString();
                        String name = ((Map)orgDetails.get(org)).get("name").toString();
                        orgName = code + "+" + name;
                    }
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801044, new Object[]{productsInDb_map.get(entry.getKey()).get(0).get("code"), StringUtils.isNotEmpty((CharSequence)orgName) ? orgName : org});
                }
            }
            log.info("getAssistUnitRateByOrg pre process take time: {}", (Object)(System.currentTimeMillis() - startTime));
            result = this.getAssistUnitRate(ranges);
            this.getUStockFieldValue(result, productIds);
        }
        Long endTime = System.currentTimeMillis();
        log.info("getAssistUnitRateByOrg take time: {}", (Object)(endTime - startTime));
        return result;
    }

    @Override
    public List<Map> getAssistUnitRate(List<Map> products) throws Exception {
        ArrayList<Map> result = new ArrayList<Map>(products.size());
        String productApplyRangeIds = products.stream().map(map -> map.get("productApplyRangeId").toString()).collect(Collectors.joining(","));
        String productIds = products.stream().map(map -> map.get("productId").toString()).collect(Collectors.joining(","));
        HashMap<String, Object> para = new HashMap<String, Object>(3);
        para.put("ytenant", AppContext.getYhtTenantId());
        para.put("productApplyRangeIds", productApplyRangeIds);
        para.put("productIds", productIds);
        List productUnits = SqlHelper.selectList((String)"com.yonyoucloud.upc.product.dao.ProductQuery.getBusinessUnitIds", para);
        List exchanges = SqlHelper.selectList((String)"com.yonyoucloud.upc.product.dao.ProductQuery.getProductUnitExchanges", para);
        Map<Long, UnitPO> unitIdAndPOMap = this.getUnitIdsFromLists(productUnits, exchanges);
        this.setUnitNameAndPrecision(unitIdAndPOMap, productUnits, exchanges);
        Map<String, List<Map>> exchangesMap = exchanges.stream().collect(Collectors.groupingBy(map -> map.get("productId").toString()));
        for (Map product : productUnits) {
            String productId = product.get("productId").toString();
            List<Map> productExchanges = exchangesMap.get(productId);
            boolean hasExchanges = true;
            if (productExchanges.size() == 1 && productExchanges.get(0).keySet().size() == 1) {
                hasExchanges = false;
            }
            for (AssistUnitType type : AssistUnitType.values()) {
                if (!product.containsKey(type.toString())) continue;
                if (product.get(type.toString()).toString().equals(product.get("mainUnit").toString())) {
                    Long unitId = Long.parseLong(product.get(type.toString()).toString());
                    UnitPO unitPO = unitIdAndPOMap.get(Long.parseLong(unitId.toString()));
                    product.put(type.toString(), this.buildBusinessUnitMap(productId, type, unitPO, new BigDecimal(1)));
                    continue;
                }
                if (hasExchanges) {
                    Optional<Map> optionalMap = productExchanges.stream().filter(map -> map.get("assistUnit").toString().equals(product.get(type.toString()).toString())).findAny();
                    if (!optionalMap.isPresent()) continue;
                    HashMap<String, Object> map2 = new HashMap<String, Object>(optionalMap.get());
                    Long unitId = Long.parseLong(map2.get("assistUnit").toString());
                    UnitPO unitPO = unitIdAndPOMap.get(Long.parseLong(unitId.toString()));
                    this.setUnitForExchanges(unitPO, map2);
                    map2.put("bizUnitType", type.toString());
                    product.put(type.toString(), map2);
                    continue;
                }
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801045, new Object[]{product.get("productId"), type.getName(), product.get("mainUnit"), product.get("productApplyRangeId")});
            }
            product.put("productAssistUnitExchanges", productExchanges);
            result.add(product);
        }
        return result;
    }

    private void setUnitNameAndPrecision(Map<Long, UnitPO> unitIdAndPOMap, List<Map<String, Object>> productUnits, List<Map<String, Object>> exchanges) {
        UnitPO unitPO;
        Long unitId;
        if (!CollectionUtils.isEmpty(productUnits)) {
            for (Map<String, Object> productUnit : productUnits) {
                unitId = Long.parseLong(productUnit.get("mainUnit").toString());
                unitPO = unitIdAndPOMap.get(Long.parseLong(unitId.toString()));
                String unitName = MultiLangUtils.getLocalValue((Object)unitPO.getName().toMap());
                productUnit.put("mainUnit_Name", unitName);
                productUnit.put("mainUnit_Precision", unitPO.getPrecision());
            }
        }
        if (!CollectionUtils.isEmpty(exchanges)) {
            for (Map<String, Object> exchange : exchanges) {
                if (null == exchange.get("assistUnit")) continue;
                unitId = Long.parseLong(exchange.get("assistUnit").toString());
                unitPO = unitIdAndPOMap.get(Long.parseLong(unitId.toString()));
                this.setUnitForExchanges(unitPO, exchange);
            }
        }
    }

    private void setUnitForExchanges(UnitPO unitPO, Map<String, Object> map) {
        String unitName = MultiLangUtils.getLocalValue((Object)unitPO.getName().toMap());
        map.put("assistUnit_Name", unitName);
        map.put("assistUnit_Precision", unitPO.getPrecision());
    }

    private Map<Long, UnitPO> getUnitIdsFromLists(List<Map<String, Object>> productUnits, List<Map<String, Object>> exchanges) {
        List unitIds = productUnits.stream().filter(product -> product.containsKey("mainUnit")).map(product -> product.get("mainUnit")).collect(Collectors.toList());
        if (!CollectionUtils.isEmpty(exchanges)) {
            for (Map<String, Object> exchange : exchanges) {
                if (null == exchange.get("assistUnit")) continue;
                unitIds.add(exchange.get("assistUnit"));
            }
        }
        QuerySchema schema = QuerySchema.create().addSelect("id, name, precision").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(unitIds)}));
        List billDOList = this.billQueryRepository.queryBySchema("pc.unit.Unit", schema);
        return billDOList.stream().collect(Collectors.toMap(UnitPO::getId, unitPO -> unitPO));
    }

    @NotNull
    private Map<String, Object> buildBusinessUnitMap(String productId, AssistUnitType type, UnitPO unitPO, BigDecimal mainUnitCount) {
        Map unitNameMap = unitPO.getName().toMap();
        String unitName = MultiLangUtils.getLocalValue((Object)unitNameMap);
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("productId", productId);
        map.put("unitExchangeType", 0);
        map.put("assistUnitCount", mainUnitCount);
        map.put("assistUnit", unitPO.getId());
        map.put("assistUnit_Name", unitName);
        map.put("assistUnit_Name2", unitNameMap.get(LanguagesEnum.en_US.getName()));
        map.put("assistUnit_Name3", unitNameMap.get(LanguagesEnum.zh_TW.getName()));
        map.put("assistUnit_Precision", unitPO.getPrecision());
        map.put("mainUnitCount", mainUnitCount);
        map.put("bizUnitType", type.toString());
        return map;
    }

    private void getUStockFieldValue(List<Map> products, Set<Long> productIds) throws Exception {
        List<Map> taxRateValues;
        Long startTime = System.currentTimeMillis();
        if (products == null || products.isEmpty()) {
            return;
        }
        String productApplyRangeIds = products.stream().map(map -> map.get("productApplyRangeId").toString()).collect(Collectors.joining(","));
        String productids = CollectionUtil.concat(productIds, (String)",");
        HashMap<String, Object> para = new HashMap<String, Object>(2);
        para.put("ytenant", AppContext.getYTenantId());
        para.put("productIds", productids);
        para.put("productApplyRangeIds", productApplyRangeIds);
        List productTaxRates = SqlHelper.selectList((String)"com.yonyoucloud.upc.product.dao.ProductQuery.getUStockFieldValue", para);
        Map<String, List<Map>> productTaxRatesMap = productTaxRates.stream().collect(Collectors.groupingBy(map -> map.get("productId").toString()));
        HashSet<Object> taxRates = new HashSet<Object>(100);
        productTaxRates.parallelStream().forEach(map -> {
            if (map.containsKey("outTaxrate") && map.get("outTaxrate") != null) {
                taxRates.add(map.get("outTaxrate"));
            }
            if (map.containsKey("inTaxrate") && map.get("inTaxrate") != null) {
                taxRates.add(map.get("inTaxrate"));
            }
        });
        Map<Object, Object> taxRateValuesMap = new HashMap(taxRates.size());
        if (!taxRates.isEmpty() && (taxRateValues = this.getCrossDomainFieldValues(taxRates, "archive.taxArchives.TaxRateArchive", "yonbip-fi-taxpubdoc", "ntaxrate", "code", "name")) != null && !taxRateValues.isEmpty()) {
            taxRateValuesMap = taxRateValues.stream().collect(Collectors.groupingBy(map -> map.get("id").toString()));
        }
        for (Map product : products) {
            List<Map> productTaxRate = productTaxRatesMap.get(product.get("productId").toString());
            Optional<Map> optionalMap = productTaxRate.stream().filter(map -> map.get("productApplyRangeId").toString().equals(product.get("productApplyRangeId").toString())).findAny();
            if (optionalMap.isPresent()) {
                for (Map.Entry entry : optionalMap.get().entrySet()) {
                    product.put(entry.getKey(), entry.getValue());
                }
            }
            if (product.get("inTaxrate") != null && taxRateValuesMap.keySet().contains(product.get("inTaxrate").toString())) {
                product.put("inTaxrate_Code", ((Map)((List)taxRateValuesMap.get(product.get("inTaxrate").toString())).get(0)).get("code"));
                product.put("inTaxrate_Name", ((Map)((List)taxRateValuesMap.get(product.get("inTaxrate").toString())).get(0)).get("name"));
                product.put("inTaxrate_Rate", ((Map)((List)taxRateValuesMap.get(product.get("inTaxrate").toString())).get(0)).get("ntaxrate"));
            }
            if (product.get("outTaxrate") == null || !taxRateValuesMap.keySet().contains(product.get("outTaxrate").toString())) continue;
            product.put("outTaxrate_Code", ((Map)((List)taxRateValuesMap.get(product.get("outTaxrate").toString())).get(0)).get("code"));
            product.put("outTaxrate_Name", ((Map)((List)taxRateValuesMap.get(product.get("outTaxrate").toString())).get(0)).get("name"));
            product.put("outTaxrate_Rate", ((Map)((List)taxRateValuesMap.get(product.get("outTaxrate").toString())).get(0)).get("ntaxrate"));
        }
        log.info("getUStockFieldValue take time: {}", (Object)(System.currentTimeMillis() - startTime));
    }

    @Override
    public Boolean checkCanModifyProductStopStatusOfApplier(String productId, Boolean stopStatus) throws Exception {
        if (this.getAppliedControlledByCreator().booleanValue()) {
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)productId), QueryCondition.name((String)"productDetail.isCreator").eq((Object)1)});
            Map map = MetaDaoHelper.queryOne((String)"pc.product.Product", (QuerySchema)QuerySchema.create().addSelect("productDetail.stopstatus as stopstatus").addCondition((ConditionExpression)queryConditionGroup));
            if (map == null || map.isEmpty()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801046, new Object[]{productId});
            }
            if (Boolean.valueOf(map.get("stopstatus").toString()).booleanValue()) {
                return stopStatus;
            }
            return true;
        }
        return true;
    }

    @Override
    public Boolean getAppliedControlledByCreator() throws Exception {
        Object result = com.yonyou.ucf.mdd.ext.option.util.OptionUtils.getOptionByName((String)"u8c-config", (String)"appliedControlledByCreator", null);
        return result == null || BooleanUtils.b((Object)result);
    }

    @Override
    public Boolean checkCouponProduct(Long productId, Long couponId) throws Exception {
        List list = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"couponId").eq((Object)couponId)})));
        if (null == list || list.isEmpty()) {
            return false;
        }
        if (list.size() > 1) {
            return true;
        }
        return !((Map)list.get(0)).get("id").equals(productId);
    }

    @Override
    public Map getProductInfoBySKUId(String skuId, String rangeId) throws Exception {
        Map map = MetaDaoHelper.queryOne((String)"pc.product.ProductSKU", (QuerySchema)QuerySchema.create().addSelect(new String[]{"productId.id as productId", "productId.productApplyRange.isCreator as isCreator", "productId.productApplyRange.orgId as orgId"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)skuId), QueryCondition.name((String)"productId.productApplyRange.id").eq((Object)rangeId)})));
        return map;
    }

    @Override
    public List<Map> getProductApplyRange(List<Long> products) throws Exception {
        List map = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").in(products)})));
        return map;
    }

    @Override
    public List getSpecByProductid(String productId) throws Exception {
        if (productId == null) {
            return null;
        }
        List listMap = SqlHelper.selectList((String)"com.yonyoucloud.upc.product.dao.ProductQuery.getSpecByProductid", (Object)productId);
        return listMap;
    }

    @Override
    public List<Map> getSpecFrees(List<Long> products) throws Exception {
        if (null == products) {
            return null;
        }
        List list = MetaDaoHelper.query((String)"pc.product.ProductCheckFreeNew", (QuerySchema)QuerySchema.create().addSelect(new String[]{"productId", "productApplyRangeId.orgId as orgId", "freeType", "freeId", "freeId.defineId as defineId"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").in(products), QueryCondition.name((String)"checked").eq((Object)true), QueryCondition.name((String)"isCreator").eq((Object)true)})));
        return list;
    }

    @Override
    public Map getCrossDomainFieldValue(Object id, String className, String domain, String valuekey) throws Exception {
        List result = MetaDaoHelper.query((String)className, (QuerySchema)QuerySchema.create().addSelect(new String[]{"id", valuekey}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(id)})), (String)domain);
        if (result == null || result.isEmpty()) {
            return null;
        }
        return (Map)result.get(0);
    }

    @Override
    public List<Map> getCrossDomainFieldValues(Set<Object> ids, String className, String domain, String ... valuekey) throws Exception {
        if (ids == null || ids.isEmpty()) {
            return null;
        }
        List result = MetaDaoHelper.query((String)className, (QuerySchema)QuerySchema.create().addSelect("id").addSelect(valuekey).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(ids)})), (String)domain);
        if (result == null || result.isEmpty()) {
            return null;
        }
        return result;
    }

    @Override
    public List<String> getCrossDomainIdsByMasterOrg(List<String> orgIds, String orgIdKey, String className, String domain) throws Exception {
        if (null == orgIds || orgIds.isEmpty()) {
            return null;
        }
        List<String> ids = MetaDaoHelper.query((String)className, (QuerySchema)QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)orgIdKey).in(orgIds)})), (String)domain).stream().map(map -> map.get("id").toString()).collect(Collectors.toList());
        log.info("getCrossDomainIdsByMasterOrg, orgIds:{}, orgIdKey:{}, className:{}, domain:{}, result:{}", new Object[]{orgIds, orgIdKey, className, domain, ids});
        return ids;
    }

    @Override
    public void setOrgs4U8c(Product product, Boolean singleOrg) throws Exception {
        if (ProductUtil.checkUserTyoe(AppContext.getCurrentUser()) == 1) {
            HashSet<String> orgs = new HashSet<String>();
            if (singleOrg.booleanValue()) {
                List<String> subOrgs = this.upcControlRuleService.getSubOrgs("666666");
                if ((subOrgs = subOrgs.stream().filter(orgId -> !orgId.equals("666666")).collect(Collectors.toList())).isEmpty() || subOrgs.size() > 1) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801047);
                }
                product.setOrgId(subOrgs.get(0));
                orgs.add(product.getOrgId());
            } else {
                if (null != product.getOrgId()) {
                    orgs.add(product.getOrgId());
                    if (!this.pubOptionService.getOrgGlobalShare("pc.product.Product").booleanValue()) {
                        Set<String> shareAll = this.orgPermissionsUtil.getShareOrgDetail4BillDate("pc.product.Product", product.getOrgId(), (BizObject)product);
                        orgs.addAll(shareAll);
                    }
                }
                this.handleProductOrgs(product, orgs);
            }
            List<Object> ranges = new ArrayList(orgs.size());
            if (orgs.size() > 0) {
                List<Map> result = this.upcControlRuleService.getOrgDetail(orgs);
                for (Map org : result) {
                    if (!org.get("externalorg").equals(0)) continue;
                    ProductApplyRange range = ProductUtil.buildProductApplyRange(null, 1, org.get("id").toString(), null);
                    range.remove("id");
                    range.remove("allocatorName");
                    range.remove("allocatorId");
                    range.remove("allocateTime");
                    range.put("orgId", org.get("id"));
                    range.put("orgCode", org.get("code"));
                    range.put("orgName", org.get("name"));
                    if (org.get("id").toString().equalsIgnoreCase(product.getOrgId())) {
                        range.setIsCreator(Boolean.valueOf(true));
                        range.setIsApplied(Boolean.valueOf(true));
                    }
                    ranges.add(range);
                }
                ranges = ranges.stream().sorted(Comparator.comparing(ProductApplyRange::getOrgId)).sorted(Comparator.comparing(ProductApplyRange::getIsCreator).reversed()).collect(Collectors.toList());
            }
            product.setProductOrgs(ranges);
        } else if (ProductUtil.checkUserTyoe(AppContext.getCurrentUser()) == 3) {
            product.setOrgId((String)AppContext.getCurrentUser().get("singleOrgId"));
            product.setShop(AppContext.getCurrentUser().getShop());
            ArrayList<ProductApplyRange> ranges = new ArrayList<ProductApplyRange>(1);
            ProductApplyRange range = ProductUtil.buildProductApplyRange(null, 3, product.getOrgId(), AppContext.getCurrentUser().getShop());
            range.remove("id");
            range.setIsCreator(Boolean.valueOf(true));
            range.setIsApplied(Boolean.valueOf(true));
            ranges.add(range);
            product.setProductShops(ranges);
        }
    }

    private void handleProductOrgs(Product product, Set<String> orgs) throws Exception {
        if (ProductUtil.AutoGenerateRangeData(product) && !CollectionUtils.isEmpty((Collection)product.productOrgs())) {
            if (ProductUtil.ForceControlApplyRange(product)) {
                Set orgRangeShareSet = this.orgPermissionsService.getShareOrgDetailByManageOrg4BillDate("pc.product.Product", product.getOrgId(), (BizObject)product);
                List productApplyRanges = product.productOrgs();
                if (!CollectionUtils.isEmpty((Collection)orgRangeShareSet)) {
                    for (ProductApplyRange item2 : productApplyRanges) {
                        if (!orgRangeShareSet.contains(item2.getOrgId())) continue;
                        orgs.add(item2.getOrgId());
                    }
                }
            } else {
                orgs.addAll(product.productOrgs().stream().map(item -> item.getOrgId()).collect(Collectors.toSet()));
            }
        }
    }

    @Override
    public Object getSystemOption(Object tenantId, String optionKey) throws Exception {
        Object isOpen = OptionUtils.getSystemOption((Object)tenantId, (String)optionKey);
        return isOpen;
    }

    @Override
    public Map<String, Object> getProductMultiLangFields(Map<String, Object> param) throws Exception {
        if (param == null) {
            return null;
        }
        param.put("ytenant", AppContext.getYTenantId());
        Map result = (Map)SqlHelper.selectOne((String)"com.yonyoucloud.upc.product.dao.ProductQuery.getProductMultiLangFields", param);
        return result;
    }

    @Override
    public List<Map> getProductDetailByOrg(List<Map> products) throws Exception {
        Long startTime = System.currentTimeMillis();
        log.info("getProductDetailByOrg recieve data: {}", products);
        ArrayList<Map> result = new ArrayList<Map>();
        if (products != null && !products.isEmpty()) {
            HashSet<String> productIds = new HashSet<String>(products.size());
            HashSet<String> orgIds = new HashSet<String>(products.size());
            for (Map product : products) {
                if (!product.containsKey("productId") || !product.containsKey("orgId")) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801048);
                }
                productIds.add(product.get("productId").toString());
                orgIds.add(product.get("orgId").toString());
            }
            List productsInDb = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)QuerySchema.create().addSelect(new String[]{"id", "code", "name"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(productIds)})));
            if (productsInDb.isEmpty()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801041, new Object[]{productIds});
            }
            Map<String, List<Map>> productsInDb_map = productsInDb.stream().collect(Collectors.groupingBy(map -> map.get("id").toString()));
            if (productsInDb_map.keySet().size() < productIds.size()) {
                HashSet productIdSet = new HashSet();
                productIds.forEach(a -> productIdSet.add(String.valueOf(a)));
                Set<String> productInDbSet = productsInDb_map.keySet();
                productIdSet.removeAll(productInDbSet);
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801041, new Object[]{Arrays.toString(ArrayUtils.toArray(productIdSet))});
            }
            ArrayList<Map> ranges = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)QuerySchema.create().addSelect(new String[]{"id as productApplyRangeId", "productId", "orgId"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").in(productIds), QueryCondition.name((String)"orgId").in(orgIds)})));
            if (ranges.isEmpty()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801049, new Object[]{productsInDb.stream().map(map -> map.get("code").toString()).collect(Collectors.toList())});
            }
            ArrayList<Map> rangeResult = new ArrayList<Map>();
            for (Map product : products) {
                for (Map map2 : ranges) {
                    if (!map2.get("productId").equals(product.get("productId")) || !map2.get("orgId").equals(product.get("orgId").toString())) continue;
                    rangeResult.add(map2);
                }
            }
            ranges = rangeResult;
            Map<String, List<Map>> rangesInDb = ranges.stream().collect(Collectors.groupingBy(map -> map.get("productId").toString()));
            Map<String, List<Map>> productDatas = products.stream().collect(Collectors.groupingBy(map -> map.get("productId").toString()));
            for (Map.Entry entry : productDatas.entrySet()) {
                if (!rangesInDb.keySet().contains(entry.getKey())) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801049, new Object[]{productsInDb_map.get(entry.getKey()).get(0).get("code")});
                }
                Set orgIdDatas = ((List)entry.getValue()).stream().map(map -> map.get("orgId").toString()).collect(Collectors.toSet());
                Set orgIdsInDb = rangesInDb.get(entry.getKey()).stream().map(map -> map.get("orgId").toString()).collect(Collectors.toSet());
                for (String org : orgIdDatas) {
                    if (orgIdsInDb.contains(org)) continue;
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801044, new Object[]{productsInDb_map.get(entry.getKey()).get(0).get("code"), org});
                }
            }
            log.info("getProductDetailByOrg pre process take time: {}", (Object)(System.currentTimeMillis() - startTime));
            result.addAll(ranges);
            this.getProductApplyRangeDetails(result, productIds);
        }
        Long endTime = System.currentTimeMillis();
        log.info("getProductDetailByOrg take time: {}", (Object)(endTime - startTime));
        return result;
    }

    private void getProductApplyRangeDetails(List<Map> products, Set<String> productIds) throws Exception {
        List<Map> productVendorValues;
        List<Map> taxRateValues;
        Long startTime = System.currentTimeMillis();
        if (products == null || products.isEmpty()) {
            return;
        }
        HashSet<String> productApplyRangeIds = new HashSet<String>(products.size());
        for (Map product : products) {
            productApplyRangeIds.add(product.get("productApplyRangeId").toString());
        }
        String productids = String.join((CharSequence)",", productIds);
        String productApplyRangeids = String.join((CharSequence)",", productApplyRangeIds);
        HashMap<String, Object> para = new HashMap<String, Object>(2);
        para.put("ytenant", AppContext.getYTenantId());
        para.put("productIds", productids);
        para.put("productApplyRangeIds", productApplyRangeids);
        List productTaxRates = SqlHelper.selectList((String)"com.yonyoucloud.upc.product.dao.ProductQuery.getProductApplyRangeDetails", para);
        Map<String, List<Map>> productTaxRatesMap = productTaxRates.stream().collect(Collectors.groupingBy(map -> map.get("productId").toString()));
        HashSet<Object> taxRates = new HashSet<Object>(100);
        HashSet<Object> productVendors = new HashSet<Object>(100);
        productTaxRates.parallelStream().forEach(map -> {
            if (map.containsKey("outTaxrate") && map.get("outTaxrate") != null) {
                taxRates.add(map.get("outTaxrate"));
            }
            if (map.containsKey("inTaxrate") && map.get("inTaxrate") != null) {
                taxRates.add(map.get("inTaxrate"));
            }
            if (map.containsKey("productVendor") && map.get("productVendor") != null) {
                productVendors.add(map.get("productVendor"));
            }
        });
        Map<Object, Object> taxRateValuesMap = new HashMap(taxRates.size());
        Map<Object, Object> productVendorsMap = new HashMap(productVendors.size());
        if (!taxRates.isEmpty() && (taxRateValues = this.getCrossDomainFieldValues(taxRates, "archive.taxArchives.TaxRateArchive", "yonbip-fi-taxpubdoc", "ntaxrate", "code", "name")) != null && !taxRateValues.isEmpty()) {
            taxRateValuesMap = taxRateValues.stream().collect(Collectors.groupingBy(map -> map.get("id").toString()));
        }
        if (!productVendors.isEmpty() && (productVendorValues = this.getCrossDomainFieldValues(productVendors, "aa.vendor.Vendor", "yssupplier", "id", "code", "name")) != null && !productVendorValues.isEmpty()) {
            productVendorsMap = productVendorValues.stream().collect(Collectors.groupingBy(map -> map.get("id").toString()));
        }
        for (Map product : products) {
            List<Map> productTaxRate = productTaxRatesMap.get(product.get("productId").toString());
            Optional<Map> optionalMap = productTaxRate.stream().filter(map -> map.get("productApplyRangeId").toString().equals(product.get("productApplyRangeId").toString())).findAny();
            if (optionalMap.isPresent()) {
                for (Map.Entry entry : optionalMap.get().entrySet()) {
                    product.put(entry.getKey(), entry.getValue());
                }
            }
            if (product.get("inTaxrate") != null && taxRateValuesMap.keySet().contains(product.get("inTaxrate").toString())) {
                product.put("inTaxrate_Code", ((Map)((List)taxRateValuesMap.get(product.get("inTaxrate").toString())).get(0)).get("code"));
                product.put("inTaxrate_Name", ((Map)((List)taxRateValuesMap.get(product.get("inTaxrate").toString())).get(0)).get("name"));
                product.put("inTaxrate_Rate", ((Map)((List)taxRateValuesMap.get(product.get("inTaxrate").toString())).get(0)).get("ntaxrate"));
            }
            if (product.get("outTaxrate") != null && taxRateValuesMap.keySet().contains(product.get("outTaxrate").toString())) {
                product.put("outTaxrate_Code", ((Map)((List)taxRateValuesMap.get(product.get("outTaxrate").toString())).get(0)).get("code"));
                product.put("outTaxrate_Name", ((Map)((List)taxRateValuesMap.get(product.get("outTaxrate").toString())).get(0)).get("name"));
                product.put("outTaxrate_Rate", ((Map)((List)taxRateValuesMap.get(product.get("outTaxrate").toString())).get(0)).get("ntaxrate"));
            }
            if (product.get("productVendor") == null || !productVendorsMap.keySet().contains(product.get("productVendor").toString())) continue;
            product.put("productVendor_Code", ((Map)((List)productVendorsMap.get(product.get("productVendor").toString())).get(0)).get("code"));
            product.put("productVendor_Name", ((Map)((List)productVendorsMap.get(product.get("productVendor").toString())).get(0)).get("name"));
        }
        log.info("getProductApplyRangeDetails take time: {}", (Object)(System.currentTimeMillis() - startTime));
    }

    @Override
    public List<Map> getProductApplyRangeByProductAndOrgId(Long productId, String orgId) throws Exception {
        List map = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)QuerySchema.create().addSelect(new String[]{"id", "productId", "orgId", "isApplied", "isCreator"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId), QueryCondition.name((String)"orgId").eq((Object)orgId)})));
        return map;
    }
}


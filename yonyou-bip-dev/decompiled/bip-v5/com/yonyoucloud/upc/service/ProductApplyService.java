/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.alibaba.fastjson.JSONArray
 *  com.alibaba.fastjson.JSONObject
 *  com.alibaba.fastjson.parser.Feature
 *  com.alibaba.fastjson.serializer.SerializerFeature
 *  com.yonyou.diwork.ott.exexutors.RobotExecutors
 *  com.yonyou.hrcloud.employeedoc.addressbook.BaseResponse
 *  com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.po.productapply.MaterialApplyPO
 *  com.yonyou.iuap.apdoc.coredoc.sqlconstant.material.DataUpdateSQLConstant
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.billcode.model.QueryBillNumberParam
 *  com.yonyou.iuap.billcode.po.BillNumberPO
 *  com.yonyou.iuap.billcode.service.IBillNumberService
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.fileservice.sdk.module.CooperationFileService
 *  com.yonyou.iuap.metadata.api.itf.MetadataSupportService
 *  com.yonyou.iuap.metadata.api.model.base.IEntity
 *  com.yonyou.iuap.org.dto.BizDeptDTO
 *  com.yonyou.iuap.org.dto.ConditionDTO
 *  com.yonyou.iuap.org.dto.OrgUnitDTO
 *  com.yonyou.iuap.org.service.itf.core.IBizDeptQueryService
 *  com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService
 *  com.yonyou.iuap.staff.model.StaffInfoListDto
 *  com.yonyou.iuap.staff.model.StaffInfoQueryParam
 *  com.yonyou.iuap.staff.service.StaffInfoQueryService
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.iuap.yms.api.IYmsJdbcApi
 *  com.yonyou.iuap.yms.api.YmsJdbcApiProvider
 *  com.yonyou.iuap.yms.factory.YmsJdbcApiProviderFactory
 *  com.yonyou.iuap.yms.param.BaseEntity
 *  com.yonyou.iuap.yms.param.ResultSetProcessor
 *  com.yonyou.iuap.yms.param.SQLParameter
 *  com.yonyou.iuap.yms.processor.BeanListProcessor
 *  com.yonyou.iuap.yms.transaction.YmsTransactionTemplate
 *  com.yonyou.uap.billcode.BillCodeComponentParam
 *  com.yonyou.uap.billcode.BillCodeContext
 *  com.yonyou.uap.billcode.BillCodeField
 *  com.yonyou.uap.billcode.BillCodeObj
 *  com.yonyou.uap.billcode.service.IBillCodeComponentService
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.uimeta.ui.Entity
 *  com.yonyou.ucf.mdd.common.model.uimeta.ui.ViewModel
 *  com.yonyou.ucf.mdd.ext.bill.biz.IBillNumberSdkServiceImpl
 *  com.yonyou.ucf.mdd.ext.bill.common.BillCodeFieldUtils
 *  com.yonyou.ucf.mdd.ext.bill.common.BizObjCodeUtils
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList
 *  com.yonyou.ucf.mdd.ext.bpm.model.VerifyState
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.meta.UIMetaUtils
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyou.ucf.mdd.ext.poi.service.ImportCacheService
 *  com.yonyou.ucf.mdd.ext.poi.util.CalculationUtil
 *  com.yonyou.ucf.mdd.ext.util.BillContextUtils
 *  com.yonyou.ucf.mdd.ext.util.RedisTool
 *  com.yonyou.ucf.mdd.ext.voucher.enums.Status
 *  com.yonyoucloud.upc.attrcontrol.DocAttributeControlConfigDTO
 *  com.yonyoucloud.upc.common.AddRangeMessage
 *  com.yonyoucloud.upc.data.product.ProductGroupDao
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductApplyRange
 *  com.yonyoucloud.upc.pc.productapply.EffectStatus
 *  com.yonyoucloud.upc.pc.productapply.EffectType
 *  com.yonyoucloud.upc.pc.productapply.ProductApply
 *  com.yonyoucloud.upc.pc.productapply.ProductApplyAddRange
 *  com.yonyoucloud.upc.pc.productapply.ProductApplyType
 *  com.yonyoucloud.upc.service.attrcontrol.DocAttributeControlConfigService
 *  com.yonyoucloud.upc.utils.RedisLockKeyConstants
 *  org.apache.commons.collections4.ListUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.biz.base.Objectlizer
 *  org.imeta.core.lang.BooleanUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.BeanUtils
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Component
 *  org.springframework.transaction.annotation.Propagation
 *  org.springframework.transaction.annotation.Transactional
 *  org.springframework.transaction.support.TransactionSynchronization
 *  org.springframework.transaction.support.TransactionSynchronizationAdapter
 *  org.springframework.transaction.support.TransactionSynchronizationManager
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.yonyou.diwork.ott.exexutors.RobotExecutors;
import com.yonyou.hrcloud.employeedoc.addressbook.BaseResponse;
import com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.po.productapply.MaterialApplyPO;
import com.yonyou.iuap.apdoc.coredoc.sqlconstant.material.DataUpdateSQLConstant;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.billcode.model.QueryBillNumberParam;
import com.yonyou.iuap.billcode.po.BillNumberPO;
import com.yonyou.iuap.billcode.service.IBillNumberService;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.fileservice.sdk.module.CooperationFileService;
import com.yonyou.iuap.metadata.api.itf.MetadataSupportService;
import com.yonyou.iuap.metadata.api.model.base.IEntity;
import com.yonyou.iuap.org.dto.BizDeptDTO;
import com.yonyou.iuap.org.dto.ConditionDTO;
import com.yonyou.iuap.org.dto.OrgUnitDTO;
import com.yonyou.iuap.org.service.itf.core.IBizDeptQueryService;
import com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService;
import com.yonyou.iuap.staff.model.StaffInfoListDto;
import com.yonyou.iuap.staff.model.StaffInfoQueryParam;
import com.yonyou.iuap.staff.service.StaffInfoQueryService;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.iuap.yms.api.IYmsJdbcApi;
import com.yonyou.iuap.yms.api.YmsJdbcApiProvider;
import com.yonyou.iuap.yms.factory.YmsJdbcApiProviderFactory;
import com.yonyou.iuap.yms.param.BaseEntity;
import com.yonyou.iuap.yms.param.ResultSetProcessor;
import com.yonyou.iuap.yms.param.SQLParameter;
import com.yonyou.iuap.yms.processor.BeanListProcessor;
import com.yonyou.iuap.yms.transaction.YmsTransactionTemplate;
import com.yonyou.uap.billcode.BillCodeComponentParam;
import com.yonyou.uap.billcode.BillCodeContext;
import com.yonyou.uap.billcode.BillCodeField;
import com.yonyou.uap.billcode.BillCodeObj;
import com.yonyou.uap.billcode.service.IBillCodeComponentService;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.uimeta.ui.Entity;
import com.yonyou.ucf.mdd.common.model.uimeta.ui.ViewModel;
import com.yonyou.ucf.mdd.ext.bill.biz.IBillNumberSdkServiceImpl;
import com.yonyou.ucf.mdd.ext.bill.common.BillCodeFieldUtils;
import com.yonyou.ucf.mdd.ext.bill.common.BizObjCodeUtils;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList;
import com.yonyou.ucf.mdd.ext.bpm.model.VerifyState;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.meta.UIMetaUtils;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyou.ucf.mdd.ext.poi.service.ImportCacheService;
import com.yonyou.ucf.mdd.ext.poi.util.CalculationUtil;
import com.yonyou.ucf.mdd.ext.util.BillContextUtils;
import com.yonyou.ucf.mdd.ext.util.RedisTool;
import com.yonyou.ucf.mdd.ext.voucher.enums.Status;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.attrcontrol.DocAttributeControlConfigDTO;
import com.yonyoucloud.upc.cache.BizCache;
import com.yonyoucloud.upc.common.AddRangeMessage;
import com.yonyoucloud.upc.data.product.ProductGroupDao;
import com.yonyoucloud.upc.datarule.ProductTplService;
import com.yonyoucloud.upc.event.EventService2;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductApplyRange;
import com.yonyoucloud.upc.pc.productapply.EffectStatus;
import com.yonyoucloud.upc.pc.productapply.EffectType;
import com.yonyoucloud.upc.pc.productapply.ProductApply;
import com.yonyoucloud.upc.pc.productapply.ProductApplyAddRange;
import com.yonyoucloud.upc.pc.productapply.ProductApplyType;
import com.yonyoucloud.upc.service.attrcontrol.DocAttributeControlConfigService;
import com.yonyoucloud.upc.service.product.ProductAddRangeHandleService;
import com.yonyoucloud.upc.service.product.ProductAddRangeService;
import com.yonyoucloud.upc.service.productapply.ProductApplyUpdateService;
import com.yonyoucloud.upc.utils.RedisLockKeyConstants;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.apache.commons.collections4.ListUtils;
import org.apache.commons.lang3.StringUtils;
import org.imeta.biz.base.Objectlizer;
import org.imeta.core.lang.BooleanUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationAdapter;
import org.springframework.transaction.support.TransactionSynchronizationManager;
import org.springframework.util.CollectionUtils;

@Component(value="productApplyService")
@Transactional(rollbackFor={Throwable.class})
public class ProductApplyService {
    private static final Logger log = LoggerFactory.getLogger(ProductApplyService.class);
    @Autowired
    @Qualifier(value="pc.BillService")
    private IUPCBillService billService;
    @Autowired
    BizCache cache;
    @Autowired
    private EventService2 eventService2;
    @Autowired
    private IBillCodeComponentService billCodeComponentService;
    @Autowired
    private IBillNumberService billCodeRuleMgrService;
    @Autowired
    ProductTplService productTplService;
    @Autowired
    private YmsTransactionTemplate ymsTransactionTemplate;
    @Autowired
    CooperationFileService cooperationFileService;
    @Autowired
    private MetadataSupportService metadataSupportService;
    @Autowired
    StaffInfoQueryService staffInfoQueryService;
    @Autowired
    IBizDeptQueryService bizDeptQueryService;
    @Autowired
    private ProductAddRangeService productAddRangeService;
    @Autowired
    DocAttributeControlConfigService docAttributeControlConfigService;
    @Autowired
    ProductApplyUpdateService productApplyUpdateService;
    @Autowired
    private IYmsJdbcApi ymsJdbcApi;
    @Autowired
    ProductGroupDao productGroupDao;
    @Autowired
    private IOrgUnitQueryService iOrgUnitQueryService;
    @Autowired
    private IUPCControlRuleService upcControlRuleService;
    @Autowired
    ProductAddRangeHandleService productAddRangeHandleService;
    @Autowired
    IBillNumberSdkServiceImpl billNumberSdkService;
    static final Map<String, String> fieldMappingForMCSetManage = new HashMap<String, String>();

    public void auditAddApply(ProductApply productApply) throws Exception {
        HashMap<String, Object> detail = new HashMap<String, Object>(64);
        Map productData = (Map)JSONObject.parseObject((String)productApply.getProductData(), Map.class);
        productData.put("needUpdateCode", false);
        detail.putAll(productData);
        detail.put("_status", EntityStatus.Insert);
        detail.put("creatorId", productApply.getCreatorId());
        detail.put("creator", productApply.getCreator());
        detail.put("detail!creatorId", productApply.getCreatorId());
        detail.put("detail!creator", productApply.getCreator());
        QuerySchema schema = QuerySchema.create().addSelect("yhtUserId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)productApply.getCreatorId())}));
        List results = MetaDaoHelper.query((String)"base.user.User", (QuerySchema)schema, (String)"bip-usercenter");
        if (!CollectionUtils.isEmpty((Collection)results)) {
            detail.put("businessLogCreatorYhtUserId", ((Map)results.get(0)).get("yhtUserId"));
        }
        detail.put("sourceMarker", "productApply");
        detail.put("allocatorId", productApply.getCreatorId());
        detail.put("allocatorName", productApply.getCreator());
        this.saveApplyProductData(productApply, detail);
    }

    public void auditModifyApply(ProductApply productApply) throws Exception {
        Map productData = (Map)JSONObject.parseObject((String)productApply.getProductData(), Map.class, (Feature[])new Feature[]{Feature.IgnoreNotMatch});
        if (null != productData.get("productApplyRange_OrgId")) {
            List range = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)QuerySchema.create().addSelect(new String[]{"id", "isCreator", "isApplied"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(productData.get("id")), QueryCondition.name((String)"orgId").eq(productData.get("productApplyRange_OrgId"))})));
            if (null == range || range.isEmpty()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800772, new Object[]{productApply.getApplyCode()});
            }
            HashMap params = new HashMap(3);
            params.put("@productApplyRangeId", ((Map)range.get(0)).get("id"));
            params.put("isCreator", ((Map)range.get(0)).get("isCreator"));
            params.put("isApplied", ((Map)range.get(0)).get("isApplied"));
            BillDataDto bill = new BillDataDto("pc_productdetail", productApply.getApplyProductId().toString());
            bill.setMapCondition(params);
            Map detail = this.billService.detail(bill);
            HashMap originDetail = new HashMap();
            originDetail.putAll(detail);
            productApply.setOriginProductData(JSON.toJSONStringWithDateFormat(originDetail, (String)"yyyy-MM-dd HH:mm:ss", (SerializerFeature[])new SerializerFeature[]{SerializerFeature.WriteDateUseDateFormat, SerializerFeature.WriteMapNullValue}));
            detail.put("isCreator", ((Map)range.get(0)).get("isCreator"));
            detail.put("isApplied", ((Map)range.get(0)).get("isApplied"));
            detail.put("_status", EntityStatus.Update);
            detail.putAll(productData);
            detail.put("needUpdateCode", false);
            detail.put("productApplyRangeId", ((Map)range.get(0)).get("id"));
            this.processDetailStatus(detail, ((Map)range.get(0)).get("id").toString());
            detail.put("detail!modifier", productApply.getCreator());
            detail.put("detail!modifierId", productApply.getCreatorId());
            QuerySchema schema = QuerySchema.create().addSelect("yhtUserId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)productApply.getCreatorId())}));
            List results = MetaDaoHelper.query((String)"base.user.User", (QuerySchema)schema, (String)"bip-usercenter");
            if (!CollectionUtils.isEmpty((Collection)results)) {
                detail.put("businessLogCreatorYhtUserId", ((Map)results.get(0)).get("yhtUserId"));
            }
            detail.put("sourceMarker", "productApply");
            if (productData.get("orgId").equals(productData.get("productApplyRange_OrgId"))) {
                detail.put("modifierId", productApply.getCreatorId());
                detail.put("modifier", productApply.getCreator());
            }
            detail.put("allocatorId", productApply.getCreatorId());
            detail.put("allocatorName", productApply.getCreator());
            detail.remove("url");
            this.checkProductAssistUnitExchange(detail);
            this.saveProductApplyProductDataByProductDetail(productApply, detail);
        }
    }

    private void processDetailStatus(Map detail, String productApplyRangeId) throws Exception {
        if (detail.get("orgId").equals(detail.get("productApplyRange_OrgId"))) {
            return;
        }
        List productDetail = MetaDaoHelper.query((String)"pc.product.ProductDetail", (QuerySchema)QuerySchema.create().addSelect(new String[]{"id", "productId", "productApplyRangeId"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productApplyRangeId").eq((Object)productApplyRangeId)})));
        if (CollectionUtils.isEmpty((Collection)productDetail)) {
            detail.put("detail!_status", EntityStatus.Insert);
            detail.put("time!_status", EntityStatus.Insert);
        } else {
            detail.put("detail!_status", EntityStatus.Update);
            detail.put("time!_status", EntityStatus.Update);
        }
    }

    private void updateProductCode(Map product, String code) {
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("productid", product.get("id"));
        params.put("ytenant", AppContext.getYTenantId());
        params.put("productCode", code);
        try {
            SqlHelper.update((String)"com.yonyoucloud.upc.product.dao.ProductUpdate.updateProductCode", params);
        }
        catch (Exception e) {
            log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080168", (String)"\u66f4\u65b0product code\u5931\u8d25"), (Throwable)e);
        }
    }

    private boolean existProductAssistUnitExchange(Long productId, Long assistUnitId) {
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("productId", productId);
        params.put("assistUnitId", assistUnitId);
        params.put("ytenant", AppContext.getYTenantId());
        try {
            Map result = (Map)SqlHelper.selectFirst((String)"com.yonyoucloud.upc.product.dao.ProductQuery.QueryProductAssistUnitExchange", params);
            if (null == result || result.isEmpty()) {
                return false;
            }
        }
        catch (Exception e) {
            log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408016E", (String)"\u67e5\u8be2\u8f85\u52a9\u8ba1\u91cf\u5931\u8d25"), (Throwable)e);
        }
        return true;
    }

    private void checkProductAssistUnitExchange(Map product) {
        JSONArray exchanges = (JSONArray)product.get("productAssistUnitExchanges");
        if (null == exchanges || exchanges.isEmpty()) {
            return;
        }
        Long productId = 0L;
        try {
            productId = Long.valueOf(product.get("id").toString());
        }
        catch (NumberFormatException e) {
            log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080154", (String)"\u83b7\u53d6productID\u9519\u8bef:"), (Throwable)e);
        }
        ListIterator li = exchanges.listIterator();
        while (li.hasNext()) {
            JSONObject node = (JSONObject)li.next();
            if (!"Insert".equals(node.getString("_status")) || !this.existProductAssistUnitExchange(productId, node.getLong("assistUnit"))) continue;
            li.remove();
        }
        if (exchanges.isEmpty()) {
            product.remove("productAssistUnitExchanges");
        }
    }

    private String getOriginProductCode(Long productId, Map product) {
        if (null == productId) {
            return "";
        }
        if (null != product.get("formerCode") && !product.get("formerCode").toString().isEmpty()) {
            return product.get("formerCode").toString();
        }
        HashMap<String, Long> params = new HashMap<String, Long>();
        String productCode = "";
        params.put("productId", productId);
        Map result = (Map)SqlHelper.selectFirst((String)"com.yonyoucloud.upc.product.dao.ProductQuery.QueryProductCode", params);
        if (null != result.get("code")) {
            productCode = result.get("code").toString();
        }
        return productCode;
    }

    private boolean isValidProductCode(String productcode) throws Exception {
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("code", productcode);
        params.put("ytenant", AppContext.getYTenantId());
        Map result2 = (Map)SqlHelper.selectFirst((String)"com.yonyoucloud.upc.product.dao.ProductQuery.QueryByCode", params);
        if (null != result2 && !result2.isEmpty()) {
            return false;
        }
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id,applyCode,productCode,effectStatus,applyType");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productCode").eq((Object)productcode), QueryCondition.name((String)"effectStatus").in(new Object[]{String.valueOf(EffectStatus.pending.getValue()), String.valueOf(EffectStatus.dealing.getValue())})}));
        List productApplyList = MetaDaoHelper.query((String)"pc.productapply.ProductApply", (QuerySchema)querySchema, null);
        return CollectionUtils.isEmpty((Collection)productApplyList);
    }

    private boolean isValidProductCodeForEdit(String productCode, Long productApplyId) throws Exception {
        if (productApplyId == null) {
            productApplyId = 0L;
        }
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("code", productCode);
        params.put("ytenant", AppContext.getYTenantId());
        Map result2 = (Map)SqlHelper.selectFirst((String)"com.yonyoucloud.upc.product.dao.ProductQuery.QueryByCode", params);
        if (null != result2 && !result2.isEmpty()) {
            return false;
        }
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id,applyCode,productCode,effectStatus,applyType");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productCode").eq((Object)productCode), QueryCondition.name((String)"id").not_eq((Object)productApplyId), QueryCondition.name((String)"effectStatus").in(new Object[]{String.valueOf(EffectStatus.pending.getValue()), String.valueOf(EffectStatus.dealing.getValue())})}));
        List productApplyList = MetaDaoHelper.queryObject((String)"pc.productapply.ProductApply", (QuerySchema)querySchema, null);
        return CollectionUtils.isEmpty((Collection)productApplyList);
    }

    private String generateNewCode(Map product, Long productApplyId) throws Exception {
        List codeList;
        String billNum = "pc_product";
        BillCodeObj[] billCodeObj = new BillCodeObj[]{new BillCodeObj(product)};
        BillCodeContext context = this.billCodeComponentService.getBillCodeContext(new BillCodeComponentParam("pc.product.Product", billNum, AppContext.getCurrentUser().getYxyTenantId(), product.get("orgId").toString(), "pc.product.Product", billCodeObj));
        Integer billnumMode = context.getBillnumMode();
        if (null != billnumMode && billnumMode == 0 && null != product.get("code")) {
            if (!this.isValidProductCodeForEdit(String.valueOf(product.get("code")), productApplyId)) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800773);
            }
            return product.get("code").toString();
        }
        if (null != billnumMode && billnumMode == 2 && null != product.get("code")) {
            BillNumberPO billNumberPO;
            Integer handleWorkDuplicatePolicy;
            if (this.isValidProductCodeForEdit(String.valueOf(product.get("code")), productApplyId)) {
                BillCodeObj billObj = new BillCodeObj(product);
                this.billCodeComponentService.commitBillCode(billNum, product.get("code").toString(), AppContext.getCurrentUser().getYxyTenantId(), "", product.get("orgId").toString(), false, billObj);
                return product.get("code").toString();
            }
            Object billNumber = context.getBillNumber();
            if (null != billNumber && billNumber instanceof BillNumberPO && null != (handleWorkDuplicatePolicy = (billNumberPO = (BillNumberPO)billNumber).getHandleWorkDuplicatePolicy()) && 1 == handleWorkDuplicatePolicy) {
                String msg1 = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17EBFDDA0588003D", (String)"\u7269\u6599\u7f16\u7801");
                String msg2 = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040808B3", (String)"\u7f16\u7801\u91cd\u590d");
                throw new CoreDocBusinessException(null, msg1 + "\uff1a" + msg2);
            }
        }
        if (!CollectionUtils.isEmpty((Collection)(codeList = this.billNumberSdkService.generateBillCode("pc.product.Product", billNum, billNum, "productcenter", Collections.singletonList(product))))) {
            return (String)codeList.get(0);
        }
        throw new RuntimeException("\u8c03\u7528generateBillCode\u751f\u6210\u7f16\u7801\u5931\u8d25\uff0c\u8bf7\u8054\u7cfb\u5f00\u53d1\u6392\u67e5\uff01");
    }

    private String getCodeFromCodeService(Map product, String billNum, Long productApplyId) throws Exception {
        BillNumberPO bn;
        QueryBillNumberParam param;
        String newBillNum;
        String codeField;
        int limit = 10;
        int count = 0;
        String code = "";
        BizObject bizObject = new BizObject(product);
        BillContext billContext = BillContextUtils.getBillContext((String)billNum);
        String fullname = billContext.getFullname();
        IEntity entity = null;
        try {
            entity = this.metadataSupportService.getEntityByUri(fullname);
        }
        catch (Exception e) {
            log.error("find entity error.");
        }
        String domain = entity != null ? entity.getDomain() : null;
        String bizObjCode = BizObjCodeUtils.getBizObjCode((String)billNum, (String)domain);
        List codeFields = BillCodeFieldUtils.getCodeFieldListByEntity((IEntity)entity);
        for (BillCodeField billCodeField : codeFields) {
            codeField = billCodeField.getFieldName();
            newBillNum = billNum;
            if (!"isCode".equals(billCodeField.getTermCode())) {
                newBillNum = (billNum + "|" + codeField).trim();
            }
            param = new QueryBillNumberParam(false, newBillNum, bizObjCode, InvocationInfoProxy.getOrgId());
            bn = this.billCodeRuleMgrService.findCompleteBillNumberByBill(param, bizObject == null ? null : new BillCodeObj((Map)bizObject));
            code = this.billCodeComponentService.getBillCodeForMddRule(bizObjCode, bn.getCbillnum(), bn.getAutoid(), bn.getCode(), bn.getOrgId(), fullname, AppContext.getCurrentUser().getYxyTenantId(), "", bizObject == null || bizObject.isEmpty() ? null : new BillCodeObj((Map)bizObject), true);
        }
        while (!this.isValidProductCodeForEdit(code, productApplyId)) {
            if (count >= limit) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800773);
            }
            for (BillCodeField billCodeField : codeFields) {
                codeField = billCodeField.getFieldName();
                newBillNum = billNum;
                if (!"isCode".equals(billCodeField.getTermCode())) {
                    newBillNum = (billNum + "|" + codeField).trim();
                }
                param = new QueryBillNumberParam(false, newBillNum, bizObjCode, InvocationInfoProxy.getOrgId());
                bn = this.billCodeRuleMgrService.findCompleteBillNumberByBill(param, bizObject == null ? null : new BillCodeObj((Map)bizObject));
                code = this.billCodeComponentService.getBillCodeForMddRule(bizObjCode, bn.getCbillnum(), bn.getAutoid(), bn.getCode(), bn.getOrgId(), fullname, AppContext.getCurrentUser().getYxyTenantId(), "", bizObject == null || bizObject.isEmpty() ? null : new BillCodeObj((Map)bizObject), true);
            }
            ++count;
        }
        return code;
    }

    public void saveApplyProductData(ProductApply productApply, Map detail) throws Exception {
        String originCode = "";
        boolean updateCode = false;
        try {
            originCode = detail.get("code").toString();
            Object needUpdateCode = detail.get("needUpdateProductCode");
            boolean bl = updateCode = needUpdateCode != null && Boolean.valueOf(needUpdateCode.toString()) == false;
            if (updateCode && null != detail.get("code2")) {
                originCode = detail.get("code2").toString();
                detail.put("code", originCode);
            }
        }
        catch (Exception e) {
            log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408016A", (String)"\u4fdd\u5b58product\u9519\u8bef"), (Throwable)e);
        }
        detail.remove("pubts");
        detail.remove("detail!pubts");
        detail.remove("createTime");
        detail.remove("createDate");
        detail.remove("modifyDate");
        detail.remove("modifyTime");
        detail.remove("stoptime");
        detail.remove("auditTime");
        detail.remove("auditDate");
        detail.remove("detail!createDate");
        detail.remove("detail!createTime");
        detail.remove("detail!modifyDate");
        detail.remove("detail!modifyTime");
        if (StringUtils.isNotEmpty((CharSequence)((String)detail.get("detail!saleChannel")))) {
            detail.put("useSku", 1);
        }
        if (detail.get("productTemplate") != null && StringUtils.isNotEmpty((CharSequence)detail.get("productTemplate").toString()) && this.productTplService.isSkuSens(Long.valueOf(detail.get("productTemplate").toString()))) {
            detail.put("useSku", 1);
        }
        this.processInspectionCtrlPoint(detail);
        String escape = JSON.toJSONStringWithDateFormat((Object)detail, (String)"yyyy-MM-dd HH:mm:ss", (SerializerFeature[])new SerializerFeature[]{SerializerFeature.WriteDateUseDateFormat, SerializerFeature.WriteMapNullValue});
        BillDataDto saveDto = new BillDataDto();
        saveDto.setData((Object)escape);
        saveDto.setBillnum("pc_product");
        RuleExecuteResult result = (RuleExecuteResult)this.ymsTransactionTemplate.executeInRequiredNew(() -> {
            try {
                return this.billService.executeUpdate("save", saveDto);
            }
            catch (Exception e) {
                RuleExecuteResult errorResult = new RuleExecuteResult();
                errorResult.setMessage(e.getMessage());
                errorResult.setMsgCode(999);
                log.error("\u7269\u6599\u7533\u8bf7\u5355\u751f\u6210\u7269\u6599\u62a5\u9519", (Object)e.getMessage());
                return errorResult;
            }
        });
        if (result.getMsgCode() != 1) {
            productApply.setFailInfo(result.getMessage());
            productApply.setEffectStatus(EffectStatus.fail);
            if (result.getMessage().length() > 500) {
                productApply.setFailInfo(result.getMessage().substring(0, 500));
            } else {
                productApply.setFailInfo(result.getMessage());
            }
            log.error("\u7269\u6599\u7533\u8bf7\u5355\u751f\u6210\u7269\u6599\u62a5\u9519", (Object)result.getMessage());
            productApply.setEffectStatus(EffectStatus.fail);
        } else {
            productApply.setEffectStatus(EffectStatus.success);
            Map product = (Map)result.getData();
            Object code = product.get("code");
            String productId = String.valueOf(product.get("id"));
            if (null != code) {
                JSONArray jsonArray;
                List deleteList;
                if (updateCode && product.containsKey("needUpdateCode")) {
                    this.updateProductCode(product, originCode);
                    code = originCode;
                }
                Map productData = (Map)JSONObject.parseObject((String)productApply.getProductData(), Map.class, (Feature[])new Feature[]{Feature.IgnoreNotMatch});
                productData.put("code", code);
                productData.put("id", productId);
                productData.put("productApplyRange_OrgId", product.get("orgId"));
                productData.put("productApplyRange_OrgId_Name", product.get("orgId_Name"));
                ProductApply applyParam = new ProductApply();
                applyParam.setProductCode(code.toString());
                applyParam.setProductData(JSON.toJSONStringWithDateFormat((Object)productData, (String)"yyyy-MM-dd HH:mm:ss", (SerializerFeature[])new SerializerFeature[]{SerializerFeature.WriteDateUseDateFormat, SerializerFeature.WriteMapNullValue}));
                applyParam.setId(productApply.getId());
                applyParam.setEntityStatus(EntityStatus.Update);
                applyParam.setApplyProductId(Long.valueOf(productId));
                BizObject productBizObject = Objectlizer.convert((Map)product, (String)"pc.product.Product");
                MetaDaoHelper.update((String)"pc.productapply.ProductApply", (BizObject)applyParam);
                if (productData.get("_ecsuite_temp") != null) {
                    this.cooperationFileService.deleteFileByBusiness("iuap-apdoc-material", productId);
                    this.cooperationFileService.changeBusinessId("iuap-apdoc-material", productData.get("_ecsuite_temp").toString(), productId);
                }
                if (productData.get("_deleteList") != null && !CollectionUtils.isEmpty((Collection)(deleteList = (jsonArray = (JSONArray)productData.get("_deleteList")).toJavaList(String.class)))) {
                    this.cooperationFileService.deleteBatchFiles("iuap-apdoc-material", productId, deleteList);
                }
            }
        }
        this.productApplyUpdateService.updateEffectStatus(productApply);
    }

    public void saveProductApplyProductDataByProductDetail(ProductApply productApply, Map detail) throws Exception {
        this.processDetail(detail);
        String escape = JSON.toJSONStringWithDateFormat((Object)detail, (String)"yyyy-MM-dd HH:mm:ss", (SerializerFeature[])new SerializerFeature[]{SerializerFeature.WriteDateUseDateFormat, SerializerFeature.WriteMapNullValue});
        BillDataDto saveDto = new BillDataDto();
        saveDto.setData((Object)escape);
        String originProductCode = detail.get("code").toString();
        if (detail.get("orgId").equals(detail.get("productApplyRange_OrgId"))) {
            saveDto.setBillnum("pc_product");
        } else {
            saveDto.setBillnum("pc_productdetail");
        }
        RuleExecuteResult result = (RuleExecuteResult)this.ymsTransactionTemplate.executeInRequiredNew(() -> {
            try {
                return this.billService.executeUpdate("save", saveDto);
            }
            catch (Exception e) {
                RuleExecuteResult errorResult = new RuleExecuteResult();
                errorResult.setMessage(e.getMessage());
                errorResult.setMsgCode(999);
                log.error("\u7269\u6599\u7533\u8bf7\u5355\u751f\u6210\u7269\u6599\u62a5\u9519", (Object)e.getMessage());
                return errorResult;
            }
        });
        if (result.getMsgCode() != 1) {
            productApply.setFailInfo(result.getMessage());
            productApply.setEffectStatus(EffectStatus.fail);
            if (result.getMessage().length() > 500) {
                productApply.setFailInfo(result.getMessage().substring(0, 500));
            } else {
                productApply.setFailInfo(result.getMessage());
            }
            log.error("\u7269\u6599\u7533\u8bf7\u5355\u751f\u6210\u7269\u6599\u62a5\u9519", (Object)result.getMessage());
            productApply.setEffectStatus(EffectStatus.fail);
        } else {
            productApply.setEffectStatus(EffectStatus.success);
            Map product = (Map)result.getData();
            Object code = product.get("code");
            String productId = String.valueOf(product.get("id"));
            if (null != code) {
                Map productData = (Map)JSONObject.parseObject((String)productApply.getProductData(), Map.class, (Feature[])new Feature[]{Feature.IgnoreNotMatch});
                if (product.containsKey("needUpdateCode")) {
                    this.updateProductCode(product, originProductCode);
                }
                productData.put("code", originProductCode);
                productData.put("id", productId);
                ProductApply applyParam = new ProductApply();
                applyParam.setProductCode(originProductCode);
                applyParam.setProductData(JSON.toJSONStringWithDateFormat((Object)productData, (String)"yyyy-MM-dd HH:mm:ss", (SerializerFeature[])new SerializerFeature[]{SerializerFeature.WriteDateUseDateFormat, SerializerFeature.WriteMapNullValue}));
                applyParam.setId(productApply.getId());
                applyParam.setOriginProductData(productApply.getOriginProductData());
                applyParam.setEntityStatus(EntityStatus.Update);
                MetaDaoHelper.update((String)"pc.productapply.ProductApply", (BizObject)applyParam);
                if (productData.get("orgId").equals(productData.get("productApplyRange_OrgId"))) {
                    JSONArray jsonArray;
                    List deleteList;
                    if (productData.get("_ecsuite_temp") != null) {
                        this.cooperationFileService.deleteFileByBusiness("iuap-apdoc-material", productId);
                        this.cooperationFileService.changeBusinessId("iuap-apdoc-material", productData.get("_ecsuite_temp").toString(), productId);
                    }
                    if (productData.get("_deleteList") != null && !CollectionUtils.isEmpty((Collection)(deleteList = (jsonArray = (JSONArray)productData.get("_deleteList")).toJavaList(String.class)))) {
                        this.cooperationFileService.deleteBatchFiles("iuap-apdoc-material", productId, deleteList);
                    }
                }
            }
        }
        this.productApplyUpdateService.updateEffectStatus(productApply);
    }

    private void processDetail(Map detail) {
        detail.remove("pubts");
        detail.remove("detail!pubts");
        detail.remove("createTime");
        detail.remove("createDate");
        detail.remove("modifyDate");
        detail.remove("modifyTime");
        detail.remove("stoptime");
        detail.remove("auditTime");
        detail.remove("auditDate");
        detail.remove("detail!modifyDate");
        detail.remove("detail!modifyTime");
        detail.remove("description");
        if (!detail.get("orgId").equals(detail.get("productApplyRange_OrgId"))) {
            detail.put("isCreator", false);
            if (EntityStatus.Update.equals(detail.get("detail!_status"))) {
                detail.remove("productOrgs");
            }
        }
        this.processInspectionCtrlPoint(detail);
    }

    public boolean compareEffectTime(Date effectTime) {
        long millis;
        long time = effectTime.getTime();
        return time <= (millis = System.currentTimeMillis());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void scanProductApplyAuditAndNotSuccess() {
        String requestId = UUID.randomUUID().toString();
        try {
            if (RedisTool.tryGetLock((String)"timing_lock_productapply_key", (String)requestId, (int)UPCConstants.LOCK_EXPIRE_TIME)) {
                YmsJdbcApiProvider ymsJdbcApiProvider = YmsJdbcApiProviderFactory.getYmsJdbcApiProvider();
                Supplier federalYmsJdbcApi = ymsJdbcApiProvider.getFederalYmsJdbcApi("iuap-apdoc-material_main_dataSource");
                List iYmsJdbcApis = (List)federalYmsJdbcApi.get();
                for (IYmsJdbcApi ymsJdbcApi : iYmsJdbcApis) {
                    List materialApplyPOList = ymsJdbcApi.queryForList(DataUpdateSQLConstant.getPendingProductApply, (ResultSetProcessor)new BeanListProcessor((BaseEntity)new MaterialApplyPO()));
                    StringBuffer idBuffer = new StringBuffer();
                    if (materialApplyPOList.isEmpty()) continue;
                    materialApplyPOList.forEach(materialApplyPO -> idBuffer.append(materialApplyPO.getId()).append(","));
                    String idString = "(" + idBuffer.substring(0, idBuffer.length() - 1) + ")";
                    ymsJdbcApi.update(DataUpdateSQLConstant.productApplyUpdateEffectStatus + idString);
                    materialApplyPOList.forEach(materialApplyPO -> this.sendEventForAudit((MaterialApplyPO)materialApplyPO, materialApplyPO.getYtenant(), materialApplyPO.getCreatorId().toString()));
                }
            }
        }
        catch (Exception e) {
            log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080161", (String)"com.yonyoucloud.upc.service.ProductApplyService.scanProductApplyAuditAndNotSuccess \u53d1\u9001\u4e8b\u4ef6\u5931\u8d25"), (Throwable)e);
        }
        finally {
            RedisTool.releaseLock((String)"timing_lock_productapply_key", (String)requestId);
        }
    }

    @Transactional(rollbackFor={Throwable.class}, propagation=Propagation.REQUIRES_NEW)
    public void dealAddProductSuitOrgFromProductApply(AddRangeMessage addRangeMessage) throws Exception {
        ProductApply productApply = (ProductApply)MetaDaoHelper.findById((String)"pc.productapply.ProductApply", (Object)addRangeMessage.getProductApplyId());
        if (productApply != null && !CollectionUtils.isEmpty((Collection)productApply.productApplyAddRanges())) {
            Product product = this.productGroupDao.getProductById(addRangeMessage.getId());
            if (product == null || product.isEmpty()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800866);
            }
            List<String> authOrgIdList = this.upcControlRuleService.getUserOrgAndVoucherManageOrg("pc.product.Product", "pc_product");
            if (CollectionUtils.isEmpty(authOrgIdList) || !authOrgIdList.contains(product.getOrgId())) {
                List funcOrgesByCodeList = this.iOrgUnitQueryService.getByCondition(AppContext.getYhtTenantId().toString(), ConditionDTO.newOrgCondition().andIdIn(Collections.singletonList(product.getOrgId())).withEnabled());
                String orgNmae = product.getOrgId();
                if (!CollectionUtils.isEmpty((Collection)funcOrgesByCodeList)) {
                    orgNmae = ((OrgUnitDTO)funcOrgesByCodeList.get(0)).toMultiLang().getName().toString();
                }
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800867, new Object[]{orgNmae});
            }
            List<Map<String, Object>> proApplyRangeList = ProductAddRangeHandleService.getProductApplyRangeList((Long)product.getId());
            List orgsInDb = proApplyRangeList.stream().map(map -> map.get("orgId").toString()).collect(Collectors.toList());
            List productApplyAddRangeOrgIds = productApply.productApplyAddRanges().stream().map(productApplyAddRange -> productApplyAddRange.getOrgId()).collect(Collectors.toList());
            HashSet orgsInDbSet = new HashSet(orgsInDb);
            HashSet<String> orgsWillSave = new HashSet<String>(productApplyAddRangeOrgIds);
            orgsWillSave.removeAll(orgsInDbSet);
            if (!CollectionUtils.isEmpty(orgsWillSave)) {
                this.productAddRangeHandleService.saveProductApplyRange((Long)product.getId(), orgsWillSave, "1", addRangeMessage.getAllocatorId(), addRangeMessage.getAllocatorName());
            }
        }
    }

    @Transactional(rollbackFor={Throwable.class}, propagation=Propagation.REQUIRES_NEW)
    public boolean auditOrgDetailApply(ProductApplyAddRange productApplyAddRange) throws Exception {
        Map productData = (Map)JSONObject.parseObject((String)productApplyAddRange.getProductOrgData(), Map.class, (Feature[])new Feature[]{Feature.IgnoreNotMatch});
        if (null != productData.get("productApplyRange_OrgId")) {
            List range = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)QuerySchema.create().addSelect(new String[]{"id", "isCreator", "isApplied"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(productData.get("id")), QueryCondition.name((String)"orgId").eq(productData.get("productApplyRange_OrgId"))})));
            if (null == range || range.isEmpty()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800772, (Object[])productApplyAddRange.get("productApplyCode"));
            }
            HashMap params = new HashMap(3);
            params.put("@productApplyRangeId", ((Map)range.get(0)).get("id"));
            params.put("isCreator", ((Map)range.get(0)).get("isCreator"));
            params.put("isApplied", ((Map)range.get(0)).get("isApplied"));
            BillDataDto bill = new BillDataDto("pc_productdetail", productApplyAddRange.get("productId").toString());
            bill.setMapCondition(params);
            Map detail = this.billService.detail(bill);
            detail.put("isCreator", ((Map)range.get(0)).get("isCreator"));
            detail.put("isApplied", ((Map)range.get(0)).get("isApplied"));
            detail.put("_status", EntityStatus.Update);
            detail.putAll(productData);
            detail.put("needUpdateCode", false);
            detail.put("productApplyRangeId", ((Map)range.get(0)).get("id"));
            this.processDetailStatus(detail, ((Map)range.get(0)).get("id").toString());
            detail.put("detail!modifier", productApplyAddRange.get("creator"));
            detail.put("detail!modifierId", productApplyAddRange.get("creatorId"));
            QuerySchema schema = QuerySchema.create().addSelect("yhtUserId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(productApplyAddRange.get("creatorId"))}));
            List results = MetaDaoHelper.query((String)"base.user.User", (QuerySchema)schema, (String)"bip-usercenter");
            if (!CollectionUtils.isEmpty((Collection)results)) {
                detail.put("businessLogCreatorYhtUserId", ((Map)results.get(0)).get("yhtUserId"));
            }
            detail.put("sourceMarker", "productApply");
            detail.put("allocatorId", productApplyAddRange.get("creatorId"));
            detail.put("allocatorName", productApplyAddRange.get("creator"));
            detail.remove("url");
            this.checkProductAssistUnitExchange(detail);
            RuleExecuteResult productResult = this.saveOrgProductDetail(detail);
            this.updateProductAddRangeStatus(productApplyAddRange, productResult);
            if (productResult.getMsgCode() == 1) {
                return true;
            }
        }
        return false;
    }

    private void updateProductAddRangeStatus(ProductApplyAddRange productApplyAddRange, RuleExecuteResult productResult) {
        if (productResult.getMsgCode() != 1) {
            String partialSuccessInfo = "";
            partialSuccessInfo = productResult.getMessage().length() > 500 ? productResult.getMessage().substring(0, 500) : productResult.getMessage();
            log.error("\u7269\u6599\u7533\u8bf7\u5355\u5206\u914d\u7ec4\u7ec7\u751f\u6210\u7ec4\u7ec7\u7ea7\u7269\u6599\u62a5\u9519", (Object)productResult.getMessage());
            SQLParameter parameter = new SQLParameter();
            parameter.addParam(CoreDocBusinessErrorEnum.PRODUCT_APPLY_ADD_RANGE_PARTIAL_SUCCESS_INFO.getMultilingualMessage(new Object[]{partialSuccessInfo}));
            parameter.addParam(productApplyAddRange.getId().toString());
            this.ymsJdbcApi.update(DataUpdateSQLConstant.productApplyAddRangeUpdatePartialSuccessInfo, parameter);
        }
    }

    private RuleExecuteResult saveOrgProductDetail(Map detail) {
        this.processDetail(detail);
        String escape = JSON.toJSONStringWithDateFormat((Object)detail, (String)"yyyy-MM-dd HH:mm:ss", (SerializerFeature[])new SerializerFeature[]{SerializerFeature.WriteDateUseDateFormat, SerializerFeature.WriteMapNullValue});
        BillDataDto saveDto = new BillDataDto();
        saveDto.setData((Object)escape);
        String originProductCode = detail.get("code").toString();
        saveDto.setBillnum("pc_productdetail");
        RuleExecuteResult productResult = (RuleExecuteResult)this.ymsTransactionTemplate.executeInRequiredNew(() -> {
            try {
                return this.billService.executeUpdate("save", saveDto);
            }
            catch (Exception e) {
                RuleExecuteResult errorResult = new RuleExecuteResult();
                errorResult.setMessage(e.getMessage());
                errorResult.setMsgCode(999);
                log.error("\u7269\u6599\u7533\u8bf7\u5355\u751f\u6210\u7269\u6599\u62a5\u9519", (Object)e.getMessage());
                return errorResult;
            }
        });
        return productResult;
    }

    public void updateProductApplyAddRangeStatusByProductApplyId(Long productApplyId, String partialSuccessInfo) {
        SQLParameter parameter = new SQLParameter();
        parameter.addParam(partialSuccessInfo);
        parameter.addParam((Object)productApplyId);
        this.ymsJdbcApi.update(DataUpdateSQLConstant.productApplyAddRangeUpdatePartialSuccessInfoByProductApplyId, parameter);
    }

    @Transactional(rollbackFor={Throwable.class}, propagation=Propagation.REQUIRED)
    public void processProductApplyAudit(final MaterialApplyPO materialApplyPO) throws Exception {
        final String yhtTenantId = materialApplyPO.getYtenant();
        if (materialApplyPO.getEffectStatus() != null && (EffectStatus.dealing.getValue() == materialApplyPO.getEffectStatus().intValue() || EffectStatus.fail.getValue() == materialApplyPO.getEffectStatus().intValue() || VerifyState.COMPLETED.getValue() == materialApplyPO.getVerifystate().shortValue() && EffectStatus.pending.getValue() == materialApplyPO.getEffectStatus().intValue())) {
            materialApplyPO.setEffectStatus(Integer.valueOf(EffectStatus.dealing.getValue()));
            if (null != materialApplyPO.getId() && null != materialApplyPO.getEffectStatus()) {
                SqlHelper.update((String)"com.yonyoucloud.upc.mapper.productapply.updateEffectStatus", (Object)materialApplyPO);
            }
        }
        TransactionSynchronizationManager.registerSynchronization((TransactionSynchronization)new TransactionSynchronization(){

            public void afterCommit() {
                if (EffectStatus.dealing.getValue() == materialApplyPO.getEffectStatus().intValue()) {
                    ProductApplyService.this.sendEventForAudit(materialApplyPO, yhtTenantId, materialApplyPO.getCreatorId().toString());
                }
            }
        });
    }

    public void processProductApplyAudit(Object ids) throws Exception {
        String[] reIds;
        if (null == ids) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800774);
        }
        for (String id : reIds = ids.toString().split(",")) {
            ProductApply applyParam = new ProductApply();
            applyParam.setId((Object)id);
            ProductApply apply = (ProductApply)SqlHelper.selectOne((String)"com.yonyoucloud.upc.mapper.productapply.getProductApplyByConditions", (Object)applyParam);
            MaterialApplyPO materialApply = new MaterialApplyPO();
            BeanUtils.copyProperties((Object)apply, (Object)materialApply);
            materialApply.setEffectStatus(Integer.valueOf(apply.get("effectStatus").toString()));
            materialApply.setId((Long)apply.getId());
            materialApply.setYtenant(apply.getYtenantId());
            this.processProductApplyAudit(materialApply);
        }
    }

    public void auditAddApplyById(Long id) throws Exception {
        ProductApply applyParam = new ProductApply();
        applyParam.setId((Object)id);
        ProductApply apply = (ProductApply)SqlHelper.selectOne((String)"com.yonyoucloud.upc.mapper.productapply.getProductApplyByConditions", (Object)applyParam);
        String effectStatus = apply.get("effectStatus").toString();
        boolean isDoing = String.valueOf(EffectStatus.dealing.getValue()).equals(effectStatus);
        log.error(String.format("\u975e\u62a5\u9519\u4fe1\u606f\uff0c\u7269\u6599\u7533\u8bf7\u5355\u6536\u5230\u5ba1\u6279\u4e8b\u4ef6\uff0cid = %s\uff0ceffectStatus = %s\uff0c[0\u672a\u5904\u7406\uff0c1\u5904\u7406\u4e2d\uff0c2\u5904\u7406\u6210\u529f\uff0c3\u5904\u7406\u5931\u8d25]", id.toString(), effectStatus));
        if (!isDoing) {
            return;
        }
        if (ProductApplyType.add == apply.getApplyType()) {
            this.auditAddApply(apply);
        } else if (ProductApplyType.modify == apply.getApplyType()) {
            this.auditModifyApply(apply);
        } else if (ProductApplyType.ADD_RANGE == apply.getApplyType()) {
            this.auditProductApplyAddRange(apply);
        }
    }

    public void auditProductApplyAddRange(ProductApply apply) throws Exception {
        ProductApply applyUpdate = new ProductApply();
        applyUpdate.setId(apply.getId());
        try {
            this.productAddRangeService.sendProductApplyAddRange(apply);
        }
        catch (Exception e) {
            applyUpdate.setFailInfo(e.getMessage());
            applyUpdate.setEffectStatus(EffectStatus.fail);
            applyUpdate.setEntityStatus(EntityStatus.Update);
            MetaDaoHelper.update((String)"pc.productapply.ProductApply", (BizObject)applyUpdate);
            log.error("auditProductApplyAddRange_error:", (Throwable)e);
        }
    }

    public void updateEffectStatus(MaterialApplyPO materialApplyPO) throws Exception {
        if (null != materialApplyPO.getId() && null != materialApplyPO.getEffectStatus()) {
            SqlHelper.update((String)"com.yonyoucloud.upc.mapper.productapply.updateEffectStatus", (Object)materialApplyPO);
        }
    }

    public void fillInsertData(ProductApply productApply) {
        if (EntityStatus.Insert == productApply.getEntityStatus()) {
            productApply.setApplyTime(new Date());
            productApply.setEffectStatus(EffectStatus.pending);
            if (null == productApply.getEffectType()) {
                productApply.setEffectType(EffectType.immediately);
            }
            short verifystatus = 0;
            productApply.setVerifystate(Short.valueOf(verifystatus));
            productApply.setStatus(Status.newopen);
        }
    }

    public void fillInfoData(ProductApply productApply, int action) throws Exception {
        String productData = productApply.getProductData();
        if (null != productData) {
            Map product = (Map)JSONObject.parseObject((String)productData, Map.class, (Feature[])new Feature[]{Feature.IgnoreNotMatch});
            if (product.get("description!description") != null && product.get("description!description").toString().contains("&quot;mdf_rich_text")) {
                log.error(String.format("fillInfoData\u5b57\u7b26\u4e32\u8f6c\u4e3amap\uff0c\u7269\u6599\u7533\u8bf7\u5355\u7269\u6599\u63cf\u8ff0\u6570\u636e\u8f6c\u6362\u5f02\u5e38\uff0c\u7533\u8bf7\u7f16\u7801{%s}\uff0c\u539f\u59cb\u7269\u6599\u6570\u636e{%s}\uff0c\u8f6c\u6362\u540e\u7269\u6599\u6570\u636e{%s}", productApply.getApplyCode(), productData, product));
            }
            String code = this.fillProductCode(product, productApply.getEntityStatus(), productApply.getApplyType(), productApply.getApplyProductId(), (Long)productApply.getId());
            if (null == product.get("productOrgs")) {
                LoginUser user = AppContext.getCurrentUser();
                Object orgId = product.get("orgId");
                ArrayList<ProductApplyRange> ranges = new ArrayList<ProductApplyRange>();
                ProductApplyRange range = new ProductApplyRange();
                switch (user.getUserType()) {
                    case TenantAdmin: 
                    case TenantEmployee: {
                        range.setRangeType(Integer.valueOf(1));
                        range.setOrgId(orgId.toString());
                        break;
                    }
                    case JoinUser: 
                    case TenantShopuser: {
                        range.setRangeType(Integer.valueOf(2));
                        range.setCustomerId(Long.valueOf(Long.parseLong(orgId.toString())));
                        break;
                    }
                    case ShopAdminUser: 
                    case ShopUser: {
                        range.setRangeType(Integer.valueOf(3));
                        range.setShopId(Long.valueOf(Long.parseLong(orgId.toString())));
                        break;
                    }
                }
                range.setIsCreator(Boolean.valueOf(true));
                range.setIsApplied(Boolean.valueOf(true));
                range.setEntityStatus(EntityStatus.Insert);
                ranges.add(range);
                productApply.setProductData(JSON.toJSONStringWithDateFormat((Object)product, (String)"yyyy-MM-dd HH:mm:ss", (SerializerFeature[])new SerializerFeature[]{SerializerFeature.WriteDateUseDateFormat, SerializerFeature.WriteMapNullValue}));
            }
            product.remove("pubts");
            product.remove("createTime");
            product.remove("createDate");
            product.remove("modifyTime");
            product.remove("modifyDate");
            product.remove("creator");
            product.remove("modifier");
            product.remove("creatorId");
            product.remove("modifierId");
            product.remove("isDeleted");
            product.remove("stopstatus");
            product.remove("stoptime");
            product.remove("auditor");
            product.remove("auditorId");
            product.remove("auditTime");
            product.remove("auditDate");
            product.remove("_status");
            product.put("code", code);
            product.put("code2", code);
            product.put("formerCode", code);
            product.put("needUpdateProductCode", false);
            Object applyId = productApply.getId();
            productApply.putAll(product);
            for (String key : product.keySet()) {
                Object value = product.get(key);
                key = key.indexOf("!") > -1 ? "applyProductId." + key.replaceAll("!", ".") : "applyProductId." + key;
                productApply.put(key, value);
            }
            productApply.setId(applyId);
            productApply.setProductCode(code);
            product.remove("resubmitCheckKey");
            this.processInspectionCtrlPoint(product);
            String productString = JSON.toJSONStringWithDateFormat((Object)product, (String)"yyyy-MM-dd HH:mm:ss", (SerializerFeature[])new SerializerFeature[]{SerializerFeature.WriteDateUseDateFormat, SerializerFeature.WriteMapNullValue});
            productApply.setProductData(productString);
            if (product.get("description!description") != null && productString.contains("&quot;mdf_rich_text")) {
                log.error(String.format("fillInfoData\u5c06map\u8f6c\u4e3a\u5b57\u7b26\u4e32\uff0c\u7269\u6599\u7533\u8bf7\u5355\u7269\u6599\u63cf\u8ff0\u6570\u636e\u8f6c\u6362\u5f02\u5e38\uff0c\u7533\u8bf7\u7f16\u7801{%s}\uff0c\u539f\u59cb\u7269\u6599\u6570\u636e{%s}\uff0c\u8f6c\u6362\u540e\u7269\u6599\u6570\u636e{%s}", productApply.getApplyCode(), product, productString));
            }
            productApply.set("productName", product.get("name"));
            if (1 == action) {
                this.setRangeOrg(productApply, product);
            }
        }
    }

    private void processInspectionCtrlPoint(Map<String, Object> product) {
        if (BooleanUtil.isFalse((Object)product.get("detail!inspectionType"))) {
            product.put("detail!inspectionControlPoint", null);
        }
        if (BooleanUtil.isFalse((Object)product.get("detail!productInspection"))) {
            product.put("detail!productInspectionCtrlPoint", null);
        }
        if (BooleanUtil.isFalse((Object)product.get("detail!productFirstInspection"))) {
            product.put("detail!firstInspectionCtrlMethod", null);
        }
        if (!product.containsKey("detail!deliveryMethod") || null == product.get("detail!deliveryMethod") || StringUtils.isEmpty((CharSequence)product.get("detail!deliveryMethod").toString())) {
            product.put("detail!deliveryMethod", "1,2,3");
        }
        if (!product.containsKey("detail!deliveryMethod") || null == product.get("detail!deliveryMethod") || StringUtils.isEmpty((CharSequence)product.get("detail!deliveryMethod").toString())) {
            product.put("detail!deliveryMethod", "1,2,3");
        }
    }

    private void setRangeOrg(ProductApply productApply, Map product) throws Exception {
        if (null == productApply.getApplyProductApplyRangeId()) {
            productApply.setRangeOrgId(product.get("orgId").toString());
        } else {
            BizObject range = MetaDaoHelper.getById((String)"pc.product.ProductApplyRange", (Long)productApply.getApplyProductApplyRangeId());
            if (range == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800775);
            }
            productApply.setRangeOrgId((String)range.get("orgId"));
        }
    }

    private String fillProductCode(Map product, EntityStatus entityStatus, ProductApplyType productApplyType, Long productId, Long productApplyId) throws Exception {
        String code = "";
        String failReturnCode = "";
        String originProductCode = this.getOriginProductCode(productId, product);
        if (ProductApplyType.modify == productApplyType) {
            if (null != product.get("code")) {
                code = product.get("code").toString();
                if (!originProductCode.isEmpty() && !code.equals(originProductCode)) {
                    code = this.generateNewCode(product, productApplyId);
                    failReturnCode = originProductCode;
                }
            }
        } else {
            QuerySchema querySchema = QuerySchema.create().addSelect("productCode").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)productApplyId)}));
            Map productApplyDB = MetaDaoHelper.queryOne((String)"pc.productapply.ProductApply", (QuerySchema)querySchema);
            if (!EntityStatus.Insert.equals((Object)entityStatus) && productApplyDB != null && !productApplyDB.isEmpty() && product.get("code").toString().equals(productApplyDB.get("productCode").toString())) {
                return product.get("code").toString();
            }
            if (productApplyDB != null && !productApplyDB.isEmpty()) {
                failReturnCode = productApplyDB.get("productCode").toString();
            }
            code = this.generateNewCode(product, productApplyId);
        }
        this.returnCode(code, failReturnCode, product);
        return code;
    }

    private void returnCode(final String newCode, final String oldCode, final Map originalBillMap) {
        TransactionSynchronizationManager.registerSynchronization((TransactionSynchronization)new TransactionSynchronizationAdapter(){

            public void afterCompletion(int status) {
                if (0 == status) {
                    if (oldCode != null && !oldCode.isEmpty()) {
                        ProductApplyService.this.billNumberSdkService.returnBillCode("pc_product", "pc_product", "productcenter.pc_product", oldCode, originalBillMap);
                    }
                } else if (newCode != null && !newCode.isEmpty()) {
                    ProductApplyService.this.billNumberSdkService.returnBillCode("pc_product", "pc_product", "productcenter.pc_product", newCode, originalBillMap);
                }
            }
        });
    }

    public void sendEventForAudit(MaterialApplyPO materialApplyPO, String tenantId, String userId) {
        log.error(String.format("\u975e\u62a5\u9519\u4fe1\u606f\uff0c\u7269\u6599\u7533\u8bf7\u5355\u51c6\u5907\u53d1\u9001\u5ba1\u6279\u4e8b\u4ef6\uff1atenantid=%s\uff0cproductapplyid=%s", tenantId, materialApplyPO.getId()));
        ProductApply productapplyData = new ProductApply();
        productapplyData.setId((Object)materialApplyPO.getId());
        HashMap<String, Object> userObject = new HashMap<String, Object>(2);
        HashMap<String, String> context = new HashMap<String, String>(2);
        context.put("userId", userId);
        context.put("yhtTenantId", tenantId);
        userObject.put("productapplyData", productapplyData);
        userObject.put("productapplyContext", context);
        Runnable runnable = () -> {
            try {
                this.eventService2.sendEvent("YXYBASEDOC", "EVENT_PRODUCTAPPLY_AUDIT", userObject);
                log.error(String.format("\u975e\u62a5\u9519\u4fe1\u606f\uff0c\u7269\u6599\u7533\u8bf7\u5355\u53d1\u9001\u5ba1\u6279\u4e8b\u4ef6\uff1atenantid=%s\uff0cproductapplyid=%s", tenantId, materialApplyPO.getId()));
            }
            catch (Exception e) {
                log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408015A", (String)"\u53d1\u9001\u4e8b\u4ef6\u5931\u8d25"), (Throwable)e);
            }
        };
        RobotExecutors.runAs((String)tenantId, (Runnable)runnable);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void eventOnAudit(Map bill) throws Exception {
        log.error("\u975e\u62a5\u9519\u4fe1\u606f\uff0c\u7269\u6599\u7533\u8bf7\u5355\u63a5\u6536\u5230\u5ba1\u6279\u4e8b\u4ef6\uff0ccom.yonyoucloud.upc.service.ProductApplyService.eventOnAudit:", (Object)bill);
        if (null == bill || null == bill.get("userObject")) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800137);
        }
        JSONObject obj = JSONObject.parseObject((String)bill.get("userObject").toString());
        Map productapplydata = (Map)obj.get((Object)"productapplyData");
        long id = Long.parseLong(productapplydata.get("id").toString());
        String lockKey = RedisLockKeyConstants.PRODUCT_APPLY_RESEND + id;
        String requestId = UUID.randomUUID().toString();
        int tryLockNum = 0;
        try {
            while (true) {
                if (tryLockNum > 120) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800776);
                }
                ++tryLockNum;
                if (RedisTool.tryGetLock((String)lockKey, (String)requestId, (int)UPCConstants.LOCK_EXPIRE_TIME)) {
                    this.auditAddApplyById(id);
                    break;
                }
                TimeUnit.MILLISECONDS.sleep(200L);
            }
        }
        catch (Exception e) {
            log.error("com.yonyoucloud.upc.service.ProductApplyService.eventOnAudit:", (Throwable)e);
            ProductApply productApply = new ProductApply();
            productApply.setId((Object)id);
            productApply.setFailInfo(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080166", (String)"\u5904\u7406\u7269\u6599\u6570\u636e\u5f02\u5e38\uff1a") + e.getMessage());
            productApply.setEffectStatus(EffectStatus.fail);
            this.productApplyUpdateService.updateEffectStatus(productApply);
        }
        finally {
            RedisTool.releaseLock((String)lockKey, (String)requestId);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void syncAudit(Long productApplyId) throws Exception {
        String lockKey = RedisLockKeyConstants.PRODUCT_APPLY_RESEND + productApplyId;
        String requestId = UUID.randomUUID().toString();
        int tryLockNum = 0;
        try {
            while (true) {
                if (tryLockNum > 120) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800776);
                }
                ++tryLockNum;
                if (RedisTool.tryGetLock((String)lockKey, (String)requestId, (int)UPCConstants.LOCK_EXPIRE_TIME)) {
                    this.auditAddApplyById(productApplyId);
                    break;
                }
                TimeUnit.MILLISECONDS.sleep(200L);
            }
        }
        catch (Exception e) {
            log.error("com.yonyoucloud.upc.service.ProductApplyService.syncAudit:", (Throwable)e);
            ProductApply productApply = new ProductApply();
            productApply.setId((Object)productApplyId);
            productApply.setFailInfo(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080166", (String)"\u5904\u7406\u7269\u6599\u6570\u636e\u5f02\u5e38\uff1a") + e.getMessage());
            productApply.setEffectStatus(EffectStatus.fail);
            this.productApplyUpdateService.updateEffectStatus(productApply);
        }
        finally {
            RedisTool.releaseLock((String)lockKey, (String)requestId);
        }
    }

    public ResultList importModifyProductApply(Map<String, Object> datas, String asyncKey) throws Exception {
        ResultList resultList = new ResultList();
        Object productApply = datas.get("ProductApply");
        if (null != productApply) {
            List dataList = (List)productApply;
            resultList.setCount(dataList.size());
            if (dataList.size() == 0) {
                this.setSuccessCache(asyncKey);
            } else {
                for (Map data : dataList) {
                    ProductApply apply = new ProductApply();
                    Product product = new Product();
                    try {
                        apply.setApplyType(ProductApplyType.modify);
                        apply.setEntityStatus(EntityStatus.Insert);
                        this.checkFieldIsnull(data);
                        this.checkFieldIsLegal(data);
                        this.copyData(data, (Map<String, Object>)apply, (Map<String, Object>)product);
                        this.fillApplyForiegnId(apply, product);
                        this.checkApplyStatus(apply);
                        Map productMap = this.fillProductData(apply, product);
                        String productJson = JSON.toJSONStringWithDateFormat((Object)productMap, (String)"yyyy-MM-dd HH:mm:ss", (SerializerFeature[])new SerializerFeature[]{SerializerFeature.WriteDateUseDateFormat, SerializerFeature.WriteMapNullValue});
                        apply.setProductData(productJson);
                        RuleExecuteResult result = this.saveProductApply(apply);
                        if (result.getMsgCode() != 1) {
                            resultList.incFailCount();
                            resultList.addMessage((Object)result.getMessage());
                        } else {
                            resultList.incSucessCount();
                            resultList.addInfo(result.getData());
                        }
                    }
                    catch (Exception e) {
                        resultList.incFailCount();
                        resultList.addMessage((Object)e.getMessage());
                    }
                    if (!StringUtils.isNotEmpty((CharSequence)asyncKey)) continue;
                    this.handleNotEventImportResult(asyncKey, resultList);
                }
                if (StringUtils.isNotEmpty((CharSequence)asyncKey)) {
                    this.handleNotEventImportResult(asyncKey, resultList);
                }
            }
        } else {
            this.setSuccessCache(asyncKey);
        }
        return resultList;
    }

    private void handleNotEventImportResult(String asynKey, ResultList resultList) {
        Map<String, Object> processMap = this.buildResultMap(resultList, "pc_productapply");
        AppContext.cache().set(asynKey, JSON.toJSONString(processMap));
        List msgList = resultList.getMessages();
        if (msgList == null || msgList.size() == 0) {
            return;
        }
        List subDatas = ListUtils.partition((List)msgList, (int)50);
        for (int i = 0; i < subDatas.size(); ++i) {
            ImportCacheService.getInstance().saveHandleResultMsg2Cache(asynKey, "_submsg_" + i, (List)subDatas.get(i));
        }
    }

    private void checkApplyStatus(ProductApply apply) throws Exception {
        if (EntityStatus.Update == apply.getEntityStatus() && null != apply.getId()) {
            ProductApply applyParam = new ProductApply();
            applyParam.setId(apply.getId());
            ProductApply productApply = (ProductApply)SqlHelper.selectOne((String)"com.yonyoucloud.upc.mapper.productapply.getProductApplyByConditions", (Object)applyParam);
            if (null != productApply && !"0".equals(productApply.get("status")) && !"0".equals(productApply.getVerifystate().toString())) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800777);
            }
        } else {
            apply.setEffectType(EffectType.immediately);
            this.setApplyBizOperator((Map)apply);
        }
    }

    private void checkFieldIsLegal(Map<String, Object> data) throws Exception {
        if (null != data.get("detail!safetyStock") && !this.isNumeric(data.get("detail!safetyStock"))) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800778);
        }
        if (null != data.get("detail!highestStock") && !this.isNumeric(data.get("detail!highestStock"))) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800779);
        }
        if (null != data.get("detail!lowestStock") && !this.isNumeric(data.get("detail!lowestStock"))) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800780);
        }
        if (null != data.get("detail!highestStock") && null != data.get("detail!lowestStock") && new BigDecimal(data.get("detail!lowestStock").toString()).compareTo(new BigDecimal(data.get("detail!highestStock").toString())) > 0) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800781);
        }
        if (null != data.get("detail!ropStock") && !this.isNumeric(data.get("detail!ropStock"))) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800782);
        }
        if (null != data.get("detail!deliveryDays") && !this.isNumeric(data.get("detail!deliveryDays"))) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800783);
        }
        if (null != data.get("detail!maxPrimeCosts") && !this.isNumeric(data.get("detail!maxPrimeCosts"))) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800784);
        }
    }

    private boolean isNumeric(Object obj) {
        Pattern pattern = Pattern.compile("^(0\\.[1-9]\\d*|[1-9]\\d*(\\.\\d+)?)$");
        return pattern.matcher(obj.toString()).matches();
    }

    private void checkFieldIsnull(Map<String, Object> apply) throws Exception {
        if (apply.containsKey("applyCode") && null == apply.get("applyCode")) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800785);
        }
        if (apply.containsKey("orgId_Code") && null == apply.get("orgId_Code")) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800786);
        }
        if (apply.containsKey("code") && null == apply.get("code")) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800787);
        }
        if (apply.containsKey("name") && null == apply.get("name")) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800788);
        }
        if (apply.containsKey("manageClass_Code") && null == apply.get("manageClass_Code")) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800789);
        }
        if (apply.containsKey("detail!stopstatus") && null == apply.get("detail!stopstatus")) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800790);
        }
        if (apply.containsKey("detail!canSale") && null == apply.get("detail!canSale")) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800791);
        }
    }

    public void setSuccessCache(String asyncKey) {
        HashMap<String, Object> processMap = new HashMap<String, Object>(3);
        processMap.put("count", 0);
        processMap.put("totalCount", 0);
        processMap.put("code", 200);
        processMap.put("percentage", "100");
        processMap.put("flag", 1);
        processMap.put("data", new ResultList(0));
        processMap.put("failCount", 0);
        processMap.put("successCount", 0);
        processMap.put("message", null);
        processMap.put("infos", null);
        processMap.put("billNum", "pc_productapply");
        AppContext.cache().set(asyncKey, JSON.toJSONString(processMap));
    }

    public Map<String, Object> buildResultMap(ResultList resultList, String billnum) {
        HashMap<String, Object> processMap = new HashMap<String, Object>(12);
        int failCount = resultList.getFailCount();
        int successCount = resultList.getSucessCount();
        int count = resultList.getCount();
        String percentage = "0";
        if (count != 0) {
            percentage = CalculationUtil.getPrecentValue((int)count, (int)(failCount + successCount));
        }
        processMap.put("count", count);
        processMap.put("totalCount", count);
        processMap.put("code", 200);
        processMap.put("percentage", percentage);
        processMap.put("flag", 1);
        processMap.put("data", resultList);
        processMap.put("failCount", failCount);
        processMap.put("successCount", successCount);
        processMap.put("message", resultList.getMessages());
        processMap.put("infos", resultList.getInfos());
        processMap.put("billNum", billnum);
        return processMap;
    }

    public RuleExecuteResult saveProductApply(ProductApply apply) throws Exception {
        BillDataDto bill = new BillDataDto();
        bill.setBillnum("pc_productapply");
        bill.setData((Object)apply);
        RuleExecuteResult result = this.billService.executeUpdate("save", bill);
        return result;
    }

    private Map fillProductData(ProductApply apply, Product product) throws Exception {
        Object id = product.getId();
        String orgId = product.getOrgId();
        List range = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)QuerySchema.create().addSelect(new String[]{"id", "isCreator", "isApplied"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(id), QueryCondition.name((String)"orgId").eq((Object)orgId)})));
        if (null == range || range.isEmpty()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800792);
        }
        Object rangeId = ((Map)range.get(0)).get("id");
        Object isCreator = ((Map)range.get(0)).get("isCreator");
        Object isApplied = ((Map)range.get(0)).get("isApplied");
        HashMap params = new HashMap(3);
        params.put("@productApplyRangeId", rangeId);
        params.put("isCreator", isCreator);
        params.put("isApplied", isApplied);
        BillDataDto bill = new BillDataDto("pc_productdetail", id.toString());
        bill.setMapCondition(params);
        Map detail = this.billService.detail(bill);
        ViewModel vm = UIMetaUtils.getSimpleViewModel((String)"pc_productapply_import", null);
        this.checkProductUseSkuProperties(detail, product, vm);
        this.checkEnum(product, vm);
        detail.put("productApplyRangeId", rangeId);
        detail.put("isCreator", isCreator);
        detail.put("isApplied", isApplied);
        detail.put("_status", EntityStatus.Update);
        if (product.get("detail!stopstatus") == null) {
            product.put("detail!stopstatus", detail.get("detail!stopstatus"));
        }
        this.handleMCManageField(product, detail);
        if ("true".equals(((Map)range.get(0)).get("isCreator").toString())) {
            detail.putAll(product);
        } else {
            for (Map.Entry next : product.entrySet()) {
                if (!((String)next.getKey()).contains("detail!")) continue;
                detail.put(next.getKey(), next.getValue());
            }
        }
        detail.remove("pubts");
        apply.setApplyProductId(Long.valueOf(Long.parseLong(id.toString())));
        apply.setApplyProductApplyRangeId(Long.valueOf(Long.parseLong(rangeId.toString())));
        apply.setProductCode(detail.get("code").toString());
        apply.set("productName", detail.get("name"));
        apply.setRangeOrgId(orgId);
        return detail;
    }

    private void handleMCManageField(Product product, Map productDbInfo) {
        DocAttributeControlConfigDTO attributeControlConfigDTO = this.docAttributeControlConfigService.queryAttrControlConfigForOrg("pc.product.Product", productDbInfo.get("orgId").toString());
        List productDetailControlConfigList = null;
        if (null != attributeControlConfigDTO && null != attributeControlConfigDTO.getDocAttributeControlConfigList()) {
            productDetailControlConfigList = attributeControlConfigDTO.getDocAttributeControlConfigList().stream().filter(docAttributeControlConfig -> "pc.product.ProductDetail".equals(docAttributeControlConfig.getEntityUri())).collect(Collectors.toList());
        }
        if (null != productDetailControlConfigList) {
            Map attributeControlConfigMap = productDetailControlConfigList.stream().filter(productDetailControlConfig -> "0".equals(productDetailControlConfig.getControlType())).collect(Collectors.toMap(key -> key.getAttributeCode(), Function.identity(), (k1, k2) -> k2));
            for (String fieldKey : fieldMappingForMCSetManage.keySet()) {
                if (attributeControlConfigMap.get(fieldMappingForMCSetManage.get(fieldKey)) == null) continue;
                product.remove(fieldKey);
            }
        }
    }

    private void checkEnum(Product product, ViewModel vm) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("detail!stopstatus", "2");
        map.put("detail!canSale", "2");
        this.transportEnum((BizObject)product, vm, map);
    }

    private void checkProductUseSkuProperties(Map detail, Product product, ViewModel vm) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("useSku", "1");
        this.transportEnum((BizObject)product, vm, map);
        Integer useSku = product.getUseSku();
        if (useSku == null) {
            this.defaultUseSku(detail, product);
            return;
        }
        if (0 == useSku && StringUtils.isNotEmpty((CharSequence)((String)detail.get("detail!saleChannel")))) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808009, new Object[]{product.getCode()});
        }
        if (0 == useSku && detail.get("productTemplate") != null && this.productTplService.isSkuSens((Long)detail.get("productTemplate"))) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808010, new Object[]{product.getCode()});
        }
    }

    public void transportEnum(BizObject bizObject, ViewModel vm, Map<String, String> transFields) throws Exception {
        if (vm == null || transFields == null || CollectionUtils.isEmpty(transFields.keySet())) {
            return;
        }
        Set<String> keySet = transFields.keySet();
        LinkedHashSet entities = vm.getEntities();
        if (entities != null && !entities.isEmpty()) {
            for (Entity entity : entities) {
                List fields;
                if (!"Bill".equalsIgnoreCase(entity.getType()) || CollectionUtils.isEmpty((Collection)(fields = entity.getFields()))) continue;
                fields.forEach(field -> {
                    if (BooleanUtils.b((Object)field.getEnum()) && keySet.contains(field.getItemName())) {
                        Map enumMap = (Map)JSON.parseObject((String)field.getEnumString(), Map.class);
                        if (enumMap.containsKey(bizObject.get(field.getItemName()))) {
                            return;
                        }
                        Object enumKey = ProductApplyService.getEnumKey(bizObject.get(field.getItemName()), enumMap);
                        if ("1".equals(transFields.get(field.getItemName()))) {
                            bizObject.put(field.getItemName(), enumKey != null ? Integer.valueOf(enumKey.toString()) : null);
                        } else if ("2".equals(transFields.get(field.getItemName()))) {
                            bizObject.put(field.getItemName(), (Object)(enumKey != null ? enumKey.toString() : null));
                        }
                    }
                });
            }
        }
    }

    private void defaultUseSku(Map detail, Product product) throws Exception {
        product.setUseSku(Integer.valueOf(0));
        if (StringUtils.isNotEmpty((CharSequence)((String)detail.get("detail!saleChannel")))) {
            product.setUseSku(Integer.valueOf(1));
            return;
        }
        if (detail.get("productTemplate") != null && this.productTplService.isSkuSens((Long)detail.get("productTemplate"))) {
            product.setUseSku(Integer.valueOf(1));
        }
    }

    public void fillApplyForiegnId(ProductApply apply, Product product) throws Exception {
        if (!product.containsKey((Object)"__APIImportCommand") || !((Boolean)product.get("__APIImportCommand")).booleanValue()) {
            List list;
            QuerySchema schema;
            DataTransferUtils.fill((String)"pc_productapply", (String)"pc.productapply.ProductApply", (Object)apply, (int)0);
            if (null != product.get("__errorMessage")) {
                throw new CoreDocBusinessException(null, product.get("__errorMessage").toString());
            }
            DataTransferUtils.fill((String)"pc_product", (String)"pc.product.Product", (Object)product, (int)3);
            if (null != product.get("__errorMessage")) {
                throw new CoreDocBusinessException(null, product.get("__errorMessage").toString());
            }
            if (product.containsKey((Object)"taxClass_Code") && null != product.get("taxClass_Code")) {
                schema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq(product.get("taxClass_Code"))}));
                schema.setPartitionable(false);
                list = MetaDaoHelper.query((String)"pc.tax.TaxRevenue", (QuerySchema)schema);
                if (CollectionUtils.isEmpty((Collection)list)) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800803);
                }
                product.put("taxClass", ((Map)list.get(0)).get("id"));
                product.put("taxClass_Name", ((Map)list.get(0)).get("name"));
            }
            if (product.containsKey((Object)"detail!inTaxrate_Code") && null != product.get("detail!inTaxrate_Code")) {
                schema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq(product.get("detail!inTaxrate_Code"))}));
                list = MetaDaoHelper.query((String)"archive.taxArchives.TaxRateArchive", (QuerySchema)schema, (String)"yonbip-fi-taxpubdoc");
                if (CollectionUtils.isEmpty((Collection)list)) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800804);
                }
                product.put("detail!inTaxrate", ((Map)list.get(0)).get("id"));
                product.put("detail!inTaxrate_Name", ((Map)list.get(0)).get("ntaxrate"));
            }
            if (product.containsKey((Object)"detail!outTaxrate_Code") && null != product.get("detail!outTaxrate_Code")) {
                schema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq(product.get("detail!outTaxrate_Code"))}));
                list = MetaDaoHelper.query((String)"archive.taxArchives.TaxRateArchive", (QuerySchema)schema, (String)"yonbip-fi-taxpubdoc");
                if (CollectionUtils.isEmpty((Collection)list)) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800805);
                }
                product.put("detail!outTaxrate", ((Map)list.get(0)).get("id"));
                product.put("detail!outTaxrate_Name", ((Map)list.get(0)).get("ntaxrate"));
            }
            if (product.containsKey((Object)"detail!costItems_Code") && null != product.get("detail!costItems_Code")) {
                schema = QuerySchema.create().addSelect("id,name,enabled").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq(product.get("detail!costItems_Code"))}));
                list = MetaDaoHelper.query((String)"bd.expenseitem.ExpenseItem", (QuerySchema)schema, (String)"finbd");
                if (CollectionUtils.isEmpty((Collection)list)) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800806, new Object[]{product.getCode()});
                }
                if ("false".equals(String.valueOf(((Map)list.get(0)).get("enabled"))) || "0".equals(String.valueOf(((Map)list.get(0)).get("enabled")))) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800807, new Object[]{product.getCode()});
                }
                product.put("detail!costItems", ((Map)list.get(0)).get("id"));
                product.put("detail!costItems_Name", ((Map)list.get(0)).get("name"));
            }
        }
    }

    private void copyData(Map<String, Object> data, Map<String, Object> biz, Map<String, Object> biz2) {
        if (null != data) {
            Iterator<Map.Entry<String, Object>> iterator = data.entrySet().iterator();
            while (iterator.hasNext()) {
                String key = iterator.next().getKey();
                if (null != biz) {
                    biz.put(key, data.get(key));
                }
                if (null == biz) continue;
                biz2.put(key, data.get(key));
            }
            if (data.containsKey("name") || data.containsKey("name2") || data.containsKey("name3")) {
                BizObject name = new BizObject();
                name.put("zh_CN", data.get("name"));
                name.put("en_US", data.get("name2"));
                name.put("zh_TW", data.get("name3"));
                biz2.put("name", name);
            }
            if (data.containsKey("modelDescription") || data.containsKey("modelDescription2") || data.containsKey("modelDescription3")) {
                BizObject modelDescription = new BizObject();
                modelDescription.put("zh_CN", data.get("modelDescription"));
                modelDescription.put("en_US", data.get("modelDescription2"));
                modelDescription.put("zh_TW", data.get("modelDescription3"));
                biz2.put("modelDescription", modelDescription);
            }
            if (data.containsKey("model") || data.containsKey("model2") || data.containsKey("model3")) {
                BizObject model = new BizObject();
                model.put("zh_CN", data.get("model"));
                model.put("en_US", data.get("model2"));
                model.put("zh_TW", data.get("model3"));
                biz2.put("model", model);
            }
            if (data.containsKey("detail!receiptName") || data.containsKey("detail!receiptName2") || data.containsKey("detail!receiptName3")) {
                BizObject receiptName = new BizObject();
                receiptName.put("zh_CN", data.get("detail!receiptName"));
                receiptName.put("en_US", data.get("detail!receiptName2"));
                receiptName.put("zh_TW", data.get("detail!receiptName3"));
                biz2.put("detail!receiptName", receiptName);
            }
        }
    }

    public Map<String, String> getBizOperatorByBizOperatorId(String bizOperatorId) throws Exception {
        HashMap<String, String> result = new HashMap<String, String>();
        result.put("id", "");
        result.put("name", "");
        if (StringUtils.isEmpty((CharSequence)bizOperatorId)) {
            return result;
        }
        QuerySchema schema = QuerySchema.create().addSelect("id, name").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)bizOperatorId), QueryCondition.name((String)"dr").eq((Object)0)});
        List staffs = MetaDaoHelper.query((String)"bd.staff.Staff", (QuerySchema)schema, (String)"ucf-staff-center");
        if (!CollectionUtils.isEmpty((Collection)staffs)) {
            Map staff = (Map)staffs.get(0);
            result.put("id", staff.get("id").toString());
            result.put("name", staff.get("name") != null ? staff.get("name").toString() : "");
        }
        return result;
    }

    public void setApplyBizOperator(Map apply) throws Exception {
        QuerySchema schema = QuerySchema.create().addSelect("id, name").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"user_id").eq((Object)InvocationInfoProxy.getUserid()), QueryCondition.name((String)"dr").eq((Object)0)});
        List staffs = MetaDaoHelper.query((String)"bd.staff.Staff", (QuerySchema)schema, (String)"ucf-staff-center");
        if (!CollectionUtils.isEmpty((Collection)staffs)) {
            Map staff = (Map)staffs.get(0);
            apply.put("bizOperator", staff.get("id"));
            apply.put("bizOperator_Name", staff.get("name"));
            this.setDepartment(apply);
        }
    }

    public void setDepartment(Map apply) throws Exception {
        String deptId;
        Object staffObj;
        List dataList;
        Object data;
        apply.put("applyDepartment", null);
        apply.put("applyDepartment_Name", null);
        if (apply.get("bizOperator") == null || StringUtils.isEmpty((CharSequence)apply.get("bizOperator").toString())) {
            return;
        }
        StaffInfoQueryParam staffInfoQueryParam = new StaffInfoQueryParam();
        staffInfoQueryParam.setStaffIds(Arrays.asList(apply.get("bizOperator").toString()));
        staffInfoQueryParam.setTenantId((String)AppContext.getYTenantId());
        BaseResponse baseResponse = this.staffInfoQueryService.queryStaffList(staffInfoQueryParam);
        Map responseData = baseResponse.getData();
        if (responseData != null && (data = responseData.get("data")) instanceof List && !CollectionUtils.isEmpty((Collection)(dataList = (List)data)) && (staffObj = dataList.get(0)) instanceof StaffInfoListDto && StringUtils.isNotEmpty((CharSequence)(deptId = ((StaffInfoListDto)staffObj).getDeptId()))) {
            apply.put("applyDepartment", deptId);
            BizDeptDTO deptDTO = (BizDeptDTO)this.bizDeptQueryService.getById((String)AppContext.getYTenantId(), deptId);
            apply.put("applyDepartment_Name", deptDTO != null ? deptDTO.getName() : null);
        }
    }

    public static Object getEnumKey(Object value, Map<String, Object> enumMap) {
        if (value != null && enumMap != null) {
            String valueStr = value.toString();
            if (!StringUtils.isEmpty((CharSequence)valueStr)) {
                String[] valueArray = valueStr.split("/");
                String valueStrs = "";
                for (int i = 0; i < valueArray.length; ++i) {
                    String cKey = "";
                    for (Map.Entry<String, Object> m : enumMap.entrySet()) {
                        if (!valueArray[i].equals(m.getValue())) continue;
                        cKey = m.getKey();
                        break;
                    }
                    valueStrs = i < valueArray.length - 1 ? valueStrs + cKey + "," : valueStrs + cKey;
                }
                if ("".equals(valueStrs)) {
                    return null;
                }
                return valueStrs;
            }
            return valueStr;
        }
        return value;
    }

    static {
        fieldMappingForMCSetManage.put("detail!shortName", "shortName");
        fieldMappingForMCSetManage.put("detail!mnemonicCode", "mnemonicCode");
        fieldMappingForMCSetManage.put("detail!receiptName", "receiptName");
        fieldMappingForMCSetManage.put("detail!inTaxrate_Code", "inTaxrate");
        fieldMappingForMCSetManage.put("detail!inTaxrate", "inTaxrate");
        fieldMappingForMCSetManage.put("detail!inTaxrate_Name", "inTaxrate");
        fieldMappingForMCSetManage.put("detail!outTaxrate_Code", "outTaxrate");
        fieldMappingForMCSetManage.put("detail!outTaxrate", "outTaxrate");
        fieldMappingForMCSetManage.put("detail!outTaxrate_Name", "outTaxrate");
        fieldMappingForMCSetManage.put("detail!stopstatus", "stopstatus");
        fieldMappingForMCSetManage.put("detail!safetyStock", "safetyStock");
        fieldMappingForMCSetManage.put("detail!highestStock", "highestStock");
        fieldMappingForMCSetManage.put("detail!lowestStock", "lowestStock");
        fieldMappingForMCSetManage.put("detail!costItems_Code", "costItems");
        fieldMappingForMCSetManage.put("detail!costItems", "costItems");
        fieldMappingForMCSetManage.put("detail!costItems_Name", "costItems");
        fieldMappingForMCSetManage.put("detail!ropStock", "ropStock");
        fieldMappingForMCSetManage.put("detail!canSale", "canSale");
        fieldMappingForMCSetManage.put("detail!deliveryDays", "deliveryDays");
        fieldMappingForMCSetManage.put("detail!maxPrimeCosts", "maxPrimeCosts");
    }

    public static class ProductApplyObj {
        private ProductApply apply;
        private ProductApplyService service;

        public ProductApply getApply() {
            return this.apply;
        }

        public ProductApplyService getService() {
            return this.service;
        }

        public void setApply(ProductApply apply) {
            this.apply = apply;
        }

        public void setService(ProductApplyService service) {
            this.service = service;
        }

        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof ProductApplyObj)) {
                return false;
            }
            ProductApplyObj other = (ProductApplyObj)o;
            if (!other.canEqual(this)) {
                return false;
            }
            ProductApply this$apply = this.getApply();
            ProductApply other$apply = other.getApply();
            if (this$apply == null ? other$apply != null : !this$apply.equals(other$apply)) {
                return false;
            }
            ProductApplyService this$service = this.getService();
            ProductApplyService other$service = other.getService();
            return !(this$service == null ? other$service != null : !this$service.equals(other$service));
        }

        protected boolean canEqual(Object other) {
            return other instanceof ProductApplyObj;
        }

        public int hashCode() {
            int PRIME = 59;
            int result = 1;
            ProductApply $apply = this.getApply();
            result = result * 59 + ($apply == null ? 43 : $apply.hashCode());
            ProductApplyService $service = this.getService();
            result = result * 59 + ($service == null ? 43 : $service.hashCode());
            return result;
        }

        public String toString() {
            return "ProductApplyService.ProductApplyObj(apply=" + this.getApply() + ", service=" + this.getService() + ")";
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.fasterxml.jackson.core.type.TypeReference
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 *  com.yonyou.cloud.utils.CollectionUtils
 *  com.yonyou.cloud.yts.YtsContext
 *  com.yonyou.iuap.BusinessException
 *  com.yonyou.iuap.apdoc.coredoc.constant.CoredocSDKConstant
 *  com.yonyou.iuap.apdoc.coredoc.dao.pub.CoreDocBaseDao
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.ProductAPIUtils
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils
 *  com.yonyou.iuap.basedoc.mc.service.GroupService
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.ResultList
 *  com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService
 *  com.yonyou.ucf.mdd.ext.archive.base.Archive
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils
 *  com.yonyoucloud.iuap.upc.api.IProductManagerService
 *  com.yonyoucloud.iuap.upc.dto.MaterialClassDTO
 *  com.yonyoucloud.iuap.upc.dto.ProducClasstDTO
 *  com.yonyoucloud.iuap.upc.dto.derivatives.ManagementClassDTO
 *  com.yonyoucloud.iuap.upc.dto.derivatives.ManagementClassMethodDTO
 *  com.yonyoucloud.iuap.upc.dto.derivatives.ManagementClassQryDTO
 *  com.yonyoucloud.iuap.upc.dto.ext.UPCResultList
 *  com.yonyoucloud.iuap.upc.dto.openapi.OpenAPIDTO
 *  com.yonyoucloud.iuap.upc.vo.MultilingualVO
 *  com.yonyoucloud.upc.data.cls.ManagementClassDao
 *  com.yonyoucloud.upc.ipass.merchant.PassResultDTO
 *  com.yonyoucloud.upc.pc.cls.ManagementClass
 *  com.yonyoucloud.upc.pc.org.PubOrgGroup
 *  com.yonyoucloud.upc.pc.org.PubOrgGroupDetail
 *  com.yonyoucloud.upc.utils.CoreDocJsonResult
 *  org.apache.commons.collections4.CollectionUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QueryField
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.ObjectUtils
 */
package com.yonyoucloud.upc.service.api;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.type.TypeReference;
import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyou.cloud.yts.YtsContext;
import com.yonyou.iuap.BusinessException;
import com.yonyou.iuap.apdoc.coredoc.constant.CoredocSDKConstant;
import com.yonyou.iuap.apdoc.coredoc.dao.pub.CoreDocBaseDao;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.ProductAPIUtils;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils;
import com.yonyou.iuap.basedoc.mc.service.GroupService;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.ResultList;
import com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService;
import com.yonyou.ucf.mdd.ext.archive.base.Archive;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils;
import com.yonyoucloud.iuap.upc.api.IProductManagerService;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.iuap.upc.dto.MaterialClassDTO;
import com.yonyoucloud.iuap.upc.dto.ProducClasstDTO;
import com.yonyoucloud.iuap.upc.dto.derivatives.ManagementClassDTO;
import com.yonyoucloud.iuap.upc.dto.derivatives.ManagementClassMethodDTO;
import com.yonyoucloud.iuap.upc.dto.derivatives.ManagementClassQryDTO;
import com.yonyoucloud.iuap.upc.dto.ext.UPCResultList;
import com.yonyoucloud.iuap.upc.dto.openapi.OpenAPIDTO;
import com.yonyoucloud.iuap.upc.vo.MultilingualVO;
import com.yonyoucloud.upc.data.cls.ManagementClassDao;
import com.yonyoucloud.upc.ipass.merchant.PassResultDTO;
import com.yonyoucloud.upc.pc.cls.ManagementClass;
import com.yonyoucloud.upc.pc.org.PubOrgGroup;
import com.yonyoucloud.upc.pc.org.PubOrgGroupDetail;
import com.yonyoucloud.upc.service.ProductClsService;
import com.yonyoucloud.upc.service.UPCBillService;
import com.yonyoucloud.upc.service.utils.TreeApplyRangeUtils;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.commons.collections4.CollectionUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QueryField;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

@Service
@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public class ProductManagerServiceImpl
implements IProductManagerService {
    private static final Logger log = LoggerFactory.getLogger(ProductManagerServiceImpl.class);
    private static final String YTS_CONTEXT_KEY_UPDATE_MANAGE_CLASS = "YTS_CONTEXT_KEY_UPDATE_MANAGE_CLASS";
    private static final String YTS_CONTEXT_KEY_BATCH_UPDATE_MANAGE_CLASS = "YTS_CONTEXT_KEY_UPDATE_MANAGE_CLASS";
    private static final String YTS_CONTEXT_KEY_DELETE_MANAGE_CLASS = "YTS_CONTEXT_KEY_UPDATE_MANAGE_CLASS";
    private static final String YTS_CONTEXT_KEY_BATCH_DELETE_MANAGE_CLASS = "YTS_CONTEXT_KEY_UPDATE_MANAGE_CLASS";
    private static final String YTS_CONTEXT_KEY_ADD_MANAGE_CLASS = "YTS_CONTEXT_KEY_ADD_MANAGE_CLASS";
    private static final String YTS_CONTEXT_KEY_BATCH_ADD_MANAGE_CLASS = "YTS_CONTEXT_KEY_BATCH_ADD_MANAGE_CLASS";
    private static final String[] MANAGEMENT_CLASS_BASE_FIELDS = new String[]{"id", "code", "name", "order", "path", "parent", "parentCode", "parentName", "level", "productClass", "productClassCode", "productClassName", "orgId", "orgCode", "orgName", "remark", "template", "templateName", "stopStatus", "managementClassCharacter"};
    @Autowired
    private GroupService groupService;
    @Autowired
    private ApiImportCommandService apiImportSingleService;
    @Autowired
    private IUPCControlRuleService upcControlRuleService;
    @Autowired
    private ProductClsService productClsService;
    @Autowired
    UPCBillService upcBillService;
    @Autowired
    ManagementClassDao managementClassDao;
    private static final int MAX_COUNT = 500;

    public List<String> listProductClasstDTOById(Long productManagerId, List<String> orgIds) throws Exception {
        if (productManagerId == null || com.yonyou.cloud.utils.CollectionUtils.isEmpty(orgIds)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801350);
        }
        QuerySchema schema = QuerySchema.create().addSelect("orgGroupId.orgGroupDetailList.orgId as orgId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)productManagerId)}));
        List orgMapList = MetaDaoHelper.query((String)"pc.cls.ManagementClass", (QuerySchema)schema);
        HashSet orgs = new HashSet();
        orgMapList.forEach(orgMap -> orgs.add((String)orgMap.get("orgId")));
        orgs.retainAll(new HashSet<String>(orgIds));
        return new ArrayList<String>(orgs);
    }

    public List<ProducClasstDTO> listProductClasstDTOById(List<Long> productManagerIds, String orgId) {
        if (orgId == null || com.yonyou.cloud.utils.CollectionUtils.isEmpty(productManagerIds)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801350);
        }
        if (productManagerIds.size() > 500) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801351);
        }
        QuerySchema schema = QuerySchema.create().addSelect("id,name,code,orgGroupId.orgGroupDetailList.orgId as orgId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(productManagerIds), QueryCondition.name((String)"orgGroupId.orgGroupDetailList.orgId").eq((Object)orgId)}));
        try {
            List productList = MetaDaoHelper.query((String)"pc.cls.ManagementClass", (QuerySchema)schema);
            if (productList != null) {
                return JSON.parseArray((String)JSON.toJSONString((Object)productList), ProducClasstDTO.class);
            }
        }
        catch (Exception e) {
            log.error(e.getMessage(), (Throwable)e);
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801352);
        }
        return null;
    }

    public void deleteShopByIds(Long productManagerId, List<String> orgIds) throws Exception {
        if (productManagerId == null || com.yonyou.cloud.utils.CollectionUtils.isEmpty(orgIds)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801350);
        }
        if (orgIds.size() > 500) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801353);
        }
        QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"path").like((Object)productManagerId)}));
        List clsidList = MetaDaoHelper.query((String)"pc.cls.ManagementClass", (QuerySchema)schema);
        ArrayList clsIds = new ArrayList();
        if (!com.yonyou.cloud.utils.CollectionUtils.isEmpty((Collection)clsidList)) {
            clsidList.forEach(map -> clsIds.add((Long)map.get("id")));
        }
        if (com.yonyou.cloud.utils.CollectionUtils.isEmpty(clsIds)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801354);
        }
        schema = QuerySchema.create().addSelect("1").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"orgId").in(orgIds), QueryCondition.name((String)"manageClass").in(clsIds)}));
        List queryResult = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)schema);
        if (!com.yonyou.cloud.utils.CollectionUtils.isEmpty((Collection)queryResult)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801355);
        }
        schema = QuerySchema.create().addSelect("id,orgGroupId.orgGroupDetailList.orgId as orgId,orgGroupId.orgGroupDetailList.orgType as orgType").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(clsIds)}));
        List orgIdAndTypeList = MetaDaoHelper.query((String)"pc.cls.ManagementClass", (QuerySchema)schema);
        if (com.yonyou.cloud.utils.CollectionUtils.isEmpty((Collection)orgIdAndTypeList)) {
            return;
        }
        clsIds.forEach(clsId -> {
            PubOrgGroup pubOrgGroup = new PubOrgGroup();
            ArrayList<PubOrgGroupDetail> pubOrgGroupDetailList = new ArrayList<PubOrgGroupDetail>();
            for (Map orgIdAndType : orgIdAndTypeList) {
                if (!orgIdAndType.get("id").equals(clsId) || orgIds.contains(orgIdAndType.get("orgId").toString())) continue;
                PubOrgGroupDetail pubOrgGroupDetail = new PubOrgGroupDetail();
                pubOrgGroupDetail.setOrgGroupType("0");
                pubOrgGroupDetail.setOrgType(orgIdAndType.get("orgType").toString());
                pubOrgGroupDetail.setOrgId(orgIdAndType.get("orgId").toString());
                pubOrgGroupDetailList.add(pubOrgGroupDetail);
            }
            pubOrgGroup.setOrgGroupType("0");
            pubOrgGroup.setOrgGroupDetailList(pubOrgGroupDetailList);
            pubOrgGroup.setTenant((Long)AppContext.getTenantId());
            pubOrgGroup.setYtenant((String)AppContext.getYTenantId());
            String groupId = this.groupService.saveGroup((Map)pubOrgGroup, "pc.pub_org_group.PubOrgGroup");
            HashMap<String, Object> params = new HashMap<String, Object>();
            params.put("groupId", groupId);
            params.put("groupType", "0");
            params.put("tenantid", AppContext.getTenantId());
            params.put("ytenantid", AppContext.getYTenantId());
            params.put("id", IdManager.getInstance().nextId());
            params.put("clsId", clsId);
            try {
                ManagementClass managementClass = new ManagementClass();
                managementClass.setId(clsId);
                managementClass.setOrgGroupId(groupId);
                managementClass.setEntityStatus(EntityStatus.Update);
                MetaDaoHelper.update((String)"pc.cls.ManagementClass", (BizObject)managementClass);
                SqlHelper.delete((String)"com.yonyoucloud.upc.bill.dao.productcls.deleteGroupIdByClsIdAndTenantId", params);
            }
            catch (Exception e) {
                log.error(e.getMessage(), (Throwable)e);
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801356, new Object[]{productManagerId});
            }
            int insert = SqlHelper.insert((String)"com.yonyoucloud.upc.bill.dao.productcls.addManagementClsRangeGroup", params);
            if (insert <= 0) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801357, new Object[]{productManagerId});
            }
        });
    }

    public void deleteShopByIds(List<Long> productManagerIds, String orgId) {
        if (orgId == null || com.yonyou.cloud.utils.CollectionUtils.isEmpty(productManagerIds)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801350);
        }
        if (productManagerIds.size() > 500) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801353);
        }
        ArrayList<String> orgIds = new ArrayList<String>();
        orgIds.add(orgId);
        for (Long productManagerId : productManagerIds) {
            try {
                this.deleteShopByIds(productManagerId, orgIds);
            }
            catch (Exception e) {
                log.error(e.getMessage(), (Throwable)e);
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801357, new Object[]{productManagerId});
            }
        }
    }

    public void applyClass2ShopByIds(Long productManagerId, List<String> orgIds) throws Exception {
        if (productManagerId == null || com.yonyou.cloud.utils.CollectionUtils.isEmpty(orgIds)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801350);
        }
        if (orgIds.size() > 500) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801353);
        }
        QuerySchema schema = QuerySchema.create().addSelect("path").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)productManagerId)}));
        Map pathMap = MetaDaoHelper.queryOne((String)"pc.cls.ManagementClass", (QuerySchema)schema);
        if (pathMap == null || pathMap.get("path") == null) {
            return;
        }
        List<String> clsIds = Arrays.asList(pathMap.get("path").toString().split("\\|"));
        schema = QuerySchema.create().addSelect("id,orgGroupId.orgGroupDetailList.orgId as orgId,orgGroupId.orgGroupDetailList.orgType as orgType").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(clsIds)}));
        List orgIdAndTypeList = MetaDaoHelper.query((String)"pc.cls.ManagementClass", (QuerySchema)schema);
        if (com.yonyou.cloud.utils.CollectionUtils.isEmpty((Collection)orgIdAndTypeList)) {
            return;
        }
        for (String clsId : clsIds) {
            PubOrgGroupDetail pubOrgGroupDetail;
            PubOrgGroup pubOrgGroup = new PubOrgGroup();
            ArrayList<PubOrgGroupDetail> pubOrgGroupDetailList = new ArrayList<PubOrgGroupDetail>();
            ArrayList<String> orgIdList = new ArrayList<String>();
            for (Map orgIdAndType : orgIdAndTypeList) {
                if (!clsId.equals(orgIdAndType.get("id").toString())) continue;
                pubOrgGroupDetail = new PubOrgGroupDetail();
                pubOrgGroupDetail.setOrgGroupType("0");
                pubOrgGroupDetail.setOrgId(orgIdAndType.get("orgId").toString());
                pubOrgGroupDetail.setOrgType(orgIdAndType.get("orgType").toString());
                pubOrgGroupDetailList.add(pubOrgGroupDetail);
                orgIdList.add(orgIdAndType.get("orgId").toString());
            }
            for (String orgId : orgIds) {
                if (orgIdList.contains(orgId)) continue;
                pubOrgGroupDetail = new PubOrgGroupDetail();
                pubOrgGroupDetail.setOrgGroupType("0");
                pubOrgGroupDetail.setOrgId(orgId);
                pubOrgGroupDetail.setOrgType("3");
                pubOrgGroupDetailList.add(pubOrgGroupDetail);
            }
            pubOrgGroup.setOrgGroupType("0");
            pubOrgGroup.setOrgGroupDetailList(pubOrgGroupDetailList);
            pubOrgGroup.setTenant((Long)AppContext.getTenantId());
            pubOrgGroup.setYtenant((String)AppContext.getYTenantId());
            String groupId = this.groupService.saveGroup((Map)pubOrgGroup, "pc.pub_org_group.PubOrgGroup");
            HashMap<String, Object> params = new HashMap<String, Object>();
            params.put("groupId", groupId);
            params.put("groupType", "0");
            params.put("tenantid", AppContext.getTenantId());
            params.put("ytenantid", AppContext.getYTenantId());
            params.put("id", IdManager.getInstance().nextId());
            params.put("clsId", clsId);
            try {
                ManagementClass managementClass = new ManagementClass();
                managementClass.setId((Object)Long.valueOf(clsId));
                managementClass.setOrgGroupId(groupId);
                managementClass.setEntityStatus(EntityStatus.Update);
                MetaDaoHelper.update((String)"pc.cls.ManagementClass", (BizObject)managementClass);
                SqlHelper.delete((String)"com.yonyoucloud.upc.bill.dao.productcls.deleteGroupIdByClsIdAndTenantId", params);
            }
            catch (Exception e) {
                log.error(e.getMessage(), (Throwable)e);
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801356, new Object[]{productManagerId});
            }
            int insert = SqlHelper.insert((String)"com.yonyoucloud.upc.bill.dao.productcls.addManagementClsRangeGroup", params);
            if (insert > 0) continue;
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801358, new Object[]{productManagerId});
        }
    }

    public void applyClass2ShopByIds(List<Long> productManagerIds, String orgId) {
        if (orgId == null || com.yonyou.cloud.utils.CollectionUtils.isEmpty(productManagerIds)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801350);
        }
        if (productManagerIds.size() > 500) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801353);
        }
        ArrayList<String> orgIds = new ArrayList<String>();
        orgIds.add(orgId);
        for (Long productManagerId : productManagerIds) {
            try {
                this.applyClass2ShopByIds(productManagerId, orgIds);
            }
            catch (Exception e) {
                log.error(e.getMessage(), (Throwable)e);
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801358, new Object[]{productManagerId});
            }
        }
    }

    public void stopProductClasstByIds(List<Long> productManagerIdList) {
        try {
            this.updateManagerStatus(productManagerIdList, true);
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void unStopProductClasstByIds(List<Long> productManagerIdList) {
        try {
            this.updateManagerStatus(productManagerIdList, false);
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Map<Long, List<String>> queryShopByManagement(List<Long> productManagerIdList) throws Exception {
        if (com.yonyou.cloud.utils.CollectionUtils.isEmpty(productManagerIdList)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801350);
        }
        if (productManagerIdList.size() > 500) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801351);
        }
        QuerySchema schema = QuerySchema.create().addSelect("id,orgGroupId.orgGroupDetailList.orgId as orgId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(productManagerIdList), QueryCondition.name((String)"orgGroupId.orgGroupDetailList.orgType").eq((Object)3)}));
        List orgMapList = MetaDaoHelper.query((String)"pc.cls.ManagementClass", (QuerySchema)schema);
        HashMap<Long, List<String>> clsIdAndShopMap = new HashMap<Long, List<String>>();
        productManagerIdList.forEach(managementId -> {
            ArrayList shopList = new ArrayList();
            clsIdAndShopMap.put((Long)managementId, shopList);
        });
        if (!com.yonyou.cloud.utils.CollectionUtils.isEmpty((Collection)orgMapList)) {
            orgMapList.forEach(orgMap -> {
                if (orgMap.get("orgId") != null) {
                    ((List)clsIdAndShopMap.get(orgMap.get("id"))).add(orgMap.get("orgId").toString());
                }
            });
        }
        return clsIdAndShopMap;
    }

    public List<String> checkShops(Long productManagerId, List<String> orgIds) throws Exception {
        if (productManagerId == null || com.yonyou.cloud.utils.CollectionUtils.isEmpty(orgIds)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801350);
        }
        if (orgIds.size() > 500) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801351);
        }
        QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"path").like((Object)productManagerId)}));
        List clsidList = MetaDaoHelper.query((String)"pc.cls.ManagementClass", (QuerySchema)schema);
        ArrayList clsIds = new ArrayList();
        if (!com.yonyou.cloud.utils.CollectionUtils.isEmpty((Collection)clsidList)) {
            clsidList.forEach(map -> clsIds.add((Long)map.get("id")));
        }
        if (com.yonyou.cloud.utils.CollectionUtils.isEmpty(clsIds)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801354);
        }
        schema = QuerySchema.create().addSelect("orgId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"orgId").in(orgIds), QueryCondition.name((String)"manageClass").in(clsIds)}));
        List queryResultList = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)schema);
        ArrayList<String> result = new ArrayList<String>();
        if (!com.yonyou.cloud.utils.CollectionUtils.isEmpty((Collection)queryResultList)) {
            queryResultList.forEach(queryResult -> result.add(queryResult.get("orgId").toString()));
        }
        return result;
    }

    private void updateManagerStatus(List<Long> productManagerIdList, boolean stopStatus) throws Exception {
        ArrayList managementClassList = new ArrayList();
        productManagerIdList.forEach(manageid -> {
            ManagementClass managementClass = new ManagementClass();
            managementClass.setEntityStatus(EntityStatus.Update);
            managementClass.setId(manageid);
            managementClass.setStopstatus(Boolean.valueOf(stopStatus));
            managementClass.setStoptime(Calendar.getInstance().getTime());
            managementClassList.add(managementClass);
        });
        MetaDaoHelper.update((String)"pc.cls.ManagementClass", managementClassList);
    }

    private List<Map<String, Object>> getChildren(Long clsId) throws Exception {
        QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"parent").eq((Object)clsId)}));
        return MetaDaoHelper.query((String)"pc.cls.ManagementClass", (QuerySchema)schema);
    }

    public CoreDocJsonResult<ManagementClassDTO> queryByID(Long id) throws Exception {
        if (null != id) {
            try {
                ManagementClassDTO managementClassDTO = null;
                QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)ProductAPIUtils.materialClassFieldMap, (String[])MANAGEMENT_CLASS_BASE_FIELDS);
                QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)id)}));
                List result = MetaDaoHelper.query((String)"pc.cls.ManagementClass", (boolean)true, (QuerySchema)schema, null);
                HashMap<Long, Map> character = new HashMap<Long, Map>();
                if (result != null && result.size() == 1) {
                    Map managementClass = (Map)result.get(0);
                    if ((managementClass = UpcAPiTool.handleMultilingual((Map)managementClass, (String[])new String[]{"name", "remark"})).get("managementClassCharacter") instanceof Map) {
                        character.put((Long)managementClass.get("id"), (Map)managementClass.get("managementClassCharacter"));
                    } else {
                        managementClass.remove("managementClassCharacter");
                    }
                    managementClassDTO = (ManagementClassDTO)JSON.parseObject((String)JSON.toJSONString((Object)managementClass), ManagementClassDTO.class);
                }
                if (managementClassDTO != null) {
                    managementClassDTO.setManagementClassCharacter((Map)character.get(managementClassDTO.getId()));
                    return CoreDocJsonResult.success(managementClassDTO);
                }
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.RESULT_IS_NULL));
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17A2451E0420007E", (String)"\u6839\u636eID\u67e5\u8be2\u7269\u6599\u5206\u7c7b\u4fe1\u606f\u9519\u8bef:") + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<ManagementClassDTO> queryByIDList(List<Long> idList) throws Exception {
        if (null != idList) {
            try {
                List managementClassDTOs = null;
                QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)ProductAPIUtils.materialClassFieldMap, (String[])MANAGEMENT_CLASS_BASE_FIELDS);
                QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(idList)}));
                List result = MetaDaoHelper.query((String)"pc.cls.ManagementClass", (boolean)true, (QuerySchema)schema, null);
                if (result != null && result.size() > 0) {
                    String[] names = new String[]{"name", "remark"};
                    for (Map managementClass : result) {
                        managementClass = UpcAPiTool.handleMultilingual((Map)managementClass, (String[])names);
                    }
                    managementClassDTOs = JSON.parseArray((String)JSON.toJSONString((Object)result), ManagementClassDTO.class);
                }
                if (!com.yonyou.cloud.utils.CollectionUtils.isEmpty(managementClassDTOs)) {
                    return CoreDocJsonResult.success(managementClassDTOs);
                }
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.RESULT_IS_NULL));
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17A2451E0420007E", (String)"\u6839\u636eID\u67e5\u8be2\u7269\u6599\u5206\u7c7b\u4fe1\u606f\u9519\u8bef:") + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<ManagementClassDTO> queryByCode(String code) throws Exception {
        if (null != code) {
            try {
                ManagementClassDTO managementClassDTO = null;
                QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)ProductAPIUtils.materialClassFieldMap, (String[])MANAGEMENT_CLASS_BASE_FIELDS);
                QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)code)}));
                List result = MetaDaoHelper.query((String)"pc.cls.ManagementClass", (boolean)true, (QuerySchema)schema, null);
                HashMap<Long, Map> character = new HashMap<Long, Map>();
                if (result != null && result.size() == 1) {
                    Map managementClass = (Map)result.get(0);
                    if ((managementClass = UpcAPiTool.handleMultilingual((Map)managementClass, (String[])new String[]{"name", "remark"})).get("managementClassCharacter") instanceof Map) {
                        character.put((Long)managementClass.get("id"), (Map)managementClass.get("managementClassCharacter"));
                    } else {
                        managementClass.remove("managementClassCharacter");
                    }
                    managementClassDTO = (ManagementClassDTO)JSON.parseObject((String)JSON.toJSONString((Object)managementClass), ManagementClassDTO.class);
                }
                if (managementClassDTO != null) {
                    managementClassDTO.setManagementClassCharacter((Map)character.get(managementClassDTO.getId()));
                    return CoreDocJsonResult.success(managementClassDTO);
                }
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.RESULT_IS_NULL));
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17A2451E04200080", (String)"\u6839\u636e\u7f16\u7801\u67e5\u8be2\u7269\u6599\u5206\u7c7b\u4fe1\u606f\u9519\u8bef:") + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<ManagementClassDTO> queryByCodeList(List<String> codeList) throws Exception {
        if (null != codeList) {
            try {
                List managementClassDTOs = null;
                QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)ProductAPIUtils.materialClassFieldMap, (String[])MANAGEMENT_CLASS_BASE_FIELDS);
                QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").in(codeList)}));
                List result = MetaDaoHelper.query((String)"pc.cls.ManagementClass", (boolean)true, (QuerySchema)schema, null);
                if (result != null && result.size() > 0) {
                    String[] names = new String[]{"name", "remark"};
                    for (Map managementClass : result) {
                        managementClass = UpcAPiTool.handleMultilingual((Map)managementClass, (String[])names);
                    }
                    managementClassDTOs = JSON.parseArray((String)JSON.toJSONString((Object)result), ManagementClassDTO.class);
                }
                if (!com.yonyou.cloud.utils.CollectionUtils.isEmpty(managementClassDTOs)) {
                    return CoreDocJsonResult.success(managementClassDTOs);
                }
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.RESULT_IS_NULL));
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17A2451E04200080", (String)"\u6839\u636e\u7f16\u7801\u67e5\u8be2\u7269\u6599\u5206\u7c7b\u4fe1\u606f\u9519\u8bef:") + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<ManagementClassDTO> queryTree(ManagementClassQryDTO managementClassQryDTO) throws Exception {
        if (null != managementClassQryDTO) {
            List managementClassDTOs = null;
            QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)ProductAPIUtils.materialClassFieldMap, (String[])MANAGEMENT_CLASS_BASE_FIELDS);
            QueryConditionGroup conditionGroup = this.buildManageClassQueryConditionGroup(managementClassQryDTO);
            Integer pageIndex = managementClassQryDTO.getPageIndex();
            Integer pageSize = managementClassQryDTO.getPageSize();
            if (pageIndex == null || pageIndex < 0) {
                pageIndex = 1;
            }
            if (pageSize == null || pageSize > UpcAPiTool.List_LENGTH) {
                pageSize = UpcAPiTool.List_LENGTH;
            }
            QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)conditionGroup).addPager(pageIndex.intValue(), pageSize.intValue());
            try {
                List result = MetaDaoHelper.query((String)"pc.cls.ManagementClass", (boolean)true, (QuerySchema)schema, null);
                HashMap<Long, Map> character = new HashMap<Long, Map>();
                if (result != null && result.size() <= UpcAPiTool.List_LENGTH) {
                    String[] names = new String[]{"name", "remark"};
                    for (Map managementClass : result) {
                        Object prodClscharacter = managementClass.get("managementClassCharacter");
                        if (prodClscharacter instanceof Map) {
                            character.put((Long)managementClass.get("id"), (Map)managementClass.get("managementClassCharacter"));
                        } else {
                            managementClass.remove("managementClassCharacter");
                        }
                        UpcAPiTool.handleMultilingual((Map)managementClass, (String[])names);
                    }
                    managementClassDTOs = JSON.parseArray((String)JSON.toJSONString((Object)result), ManagementClassDTO.class);
                } else if (result != null && result.size() > UpcAPiTool.List_LENGTH) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801151);
                }
                if (!com.yonyou.cloud.utils.CollectionUtils.isEmpty(managementClassDTOs)) {
                    for (ManagementClassDTO managementClassDTO : managementClassDTOs) {
                        managementClassDTO.setManagementClassCharacter((Map)character.get(managementClassDTO.getId()));
                    }
                    return CoreDocJsonResult.success((List)managementClassDTOs);
                }
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.RESULT_IS_NULL));
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17A2451E04200081", (String)"\u67e5\u8be2\u7269\u6599\u5206\u7c7b\u4fe1\u606f\u9519\u8bef:") + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public Integer queryManagementClassCount(ManagementClassQryDTO managementClassQryDTO) throws Exception {
        QueryConditionGroup conditionGroup = this.buildManageClassQueryConditionGroup(managementClassQryDTO);
        QuerySchema schema = QuerySchema.create().addSelect("count(1) as count").addCondition((ConditionExpression)conditionGroup);
        Map result = MetaDaoHelper.queryOne((String)"pc.cls.ManagementClass", (QuerySchema)schema);
        if (result != null && result.get("count") != null) {
            Integer count = Integer.valueOf(result.get("count").toString());
            return count;
        }
        return null;
    }

    public QueryConditionGroup buildManageClassQueryConditionGroup(ManagementClassQryDTO managementClassQryDTO) {
        QueryConditionGroup conditionGroup = new QueryConditionGroup();
        if (managementClassQryDTO != null) {
            if (managementClassQryDTO.getCode() != null) {
                conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").eq((Object)managementClassQryDTO.getCode()));
            }
            if (managementClassQryDTO.getName() != null) {
                conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"name").eq((Object)managementClassQryDTO.getName()));
            }
            if (managementClassQryDTO.getOrgId() != null) {
                conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"orgGroupId.orgGroupDetailList.orgId").eq((Object)managementClassQryDTO.getOrgId()));
            }
            if (managementClassQryDTO.getOrgCode() != null) {
                conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"orgGroupId.orgGroupDetailList.orgId.code").eq((Object)managementClassQryDTO.getOrgCode()));
            }
            if (managementClassQryDTO.getBeganTime() != null) {
                conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"pubts").egt((Object)managementClassQryDTO.getBeganTime()));
            }
            if (managementClassQryDTO.getEndTime() != null) {
                conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"pubts").lt((Object)managementClassQryDTO.getEndTime()));
            }
        }
        return conditionGroup;
    }

    public CoreDocJsonResult<ManagementClassDTO> queryTreeByParent(ManagementClassQryDTO managementClassQryDTO) throws Exception {
        if (null != managementClassQryDTO) {
            try {
                QuerySchema schema;
                List result;
                List managementClassDTOs = null;
                QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)ProductAPIUtils.materialClassFieldMap, (String[])MANAGEMENT_CLASS_BASE_FIELDS);
                QueryConditionGroup conditionGroup = new QueryConditionGroup();
                if (managementClassQryDTO.getParent() != null) {
                    conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"parent").eq((Object)managementClassQryDTO.getParent()));
                }
                if (managementClassQryDTO.getCode() != null) {
                    conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").eq((Object)managementClassQryDTO.getCode()));
                }
                if (managementClassQryDTO.getName() != null) {
                    conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"name").eq((Object)managementClassQryDTO.getName()));
                }
                if (managementClassQryDTO.getOrgId() != null) {
                    conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"orgId").eq((Object)managementClassQryDTO.getOrgId()));
                }
                Integer pageIndex = managementClassQryDTO.getPageIndex();
                Integer pageSize = managementClassQryDTO.getPageSize();
                if (pageIndex == null || pageIndex < 0) {
                    pageIndex = 1;
                }
                if (pageSize == null || pageSize > UpcAPiTool.List_LENGTH) {
                    pageSize = UpcAPiTool.List_LENGTH;
                }
                if ((result = MetaDaoHelper.query((String)"pc.cls.ManagementClass", (boolean)true, (QuerySchema)(schema = managementClassQryDTO.getParent() == null ? QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)conditionGroup) : QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)conditionGroup).addPager(pageIndex.intValue(), pageSize.intValue())), null)) != null && result.size() < UpcAPiTool.List_LENGTH) {
                    String[] names = new String[]{"name", "remark"};
                    for (Map managementClass : result) {
                        managementClass = UpcAPiTool.handleMultilingual((Map)managementClass, (String[])names);
                    }
                    managementClassDTOs = JSON.parseArray((String)JSON.toJSONString((Object)result), ManagementClassDTO.class);
                } else if (result != null && result.size() > UpcAPiTool.List_LENGTH) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801359);
                }
                if (!com.yonyou.cloud.utils.CollectionUtils.isEmpty(managementClassDTOs)) {
                    return CoreDocJsonResult.success(managementClassDTOs);
                }
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.RESULT_IS_NULL));
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17A2451E04200081", (String)"\u67e5\u8be2\u7269\u6599\u5206\u7c7b\u4fe1\u606f\u9519\u8bef:") + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<ManagementClassDTO> add(ManagementClassDTO managementClassDTO) throws Exception {
        if (null != managementClassDTO) {
            try {
                ManagementClass managementClass = this.handleAddManagementClass(managementClassDTO);
                BillDataDto billDataDto = new BillDataDto();
                billDataDto.setBillnum("pc_managementclass");
                billDataDto.setAction("save");
                billDataDto.setData((Object)managementClass);
                billDataDto.setFromApi(true);
                billDataDto.setConvertType(Integer.valueOf(3));
                Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
                ManagementClassDTO clsDTO = new ManagementClassDTO();
                clsDTO.setId((Long)((Map)result).get("id"));
                return CoreDocJsonResult.success((Object)clsDTO);
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17A2451E0420007F", (String)"\u7269\u6599\u5206\u7c7b\u65b0\u589e\u9519\u8bef:") + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<ManagementClassDTO> addManagerClassConfirm(ManagementClassDTO managementClassDTO) throws Exception {
        return CoreDocJsonResult.success(null);
    }

    public CoreDocJsonResult<ManagementClassDTO> addManagerClassCancel(ManagementClassDTO managementClassDTO) throws Exception {
        MetaDaoHelper.deleteByObjectId((String)"pc.cls.ManagementClass", (Object)managementClassDTO.getId());
        return CoreDocJsonResult.success(null);
    }

    public CoreDocJsonResult<ManagementClassDTO> update(ManagementClassDTO managementClassDTO) throws Exception {
        if (null != managementClassDTO) {
            try {
                ManagementClass managementClass = this.handleUpdateManagementClass(managementClassDTO);
                BillDataDto billDataDto = new BillDataDto();
                billDataDto.setBillnum("pc_managementclass");
                billDataDto.setAction("save");
                billDataDto.setData((Object)managementClass);
                billDataDto.setFromApi(true);
                billDataDto.setConvertType(Integer.valueOf(3));
                Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
                CoreDocJsonResult<ManagementClassDTO> oldManagementClassResult = this.queryByCode(managementClassDTO.getCode());
                if (CollectionUtils.isNotEmpty((Collection)oldManagementClassResult.getData())) {
                    ManagementClassDTO oldManagementClassDTO = (ManagementClassDTO)oldManagementClassResult.getData().get(0);
                    YtsContext.setYtsContext((String)"YTS_CONTEXT_KEY_UPDATE_MANAGE_CLASS", (Object)oldManagementClassDTO);
                }
                ManagementClassDTO clsDTO = new ManagementClassDTO();
                clsDTO.setId((Long)((Map)result).get("id"));
                return CoreDocJsonResult.success((Object)clsDTO);
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17A2451E04200082", (String)"\u7269\u6599\u5206\u7c7b\u66f4\u65b0\u9519\u8bef:") + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<ManagementClassDTO> updateManagerClassConfirm(ManagementClassDTO managementClassDTO) throws Exception {
        return CoreDocJsonResult.success(null);
    }

    public CoreDocJsonResult<ManagementClassDTO> updateManagerClassCancel(ManagementClassDTO managementClassDTO) throws Exception {
        Object object = YtsContext.getYtsContext((String)"YTS_CONTEXT_KEY_UPDATE_MANAGE_CLASS");
        if (object != null) {
            ManagementClassDTO oldManagementClassDTO = (ManagementClassDTO)object;
            this.update(oldManagementClassDTO);
        }
        return CoreDocJsonResult.success(null);
    }

    public CoreDocJsonResult<ManagementClassDTO> queryOrgByIds(List<Long> idList) throws Exception {
        return null;
    }

    public CoreDocJsonResult<UPCResultList> batchAdd(List<ManagementClassDTO> managementClassDTOs) throws Exception {
        try {
            ArrayList<ManagementClass> managementClassList = new ArrayList<ManagementClass>();
            StringBuilder stringBuilder = new StringBuilder();
            ArrayList<String> managementClassCodes = new ArrayList<String>();
            for (ManagementClassDTO managementClassDTO : managementClassDTOs) {
                managementClassCodes.add(managementClassDTO.getCode());
                try {
                    ManagementClass managementClass = this.handleAddManagementClass(managementClassDTO);
                    managementClassList.add(managementClass);
                }
                catch (BusinessException businessException) {
                    if (stringBuilder.length() > 0) {
                        stringBuilder.append(";");
                    }
                    stringBuilder.append(businessException.getMessage());
                }
            }
            if (stringBuilder.length() > 0) {
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(stringBuilder.toString()));
            }
            BillDataDto billDataDto = new BillDataDto();
            billDataDto.setBillnum("pc_managementclass");
            billDataDto.setAction("save");
            billDataDto.setData(managementClassList);
            billDataDto.setFromApi(true);
            billDataDto.setConvertType(Integer.valueOf(3));
            com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList resultList = this.apiImportSingleService.batchSave4Api(billDataDto);
            UPCResultList upcResultList = UpcAPiTool.resultConvertOpenApi((ResultList)resultList);
            YtsContext.setYtsContext((String)YTS_CONTEXT_KEY_BATCH_ADD_MANAGE_CLASS, managementClassCodes);
            return CoreDocJsonResult.success((Object)upcResultList);
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)businessException);
        }
        catch (Exception e) {
            log.error("\u7269\u6599\u5206\u7c7b\u6279\u91cf\u65b0\u589e\u9519\u8bef:" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    public CoreDocJsonResult<UPCResultList> batchAddManagerClassConfirm(List<ManagementClassDTO> list) throws Exception {
        return CoreDocJsonResult.success(null);
    }

    public CoreDocJsonResult<UPCResultList> batchAddManagerClassCancel(List<ManagementClassDTO> list) throws Exception {
        Object object = YtsContext.getYtsContext((String)YTS_CONTEXT_KEY_BATCH_ADD_MANAGE_CLASS);
        if (object != null) {
            List managementClassCodes = (List)object;
            this.queryByCodeList(managementClassCodes);
        }
        return CoreDocJsonResult.success(null);
    }

    public CoreDocJsonResult<UPCResultList> batchUpdate(List<ManagementClassDTO> managementClassDTOs) throws Exception {
        try {
            ArrayList<ManagementClass> managementClassList = new ArrayList<ManagementClass>();
            StringBuilder stringBuilder = new StringBuilder();
            for (ManagementClassDTO managementClassDTO : managementClassDTOs) {
                try {
                    ManagementClass managementClass = this.handleUpdateManagementClass(managementClassDTO);
                    managementClassList.add(managementClass);
                }
                catch (BusinessException businessException) {
                    if (stringBuilder.length() > 0) {
                        stringBuilder.append(";");
                    }
                    stringBuilder.append(businessException.getMessage());
                }
            }
            if (stringBuilder.length() > 0) {
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(stringBuilder.toString()));
            }
            BillDataDto billDataDto = new BillDataDto();
            billDataDto.setBillnum("pc_managementclass");
            billDataDto.setAction("save");
            billDataDto.setData(managementClassList);
            billDataDto.setFromApi(true);
            billDataDto.setConvertType(Integer.valueOf(3));
            List<String> managementClassCodes = managementClassList.stream().map(Archive::getCode).collect(Collectors.toList());
            CoreDocJsonResult<ManagementClassDTO> coreDocJsonResult = this.queryByCodeList(managementClassCodes);
            if (CollectionUtils.isNotEmpty((Collection)coreDocJsonResult.getData())) {
                YtsContext.setYtsContext((String)"YTS_CONTEXT_KEY_UPDATE_MANAGE_CLASS", (Object)coreDocJsonResult.getData());
            }
            com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList resultList = this.apiImportSingleService.batchSave4Api(billDataDto);
            UPCResultList upcResultList = UpcAPiTool.resultConvertOpenApi((ResultList)resultList);
            return CoreDocJsonResult.success((Object)upcResultList);
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)businessException);
        }
        catch (Exception e) {
            log.error("\u7269\u6599\u5206\u7c7b\u6279\u91cf\u66f4\u65b0\u9519\u8bef:" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    public CoreDocJsonResult<UPCResultList> batchUpdateManagerClassConfirm(List<ManagementClassDTO> list) throws Exception {
        return CoreDocJsonResult.success(null);
    }

    public CoreDocJsonResult<UPCResultList> batchUpdateManagerClassCancel(List<ManagementClassDTO> list) throws Exception {
        Object codeObj = YtsContext.getYtsContext((String)"YTS_CONTEXT_KEY_UPDATE_MANAGE_CLASS");
        if (codeObj != null) {
            List oldManagementClass = (List)codeObj;
            this.batchUpdate(oldManagementClass);
        }
        return null;
    }

    public ManagementClass handleAddManagementClass(ManagementClassDTO managementClassDTO) throws Exception {
        if (managementClassDTO.getCode() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801120);
        }
        if (CoreDocBaseDao.queryIdByCode((String)managementClassDTO.getCode(), (String)"pc.cls.ManagementClass") != null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801360, new Object[]{managementClassDTO.getCode()});
        }
        ManagementClass managementClass = new ManagementClass();
        managementClass.put("_fromApi", (Object)true);
        managementClass.put("_status", (Object)EntityStatus.Insert);
        Map map = (Map)JSON.parseObject((String)JSON.toJSONString((Object)managementClassDTO), HashMap.class);
        managementClass.putAll(map);
        if (managementClassDTO.getName() != null) {
            managementClass.set("name", (Object)UpcAPiTool.handleMultilingual((MultilingualVO)managementClassDTO.getName()));
        }
        if (managementClassDTO.getRemark() != null) {
            managementClass.set("remark", (Object)UpcAPiTool.handleMultilingual((MultilingualVO)managementClassDTO.getRemark()));
        }
        if (managementClassDTO.getStopStatus() != null && !managementClassDTO.getStopStatus().booleanValue()) {
            managementClass.put("stopstatus", (Object)0);
        } else if (managementClassDTO.getStopStatus() != null && managementClassDTO.getStopStatus().booleanValue()) {
            managementClass.put("stopstatus", (Object)1);
        } else if (managementClassDTO.getStopStatus() == null) {
            managementClass.put("stopstatus", (Object)0);
        }
        DataTransferUtils.fill((String)"pc_managementclass", (String)"pc.cls.ManagementClass", (Object)managementClass, (int)3);
        this.checkProductClass(managementClass, managementClassDTO);
        if (managementClass.getParent() != null) {
            QuerySchema querySchema = QuerySchema.create().addSelect(new String[]{"orgId", "level"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)managementClass.getParent())}));
            Map queryOrgId = MetaDaoHelper.queryOne((String)"pc.cls.ManagementClass", (QuerySchema)querySchema);
            if (queryOrgId == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801361, new Object[]{managementClass.getCode()});
            }
            if (managementClass.getOrgId() == null) {
                managementClass.setOrgId(queryOrgId.get("orgId").toString());
            }
            if (queryOrgId.get("level") != null && (Integer)queryOrgId.get("level") > 7) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801362, new Object[]{managementClass.getCode()});
            }
        }
        Boolean singleOrg = this.upcControlRuleService.checkSingleOrg();
        if (managementClass.getOrgId() != null && !singleOrg.booleanValue()) {
            TreeApplyRangeUtils.getInstance().checkOrgPermission(this.upcControlRuleService, managementClass.getOrgId(), "pc.cls.ManagementClass", "pc_managementclass");
        }
        return managementClass;
    }

    public ManagementClass handleUpdateManagementClass(ManagementClassDTO managementClassDTO) throws Exception {
        boolean checkResult;
        Map characterId;
        QuerySchema querySchema;
        List queryId;
        if (managementClassDTO.getCode() == null && managementClassDTO.getId() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800880);
        }
        if (managementClassDTO.getCode() != null && managementClassDTO.getId() == null) {
            Long id = CoreDocBaseDao.queryIdByCode((String)managementClassDTO.getCode(), (String)"pc.cls.ManagementClass");
            if (id == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801193, new Object[]{managementClassDTO.getCode()});
            }
            managementClassDTO.setId(id);
        } else if (managementClassDTO.getId() != null && (queryId = MetaDaoHelper.query((String)"pc.cls.ManagementClass", (QuerySchema)(querySchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)managementClassDTO.getId())}))))) != null && queryId.size() != 1) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801363, new Object[]{managementClassDTO.getId()});
        }
        ManagementClass managementClass = new ManagementClass();
        managementClass.put("_fromApi", (Object)true);
        managementClass.put("_status", (Object)EntityStatus.Update);
        Map map = (Map)JSON.parseObject((String)JSON.toJSONString((Object)managementClassDTO), HashMap.class);
        managementClass.putAll(map);
        if (managementClassDTO.getName() != null) {
            managementClass.set("name", (Object)UpcAPiTool.handleMultilingual((MultilingualVO)managementClassDTO.getName()));
        }
        if (managementClassDTO.getRemark() != null) {
            managementClass.set("remark", (Object)UpcAPiTool.handleMultilingual((MultilingualVO)managementClassDTO.getRemark()));
        }
        if (managementClassDTO.getStopStatus() != null && !managementClassDTO.getStopStatus().booleanValue()) {
            managementClass.put("stopstatus", (Object)0);
        } else if (managementClassDTO.getStopStatus() != null && managementClassDTO.getStopStatus().booleanValue()) {
            managementClass.put("stopstatus", (Object)1);
        }
        DataTransferUtils.fill((String)"pc_managementclass", (String)"pc.cls.ManagementClass", (Object)managementClass, (int)3);
        QuerySchema schema = QuerySchema.create().addSelect(new String[]{"managementClassCharacter", "parent", "orgId", "stopstatus"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(managementClass.getId())}));
        Map query = MetaDaoHelper.queryOne((String)"pc.cls.ManagementClass", (QuerySchema)schema);
        if (query != null && query.get("managementClassCharacter") != null && managementClass.get("managementClassCharacter") != null && (characterId = (Map)query.get("managementClassCharacter")).get("id") != null) {
            Map character = (Map)managementClass.get("managementClassCharacter");
            character.put("id", characterId.get("id").toString());
            managementClass.put("managementClassCharacter", (Object)character);
        }
        if (query != null && query.get("orgId") != null) {
            managementClass.set("orgId", (Object)query.get("orgId").toString());
        }
        if (query != null && query.get("stopstatus") != null && managementClass.get("stopstatus") == null) {
            managementClass.put("stopstatus", query.get("stopstatus"));
        }
        if (query != null && query.get("parent") != null && !"0".equals(query.get("parent").toString())) {
            if (managementClass.getParent() != null && !managementClass.getParent().toString().equals(query.get("parent").toString())) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801364, new Object[]{managementClass.getId(), managementClass.getCode()});
            }
            managementClass.put("parent", query.get("parent"));
        }
        this.checkProductClass(managementClass, managementClassDTO);
        if (managementClass.getParent() != null) {
            QuerySchema querySchema2 = QuerySchema.create().addSelect(new String[]{"orgId", "level"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)managementClass.getParent())}));
            Map queryOrgId = MetaDaoHelper.queryOne((String)"pc.cls.ManagementClass", (QuerySchema)querySchema2);
            if (queryOrgId == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801365, new Object[]{managementClass.getId(), managementClass.getCode()});
            }
            if (queryOrgId.get("level") != null && (Integer)queryOrgId.get("level") > 7) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801366, new Object[]{managementClass.getId(), managementClass.getCode()});
            }
        }
        if (managementClass.getId() != null && managementClass.getParent() != null && managementClass.getEntityStatus() == EntityStatus.Update && !(checkResult = this.productClsService.checkParent((Long)managementClass.getId(), managementClass.getParent(), "pc.cls.ManagementClass"))) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800190);
        }
        return managementClass;
    }

    public void checkProductClass(ManagementClass managementClass, ManagementClassDTO managementClassDTO) throws Exception {
        QuerySchema querySchema;
        Map queryOne;
        if (managementClassDTO.getProductClassCode() != null && managementClass.getProductClass() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801367, new Object[]{managementClassDTO.getProductClassCode()});
        }
        if (managementClass.getProductClass() != null && (queryOne = MetaDaoHelper.queryOne((String)"pc.cls.PresentationClass", (QuerySchema)(querySchema = QuerySchema.create().addSelect("stopstatus").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)managementClass.getProductClass())}))))) != null && BooleanUtil.isTrue(queryOne.get("stopstatus"))) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801368, new Object[]{managementClassDTO.getProductClassCode()});
        }
    }

    public CoreDocJsonResult<ManagementClassDTO> addIdempotent(OpenAPIDTO<ManagementClassDTO> dto) {
        if (dto == null || dto.getData() == null) {
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
        }
        try {
            ManagementClassDTO managementClassDTO = (ManagementClassDTO)dto.getData();
            CoreDocJsonResult<ManagementClassDTO> saveResult = this.add(managementClassDTO);
            return saveResult;
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)businessException);
        }
        catch (Exception e) {
            log.error("\u7269\u6599\u5206\u7c7b\u65b0\u589e-\u5e42\u7b49\u9519\u8bef:" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    public CoreDocJsonResult<MaterialClassDTO> getProductClassLowerById(Long id, String fullname) {
        if (id == null) {
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
        }
        try {
            QuerySchema schema = QuerySchema.create().addSelect("id,code,name,path,level").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"path").like((Object)id)}));
            List clss = MetaDaoHelper.query((String)"pc.cls.ManagementClass", (QuerySchema)schema);
            List materialClassDTOS = (List)UpcJacksonUtils.OBJECT_MAPPER.readValue(UpcJacksonUtils.OBJECT_MAPPER.writeValueAsString((Object)clss), (TypeReference)new TypeReference<List<MaterialClassDTO>>(){});
            return CoreDocJsonResult.success((List)materialClassDTOS);
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)businessException);
        }
        catch (Exception e) {
            log.error("\u5206\u7c7b\u67e5\u8be2\u4e0b\u7ea7\u9519\u8bef:" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    public CoreDocJsonResult<UPCResultList> batchSave(List<ManagementClassDTO> managementClassDTOList) {
        if (com.yonyou.cloud.utils.CollectionUtils.isEmpty(managementClassDTOList)) {
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
        }
        if (managementClassDTOList.size() > CoredocSDKConstant.DEFAULT_NUM_FOR_SIMPLE) {
            return CoreDocJsonResult.error((Long)Long.valueOf(CoreDocBusinessErrorEnum.PARAM_MORE_THAN_LIMITATION.getCode()), (String)String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1A7F2BEA04080003", (String)"\u8bf7\u6c42\u6570\u91cf\u8d85\u8fc7\u6700\u5927\u9650\u5236\u6570\u91cf:%d"), CoredocSDKConstant.DEFAULT_NUM_FOR_SIMPLE));
        }
        try {
            List<ManagementClassDTO> managementClassDTOs = this.setIdByErpCode(managementClassDTOList);
            UPCResultList upcResultList = new UPCResultList();
            Integer successCount = 0;
            Integer failCount = 0;
            ArrayList<PassResultDTO> messages = new ArrayList<PassResultDTO>();
            ArrayList successInfos = new ArrayList();
            for (ManagementClassDTO managementClassDTO : managementClassDTOs) {
                Integer n;
                PassResultDTO passResultDTO = new PassResultDTO();
                CoreDocJsonResult<ManagementClassDTO> saveResult = new CoreDocJsonResult<ManagementClassDTO>();
                saveResult = managementClassDTO.getId() != null ? this.update(managementClassDTO) : this.add(managementClassDTO);
                if (saveResult.isSuccess()) {
                    n = successCount;
                    successCount = successCount + 1;
                    ManagementClassDTO managementClass = (ManagementClassDTO)saveResult.getData().get(0);
                    passResultDTO.setSourceUnique(managementClassDTO.getErpCode());
                    passResultDTO.setTargetUnique(managementClass.getId().toString());
                    HashMap<String, PassResultDTO> infoMap = new HashMap<String, PassResultDTO>();
                    infoMap.put("data", passResultDTO);
                    successInfos.add(infoMap);
                    continue;
                }
                n = failCount;
                failCount = failCount + 1;
                passResultDTO.setSourceUnique(managementClassDTO.getErpCode());
                passResultDTO.setMessage(saveResult.getMessage());
                messages.add(passResultDTO);
            }
            upcResultList.setCount(Integer.valueOf(failCount + successCount));
            upcResultList.setFailCount(failCount);
            upcResultList.setSuccessCount(successCount);
            upcResultList.setMessages(messages);
            upcResultList.setInfos(successInfos);
            return CoreDocJsonResult.success((Object)upcResultList);
        }
        catch (Exception e) {
            log.error("\u7269\u6599\u5206\u7c7b\u6279\u91cf\u4fdd\u5b58-\u63a5\u53e3\u5f02\u5e38:" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    private List<ManagementClassDTO> setIdByErpCode(List<ManagementClassDTO> managementClassDTOList) throws Exception {
        ArrayList<String> erpCodeList = new ArrayList<String>();
        for (ManagementClassDTO managementClassDTO : managementClassDTOList) {
            if (managementClassDTO == null || managementClassDTO.getErpCode() == null || managementClassDTO.getId() != null) continue;
            erpCodeList.add(managementClassDTO.getErpCode());
        }
        if (com.yonyou.cloud.utils.CollectionUtils.isEmpty(erpCodeList)) {
            return managementClassDTOList;
        }
        QuerySchema schema = QuerySchema.create().addSelect("id,erpCode").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"erpCode").in(erpCodeList)}));
        List clss = MetaDaoHelper.query((String)"pc.cls.ManagementClass", (QuerySchema)schema);
        HashMap<String, Long> erpCodeIdMap = new HashMap<String, Long>();
        if (!com.yonyou.cloud.utils.CollectionUtils.isEmpty((Collection)clss)) {
            for (Map cls : clss) {
                if (cls == null || cls.get("erpCode") == null || cls.get("id") == null) continue;
                erpCodeIdMap.put(cls.get("erpCode").toString(), Long.valueOf(cls.get("id").toString()));
            }
        }
        for (ManagementClassDTO managementClassDTO : managementClassDTOList) {
            if (managementClassDTO == null || managementClassDTO.getErpCode() == null || managementClassDTO.getId() != null) continue;
            managementClassDTO.setId((Long)erpCodeIdMap.get(managementClassDTO.getErpCode()));
        }
        return managementClassDTOList;
    }

    public CoreDocJsonResult<UPCResultList> addSuitOrg(List<ManagementClassMethodDTO> managementClassMethodDTOs) {
        try {
            List<BizObject> data = this.handleSuitOrgData(managementClassMethodDTOs);
            BillDataDto billDataDto = new BillDataDto();
            billDataDto.setBillnum("pc_managementclasslist");
            billDataDto.setAction("addmanagementsuitorg");
            billDataDto.setData(data);
            com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList resultList = this.upcBillService.batchDo(billDataDto);
            List ids = data.stream().map(bizObject -> bizObject.get("id").toString()).collect(Collectors.toList());
            UpcAPiTool.handleBatchDoResultList((ResultList)resultList, ids);
            UPCResultList upcResultList = UpcAPiTool.resultConvertOpenApi((ResultList)resultList);
            return CoreDocJsonResult.success((Object)upcResultList);
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)businessException);
        }
        catch (Exception e) {
            log.error("\u7269\u6599\u5206\u7c7b\u5206\u914d\u7ec4\u7ec7\u63a5\u53e3\u9519\u8bef:" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    public CoreDocJsonResult<UPCResultList> cancelSuitOrg(List<ManagementClassMethodDTO> managementClassMethodDTOs) {
        try {
            List<BizObject> data = this.handleSuitOrgData(managementClassMethodDTOs);
            BillDataDto billDataDto = new BillDataDto();
            billDataDto.setBillnum("pc_managementclasslist");
            billDataDto.setAction("cancelSuitOrg");
            billDataDto.setData(data);
            com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList resultList = this.upcBillService.batchDo(billDataDto);
            List ids = data.stream().map(bizObject -> bizObject.get("id").toString()).collect(Collectors.toList());
            UpcAPiTool.handleBatchDoResultList((ResultList)resultList, ids);
            UPCResultList upcResultList = UpcAPiTool.resultConvertOpenApi((ResultList)resultList);
            return CoreDocJsonResult.success((Object)upcResultList);
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)businessException);
        }
        catch (Exception e) {
            log.error("\u7269\u6599\u5206\u7c7b\u53d6\u6d88\u5206\u914d\u63a5\u53e3\u9519\u8bef:" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    private List<BizObject> handleSuitOrgData(List<ManagementClassMethodDTO> managementClassMethodDTOs) throws Exception {
        if (ObjectUtils.isEmpty(managementClassMethodDTOs)) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL);
        }
        if (managementClassMethodDTOs.size() > CoredocSDKConstant.DEFAULT_NUM_FOR_SIMPLE) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801348, new Object[]{CoredocSDKConstant.DEFAULT_NUM_FOR_SIMPLE});
        }
        ArrayList<BizObject> data = new ArrayList<BizObject>();
        StringBuilder stringBuilder = new StringBuilder();
        for (ManagementClassMethodDTO managementClassMethodDTO : managementClassMethodDTOs) {
            try {
                BizObject bizObject = new BizObject();
                Long id = managementClassMethodDTO.getId();
                List orgIds = managementClassMethodDTO.getOrgIds();
                if (id == null) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MANAGEMENT_CLASS_ID_NOT_NULL);
                }
                if (ObjectUtils.isEmpty((Object)orgIds)) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MANAGEMENT_CLASS_SUIT_ORG_NOT_NULL, new Object[]{id.toString()});
                }
                List orgIdsInDb = MetaDaoHelper.query((String)"bd.adminOrg.BaseOrgVO", (QuerySchema)QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in((Collection)orgIds)})), (String)"ucf-org-center");
                Set orgIdSet = orgIdsInDb.stream().map(map -> map.get("id").toString()).collect(Collectors.toSet());
                List notExistOrgIds = orgIds.stream().filter(orgId -> !orgIdSet.contains(orgId)).collect(Collectors.toList());
                if (!ObjectUtils.isEmpty(notExistOrgIds)) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MANAGEMENT_CLASS_SUIT_ORG_NOT_EXIST, new Object[]{notExistOrgIds});
                }
                ManagementClass managementClass = this.managementClassDao.queryManagementClassById(id);
                if (managementClass == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800943, new Object[]{id.toString()});
                }
                bizObject.put("cls_name", (Object)managementClass.getName());
                bizObject.put("clsId", (Object)id);
                bizObject.put("orgIds", (Object)orgIds);
                bizObject.put("id", (Object)id);
                data.add(bizObject);
            }
            catch (BusinessException businessException) {
                if (stringBuilder.length() > 0) {
                    stringBuilder.append(";");
                }
                stringBuilder.append(businessException.getMessage());
            }
        }
        if (stringBuilder.length() > 0) {
            throw new CoreDocBusinessException(stringBuilder.toString());
        }
        return data;
    }
}


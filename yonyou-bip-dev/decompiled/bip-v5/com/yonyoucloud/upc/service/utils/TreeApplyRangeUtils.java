/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.util.IrisDynamicInvokeUtil
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.ListSplitUtil
 *  com.yonyou.iuap.data.service.itf.TenantStatusApi
 *  com.yonyou.iuap.org.dto.TenantMultiOrgInfo
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterCommonVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.option.util.OptionUtils
 *  com.yonyoucloud.upc.aa.custcategory.CustCategoryApplyRange
 *  com.yonyoucloud.upc.aa.salearea.SaleAreaApplyRange
 *  com.yonyoucloud.upc.pc.cls.CostClassApplyRange
 *  com.yonyoucloud.upc.pc.cls.ManagementClassApplyRange
 *  com.yonyoucloud.upc.pc.cls.ProductClass
 *  com.yonyoucloud.upc.pc.tree.TreeRangeEnum
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.core.base.ConditionOperator
 *  org.imeta.core.lang.BooleanUtils
 *  org.imeta.core.model.Entity
 *  org.imeta.core.model.Property
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.utils;

import com.yonyou.cloud.util.IrisDynamicInvokeUtil;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.ListSplitUtil;
import com.yonyou.iuap.data.service.itf.TenantStatusApi;
import com.yonyou.iuap.org.dto.TenantMultiOrgInfo;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterCommonVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.option.util.OptionUtils;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.aa.custcategory.CustCategoryApplyRange;
import com.yonyoucloud.upc.aa.salearea.SaleAreaApplyRange;
import com.yonyoucloud.upc.pc.cls.CostClassApplyRange;
import com.yonyoucloud.upc.pc.cls.ManagementClassApplyRange;
import com.yonyoucloud.upc.pc.cls.ProductClass;
import com.yonyoucloud.upc.pc.tree.TreeRangeEnum;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.imeta.core.base.ConditionOperator;
import org.imeta.core.lang.BooleanUtils;
import org.imeta.core.model.Entity;
import org.imeta.core.model.Property;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;

public class TreeApplyRangeUtils {
    private static final Logger log = LoggerFactory.getLogger(TreeApplyRangeUtils.class);
    private static TreeApplyRangeUtils treeApplyRangeUtils = new TreeApplyRangeUtils();
    private static final String MULTI_DEFAULT_ORG = "666666";

    private TreeApplyRangeUtils() {
        if (treeApplyRangeUtils != null) {
            throw new RuntimeException("TreeApplyRangeUtils is singleton, do not use reflect");
        }
    }

    private Object readResolve() {
        return treeApplyRangeUtils;
    }

    public static TreeApplyRangeUtils getInstance() {
        return treeApplyRangeUtils;
    }

    public Long checkOrgId(IUPCControlRuleService upcControlRuleService, String fullClassName, String billNum, Long orgId) throws Exception {
        Boolean singleOrg = upcControlRuleService.checkSingleOrg();
        if (!singleOrg.booleanValue()) {
            if (orgId != null) {
                TreeApplyRangeUtils.getInstance().checkOrgPermission(upcControlRuleService, orgId, fullClassName, billNum);
            }
        } else {
            orgId = Long.parseLong(TreeApplyRangeUtils.getInstance().getDefaultOrg(upcControlRuleService, orgId));
        }
        return orgId;
    }

    public void checkOrgPermission(IUPCControlRuleService upcControlRuleService, Long orgId, String fullClassName, String billNum) throws Exception {
        List<String> orgIds = upcControlRuleService.getUserOrgAndVoucherManageOrg(fullClassName, billNum);
        if (orgIds == null || orgIds.size() == 0) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800844);
        }
        String s = orgId.toString();
        List collect = orgIds.stream().filter(org -> s.equals(org)).collect(Collectors.toList());
        if (collect == null || collect.size() < 1) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800844);
        }
    }

    public void checkOrgPermission(IUPCControlRuleService upcControlRuleService, String orgId, String fullClassName, String billNum) throws Exception {
        List<String> orgIds = upcControlRuleService.getUserOrgAndVoucherManageOrg(fullClassName, billNum);
        if (orgIds == null || orgIds.size() == 0) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800844);
        }
        String s = orgId;
        List collect = orgIds.stream().filter(org -> s.equals(org)).collect(Collectors.toList());
        if (collect == null || collect.size() < 1) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800844);
        }
    }

    public void queryCheckOrgId(IUPCControlRuleService iupcControlRuleService, BillDataDto billDataDto, String fieldName) throws Exception {
        Boolean singleOrg = iupcControlRuleService.checkSingleOrg();
        boolean result = false;
        FilterVO condition = billDataDto.getCondition();
        if (condition == null) {
            condition = new FilterVO();
            FilterCommonVO[] commonVOs = new FilterCommonVO[1];
            FilterCommonVO commonVO = new FilterCommonVO();
            commonVO.setItemName(fieldName);
            commonVO.setValue1((Object)this.getMultiDefaultOrg());
            if (singleOrg.booleanValue() || 4 == AppContext.getCurrentUser().getUserType().getValue() || 5 == AppContext.getCurrentUser().getUserType().getValue()) {
                commonVO.setValue1(AppContext.getCurrentUser().get("singleOrgId"));
            }
            condition.setCommonVOs(commonVOs);
        } else {
            if (singleOrg.booleanValue()) {
                return;
            }
            FilterCommonVO[] commonVOs = condition.getCommonVOs();
            if (commonVOs != null) {
                for (FilterCommonVO commonVO : commonVOs) {
                    Object value1;
                    String itemName = commonVO.getItemName();
                    if (!fieldName.equals(itemName) || (value1 = commonVO.getValue1()) == null) continue;
                    result = true;
                    break;
                }
                if (!result) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800845);
                }
            }
        }
    }

    public void updateRangeIsEndByClsAndOrg(int isEnd, String relatedColumn, long relatedValue, List<String> subOrgs, String fullname) throws Exception {
        List subOrgsUnderThousands = ListSplitUtil.splitListByCapacity(subOrgs, (int)999);
        for (List subOrgsUnderThousand : subOrgsUnderThousands) {
            Entity entity = MetaDaoHelper.getEntity((String)fullname);
            HashMap<String, Object> paramMap = new HashMap<String, Object>();
            paramMap.put("isEnd", isEnd);
            paramMap.put("relatedColumn", relatedColumn);
            paramMap.put("relatedValue", relatedValue);
            paramMap.put("subOrgs", MessageFormat.format("''{0}''", StringUtils.join((Iterable)subOrgsUnderThousand, (String)"', '")));
            paramMap.put("tableName", entity.getMainTableName());
            SqlHelper.update((String)"com.yonyoucloud.upc.bill.dao.productcls.updateRangeByClsAndOrg", paramMap);
        }
    }

    public TreeRangeEnum getTreeRangeEnum(String billnum) {
        TreeRangeEnum[] values;
        for (TreeRangeEnum treeRangeEnum : values = TreeRangeEnum.values()) {
            if (!treeRangeEnum.getBillNum().equals(billnum)) continue;
            return treeRangeEnum;
        }
        return null;
    }

    public void updateRangeIsEndByPrantClsAndOrg(BizObject bizObject, int isEnd, String relatedColumn, List<String> subOrgs, String fullname, String rangeFullName) throws Exception {
        Entity entity = MetaDaoHelper.getEntity((String)fullname);
        Entity rangeEntity = MetaDaoHelper.getEntity((String)rangeFullName);
        Long oldParent = null;
        EntityStatus entityStatus = bizObject.getEntityStatus();
        if (EntityStatus.Delete == entityStatus) {
            oldParent = (Long)bizObject.get("parent");
        } else {
            QuerySchema querySchema = QuerySchema.create().addSelect("parent").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(bizObject.get("id"))}));
            Map oldTree = MetaDaoHelper.queryOne((String)fullname, (QuerySchema)querySchema);
            if (null != oldTree && oldTree.size() > 0) {
                oldParent = (Long)oldTree.get("parent");
            }
        }
        if (oldParent == null || oldParent == 0L) {
            return;
        }
        subOrgs.add((String)bizObject.get("orgId"));
        List subOrgsUnderThousands = ListSplitUtil.splitListByCapacity(subOrgs, (int)999);
        ArrayList<String> orgIdsList = new ArrayList<String>();
        for (List subOrgsUnderThousand : subOrgsUnderThousands) {
            String[] paramMap = new HashMap();
            paramMap.put("clsId", oldParent);
            paramMap.put("childClsId", bizObject.get("id"));
            paramMap.put("subOrgs", "'" + StringUtils.join((Iterable)subOrgsUnderThousand, (String)"', '") + "'");
            paramMap.put("relatedColumn", relatedColumn);
            paramMap.put("mainTable", entity.getMainTableName());
            paramMap.put("rangeTable", rangeEntity.getMainTableName());
            List attributes = entity.attributes();
            List properties = attributes.stream().filter(p -> "parent".equals(p.name())).collect(Collectors.toList());
            if (properties == null || properties.size() != 1) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800846);
            }
            String columnName = ((Property)properties.get(0)).columnName();
            paramMap.put("parentColumn", columnName);
            Object orgIdsStr = SqlHelper.selectOne((String)"com.yonyoucloud.upc.bill.dao.productcls.selectOrgFromRangeByClsAndOrg", (Object)paramMap);
            if (orgIdsStr == null || orgIdsStr.toString().length() <= 0) continue;
            List<String> listOne = Arrays.asList(orgIdsStr.toString().split(","));
            orgIdsList.addAll(listOne);
        }
        if (orgIdsList != null && orgIdsList.size() > 0) {
            String[] orgIds = orgIdsList.toArray(new String[orgIdsList.size()]);
            Map<String, String> collect = subOrgs.stream().collect(Collectors.toMap(String::toString, String::toString));
            for (String orgId : orgIds) {
                if (!collect.containsKey(orgId)) continue;
                collect.remove(orgId);
            }
            Set<String> noSuborgIds = collect.keySet();
            ArrayList<String> noSuborgIdsList = new ArrayList<String>(noSuborgIds);
            if (noSuborgIds != null && noSuborgIds.size() > 0) {
                this.updateRangeIsEndByClsAndOrg(isEnd, relatedColumn, oldParent, noSuborgIdsList, rangeFullName);
            }
        } else {
            this.updateRangeIsEndByClsAndOrg(isEnd, relatedColumn, oldParent, subOrgs, rangeFullName);
        }
    }

    public ManagementClassApplyRange getManagementClassApplyRange(Long clsId, String orgId, boolean isEnd, boolean isCreator) {
        ManagementClassApplyRange range = new ManagementClassApplyRange();
        range.setId((Object)IdManager.getInstance().nextId());
        range.put("clsId", (Object)clsId);
        range.setOrgId(orgId);
        range.setIsCreator(Boolean.valueOf(isCreator));
        range.setIsApplied(Boolean.valueOf(isCreator));
        range.put("isEnd", (Object)isEnd);
        range.setTenant((Long)AppContext.getCurrentUser().getTenant());
        range.setEntityStatus(EntityStatus.Insert);
        return range;
    }

    public CostClassApplyRange getCostClassApplyRange(Long clsId, String orgId, boolean isEnd, boolean isCreator) {
        CostClassApplyRange range = new CostClassApplyRange();
        range.setId((Object)IdManager.getInstance().nextId());
        range.put("clsId", (Object)clsId);
        range.setOrgId(orgId);
        range.setIsCreator(Boolean.valueOf(isCreator));
        range.setIsApplied(Boolean.valueOf(isCreator));
        range.put("isEnd", (Object)isEnd);
        range.setTenant((Long)AppContext.getCurrentUser().getTenant());
        range.setEntityStatus(EntityStatus.Insert);
        return range;
    }

    public CustCategoryApplyRange getCustCatetoryApplyRange(Long clsId, String orgId, boolean isEnd, boolean isCreator) {
        CustCategoryApplyRange range = new CustCategoryApplyRange();
        range.setId((Object)IdManager.getInstance().nextId());
        range.put("clsId", (Object)clsId);
        range.setOrgId(orgId);
        range.setIsCreator(Boolean.valueOf(isCreator));
        range.setIsApplied(Boolean.valueOf(isCreator));
        range.put("isEnd", (Object)isEnd);
        range.setTenant((Long)AppContext.getCurrentUser().getTenant());
        range.setEntityStatus(EntityStatus.Insert);
        return range;
    }

    public SaleAreaApplyRange getSalearesApplyRange(Long clsId, String orgId, boolean isEnd, boolean isCreator) {
        SaleAreaApplyRange range = new SaleAreaApplyRange();
        range.setId((Object)IdManager.getInstance().nextId());
        range.put("clsId", (Object)clsId);
        range.setOrgId(orgId);
        range.setIsCreator(Boolean.valueOf(isCreator));
        range.setIsApplied(Boolean.valueOf(isCreator));
        range.put("isEnd", (Object)isEnd);
        range.setTenant((Long)AppContext.getCurrentUser().getTenant());
        range.setEntityStatus(EntityStatus.Insert);
        return range;
    }

    public SaleAreaApplyRange getSalearesApplyRangeNew(Long clsId, String orgId, boolean isEnd, boolean isCreator) {
        SaleAreaApplyRange range = new SaleAreaApplyRange();
        range.setId((Object)IdManager.getInstance().nextId());
        range.put("saleArea", (Object)clsId);
        range.setOrgId(orgId);
        range.setIsCreator(Boolean.valueOf(isCreator));
        range.setIsApplied(Boolean.valueOf(isCreator));
        range.put("isEnd", (Object)isEnd);
        range.setTenant((Long)AppContext.getCurrentUser().getTenant());
        range.setEntityStatus(EntityStatus.Insert);
        return range;
    }

    public void updateChildFPathAndLevel(String fullname, Object id) throws Exception {
        QuerySchema schema = QuerySchema.create().addSelect("id, path").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"path").like(id)}));
        List clss = MetaDaoHelper.query((String)fullname, (QuerySchema)schema);
        if (clss == null) {
            return;
        }
        for (Map map : clss) {
            String path = map.get("path").toString();
            String replace = path.replace("|", "");
            ProductClass cls = new ProductClass();
            cls.setFullPath("|" + path);
            cls.setLevel(Integer.valueOf(path.length() - replace.length()));
            cls.setEntityStatus(EntityStatus.Update);
            cls.setId(map.get("id"));
            MetaDaoHelper.update((String)fullname, (BizObject)cls);
        }
    }

    public void getManageClsFilter(Object orgId, FilterVO gridFilter) {
        if (4 == AppContext.getCurrentUser().getUserType().getValue() || 5 == AppContext.getCurrentUser().getUserType().getValue()) {
            if (orgId != null) {
                gridFilter.appendCondition(ConditionOperator.or, new SimpleFilterVO[]{new SimpleFilterVO("orgGroupId.orgGroupDetailList.orgId", "eq", orgId), new SimpleFilterVO("orgGroupId.orgGroupDetailList.orgId", "eq", (Object)this.getMultiDefaultOrg())});
            } else {
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("orgGroupId.orgGroupDetailList.orgId", "eq", (Object)this.getMultiDefaultOrg())});
            }
        } else if (orgId != null) {
            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("orgGroupId.orgGroupDetailList.orgId", "eq", orgId)});
        } else {
            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("orgGroupId.orgGroupDetailList.orgId", "eq", (Object)this.getMultiDefaultOrg())});
        }
    }

    public void dealInitOrg(IUPCControlRuleService upcControlRuleService, BillDataDto billDataDto, String fullClassName, String billNum, BizObject bizObject) throws Exception {
        Boolean singleOrg;
        String orgId = (String)billDataDto.getOrgId();
        if (billDataDto.getOrgId() == null && ((singleOrg = upcControlRuleService.checkSingleOrg()).booleanValue() || 4 == AppContext.getCurrentUser().getUserType().getValue() || 5 == AppContext.getCurrentUser().getUserType().getValue())) {
            orgId = this.getSingalDefaultOrg();
        }
        if (orgId != null) {
            this.checkOrgId(upcControlRuleService, fullClassName, billNum, Long.parseLong(orgId));
            QuerySchema schema = QuerySchema.create().addSelect("id, name, code").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)orgId)}));
            List orgMaps = MetaDaoHelper.query((String)"bd.adminOrg.BaseOrgVO", (QuerySchema)schema, (String)"ucf-org-center");
            if (orgMaps != null && orgMaps.size() > 0) {
                Map orgMap = (Map)orgMaps.get(0);
                Object name = orgMap.get("name");
                bizObject.put("orgId", (Object)orgId);
                bizObject.put("orgId_name", name);
            }
        }
    }

    public String getDefaultOrg(IUPCControlRuleService iupcControlRuleService, Object orgId) throws Exception {
        Boolean isSingleOrg = BooleanUtils.b((Object)OptionUtils.getSysOptionByName((String)"singleOrg"));
        if (4 == AppContext.getCurrentUser().getUserType().getValue() || 5 == AppContext.getCurrentUser().getUserType().getValue()) {
            return (String)AppContext.getCurrentUser().get("singleOrgId");
        }
        if (isSingleOrg.booleanValue()) {
            return this.getSingalDefaultOrg();
        }
        if (null == orgId) {
            return this.getMultiDefaultOrg();
        }
        return orgId.toString();
    }

    public String getSingalDefaultOrg() {
        try {
            TenantStatusApi tenantStatusApi = (TenantStatusApi)IrisDynamicInvokeUtil.getService((String)"orgcenter", (String)"c87e2267-1001-4c70-bb2a-ab41f3b81aa3", null, TenantStatusApi.class);
            if (null == tenantStatusApi) {
                return MULTI_DEFAULT_ORG;
            }
            TenantMultiOrgInfo tenantMultiOrgInfo = tenantStatusApi.getTenantMultiOrgInfo((String)AppContext.getYhtTenantId(), "diwork");
            if (null != tenantMultiOrgInfo) {
                log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040801AC", (String)"\u83b7\u53d6\u5355\u7ec4\u7ec7\u4fe1\u606f\u4e3a\uff1a") + tenantMultiOrgInfo.getSingleOrgId());
                return tenantMultiOrgInfo.getSingleOrgId();
            }
        }
        catch (Exception e) {
            log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040801AE", (String)"\u83b7\u53d6\u5355\u7ec4\u7ec7\u4fe1\u606f\u9519\u8bef") + e.getMessage(), (Throwable)e);
        }
        return MULTI_DEFAULT_ORG;
    }

    public String getMultiDefaultOrg() {
        return MULTI_DEFAULT_ORG;
    }

    public String getOrgByRefer(BillDataDto billDataDto, BizObject bizObject) throws Exception {
        String orgId = null;
        try {
            if (billDataDto.getData() != null) {
                Object data = billDataDto.getData();
                if (data instanceof List) {
                    List datas = (List)billDataDto.getData();
                    if (datas != null && datas.size() > 0) {
                        bizObject.putAll((Map)((BizObject)datas.get(0)));
                    }
                } else if (data instanceof Map) {
                    bizObject.putAll((Map)((BizObject)data));
                }
            }
        }
        catch (Exception e) {
            log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040801AD", (String)"\u6570\u636e\u5904\u7406\u5f02\u5e38\uff0c\u8df3\u8fc7") + e.getMessage(), (Throwable)e);
        }
        if (bizObject == null) {
            return orgId;
        }
        if (bizObject.containsKey((Object)"createOrg") && bizObject.get("createOrg") != null) {
            orgId = bizObject.get("createOrg").toString();
        }
        if (bizObject.containsKey((Object)"orgId") && bizObject.get("orgId") != null) {
            orgId = bizObject.get("orgId").toString();
        }
        return orgId;
    }

    public void getCostClsFilter(Object orgId, FilterVO gridFilter) {
        if (orgId != null) {
            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("costClassApplyRanges.orgId", "eq", orgId)});
        } else {
            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("costClassApplyRanges.orgId", "eq", (Object)-1)});
        }
    }

    public void getCustCategoryFilter(Object orgId, FilterVO gridFilter) {
        if (orgId != null) {
            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("orgId", "eq", orgId)});
        } else {
            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("orgId", "eq", (Object)-1)});
        }
    }

    public void getSaleAreaFilter(Object orgId, FilterVO gridFilter) {
        if (orgId != null) {
            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("orgId", "eq", orgId)});
        } else {
            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("orgId", "eq", (Object)-1)});
        }
    }

    public List<Map> getOrgAndRangeOrg(IUPCControlRuleService iupcControlRuleService, boolean singleOrg, String orgId, String fullname) throws Exception {
        List<String> subOrgs;
        ArrayList<Map> orgMaps = new ArrayList<Map>();
        HashSet<String> orgSet = new HashSet<String>();
        orgSet.add(orgId);
        if (!singleOrg && iupcControlRuleService.checkVoucherManageShareOrg(fullname, orgId).booleanValue() && !CollectionUtils.isEmpty(subOrgs = iupcControlRuleService.getOrgRangeShareAll(fullname, orgId))) {
            orgSet.addAll(subOrgs);
        }
        orgMaps.addAll(iupcControlRuleService.getOrgDetail(orgSet));
        return orgMaps;
    }

    public boolean isExcelData(BizObject biz) {
        return biz.containsKey((Object)"_fromApi") && (Boolean)biz.get("_fromApi") != false && (!biz.containsKey((Object)"__APIImportCommand") || (Boolean)biz.get("__APIImportCommand") == false);
    }

    public boolean isApiOrExcelData(BizObject biz) {
        return biz.containsKey((Object)"_fromApi") && (Boolean)biz.get("_fromApi") != false;
    }

    public void checkCreatOrg(Object id, String orgId, String fullname) throws Exception {
        if (StringUtils.isEmpty((CharSequence)orgId)) {
            return;
        }
        QuerySchema schema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(id)}));
        List clss = MetaDaoHelper.query((String)fullname, (QuerySchema)schema);
        if (!CollectionUtils.isEmpty((Collection)clss) && !orgId.equals(((Map)clss.get(0)).get("orgId"))) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800847);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.diwork.ott.exexutors.RobotExecutors
 *  com.yonyou.iuap.apdoc.coredoc.utils.ListSplitUtil
 *  com.yonyou.iuap.basedoc.mc.service.GroupService
 *  com.yonyou.iuap.data.service.itf.TenantStatusApi
 *  com.yonyou.iuap.org.dto.ConditionDTO
 *  com.yonyou.iuap.org.dto.OrgUnitDTO
 *  com.yonyou.iuap.org.dto.TenantMultiOrgInfo
 *  com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService
 *  com.yonyou.ucf.mdd.ext.base.tenant.Tenant
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyoucloud.upc.pc.cls.ManagementClass
 *  com.yonyoucloud.upc.pc.org.PubOrgGroup
 *  com.yonyoucloud.upc.pc.org.PubOrgGroupDetail
 *  iuap.yms.thread.api.YmsExecutors
 *  org.imeta.orm.schema.QueryField
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.yonyou.diwork.ott.exexutors.RobotExecutors;
import com.yonyou.iuap.apdoc.coredoc.utils.ListSplitUtil;
import com.yonyou.iuap.basedoc.mc.service.GroupService;
import com.yonyou.iuap.data.service.itf.TenantStatusApi;
import com.yonyou.iuap.org.dto.ConditionDTO;
import com.yonyou.iuap.org.dto.OrgUnitDTO;
import com.yonyou.iuap.org.dto.TenantMultiOrgInfo;
import com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService;
import com.yonyou.ucf.mdd.ext.base.tenant.Tenant;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyoucloud.upc.pc.cls.ManagementClass;
import com.yonyoucloud.upc.pc.org.PubOrgGroup;
import com.yonyoucloud.upc.pc.org.PubOrgGroupDetail;
import iuap.yms.thread.api.YmsExecutors;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import org.imeta.orm.schema.QueryField;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service(value="productClsUpGradeService")
public class ProductClsUpGradeService {
    private static Logger logger = LoggerFactory.getLogger(ProductClsUpGradeService.class);
    @Autowired
    private GroupService groupService;
    @Autowired
    private IOrgUnitQueryService orgUnitQueryService;
    @Autowired
    private TenantStatusApi tenantStatusApi;

    public void managementClassApplyRangeGroupUpGrade(List<String> tenantIdList) {
        for (String ytenantid : tenantIdList) {
            RobotExecutors.runAs((String)ytenantid, () -> {
                HashMap<String, Object> params = new HashMap<String, Object>();
                params.put("ytenantid", ytenantid);
                List ids = SqlHelper.selectList((String)"com.yonyoucloud.upc.bill.dao.productcls.selectClsIdByTenantId", params);
                if (null == ids || ids.size() == 0) {
                    return;
                }
                Long tenantId = null;
                try {
                    tenantId = (Long)SqlHelper.selectOne((String)"com.yonyoucloud.upc.bill.dao.productcls.selectTenantIdByYTenantId", params);
                    params.put("tenantid", tenantId);
                }
                catch (Exception e) {
                    logger.error("\u67e5\u8be2yxyTenantId\u51fa\u73b0\u5f02\u5e38\uff01", (Throwable)e);
                    return;
                }
                ArrayList<String> orgIdList = new ArrayList<String>();
                try {
                    List byCondition = this.orgUnitQueryService.getByCondition(ytenantid, ConditionDTO.newCondition().onlyOrganization());
                    for (OrgUnitDTO orgUnitDTO : byCondition) {
                        String string = orgUnitDTO.getId();
                        orgIdList.add(string);
                    }
                    TenantMultiOrgInfo diwork = this.tenantStatusApi.getTenantMultiOrgInfo(ytenantid, "diwork");
                    String type = diwork.getType();
                    if ("single".equals(type)) {
                        orgIdList.clear();
                        orgIdList.add(diwork.getSingleOrgId());
                    }
                    if (orgIdList.size() > 0) {
                        Collections.sort(orgIdList);
                    }
                }
                catch (Exception e) {
                    logger.error("\u8be5\u79df\u6237" + tenantId + "\u4e0b\u7ec4\u7ec7\u6709\u5783\u573e\u6570\u636e\uff0c\u6ca1\u6709\u529e\u6cd5\u5347\u7ea7\uff0c\u76f4\u63a5\u8df3\u8fc7\uff01", (Throwable)e);
                }
                if (orgIdList.size() == 0) {
                    return;
                }
                PubOrgGroup pubOrgGroup = new PubOrgGroup();
                ArrayList<PubOrgGroupDetail> pubOrgGroupDetailList = new ArrayList<PubOrgGroupDetail>();
                for (String string : orgIdList) {
                    if (null == string) continue;
                    PubOrgGroupDetail pubOrgGroupDetail = new PubOrgGroupDetail();
                    pubOrgGroupDetail.setOrgGroupType("0");
                    pubOrgGroupDetail.setOrgId(string);
                    pubOrgGroupDetail.setOrgType("1");
                    pubOrgGroupDetailList.add(pubOrgGroupDetail);
                }
                pubOrgGroup.setOrgGroupType("0");
                pubOrgGroup.setOrgGroupDetailList(pubOrgGroupDetailList);
                pubOrgGroup.setTenant(tenantId);
                pubOrgGroup.setYtenant(ytenantid);
                String groupId = this.groupService.saveGroup((Map)pubOrgGroup, "pc.pub_org_group.PubOrgGroup");
                params.put("groupId", groupId);
                params.put("groupType", "0");
                params.put("ytenantid", ytenantid);
                for (Long clsId : ids) {
                    int insert;
                    params.put("id", IdManager.getInstance().nextId());
                    params.put("clsId", clsId);
                    try {
                        SqlHelper.update((String)"com.yonyoucloud.upc.bill.dao.productcls.updateManageMentGroupIdByClsId", params);
                        int delete = SqlHelper.delete((String)"com.yonyoucloud.upc.bill.dao.productcls.deleteGroupIdByClsIdAndTenantId", params);
                        if (delete > 0) {
                            logger.info("\u7269\u6599\u5206\u7c7b\uff1a" + clsId + ",\u5b58\u5728\u9002\u7528\u8303\u56f4\u6570\u636e\u5e76\u5220\u9664\u6210\u529f\uff01");
                        }
                    }
                    catch (Exception e) {
                        logger.error("\u7269\u6599\u5206\u7c7b\uff1a" + clsId + ",\u9002\u7528\u8303\u56f4\u5220\u9664\u5f02\u5e38\uff01", (Throwable)e);
                    }
                    if ((insert = SqlHelper.insert((String)"com.yonyoucloud.upc.bill.dao.productcls.addManagementClsRangeGroup", params)) > 0) continue;
                    logger.error("\u7269\u6599\u5206\u7c7b\uff1a" + clsId + ",\u5347\u7ea7\u6570\u636e\u5931\u8d25\uff01");
                }
                if (orgIdList.size() == 1) {
                    String string = (String)orgIdList.get(0);
                    params.put("orgId", string);
                } else {
                    params.put("orgId", "666666");
                }
                try {
                    int n = SqlHelper.update((String)"com.yonyoucloud.upc.bill.dao.productcls.updateManagementClassOrgId", params);
                    if (n > 0) {
                        logger.info("\u5f53\u524d\u79df\u6237" + tenantId + "\u7ba1\u7406\u7ec4\u7ec7\u5347\u7ea7\u6210\u529f\uff01");
                    }
                }
                catch (Exception exception) {
                    logger.error("\u5f53\u524d\u79df\u6237" + tenantId + "\u7ba1\u7406\u7ec4\u7ec7\u5347\u7ea7\u5931\u8d25\uff01", (Throwable)exception);
                }
            }, (ExecutorService)YmsExecutors.getYmsExecutor());
        }
    }

    public void managementGroupUpGrade(List<Tenant> tenantList, int capacity) {
        for (Tenant tenant : tenantList) {
            Long tenantId = (Long)tenant.getId();
            try {
                String ytenantId = tenant.getYTenantId();
                HashMap<String, Object> params = new HashMap<String, Object>();
                params.put("ytenantId", ytenantId);
                List ids = SqlHelper.selectList((String)"com.yonyoucloud.upc.bill.dao.productcls.selectManagementIdByTenantId", params);
                if (CollectionUtils.isEmpty((Collection)ids)) {
                    return;
                }
                params.put("ids", ids);
                List manageGroupList = SqlHelper.selectList((String)"com.yonyoucloud.upc.bill.dao.productcls.selectGroupIdById", params);
                ArrayList paramList = new ArrayList();
                if (!CollectionUtils.isEmpty((Collection)manageGroupList)) {
                    for (Map manageGroup : manageGroupList) {
                        if (manageGroup.get("cls_id") == null || manageGroup.get("org_group_id") == null || manageGroup.get("ytenant_id") == null) continue;
                        HashMap map = new HashMap();
                        map.put("id", manageGroup.get("cls_id"));
                        map.put("orgGroupId", manageGroup.get("org_group_id"));
                        map.put("ytenantId", manageGroup.get("ytenant_id"));
                        paramList.add(map);
                    }
                }
                List paramSplitList = ListSplitUtil.splitListByCapacity(paramList, (int)capacity);
                for (List limitList : paramSplitList) {
                    SqlHelper.update((String)"com.yonyoucloud.upc.bill.dao.productcls.updateManageGroupId", (Object)limitList);
                }
                logger.error("\u79df\u6237" + tenantId + "\u7269\u6599\u5206\u7c7b\u7ec4\u7ec7\u7ec4\u6570\u636e\u5347\u7ea7\u5b8c\u6210" + LocalDateTime.now());
            }
            catch (Exception e) {
                logger.error("\u79df\u6237" + tenantId + "\u7269\u6599\u5206\u7c7b\u7ec4\u7ec7\u7ec4\u6570\u636e\u5347\u7ea7\u5f02\u5e38" + LocalDateTime.now() + e.getMessage(), (Throwable)e);
            }
        }
        logger.error("\u5168\u91cf\u7269\u6599\u5206\u7c7b\u7ec4\u7ec7\u7ec4\u6570\u636e\u5347\u7ea7\u5b8c\u6210" + LocalDateTime.now());
    }

    public void costClassGroupUpGrade(List<Tenant> tenantList, int capacity) {
        for (Tenant tenant : tenantList) {
            Long tenantId = (Long)tenant.getId();
            try {
                String ytenantId = tenant.getYTenantId();
                HashMap<String, Object> params = new HashMap<String, Object>();
                params.put("ytenantId", ytenantId);
                List costIds = SqlHelper.selectList((String)"com.yonyoucloud.upc.bill.dao.productcls.selectCostClassIdByTenantId", params);
                if (CollectionUtils.isEmpty((Collection)costIds)) continue;
                List idList = ListSplitUtil.splitListByCapacity((List)costIds, (int)capacity);
                for (List ids : idList) {
                    Long id;
                    params.put("ids", ids);
                    List costRangeList = SqlHelper.selectList((String)"com.yonyoucloud.upc.bill.dao.productcls.selectCostClassGroupIdById", params);
                    ArrayList paramList = new ArrayList();
                    HashMap idAndOrgIdMap = new HashMap();
                    if (CollectionUtils.isEmpty((Collection)costRangeList)) continue;
                    for (Map costRange : costRangeList) {
                        id = Long.valueOf(costRange.get("clsId").toString());
                        idAndOrgIdMap.put(id, new HashSet());
                    }
                    for (Map costRange : costRangeList) {
                        id = Long.valueOf(costRange.get("clsId").toString());
                        String orgId = costRange.get("orgId").toString();
                        ((Set)idAndOrgIdMap.get(id)).add(orgId);
                    }
                    for (Long id2 : idAndOrgIdMap.keySet()) {
                        if (CollectionUtils.isEmpty((Collection)((Collection)idAndOrgIdMap.get(id2)))) continue;
                        ((Set)idAndOrgIdMap.get(id2)).remove(null);
                        PubOrgGroup pubOrgGroup = new PubOrgGroup();
                        ArrayList<PubOrgGroupDetail> newPubOrgGroupDetailMapList = new ArrayList<PubOrgGroupDetail>();
                        for (String orgId : (Set)idAndOrgIdMap.get(id2)) {
                            PubOrgGroupDetail pubOrgGroupDetail = new PubOrgGroupDetail();
                            pubOrgGroupDetail.setOrgId(orgId);
                            pubOrgGroupDetail.setOrgGroupType("0");
                            pubOrgGroupDetail.setOrgType("1");
                            newPubOrgGroupDetailMapList.add(pubOrgGroupDetail);
                        }
                        pubOrgGroup.setOrgGroupType("0");
                        pubOrgGroup.setOrgGroupDetailList(newPubOrgGroupDetailMapList);
                        String groupId = this.groupService.saveGroup((Map)pubOrgGroup, "pc.pub_org_group.PubOrgGroup");
                        HashMap<String, Object> param = new HashMap<String, Object>();
                        param.put("id", id2);
                        param.put("orgGroupId", groupId);
                        param.put("ytenantId", ytenantId);
                        paramList.add(param);
                    }
                    SqlHelper.update((String)"com.yonyoucloud.upc.bill.dao.productcls.updateCostGroupId", paramList);
                    logger.error("\u79df\u6237" + tenantId + "\u6210\u672c\u5206\u7c7b\u7ec4\u7ec7\u7ec4\u6570\u636e\u5347\u7ea7\u5b8c\u6210" + LocalDateTime.now());
                }
            }
            catch (Exception e) {
                logger.error("\u79df\u6237" + tenantId + "\u6210\u672c\u5206\u7c7b\u7ec4\u7ec7\u7ec4\u6570\u636e\u5347\u7ea7\u5f02\u5e38" + LocalDateTime.now() + e.getMessage(), (Throwable)e);
            }
        }
        logger.error("\u5168\u91cf\u6210\u672c\u5206\u7c7b\u7ec4\u7ec7\u7ec4\u6570\u636e\u5347\u7ea7\u5b8c\u6210" + LocalDateTime.now());
    }

    public void managementClassApplyRangeGroupUpGradeShop(String ytenantId) {
        RobotExecutors.runAs((String)ytenantId, () -> {
            HashMap<String, Object> params = new HashMap<String, Object>();
            params.put("orgId", "666666");
            params.put("ytenant_id", ytenantId);
            List clsIdAndTenantidList = SqlHelper.selectList((String)"com.yonyoucloud.upc.bill.dao.productcls.selectClsIdAndTenantId", params);
            HashMap ytenantShopId = new HashMap();
            for (Map clsIdAndTenantid : clsIdAndTenantidList) {
                int insert;
                PubOrgGroupDetail pubOrgGroupDetail;
                ArrayList<String> shopIds;
                if (clsIdAndTenantid.get("id") == null || clsIdAndTenantid.get("tenant_id") == null || clsIdAndTenantid.get("ytenant_id") == null) continue;
                if (ytenantShopId.get((String)clsIdAndTenantid.get("ytenant_id")) == null) {
                    List orgAndShops = this.orgUnitQueryService.getByCondition((String)clsIdAndTenantid.get("ytenant_id"), ConditionDTO.newCondition().withExternalOrg());
                    List orgs = this.orgUnitQueryService.getByCondition((String)clsIdAndTenantid.get("ytenant_id"), ConditionDTO.newCondition());
                    HashSet<String> orgAndShopId = new HashSet<String>();
                    Iterator<String> orgId = new HashSet();
                    for (OrgUnitDTO orgAndShop : orgAndShops) {
                        orgAndShopId.add(orgAndShop.getId());
                    }
                    for (OrgUnitDTO org : orgs) {
                        ((HashSet)((Object)orgId)).add(org.getId());
                    }
                    shopIds = new ArrayList<String>();
                    orgAndShopId.removeAll((Collection<?>)((Object)orgId));
                    shopIds.addAll(orgAndShopId);
                    ytenantShopId.put((String)clsIdAndTenantid.get("ytenant_id"), shopIds);
                } else {
                    shopIds = (ArrayList<String>)ytenantShopId.get((String)clsIdAndTenantid.get("ytenant_id"));
                }
                if (shopIds.size() == 0) continue;
                PubOrgGroup pubOrgGroup = new PubOrgGroup();
                ArrayList<PubOrgGroupDetail> pubOrgGroupDetailList = new ArrayList<PubOrgGroupDetail>();
                params = new HashMap();
                params.put("clsId", clsIdAndTenantid.get("id"));
                params.put("orgType", 1);
                List orgList = SqlHelper.selectList((String)"com.yonyoucloud.upc.bill.dao.productcls.selectOrgIdByClsId", params);
                for (String shopId : shopIds) {
                    if (null == shopId) continue;
                    pubOrgGroupDetail = new PubOrgGroupDetail();
                    pubOrgGroupDetail.setOrgGroupType("0");
                    pubOrgGroupDetail.setOrgId(shopId);
                    pubOrgGroupDetail.setOrgType("3");
                    pubOrgGroupDetailList.add(pubOrgGroupDetail);
                }
                for (String orgid : orgList) {
                    if (null == orgid) continue;
                    pubOrgGroupDetail = new PubOrgGroupDetail();
                    pubOrgGroupDetail.setOrgGroupType("0");
                    pubOrgGroupDetail.setOrgId(orgid);
                    pubOrgGroupDetail.setOrgType("1");
                    pubOrgGroupDetailList.add(pubOrgGroupDetail);
                }
                pubOrgGroup.setOrgGroupType("0");
                pubOrgGroup.setOrgGroupDetailList(pubOrgGroupDetailList);
                pubOrgGroup.setTenant((Long)clsIdAndTenantid.get("tenant_id"));
                pubOrgGroup.setYtenant((String)clsIdAndTenantid.get("ytenant_id"));
                String groupId = this.groupService.saveGroup((Map)pubOrgGroup, "pc.pub_org_group.PubOrgGroup");
                params = new HashMap();
                params.put("groupId", groupId);
                params.put("groupType", "0");
                params.put("tenantid", clsIdAndTenantid.get("tenant_id"));
                params.put("ytenantid", clsIdAndTenantid.get("ytenant_id"));
                params.put("id", IdManager.getInstance().nextId());
                params.put("clsId", clsIdAndTenantid.get("id"));
                try {
                    int delete = SqlHelper.delete((String)"com.yonyoucloud.upc.bill.dao.productcls.deleteGroupIdByClsIdAndTenantId", params);
                    if (delete > 0) {
                        logger.info("\u7269\u6599\u5206\u7c7b\uff1a" + clsIdAndTenantid.get("id") + ",\u5b58\u5728\u9002\u7528\u8303\u56f4\u6570\u636e\u5e76\u5220\u9664\u6210\u529f\uff01");
                    }
                }
                catch (Exception e) {
                    logger.error("\u7269\u6599\u5206\u7c7b\uff1a" + clsIdAndTenantid.get("id") + ",\u9002\u7528\u8303\u56f4\u5220\u9664\u5f02\u5e38\uff01" + e.getMessage(), (Throwable)e);
                }
                if ((insert = SqlHelper.insert((String)"com.yonyoucloud.upc.bill.dao.productcls.addManagementClsRangeGroup", params)) > 0) continue;
                logger.error("\u7269\u6599\u5206\u7c7b\uff1a" + clsIdAndTenantid.get("id") + ",\u5347\u7ea7\u6570\u636e\u5931\u8d25\uff01");
            }
        });
    }

    public void rangeGroupData() throws Exception {
        QuerySchema querySchema = QuerySchema.create();
        QueryField[] qryFields = new QueryField[4];
        qryFields[0] = new QueryField("id", "id");
        qryFields[1] = new QueryField("orgId", "orgId");
        querySchema.addSelect(qryFields);
        List managementClassList = MetaDaoHelper.queryObject((String)"pc.cls.ManagementClass", (QuerySchema)querySchema, null);
        for (ManagementClass managementClass : managementClassList) {
            PubOrgGroup pubOrgGroup = new PubOrgGroup();
            ArrayList<PubOrgGroupDetail> pubOrgGroupDetailList = new ArrayList<PubOrgGroupDetail>();
            PubOrgGroupDetail pubOrgGroupDetail = new PubOrgGroupDetail();
            pubOrgGroupDetail.setOrgGroupType("0");
            pubOrgGroupDetail.setOrgId(managementClass.getOrgId());
            pubOrgGroupDetail.setOrgType("1");
            pubOrgGroupDetailList.add(pubOrgGroupDetail);
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
            params.put("clsId", managementClass.getId());
            try {
                SqlHelper.delete((String)"com.yonyoucloud.upc.bill.dao.productcls.deleteGroupIdByClsIdAndTenantId", params);
            }
            catch (Exception e) {
                logger.error("\u7269\u6599\u5206\u7c7b\u9002\u7528\u8303\u56f4\u5220\u9664\u5f02\u5e38\uff01" + e.getMessage(), (Throwable)e);
            }
            SqlHelper.insert((String)"com.yonyoucloud.upc.bill.dao.productcls.addManagementClsRangeGroup", params);
        }
    }
}


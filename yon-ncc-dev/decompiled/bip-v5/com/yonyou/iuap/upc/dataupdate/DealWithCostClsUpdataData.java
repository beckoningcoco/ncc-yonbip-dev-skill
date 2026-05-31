/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.utils.ListSplitUtil
 *  com.yonyou.iuap.basedoc.mc.service.GroupService
 *  com.yonyou.ucf.mdd.ext.base.tenant.Tenant
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyoucloud.upc.pc.org.PubOrgGroup
 *  com.yonyoucloud.upc.pc.org.PubOrgGroupDetail
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyou.iuap.upc.dataupdate;

import com.yonyou.iuap.apdoc.coredoc.utils.ListSplitUtil;
import com.yonyou.iuap.basedoc.mc.service.GroupService;
import com.yonyou.iuap.upc.dataupdate.DataUpdateBaseServcie;
import com.yonyou.ucf.mdd.ext.base.tenant.Tenant;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyoucloud.upc.pc.org.PubOrgGroup;
import com.yonyoucloud.upc.pc.org.PubOrgGroupDetail;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class DealWithCostClsUpdataData
extends DataUpdateBaseServcie {
    private static final Logger log = LoggerFactory.getLogger(DealWithCostClsUpdataData.class);
    @Autowired
    private GroupService groupService;

    @Override
    public int businessDataUpdate(Tenant tenant, int capacity) throws Exception {
        this.costClassGroupUpGrade(tenant, capacity);
        return 0;
    }

    @Override
    public String getTaskName() {
        return "\u6210\u672c\u5206\u7c7b\u65b0\u6a21\u578b\u6570\u636e\u5347\u7ea7";
    }

    public void costClassGroupUpGrade(Tenant tenant, int capacity) {
        Long tenantId = (Long)tenant.getId();
        try {
            String ytenantId = tenant.getYTenantId();
            HashMap<String, String> params = new HashMap<String, String>();
            params.put("ytenantId", ytenantId);
            List costIds = SqlHelper.selectList((String)"com.yonyoucloud.upc.bill.dao.productcls.selectCostClassIdByTenantId", params);
            if (CollectionUtils.isEmpty((Collection)costIds)) {
                return;
            }
            List idList = ListSplitUtil.splitListByCapacity((List)costIds, (int)capacity);
            for (List ids : idList) {
                this.updateGroupId(ids, ytenantId);
            }
        }
        catch (Exception e) {
            log.error("\u79df\u6237" + tenantId + "\u6210\u672c\u5206\u7c7b\u7ec4\u7ec7\u7ec4\u6570\u636e\u5347\u7ea7\u5f02\u5e38" + LocalDateTime.now() + e.getMessage(), (Throwable)e);
        }
    }

    private void updateGroupId(List<Long> ids, String ytenantId) throws Exception {
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("ytenant", ytenantId);
        params.put("ids", ids);
        List costRangeList = SqlHelper.selectList((String)"com.yonyoucloud.upc.bill.dao.productcls.selectCostClassGroupIdById", params);
        ArrayList paramList = new ArrayList();
        HashMap idAndOrgIdMap = new HashMap();
        if (!CollectionUtils.isEmpty((Collection)costRangeList)) {
            for (Map costRange : costRangeList) {
                Long id = Long.valueOf(costRange.get("clsId").toString());
                String orgId = costRange.get("orgId").toString();
                ((Set)idAndOrgIdMap.get(id)).add(orgId);
                ((Set)idAndOrgIdMap.putIfAbsent(id, new HashSet())).add(orgId);
            }
            for (Long id : idAndOrgIdMap.keySet()) {
                if (CollectionUtils.isEmpty((Collection)((Collection)idAndOrgIdMap.get(id)))) continue;
                ((Set)idAndOrgIdMap.get(id)).remove(null);
                PubOrgGroup pubOrgGroup = new PubOrgGroup();
                ArrayList<PubOrgGroupDetail> newPubOrgGroupDetailMapList = new ArrayList<PubOrgGroupDetail>();
                for (String orgId : (Set)idAndOrgIdMap.get(id)) {
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
                param.put("id", id);
                param.put("orgGroupId", groupId);
                param.put("ytenantId", ytenantId);
                paramList.add(param);
            }
            SqlHelper.update((String)"com.yonyoucloud.upc.bill.dao.productcls.updateCostGroupId", paramList);
            log.error("\u79df\u6237" + ytenantId + "\u6210\u672c\u5206\u7c7b\u7ec4\u7ec7\u7ec4\u6570\u636e\u5347\u7ea7\u5b8c\u6210" + LocalDateTime.now());
        }
    }
}


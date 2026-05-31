/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.basedoc.mc.dto.GroupDataConfigDTO
 *  com.yonyou.iuap.basedoc.mc.dto.GroupDocDTO
 *  com.yonyou.iuap.basedoc.mc.service.GroupDataConfigService
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.service;

import com.yonyou.iuap.basedoc.mc.dto.GroupDataConfigDTO;
import com.yonyou.iuap.basedoc.mc.dto.GroupDocDTO;
import com.yonyou.iuap.basedoc.mc.service.GroupDataConfigService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CoreDocGroupDataCleanConfigService
implements GroupDataConfigService {
    public List<GroupDataConfigDTO> getGroupDeleteConfigList() {
        GroupDataConfigDTO groupDataConfigDTO = new GroupDataConfigDTO();
        groupDataConfigDTO.setOrgGroupFullName("pc.pub_org_group.PubOrgGroup");
        groupDataConfigDTO.setOrgGroupDetailFullName("pc.pub_org_group.PubOrgGroupDetail");
        ArrayList<GroupDocDTO> groupDocList = new ArrayList<GroupDocDTO>();
        GroupDocDTO productGroupDocDTO = new GroupDocDTO();
        productGroupDocDTO.setDeleteDrData(false);
        productGroupDocDTO.setFullName("pc.product.ProductApplyRangeGroup");
        productGroupDocDTO.setFieldName("orgGroupId");
        productGroupDocDTO.setTenantField("tenant");
        groupDocList.add(productGroupDocDTO);
        GroupDocDTO managementClassGroupDocDTO = new GroupDocDTO();
        managementClassGroupDocDTO.setDeleteDrData(false);
        managementClassGroupDocDTO.setFullName("pc.cls.ManagementClassApplyRangeGroup");
        managementClassGroupDocDTO.setFieldName("orgGroupId");
        managementClassGroupDocDTO.setTenantField("tenant");
        groupDocList.add(managementClassGroupDocDTO);
        GroupDocDTO managementClassDocDTO = new GroupDocDTO();
        managementClassDocDTO.setDeleteDrData(false);
        managementClassDocDTO.setFullName("pc.cls.ManagementClass");
        managementClassDocDTO.setFieldName("orgGroupId");
        managementClassDocDTO.setTenantField("tenant");
        groupDocList.add(managementClassDocDTO);
        GroupDocDTO purchaseClassGroupDocDTO = new GroupDocDTO();
        purchaseClassGroupDocDTO.setDeleteDrData(false);
        purchaseClassGroupDocDTO.setFullName("pc.cls.PurchaseClassApplyRangeGroup");
        purchaseClassGroupDocDTO.setFieldName("orgGroupId");
        purchaseClassGroupDocDTO.setTenantField("tenant");
        groupDocList.add(purchaseClassGroupDocDTO);
        GroupDocDTO merchantGroupDocDTO = new GroupDocDTO();
        merchantGroupDocDTO.setDeleteDrData(false);
        merchantGroupDocDTO.setFullName("aa.merchant.MerchantApplyRangeGroup");
        merchantGroupDocDTO.setFieldName("orgGroupId");
        merchantGroupDocDTO.setTenantField("tenant");
        groupDocList.add(merchantGroupDocDTO);
        groupDataConfigDTO.setGroupDocList(groupDocList);
        ArrayList<GroupDataConfigDTO> groupDeleteConfigList = new ArrayList<GroupDataConfigDTO>();
        groupDeleteConfigList.add(groupDataConfigDTO);
        return groupDeleteConfigList;
    }

    public String getLogicDatsource() {
        return "iuap-apdoc-material_main_dataSource";
    }
}


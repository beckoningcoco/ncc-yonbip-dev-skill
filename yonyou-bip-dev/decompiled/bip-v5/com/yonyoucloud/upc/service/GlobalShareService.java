/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.diwork.ott.exexutors.RobotExecutors
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterCommonVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO
 *  com.yonyou.ucf.mdd.ext.base.tenant.Tenant
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  iuap.yms.thread.api.YmsExecutors
 *  org.imeta.spring.support.id.IdManager
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.service;

import com.yonyou.diwork.ott.exexutors.RobotExecutors;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterCommonVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.base.tenant.Tenant;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyoucloud.upc.service.ProductApplyRangeGroupService;
import com.yonyoucloud.upc.service.ProductClsUpGradeService;
import com.yonyoucloud.upc.service.merchantapplyrangegroup.MerchantGroupService;
import iuap.yms.thread.api.YmsExecutors;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import org.imeta.spring.support.id.IdManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class GlobalShareService {
    private static final Logger log = LoggerFactory.getLogger(GlobalShareService.class);
    private static Set<String> rangeAssociationList = new HashSet<String>();
    private static Set<String> filterNameList = new HashSet<String>();
    private String DELETE_RANGE_MAPPING = "com.yonyoucloud.upc.bill.dao.productcls.deleteApplyRangeByTenantId";
    @Autowired
    PubOptionService pubOptionService;
    @Autowired
    ProductApplyRangeGroupService productApplyRangeGroupService;
    @Autowired
    private MerchantGroupService merchantGroupService;
    @Autowired
    ProductClsUpGradeService productClsUpGradeService;

    private boolean containsRangeConditon(String field) {
        for (String rangeAssociation : rangeAssociationList) {
            if (!field.contains(rangeAssociation)) continue;
            return true;
        }
        return false;
    }

    public void dealGlobalShareConditionByDto(BillDataDto billDataDto) {
        boolean orgGlobalShare;
        String billnum;
        if (null != billDataDto && StringUtils.hasLength((String)(billnum = billDataDto.getBillnum())) && (orgGlobalShare = this.pubOptionService.getOrgGlobalShareByBillNum(billnum))) {
            Map treeMapCondition;
            FilterVO treeCondition;
            Map mapCondition;
            FilterVO condition = billDataDto.getCondition();
            if (null != condition) {
                this.dealCondition(condition);
            }
            if ((mapCondition = billDataDto.getMapCondition()) != null && !mapCondition.isEmpty()) {
                this.dealMapCondition(mapCondition);
            }
            if (null != (treeCondition = billDataDto.getTreeCondition())) {
                this.dealCondition(condition);
            }
            if ((treeMapCondition = billDataDto.getTreeMapCondition()) != null && !treeMapCondition.isEmpty()) {
                this.dealMapCondition(treeMapCondition);
            }
        }
    }

    private void dealMapCondition(Map<String, Object> mapCondition) {
        Iterator<Map.Entry<String, Object>> iterator = mapCondition.entrySet().iterator();
        HashSet<String> removeList = new HashSet<String>();
        while (iterator.hasNext()) {
            String filterName = iterator.next().getKey();
            if (!StringUtils.hasLength((String)filterName) || !this.containsRangeConditon(filterName)) continue;
            removeList.add(filterName);
        }
        if (removeList.size() > 0) {
            for (String fieldName : removeList) {
                mapCondition.remove(fieldName);
            }
        }
    }

    private void dealCondition(FilterVO condition) {
        if (null != condition && null != condition.getCommonVOs()) {
            FilterCommonVO[] commonVOs = this.dealCommonVoAttr(condition.getCommonVOs());
            condition.setCommonVOs(commonVOs);
        }
        if (null != condition.getSimpleVOs()) {
            SimpleFilterVO[] simpleVOs = this.dealSimpleVoAttr(condition.getSimpleVOs());
            condition.setSimpleVOs(simpleVOs);
        }
    }

    private FilterCommonVO[] dealCommonVoAttr(FilterCommonVO[] commonVOs) {
        if (commonVOs != null) {
            ArrayList<FilterCommonVO> resultVos = new ArrayList<FilterCommonVO>();
            for (FilterCommonVO commonVO : commonVOs) {
                String itemName = commonVO.getItemName();
                if (StringUtils.hasLength((String)itemName) && filterNameList.contains(itemName)) continue;
                resultVos.add(commonVO);
            }
            FilterCommonVO[] resultCommonVos = new FilterCommonVO[resultVos.size()];
            return resultVos.toArray(resultCommonVos);
        }
        return null;
    }

    private SimpleFilterVO[] dealSimpleVoAttr(SimpleFilterVO[] simpleVOs) {
        if (simpleVOs != null) {
            ArrayList<SimpleFilterVO> resultFilterVos = new ArrayList<SimpleFilterVO>();
            for (SimpleFilterVO simpleVO : simpleVOs) {
                String field = simpleVO.getField();
                if (StringUtils.hasLength((String)field) && this.containsRangeConditon(field)) continue;
                resultFilterVos.add(simpleVO);
            }
            SimpleFilterVO[] resultSimpleVOs = new SimpleFilterVO[resultFilterVos.size()];
            return resultFilterVos.toArray(resultSimpleVOs);
        }
        return null;
    }

    public void openGlobalShare(String ytenant) {
        RobotExecutors.runAs((String)ytenant, () -> {
            try {
                this.writePubOption();
                this.cleanShareDatas();
                this.cleanMerchantShareDatas();
            }
            catch (Exception e) {
                log.error(e.getMessage(), (Throwable)e);
            }
        }, (ExecutorService)YmsExecutors.getYmsExecutor());
    }

    private void cleanShareDatas() throws Exception {
        this.cleanProductShareDatas();
        this.cleanDerivativeShareData();
        this.cleanManagementClassShareData();
    }

    private void cleanProductShareDatas() throws Exception {
        HashMap<String, String> deleteRangeParam = new HashMap<String, String>();
        deleteRangeParam.put("ytenant", AppContext.getCurrentUser().getYTenantId());
        SqlHelper.delete((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.deleteProductApplyRangeGroupByTenantId", deleteRangeParam);
        Tenant tenant = new Tenant();
        tenant.setId((Object)AppContext.getCurrentUser().getYxyTenantId());
        tenant.setTenantCenter(AppContext.getCurrentUser().getYTenantId());
        tenant.setYTenantId(AppContext.getCurrentUser().getYTenantId());
        ArrayList<Tenant> tenants = new ArrayList<Tenant>();
        tenants.add(tenant);
        this.productApplyRangeGroupService.applyRangeGroupDataUpgradeFromOld(null, tenants, 50);
    }

    private void writePubOption() throws Exception {
        HashMap<String, Object> data = new HashMap<String, Object>();
        data.put("id", IdManager.getInstance().nextId());
        data.put("tenant_id", AppContext.getCurrentUser().getYxyTenantId());
        data.put("ytenant_id", AppContext.getCurrentUser().getYTenantId());
        data.put("name", "orgGlobalShare");
        data.put("caption", "orgGlobalShare");
        data.put("value", "1");
        SqlHelper.update((String)"com.yonyoucloud.upc.aa.industryinit.cancelProductNameUniqueCheck", data);
    }

    private void cleanMerchantShareDatas() throws Exception {
        HashMap<String, String> deleteRangeParam = new HashMap<String, String>();
        deleteRangeParam.put("ytenant", AppContext.getCurrentUser().getYTenantId());
        SqlHelper.delete((String)"com.yonyoucloud.upc.data.MerchantDoubleWriteDao.deleteMerchantApplyRangeByTenantId", deleteRangeParam);
        this.merchantGroupService.compensationMerchantApplyRangeGroup(AppContext.getCurrentUser().getYTenantId(), 10);
    }

    private void cleanManagementClassShareData() throws Exception {
        this.productClsUpGradeService.rangeGroupData();
    }

    private void cleanDerivativeShareData() throws Exception {
        HashMap<String, String> deleteRangeParam = new HashMap<String, String>();
        deleteRangeParam.put("ytenant", AppContext.getCurrentUser().getYTenantId());
        SqlHelper.delete((String)this.DELETE_RANGE_MAPPING, deleteRangeParam);
    }

    static {
        rangeAssociationList.add("productApplyRange.orgId");
        rangeAssociationList.add("orgGroupDetailList.orgId");
        rangeAssociationList.add("merchantApplyRanges.orgId");
        rangeAssociationList.add("merchantApplyRangeId.orgId");
        rangeAssociationList.add("merchantApplyRangeExtId.orgId");
        rangeAssociationList.add("merchantApplyRangeExts.orgId");
        rangeAssociationList.add("saleAreaApplyRange.orgId");
        rangeAssociationList.add("costClassApplyRanges.orgId");
        rangeAssociationList.add("custCategoryApplyRanges.orgId");
        filterNameList.add("productApplyRange_orgId");
        filterNameList.add("productId_productApplyRange_orgId");
        filterNameList.add("merchantAppliedDetail.merchantApplyRangeId.orgId");
        filterNameList.add("saleAreaApplyRange_orgId");
        filterNameList.add("costClassApplyRanges_orgId");
        filterNameList.add("managementClassApplyRanges_orgId");
        filterNameList.add("custCategoryApplyRanges_orgId");
    }
}


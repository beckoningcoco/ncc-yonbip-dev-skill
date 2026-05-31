/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyoucloud.upc.aa.merchant.Principal
 *  com.yonyoucloud.upc.data.merchant.MerchantGroupDao
 *  com.yonyoucloud.uretail.sys.auth.CustomAuthContent
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.iuap.upc.dataauth;

import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyoucloud.iuap.upc.dataauth.DPBaseRule;
import com.yonyoucloud.iuap.upc.dataauth.DmDeptAuthRule;
import com.yonyoucloud.upc.aa.merchant.Principal;
import com.yonyoucloud.upc.data.merchant.MerchantGroupDao;
import com.yonyoucloud.upc.service.UpcDeptQueryService;
import com.yonyoucloud.uretail.sys.auth.CustomAuthContent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
public class StaffMainJobHigherAndLowerDeptRule
extends DPBaseRule {
    private static final Logger log = LoggerFactory.getLogger(StaffMainJobHigherAndLowerDeptRule.class);
    @Autowired
    private DmDeptAuthRule dmDeptAuthRule;
    @Autowired
    private UpcDeptQueryService deptQueryService;
    @Autowired
    private MerchantGroupDao merchantGroupDao;
    @Autowired
    private YMSParamConfig ymsParamConfig;

    @Override
    protected Set<String> getCustomValues(CustomAuthContent content, String personId) throws Exception {
        Set<String> mainJobDeptIdList = this.dmDeptAuthRule.getCustomValues(content, personId);
        if (!CollectionUtils.isEmpty(mainJobDeptIdList)) {
            Set<String> childrenDeptList;
            HashSet<String> deptIdSet = new HashSet<String>();
            Set<String> parentDeptList = this.deptQueryService.getParentDeptList(mainJobDeptIdList);
            if (!CollectionUtils.isEmpty(parentDeptList)) {
                deptIdSet.addAll(parentDeptList);
            }
            if (!CollectionUtils.isEmpty(childrenDeptList = this.deptQueryService.getChildrenDeptList(parentDeptList))) {
                deptIdSet.addAll(childrenDeptList);
            }
            return this.getMerchantId(new ArrayList<String>(deptIdSet));
        }
        return new HashSet<String>();
    }

    private Set<String> getMerchantId(List<String> deptIdList) throws Exception {
        if (CollectionUtils.isEmpty(deptIdList)) {
            return new HashSet<String>();
        }
        HashSet<String> merchantIdSet = new HashSet<String>();
        Long currentRangeId = 0L;
        int realMaxRowsValue = this.ymsParamConfig.getResultMaxRowsValue() - 1;
        List principalList = this.merchantGroupDao.getPrincipalByDeptAndMinId(deptIdList, currentRangeId, realMaxRowsValue);
        ArrayList principals = new ArrayList(principalList);
        while (principalList.size() >= realMaxRowsValue) {
            currentRangeId = (Long)((Principal)principalList.get(principalList.size() - 1)).getId();
            principalList = this.merchantGroupDao.getPrincipalByDeptAndMinId(deptIdList, currentRangeId, realMaxRowsValue);
            principals.addAll(principalList);
        }
        if (!CollectionUtils.isEmpty(principals)) {
            for (Principal principal : principals) {
                merchantIdSet.add(principal.getMerchantId().toString());
            }
        }
        return merchantIdSet;
    }
}


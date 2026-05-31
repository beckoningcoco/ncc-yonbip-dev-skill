/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.utils.ListSplitUtil
 *  com.yonyou.iuap.org.dto.BaseDeptDTO
 *  com.yonyou.iuap.org.dto.BizDeptDTO
 *  com.yonyou.iuap.org.dto.ConditionDTO
 *  com.yonyou.iuap.org.service.itf.core.IBizDeptQueryService
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.service;

import com.yonyou.iuap.apdoc.coredoc.utils.ListSplitUtil;
import com.yonyou.iuap.org.dto.BaseDeptDTO;
import com.yonyou.iuap.org.dto.BizDeptDTO;
import com.yonyou.iuap.org.dto.ConditionDTO;
import com.yonyou.iuap.org.service.itf.core.IBizDeptQueryService;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

@Component
public class UpcDeptQueryService {
    @Autowired
    private IBizDeptQueryService bizDeptQueryService;

    public Set<String> getChildrenDeptList(Set<String> departmentIdList) {
        if (CollectionUtils.isEmpty(departmentIdList)) {
            return new HashSet<String>();
        }
        HashSet<String> childDeptIdList = new HashSet<String>();
        ArrayList<String> deptIdList = new ArrayList<String>(departmentIdList);
        List deptIdsList = ListSplitUtil.splitListByCapacity(deptIdList, (int)10);
        ConditionDTO conditionDTO = ConditionDTO.newDeptCondition().withEnabled().withDisabled();
        String yhtTenantId = (String)AppContext.getYhtTenantId();
        for (List deptIds : deptIdsList) {
            List bizDeptDtoList = this.bizDeptQueryService.batchGetChildrenDeptsByCondition(yhtTenantId, deptIds, conditionDTO);
            if (CollectionUtils.isEmpty((Collection)bizDeptDtoList)) continue;
            List deptDtoIds = bizDeptDtoList.stream().map(BaseDeptDTO::getId).collect(Collectors.toList());
            childDeptIdList.addAll(deptDtoIds);
        }
        return childDeptIdList;
    }

    public Set<String> getParentDeptList(Set<String> departmentIdList) {
        if (CollectionUtils.isEmpty(departmentIdList)) {
            return new HashSet<String>();
        }
        HashSet<String> parentDeptIdList = new HashSet<String>();
        String yhtTenantId = (String)AppContext.getYhtTenantId();
        for (String deptId : departmentIdList) {
            String parentDeptId = this.bizDeptQueryService.getParentId(yhtTenantId, deptId);
            if (!StringUtils.hasText((String)parentDeptId)) continue;
            parentDeptIdList.add(parentDeptId);
        }
        return parentDeptIdList;
    }

    public BizDeptDTO getBizDeptById(String departmentId) {
        if (!StringUtils.hasLength((String)departmentId)) {
            return null;
        }
        return (BizDeptDTO)this.bizDeptQueryService.getById((String)AppContext.getYhtTenantId(), departmentId);
    }
}


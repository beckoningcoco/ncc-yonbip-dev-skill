/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.basedocmc.dto.McFieldControlDTO
 *  com.yonyou.iuap.basedocmc.dto.McFieldCtrlRule
 *  com.yonyou.iuap.basedocmc.service.McRemoteInvokeService
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.yms.api.IYmsJdbcApi
 *  com.yonyou.iuap.yms.param.BaseEntity
 *  com.yonyou.iuap.yms.param.SQLParameter
 *  com.yonyoucloud.upc.attrcontrol.DocAttributeControlConfig
 *  com.yonyoucloud.upc.service.attrcontrol.DocAttributeControlConfigService
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.service.api.attrcontrol;

import com.yonyou.iuap.basedocmc.dto.McFieldControlDTO;
import com.yonyou.iuap.basedocmc.dto.McFieldCtrlRule;
import com.yonyou.iuap.basedocmc.service.McRemoteInvokeService;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.yms.api.IYmsJdbcApi;
import com.yonyou.iuap.yms.param.BaseEntity;
import com.yonyou.iuap.yms.param.SQLParameter;
import com.yonyoucloud.upc.attrcontrol.DocAttributeControlConfig;
import com.yonyoucloud.upc.service.attrcontrol.DocAttributeControlConfigService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

@Service
public class CoreDocMcRemoteInvokeService
implements McRemoteInvokeService {
    @Autowired
    DocAttributeControlConfigService docAttributeControlConfigService;
    @Autowired
    IYmsJdbcApi ymsJdbcApi;

    public Map<String, Boolean> checkDelManage(String fullName, List<String> orgIds) {
        return Collections.emptyMap();
    }

    public void delManage(String fullName, List<String> orgIdList) {
        if (!StringUtils.hasLength((String)fullName) || CollectionUtils.isEmpty(orgIdList)) {
            return;
        }
        orgIdList = orgIdList.stream().filter(o -> !Objects.isNull(o)).distinct().collect(Collectors.toList());
        DocAttributeControlConfig docAttributeControlConfig = new DocAttributeControlConfig();
        String orgIds = String.join((CharSequence)"','", orgIdList);
        String deleteSQL = String.format("org_id IN ('%s') AND ytenant_id = '%s' AND archive_type = '%s'", orgIds, InvocationInfoProxy.getTenantid(), fullName);
        this.ymsJdbcApi.removeByClause((BaseEntity)docAttributeControlConfig, deleteSQL, false);
    }

    public List<McFieldControlDTO> getFieldContrlDTOs(String fullName, String orgId) {
        SQLParameter sqlParameter = new SQLParameter();
        sqlParameter.addParam(InvocationInfoProxy.getTenantid());
        sqlParameter.addParam(orgId);
        sqlParameter.addParam(fullName);
        List docAttributeControlConfigList = this.ymsJdbcApi.queryForDTOList("select * from doc_attribute_control_config where ytenant_id = ? and org_id = ? and archive_type = ? and control_type = '0'", sqlParameter, DocAttributeControlConfig.class);
        if (!CollectionUtils.isEmpty((Collection)docAttributeControlConfigList)) {
            ArrayList<McFieldControlDTO> mcFieldControlDTOList = new ArrayList<McFieldControlDTO>();
            docAttributeControlConfigList.forEach(docAttributeControlConfig -> {
                McFieldControlDTO mcFieldControlDTO = new McFieldControlDTO();
                mcFieldControlDTO.setCode(docAttributeControlConfig.getAttributeCode());
                mcFieldControlDTO.setName(docAttributeControlConfig.getAttributeName());
                mcFieldControlDTO.setDefaultValue((Object)docAttributeControlConfig.getAttributeDefaultValue());
                mcFieldControlDTO.setFieldCtrlRule("0".equals(docAttributeControlConfig.getControlType()) ? McFieldCtrlRule.MANAGEORGCTRL : McFieldCtrlRule.USEDORGCTRL);
                mcFieldControlDTOList.add(mcFieldControlDTO);
            });
            return mcFieldControlDTOList;
        }
        return Collections.emptyList();
    }

    public Set<String> getMCOpenedFieldContrl(String fullName, List<String> orgIdList) {
        SQLParameter sqlParameter = new SQLParameter();
        sqlParameter.addParam(InvocationInfoProxy.getTenantid());
        sqlParameter.addParam(fullName);
        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder.append("select org_id from doc_attribute_control_config where ytenant_id = ? and archive_type = ? and org_id in (");
        for (String orgId : orgIdList) {
            sqlBuilder.append("?,");
            sqlParameter.addParam(orgId);
        }
        sqlBuilder.deleteCharAt(sqlBuilder.length() - 1);
        sqlBuilder.append(")");
        List returnOrgIdList = this.ymsJdbcApi.queryForDTOList(sqlBuilder.toString(), sqlParameter, DocAttributeControlConfig.class);
        return returnOrgIdList.stream().map(DocAttributeControlConfig::getOrgId).collect(Collectors.toSet());
    }

    public Set<String> getMCOpenedFieldContrl(String fullName) {
        SQLParameter sqlParameter = new SQLParameter();
        sqlParameter.addParam(InvocationInfoProxy.getTenantid());
        sqlParameter.addParam(fullName);
        List returnOrgIdList = this.ymsJdbcApi.queryForDTOList("select org_id from doc_attribute_control_config where ytenant_id = ? and org_id <> '0' and archive_type = ?", sqlParameter, DocAttributeControlConfig.class);
        return returnOrgIdList.stream().map(DocAttributeControlConfig::getOrgId).collect(Collectors.toSet());
    }
}


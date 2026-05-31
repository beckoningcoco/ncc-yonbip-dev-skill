/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.yms.api.IYmsJdbcApi
 *  com.yonyou.iuap.yms.param.SQLParameter
 *  com.yonyou.ucf.mdd.common.model.Pager
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterCommonVO
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.enums.util.EnumUtil
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.attrcontrol.DocAttributeControlConfig
 *  com.yonyoucloud.upc.attrcontrol.DocAttributeControlConfigDTO
 *  com.yonyoucloud.upc.service.attrcontrol.DocAttributeControlConfigService
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.billrule.attrcontrol;

import com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.yms.api.IYmsJdbcApi;
import com.yonyou.iuap.yms.param.SQLParameter;
import com.yonyou.ucf.mdd.common.model.Pager;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterCommonVO;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.enums.util.EnumUtil;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.attrcontrol.DocAttributeControlConfig;
import com.yonyoucloud.upc.attrcontrol.DocAttributeControlConfigDTO;
import com.yonyoucloud.upc.service.attrcontrol.DocAttributeControlConfigService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttrControlConfigQueryAfterRule
extends AbstractCommonRule {
    @Autowired
    IYmsJdbcApi ymsJdbcApi;
    @Autowired
    DocAttributeControlConfigService docAttributeControlConfigService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        Pager pager = (Pager)paramMap.get("return");
        if (pager == null || pager.getRecordList() == null) {
            return new RuleExecuteResult();
        }
        BillDataDto billDataDto = (BillDataDto)paramMap.get("param");
        ArrayList<HashMap> recordList = new ArrayList<HashMap>();
        HashMap<String, Object> mapCondition = new HashMap<String, Object>();
        if (billDataDto.getCondition() != null && billDataDto.getCondition().getCommonVOs() != null) {
            FilterCommonVO[] commonVOs;
            for (FilterCommonVO filterCommonVO : commonVOs = billDataDto.getCondition().getCommonVOs()) {
                mapCondition.put(filterCommonVO.getItemName(), filterCommonVO.getValue1());
            }
        }
        SQLParameter sqlParameter = new SQLParameter();
        sqlParameter.addParam(InvocationInfoProxy.getTenantid());
        sqlParameter.addParam(billDataDto.getMapCondition().get("archiveType").toString());
        StringBuilder sql = new StringBuilder();
        sql.append("select * from doc_attribute_control_config where ytenant_id in ('0', ?) and org_id = '0' and archive_type = ?");
        if (mapCondition.get("attributeName") != null) {
            sqlParameter.addParam("%" + mapCondition.get("attributeName") + "%");
            sql.append(" and attribute_name like ?");
        }
        sql.append(" order by attribute_group");
        DocAttributeControlConfigDTO docAttributeControlConfigDTO = this.docAttributeControlConfigService.queryAttrControlConfigByOwnCondition(sql.toString(), sqlParameter);
        List docAttributeControlConfigList = docAttributeControlConfigDTO.getDocAttributeControlConfigList();
        if (mapCondition.get("controlType") != null) {
            docAttributeControlConfigList = docAttributeControlConfigList.stream().filter(a -> a.getControlType().equals(mapCondition.get("controlType").toString())).collect(Collectors.toList());
        }
        SQLParameter sysSqlParameter = new SQLParameter();
        sysSqlParameter.addParam(billDataDto.getMapCondition().get("archiveType").toString());
        String sysSql = "select attribute_code,control_type from doc_attribute_control_config where ytenant_id = '0' and org_id = '0' and archive_type = ?";
        List defaultAttributeControlConfigList = this.ymsJdbcApi.queryForDTOList(sysSql, sysSqlParameter, DocAttributeControlConfig.class);
        HashMap defaultControlTypeMap = new HashMap();
        defaultAttributeControlConfigList.forEach(a -> defaultControlTypeMap.put(a.getAttributeCode(), a.getControlType()));
        Set enumTypeSet = docAttributeControlConfigList.stream().filter(a -> a.getAttributeType().equals("1")).map(DocAttributeControlConfig::getReferenceAttributeDefaultCode).collect(Collectors.toSet());
        Map enumTypeMap = EnumUtil.getEnumByTypes(enumTypeSet, (boolean)true);
        for (DocAttributeControlConfig docAttributeControlConfig : docAttributeControlConfigList) {
            HashMap docAttributeControlConfigMap = (HashMap)UpcJacksonUtils.OBJECT_MAPPER.convertValue((Object)docAttributeControlConfig, HashMap.class);
            docAttributeControlConfigMap.put("defaultControlType", defaultControlTypeMap.get(docAttributeControlConfig.getAttributeCode()));
            if ("1".equals(docAttributeControlConfig.getAttributeType())) {
                docAttributeControlConfigMap.put("enumString", UpcJacksonUtils.OBJECT_MAPPER.writeValueAsString(enumTypeMap.get(docAttributeControlConfig.getReferenceAttributeDefaultCode())));
            }
            recordList.add(docAttributeControlConfigMap);
        }
        pager.setRecordList(recordList);
        pager.setPageCount(recordList.size());
        return new RuleExecuteResult();
    }

    private void dealConditionGroup(QueryConditionGroup queryConditionGroup, HashMap<String, Object> mapCondition) {
        List expressions = queryConditionGroup.conditions();
        for (ConditionExpression expression : expressions) {
            if (expression instanceof QueryConditionGroup) {
                this.dealConditionGroup((QueryConditionGroup)expression, mapCondition);
            }
            if (!(expression instanceof QueryCondition)) continue;
            QueryCondition condition = (QueryCondition)expression;
            mapCondition.put(condition.field(), condition.v1());
        }
    }
}


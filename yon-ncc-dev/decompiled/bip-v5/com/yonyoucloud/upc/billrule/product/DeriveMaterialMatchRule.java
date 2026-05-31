/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.alibaba.fastjson.JSONObject
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.type.compose.range.DecimalRange
 *  com.yonyou.iuap.type.compose.range.IRange
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.utils.MathDataUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.core.base.ConditionOperator
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.product;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.type.compose.range.DecimalRange;
import com.yonyou.iuap.type.compose.range.IRange;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.utils.MathDataUtils;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.imeta.core.base.ConditionOperator;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="deriveMaterialMatchRule")
public class DeriveMaterialMatchRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        List<Long> deriveMaterialIds;
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        Map<String, Object> extendConditionMap = this.getExtndConditionMap(billDataDto);
        if (extendConditionMap == null) {
            return new RuleExecuteResult();
        }
        Long productId = (Long)extendConditionMap.get("productId");
        String orgId = (String)extendConditionMap.get("orgId");
        Map optionCharacterValue = (Map)extendConditionMap.get("characterFieldAndValue");
        if (productId == null || StringUtils.isEmpty((CharSequence)orgId)) {
            throw new CoreDocBusinessException("productId or orgId is null");
        }
        FilterVO gridFilter = billDataDto.getCondition();
        if (gridFilter == null) {
            gridFilter = new FilterVO();
        }
        if (CollectionUtils.isEmpty(deriveMaterialIds = this.getDeriveMaterialsByOptionMaterialAndOrg(productId, optionCharacterValue, orgId))) {
            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("id", "eq", (Object)-1)});
        } else {
            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("id", "in", deriveMaterialIds)});
        }
        billDataDto.setCondition(gridFilter);
        this.putParam(map, billDataDto);
        return new RuleExecuteResult(map);
    }

    private Map<Long, List<String>> getTplCharacterListMap(Set<Long> tplIds, Set<String> characterCodes) {
        if (CollectionUtils.isEmpty(tplIds) || CollectionUtils.isEmpty(characterCodes)) {
            return null;
        }
        HashMap<Long, List<String>> tplCharacterListMap = new HashMap<Long, List<String>>();
        HashMap<String, Object> param = new HashMap<String, Object>();
        param.put("tplIds", tplIds);
        param.put("characterCodes", characterCodes);
        param.put("ytenant", AppContext.getYTenantId());
        param.put("limitCount", UpcAPiTool.MAX_COUNT);
        List tplCharacterList = SqlHelper.selectList((String)"com.yonyoucloud.upc.mapper.productcharacter.getTplCharacterList", param);
        if (!CollectionUtils.isEmpty((Collection)tplCharacterList)) {
            for (Map tplCharacter : tplCharacterList) {
                List<String> characterCodeList;
                long tplId = Long.parseLong(tplCharacter.get("tplId").toString());
                if (tplCharacterListMap.containsKey(tplId)) {
                    characterCodeList = (List)tplCharacterListMap.get(tplId);
                    characterCodeList.add(tplCharacter.get("characterCode").toString());
                    continue;
                }
                characterCodeList = new ArrayList<String>();
                characterCodeList.add(tplCharacter.get("characterCode").toString());
                tplCharacterListMap.put(tplId, characterCodeList);
            }
        }
        return tplCharacterListMap;
    }

    private Map<String, Object> getExtndConditionMap(BillDataDto billDataDto) {
        String extendCondition = billDataDto.getExtendCondition();
        if (StringUtils.isBlank((CharSequence)extendCondition)) {
            return null;
        }
        JSONObject extndConditionMap = JSON.parseObject((String)extendCondition);
        Object productId = extndConditionMap.get("productId");
        Object orgId = extndConditionMap.get("orgId");
        Object characterFieldAndValue = extndConditionMap.get("characterFieldAndValue");
        if (productId == null || orgId == null || characterFieldAndValue == null) {
            return null;
        }
        HashMap<String, Object> result = new HashMap<String, Object>();
        result.put("productId", Long.parseLong(productId.toString()));
        result.put("orgId", orgId.toString());
        Map characterFieldAndValueMap = (Map)characterFieldAndValue;
        characterFieldAndValueMap.entrySet().removeIf(entry -> Objects.isNull(entry.getValue()));
        result.put("characterFieldAndValue", characterFieldAndValueMap);
        return result;
    }

    private List<Long> getDeriveMaterialsByOptionMaterialAndOrg(Long productId, Map<String, Object> optionCharacterValue, String orgId) throws Exception {
        ArrayList<Long> deriveMaterialIds;
        block5: {
            List<Product> deriveMateriallist;
            block4: {
                deriveMateriallist = this.getDeriveMaterialList(productId, orgId);
                deriveMaterialIds = new ArrayList<Long>();
                if (optionCharacterValue != null && optionCharacterValue.size() != 0 || CollectionUtils.isEmpty(deriveMateriallist)) break block4;
                for (Product deriveMaterial : deriveMateriallist) {
                    deriveMaterialIds.add(Long.parseLong(deriveMaterial.getId().toString()));
                }
                break block5;
            }
            if (CollectionUtils.isEmpty(deriveMateriallist)) break block5;
            Set<Long> tplIds = this.getTplIds(deriveMateriallist);
            Map<Long, List<String>> tplCharacterListMap = this.getTplCharacterListMap(tplIds, optionCharacterValue.keySet());
            for (Product deriveMaterial : deriveMateriallist) {
                Long productTemplate = deriveMaterial.getProductTemplate();
                List<String> characterCodes = tplCharacterListMap.get(productTemplate);
                if (CollectionUtils.isEmpty(characterCodes)) {
                    deriveMaterialIds.add(Long.parseLong(deriveMaterial.getId().toString()));
                    continue;
                }
                Object productPropCharacterDefine = deriveMaterial.getProductPropCharacterDefine();
                if (!(productPropCharacterDefine instanceof Map)) continue;
                Map productPropCharacterDefineMap = (Map)productPropCharacterDefine;
                boolean flag = true;
                for (String characterCode : characterCodes) {
                    Object characterValue = optionCharacterValue.get(characterCode);
                    Object sourceValue = productPropCharacterDefineMap.get(characterCode);
                    boolean isMatch = this.matchCharacterValue(characterValue, sourceValue);
                    if (productPropCharacterDefineMap.containsKey(characterCode) && isMatch) continue;
                    flag = false;
                    break;
                }
                if (!flag) continue;
                deriveMaterialIds.add(Long.parseLong(deriveMaterial.getId().toString()));
            }
        }
        return deriveMaterialIds;
    }

    private Set<Long> getTplIds(List<Product> deriveMateriallist) {
        if (CollectionUtils.isEmpty(deriveMateriallist)) {
            return null;
        }
        HashSet<Long> tplIds = new HashSet<Long>();
        for (Product product : deriveMateriallist) {
            Long productTemplate = product.getProductTemplate();
            tplIds.add(productTemplate);
        }
        return tplIds;
    }

    private boolean matchCharacterValue(Object characterValue, Object sourceValue) {
        if (characterValue != null && sourceValue != null) {
            if (sourceValue instanceof String) {
                String characterValueStr = characterValue.toString();
                String sourceValueStr = sourceValue.toString();
                return sourceValueStr.equals(characterValueStr);
            }
            if (sourceValue instanceof Integer) {
                Boolean characterValueBr = this.getBoolean(characterValue);
                Boolean sourceValueBr = this.getBoolean(sourceValue);
                return sourceValueBr.equals(characterValueBr);
            }
            if (sourceValue instanceof Boolean) {
                Boolean characterValueBr = this.getBoolean(characterValue);
                Boolean sourceValueBr = this.getBoolean(sourceValue);
                return sourceValueBr.equals(characterValueBr);
            }
            if (sourceValue instanceof BigDecimal) {
                BigDecimal characterValueBD = MathDataUtils.getBigDecimal((Object)characterValue);
                BigDecimal sourceValueBD = (BigDecimal)sourceValue;
                return sourceValueBD.doubleValue() == characterValueBD.doubleValue();
            }
            if (sourceValue instanceof Timestamp && characterValue instanceof String) {
                String characterValueStr = characterValue.toString();
                String sourceValueStr = sourceValue.toString().substring(0, 10);
                return sourceValueStr.equals(characterValueStr);
            }
            if (sourceValue instanceof Long) {
                Long characterValueL = this.getLong(characterValue);
                Long sourceValueL = (Long)sourceValue;
                return sourceValueL.equals(characterValueL);
            }
            if (sourceValue instanceof DecimalRange) {
                DecimalRange characterValueDR = (DecimalRange)JSON.parseObject((String)JSON.toJSONString((Object)characterValue), DecimalRange.class);
                return characterValueDR.intersectionWith((IRange)sourceValue);
            }
        }
        return false;
    }

    private List<Product> getDeriveMaterialList(Long productId, String orgId) throws Exception {
        HashMap<String, Object> param = new HashMap<String, Object>();
        param.put("productId", productId);
        param.put("orgId", orgId);
        param.put("ytenant", AppContext.getYTenantId());
        param.put("limitCount", UpcAPiTool.MAX_COUNT);
        List deriveMaterialIdMapList = SqlHelper.selectList((String)"com.yonyoucloud.upc.mapper.productcharacter.getDeriveMaterialIdMapList", param);
        if (CollectionUtils.isEmpty((Collection)deriveMaterialIdMapList)) {
            return null;
        }
        List deriveMaterialIds = deriveMaterialIdMapList.stream().map(v -> Long.parseLong(v.get("id").toString())).collect(Collectors.toList());
        QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(deriveMaterialIds)});
        QuerySchema querySchema = QuerySchema.create().addSelect("id,productTemplate,productPropCharacterDefine").addCondition((ConditionExpression)condition);
        querySchema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        List deriveMaterialList = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)querySchema);
        if (!CollectionUtils.isEmpty((Collection)deriveMaterialList)) {
            ArrayList<Product> productList = new ArrayList<Product>();
            for (Map deriveMaterial : deriveMaterialList) {
                Product product = new Product();
                product.init(deriveMaterial);
                productList.add(product);
            }
            return productList;
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private Boolean getBoolean(Object value) {
        if (value == null) return null;
        if (value instanceof Boolean) {
            return (Boolean)value;
        }
        if (value instanceof String) {
            return Boolean.valueOf((String)value);
        }
        if (!(value instanceof Integer)) throw new ClassCastException("Not possible to coerce [" + value + "] from class " + value.getClass() + " into a Boolean.");
        Integer valueInt = (Integer)value;
        return valueInt == 1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private Long getLong(Object value) {
        if (value == null) return null;
        if (value instanceof Long) {
            return (Long)value;
        }
        if (value instanceof String) {
            return new Long((String)value);
        }
        if (!(value instanceof Integer)) throw new ClassCastException("Not possible to coerce [" + value + "] from class " + value.getClass() + " into a Long.");
        return new Long(((Integer)value).intValue());
    }
}


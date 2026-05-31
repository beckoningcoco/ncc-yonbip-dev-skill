/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.product.Product
 *  org.imeta.core.base.ConditionOperator
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.product;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.pc.product.Product;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.core.base.ConditionOperator;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="productTplFilterRule")
public class ProductTplFilterRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List data = (List)billDataDto.getData();
        if (data == null || data.size() == 0) {
            return new RuleExecuteResult();
        }
        Product product = (Product)data.get(0);
        Object isOptionalMaterial = product.get("isOptionalMaterial");
        Object isDerivedMaterial = product.get("isDerivedMaterial");
        Object optionalMaterialId = product.get("optionalMaterialId");
        FilterVO gridFilter = billDataDto.getCondition();
        if (gridFilter == null) {
            gridFilter = new FilterVO();
        }
        if (isOptionalMaterial != null && 1 == Integer.parseInt(isOptionalMaterial.toString())) {
            Short optionalType = product.getOptionalType();
            if (optionalType == null) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SELECT_OPTIONAL_TYPE_ERROR);
            }
            if (optionalType == 0) {
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("isOptionalTemplate", "eq", (Object)1)});
            } else {
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("isOptionalTemplate", "eq", (Object)0)});
            }
        } else if (isDerivedMaterial != null && 1 == Integer.parseInt(isDerivedMaterial.toString()) && optionalMaterialId != null) {
            List<Long> tplIdList = this.getDeriveProductTplList(Long.valueOf(optionalMaterialId.toString()));
            if (!CollectionUtils.isEmpty(tplIdList)) {
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("id", "in", tplIdList)});
            } else {
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("1", "eq", (Object)2)});
            }
        } else {
            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("isOptionalTemplate", "eq", (Object)0)});
        }
        billDataDto.setCondition(gridFilter);
        this.putParam(map, billDataDto);
        return new RuleExecuteResult();
    }

    private List<Long> getDeriveProductTplList(Long productId) throws Exception {
        List<Map<String, Object>> optionProducttplCharacterList = this.getOptionProductCharacters(productId);
        ArrayList<Long> optionProductPropCharacterIds = new ArrayList<Long>();
        ArrayList<Long> optionProductOptionCharacterIds = new ArrayList<Long>();
        if (!CollectionUtils.isEmpty(optionProducttplCharacterList)) {
            for (Map<String, Object> optionProducttplCharacter : optionProducttplCharacterList) {
                if (1L == Long.parseLong(optionProducttplCharacter.get("characteristicsType").toString())) {
                    optionProductPropCharacterIds.add(Long.parseLong(optionProducttplCharacter.get("characterId").toString()));
                    continue;
                }
                if (4L != Long.parseLong(optionProducttplCharacter.get("characteristicsType").toString())) continue;
                optionProductOptionCharacterIds.add(Long.parseLong(optionProducttplCharacter.get("characterId").toString()));
            }
        } else {
            return null;
        }
        HashMap<String, Object> param = new HashMap<String, Object>();
        param.put("tenant", AppContext.getTenantId());
        param.put("ytenant", AppContext.getYTenantId());
        List deriveTplCharacterList = SqlHelper.selectList((String)"com.yonyoucloud.upc.userdef.dao.ProductTplCharacter.selectDeriveProductCharacter", param);
        HashMap deriveTplCharacterMap = new HashMap();
        if (!CollectionUtils.isEmpty((Collection)deriveTplCharacterList)) {
            for (Map deriveTplCharacter : deriveTplCharacterList) {
                Map<Long, Integer> deriveFreeCharacterIdMap;
                Map<Long, Integer> deriveProductPropCharacterIdMap;
                Map deriveTplCharacterInfo;
                Object tpl = deriveTplCharacter.get("tpl_id");
                if (deriveTplCharacterMap.containsKey(Long.parseLong(tpl.toString()))) {
                    deriveTplCharacterInfo = (Map)deriveTplCharacterMap.get(Long.parseLong(tpl.toString()));
                    deriveProductPropCharacterIdMap = new HashMap();
                    deriveFreeCharacterIdMap = new HashMap();
                    if (deriveTplCharacter.get("characteristicsType") == null || deriveTplCharacter.get("characterId") == null) continue;
                    if (1L == Long.parseLong(deriveTplCharacter.get("characteristicsType").toString())) {
                        if (deriveTplCharacterInfo.containsKey("deriveProductPropCharacterIdMap")) {
                            deriveProductPropCharacterIdMap = (Map)deriveTplCharacterInfo.get("deriveProductPropCharacterIdMap");
                        }
                        deriveProductPropCharacterIdMap.put(Long.parseLong(deriveTplCharacter.get("characterId").toString()), 1);
                        deriveTplCharacterInfo.put("deriveProductPropCharacterIdMap", deriveProductPropCharacterIdMap);
                        continue;
                    }
                    if (3L != Long.parseLong(deriveTplCharacter.get("characteristicsType").toString())) continue;
                    if (deriveTplCharacterInfo.containsKey("deriveFreeCharacterIdMap")) {
                        deriveFreeCharacterIdMap = (Map)deriveTplCharacterInfo.get("deriveFreeCharacterIdMap");
                    }
                    deriveFreeCharacterIdMap.put(Long.parseLong(deriveTplCharacter.get("characterId").toString()), 1);
                    deriveTplCharacterInfo.put("deriveFreeCharacterIdMap", deriveFreeCharacterIdMap);
                    continue;
                }
                deriveTplCharacterInfo = new HashMap();
                deriveProductPropCharacterIdMap = new HashMap<Long, Integer>();
                deriveFreeCharacterIdMap = new HashMap<Long, Integer>();
                if (deriveTplCharacter.get("characteristicsType") == null || deriveTplCharacter.get("characterId") == null) continue;
                if (1L == Long.parseLong(deriveTplCharacter.get("characteristicsType").toString())) {
                    deriveProductPropCharacterIdMap.put(Long.parseLong(deriveTplCharacter.get("characterId").toString()), 1);
                    deriveTplCharacterInfo.put("deriveProductPropCharacterIdMap", deriveProductPropCharacterIdMap);
                } else if (3L == Long.parseLong(deriveTplCharacter.get("characteristicsType").toString())) {
                    deriveFreeCharacterIdMap.put(Long.parseLong(deriveTplCharacter.get("characterId").toString()), 1);
                    deriveTplCharacterInfo.put("deriveFreeCharacterIdMap", deriveFreeCharacterIdMap);
                }
                deriveTplCharacterMap.put(Long.parseLong(tpl.toString()), deriveTplCharacterInfo);
            }
        }
        ArrayList<Long> tplIdList = new ArrayList<Long>();
        if (deriveTplCharacterMap.size() > 0) {
            for (Map.Entry entry : deriveTplCharacterMap.entrySet()) {
                Map value = (Map)entry.getValue();
                boolean productPropFilterfalg = false;
                boolean optionFilterfalg = false;
                Object deriveProductPropCharacterIds = value.get("deriveProductPropCharacterIdMap");
                Object deriveFreeCharacterIds = value.get("deriveFreeCharacterIdMap");
                if (CollectionUtils.isEmpty(optionProductPropCharacterIds)) {
                    productPropFilterfalg = true;
                } else if (deriveProductPropCharacterIds != null) {
                    Map deriveProductPropCharacterIdMap = (Map)deriveProductPropCharacterIds;
                    productPropFilterfalg = this.mapContailAll(deriveProductPropCharacterIdMap, optionProductPropCharacterIds);
                }
                HashMap<Long, Object> propAndFreeCharacters = new HashMap<Long, Object>();
                if (deriveProductPropCharacterIds != null) {
                    Map deriveProductPropCharacterIdMap = (Map)deriveProductPropCharacterIds;
                    propAndFreeCharacters.putAll(deriveProductPropCharacterIdMap);
                }
                if (deriveFreeCharacterIds != null) {
                    Map deriveFreeCharacterIdMap = (Map)deriveFreeCharacterIds;
                    propAndFreeCharacters.putAll(deriveFreeCharacterIdMap);
                }
                optionFilterfalg = this.mapContailAll(propAndFreeCharacters, optionProductOptionCharacterIds);
                if (!productPropFilterfalg || !optionFilterfalg) continue;
                tplIdList.add((Long)entry.getKey());
            }
        }
        return tplIdList;
    }

    private boolean mapContailAll(Map<Long, Object> map, List<Long> ids) {
        if (map == null) {
            return false;
        }
        if (!CollectionUtils.isEmpty(ids)) {
            for (Long id : ids) {
                if (map.containsKey(id)) continue;
                return false;
            }
        }
        return true;
    }

    private List<Map<String, Object>> getOptionProductCharacters(Long productId) {
        HashMap<String, Object> param = new HashMap<String, Object>();
        param.put("productId", productId);
        param.put("tenant", AppContext.getTenantId());
        param.put("ytenant", AppContext.getYTenantId());
        return SqlHelper.selectList((String)"com.yonyoucloud.upc.userdef.dao.ProductTplCharacter.selectOptionProductCharacter", param);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.ucf.CharacterDTO
 *  com.yonyou.ucf.CharacterDocValueDTO
 *  com.yonyou.ucf.mdd.core.utils.IMetaUtils
 *  com.yonyoucloud.upc.pc.product.CharacteristicsTypeEnum
 *  com.yonyoucloud.upc.pc.product.ProductFreeCharacterItem
 *  com.yonyoucloud.upc.pc.tpl.ProductTplCharacter
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.core.model.Entity
 *  org.imeta.core.model.Property
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.ucf.CharacterDTO;
import com.yonyou.ucf.CharacterDocValueDTO;
import com.yonyou.ucf.mdd.core.utils.IMetaUtils;
import com.yonyoucloud.upc.pc.product.CharacteristicsTypeEnum;
import com.yonyoucloud.upc.pc.product.ProductFreeCharacterItem;
import com.yonyoucloud.upc.pc.tpl.ProductTplCharacter;
import com.yonyoucloud.upc.service.AchiveDataQueryService;
import com.yonyoucloud.upc.service.ProductSkuService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.imeta.core.model.Entity;
import org.imeta.core.model.Property;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class ProductSkuCharacterService {
    public static final String CHARACTER_NAME = "characterNme";
    public static final String CHARACTER_VALUE = "value";
    @Autowired
    ProductSkuService productSkuService;
    @Autowired
    AchiveDataQueryService achiveDataQueryService;

    public List<ProductFreeCharacterItem> getCharacterDataFromCharacteristics(String fullName, BizObject charactersData, String type, Long productTemplate, CharacteristicsTypeEnum characteristicsTypeEnum) throws Exception {
        Entity entity = IMetaUtils.entity((String)fullName);
        List attributes = entity.attributes();
        ArrayList<ProductFreeCharacterItem> characterDatas = new ArrayList<ProductFreeCharacterItem>();
        for (Property property : attributes) {
            String name;
            boolean isType;
            Boolean isCharacter = property.getIsCharacter();
            boolean bl = isType = null == type ? true : property.getBizType().equalsIgnoreCase(type);
            if (!isCharacter.booleanValue() || !isType || null == charactersData.get(name = property.name())) continue;
            ProductFreeCharacterItem productFreeCharacterItem = new ProductFreeCharacterItem();
            productFreeCharacterItem.setCharacterCode(name);
            productFreeCharacterItem.setCharacterValueId(charactersData.get(name).toString());
            characterDatas.add(productFreeCharacterItem);
        }
        this.checkCharacterTpl(characterDatas, productTemplate, characteristicsTypeEnum);
        this.dealFreeCharacterItems(characterDatas);
        this.sortCharacterItem(characterDatas);
        return characterDatas;
    }

    private void sortCharacterItem(List<ProductFreeCharacterItem> characterDatas) {
        characterDatas.sort(Comparator.comparing(ProductFreeCharacterItem::getIOrder));
    }

    public void checkCharacterTpl(List<ProductFreeCharacterItem> productFreeCharacterItems, long productTemplate, CharacteristicsTypeEnum characteristicsTypeEnum) throws Exception {
        Map<String, ProductTplCharacter> charactersInTplMap = this.getCharactersByTemplate(productTemplate, characteristicsTypeEnum);
        if (charactersInTplMap.size() != productFreeCharacterItems.size()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800859);
        }
        for (ProductFreeCharacterItem item : productFreeCharacterItems) {
            if (charactersInTplMap.containsKey(item.getCharacterCode())) {
                ProductTplCharacter productTplCharacter = charactersInTplMap.get(item.getCharacterCode());
                item.setCharacteristicsId(productTplCharacter.getCharacteristics());
                item.setCharacterId(productTplCharacter.getCharacter());
                item.setIOrder(productTplCharacter.getIOrder());
                continue;
            }
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800860, new Object[]{item.getCharacterCode()});
        }
    }

    public Map<String, ProductTplCharacter> getCharactersByTemplate(long productTemplate, CharacteristicsTypeEnum characteristicsType) throws Exception {
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"template").eq((Object)productTemplate), QueryCondition.name((String)"characteristicsType").eq((Object)characteristicsType.getValue())});
        if (CharacteristicsTypeEnum.IFreeCT == characteristicsType) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"skuSens").eq((Object)true));
        }
        QuerySchema schema = QuerySchema.create().addSelect("characteristics, character, characterCode, skuSens, iOrder").addCondition((ConditionExpression)queryConditionGroup);
        List productTplCharacters = this.productSkuService.query("pc.tpl.ProductTplCharacter", schema);
        HashMap<String, ProductTplCharacter> productTplCharacterMap = new HashMap<String, ProductTplCharacter>(productTplCharacters.size());
        for (ProductTplCharacter productTplCharacter : productTplCharacters) {
            productTplCharacterMap.put(productTplCharacter.getCharacterCode(), productTplCharacter);
        }
        return productTplCharacterMap;
    }

    public void dealFreeCharacterItems(List<ProductFreeCharacterItem> productfreecharacteritems) throws Exception {
        if (CollectionUtils.isEmpty(productfreecharacteritems)) {
            return;
        }
        HashMap<String, ArrayList<String>> characterIdAndValuesMap = new HashMap<String, ArrayList<String>>();
        for (ProductFreeCharacterItem freeCharacterItem : productfreecharacteritems) {
            Long characterId = freeCharacterItem.getCharacterId();
            ArrayList<String> valueIds = (ArrayList<String>)characterIdAndValuesMap.get(characterId.toString());
            if (null == valueIds) {
                valueIds = new ArrayList<String>();
                characterIdAndValuesMap.put(characterId.toString(), valueIds);
            }
            valueIds.add(freeCharacterItem.getCharacterValueId());
        }
        HashMap<String, String> characterValuesMap = new HashMap<String, String>();
        HashMap<String, String> characterNamesMap = new HashMap<String, String>();
        for (Map.Entry next : characterIdAndValuesMap.entrySet()) {
            String key = (String)next.getKey();
            List values = (List)next.getValue();
            CharacterDTO characterDTO = this.achiveDataQueryService.getCharacterByIdAndValueIds(Long.parseLong(key), values, false);
            characterNamesMap.put(characterDTO.getId().toString(), characterDTO.getName());
            List charactorDocValueDTOList = characterDTO.getCharactorDocValueDTOList();
            String refRetFieldName = characterDTO.getRefRetFieldName();
            Long characterDTOId = characterDTO.getId();
            if (CollectionUtils.isEmpty((Collection)charactorDocValueDTOList)) continue;
            for (CharacterDocValueDTO characterDocValueDTO : charactorDocValueDTOList) {
                String id = characterDocValueDTO.getId();
                Map doc = characterDocValueDTO.getDoc();
                if (doc != null && null != doc.get(refRetFieldName)) {
                    String locale;
                    Object value = doc.get(refRetFieldName);
                    if (value instanceof String) {
                        characterValuesMap.put(characterDTOId + id, doc.get(refRetFieldName).toString());
                        continue;
                    }
                    if (!(value instanceof Map)) continue;
                    Map valueMap = (Map)doc.get(refRetFieldName);
                    if (null != valueMap.get(locale = InvocationInfoProxy.getLocale())) {
                        characterValuesMap.put(characterDTOId + id, valueMap.get(locale).toString());
                        continue;
                    }
                    if (null != valueMap.get("zh_CN")) {
                        characterValuesMap.put(characterDTOId + id, valueMap.get("zh_CN").toString());
                        continue;
                    }
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800861);
                }
                characterValuesMap.put(characterDTOId + id, null);
            }
        }
        for (ProductFreeCharacterItem freeCharacterItem : productfreecharacteritems) {
            Long characterId = freeCharacterItem.getCharacterId();
            String characterValueId = freeCharacterItem.getCharacterValueId();
            String value = (String)characterValuesMap.get(characterId + characterValueId);
            if (StringUtils.isEmpty((CharSequence)value)) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800862, new Object[]{freeCharacterItem.getCharacterCode(), characterValueId});
            }
            freeCharacterItem.put(CHARACTER_VALUE, (Object)value);
            freeCharacterItem.put(CHARACTER_NAME, characterNamesMap.get(characterId.toString()));
        }
    }
}


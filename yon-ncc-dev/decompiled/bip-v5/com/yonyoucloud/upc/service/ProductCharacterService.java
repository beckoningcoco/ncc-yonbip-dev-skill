/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.dao.pub.CoreDocBaseDao
 *  com.yonyou.iuap.apdoc.coredoc.dao.pub.QueryDaoDTO
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool
 *  com.yonyou.iuap.apdoc.coredoc.enums.QueryOperatorEnum
 *  com.yonyou.iuap.apdoc.coredoc.po.material.MaterialFreeCharacterItemPO
 *  com.yonyou.iuap.apdoc.coredoc.po.pub.CoreDocBaseEntity
 *  com.yonyou.iuap.apdoc.coredoc.po.pub.QueryConditionPO
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyoucloud.upc.pc.tpl.ProductTplCharacter
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.yonyou.iuap.apdoc.coredoc.dao.pub.CoreDocBaseDao;
import com.yonyou.iuap.apdoc.coredoc.dao.pub.QueryDaoDTO;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool;
import com.yonyou.iuap.apdoc.coredoc.enums.QueryOperatorEnum;
import com.yonyou.iuap.apdoc.coredoc.po.material.MaterialFreeCharacterItemPO;
import com.yonyou.iuap.apdoc.coredoc.po.pub.CoreDocBaseEntity;
import com.yonyou.iuap.apdoc.coredoc.po.pub.QueryConditionPO;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyoucloud.upc.pc.tpl.ProductTplCharacter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service(value="productCharacterService")
public class ProductCharacterService {
    private static final Logger log = LoggerFactory.getLogger(ProductCharacterService.class);
    @Autowired
    private CoreDocBaseDao coreDocBaseDao;

    public List<Map<String, Object>> getSensitiveCharacterByProduct(List<Long> productIds, Long characteristicsType) throws Exception {
        if (CollectionUtils.isEmpty(productIds) || Objects.isNull(characteristicsType)) {
            return null;
        }
        HashMap<String, Object> param = new HashMap<String, Object>(2);
        param.put("productIds", productIds);
        param.put("characteristicsType", characteristicsType);
        param.put("ytenant", AppContext.getYTenantId());
        log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408021C", (String)"==========> ProductCharacterService.getSensitiveCharacterByProduct\uff0c\u53c2\u6570param\uff1a{}"), param);
        return SqlHelper.selectList((String)"com.yonyoucloud.upc.mapper.productcharacter.getSensitiveCharactersByProduct", param);
    }

    public HashMap<Long, List<Long>> getCharacterIdsByTplIds(List<Long> tplIds, Long characteristicsType, String sensitive) {
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        if (tplIds != null && tplIds.size() > 0) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"template").in(tplIds));
        }
        if (characteristicsType != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"characteristicsType").eq((Object)characteristicsType));
        }
        if (sensitive != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)sensitive).eq((Object)true));
        }
        QuerySchema schema = QuerySchema.create().addSelect("template as tplId,character as character").addCondition((ConditionExpression)queryConditionGroup);
        schema.distinct();
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        try {
            List productTplCharacterList = MetaDaoHelper.query((String)"pc.tpl.ProductTplCharacter", (QuerySchema)schema);
            if (productTplCharacterList != null && productTplCharacterList.size() > 0) {
                HashMap<Long, List<Long>> tplMap = new HashMap<Long, List<Long>>(8);
                for (Map productTplCharacter : productTplCharacterList) {
                    Long tplId = Long.valueOf(productTplCharacter.get("tplId").toString());
                    Long characterId = Long.valueOf(productTplCharacter.get("character").toString());
                    List<Long> characterLis = tplMap.get(tplId);
                    if (characterLis == null) {
                        characterLis = new ArrayList<Long>();
                    }
                    characterLis.add(characterId);
                    tplMap.put(tplId, characterLis);
                }
                return tplMap;
            }
        }
        catch (Exception e) {
            log.error(e.getMessage(), (Throwable)e);
        }
        return null;
    }

    public HashMap<Long, List<ProductTplCharacter>> getCharacterByTplIds(List<Long> tplIds, Long characteristicsType, String sensitive) {
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        if (tplIds != null && tplIds.size() > 0) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"template").in(tplIds));
        }
        if (characteristicsType != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"characteristicsType").eq((Object)characteristicsType));
        }
        if (sensitive != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)sensitive).eq((Object)true));
        }
        QuerySchema schema = QuerySchema.create().addSelect("iOrder, template as tplId,character as character,characteristics as characteristics,characterCode as characterCode").addCondition((ConditionExpression)queryConditionGroup);
        schema.distinct().addOrderBy("iOrder asc");
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        try {
            List productTplCharacterList = MetaDaoHelper.query((String)"pc.tpl.ProductTplCharacter", (QuerySchema)schema);
            if (productTplCharacterList != null && productTplCharacterList.size() > 0) {
                HashMap<Long, List<ProductTplCharacter>> tplMap = new HashMap<Long, List<ProductTplCharacter>>(8);
                for (Map productTplCharacter : productTplCharacterList) {
                    Long tplId = Long.valueOf(productTplCharacter.get("tplId").toString());
                    List<ProductTplCharacter> characterLis = tplMap.get(tplId);
                    if (characterLis == null) {
                        characterLis = new ArrayList<ProductTplCharacter>();
                    }
                    ProductTplCharacter productTplCharacter1 = new ProductTplCharacter();
                    productTplCharacter1.setCharacterCode(String.valueOf(productTplCharacter.get("characterCode").toString()));
                    productTplCharacter1.setCharacter(Long.valueOf(productTplCharacter.get("character").toString()));
                    productTplCharacter1.setCharacteristics(Long.valueOf(productTplCharacter.get("characteristics").toString()));
                    characterLis.add(productTplCharacter1);
                    tplMap.put(tplId, characterLis);
                }
                return tplMap;
            }
        }
        catch (Exception e) {
            log.error(e.getMessage(), (Throwable)e);
        }
        return null;
    }

    public List<Map<String, Object>> getSensitiveCharacterByProductTpl(List<Long> productTplIds, Long characteristicsType) {
        if (CollectionUtils.isEmpty(productTplIds) || Objects.isNull(characteristicsType)) {
            return null;
        }
        HashMap<String, Object> param = new HashMap<String, Object>();
        param.put("productTplIds", productTplIds);
        param.put("characteristicsType", characteristicsType);
        param.put("ytenant", AppContext.getYTenantId());
        return SqlHelper.selectList((String)"com.yonyoucloud.upc.mapper.productcharacter.getSensitiveCharactersByProductTpl", param);
    }

    public List<Long> getSensitiveCharacterIdsByProduct(Long productId, Long characteristicsType, String sensitive) {
        if (Objects.isNull(characteristicsType) || Objects.isNull(sensitive)) {
            return null;
        }
        List<Map<String, Object>> characterList = this.getProductCharacter(productId, characteristicsType, sensitive);
        if (CollectionUtils.isEmpty(characterList)) {
            return null;
        }
        ArrayList<Long> characterIds = new ArrayList<Long>();
        for (Map<String, Object> characterMap : characterList) {
            Object senstiveObj = characterMap.get(sensitive);
            if (!BooleanUtil.isTrue((Object)senstiveObj)) continue;
            characterIds.add(Long.valueOf(characterMap.get("character").toString()));
        }
        return characterIds;
    }

    public List<Long> getFreeCharacterIdsByProduct(Long productId, Long characteristicsType) {
        if (Objects.isNull(characteristicsType)) {
            return null;
        }
        List<Map<String, Object>> characterList = this.getProductCharacter(productId, characteristicsType, null);
        if (CollectionUtils.isEmpty(characterList)) {
            return null;
        }
        ArrayList<Long> characterIds = new ArrayList<Long>();
        for (Map<String, Object> characterMap : characterList) {
            characterIds.add(Long.valueOf(characterMap.get("character").toString()));
        }
        return characterIds;
    }

    private List<Map<String, Object>> getProductCharacter(Long productId, Long characteristicsType, String sensitive) {
        if (Objects.isNull(characteristicsType)) {
            return null;
        }
        HashMap<String, Object> param = new HashMap<String, Object>(4);
        param.put("characteristicsType", characteristicsType);
        param.put("ytenant", AppContext.getYTenantId());
        if (Objects.nonNull(productId)) {
            param.put("productId", productId);
        }
        if (Objects.nonNull(sensitive)) {
            param.put("sensitive", sensitive);
        }
        return SqlHelper.selectList((String)"com.yonyoucloud.upc.mapper.productcharacter.getSensitiveCharacterIdsByProduct", param);
    }

    public List<MaterialFreeCharacterItemPO> getSkuAlbumByProduct(final List<Long> productIds) throws Exception {
        if (!CollectionUtils.isEmpty(productIds)) {
            QueryDaoDTO queryDaoDTO = new QueryDaoDTO();
            queryDaoDTO.setCoreDocBaseEntity((CoreDocBaseEntity)new MaterialFreeCharacterItemPO());
            queryDaoDTO.setConditionList((List)new ArrayList(){
                {
                    this.add(new QueryConditionPO("productId", QueryOperatorEnum.IN, productIds));
                }
            });
            return this.coreDocBaseDao.queryEntityByCondition(queryDaoDTO);
        }
        return new ArrayList<MaterialFreeCharacterItemPO>();
    }
}


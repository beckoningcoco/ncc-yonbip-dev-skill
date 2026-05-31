/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.ListSplitUtil
 *  com.yonyou.ucf.mdd.ext.base.tenant.Tenant
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyoucloud.upc.pc.product.CharacteristicsTypeEnum
 *  com.yonyoucloud.upc.pc.tpl.ProductTplCharacter
 *  org.imeta.core.base.MetaRepository
 *  org.imeta.core.model.Entity
 *  org.imeta.core.model.Property
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyou.iuap.upc.dataupdate;

import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.ListSplitUtil;
import com.yonyou.iuap.upc.dataupdate.DataUpdateBaseServcie;
import com.yonyou.ucf.mdd.ext.base.tenant.Tenant;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyoucloud.upc.pc.product.CharacteristicsTypeEnum;
import com.yonyoucloud.upc.pc.tpl.ProductTplCharacter;
import com.yonyoucloud.upc.service.RestoreSkuService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import org.imeta.core.base.MetaRepository;
import org.imeta.core.model.Entity;
import org.imeta.core.model.Property;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class DealWithSKUCharacterErrorData
extends DataUpdateBaseServcie {
    public static final String SKUFREE_CHARACTER_DEFINE_TABLENAME = "skufreecharacter_";
    @Autowired
    RestoreSkuService restoreSkuService;
    @Autowired
    MetaRepository metaRepository;

    @Override
    public int businessDataUpdate(Tenant tenant, int capacity) throws Exception {
        Map<Long, List<ProductTplCharacter>> productTplMap = this.getProductTplList(tenant);
        if (!productTplMap.isEmpty()) {
            Map<String, Property> SkuFreeCharacterField = this.getEntityFieldByUri("pc.product.SkuFreeCharacter");
            for (Map.Entry<Long, List<ProductTplCharacter>> entry : productTplMap.entrySet()) {
                Long tplId = entry.getKey();
                List<ProductTplCharacter> tplCharacters = entry.getValue();
                List<Long> productIds = this.getProductIds(tenant, tplId);
                String querySql = this.buildQuerySql(SkuFreeCharacterField, tplCharacters);
                List splitLists = ListSplitUtil.splitListByCapacity(productIds, (int)2000);
                ArrayList<Map<String, Object>> allResult = new ArrayList<Map<String, Object>>();
                for (List splitList : splitLists) {
                    List<Map<String, Object>> productSkuList = this.queryProductSku(tenant, splitList, querySql);
                    if (CollectionUtils.isEmpty(productSkuList)) continue;
                    allResult.addAll(productSkuList);
                }
            }
        }
        return 1;
    }

    @Override
    public String getTaskName() {
        return "\u5220\u9664\u7269\u6599\u4e0d\u5b58\u5728\u7684sku\u76f8\u5173\u6570\u636e";
    }

    private List<Map<String, Object>> queryProductSku(Tenant tenant, List<Long> splitList, String querySql) {
        HashMap<String, String> params = new HashMap<String, String>();
        querySql.replace("#ytenant", tenant.getYTenantId());
        String productIds = splitList.stream().map(String::valueOf).collect(Collectors.joining(","));
        querySql.replace("#productIds", productIds);
        params.put("sql", querySql);
        return SqlHelper.selectList((String)"com.yonyou.ucf.mdd.ext.meta.dao.selectList", params);
    }

    private String buildQuerySql(Map<String, Property> skuFreeCharacterField, List<ProductTplCharacter> tplCharacters) {
        if (!Objects.isNull(skuFreeCharacterField) && !CollectionUtils.isEmpty(tplCharacters)) {
            Map<String, List<String>> tableAndClumnsMap = this.getChaarcterElasticTableInfo(skuFreeCharacterField, tplCharacters);
            return DealWithSKUCharacterErrorData.buildQuerySkuSql(tableAndClumnsMap);
        }
        return null;
    }

    private static String buildQuerySkuSql(Map<String, List<String>> tableAndClumnsMap) {
        String sqlTmp = "select ps.id %s\nfrom productsku ps\n%swhere ps.ytenant_id = '#ytenant'\nand ps.productId in(#productIds) \nand ps.isSKU = 1\nand (%s)";
        String joinTmp = "join %s %s\non %s.id = ps.skufreecharacter and %s.ytenant_id = ps.ytenant_id\n";
        StringBuilder joinSql = new StringBuilder();
        StringBuilder selectFieldSql = new StringBuilder();
        StringBuilder conditionSql = new StringBuilder();
        for (Map.Entry<String, List<String>> entry : tableAndClumnsMap.entrySet()) {
            String tableName = entry.getKey();
            List<String> columnList = entry.getValue();
            String tableAlias = "sfc" + tableName.substring(tableName.indexOf("_"));
            joinSql.append(String.format(joinTmp, tableName, tableAlias, tableAlias, tableAlias));
            for (String column : columnList) {
                selectFieldSql.append(",");
                selectFieldSql.append(tableAlias);
                selectFieldSql.append(".");
                selectFieldSql.append(column);
                conditionSql.append(tableAlias);
                conditionSql.append(".");
                conditionSql.append(column);
                conditionSql.append(" is null or ");
            }
        }
        return String.format(sqlTmp, selectFieldSql, joinSql, conditionSql.substring(0, conditionSql.lastIndexOf("or")));
    }

    private Map<String, List<String>> getChaarcterElasticTableInfo(Map<String, Property> skuFreeCharacterField, List<ProductTplCharacter> tplCharacters) {
        HashMap<String, List<String>> tableAndColumnMap = new HashMap<String, List<String>>();
        for (ProductTplCharacter tplCharacter : tplCharacters) {
            if (Objects.isNull(tplCharacter.getCharacterCode())) {
                throw new CoreDocBusinessException(null, "\u7269\u6599\u6a21\u677f\u7279\u5f81\u6570\u636e\u95ee\u9898\uff0c\u7279\u5f81\u7f16\u7801\u4e3a\u7a7a\uff0c\u6a21\u677fid\uff1a" + tplCharacter.getTemplate());
            }
            if (!skuFreeCharacterField.containsKey(tplCharacter.getCharacterCode())) continue;
            Property property = skuFreeCharacterField.get(tplCharacter.getCharacterCode());
            String tableName = SKUFREE_CHARACTER_DEFINE_TABLENAME + property.getSeqIndex();
            List columnList = tableAndColumnMap.containsKey(tableName) ? (List)tableAndColumnMap.get(tableName) : new ArrayList();
            columnList.add(property.columnName());
            tableAndColumnMap.put(tableName, columnList);
        }
        return tableAndColumnMap;
    }

    public Map<String, Property> getEntityFieldByUri(String uri) throws Exception {
        Entity propEntity = this.metaRepository.entity(uri);
        List attributes = propEntity.attributes();
        HashMap<String, Property> attributesMap = new HashMap<String, Property>(attributes.size());
        for (Property property : attributes) {
            String name = property.name();
            attributesMap.put(name, property);
        }
        return attributesMap;
    }

    private List<Long> getProductIds(Tenant tenant, Long tplId) throws Exception {
        QueryConditionGroup conditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)tenant.getYTenantId()), QueryCondition.name((String)"productTemplate").eq((Object)tplId)});
        QuerySchema querySchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)conditionGroup);
        List productMapList = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)querySchema);
        return productMapList.stream().map(v -> Long.valueOf(v.get("id").toString())).collect(Collectors.toList());
    }

    private Map<Long, List<ProductTplCharacter>> getProductTplList(Tenant tenant) throws Exception {
        QueryConditionGroup conditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)tenant.getYTenantId()), QueryCondition.name((String)"characteristicsType").eq((Object)CharacteristicsTypeEnum.IFreeCT.getValue()), QueryCondition.name((String)"skuSens").eq((Object)"1")});
        QuerySchema querySchema = QuerySchema.create().addSelect(new String[]{"template", "characteristics", "character", "characterCode"}).addCondition((ConditionExpression)conditionGroup);
        List productTplCharacterMapList = MetaDaoHelper.query((String)"pc.tpl.ProductTplCharacter", (QuerySchema)querySchema);
        HashMap<Long, List<ProductTplCharacter>> tplIdAndProductTplCharacter = new HashMap<Long, List<ProductTplCharacter>>();
        for (Map productTplCharacterMap : productTplCharacterMapList) {
            ProductTplCharacter productTplCharacter = new ProductTplCharacter();
            productTplCharacter.init(productTplCharacterMap);
            if (productTplCharacter.getTemplate() == null) continue;
            List<Object> productTplCharacterList = tplIdAndProductTplCharacter.containsKey(productTplCharacter.getTemplate()) ? (List)tplIdAndProductTplCharacter.get(productTplCharacter.getTemplate()) : new ArrayList<ProductTplCharacter>();
            productTplCharacterList.add(productTplCharacter);
            tplIdAndProductTplCharacter.put(productTplCharacter.getTemplate(), productTplCharacterList);
        }
        return tplIdAndProductTplCharacter;
    }
}


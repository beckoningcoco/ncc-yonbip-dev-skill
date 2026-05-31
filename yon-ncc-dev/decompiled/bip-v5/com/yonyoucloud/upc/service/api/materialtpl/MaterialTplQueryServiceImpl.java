/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.iuap.apdoc.coredoc.po.materialtpl.MaterialTplAssistUnitPO
 *  com.yonyou.iuap.apdoc.coredoc.po.materialtpl.MaterialTplBrandPO
 *  com.yonyou.iuap.apdoc.coredoc.po.materialtpl.MaterialTplCharacterPO
 *  com.yonyou.iuap.apdoc.coredoc.po.materialtpl.MaterialTplCyclePropertyPO
 *  com.yonyou.iuap.apdoc.coredoc.po.materialtpl.MaterialTplOrderPropertyPO
 *  com.yonyou.iuap.apdoc.coredoc.po.materialtpl.MaterialTplPO
 *  com.yonyou.iuap.apdoc.coredoc.po.materialtpl.MaterialTplParameterPO
 *  com.yonyou.iuap.apdoc.coredoc.po.materialtpl.MaterialTplUnitPO
 *  com.yonyou.iuap.apdoc.coredoc.vo.materialtpl.MaterialTplAssistUnitVO
 *  com.yonyou.iuap.apdoc.coredoc.vo.materialtpl.MaterialTplBrandVO
 *  com.yonyou.iuap.apdoc.coredoc.vo.materialtpl.MaterialTplCharacterVO
 *  com.yonyou.iuap.apdoc.coredoc.vo.materialtpl.MaterialTplCyclePropertyVO
 *  com.yonyou.iuap.apdoc.coredoc.vo.materialtpl.MaterialTplOrderPropertyVO
 *  com.yonyou.iuap.apdoc.coredoc.vo.materialtpl.MaterialTplParameterVO
 *  com.yonyou.iuap.apdoc.coredoc.vo.materialtpl.MaterialTplUnitVO
 *  com.yonyou.iuap.apdoc.coredoc.vo.materialtpl.MaterialTplVO
 *  com.yonyou.iuap.graphql.builder.IDefaultQuerySchemaBuilder
 *  com.yonyou.iuap.graphql.builder.QueryBuilders
 *  com.yonyou.iuap.graphql.builder.QueryConditions
 *  com.yonyou.iuap.graphql.builder.QueryFields
 *  com.yonyou.iuap.graphql.model.IQuerySchema
 *  com.yonyou.iuap.graphql.model.conditions.IConditionExpression
 *  com.yonyou.iuap.graphql.model.conditions.group.IQueryConditionGroup
 *  com.yonyou.iuap.graphql.model.field.IQueryField
 *  com.yonyou.iuap.graphql.query.IMapDataAccessApi
 *  com.yonyou.iuap.international.MultiLangText
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.upc.pc.product.CharacteristicsTypeEnum
 *  org.apache.commons.lang3.ObjectUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.service.api.materialtpl;

import com.alibaba.fastjson.JSON;
import com.yonyou.iuap.apdoc.coredoc.po.materialtpl.MaterialTplAssistUnitPO;
import com.yonyou.iuap.apdoc.coredoc.po.materialtpl.MaterialTplBrandPO;
import com.yonyou.iuap.apdoc.coredoc.po.materialtpl.MaterialTplCharacterPO;
import com.yonyou.iuap.apdoc.coredoc.po.materialtpl.MaterialTplCyclePropertyPO;
import com.yonyou.iuap.apdoc.coredoc.po.materialtpl.MaterialTplOrderPropertyPO;
import com.yonyou.iuap.apdoc.coredoc.po.materialtpl.MaterialTplPO;
import com.yonyou.iuap.apdoc.coredoc.po.materialtpl.MaterialTplParameterPO;
import com.yonyou.iuap.apdoc.coredoc.po.materialtpl.MaterialTplUnitPO;
import com.yonyou.iuap.apdoc.coredoc.vo.materialtpl.MaterialTplAssistUnitVO;
import com.yonyou.iuap.apdoc.coredoc.vo.materialtpl.MaterialTplBrandVO;
import com.yonyou.iuap.apdoc.coredoc.vo.materialtpl.MaterialTplCharacterVO;
import com.yonyou.iuap.apdoc.coredoc.vo.materialtpl.MaterialTplCyclePropertyVO;
import com.yonyou.iuap.apdoc.coredoc.vo.materialtpl.MaterialTplOrderPropertyVO;
import com.yonyou.iuap.apdoc.coredoc.vo.materialtpl.MaterialTplParameterVO;
import com.yonyou.iuap.apdoc.coredoc.vo.materialtpl.MaterialTplUnitVO;
import com.yonyou.iuap.apdoc.coredoc.vo.materialtpl.MaterialTplVO;
import com.yonyou.iuap.graphql.builder.IDefaultQuerySchemaBuilder;
import com.yonyou.iuap.graphql.builder.QueryBuilders;
import com.yonyou.iuap.graphql.builder.QueryConditions;
import com.yonyou.iuap.graphql.builder.QueryFields;
import com.yonyou.iuap.graphql.model.IQuerySchema;
import com.yonyou.iuap.graphql.model.conditions.IConditionExpression;
import com.yonyou.iuap.graphql.model.conditions.group.IQueryConditionGroup;
import com.yonyou.iuap.graphql.model.field.IQueryField;
import com.yonyou.iuap.graphql.query.IMapDataAccessApi;
import com.yonyou.iuap.international.MultiLangText;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.upc.pc.product.CharacteristicsTypeEnum;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="materialTplQueryServiceImpl")
public class MaterialTplQueryServiceImpl {
    @Autowired
    private IMapDataAccessApi mapDataAccessApi;

    public MaterialTplVO detailMaterialTplById(Long id) throws Exception {
        IQueryConditionGroup qryConditionGroup = QueryConditions.and((IConditionExpression[])new IConditionExpression[]{QueryConditions.eq((String)"id", (Object)id)});
        List<MaterialTplVO> materialTplVOList = this.detailMaterialTpl(1, 10, qryConditionGroup);
        if (ObjectUtils.isNotEmpty(materialTplVOList)) {
            return materialTplVOList.get(0);
        }
        return null;
    }

    public List<MaterialTplVO> detailMaterialTpl(int pageIndex, int pageSize, IQueryConditionGroup qryConditionGroup) throws Exception {
        IDefaultQuerySchemaBuilder schemaBuilder = QueryBuilders.defaultBuilder().from("pc.tpl.ProductTpl").distinct().addSelect(new MaterialTplPO().getAllMetaArrField()).addSelect(new IQueryField[]{QueryFields.field((String)"deliveryType.dt_name", (String)"deliveryType___dt_name")}).addSelect(new IQueryField[]{QueryFields.field((String)"freeCT.code", (String)"freeCT___code")}).addSelect(new IQueryField[]{QueryFields.field((String)"materialPropCT.code", (String)"materialPropCT___code")}).addSelect(new IQueryField[]{QueryFields.field((String)"optionCT.code", (String)"optionCT___code")}).addSelect(new IQueryField[]{QueryFields.field((String)"skuPropCT.code", (String)"skuPropCT___code")}).pager(pageIndex, pageSize);
        QuerySchema querySchema = (QuerySchema)schemaBuilder.condition(qryConditionGroup).build();
        List resultList = MetaDaoHelper.query((String)"pc.tpl.ProductTpl", (boolean)true, (QuerySchema)querySchema, null);
        ArrayList<MaterialTplVO> materialTplVOList = new ArrayList<MaterialTplVO>();
        if (ObjectUtils.isNotEmpty((Object)resultList)) {
            for (Map resultMap : resultList) {
                MaterialTplVO materialTplVO = (MaterialTplVO)JSON.parseObject((String)JSON.toJSONString((Object)resultMap), MaterialTplVO.class);
                materialTplVO.setBrands(this.detailMaterialTplBrand(materialTplVO.getId()));
                materialTplVO.setParameters(this.detailMaterialTplParameter(materialTplVO.getId()));
                materialTplVO.setOrderProperties(this.detailMaterialTplOrderPropertie(materialTplVO.getId()));
                materialTplVO.setCycleProperties(this.detailMaterialTplCyclePropertie(materialTplVO.getId()));
                materialTplVO.setUnits(this.detailMaterialTplUnit(materialTplVO.getId()));
                materialTplVO.setAssistUnits(this.detailMaterialTplAssistUnit(materialTplVO.getId()));
                List<MaterialTplCharacterVO> materialTplCharacterVOS = this.detailMaterialTplCharacter(materialTplVO.getId());
                materialTplVO.setFreeCharacters(this.detailMaterialTplfreeCharacter(materialTplVO.getId(), materialTplCharacterVOS));
                materialTplVO.setProductPropCharacters(this.detailMaterialTplProductPropCharacters(materialTplVO.getId(), materialTplCharacterVOS));
                materialTplVO.setSkuCharacters(this.detailMaterialTplSkuCharacter(materialTplVO.getId(), materialTplCharacterVOS));
                materialTplVO.setOptionCharacters(this.detailMaterialTplOptionCharacters(materialTplVO.getId(), materialTplCharacterVOS));
                if (resultMap.get("name") != null) {
                    materialTplVO.setName(new MultiLangText((Map)resultMap.get("name")));
                }
                materialTplVOList.add(materialTplVO);
            }
        }
        return materialTplVOList;
    }

    private List<MaterialTplCharacterVO> detailMaterialTplOptionCharacters(String tplId, List<MaterialTplCharacterVO> materialTplCharacterVOS) {
        List optionCharacters = null;
        if (ObjectUtils.isEmpty(materialTplCharacterVOS) && StringUtils.isNotEmpty((CharSequence)tplId)) {
            materialTplCharacterVOS = this.detailMaterialTplCharacter(tplId);
        }
        if (ObjectUtils.isNotEmpty(materialTplCharacterVOS)) {
            optionCharacters = materialTplCharacterVOS.stream().filter(v -> v != null && CharacteristicsTypeEnum.IOptionCT.getValue().equals(v.getCharacteristicsType())).collect(Collectors.toList());
        }
        return optionCharacters;
    }

    private List<MaterialTplCharacterVO> detailMaterialTplSkuCharacter(String tplId, List<MaterialTplCharacterVO> materialTplCharacterVOS) {
        List optionCharacters = null;
        if (ObjectUtils.isEmpty(materialTplCharacterVOS) && StringUtils.isNotEmpty((CharSequence)tplId)) {
            materialTplCharacterVOS = this.detailMaterialTplCharacter(tplId);
        }
        if (ObjectUtils.isNotEmpty(materialTplCharacterVOS)) {
            optionCharacters = materialTplCharacterVOS.stream().filter(v -> v != null && CharacteristicsTypeEnum.ISkuPropCT.getValue().equals(v.getCharacteristicsType())).collect(Collectors.toList());
        }
        return optionCharacters;
    }

    private List<MaterialTplCharacterVO> detailMaterialTplProductPropCharacters(String tplId, List<MaterialTplCharacterVO> materialTplCharacterVOS) {
        List optionCharacters = null;
        if (ObjectUtils.isEmpty(materialTplCharacterVOS) && StringUtils.isNotEmpty((CharSequence)tplId)) {
            materialTplCharacterVOS = this.detailMaterialTplCharacter(tplId);
        }
        if (ObjectUtils.isNotEmpty(materialTplCharacterVOS)) {
            optionCharacters = materialTplCharacterVOS.stream().filter(v -> v != null && CharacteristicsTypeEnum.IMaterialPropCT.getValue().equals(v.getCharacteristicsType())).collect(Collectors.toList());
        }
        return optionCharacters;
    }

    private List<MaterialTplCharacterVO> detailMaterialTplfreeCharacter(String tplId, List<MaterialTplCharacterVO> materialTplCharacterVOS) {
        List optionCharacters = null;
        if (ObjectUtils.isEmpty(materialTplCharacterVOS) && StringUtils.isNotEmpty((CharSequence)tplId)) {
            materialTplCharacterVOS = this.detailMaterialTplCharacter(tplId);
        }
        if (ObjectUtils.isNotEmpty(materialTplCharacterVOS)) {
            optionCharacters = materialTplCharacterVOS.stream().filter(v -> v != null && CharacteristicsTypeEnum.IFreeCT.getValue().equals(v.getCharacteristicsType())).collect(Collectors.toList());
        }
        return optionCharacters;
    }

    private List<MaterialTplCharacterVO> detailMaterialTplCharacter(String tplId) {
        IQueryConditionGroup qryConditionGroup = QueryConditions.and((IConditionExpression[])new IConditionExpression[]{QueryConditions.eq((String)"ytenant", (Object)AppContext.getCurrentUser().getYTenantId()), QueryConditions.eq((String)"template", (Object)tplId)});
        IDefaultQuerySchemaBuilder schemaBuilder = QueryBuilders.defaultBuilder().from("pc.tpl.ProductTplCharacter").distinct().select(new MaterialTplCharacterPO().getAllMetaArrField()).addSelect(new IQueryField[]{QueryFields.field((String)"character.code", (String)"character___code")}).addSelect(new IQueryField[]{QueryFields.field((String)"characteristics.code", (String)"characteristics___code")}).addSelect(new IQueryField[]{QueryFields.field((String)"BOMAffec", (String)"bomAffec")}).addSelect(new IQueryField[]{QueryFields.field((String)"SNSens", (String)"snSens")});
        IQuerySchema querySchema = schemaBuilder.condition(qryConditionGroup).build();
        List resultList = this.mapDataAccessApi.queryForList(querySchema);
        ArrayList<MaterialTplCharacterVO> materialTplCharacterVOList = new ArrayList<MaterialTplCharacterVO>();
        if (ObjectUtils.isNotEmpty((Object)resultList)) {
            for (Map resultMap : resultList) {
                MaterialTplCharacterVO materialTplCharacterVO = (MaterialTplCharacterVO)JSON.parseObject((String)JSON.toJSONString((Object)resultMap), MaterialTplCharacterVO.class);
                materialTplCharacterVOList.add(materialTplCharacterVO);
            }
        }
        return materialTplCharacterVOList;
    }

    private List<MaterialTplAssistUnitVO> detailMaterialTplAssistUnit(String tplId) {
        IQueryConditionGroup qryConditionGroup = QueryConditions.and((IConditionExpression[])new IConditionExpression[]{QueryConditions.eq((String)"ytenant", (Object)AppContext.getCurrentUser().getYTenantId()), QueryConditions.eq((String)"template", (Object)tplId)});
        IDefaultQuerySchemaBuilder schemaBuilder = QueryBuilders.defaultBuilder().from("pc.tpl.ProductTplAssistUnitExchange").distinct().select(new MaterialTplAssistUnitPO().getAllMetaArrField()).addSelect(new IQueryField[]{QueryFields.field((String)"assistUnit.code", (String)"assistUnit___code")});
        IQuerySchema querySchema = schemaBuilder.condition(qryConditionGroup).build();
        List resultList = this.mapDataAccessApi.queryForList(querySchema);
        ArrayList<MaterialTplAssistUnitVO> materialTplAssistUnitVOList = new ArrayList<MaterialTplAssistUnitVO>();
        if (ObjectUtils.isNotEmpty((Object)resultList)) {
            for (Map resultMap : resultList) {
                MaterialTplAssistUnitVO materialTppAssistUnitVO = (MaterialTplAssistUnitVO)JSON.parseObject((String)JSON.toJSONString((Object)resultMap), MaterialTplAssistUnitVO.class);
                materialTplAssistUnitVOList.add(materialTppAssistUnitVO);
            }
        }
        return materialTplAssistUnitVOList;
    }

    private List<MaterialTplUnitVO> detailMaterialTplUnit(String tplId) {
        IQueryConditionGroup qryConditionGroup = QueryConditions.and((IConditionExpression[])new IConditionExpression[]{QueryConditions.eq((String)"ytenant", (Object)AppContext.getCurrentUser().getYTenantId()), QueryConditions.eq((String)"template", (Object)tplId)});
        IDefaultQuerySchemaBuilder schemaBuilder = QueryBuilders.defaultBuilder().from("pc.tpl.ProductTplUnit").distinct().select(new MaterialTplUnitPO().getAllMetaArrField()).addSelect(new IQueryField[]{QueryFields.field((String)"batchPriceUnit.code", (String)"batchPriceUnit___code")}).addSelect(new IQueryField[]{QueryFields.field((String)"batchUnit.code", (String)"batchUnit___code")}).addSelect(new IQueryField[]{QueryFields.field((String)"demandPlanningUnit.code", (String)"demandPlanningUnit___code")}).addSelect(new IQueryField[]{QueryFields.field((String)"inspectionUnit.code", (String)"inspectionUnit___code")}).addSelect(new IQueryField[]{QueryFields.field((String)"offlineUnit.code", (String)"offlineUnit___code")}).addSelect(new IQueryField[]{QueryFields.field((String)"onlineUnit.code", (String)"onlineUnit___code")}).addSelect(new IQueryField[]{QueryFields.field((String)"produceUnit.code", (String)"produceUnit___code")}).addSelect(new IQueryField[]{QueryFields.field((String)"purchasePriceUnit.code", (String)"purchasePriceUnit___code")}).addSelect(new IQueryField[]{QueryFields.field((String)"purchaseUnit.code", (String)"purchaseUnit___code")}).addSelect(new IQueryField[]{QueryFields.field((String)"requireUnit.code", (String)"requireUnit___code")}).addSelect(new IQueryField[]{QueryFields.field((String)"stockUnit.code", (String)"stockUnit___code")}).addSelect(new IQueryField[]{QueryFields.field((String)"offlineUnit.code", (String)"offlineUnit___code")}).addSelect(new IQueryField[]{QueryFields.field((String)"unit.code", (String)"unit___code")});
        IQuerySchema querySchema = schemaBuilder.condition(qryConditionGroup).build();
        List resultList = this.mapDataAccessApi.queryForList(querySchema);
        ArrayList<MaterialTplUnitVO> materialTplUnitVOList = new ArrayList<MaterialTplUnitVO>();
        if (ObjectUtils.isNotEmpty((Object)resultList)) {
            for (Map resultMap : resultList) {
                MaterialTplUnitVO materialTplUnitVO = (MaterialTplUnitVO)JSON.parseObject((String)JSON.toJSONString((Object)resultMap), MaterialTplUnitVO.class);
                materialTplUnitVOList.add(materialTplUnitVO);
            }
        }
        return materialTplUnitVOList;
    }

    private List<MaterialTplCyclePropertyVO> detailMaterialTplCyclePropertie(String tplId) throws Exception {
        IQueryConditionGroup qryConditionGroup = QueryConditions.and((IConditionExpression[])new IConditionExpression[]{QueryConditions.eq((String)"ytenant", (Object)AppContext.getCurrentUser().getYTenantId()), QueryConditions.eq((String)"template", (Object)tplId)});
        IDefaultQuerySchemaBuilder schemaBuilder = QueryBuilders.defaultBuilder().from("pc.tpl.ProductTplCycleProperty").distinct().select(new MaterialTplCyclePropertyPO().getAllMetaArrField()).addSelect(new IQueryField[]{QueryFields.field((String)"propertyType.name", (String)"propertyType___name")});
        QuerySchema querySchema = (QuerySchema)schemaBuilder.condition(qryConditionGroup).build();
        List resultList = MetaDaoHelper.query((String)"pc.tpl.ProductTplCycleProperty", (boolean)true, (QuerySchema)querySchema, null);
        ArrayList<MaterialTplCyclePropertyVO> materialTplCyclePropVOList = new ArrayList<MaterialTplCyclePropertyVO>();
        if (ObjectUtils.isNotEmpty((Object)resultList)) {
            for (Map resultMap : resultList) {
                MaterialTplCyclePropertyVO materialTplCyclePropVO = (MaterialTplCyclePropertyVO)JSON.parseObject((String)JSON.toJSONString((Object)resultMap), MaterialTplCyclePropertyVO.class);
                if (resultMap.get("alias") != null) {
                    materialTplCyclePropVO.setAlias(new MultiLangText((Map)resultMap.get("alias")));
                }
                materialTplCyclePropVOList.add(materialTplCyclePropVO);
            }
        }
        return materialTplCyclePropVOList;
    }

    private List<MaterialTplOrderPropertyVO> detailMaterialTplOrderPropertie(String tplId) {
        IQueryConditionGroup qryConditionGroup = QueryConditions.and((IConditionExpression[])new IConditionExpression[]{QueryConditions.eq((String)"ytenant", (Object)AppContext.getCurrentUser().getYTenantId()), QueryConditions.eq((String)"template", (Object)tplId)});
        IDefaultQuerySchemaBuilder schemaBuilder = QueryBuilders.defaultBuilder().from("pc.tpl.ProductTplOrderProperty").distinct().select(new MaterialTplOrderPropertyPO().getAllMetaArrField()).addSelect(new IQueryField[]{QueryFields.field((String)"propertyType.showItem", (String)"propertyType___showItem")});
        IQuerySchema querySchema = schemaBuilder.condition(qryConditionGroup).build();
        List resultList = this.mapDataAccessApi.queryForList(querySchema);
        ArrayList<MaterialTplOrderPropertyVO> materialTplOrderPropVOList = new ArrayList<MaterialTplOrderPropertyVO>();
        if (ObjectUtils.isNotEmpty((Object)resultList)) {
            for (Map resultMap : resultList) {
                MaterialTplOrderPropertyVO materialTplOrderPropVO = (MaterialTplOrderPropertyVO)JSON.parseObject((String)JSON.toJSONString((Object)resultMap), MaterialTplOrderPropertyVO.class);
                materialTplOrderPropVOList.add(materialTplOrderPropVO);
            }
        }
        return materialTplOrderPropVOList;
    }

    private List<MaterialTplParameterVO> detailMaterialTplParameter(String tplId) throws Exception {
        IQueryConditionGroup qryConditionGroup = QueryConditions.and((IConditionExpression[])new IConditionExpression[]{QueryConditions.eq((String)"ytenant", (Object)AppContext.getCurrentUser().getYTenantId()), QueryConditions.eq((String)"template", (Object)tplId)});
        IDefaultQuerySchemaBuilder schemaBuilder = QueryBuilders.defaultBuilder().from("pc.tpl.ProductTplParameter").distinct().select(new MaterialTplParameterPO().getAllMetaArrField()).addSelect(new IQueryField[]{QueryFields.field((String)"parent.name", (String)"parent___name")});
        QuerySchema querySchema = (QuerySchema)schemaBuilder.condition(qryConditionGroup).build();
        List resultList = MetaDaoHelper.query((String)"pc.tpl.ProductTplParameter", (boolean)true, (QuerySchema)querySchema, null);
        ArrayList<MaterialTplParameterVO> materialTplParameterVOList = new ArrayList<MaterialTplParameterVO>();
        if (ObjectUtils.isNotEmpty((Object)resultList)) {
            for (Map resultMap : resultList) {
                MaterialTplParameterVO materialTplParameterVO = (MaterialTplParameterVO)JSON.parseObject((String)JSON.toJSONString((Object)resultMap), MaterialTplParameterVO.class);
                if (resultMap.get("group") != null) {
                    materialTplParameterVO.setGroup(new MultiLangText((Map)resultMap.get("group")));
                }
                if (resultMap.get("name") != null) {
                    materialTplParameterVO.setName(new MultiLangText((Map)resultMap.get("name")));
                }
                materialTplParameterVOList.add(materialTplParameterVO);
            }
        }
        return materialTplParameterVOList;
    }

    private List<MaterialTplBrandVO> detailMaterialTplBrand(String tplId) {
        IQueryConditionGroup qryConditionGroup = QueryConditions.and((IConditionExpression[])new IConditionExpression[]{QueryConditions.eq((String)"ytenant", (Object)AppContext.getCurrentUser().getYTenantId()), QueryConditions.eq((String)"template", (Object)tplId)});
        IDefaultQuerySchemaBuilder schemaBuilder = QueryBuilders.defaultBuilder().from("pc.tpl.ProductTplBrand").distinct().select(new MaterialTplBrandPO().getAllMetaArrField()).addSelect(new IQueryField[]{QueryFields.field((String)"brand.code", (String)"brand___code")});
        IQuerySchema querySchema = schemaBuilder.condition(qryConditionGroup).build();
        List resultList = this.mapDataAccessApi.queryForList(querySchema);
        ArrayList<MaterialTplBrandVO> materialTplBrandVOList = new ArrayList<MaterialTplBrandVO>();
        if (ObjectUtils.isNotEmpty((Object)resultList)) {
            for (Map resultMap : resultList) {
                MaterialTplBrandVO materialTplBrandVO = (MaterialTplBrandVO)JSON.parseObject((String)JSON.toJSONString((Object)resultMap), MaterialTplBrandVO.class);
                materialTplBrandVOList.add(materialTplBrandVO);
            }
        }
        return materialTplBrandVOList;
    }
}


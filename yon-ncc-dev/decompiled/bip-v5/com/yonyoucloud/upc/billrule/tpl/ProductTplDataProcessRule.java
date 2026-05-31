/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.alibaba.fastjson.JSONObject
 *  com.alibaba.fastjson.TypeReference
 *  com.alibaba.fastjson.parser.Feature
 *  com.yonyou.diwork.multilingual.model.LanguageVO
 *  com.yonyou.diwork.multilingual.service.ILanguageService
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants
 *  com.yonyou.iuap.apdoc.coredoc.dao.pub.CoreDocBaseDao
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.QueryOperatorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.iuap.apdoc.coredoc.po.materialtpl.MaterialTplCharacterPO
 *  com.yonyou.iuap.apdoc.coredoc.po.materialtpl.MaterialTplPO
 *  com.yonyou.iuap.apdoc.coredoc.po.materialtpl.MaterialTplUnitPO
 *  com.yonyou.iuap.apdoc.coredoc.po.pub.CoreDocBaseEntity
 *  com.yonyou.iuap.apdoc.coredoc.po.pub.QueryConditionPO
 *  com.yonyou.iuap.apdoc.coredoc.po.pub.UpcPubOptionData
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.iuap.yms.api.IYmsJdbcApi
 *  com.yonyou.iuap.yms.http.YmsHttpClient
 *  com.yonyou.iuap.yms.http.YmsHttpHeader
 *  com.yonyou.iuap.yms.http.YmsHttpMethod
 *  com.yonyou.iuap.yms.http.YmsHttpRequest
 *  com.yonyou.iuap.yms.http.YmsHttpRequestBuilder
 *  com.yonyou.iuap.yms.http.YmsHttpResponse
 *  com.yonyou.iuap.yms.param.BaseEntity
 *  com.yonyou.iuap.yms.param.Condition
 *  com.yonyou.iuap.yms.param.condtition.query.QueryCondition
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.option.util.OptionUtils
 *  com.yonyoucloud.upc.data.tpl.ProductTplDao
 *  com.yonyoucloud.upc.pc.product.AssistUnitType
 *  com.yonyoucloud.upc.pc.product.SKUOrderProperty
 *  com.yonyoucloud.upc.pc.product.UnitExchangeType
 *  com.yonyoucloud.upc.pc.tpl.ProductTpl
 *  com.yonyoucloud.upc.pc.tpl.ProductTplAssistUnitExchange
 *  com.yonyoucloud.upc.pc.tpl.ProductTplCharacter
 *  com.yonyoucloud.upc.pc.tpl.ProductTplExtendProperty
 *  com.yonyoucloud.upc.pc.tpl.ProductTplExtendPropertySum
 *  com.yonyoucloud.upc.pc.tpl.ProductTplExtendPropertyValue
 *  com.yonyoucloud.upc.pc.tpl.ProductTplOrderProperty
 *  com.yonyoucloud.upc.pc.tpl.ProductTplOrderPropertySum
 *  com.yonyoucloud.upc.pc.tpl.ProductTplOrderPropertyValue
 *  com.yonyoucloud.upc.pc.tpl.ProductTplSKUProperty
 *  com.yonyoucloud.upc.pc.tpl.ProductTplSKUPropertySum
 *  com.yonyoucloud.upc.pc.tpl.ProductTplSKUPropertyValue
 *  com.yonyoucloud.upc.pc.tpl.ProductTplSpec
 *  com.yonyoucloud.upc.pc.tpl.ProductTplSpecSum
 *  com.yonyoucloud.upc.pc.tpl.ProductTplUnit
 *  com.yonyoucloud.upc.pc.userdef.UserDefineClassSpec
 *  com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil
 *  com.yonyoucloud.upc.utils.SQLInjectionCheckUtil
 *  org.apache.commons.lang3.ObjectUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.biz.base.Objectlizer
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.tpl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.yonyou.diwork.multilingual.model.LanguageVO;
import com.yonyou.diwork.multilingual.service.ILanguageService;
import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants;
import com.yonyou.iuap.apdoc.coredoc.dao.pub.CoreDocBaseDao;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.QueryOperatorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.iuap.apdoc.coredoc.po.materialtpl.MaterialTplCharacterPO;
import com.yonyou.iuap.apdoc.coredoc.po.materialtpl.MaterialTplPO;
import com.yonyou.iuap.apdoc.coredoc.po.materialtpl.MaterialTplUnitPO;
import com.yonyou.iuap.apdoc.coredoc.po.pub.CoreDocBaseEntity;
import com.yonyou.iuap.apdoc.coredoc.po.pub.QueryConditionPO;
import com.yonyou.iuap.apdoc.coredoc.po.pub.UpcPubOptionData;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.iuap.yms.api.IYmsJdbcApi;
import com.yonyou.iuap.yms.http.YmsHttpClient;
import com.yonyou.iuap.yms.http.YmsHttpHeader;
import com.yonyou.iuap.yms.http.YmsHttpMethod;
import com.yonyou.iuap.yms.http.YmsHttpRequest;
import com.yonyou.iuap.yms.http.YmsHttpRequestBuilder;
import com.yonyou.iuap.yms.http.YmsHttpResponse;
import com.yonyou.iuap.yms.param.BaseEntity;
import com.yonyou.iuap.yms.param.Condition;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.option.util.OptionUtils;
import com.yonyoucloud.upc.billrule.tpl.ProducttplUtils;
import com.yonyoucloud.upc.cache.BizCache;
import com.yonyoucloud.upc.data.tpl.ProductTplDao;
import com.yonyoucloud.upc.datarule.ProductTplService;
import com.yonyoucloud.upc.pc.product.AssistUnitType;
import com.yonyoucloud.upc.pc.product.SKUOrderProperty;
import com.yonyoucloud.upc.pc.product.UnitExchangeType;
import com.yonyoucloud.upc.pc.tpl.ProductTpl;
import com.yonyoucloud.upc.pc.tpl.ProductTplAssistUnitExchange;
import com.yonyoucloud.upc.pc.tpl.ProductTplCharacter;
import com.yonyoucloud.upc.pc.tpl.ProductTplExtendProperty;
import com.yonyoucloud.upc.pc.tpl.ProductTplExtendPropertySum;
import com.yonyoucloud.upc.pc.tpl.ProductTplExtendPropertyValue;
import com.yonyoucloud.upc.pc.tpl.ProductTplOrderProperty;
import com.yonyoucloud.upc.pc.tpl.ProductTplOrderPropertySum;
import com.yonyoucloud.upc.pc.tpl.ProductTplOrderPropertyValue;
import com.yonyoucloud.upc.pc.tpl.ProductTplSKUProperty;
import com.yonyoucloud.upc.pc.tpl.ProductTplSKUPropertySum;
import com.yonyoucloud.upc.pc.tpl.ProductTplSKUPropertyValue;
import com.yonyoucloud.upc.pc.tpl.ProductTplSpec;
import com.yonyoucloud.upc.pc.tpl.ProductTplSpecSum;
import com.yonyoucloud.upc.pc.tpl.ProductTplUnit;
import com.yonyoucloud.upc.pc.userdef.UserDefineClassSpec;
import com.yonyoucloud.upc.service.DataSourceService;
import com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil;
import com.yonyoucloud.upc.utils.SQLInjectionCheckUtil;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.imeta.biz.base.Objectlizer;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="productTplDataProcessRule")
public class ProductTplDataProcessRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(ProductTplDataProcessRule.class);
    @Autowired
    private ProductTplService productTplService;
    @Autowired
    private ProductTplDao tplDao;
    @Autowired
    private BizCache cache;
    @Autowired
    private ILanguageService languageService;
    @Autowired
    private DataSourceService dataSourceService;
    @Autowired
    private PubOptionService pubOptionService;
    @Autowired
    @Qualifier(value="coredocYmsHttpClient")
    private YmsHttpClient ymsHttpClient;
    @Autowired
    private PubOptionDataQueryUtil pubOptionDataQueryUtil;
    @Autowired
    private YMSParamConfig ymsParamConfig;
    @Autowired
    private CoreDocBaseDao coreDocBaseDao;
    @Autowired
    protected IYmsJdbcApi ymsJdbcApi;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        boolean useCharacterFlag = true;
        List bills = this.getBills(billContext, map);
        ProductTpl tpl = (ProductTpl)bills.get(0);
        this.setDefaultValue(tpl);
        this.checknameSpacer(tpl);
        this.dealApiData(tpl);
        this.processAssistUnitExchanges(tpl);
        if (!useCharacterFlag) {
            this.processSpec(tpl);
            this.processProperty(tpl);
            this.processSkuProperty(tpl);
        }
        this.processOrderProperty(tpl);
        if (useCharacterFlag) {
            boolean fromApi;
            boolean bl = fromApi = tpl.get("_fromApi") != null && (Boolean)tpl.get("_fromApi") != false;
            if (fromApi) {
                List<Map<String, Object>> characteristicsList = this.queryAllCharacteristics(tpl);
                this.checkChatacteristicsType(characteristicsList, tpl);
                MaterialTplPO materialTplPO = null;
                if (EntityStatus.Update.equals((Object)tpl.getEntityStatus()) && tpl.getId() != null) {
                    materialTplPO = (MaterialTplPO)this.coreDocBaseDao.queryEntityById(MaterialTplPO.class, tpl.getId().toString());
                }
                if (!"pc_producttpl_import".equals(billDataDto.getBillnum())) {
                    this.checkFreeCTCharacters(tpl);
                }
                this.processAllCharacteristics(tpl, materialTplPO, characteristicsList);
                this.processFreeCTCharacters(tpl);
            } else {
                this.processSelectCanBeNull(tpl);
            }
            this.checkTwoDimensionalInput(tpl);
        }
        if (tpl.getEntityStatus() == EntityStatus.Update) {
            this.checkUnitHasChange(tpl);
        }
        this.clearCache((Long)tpl.getId());
        return new RuleExecuteResult();
    }

    private List<Map<String, Object>> queryAllCharacteristics(ProductTpl tpl) {
        List<Map<String, Object>> characteristicsList = new ArrayList<Map<String, Object>>();
        if (tpl != null) {
            ArrayList<Long> characteristicsIds = new ArrayList<Long>();
            this.addCharacteristicsId(characteristicsIds, tpl.freeCharacters(), "freeCT", tpl);
            this.addCharacteristicsId(characteristicsIds, tpl.productPropCharacters(), "materialPropCT", tpl);
            this.addCharacteristicsId(characteristicsIds, tpl.skuCharacters(), "skuPropCT", tpl);
            this.addCharacteristicsId(characteristicsIds, tpl.optionCharacters(), "optionCT", tpl);
            if (ObjectUtils.isNotEmpty(characteristicsIds)) {
                characteristicsList = this.getCharacteristicsById(characteristicsIds);
            }
        }
        return characteristicsList;
    }

    private void addCharacteristicsId(List<Long> characteristicsIds, List<ProductTplCharacter> tplCharacters, String key, ProductTpl tpl) {
        if (ObjectUtils.isNotEmpty(tplCharacters)) {
            tplCharacters.stream().filter(v -> v.getCharacteristics() != null).findFirst().ifPresent(character -> characteristicsIds.add(character.getCharacteristics()));
        }
        if (tpl.containsKey((Object)key) && ObjectUtils.isNotEmpty((Object)tpl.get(key))) {
            characteristicsIds.add((Long)tpl.get(key));
        }
    }

    private void setDefaultValue(ProductTpl tpl) {
        if (Objects.isNull(tpl.getEnableCyclePurchase())) {
            tpl.setEnableCyclePurchase(Boolean.valueOf(false));
        }
        if (Objects.isNull(tpl.getEnableWeighing())) {
            tpl.setEnableWeighing(Boolean.valueOf(false));
        }
        if (Objects.isNull(tpl.getSkuBusinessDynamic())) {
            tpl.setSkuBusinessDynamic(Boolean.valueOf(false));
        }
        if (Objects.isNull(tpl.getInvolveSKUNaming())) {
            tpl.setInvolveSKUNaming(Boolean.valueOf(true));
        }
        if (EntityStatus.Insert.equals((Object)tpl.getEntityStatus())) {
            this.setDefaultValueForTplUnit(tpl.Units(), tpl.productTplAssistUnitExchanges());
        }
    }

    private void setDefaultValueForTplUnit(List<ProductTplUnit> units, List<ProductTplAssistUnitExchange> assistUnitExchanges) {
        if (ObjectUtils.isNotEmpty(units)) {
            ProductTplUnit tplUnit = units.get(0);
            Long defaultValue = tplUnit.getUnit();
            if (ObjectUtils.isNotEmpty(assistUnitExchanges) && assistUnitExchanges.size() == 1) {
                ProductTplAssistUnitExchange assistUnitExchange = assistUnitExchanges.get(0);
                if (!this.pubOptionService.isOpenMultiFloat() && UnitExchangeType.floating == assistUnitExchange.getUnitExchangeType()) {
                    defaultValue = assistUnitExchange.getAssistUnit();
                }
            }
            for (AssistUnitType unitType : AssistUnitType.values()) {
                if (ObjectUtils.isNotEmpty((Object)tplUnit.get(unitType.toString()))) continue;
                if (AssistUnitType.purchasePriceUnit.equals((Object)unitType) || AssistUnitType.batchPriceUnit.equals((Object)unitType) || AssistUnitType.offlineUnit.equals((Object)unitType) || AssistUnitType.onlineUnit.equals((Object)unitType)) {
                    tplUnit.put(unitType.toString(), (Object)tplUnit.getUnit());
                    continue;
                }
                tplUnit.put(unitType.toString(), (Object)defaultValue);
            }
        }
    }

    private void checknameSpacer(ProductTpl tpl) {
        if (tpl != null && tpl.get("nameSpacer") != null) {
            boolean isMatch;
            String nameSpacer = tpl.get("nameSpacer").toString();
            if ("0".equals(nameSpacer) || "1".equals(nameSpacer) || "2".equals(nameSpacer) || "3".equals(nameSpacer)) {
                nameSpacer = UPCConstants.NAME_SPECER_ARRAY[Integer.valueOf(nameSpacer)];
            }
            if (!(isMatch = SQLInjectionCheckUtil.sqlInjection((String)nameSpacer))) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_TPL_NAME_SPECER_ERROR);
            }
            if (!("0".equals(nameSpacer) || "1".equals(nameSpacer) || "2".equals(nameSpacer) || "3".equals(nameSpacer) || !Pattern.matches("\\d+", nameSpacer))) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_TPL_NAME_SPECER_ERROR_TWO);
            }
        }
    }

    private void checkUnitHasChange(ProductTpl tpl) throws Exception {
        String productName;
        boolean isNotOnlyAddAssistUnit = false;
        MaterialTplUnitPO materialTplUnitPO = this.queryTplUnitByTplId(tpl);
        ProductTplUnit unit = tpl.Units() == null ? null : (ProductTplUnit)tpl.Units().get(0);
        isNotOnlyAddAssistUnit = this.isNotOnlyEnableAssistUnit(unit, materialTplUnitPO);
        List productTplAssistUnitExchanges = tpl.productTplAssistUnitExchanges();
        if (!isNotOnlyAddAssistUnit && productTplAssistUnitExchanges != null) {
            isNotOnlyAddAssistUnit = productTplAssistUnitExchanges.stream().anyMatch(exchange -> exchange.getEntityStatus() != EntityStatus.Unchanged && exchange.getEntityStatus() != EntityStatus.Insert);
        }
        if (isNotOnlyAddAssistUnit && (productName = this.tplHasUseByProduct(tpl.getId().toString())) != null) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_TEMPLATE_IS_REFERENCE_CANNOT_DELETE_UNIT, new Object[]{((BizObject)tpl.get("name")).get(InvocationInfoProxy.getLocale()), productName});
        }
    }

    private boolean isNotOnlyEnableAssistUnit(ProductTplUnit tplUnit, MaterialTplUnitPO materialTplUnitPO) {
        if (tplUnit != null && materialTplUnitPO != null) {
            if (tplUnit.getUnit() != null && !tplUnit.getUnit().equals(materialTplUnitPO.getUnit())) {
                return true;
            }
            if (tplUnit.getBatchUnit() != null && !tplUnit.getBatchUnit().equals(materialTplUnitPO.getBatchUnit())) {
                return true;
            }
            if (tplUnit.getBatchPriceUnit() != null && !tplUnit.getBatchPriceUnit().equals(materialTplUnitPO.getBatchPriceUnit())) {
                return true;
            }
            if (tplUnit.getPurchaseUnit() != null && !tplUnit.getPurchaseUnit().equals(materialTplUnitPO.getPurchaseUnit())) {
                return true;
            }
            if (tplUnit.getPurchasePriceUnit() != null && !tplUnit.getPurchasePriceUnit().equals(materialTplUnitPO.getPurchasePriceUnit())) {
                return true;
            }
            if (tplUnit.getOfflineUnit() != null && !tplUnit.getOfflineUnit().equals(materialTplUnitPO.getOfflineUnit())) {
                return true;
            }
            if (tplUnit.getOnlineUnit() != null && !tplUnit.getOnlineUnit().equals(materialTplUnitPO.getOnlineUnit())) {
                return true;
            }
            if (tplUnit.getStockUnit() != null && !tplUnit.getStockUnit().equals(materialTplUnitPO.getStockUnit())) {
                return true;
            }
            if (tplUnit.getDemandPlanningUnit() != null && !tplUnit.getDemandPlanningUnit().equals(materialTplUnitPO.getDemandPlanningUnit())) {
                return true;
            }
            if (tplUnit.getRequireUnit() != null && !tplUnit.getRequireUnit().equals(materialTplUnitPO.getRequireUnit())) {
                return true;
            }
            if (tplUnit.getInspectionUnit() != null && !tplUnit.getInspectionUnit().equals(materialTplUnitPO.getInspectionUnit())) {
                return true;
            }
            if (tplUnit.getProduceUnit() != null && !tplUnit.getProduceUnit().equals(materialTplUnitPO.getProduceUnit())) {
                return true;
            }
            Boolean tplEnable = tplUnit.getEnableAssistUnit();
            Boolean poEnable = materialTplUnitPO.getEnableAssistUnit();
            if (tplEnable != null && !tplEnable.equals(poEnable) && !tplEnable.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    private MaterialTplUnitPO queryTplUnitByTplId(ProductTpl tpl) throws Exception {
        QueryConditionPO queryConditionPO = new QueryConditionPO("template", QueryOperatorEnum.EQ, tpl.getId().toString());
        List units = this.coreDocBaseDao.queryEntityByCondition((CoreDocBaseEntity)new MaterialTplUnitPO(), Collections.singletonList(queryConditionPO));
        if (ObjectUtils.isNotEmpty((Object)units)) {
            return (MaterialTplUnitPO)units.get(0);
        }
        return null;
    }

    private String tplHasUseByProduct(String tplID) throws Exception {
        StringBuilder codeBuilder = new StringBuilder();
        List<Map<String, Object>> productList = this.productTplService.getProductsUseTempleteUnit(tplID);
        if (productList != null && productList.size() > 0) {
            for (int i = 0; i < productList.size() && i < 5; ++i) {
                if (productList.get(i).get("code") == null) continue;
                codeBuilder.append(productList.get(i).get("code").toString() + "\uff0c");
            }
        }
        return codeBuilder.length() > 0 ? codeBuilder.toString().substring(0, codeBuilder.length() - 1) : null;
    }

    private void checkTwoDimensionalInput(ProductTpl tpl) {
        if (Objects.nonNull(tpl.freeCharacters())) {
            int numTwoDimensionalInput = 0;
            UpcPubOptionData optionData = this.pubOptionService.getOptionValueByName("isTwoDimensionalNoNeedSen");
            boolean noNeedCheckedSen = BooleanUtil.isTrue((Object)(optionData == null ? Boolean.valueOf(false) : optionData.getValue()));
            for (ProductTplCharacter productTplCharacter : tpl.freeCharacters()) {
                if (!BooleanUtil.isTrue((Object)productTplCharacter.getTwoDimensionalInput())) continue;
                if (!noNeedCheckedSen && BooleanUtil.isFalse((Object)productTplCharacter.getSkuSens())) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_DOUBLE_SKU_SENSITIVE_NOT_CHECKED);
                }
                ++numTwoDimensionalInput;
            }
            if (numTwoDimensionalInput > 1) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_FREE_ITEM_ONLY_ONE_FOR_DOUBLE_SKU);
            }
        }
    }

    private void processSelectCanBeNull(ProductTpl tpl) {
        if (Objects.nonNull(tpl.freeCharacters())) {
            tpl.freeCharacters().forEach(freeChar -> {
                if (Objects.isNull(freeChar.getTwoDimensionalInput())) {
                    freeChar.setTwoDimensionalInput(Integer.valueOf(0));
                }
            });
        }
        if (Objects.nonNull(tpl.productPropCharacters())) {
            tpl.productPropCharacters().forEach(productTplCharacter -> {
                if (Objects.isNull(productTplCharacter.getWebShow())) {
                    productTplCharacter.setWebShow(Integer.valueOf(0));
                }
            });
        }
    }

    private void checkFreeCTCharacters(ProductTpl tpl) {
        ArrayList<Long> characteristics = new ArrayList<Long>();
        if (tpl.containsKey((Object)"freeCT") && Objects.nonNull(tpl.getFreeCT())) {
            characteristics.add(tpl.getFreeCT());
        }
        HashSet characteristicsIdSet = new HashSet();
        HashSet characterIdSet = new HashSet();
        if (tpl.containsKey((Object)"freeCharacters") && Objects.nonNull(tpl.freeCharacters())) {
            tpl.freeCharacters().forEach(tplCharacter -> {
                if (Objects.nonNull(tplCharacter.getCharacteristics())) {
                    characteristicsIdSet.add(tplCharacter.getCharacteristics());
                } else if (Objects.nonNull(tpl.getFreeCT())) {
                    tplCharacter.setCharacteristics(tpl.getFreeCT());
                } else {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_FREE_PROPERTY_FEATURE_GROUP_NOT_HAS_CODE_FOR_SHOULD_HAS_NAME_OR_ID);
                }
                if (Objects.nonNull(tplCharacter.getCharacter()) && characterIdSet.contains(tplCharacter.getCharacter())) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_FREE_PROPERTY_FEATURE_GROUP_HAS_REPEAT_CODE);
                }
                if (Objects.nonNull(tplCharacter.getCharacter())) {
                    characterIdSet.add(tplCharacter.getCharacter());
                }
            });
            if (characteristicsIdSet.size() > 1) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_FREE_PROPERTY_FEATURE_GROUP_HAS_REPEAT_FEATURE_GROUP);
            }
            if (characteristics.size() == 0) {
                characteristicsIdSet.forEach(value -> characteristics.add((Long)value));
            }
            List<Map<String, Object>> characteristicsById = this.getCharacteristicsById(characteristics);
            for (Map<String, Object> characteristicMap : characteristicsById) {
                if (!characteristicMap.containsKey("characteristicsRelations")) continue;
                List characters = JSONObject.parseArray((String)JSON.toJSONString((Object)characteristicMap.get("characteristicsRelations")), Map.class);
                if (characters.size() > characterIdSet.size()) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_FREE_PROPERTY_FEATURE_GROUP_NOT_HAS_ALL_FEATURE_GROUP);
                }
                if (characters.size() < tpl.freeCharacters().size()) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_FEATURE_GROUP_HAS_ILLEGAL_FEATURE_GROUP_DATA);
                }
                for (Map characterMap : characters) {
                    long characterIdDB = Long.parseLong(characterMap.get("character_id").toString());
                    if (characterIdSet.contains(characterIdDB)) continue;
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_FREE_PROPERTY_FEATURE_GROUP_HAS_NOT_BELONG);
                }
            }
        }
    }

    private void checkChatacteristicsType(List<Map<String, Object>> characteristicsInfo, ProductTpl tpl) {
        for (Map<String, Object> characteristicsOne : characteristicsInfo) {
            if (!characteristicsOne.containsKey("id") || !characteristicsOne.containsKey("characteristicsType")) continue;
            if (Objects.nonNull(tpl.getMaterialPropCT()) && String.valueOf(tpl.getMaterialPropCT()).equals(String.valueOf(characteristicsOne.get("id"))) && 1L != Long.parseLong(String.valueOf(characteristicsOne.get("characteristicsType")))) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_PROPERTY_FEATURE_GROUP_NOT_PROPERTY_FEATURE_GROUP);
            }
            if (Objects.nonNull(tpl.getSkuPropCT()) && String.valueOf(tpl.getSkuPropCT()).equals(String.valueOf(characteristicsOne.get("id"))) && 2L != Long.parseLong(String.valueOf(characteristicsOne.get("characteristicsType")))) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_PROPERTY_FEATURE_GROUP_NOT_SKU_FEATURE_GROUP);
            }
            if (Objects.nonNull(tpl.getFreeCT()) && String.valueOf(tpl.getFreeCT()).equals(String.valueOf(characteristicsOne.get("id"))) && 3L != Long.parseLong(String.valueOf(characteristicsOne.get("characteristicsType")))) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_PROPERTY_FEATURE_GROUP_NOT_FREE_FEATURE_GROUP);
            }
            if (!Objects.nonNull(tpl.getOptionCT()) || !String.valueOf(tpl.getOptionCT()).equals(String.valueOf(characteristicsOne.get("id"))) || 4L == Long.parseLong(String.valueOf(characteristicsOne.get("characteristicsType")))) continue;
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_PROPERTY_FEATURE_GROUP_NOT_OPTIONAL_FEATURE_GROUP);
        }
    }

    private void processAllCharacteristics(ProductTpl tpl, MaterialTplPO materialTplPO, List<Map<String, Object>> characteristicsList) throws Exception {
        Integer isOptionalTemplate = tpl.getIsOptionalTemplate() != null ? tpl.getIsOptionalTemplate() : (materialTplPO != null ? materialTplPO.getIsOptionalTemplate() : 0);
        if (isOptionalTemplate == null || isOptionalTemplate == 0) {
            tpl.setIsOptionalTemplate(Integer.valueOf(0));
            tpl.setOptionCT(null);
            if (tpl.getFreeCT() == null && ObjectUtils.isNotEmpty((Object)tpl.freeCharacters())) {
                tpl.setFreeCT(Long.valueOf(Long.parseLong(((ProductTplCharacter)tpl.freeCharacters().get(0)).get("characteristics").toString())));
            }
        } else if (isOptionalTemplate == 1) {
            tpl.setSkuPropCT(null);
            tpl.setFreeCT(null);
        }
        HashMap<Long, Map> idAndcharacteristic = new HashMap<Long, Map>();
        for (Map<String, Object> characteristicMap : characteristicsList) {
            idAndcharacteristic.put(Long.parseLong(characteristicMap.get("id").toString()), characteristicMap);
        }
        if (EntityStatus.Insert.equals((Object)tpl.getEntityStatus())) {
            tpl.setProductPropCharacters(this.buildTplCharacters((Long)tpl.getId(), tpl.getMaterialPropCT(), tpl.productPropCharacters(), idAndcharacteristic));
            tpl.setOptionCharacters(this.buildTplCharacters((Long)tpl.getId(), tpl.getOptionCT(), tpl.optionCharacters(), idAndcharacteristic));
            tpl.setSkuCharacters(this.buildTplCharacters((Long)tpl.getId(), tpl.getSkuPropCT(), tpl.skuCharacters(), idAndcharacteristic));
            tpl.setFreeCharacters(this.buildFreeCharacters((Long)tpl.getId(), tpl.freeCharacters(), idAndcharacteristic));
        } else if (EntityStatus.Update.equals((Object)tpl.getEntityStatus()) && materialTplPO != null) {
            if (tpl.getOptionCT() != null && !tpl.getOptionCT().equals(materialTplPO.getOptionCT())) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_TEMPLATE_NOT_SUPPORT_OPTIONAL_FEATURE_GROUP_MODIFY);
            }
            tpl.setOptionCharacters(null);
            if (tpl.getFreeCT() != null && !tpl.getFreeCT().equals(materialTplPO.getFreeCT())) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_TEMPLATE_NOT_SUPPORT_FREE_FEATURE_GROUP_MODIFY);
            }
            tpl.setFreeCharacters(null);
            if (tpl.getMaterialPropCT() != null && !tpl.getMaterialPropCT().equals(materialTplPO.getMaterialPropCT())) {
                this.deleteTplCharacter(tpl.getId().toString(), tpl.getMaterialPropCT());
                tpl.setProductPropCharacters(this.buildTplCharacters((Long)tpl.getId(), tpl.getMaterialPropCT(), tpl.productPropCharacters(), idAndcharacteristic));
            }
            if (tpl.getSkuPropCT() != null && !tpl.getSkuPropCT().equals(materialTplPO.getSkuPropCT())) {
                this.deleteTplCharacter(tpl.getId().toString(), tpl.getSkuPropCT());
                tpl.setSkuCharacters(this.buildTplCharacters((Long)tpl.getId(), tpl.getSkuPropCT(), tpl.skuCharacters(), idAndcharacteristic));
            }
        }
    }

    private void deleteTplCharacter(String tplId, Long materialPropCT) {
        com.yonyou.iuap.yms.param.condtition.query.QueryCondition condition = (com.yonyou.iuap.yms.param.condtition.query.QueryCondition)((com.yonyou.iuap.yms.param.condtition.query.QueryCondition)new com.yonyou.iuap.yms.param.condtition.query.QueryCondition((Object)new MaterialTplCharacterPO()).eq((Object)((String)MaterialTplCharacterPO.metaArrColumnFieldMap.get("template")), (Object)tplId)).eq((Object)((String)MaterialTplCharacterPO.metaArrColumnFieldMap.get("characteristics")), (Object)materialPropCT);
        this.ymsJdbcApi.removeByCondition((BaseEntity)new MaterialTplCharacterPO(), (Condition)condition, false);
    }

    private List<ProductTplCharacter> buildFreeCharacters(Long tplId, List<ProductTplCharacter> freeCharacters, Map<Long, Map> idAndcharacteristic) {
        if (!CollectionUtils.isEmpty(freeCharacters)) {
            Long freeCTId = freeCharacters.get(0).getCharacteristics();
            Map map = idAndcharacteristic.get(freeCTId);
            if (map.get("status") == null || !"1".equals(map.get("status").toString())) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_FEATURE_GROUP_NOT_ENABLE, new Object[]{map.get("code")});
            }
            Object characteristicsRelations = map.get("characteristicsRelations");
            if (characteristicsRelations == null) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_USER_FEATURE_GROUP_STRUCTURE_IS_NULL, new Object[]{map.get("code")});
            }
            List characters = JSONObject.parseArray((String)JSON.toJSONString(characteristicsRelations), Map.class);
            if (CollectionUtils.isEmpty((Collection)characters)) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_USER_FEATURE_GROUP_STRUCTURE_IS_NULL, new Object[]{map.get("code")});
            }
            Map<Object, Object> idAndFreeCharacters = new HashMap();
            Map<Object, Object> codeAndCharacters = new HashMap();
            if (ObjectUtils.isNotEmpty(freeCharacters)) {
                idAndFreeCharacters = freeCharacters.stream().filter(v -> v != null && v.getCharacter() != null).collect(Collectors.toMap(ProductTplCharacter::getCharacter, v -> v));
                codeAndCharacters = freeCharacters.stream().filter(v -> v != null && v.getCharacterCode() != null).collect(Collectors.toMap(ProductTplCharacter::getCharacterCode, v -> v));
            }
            ArrayList<ProductTplCharacter> productTplCharacters = new ArrayList<ProductTplCharacter>();
            for (Map character : characters) {
                long character_id = Long.parseLong(character.get("character_id").toString());
                String characterCode = character.get("character_code").toString();
                ProductTplCharacter freeCharacter = idAndFreeCharacters.get(character_id) != null ? (ProductTplCharacter)idAndFreeCharacters.get(character_id) : (ProductTplCharacter)codeAndCharacters.get(characterCode);
                ProductTplCharacter productTplCharacter = new ProductTplCharacter();
                productTplCharacter.setCharacter(Long.valueOf(Long.parseLong(character.get("character_id").toString())));
                productTplCharacter.setCharacterCode(characterCode);
                productTplCharacter.setCharacteristicsType(Long.valueOf(Long.parseLong(map.get("characteristicsType").toString())));
                productTplCharacter.setCharacteristics(Long.valueOf(Long.parseLong(map.get("id").toString())));
                productTplCharacter.put("dataType", (Object)Integer.parseInt(character.get("character_dataType").toString()));
                productTplCharacter.setTemplate(tplId);
                productTplCharacter.setId((Object)IdManager.getInstance().nextId());
                productTplCharacter.setEntityStatus(EntityStatus.Insert);
                Integer character_order = character.get("character_order") == null ? 0 : Integer.parseInt(character.get("character_order").toString());
                productTplCharacter.setIOrder(character_order);
                if (freeCharacter != null) {
                    if (EntityStatus.Update.equals((Object)freeCharacter.getEntityStatus())) {
                        productTplCharacter.setEntityStatus(freeCharacter.getEntityStatus());
                        productTplCharacter.setId(freeCharacter.getId());
                    }
                    productTplCharacter.setSkuSens(Integer.valueOf(freeCharacter.getSkuSens() == null ? 0 : freeCharacter.getSkuSens()));
                    productTplCharacter.setBatchSens(Integer.valueOf(freeCharacter.getBatchSens() == null ? 0 : freeCharacter.getBatchSens()));
                    productTplCharacter.setSNSens(Integer.valueOf(freeCharacter.getSNSens() == null ? 0 : freeCharacter.getSNSens()));
                    productTplCharacter.setStockSens(Integer.valueOf(freeCharacter.getStockSens() == null ? 0 : freeCharacter.getStockSens()));
                    productTplCharacter.setCostAffec(Integer.valueOf(freeCharacter.getCostAffec() == null ? 0 : freeCharacter.getCostAffec()));
                    productTplCharacter.setBOMAffec(Integer.valueOf(freeCharacter.getBOMAffec() == null ? 0 : freeCharacter.getBOMAffec()));
                    productTplCharacter.setManuAffec(Integer.valueOf(freeCharacter.getManuAffec() == null ? 0 : freeCharacter.getManuAffec()));
                    productTplCharacter.setIOrder(freeCharacter.getIOrder() == null ? character_order : freeCharacter.getIOrder());
                    productTplCharacter.setTwoDimensionalInput(Integer.valueOf(freeCharacter.getTwoDimensionalInput() == null ? 0 : freeCharacter.getTwoDimensionalInput()));
                } else {
                    productTplCharacter.setSkuSens(Integer.valueOf(0));
                    productTplCharacter.setBatchSens(Integer.valueOf(0));
                    productTplCharacter.setSNSens(Integer.valueOf(0));
                    productTplCharacter.setStockSens(Integer.valueOf(0));
                    productTplCharacter.setCostAffec(Integer.valueOf(0));
                    productTplCharacter.setBOMAffec(Integer.valueOf(0));
                    productTplCharacter.setManuAffec(Integer.valueOf(0));
                }
                productTplCharacters.add(productTplCharacter);
            }
            return productTplCharacters;
        }
        return null;
    }

    private List<ProductTplCharacter> buildTplCharacters(Long tplId, Long characteristicId, List<ProductTplCharacter> tplCharacters, Map<Long, Map> idAndcharacteristic) {
        if (characteristicId == null) {
            return null;
        }
        ArrayList<ProductTplCharacter> resultProductTplCharacters = new ArrayList<ProductTplCharacter>();
        Map map = idAndcharacteristic.get(characteristicId);
        if (map.get("status") == null || !"1".equals(map.get("status").toString())) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_FEATURE_GROUP_NOT_ENABLE_TO_IMPORT, new Object[]{map.get("code")});
        }
        Object characteristicsRelations = map.get("characteristicsRelations");
        if (characteristicsRelations == null) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_FEATURE_GROUP_STRUCTURE_IS_NULL_CHECK_SYNCHRONIZE, new Object[]{map.get("code")});
        }
        List characters = JSONObject.parseArray((String)JSON.toJSONString(characteristicsRelations), Map.class);
        if (CollectionUtils.isEmpty((Collection)characters)) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_USER_FEATURE_GROUP_STRUCTURE_IS_NULL, new Object[]{map.get("code")});
        }
        Map<Object, Object> codeAndCharacters = new HashMap();
        if (ObjectUtils.isNotEmpty(tplCharacters)) {
            codeAndCharacters = tplCharacters.stream().filter(v -> v != null && v.getCharacterCode() != null).collect(Collectors.toMap(ProductTplCharacter::getCharacterCode, v -> v));
        }
        for (Map character : characters) {
            String characterCode = character.get("character_code").toString();
            ProductTplCharacter tplCharacter = (ProductTplCharacter)codeAndCharacters.get(characterCode);
            ProductTplCharacter resultProductTplCharacter = new ProductTplCharacter();
            resultProductTplCharacter.setCharacter(Long.valueOf(Long.parseLong(character.get("character_id").toString())));
            resultProductTplCharacter.setCharacterCode(characterCode);
            resultProductTplCharacter.setCharacteristicsType(Long.valueOf(Long.parseLong(map.get("characteristicsType").toString())));
            resultProductTplCharacter.setCharacteristics(Long.valueOf(Long.parseLong(map.get("id").toString())));
            resultProductTplCharacter.put("dataType", (Object)Integer.parseInt(character.get("character_dataType").toString()));
            resultProductTplCharacter.setEntityStatus(EntityStatus.Insert);
            resultProductTplCharacter.setId((Object)IdManager.getInstance().nextId());
            resultProductTplCharacter.setTemplate(tplId);
            if (tplCharacter != null && EntityStatus.Update.equals((Object)tplCharacter.getEntityStatus())) {
                resultProductTplCharacter.setEntityStatus(tplCharacter.getEntityStatus());
                resultProductTplCharacter.setId(tplCharacter.getId());
                resultProductTplCharacter.setWebShow(tplCharacter.getWebShow());
                resultProductTplCharacter.setIOrder(tplCharacter.getIOrder());
            }
            resultProductTplCharacters.add(resultProductTplCharacter);
        }
        return resultProductTplCharacters;
    }

    private List<Map<String, Object>> getCharacteristicsById(List<Long> characteristics) {
        ArrayList<Map<String, Object>> arrayList;
        block12: {
            ArrayList<Map<String, Object>> characteristicsDetail = new ArrayList<Map<String, Object>>();
            HashMap<String, String> headers = new HashMap<String, String>();
            headers.put("Content-Type", "application/json");
            headers.put("token", InvocationInfoProxy.getYhtAccessToken());
            headers.put("yht_access_token", InvocationInfoProxy.getYhtAccessToken());
            String characterDomainUrl = this.ymsParamConfig.getDomainIuapMetadataExtend();
            String characterUrl = characterDomainUrl + "/character/api/getCharactersByCharacteristcs";
            HashMap<String, List<Long>> params = new HashMap<String, List<Long>>();
            params.put("characteristics", characteristics);
            YmsHttpHeader ymsHttpHeader = new YmsHttpHeader();
            ymsHttpHeader.add("Content-Type", "application/json;charset=utf-8");
            String result = "";
            YmsHttpRequest request = new YmsHttpRequestBuilder().url(characterUrl).method(YmsHttpMethod.POST).body((Object)JSON.toJSONString(params)).addHeader(ymsHttpHeader.addAllMap(headers)).build();
            YmsHttpResponse ymsHttpResponse = this.ymsHttpClient.execute(request);
            try {
                result = ymsHttpResponse.getBodyString();
                Map map = (Map)JSONObject.parseObject((String)result, (TypeReference)new TypeReference<Map<String, Object>>(){}, (Feature[])new Feature[0]);
                Object status = map.get("code");
                if (status != null && "200".equals(status.toString())) {
                    Object data = map.get("data");
                    List dataMaps = JSONObject.parseArray((String)JSON.toJSONString(data), Map.class);
                    if (ObjectUtils.isNotEmpty((Object)dataMaps)) {
                        for (Map dataMap : dataMaps) {
                            characteristicsDetail.add((Map)JSONObject.parseObject((String)JSON.toJSONString((Object)dataMap), (TypeReference)new TypeReference<Map<String, Object>>(){}, (Feature[])new Feature[0]));
                        }
                    }
                } else {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_GET_FEATURE_GROUP_STRUCTURE_FAILURE);
                }
                arrayList = characteristicsDetail;
                if (ymsHttpResponse == null) break block12;
            }
            catch (Throwable throwable) {
                try {
                    if (ymsHttpResponse != null) {
                        try {
                            ymsHttpResponse.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (Exception e) {
                    log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080C21", (String)"\u8c03\u7528\u7279\u5f81\u670d\u52a1\uff0c\u83b7\u53d6\u7279\u5f81\u7ec4\u7ed3\u6784\u4fe1\u606f\u5931\u8d25") + e.getMessage(), (Throwable)e);
                    return characteristicsDetail;
                }
            }
            ymsHttpResponse.close();
        }
        return arrayList;
    }

    private void processFreeCTCharacters(ProductTpl tpl) throws Exception {
        List productTplCharacters = tpl.getBizObjects("freeCharacters", ProductTplCharacter.class);
        if (!CollectionUtils.isEmpty((Collection)productTplCharacters)) {
            for (ProductTplCharacter productTplCharacter : productTplCharacters) {
                Integer batchSens = productTplCharacter.getBatchSens();
                Integer snSens = productTplCharacter.getSNSens();
                Integer skuSens = productTplCharacter.getSkuSens();
                Integer costAffec = productTplCharacter.getCostAffec();
                Integer stockSens = productTplCharacter.getStockSens();
                Integer bomAffec = productTplCharacter.getBOMAffec();
                Integer manuAffec = productTplCharacter.getManuAffec();
                if ((1 == skuSens || 1 == stockSens || 1 == costAffec || 1 == bomAffec || 1 == manuAffec) && 5 != productTplCharacter.getDataType() && 6 != productTplCharacter.getDataType()) {
                    String errMsg = this.buildErrMsg(skuSens, costAffec, stockSens, bomAffec, manuAffec, productTplCharacter.getCharacterCode());
                    throw new CoreDocBusinessException(errMsg);
                }
                if (1 == skuSens && 0 == stockSens) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SET_SKU_SENSITIVE_YES_SHOULD_SET_STOCK_SENSITIVE_YES, new Object[]{productTplCharacter.getCharacterCode()});
                }
                if (1 == costAffec && 0 == stockSens) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_COST_SENSITIVE_NOT_IN_STOCK_SENSITIVE_RANGE, new Object[]{productTplCharacter.getCharacterCode()});
                }
                if (1 != bomAffec || 0 != stockSens || 0 != batchSens || 0 != snSens) continue;
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_BOM_SENSITIVE_NOT_IN_SENSITIVE_RANGE, new Object[]{productTplCharacter.getCharacterCode()});
            }
        }
    }

    private String buildErrMsg(Integer skuSens, Integer costAffec, Integer stockSens, Integer bomAffec, Integer manuAffec, String characterCode) {
        String errmsg = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080C3B", (String)"%s\u53ea\u652f\u6301\u7279\u5f81\u7c7b\u578b\uff1a\u81ea\u5b9a\u4e49\u6863\u6848\uff0c\u57fa\u672c\u6863\u6848\uff0c\u8bf7\u68c0\u67e5\u7279\u5f81\uff08%s\uff09");
        String sensitive = "";
        if (1 == skuSens) {
            sensitive = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080C3E", (String)"sku\u654f\u611f");
        } else if (1 == stockSens) {
            sensitive = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080C1A", (String)"\u5b58\u91cf\u654f\u611f");
        } else if (1 == costAffec) {
            sensitive = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080C1B", (String)"\u6210\u672c\u654f\u611f");
        } else if (1 == bomAffec) {
            sensitive = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080C1C", (String)"BOM\u654f\u611f");
        } else if (1 == manuAffec) {
            sensitive = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080C1D", (String)"\u5de5\u827a\u654f\u611f");
        }
        return String.format(errmsg, sensitive, characterCode);
    }

    private void clearCache(Long id) {
        Iterable languageVOS = this.languageService.findAllWithoutCache(AppContext.getCurrentUser().getYhtTenantId());
        for (LanguageVO languageVO : languageVOS) {
            String langCode = languageVO.getLangCode();
            String key = this.cache.createKey("pc.tpl.ProductTpl", id + "#" + langCode);
            this.cache.delete(key);
        }
    }

    private void dealApiData(ProductTpl tpl) throws Exception {
        if (tpl.containsKey((Object)"_fromApi") && ((Boolean)tpl.get("_fromApi")).booleanValue()) {
            ProducttplUtils.getInstance().checkBrandExists(tpl.Brands());
            ProducttplUtils.getInstance().checkParameterssExists(tpl.Parameters());
            if (tpl.getEntityStatus() == EntityStatus.Update) {
                this.processDataForApiUpdate(tpl);
            }
        }
    }

    private void processDataForApiUpdate(ProductTpl tpl) throws Exception {
        if (Objects.nonNull(tpl.getId())) {
            Map templateDbData = this.productTplService.getTemplateData((Long)tpl.getId());
            if (Objects.nonNull(tpl.Units()) && templateDbData.containsKey("Units") && tpl.Units().size() > 0) {
                ((ProductTplUnit)tpl.Units().get(0)).setId(((Map)((List)templateDbData.get("Units")).get(0)).get("id"));
                ((ProductTplUnit)tpl.Units().get(0)).setEntityStatus(EntityStatus.Update);
            } else if (Objects.nonNull(tpl.Units()) && !templateDbData.containsKey("Units")) {
                ((ProductTplUnit)tpl.Units().get(0)).setId((Object)IdManager.getInstance().nextId());
                ((ProductTplUnit)tpl.Units().get(0)).setEntityStatus(EntityStatus.Insert);
            }
            if (Objects.nonNull(tpl.productTplAssistUnitExchanges()) && tpl.productTplAssistUnitExchanges().size() > 0) {
                List productTplAssistUnitDb = null;
                Iterator it = null;
                if (templateDbData.containsKey("productTplAssistUnitExchanges")) {
                    productTplAssistUnitDb = (List)templateDbData.get("productTplAssistUnitExchanges");
                    it = productTplAssistUnitDb.iterator();
                }
                for (ProductTplAssistUnitExchange productTplAssistUnitExchangeOne : tpl.productTplAssistUnitExchanges()) {
                    Long assistUnit = productTplAssistUnitExchangeOne.getAssistUnit();
                    if (Objects.nonNull(productTplAssistUnitDb) && productTplAssistUnitDb.size() > 0) {
                        while (it.hasNext()) {
                            Map mapDB = (Map)it.next();
                            if (!mapDB.containsKey("assistUnit") || !assistUnit.equals(mapDB.get("assistUnit"))) continue;
                            productTplAssistUnitExchangeOne.setId(mapDB.get("id"));
                            productTplAssistUnitExchangeOne.setEntityStatus(EntityStatus.Update);
                            it.remove();
                        }
                        continue;
                    }
                    productTplAssistUnitExchangeOne.setId((Object)IdManager.getInstance().nextId());
                    productTplAssistUnitExchangeOne.setEntityStatus(EntityStatus.Insert);
                }
                List productTplAssistUnitExchanges = tpl.productTplAssistUnitExchanges();
                if (Objects.nonNull(productTplAssistUnitDb) && productTplAssistUnitDb.size() > 0) {
                    for (Map mapONe : productTplAssistUnitDb) {
                        ProductTplAssistUnitExchange mapONe1 = new ProductTplAssistUnitExchange();
                        mapONe1.putAll(mapONe);
                        mapONe1.setEntityStatus(EntityStatus.Delete);
                        productTplAssistUnitExchanges.add(mapONe1);
                    }
                }
                tpl.setProductTplAssistUnitExchanges(productTplAssistUnitExchanges);
            }
        }
    }

    private void processProperty(ProductTpl tpl) throws Exception {
        EntityStatus status = tpl.getEntityStatus();
        List propSums = tpl.PropertySums();
        ArrayList<Object> propCommits = new ArrayList<Object>();
        HashSet<Long> propSet = new HashSet<Long>();
        if (propSums != null) {
            for (ProductTplExtendPropertySum sum : propSums) {
                ProductTplExtendProperty prop = new ProductTplExtendProperty();
                this.dealModedata((Map)sum);
                prop.setId((Object)IdManager.getInstance().nextId());
                prop.setIsRequired(sum.getIsRequired());
                prop.setPropertyType(sum.getPropertyType());
                prop.set("propertyType_showItem", sum.get("propertyType_showItem"));
                prop.setAlias(sum.getAlias());
                prop.setOrder(sum.getOrder());
                prop.setIsShow(sum.getIsShow());
                prop.setTemplate((Long)tpl.getId());
                prop.setEntityStatus(EntityStatus.Insert);
                if (!StringUtils.isEmpty((CharSequence)sum.getValues())) {
                    String values;
                    String[] items = sum.getValues().split("; ");
                    if (tpl.containsKey((Object)"_fromApi") && (values = sum.getValues().replace("; ", ";")) != null) {
                        String string = values.replaceAll(";", "; ");
                        sum.setValues(string);
                        items = sum.getValues().split("; ");
                    }
                    ArrayList valueCommits = new ArrayList();
                    Arrays.stream(items).forEach(item -> {
                        if (!StringUtils.isEmpty((CharSequence)item)) {
                            ProductTplExtendPropertyValue val = new ProductTplExtendPropertyValue();
                            val.setId((Object)IdManager.getInstance().nextId());
                            val.setProperty(sum.getPropertyType());
                            val.setValue(item);
                            val.setEntityStatus(EntityStatus.Insert);
                            valueCommits.add(val);
                        }
                    });
                    if (!propSet.contains(sum.getPropertyType())) {
                        prop.setValueItems(valueCommits);
                    } else {
                        List list = propCommits.stream().filter(tempProp -> tempProp.getPropertyType().equals(sum.getPropertyType())).collect(Collectors.toList());
                        if (list != null && list.size() == 1) {
                            List propertyValues = ((ProductTplExtendProperty)list.get(0)).valueItems();
                            propertyValues.addAll(valueCommits);
                        }
                    }
                }
                if (propSet.contains(sum.getPropertyType())) continue;
                propSet.add(sum.getPropertyType());
                propCommits.add(prop);
            }
        }
        List<Long> propDefItems = this.getUserdefItems("productArchive");
        List disabledItems = propCommits.stream().filter(p -> !propDefItems.contains(p.getPropertyType())).map(p -> p.get("propertyType_showItem").toString()).collect(Collectors.toList());
        if (disabledItems.size() > 0) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800127, new Object[]{String.join((CharSequence)"\u3001", disabledItems)});
        }
        ArrayList propDbs = new ArrayList();
        ArrayList valueDbs = new ArrayList();
        if (status == EntityStatus.Update) {
            QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"template").eq(tpl.getId())});
            QuerySchema querySchema = QuerySchema.create().addSelect(new String[]{"id", "template", "propertyType", "propertyType.defineId", "propertyType.showItem"}).addCondition((ConditionExpression)condition);
            MetaDaoHelper.query((String)"pc.tpl.ProductTplExtendProperty", (QuerySchema)querySchema).forEach(m -> propDbs.add((ProductTplExtendProperty)Objectlizer.convert((Map)m, (String)"pc.tpl.ProductTplExtendProperty")));
            condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"property.template").eq(tpl.getId())});
            QuerySchema querySchema2 = QuerySchema.create().addSelect(new String[]{"id", "property", "value"}).addCondition((ConditionExpression)condition);
            MetaDaoHelper.query((String)"pc.tpl.ProductTplExtendPropertyValue", (QuerySchema)querySchema2).forEach(m -> valueDbs.add((ProductTplExtendPropertyValue)Objectlizer.convert((Map)m, (String)"pc.tpl.ProductTplExtendPropertyValue")));
        }
        for (ProductTplExtendProperty productTplExtendProperty : propCommits) {
            Optional<ProductTplExtendProperty> opt = propDbs.stream().filter(p -> pc.getPropertyType().equals(p.getPropertyType())).findAny();
            if (!opt.isPresent()) continue;
            productTplExtendProperty.setId(opt.get().getId());
            productTplExtendProperty.setEntityStatus(EntityStatus.Update);
            opt.get().setEntityStatus(EntityStatus.Update);
            List vals = valueDbs.stream().filter(val -> val.getProperty().equals(((ProductTplExtendProperty)opt.get()).getId())).collect(Collectors.toList());
            if (vals == null || productTplExtendProperty.valueItems() == null) continue;
            productTplExtendProperty.valueItems().forEach(pcVal -> {
                pcVal.setProperty((Long)pc.getId());
                Optional<ProductTplExtendPropertyValue> optVal = vals.stream().filter(val -> pcVal.getProperty().equals(val.getProperty()) && StringUtils.equals((CharSequence)pcVal.getValue(), (CharSequence)val.getValue())).findAny();
                if (optVal.isPresent()) {
                    pcVal.setId(optVal.get().getId());
                    pcVal.setEntityStatus(EntityStatus.Unchanged);
                    optVal.get().setEntityStatus(EntityStatus.Update);
                }
            });
            List deletedValueItems = vals.stream().filter(v -> {
                boolean isUpdate;
                boolean bl = isUpdate = v.getEntityStatus() == EntityStatus.Update;
                if (!isUpdate) {
                    v.setEntityStatus(EntityStatus.Delete);
                }
                return !isUpdate;
            }).collect(Collectors.toList());
            productTplExtendProperty.valueItems().addAll(deletedValueItems);
        }
        List deletedItems = propDbs.stream().filter(p -> {
            boolean isUpdate;
            boolean bl = isUpdate = p.getEntityStatus() == EntityStatus.Update;
            if (!tpl.containsKey((Object)"increment") && !isUpdate) {
                p.setEntityStatus(EntityStatus.Delete);
                return true;
            }
            return false;
        }).collect(Collectors.toList());
        for (ProductTplExtendProperty prop : deletedItems) {
            Object propertyType_defineId = prop.get("propertyType_defineId");
            String defineFldName = this.tplDao.getDefineFldName(propertyType_defineId, (String)AppContext.getYTenantId());
            if (defineFldName == null) continue;
            if (this.dataSourceService.getDataSourceIsOscar()) {
                List productDefineList = this.tplDao.selectProductDefineByDefineIdOscar(((Long)tpl.getId()).longValue(), defineFldName, null);
                if (CollectionUtils.isEmpty((Collection)productDefineList)) continue;
                for (Map productDefine : productDefineList) {
                    productDefine.put("defineId", defineFldName);
                    productDefine.put("value", null);
                    this.tplDao.updateProductDefineByDefineIdOscar(productDefine);
                }
                continue;
            }
            this.tplDao.updateProductdefineByDefineid(((Long)tpl.getId()).longValue(), defineFldName, null);
        }
        propCommits.addAll(deletedItems);
        tpl.remove("PropertySums");
        tpl.setProperties(propCommits);
    }

    private void dealModedata(Map prop) throws Exception {
        List list = MetaDaoHelper.queryById((String)"pc.userdef.UserDefineClass", (String)"userdefMode", prop.get("propertyType"));
        if (list != null && list.size() == 1) {
            Map map = (Map)list.get(0);
            Object userdefMode = map.get("userdefMode");
            if (userdefMode != null && "1".equals(userdefMode.toString())) {
                return;
            }
            prop.remove("values");
        }
    }

    private void processSkuProperty(ProductTpl tpl) throws Exception {
        EntityStatus status = tpl.getEntityStatus();
        List propSums = tpl.SKUPropertySums();
        ArrayList<Object> propCommits = new ArrayList<Object>();
        HashSet<Long> propSet = new HashSet<Long>();
        if (propSums != null) {
            for (ProductTplSKUPropertySum sum : propSums) {
                ProductTplSKUProperty prop = new ProductTplSKUProperty();
                this.dealModedata((Map)sum);
                prop.setId((Object)IdManager.getInstance().nextId());
                prop.setIsRequired(sum.getIsRequired());
                prop.setPropertyType(sum.getPropertyType());
                prop.set("propertyType_showItem", sum.get("propertyType_showItem"));
                prop.setAlias(sum.getAlias());
                prop.setOrder(sum.getOrder());
                prop.setTemplate((Long)tpl.getId());
                prop.setEntityStatus(EntityStatus.Insert);
                if (!StringUtils.isEmpty((CharSequence)sum.getValues())) {
                    String[] items = sum.getValues().split("; ");
                    if (tpl.containsKey((Object)"_fromApi")) {
                        String values = sum.getValues().replace("; ", ";");
                        String string = values.replaceAll(";", "; ");
                        sum.setValues(string);
                        items = sum.getValues().split("; ");
                    }
                    ArrayList valueCommits = new ArrayList();
                    Arrays.stream(items).forEach(item -> {
                        if (!StringUtils.isEmpty((CharSequence)item)) {
                            ProductTplSKUPropertyValue val = new ProductTplSKUPropertyValue();
                            val.setId((Object)IdManager.getInstance().nextId());
                            val.setProperty(sum.getPropertyType());
                            val.setValue(item);
                            val.setEntityStatus(EntityStatus.Insert);
                            valueCommits.add(val);
                        }
                    });
                    if (!propSet.contains(sum.getPropertyType())) {
                        prop.setValueItems(valueCommits);
                    } else {
                        List list = propCommits.stream().filter(tempProp -> tempProp.getPropertyType().equals(sum.getPropertyType())).collect(Collectors.toList());
                        if (list != null && list.size() == 1) {
                            List propertyValues = ((ProductTplSKUProperty)list.get(0)).valueItems();
                            propertyValues.addAll(valueCommits);
                        }
                    }
                }
                if (propSet.contains(sum.getPropertyType())) continue;
                propSet.add(sum.getPropertyType());
                propCommits.add(prop);
            }
        }
        List<Long> propDefItems = this.getUserdefItems("productSku");
        List disabledItems = propCommits.stream().filter(p -> !propDefItems.contains(p.getPropertyType())).map(p -> p.get("propertyType_showItem").toString()).collect(Collectors.toList());
        if (disabledItems.size() > 0) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800128, new Object[]{String.join((CharSequence)"\u3001", disabledItems)});
        }
        ArrayList propDbs = new ArrayList();
        ArrayList valueDbs = new ArrayList();
        if (status == EntityStatus.Update) {
            QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"template").eq(tpl.getId())});
            QuerySchema querySchema = QuerySchema.create().addSelect(new String[]{"id", "template", "propertyType", "propertyType.defineId", "propertyType.showItem"}).addCondition((ConditionExpression)condition);
            MetaDaoHelper.query((String)"pc.tpl.ProductTplSKUProperty", (QuerySchema)querySchema).forEach(m -> propDbs.add((ProductTplSKUProperty)Objectlizer.convert((Map)m, (String)"pc.tpl.ProductTplSKUProperty")));
            condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"property.template").eq(tpl.getId())});
            QuerySchema querySchema2 = QuerySchema.create().addSelect(new String[]{"id", "property", "value"}).addCondition((ConditionExpression)condition);
            MetaDaoHelper.query((String)"pc.tpl.ProductTplSKUPropertyValue", (QuerySchema)querySchema2).forEach(m -> valueDbs.add((ProductTplSKUPropertyValue)Objectlizer.convert((Map)m, (String)"pc.tpl.ProductTplSKUPropertyValue")));
        }
        for (ProductTplSKUProperty productTplSKUProperty : propCommits) {
            Optional<ProductTplSKUProperty> opt = propDbs.stream().filter(p -> pc.getPropertyType().equals(p.getPropertyType())).findAny();
            if (!opt.isPresent()) continue;
            productTplSKUProperty.setId(opt.get().getId());
            productTplSKUProperty.setEntityStatus(EntityStatus.Update);
            opt.get().setEntityStatus(EntityStatus.Update);
            List vals = valueDbs.stream().filter(val -> val.getProperty().equals(((ProductTplSKUProperty)opt.get()).getId())).collect(Collectors.toList());
            if (vals == null || productTplSKUProperty.valueItems() == null) continue;
            productTplSKUProperty.valueItems().forEach(pcVal -> {
                pcVal.setProperty((Long)pc.getId());
                Optional<ProductTplSKUPropertyValue> optVal = vals.stream().filter(val -> pcVal.getProperty().equals(val.getProperty()) && StringUtils.equals((CharSequence)pcVal.getValue(), (CharSequence)val.getValue())).findAny();
                if (optVal.isPresent()) {
                    pcVal.setId(optVal.get().getId());
                    pcVal.setEntityStatus(EntityStatus.Unchanged);
                    optVal.get().setEntityStatus(EntityStatus.Update);
                }
            });
            List deletedValueItems = vals.stream().filter(v -> {
                boolean isUpdate;
                boolean bl = isUpdate = v.getEntityStatus() == EntityStatus.Update;
                if (!isUpdate) {
                    v.setEntityStatus(EntityStatus.Delete);
                }
                return !isUpdate;
            }).collect(Collectors.toList());
            productTplSKUProperty.valueItems().addAll(deletedValueItems);
        }
        List deletedItems = propDbs.stream().filter(p -> {
            boolean isUpdate;
            boolean bl = isUpdate = p.getEntityStatus() == EntityStatus.Update;
            if (!tpl.containsKey((Object)"increment") && !isUpdate) {
                p.setEntityStatus(EntityStatus.Delete);
                return true;
            }
            return false;
        }).collect(Collectors.toList());
        if (deletedItems != null && deletedItems.size() > 0) {
            for (ProductTplSKUProperty prop : deletedItems) {
                Object propertyType_defineId = prop.get("propertyType_defineId");
                String defineFldName = this.tplDao.getskuDefineFldName(propertyType_defineId, (String)AppContext.getYTenantId());
                if (defineFldName == null) continue;
                this.tplDao.updateProductSkudefineByDefineid(((Long)tpl.getId()).longValue(), defineFldName, null);
            }
        }
        propCommits.addAll(deletedItems);
        tpl.remove("SKUPropertySums");
        tpl.setSKUProperties(propCommits);
    }

    private void processOrderProperty(ProductTpl tpl) throws Exception {
        EntityStatus status = tpl.getEntityStatus();
        List propSums = tpl.OrderPropertySums();
        ArrayList<Object> propCommits = new ArrayList<Object>();
        HashSet<Long> propSet = new HashSet<Long>();
        if (propSums != null) {
            for (ProductTplOrderPropertySum sum : propSums) {
                ProductTplOrderProperty prop = new ProductTplOrderProperty();
                this.dealModedata((Map)sum);
                prop.setId((Object)IdManager.getInstance().nextId());
                prop.setIsShow(sum.getIsShow());
                prop.setIsRequired(sum.getIsRequired());
                prop.setPropertyType(sum.getPropertyType());
                prop.set("propertyType_showItem", sum.get("propertyType_showItem"));
                prop.setAlias(sum.getAlias());
                prop.setOrder(sum.getOrder());
                prop.setLimitNum(sum.getLimitNum());
                prop.setTemplate((Long)tpl.getId());
                prop.setEntityStatus(EntityStatus.Insert);
                if (!StringUtils.isEmpty((CharSequence)sum.getValues())) {
                    String values;
                    String[] items = sum.getValues().split("; ");
                    if (tpl.containsKey((Object)"_fromApi") && (values = sum.getValues().replace("; ", ";")) != null) {
                        String string = values.replaceAll(";", "; ");
                        sum.setValues(string);
                        items = sum.getValues().split("; ");
                    }
                    ArrayList valueCommits = new ArrayList();
                    Arrays.stream(items).forEach(item -> {
                        if (!StringUtils.isEmpty((CharSequence)item)) {
                            ProductTplOrderPropertyValue val = new ProductTplOrderPropertyValue();
                            val.setId((Object)IdManager.getInstance().nextId());
                            val.setProperty(sum.getPropertyType());
                            val.setValue(item);
                            val.setEntityStatus(EntityStatus.Insert);
                            valueCommits.add(val);
                        }
                    });
                    if (!propSet.contains(sum.getPropertyType())) {
                        prop.setValueItems(valueCommits);
                    } else {
                        List list = propCommits.stream().filter(tempProp -> tempProp.getPropertyType().equals(sum.getPropertyType())).collect(Collectors.toList());
                        if (list != null && list.size() == 1) {
                            List propertyValues = ((ProductTplOrderProperty)list.get(0)).valueItems();
                            propertyValues.addAll(valueCommits);
                        }
                    }
                }
                if (propSet.contains(sum.getPropertyType())) continue;
                propSet.add(sum.getPropertyType());
                propCommits.add(prop);
            }
        }
        List<Long> propDefItems = this.getUserdefItems("productOrder");
        List disabledItems = propCommits.stream().filter(p -> !propDefItems.contains(p.getPropertyType())).map(p -> p.get("propertyType_showItem").toString()).collect(Collectors.toList());
        if (disabledItems.size() > 0) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800129, new Object[]{String.join((CharSequence)"\u3001", disabledItems)});
        }
        ArrayList propDbs = new ArrayList();
        ArrayList valueDbs = new ArrayList();
        if (status == EntityStatus.Update) {
            QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"template").eq(tpl.getId())});
            QuerySchema querySchema = QuerySchema.create().addSelect(new String[]{"id", "template", "propertyType", "propertyType.defineId", "propertyType.showItem"}).addCondition((ConditionExpression)condition);
            MetaDaoHelper.query((String)"pc.tpl.ProductTplOrderProperty", (QuerySchema)querySchema).forEach(m -> propDbs.add((ProductTplOrderProperty)Objectlizer.convert((Map)m, (String)"pc.tpl.ProductTplOrderProperty")));
            condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"property.template").eq(tpl.getId())});
            QuerySchema querySchema2 = QuerySchema.create().addSelect(new String[]{"id", "property", "value"}).addCondition((ConditionExpression)condition);
            MetaDaoHelper.query((String)"pc.tpl.ProductTplOrderPropertyValue", (QuerySchema)querySchema2).forEach(m -> valueDbs.add((ProductTplOrderPropertyValue)Objectlizer.convert((Map)m, (String)"pc.tpl.ProductTplOrderPropertyValue")));
        }
        for (ProductTplOrderProperty productTplOrderProperty : propCommits) {
            Optional<ProductTplOrderProperty> opt = propDbs.stream().filter(p -> pc.getPropertyType().equals(p.getPropertyType())).findAny();
            if (!opt.isPresent()) continue;
            productTplOrderProperty.setId(opt.get().getId());
            productTplOrderProperty.setEntityStatus(EntityStatus.Update);
            opt.get().setEntityStatus(EntityStatus.Update);
            List vals = valueDbs.stream().filter(val -> val.getProperty().equals(((ProductTplOrderProperty)opt.get()).getId())).collect(Collectors.toList());
            if (vals != null && productTplOrderProperty.valueItems() != null) {
                productTplOrderProperty.valueItems().forEach(pcVal -> {
                    pcVal.setProperty((Long)pc.getId());
                    Optional<ProductTplOrderPropertyValue> optVal = vals.stream().filter(val -> pcVal.getProperty().equals(val.getProperty()) && StringUtils.equals((CharSequence)pcVal.getValue(), (CharSequence)val.getValue())).findAny();
                    if (optVal.isPresent()) {
                        pcVal.setId(optVal.get().getId());
                        pcVal.setEntityStatus(EntityStatus.Unchanged);
                        optVal.get().setEntityStatus(EntityStatus.Update);
                    }
                });
                List deletedValueItems = vals.stream().filter(v -> {
                    boolean isUpdate;
                    boolean bl = isUpdate = v.getEntityStatus() == EntityStatus.Update;
                    if (!isUpdate) {
                        v.setEntityStatus(EntityStatus.Delete);
                    }
                    return !isUpdate;
                }).collect(Collectors.toList());
                productTplOrderProperty.valueItems().addAll(deletedValueItems);
            }
            SKUOrderProperty skuOrderProperty = new SKUOrderProperty();
            skuOrderProperty.setIsRequired(productTplOrderProperty.getIsRequired());
            skuOrderProperty.setIsShow(productTplOrderProperty.getIsShow());
            skuOrderProperty.setIOrder(productTplOrderProperty.getOrder());
            skuOrderProperty.setSkuPropertyTypeId((Long)productTplOrderProperty.getId());
            skuOrderProperty.put("ytenantId", AppContext.getYTenantId());
            SqlHelper.update((String)"com.yonyoucloud.upc.userdef.dao.ProductTpl.updateProductSkuOrderPropertyToProduct", (Object)skuOrderProperty);
        }
        List deletedItems = propDbs.stream().filter(p -> {
            boolean isUpdate;
            boolean bl = isUpdate = p.getEntityStatus() == EntityStatus.Update;
            if (!isUpdate) {
                p.setEntityStatus(EntityStatus.Delete);
            }
            return !isUpdate;
        }).collect(Collectors.toList());
        for (ProductTplOrderProperty prop : deletedItems) {
            Object id = prop.get("id");
            this.tplDao.deleteProductOrderProByDefineid(((Long)tpl.getId()).longValue(), id);
        }
        propCommits.addAll(deletedItems);
        tpl.remove("OrderPropertySums");
        tpl.setOrderProperties(propCommits);
    }

    private void processSpec(ProductTpl tpl) throws Exception {
        if (tpl.getEntityStatus().equals((Object)EntityStatus.Update) && this.pubOptionService.getTplIncrement() == 1) {
            tpl.remove("Specs");
            tpl.remove("SpecSums");
            return;
        }
        EntityStatus status = tpl.getEntityStatus();
        List specSums = tpl.SpecSums();
        ArrayList<Object> specCommits = new ArrayList<Object>();
        ArrayList<ProductTplSpec> specReferCommits = new ArrayList<ProductTplSpec>();
        int isShowSpecCount = 0;
        if (specSums != null) {
            for (ProductTplSpecSum sum : specSums) {
                Object type;
                if (sum.get("specification_isShowSpec") != null && !((Boolean)sum.get("specification_isShowSpec")).booleanValue()) {
                    if (Objects.nonNull(sum.getTwoDimensionalInput()) && sum.getTwoDimensionalInput().booleanValue()) {
                        throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SINGLE_DISPLACE_ONLY_FOR_DOUBLE_SKU);
                    }
                    ++isShowSpecCount;
                } else {
                    QuerySchema schema = QuerySchema.create().addSelect("isShowSpec").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)sum.getSpecification()), QueryCondition.name((String)"classId").eq((Object)"productSpec")}));
                    Map querySpec = MetaDaoHelper.queryOne((String)"pc.userdef.UserDefineClass", (QuerySchema)schema);
                    if (querySpec != null && !((Boolean)querySpec.get("isShowSpec")).booleanValue()) {
                        if (Objects.nonNull(sum.getTwoDimensionalInput()) && sum.getTwoDimensionalInput().booleanValue()) {
                            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SINGLE_DISPLACE_ONLY_FOR_DOUBLE_SKU);
                        }
                        ++isShowSpecCount;
                    }
                }
                if (isShowSpecCount > 5) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SKU_COUNT_EXCEED_MAX_NUMBER);
                }
                if (!StringUtils.isEmpty((CharSequence)sum.getSpecitem())) {
                    String values;
                    String[] items = sum.getSpecitem().split("; ");
                    if (tpl.containsKey((Object)"_fromApi") && (values = sum.getSpecitem().replace("; ", ";")) != null) {
                        String s2 = values.replaceAll(";", "; ");
                        sum.setSpecitem(s2);
                        items = sum.getSpecitem().split("; ");
                    }
                    Arrays.stream(items).forEach(item -> {
                        if (!StringUtils.isEmpty((CharSequence)item)) {
                            ProductTplSpec spec = new ProductTplSpec();
                            spec.setId((Object)IdManager.getInstance().nextId());
                            spec.setTemplate((Long)tpl.getId());
                            spec.setSpecification(sum.getSpecification());
                            spec.set("specification_showItem", sum.get("specification_showItem"));
                            spec.setSpecitem(item);
                            if (null == sum.getOrder()) {
                                sum.setOrder(Integer.valueOf(0));
                            }
                            spec.setOrder(sum.getOrder());
                            spec.setEntityStatus(EntityStatus.Insert);
                            spec.setTwoDimensionalInput(sum.getTwoDimensionalInput());
                            spec.setSpecBusinessDynamic(sum.getSpecBusinessDynamic());
                            specCommits.add(spec);
                        }
                    });
                    continue;
                }
                Long specification = sum.getSpecification();
                QuerySchema schema = QuerySchema.create().addSelect("type").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)specification)}));
                List mapList = MetaDaoHelper.query((String)"pc.userdef.UserDefineClassSpec", (QuerySchema)schema);
                if (CollectionUtils.isEmpty((Collection)mapList) || (type = ((Map)mapList.get(0)).get("type")) == null) continue;
                if ("ReferArchive".equalsIgnoreCase(type.toString()) || "CustArchive".equalsIgnoreCase(type.toString())) {
                    if ("ReferArchive".equalsIgnoreCase(type.toString()) && sum.getSpecBusinessDynamic().booleanValue()) {
                        throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SPE_VALUE_IS_SET_BY_BUSINESS_DYNAMIC_GENERATE, (Object[])sum.get("specification_showItem"));
                    }
                    ProductTplSpec spec = new ProductTplSpec();
                    spec.setId((Object)IdManager.getInstance().nextId());
                    spec.setTemplate((Long)tpl.getId());
                    spec.setSpecification(sum.getSpecification());
                    spec.set("specification_showItem", sum.get("specification_showItem"));
                    spec.setSpecitem(null);
                    if (null == sum.getOrder()) {
                        sum.setOrder(Integer.valueOf(0));
                    }
                    spec.setOrder(sum.getOrder());
                    spec.setEntityStatus(EntityStatus.Insert);
                    spec.setTwoDimensionalInput(sum.getTwoDimensionalInput());
                    spec.setSpecBusinessDynamic(sum.getSpecBusinessDynamic());
                    specReferCommits.add(spec);
                    continue;
                }
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SPE_VALUE_NOT_FOUND, (Object[])sum.get("specification_showItem"));
            }
        }
        List<Long> propDefItems = this.getUserdefItems("productSpec");
        List disabledItems = specCommits.stream().filter(p -> !propDefItems.contains(p.getSpecification())).map(p -> p.get("specification_showItem").toString()).distinct().collect(Collectors.toList());
        if (disabledItems.size() > 0) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800130, new Object[]{String.join((CharSequence)"\u3001", disabledItems)});
        }
        ArrayList specDbs = new ArrayList();
        if (status == EntityStatus.Update) {
            QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"template").eq(tpl.getId())});
            QuerySchema schema = QuerySchema.create().addSelect(new String[]{"id", "template", "specification", "specification.defineId", "specification.showItem", "specitem"}).addCondition((ConditionExpression)condition);
            MetaDaoHelper.query((String)"pc.tpl.ProductTplSpec", (QuerySchema)schema).forEach(m -> specDbs.add((ProductTplSpec)Objectlizer.convert((Map)m, (String)"pc.tpl.ProductTplSpec")));
        }
        specCommits.stream().forEach(sc -> {
            Optional<ProductTplSpec> opt = specDbs.stream().filter(s -> sc.getSpecification().equals(s.getSpecification()) && sc.getSpecitem().equalsIgnoreCase(s.getSpecitem())).findAny();
            if (opt.isPresent()) {
                sc.setId(opt.get().getId());
                sc.setEntityStatus(EntityStatus.Update);
                opt.get().setEntityStatus(EntityStatus.Update);
            }
        });
        specReferCommits.stream().forEach(sc -> {
            Optional<ProductTplSpec> opt = specDbs.stream().filter(s -> sc.getSpecification().equals(s.getSpecification()) && sc.get("specification_showItem").equals(s.get("specification_showItem"))).findAny();
            if (opt.isPresent()) {
                sc.setId(opt.get().getId());
                sc.setEntityStatus(EntityStatus.Update);
                opt.get().setEntityStatus(EntityStatus.Update);
            }
        });
        List deletedItems = specDbs.stream().filter(s -> {
            boolean isUpdate;
            boolean bl = isUpdate = s.getEntityStatus() == EntityStatus.Update;
            if (!tpl.containsKey((Object)"increment") && !isUpdate) {
                s.setEntityStatus(EntityStatus.Delete);
                return true;
            }
            return false;
        }).collect(Collectors.toList());
        List productSkus = null;
        ArrayList<Long> products = null;
        QuerySchema schema = QuerySchema.create().addSelect("productId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId.productTemplate").eq(tpl.getId())}));
        productSkus = MetaDaoHelper.query((String)"pc.product.ProductSKU", (QuerySchema)schema);
        if (productSkus != null && productSkus.size() > 0) {
            products = new ArrayList<Long>();
            for (Object map : productSkus) {
                Long l = (Long)map.get("productId");
                if (products.contains(l)) continue;
                products.add(l);
            }
        }
        if (products != null && products.size() > 0) {
            HashMap<Long, String> newScs = new HashMap<Long, String>();
            for (ProductTplSpec productTplSpec : specCommits) {
                if (productTplSpec.getEntityStatus() != EntityStatus.Insert || newScs.containsKey(productTplSpec.getSpecification()) || specDbs.stream().filter(scdb -> scdb.getSpecification().equals(spec.getSpecification())).count() != 0L) continue;
                newScs.put(productTplSpec.getSpecification(), (String)productTplSpec.get("specification_showItem"));
            }
            if (newScs.size() > 0) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_TEMPLATE_SKU_IS_EXIST_CANNOT_ADD_SPEC, new Object[]{products.size(), StringUtils.join((Object[])newScs.values().toArray(), (String)",")});
            }
        }
        for (ProductTplSpec spec : deletedItems) {
            List prods;
            UserDefineClassSpec convert;
            if (spec.get("specification_defineId") == null) continue;
            if (specCommits.stream().filter(sp -> sp.getSpecification().equals(spec.getSpecification())).count() == 0L) {
                if (products == null || products.size() <= 0) continue;
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SPEC_IS_EXIST_IN_SKU_CANNOT_DELETE, new Object[]{spec.get("specification_showItem"), products.size()});
            }
            QuerySchema querySchema = QuerySchema.create().addSelect(new String[]{"id", "isShowSpec"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)spec.getSpecification())}));
            List query = MetaDaoHelper.query((String)"pc.userdef.UserDefineClassSpec", (QuerySchema)querySchema);
            if (query == null || query.size() <= 0 || !((convert = (UserDefineClassSpec)Objectlizer.convert((Map)((Map)query.get(0)), (String)"pc.userdef.UserDefineClassSpec")).getIsShowSpec() == false ? (prods = this.tplDao.getProductsWithSkuAttr((Long)tpl.getId(), spec.getSpecification(), (Object)spec.getSpecitem(), (String)AppContext.getYTenantId())) != null && prods.size() > 0 : (prods = this.tplDao.getProductsWithSku((Long)tpl.getId(), spec.get("specification_defineId"), (Object)spec.getSpecitem(), (String)AppContext.getYTenantId())) != null && prods.size() > 0)) continue;
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SPEC_VALUE_IS_EXIST_IN_SKU_CANNOT_DELETE, new Object[]{spec.get("specification_showItem"), spec.getSpecitem(), products.size()});
        }
        specCommits.addAll(deletedItems);
        tpl.remove("SpecSums");
        specCommits.addAll(specReferCommits);
        tpl.setSpecs(specCommits);
    }

    private void checkUnit(ProductTpl tpl) {
        List units = tpl.Units();
        ArrayList<String> errs = new ArrayList<String>();
        if (units != null && units.size() > 0) {
            ProductTplUnit unit = (ProductTplUnit)units.get(0);
            if (unit.getPurchaseUnit() != null) {
                if (unit.getPurchaseRate() == null) {
                    errs.add(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080C22", (String)"\u91c7\u8d2d\u5355\u4f4d\u6362\u7b97\u7387"));
                }
            } else {
                unit.setPurchaseRate(null);
            }
            if (unit.getStockUnit() != null) {
                if (unit.getStockRate() == null) {
                    errs.add(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080C28", (String)"\u5e93\u5b58\u5355\u4f4d\u6362\u7b97\u7387"));
                }
            } else {
                unit.setStockRate(null);
            }
            if (unit.getBatchUnit() != null) {
                if (unit.getBatchRate() == null) {
                    errs.add(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080C2A", (String)"\u6279\u53d1\u5355\u4f4d\u6362\u7b97\u7387"));
                }
            } else {
                unit.setBatchRate(null);
            }
            if (unit.getOfflineUnit() != null) {
                if (unit.getOfflineRate() == null) {
                    errs.add(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080C30", (String)"\u7ebf\u4e0b\u96f6\u552e\u5355\u4f4d\u6362\u7b97\u7387"));
                }
            } else {
                unit.setOfflineRate(null);
            }
            if (unit.getOnlineUnit() != null) {
                if (unit.getOnlineRate() == null) {
                    errs.add(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080C35", (String)"\u7ebf\u4e0a\u96f6\u552e\u5355\u4f4d\u6362\u7b97\u7387"));
                }
            } else {
                unit.setOnlineRate(null);
            }
            if (unit.getRequireUnit() != null) {
                if (unit.getRequireRate() == null) {
                    errs.add(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080C38", (String)"\u8981\u8d27\u5355\u4f4d\u6362\u7b97\u7387"));
                }
            } else {
                unit.setRequireRate(null);
            }
        }
        if (errs.size() > 0) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800131, new Object[]{StringUtils.join((Object[])new String[]{"\u3001"})});
        }
    }

    private List<Long> getUserdefItems(String classId) throws Exception {
        QuerySchema schema = QuerySchema.create().addSelect("id").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"isEnabled").eq((Object)true), QueryCondition.name((String)"classId").eq((Object)classId)});
        List data = MetaDaoHelper.query((String)"pc.userdef.UserDefineClass", (QuerySchema)schema);
        return data.stream().map(map -> (Long)map.get("id")).collect(Collectors.toList());
    }

    private void processAssistUnitExchanges(ProductTpl tpl) {
        List assistUnitExchanges = tpl.productTplAssistUnitExchanges();
        if (assistUnitExchanges != null) {
            int scale = (Integer)OptionUtils.getSysOptionByName((String)"conversionAccuracy") > 2 ? (Integer)OptionUtils.getSysOptionByName((String)"conversionAccuracy") : 2;
            for (ProductTplAssistUnitExchange assistUnit : assistUnitExchanges) {
                if (assistUnit.getMainUnitCountNew() == null && assistUnit.getMainUnitCount() != null) {
                    assistUnit.setMainUnitCountNew(assistUnit.getMainUnitCount());
                }
                if (Objects.isNull(assistUnit.getAssistUnit()) || Objects.isNull(assistUnit.getAssistUnitCount())) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_TEMPLATE_SUB_UNIT_CONVERT_NOT_EXITS);
                }
                String mainUnitCount = assistUnit.getMainUnitCountNew().toString();
                String assistUnitCount = assistUnit.getAssistUnitCount().toString();
                BigDecimal mUnitCount = new BigDecimal(mainUnitCount, MathContext.DECIMAL64);
                BigDecimal aUnitCount = new BigDecimal(assistUnitCount, MathContext.DECIMAL64);
                if (aUnitCount.compareTo(BigDecimal.ZERO) <= 0 || mUnitCount.compareTo(BigDecimal.ZERO) <= 0) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MAINUNITCOUNT_ASSISTUNITCOUNT_NOT_BE_ZERO);
                }
                mainUnitCount = mUnitCount.stripTrailingZeros().toPlainString();
                assistUnitCount = aUnitCount.stripTrailingZeros().toPlainString();
                BigDecimal mainUnitRate = mUnitCount.divide(aUnitCount, scale, 4);
                if (mainUnitRate.compareTo(BigDecimal.ZERO) <= 0) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_CONVERT_RATE_IS_ZERO);
                }
                String assistVersValue = mainUnitCount + "/" + assistUnitCount;
                assistUnit.setMainUnitCount(mainUnitRate);
                assistUnit.setMainUnitRate(mainUnitRate);
                assistUnit.setAssistVersValue(assistVersValue);
            }
        }
    }
}


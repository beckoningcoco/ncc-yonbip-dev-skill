/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.alibaba.fastjson.JSONObject
 *  com.yonyou.cloud.middleware.rpc.RPCStubBeanFactory
 *  com.yonyou.diwork.ott.exexutors.RobotExecutors
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants
 *  com.yonyou.iuap.apdoc.coredoc.dao.material.MaterialQryDao
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.po.material.MaterialPO
 *  com.yonyou.iuap.apdoc.sdk.service.event.IMaterialTplNotifyEvent
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.iuap.yms.common.utils.JacksonUtils
 *  com.yonyou.iuap.yms.http.YmsHttpClient
 *  com.yonyou.iuap.yms.http.YmsHttpHeader
 *  com.yonyou.iuap.yms.http.YmsHttpMethod
 *  com.yonyou.iuap.yms.http.YmsHttpRequest
 *  com.yonyou.iuap.yms.http.YmsHttpRequestBuilder
 *  com.yonyou.iuap.yms.http.YmsHttpResponse
 *  com.yonyou.ucf.MaterialCharacterDTO
 *  com.yonyou.ucf.MaterialCharacteristicsDTO
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.i18n.utils.MddMultilingualUtil
 *  com.yonyou.ucf.mdd.ext.util.ResultMessage
 *  com.yonyou.ucf.userdef.api.IProductCharacteristicService
 *  com.yonyou.ucf.userdef.dto.enums.CharacteristicsTypeEnum
 *  com.yonyoucloud.iuap.upc.api.IProductRefCheckService
 *  com.yonyoucloud.iuap.upc.dto.ProductSeneitiveDTO
 *  com.yonyoucloud.iuap.upc.dto.SensitiveRefCheckResponseDTO
 *  com.yonyoucloud.upc.data.tpl.ProductTplDao
 *  com.yonyoucloud.upc.pc.product.ProductSensitiveRefCheckConfig
 *  com.yonyoucloud.upc.pc.product.SensitiveEnum
 *  com.yonyoucloud.upc.pc.product.UnitUseTypeEnum
 *  com.yonyoucloud.upc.pc.tpl.ProductTpl
 *  com.yonyoucloud.upc.pc.tpl.ProductTplCharacter
 *  com.yonyoucloud.upc.pc.tpl.ProductTplExtendPropertySum
 *  com.yonyoucloud.upc.pc.userdef.UserDefClassEnum
 *  org.apache.commons.lang3.ObjectUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.datarule;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yonyou.cloud.middleware.rpc.RPCStubBeanFactory;
import com.yonyou.diwork.ott.exexutors.RobotExecutors;
import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants;
import com.yonyou.iuap.apdoc.coredoc.dao.material.MaterialQryDao;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.po.material.MaterialPO;
import com.yonyou.iuap.apdoc.sdk.service.event.IMaterialTplNotifyEvent;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.iuap.yms.common.utils.JacksonUtils;
import com.yonyou.iuap.yms.http.YmsHttpClient;
import com.yonyou.iuap.yms.http.YmsHttpHeader;
import com.yonyou.iuap.yms.http.YmsHttpMethod;
import com.yonyou.iuap.yms.http.YmsHttpRequest;
import com.yonyou.iuap.yms.http.YmsHttpRequestBuilder;
import com.yonyou.iuap.yms.http.YmsHttpResponse;
import com.yonyou.ucf.MaterialCharacterDTO;
import com.yonyou.ucf.MaterialCharacteristicsDTO;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.i18n.utils.MddMultilingualUtil;
import com.yonyou.ucf.mdd.ext.util.ResultMessage;
import com.yonyou.ucf.userdef.api.IProductCharacteristicService;
import com.yonyou.ucf.userdef.dto.enums.CharacteristicsTypeEnum;
import com.yonyoucloud.iuap.upc.api.IProductRefCheckService;
import com.yonyoucloud.iuap.upc.dto.ProductSeneitiveDTO;
import com.yonyoucloud.iuap.upc.dto.SensitiveRefCheckResponseDTO;
import com.yonyoucloud.upc.data.tpl.ProductTplDao;
import com.yonyoucloud.upc.pc.product.ProductSensitiveRefCheckConfig;
import com.yonyoucloud.upc.pc.product.SensitiveEnum;
import com.yonyoucloud.upc.pc.product.UnitUseTypeEnum;
import com.yonyoucloud.upc.pc.tpl.ProductTpl;
import com.yonyoucloud.upc.pc.tpl.ProductTplCharacter;
import com.yonyoucloud.upc.pc.tpl.ProductTplExtendPropertySum;
import com.yonyoucloud.upc.pc.userdef.UserDefClassEnum;
import com.yonyoucloud.upc.service.UPCBillService;
import com.yonyoucloud.upc.service.utils.ProductUtil;
import java.io.Serializable;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.stream.Collectors;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class ProductTplService {
    private static final Logger log = LoggerFactory.getLogger(ProductTplService.class);
    private static final String SERVICE_PROVIDER_ID = "c87e2267-1001-4c70-bb2a-ab41f3b81aa3";
    @Autowired
    private ProductTplDao tplDao;
    @Autowired
    private UPCBillService billService;
    @Autowired
    @Qualifier(value="coredocYmsHttpClient")
    private YmsHttpClient ymsHttpClient;
    @Autowired
    private YMSParamConfig ymsParamConfig;
    @Autowired
    private MaterialQryDao materialQryDao;
    @Autowired
    @Qualifier(value="ymsLongTaskExecutorService")
    private ExecutorService ymsLongTaskExecutorService;
    @Autowired
    private IProductCharacteristicService productCharacteristicService;

    public Object checkReference(BillDataDto billDataDto) throws Exception {
        String[] vals;
        HashMap<String, Boolean> items;
        List propItems;
        String defineId;
        Map detail = this.billService.detail(billDataDto);
        if (detail == null) {
            return null;
        }
        ProductTpl tpl = new ProductTpl();
        tpl.init(detail);
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("id", tpl.getId());
        QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productTemplate").eq(tpl.getId())}));
        List products = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)schema);
        map.put("products", products.size());
        List<Map<String, Object>> productsUseTemplateUnits = this.getProductsUseTempleteUnit(tpl.getId().toString());
        map.put("productsUseTemplateUnits", productsUseTemplateUnits != null ? productsUseTemplateUnits.size() : 0);
        if (products.size() == 0) {
            return map;
        }
        ArrayList pids = new ArrayList();
        products.forEach(p -> pids.add((Long)p.get("id")));
        if (tpl.SpecSums() != null) {
            schema = QuerySchema.create().distinct().addSelect(new String[]{"iSpecId", "specValue"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").in(pids)}));
            List specItems = MetaDaoHelper.query((String)"pc.product.ProductSpecItem", (QuerySchema)schema);
            HashMap specUses = new HashMap();
            tpl.SpecSums().forEach(spec -> {
                String[] vals;
                HashMap<String, Boolean> items = new HashMap<String, Boolean>();
                for (String val : vals = spec.getSpecitem().split("; ")) {
                    items.put(val, specItems.stream().anyMatch(item -> spec.getSpecification().equals(Long.parseLong(item.get("iSpecId").toString())) && val.equals((String)item.get("specValue"))));
                }
                specUses.put(spec.getSpecification(), items);
            });
            map.put("SpecSums", specUses);
        }
        if (tpl.PropertySums() != null) {
            HashMap<Long, Serializable> propertyUses = new HashMap<Long, Serializable>();
            for (ProductTplExtendPropertySum prop : tpl.PropertySums()) {
                defineId = this.tplDao.getDefineFldName(prop.get("propertyType_defineId"), (String)AppContext.getYTenantId());
                schema = QuerySchema.create().distinct().addSelect(defineId).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").in(pids), QueryCondition.name((String)defineId).is_not_null()}));
                propItems = MetaDaoHelper.query((String)"pc.product.ProductDefine", (QuerySchema)schema);
                if (StringUtils.isEmpty((CharSequence)prop.getValues())) {
                    propertyUses.put(prop.getPropertyType(), Boolean.valueOf(propItems.size() > 0));
                    continue;
                }
                items = new HashMap();
                for (String val : vals = prop.getValues().split("; ")) {
                    items.put(val, propItems.stream().anyMatch(item -> val.equals((String)item.get(defineId))));
                }
                propertyUses.put(prop.getPropertyType(), items);
            }
            map.put("PropertySums", propertyUses);
        }
        if (tpl.SKUPropertySums() != null) {
            HashMap<Long, Serializable> skuUses = new HashMap<Long, Serializable>();
            for (ProductTplExtendPropertySum prop : tpl.SKUPropertySums()) {
                defineId = this.tplDao.getskuDefineFldName(prop.get("propertyType_defineId"), (String)AppContext.getYTenantId());
                schema = QuerySchema.create().distinct().addSelect(defineId).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)defineId).is_not_null()}));
                propItems = MetaDaoHelper.query((String)"pc.product.ProductSKUDefine", (QuerySchema)schema);
                if (StringUtils.isEmpty((CharSequence)prop.getValues())) {
                    skuUses.put(prop.getPropertyType(), Boolean.valueOf(propItems.size() > 0));
                    continue;
                }
                items = new HashMap<String, Boolean>();
                for (String val : vals = prop.getValues().split("; ")) {
                    items.put(val, propItems.stream().anyMatch(item -> val.equals((String)item.get(defineId))));
                }
                skuUses.put(prop.getPropertyType(), items);
            }
            map.put("SKUPropertySums", skuUses);
        }
        if (tpl.OrderPropertySums() != null) {
            HashMap<Long, Boolean> orderUses = new HashMap<Long, Boolean>();
            for (ProductTplExtendPropertySum prop : tpl.OrderPropertySums()) {
                Long propertyType = (Long)prop.get("id");
                schema = QuerySchema.create().distinct().addSelect("skuPropertyTypeId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"skuPropertyTypeId").eq((Object)propertyType), QueryCondition.name((String)"isCreator").eq((Object)true)}));
                propItems = MetaDaoHelper.query((String)"pc.product.ProductSkuOrderProperty", (QuerySchema)schema);
                orderUses.put((Long)prop.getId(), propItems.size() > 0);
            }
            map.put("OrderPropertySums", orderUses);
        }
        return map;
    }

    public Map getTemplateData(Long id) throws Exception {
        Map data = null;
        QuerySchema schema = QuerySchema.create().addSelect("*,nameSpacer,deliveryType.dt_name,freeCT,freeCT.code as freeCTCode,optionCT,optionCT.code as optionCTCode,materialPropCT,materialPropCT.code as materialPropCTCode,skuPropCT,skuPropCT.code as skuPropCTCode").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)id)});
        schema.addCompositionSchema(QuerySchema.create().name("Brands").fullname("pc.tpl.ProductTplBrand").addSelect("brand,brand.name,brand.code,id"));
        schema.addCompositionSchema(QuerySchema.create().name("Parameters").fullname("pc.tpl.ProductTplParameter").addSelect("*"));
        schema.addCompositionSchema(QuerySchema.create().name("Units").fullname("pc.tpl.ProductTplUnit").addSelect("*,unit.name as unit_Name,batchPriceUnit.name as batchPriceUnit_Name,batchUnit.name as batchUnit_Name,offlineUnit.name as offlineUnit_Name,onlineUnit.name as onlineUnit_Name,purchaseUnit.name as purchaseUnit_Name,requireUnit.name as requireUnit_Name,stockUnit.name as stockUnit_Name, produceUnit.name as produceUnit_Name, purchasePriceUnit.name as purchasePriceUnit_Name,inspectionUnit.name as inspectionUnit_Name, demandPlanningUnit.name as demandPlanningUnit_Name"));
        QuerySchema orderPropQuery = QuerySchema.create().name("OrderProperties").fullname("pc.tpl.ProductTplOrderProperty").addSelect("*,propertyType.defineId,propertyType.defineIdOther,propertyType.showItem,propertyType.type,propertyType.userdefMode,propertyType.maxInputLen,propertyType.decimalDigits").addOrderBy("order");
        orderPropQuery.addCompositionSchema(QuerySchema.create().name("valueItems").fullname("pc.tpl.ProductTplOrderPropertyValue").addSelect("*").addPager(1, UPCConstants.USERDEF_PAGE_SIZE.intValue()));
        schema.addCompositionSchema(orderPropQuery);
        schema.addCompositionSchema(QuerySchema.create().name("CycleProperties").fullname("pc.tpl.ProductTplCycleProperty").addSelect("*,propertyType.name"));
        schema.addCompositionSchema(QuerySchema.create().name("productTplAssistUnitExchanges").fullname("pc.tpl.ProductTplAssistUnitExchange").addSelect("unitExchangeType,assistUnitCount,iOrder,assistUnit,id,template,assistUnit.name as assistUnit_Name,mainUnitCountNew as mainUnitCount,mainUnitCountNew as mainUnitCountNew,balance as balance"));
        schema.addCompositionSchema(QuerySchema.create().name("freeCharacters").fullname("pc.tpl.ProductTplCharacter").addSelect("*, id, template, characteristicsType, characteristics, characteristics.name as characteristics_name,characteristics.code as characteristics_code, character, characterCode, character.name as character_name, twoDimensionalInput, iOrder, skuSens, batchSens, SNSens, stockSens, costAffec, BOMAffec, manuAffec,priceAffec,dataType,webShow, dataType"));
        List list = MetaDaoHelper.query((String)"pc.tpl.ProductTpl", (boolean)true, (QuerySchema)schema, null);
        if (!CollectionUtils.isEmpty((Collection)list)) {
            List freeCharacters;
            boolean status;
            data = (Map)list.get(0);
            Object stopstatus = data.get("stopstatus");
            data.put("stopstatus", 1);
            if (stopstatus != null && !(status = ((Boolean)stopstatus).booleanValue())) {
                data.put("stopstatus", 0);
            }
            if (data.containsKey("OrderProperties")) {
                List props = (List)data.get("OrderProperties");
                this.dealValues(props);
                data.put("OrderPropertySums", props);
                data.remove("OrderProperties");
            }
            if (data.containsKey("freeCharacters") && !CollectionUtils.isEmpty((Collection)(freeCharacters = (List)data.get("freeCharacters")))) {
                List fcharacters = freeCharacters.stream().filter(v -> v.get("characteristicsType") != null && 3L == (Long)v.get("characteristicsType")).collect(Collectors.toList());
                data.put("freeCharacters", fcharacters);
                List ocharacters = freeCharacters.stream().filter(v -> v.get("characteristicsType") != null && 4L == (Long)v.get("characteristicsType")).collect(Collectors.toList());
                data.put("optionCharacters", ocharacters);
                List pcharacters = freeCharacters.stream().filter(v -> v.get("characteristicsType") != null && 1L == (Long)v.get("characteristicsType")).collect(Collectors.toList());
                data.put("productPropCharacters", pcharacters);
                List scharacters = freeCharacters.stream().filter(v -> v.get("characteristicsType") != null && 2L == (Long)v.get("characteristicsType")).collect(Collectors.toList());
                data.put("skuCharacters", scharacters);
            }
            if (data.containsKey("materialPropCT") || data.containsKey("freeCT") || data.containsKey("skuPropCT") || data.containsKey("optionCT")) {
                MaterialCharacteristicsDTO dto = this.buildMaterialCharacteristicsDTO(data);
                List characteristicsForProduct = this.productCharacteristicService.getCharacteristicsForProduct(dto);
                data.put("characteristics", characteristicsForProduct);
            }
        }
        if (data != null && data.get("nameSpacer") != null) {
            data.put("nameSpacer", ProductUtil.convertNameSpacer(data.get("nameSpacer").toString()));
        }
        return data;
    }

    private MaterialCharacteristicsDTO buildMaterialCharacteristicsDTO(Map data) {
        if (data != null && data.get("id") != null) {
            List tplCharacterList;
            MaterialCharacteristicsDTO materialCharacteristicsDTO = new MaterialCharacteristicsDTO(Long.valueOf(Long.parseLong(data.get("id").toString())));
            if (data.get("productPropCharacters") != null) {
                tplCharacterList = JacksonUtils.parseArray((String)JacksonUtils.toJSONString(data.get("productPropCharacters")), ProductTplCharacter.class);
                materialCharacteristicsDTO.setMaterialPropCharacter(this.buildMaterialCharacterDTOList(CharacteristicsTypeEnum.IMaterialPropCT, tplCharacterList));
            }
            if (data.get("skuCharacters") != null) {
                tplCharacterList = JacksonUtils.parseArray((String)JacksonUtils.toJSONString(data.get("skuCharacters")), ProductTplCharacter.class);
                materialCharacteristicsDTO.setSkuPropCharacter(this.buildMaterialCharacterDTOList(CharacteristicsTypeEnum.ISkuPropCT, tplCharacterList));
            }
            if (data.get("freeCharacters") != null) {
                tplCharacterList = JacksonUtils.parseArray((String)JacksonUtils.toJSONString(data.get("freeCharacters")), ProductTplCharacter.class);
                materialCharacteristicsDTO.setSkuFreeCharacter(this.buildMaterialCharacterDTOList(CharacteristicsTypeEnum.IFreeCT, tplCharacterList));
            }
            if (data.get("optionCharacters") != null) {
                tplCharacterList = JacksonUtils.parseArray((String)JacksonUtils.toJSONString(data.get("optionCharacters")), ProductTplCharacter.class);
                materialCharacteristicsDTO.setOptionCharacter(this.buildMaterialCharacterDTOList(CharacteristicsTypeEnum.IOptionCT, tplCharacterList));
            }
            return materialCharacteristicsDTO;
        }
        return null;
    }

    private List<MaterialCharacterDTO> buildMaterialCharacterDTOList(CharacteristicsTypeEnum characteristicsType, List<ProductTplCharacter> tplCharacterList) {
        ArrayList<MaterialCharacterDTO> materialCharacterDTOList = new ArrayList<MaterialCharacterDTO>();
        if (!CollectionUtils.isEmpty(tplCharacterList)) {
            for (ProductTplCharacter tplCharacter : tplCharacterList) {
                if (tplCharacter.getCharacteristics() == null || tplCharacter.getCharacter() == null || tplCharacter.getCharacterCode() == null) continue;
                MaterialCharacterDTO materialCharacterDTO = new MaterialCharacterDTO(characteristicsType.getValue(), tplCharacter.getCharacteristics(), tplCharacter.getCharacter(), tplCharacter.getCharacterCode());
                materialCharacterDTO.setOrder(tplCharacter.getIOrder().intValue());
                materialCharacterDTOList.add(materialCharacterDTO);
            }
        }
        return materialCharacterDTOList;
    }

    public List<Map> getCharacteristics(Map<String, Object> param) {
        List list;
        block9: {
            HashMap<String, String> headers = new HashMap<String, String>();
            headers.put("Content-Type", "application/json");
            headers.put("yht_access_token", InvocationInfoProxy.getYhtAccessToken());
            String characterDomainUrl = this.ymsParamConfig.getDomainIuapMetadataExtend();
            String characterUrl = characterDomainUrl + "/character/api/getCharacteristics";
            YmsHttpHeader ymsHttpHeader = new YmsHttpHeader();
            ymsHttpHeader.add("Content-Type", "application/json;charset=utf-8");
            YmsHttpRequest request = new YmsHttpRequestBuilder().url(characterUrl).method(YmsHttpMethod.POST).body((Object)JSON.toJSONString(param)).addHeader(ymsHttpHeader.addAllMap(headers)).build();
            YmsHttpResponse ymsHttpResponse = this.ymsHttpClient.execute(request);
            try {
                String result = ymsHttpResponse.getBodyString();
                Map map = (Map)JSONObject.parseObject((String)result, Map.class);
                Object status = map.get("code");
                if (status == null || !"200".equals(status.toString())) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_TPL_CHARACTER_ERROR);
                }
                Object data = map.get("data");
                List characteristicsDetail = JSONObject.parseArray((String)JSON.toJSONString(data), Map.class);
                list = characteristicsDetail;
                if (ymsHttpResponse == null) break block9;
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
                    log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080942", (String)"\u8c03\u7528\u7279\u5f81\u670d\u52a1\uff0c\u83b7\u53d6\u7279\u5f81\u7ec4\u7ed3\u6784\u4fe1\u606f\u5931\u8d25") + e.getMessage(), (Throwable)e);
                    return new ArrayList<Map>();
                }
            }
            ymsHttpResponse.close();
        }
        return list;
    }

    private String dealvaluesOrder(long userdefid, List<String> vals) throws Exception {
        QuerySchema schema = QuerySchema.create().addSelect("*");
        schema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"userdefid").eq((Object)userdefid)});
        schema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"name").in(vals)});
        schema.addOrderBy("orderNum");
        List list = MetaDaoHelper.query((String)"pc.userdef.Userdefine", (QuerySchema)schema);
        List orderVals = list.stream().map(map -> map.get("name").toString()).collect(Collectors.toList());
        return String.join((CharSequence)"; ", orderVals);
    }

    private void dealValues(List<Map> props) {
        for (Map prop : props) {
            if (!prop.containsKey("valueItems")) continue;
            List vals = (List)prop.get("valueItems");
            if (vals != null) {
                prop.put("values", String.join((CharSequence)"; ", vals.stream().map(map -> (String)map.get("value")).collect(Collectors.toList())));
            }
            prop.remove("valueItems");
        }
    }

    public Object ckeckUserdefRefer(BillDataDto bill) throws Exception {
        HashMap<String, Integer> resultMap = new HashMap<String, Integer>();
        resultMap.put("deleteFlag", 1);
        Map data = null;
        if (bill.getData() != null) {
            data = (Map)bill.getData();
        }
        if (UserDefClassEnum.PRODUCTSPEC.getBillnum().equals(bill.getBillnum()) && data != null) {
            QuerySchema schema;
            List producttpls;
            Object userdefid = data.get("userdefid");
            Object name = data.get("name");
            if (userdefid != null && name != null && (producttpls = MetaDaoHelper.query((String)"pc.tpl.ProductTplSpec", (QuerySchema)(schema = QuerySchema.create().addSelect(" * ").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"specification").eq(userdefid), QueryCondition.name((String)"specitem").eq(name)}))))) != null && producttpls.size() > 0) {
                resultMap.put("deleteFlag", 0);
            }
        }
        return resultMap;
    }

    public Object beforeStopUserdefine(BillDataDto bill) throws Exception {
        String MAPPER = "com.yonyoucloud.upc.data.goodsPosition.";
        int res = 0;
        HashMap userdefine = (HashMap)bill.getData();
        Long userdefId = Long.parseLong(userdefine.get("id").toString());
        String name = userdefine.get("name").toString();
        HashMap<String, Object> param = new HashMap<String, Object>();
        param.put("ytenant_id", AppContext.getYTenantId());
        param.put("id", userdefId);
        param.put("name", name);
        List list = SqlHelper.selectList((String)(MAPPER + "userdefineIsUsed"), param);
        if (list != null && list.size() > 0) {
            res = 1;
        }
        return res;
    }

    public boolean isSkuSens(long tplId) throws Exception {
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"template").in(new Object[]{tplId}), QueryCondition.name((String)"skuSens").eq((Object)1)});
        QuerySchema schema = QuerySchema.create().addSelect("1").addCondition((ConditionExpression)queryConditionGroup);
        List characters = MetaDaoHelper.query((String)"pc.tpl.ProductTplCharacter", (QuerySchema)schema);
        return !CollectionUtils.isEmpty((Collection)characters);
    }

    public ResultMessage sensitiveRefCheck(Long tempId, String checkField) throws Exception {
        List refConfigList;
        if (SensitiveEnum.find((String)checkField) != null && !CollectionUtils.isEmpty((Collection)(refConfigList = ProductSensitiveRefCheckConfig.findRefConfigList((String)checkField)))) {
            QueryConditionGroup conditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productTemplate").eq((Object)tempId)});
            QuerySchema schema = QuerySchema.create().addSelect("id,code").addCondition((ConditionExpression)conditionGroup);
            List productMapList = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)schema);
            ArrayList<ProductSeneitiveDTO> productSeneitiveDTOS = new ArrayList<ProductSeneitiveDTO>();
            for (Map productMap : productMapList) {
                productSeneitiveDTOS.add(new ProductSeneitiveDTO((Long)productMap.get("id"), (String)productMap.get("code")));
            }
            if (!CollectionUtils.isEmpty(productSeneitiveDTOS)) {
                for (ProductSensitiveRefCheckConfig refCheckConfig : refConfigList) {
                    SensitiveRefCheckResponseDTO responseDTO = this.productSensitiveRefCheck(refCheckConfig.getDomain(), refCheckConfig.getSensitive(), productSeneitiveDTOS);
                    if (!"999".equals(responseDTO.getCode().toString())) continue;
                    return new ResultMessage(responseDTO.getCode(), responseDTO.getMessage(), (Object)responseDTO.getDesc());
                }
            }
        }
        return new ResultMessage((Number)200, MddMultilingualUtil.getFWMessage((String)"P_YS_FW-PUB_MDD-BACK_0001065413", (String)InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080941", (String)"\u64cd\u4f5c\u6210\u529f")), null);
    }

    public void cancelSensitive(Long tempId, String checkField, List<String> characterCodes) throws Exception {
        List sensitiveCancelConfigList;
        if (tempId != null && ObjectUtils.isNotEmpty(characterCodes) && !CollectionUtils.isEmpty((Collection)(sensitiveCancelConfigList = ProductSensitiveRefCheckConfig.findCancelConfigList((String)checkField)))) {
            ArrayList<Long> productIds = new ArrayList<Long>();
            List materialPOS = this.materialQryDao.queryByTplId(Arrays.asList(tempId), null);
            if (ObjectUtils.isNotEmpty((Object)materialPOS)) {
                for (MaterialPO materialPO : materialPOS) {
                    productIds.add(materialPO.getId());
                }
            }
            if (!CollectionUtils.isEmpty(productIds)) {
                RobotExecutors.runAs((String)((String)AppContext.getYTenantId()), () -> {
                    for (ProductSensitiveRefCheckConfig config : sensitiveCancelConfigList) {
                        this.productSensitiveCancelEvent(config.getDomain(), config.getSensitive(), productIds, characterCodes);
                    }
                }, (ExecutorService)this.ymsLongTaskExecutorService);
            }
        }
    }

    private void productSensitiveCancelEvent(String domain, String sensitive, List<Long> productIds, List<String> characterCodes) {
        try {
            if (SensitiveEnum.BATCHSENS.getCode().equals(sensitive)) {
                RPCStubBeanFactory rpChainBeanFactory = new RPCStubBeanFactory(domain, SERVICE_PROVIDER_ID, "", IMaterialTplNotifyEvent.class);
                rpChainBeanFactory.afterPropertiesSet();
                IMaterialTplNotifyEvent materialTplNotifyEvent = (IMaterialTplNotifyEvent)rpChainBeanFactory.getObject();
                materialTplNotifyEvent.cancelBatchSensitiveEvent(productIds, characterCodes);
            }
        }
        catch (Exception e) {
            log.error(MessageFormat.format("\u53d6\u6d88\u654f\u611f\u6027\uff08{0}\uff09\uff0c\u8c03\u7528\u9886\u57df\uff08{1}\uff09\u6e05\u7406\u6570\u636e\u63a5\u53e3\u5931\u8d25", sensitive, domain) + e.getMessage(), (Throwable)e);
        }
    }

    private SensitiveRefCheckResponseDTO productSensitiveRefCheck(String domain, String sensitive, List<ProductSeneitiveDTO> productSeneitiveDTOS) throws Exception {
        try {
            RPCStubBeanFactory rpChainBeanFactory = new RPCStubBeanFactory(domain, SERVICE_PROVIDER_ID, "", IProductRefCheckService.class);
            rpChainBeanFactory.afterPropertiesSet();
            IProductRefCheckService productRefCheckService = (IProductRefCheckService)rpChainBeanFactory.getObject();
            return productRefCheckService.productSensitiveRefCheck(sensitive, productSeneitiveDTOS);
        }
        catch (Exception e) {
            log.error(String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080943", (String)"\u4fee\u6539\u654f\u611f\u6027\uff08 %s \uff09\uff0c\u8c03\u7528\u9886\u57df\uff08 %s \uff09\u5f15\u7528\u63a5\u53e3\u6821\u9a8c\u5931\u8d25"), sensitive, domain) + e.getMessage(), (Throwable)e);
            return SensitiveRefCheckResponseDTO.error((String)(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080944", (String)"\u8c03\u7528\u9886\u57df\uff08") + domain + InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080945", (String)"\uff09\u5f15\u7528\u63a5\u53e3\u6821\u9a8c\u5931\u8d25\uff0c\u5931\u8d25\u539f\u56e0\uff1a") + e));
        }
    }

    public List<Map<String, Object>> getProductsUseTempleteUnit(String tplID) throws Exception {
        QuerySchema schema = QuerySchema.create().addSelect("code").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"productTemplate").eq((Object)tplID), QueryCondition.name((String)"unitUseType").eq((Object)UnitUseTypeEnum.USE_TIMPLATE.getValue())});
        List productList = MetaDaoHelper.query((String)"pc.product.Product", (boolean)true, (QuerySchema)schema, null);
        return productList;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.alibaba.fastjson.JSONArray
 *  com.yonyou.iuap.apdoc.coredoc.batchmodify.extinterface.IPubBatchModifyEntityExtService
 *  com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants
 *  com.yonyou.iuap.apdoc.coredoc.dao.material.MaterialQryDao
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.material.service.ProductExportDataDealService
 *  com.yonyou.iuap.apdoc.coredoc.po.material.MaterialAssistClassPO
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.graphql.query.feature.QueryFeature
 *  com.yonyou.iuap.log.cons.BusinessLogMode
 *  com.yonyou.iuap.log.model.BusinessLogObjectBuilder
 *  com.yonyou.iuap.log.rpc.IBusiLogService
 *  com.yonyou.iuap.ml.vo.LanguageVO
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.iuap.ucf.common.ml.MultiLangContext
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dubbo.DubboReferenceUtils
 *  com.yonyou.ucf.userdef.api.ICharacterViewModelService
 *  com.yonyou.ucf.userdef.dto.CharacterDetailDto
 *  com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyEntitySaveDTO
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductAssistClass
 *  com.yonyoucloud.upc.pc.product.ProductExtend
 *  com.yonyoucloud.upc.pc.product.ProductLoadWay
 *  com.yonyoucloud.upc.pc.tpl.ProductTpl
 *  com.yonyoucloud.upc.utils.BizObjectUtils
 *  com.yonyoucloud.upc.utils.MultilangUtil
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.biz.base.Objectlizer
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.jetbrains.annotations.NotNull
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.batchModify.modifyExt;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.yonyou.iuap.apdoc.coredoc.batchmodify.extinterface.IPubBatchModifyEntityExtService;
import com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants;
import com.yonyou.iuap.apdoc.coredoc.dao.material.MaterialQryDao;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.material.service.ProductExportDataDealService;
import com.yonyou.iuap.apdoc.coredoc.po.material.MaterialAssistClassPO;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.graphql.query.feature.QueryFeature;
import com.yonyou.iuap.log.cons.BusinessLogMode;
import com.yonyou.iuap.log.model.BusinessLogObjectBuilder;
import com.yonyou.iuap.log.rpc.IBusiLogService;
import com.yonyou.iuap.ml.vo.LanguageVO;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.iuap.ucf.common.ml.MultiLangContext;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dubbo.DubboReferenceUtils;
import com.yonyou.ucf.userdef.api.ICharacterViewModelService;
import com.yonyou.ucf.userdef.dto.CharacterDetailDto;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.iuap.upc.api.service.IUPCProductUpdateService;
import com.yonyoucloud.upc.billrule.product.ProductBatchModifyCheckRule;
import com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyEntitySaveDTO;
import com.yonyoucloud.upc.datarule.ProductTplService;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductAssistClass;
import com.yonyoucloud.upc.pc.product.ProductExtend;
import com.yonyoucloud.upc.pc.product.ProductLoadWay;
import com.yonyoucloud.upc.pc.tpl.ProductTpl;
import com.yonyoucloud.upc.service.ProductApiDataService;
import com.yonyoucloud.upc.service.ProductCheckService;
import com.yonyoucloud.upc.service.batchModify.common.ModifyUtils;
import com.yonyoucloud.upc.service.batchModify.modifyExt.ProductDetailPubBatchModifyExtHandler;
import com.yonyoucloud.upc.service.utils.ProductUtil;
import com.yonyoucloud.upc.utils.BizObjectUtils;
import com.yonyoucloud.upc.utils.MultilangUtil;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.imeta.biz.base.Objectlizer;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class ProductPubBatchModifyExtHandler
implements IPubBatchModifyEntityExtService {
    private static final Logger log = LoggerFactory.getLogger(ProductPubBatchModifyExtHandler.class);
    @Autowired
    @Qualifier(value="pc.BillService")
    private IUPCBillService billService;
    @Autowired
    ProductApiDataService productApiDataService;
    @Autowired
    private MaterialQryDao materialQryDao;
    @Autowired
    ProductBatchModifyCheckRule productBatchModifyCheckRule;
    @Autowired
    ProductDetailPubBatchModifyExtHandler productDetailPubBatchModifyExtHandler;
    @Autowired
    ProductTplService productTplService;
    @Autowired
    ProductExportDataDealService dealDataService;
    @Autowired
    private ProductCheckService productCheckService;
    @Autowired
    private IUPCProductUpdateService productUpdateService;
    @Autowired
    private IBusiLogService busiLogService;
    private HashMap radioFieldNames = new HashMap();
    public static HashMap<String, String> mutilFieldNames = new HashMap<String, String>(){
        {
            this.put("receiptName", "receiptName");
            this.put("displayName", "cDisplayName");
            this.put("metaDescription", "metaDescription");
            this.put("receiptSpec", "receiptSpec");
            this.put("receiptModel", "receiptModel");
            this.put("remark", "remark");
            this.put("name", "name");
            this.put("keywords", "keywords");
            this.put("shareDescription", "shareDescription");
            this.put("model", "cModel");
            this.put("titleMemo", "cTitleMemo");
            this.put("modelDescription", "cModelDescription");
        }
    };
    public static HashMap<String, String> notNullFieldsMap;
    public static Set<String> notAddFields;

    public static HashMap<String, String> getNotNullFieldsMap() {
        if (notNullFieldsMap == null) {
            notNullFieldsMap = new HashMap();
            notNullFieldsMap.put("manageClass", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1CED0E5804B00026", (String)"\u7269\u6599\u5206\u7c7b"));
            notNullFieldsMap.put("purchaseUnit", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1CED0E5804B00027", (String)"\u91c7\u8d2d\u5355\u4f4d"));
            notNullFieldsMap.put("purchasePriceUnit", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1CED0E5804B00029", (String)"\u91c7\u8d2d\u8ba1\u4ef7\u5355\u4f4d"));
            notNullFieldsMap.put("stockUnit", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1CED0E5804B0002A", (String)"\u5e93\u5b58\u5355\u4f4d"));
            notNullFieldsMap.put("produceUnit", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1CED0E5804B0002B", (String)"\u751f\u4ea7\u5355\u4f4d"));
            notNullFieldsMap.put("batchPriceUnit", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1CED0E5804B0002C", (String)"\u6279\u53d1\u8ba1\u4ef7\u5355\u4f4d"));
            notNullFieldsMap.put("batchUnit", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1CED0E5804B0002D", (String)"\u6279\u53d1\u9500\u552e\u5355\u4f4d"));
            notNullFieldsMap.put("requireUnit", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1CED0E5804B0002E", (String)"\u8981\u8d27\u5355\u4f4d"));
            notNullFieldsMap.put("inspectionUnit", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1CED0E5804B0002F", (String)"\u68c0\u9a8c\u5355\u4f4d"));
            notNullFieldsMap.put("onlineUnit", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1CED0E5804B00030", (String)"\u7ebf\u4e0a\u96f6\u552e\u5355\u4f4d"));
            notNullFieldsMap.put("offlineUnit", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1CED0E5804B00031", (String)"\u7ebf\u4e0b\u96f6\u552e\u5355\u4f4d"));
            notNullFieldsMap.put("valueManageType", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1CED0E5804B00032", (String)"\u4ef7\u503c\u7ba1\u7406\u6a21\u5f0f"));
            notNullFieldsMap.put("testRule", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1CED0E5804B00033", (String)"\u68c0\u9a8c\u89c4\u5219"));
            notNullFieldsMap.put("scanCountUnit", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1CED0E5804B00034", (String)"\u626b\u7801\u8ba1\u6570\u5355\u4f4d"));
            notNullFieldsMap.put("supplyType", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1CED0E5804B00035", (String)"\u4f9b\u5e94\u7c7b\u578b"));
            notNullFieldsMap.put("planMethod", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1CED0E5804B00036", (String)"\u8ba1\u5212\u65b9\u6cd5"));
            notNullFieldsMap.put("planDefaultAttribute", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1CED0E5804B00037", (String)"\u8ba1\u5212\u9ed8\u8ba4\u5c5e\u6027"));
            notNullFieldsMap.put("strategyComparisonRule", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1CED0E5804B00038", (String)"\u7b56\u7565\u5bf9\u6bd4\u65b9\u5f0f"));
            notNullFieldsMap.put("batchRule", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1CED0E5804B0003B", (String)"\u6279\u91cf\u89c4\u5219"));
            notNullFieldsMap.put("lossType", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1CED0E5804B0003C", (String)"\u635f\u8017\u7c7b\u578b"));
            notNullFieldsMap.put("demandConsolidation", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1CED0E5804B0003D", (String)"\u7269\u6599\u9700\u6c42\u5408\u5e76"));
            notNullFieldsMap.put("demandConsolidationType", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1CED0E5804B0003E", (String)"\u9700\u6c42\u5408\u5e76\u7c7b\u578b"));
            notNullFieldsMap.put("demandConsolidationUnit", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1CED0E5804B0003F", (String)"\u9700\u6c42\u5408\u5e76\u65f6\u683c"));
            notNullFieldsMap.put("demandConsolidationNumber", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1CED0E5804B00040", (String)"\u9700\u6c42\u5408\u5e76\u65f6\u683c\u6570"));
            notNullFieldsMap.put("demandConsolidationDateType", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1CED0E5804B00041", (String)"\u9700\u6c42\u5408\u5e76\u65e5"));
        }
        return notNullFieldsMap;
    }

    public void batchModifyIsCheckField(BizObject bizObject, Map<String, Object> pubBatchModifyEntityFieldSaveIsCheckMap, PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO) throws Exception {
        Product product = this.dealProduct(bizObject, pubBatchModifyEntityFieldSaveIsCheckMap);
        product.setEntityStatus(EntityStatus.Update);
        this.productCheckService.commonCheck(product);
        product.set("_fromBatchModify", (Object)true);
        BillDataDto batchModifyDto = new BillDataDto();
        batchModifyDto.setData((Object)product);
        batchModifyDto.setBillnum("pc_productlist");
        this.initBillDataDto(batchModifyDto);
        batchModifyDto.setExternalData(pubBatchModifyEntityFieldSaveIsCheckMap);
        RuleExecuteResult batchModifyRes = this.billService.executeUpdate("batchModify", batchModifyDto);
        if (batchModifyRes.getMsgCode() != 1) {
            throw new CoreDocBusinessException(batchModifyRes.getMessage());
        }
        BillDataDto saveDto = new BillDataDto();
        saveDto.setData((Object)product);
        saveDto.setBillnum("pc_product");
        this.initBillDataDto(saveDto);
        saveDto.setExternalData(pubBatchModifyEntityFieldSaveIsCheckMap);
        RuleExecuteResult saveRes = this.billService.executeUpdate("save", saveDto);
        if (saveRes.getMsgCode() != 1) {
            throw new CoreDocBusinessException(saveRes.getMessage());
        }
    }

    @NotNull
    public Product dealProduct(BizObject bizObject, Map<String, Object> pubBatchModifyEntityFieldSaveIsCheckMap) throws Exception {
        List<Map> characters = this.checkProductPropCharacters((Long)bizObject.getId(), pubBatchModifyEntityFieldSaveIsCheckMap);
        Map<String, String> materialCharacterTypeMap = ModifyUtils.findMaterialCharacterTypeMap(characters);
        this.productDetailPubBatchModifyExtHandler.initRadioField(this.radioFieldNames, "Radio");
        Product product = new Product();
        product.init((Map)bizObject);
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        if (product.get("id") == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801460);
        }
        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").eq(product.get("id")));
        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.isCreator").eq((Object)true));
        this.initProduct(product, pubBatchModifyEntityFieldSaveIsCheckMap);
        QuerySchema schema = QuerySchema.create().addSelect("productApplyRange.orgId as productApplyRange_OrgId,productApplyRange.id as productApplyRangeId").addCondition((ConditionExpression)queryConditionGroup);
        List productList = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)schema);
        if (productList == null || productList.size() == 0) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801457);
        }
        product.put("productApplyRange_orgId", ((Map)productList.get(0)).get("productApplyRange_OrgId"));
        product.put("productApplyRangeId", ((Map)productList.get(0)).get("productApplyRangeId"));
        product.put("isCreator", (Object)true);
        product.put("isApplied", (Object)true);
        this.detailProduct(product, ((Map)productList.get(0)).get("productApplyRangeId").toString());
        StringBuilder errorMessage = new StringBuilder();
        for (Map.Entry<String, Object> entry : pubBatchModifyEntityFieldSaveIsCheckMap.entrySet()) {
            if ("productPropCharacterDefine".equals(entry.getKey())) {
                ProductPubBatchModifyExtHandler.processProductPropCharacter(pubBatchModifyEntityFieldSaveIsCheckMap, entry, product, materialCharacterTypeMap);
                continue;
            }
            if ("productLoadWay".equals(entry.getKey()) || "productAssistClasses".equals(entry.getKey())) {
                this.dealVirtualField(product, entry);
                continue;
            }
            this.convertTypeAndInsert(product, entry, errorMessage);
        }
        if (errorMessage.length() > 0) {
            throw new CoreDocBusinessException(String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1B2A86EC0510000D", (String)"\u5b57\u6bb5\u3010%s\u3011\u4e0d\u80fd\u6279\u6539\u4e3a\u7a7a\uff01"), errorMessage.substring(0, errorMessage.length() - 1)));
        }
        ProductUtil.dealMutilField(product, UPCConstants.mutilFieldNames);
        return product;
    }

    private static void processProductPropCharacter(Map<String, Object> pubBatchModifyEntityFieldSaveIsCheckMap, Map.Entry<String, Object> entry, Product product, Map<String, String> materialCharacterTypeMap) {
        Map productPropCharacterDefine = (Map)product.get("productPropCharacterDefine");
        if (productPropCharacterDefine != null) {
            Map stringObjectMap = (Map)pubBatchModifyEntityFieldSaveIsCheckMap.get(entry.getKey());
            productPropCharacterDefine.putAll(ModifyUtils.convertPropCharacterTypeMap(stringObjectMap, materialCharacterTypeMap));
            productPropCharacterDefine.put("_status", EntityStatus.Update);
        } else {
            productPropCharacterDefine = new BizObject();
            Map stringObjectMap = (Map)pubBatchModifyEntityFieldSaveIsCheckMap.get(entry.getKey());
            productPropCharacterDefine.putAll(ModifyUtils.convertPropCharacterTypeMap(stringObjectMap, materialCharacterTypeMap));
            productPropCharacterDefine.put("_status", EntityStatus.Insert);
            productPropCharacterDefine.put("id", IdManager.getInstance().nextId());
            product.set("productPropCharacterDefine", (Object)productPropCharacterDefine);
        }
    }

    public List<Map> checkProductPropCharacters(Long productId, Map<String, Object> pubBatchModifyEntityFieldSaveIsCheckMap) throws Exception {
        List<Map> characteristics = new ArrayList<Map>();
        if (pubBatchModifyEntityFieldSaveIsCheckMap.get("productPropCharacterDefine") != null) {
            QuerySchema queryTemplateSchema = QuerySchema.create().addSelect(new String[]{"code", "productTemplate"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)productId)}));
            List products = MetaDaoHelper.queryObject((String)"pc.product.Product", (QuerySchema)queryTemplateSchema, null);
            if (CollectionUtils.isEmpty((Collection)products)) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801457);
            }
            if (((Product)products.get(0)).getProductTemplate() == null) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_PROP_CT_CAN_NOT_MODIFY_BY_TPL_IS_NULL, new Object[]{((Product)products.get(0)).getCode()});
            }
            Long productTemplateId = ((Product)products.get(0)).getProductTemplate();
            QuerySchema queryMaterialPropCTSchema = QuerySchema.create().addSelect("materialPropCT").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)productTemplateId)}));
            List materialPropCTs = MetaDaoHelper.queryObject((String)"pc.tpl.ProductTpl", (QuerySchema)queryMaterialPropCTSchema, null);
            if (CollectionUtils.isEmpty((Collection)materialPropCTs)) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_PROP_CT_CAN_NOT_MODIFY_BY_PRO_CT_GROUP_IS_NULL, new Object[]{((Product)products.get(0)).getCode()});
            }
            ArrayList<Long> characteristicsIds = new ArrayList<Long>();
            characteristicsIds.add(((ProductTpl)materialPropCTs.get(0)).getMaterialPropCT());
            HashMap<String, Object> param = new HashMap<String, Object>();
            param.put("characteristics", characteristicsIds);
            characteristics = this.productTplService.getCharacteristics(param);
            if (!CollectionUtils.isEmpty(characteristics) && characteristics.get(0).get("structs") != null) {
                List productPropCharacterInTpl = JSONArray.parseArray((String)characteristics.get(0).get("structs").toString(), Map.class);
                HashMap<String, Map> productPropCharacterMap = new HashMap<String, Map>();
                for (Map productPropCharacter : productPropCharacterInTpl) {
                    productPropCharacterMap.put(productPropCharacter.get("cName").toString(), productPropCharacter);
                }
                Map modifyProductPropCharacter = (Map)pubBatchModifyEntityFieldSaveIsCheckMap.get("productPropCharacterDefine");
                for (String productPropCharacterCode : modifyProductPropCharacter.keySet()) {
                    String propCharacterName = "";
                    if (productPropCharacterMap.containsKey(productPropCharacterCode)) continue;
                    HashSet<String> characterCodes = new HashSet<String>();
                    characterCodes.add(productPropCharacterCode);
                    ICharacterViewModelService characterViewModelService = (ICharacterViewModelService)DubboReferenceUtils.getDubboService(ICharacterViewModelService.class, (String)"u8c-userdefine", null);
                    List productPropCharacters = characterViewModelService.getCharacterDetailsByCodes(characterCodes);
                    if (!CollectionUtils.isEmpty((Collection)productPropCharacters)) {
                        CharacterDetailDto characterDetailDto = (CharacterDetailDto)productPropCharacters.get(0);
                        propCharacterName = InternationalUtils.getMessageWithDefault((String)characterDetailDto.getNameResId(), (String)characterDetailDto.getName());
                    }
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_PROP_CT_CAN_NOT_MODIFY_BY_PRO_CT_NOT_EXIST, new Object[]{((Product)products.get(0)).getCode(), propCharacterName});
                }
            }
        }
        return characteristics;
    }

    public void convertProductPropCharacterMap(Map<String, Object> pubBatchModifyEntityFieldSaveIsCheckMap) {
        Iterator<Map.Entry<String, Object>> iterator = pubBatchModifyEntityFieldSaveIsCheckMap.entrySet().iterator();
        HashMap<String, Object> characterMap = new HashMap<String, Object>();
        while (iterator.hasNext()) {
            Map.Entry<String, Object> entry = iterator.next();
            String key = entry.getKey();
            if (!key.startsWith("productPropCharacterDefine")) continue;
            Object characterValue = entry.getValue();
            String characterCode = key.replace("productPropCharacterDefine.", "");
            characterMap.put(characterCode, characterValue);
            iterator.remove();
        }
        if (!characterMap.isEmpty()) {
            pubBatchModifyEntityFieldSaveIsCheckMap.put("productPropCharacterDefine", characterMap);
        }
    }

    private void dealVirtualField(Product product, Map.Entry<String, Object> entry) throws Exception {
        if ("productLoadWay".equals(entry.getKey())) {
            ProductPubBatchModifyExtHandler.dealProductLoadWay(product, entry);
        } else if ("productAssistClasses".contains(entry.getKey())) {
            this.dealProductAssistClass(product, entry);
        }
    }

    private void dealProductAssistClass(Product product, Map.Entry<String, Object> entry) throws Exception {
        Long materIalId = product.getId() != null ? Long.valueOf(Long.parseLong(product.getId().toString())) : null;
        List productAssistClassList = this.materialQryDao.queryMaterialAssistClassByMaterIalId(materIalId);
        ArrayList productAssistClassIdsInDB = CollectionUtils.isEmpty((Collection)productAssistClassList) ? new ArrayList() : productAssistClassList.stream().map(v -> v.getId().toString()).collect(Collectors.toList());
        ArrayList<ProductAssistClass> productAssistClasses = new ArrayList<ProductAssistClass>();
        List<Object> productAssistClassIds = new ArrayList();
        if (entry.getValue() != null) {
            productAssistClassIds = Arrays.asList(entry.getValue().toString().split(","));
            for (String string : productAssistClassIds) {
                ProductAssistClass newAssistClass = new ProductAssistClass();
                newAssistClass.setProductClassId(Long.valueOf(Long.parseLong(string)));
                newAssistClass.setEntityStatus(productAssistClassIdsInDB.contains(string) ? EntityStatus.Update : EntityStatus.Insert);
                productAssistClasses.add(newAssistClass);
            }
        }
        if (!CollectionUtils.isEmpty((Collection)productAssistClassList)) {
            for (MaterialAssistClassPO materialAssistClassPO : productAssistClassList) {
                if (productAssistClassIds.contains(materialAssistClassPO.getId().toString())) continue;
                ProductAssistClass deleteAssistClass = new ProductAssistClass();
                deleteAssistClass.setEntityStatus(EntityStatus.Delete);
                deleteAssistClass.setId((Object)materialAssistClassPO.getId());
                productAssistClasses.add(deleteAssistClass);
            }
        }
        product.setProductAssistClasses(productAssistClasses);
        product.setEntityStatus(EntityStatus.Update);
    }

    private static void dealProductLoadWay(Product product, Map.Entry<String, Object> entry) throws Exception {
        ArrayList<ProductLoadWay> productLoadWaysList = new ArrayList<ProductLoadWay>();
        HashSet keys = new HashSet();
        HashSet<String> keysFromUser = new HashSet<String>();
        QueryConditionGroup conditionDel = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productDetailId").eq(product.detail().getId())});
        QuerySchema schemadelete = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)conditionDel);
        List productLoadWayMapListDel = MetaDaoHelper.query((String)"pc.product.ProductLoadWay", (QuerySchema)schemadelete);
        if (productLoadWayMapListDel != null && productLoadWayMapListDel.size() > 0) {
            productLoadWayMapListDel.forEach(loadWay -> keys.add(loadWay.get("loadWay").toString()));
        }
        if (entry.getValue() != null) {
            String[] productLoadWay_loadWay_IDs;
            for (String productLoadWay_loadWay_id : productLoadWay_loadWay_IDs = StringUtils.split((String)entry.getValue().toString(), (char)',')) {
                keysFromUser.add(productLoadWay_loadWay_id);
                ProductLoadWay productLoadWay = new ProductLoadWay();
                productLoadWay.setLoadWay(Long.valueOf(productLoadWay_loadWay_id));
                productLoadWay.setProductApplyRangeId((Long)product.get("productApplyRangeId"));
                if (keys.contains(productLoadWay_loadWay_id)) {
                    productLoadWay.setEntityStatus(EntityStatus.Update);
                } else {
                    productLoadWay.setEntityStatus(EntityStatus.Insert);
                }
                productLoadWaysList.add(productLoadWay);
            }
        }
        productLoadWayMapListDel.forEach(loadway -> {
            if (!keysFromUser.contains(loadway.get("loadWay").toString())) {
                ProductLoadWay productLoadWayDel = new ProductLoadWay();
                productLoadWayDel.putAll(loadway);
                productLoadWayDel.setEntityStatus(EntityStatus.Delete);
                productLoadWaysList.add(productLoadWayDel);
            }
        });
        product.put("productLoadWays", productLoadWaysList);
        product.setEntityStatus(EntityStatus.Update);
    }

    private void convertTypeAndInsert(Product product, Map.Entry<String, Object> entry, StringBuilder errorMessage) throws Exception {
        String key = entry.getKey();
        Object value = entry.getValue();
        if (Objects.isNull(value)) {
            if (ProductPubBatchModifyExtHandler.getNotNullFieldsMap().containsKey(key)) {
                errorMessage.append(ProductPubBatchModifyExtHandler.getNotNullFieldsMap().get(key)).append("\uff0c");
            }
            if (this.radioFieldNames.size() > 0 && this.radioFieldNames.containsKey(key)) {
                errorMessage.append(this.radioFieldNames.get(key.toString())).append("\uff0c");
                return;
            }
            product.put(key, null);
            return;
        }
        String fieldType = BizObjectUtils.getFieldType((String)"pc.product.Product", (String)key);
        if (fieldType != null) {
            if (fieldType.contains("Long")) {
                product.put(key, (Object)Long.parseLong(value.toString()));
            } else if (fieldType.contains("Integer")) {
                if (BooleanUtil.isTrue((Object)value.toString())) {
                    product.put(key, (Object)1);
                } else if (BooleanUtil.isFalse((Object)value.toString())) {
                    product.put(key, (Object)0);
                } else {
                    product.put(key, (Object)Integer.parseInt(value.toString()));
                }
            } else if (fieldType.contains("Boolean")) {
                product.put(key, (Object)Boolean.parseBoolean(value.toString()));
            } else if (fieldType.contains("Short")) {
                product.put(key, (Object)Short.parseShort(value.toString()));
            } else if (fieldType.contains("BigDecimal")) {
                product.put(key, (Object)new BigDecimal(value.toString()));
            } else if (fieldType.contains("String")) {
                if (mutilFieldNames.containsKey(key)) {
                    product.put(key, value);
                } else {
                    product.put(key, (Object)value.toString());
                }
            } else if (fieldType.contains("Decimal")) {
                product.put(key, (Object)new BigDecimal(value.toString()));
            } else {
                product.put(key, value);
            }
        } else {
            product.put(key, value);
        }
    }

    public void detailProduct(Product product, String productApplyRangeId) throws Exception {
        BillDataDto billtemp = new BillDataDto("pc_product", product.getId().toString());
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("@productApplyRangeId", productApplyRangeId);
        params.put("isCreator", product.get("isCreator"));
        params.put("isApplied", product.get("isApplied"));
        billtemp.setMapCondition(params);
        Map productDetailInDb = this.billService.detail(billtemp);
        this.dealDataService.dealDecimalData(productDetailInDb, false);
        ProductExtend detail = new ProductExtend();
        if (product.get("detail") != null) {
            detail = product.detail();
        }
        for (String key : productDetailInDb.keySet()) {
            if (key.startsWith("detail!")) {
                String newKey = key.replace("detail!", "");
                if (detail.containsKey((Object)newKey)) continue;
                detail.put(key.replace("detail!", ""), productDetailInDb.get(key));
                continue;
            }
            product.put(key, productDetailInDb.get(key));
        }
        this.productApiDataService.dealDetailDataForDetailSave((Map<String, Object>)detail);
        this.productApiDataService.dealChildObjecType((Map<String, Object>)product);
        if (detail.get("productExtendCharacterDef") != null && detail.get("productExtendCharacterDef") instanceof Map) {
            if (detail.get("productExtendCharacterDef__id") != null) {
                ((Map)detail.get("productExtendCharacterDef")).put("id", detail.get("productExtendCharacterDef__id"));
                ((Map)detail.get("productExtendCharacterDef")).put("_status", EntityStatus.Update);
            } else {
                ((Map)detail.get("productExtendCharacterDef")).put("id", IdManager.getInstance().nextId());
                ((Map)detail.get("productExtendCharacterDef")).put("_status", EntityStatus.Insert);
            }
        }
        product.setDetail(detail);
    }

    public void initBillDataDto(BillDataDto saveDto) {
        saveDto.setIsIncludeMeta(false);
        saveDto.setIsOnlyCount(false);
        saveDto.setIsOnlyTotal(false);
        saveDto.setSkipCreate(false);
        saveDto.setIsPrint(false);
        saveDto.setIsMasterOrg(false);
        saveDto.setFromApi(false);
        saveDto.setIsSum(false);
        saveDto.setIsDistinct(false);
        saveDto.setSaveSnapshot(false);
        saveDto.setIsMdfRowNo(false);
        saveDto.setPublish(false);
        saveDto.setIsNeedForceSum(false);
        saveDto.setIsSum(false);
        saveDto.setIsIncludeMeta(false);
        saveDto.setIsOnlyCount(false);
        saveDto.setIsOnlyTotal(false);
        saveDto.setIsMasterOrg(false);
        saveDto.setPrint(false);
        saveDto.setIsDistinct(false);
        saveDto.setIsFromKanban(false);
    }

    public void supplementaryReminder(Map<String, Object> pubBatchModifyEntityFieldSaveIsCheckMap) throws Exception {
        this.convertProductPropCharacterMap(pubBatchModifyEntityFieldSaveIsCheckMap);
    }

    public void extendQuerySchema(QuerySchema querySchema, PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO) throws Exception {
        ProductPubBatchModifyExtHandler.dealQuerySchemaForMutil(querySchema);
        querySchema.addSelect(new String[]{"code", "name", "model", "modelDescription"});
        querySchema.configQueryFeature(QueryFeature.EnableMultiLangText, true);
        querySchema.configQueryFeature(QueryFeature.MultiLangTextAsMap, true);
    }

    public static void dealQuerySchemaForMutil(QuerySchema querySchema) {
        QueryConditionGroup queryConditionGroup;
        List conditionExpressionList;
        if (querySchema.queryConditionGroup() != null && querySchema.queryConditionGroup().conditions() != null && !CollectionUtils.isEmpty((Collection)(conditionExpressionList = (queryConditionGroup = querySchema.queryConditionGroup()).conditions()))) {
            QueryConditionGroup queryConditionNewGroup = new QueryConditionGroup();
            for (ConditionExpression conditionExpression : conditionExpressionList) {
                if (!(conditionExpression instanceof QueryCondition)) continue;
                QueryCondition queryCondition1 = (QueryCondition)conditionExpression;
                if (mutilFieldNames.containsKey(queryCondition1.field()) && queryCondition1.v1() instanceof LinkedHashMap) {
                    LinkedHashMap mutilFieValue = (LinkedHashMap)queryCondition1.v1();
                    LinkedList languageVOS = MultiLangContext.getInstance().getEnableLangVOs();
                    for (LanguageVO languageVO : languageVOS) {
                        String langVal = mutilFieValue == null || mutilFieValue.get(languageVO.getLangCode()) == null ? null : mutilFieValue.get(languageVO.getLangCode()).toString();
                        if (!StringUtils.isNotBlank(langVal)) continue;
                        if (languageVO.getLangSequence() == 1) {
                            queryConditionNewGroup.addCondition((ConditionExpression)QueryCondition.name((String)queryCondition1.field()).eq((Object)langVal).multi(true));
                            continue;
                        }
                        String vCName = mutilFieldNames.get(queryCondition1.field()).toString() + languageVO.getLangSequence();
                        queryConditionNewGroup.addCondition((ConditionExpression)QueryCondition.name((String)vCName).eq((Object)langVal).temp(true));
                    }
                    continue;
                }
                queryConditionNewGroup.addCondition((ConditionExpression)queryCondition1);
            }
            querySchema.addCondition((ConditionExpression)queryConditionNewGroup);
        }
    }

    public static void dealQuerySchemaForTaxClass(QuerySchema querySchema) {
        QueryConditionGroup queryConditionGroup;
        List conditionExpressionList;
        if (querySchema.queryConditionGroup() != null && querySchema.queryConditionGroup().conditions() != null && !CollectionUtils.isEmpty((Collection)(conditionExpressionList = (queryConditionGroup = querySchema.queryConditionGroup()).conditions()))) {
            QueryConditionGroup queryConditionNewGroup = new QueryConditionGroup();
            for (ConditionExpression conditionExpression : conditionExpressionList) {
                if (!(conditionExpression instanceof QueryCondition)) continue;
                QueryCondition queryCondition1 = (QueryCondition)conditionExpression;
                if ("taxClass".equals(queryCondition1.field())) {
                    queryConditionNewGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productId.taxClass").eq(queryCondition1.v1()));
                    continue;
                }
                queryConditionNewGroup.addCondition((ConditionExpression)queryCondition1);
            }
            querySchema.addCondition((ConditionExpression)queryConditionNewGroup);
        }
    }

    public void update(String fullName, BizObject newBizObjectUpdate, PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO) throws Exception {
        List batchModifyEntityFieldSaveList = pubBatchModifyEntitySaveDTO.getBatchModifyEntityFieldSaveList();
        HashSet fieldNameSet = new HashSet();
        batchModifyEntityFieldSaveList.forEach(item -> fieldNameSet.add(item.getFieldName()));
        Product product = new Product();
        product.init((Map)newBizObjectUpdate);
        String productName = (String)MultilangUtil.getAttr((String)"pc.product.Product", (String)"name", (BizObject)product, null);
        if (!product.containsKey((Object)"name") || product.get("name") == null || "".equalsIgnoreCase(productName)) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_NAME_NOT_NULL, new Object[]{newBizObjectUpdate.get("code").toString()});
        }
        this.addAuditFields(newBizObjectUpdate);
        HashMap<String, Object> stringObjectHashMap = new HashMap<String, Object>();
        stringObjectHashMap.put("productid", newBizObjectUpdate.get("id"));
        stringObjectHashMap.put("isCreator", UPCConstants.TRUE_INT);
        try {
            this.productUpdateService.updateProductAuditInfo(stringObjectHashMap);
        }
        catch (Exception e) {
            log.error("\u66f4\u65b0\u5ba1\u8ba1\u4fe1\u606f\u5931\u8d25", (Throwable)e);
        }
        MetaDaoHelper.update((String)fullName, (BizObject)newBizObjectUpdate);
        if (pubBatchModifyEntitySaveDTO.getUpdateLog().booleanValue()) {
            String productId = newBizObjectUpdate.get("id") instanceof Long ? newBizObjectUpdate.get("id").toString() : String.valueOf((char[])newBizObjectUpdate.get("id"));
            BillDataDto billDataDtoProductLog = new BillDataDto("pc_product", productId);
            Map productDetail = this.billService.detail(billDataDtoProductLog);
            for (String key : newBizObjectUpdate.keySet()) {
                if (!notAddFields.contains(key)) {
                    productDetail.put(key, newBizObjectUpdate.get(key));
                }
                if (!key.equals("modifierId") && !key.equals("modifyTime") && !key.equals("modifyDate")) continue;
                productDetail.put("detail!" + key, newBizObjectUpdate.get(key));
            }
            BusinessLogObjectBuilder businessLogObjectBuilder = new BusinessLogObjectBuilder();
            businessLogObjectBuilder.uri("pc.product.Product").busiObjTypeCode("pc_product").busiObjTypeName("UID:P_COREDOC-UI_17AA8032057002F6").defaultBusiObjTypeName("\u7269\u6599").operationName("UID:P_COREDOC-UI_17AAAFC8042017E9").defaultOperationName("\u6279\u6539").logMode(BusinessLogMode.UI_META).domain("productcenter").serviceCode("pc_product").newObject((Object)productDetail).dataId(productId).dataCode(newBizObjectUpdate.get("code").toString()).dataName(newBizObjectUpdate.get("name") != null ? newBizObjectUpdate.get("name").toString() : null);
            this.busiLogService.saveBusinessLog(businessLogObjectBuilder.build());
            Product productData = (Product)JSON.parseObject((String)JSON.toJSONString((Object)productDetail), Product.class);
            this.productDetailPubBatchModifyExtHandler.sendEvent(productData);
        }
    }

    public void addAuditFields(BizObject newBizObjectUpdate) {
        newBizObjectUpdate.put("modifierId", AppContext.getCurrentUser().getId());
        newBizObjectUpdate.put("modifyTime", (Object)new Date());
        newBizObjectUpdate.put("modifyDate", (Object)new Date());
    }

    private void initProduct(Product product, Map<String, Object> pubBatchModifyEntityFieldSaveIsCheckMap) {
        Product convertProduct = (Product)Objectlizer.convert(pubBatchModifyEntityFieldSaveIsCheckMap, (String)"pc.product.Product");
        convertProduct.remove("productPropCharacterDefine");
        product.init((Map)convertProduct);
    }

    static {
        notAddFields = new HashSet(){
            {
                this.add("_realtype");
                this.add("_entityName");
                this.add("_keyName");
                this.add("id");
                this.add("code");
                this.add("_status");
            }
        };
    }
}


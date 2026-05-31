/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.batchmodify.extinterface.IPubBatchModifyBillNumExtService
 *  com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.material.service.ProductExportDataDealService
 *  com.yonyou.iuap.graphql.query.feature.QueryFeature
 *  com.yonyou.iuap.log.cons.BusinessLogMode
 *  com.yonyou.iuap.log.model.BusinessLogObjectBuilder
 *  com.yonyou.iuap.log.rpc.IBusiLogService
 *  com.yonyou.iuap.ml.vo.LanguageVO
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.iuap.ucf.common.ml.MultiLangContext
 *  com.yonyou.ucf.mdd.common.model.ResultList
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.poi.model.ProcessData
 *  com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyEntityFieldSaveDTO
 *  com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyEntityQueryFieldSaveDTO
 *  com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyMutilEntitySaveDTO
 *  com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyOnelEntityDTO
 *  com.yonyoucloud.upc.pc.product.BusinessAttributeEnum
 *  com.yonyoucloud.upc.pc.product.Product
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
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
package com.yonyoucloud.upc.service.batchModify.modifyExtBillNum;

import com.yonyou.iuap.apdoc.coredoc.batchmodify.extinterface.IPubBatchModifyBillNumExtService;
import com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.material.service.ProductExportDataDealService;
import com.yonyou.iuap.graphql.query.feature.QueryFeature;
import com.yonyou.iuap.log.cons.BusinessLogMode;
import com.yonyou.iuap.log.model.BusinessLogObjectBuilder;
import com.yonyou.iuap.log.rpc.IBusiLogService;
import com.yonyou.iuap.ml.vo.LanguageVO;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.iuap.ucf.common.ml.MultiLangContext;
import com.yonyou.ucf.mdd.common.model.ResultList;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.poi.model.ProcessData;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyEntityFieldSaveDTO;
import com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyEntityQueryFieldSaveDTO;
import com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyMutilEntitySaveDTO;
import com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyOnelEntityDTO;
import com.yonyoucloud.upc.datarule.ProductTplService;
import com.yonyoucloud.upc.pc.product.BusinessAttributeEnum;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.service.ProductApiDataService;
import com.yonyoucloud.upc.service.ProductCheckService;
import com.yonyoucloud.upc.service.batchModify.PubBatchModifyEntityServiceImpl;
import com.yonyoucloud.upc.service.batchModify.modifyExt.ProductDetailPubBatchModifyExtHandler;
import com.yonyoucloud.upc.service.batchModify.modifyExt.ProductPubBatchModifyExtHandler;
import com.yonyoucloud.upc.service.utils.ProductUtil;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
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
public class ProductBillNumPubBatchModifyExtHandler
implements IPubBatchModifyBillNumExtService {
    private static final Logger log = LoggerFactory.getLogger(ProductBillNumPubBatchModifyExtHandler.class);
    @Autowired
    ProductApiDataService productApiDataService;
    @Autowired
    ProductPubBatchModifyExtHandler productPubBatchModifyExtHandler;
    @Autowired
    ProductDetailPubBatchModifyExtHandler productDetailPubBatchModifyExtHandler;
    @Autowired
    ProductTplService productTplService;
    @Autowired
    ProductExportDataDealService dealDataService;
    @Autowired
    ProductCheckService checkService;
    @Autowired
    @Qualifier(value="pc.BillService")
    private IUPCBillService billService;
    @Autowired
    private IBusiLogService busiLogService;
    public static HashMap<String, String> mutilFieldNames = new HashMap<String, String>(){
        {
            this.put("detail.receiptName", "detail.receiptName");
            this.put("detail.displayName", "detail.cDisplayName");
            this.put("detail.metaDescription", "detail.metaDescription");
            this.put("detail.receiptSpec", "detail.receiptSpec");
            this.put("detail.receiptModel", "detail.receiptModel");
            this.put("detail.remark", "detail.remark");
            this.put("name", "name");
            this.put("keywords", "keywords");
            this.put("shareDescription", "shareDescription");
            this.put("model", "cModel");
            this.put("detail.titleMemo", "detail.cTitleMemo");
            this.put("modelDescription", "cModelDescription");
        }
    };

    public boolean extendQuerySchema(QuerySchema querySchema, PubBatchModifyMutilEntitySaveDTO pubBatchModifyEntitySaveDTO) throws Exception {
        boolean hasExtend = false;
        QueryConditionGroup queryConditionGroup = querySchema.queryConditionGroup();
        List pubBatchModifyMutilEntityDTOList = pubBatchModifyEntitySaveDTO.getPubBatchModifyMutilEntityDTOList();
        for (PubBatchModifyOnelEntityDTO pubBatchModifyOnelEntityDTO : pubBatchModifyMutilEntityDTOList) {
            if (!"pc.product.ProductDetail".equals(pubBatchModifyOnelEntityDTO.getFullName()) || pubBatchModifyOnelEntityDTO.getBatchModifyEntityQueryFieldSaveList() == null || pubBatchModifyOnelEntityDTO.getBatchModifyEntityQueryFieldSaveList().size() <= 0 || CollectionUtils.isEmpty((Collection)pubBatchModifyOnelEntityDTO.getBatchModifyEntityQueryFieldSaveList())) continue;
            for (PubBatchModifyEntityQueryFieldSaveDTO pubBatchModifyEntityQueryFieldSaveDTO : pubBatchModifyOnelEntityDTO.getBatchModifyEntityQueryFieldSaveList()) {
                if (pubBatchModifyEntityQueryFieldSaveDTO.getValue() != null) {
                    if (pubBatchModifyEntityQueryFieldSaveDTO.isMultiple()) {
                        List<String> valueList = Arrays.asList(StringUtils.split((String)pubBatchModifyEntityQueryFieldSaveDTO.getValue().toString(), (String)","));
                        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)("detail." + pubBatchModifyEntityQueryFieldSaveDTO.getFieldName())).in(valueList));
                        hasExtend = true;
                        continue;
                    }
                    queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)("detail." + pubBatchModifyEntityQueryFieldSaveDTO.getFieldName())).eq(pubBatchModifyEntityQueryFieldSaveDTO.getValue()));
                    hasExtend = true;
                    continue;
                }
                queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)("detail." + pubBatchModifyEntityQueryFieldSaveDTO.getFieldName())).is_null());
                hasExtend = true;
            }
        }
        ProductBillNumPubBatchModifyExtHandler.dealQuerySchemaForMutil(querySchema);
        querySchema.addSelect(new String[]{"id", "code", "name", "model", "modelDescription"});
        querySchema.configQueryFeature(QueryFeature.EnableMultiLangText, true);
        querySchema.configQueryFeature(QueryFeature.MultiLangTextAsMap, true);
        return hasExtend;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void batchModify(List<BizObject> bizObjectList, PubBatchModifyMutilEntitySaveDTO pubBatchModifyMutilEntitySaveDTO, ConcurrentHashMap<String, ConcurrentHashMap<String, Boolean>> resultYtenanntMap, ConcurrentHashMap<String, ResultList> resultListMap) throws Exception {
        ResultList resultList = resultListMap.get(AppContext.getYTenantId() + pubBatchModifyMutilEntitySaveDTO.getBillNum());
        ConcurrentHashMap<String, Boolean> resultMap = resultYtenanntMap.get(AppContext.getYTenantId() + pubBatchModifyMutilEntitySaveDTO.getBillNum());
        for (BizObject bizObject : bizObjectList) {
            String code = bizObject.get("code").toString();
            try {
                List productDetailEntityList;
                Product product = new Product();
                BillDataDto batchModifyDto = new BillDataDto();
                HashMap<String, Object> stringObjectHashMap = new HashMap<String, Object>();
                List pubBatchModifyMutilEntityDTOList = pubBatchModifyMutilEntitySaveDTO.getPubBatchModifyMutilEntityDTOList();
                List productEntityList = pubBatchModifyMutilEntityDTOList.stream().filter(s -> "pc.product.Product".equals(s.getFullName())).collect(Collectors.toList());
                if (productEntityList.size() > 0) {
                    PubBatchModifyOnelEntityDTO pubBatchModifyOnelEntityDTO = (PubBatchModifyOnelEntityDTO)productEntityList.get(0);
                    List batchModifyEntityFieldSaveList = pubBatchModifyOnelEntityDTO.getBatchModifyEntityFieldSaveList();
                    List batchModifyEntityFieldSaveDTOList = batchModifyEntityFieldSaveList.stream().filter(item -> item.getIsCheck().equals("1")).collect(Collectors.toList());
                    HashMap<String, Object> pubBatchModifyEntityFieldSaveIsCheckMap = new HashMap<String, Object>();
                    for (Object pubBatchModifyEntityFieldSaveDTO : batchModifyEntityFieldSaveDTOList) {
                        pubBatchModifyEntityFieldSaveIsCheckMap.put(pubBatchModifyEntityFieldSaveDTO.getFieldName(), pubBatchModifyEntityFieldSaveDTO.getValue());
                    }
                    this.productPubBatchModifyExtHandler.convertProductPropCharacterMap(pubBatchModifyEntityFieldSaveIsCheckMap);
                    product = this.productPubBatchModifyExtHandler.dealProduct(bizObject, pubBatchModifyEntityFieldSaveIsCheckMap);
                    stringObjectHashMap.putAll(pubBatchModifyEntityFieldSaveIsCheckMap);
                }
                if ((productDetailEntityList = pubBatchModifyMutilEntityDTOList.stream().filter(s -> "pc.product.ProductDetail".equals(s.getFullName())).collect(Collectors.toList())) != null && productDetailEntityList.size() > 0) {
                    Object pubBatchModifyEntityFieldSaveDTO;
                    PubBatchModifyOnelEntityDTO pubBatchModifyOnelEntityDTO = (PubBatchModifyOnelEntityDTO)productDetailEntityList.get(0);
                    List batchModifyEntityFieldSaveList = pubBatchModifyOnelEntityDTO.getBatchModifyEntityFieldSaveList();
                    List batchModifyEntityFieldSaveDTOList = batchModifyEntityFieldSaveList.stream().filter(item -> item.getIsCheck().equals("1")).collect(Collectors.toList());
                    HashMap<String, Object> pubBatchModifyEntityFieldSaveIsCheckMap = new HashMap<String, Object>();
                    pubBatchModifyEntityFieldSaveDTO = batchModifyEntityFieldSaveDTOList.iterator();
                    while (pubBatchModifyEntityFieldSaveDTO.hasNext()) {
                        PubBatchModifyEntityFieldSaveDTO pubBatchModifyEntityFieldSaveDTO2 = (PubBatchModifyEntityFieldSaveDTO)pubBatchModifyEntityFieldSaveDTO.next();
                        pubBatchModifyEntityFieldSaveIsCheckMap.put(pubBatchModifyEntityFieldSaveDTO2.getFieldName(), pubBatchModifyEntityFieldSaveDTO2.getValue());
                    }
                    StringBuilder errorMessasge = new StringBuilder();
                    for (Map.Entry<String, Object> entry2 : pubBatchModifyEntityFieldSaveIsCheckMap.entrySet()) {
                        this.productDetailPubBatchModifyExtHandler.convertTypeAndInsert(product, entry2, errorMessasge);
                    }
                    if (errorMessasge.length() > 0) {
                        throw new CoreDocBusinessException(String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1B0114E60428000F", (String)"\u5b57\u6bb5\u3010%s\u3011\u4e0d\u80fd\u6279\u6539\u4e3a\u7a7a\uff01"), errorMessasge.substring(0, errorMessasge.length() - 1)));
                    }
                    if (pubBatchModifyEntityFieldSaveIsCheckMap.containsKey("businessAttribute") && pubBatchModifyEntityFieldSaveIsCheckMap.get("businessAttribute") != null && pubBatchModifyEntityFieldSaveIsCheckMap.get("businessAttribute").toString().contains(String.valueOf(BusinessAttributeEnum.SALE.getValue()))) {
                        product.setUseSku(Integer.valueOf(1));
                        product.setEntityStatus(EntityStatus.Update);
                    }
                    product.set("_fromBatchModify", (Object)true);
                    ProductUtil.dealMutilField(product, UPCConstants.mutilFieldNames);
                    product.setEntityStatus(EntityStatus.Update);
                    product.detail().setEntityStatus(EntityStatus.Update);
                    this.checkService.commonCheck(product);
                    pubBatchModifyEntityFieldSaveIsCheckMap.entrySet().forEach(entry -> stringObjectHashMap.put("detail!" + (String)entry.getKey(), entry.getValue()));
                }
                batchModifyDto.setData((Object)product);
                if (pubBatchModifyMutilEntitySaveDTO.getBillNum() == null || "pc_product".equals(pubBatchModifyMutilEntitySaveDTO.getBillNum())) {
                    batchModifyDto.setBillnum("pc_productlist");
                } else {
                    batchModifyDto.setBillnum("pc_productlist_query");
                }
                this.productPubBatchModifyExtHandler.initBillDataDto(batchModifyDto);
                batchModifyDto.setExternalData(stringObjectHashMap);
                RuleExecuteResult batchModifyRes = this.billService.executeUpdate("batchModify&save", batchModifyDto);
                if (batchModifyRes.getMsgCode() != 1) {
                    String errorMesage = batchModifyRes.getMessage();
                    resultList.incResultCount(false);
                    resultMap.put(code, false);
                    String str = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1B57FC1805A00006", (String)"%s\u3010%s\u3011\u6279\u6539\u90e8\u5206\u5b57\u6bb5\u5931\u8d25,\u539f\u56e0\u4e3a[%s]"), InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_21A830A205380084", (String)"\u7269\u6599"), code, errorMesage);
                    resultList.addInfo((Object)str);
                    resultList.addErrorMessage(str);
                    resultList.addFailInfo((Object)str);
                    continue;
                }
                if (resultMap.containsKey(code)) {
                    Boolean codeRes = resultMap.get(code);
                    resultMap.put(code, codeRes != false);
                } else {
                    resultMap.put(code, true);
                }
                resultList.incResultCount(true);
            }
            catch (Exception e) {
                String errorMesage = e.getMessage();
                resultList.incResultCount(false);
                resultMap.put(code, false);
                String str = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1B57FC1805A00006", (String)"%s\u3010%s\u3011\u6279\u6539\u90e8\u5206\u5b57\u6bb5\u5931\u8d25,\u539f\u56e0\u4e3a[%s]"), "\u7269\u6599", code, errorMesage);
                resultList.addInfo((Object)str);
                resultList.addErrorMessage(str);
                resultList.addFailInfo((Object)str);
            }
            finally {
                double percent = (double)(resultList.getSucessCount() + resultList.getFailCount()) / (double)(resultList.getCount() * PubBatchModifyEntityServiceImpl.modifyTimesAccordingEntitiesMap.get(AppContext.getYTenantId() + pubBatchModifyMutilEntitySaveDTO.getBillNum())) * 100.0 - 0.5;
                BigDecimal bigDecimal = new BigDecimal(percent);
                BigDecimal percentage = bigDecimal.setScale(2, RoundingMode.HALF_UP);
                if (percentage.doubleValue() >= 100.0) {
                    percentage = new BigDecimal(99);
                }
                ProcessData.builder((int)1, (int)200, (Object)resultList, null).percentage(percentage.toString()).build(pubBatchModifyMutilEntitySaveDTO.getAsyncKey(), Integer.valueOf(pubBatchModifyMutilEntitySaveDTO.getExpireTime()));
            }
        }
        resultListMap.put(AppContext.getYTenantId() + pubBatchModifyMutilEntitySaveDTO.getBillNum(), resultList);
        resultYtenanntMap.put(AppContext.getYTenantId() + pubBatchModifyMutilEntitySaveDTO.getBillNum(), resultMap);
    }

    public void addLog(PubBatchModifyMutilEntitySaveDTO pubBatchModifyMutilEntitySaveDTO, List<Object> mainEntityDataIdList, List<Object> extIdList) {
        if ("pc_product".equals(pubBatchModifyMutilEntitySaveDTO.getBillNum())) {
            for (Object productId : mainEntityDataIdList) {
                try {
                    Product product = new Product();
                    product.setId(productId);
                    QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
                    if (product.get("id") == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801460);
                    }
                    queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").eq(product.get("id")));
                    queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.isCreator").eq((Object)true));
                    QuerySchema schema = QuerySchema.create().addSelect("productApplyRange.orgId as productApplyRange_OrgId,productApplyRange.id as productApplyRangeId").addCondition((ConditionExpression)queryConditionGroup);
                    List productList = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)schema);
                    if (productList == null || productList.size() == 0) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801457);
                    }
                    product.put("productApplyRange_orgId", ((Map)productList.get(0)).get("productApplyRange_OrgId"));
                    product.put("productApplyRangeId", ((Map)productList.get(0)).get("productApplyRangeId"));
                    product.put("isCreator", (Object)true);
                    product.put("isApplied", (Object)true);
                    this.productPubBatchModifyExtHandler.detailProduct(product, ((Map)productList.get(0)).get("productApplyRangeId").toString());
                    BusinessLogObjectBuilder businessLogObjectBuilder = new BusinessLogObjectBuilder();
                    businessLogObjectBuilder.uri("pc.product.Product").busiObjTypeCode("pc_product").busiObjTypeName("UID:P_COREDOC-UI_17AA8032057002F6").defaultBusiObjTypeName("\u7269\u6599").operationName("UID:P_COREDOC-UI_17AAAFC8042017E9").defaultOperationName("\u66f4\u65b0").logMode(BusinessLogMode.UI_META).domain("productcenter").serviceCode("pc_product").newObject((Object)product).dataId((String)product.getId()).dataCode(product.get("code") != null ? product.get("code").toString() : null).dataName(product.get("name") != null ? product.get("name").toString() : null);
                    this.busiLogService.saveBusinessLog(businessLogObjectBuilder.build());
                }
                catch (Exception e) {
                    log.error("\u6279\u6539\u521b\u5efa\u7269\u6599\u65e5\u5fd7\u5f02\u5e38\uff1b", (Throwable)e);
                }
            }
        }
    }

    public static void dealQuerySchemaForMutil(QuerySchema querySchema) {
        QueryConditionGroup queryConditionGroup;
        List conditionExpressionList;
        if (querySchema.queryConditionGroup() != null && querySchema.queryConditionGroup().conditions() != null && !CollectionUtils.isEmpty((Collection)(conditionExpressionList = (queryConditionGroup = querySchema.queryConditionGroup()).conditions()))) {
            QueryConditionGroup queryConditionNewGroup = new QueryConditionGroup();
            for (ConditionExpression conditionExpression : conditionExpressionList) {
                if (!(conditionExpression instanceof QueryCondition)) continue;
                QueryCondition queryCondition1 = (QueryCondition)conditionExpression;
                if (mutilFieldNames.containsKey(queryCondition1.field())) {
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
}


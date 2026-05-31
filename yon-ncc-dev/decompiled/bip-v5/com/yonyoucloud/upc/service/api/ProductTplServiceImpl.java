/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.diwork.ott.exexutors.RobotExecutors
 *  com.yonyou.iuap.BusinessException
 *  com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants
 *  com.yonyou.iuap.apdoc.coredoc.dao.pub.CoreDocBaseDao
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.QueryOperatorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.po.materialtpl.MaterialTplPO
 *  com.yonyou.iuap.apdoc.coredoc.po.pub.BatchApiQueryParam
 *  com.yonyou.iuap.apdoc.coredoc.po.pub.CoreDocBaseEntity
 *  com.yonyou.iuap.apdoc.coredoc.po.pub.QueryConditionPO
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
 *  com.yonyou.iuap.graphql.model.IQuerySchema
 *  com.yonyou.iuap.graphql.model.conditions.IConditionExpression
 *  com.yonyou.iuap.graphql.model.conditions.group.IQueryConditionGroup
 *  com.yonyou.iuap.graphql.query.IMapDataAccessApi
 *  com.yonyou.iuap.ml.provider.ILanguageProvider
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.iuap.yms.common.utils.JacksonUtils
 *  com.yonyou.ucf.CharacteristicsDTO
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService
 *  com.yonyou.ucf.mdd.ext.bill.biz.BillBiz
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils
 *  com.yonyoucloud.iuap.upc.api.IProductTplService
 *  com.yonyoucloud.iuap.upc.dto.ext.UPCResultList
 *  com.yonyoucloud.iuap.upc.dto.openapi.OpenAPIDTO
 *  com.yonyoucloud.iuap.upc.productTpl.dto.FreeCTCharacterDTO
 *  com.yonyoucloud.iuap.upc.productTpl.dto.MaterialPropCharacterDTO
 *  com.yonyoucloud.iuap.upc.productTpl.dto.MultilingualDTO
 *  com.yonyoucloud.iuap.upc.productTpl.dto.OptionCTCharacterDTO
 *  com.yonyoucloud.iuap.upc.productTpl.dto.ProductTplDTO
 *  com.yonyoucloud.iuap.upc.productTpl.dto.ProductTplListDTO
 *  com.yonyoucloud.iuap.upc.productTpl.dto.ProductTplParameterDTO
 *  com.yonyoucloud.iuap.upc.productTpl.dto.SkuPropCTCharacterDTO
 *  com.yonyoucloud.iuap.upc.vo.productTpl.vo.ProductTplQueryVO
 *  com.yonyoucloud.iuap.upc.vo.productTpl.vo.ProductTplVO
 *  com.yonyoucloud.upc.pc.tpl.ProductTpl
 *  com.yonyoucloud.upc.pc.tpl.ProductTplAssistUnitExchange
 *  com.yonyoucloud.upc.pc.tpl.ProductTplBrand
 *  com.yonyoucloud.upc.pc.tpl.ProductTplCharacter
 *  com.yonyoucloud.upc.pc.tpl.ProductTplCycleProperty
 *  com.yonyoucloud.upc.pc.tpl.ProductTplOrderPropertySum
 *  com.yonyoucloud.upc.pc.tpl.ProductTplParameter
 *  com.yonyoucloud.upc.pc.tpl.ProductTplUnit
 *  com.yonyoucloud.upc.utils.CoreDocJsonResult
 *  com.yonyoucloud.upc.utils.CoredocBeanConvert
 *  org.apache.commons.lang3.ObjectUtils
 *  org.imeta.core.lang.BooleanUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.service.api;

import com.yonyou.diwork.ott.exexutors.RobotExecutors;
import com.yonyou.iuap.BusinessException;
import com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants;
import com.yonyou.iuap.apdoc.coredoc.dao.pub.CoreDocBaseDao;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.QueryOperatorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.po.materialtpl.MaterialTplPO;
import com.yonyou.iuap.apdoc.coredoc.po.pub.BatchApiQueryParam;
import com.yonyou.iuap.apdoc.coredoc.po.pub.CoreDocBaseEntity;
import com.yonyou.iuap.apdoc.coredoc.po.pub.QueryConditionPO;
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
import com.yonyou.iuap.graphql.model.IQuerySchema;
import com.yonyou.iuap.graphql.model.conditions.IConditionExpression;
import com.yonyou.iuap.graphql.model.conditions.group.IQueryConditionGroup;
import com.yonyou.iuap.graphql.query.IMapDataAccessApi;
import com.yonyou.iuap.ml.provider.ILanguageProvider;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.iuap.yms.common.utils.JacksonUtils;
import com.yonyou.ucf.CharacteristicsDTO;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService;
import com.yonyou.ucf.mdd.ext.bill.biz.BillBiz;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils;
import com.yonyoucloud.iuap.upc.api.IProductTplService;
import com.yonyoucloud.iuap.upc.constants.ProductTplFieldMap;
import com.yonyoucloud.iuap.upc.dto.ext.UPCResultList;
import com.yonyoucloud.iuap.upc.dto.openapi.OpenAPIDTO;
import com.yonyoucloud.iuap.upc.productTpl.dto.FreeCTCharacterDTO;
import com.yonyoucloud.iuap.upc.productTpl.dto.MaterialPropCharacterDTO;
import com.yonyoucloud.iuap.upc.productTpl.dto.MultilingualDTO;
import com.yonyoucloud.iuap.upc.productTpl.dto.OptionCTCharacterDTO;
import com.yonyoucloud.iuap.upc.productTpl.dto.ProductTplDTO;
import com.yonyoucloud.iuap.upc.productTpl.dto.ProductTplListDTO;
import com.yonyoucloud.iuap.upc.productTpl.dto.ProductTplParameterDTO;
import com.yonyoucloud.iuap.upc.productTpl.dto.SkuPropCTCharacterDTO;
import com.yonyoucloud.iuap.upc.vo.productTpl.vo.ProductTplQueryVO;
import com.yonyoucloud.iuap.upc.vo.productTpl.vo.ProductTplVO;
import com.yonyoucloud.upc.datarule.ProductTplService;
import com.yonyoucloud.upc.pc.tpl.ProductTpl;
import com.yonyoucloud.upc.pc.tpl.ProductTplAssistUnitExchange;
import com.yonyoucloud.upc.pc.tpl.ProductTplBrand;
import com.yonyoucloud.upc.pc.tpl.ProductTplCharacter;
import com.yonyoucloud.upc.pc.tpl.ProductTplCycleProperty;
import com.yonyoucloud.upc.pc.tpl.ProductTplOrderPropertySum;
import com.yonyoucloud.upc.pc.tpl.ProductTplParameter;
import com.yonyoucloud.upc.pc.tpl.ProductTplUnit;
import com.yonyoucloud.upc.service.MultiThreadService;
import com.yonyoucloud.upc.service.api.materialtpl.MaterialTplQueryServiceImpl;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import com.yonyoucloud.upc.utils.CoredocBeanConvert;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import org.apache.commons.lang3.ObjectUtils;
import org.imeta.core.lang.BooleanUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

@Service
public class ProductTplServiceImpl
implements IProductTplService {
    private static final Logger log = LoggerFactory.getLogger(ProductTplServiceImpl.class);
    @Autowired
    private ProductTplService productTplService;
    @Autowired
    private ApiImportCommandService apiImportSingleService;
    @Autowired
    private ExecutorService ymsExecutorService;
    @Autowired
    private MultiThreadService multiThreadService;
    @Autowired
    private IMapDataAccessApi mapDataAccessApi;
    @Autowired
    private MaterialTplQueryServiceImpl materialTplQueryService;
    @Autowired
    private CoreDocBaseDao coreDocBaseDao;
    public static String poiExcelRowNum = "poiExcelRowNum";
    @Autowired
    ILanguageProvider languageProvider;

    public CoreDocJsonResult<Object> productTplSave(ProductTplVO productTplVO) throws Exception {
        if (Objects.isNull(productTplVO)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801155);
        }
        ProductTpl productTpl = new ProductTpl();
        productTpl.put("_fromApi", (Object)true);
        Map map = UpcAPiTool.beanToMap((Object)productTplVO, ProductTplFieldMap.productTplVOFieldType, ProductTplFieldMap.productTplVOFieldRenameMap, (String)"Insert");
        productTpl.putAll(map);
        this.processCharacters(productTpl);
        this.processUnits(productTpl);
        this.checkOptionCharacter(productTpl);
        BillDataDto billDataDto = new BillDataDto();
        billDataDto.setBillnum("pc_producttpl");
        billDataDto.setAction("save");
        billDataDto.setData((Object)productTpl);
        billDataDto.setFromApi(true);
        billDataDto.setConvertType(Integer.valueOf(2));
        Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
        return CoreDocJsonResult.success((Object)result);
    }

    public CoreDocJsonResult<Object> productTplSaveFromIdempotent(OpenAPIDTO<ProductTplVO> vo) {
        if (vo == null || vo.getData() == null) {
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
        }
        try {
            return this.productTplSave((ProductTplVO)vo.getData());
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)businessException);
        }
        catch (Exception e) {
            log.error("\u7269\u6599\u6a21\u677f\u4fdd\u5b58-\u7279\u5f81\u5e42\u7b49\u63a5\u53e3\u5f02\u5e38\uff1a" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    public CoreDocJsonResult<Object> productTplSave(List<ProductTplVO> productTplDTO) throws Exception {
        int count;
        if (productTplDTO.size() > UPCConstants.MAX_COUNT) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801394, new Object[]{UPCConstants.MAX_COUNT, productTplDTO.size()});
        }
        ArrayList<String> listret = new ArrayList<String>();
        ArrayList<Future> futures = new ArrayList<Future>();
        CountDownLatch downLatch = new CountDownLatch(productTplDTO.size());
        for (count = 0; count < productTplDTO.size(); ++count) {
            ProductTplVO productTplVO = productTplDTO.get(count);
            Future stringFuture = RobotExecutors.runAs((String)((String)AppContext.getYTenantId()), () -> {
                try {
                    CoreDocJsonResult<Object> objectCoreDocJsonResult = this.productTplSave(productTplVO);
                    List resultList = objectCoreDocJsonResult.getData();
                    String id = "";
                    String name = "";
                    if (resultList != null && resultList.size() > 0) {
                        id = ((Map)resultList.get(0)).get("id").toString();
                        name = ((Map)resultList.get(0)).get("name").toString();
                    }
                    String string = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1A7F3A3C04080019", (String)"\u6a21\u677f\u3010%s\u3011\u65b0\u589e\u6210\u529f\uff0c\u6a21\u677fID\uff1a%s"), name, id);
                    return string;
                }
                catch (BusinessException e) {
                    String string = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1A7F3A3C0408001A", (String)"\u7269\u6599\u6a21\u677f\u65b0\u589e\u5931\u8d25\uff0c\u5f02\u5e38\uff1a%s"), e.getMessage());
                    return string;
                }
                catch (Exception e) {
                    log.error("\u5faa\u73af\u5f00\u542f\u591a\u7ebf\u7a0b\u65b0\u589e\u7269\u6599\u6a21\u677f\u62a5\u9519\uff0c\u65b9\u6cd5\u8def\u5f84\u3010com.yonyoucloud.upc.service.api.ProductTplServiceImpl.productTplSave(java.util.List<com.yonyoucloud.iuap.upc.vo.productTpl.vo.ProductTplVO>)\u3011\uff0c\u5f02\u5e38\uff1a" + e);
                    String string = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1A7F3A3C0408001B", (String)"SKU\u65b0\u589e/\u66f4\u65b0\u5931\u8d25\uff0c\u5f02\u5e38\uff1a%s"), e.getMessage());
                    return string;
                }
                finally {
                    downLatch.countDown();
                }
            }, (ExecutorService)this.ymsExecutorService);
            futures.add(stringFuture);
        }
        try {
            downLatch.await();
            for (count = 0; count < futures.size(); ++count) {
                Future stringFuture = (Future)futures.get(count);
                String futureRes = (String)stringFuture.get();
                listret.add(String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1991FB8C04500014", (String)"\u7b2c\u3010%s\u3011\u6761"), count + 1) + futureRes);
            }
        }
        catch (InterruptedException e) {
            log.error("\u83b7\u53d6\u6267\u884c\u7ed3\u679c\u88ab\u4e2d\u65ad\u3010com.yonyoucloud.upc.service.api.SkuServiceImpl.saveProductSKUCharacter(java.util.List<com.yonyoucloud.iuap.upc.vo.sku.ProductSKUCharacterSaveVO>)\u3011\uff0c\u5f02\u5e38\uff1a" + e);
        }
        catch (Exception e) {
            log.error("\u7b49\u5f85\u8d85\u65f6", (Throwable)e);
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801333);
        }
        return CoreDocJsonResult.success(Collections.singletonList(listret));
    }

    public CoreDocJsonResult<UPCResultList> productTplBatchSave(List<ProductTplVO> productTplVOs) {
        try {
            if (CollectionUtils.isEmpty(productTplVOs)) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801155);
            }
            if (productTplVOs.size() > UPCConstants.MAX_COUNT) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801394, new Object[]{UPCConstants.MAX_COUNT, productTplVOs.size()});
            }
            ArrayList<BillDataDto> productTplList = new ArrayList<BillDataDto>();
            StringBuilder stringBuilder = new StringBuilder();
            for (ProductTplVO productTplVO : productTplVOs) {
                if (productTplVO == null) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL);
                }
                String productTplName = productTplVO.getName().toString();
                try {
                    ProductTpl productTpl = this.handleProductTplData(productTplVO);
                    BillDataDto billDataDto = CoredocBeanConvert.cast2BillDTO((String)"pc_producttpl", (String)"save", (BizObject)productTpl);
                    productTplList.add(billDataDto);
                }
                catch (BusinessException businessException) {
                    if (stringBuilder.length() > 0) {
                        stringBuilder.append(";");
                    }
                    stringBuilder.append(CoreDocBusinessErrorEnum.MATERIAL_TPL_BATCH_SAVE_ERROR.getMultilingualMessage(new Object[]{productTplName, businessException.getMessage()}));
                }
            }
            if (stringBuilder.length() > 0) {
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(stringBuilder.toString()));
            }
            UPCResultList upcResultList = this.multiThreadService.multiThreadSave(productTplList);
            UpcAPiTool.dealBatchSaveResult((UPCResultList)upcResultList, (String)"name");
            return CoreDocJsonResult.success((Object)upcResultList);
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)businessException);
        }
        catch (Exception e) {
            log.error("\u7269\u6599\u6a21\u677f\u6279\u91cf\u4fdd\u5b58\u9519\u8bef:" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    public ProductTpl handleProductTplData(ProductTplVO productTplVO) throws Exception {
        ProductTpl productTpl = new ProductTpl();
        productTpl.put("_fromApi", (Object)true);
        Map map = UpcAPiTool.beanToMap((Object)productTplVO, ProductTplFieldMap.productTplVOFieldType, ProductTplFieldMap.productTplVOFieldRenameMap, (String)"Insert");
        productTpl.putAll(map);
        this.processCharacters(productTpl);
        this.processUnits(productTpl);
        this.checkOptionCharacter(productTpl);
        return productTpl;
    }

    private void checkOptionCharacter(ProductTpl productTpl) {
        if (Objects.nonNull(productTpl.getIsOptionalTemplate()) && productTpl.getIsOptionalTemplate() == 1) {
            if (Objects.nonNull(productTpl.get("skuPropCTCode"))) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801395);
            }
            if (Objects.nonNull(productTpl.get("freeCTCode")) || Objects.nonNull(productTpl.get("freeCharacters"))) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801396);
            }
        } else if (Objects.nonNull(productTpl.get("optionCTCode"))) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801397);
        }
    }

    private void processUnits(ProductTpl productTpl) {
        if (Objects.nonNull(productTpl.Units())) {
            productTpl.Units().forEach(unit -> {
                if (Objects.nonNull(unit.getUnit())) {
                    unit.remove("unit_Name");
                    unit.remove("unit_Code");
                } else if (Objects.nonNull(unit.get("unit_Code"))) {
                    unit.remove("unit_Name");
                }
                if (Objects.nonNull(unit.getPurchaseUnit())) {
                    unit.remove("purchaseUnit_Name");
                    unit.remove("purchaseUnit_Code");
                } else if (Objects.nonNull(unit.get("purchaseUnit_Code"))) {
                    unit.remove("purchaseUnit_Name");
                }
                if (Objects.nonNull(unit.getStockUnit())) {
                    unit.remove("stockUnit_Name");
                    unit.remove("stockUnit_Code");
                } else if (Objects.nonNull(unit.get("stockUnit_Code"))) {
                    unit.remove("stockUnit_Name");
                }
                if (Objects.nonNull(unit.getBatchUnit())) {
                    unit.remove("batchUnit_Name");
                    unit.remove("batchUnit_Code");
                } else if (Objects.nonNull(unit.get("batchUnit_Code"))) {
                    unit.remove("batchUnit_Name");
                }
                if (Objects.nonNull(unit.getOnlineUnit())) {
                    unit.remove("onlineUnit_Name");
                    unit.remove("onlineUnit_Code");
                } else if (Objects.nonNull(unit.get("onlineUnit_Code"))) {
                    unit.remove("onlineUnit_Name");
                }
                if (Objects.nonNull(unit.getOfflineUnit())) {
                    unit.remove("offlineUnit_Name");
                    unit.remove("offlineUnit_Code");
                } else if (Objects.nonNull(unit.get("offlineUnit_Code"))) {
                    unit.remove("offlineUnit_Name");
                }
                if (Objects.nonNull(unit.getRequireUnit())) {
                    unit.remove("requireUnit_Name");
                    unit.remove("requireUnit_Code");
                } else if (Objects.nonNull(unit.get("requireUnit_Code"))) {
                    unit.remove("requireUnit_Name");
                }
                if (Objects.nonNull(unit.getPurchasePriceUnit())) {
                    unit.remove("purchasePriceUnit_Name");
                    unit.remove("purchasePriceUnit_Code");
                } else if (Objects.nonNull(unit.get("purchasePriceUnit_Code"))) {
                    unit.remove("purchasePriceUnit_Name");
                }
                if (Objects.nonNull(unit.getBatchPriceUnit())) {
                    unit.remove("batchPriceUnit_Name");
                    unit.remove("batchPriceUnit_Code");
                } else if (Objects.nonNull(unit.get("batchPriceUnit_Code"))) {
                    unit.remove("batchPriceUnit_Name");
                }
                if (Objects.nonNull(unit.getInspectionUnit())) {
                    unit.remove("inspectionUnit_Name");
                    unit.remove("inspectionUnit_Code");
                } else if (Objects.nonNull(unit.get("inspectionUnit_Code"))) {
                    unit.remove("inspectionUnit_Name");
                }
                if (Objects.nonNull(unit.getProduceUnit())) {
                    unit.remove("produceUnit_Name");
                    unit.remove("produceUnit_Code");
                } else if (Objects.nonNull(unit.get("produceUnit_Code"))) {
                    unit.remove("produceUnit_Name");
                }
            });
        }
        if (Objects.nonNull(productTpl.productTplAssistUnitExchanges())) {
            productTpl.productTplAssistUnitExchanges().forEach(unit -> {
                if (Objects.nonNull(unit.getAssistUnit())) {
                    unit.remove("assistUnit_Name");
                    unit.remove("assistUnit_Code");
                } else if (Objects.nonNull(unit.get("assistUnit_Code"))) {
                    unit.remove("assistUnit_Name");
                }
            });
        }
        if (Objects.nonNull(productTpl.Brands())) {
            productTpl.Brands().forEach(brand -> {
                if (Objects.nonNull(brand.get("brand_code"))) {
                    brand.remove("brand_name");
                }
            });
        }
    }

    private void processCharacters(ProductTpl productTpl) throws Exception {
        if (Objects.nonNull(productTpl.freeCharacters())) {
            productTpl.freeCharacters().forEach(freeChar -> {
                if (Objects.nonNull(freeChar.getCharacteristics())) {
                    freeChar.remove("characteristicsName");
                }
                if (Objects.isNull(freeChar.getCharacteristicsType())) {
                    freeChar.setCharacteristicsType(Long.valueOf(3L));
                }
                if (freeChar.containsKey((Object)"characterCode") && Objects.isNull(freeChar.get("characterCode"))) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801398);
                }
            });
        }
    }

    public CoreDocJsonResult<ProductTplListDTO> productQueryList(ProductTplQueryVO vo) throws Exception {
        QueryConditionGroup conditionGroup = new QueryConditionGroup();
        if (Objects.nonNull(vo.getId()) || Objects.nonNull(vo.getIdList()) && vo.getIdList().size() > 0) {
            ArrayList<Long> idlist = new ArrayList<Long>();
            if (Objects.nonNull(vo.getId())) {
                idlist.add(vo.getId());
            }
            if (Objects.nonNull(vo.getIdList())) {
                idlist.addAll(vo.getIdList());
            }
            conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").in(idlist));
        } else if (Objects.nonNull(vo.getName()) || Objects.nonNull(vo.getNameList()) && vo.getNameList().size() > 0) {
            ArrayList<String> namelist = new ArrayList<String>();
            if (Objects.nonNull(vo.getName())) {
                namelist.add(vo.getName());
            }
            if (Objects.nonNull(vo.getNameList())) {
                namelist.addAll(vo.getNameList());
            }
            conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"name").in(namelist));
        }
        if (vo.getBeginTime() != null) {
            conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"pubts").egt((Object)vo.getBeginTime()));
        }
        if (vo.getPubts() != null) {
            conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"pubts").egt((Object)vo.getPubts()));
        }
        if (vo.getEndTime() != null) {
            conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"pubts").lt((Object)vo.getEndTime()));
        }
        QuerySchema schema = QuerySchema.create().addSelect("id,name,enableCyclePurchase,stopstatus").addCondition((ConditionExpression)conditionGroup).addPager(vo.pageIndex.intValue(), vo.pageSize.intValue());
        schema.setLimitCount(vo.getPageSize());
        List template = MetaDaoHelper.query((String)"pc.tpl.ProductTpl", (QuerySchema)schema);
        ArrayList<ProductTplListDTO> result = new ArrayList<ProductTplListDTO>();
        if (Objects.nonNull(template) && template.size() > 0) {
            for (Map mapOne : template) {
                ProductTplListDTO resultOne = new ProductTplListDTO();
                resultOne.setId(Long.valueOf(String.valueOf(mapOne.get("id"))));
                resultOne.setName(String.valueOf(mapOne.get("name")));
                resultOne.setEnableCyclePurchase(Boolean.valueOf(BooleanUtils.b(mapOne.get("enableCyclePurchase"))));
                resultOne.setStopStatus(Boolean.valueOf(BooleanUtils.b(mapOne.get("stopstatus"))));
                result.add(resultOne);
            }
        }
        return CoreDocJsonResult.success(result);
    }

    public CoreDocJsonResult<ProductTplDTO> productQueryDetail(Long templateId) throws Exception {
        Map templateData = this.productTplService.getTemplateData(templateId);
        if (Objects.isNull(templateData)) {
            return CoreDocJsonResult.success((Object)new ProductTplDTO());
        }
        ProductTplDTO productTplDTO = new ProductTplDTO();
        UpcAPiTool.mapToBean((Object)productTplDTO, ProductTplFieldMap.productTplFieldType, (HashMap)((HashMap)templateData), ProductTplFieldMap.productTplFieldRenameMap);
        this.processCharacteristics(templateData, productTplDTO);
        productTplDTO.setName(this.setMutilName((HashMap)templateData.get("name")));
        this.processParameters(templateData, productTplDTO);
        return CoreDocJsonResult.success((Object)productTplDTO);
    }

    private void processParameters(Map<String, Object> templateData, ProductTplDTO dto) {
        if (!templateData.containsKey("Parameters")) {
            return;
        }
        List parameters = (List)templateData.get("Parameters");
        List parameterDTOs = parameters.stream().map(this::createParameterDTO).collect(Collectors.toList());
        dto.setParameters(parameterDTOs);
    }

    private ProductTplParameterDTO createParameterDTO(Map parameterMap) {
        ProductTplParameterDTO dto = new ProductTplParameterDTO();
        dto.setName(this.setMutilName((HashMap)parameterMap.get("name")));
        dto.setGroup(this.setMutilName((HashMap)parameterMap.get("group")));
        dto.setIsFilter(Boolean.valueOf(BooleanUtils.b(parameterMap.get("isFilter"))));
        return dto;
    }

    private void processCharacteristics(Map<String, Object> templateData, ProductTplDTO dto) {
        if (!templateData.containsKey("characteristics")) {
            return;
        }
        List characterList = (List)templateData.get("characteristics");
        for (CharacteristicsDTO characteristic : characterList) {
            this.handleCharacteristic(characteristic, dto);
        }
    }

    private void handleCharacteristic(CharacteristicsDTO characteristic, ProductTplDTO dto) {
        Long type = characteristic.getCharacteristicsType();
        if (type == null) {
            return;
        }
        String code = Optional.ofNullable(characteristic.getCode()).orElse("");
        String name = Optional.ofNullable(characteristic.getName()).orElse("");
        switch (type.intValue()) {
            case 1: {
                dto.setMaterialPropCTCode(code);
                this.setCharacteristicName(dto.getProductPropCharacters(), name);
                break;
            }
            case 2: {
                dto.setSkuPropCTCode(code);
                this.setCharacteristicName(dto.getSkuCharacters(), name);
                break;
            }
            case 3: {
                dto.setFreeCTCode(code);
                this.setCharacteristicName(dto.getFreeCharacters(), name);
                break;
            }
            case 4: {
                dto.setOptionCTCode(code);
                this.setCharacteristicName(dto.getOptionCharacters(), name);
                break;
            }
        }
    }

    private <T> void setCharacteristicName(List<T> dtoList, String name) {
        if (CollectionUtils.isEmpty(dtoList)) {
            return;
        }
        for (T dto : dtoList) {
            if (dto instanceof MaterialPropCharacterDTO) {
                ((MaterialPropCharacterDTO)dto).setCharacteristicsName(name);
                continue;
            }
            if (dto instanceof SkuPropCTCharacterDTO) {
                ((SkuPropCTCharacterDTO)dto).setCharacteristicsName(name);
                continue;
            }
            if (dto instanceof FreeCTCharacterDTO) {
                ((FreeCTCharacterDTO)dto).setCharacteristicsName(name);
                continue;
            }
            if (!(dto instanceof OptionCTCharacterDTO)) continue;
            ((OptionCTCharacterDTO)dto).setCharacteristicsName(name);
        }
    }

    private MultilingualDTO setMutilName(HashMap<String, Object> o) {
        MultilingualDTO multilingualVO = new MultilingualDTO();
        if (Objects.nonNull(o.get("zh_CN"))) {
            multilingualVO.setSimplifiedName(String.valueOf(o.get("zh_CN")));
        }
        if (Objects.nonNull(o.get("en_US"))) {
            multilingualVO.setEnglishName(String.valueOf(o.get("en_US")));
        }
        if (Objects.nonNull(o.get("zh_TW"))) {
            multilingualVO.setTraditionalName(String.valueOf(o.get("zh_TW")));
        }
        return multilingualVO;
    }

    public CoreDocJsonResult<MaterialTplVO> queryMaterialTpl(BatchApiQueryParam batchApiQueryParam) throws Exception {
        CoreDocJsonResult coreDocJsonResult;
        IQueryConditionGroup qryConditionGroup = ProductTplServiceImpl.getQryConditionGroup(batchApiQueryParam);
        int recordCount = this.getRecordCount(qryConditionGroup);
        if (recordCount > 0) {
            if (batchApiQueryParam.getPageSize() <= 0L) {
                batchApiQueryParam.setPageSize((long)UpcAPiTool.DEFAULT_PAGE_SIZE.intValue());
            } else if (batchApiQueryParam.getPageSize() > (long)UpcAPiTool.PAGE_MAX_SIZE.intValue()) {
                batchApiQueryParam.setPageSize((long)UpcAPiTool.PAGE_MAX_SIZE.intValue());
            }
            if (batchApiQueryParam.getPageIndex() <= 0L) {
                batchApiQueryParam.setPageIndex((long)UpcAPiTool.DEFAULT_PAGE_INDEX.intValue());
            }
            int maxPageIndex = (int)Math.ceil((double)recordCount / (double)Long.valueOf(batchApiQueryParam.getPageSize()).intValue());
            if (batchApiQueryParam.getPageIndex() > (long)maxPageIndex) {
                coreDocJsonResult = CoreDocJsonResult.success(null);
            } else {
                List<MaterialTplVO> materialTplVOList = this.materialTplQueryService.detailMaterialTpl(Long.valueOf(batchApiQueryParam.getPageIndex()).intValue(), Long.valueOf(batchApiQueryParam.getPageSize()).intValue(), qryConditionGroup);
                coreDocJsonResult = CoreDocJsonResult.success(materialTplVOList);
            }
        } else {
            coreDocJsonResult = CoreDocJsonResult.success(null);
        }
        coreDocJsonResult.setTotalCount(Integer.valueOf(recordCount));
        return coreDocJsonResult;
    }

    private int getRecordCount(IQueryConditionGroup qryConditionGroup) {
        int recordCount = 0;
        IDefaultQuerySchemaBuilder schemaBuilder = QueryBuilders.defaultBuilder().from("pc.tpl.ProductTpl").distinct().select(new String[]{"count(id)"});
        IQuerySchema querySchema = schemaBuilder.condition(qryConditionGroup).build();
        List resultList = this.mapDataAccessApi.queryForList(querySchema);
        if (ObjectUtils.isNotEmpty((Object)resultList) && resultList.get(0) != null && ((Map)resultList.get(0)).get("count") != null) {
            recordCount = Integer.parseInt(((Map)resultList.get(0)).get("count").toString());
        }
        return recordCount;
    }

    private static IQueryConditionGroup getQryConditionGroup(BatchApiQueryParam batchApiQueryParam) {
        IQueryConditionGroup qryConditionGroup = QueryConditions.and((IConditionExpression[])new IConditionExpression[]{QueryConditions.eq((String)"ytenant", (Object)AppContext.getCurrentUser().getYTenantId())});
        if (!CollectionUtils.isEmpty((Collection)batchApiQueryParam.getIds())) {
            qryConditionGroup = QueryConditions.and((IConditionExpression[])new IConditionExpression[]{qryConditionGroup, QueryConditions.in((String)"id", (Collection)batchApiQueryParam.getIds())});
        } else if (StringUtils.hasLength((String)batchApiQueryParam.getId())) {
            qryConditionGroup = QueryConditions.and((IConditionExpression[])new IConditionExpression[]{qryConditionGroup, QueryConditions.eq((String)"id", (Object)batchApiQueryParam.getId())});
        }
        if (StringUtils.hasLength((String)batchApiQueryParam.getName())) {
            qryConditionGroup = QueryConditions.and((IConditionExpression[])new IConditionExpression[]{qryConditionGroup, QueryConditions.eq((String)"name", (Object)batchApiQueryParam.getName())});
        }
        if (batchApiQueryParam.getStartTs() != null) {
            qryConditionGroup = QueryConditions.and((IConditionExpression[])new IConditionExpression[]{qryConditionGroup, QueryConditions.egt((String)"pubts", (Object)batchApiQueryParam.getStartTs())});
        }
        if (batchApiQueryParam.getEndTs() != null) {
            qryConditionGroup = QueryConditions.and((IConditionExpression[])new IConditionExpression[]{qryConditionGroup, QueryConditions.lt((String)"pubts", (Object)batchApiQueryParam.getEndTs())});
        }
        return qryConditionGroup;
    }

    public Long materialTplSave(String matchRule, MaterialTplVO materialTplVO) throws Exception {
        Long id = 0L;
        this.dataMaterialTplPreprocessing(matchRule, materialTplVO);
        ProductTpl productTpl = this.convertToProductTpl(materialTplVO);
        this.addRowNum(productTpl);
        DataTransferUtils.fill((String)"pc_producttpl", (String)"pc.tpl.ProductTpl", (Object)productTpl, (int)4);
        this.fillPKAndStatus(matchRule, productTpl);
        BillDataDto billDataDto = new BillDataDto();
        billDataDto.setBillnum("pc_producttpl");
        billDataDto.setAction("save");
        billDataDto.setData((Object)productTpl);
        billDataDto.setFromApi(true);
        billDataDto.setConvertType(Integer.valueOf(4));
        Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
        if (result != null) {
            id = (Long)((ProductTpl)result).getId();
        }
        return id;
    }

    private void fillPKAndStatus(String matchRule, ProductTpl productTpl) throws Exception {
        List<MaterialTplPO> materialTplPOList = this.matchProductTpl(matchRule, productTpl);
        if (ObjectUtils.isNotEmpty(materialTplPOList)) {
            productTpl.setEntityStatus(EntityStatus.Update);
            productTpl.setId((Object)materialTplPOList.get(0).getId());
            MaterialTplVO materialTplVO = this.materialTplQueryService.detailMaterialTplById(Long.parseLong(productTpl.getId().toString()));
            this.fillPKAndStatusForBrands(productTpl, materialTplVO);
            this.fillPKAndStatusForParameters(productTpl, materialTplVO);
            this.fillPKAndStatusForOrderProps(productTpl, materialTplVO);
            this.fillPKAndStatusForCycleProps(productTpl, materialTplVO);
            this.fillPKAndStatusForUnits(productTpl, materialTplVO);
            this.fillPKAndStatusForAssistUnitExchanges(productTpl, materialTplVO);
            if (materialTplVO != null) {
                this.fillPKAndStatusForTplCharacters(productTpl.freeCharacters(), materialTplVO.getId(), materialTplVO.getFreeCharacters());
                this.fillPKAndStatusForTplCharacters(productTpl.productPropCharacters(), materialTplVO.getId(), materialTplVO.getProductPropCharacters());
                this.fillPKAndStatusForTplCharacters(productTpl.skuCharacters(), materialTplVO.getId(), materialTplVO.getSkuCharacters());
                this.fillPKAndStatusForTplCharacters(productTpl.optionCharacters(), materialTplVO.getId(), materialTplVO.getOptionCharacters());
            }
        } else {
            productTpl.setEntityStatus(EntityStatus.Insert);
            this.setInsertStatus(productTpl.Brands());
            this.setInsertStatus(productTpl.Parameters());
            this.setInsertStatus(productTpl.OrderPropertySums());
            this.setInsertStatus(productTpl.CycleProperties());
            this.setInsertStatus(productTpl.Units());
            this.setInsertStatus(productTpl.productTplAssistUnitExchanges());
            this.setInsertStatus(productTpl.freeCharacters());
            this.setInsertStatus(productTpl.productPropCharacters());
            this.setInsertStatus(productTpl.skuCharacters());
            this.setInsertStatus(productTpl.optionCharacters());
        }
    }

    private <T extends BizObject> void setInsertStatus(List<T> bizObjects) {
        if (ObjectUtils.isNotEmpty(bizObjects)) {
            bizObjects.forEach(v -> v.setEntityStatus(EntityStatus.Insert));
        }
    }

    private void fillPKAndStatusForTplCharacters(List<ProductTplCharacter> tplCharacters, String tplId, List<MaterialTplCharacterVO> tplCharacterVOS) {
        if (ObjectUtils.isNotEmpty(tplCharacters)) {
            Map<Object, Object> materialTplCharacterVOMap = new HashMap();
            if (ObjectUtils.isNotEmpty(tplCharacterVOS)) {
                materialTplCharacterVOMap = tplCharacterVOS.stream().filter(v -> v != null && v.getCharacter() != null).collect(Collectors.toMap(MaterialTplCharacterVO::getCharacter, v -> v));
            }
            for (ProductTplCharacter tplCharacter : tplCharacters) {
                tplCharacter.setEntityStatus(EntityStatus.Insert);
                tplCharacter.setTemplate(Long.valueOf(Long.parseLong(tplId)));
                MaterialTplCharacterVO tplCharacterVO = (MaterialTplCharacterVO)materialTplCharacterVOMap.get(tplCharacter.getCharacter());
                if (!ObjectUtils.isNotEmpty((Object)tplCharacterVO)) continue;
                tplCharacter.setEntityStatus(EntityStatus.Update);
                tplCharacter.setId((Object)Long.parseLong(tplCharacterVO.getId()));
            }
        }
    }

    private void fillPKAndStatusForAssistUnitExchanges(ProductTpl productTpl, MaterialTplVO materialTplVO) {
        if (ObjectUtils.isNotEmpty((Object)productTpl.productTplAssistUnitExchanges())) {
            Map<Object, Object> materialTplAssistUnitExchangVOMap = new HashMap();
            if (ObjectUtils.isNotEmpty((Object)materialTplVO.getAssistUnits())) {
                materialTplAssistUnitExchangVOMap = materialTplVO.getAssistUnits().stream().filter(v -> v != null && v.getAssistUnit() != null).collect(Collectors.toMap(MaterialTplAssistUnitVO::getAssistUnit, v -> v));
            }
            for (ProductTplAssistUnitExchange productTplAssistUnitExchange : productTpl.productTplAssistUnitExchanges()) {
                productTplAssistUnitExchange.setEntityStatus(EntityStatus.Insert);
                productTplAssistUnitExchange.setTemplate(Long.valueOf(Long.parseLong(materialTplVO.getId())));
                MaterialTplAssistUnitVO materialTplAssistUnitVO = (MaterialTplAssistUnitVO)materialTplAssistUnitExchangVOMap.get(productTplAssistUnitExchange.getAssistUnit());
                if (!ObjectUtils.isNotEmpty((Object)materialTplAssistUnitVO)) continue;
                productTplAssistUnitExchange.setEntityStatus(EntityStatus.Update);
                productTplAssistUnitExchange.setId((Object)Long.parseLong(materialTplAssistUnitVO.getId()));
                materialTplAssistUnitExchangVOMap.remove(productTplAssistUnitExchange.getAssistUnit());
            }
            if (ObjectUtils.isNotEmpty(materialTplAssistUnitExchangVOMap)) {
                for (MaterialTplAssistUnitVO materialTplAssistUnitVO : materialTplAssistUnitExchangVOMap.values()) {
                    ProductTplAssistUnitExchange tplAssistUnitExchange = new ProductTplAssistUnitExchange();
                    tplAssistUnitExchange.setEntityStatus(EntityStatus.Delete);
                    tplAssistUnitExchange.setId((Object)Long.parseLong(materialTplAssistUnitVO.getId()));
                    productTpl.productTplAssistUnitExchanges().add(tplAssistUnitExchange);
                }
            }
        }
    }

    private void fillPKAndStatusForUnits(ProductTpl productTpl, MaterialTplVO materialTplVO) {
        if (ObjectUtils.isNotEmpty((Object)productTpl.Units())) {
            MaterialTplUnitVO materialTplUnitVO = ObjectUtils.isNotEmpty((Object)materialTplVO.getUnits()) ? (MaterialTplUnitVO)materialTplVO.getUnits().get(0) : null;
            productTpl.Units().forEach(v -> {
                v.setEntityStatus(EntityStatus.Insert);
                v.setTemplate(Long.valueOf(Long.parseLong(materialTplVO.getId())));
                if (ObjectUtils.isNotEmpty((Object)materialTplUnitVO)) {
                    v.setEntityStatus(EntityStatus.Update);
                    v.setId((Object)Long.parseLong(materialTplUnitVO.getId()));
                }
            });
        }
    }

    private void fillPKAndStatusForCycleProps(ProductTpl productTpl, MaterialTplVO materialTplVO) {
        if (ObjectUtils.isNotEmpty((Object)productTpl.CycleProperties())) {
            Map<Object, Object> materialTplCyclePropVOMap = new HashMap();
            if (ObjectUtils.isNotEmpty((Object)materialTplVO.getCycleProperties())) {
                materialTplCyclePropVOMap = materialTplVO.getCycleProperties().stream().filter(v -> v != null && v.getPropertyType() != null).collect(Collectors.toMap(MaterialTplCyclePropertyVO::getPropertyType, v -> v));
            }
            for (ProductTplCycleProperty cycleProperty : productTpl.CycleProperties()) {
                cycleProperty.setEntityStatus(EntityStatus.Insert);
                cycleProperty.setTemplate(Long.valueOf(Long.parseLong(materialTplVO.getId())));
                MaterialTplCyclePropertyVO materialTplCyclePropertyVO = (MaterialTplCyclePropertyVO)materialTplCyclePropVOMap.get(cycleProperty.getPropertyType());
                if (!ObjectUtils.isNotEmpty((Object)materialTplCyclePropertyVO)) continue;
                cycleProperty.setEntityStatus(EntityStatus.Update);
                cycleProperty.setId((Object)Long.parseLong(materialTplCyclePropertyVO.getId()));
            }
        }
    }

    private void fillPKAndStatusForOrderProps(ProductTpl productTpl, MaterialTplVO materialTplVO) {
        if (ObjectUtils.isNotEmpty((Object)productTpl.OrderPropertySums())) {
            Map<Object, Object> materialTplOrderPropertyVOMap = new HashMap();
            if (ObjectUtils.isNotEmpty((Object)materialTplVO.getOrderProperties())) {
                materialTplOrderPropertyVOMap = materialTplVO.getOrderProperties().stream().filter(v -> v != null && v.getPropertyType() != null).collect(Collectors.toMap(MaterialTplOrderPropertyVO::getPropertyType, v -> v));
            }
            for (ProductTplOrderPropertySum productTplOrderPropertySum : productTpl.OrderPropertySums()) {
                productTplOrderPropertySum.setEntityStatus(EntityStatus.Insert);
                productTplOrderPropertySum.setTemplate(Long.valueOf(Long.parseLong(materialTplVO.getId())));
                MaterialTplOrderPropertyVO materialTplOrderPropertyVO = (MaterialTplOrderPropertyVO)materialTplOrderPropertyVOMap.get(productTplOrderPropertySum.getPropertyType());
                if (!ObjectUtils.isNotEmpty((Object)materialTplOrderPropertyVO)) continue;
                productTplOrderPropertySum.setEntityStatus(EntityStatus.Update);
                productTplOrderPropertySum.setId((Object)Long.parseLong(materialTplOrderPropertyVO.getId()));
                materialTplOrderPropertyVOMap.remove(productTplOrderPropertySum.getPropertyType());
            }
            if (ObjectUtils.isNotEmpty(materialTplOrderPropertyVOMap)) {
                for (MaterialTplOrderPropertyVO materialTplOrderPropertyVO : materialTplOrderPropertyVOMap.values()) {
                    ProductTplOrderPropertySum tplOrderPropertySum = new ProductTplOrderPropertySum();
                    tplOrderPropertySum.setEntityStatus(EntityStatus.Delete);
                    tplOrderPropertySum.setId((Object)Long.parseLong(materialTplOrderPropertyVO.getId()));
                    productTpl.OrderPropertySums().add(tplOrderPropertySum);
                }
            }
        }
    }

    private void fillPKAndStatusForParameters(ProductTpl productTpl, MaterialTplVO materialTplVO) {
        if (ObjectUtils.isNotEmpty((Object)productTpl.Parameters())) {
            Map<Object, Object> groupAndNameParameterVOSMap = new HashMap();
            if (ObjectUtils.isNotEmpty((Object)materialTplVO.getParameters())) {
                groupAndNameParameterVOSMap = materialTplVO.getParameters().stream().filter(v -> v != null && v.getGroup() != null && v.getGroup().toMap().get("zh_TW") != null && v.getName() != null && v.getName().toMap().get("zh_TW") != null).collect(Collectors.toMap(v -> (String)v.getGroup().toMap().get("zh_TW") + (String)v.getName().toMap().get("zh_TW"), v -> v));
            }
            for (ProductTplParameter productTplParameter : productTpl.Parameters()) {
                Object name;
                productTplParameter.setEntityStatus(EntityStatus.Insert);
                productTplParameter.setTemplate(Long.valueOf(Long.parseLong(materialTplVO.getId())));
                Object group = ObjectUtils.isEmpty((Object)productTplParameter.get("group")) ? null : (Object)((Map)productTplParameter.get("group")).get("zh_TW");
                Object v0 = name = ObjectUtils.isEmpty((Object)productTplParameter.get("name")) ? null : ((Map)productTplParameter.get("name")).get("zh_TW");
                if (!ObjectUtils.isNotEmpty(group) || !ObjectUtils.isNotEmpty(name) || groupAndNameParameterVOSMap.get(group.toString() + name) == null) continue;
                MaterialTplParameterVO materialTplParameterVO = (MaterialTplParameterVO)groupAndNameParameterVOSMap.get(group.toString() + name);
                productTplParameter.setEntityStatus(EntityStatus.Update);
                productTplParameter.setId((Object)Long.parseLong(materialTplParameterVO.getId()));
                groupAndNameParameterVOSMap.remove(group.toString() + name);
            }
            if (ObjectUtils.isNotEmpty(groupAndNameParameterVOSMap)) {
                for (MaterialTplParameterVO materialTplParameterVO : groupAndNameParameterVOSMap.values()) {
                    ProductTplParameter tplParameter = new ProductTplParameter();
                    tplParameter.setEntityStatus(EntityStatus.Delete);
                    tplParameter.setId((Object)Long.parseLong(materialTplParameterVO.getId()));
                    productTpl.Parameters().add(tplParameter);
                }
            }
        }
    }

    private void fillPKAndStatusForBrands(ProductTpl productTpl, MaterialTplVO materialTplVO) {
        if (ObjectUtils.isNotEmpty((Object)productTpl.Brands())) {
            Map<Object, Object> materialTplBrandVOMap = new HashMap();
            if (ObjectUtils.isNotEmpty((Object)materialTplVO.getBrands())) {
                materialTplBrandVOMap = materialTplVO.getBrands().stream().filter(v -> v != null && v.getBrand() != null).collect(Collectors.toMap(MaterialTplBrandVO::getBrand, v -> v));
            }
            for (ProductTplBrand productTplBrand : productTpl.Brands()) {
                productTplBrand.setEntityStatus(EntityStatus.Insert);
                productTplBrand.setTemplate(Long.valueOf(Long.parseLong(materialTplVO.getId())));
                MaterialTplBrandVO materialTplBrandVO = (MaterialTplBrandVO)materialTplBrandVOMap.get(productTplBrand.getBrand());
                if (!ObjectUtils.isNotEmpty((Object)materialTplBrandVO)) continue;
                productTplBrand.setEntityStatus(EntityStatus.Update);
                productTplBrand.setId((Object)Long.parseLong(materialTplBrandVO.getId()));
                materialTplBrandVOMap.remove(productTplBrand.getBrand());
            }
            if (ObjectUtils.isNotEmpty(materialTplBrandVOMap)) {
                for (MaterialTplBrandVO materialTplBrandVO : materialTplBrandVOMap.values()) {
                    ProductTplBrand tplBrand = new ProductTplBrand();
                    tplBrand.setEntityStatus(EntityStatus.Delete);
                    tplBrand.setId((Object)materialTplBrandVO.getId());
                    productTpl.Brands().add(tplBrand);
                }
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private List<MaterialTplPO> matchProductTpl(String matchRule, ProductTpl productTpl) throws Exception {
        ArrayList<QueryConditionPO> queryConditionPOS = new ArrayList<QueryConditionPO>();
        if ("id".equals(matchRule) && productTpl.getId() != null && !productTpl.getId().toString().trim().isEmpty()) {
            queryConditionPOS.add(new QueryConditionPO("id", QueryOperatorEnum.EQ, Long.valueOf(productTpl.getId().toString())));
            return this.coreDocBaseDao.queryEntityByCondition((CoreDocBaseEntity)new MaterialTplPO(), queryConditionPOS);
        } else {
            if (productTpl.get("name") == null) return null;
            Map nameMap = (Map)productTpl.get("name");
            if (!ObjectUtils.isNotEmpty(nameMap.get("zh_CN"))) return null;
            queryConditionPOS.add(new QueryConditionPO("name", QueryOperatorEnum.EQ, (String)nameMap.get("zh_CN")));
        }
        return this.coreDocBaseDao.queryEntityByCondition((CoreDocBaseEntity)new MaterialTplPO(), queryConditionPOS);
    }

    public void addRowNum(ProductTpl productTpl) {
        ProductTplServiceImpl.addRowNumberToList(productTpl.Brands(), poiExcelRowNum);
        ProductTplServiceImpl.addRowNumberToList(productTpl.Parameters(), poiExcelRowNum);
        ProductTplServiceImpl.addRowNumberToList(productTpl.OrderPropertySums(), poiExcelRowNum);
        ProductTplServiceImpl.addRowNumberToList(productTpl.CycleProperties(), poiExcelRowNum);
        ProductTplServiceImpl.addRowNumberToList(productTpl.Units(), poiExcelRowNum);
        ProductTplServiceImpl.addRowNumberToList(productTpl.productTplAssistUnitExchanges(), poiExcelRowNum);
        ProductTplServiceImpl.addRowNumberToList(productTpl.freeCharacters(), poiExcelRowNum);
        ProductTplServiceImpl.addRowNumberToList(productTpl.productPropCharacters(), poiExcelRowNum);
        ProductTplServiceImpl.addRowNumberToList(productTpl.skuCharacters(), poiExcelRowNum);
        ProductTplServiceImpl.addRowNumberToList(productTpl.optionCharacters(), poiExcelRowNum);
    }

    public static void addRowNumberToList(List list, String key) {
        if (CollectionUtils.isEmpty((Collection)list)) {
            return;
        }
        for (int i = 0; i < list.size(); ++i) {
            if (!(list.get(i) instanceof Map)) continue;
            ((Map)list.get(i)).put(key, i);
        }
    }

    private ProductTpl convertToProductTpl(MaterialTplVO materialTplVO) {
        int i;
        ProductTpl productTpl = (ProductTpl)JacksonUtils.parseObject((String)JacksonUtils.toJSONString((Object)materialTplVO), ProductTpl.class);
        if (ObjectUtils.isEmpty((Object)productTpl.get("name"))) {
            productTpl.set("name", (Object)materialTplVO.getName().toMap());
        }
        if (ObjectUtils.isNotEmpty((Object)productTpl.get("brands"))) {
            productTpl.setBrands(productTpl.getBizObjects("brands", ProductTplBrand.class));
        }
        if (ObjectUtils.isNotEmpty((Object)productTpl.get("parameters"))) {
            List parameters = productTpl.getBizObjects("parameters", ProductTplParameter.class);
            productTpl.setParameters(parameters);
            List parameterVOs = materialTplVO.getParameters();
            for (i = 0; i < parameters.size(); ++i) {
                ProductTplParameter parameter = (ProductTplParameter)parameters.get(i);
                if (ObjectUtils.isEmpty((Object)parameter.get("name"))) {
                    parameter.put("name", (Object)((MaterialTplParameterVO)parameterVOs.get(i)).getName().toMap());
                }
                if (!ObjectUtils.isEmpty((Object)parameter.get("group"))) continue;
                parameter.put("group", (Object)((MaterialTplParameterVO)parameterVOs.get(i)).getGroup().toMap());
            }
        }
        if (ObjectUtils.isNotEmpty((Object)productTpl.get("assistUnits"))) {
            productTpl.setProductTplAssistUnitExchanges(productTpl.getBizObjects("assistUnits", ProductTplAssistUnitExchange.class));
        }
        if (ObjectUtils.isNotEmpty((Object)productTpl.get("orderProperties"))) {
            productTpl.setOrderPropertySums(productTpl.getBizObjects("orderProperties", ProductTplOrderPropertySum.class));
        }
        if (ObjectUtils.isNotEmpty((Object)productTpl.get("cycleProperties"))) {
            List cycleProperties = productTpl.getBizObjects("cycleProperties", ProductTplCycleProperty.class);
            productTpl.setCycleProperties(cycleProperties);
            List cyclePropertyVOs = materialTplVO.getCycleProperties();
            for (i = 0; i < cycleProperties.size(); ++i) {
                ProductTplCycleProperty cycleProperty = (ProductTplCycleProperty)cycleProperties.get(i);
                if (!ObjectUtils.isNotEmpty((Object)cycleProperty.get("alias"))) continue;
                cycleProperty.put("alias", (Object)((MaterialTplCyclePropertyVO)cyclePropertyVOs.get(i)).getAlias().toMap());
            }
        }
        if (ObjectUtils.isNotEmpty((Object)productTpl.get("units"))) {
            productTpl.setUnits(productTpl.getBizObjects("units", ProductTplUnit.class));
        }
        this.convertTplCharacter(productTpl.freeCharacters());
        productTpl.remove("brands");
        productTpl.remove("parameters");
        productTpl.remove("assistUnits");
        productTpl.remove("orderProperties");
        productTpl.remove("cycleProperties");
        productTpl.remove("units");
        return productTpl;
    }

    private void convertTplCharacter(List<ProductTplCharacter> tplCharacters) {
        if (ObjectUtils.isNotEmpty(tplCharacters)) {
            for (ProductTplCharacter tplCharacter : tplCharacters) {
                if (!ObjectUtils.isNotEmpty((Object)tplCharacter)) continue;
                tplCharacter.setBOMAffec(tplCharacter.getInteger("bomAffec"));
                tplCharacter.setSNSens(tplCharacter.getInteger("snSens"));
            }
        }
    }

    private void dataMaterialTplPreprocessing(String matchRule, MaterialTplVO materialTplVO) {
        if (Objects.isNull(materialTplVO)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801155);
        }
        ProductTplServiceImpl.matchRuleMaterialTpl(matchRule, materialTplVO);
        ProductTplServiceImpl.matchRuleMaterialTplBrand(matchRule, materialTplVO);
        ProductTplServiceImpl.matchRuleMaterialTplOrderPropertie(matchRule, materialTplVO);
        ProductTplServiceImpl.matchRuleMaterialTplCyclePropertie(matchRule, materialTplVO);
        ProductTplServiceImpl.matchRuleMaterialTplUnit(matchRule, materialTplVO);
        ProductTplServiceImpl.matchRuleMaterialTplAssistUnitExchange(matchRule, materialTplVO);
        ProductTplServiceImpl.matchRuleMaterialTplFreeCharacter(matchRule, materialTplVO);
        ProductTplServiceImpl.matchRuleMaterialTplProductPropCharacter(matchRule, materialTplVO);
        ProductTplServiceImpl.matchRuleMaterialTplSkuCharacter(matchRule, materialTplVO);
        ProductTplServiceImpl.matchRuleMaterialTplOptionCharacter(matchRule, materialTplVO);
    }

    private static void matchRuleMaterialTplOptionCharacter(String matchRule, MaterialTplVO materialTplVO) {
        if (ObjectUtils.isNotEmpty((Object)materialTplVO.getOptionCharacters())) {
            ProductTplServiceImpl.matchRuleMaterialTplCharacter(materialTplVO.getOptionCharacters(), matchRule);
        }
    }

    private static void matchRuleMaterialTplSkuCharacter(String matchRule, MaterialTplVO materialTplVO) {
        if (ObjectUtils.isNotEmpty((Object)materialTplVO.getSkuCharacters())) {
            ProductTplServiceImpl.matchRuleMaterialTplCharacter(materialTplVO.getSkuCharacters(), matchRule);
        }
    }

    private static void matchRuleMaterialTplProductPropCharacter(String matchRule, MaterialTplVO materialTplVO) {
        if (ObjectUtils.isNotEmpty((Object)materialTplVO.getProductPropCharacters())) {
            ProductTplServiceImpl.matchRuleMaterialTplCharacter(materialTplVO.getProductPropCharacters(), matchRule);
        }
    }

    private static void matchRuleMaterialTplFreeCharacter(String matchRule, MaterialTplVO materialTplVO) {
        if (ObjectUtils.isNotEmpty((Object)materialTplVO.getFreeCharacters())) {
            ProductTplServiceImpl.matchRuleMaterialTplCharacter(materialTplVO.getFreeCharacters(), matchRule);
        }
    }

    private static void matchRuleMaterialTplCharacter(List<MaterialTplCharacterVO> tplCharacterVOS, String matchRule) {
        for (MaterialTplCharacterVO tplCharacterVO : tplCharacterVOS) {
            tplCharacterVO.setCharacterCode(tplCharacterVO.getCharacter___code());
            if (tplCharacterVO.getCharacteristics() != null && !"".equals(tplCharacterVO.getCharacteristics())) {
                tplCharacterVO.setCharacteristics___code(null);
            }
            if (tplCharacterVO.getCharacter() == null || "".equals(tplCharacterVO.getCharacter())) continue;
            tplCharacterVO.setCharacter___code(null);
        }
    }

    private static void matchRuleMaterialTplAssistUnitExchange(String matchRule, MaterialTplVO materialTplVO) {
        if (ObjectUtils.isNotEmpty((Object)materialTplVO.getAssistUnits())) {
            for (MaterialTplAssistUnitVO assistUnitExchange : materialTplVO.getAssistUnits()) {
                if (assistUnitExchange.getAssistUnit() == null || "".equals(assistUnitExchange.getAssistUnit())) continue;
                assistUnitExchange.setAssistUnit___code(null);
            }
        }
    }

    private static void matchRuleMaterialTplUnit(String matchRule, MaterialTplVO materialTplVO) {
        if (ObjectUtils.isNotEmpty((Object)materialTplVO.getUnits())) {
            for (MaterialTplUnitVO unit : materialTplVO.getUnits()) {
                if (unit.getUnit() != null && !"".equals(unit.getUnit())) {
                    unit.setUnit___code(null);
                }
                if (unit.getStockUnit() != null && !"".equals(unit.getStockUnit())) {
                    unit.setStockUnit___code(null);
                }
                if (unit.getPurchaseUnit() != null && !"".equals(unit.getPurchaseUnit())) {
                    unit.setPurchaseUnit___code(null);
                }
                if (unit.getPurchasePriceUnit() != null && !"".equals(unit.getPurchasePriceUnit())) {
                    unit.setPurchasePriceUnit___code(null);
                }
                if (unit.getOnlineUnit() != null && !"".equals(unit.getOnlineUnit())) {
                    unit.setOnlineUnit___code(null);
                }
                if (unit.getOfflineUnit() != null && !"".equals(unit.getOfflineUnit())) {
                    unit.setOfflineUnit___code(null);
                }
                if (unit.getBatchUnit() != null && !"".equals(unit.getBatchUnit())) {
                    unit.setBatchUnit___code(null);
                }
                if (unit.getBatchPriceUnit() != null && !"".equals(unit.getBatchPriceUnit())) {
                    unit.setBatchPriceUnit___code(null);
                }
                if (unit.getRequireUnit() != null && !"".equals(unit.getRequireUnit())) {
                    unit.setRequireUnit___code(null);
                }
                if (unit.getProduceUnit() != null && !"".equals(unit.getProduceUnit())) {
                    unit.setProduceUnit___code(null);
                }
                if (unit.getInspectionUnit() != null && !"".equals(unit.getInspectionUnit())) {
                    unit.setInspectionUnit___code(null);
                }
                if (unit.getDemandPlanningUnit() == null || "".equals(unit.getDemandPlanningUnit())) continue;
                unit.setDemandPlanningUnit___code(null);
            }
        }
    }

    private static void matchRuleMaterialTplCyclePropertie(String matchRule, MaterialTplVO materialTplVO) {
        if (ObjectUtils.isNotEmpty((Object)materialTplVO.getCycleProperties())) {
            for (MaterialTplCyclePropertyVO cycleProperty : materialTplVO.getCycleProperties()) {
                if (cycleProperty.getPropertyType() == null || "".equals(cycleProperty.getPropertyType())) continue;
                cycleProperty.setPropertyType___name(null);
            }
        }
    }

    private static void matchRuleMaterialTplOrderPropertie(String matchRule, MaterialTplVO materialTplVO) {
        if (ObjectUtils.isNotEmpty((Object)materialTplVO.getOrderProperties())) {
            for (MaterialTplOrderPropertyVO orderProperty : materialTplVO.getOrderProperties()) {
                if (orderProperty.getPropertyType() == null || "".equals(orderProperty.getPropertyType())) continue;
                orderProperty.setPropertyType___showItem(null);
            }
        }
    }

    private static void matchRuleMaterialTplBrand(String matchRule, MaterialTplVO materialTplVO) {
        if (ObjectUtils.isNotEmpty((Object)materialTplVO.getBrands())) {
            for (MaterialTplBrandVO brand : materialTplVO.getBrands()) {
                if (brand.getBrand() == null || "".equals(brand.getBrand())) continue;
                brand.setBrand___code(null);
            }
        }
    }

    private static void matchRuleMaterialTpl(String matchRule, MaterialTplVO materialTplVO) {
        if (materialTplVO.getDeliveryType() != null && !"".equals(materialTplVO.getDeliveryType())) {
            materialTplVO.setDeliveryType___dt_name(null);
        }
        if (materialTplVO.getFreeCT() != null && !"".equals(materialTplVO.getFreeCT())) {
            materialTplVO.setFreeCT___code(null);
        }
        if (materialTplVO.getMaterialPropCT() != null && !"".equals(materialTplVO.getMaterialPropCT())) {
            materialTplVO.setMaterialPropCT___code(null);
        }
        if (materialTplVO.getSkuPropCT() != null && !"".equals(materialTplVO.getSkuPropCT())) {
            materialTplVO.setSkuPropCT___code(null);
        }
        if (materialTplVO.getOptionCT() != null && !"".equals(materialTplVO.getOptionCT())) {
            materialTplVO.setOptionCT___code(null);
        }
    }

    public String deleteMaterialTpl(String id, String name) throws Exception {
        ArrayList<QueryConditionPO> queryConditionPOS = new ArrayList<QueryConditionPO>();
        if (ObjectUtils.isNotEmpty((Object)id)) {
            queryConditionPOS.add(new QueryConditionPO("id", QueryOperatorEnum.EQ, id));
        } else if (ObjectUtils.isNotEmpty((Object)name)) {
            queryConditionPOS.add(new QueryConditionPO("name", QueryOperatorEnum.EQ, name));
        } else {
            return null;
        }
        List materialTplPOList = this.coreDocBaseDao.queryEntityByCondition((CoreDocBaseEntity)new MaterialTplPO(), queryConditionPOS);
        if (CollectionUtils.isEmpty((Collection)materialTplPOList)) {
            return null;
        }
        List productTplList = materialTplPOList.stream().map(v -> {
            ProductTpl productTpl = new ProductTpl();
            productTpl.setId((Object)v.getId());
            return productTpl;
        }).collect(Collectors.toList());
        BillDataDto bill = new BillDataDto();
        bill.setData(productTplList);
        bill.setBillnum("pc_producttpllist");
        try {
            RuleExecuteResult result = BillBiz.delete((BillDataDto)bill);
            if (!CollectionUtils.isEmpty((Collection)result.getMessages())) {
                return result.getMessages().get(0).toString();
            }
        }
        catch (Exception e) {
            return "Error deleting materia templates: " + e.getMessage();
        }
        return null;
    }
}


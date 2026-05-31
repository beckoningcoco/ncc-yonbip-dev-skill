/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.fasterxml.jackson.core.type.TypeReference
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 *  com.yonyou.iuap.BusinessException
 *  com.yonyou.iuap.apdoc.coredoc.attachment.service.AttachmentServiceImpl
 *  com.yonyou.iuap.apdoc.coredoc.constant.CoredocSDKConstant
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.ProductAPIUtils
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.po.pub.BatchApiQueryParamWithOrg
 *  com.yonyou.iuap.apdoc.coredoc.service.attachment.impl.UPCAttachmentTransService
 *  com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils
 *  com.yonyou.iuap.apdoc.coredoc.vo.brand.BrandVO
 *  com.yonyou.iuap.apdoc.coredoc.vo.brand.ProductTplBrandVO
 *  com.yonyou.iuap.fileservice.sdk.module.CooperationFileService
 *  com.yonyou.iuap.fileservice.sdk.module.pojo.BatchBusinessFilesRequest
 *  com.yonyou.iuap.fileservice.sdk.module.pojo.CooperationFileInfo
 *  com.yonyou.iuap.fileservice.sdk.module.pojo.CooperationFileVO
 *  com.yonyou.iuap.fileservice.sdk.module.pojo.CooperationSuiteFile
 *  com.yonyou.iuap.international.MultiLangText
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.iuap.yms.common.utils.JacksonUtils
 *  com.yonyou.ucf.mdd.common.model.ResultList
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService
 *  com.yonyou.ucf.mdd.ext.bill.biz.BillBiz
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils
 *  com.yonyoucloud.iuap.upc.api.IBrandService
 *  com.yonyoucloud.iuap.upc.dto.derivatives.BrandDTO
 *  com.yonyoucloud.iuap.upc.dto.derivatives.BrandQryDTO
 *  com.yonyoucloud.iuap.upc.dto.derivatives.ProductTplBrandDTO
 *  com.yonyoucloud.iuap.upc.dto.ext.UPCResultList
 *  com.yonyoucloud.iuap.upc.dto.openapi.OpenAPIDTO
 *  com.yonyoucloud.iuap.upc.vo.MultilingualVO
 *  com.yonyoucloud.upc.pc.brand.Brand
 *  com.yonyoucloud.upc.pc.brand.ProductTplBrand
 *  com.yonyoucloud.upc.utils.CoreDocJsonResult
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QueryField
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.ObjectUtils
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.service.api;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.type.TypeReference;
import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyou.iuap.BusinessException;
import com.yonyou.iuap.apdoc.coredoc.attachment.service.AttachmentServiceImpl;
import com.yonyou.iuap.apdoc.coredoc.constant.CoredocSDKConstant;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.ProductAPIUtils;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.po.pub.BatchApiQueryParamWithOrg;
import com.yonyou.iuap.apdoc.coredoc.service.attachment.impl.UPCAttachmentTransService;
import com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils;
import com.yonyou.iuap.apdoc.coredoc.vo.brand.BrandVO;
import com.yonyou.iuap.apdoc.coredoc.vo.brand.ProductTplBrandVO;
import com.yonyou.iuap.fileservice.sdk.module.CooperationFileService;
import com.yonyou.iuap.fileservice.sdk.module.pojo.BatchBusinessFilesRequest;
import com.yonyou.iuap.fileservice.sdk.module.pojo.CooperationFileInfo;
import com.yonyou.iuap.fileservice.sdk.module.pojo.CooperationFileVO;
import com.yonyou.iuap.fileservice.sdk.module.pojo.CooperationSuiteFile;
import com.yonyou.iuap.international.MultiLangText;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.iuap.yms.common.utils.JacksonUtils;
import com.yonyou.ucf.mdd.common.model.ResultList;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService;
import com.yonyou.ucf.mdd.ext.bill.biz.BillBiz;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils;
import com.yonyoucloud.iuap.ipass.utils.IPassServiceUtils;
import com.yonyoucloud.iuap.upc.api.IBrandService;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.iuap.upc.dto.derivatives.BrandDTO;
import com.yonyoucloud.iuap.upc.dto.derivatives.BrandQryDTO;
import com.yonyoucloud.iuap.upc.dto.derivatives.ProductTplBrandDTO;
import com.yonyoucloud.iuap.upc.dto.ext.UPCResultList;
import com.yonyoucloud.iuap.upc.dto.openapi.OpenAPIDTO;
import com.yonyoucloud.iuap.upc.vo.MultilingualVO;
import com.yonyoucloud.upc.pc.brand.Brand;
import com.yonyoucloud.upc.pc.brand.ProductTplBrand;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QueryField;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

@Service
@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public class BrandServiceImpl
implements IBrandService {
    private static final Logger log = LoggerFactory.getLogger(BrandServiceImpl.class);
    private static final String[] BRAND_BASE_FIELDS = new String[]{"id", "code", "name", "orderNumber", "randKeywords", "brandUrl", "stopStatus", "brandDesc", "brandClass", "brandClassCode", "brandClassName", "adImage", "brandLogo", "brandCharacterDef"};
    private static final int MAX_COUNT = 5000;
    @Autowired
    private ApiImportCommandService apiImportSingleService;
    @Autowired
    private AttachmentServiceImpl attachmentService;
    @Autowired
    CooperationFileService cooperationFileService;
    @Autowired
    private IUPCBillService billService;
    @Autowired
    private UPCAttachmentTransService attachmentTransService;

    public CoreDocJsonResult<BrandDTO> queryByID(Long id) throws Exception {
        if (null != id) {
            try {
                BrandDTO brandDTO = null;
                QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)ProductAPIUtils.brandFieldMap, (String[])BRAND_BASE_FIELDS);
                QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)id)}));
                schema.addSelect("brandLogoBusinessId, adImageBusinessId");
                List result = MetaDaoHelper.query((String)"pc.brand.Brand", (boolean)true, (QuerySchema)schema, null);
                HashMap<Long, Map> character = new HashMap<Long, Map>();
                if (result != null && result.size() == 1) {
                    Map brand = (Map)result.get(0);
                    if ((brand = UpcAPiTool.handleMultilingual((Map)brand, (String[])new String[]{"name", "brandDesc", "randKeywords", "brandUrl"})).get("brandCharacterDef") instanceof Map) {
                        character.put((Long)brand.get("id"), (Map)brand.get("brandCharacterDef"));
                    } else {
                        brand.remove("brandCharacterDef");
                    }
                    this.queryAndSetBrandAttachments(brand);
                    brandDTO = (BrandDTO)JSON.parseObject((String)JSON.toJSONString((Object)brand), BrandDTO.class);
                }
                if (brandDTO != null) {
                    schema = QuerySchema.create().addSelect("id, productTplTemp, productTplTemp.name as productTplTempName").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"brand").eq((Object)brandDTO.getId())}));
                    List productTplTemps = MetaDaoHelper.query((String)"pc.brand.ProductTplBrand", (QuerySchema)schema);
                    brandDTO.setBrandCharacterDef((Map)character.get(brandDTO.getId()));
                    List productTplBrandDTOs = JSON.parseArray((String)JSON.toJSONString((Object)productTplTemps), ProductTplBrandDTO.class);
                    brandDTO.setProductTplBrands(productTplBrandDTOs);
                    return CoreDocJsonResult.success(brandDTO);
                }
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.RESULT_IS_NULL));
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(businessException.getMessage()));
            }
            catch (Exception e) {
                log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17A2451E04200099", (String)"\u6839\u636eID\u67e5\u8be2\u54c1\u724c\u4fe1\u606f\u9519\u8bef:") + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<BrandDTO> queryByIDList(List<Long> idList) throws Exception {
        if (null != idList) {
            try {
                List brandDTOs = null;
                QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)ProductAPIUtils.brandFieldMap, (String[])BRAND_BASE_FIELDS);
                QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(idList)}));
                List result = MetaDaoHelper.query((String)"pc.brand.Brand", (boolean)true, (QuerySchema)schema, null);
                if (result != null && result.size() > 0) {
                    String[] names = new String[]{"name", "brandDesc", "randKeywords", "brandUrl"};
                    for (Map brand : result) {
                        brand = UpcAPiTool.handleMultilingual((Map)brand, (String[])names);
                    }
                    brandDTOs = JSON.parseArray((String)JSON.toJSONString((Object)result), BrandDTO.class);
                }
                if (!CollectionUtils.isEmpty(brandDTOs)) {
                    return CoreDocJsonResult.success(brandDTOs);
                }
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.RESULT_IS_NULL));
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17A2451E04200099", (String)"\u6839\u636eID\u67e5\u8be2\u54c1\u724c\u4fe1\u606f\u9519\u8bef:") + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<BrandDTO> queryByCode(String code) throws Exception {
        if (null != code) {
            try {
                BrandDTO brandDTO = null;
                QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)ProductAPIUtils.brandFieldMap, (String[])BRAND_BASE_FIELDS);
                QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)code)}));
                schema.addSelect("brandLogoBusinessId, adImageBusinessId");
                List result = MetaDaoHelper.query((String)"pc.brand.Brand", (boolean)true, (QuerySchema)schema, null);
                HashMap<Long, Map> character = new HashMap<Long, Map>();
                if (result != null && result.size() == 1) {
                    Map brand = (Map)result.get(0);
                    if ((brand = UpcAPiTool.handleMultilingual((Map)brand, (String[])new String[]{"name", "brandDesc", "randKeywords", "brandUrl"})).get("brandCharacterDef") instanceof Map) {
                        character.put((Long)brand.get("id"), (Map)brand.get("brandCharacterDef"));
                    } else {
                        brand.remove("brandCharacterDef");
                    }
                    this.queryAndSetBrandAttachments(brand);
                    brandDTO = (BrandDTO)JSON.parseObject((String)JSON.toJSONString((Object)brand), BrandDTO.class);
                }
                if (brandDTO != null) {
                    schema = QuerySchema.create().addSelect("id, productTplTemp, productTplTemp.name as productTplTempName").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"brand").eq((Object)brandDTO.getId())}));
                    List productTplTemps = MetaDaoHelper.query((String)"pc.brand.ProductTplBrand", (QuerySchema)schema);
                    brandDTO.setBrandCharacterDef((Map)character.get(brandDTO.getId()));
                    List productTplBrandDTOs = JSON.parseArray((String)JSON.toJSONString((Object)productTplTemps), ProductTplBrandDTO.class);
                    brandDTO.setProductTplBrands(productTplBrandDTOs);
                    return CoreDocJsonResult.success(brandDTO);
                }
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.RESULT_IS_NULL));
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17A2451E0420009B", (String)"\u6839\u636e\u7f16\u7801\u67e5\u8be2\u54c1\u724c\u4fe1\u606f\u9519\u8bef:") + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<BrandDTO> queryByCodeList(List<String> codeList) throws Exception {
        if (null != codeList) {
            try {
                List brandDTOs = null;
                QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)ProductAPIUtils.brandFieldMap, (String[])BRAND_BASE_FIELDS);
                QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").in(codeList)}));
                schema.addSelect("brandLogoBusinessId, adImageBusinessId");
                List result = MetaDaoHelper.query((String)"pc.brand.Brand", (boolean)true, (QuerySchema)schema, null);
                if (result != null && result.size() > 0) {
                    String[] names = new String[]{"name", "brandDesc", "randKeywords", "brandUrl"};
                    for (Map brand : result) {
                        brand = UpcAPiTool.handleMultilingual((Map)brand, (String[])names);
                    }
                    this.batchQueryAndSetBrandAttachments(result);
                    brandDTOs = JSON.parseArray((String)JSON.toJSONString((Object)result), BrandDTO.class);
                }
                if (!CollectionUtils.isEmpty(brandDTOs)) {
                    return CoreDocJsonResult.success(brandDTOs);
                }
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.RESULT_IS_NULL));
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error("\u6839\u636eID\u67e5\u8be2\u54c1\u724c\u4fe1\u606f\u9519\u8bef:" + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<BrandDTO> listByPage(BrandQryDTO brandQryDTO) throws Exception {
        if (null != brandQryDTO) {
            try {
                List brandDTOs = null;
                QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)ProductAPIUtils.brandFieldMap, (String[])BRAND_BASE_FIELDS);
                QueryConditionGroup conditionGroup = this.buildBrandQueryConditionGroup(brandQryDTO);
                Integer pageIndex = brandQryDTO.getPageIndex();
                Integer pageSize = brandQryDTO.getPageSize();
                if (pageIndex == null || pageIndex < 0) {
                    pageIndex = 1;
                }
                if (pageSize == null || pageSize > 5000) {
                    pageSize = 5000;
                }
                QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)conditionGroup).addPager(pageIndex.intValue(), pageSize.intValue());
                schema.addSelect("brandLogoBusinessId, adImageBusinessId");
                List result = MetaDaoHelper.query((String)"pc.brand.Brand", (boolean)true, (QuerySchema)schema, null);
                HashMap<Long, Map> character = new HashMap<Long, Map>();
                if (result != null && result.size() <= 5000) {
                    String[] names = new String[]{"name", "brandDesc", "randKeywords", "brandUrl"};
                    for (Map brand : result) {
                        if ((brand = UpcAPiTool.handleMultilingual((Map)brand, (String[])names)).get("brandCharacterDef") instanceof Map) {
                            character.put((Long)brand.get("id"), (Map)brand.get("brandCharacterDef"));
                            continue;
                        }
                        brand.remove("brandCharacterDef");
                    }
                    this.batchQueryAndSetBrandAttachments(result);
                    brandDTOs = JSON.parseArray((String)JSON.toJSONString((Object)result), BrandDTO.class);
                }
                if (!CollectionUtils.isEmpty(brandDTOs)) {
                    for (BrandDTO brandDTO : brandDTOs) {
                        brandDTO.setBrandCharacterDef((Map)character.get(brandDTO.getId()));
                    }
                    return CoreDocJsonResult.success((List)brandDTOs);
                }
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.RESULT_IS_NULL));
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error("\u6839\u636e\u7f16\u7801\u67e5\u8be2\u54c1\u724c\u4fe1\u606f\u9519\u8bef:" + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public Integer queryBrandCount(BrandQryDTO brandQryDTO) throws Exception {
        QueryConditionGroup conditionGroup = this.buildBrandQueryConditionGroup(brandQryDTO);
        QuerySchema schema = QuerySchema.create().addSelect("count(1) as count").addCondition((ConditionExpression)conditionGroup);
        Map result = MetaDaoHelper.queryOne((String)"pc.brand.Brand", (QuerySchema)schema);
        if (result != null && result.get("count") != null) {
            Integer count = Integer.valueOf(result.get("count").toString());
            return count;
        }
        return null;
    }

    public QueryConditionGroup buildBrandQueryConditionGroup(BrandQryDTO brandQryDTO) {
        QueryConditionGroup conditionGroup = new QueryConditionGroup();
        if (brandQryDTO != null) {
            if (brandQryDTO.getCode() != null) {
                conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").eq((Object)brandQryDTO.getCode()));
            }
            if (brandQryDTO.getName() != null) {
                conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"name").eq((Object)brandQryDTO.getName()));
            }
            if (brandQryDTO.getRandKeywords() != null) {
                conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"randKeywords").eq((Object)brandQryDTO.getRandKeywords()));
            }
            if (brandQryDTO.getBrandClass() != null) {
                conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"brandClass").eq((Object)brandQryDTO.getBrandClass()));
            }
            if (brandQryDTO.getBrandClassCode() != null) {
                conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"brandClass.code").eq((Object)brandQryDTO.getBrandClassCode()));
            }
            if (brandQryDTO.getBeganTime() != null) {
                conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"pubts").egt((Object)brandQryDTO.getBeganTime()));
            }
            if (brandQryDTO.getEndTime() != null) {
                conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"pubts").lt((Object)brandQryDTO.getEndTime()));
            }
            if (brandQryDTO.getPubts() != null) {
                conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"pubts").egt((Object)brandQryDTO.getPubts()));
            }
            if (!CollectionUtils.isEmpty((Map)brandQryDTO.getCharacterDefine())) {
                for (String key : brandQryDTO.getCharacterDefine().keySet()) {
                    conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)("brandCharacterDef." + key)).eq(brandQryDTO.getCharacterDefine().get(key)));
                }
            }
        }
        return conditionGroup;
    }

    public CoreDocJsonResult<BrandDTO> add(BrandDTO brandDTO) throws Exception {
        if (null != brandDTO) {
            try {
                Brand brand = this.handleAddBrand(brandDTO);
                BillDataDto billDataDto = new BillDataDto();
                billDataDto.setBillnum("pc_brand");
                billDataDto.setAction("save");
                billDataDto.setData((Object)brand);
                billDataDto.setFromApi(true);
                billDataDto.setConvertType(Integer.valueOf(3));
                Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
                BrandDTO brandDTO1 = new BrandDTO();
                brandDTO1.setId((Long)((Map)result).get("id"));
                return CoreDocJsonResult.success((Object)brandDTO1);
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error("\u54c1\u724c\u65b0\u589e\u9519\u8bef:" + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<BrandDTO> update(BrandDTO brandDTO) throws Exception {
        if (null != brandDTO) {
            try {
                Brand brand = this.handleUpdateBrand(brandDTO);
                BillDataDto billDataDto = new BillDataDto();
                billDataDto.setBillnum("pc_brand");
                billDataDto.setAction("save");
                billDataDto.setData((Object)brand);
                billDataDto.setFromApi(true);
                billDataDto.setConvertType(Integer.valueOf(3));
                Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
                BrandDTO brandDTO1 = new BrandDTO();
                brandDTO1.setId((Long)((Map)result).get("id"));
                return CoreDocJsonResult.success((Object)brandDTO1);
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error("\u54c1\u724c\u66f4\u65b0\u9519\u8bef:" + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<UPCResultList> batchAdd(List<BrandDTO> brandDTOs) throws Exception {
        if (null != brandDTOs) {
            try {
                if (brandDTOs.size() == 0 || brandDTOs.size() > CoredocSDKConstant.MAX_NUM_FOR_SIMPLE) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801371);
                }
                ArrayList<Brand> brandList = new ArrayList<Brand>();
                for (BrandDTO brandDTO : brandDTOs) {
                    Brand brand = this.handleAddBrand(brandDTO);
                    brandList.add(brand);
                }
                BillDataDto billDataDto = new BillDataDto();
                billDataDto.setBillnum("pc_brand");
                billDataDto.setAction("save");
                billDataDto.setData(brandList);
                billDataDto.setFromApi(true);
                billDataDto.setConvertType(Integer.valueOf(3));
                com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList resultList = this.billService.batchSave(billDataDto);
                UPCResultList result = UpcAPiTool.resultConvertOpenApi((ResultList)resultList);
                return CoreDocJsonResult.success((Object)result);
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error("\u54c1\u724c\u6279\u91cf\u4fdd\u5b58\u9519\u8bef:" + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<UPCResultList> batchUpdate(List<BrandDTO> brandDTOs) throws Exception {
        if (null != brandDTOs) {
            try {
                if (brandDTOs.size() == 0 || brandDTOs.size() > CoredocSDKConstant.MAX_NUM_FOR_SIMPLE) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801371);
                }
                ArrayList<Brand> brandList = new ArrayList<Brand>();
                for (BrandDTO brandDTO : brandDTOs) {
                    Brand brand = this.handleUpdateBrand(brandDTO);
                    brandList.add(brand);
                }
                BillDataDto billDataDto = new BillDataDto();
                billDataDto.setBillnum("pc_brand");
                billDataDto.setAction("save");
                billDataDto.setData(brandList);
                billDataDto.setFromApi(true);
                billDataDto.setConvertType(Integer.valueOf(3));
                com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList resultList = this.billService.batchSave(billDataDto);
                UPCResultList result = UpcAPiTool.resultConvertOpenApi((ResultList)resultList);
                return CoreDocJsonResult.success((Object)result);
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error("\u54c1\u724c\u6279\u91cf\u66f4\u65b0\u9519\u8bef:" + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    private void checkBrandDTO(BrandDTO brandDTO) throws Exception {
        List queryResult;
        QuerySchema schema;
        if (brandDTO.getName() != null && brandDTO.getName().getSimplifiedName() != null) {
            schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"name").eq((Object)brandDTO.getName().getSimplifiedName())}));
            queryResult = MetaDaoHelper.query((String)"pc.brand.Brand", (QuerySchema)schema);
            if (!CollectionUtils.isEmpty((Collection)queryResult)) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801399, new Object[]{brandDTO.getName().getSimplifiedName()});
            }
        } else {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801400);
        }
        if (brandDTO.getCode() != null && !CollectionUtils.isEmpty((Collection)(queryResult = MetaDaoHelper.query((String)"pc.brand.Brand", (QuerySchema)(schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)brandDTO.getCode())}))))))) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801401, new Object[]{brandDTO.getCode()});
        }
    }

    public void queryAndSetBrandAttachments(Map<String, Object> brand) {
        if (brand.get("brandLogoBusinessId") != null) {
            List brandLogoBusinessId = null;
            try {
                brandLogoBusinessId = this.cooperationFileService.queryFileList("iuap-apdoc-material", brand.get("brandLogoBusinessId").toString(), 1, 50);
            }
            catch (Exception e) {
                log.error("\u54c1\u724c\u67e5\u8be2\u9644\u4ef6\u660e\u7ec6\u5f02\u5e38\uff1a" + e.getMessage(), (Throwable)e);
            }
            if (!CollectionUtils.isEmpty((Collection)brandLogoBusinessId)) {
                brand.put("brandLogo", ((CooperationFileInfo)brandLogoBusinessId.get(0)).getBucketUrl());
            }
        }
        if (brand.get("adImageBusinessId") != null) {
            List adImageBusinessId = null;
            try {
                adImageBusinessId = this.cooperationFileService.queryFileList("iuap-apdoc-material", brand.get("adImageBusinessId").toString(), 1, 50);
            }
            catch (Exception e) {
                log.error("\u54c1\u724c\u67e5\u8be2\u9644\u4ef6\u660e\u7ec6\u5f02\u5e38\uff1a" + e.getMessage(), (Throwable)e);
            }
            if (!CollectionUtils.isEmpty((Collection)adImageBusinessId)) {
                brand.put("adImage", ((CooperationFileInfo)adImageBusinessId.get(0)).getBucketUrl());
            }
        }
    }

    public void batchQueryAndSetBrandAttachments(List<HashMap<String, Object>> brandList) {
        if (CollectionUtils.isEmpty(brandList)) {
            return;
        }
        ArrayList<String> businessIdList = new ArrayList<String>(brandList.size());
        for (Map map : brandList) {
            if (map.get("brandLogoBusinessId") != null) {
                businessIdList.add(map.get("brandLogoBusinessId").toString());
            }
            if (map.get("adImageBusinessId") == null) continue;
            businessIdList.add(map.get("adImageBusinessId").toString());
        }
        if (CollectionUtils.isEmpty(businessIdList)) {
            return;
        }
        CooperationSuiteFile cooperationSuiteFile = null;
        try {
            ArrayList<BatchBusinessFilesRequest> arrayList = new ArrayList<BatchBusinessFilesRequest>();
            BatchBusinessFilesRequest batchBusinessFilesRequest = new BatchBusinessFilesRequest();
            batchBusinessFilesRequest.setBusinessType("iuap-apdoc-material");
            batchBusinessFilesRequest.setBusinessIds(businessIdList);
            batchBusinessFilesRequest.setCancelFileExit(Boolean.valueOf(true));
            arrayList.add(batchBusinessFilesRequest);
            cooperationSuiteFile = this.cooperationFileService.batchBusinessFiles(arrayList);
        }
        catch (Exception exception) {
            log.error("\u54c1\u724c\u6279\u91cf\u67e5\u8be2\u9644\u4ef6\u660e\u7ec6\u5f02\u5e38\uff1a" + exception.getMessage(), (Throwable)exception);
        }
        if (cooperationSuiteFile != null && !CollectionUtils.isEmpty((Collection)cooperationSuiteFile.getData())) {
            List list = cooperationSuiteFile.getData();
            HashMap<String, CooperationFileVO> fileMap = new HashMap<String, CooperationFileVO>(list.size());
            for (CooperationFileVO cooperationFileVO : list) {
                fileMap.put(cooperationFileVO.getObjectId(), cooperationFileVO);
            }
            for (Map map : brandList) {
                CooperationFileVO adFile;
                String url;
                CooperationFileVO logoFile;
                if (map.get("brandLogoBusinessId") != null && (logoFile = (CooperationFileVO)fileMap.get(map.get("brandLogoBusinessId").toString())) != null) {
                    url = this.attachmentTransService.dealFileUrl(logoFile.getBucketUrl());
                    map.put("brandLogo", url);
                }
                if (map.get("adImageBusinessId") == null || (adFile = (CooperationFileVO)fileMap.get(map.get("adImageBusinessId").toString())) == null) continue;
                url = this.attachmentTransService.dealFileUrl(adFile.getBucketUrl());
                map.put("adImage", url);
            }
        }
    }

    public Brand handleAddBrand(BrandDTO brandDTO) throws Exception {
        this.checkBrandDTO(brandDTO);
        Brand brand = new Brand();
        brand.put("_fromApi", (Object)true);
        brand.put("_status", (Object)EntityStatus.Insert);
        Map map = (Map)JSON.parseObject((String)JSON.toJSONString((Object)brandDTO), HashMap.class);
        brand.putAll(map);
        if (brandDTO.getName() != null) {
            brand.set("name", (Object)UpcAPiTool.handleMultilingual((MultilingualVO)brandDTO.getName()));
        }
        if (brandDTO.getBrandDesc() != null) {
            brand.set("brandDesc", (Object)UpcAPiTool.handleMultilingual((MultilingualVO)brandDTO.getBrandDesc()));
        }
        if (brandDTO.getRandKeywords() != null) {
            brand.set("randKeywords", (Object)UpcAPiTool.handleMultilingual((MultilingualVO)brandDTO.getRandKeywords()));
        }
        if (brandDTO.getBrandUrl() != null) {
            brand.set("brandUrl", (Object)UpcAPiTool.handleMultilingual((MultilingualVO)brandDTO.getBrandUrl()));
        }
        DataTransferUtils.fill((String)"pc_brand", (String)"pc.brand.Brand", (Object)brand, (int)3);
        if (brandDTO.getStopStatus() != null && !brandDTO.getStopStatus().booleanValue()) {
            brand.put("stopstatus", (Object)0);
        } else if (brandDTO.getStopStatus() != null && brandDTO.getStopStatus().booleanValue()) {
            brand.put("stopstatus", (Object)1);
        } else if (brandDTO.getStopStatus() == null) {
            brand.put("stopstatus", (Object)0);
        }
        if (brandDTO.getOrderNumber() != null) {
            brand.set("ordernumber", (Object)brandDTO.getOrderNumber());
        } else {
            brand.set("ordernumber", (Object)0);
        }
        if (brand.productTplBrands() != null) {
            QuerySchema schema;
            List queryResult;
            ArrayList tplIds = new ArrayList();
            brand.productTplBrands().forEach(productTplBrand -> {
                if (productTplBrand.getProductTplTemp() != null) {
                    tplIds.add(productTplBrand.getProductTplTemp());
                }
                productTplBrand.set("_status", (Object)EntityStatus.Insert);
            });
            if (!CollectionUtils.isEmpty(tplIds) && (queryResult = MetaDaoHelper.query((String)"pc.tpl.ProductTpl", (QuerySchema)(schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(tplIds)}))))) != null && tplIds.size() != queryResult.size()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801402, new Object[]{brand.getCode()});
            }
        }
        return brand;
    }

    public Brand handleUpdateBrand(BrandDTO brandDTO) throws Exception {
        Map characterId;
        QuerySchema schema;
        Map query;
        if (brandDTO.getId() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801403);
        }
        QuerySchema querySchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)brandDTO.getId())}));
        List queryId = MetaDaoHelper.query((String)"pc.brand.Brand", (QuerySchema)querySchema);
        if (queryId != null && queryId.size() != 1) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801404, new Object[]{brandDTO.getId()});
        }
        Brand brand = new Brand();
        brand.put("_fromApi", (Object)true);
        brand.put("_status", (Object)EntityStatus.Update);
        Map map = (Map)JSON.parseObject((String)JSON.toJSONString((Object)brandDTO), HashMap.class);
        brand.putAll(map);
        if (brandDTO.getName() != null) {
            brand.set("name", (Object)UpcAPiTool.handleMultilingual((MultilingualVO)brandDTO.getName()));
        }
        if (brandDTO.getBrandDesc() != null) {
            brand.set("brandDesc", (Object)UpcAPiTool.handleMultilingual((MultilingualVO)brandDTO.getBrandDesc()));
        }
        if (brandDTO.getRandKeywords() != null) {
            brand.set("randKeywords", (Object)UpcAPiTool.handleMultilingual((MultilingualVO)brandDTO.getRandKeywords()));
        }
        if (brandDTO.getBrandUrl() != null) {
            brand.set("brandUrl", (Object)UpcAPiTool.handleMultilingual((MultilingualVO)brandDTO.getBrandUrl()));
        }
        DataTransferUtils.fill((String)"pc_brand", (String)"pc.brand.Brand", (Object)brand, (int)3);
        if (brandDTO.getStopStatus() != null && !brandDTO.getStopStatus().booleanValue()) {
            brand.put("stopstatus", (Object)0);
        } else if (brandDTO.getStopStatus() != null && brandDTO.getStopStatus().booleanValue()) {
            brand.put("stopstatus", (Object)1);
        }
        if (brand.productTplBrands() != null) {
            QuerySchema schema2;
            List queryResult;
            ArrayList tplIds = new ArrayList();
            brand.productTplBrands().forEach(productTplBrand -> {
                if (productTplBrand.get("_status") == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801405, new Object[]{brandDTO.getId()});
                }
                if (!EntityStatus.Delete.equals((Object)productTplBrand.getEntityStatus()) && !EntityStatus.Insert.equals((Object)productTplBrand.getEntityStatus())) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801406, new Object[]{brandDTO.getId()});
                }
                if (productTplBrand.getProductTplTemp() != null && !EntityStatus.Delete.equals((Object)productTplBrand.getEntityStatus())) {
                    tplIds.add(productTplBrand.getProductTplTemp());
                }
            });
            if (!CollectionUtils.isEmpty(tplIds) && (queryResult = MetaDaoHelper.query((String)"pc.tpl.ProductTpl", (QuerySchema)(schema2 = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(tplIds)}))))) != null && tplIds.size() != queryResult.size()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801407, new Object[]{brandDTO.getId()});
            }
        }
        if ((query = MetaDaoHelper.queryOne((String)"pc.brand.Brand", (QuerySchema)(schema = QuerySchema.create().addSelect("brandCharacterDef,stopstatus").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(brand.getId())}))))) != null && query.get("brandCharacterDef") != null && brand.get("brandCharacterDef") != null && (characterId = (Map)query.get("brandCharacterDef")).get("id") != null) {
            Map character = (Map)brand.get("brandCharacterDef");
            character.put("id", characterId.get("id").toString());
            brand.put("brandCharacterDef", (Object)character);
        }
        if (query != null && query.get("stopstatus") != null && brand.get("stopstatus") == null) {
            brand.put("stopstatus", query.get("stopstatus"));
        }
        return brand;
    }

    public CoreDocJsonResult<BrandDTO> addIdempotent(OpenAPIDTO<BrandDTO> dto) {
        if (dto == null || dto.getData() == null) {
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
        }
        try {
            BrandDTO brandDTO = (BrandDTO)dto.getData();
            CoreDocJsonResult<BrandDTO> saveResult = this.add(brandDTO);
            return saveResult;
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)businessException);
        }
        catch (Exception e) {
            log.error("\u54c1\u724c\u65b0\u589e-\u5e42\u7b49\u9519\u8bef:" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    public CoreDocJsonResult<BrandVO> queryBrand(BatchApiQueryParamWithOrg batchApiQueryParamWithOrg) throws Exception {
        CoreDocJsonResult coreDocJsonResult;
        int recordCount = IPassServiceUtils.getRecordsCount(batchApiQueryParamWithOrg, "pc.brand.Brand");
        if (recordCount > 0) {
            if (batchApiQueryParamWithOrg.getPageSize() > (long)UpcAPiTool.PAGE_MAX_SIZE.intValue()) {
                batchApiQueryParamWithOrg.setPageSize((long)UpcAPiTool.PAGE_MAX_SIZE.intValue());
            }
            QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)ProductAPIUtils.brandFieldMap, (String[])BRAND_BASE_FIELDS);
            QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)IPassServiceUtils.getQueryConditionGroup(batchApiQueryParamWithOrg)).addPager(Long.valueOf(batchApiQueryParamWithOrg.getPageIndex()).intValue(), Long.valueOf(batchApiQueryParamWithOrg.getPageSize()).intValue());
            schema.addSelect(new String[]{"brandLogoBusinessId", "adImageBusinessId"});
            List brandList = MetaDaoHelper.queryObject((String)"pc.brand.Brand", (boolean)true, (QuerySchema)schema, null);
            ArrayList<BrandVO> brandVOList = new ArrayList<BrandVO>();
            for (Brand brand : brandList) {
                BrandVO brandVO = (BrandVO)JSON.parseObject((String)JSON.toJSONString((Object)brand), BrandVO.class);
                if (brand.get("name") != null) {
                    brandVO.setName(new MultiLangText((Map)brand.get("name")));
                }
                if (brand.get("randKeywords") != null) {
                    brandVO.setRandKeywords(new MultiLangText((Map)brand.get("randKeywords")));
                }
                if (brand.get("brandDesc") != null) {
                    brandVO.setBrandDesc(new MultiLangText((Map)brand.get("brandDesc")));
                }
                if (brand.get("brandUrl") != null) {
                    brandVO.setBrandUrl(new MultiLangText((Map)brand.get("brandUrl")));
                }
                if (brand.get("brandClassCode") != null) {
                    brandVO.setBrandClass___code(brand.get("brandClassCode").toString());
                }
                if (brand.get("brandClassName") != null) {
                    brandVO.setBrandClass___name(brand.get("brandClassName").toString());
                }
                List productTplTemps = MetaDaoHelper.query((String)"pc.brand.ProductTplBrand", (QuerySchema)QuerySchema.create().addSelect("id, brand, productTplTemp, productTplTemp.name as productTplTemp___name").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"brand").eq(brand.getId())})));
                List productTplBrandVOS = (List)UpcJacksonUtils.OBJECT_MAPPER.readValue(UpcJacksonUtils.OBJECT_MAPPER.writeValueAsString((Object)productTplTemps), (TypeReference)new TypeReference<List<ProductTplBrandVO>>(){});
                brandVO.setProductTplBrands(productTplBrandVOS);
                brandVOList.add(brandVO);
            }
            coreDocJsonResult = CoreDocJsonResult.success(brandVOList);
        } else {
            coreDocJsonResult = CoreDocJsonResult.success(null);
        }
        coreDocJsonResult.setTotalCount(Integer.valueOf(recordCount));
        return coreDocJsonResult;
    }

    public Long brandSave(String matchRule, BrandVO brandVO) throws Exception {
        Long id = 0L;
        Brand brand = this.convertBrand(matchRule, brandVO);
        this.dataPreprocessing(matchRule, brand);
        brand.put("_fromApi", (Object)true);
        BillDataDto billDataDto = UpcAPiTool.builderBillData((String)"pc_brand", (Object)brand, (boolean)true, (int)4);
        Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
        if (result != null) {
            id = (Long)((Brand)result).getId();
        }
        return id;
    }

    private void dataPreprocessing(String matchRule, Brand brand) throws Exception {
        if (!"id".equals(matchRule)) {
            QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)brand.getCode())});
            QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)condition);
            List brandList = MetaDaoHelper.queryObject((String)"pc.brand.Brand", (boolean)true, (QuerySchema)schema, null);
            if (!CollectionUtils.isEmpty((Collection)brandList)) {
                brand.setId(((Brand)brandList.get(0)).getId());
                brand.setEntityStatus(EntityStatus.Update);
            } else {
                brand.setEntityStatus(EntityStatus.Insert);
                if (brand.getStopstatus() == null) {
                    brand.setStopstatus(Boolean.valueOf(false));
                }
            }
        } else if (brand != null && brand.getId() != null && !"".equals(brand.getId())) {
            QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(brand.getId())});
            QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)condition);
            List brandList = MetaDaoHelper.queryObject((String)"pc.brand.Brand", (boolean)true, (QuerySchema)schema, null);
            if (!CollectionUtils.isEmpty((Collection)brandList)) {
                brand.setId(((Brand)brandList.get(0)).getId());
                brand.setEntityStatus(EntityStatus.Update);
            } else {
                brand.setEntityStatus(EntityStatus.Insert);
                if (brand.getStopstatus() == null) {
                    brand.setStopstatus(Boolean.valueOf(false));
                }
            }
        } else {
            brand.setEntityStatus(EntityStatus.Insert);
            if (brand.getStopstatus() == null) {
                brand.setStopstatus(Boolean.valueOf(false));
            }
        }
    }

    private Brand convertBrand(String matchRule, BrandVO brandVO) {
        Brand brand = (Brand)JacksonUtils.parseObject((String)JacksonUtils.toJSONString((Object)brandVO), Brand.class);
        if (ObjectUtils.isEmpty((Object)brandVO.getName())) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.NAME_NOT_NULL);
        }
        brand.set("name", (Object)brandVO.getName().toMap());
        if (!ObjectUtils.isEmpty((Object)brandVO.getRandKeywords())) {
            brand.set("randKeywords", (Object)brandVO.getRandKeywords().toMap());
        }
        if (!ObjectUtils.isEmpty((Object)brandVO.getBrandDesc())) {
            brand.set("brandDesc", (Object)brandVO.getBrandDesc().toMap());
        }
        if (!ObjectUtils.isEmpty((Object)brandVO.getBrandUrl())) {
            brand.set("brandUrl", (Object)brandVO.getBrandUrl().toMap());
        }
        if (brandVO.getBrandClass() != null && !"".equals(brandVO.getBrandClass())) {
            brand.setBrandClass(brandVO.getBrandClass());
            brand.remove("brandClass___code");
        } else if (!StringUtils.isEmpty((Object)brandVO.getBrandClass___code())) {
            brand.set("brandClass___code", (Object)brandVO.getBrandClass___code());
        }
        if (!ObjectUtils.isEmpty((Object)brandVO.getProductTplBrands())) {
            ArrayList<ProductTplBrand> productTplBrands = new ArrayList<ProductTplBrand>();
            for (ProductTplBrandVO productTplBrandVO : brandVO.getProductTplBrands()) {
                ProductTplBrand productTplBrand = new ProductTplBrand();
                productTplBrand.setProductTplTemp(productTplBrandVO.getProductTplTemp());
                productTplBrand.set("productTplTemp___name", (Object)productTplBrandVO.getProductTplTemp___name());
                productTplBrand.set("_status", (Object)"Insert");
                productTplBrands.add(productTplBrand);
            }
            for (int i = 0; i < productTplBrands.size(); ++i) {
                ((ProductTplBrand)productTplBrands.get(i)).put("poiExcelRowNum", (Object)i);
            }
            brand.setProductTplBrands(productTplBrands);
        }
        return brand;
    }

    public String deleteBrand(String brandId, String brandCode) throws Exception {
        if (!StringUtils.hasLength((String)brandId) && !StringUtils.hasLength((String)brandCode)) {
            return null;
        }
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        if (StringUtils.hasLength((String)brandId)) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").eq((Object)Long.parseLong(brandId)));
        } else if (StringUtils.hasLength((String)brandCode)) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").eq((Object)brandCode));
        }
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)ProductAPIUtils.brandFieldMap, (String[])BRAND_BASE_FIELDS);
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup);
        List brandList = MetaDaoHelper.queryObject((String)"pc.brand.Brand", (QuerySchema)schema, null);
        if (CollectionUtils.isEmpty((Collection)brandList)) {
            return null;
        }
        BillDataDto bill = new BillDataDto();
        bill.setData((Object)brandList);
        bill.setBillnum("pc_brandlist");
        RuleExecuteResult result = BillBiz.delete((BillDataDto)bill);
        if (!CollectionUtils.isEmpty((Collection)result.getMessages())) {
            return result.getMessages().get(0).toString();
        }
        return null;
    }
}


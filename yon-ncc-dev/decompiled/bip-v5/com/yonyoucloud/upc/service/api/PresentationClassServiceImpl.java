/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 *  com.yonyou.iuap.BusinessException
 *  com.yonyou.iuap.apdoc.coredoc.constant.CoredocSDKConstant
 *  com.yonyou.iuap.apdoc.coredoc.dao.pub.CoreDocBaseDao
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.ProductAPIUtils
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.fileservice.sdk.module.CooperationFileService
 *  com.yonyou.iuap.fileservice.sdk.module.pojo.BatchBusinessFilesRequest
 *  com.yonyou.iuap.fileservice.sdk.module.pojo.CooperationFileInfo
 *  com.yonyou.iuap.fileservice.sdk.module.pojo.CooperationFileVO
 *  com.yonyou.iuap.fileservice.sdk.module.pojo.CooperationSuiteFile
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.ResultList
 *  com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils
 *  com.yonyoucloud.iuap.upc.api.IPresentationClassService
 *  com.yonyoucloud.iuap.upc.dto.derivatives.PresentationClassDTO
 *  com.yonyoucloud.iuap.upc.dto.derivatives.PresentationClassQryDTO
 *  com.yonyoucloud.iuap.upc.dto.ext.UPCResultList
 *  com.yonyoucloud.iuap.upc.dto.openapi.OpenAPIDTO
 *  com.yonyoucloud.iuap.upc.vo.MultilingualVO
 *  com.yonyoucloud.upc.ipass.merchant.PassResultDTO
 *  com.yonyoucloud.upc.pc.cls.PresentationClass
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
 */
package com.yonyoucloud.upc.service.api;

import com.alibaba.fastjson.JSON;
import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyou.iuap.BusinessException;
import com.yonyou.iuap.apdoc.coredoc.constant.CoredocSDKConstant;
import com.yonyou.iuap.apdoc.coredoc.dao.pub.CoreDocBaseDao;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.ProductAPIUtils;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.fileservice.sdk.module.CooperationFileService;
import com.yonyou.iuap.fileservice.sdk.module.pojo.BatchBusinessFilesRequest;
import com.yonyou.iuap.fileservice.sdk.module.pojo.CooperationFileInfo;
import com.yonyou.iuap.fileservice.sdk.module.pojo.CooperationFileVO;
import com.yonyou.iuap.fileservice.sdk.module.pojo.CooperationSuiteFile;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.ResultList;
import com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils;
import com.yonyoucloud.iuap.upc.api.IPresentationClassService;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.iuap.upc.dto.derivatives.PresentationClassDTO;
import com.yonyoucloud.iuap.upc.dto.derivatives.PresentationClassQryDTO;
import com.yonyoucloud.iuap.upc.dto.ext.UPCResultList;
import com.yonyoucloud.iuap.upc.dto.openapi.OpenAPIDTO;
import com.yonyoucloud.iuap.upc.vo.MultilingualVO;
import com.yonyoucloud.upc.ipass.merchant.PassResultDTO;
import com.yonyoucloud.upc.pc.cls.PresentationClass;
import com.yonyoucloud.upc.service.ProductClsService;
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

@Service
@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public class PresentationClassServiceImpl
implements IPresentationClassService {
    private static final Logger log = LoggerFactory.getLogger(PresentationClassServiceImpl.class);
    private static final String[] PRESENTATION_CLASS_BASE_FIELDS = new String[]{"id", "code", "name", "parent", "parentCode", "parentName", "level", "order", "manageClass", "manageClassCode", "manageClassName", "template", "templateName", "remark", "stopStatus", "isRecommend", "isURecommend", "showInFront", "showInTouchpad", "shareDescription", "pageTitle", "seoKeyword", "seoDescription", "image", "adImage", "presentationClassCharacter", "orderStatus"};
    private static final int MAX_COUNT = 5000;
    @Autowired
    private ApiImportCommandService apiImportSingleService;
    @Autowired
    CooperationFileService cooperationFileService;
    @Autowired
    private IUPCBillService billService;
    @Autowired
    private ProductClsService productClsService;

    public CoreDocJsonResult<PresentationClassDTO> queryByID(Long id) throws Exception {
        if (null != id) {
            try {
                PresentationClassDTO presentationClassDTO = null;
                QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)ProductAPIUtils.presentationClassMap, (String[])PRESENTATION_CLASS_BASE_FIELDS);
                QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)id)}));
                schema.addSelect("imageBusinessId, adImageBusinessId");
                List result = MetaDaoHelper.query((String)"pc.cls.PresentationClass", (boolean)true, (QuerySchema)schema, null);
                HashMap<Long, Map> character = new HashMap<Long, Map>();
                if (result != null && result.size() == 1) {
                    String[] names = new String[]{"name", "shareDescription", "pageTitle", "seoKeyword", "seoDescription", "remark"};
                    for (Map presentation : result) {
                        if ((presentation = UpcAPiTool.handleMultilingual((Map)presentation, (String[])names)).get("presentationClassCharacter") instanceof Map) {
                            character.put((Long)presentation.get("id"), (Map)presentation.get("presentationClassCharacter"));
                        } else {
                            presentation.remove("presentationClassCharacter");
                        }
                        this.queryAndSetPresentationAttachments(presentation);
                    }
                    presentationClassDTO = (PresentationClassDTO)JSON.parseObject((String)JSON.toJSONString(result.get(0)), PresentationClassDTO.class);
                }
                if (presentationClassDTO != null) {
                    presentationClassDTO.setPresentationClassCharacter((Map)character.get(presentationClassDTO.getId()));
                    return CoreDocJsonResult.success(presentationClassDTO);
                }
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.RESULT_IS_NULL));
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17A2451E0420003A", (String)"\u6839\u636eID\u67e5\u8be2\u5546\u54c1\u5206\u7c7b\u4fe1\u606f\u9519\u8bef:") + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<PresentationClassDTO> queryByIDList(List<Long> idList) throws Exception {
        if (null != idList) {
            try {
                List presentationClassDTOs = null;
                QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)ProductAPIUtils.presentationClassMap, (String[])PRESENTATION_CLASS_BASE_FIELDS);
                QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(idList)}));
                schema.addSelect("imageBusinessId, adImageBusinessId");
                List result = MetaDaoHelper.query((String)"pc.cls.PresentationClass", (boolean)true, (QuerySchema)schema, null);
                if (result != null && result.size() > 0) {
                    String[] names = new String[]{"name", "shareDescription", "pageTitle", "seoKeyword", "seoDescription", "remark"};
                    for (Map presentation : result) {
                        presentation = UpcAPiTool.handleMultilingual((Map)presentation, (String[])names);
                    }
                    this.batchQueryAndSetPresentationAttachments(result);
                    presentationClassDTOs = JSON.parseArray((String)JSON.toJSONString((Object)result), PresentationClassDTO.class);
                }
                if (presentationClassDTOs != null) {
                    return CoreDocJsonResult.success(presentationClassDTOs);
                }
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.RESULT_IS_NULL));
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17A2451E0420003A", (String)"\u6839\u636eID\u67e5\u8be2\u5546\u54c1\u5206\u7c7b\u4fe1\u606f\u9519\u8bef:") + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<PresentationClassDTO> queryByCode(String code) throws Exception {
        if (null != code) {
            try {
                PresentationClassDTO presentationClassDTO = null;
                QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)ProductAPIUtils.presentationClassMap, (String[])PRESENTATION_CLASS_BASE_FIELDS);
                QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)code)}));
                schema.addSelect("imageBusinessId, adImageBusinessId");
                List result = MetaDaoHelper.query((String)"pc.cls.PresentationClass", (boolean)true, (QuerySchema)schema, null);
                HashMap<Long, Map> character = new HashMap<Long, Map>();
                if (result != null && result.size() == 1) {
                    String[] names = new String[]{"name", "shareDescription", "pageTitle", "seoKeyword", "seoDescription", "remark"};
                    for (Map presentation : result) {
                        if (presentation.get("presentationClassCharacter") instanceof Map) {
                            character.put((Long)presentation.get("id"), (Map)presentation.get("presentationClassCharacter"));
                        } else {
                            presentation.remove("presentationClassCharacter");
                        }
                        presentation = UpcAPiTool.handleMultilingual((Map)presentation, (String[])names);
                        this.queryAndSetPresentationAttachments(presentation);
                    }
                    presentationClassDTO = (PresentationClassDTO)JSON.parseObject((String)JSON.toJSONString(result.get(0)), PresentationClassDTO.class);
                }
                if (presentationClassDTO != null) {
                    presentationClassDTO.setPresentationClassCharacter((Map)character.get(presentationClassDTO.getId()));
                    return CoreDocJsonResult.success(presentationClassDTO);
                }
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.RESULT_IS_NULL));
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17A2451E04200036", (String)"\u6839\u636e\u7f16\u7801\u67e5\u8be2\u5546\u54c1\u5206\u7c7b\u4fe1\u606f\u9519\u8bef:") + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<PresentationClassDTO> queryByCodeList(List<String> codeList) throws Exception {
        if (null != codeList) {
            try {
                List presentationClassDTOs = null;
                QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)ProductAPIUtils.presentationClassMap, (String[])PRESENTATION_CLASS_BASE_FIELDS);
                QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").in(codeList)}));
                schema.addSelect("imageBusinessId, adImageBusinessId");
                List result = MetaDaoHelper.query((String)"pc.cls.PresentationClass", (boolean)true, (QuerySchema)schema, null);
                if (result != null && result.size() > 0) {
                    String[] names = new String[]{"name", "shareDescription", "pageTitle", "seoKeyword", "seoDescription", "remark"};
                    for (Map presentation : result) {
                        presentation = UpcAPiTool.handleMultilingual((Map)presentation, (String[])names);
                    }
                    this.batchQueryAndSetPresentationAttachments(result);
                    presentationClassDTOs = JSON.parseArray((String)JSON.toJSONString((Object)result), PresentationClassDTO.class);
                }
                if (presentationClassDTOs != null) {
                    return CoreDocJsonResult.success(presentationClassDTOs);
                }
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.RESULT_IS_NULL));
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17A2451E04200036", (String)"\u6839\u636e\u7f16\u7801\u67e5\u8be2\u5546\u54c1\u5206\u7c7b\u4fe1\u606f\u9519\u8bef:") + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<PresentationClassDTO> queryTree(PresentationClassQryDTO presentationClassQryDTO) throws Exception {
        if (null != presentationClassQryDTO) {
            try {
                List presentationClassDTOs = null;
                QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)ProductAPIUtils.presentationClassMap, (String[])PRESENTATION_CLASS_BASE_FIELDS);
                QueryConditionGroup conditionGroup = this.buildPresentationClassQueryConditionGroup(presentationClassQryDTO);
                Integer pageIndex = presentationClassQryDTO.getPageIndex();
                Integer pageSize = presentationClassQryDTO.getPageSize();
                if (pageIndex == null || pageIndex < 0) {
                    pageIndex = 1;
                }
                if (pageSize == null || pageSize > UpcAPiTool.List_LENGTH) {
                    pageSize = UpcAPiTool.List_LENGTH;
                }
                QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)conditionGroup).addPager(pageIndex.intValue(), pageSize.intValue());
                schema.addSelect("imageBusinessId, adImageBusinessId");
                List result = MetaDaoHelper.query((String)"pc.cls.PresentationClass", (boolean)true, (QuerySchema)schema, null);
                HashMap<Long, Map> character = new HashMap<Long, Map>();
                if (result != null && result.size() <= UpcAPiTool.List_LENGTH) {
                    String[] names = new String[]{"name", "shareDescription", "pageTitle", "seoKeyword", "seoDescription", "remark"};
                    for (Map presentation : result) {
                        if (presentation.get("presentationClassCharacter") instanceof Map) {
                            character.put((Long)presentation.get("id"), (Map)presentation.get("presentationClassCharacter"));
                        } else {
                            presentation.remove("presentationClassCharacter");
                        }
                        presentation = UpcAPiTool.handleMultilingual((Map)presentation, (String[])names);
                    }
                    this.batchQueryAndSetPresentationAttachments(result);
                    presentationClassDTOs = JSON.parseArray((String)JSON.toJSONString((Object)result), PresentationClassDTO.class);
                } else if (result != null && result.size() > UpcAPiTool.List_LENGTH) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801151);
                }
                if (presentationClassDTOs != null) {
                    for (PresentationClassDTO presentationClassDTO : presentationClassDTOs) {
                        presentationClassDTO.setPresentationClassCharacter((Map)character.get(presentationClassDTO.getId()));
                    }
                    return CoreDocJsonResult.success((List)presentationClassDTOs);
                }
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.RESULT_IS_NULL));
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17A2451E04200038", (String)"\u67e5\u8be2\u5546\u54c1\u5206\u7c7b\u4fe1\u606f\u9519\u8bef:") + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public Integer queryPresentationClassCount(PresentationClassQryDTO presentationClassQryDTO) throws Exception {
        QueryConditionGroup conditionGroup = this.buildPresentationClassQueryConditionGroup(presentationClassQryDTO);
        QuerySchema schema = QuerySchema.create().addSelect("count(1) as count").addCondition((ConditionExpression)conditionGroup);
        Map result = MetaDaoHelper.queryOne((String)"pc.cls.PresentationClass", (QuerySchema)schema);
        if (result != null && result.get("count") != null) {
            Integer count = Integer.valueOf(result.get("count").toString());
            return count;
        }
        return null;
    }

    public QueryConditionGroup buildPresentationClassQueryConditionGroup(PresentationClassQryDTO presentationClassQryDTO) {
        QueryConditionGroup conditionGroup = new QueryConditionGroup();
        if (presentationClassQryDTO != null) {
            if (presentationClassQryDTO.getCode() != null) {
                conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").eq((Object)presentationClassQryDTO.getCode()));
            }
            if (presentationClassQryDTO.getName() != null) {
                conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"name").eq((Object)presentationClassQryDTO.getName()));
            }
            if (presentationClassQryDTO.getBeganTime() != null) {
                conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"pubts").egt((Object)presentationClassQryDTO.getBeganTime()));
            }
            if (presentationClassQryDTO.getEndTime() != null) {
                conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"pubts").lt((Object)presentationClassQryDTO.getEndTime()));
            }
            if (!CollectionUtils.isEmpty((Map)presentationClassQryDTO.getCharacterDefine())) {
                for (String key : presentationClassQryDTO.getCharacterDefine().keySet()) {
                    conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)("presentationClassCharacter." + key)).eq(presentationClassQryDTO.getCharacterDefine().get(key)));
                }
            }
        }
        return conditionGroup;
    }

    public CoreDocJsonResult<PresentationClassDTO> queryTreeByParent(PresentationClassQryDTO presentationClassQryDTO) throws Exception {
        if (null != presentationClassQryDTO) {
            try {
                QuerySchema schema;
                List result;
                List presentationClassDTOs = null;
                QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)ProductAPIUtils.presentationClassMap, (String[])PRESENTATION_CLASS_BASE_FIELDS);
                QueryConditionGroup conditionGroup = new QueryConditionGroup();
                if (presentationClassQryDTO.getParent() != null) {
                    conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"parent").eq((Object)presentationClassQryDTO.getParent()));
                }
                if (presentationClassQryDTO.getCode() != null) {
                    conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").eq((Object)presentationClassQryDTO.getCode()));
                }
                if (presentationClassQryDTO.getName() != null) {
                    conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"name").eq((Object)presentationClassQryDTO.getName()));
                }
                Integer pageIndex = presentationClassQryDTO.getPageIndex();
                Integer pageSize = presentationClassQryDTO.getPageSize();
                if (pageIndex == null || pageIndex < 0) {
                    pageIndex = 1;
                }
                if (pageSize == null || pageSize > UpcAPiTool.List_LENGTH) {
                    pageSize = UpcAPiTool.List_LENGTH;
                }
                if ((result = MetaDaoHelper.query((String)"pc.cls.PresentationClass", (boolean)true, (QuerySchema)(schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)conditionGroup).addPager(pageIndex.intValue(), pageSize.intValue())), null)) != null && result.size() <= UpcAPiTool.List_LENGTH) {
                    String[] names = new String[]{"name", "shareDescription", "pageTitle", "seoKeyword", "seoDescription", "remark"};
                    for (Map presentation : result) {
                        presentation = UpcAPiTool.handleMultilingual((Map)presentation, (String[])names);
                    }
                    presentationClassDTOs = JSON.parseArray((String)JSON.toJSONString((Object)result), PresentationClassDTO.class);
                }
                if (presentationClassDTOs != null) {
                    return CoreDocJsonResult.success(presentationClassDTOs);
                }
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.RESULT_IS_NULL));
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17A2451E04200038", (String)"\u67e5\u8be2\u5546\u54c1\u5206\u7c7b\u4fe1\u606f\u9519\u8bef:") + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<PresentationClassDTO> add(PresentationClassDTO presentationClassDTO) throws Exception {
        if (null != presentationClassDTO) {
            try {
                PresentationClass presentationClass = this.handleAddPresentationClass(presentationClassDTO);
                BillDataDto billDataDto = new BillDataDto();
                billDataDto.setBillnum("pc_presentationclass");
                billDataDto.setAction("save");
                billDataDto.setData((Object)presentationClass);
                billDataDto.setFromApi(true);
                billDataDto.setConvertType(Integer.valueOf(3));
                Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
                PresentationClassDTO presentationDTO = new PresentationClassDTO();
                presentationDTO.setId((Long)((Map)result).get("id"));
                return CoreDocJsonResult.success((Object)presentationDTO);
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17A2451E04200037", (String)"\u5546\u54c1\u5206\u7c7b\u65b0\u589e\u9519\u8bef:") + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<PresentationClassDTO> update(PresentationClassDTO presentationClassDTO) throws Exception {
        if (null != presentationClassDTO) {
            try {
                PresentationClass presentationClass = this.handleUpdatePresentationClass(presentationClassDTO);
                BillDataDto billDataDto = new BillDataDto();
                billDataDto.setBillnum("pc_presentationclass");
                billDataDto.setAction("save");
                billDataDto.setData((Object)presentationClass);
                billDataDto.setFromApi(true);
                billDataDto.setConvertType(Integer.valueOf(3));
                Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
                PresentationClassDTO presentationDTO = new PresentationClassDTO();
                presentationDTO.setId((Long)((Map)result).get("id"));
                return CoreDocJsonResult.success((Object)presentationDTO);
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17A2451E0420003C", (String)"\u5546\u54c1\u5206\u7c7b\u66f4\u65b0\u9519\u8bef:") + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<UPCResultList> batchAdd(List<PresentationClassDTO> presentationClassDTOs) throws Exception {
        if (null != presentationClassDTOs) {
            try {
                if (presentationClassDTOs.size() == 0 || presentationClassDTOs.size() > CoredocSDKConstant.MAX_NUM_FOR_SIMPLE) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801371);
                }
                ArrayList<PresentationClass> presentationClassList = new ArrayList<PresentationClass>();
                for (PresentationClassDTO presentationClassDTO : presentationClassDTOs) {
                    PresentationClass presentationClass = this.handleAddPresentationClass(presentationClassDTO);
                    presentationClassList.add(presentationClass);
                }
                BillDataDto billDataDto = new BillDataDto();
                billDataDto.setBillnum("pc_presentationclass");
                billDataDto.setAction("save");
                billDataDto.setData(presentationClassList);
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
                log.error("\u5546\u54c1\u5206\u7c7b\u6279\u91cf\u4fdd\u5b58\u9519\u8bef:" + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<UPCResultList> batchUpdate(List<PresentationClassDTO> presentationClassDTOs) throws Exception {
        if (null != presentationClassDTOs) {
            try {
                if (presentationClassDTOs.size() == 0 || presentationClassDTOs.size() > CoredocSDKConstant.MAX_NUM_FOR_SIMPLE) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801371);
                }
                ArrayList<PresentationClass> presentationClassList = new ArrayList<PresentationClass>();
                for (PresentationClassDTO presentationClassDTO : presentationClassDTOs) {
                    PresentationClass presentationClass = this.handleUpdatePresentationClass(presentationClassDTO);
                    presentationClassList.add(presentationClass);
                }
                BillDataDto billDataDto = new BillDataDto();
                billDataDto.setBillnum("pc_presentationclass");
                billDataDto.setAction("save");
                billDataDto.setData(presentationClassList);
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
                log.error("\u5546\u54c1\u5206\u7c7b\u6279\u91cf\u66f4\u65b0\u9519\u8bef:" + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    private void setBoolean(PresentationClass presentcls, Map queryResult) {
        if (queryResult != null) {
            if (!presentcls.containsKey((Object)"iUOrderStatus") || presentcls.getIUOrderStatus() == null) {
                presentcls.set("iUOrderStatus", queryResult.get("iUOrderStatus"));
            }
            if (!presentcls.containsKey((Object)"showInFront") || presentcls.getShowInFront() == null) {
                presentcls.set("showInFront", queryResult.get("showInFront"));
            }
            if (!presentcls.containsKey((Object)"showInTouchpad") || presentcls.getShowInTouchpad() == null) {
                presentcls.set("showInTouchpad", queryResult.get("showInTouchpad"));
            }
            if (!presentcls.containsKey((Object)"isRecommend") || presentcls.getIsRecommend() == null) {
                presentcls.set("isRecommend", queryResult.get("isRecommend"));
            }
            if (!presentcls.containsKey((Object)"isURecommend") || presentcls.getIsURecommend() == null) {
                presentcls.set("isURecommend", queryResult.get("isURecommend"));
            }
        }
    }

    public void queryAndSetPresentationAttachments(Map<String, Object> presentation) {
        if (presentation.get("imageBusinessId") != null) {
            List imageBusinessId = null;
            try {
                imageBusinessId = this.cooperationFileService.queryFileList("iuap-apdoc-material", presentation.get("imageBusinessId").toString(), 1, 50);
            }
            catch (Exception e) {
                log.error("\u5546\u54c1\u5206\u7c7b\u67e5\u8be2\u9644\u4ef6\u660e\u7ec6\u5f02\u5e38\uff1a" + e.getMessage(), (Throwable)e);
            }
            if (!CollectionUtils.isEmpty((Collection)imageBusinessId)) {
                presentation.put("image", ((CooperationFileInfo)imageBusinessId.get(0)).getBucketUrl());
            }
        }
        if (presentation.get("adImageBusinessId") != null) {
            List adImageBusinessId = null;
            try {
                adImageBusinessId = this.cooperationFileService.queryFileList("iuap-apdoc-material", presentation.get("adImageBusinessId").toString(), 1, 50);
            }
            catch (Exception e) {
                log.error("\u5546\u54c1\u5206\u7c7b\u67e5\u8be2\u9644\u4ef6\u660e\u7ec6\u5f02\u5e38\uff1a" + e.getMessage(), (Throwable)e);
            }
            if (!CollectionUtils.isEmpty((Collection)adImageBusinessId)) {
                presentation.put("adImage", ((CooperationFileInfo)adImageBusinessId.get(0)).getBucketUrl());
            }
        }
    }

    public void batchQueryAndSetPresentationAttachments(List<Map<String, Object>> presentationList) {
        if (CollectionUtils.isEmpty(presentationList)) {
            return;
        }
        ArrayList<String> presentationIdList = new ArrayList<String>(presentationList.size());
        for (Map<String, Object> presentation : presentationList) {
            if (presentation.get("imageBusinessId") != null) {
                presentationIdList.add(presentation.get("imageBusinessId").toString());
            }
            if (presentation.get("adImageBusinessId") == null) continue;
            presentationIdList.add(presentation.get("adImageBusinessId").toString());
        }
        if (CollectionUtils.isEmpty(presentationIdList)) {
            return;
        }
        CooperationSuiteFile cooperationSuiteFile = null;
        try {
            ArrayList<BatchBusinessFilesRequest> batchBusinessFilesRequestList = new ArrayList<BatchBusinessFilesRequest>();
            BatchBusinessFilesRequest batchBusinessFilesRequest = new BatchBusinessFilesRequest();
            batchBusinessFilesRequest.setBusinessType("iuap-apdoc-material");
            batchBusinessFilesRequest.setBusinessIds(presentationIdList);
            batchBusinessFilesRequest.setCancelFileExit(Boolean.valueOf(true));
            batchBusinessFilesRequestList.add(batchBusinessFilesRequest);
            cooperationSuiteFile = this.cooperationFileService.batchBusinessFiles(batchBusinessFilesRequestList);
        }
        catch (Exception e) {
            log.error("\u5546\u54c1\u5206\u7c7b\u6279\u91cf\u67e5\u8be2\u9644\u4ef6\u660e\u7ec6\u5f02\u5e38\uff1a" + e.getMessage(), (Throwable)e);
        }
        if (cooperationSuiteFile != null && !CollectionUtils.isEmpty((Collection)cooperationSuiteFile.getData())) {
            List fileList = cooperationSuiteFile.getData();
            HashMap<String, CooperationFileVO> fileMap = new HashMap<String, CooperationFileVO>(fileList.size());
            for (CooperationFileVO cooperationFileVO : fileList) {
                fileMap.put(cooperationFileVO.getObjectId(), cooperationFileVO);
            }
            for (Map map : presentationList) {
                CooperationFileVO adFile;
                CooperationFileVO logoFile;
                if (map.get("imageBusinessId") != null && (logoFile = (CooperationFileVO)fileMap.get(map.get("imageBusinessId").toString())) != null) {
                    map.put("image", logoFile.getBucketUrl());
                }
                if (map.get("adImageBusinessId") == null || (adFile = (CooperationFileVO)fileMap.get(map.get("adImageBusinessId").toString())) == null) continue;
                map.put("adImage", adFile.getBucketUrl());
            }
        }
    }

    public PresentationClass handleUpdatePresentationClass(PresentationClassDTO presentationClassDTO) throws Exception {
        boolean checkResult;
        Map characterId;
        QuerySchema schema;
        Map query;
        List queryId = null;
        if (presentationClassDTO.getCode() != null && presentationClassDTO.getId() == null) {
            Long id = CoreDocBaseDao.queryIdByCode((String)presentationClassDTO.getCode(), (String)"pc.cls.PresentationClass");
            if (id == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800879);
            }
            presentationClassDTO.setId(id);
        } else {
            QuerySchema querySchema;
            if (presentationClassDTO.getCode() == null && presentationClassDTO.getId() == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800880);
            }
            if (presentationClassDTO.getId() != null && ((queryId = MetaDaoHelper.query((String)"pc.cls.PresentationClass", (QuerySchema)(querySchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)presentationClassDTO.getId())}))))) == null || queryId.size() != 1)) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801363, new Object[]{presentationClassDTO.getId()});
            }
        }
        PresentationClass presentationClass = new PresentationClass();
        presentationClass.put("_fromApi", (Object)true);
        presentationClass.put("_status", (Object)EntityStatus.Update);
        Map map = (Map)JSON.parseObject((String)JSON.toJSONString((Object)presentationClassDTO), HashMap.class);
        presentationClass.putAll(map);
        if (presentationClassDTO.getName() != null) {
            presentationClass.set("name", (Object)UpcAPiTool.handleMultilingual((MultilingualVO)presentationClassDTO.getName()));
        }
        if (presentationClassDTO.getShareDescription() != null) {
            presentationClass.set("shareDescription", (Object)UpcAPiTool.handleMultilingual((MultilingualVO)presentationClassDTO.getShareDescription()));
        }
        if (presentationClassDTO.getPageTitle() != null) {
            presentationClass.set("pageTitle", (Object)UpcAPiTool.handleMultilingual((MultilingualVO)presentationClassDTO.getPageTitle()));
        }
        if (presentationClassDTO.getSeoKeyword() != null) {
            presentationClass.set("seoKeyword", (Object)UpcAPiTool.handleMultilingual((MultilingualVO)presentationClassDTO.getSeoKeyword()));
        }
        if (presentationClassDTO.getSeoDescription() != null) {
            presentationClass.set("seoDescription", (Object)UpcAPiTool.handleMultilingual((MultilingualVO)presentationClassDTO.getSeoDescription()));
        }
        if (presentationClassDTO.getRemark() != null) {
            presentationClass.set("remark", (Object)UpcAPiTool.handleMultilingual((MultilingualVO)presentationClassDTO.getRemark()));
        }
        DataTransferUtils.fill((String)"pc_presentationclass", (String)"pc.cls.PresentationClass", (Object)presentationClass, (int)3);
        if (presentationClassDTO.getStopStatus() != null && !presentationClassDTO.getStopStatus().booleanValue()) {
            presentationClass.put("stopstatus", (Object)0);
        } else if (presentationClassDTO.getStopStatus() != null && presentationClassDTO.getStopStatus().booleanValue()) {
            presentationClass.put("stopstatus", (Object)1);
        }
        if (presentationClassDTO.getOrderStatus() != null) {
            presentationClass.setIUOrderStatus(presentationClassDTO.getOrderStatus());
        }
        if ((query = MetaDaoHelper.queryOne((String)"pc.cls.PresentationClass", (QuerySchema)(schema = QuerySchema.create().addSelect("presentationClassCharacter,parent,level,stopstatus,iUOrderStatus,showInFront,showInTouchpad,isRecommend,isURecommend").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(presentationClass.getId())}))))) != null && query.get("presentationClassCharacter") != null && presentationClass.get("presentationClassCharacter") != null && (characterId = (Map)query.get("presentationClassCharacter")).get("id") != null) {
            Map character = (Map)presentationClass.get("presentationClassCharacter");
            character.put("id", characterId.get("id").toString());
            presentationClass.put("presentationClassCharacter", (Object)character);
        }
        if (query != null && query.get("level") != null && (Integer)query.get("level") > 3) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801372, new Object[]{presentationClass.getId(), presentationClass.getCode()});
        }
        if (query != null && query.get("stopstatus") != null && presentationClass.get("stopstatus") == null) {
            presentationClass.put("stopstatus", query.get("stopstatus"));
        }
        if (query != null) {
            this.setBoolean(presentationClass, query);
        }
        if (presentationClass.getId() != null && presentationClass.getParent() != null && presentationClass.getEntityStatus() == EntityStatus.Update && !(checkResult = this.productClsService.checkParent((Long)presentationClass.getId(), presentationClass.getParent(), "pc.cls.PresentationClass"))) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800190);
        }
        return presentationClass;
    }

    public PresentationClass handleAddPresentationClass(PresentationClassDTO presentationClassDTO) throws Exception {
        QuerySchema schema;
        Map query;
        if (presentationClassDTO.getCode() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801120);
        }
        if (CoreDocBaseDao.queryIdByCode((String)presentationClassDTO.getCode(), (String)"pc.cls.PresentationClass") != null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801373, new Object[]{presentationClassDTO.getCode()});
        }
        PresentationClass presentationClass = new PresentationClass();
        presentationClass.put("_fromApi", (Object)true);
        presentationClass.put("_status", (Object)EntityStatus.Insert);
        Map map = (Map)JSON.parseObject((String)JSON.toJSONString((Object)presentationClassDTO), HashMap.class);
        presentationClass.putAll(map);
        if (presentationClassDTO.getName() != null) {
            presentationClass.set("name", (Object)UpcAPiTool.handleMultilingual((MultilingualVO)presentationClassDTO.getName()));
        }
        if (presentationClassDTO.getShareDescription() != null) {
            presentationClass.set("shareDescription", (Object)UpcAPiTool.handleMultilingual((MultilingualVO)presentationClassDTO.getShareDescription()));
        }
        if (presentationClassDTO.getPageTitle() != null) {
            presentationClass.set("pageTitle", (Object)UpcAPiTool.handleMultilingual((MultilingualVO)presentationClassDTO.getPageTitle()));
        }
        if (presentationClassDTO.getSeoKeyword() != null) {
            presentationClass.set("seoKeyword", (Object)UpcAPiTool.handleMultilingual((MultilingualVO)presentationClassDTO.getSeoKeyword()));
        }
        if (presentationClassDTO.getSeoDescription() != null) {
            presentationClass.set("seoDescription", (Object)UpcAPiTool.handleMultilingual((MultilingualVO)presentationClassDTO.getSeoDescription()));
        }
        if (presentationClassDTO.getRemark() != null) {
            presentationClass.set("remark", (Object)UpcAPiTool.handleMultilingual((MultilingualVO)presentationClassDTO.getRemark()));
        }
        DataTransferUtils.fill((String)"pc_presentationclass", (String)"pc.cls.PresentationClass", (Object)presentationClass, (int)3);
        if (presentationClassDTO.getStopStatus() != null && !presentationClassDTO.getStopStatus().booleanValue()) {
            presentationClass.put("stopstatus", (Object)0);
        } else if (presentationClassDTO.getStopStatus() != null && presentationClassDTO.getStopStatus().booleanValue()) {
            presentationClass.put("stopstatus", (Object)1);
        } else if (presentationClassDTO.getStopStatus() == null) {
            presentationClass.put("stopstatus", (Object)0);
        }
        if (presentationClassDTO.getOrderStatus() != null) {
            presentationClass.setIUOrderStatus(presentationClassDTO.getOrderStatus());
        }
        if (presentationClass.getParent() != null && (query = MetaDaoHelper.queryOne((String)"pc.cls.PresentationClass", (QuerySchema)(schema = QuerySchema.create().addSelect("level").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)presentationClass.getParent())}))))).get("level") != null && (Integer)query.get("level") > 2) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801374, new Object[]{presentationClass.getCode()});
        }
        return presentationClass;
    }

    public CoreDocJsonResult<PresentationClassDTO> addIdempotent(OpenAPIDTO<PresentationClassDTO> dto) {
        if (dto == null || dto.getData() == null) {
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
        }
        try {
            PresentationClassDTO presentationClassDTO = (PresentationClassDTO)dto.getData();
            CoreDocJsonResult<PresentationClassDTO> saveResult = this.add(presentationClassDTO);
            return saveResult;
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)businessException);
        }
        catch (Exception e) {
            log.error("\u5546\u54c1\u5206\u7c7b\u65b0\u589e\u9519\u8bef:" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    public CoreDocJsonResult<UPCResultList> batchSave(List<PresentationClassDTO> presentationClassDTOList) {
        if (CollectionUtils.isEmpty(presentationClassDTOList)) {
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
        }
        if (presentationClassDTOList.size() > CoredocSDKConstant.DEFAULT_NUM_FOR_SIMPLE) {
            return CoreDocJsonResult.error((Long)Long.valueOf(CoreDocBusinessErrorEnum.PARAM_MORE_THAN_LIMITATION.getCode()), (String)String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1A7F2BEA04080003", (String)"\u8bf7\u6c42\u6570\u91cf\u8d85\u8fc7\u6700\u5927\u9650\u5236\u6570\u91cf:%d"), CoredocSDKConstant.DEFAULT_NUM_FOR_SIMPLE));
        }
        try {
            List<PresentationClassDTO> presentationClassDTOs = this.setIdByErpCode(presentationClassDTOList);
            UPCResultList upcResultList = new UPCResultList();
            Integer successCount = 0;
            Integer failCount = 0;
            ArrayList<PassResultDTO> messages = new ArrayList<PassResultDTO>();
            ArrayList successInfos = new ArrayList();
            for (PresentationClassDTO presentationClassDTO : presentationClassDTOs) {
                Integer n;
                PassResultDTO passResultDTO = new PassResultDTO();
                CoreDocJsonResult<PresentationClassDTO> saveResult = new CoreDocJsonResult<PresentationClassDTO>();
                saveResult = presentationClassDTO.getId() != null ? this.update(presentationClassDTO) : this.add(presentationClassDTO);
                if (saveResult.isSuccess()) {
                    n = successCount;
                    successCount = successCount + 1;
                    PresentationClassDTO presentationClass = (PresentationClassDTO)saveResult.getData().get(0);
                    passResultDTO.setSourceUnique(presentationClassDTO.getErpCode());
                    passResultDTO.setTargetUnique(presentationClass.getId().toString());
                    HashMap<String, PassResultDTO> infoMap = new HashMap<String, PassResultDTO>();
                    infoMap.put("data", passResultDTO);
                    successInfos.add(infoMap);
                    continue;
                }
                n = failCount;
                failCount = failCount + 1;
                passResultDTO.setSourceUnique(presentationClassDTO.getErpCode());
                passResultDTO.setMessage(saveResult.getMessage());
                messages.add(passResultDTO);
            }
            upcResultList.setCount(Integer.valueOf(failCount + successCount));
            upcResultList.setFailCount(failCount);
            upcResultList.setSuccessCount(successCount);
            upcResultList.setMessages(messages);
            upcResultList.setInfos(successInfos);
            return CoreDocJsonResult.success((Object)upcResultList);
        }
        catch (Exception e) {
            log.error("\u5546\u54c1\u5206\u7c7b\u6279\u91cf\u4fdd\u5b58-\u63a5\u53e3\u5f02\u5e38:" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    private List<PresentationClassDTO> setIdByErpCode(List<PresentationClassDTO> presentationClassDTOList) throws Exception {
        ArrayList<String> erpCodeList = new ArrayList<String>();
        for (PresentationClassDTO presentationClassDTO : presentationClassDTOList) {
            if (presentationClassDTO == null || presentationClassDTO.getErpCode() == null || presentationClassDTO.getId() != null) continue;
            erpCodeList.add(presentationClassDTO.getErpCode());
        }
        if (CollectionUtils.isEmpty(erpCodeList)) {
            return presentationClassDTOList;
        }
        QuerySchema schema = QuerySchema.create().addSelect("id,erpCode").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"erpCode").in(erpCodeList)}));
        List clss = MetaDaoHelper.query((String)"pc.cls.PresentationClass", (QuerySchema)schema);
        HashMap<String, Long> erpCodeIdMap = new HashMap<String, Long>();
        if (!CollectionUtils.isEmpty((Collection)clss)) {
            for (Map cls : clss) {
                if (cls == null || cls.get("erpCode") == null || cls.get("id") == null) continue;
                erpCodeIdMap.put(cls.get("erpCode").toString(), Long.valueOf(cls.get("id").toString()));
            }
        }
        for (PresentationClassDTO presentationClassDTO : presentationClassDTOList) {
            if (presentationClassDTO == null || presentationClassDTO.getErpCode() == null || presentationClassDTO.getId() != null) continue;
            presentationClassDTO.setId((Long)erpCodeIdMap.get(presentationClassDTO.getErpCode()));
        }
        return presentationClassDTOList;
    }
}


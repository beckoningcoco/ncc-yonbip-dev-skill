/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 *  com.yonyou.iuap.BusinessException
 *  com.yonyou.iuap.apdoc.coredoc.dao.pub.CoreDocBaseDao
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.MerchantAPIUtils
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.po.pub.BatchApiQueryParamWithOrg
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.apdoc.coredoc.vo.merchantcls.MerchantClsVO
 *  com.yonyou.iuap.international.MultiLangText
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils
 *  com.yonyoucloud.iuap.upc.api.ICustomerCategoryService
 *  com.yonyoucloud.iuap.upc.dto.derivatives.CustomerCategoryDTO
 *  com.yonyoucloud.iuap.upc.dto.derivatives.CustomerCategoryQryDTO
 *  com.yonyoucloud.iuap.upc.dto.derivatives.MessageDTO
 *  com.yonyoucloud.iuap.upc.dto.openapi.OpenAPIDTO
 *  com.yonyoucloud.iuap.upc.vo.MultilingualVO
 *  com.yonyoucloud.upc.aa.custcategory.CustCategory
 *  com.yonyoucloud.upc.utils.CoreDocJsonResult
 *  com.yonyoucloud.upc.utils.MerchantUtils
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QueryField
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.BeanUtils
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.ObjectUtils
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.service.api;

import com.alibaba.fastjson.JSON;
import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyou.iuap.BusinessException;
import com.yonyou.iuap.apdoc.coredoc.dao.pub.CoreDocBaseDao;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.MerchantAPIUtils;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.po.pub.BatchApiQueryParamWithOrg;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.apdoc.coredoc.vo.merchantcls.MerchantClsVO;
import com.yonyou.iuap.international.MultiLangText;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils;
import com.yonyoucloud.iuap.ipass.utils.IPassServiceUtils;
import com.yonyoucloud.iuap.upc.api.ICustomerCategoryService;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.iuap.upc.dto.derivatives.CustomerCategoryDTO;
import com.yonyoucloud.iuap.upc.dto.derivatives.CustomerCategoryQryDTO;
import com.yonyoucloud.iuap.upc.dto.derivatives.MessageDTO;
import com.yonyoucloud.iuap.upc.dto.openapi.OpenAPIDTO;
import com.yonyoucloud.iuap.upc.vo.MultilingualVO;
import com.yonyoucloud.upc.aa.custcategory.CustCategory;
import com.yonyoucloud.upc.service.ProductClsService;
import com.yonyoucloud.upc.service.utils.TreeApplyRangeUtils;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import com.yonyoucloud.upc.utils.MerchantUtils;
import java.util.ArrayList;
import java.util.Arrays;
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
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

@Service
@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public class CustomerCategoryServiceImpl
implements ICustomerCategoryService {
    private static final Logger log = LoggerFactory.getLogger(CustomerCategoryServiceImpl.class);
    private static final String[] CUSTOMER_CATEGORY_BASE_FIELDS = new String[]{"id", "code", "name", "parent", "parentCode", "parentName", "level", "isEnd", "orgId", "orgCode", "orgName", "comment", "isEnabled", "custCategoryCharacter", "order"};
    private static final int MAX_COUNT = 5000;
    @Autowired
    private ApiImportCommandService apiImportSingleService;
    @Autowired
    private IUPCControlRuleService upcControlRuleService;
    @Autowired
    private IUPCBillService billService;
    @Autowired
    private ProductClsService productClsService;

    public CoreDocJsonResult<CustomerCategoryDTO> queryByID(Long id) throws Exception {
        if (null != id) {
            try {
                CustomerCategoryDTO customerCategoryDTO = null;
                QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantAPIUtils.merchantCustomerCategoryFieldMapping, (String[])CUSTOMER_CATEGORY_BASE_FIELDS);
                QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)id)}));
                List result = MetaDaoHelper.query((String)"aa.custcategory.CustCategory", (boolean)true, (QuerySchema)schema, null);
                HashMap<Long, Map> character = new HashMap<Long, Map>();
                if (result != null && result.size() == 1) {
                    Map customerCategory = (Map)result.get(0);
                    if ((customerCategory = UpcAPiTool.handleMultilingual((Map)customerCategory, (String[])new String[]{"name", "comment"})).get("custCategoryCharacter") instanceof Map) {
                        character.put((Long)customerCategory.get("id"), (Map)customerCategory.get("custCategoryCharacter"));
                    } else {
                        customerCategory.remove("custCategoryCharacter");
                    }
                    customerCategoryDTO = (CustomerCategoryDTO)JSON.parseObject((String)JSON.toJSONString((Object)customerCategory), CustomerCategoryDTO.class);
                }
                if (customerCategoryDTO != null) {
                    customerCategoryDTO.setCustCategoryCharacter((Map)character.get(customerCategoryDTO.getId()));
                    return CoreDocJsonResult.success(customerCategoryDTO);
                }
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.RESULT_IS_NULL));
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17A2451E0420004F", (String)"\u6839\u636eID\u67e5\u8be2\u5ba2\u6237\u5206\u7c7b\u4fe1\u606f\u9519\u8bef:") + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<CustomerCategoryDTO> queryByIDList(List<Long> idList) throws Exception {
        if (null != idList) {
            try {
                List customerCategoryDTOs = null;
                QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantAPIUtils.merchantCustomerCategoryFieldMapping, (String[])CUSTOMER_CATEGORY_BASE_FIELDS);
                QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(idList)}));
                List result = MetaDaoHelper.query((String)"aa.custcategory.CustCategory", (boolean)true, (QuerySchema)schema, null);
                if (result != null && result.size() > 0) {
                    String[] names = new String[]{"name", "comment"};
                    for (Map customerCategory : result) {
                        customerCategory = UpcAPiTool.handleMultilingual((Map)customerCategory, (String[])names);
                    }
                    customerCategoryDTOs = JSON.parseArray((String)JSON.toJSONString((Object)result), CustomerCategoryDTO.class);
                }
                if (!CollectionUtils.isEmpty(customerCategoryDTOs)) {
                    return CoreDocJsonResult.success(customerCategoryDTOs);
                }
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.RESULT_IS_NULL));
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17A2451E0420004F", (String)"\u6839\u636eID\u67e5\u8be2\u5ba2\u6237\u5206\u7c7b\u4fe1\u606f\u9519\u8bef:") + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<CustomerCategoryDTO> queryByCode(String code) throws Exception {
        if (null != code) {
            try {
                CustomerCategoryDTO customerCategoryDTO = null;
                QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantAPIUtils.merchantCustomerCategoryFieldMapping, (String[])CUSTOMER_CATEGORY_BASE_FIELDS);
                QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)code)}));
                List result = MetaDaoHelper.query((String)"aa.custcategory.CustCategory", (boolean)true, (QuerySchema)schema, null);
                HashMap<Long, Map> character = new HashMap<Long, Map>();
                if (result != null && result.size() == 1) {
                    Map customerCategory = (Map)result.get(0);
                    if ((customerCategory = UpcAPiTool.handleMultilingual((Map)customerCategory, (String[])new String[]{"name", "comment"})).get("custCategoryCharacter") instanceof Map) {
                        character.put((Long)customerCategory.get("id"), (Map)customerCategory.get("custCategoryCharacter"));
                    } else {
                        customerCategory.remove("custCategoryCharacter");
                    }
                    customerCategoryDTO = (CustomerCategoryDTO)JSON.parseObject((String)JSON.toJSONString((Object)customerCategory), CustomerCategoryDTO.class);
                }
                if (customerCategoryDTO != null) {
                    customerCategoryDTO.setCustCategoryCharacter((Map)character.get(customerCategoryDTO.getId()));
                    return CoreDocJsonResult.success(customerCategoryDTO);
                }
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.RESULT_IS_NULL));
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17A2451E04200051", (String)"\u6839\u636e\u7f16\u7801\u67e5\u8be2\u5ba2\u6237\u5206\u7c7b\u4fe1\u606f\u9519\u8bef:") + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<CustomerCategoryDTO> queryByCodeList(List<String> codeList) throws Exception {
        if (null != codeList) {
            try {
                List customerCategoryDTOs = null;
                QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantAPIUtils.merchantCustomerCategoryFieldMapping, (String[])CUSTOMER_CATEGORY_BASE_FIELDS);
                QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").in(codeList)}));
                List result = MetaDaoHelper.query((String)"aa.custcategory.CustCategory", (boolean)true, (QuerySchema)schema, null);
                if (result != null && result.size() > 0) {
                    String[] names = new String[]{"name", "comment"};
                    for (Map customerCategory : result) {
                        customerCategory = UpcAPiTool.handleMultilingual((Map)customerCategory, (String[])names);
                    }
                    customerCategoryDTOs = JSON.parseArray((String)JSON.toJSONString((Object)result), CustomerCategoryDTO.class);
                }
                if (!CollectionUtils.isEmpty(customerCategoryDTOs)) {
                    return CoreDocJsonResult.success(customerCategoryDTOs);
                }
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.RESULT_IS_NULL));
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17A2451E04200051", (String)"\u6839\u636e\u7f16\u7801\u67e5\u8be2\u5ba2\u6237\u5206\u7c7b\u4fe1\u606f\u9519\u8bef:") + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<CustomerCategoryDTO> queryTree(CustomerCategoryQryDTO customerCategoryQryDTO) throws Exception {
        if (null != customerCategoryQryDTO) {
            List customerCategoryDTOs = null;
            QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantAPIUtils.merchantCustomerCategoryFieldMapping, (String[])CUSTOMER_CATEGORY_BASE_FIELDS);
            QueryConditionGroup conditionGroup = new QueryConditionGroup();
            if (customerCategoryQryDTO.getCode() != null) {
                conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").eq((Object)customerCategoryQryDTO.getCode()));
            }
            if (customerCategoryQryDTO.getName() != null) {
                conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"name").eq((Object)customerCategoryQryDTO.getName()));
            }
            if (customerCategoryQryDTO.getOrgId() != null) {
                conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"orgId").eq((Object)customerCategoryQryDTO.getOrgId()));
            }
            if (customerCategoryQryDTO.getBeganTime() != null) {
                conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"pubts").egt((Object)customerCategoryQryDTO.getBeganTime()));
            }
            if (customerCategoryQryDTO.getEndTime() != null) {
                conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"pubts").lt((Object)customerCategoryQryDTO.getEndTime()));
            }
            if (customerCategoryQryDTO.getPubts() != null) {
                conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"pubts").egt((Object)customerCategoryQryDTO.getPubts()));
            }
            Integer pageIndex = customerCategoryQryDTO.getPageIndex();
            Integer pageSize = customerCategoryQryDTO.getPageSize();
            if (pageIndex == null || pageIndex < 0) {
                pageIndex = 1;
            }
            if (pageSize == null || pageSize > UpcAPiTool.List_LENGTH) {
                pageSize = UpcAPiTool.List_LENGTH;
            }
            QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)conditionGroup).addPager(pageIndex.intValue(), pageSize.intValue());
            try {
                List result = MetaDaoHelper.query((String)"aa.custcategory.CustCategory", (boolean)true, (QuerySchema)schema, null);
                HashMap<Long, Map> character = new HashMap<Long, Map>();
                if (result != null && result.size() <= UpcAPiTool.List_LENGTH) {
                    String[] names = new String[]{"name", "comment"};
                    for (Map customerCategory : result) {
                        Object custClscharacter = customerCategory.get("custCategoryCharacter");
                        if (custClscharacter instanceof Map) {
                            character.put((Long)customerCategory.get("id"), (Map)customerCategory.get("custCategoryCharacter"));
                        } else {
                            customerCategory.remove("custCategoryCharacter");
                        }
                        UpcAPiTool.handleMultilingual((Map)customerCategory, (String[])names);
                    }
                    customerCategoryDTOs = JSON.parseArray((String)JSON.toJSONString((Object)result), CustomerCategoryDTO.class);
                } else if (result != null && result.size() > UpcAPiTool.List_LENGTH) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801224);
                }
                if (!CollectionUtils.isEmpty(customerCategoryDTOs)) {
                    for (CustomerCategoryDTO customerCategoryDTO : customerCategoryDTOs) {
                        customerCategoryDTO.setCustCategoryCharacter((Map)character.get(customerCategoryDTO.getId()));
                    }
                    return CoreDocJsonResult.success((List)customerCategoryDTOs);
                }
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.RESULT_IS_NULL));
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17A2451E04200052", (String)"\u67e5\u8be2\u5ba2\u6237\u5206\u7c7b\u4fe1\u606f\u9519\u8bef:") + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public Integer queryTreeCount(CustomerCategoryQryDTO customerCategoryQryDTO) throws Exception {
        QuerySchema schema;
        Map result;
        QueryConditionGroup conditionGroup = new QueryConditionGroup();
        if (customerCategoryQryDTO.getCode() != null) {
            conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").eq((Object)customerCategoryQryDTO.getCode()));
        }
        if (customerCategoryQryDTO.getName() != null) {
            conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"name").eq((Object)customerCategoryQryDTO.getName()));
        }
        if (customerCategoryQryDTO.getOrgId() != null) {
            conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"orgId").eq((Object)customerCategoryQryDTO.getOrgId()));
        }
        if (customerCategoryQryDTO.getBeganTime() != null) {
            conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"pubts").egt((Object)customerCategoryQryDTO.getBeganTime()));
        }
        if (customerCategoryQryDTO.getEndTime() != null) {
            conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"pubts").lt((Object)customerCategoryQryDTO.getEndTime()));
        }
        if ((result = MetaDaoHelper.queryOne((String)"aa.custcategory.CustCategory", (QuerySchema)(schema = QuerySchema.create().addSelect("count(1) as count").addCondition((ConditionExpression)conditionGroup)))) != null && result.get("count") != null) {
            Integer count = Integer.valueOf(result.get("count").toString());
            return count;
        }
        return null;
    }

    public CoreDocJsonResult<CustomerCategoryDTO> queryTreeByParent(CustomerCategoryQryDTO customerCategoryQryDTO) throws Exception {
        if (null != customerCategoryQryDTO) {
            try {
                QuerySchema schema;
                List result;
                List customerCategoryDTOs = null;
                QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantAPIUtils.merchantCustomerCategoryFieldMapping, (String[])CUSTOMER_CATEGORY_BASE_FIELDS);
                QueryConditionGroup conditionGroup = new QueryConditionGroup();
                if (customerCategoryQryDTO.getParent() != null) {
                    conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"parent").eq((Object)customerCategoryQryDTO.getParent()));
                }
                if (customerCategoryQryDTO.getCode() != null) {
                    conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").eq((Object)customerCategoryQryDTO.getCode()));
                }
                if (customerCategoryQryDTO.getName() != null) {
                    conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"name").eq((Object)customerCategoryQryDTO.getName()));
                }
                if (customerCategoryQryDTO.getOrgId() != null) {
                    conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"orgId").eq((Object)customerCategoryQryDTO.getOrgId()));
                }
                Integer pageIndex = customerCategoryQryDTO.getPageIndex();
                Integer pageSize = customerCategoryQryDTO.getPageSize();
                if (pageIndex == null || pageIndex < 0) {
                    pageIndex = 1;
                }
                if (pageSize == null || pageSize > UpcAPiTool.List_LENGTH) {
                    pageSize = UpcAPiTool.List_LENGTH;
                }
                if ((result = MetaDaoHelper.query((String)"aa.custcategory.CustCategory", (boolean)true, (QuerySchema)(schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)conditionGroup).addPager(pageIndex.intValue(), pageSize.intValue())), null)) != null && result.size() <= UpcAPiTool.List_LENGTH) {
                    String[] names = new String[]{"name", "comment"};
                    for (Map customerCategory : result) {
                        customerCategory = UpcAPiTool.handleMultilingual((Map)customerCategory, (String[])names);
                    }
                    customerCategoryDTOs = JSON.parseArray((String)JSON.toJSONString((Object)result), CustomerCategoryDTO.class);
                }
                if (!CollectionUtils.isEmpty(customerCategoryDTOs)) {
                    return CoreDocJsonResult.success(customerCategoryDTOs);
                }
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.RESULT_IS_NULL));
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17A2451E04200052", (String)"\u67e5\u8be2\u5ba2\u6237\u5206\u7c7b\u4fe1\u606f\u9519\u8bef:") + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<CustomerCategoryDTO> add(CustomerCategoryDTO customerCategoryDTO) throws Exception {
        if (null != customerCategoryDTO) {
            try {
                if (customerCategoryDTO.getCode() == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801120);
                }
                if (CoreDocBaseDao.queryIdByCode((String)customerCategoryDTO.getCode(), (String)"aa.custcategory.CustCategory") != null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801225);
                }
                CustCategory customerCategory = new CustCategory();
                customerCategory.put("_fromApi", (Object)true);
                customerCategory.put("_status", (Object)EntityStatus.Insert);
                Map map = (Map)JSON.parseObject((String)JSON.toJSONString((Object)customerCategoryDTO), HashMap.class);
                customerCategory.putAll(map);
                if (customerCategoryDTO.getName() != null) {
                    customerCategory.set("name", (Object)UpcAPiTool.handleMultilingual((MultilingualVO)customerCategoryDTO.getName()));
                }
                if (customerCategoryDTO.getComment() != null) {
                    customerCategory.set("comment", (Object)UpcAPiTool.handleMultilingual((MultilingualVO)customerCategoryDTO.getComment()));
                }
                DataTransferUtils.fill((String)"aa_custcategory", (String)"aa.custcategory.CustCategory", (Object)customerCategory, (int)3);
                if (customerCategoryDTO.getIsEnabled() == null) {
                    customerCategory.put("isEnabled", (Object)true);
                }
                if (customerCategory.getParent() != null) {
                    QuerySchema querySchema = QuerySchema.create().addSelect("orgId,level").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)customerCategory.getParent())}));
                    Map queryOrgId = MetaDaoHelper.queryOne((String)"aa.custcategory.CustCategory", (QuerySchema)querySchema);
                    if (queryOrgId == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800175);
                    }
                    if (customerCategory.getOrgId() == null) {
                        customerCategory.setOrgId(queryOrgId.get("orgId").toString());
                    } else if (!customerCategory.getOrgId().equals(queryOrgId.get("orgId").toString()) && !MerchantUtils.getAllowSelectNonLeafNodes()) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801152);
                    }
                    if (queryOrgId.get("level") != null && (Integer)queryOrgId.get("level") > 7) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801226);
                    }
                }
                Boolean singleOrg = this.upcControlRuleService.checkSingleOrg();
                if (customerCategory.getOrgId() != null && !singleOrg.booleanValue()) {
                    TreeApplyRangeUtils.getInstance().checkOrgPermission(this.upcControlRuleService, customerCategory.getOrgId(), "aa.custcategory.CustCategory", "aa_custcategory");
                }
                BillDataDto billDataDto = new BillDataDto();
                billDataDto.setBillnum("aa_custcategory");
                billDataDto.setAction("save");
                billDataDto.setData((Object)customerCategory);
                billDataDto.setFromApi(true);
                billDataDto.setConvertType(Integer.valueOf(3));
                Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
                CustomerCategoryDTO custDTO = new CustomerCategoryDTO();
                custDTO.setId((Long)((Map)result).get("id"));
                return CoreDocJsonResult.success((Object)custDTO);
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17A2451E04200055", (String)"\u5ba2\u6237\u5206\u7c7b\u65b0\u589e\u9519\u8bef:") + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<CustomerCategoryDTO> update(CustomerCategoryDTO customerCategoryDTO) throws Exception {
        if (null != customerCategoryDTO) {
            try {
                boolean checkResult;
                Map characterId;
                if (customerCategoryDTO.getCode() != null && customerCategoryDTO.getId() == null) {
                    Long id = CoreDocBaseDao.queryIdByCode((String)customerCategoryDTO.getCode(), (String)"aa.custcategory.CustCategory");
                    if (id == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800879);
                    }
                    customerCategoryDTO.setId(id);
                } else {
                    QuerySchema querySchema;
                    List queryId;
                    if (customerCategoryDTO.getCode() == null && customerCategoryDTO.getId() == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800880);
                    }
                    if (customerCategoryDTO.getId() != null && (queryId = MetaDaoHelper.query((String)"aa.custcategory.CustCategory", (QuerySchema)(querySchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)customerCategoryDTO.getId())}))))) != null && queryId.size() != 1) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800881);
                    }
                }
                CustCategory customerCategory = new CustCategory();
                if (customerCategory.getId() != null) {
                    customerCategory.setId(customerCategory.getId());
                }
                customerCategory.put("_fromApi", (Object)true);
                customerCategory.put("_status", (Object)EntityStatus.Update);
                Map map = (Map)JSON.parseObject((String)JSON.toJSONString((Object)customerCategoryDTO), HashMap.class);
                customerCategory.putAll(map);
                if (customerCategoryDTO.getName() != null) {
                    customerCategory.set("name", (Object)UpcAPiTool.handleMultilingual((MultilingualVO)customerCategoryDTO.getName()));
                }
                if (customerCategoryDTO.getComment() != null) {
                    customerCategory.set("comment", (Object)UpcAPiTool.handleMultilingual((MultilingualVO)customerCategoryDTO.getComment()));
                }
                DataTransferUtils.fill((String)"aa_custcategory", (String)"aa.custcategory.CustCategory", (Object)customerCategory, (int)3);
                QuerySchema schema = QuerySchema.create().addSelect("custCategoryCharacter,orgId,parent,isEnabled").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(customerCategory.getId())}));
                Map query = MetaDaoHelper.queryOne((String)"aa.custcategory.CustCategory", (QuerySchema)schema);
                if (query != null && query.get("custCategoryCharacter") != null && customerCategory.get("custCategoryCharacter") != null && (characterId = (Map)query.get("custCategoryCharacter")).get("id") != null) {
                    Map character = (Map)customerCategory.get("custCategoryCharacter");
                    character.put("id", characterId.get("id").toString());
                    customerCategory.put("custCategoryCharacter", (Object)character);
                }
                if (query != null && query.get("parent") != null && !MerchantUtils.getAllowSelectNonLeafNodes()) {
                    if (customerCategory.getParent() != null && !customerCategory.getParent().equals(query.get("parent"))) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801154);
                    }
                    if (customerCategory.getParent() == null) {
                        customerCategory.setParent(query.get("parent"));
                    }
                }
                if (query != null && query.get("orgId") != null) {
                    customerCategory.set("orgId", (Object)query.get("orgId").toString());
                }
                if (query != null && query.get("isEnabled") != null && customerCategory.get("isEnabled") == null) {
                    customerCategory.put("isEnabled", query.get("isEnabled"));
                }
                if (customerCategory.getParent() != null) {
                    QuerySchema querySchema = QuerySchema.create().addSelect("orgId,level").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)customerCategory.getParent())}));
                    Map queryOrgId = MetaDaoHelper.queryOne((String)"aa.custcategory.CustCategory", (QuerySchema)querySchema);
                    if (queryOrgId == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800175);
                    }
                    if (!customerCategory.getOrgId().equals(queryOrgId.get("orgId").toString()) && !MerchantUtils.getAllowSelectNonLeafNodes()) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801152);
                    }
                    if (queryOrgId.get("level") != null && (Integer)queryOrgId.get("level") > 7) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801226);
                    }
                }
                if (customerCategory.getId() != null && customerCategory.getParent() != null && customerCategory.getEntityStatus() == EntityStatus.Update && !(checkResult = this.productClsService.checkParent((Long)customerCategory.getId(), customerCategory.getParent(), "aa.custcategory.CustCategory"))) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800190);
                }
                BillDataDto billDataDto = new BillDataDto();
                billDataDto.setBillnum("aa_custcategory");
                billDataDto.setAction("save");
                billDataDto.setData((Object)customerCategory);
                billDataDto.setFromApi(true);
                billDataDto.setConvertType(Integer.valueOf(3));
                Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
                CustomerCategoryDTO custDTO = new CustomerCategoryDTO();
                custDTO.setId((Long)((Map)result).get("id"));
                return CoreDocJsonResult.success((Object)custDTO);
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17A2451E04200056", (String)"\u5ba2\u6237\u5206\u7c7b\u66f4\u65b0\u9519\u8bef:") + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<CustomerCategoryDTO> queryOrgByIds(List<Long> idList) throws Exception {
        return null;
    }

    public CoreDocJsonResult<MessageDTO> batchSave(List<CustomerCategoryDTO> customerCategoryDTOs) throws Exception {
        if (customerCategoryDTOs == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801155);
        }
        if (customerCategoryDTOs.size() > 10) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801227);
        }
        int successCount = 0;
        int failCount = 0;
        int count = 0;
        MessageDTO resultMessage = new MessageDTO();
        ArrayList successInfos = new ArrayList();
        ArrayList failInfos = new ArrayList();
        for (CustomerCategoryDTO customerCategoryDTO : customerCategoryDTOs) {
            if (customerCategoryDTO == null) continue;
            if (customerCategoryDTO.getErpCode() != null) {
                QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"erpCode").eq((Object)customerCategoryDTO.getErpCode())}));
                Map query = MetaDaoHelper.queryOne((String)"aa.custcategory.CustCategory", (QuerySchema)schema);
                CoreDocJsonResult<CustomerCategoryDTO> result = null;
                if (query == null || query.get("id") == null) {
                    result = this.add(customerCategoryDTO);
                } else if (query != null && query.get("id") != null) {
                    customerCategoryDTO.setId((Long)query.get("id"));
                    result = this.update(customerCategoryDTO);
                }
                if (result != null && result.getCode() == 200L) {
                    HashMap<String, String> successInfo = new HashMap<String, String>();
                    successInfo.put("erpCode", customerCategoryDTO.getErpCode());
                    successInfo.put("message", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_181E96BE05900037", (String)"\u4fdd\u5b58\u6210\u529f\uff01"));
                    successInfos.add(successInfo);
                    ++successCount;
                } else if (result != null && result.getCode() != 200L) {
                    HashMap<String, String> failInfo = new HashMap<String, String>();
                    failInfo.put("erpCode", customerCategoryDTO.getErpCode());
                    failInfo.put("message", result.getMessage());
                    failInfos.add(failInfo);
                    ++failCount;
                }
                ++count;
                continue;
            }
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801228);
        }
        resultMessage.setSuccessInfos(successInfos);
        resultMessage.setFailInfos(failInfos);
        resultMessage.setCount(Integer.valueOf(count));
        resultMessage.setFailCount(Integer.valueOf(failCount));
        resultMessage.setSuccessCount(Integer.valueOf(successCount));
        return CoreDocJsonResult.success((Object)resultMessage);
    }

    public CoreDocJsonResult<CustomerCategoryDTO> batchUpdate(List<CustomerCategoryDTO> customerCategoryDTOs) throws Exception {
        return null;
    }

    public CoreDocJsonResult<String> delete(CustomerCategoryDTO customerCategoryDTO) {
        if (null != customerCategoryDTO) {
            try {
                CustCategory custCategory = new CustCategory();
                if (customerCategoryDTO.getId() != null) {
                    custCategory.setId((Object)customerCategoryDTO.getId());
                }
                if (customerCategoryDTO.getId() == null && customerCategoryDTO.getCode() != null) {
                    Long id = CoreDocBaseDao.queryIdByCode((String)customerCategoryDTO.getCode(), (String)"aa.custcategory.CustCategory");
                    if (id == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800879);
                    }
                    custCategory.setId((Object)id);
                    custCategory.setCode(customerCategoryDTO.getCode());
                    QuerySchema querySchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"parent").eq((Object)id)}));
                    List queryId = MetaDaoHelper.query((String)"aa.custcategory.CustCategory", (QuerySchema)querySchema);
                    if (!CollectionUtils.isEmpty((Collection)queryId)) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801229);
                    }
                }
                ArrayList<Map> custCategoryList = new ArrayList<Map>();
                custCategory.put("_fromApi", (Object)true);
                custCategoryList.add((Map)JSON.parseObject((String)JSON.toJSONString((Object)custCategory), HashMap.class));
                BillDataDto billDataDto = new BillDataDto();
                billDataDto.setBillnum("aa_custcategory");
                billDataDto.setAction("delete");
                billDataDto.setData(custCategoryList);
                billDataDto.setFromApi(true);
                ResultList result = this.billService.batchdelete(billDataDto);
                if (result.getSucessCount() > 0) {
                    return CoreDocJsonResult.success((Object)InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_19B9B7040570000D", (String)"\u5220\u9664\u6210\u529f\uff01"));
                }
                if (!CollectionUtils.isEmpty((Collection)result.getMessages())) {
                    throw new CoreDocBusinessException(result.getMessages().get(0).toString());
                }
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error("\u5ba2\u6237\u5206\u7c7b\u5220\u9664\u9519\u8bef:" + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<CustomerCategoryDTO> addIdempotent(OpenAPIDTO<CustomerCategoryDTO> customerCategoryDTO) {
        if (customerCategoryDTO == null || customerCategoryDTO.getData() == null) {
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
        }
        try {
            return this.add((CustomerCategoryDTO)customerCategoryDTO.getData());
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)businessException);
        }
        catch (Exception e) {
            log.error("\u5ba2\u6237\u5206\u7c7b\u65b0\u589e-\u5e42\u7b49\u9519\u8bef:" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    public CoreDocJsonResult<MerchantClsVO> queryMerchantCls(BatchApiQueryParamWithOrg batchApiQueryParamWithOrg) throws Exception {
        CoreDocJsonResult coreDocJsonResult;
        int recordCount = IPassServiceUtils.getRecordsCount(batchApiQueryParamWithOrg, "aa.custcategory.CustCategory");
        if (recordCount > 0) {
            if (batchApiQueryParamWithOrg.getPageSize() > (long)UpcAPiTool.PAGE_MAX_SIZE.intValue()) {
                batchApiQueryParamWithOrg.setPageSize((long)UpcAPiTool.PAGE_MAX_SIZE.intValue());
            }
            QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantAPIUtils.merchantCustomerCategoryFieldMapping, (String[])CUSTOMER_CATEGORY_BASE_FIELDS);
            ArrayList<QueryField> queryFieldList = new ArrayList<QueryField>(Arrays.asList(qryFields));
            queryFieldList.add(new QueryField("parent.code", "parent___code"));
            queryFieldList.add(new QueryField("parent.name", "parent___name"));
            queryFieldList.add(new QueryField("orgId.code", "orgId___code"));
            queryFieldList.add(new QueryField("orgId.name", "orgId___name"));
            QueryField[] queryFieldArray = queryFieldList.toArray(new QueryField[queryFieldList.size()]);
            QuerySchema schema = QuerySchema.create().addSelect(queryFieldArray).addCondition((ConditionExpression)IPassServiceUtils.getQueryConditionGroup(batchApiQueryParamWithOrg)).addPager(Long.valueOf(batchApiQueryParamWithOrg.getPageIndex()).intValue(), Long.valueOf(batchApiQueryParamWithOrg.getPageSize()).intValue()).addOrderBy("level");
            List merchantClsList = MetaDaoHelper.queryObject((String)"aa.custcategory.CustCategory", (boolean)true, (QuerySchema)schema, null);
            ArrayList<MerchantClsVO> merchantClsVOList = new ArrayList<MerchantClsVO>();
            for (CustCategory merchantCls : merchantClsList) {
                MerchantClsVO merchantClsVO = (MerchantClsVO)JSON.parseObject((String)JSON.toJSONString((Object)merchantCls), MerchantClsVO.class);
                if (merchantCls.get("name") != null) {
                    merchantClsVO.setName(new MultiLangText((Map)merchantCls.get("name")));
                }
                if (merchantCls.get("comment") != null) {
                    merchantClsVO.setComment(new MultiLangText((Map)merchantCls.get("comment")));
                }
                merchantClsVOList.add(merchantClsVO);
            }
            coreDocJsonResult = CoreDocJsonResult.success(merchantClsVOList);
        } else {
            coreDocJsonResult = CoreDocJsonResult.success(null);
        }
        coreDocJsonResult.setTotalCount(Integer.valueOf(recordCount));
        return coreDocJsonResult;
    }

    public Long saveMerchantCls(String matchRule, MerchantClsVO merchantClsVO) throws Exception {
        QueryConditionGroup condition;
        MultilingualVO multilingualVO;
        CustomerCategoryDTO customerCategoryDTO = new CustomerCategoryDTO();
        BeanUtils.copyProperties((Object)merchantClsVO, (Object)customerCategoryDTO);
        if (merchantClsVO != null && merchantClsVO.getId() != null && merchantClsVO.getId().length() > 0) {
            customerCategoryDTO.setId(Long.valueOf(merchantClsVO.getId()));
        }
        if (merchantClsVO.getParent() != null && !"".equals(merchantClsVO.getParent())) {
            customerCategoryDTO.setParent(merchantClsVO.getParent());
        } else {
            if (merchantClsVO.getParent___code() != null) {
                customerCategoryDTO.setParentCode(merchantClsVO.getParent___code());
            }
            if (merchantClsVO.getParent___name() != null) {
                customerCategoryDTO.setParentName(merchantClsVO.getParent___name());
            }
        }
        if (!StringUtils.isEmpty((Object)merchantClsVO.getOrgId())) {
            customerCategoryDTO.setOrgId(merchantClsVO.getOrgId());
        } else {
            if (!StringUtils.isEmpty((Object)merchantClsVO.getOrgId___code())) {
                customerCategoryDTO.setOrgCode(merchantClsVO.getOrgId___code());
            }
            if (!StringUtils.isEmpty((Object)merchantClsVO.getOrgId___name())) {
                customerCategoryDTO.setOrgName(merchantClsVO.getOrgId___name());
            }
        }
        if (!ObjectUtils.isEmpty((Object)merchantClsVO.getName())) {
            MultiLangText name = merchantClsVO.getName();
            multilingualVO = new MultilingualVO();
            multilingualVO.setSimplifiedName(name.getText("zh_CN"));
            multilingualVO.setEnglishName(name.getText("en_US"));
            multilingualVO.setTraditionalName(name.getText("zh_TW"));
            customerCategoryDTO.setName(multilingualVO);
        }
        if (!ObjectUtils.isEmpty((Object)merchantClsVO.getComment())) {
            MultiLangText comment = merchantClsVO.getComment();
            multilingualVO = new MultilingualVO();
            multilingualVO.setSimplifiedName(comment.getText("zh_CN"));
            multilingualVO.setEnglishName(comment.getText("en_US"));
            multilingualVO.setTraditionalName(comment.getText("zh_TW"));
            customerCategoryDTO.setComment(multilingualVO);
        }
        CoreDocJsonResult<CustomerCategoryDTO> result = new CoreDocJsonResult<CustomerCategoryDTO>();
        if (!"id".equals(matchRule)) {
            condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)customerCategoryDTO.getCode())});
            QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)condition);
            List ccustList = MetaDaoHelper.queryObject((String)"aa.custcategory.CustCategory", (boolean)true, (QuerySchema)schema, null);
            if (!CollectionUtils.isEmpty((Collection)ccustList)) {
                customerCategoryDTO.setId((Long)((CustCategory)ccustList.get(0)).getId());
                result = this.update(customerCategoryDTO);
            } else {
                result = this.add(customerCategoryDTO);
            }
        } else if (customerCategoryDTO != null && customerCategoryDTO.getId() != null && !"".equals(customerCategoryDTO.getId())) {
            condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)customerCategoryDTO.getId())});
            QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)condition);
            List ccustList = MetaDaoHelper.queryObject((String)"aa.custcategory.CustCategory", (boolean)true, (QuerySchema)schema, null);
            if (!CollectionUtils.isEmpty((Collection)ccustList)) {
                customerCategoryDTO.setId((Long)((CustCategory)ccustList.get(0)).getId());
                result = this.update(customerCategoryDTO);
            } else {
                result = this.add(customerCategoryDTO);
            }
        } else {
            result = this.add(customerCategoryDTO);
        }
        if (BooleanUtil.isFalse((Object)result.isSuccess())) {
            throw new CoreDocBusinessException(result.getMessage());
        }
        return ((CustomerCategoryDTO)result.getData().get(0)).getId();
    }

    public String deleteMerchantCls(String id, String code) {
        CustomerCategoryDTO customerCategoryDTO = new CustomerCategoryDTO();
        customerCategoryDTO.setId(Long.valueOf(Long.parseLong(id)));
        customerCategoryDTO.setCode(code);
        CoreDocJsonResult<String> deleteRes = this.delete(customerCategoryDTO);
        if (deleteRes.isSuccess()) {
            return null;
        }
        return deleteRes.getMessage();
    }
}


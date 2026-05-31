/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.iuap.BusinessException
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.MerchantAPIUtils
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.po.pub.BatchApiQueryParamWithOrg
 *  com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils
 *  com.yonyou.iuap.apdoc.coredoc.vo.merchantcls.MerchantTypeVO
 *  com.yonyou.iuap.international.MultiLangText
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService
 *  com.yonyou.ucf.mdd.ext.bill.biz.BillBiz
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.iuap.upc.api.ICustomerTypeService
 *  com.yonyoucloud.iuap.upc.dto.derivatives.CustomerTypeDTO
 *  com.yonyoucloud.iuap.upc.dto.derivatives.CustomerTypeQryDTO
 *  com.yonyoucloud.iuap.upc.dto.openapi.OpenAPIDTO
 *  com.yonyoucloud.iuap.upc.vo.MultilingualVO
 *  com.yonyoucloud.upc.aa.customertype.CustomerType
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
import com.yonyou.iuap.BusinessException;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.MerchantAPIUtils;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.po.pub.BatchApiQueryParamWithOrg;
import com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils;
import com.yonyou.iuap.apdoc.coredoc.vo.merchantcls.MerchantTypeVO;
import com.yonyou.iuap.international.MultiLangText;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService;
import com.yonyou.ucf.mdd.ext.bill.biz.BillBiz;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.iuap.upc.api.ICustomerTypeService;
import com.yonyoucloud.iuap.upc.dto.derivatives.CustomerTypeDTO;
import com.yonyoucloud.iuap.upc.dto.derivatives.CustomerTypeQryDTO;
import com.yonyoucloud.iuap.upc.dto.openapi.OpenAPIDTO;
import com.yonyoucloud.iuap.upc.vo.MultilingualVO;
import com.yonyoucloud.upc.aa.customertype.CustomerType;
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
public class CustomerTypeServiceImpl
implements ICustomerTypeService {
    private static final Logger log = LoggerFactory.getLogger(CustomerTypeServiceImpl.class);
    private static final String[] CUSTOMER_TYPE_BASE_FIELDS = new String[]{"id", "code", "name", "comment", "stopStatus"};
    @Autowired
    private ApiImportCommandService apiImportSingleService;

    public CoreDocJsonResult<CustomerTypeDTO> listByPage(CustomerTypeQryDTO customerTypeQryDTO) throws Exception {
        if (null != customerTypeQryDTO) {
            try {
                QuerySchema schema;
                List result;
                List customerTypeDTOs = null;
                QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantAPIUtils.merchantCustomerTypeFieldMapping, (String[])CUSTOMER_TYPE_BASE_FIELDS);
                QueryConditionGroup conditionGroup = new QueryConditionGroup();
                if (customerTypeQryDTO.getCode() != null) {
                    conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").eq((Object)customerTypeQryDTO.getCode()));
                }
                if (customerTypeQryDTO.getName() != null) {
                    conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"name").eq((Object)customerTypeQryDTO.getName()));
                }
                if (customerTypeQryDTO.getBeganTime() != null) {
                    conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"pubts").egt((Object)customerTypeQryDTO.getBeganTime()));
                }
                if (customerTypeQryDTO.getEndTime() != null) {
                    conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"pubts").lt((Object)customerTypeQryDTO.getEndTime()));
                }
                Integer pageIndex = customerTypeQryDTO.getPageIndex();
                Integer pageSize = customerTypeQryDTO.getPageSize();
                if (pageIndex == null || pageIndex < 0) {
                    pageIndex = 1;
                }
                if (pageSize == null || pageSize > UpcAPiTool.List_LENGTH) {
                    pageSize = UpcAPiTool.List_LENGTH;
                }
                if ((result = MetaDaoHelper.query((String)"aa.customertype.CustomerType", (boolean)true, (QuerySchema)(schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)conditionGroup).addPager(pageIndex.intValue(), pageSize.intValue())), null)) != null && result.size() <= UpcAPiTool.List_LENGTH) {
                    String[] names = new String[]{"name"};
                    for (Map customerType : result) {
                        customerType = UpcAPiTool.handleMultilingual((Map)customerType, (String[])names);
                    }
                    customerTypeDTOs = JSON.parseArray((String)JSON.toJSONString((Object)result), CustomerTypeDTO.class);
                }
                if (!CollectionUtils.isEmpty(customerTypeDTOs)) {
                    return CoreDocJsonResult.success(customerTypeDTOs);
                }
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.RESULT_IS_NULL));
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error("\u67e5\u8be2\u9500\u552e\u6e20\u9053\u4fe1\u606f\u9519\u8bef:" + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<CustomerTypeDTO> listByQryCondition(CustomerTypeQryDTO customerTypeQryDTO) {
        if (null != customerTypeQryDTO) {
            try {
                QuerySchema schema;
                List result;
                List customerTypeDTOs = null;
                QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantAPIUtils.merchantCustomerTypeFieldMapping, (String[])CUSTOMER_TYPE_BASE_FIELDS);
                QueryConditionGroup conditionGroup = new QueryConditionGroup();
                if (customerTypeQryDTO.getCode() != null) {
                    conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").eq((Object)customerTypeQryDTO.getCode()));
                }
                if (customerTypeQryDTO.getName() != null) {
                    conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"name").eq((Object)customerTypeQryDTO.getName()));
                }
                if (customerTypeQryDTO.getId() != null) {
                    conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").eq((Object)customerTypeQryDTO.getId()));
                }
                if (customerTypeQryDTO.getIdList() != null) {
                    conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").in((Collection)customerTypeQryDTO.getIdList()));
                }
                Integer pageIndex = customerTypeQryDTO.getPageIndex();
                Integer pageSize = customerTypeQryDTO.getPageSize();
                if (pageIndex == null || pageIndex < 0) {
                    pageIndex = 1;
                }
                if (pageSize == null || pageSize > UpcAPiTool.List_LENGTH) {
                    pageSize = UpcAPiTool.List_LENGTH;
                }
                if ((result = MetaDaoHelper.query((String)"aa.customertype.CustomerType", (boolean)true, (QuerySchema)(schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)conditionGroup).addPager(pageIndex.intValue(), pageSize.intValue())), null)) != null && result.size() <= UpcAPiTool.List_LENGTH) {
                    String[] names = new String[]{"name"};
                    for (Map customerType : result) {
                        UpcAPiTool.handleMultilingual((Map)customerType, (String[])names);
                    }
                    customerTypeDTOs = JSON.parseArray((String)JSON.toJSONString((Object)result), CustomerTypeDTO.class);
                }
                if (!CollectionUtils.isEmpty(customerTypeDTOs)) {
                    return CoreDocJsonResult.success(customerTypeDTOs);
                }
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.RESULT_IS_NULL));
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error("\u67e5\u8be2\u9500\u552e\u6e20\u9053\u4fe1\u606f\u9519\u8bef:" + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<CustomerTypeDTO> addIdempotent(OpenAPIDTO<CustomerTypeDTO> dto) {
        if (dto == null || dto.getData() == null) {
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
        }
        try {
            CustomerTypeDTO customerTypeDTO = (CustomerTypeDTO)dto.getData();
            Map map = (Map)UpcJacksonUtils.OBJECT_MAPPER.readValue(UpcJacksonUtils.OBJECT_MAPPER.writeValueAsString((Object)customerTypeDTO), HashMap.class);
            CustomerType customerType = new CustomerType();
            customerType.putAll(map);
            customerType.put("_fromApi", (Object)true);
            customerType.put("_status", (Object)EntityStatus.Insert);
            if (customerTypeDTO.getName() != null) {
                customerType.set("name", (Object)UpcAPiTool.handleMultilingual((MultilingualVO)customerTypeDTO.getName()));
            }
            if (customerTypeDTO.getStopStatus() != null && !customerTypeDTO.getStopStatus().booleanValue()) {
                customerType.put("stopstatus", (Object)0);
            } else if (customerTypeDTO.getStopStatus() != null && customerTypeDTO.getStopStatus().booleanValue()) {
                customerType.put("stopstatus", (Object)1);
            } else if (customerTypeDTO.getStopStatus() == null) {
                customerType.put("stopstatus", (Object)0);
            }
            BillDataDto billDataDto = UpcAPiTool.builderBillData((String)"aa_customerType", (Object)customerType, (boolean)true, (int)3);
            Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
            CustomerTypeDTO saveResult = new CustomerTypeDTO();
            saveResult.setId((Long)((Map)result).get("id"));
            return CoreDocJsonResult.success((Object)saveResult);
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)businessException);
        }
        catch (Exception e) {
            log.error("\u9500\u552e\u6e20\u9053\u65b0\u589e-\u5e42\u7b49\u63a5\u53e3\u5f02\u5e38\uff1a" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    public CoreDocJsonResult<CustomerTypeDTO> updateIdempotent(OpenAPIDTO<CustomerTypeDTO> dto) {
        if (dto == null || dto.getData() == null) {
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
        }
        try {
            CustomerTypeDTO customerTypeDTO = (CustomerTypeDTO)dto.getData();
            Map map = (Map)UpcJacksonUtils.OBJECT_MAPPER.readValue(UpcJacksonUtils.OBJECT_MAPPER.writeValueAsString((Object)customerTypeDTO), HashMap.class);
            CustomerType customerType = new CustomerType();
            QueryConditionGroup queryConditionGroup = null;
            if (customerTypeDTO.getCode() != null && customerTypeDTO.getId() == null) {
                queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)customerTypeDTO.getCode())});
            } else {
                if (customerTypeDTO.getCode() == null && customerTypeDTO.getId() == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800880);
                }
                if (customerTypeDTO.getId() != null) {
                    queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)customerTypeDTO.getId())});
                }
            }
            QuerySchema querySchema = QuerySchema.create().addSelect("id,name").addCondition(queryConditionGroup);
            List queryResults = MetaDaoHelper.query((String)"aa.customertype.CustomerType", (boolean)true, (QuerySchema)querySchema, null);
            if (queryResults == null || queryResults.size() != 1) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801264);
            }
            Map queryResult = (Map)queryResults.get(0);
            customerType.putAll(map);
            customerType.put("_fromApi", (Object)true);
            customerType.put("_status", (Object)EntityStatus.Update);
            customerType.setId(queryResult.get("id"));
            if (customerTypeDTO.getName() != null) {
                customerType.set("name", (Object)UpcAPiTool.handleMultilingual((MultilingualVO)customerTypeDTO.getName()));
            }
            if (customerTypeDTO.getStopStatus() != null) {
                customerType.put("stopstatus", (Object)customerTypeDTO.getStopStatus());
            }
            BillDataDto billDataDto = UpcAPiTool.builderBillData((String)"aa_customerType", (Object)customerType, (boolean)true, (int)3);
            Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
            CustomerTypeDTO saveResult = new CustomerTypeDTO();
            saveResult.setId((Long)((Map)result).get("id"));
            return CoreDocJsonResult.success((Object)saveResult);
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)businessException);
        }
        catch (Exception e) {
            log.error("\u9500\u552e\u6e20\u9053\u66f4\u65b0-\u5e42\u7b49\u63a5\u53e3\u5f02\u5e38\uff1a" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    public Long customerTypeSave(String matchRule, MerchantTypeVO customerTypeVO) throws Exception {
        Long id = 0L;
        CustomerType customerType = this.convertCustomerType(matchRule, customerTypeVO);
        this.dataPreprocessing(matchRule, customerType);
        customerType.put("_fromApi", (Object)true);
        BillDataDto billDataDto = UpcAPiTool.builderBillData((String)"aa_customerType", (Object)customerType, (boolean)true, (int)4);
        Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
        if (result != null) {
            id = (Long)((CustomerType)result).getId();
        }
        return id;
    }

    public void dataPreprocessing(String matchRule, CustomerType customerType) throws Exception {
        if (!"id".equals(matchRule)) {
            QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)customerType.getCode())});
            QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)condition);
            List customerTypeList = MetaDaoHelper.queryObject((String)"aa.customertype.CustomerType", (boolean)true, (QuerySchema)schema, null);
            if (!CollectionUtils.isEmpty((Collection)customerTypeList)) {
                customerType.setId(((CustomerType)customerTypeList.get(0)).getId());
                customerType.setEntityStatus(EntityStatus.Update);
            } else {
                customerType.setEntityStatus(EntityStatus.Insert);
                if (customerType.getStopstatus() == null) {
                    customerType.setStopstatus(Boolean.valueOf(false));
                }
            }
        } else if (customerType != null && customerType.getId() != null && !"".equals(customerType.getId())) {
            QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(customerType.getId())});
            QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)condition);
            List customerTypeList = MetaDaoHelper.queryObject((String)"aa.customertype.CustomerType", (boolean)true, (QuerySchema)schema, null);
            if (!CollectionUtils.isEmpty((Collection)customerTypeList)) {
                customerType.setId(((CustomerType)customerTypeList.get(0)).getId());
                customerType.setEntityStatus(EntityStatus.Update);
            } else {
                customerType.setEntityStatus(EntityStatus.Insert);
                if (customerType.getStopstatus() == null) {
                    customerType.setStopstatus(Boolean.valueOf(false));
                }
            }
        } else {
            customerType.setEntityStatus(EntityStatus.Insert);
            if (customerType.getStopstatus() == null) {
                customerType.setStopstatus(Boolean.valueOf(false));
            }
        }
    }

    public CustomerType convertCustomerType(String matchRule, MerchantTypeVO customerTypeVO) {
        CustomerType customerType = new CustomerType();
        boolean blank = false;
        if (customerTypeVO.getBlank() != null) {
            blank = customerTypeVO.getBlank();
        }
        if (null != customerTypeVO.getId()) {
            customerType.setId((Object)customerTypeVO.getId());
        }
        if (!StringUtils.hasLength((String)customerTypeVO.getCode())) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.CUSTOMER_TRADE_CODE_NOT_NULL);
        }
        customerType.setCode(customerTypeVO.getCode());
        if (ObjectUtils.isEmpty((Object)customerTypeVO.getName())) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.CUSTOMER_TRADE_NAME_NOT_NULL);
        }
        customerType.set("name", (Object)customerTypeVO.getName().toMap());
        if (StringUtils.hasLength((String)customerTypeVO.getComment())) {
            customerType.setComment(customerTypeVO.getComment());
        } else if (blank) {
            customerType.setComment(null);
        }
        if (customerTypeVO.getStopstatus() != null) {
            customerType.setStopstatus(customerTypeVO.getStopstatus());
        }
        return customerType;
    }

    public CoreDocJsonResult<MerchantTypeVO> queryCustomerType(BatchApiQueryParamWithOrg batchApiQueryParamWithOrg) throws Exception {
        CoreDocJsonResult coreDocJsonResult;
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        if (!CollectionUtils.isEmpty((Collection)batchApiQueryParamWithOrg.getIds())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").in((Collection)batchApiQueryParamWithOrg.getIds()));
        } else if (StringUtils.hasLength((String)batchApiQueryParamWithOrg.getId())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").eq((Object)Long.parseLong(batchApiQueryParamWithOrg.getId())));
        }
        if (StringUtils.hasLength((String)batchApiQueryParamWithOrg.getCode())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").eq((Object)batchApiQueryParamWithOrg.getCode()));
        }
        if (batchApiQueryParamWithOrg.getStartTs() != null || batchApiQueryParamWithOrg.getEndTs() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"pubts").between((Object)batchApiQueryParamWithOrg.getStartTs(), (Object)batchApiQueryParamWithOrg.getEndTs()));
        }
        int recordCount = 0;
        QuerySchema countSchema = QuerySchema.create().addSelect("count(1) as count").addCondition((ConditionExpression)queryConditionGroup);
        Map result = MetaDaoHelper.queryOne((String)"aa.customertype.CustomerType", (QuerySchema)countSchema);
        if (result != null && result.get("count") != null) {
            recordCount = Integer.parseInt(result.get("count").toString());
        }
        if (recordCount > 0) {
            if (batchApiQueryParamWithOrg.getPageSize() > (long)UpcAPiTool.PAGE_MAX_SIZE.intValue()) {
                batchApiQueryParamWithOrg.setPageSize((long)UpcAPiTool.PAGE_MAX_SIZE.intValue());
            }
            QuerySchema schema = QuerySchema.create().addSelect("id,code,name,comment,stopstatus").addCondition((ConditionExpression)queryConditionGroup).addPager(Long.valueOf(batchApiQueryParamWithOrg.getPageIndex()).intValue(), Long.valueOf(batchApiQueryParamWithOrg.getPageSize()).intValue());
            List customerTypeList = MetaDaoHelper.queryObject((String)"aa.customertype.CustomerType", (boolean)true, (QuerySchema)schema, null);
            ArrayList<MerchantTypeVO> customerTypeVOList = new ArrayList<MerchantTypeVO>();
            for (CustomerType customerType : customerTypeList) {
                MerchantTypeVO customerTypeVO = (MerchantTypeVO)JSON.parseObject((String)JSON.toJSONString((Object)customerType), MerchantTypeVO.class);
                if (customerType.get("name") != null) {
                    customerTypeVO.setName(new MultiLangText((Map)customerType.get("name")));
                }
                customerTypeVOList.add(customerTypeVO);
            }
            coreDocJsonResult = CoreDocJsonResult.success(customerTypeVOList);
        } else {
            coreDocJsonResult = CoreDocJsonResult.success(null);
        }
        coreDocJsonResult.setTotalCount(Integer.valueOf(recordCount));
        return coreDocJsonResult;
    }

    public String delete(String customerTypeId, String customerTypeCode) throws Exception {
        if (!StringUtils.hasLength((String)customerTypeId) && !StringUtils.hasLength((String)customerTypeCode)) {
            return null;
        }
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        if (StringUtils.hasLength((String)customerTypeId)) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").eq((Object)Long.parseLong(customerTypeId)));
        } else if (StringUtils.hasLength((String)customerTypeCode)) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").eq((Object)customerTypeCode));
        }
        QuerySchema schema = QuerySchema.create().addSelect("id,code,name,comment,stopstatus,pubts").addCondition((ConditionExpression)queryConditionGroup);
        List customerTypeList = MetaDaoHelper.queryObject((String)"aa.customertype.CustomerType", (QuerySchema)schema, null);
        if (CollectionUtils.isEmpty((Collection)customerTypeList)) {
            return null;
        }
        BillDataDto bill = new BillDataDto();
        bill.setData((Object)customerTypeList);
        bill.setBillnum("aa_customerTypelist");
        RuleExecuteResult result = BillBiz.delete((BillDataDto)bill);
        if (!CollectionUtils.isEmpty((Collection)result.getMessages())) {
            return result.getMessages().get(0).toString();
        }
        return null;
    }
}


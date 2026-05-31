/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.iuap.BusinessException
 *  com.yonyou.iuap.apdoc.coredoc.dao.pub.CoreDocBaseDao
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.MerchantAPIUtils
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.po.pub.BatchApiQueryParamWithOrg
 *  com.yonyou.iuap.apdoc.coredoc.po.pub.PubCommonVO
 *  com.yonyou.iuap.apdoc.coredoc.vo.salearea.SaleAreaVO
 *  com.yonyou.iuap.international.MultiLangText
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService
 *  com.yonyou.ucf.mdd.ext.bill.biz.BillBiz
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils
 *  com.yonyoucloud.iuap.upc.api.ISaleAreaService
 *  com.yonyoucloud.iuap.upc.dto.derivatives.SaleAreaDTO
 *  com.yonyoucloud.iuap.upc.dto.derivatives.SaleAreaQryDTO
 *  com.yonyoucloud.iuap.upc.dto.openapi.OpenAPIDTO
 *  com.yonyoucloud.iuap.upc.vo.MultilingualVO
 *  com.yonyoucloud.upc.aa.salearea.SaleArea
 *  com.yonyoucloud.upc.utils.CoreDocJsonResult
 *  com.yonyoucloud.upc.utils.MerchantUtils
 *  org.imeta.orm.base.BizObject
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
import com.yonyou.iuap.apdoc.coredoc.api.service.APIIpassService;
import com.yonyou.iuap.apdoc.coredoc.dao.pub.CoreDocBaseDao;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.MerchantAPIUtils;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.po.pub.BatchApiQueryParamWithOrg;
import com.yonyou.iuap.apdoc.coredoc.po.pub.PubCommonVO;
import com.yonyou.iuap.apdoc.coredoc.vo.salearea.SaleAreaVO;
import com.yonyou.iuap.international.MultiLangText;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService;
import com.yonyou.ucf.mdd.ext.bill.biz.BillBiz;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils;
import com.yonyoucloud.iuap.upc.api.ISaleAreaService;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.iuap.upc.dto.derivatives.SaleAreaDTO;
import com.yonyoucloud.iuap.upc.dto.derivatives.SaleAreaQryDTO;
import com.yonyoucloud.iuap.upc.dto.openapi.OpenAPIDTO;
import com.yonyoucloud.iuap.upc.vo.MultilingualVO;
import com.yonyoucloud.upc.aa.salearea.SaleArea;
import com.yonyoucloud.upc.service.utils.TreeApplyRangeUtils;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import com.yonyoucloud.upc.utils.MerchantUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
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
public class SaleAreaServiceImpl
extends APIIpassService
implements ISaleAreaService {
    private static final Logger log = LoggerFactory.getLogger(SaleAreaServiceImpl.class);
    @Autowired
    private ApiImportCommandService apiImportSingleService;
    @Autowired
    private IUPCControlRuleService upcControlRuleService;
    private static final String[] SALE_AREA_BASE_FIELDS = new String[]{"id", "code", "name", "parent", "parentCode", "parentName", "level", "order", "remark", "stopStatus", "saleAreaCharacter", "orgId", "path"};

    public CoreDocJsonResult<SaleAreaDTO> queryByID(Long id) throws Exception {
        if (null != id) {
            try {
                SaleAreaDTO saleAreaDTO = null;
                QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantAPIUtils.merchantSaleAreaFieldMapping, (String[])SALE_AREA_BASE_FIELDS);
                QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)id)}));
                List result = MetaDaoHelper.query((String)"aa.salearea.SaleArea", (boolean)true, (QuerySchema)schema, null);
                HashMap<Long, Map> character = new HashMap<Long, Map>();
                if (result != null && result.size() == 1) {
                    String[] names = new String[]{"name", "remark"};
                    for (Map saleArea : result) {
                        if (saleArea.get("saleAreaCharacter") instanceof Map) {
                            character.put((Long)saleArea.get("id"), (Map)saleArea.get("saleAreaCharacter"));
                        } else {
                            saleArea.remove("saleAreaCharacter");
                        }
                        saleArea = UpcAPiTool.handleMultilingual((Map)saleArea, (String[])names);
                    }
                    saleAreaDTO = (SaleAreaDTO)JSON.parseObject((String)JSON.toJSONString(result.get(0)), SaleAreaDTO.class);
                }
                if (saleAreaDTO != null) {
                    saleAreaDTO.setSaleAreaCharacter((Map)character.get(saleAreaDTO.getId()));
                    return CoreDocJsonResult.success(saleAreaDTO);
                }
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.RESULT_IS_NULL));
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17A2451E04200077", (String)"\u6839\u636eID\u67e5\u8be2\u9500\u552e\u533a\u57df\u4fe1\u606f\u9519\u8bef:") + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<SaleAreaDTO> queryByIDList(List<Long> idList) throws Exception {
        if (null != idList) {
            try {
                List saleAreaDTOs = null;
                QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantAPIUtils.merchantSaleAreaFieldMapping, (String[])SALE_AREA_BASE_FIELDS);
                QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(idList)}));
                List result = MetaDaoHelper.query((String)"aa.salearea.SaleArea", (boolean)true, (QuerySchema)schema, null);
                if (result != null && result.size() > 0) {
                    String[] names = new String[]{"name", "remark"};
                    for (Map saleArea : result) {
                        saleArea = UpcAPiTool.handleMultilingual((Map)saleArea, (String[])names);
                    }
                    saleAreaDTOs = JSON.parseArray((String)JSON.toJSONString((Object)result), SaleAreaDTO.class);
                }
                if (!CollectionUtils.isEmpty(saleAreaDTOs)) {
                    return CoreDocJsonResult.success(saleAreaDTOs);
                }
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.RESULT_IS_NULL));
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17A2451E04200077", (String)"\u6839\u636eID\u67e5\u8be2\u9500\u552e\u533a\u57df\u4fe1\u606f\u9519\u8bef:") + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<SaleAreaDTO> queryByCode(String code) throws Exception {
        if (null != code) {
            try {
                SaleAreaDTO saleAreaDTO = null;
                QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantAPIUtils.merchantSaleAreaFieldMapping, (String[])SALE_AREA_BASE_FIELDS);
                QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)code)}));
                List result = MetaDaoHelper.query((String)"aa.salearea.SaleArea", (boolean)true, (QuerySchema)schema, null);
                HashMap<Long, Map> character = new HashMap<Long, Map>();
                if (result != null && result.size() == 1) {
                    String[] names = new String[]{"name", "remark"};
                    for (Map saleArea : result) {
                        if (saleArea.get("saleAreaCharacter") instanceof Map) {
                            character.put((Long)saleArea.get("id"), (Map)saleArea.get("saleAreaCharacter"));
                        } else {
                            saleArea.remove("saleAreaCharacter");
                        }
                        saleArea = UpcAPiTool.handleMultilingual((Map)saleArea, (String[])names);
                    }
                    saleAreaDTO = (SaleAreaDTO)JSON.parseObject((String)JSON.toJSONString(result.get(0)), SaleAreaDTO.class);
                }
                if (saleAreaDTO != null) {
                    saleAreaDTO.setSaleAreaCharacter((Map)character.get(saleAreaDTO.getId()));
                    return CoreDocJsonResult.success(saleAreaDTO);
                }
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.RESULT_IS_NULL));
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17A2451E0420007A", (String)"\u6839\u636e\u7f16\u7801\u67e5\u8be2\u9500\u552e\u533a\u57df\u4fe1\u606f\u9519\u8bef:") + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<SaleAreaDTO> queryByCodeList(List<String> codeList) throws Exception {
        if (null != codeList) {
            try {
                List saleAreaDTOs = null;
                QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantAPIUtils.merchantSaleAreaFieldMapping, (String[])SALE_AREA_BASE_FIELDS);
                QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").in(codeList)}));
                List result = MetaDaoHelper.query((String)"aa.salearea.SaleArea", (boolean)true, (QuerySchema)schema, null);
                if (result != null && result.size() > 0) {
                    String[] names = new String[]{"name", "remark"};
                    for (Map saleArea : result) {
                        saleArea = UpcAPiTool.handleMultilingual((Map)saleArea, (String[])names);
                    }
                    saleAreaDTOs = JSON.parseArray((String)JSON.toJSONString((Object)result), SaleAreaDTO.class);
                }
                if (!CollectionUtils.isEmpty(saleAreaDTOs)) {
                    return CoreDocJsonResult.success(saleAreaDTOs);
                }
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.RESULT_IS_NULL));
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17A2451E0420007A", (String)"\u6839\u636e\u7f16\u7801\u67e5\u8be2\u9500\u552e\u533a\u57df\u4fe1\u606f\u9519\u8bef:") + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<SaleAreaDTO> queryTree(SaleAreaQryDTO saleAreaQryDTO) throws Exception {
        if (null != saleAreaQryDTO) {
            try {
                List saleAreaDTOs = null;
                QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantAPIUtils.merchantSaleAreaFieldMapping, (String[])SALE_AREA_BASE_FIELDS);
                QueryConditionGroup conditionGroup = new QueryConditionGroup();
                if (saleAreaQryDTO.getCode() != null) {
                    conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").eq((Object)saleAreaQryDTO.getCode()));
                }
                if (saleAreaQryDTO.getName() != null) {
                    conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"name").eq((Object)saleAreaQryDTO.getName()));
                }
                if (saleAreaQryDTO.getBeganTime() != null) {
                    conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"pubts").egt((Object)saleAreaQryDTO.getBeganTime()));
                }
                if (saleAreaQryDTO.getEndTime() != null) {
                    conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"pubts").lt((Object)saleAreaQryDTO.getEndTime()));
                }
                if (saleAreaQryDTO.getPubts() != null) {
                    conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"pubts").egt((Object)saleAreaQryDTO.getPubts()));
                }
                if (saleAreaQryDTO.getLeftPath() != null) {
                    conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"path").left_like((Object)saleAreaQryDTO.getLeftPath()));
                }
                Integer pageIndex = saleAreaQryDTO.getPageIndex();
                Integer pageSize = saleAreaQryDTO.getPageSize();
                if (pageIndex == null || pageIndex < 0) {
                    pageIndex = 1;
                }
                if (pageSize == null || pageSize > UpcAPiTool.List_LENGTH) {
                    pageSize = UpcAPiTool.List_LENGTH;
                }
                QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)conditionGroup).addPager(pageIndex.intValue(), pageSize.intValue());
                List result = MetaDaoHelper.query((String)"aa.salearea.SaleArea", (boolean)true, (QuerySchema)schema, null);
                HashMap<Long, Map> character = new HashMap<Long, Map>();
                if (result != null && result.size() <= UpcAPiTool.List_LENGTH) {
                    String[] names = new String[]{"name", "remark"};
                    for (Map saleArea : result) {
                        if (saleArea.get("saleAreaCharacter") instanceof Map) {
                            character.put((Long)saleArea.get("id"), (Map)saleArea.get("saleAreaCharacter"));
                        } else {
                            saleArea.remove("saleAreaCharacter");
                        }
                        saleArea = UpcAPiTool.handleMultilingual((Map)saleArea, (String[])names);
                    }
                    saleAreaDTOs = JSON.parseArray((String)JSON.toJSONString((Object)result), SaleAreaDTO.class);
                } else if (result != null && result.size() > 5000) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801151);
                }
                if (!CollectionUtils.isEmpty(saleAreaDTOs)) {
                    for (SaleAreaDTO saleAreaDTO : saleAreaDTOs) {
                        saleAreaDTO.setSaleAreaCharacter((Map)character.get(saleAreaDTO.getId()));
                    }
                    return CoreDocJsonResult.success((List)saleAreaDTOs);
                }
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.RESULT_IS_NULL));
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17A2451E04200074", (String)"\u67e5\u8be2\u9500\u552e\u533a\u57df\u4fe1\u606f\u9519\u8bef:") + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<SaleAreaDTO> queryTreeByParent(SaleAreaQryDTO saleAreaQryDTO) throws Exception {
        if (null != saleAreaQryDTO) {
            try {
                QuerySchema schema;
                List result;
                List saleAreaDTOs = null;
                QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantAPIUtils.merchantSaleAreaFieldMapping, (String[])SALE_AREA_BASE_FIELDS);
                QueryConditionGroup conditionGroup = new QueryConditionGroup();
                if (saleAreaQryDTO.getParent() != null) {
                    conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"parent").eq((Object)saleAreaQryDTO.getParent()));
                }
                if (saleAreaQryDTO.getCode() != null) {
                    conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").eq((Object)saleAreaQryDTO.getCode()));
                }
                if (saleAreaQryDTO.getName() != null) {
                    conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"name").eq((Object)saleAreaQryDTO.getName()));
                }
                Integer pageIndex = saleAreaQryDTO.getPageIndex();
                Integer pageSize = saleAreaQryDTO.getPageSize();
                if (pageIndex == null || pageIndex < 0) {
                    pageIndex = 1;
                }
                if (pageSize == null || pageSize > UpcAPiTool.List_LENGTH) {
                    pageSize = UpcAPiTool.List_LENGTH;
                }
                if ((result = MetaDaoHelper.query((String)"aa.salearea.SaleArea", (boolean)true, (QuerySchema)(schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)conditionGroup).addPager(pageIndex.intValue(), pageSize.intValue())), null)) != null && result.size() <= UpcAPiTool.List_LENGTH) {
                    String[] names = new String[]{"name", "remark"};
                    for (Map saleArea : result) {
                        saleArea = UpcAPiTool.handleMultilingual((Map)saleArea, (String[])names);
                    }
                    saleAreaDTOs = JSON.parseArray((String)JSON.toJSONString((Object)result), SaleAreaDTO.class);
                }
                if (!CollectionUtils.isEmpty(saleAreaDTOs)) {
                    return CoreDocJsonResult.success(saleAreaDTOs);
                }
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.RESULT_IS_NULL));
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17A2451E04200074", (String)"\u67e5\u8be2\u9500\u552e\u533a\u57df\u4fe1\u606f\u9519\u8bef:") + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<SaleAreaDTO> add(SaleAreaDTO saleAreaDTO) throws Exception {
        if (null != saleAreaDTO) {
            try {
                if (saleAreaDTO.getCode() == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801120);
                }
                if (CoreDocBaseDao.queryIdByCode((String)saleAreaDTO.getCode(), (String)"aa.salearea.SaleArea") != null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801121);
                }
                SaleArea saleArea = new SaleArea();
                saleArea.put("_fromApi", (Object)true);
                saleArea.put("_status", (Object)EntityStatus.Insert);
                Map map = (Map)JSON.parseObject((String)JSON.toJSONString((Object)saleAreaDTO), HashMap.class);
                saleArea.putAll(map);
                if (saleAreaDTO.getName() != null) {
                    saleArea.set("name", (Object)UpcAPiTool.handleMultilingual((MultilingualVO)saleAreaDTO.getName()));
                }
                if (saleAreaDTO.getRemark() != null) {
                    saleArea.set("remark", (Object)UpcAPiTool.handleMultilingual((MultilingualVO)saleAreaDTO.getRemark()));
                }
                DataTransferUtils.fill((String)"aa_salearea", (String)"aa.salearea.SaleArea", (Object)saleArea, (int)3);
                if (saleAreaDTO.getStopStatus() != null && !saleAreaDTO.getStopStatus().booleanValue()) {
                    saleArea.put("stopstatus", (Object)0);
                } else if (saleAreaDTO.getStopStatus() != null && saleAreaDTO.getStopStatus().booleanValue()) {
                    saleArea.put("stopstatus", (Object)1);
                } else if (saleAreaDTO.getStopStatus() == null) {
                    saleArea.put("stopstatus", (Object)0);
                }
                if (saleArea.getParent() != null) {
                    QuerySchema querySchema = QuerySchema.create().addSelect("orgId,level").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)saleArea.getParent())}));
                    Map queryOrgId = MetaDaoHelper.queryOne((String)"aa.salearea.SaleArea", (QuerySchema)querySchema);
                    if (queryOrgId == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800175);
                    }
                    if (saleArea.getOrgId() == null) {
                        saleArea.setOrgId(queryOrgId.get("orgId").toString());
                    } else if (!saleArea.getOrgId().equals(queryOrgId.get("orgId").toString()) && !MerchantUtils.getAllowSelectNonLeafNodes()) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801152);
                    }
                    if (queryOrgId.get("level") != null && (Integer)queryOrgId.get("level") > 7) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801153);
                    }
                }
                Boolean singleOrg = this.upcControlRuleService.checkSingleOrg();
                if (saleArea.getOrgId() != null && !singleOrg.booleanValue()) {
                    TreeApplyRangeUtils.getInstance().checkOrgPermission(this.upcControlRuleService, saleArea.getOrgId(), "aa.salearea.SaleArea", "aa_salearea");
                }
                BillDataDto billDataDto = new BillDataDto();
                billDataDto.setBillnum("aa_salearea");
                billDataDto.setAction("save");
                billDataDto.setData((Object)saleArea);
                billDataDto.setFromApi(true);
                billDataDto.setConvertType(Integer.valueOf(3));
                Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
                SaleAreaDTO saleAreaDTO1 = new SaleAreaDTO();
                saleAreaDTO1.setId((Long)((Map)result).get("id"));
                return CoreDocJsonResult.success((Object)saleAreaDTO1);
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17A2451E0420007B", (String)"\u9500\u552e\u533a\u57df\u65b0\u589e\u9519\u8bef:") + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<SaleAreaDTO> update(SaleAreaDTO saleAreaDTO) throws Exception {
        if (null != saleAreaDTO) {
            try {
                Map characterId;
                if (saleAreaDTO.getCode() != null && saleAreaDTO.getId() == null) {
                    Long id = CoreDocBaseDao.queryIdByCode((String)saleAreaDTO.getCode(), (String)"aa.salearea.SaleArea");
                    if (id == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800879);
                    }
                    saleAreaDTO.setId(id);
                } else {
                    QuerySchema querySchema;
                    List queryId;
                    if (saleAreaDTO.getCode() == null && saleAreaDTO.getId() == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800880);
                    }
                    if (saleAreaDTO.getId() != null && (queryId = MetaDaoHelper.query((String)"aa.salearea.SaleArea", (QuerySchema)(querySchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)saleAreaDTO.getId())}))))) != null && queryId.size() != 1) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800881);
                    }
                }
                SaleArea saleArea = new SaleArea();
                saleArea.put("_fromApi", (Object)true);
                saleArea.put("_status", (Object)EntityStatus.Update);
                Map map = (Map)JSON.parseObject((String)JSON.toJSONString((Object)saleAreaDTO), HashMap.class);
                saleArea.putAll(map);
                if (saleAreaDTO.getName() != null) {
                    saleArea.set("name", (Object)UpcAPiTool.handleMultilingual((MultilingualVO)saleAreaDTO.getName()));
                }
                if (saleAreaDTO.getRemark() != null) {
                    saleArea.set("remark", (Object)UpcAPiTool.handleMultilingual((MultilingualVO)saleAreaDTO.getRemark()));
                }
                DataTransferUtils.fill((String)"aa_salearea", (String)"aa.salearea.SaleArea", (Object)saleArea, (int)3);
                if (saleAreaDTO.getStopStatus() != null && !saleAreaDTO.getStopStatus().booleanValue()) {
                    saleArea.put("stopstatus", (Object)0);
                } else if (saleAreaDTO.getStopStatus() != null && saleAreaDTO.getStopStatus().booleanValue()) {
                    saleArea.put("stopstatus", (Object)1);
                }
                QuerySchema schema = QuerySchema.create().addSelect("saleAreaCharacter,orgId,parent,stopstatus").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(saleArea.getId())}));
                Map query = MetaDaoHelper.queryOne((String)"aa.salearea.SaleArea", (QuerySchema)schema);
                if (query != null && query.get("saleAreaCharacter") != null && saleArea.get("saleAreaCharacter") != null && (characterId = (Map)query.get("saleAreaCharacter")).get("id") != null) {
                    Map character = (Map)saleArea.get("saleAreaCharacter");
                    character.put("id", characterId.get("id").toString());
                    saleArea.put("saleAreaCharacter", (Object)character);
                }
                if (query != null && query.get("parent") != null && saleArea.getParent() != null && !saleArea.getParent().equals(query.get("parent")) && !MerchantUtils.getAllowSelectNonLeafNodes()) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801154);
                }
                if (query != null && query.get("orgId") != null) {
                    saleArea.set("orgId", (Object)query.get("orgId").toString());
                }
                if (query != null && query.get("stopstatus") != null && saleArea.get("stopstatus") == null) {
                    saleArea.put("stopstatus", query.get("stopstatus"));
                }
                if (saleArea.getParent() != null) {
                    QuerySchema querySchema = QuerySchema.create().addSelect("orgId,level").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)saleArea.getParent())}));
                    Map queryOrgId = MetaDaoHelper.queryOne((String)"aa.salearea.SaleArea", (QuerySchema)querySchema);
                    if (queryOrgId == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800175);
                    }
                    if (!saleArea.getOrgId().equals(queryOrgId.get("orgId").toString()) && !MerchantUtils.getAllowSelectNonLeafNodes()) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801152);
                    }
                    if (queryOrgId.get("level") != null && (Integer)queryOrgId.get("level") > 7) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801153);
                    }
                }
                BillDataDto billDataDto = new BillDataDto();
                billDataDto.setBillnum("aa_salearea");
                billDataDto.setAction("save");
                billDataDto.setData((Object)saleArea);
                billDataDto.setFromApi(true);
                billDataDto.setConvertType(Integer.valueOf(3));
                Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
                SaleAreaDTO saleAreaDTO1 = new SaleAreaDTO();
                saleAreaDTO1.setId((Long)((Map)result).get("id"));
                return CoreDocJsonResult.success((Object)saleAreaDTO1);
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17A2451E04200072", (String)"\u9500\u552e\u533a\u57df\u66f4\u65b0\u9519\u8bef:") + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<SaleAreaDTO> queryOrgByIds(List<Long> idList) throws Exception {
        return null;
    }

    public CoreDocJsonResult<SaleAreaDTO> batchAdd(List<SaleAreaDTO> saleAreaDTOs) throws Exception {
        return null;
    }

    public CoreDocJsonResult<SaleAreaDTO> batchUpdate(List<SaleAreaDTO> saleAreaDTOs) throws Exception {
        return null;
    }

    public CoreDocJsonResult<SaleAreaDTO> addIdempotent(OpenAPIDTO<SaleAreaDTO> saleAreaDTO) {
        if (saleAreaDTO == null || saleAreaDTO.getData() == null) {
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
        }
        try {
            return this.add((SaleAreaDTO)saleAreaDTO.getData());
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)businessException);
        }
        catch (Exception e) {
            log.error("\u9500\u552e\u533a\u57df\u65b0\u589e-\u5e42\u7b49\u9519\u8bef:" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    public Long saleAreaSave(String matchRule, SaleAreaVO saleAreaVO) throws Exception {
        Long id = 0L;
        SaleArea saleArea = this.convertSaleArea(matchRule, saleAreaVO);
        DataTransferUtils.fill((String)"aa_salearea", (String)"aa.salearea.SaleArea", (Object)saleArea, (int)4);
        this.dataPreprocessing(matchRule, saleArea);
        saleArea.put("_fromApi", (Object)true);
        BillDataDto billDataDto = UpcAPiTool.builderBillData((String)"aa_salearea", (Object)saleArea, (boolean)true, (int)4);
        Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
        if (result != null) {
            id = (Long)((SaleArea)result).getId();
        }
        return id;
    }

    @Override
    public void extendPreprocessing(BizObject bizObject) throws Exception {
        QuerySchema querySchema;
        Map queryOrgId;
        SaleArea saleArea = (SaleArea)bizObject;
        if (EntityStatus.Insert == saleArea.getEntityStatus() && saleArea.getStopstatus() == null) {
            saleArea.setStopstatus(Boolean.valueOf(false));
        }
        if (EntityStatus.Update == saleArea.getEntityStatus() && saleArea.getId() != null && (queryOrgId = MetaDaoHelper.queryOne((String)"aa.salearea.SaleArea", (QuerySchema)(querySchema = QuerySchema.create().addSelect("orgId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(saleArea.getId())}))))) != null && queryOrgId.get("orgId") != null && saleArea.getOrgId() == null) {
            saleArea.setOrgId(queryOrgId.get("orgId").toString());
        }
        if (saleArea.getParent() != null) {
            querySchema = QuerySchema.create().addSelect("orgId,level").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)saleArea.getParent())}));
            queryOrgId = MetaDaoHelper.queryOne((String)"aa.salearea.SaleArea", (QuerySchema)querySchema);
            if (queryOrgId == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800175);
            }
            if (saleArea.getOrgId() != null && !saleArea.getOrgId().equals(queryOrgId.get("orgId").toString()) && !MerchantUtils.getAllowSelectNonLeafNodes()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801152);
            }
            if (queryOrgId.get("level") != null && (Integer)queryOrgId.get("level") > 7) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801153);
            }
        }
        if (saleArea.getEntityStatus() == EntityStatus.Insert && saleArea.getOrgId() != null && !this.upcControlRuleService.checkSingleOrg().booleanValue()) {
            TreeApplyRangeUtils.getInstance().checkOrgPermission(this.upcControlRuleService, saleArea.getOrgId(), "aa.salearea.SaleArea", "aa_salearea");
        }
    }

    @Override
    public BizObject convertBizObject(String matchRule, PubCommonVO pubCommonVO) {
        SaleAreaVO saleAreaVO = (SaleAreaVO)pubCommonVO;
        SaleArea saleArea = new SaleArea();
        boolean blank = false;
        if (saleAreaVO.getBlank() != null) {
            blank = saleAreaVO.getBlank();
        }
        if (null != saleAreaVO.getId()) {
            saleArea.setId((Object)saleAreaVO.getId());
        }
        if (StringUtils.hasLength((String)saleAreaVO.getCode())) {
            saleArea.setCode(saleAreaVO.getCode());
        }
        if (!ObjectUtils.isEmpty((Object)saleAreaVO.getName())) {
            saleArea.set("name", (Object)saleAreaVO.getName().toMap());
        }
        if (StringUtils.hasLength((String)saleAreaVO.getOrgId())) {
            saleArea.setOrgId(saleAreaVO.getOrgId());
        } else if (StringUtils.hasLength((String)saleAreaVO.getOrgId___code())) {
            saleArea.set("orgId_code", (Object)saleAreaVO.getOrgId___code());
            saleArea.set("orgId___code", (Object)saleAreaVO.getOrgId___code());
        }
        if (saleAreaVO.getParent() != null && !"".equals(saleAreaVO.getParent())) {
            saleArea.setParent((Object)saleAreaVO.getParent());
        } else if (StringUtils.hasLength((String)saleAreaVO.getParent___code())) {
            saleArea.set("parent_code", (Object)saleAreaVO.getParent___code());
            saleArea.set("parent___code", (Object)saleAreaVO.getParent___code());
        } else if (blank && saleAreaVO.getParent() == null) {
            saleArea.setParent(null);
        }
        if (saleAreaVO.getOrder() != null && !"".equals(saleAreaVO.getOrder())) {
            saleArea.setOrder(saleAreaVO.getOrder());
        } else if (blank) {
            saleArea.setOrder(null);
        }
        if (!ObjectUtils.isEmpty((Object)saleAreaVO.getRemark())) {
            saleArea.set("remark", (Object)saleAreaVO.getRemark().toMap());
        } else if (blank) {
            saleArea.setRemark(null);
        }
        if (StringUtils.hasLength((String)saleAreaVO.getSourceUnique())) {
            saleArea.setErpCode(saleAreaVO.getSourceUnique());
        }
        if (saleAreaVO.getStopstatus() != null) {
            saleArea.setStopstatus(saleAreaVO.getStopstatus());
        }
        if (!ObjectUtils.isEmpty((Object)saleAreaVO.getSaleAreaCharacter())) {
            saleArea.put("saleAreaCharacter", (Object)saleAreaVO.getSaleAreaCharacter());
        }
        return saleArea;
    }

    public void dataPreprocessing(String matchRule, SaleArea saleArea) throws Exception {
        if (!"id".equals(matchRule)) {
            QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)saleArea.getCode())});
            QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)condition);
            List saleAreaList = MetaDaoHelper.queryObject((String)"aa.salearea.SaleArea", (boolean)true, (QuerySchema)schema, null);
            if (!CollectionUtils.isEmpty((Collection)saleAreaList)) {
                saleArea.setId(((SaleArea)saleAreaList.get(0)).getId());
                saleArea.setEntityStatus(EntityStatus.Update);
            } else {
                saleArea.setEntityStatus(EntityStatus.Insert);
                if (saleArea.getStopstatus() == null) {
                    saleArea.setStopstatus(Boolean.valueOf(false));
                }
            }
        }
        if (saleArea.getParent() != null) {
            QuerySchema querySchema = QuerySchema.create().addSelect("orgId,level").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)saleArea.getParent())}));
            Map queryOrgId = MetaDaoHelper.queryOne((String)"aa.salearea.SaleArea", (QuerySchema)querySchema);
            if (queryOrgId == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800175);
            }
            if (!saleArea.getOrgId().equals(queryOrgId.get("orgId").toString()) && !MerchantUtils.getAllowSelectNonLeafNodes()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801152);
            }
            if (queryOrgId.get("level") != null && (Integer)queryOrgId.get("level") > 7) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801153);
            }
        }
        if (saleArea.getEntityStatus() == EntityStatus.Insert && saleArea.getOrgId() != null && !this.upcControlRuleService.checkSingleOrg().booleanValue()) {
            TreeApplyRangeUtils.getInstance().checkOrgPermission(this.upcControlRuleService, saleArea.getOrgId(), "aa.salearea.SaleArea", "aa_salearea");
        }
    }

    public SaleArea convertSaleArea(String matchRule, SaleAreaVO saleAreaVO) {
        SaleArea saleArea = new SaleArea();
        boolean blank = false;
        if (saleAreaVO.getBlank() != null) {
            blank = saleAreaVO.getBlank();
        }
        if (null != saleAreaVO.getId()) {
            saleArea.setId((Object)saleAreaVO.getId());
        }
        if (!StringUtils.hasLength((String)saleAreaVO.getCode())) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.CUSTOMER_TRADE_CODE_NOT_NULL);
        }
        saleArea.setCode(saleAreaVO.getCode());
        if (ObjectUtils.isEmpty((Object)saleAreaVO.getName())) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.CUSTOMER_TRADE_NAME_NOT_NULL);
        }
        saleArea.set("name", (Object)saleAreaVO.getName().toMap());
        if (StringUtils.hasLength((String)saleAreaVO.getOrgId()) && "id".equals(matchRule)) {
            saleArea.setOrgId(saleAreaVO.getOrgId());
        }
        if (StringUtils.hasLength((String)saleAreaVO.getOrgId___code()) && !"id".equals(matchRule)) {
            saleArea.set("orgId_code", (Object)saleAreaVO.getOrgId___code());
            saleArea.set("orgId___code", (Object)saleAreaVO.getOrgId___code());
        } else if (!StringUtils.hasLength((String)saleAreaVO.getOrgId())) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.CUSTOMER_TRADE_NAME_NOT_NULL);
        }
        if (saleAreaVO.getParent() != null && "id".equals(matchRule)) {
            saleArea.setParent((Object)saleAreaVO.getParent());
        }
        if (StringUtils.hasLength((String)saleAreaVO.getParent___code()) && !"id".equals(matchRule)) {
            saleArea.set("parent_code", (Object)saleAreaVO.getParent___code());
            saleArea.set("parent___code", (Object)saleAreaVO.getParent___code());
        } else if (blank && saleAreaVO.getParent() == null) {
            saleArea.setParent(null);
        }
        if (!StringUtils.isEmpty((Object)saleAreaVO.getOrder())) {
            saleArea.setOrder(saleAreaVO.getOrder());
        } else if (blank) {
            saleArea.setOrder(null);
        }
        if (!ObjectUtils.isEmpty((Object)saleAreaVO.getRemark())) {
            saleArea.set("remark", (Object)saleAreaVO.getRemark().toMap());
        } else if (blank) {
            saleArea.setRemark(null);
        }
        if (StringUtils.hasLength((String)saleAreaVO.getSourceUnique())) {
            saleArea.setErpCode(saleAreaVO.getSourceUnique());
        }
        if (saleAreaVO.getStopstatus() != null) {
            saleArea.setStopstatus(saleAreaVO.getStopstatus());
        }
        if (!ObjectUtils.isEmpty((Object)saleAreaVO.getSaleAreaCharacter())) {
            saleArea.put("saleAreaCharacter", (Object)saleAreaVO.getSaleAreaCharacter());
        }
        return saleArea;
    }

    public CoreDocJsonResult<SaleAreaVO> querySaleArea(BatchApiQueryParamWithOrg batchApiQueryParamWithOrg) throws Exception {
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
        if (StringUtils.hasLength((String)batchApiQueryParamWithOrg.getOrgId())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"orgId").eq((Object)batchApiQueryParamWithOrg.getOrgId()));
        }
        if (batchApiQueryParamWithOrg.getStartTs() != null || batchApiQueryParamWithOrg.getEndTs() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"pubts").between((Object)batchApiQueryParamWithOrg.getStartTs(), (Object)batchApiQueryParamWithOrg.getEndTs()));
        }
        int recordCount = 0;
        QuerySchema countSchema = QuerySchema.create().addSelect("count(1) as count").addCondition((ConditionExpression)queryConditionGroup);
        Map result = MetaDaoHelper.queryOne((String)"aa.salearea.SaleArea", (QuerySchema)countSchema);
        if (result != null && result.get("count") != null) {
            recordCount = Integer.parseInt(result.get("count").toString());
        }
        if (recordCount > 0) {
            if (batchApiQueryParamWithOrg.getPageSize() > (long)UpcAPiTool.PAGE_MAX_SIZE.intValue()) {
                batchApiQueryParamWithOrg.setPageSize((long)UpcAPiTool.PAGE_MAX_SIZE.intValue());
            }
            QuerySchema schema = QuerySchema.create().addSelect("id,code,name,orgId,orgId.code as orgId___code,parent,parent.code as parent___code,stopstatus,order,remark,saleAreaCharacter").addCondition((ConditionExpression)queryConditionGroup).addPager(Long.valueOf(batchApiQueryParamWithOrg.getPageIndex()).intValue(), Long.valueOf(batchApiQueryParamWithOrg.getPageSize()).intValue()).addOrderBy("level");
            List saleAreaList = MetaDaoHelper.queryObject((String)"aa.salearea.SaleArea", (boolean)true, (QuerySchema)schema, null);
            ArrayList<SaleAreaVO> saleAreaVOList = new ArrayList<SaleAreaVO>();
            for (SaleArea saleArea : saleAreaList) {
                SaleAreaVO saleAreaVO = (SaleAreaVO)JSON.parseObject((String)JSON.toJSONString((Object)saleArea), SaleAreaVO.class);
                if (saleArea.get("name") != null) {
                    saleAreaVO.setName(new MultiLangText((Map)saleArea.get("name")));
                }
                if (saleArea.get("remark") != null) {
                    saleAreaVO.setRemark(new MultiLangText((Map)saleArea.get("remark")));
                }
                saleAreaVOList.add(saleAreaVO);
            }
            coreDocJsonResult = CoreDocJsonResult.success(saleAreaVOList);
        } else {
            coreDocJsonResult = CoreDocJsonResult.success(null);
        }
        coreDocJsonResult.setTotalCount(Integer.valueOf(recordCount));
        return coreDocJsonResult;
    }

    public String delete(String saleArealId, String saleAreaCode) throws Exception {
        if (!StringUtils.hasLength((String)saleArealId) && !StringUtils.hasLength((String)saleAreaCode)) {
            return null;
        }
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        if (StringUtils.hasLength((String)saleArealId)) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").eq((Object)Long.parseLong(saleArealId)));
        } else if (StringUtils.hasLength((String)saleAreaCode)) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").eq((Object)saleAreaCode));
        }
        QuerySchema schema = QuerySchema.create().addSelect("id,code,name,orgId,orgId.name as orgId_name,parent,parent.name as parent_name,stopstatus,order").addCondition((ConditionExpression)queryConditionGroup);
        List saleAreaList = MetaDaoHelper.queryObject((String)"aa.salearea.SaleArea", (QuerySchema)schema, null);
        if (CollectionUtils.isEmpty((Collection)saleAreaList)) {
            return null;
        }
        BillDataDto bill = new BillDataDto();
        bill.setData((Object)saleAreaList);
        bill.setBillnum("aa_salearealist");
        RuleExecuteResult result = BillBiz.delete((BillDataDto)bill);
        if (!CollectionUtils.isEmpty((Collection)result.getMessages())) {
            return result.getMessages().get(0).toString();
        }
        return null;
    }
}


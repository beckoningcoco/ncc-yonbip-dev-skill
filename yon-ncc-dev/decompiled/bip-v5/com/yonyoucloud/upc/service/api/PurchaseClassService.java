/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.iuap.BusinessException
 *  com.yonyou.iuap.apdoc.coredoc.dao.pub.CoreDocBaseDao
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.ProductAPIUtils
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.po.pub.BatchApiQueryParamWithOrg
 *  com.yonyou.iuap.apdoc.coredoc.po.pub.PubCommonVO
 *  com.yonyou.iuap.apdoc.coredoc.vo.materialcls.PurchaseClassVO
 *  com.yonyou.iuap.basedoc.social.util.JacksonUtils
 *  com.yonyou.iuap.international.MultiLangText
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils
 *  com.yonyoucloud.iuap.upc.api.IPurchaseClassService
 *  com.yonyoucloud.iuap.upc.dto.derivatives.PurchaseClassDTO
 *  com.yonyoucloud.iuap.upc.dto.derivatives.PurchaseClassQryDTO
 *  com.yonyoucloud.upc.pc.cls.PurchaseClass
 *  com.yonyoucloud.upc.utils.CoreDocJsonResult
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
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.ProductAPIUtils;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.po.pub.BatchApiQueryParamWithOrg;
import com.yonyou.iuap.apdoc.coredoc.po.pub.PubCommonVO;
import com.yonyou.iuap.apdoc.coredoc.vo.materialcls.PurchaseClassVO;
import com.yonyou.iuap.basedoc.social.util.JacksonUtils;
import com.yonyou.iuap.international.MultiLangText;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils;
import com.yonyoucloud.iuap.upc.api.IPurchaseClassService;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.iuap.upc.dto.derivatives.PurchaseClassDTO;
import com.yonyoucloud.iuap.upc.dto.derivatives.PurchaseClassQryDTO;
import com.yonyoucloud.upc.pc.cls.PurchaseClass;
import com.yonyoucloud.upc.service.utils.TreeApplyRangeUtils;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
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
public class PurchaseClassService
extends APIIpassService
implements IPurchaseClassService {
    private static final Logger log = LoggerFactory.getLogger(PurchaseClassService.class);
    private static final String[] PURCHASE_CLASS_BASE_FIELDS = new String[]{"id", "code", "name", "parent", "parentCode", "order", "stopStatus", "purchaseClassCharacter", "path", "orgId", "orgCode", "orgName", "pubts", "categoryManager", "categoryManagerCode", "categoryGrade", "categoryGradeCode"};
    private static final int MAX_COUNT = 5000;
    private static final int BATCH_COUNT = 20;
    @Autowired
    private ApiImportCommandService apiImportSingleService;
    @Autowired
    private IUPCBillService billService;
    @Autowired
    private IUPCControlRuleService upcControlRuleService;

    public CoreDocJsonResult<PurchaseClassDTO> queryByID(Long id) {
        if (null != id) {
            try {
                PurchaseClassDTO purchaseClassDTO = null;
                QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)ProductAPIUtils.purchaseClassFieldMap, (String[])PURCHASE_CLASS_BASE_FIELDS);
                QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)id)}));
                List result = MetaDaoHelper.query((String)"pc.cls.PurchaseClass", (QuerySchema)schema);
                HashMap<Long, Map> character = new HashMap<Long, Map>();
                if (result != null && result.size() == 1) {
                    Map purchaseClass = (Map)result.get(0);
                    purchaseClassDTO = (PurchaseClassDTO)JSON.parseObject((String)JSON.toJSONString(result.get(0)), PurchaseClassDTO.class);
                    character.put((Long)purchaseClass.get("id"), (Map)purchaseClass.get("purchaseClassCharacter"));
                }
                if (purchaseClassDTO != null) {
                    purchaseClassDTO.setPurchaseClassCharacter((Map)character.get(purchaseClassDTO.getId()));
                    return CoreDocJsonResult.success(purchaseClassDTO);
                }
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.RESULT_IS_NULL));
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error("\u6839\u636eID\u67e5\u8be2\u91c7\u8d2d\u5206\u7c7b\u4fe1\u606f\u9519\u8bef:" + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<PurchaseClassDTO> queryByCode(String code) {
        if (null != code) {
            try {
                PurchaseClassDTO purchaseClassDTO = null;
                QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)ProductAPIUtils.purchaseClassFieldMap, (String[])PURCHASE_CLASS_BASE_FIELDS);
                QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)code)}));
                List result = MetaDaoHelper.query((String)"pc.cls.PurchaseClass", (QuerySchema)schema);
                HashMap<Long, Map> character = new HashMap<Long, Map>();
                if (result != null && result.size() == 1) {
                    Map purchaseClass = (Map)result.get(0);
                    purchaseClassDTO = (PurchaseClassDTO)JSON.parseObject((String)JSON.toJSONString(result.get(0)), PurchaseClassDTO.class);
                    character.put((Long)purchaseClass.get("id"), (Map)purchaseClass.get("purchaseClassCharacter"));
                }
                if (purchaseClassDTO != null) {
                    purchaseClassDTO.setPurchaseClassCharacter((Map)character.get(purchaseClassDTO.getId()));
                    return CoreDocJsonResult.success(purchaseClassDTO);
                }
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.RESULT_IS_NULL));
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error("\u6839\u636e\u7f16\u7801\u67e5\u8be2\u91c7\u8d2d\u5206\u7c7b\u4fe1\u606f\u9519\u8bef:" + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<PurchaseClassDTO> listByPage(PurchaseClassQryDTO purchaseClassQryDTO) {
        if (null != purchaseClassQryDTO) {
            try {
                List purchaseClassDTOs = null;
                QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)ProductAPIUtils.purchaseClassFieldMap, (String[])PURCHASE_CLASS_BASE_FIELDS);
                QueryConditionGroup conditionGroup = new QueryConditionGroup();
                if (purchaseClassQryDTO.getCode() != null) {
                    conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").eq((Object)purchaseClassQryDTO.getCode()));
                }
                if (purchaseClassQryDTO.getName() != null) {
                    conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"name").eq((Object)purchaseClassQryDTO.getName()));
                }
                if (purchaseClassQryDTO.getIdList() != null) {
                    conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").in((Collection)purchaseClassQryDTO.getIdList()));
                }
                if (purchaseClassQryDTO.getBeganTime() != null) {
                    conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"pubts").egt((Object)purchaseClassQryDTO.getBeganTime()));
                }
                if (purchaseClassQryDTO.getEndTime() != null) {
                    conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"pubts").lt((Object)purchaseClassQryDTO.getEndTime()));
                }
                Integer pageIndex = purchaseClassQryDTO.getPageIndex();
                Integer pageSize = purchaseClassQryDTO.getPageSize();
                if (pageIndex == null || pageIndex < 0) {
                    pageIndex = 1;
                }
                if (pageSize == null || pageSize > 5000) {
                    pageSize = 5000;
                }
                QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)conditionGroup).addPager(pageIndex.intValue(), pageSize.intValue());
                List result = MetaDaoHelper.query((String)"pc.cls.PurchaseClass", (QuerySchema)schema);
                HashMap<Long, Map> character = new HashMap<Long, Map>();
                HashMap<Long, String> purchasePubtsMap = new HashMap<Long, String>();
                if (result != null && result.size() <= 5000) {
                    for (Map purchaseClass : result) {
                        character.put((Long)purchaseClass.get("id"), (Map)purchaseClass.get("purchaseClassCharacter"));
                        if (purchaseClass.get("pubts") == null) continue;
                        purchasePubtsMap.put((Long)purchaseClass.get("id"), purchaseClass.get("pubts").toString());
                    }
                    purchaseClassDTOs = JSON.parseArray((String)JSON.toJSONString((Object)result), PurchaseClassDTO.class);
                }
                if (!CollectionUtils.isEmpty(purchaseClassDTOs)) {
                    for (PurchaseClassDTO purchaseClassDTO : purchaseClassDTOs) {
                        purchaseClassDTO.setPurchaseClassCharacter((Map)character.get(purchaseClassDTO.getId()));
                        purchaseClassDTO.setPubts((String)purchasePubtsMap.get(purchaseClassDTO.getId()));
                    }
                    return CoreDocJsonResult.success((List)purchaseClassDTOs);
                }
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.RESULT_IS_NULL));
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error("\u67e5\u8be2\u91c7\u8d2d\u5206\u7c7b\u4fe1\u606f\u9519\u8bef:" + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<PurchaseClassDTO> add(PurchaseClassDTO purchaseClassDTO) {
        if (null != purchaseClassDTO) {
            try {
                if (purchaseClassDTO.getCode() == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801120);
                }
                if (CoreDocBaseDao.queryIdByCode((String)purchaseClassDTO.getCode(), (String)"pc.cls.PurchaseClass") != null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801121);
                }
                PurchaseClass purchaseClass = new PurchaseClass();
                purchaseClass.put("_fromApi", (Object)true);
                purchaseClass.put("_status", (Object)EntityStatus.Insert);
                Map map = (Map)JSON.parseObject((String)JSON.toJSONString((Object)purchaseClassDTO), HashMap.class);
                purchaseClass.putAll(map);
                DataTransferUtils.fill((String)"pc_purchaseclass", (String)"pc.cls.PurchaseClass", (Object)purchaseClass, (int)3);
                if (purchaseClassDTO.getStopStatus() != null && !purchaseClassDTO.getStopStatus().booleanValue()) {
                    purchaseClass.setStopstatus(Boolean.valueOf(false));
                } else if (purchaseClassDTO.getStopStatus() != null && purchaseClassDTO.getStopStatus().booleanValue()) {
                    purchaseClass.setStopstatus(Boolean.valueOf(true));
                } else if (purchaseClassDTO.getStopStatus() == null) {
                    purchaseClass.setStopstatus(Boolean.valueOf(false));
                }
                if (purchaseClass.getParent() != null) {
                    QuerySchema querySchema = QuerySchema.create().addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)purchaseClass.getParent())}));
                    ArrayList<QueryField> qryFields = new ArrayList<QueryField>();
                    qryFields.add(new QueryField("level", "level"));
                    qryFields.add(new QueryField("orgId", "orgId"));
                    querySchema.selectFields(qryFields);
                    Map queryOrgId = MetaDaoHelper.queryOne((String)"pc.cls.PurchaseClass", (QuerySchema)querySchema);
                    if (queryOrgId == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800175);
                    }
                    if (purchaseClass.getOrgId() == null) {
                        purchaseClass.setOrgId(queryOrgId.get("orgId").toString());
                    } else if (!purchaseClass.getOrgId().equals(queryOrgId.get("orgId").toString())) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801152);
                    }
                    if (queryOrgId.get("level") != null && (Integer)queryOrgId.get("level") > 7) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801190);
                    }
                }
                Boolean singleOrg = this.upcControlRuleService.checkSingleOrg();
                if (purchaseClass.getOrgId() != null && !singleOrg.booleanValue()) {
                    TreeApplyRangeUtils.getInstance().checkOrgPermission(this.upcControlRuleService, purchaseClass.getOrgId(), "pc.cls.PurchaseClass", "pc_purchaseclass");
                }
                BillDataDto billDataDto = new BillDataDto();
                billDataDto.setBillnum("pc_purchaseclass");
                billDataDto.setAction("save");
                billDataDto.setData((Object)purchaseClass);
                billDataDto.setFromApi(true);
                billDataDto.setConvertType(Integer.valueOf(3));
                Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
                PurchaseClassDTO purchaseClassDTO1 = new PurchaseClassDTO();
                purchaseClassDTO1.setId((Long)((Map)result).get("id"));
                return CoreDocJsonResult.success((Object)purchaseClassDTO1);
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error("\u91c7\u8d2d\u5206\u7c7b\u65b0\u589e\u9519\u8bef:" + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<PurchaseClassDTO> update(PurchaseClassDTO purchaseClassDTO) {
        if (null != purchaseClassDTO) {
            try {
                Map characterId;
                if (purchaseClassDTO.getCode() != null && purchaseClassDTO.getId() == null) {
                    Long id = CoreDocBaseDao.queryIdByCode((String)purchaseClassDTO.getCode(), (String)"pc.cls.PurchaseClass");
                    if (id == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800879);
                    }
                    purchaseClassDTO.setId(id);
                } else {
                    QuerySchema querySchema;
                    List queryId;
                    if (purchaseClassDTO.getCode() == null && purchaseClassDTO.getId() == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800880);
                    }
                    if (purchaseClassDTO.getId() != null && (queryId = MetaDaoHelper.query((String)"pc.cls.PurchaseClass", (QuerySchema)(querySchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)purchaseClassDTO.getId())}))))) != null && queryId.size() != 1) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800881);
                    }
                }
                PurchaseClass purchaseClass = new PurchaseClass();
                purchaseClass.put("_fromApi", (Object)true);
                purchaseClass.put("_status", (Object)EntityStatus.Update);
                Map map = (Map)JSON.parseObject((String)JSON.toJSONString((Object)purchaseClassDTO), HashMap.class);
                purchaseClass.putAll(map);
                DataTransferUtils.fill((String)"pc_purchaseclass", (String)"pc.cls.PurchaseClass", (Object)purchaseClass, (int)3);
                if (purchaseClassDTO.getStopStatus() != null && !purchaseClassDTO.getStopStatus().booleanValue()) {
                    purchaseClass.setStopstatus(Boolean.valueOf(false));
                } else if (purchaseClassDTO.getStopStatus() != null && purchaseClassDTO.getStopStatus().booleanValue()) {
                    purchaseClass.setStopstatus(Boolean.valueOf(true));
                }
                QuerySchema schema = QuerySchema.create().addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(purchaseClass.getId())}));
                ArrayList<QueryField> qryFields = new ArrayList<QueryField>();
                qryFields.add(new QueryField("purchaseClassCharacter", "purchaseClassCharacter"));
                qryFields.add(new QueryField("stopstatus", "stopstatus"));
                qryFields.add(new QueryField("parent", "parent"));
                qryFields.add(new QueryField("orgId", "orgId"));
                schema.selectFields(qryFields);
                Map query = MetaDaoHelper.queryOne((String)"pc.cls.PurchaseClass", (QuerySchema)schema);
                if (query != null && query.get("purchaseClassCharacter") != null && purchaseClass.get("purchaseClassCharacter") != null && (characterId = (Map)query.get("purchaseClassCharacter")).get("id") != null) {
                    Map character = (Map)purchaseClass.get("purchaseClassCharacter");
                    character.put("id", characterId.get("id").toString());
                    purchaseClass.put("purchaseClassCharacter", (Object)character);
                }
                if (query != null && query.get("stopstatus") != null && purchaseClass.get("stopstatus") == null) {
                    purchaseClass.put("stopstatus", query.get("stopstatus"));
                }
                if (query != null && query.get("parent") != null && purchaseClass.getParent() != null && !purchaseClass.getParent().toString().equals(query.get("parent").toString())) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801154);
                }
                if (query != null && query.get("orgId") != null) {
                    purchaseClass.set("orgId", (Object)query.get("orgId").toString());
                }
                if (purchaseClass.getParent() != null) {
                    QuerySchema querySchema = QuerySchema.create().addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)purchaseClass.getParent())}));
                    qryFields = new ArrayList();
                    qryFields.add(new QueryField("level", "level"));
                    qryFields.add(new QueryField("orgId", "orgId"));
                    querySchema.selectFields(qryFields);
                    Map queryOrgId = MetaDaoHelper.queryOne((String)"pc.cls.PurchaseClass", (QuerySchema)querySchema);
                    if (queryOrgId == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800175);
                    }
                    if (!purchaseClass.getOrgId().equals(queryOrgId.get("orgId").toString())) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801152);
                    }
                    if (queryOrgId.get("level") != null && (Integer)queryOrgId.get("level") > 7) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801190);
                    }
                } else if (query != null && query.get("parent") != null) {
                    purchaseClass.setParent((Object)Long.valueOf(query.get("parent").toString()));
                }
                BillDataDto billDataDto = new BillDataDto();
                billDataDto.setBillnum("pc_purchaseclass");
                billDataDto.setAction("save");
                billDataDto.setData((Object)purchaseClass);
                billDataDto.setFromApi(true);
                billDataDto.setConvertType(Integer.valueOf(3));
                Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
                PurchaseClassDTO purchaseClassDTO1 = new PurchaseClassDTO();
                purchaseClassDTO1.setId((Long)((Map)result).get("id"));
                return CoreDocJsonResult.success((Object)purchaseClassDTO1);
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error("\u91c7\u8d2d\u5206\u7c7b\u66f4\u65b0\u9519\u8bef:" + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<String> delete(PurchaseClassDTO purchaseClassDTO) {
        if (null != purchaseClassDTO) {
            try {
                PurchaseClass purchaseClass = new PurchaseClass();
                if (purchaseClassDTO.getCode() != null) {
                    Long id = CoreDocBaseDao.queryIdByCode((String)purchaseClassDTO.getCode(), (String)"pc.cls.PurchaseClass");
                    if (id == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800879);
                    }
                    purchaseClass.setId((Object)id);
                    QuerySchema querySchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"parent").eq((Object)id)}));
                    List queryId = MetaDaoHelper.query((String)"pc.cls.PurchaseClass", (QuerySchema)querySchema);
                    if (!CollectionUtils.isEmpty((Collection)queryId)) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801191);
                    }
                }
                ArrayList<Map> purchaseClassList = new ArrayList<Map>();
                purchaseClass.put("_fromApi", (Object)true);
                purchaseClassList.add((Map)JSON.parseObject((String)JSON.toJSONString((Object)purchaseClass), HashMap.class));
                BillDataDto billDataDto = new BillDataDto();
                billDataDto.setBillnum("pc_purchaseclasslist");
                billDataDto.setAction("delete");
                billDataDto.setData(purchaseClassList);
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
                log.error("\u91c7\u8d2d\u5206\u7c7b\u5220\u9664\u9519\u8bef:" + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<PurchaseClassDTO> batchUnstop(PurchaseClassQryDTO purchaseClassQryDTO) {
        if (null != purchaseClassQryDTO) {
            try {
                ArrayList<PurchaseClass> purchaseClassList = new ArrayList<PurchaseClass>();
                ArrayList<PurchaseClassDTO> purchaseClassDTOList = new ArrayList<PurchaseClassDTO>();
                HashMap<String, Map> codeCls = new HashMap<String, Map>();
                if (purchaseClassQryDTO.getCodeList() != null) {
                    if (purchaseClassQryDTO.getCodeList().size() > 20) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801192);
                    }
                    QuerySchema schema = QuerySchema.create().addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").in((Collection)purchaseClassQryDTO.getCodeList())}));
                    ArrayList<QueryField> qryFields = new ArrayList<QueryField>();
                    qryFields.add(new QueryField("id", "id"));
                    qryFields.add(new QueryField("code", "code"));
                    qryFields.add(new QueryField("path", "path"));
                    schema.selectFields(qryFields);
                    List queryList = MetaDaoHelper.query((String)"pc.cls.PurchaseClass", (QuerySchema)schema);
                    HashSet<Long> idSet = new HashSet<Long>();
                    if (!CollectionUtils.isEmpty((Collection)queryList)) {
                        for (Map query : queryList) {
                            List<String> ids;
                            codeCls.put(query.get("code").toString(), query);
                            if (query.get("path") == null || CollectionUtils.isEmpty(ids = Arrays.asList(query.get("path").toString().split("\\|")))) continue;
                            for (String id : ids) {
                                if (id == null || id.length() <= 0) continue;
                                idSet.add(Long.valueOf(id));
                            }
                        }
                    }
                    String message = "";
                    for (String code : purchaseClassQryDTO.getCodeList()) {
                        if (codeCls.get(code) != null) continue;
                        message = message + code;
                    }
                    if (message.length() != 0) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801193, new Object[]{message});
                    }
                    if (!CollectionUtils.isEmpty(idSet)) {
                        for (Long id : idSet) {
                            PurchaseClass purchaseClass = new PurchaseClass();
                            purchaseClass.setId((Object)id);
                            purchaseClass.setStopstatus(Boolean.valueOf(false));
                            purchaseClass.setStoptime(null);
                            purchaseClass.setEntityStatus(EntityStatus.Update);
                            purchaseClassList.add(purchaseClass);
                            PurchaseClassDTO purchaseClassDTO = new PurchaseClassDTO();
                            purchaseClassDTO.setId(id);
                            purchaseClassDTO.setStopStatus(Boolean.valueOf(false));
                            purchaseClassDTOList.add(purchaseClassDTO);
                        }
                    }
                }
                MetaDaoHelper.update((String)"pc.cls.PurchaseClass", purchaseClassList);
                return CoreDocJsonResult.success(purchaseClassDTOList);
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error("\u91c7\u8d2d\u5206\u7c7b\u542f\u7528\u9519\u8bef:" + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<PurchaseClassDTO> batchStop(PurchaseClassQryDTO purchaseClassQryDTO) {
        if (null != purchaseClassQryDTO) {
            try {
                ArrayList<PurchaseClass> purchaseClassList = new ArrayList<PurchaseClass>();
                ArrayList<PurchaseClassDTO> purchaseClassDTOList = new ArrayList<PurchaseClassDTO>();
                HashMap<String, Object> codeCls = new HashMap<String, Object>();
                if (purchaseClassQryDTO.getCodeList() != null) {
                    if (purchaseClassQryDTO.getCodeList().size() > 20) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801192);
                    }
                    QuerySchema schema = QuerySchema.create().addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").in((Collection)purchaseClassQryDTO.getCodeList())}));
                    ArrayList<QueryField> qryFields = new ArrayList<QueryField>();
                    qryFields.add(new QueryField("id", "id"));
                    qryFields.add(new QueryField("code", "code"));
                    schema.selectFields(qryFields);
                    List queryList = MetaDaoHelper.query((String)"pc.cls.PurchaseClass", (QuerySchema)schema);
                    HashSet<Long> idSet = new HashSet<Long>();
                    if (!CollectionUtils.isEmpty((Collection)queryList)) {
                        for (Object query : queryList) {
                            codeCls.put(query.get("code").toString(), query);
                            if (query.get("id") == null) continue;
                            idSet.add(Long.valueOf(query.get("id").toString()));
                        }
                    }
                    String message = "";
                    for (Object code : purchaseClassQryDTO.getCodeList()) {
                        if (codeCls.get(code) != null) continue;
                        message = message + (String)code;
                    }
                    if (message.length() != 0) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801193, new Object[]{message});
                    }
                    schema = QuerySchema.create();
                    ArrayList<QueryCondition> conditionExpressions = new ArrayList<QueryCondition>();
                    for (Long id : idSet) {
                        conditionExpressions.add(QueryCondition.name((String)"path").like((Object)id));
                    }
                    ConditionExpression[] ces = new ConditionExpression[conditionExpressions.size()];
                    QueryConditionGroup condition = QueryConditionGroup.or((ConditionExpression[])conditionExpressions.toArray(ces));
                    schema.selectFields(qryFields);
                    schema.addCondition((ConditionExpression)condition);
                    queryList = MetaDaoHelper.query((String)"pc.cls.PurchaseClass", (QuerySchema)schema);
                    if (!CollectionUtils.isEmpty((Collection)queryList)) {
                        Date date = new Date();
                        for (Map query : queryList) {
                            PurchaseClass purchaseClass = new PurchaseClass();
                            purchaseClass.setId((Object)Long.valueOf(query.get("id").toString()));
                            purchaseClass.setStopstatus(Boolean.valueOf(true));
                            purchaseClass.setStoptime(date);
                            purchaseClass.setEntityStatus(EntityStatus.Update);
                            purchaseClassList.add(purchaseClass);
                            PurchaseClassDTO purchaseClassDTO = new PurchaseClassDTO();
                            purchaseClassDTO.setId(Long.valueOf(query.get("id").toString()));
                            purchaseClassDTO.setStopStatus(Boolean.valueOf(true));
                            purchaseClassDTOList.add(purchaseClassDTO);
                        }
                    }
                }
                MetaDaoHelper.update((String)"pc.cls.PurchaseClass", purchaseClassList);
                return CoreDocJsonResult.success(purchaseClassDTOList);
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error("\u91c7\u8d2d\u5206\u7c7b\u505c\u7528\u9519\u8bef:" + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<PurchaseClassVO> queryPurchaseClass(BatchApiQueryParamWithOrg batchApiQueryParamWithOrg) throws Exception {
        CoreDocJsonResult coreDocJsonResult;
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
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
        Map result = MetaDaoHelper.queryOne((String)"pc.cls.PurchaseClass", (QuerySchema)countSchema);
        if (result != null && result.get("count") != null) {
            recordCount = Integer.parseInt(result.get("count").toString());
        }
        if (recordCount > 0) {
            if (batchApiQueryParamWithOrg.getPageSize() > (long)UpcAPiTool.PAGE_MAX_SIZE.intValue()) {
                batchApiQueryParamWithOrg.setPageSize((long)UpcAPiTool.PAGE_MAX_SIZE.intValue());
            }
            QuerySchema schema = QuerySchema.create().addSelect("id, code, name, parent, parent.code as parent___code, level, order, orgId.code as orgId___code, erpCode, orgId, purchaseClassCharacter, stopstatus").addCondition((ConditionExpression)queryConditionGroup).addPager(Long.valueOf(batchApiQueryParamWithOrg.getPageIndex()).intValue(), Long.valueOf(batchApiQueryParamWithOrg.getPageSize()).intValue()).addOrderBy("level");
            List purchaseClassList = MetaDaoHelper.queryObject((String)"pc.cls.PurchaseClass", (boolean)true, (QuerySchema)schema, null);
            ArrayList<PurchaseClassVO> purchaseClassVOList = new ArrayList<PurchaseClassVO>();
            for (PurchaseClass purchaseClass : purchaseClassList) {
                PurchaseClassVO purchaseClassVO = (PurchaseClassVO)JSON.parseObject((String)JSON.toJSONString((Object)purchaseClass), PurchaseClassVO.class);
                if (purchaseClass.get("name") != null) {
                    purchaseClassVO.setName(new MultiLangText((Map)purchaseClass.get("name")));
                }
                purchaseClassVOList.add(purchaseClassVO);
            }
            coreDocJsonResult = CoreDocJsonResult.success(purchaseClassVOList);
        } else {
            coreDocJsonResult = CoreDocJsonResult.success(null);
        }
        coreDocJsonResult.setTotalCount(Integer.valueOf(recordCount));
        return coreDocJsonResult;
    }

    @Override
    public void extendPreprocessing(BizObject bizObject) throws Exception {
        PurchaseClass purchaseClass = (PurchaseClass)bizObject;
        if (EntityStatus.Insert == purchaseClass.getEntityStatus() && purchaseClass.getStopstatus() == null) {
            purchaseClass.setStopstatus(Boolean.valueOf(false));
        }
        if (purchaseClass.getParent() != null) {
            QuerySchema querySchema = QuerySchema.create().addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)purchaseClass.getParent())}));
            ArrayList<QueryField> qryFields = new ArrayList<QueryField>();
            qryFields.add(new QueryField("level", "level"));
            qryFields.add(new QueryField("orgId", "orgId"));
            querySchema.selectFields(qryFields);
            Map queryOrgId = MetaDaoHelper.queryOne((String)"pc.cls.PurchaseClass", (QuerySchema)querySchema);
            if (queryOrgId == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800175);
            }
            if (purchaseClass.getOrgId() == null) {
                purchaseClass.setOrgId(queryOrgId.get("orgId").toString());
            } else if (!purchaseClass.getOrgId().equals(queryOrgId.get("orgId").toString())) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801152);
            }
            if (queryOrgId.get("level") != null && (Integer)queryOrgId.get("level") > 7) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801190);
            }
        }
        Boolean singleOrg = this.upcControlRuleService.checkSingleOrg();
        if (purchaseClass.getOrgId() != null && !singleOrg.booleanValue()) {
            TreeApplyRangeUtils.getInstance().checkOrgPermission(this.upcControlRuleService, purchaseClass.getOrgId(), "pc.cls.PurchaseClass", "pc_purchaseclass");
        }
    }

    @Override
    public BizObject convertBizObject(String matchRule, PubCommonVO pubCommonVO) {
        PurchaseClassVO purchaseClassVO = (PurchaseClassVO)pubCommonVO;
        PurchaseClass purchaseClass = (PurchaseClass)JacksonUtils.parseObject((String)JacksonUtils.toJSONString((Object)purchaseClassVO), PurchaseClass.class);
        if (ObjectUtils.isEmpty((Object)purchaseClassVO.getName())) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.NAME_NOT_NULL);
        }
        purchaseClass.set("name", (Object)purchaseClassVO.getName().toMap());
        if (StringUtils.hasLength((String)purchaseClassVO.getOrgId())) {
            purchaseClass.setOrgId(purchaseClassVO.getOrgId());
            purchaseClass.remove("orgId___code");
        } else if (!StringUtils.isEmpty((Object)purchaseClassVO.getOrgId___code())) {
            purchaseClass.set("orgId___code", (Object)purchaseClassVO.getOrgId___code());
        }
        if (purchaseClassVO.getParent() != null) {
            purchaseClass.setParent((Object)purchaseClassVO.getParent());
        } else if (!StringUtils.isEmpty((Object)purchaseClassVO.getParent___code())) {
            purchaseClass.set("parent___code", (Object)purchaseClassVO.getParent___code());
        }
        return purchaseClass;
    }
}


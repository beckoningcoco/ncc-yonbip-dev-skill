/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.dao.pub.CoreDocBaseDao
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.QueryOperatorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.po.pub.BatchApiQueryParam
 *  com.yonyou.iuap.apdoc.coredoc.po.pub.CoreDocBaseEntity
 *  com.yonyou.iuap.apdoc.coredoc.po.pub.QueryConditionPO
 *  com.yonyou.iuap.apdoc.coredoc.po.userdefine.UserDefineClassPO
 *  com.yonyou.iuap.apdoc.coredoc.po.userdefine.UserdefinePO
 *  com.yonyou.iuap.apdoc.coredoc.vo.userdefine.UserDefineClassVO
 *  com.yonyou.iuap.apdoc.coredoc.vo.userdefine.UserdefineVO
 *  com.yonyou.iuap.graphql.builder.IDefaultQuerySchemaBuilder
 *  com.yonyou.iuap.graphql.builder.QueryBuilders
 *  com.yonyou.iuap.graphql.builder.QueryConditions
 *  com.yonyou.iuap.graphql.model.IQuerySchema
 *  com.yonyou.iuap.graphql.model.conditions.IConditionExpression
 *  com.yonyou.iuap.graphql.model.conditions.group.IQueryConditionGroup
 *  com.yonyou.iuap.graphql.query.IMapDataAccessApi
 *  com.yonyou.iuap.international.MultiLangText
 *  com.yonyou.iuap.yms.common.utils.JacksonUtils
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService
 *  com.yonyou.ucf.mdd.ext.bill.biz.BillBiz
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.upc.pc.userdef.UserDefineClass
 *  com.yonyoucloud.upc.pc.userdef.Userdefine
 *  com.yonyoucloud.upc.utils.CoreDocJsonResult
 *  org.apache.commons.lang3.ObjectUtils
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.QuerySchema
 *  org.jetbrains.annotations.NotNull
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.iuap.ipass.impl.userdef;

import com.yonyou.iuap.apdoc.coredoc.dao.pub.CoreDocBaseDao;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.QueryOperatorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.po.pub.BatchApiQueryParam;
import com.yonyou.iuap.apdoc.coredoc.po.pub.CoreDocBaseEntity;
import com.yonyou.iuap.apdoc.coredoc.po.pub.QueryConditionPO;
import com.yonyou.iuap.apdoc.coredoc.po.userdefine.UserDefineClassPO;
import com.yonyou.iuap.apdoc.coredoc.po.userdefine.UserdefinePO;
import com.yonyou.iuap.apdoc.coredoc.vo.userdefine.UserDefineClassVO;
import com.yonyou.iuap.apdoc.coredoc.vo.userdefine.UserdefineVO;
import com.yonyou.iuap.graphql.builder.IDefaultQuerySchemaBuilder;
import com.yonyou.iuap.graphql.builder.QueryBuilders;
import com.yonyou.iuap.graphql.builder.QueryConditions;
import com.yonyou.iuap.graphql.model.IQuerySchema;
import com.yonyou.iuap.graphql.model.conditions.IConditionExpression;
import com.yonyou.iuap.graphql.model.conditions.group.IQueryConditionGroup;
import com.yonyou.iuap.graphql.query.IMapDataAccessApi;
import com.yonyou.iuap.international.MultiLangText;
import com.yonyou.iuap.yms.common.utils.JacksonUtils;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService;
import com.yonyou.ucf.mdd.ext.bill.biz.BillBiz;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.upc.pc.userdef.UserDefineClass;
import com.yonyoucloud.upc.pc.userdef.Userdefine;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import org.apache.commons.lang3.ObjectUtils;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.QuerySchema;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

@Service
public class UserDefineClassIPassServiceImpl {
    private static final Logger log = LoggerFactory.getLogger(UserDefineClassIPassServiceImpl.class);
    @Autowired
    private IMapDataAccessApi mapDataAccessApi;
    @Autowired
    private ApiImportCommandService apiImportSingleService;
    @Autowired
    private CoreDocBaseDao coreDocBaseDao;

    public CoreDocJsonResult<UserDefineClassVO> queryUserDefineClass(BatchApiQueryParam batchApiQueryParam) throws Exception {
        CoreDocJsonResult coreDocJsonResult;
        IQueryConditionGroup qryConditionGroup = UserDefineClassIPassServiceImpl.getQryConditionGroup(batchApiQueryParam);
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
                List<UserDefineClassVO> userDefineClassVOList = this.detailUserDefineClass(Long.valueOf(batchApiQueryParam.getPageIndex()).intValue(), Long.valueOf(batchApiQueryParam.getPageSize()).intValue(), qryConditionGroup);
                coreDocJsonResult = CoreDocJsonResult.success(userDefineClassVOList);
            }
        } else {
            coreDocJsonResult = CoreDocJsonResult.success(null);
        }
        coreDocJsonResult.setTotalCount(Integer.valueOf(recordCount));
        return coreDocJsonResult;
    }

    private List<UserDefineClassVO> detailUserDefineClass(int pageIndex, int pageSize, IQueryConditionGroup qryConditionGroup) throws Exception {
        IDefaultQuerySchemaBuilder schemaBuilder = QueryBuilders.defaultBuilder().from("pc.userdef.UserDefineClass").distinct().addSelect(new UserDefineClassPO().getAllMetaArrField()).pager(pageIndex, pageSize);
        QuerySchema querySchema = (QuerySchema)schemaBuilder.condition(qryConditionGroup).build();
        List resultList = MetaDaoHelper.query((String)"pc.userdef.UserDefineClass", (boolean)true, (QuerySchema)querySchema, null);
        ArrayList<UserDefineClassVO> userDefineClassVOList = new ArrayList<UserDefineClassVO>();
        if (ObjectUtils.isNotEmpty((Object)resultList)) {
            for (Map resultMap : resultList) {
                UserDefineClassVO userDefineClassVO = (UserDefineClassVO)JacksonUtils.parseObject((String)JacksonUtils.toJSONString((Object)resultMap), UserDefineClassVO.class);
                userDefineClassVO.setUserdefines(this.detailUserDefine(userDefineClassVO.getId()));
                if (resultMap.get("showItem") != null) {
                    userDefineClassVO.setShowItem(new MultiLangText((Map)resultMap.get("showItem")));
                }
                if (resultMap.get("userdefAlias") != null) {
                    userDefineClassVO.setUserdefAlias(new MultiLangText((Map)resultMap.get("userdefAlias")));
                }
                userDefineClassVOList.add(userDefineClassVO);
            }
        }
        return userDefineClassVOList;
    }

    private List<UserdefineVO> detailUserDefine(String userDefId) {
        IQueryConditionGroup qryConditionGroup = QueryConditions.and((IConditionExpression[])new IConditionExpression[]{QueryConditions.eq((String)"userdefid", (Object)userDefId)});
        IDefaultQuerySchemaBuilder schemaBuilder = QueryBuilders.defaultBuilder().from("pc.userdef.Userdefine").distinct().select(new UserdefinePO().getAllMetaArrField());
        IQuerySchema querySchema = schemaBuilder.condition(qryConditionGroup).build();
        List resultList = this.mapDataAccessApi.queryForList(querySchema);
        ArrayList<UserdefineVO> userdefineVOList = new ArrayList<UserdefineVO>();
        if (ObjectUtils.isNotEmpty((Object)resultList)) {
            for (Map resultMap : resultList) {
                UserdefineVO userdefineVO = (UserdefineVO)JacksonUtils.parseObject((String)JacksonUtils.toJSONString((Object)resultMap), UserdefineVO.class);
                userdefineVOList.add(userdefineVO);
            }
        }
        return userdefineVOList;
    }

    public Long userDefineClassSave(String matchRule, UserDefineClassVO userDefineClassVO) throws Exception {
        Long id = 0L;
        UserDefineClass userDefineClass = this.convertToUserDefineClass(matchRule, userDefineClassVO);
        this.fillPKAndStatus(matchRule, userDefineClass);
        BillDataDto billDataDto = this.buildBillDataDto(userDefineClass);
        Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
        if (result != null) {
            id = (Long)((UserDefineClass)result).getId();
        }
        return id;
    }

    @NotNull
    private BillDataDto buildBillDataDto(UserDefineClass userDefineClass) {
        BillDataDto billDataDto = new BillDataDto();
        billDataDto.setBillnum("pc_productorderpro");
        billDataDto.setAction("save");
        billDataDto.setData((Object)userDefineClass);
        billDataDto.setFromApi(true);
        billDataDto.setConvertType(Integer.valueOf(4));
        return billDataDto;
    }

    private void fillPKAndStatus(String matchRule, UserDefineClass userDefineClass) throws Exception {
        UserDefineClassVO userDefineClassVO = this.matchUserDefineClass(matchRule, userDefineClass);
        if (Objects.isNull(userDefineClassVO)) {
            userDefineClass.setEntityStatus(EntityStatus.Insert);
        } else {
            userDefineClass.setEntityStatus(EntityStatus.Update);
            userDefineClass.setId((Object)userDefineClassVO.getId());
            this.fillUserDefine(userDefineClass, userDefineClassVO);
        }
    }

    private void fillUserDefine(UserDefineClass userDefineClass, UserDefineClassVO userDefineClassVO) {
        if (ObjectUtils.isNotEmpty((Object)userDefineClass.userdefines())) {
            Map<Object, Object> userdefineVOMap = new HashMap();
            if (ObjectUtils.isNotEmpty((Object)userDefineClassVO.getUserdefines())) {
                userdefineVOMap = userDefineClassVO.getUserdefines().stream().filter(v -> v != null && v.getName() != null).collect(Collectors.toMap(UserdefineVO::getName, v -> v));
            }
            for (Userdefine userdefine : userDefineClass.userdefines()) {
                userdefine.setEntityStatus(EntityStatus.Insert);
                userdefine.setUserdefid(Long.valueOf(Long.parseLong(userDefineClassVO.getId())));
                UserdefineVO userdefineVO = (UserdefineVO)userdefineVOMap.get(userdefine.getName());
                if (!ObjectUtils.isNotEmpty((Object)userdefineVO)) continue;
                userdefine.setEntityStatus(EntityStatus.Update);
                userdefine.setId((Object)Long.parseLong(userdefineVO.getId()));
                userdefineVOMap.remove(userdefine.getName());
            }
            if (ObjectUtils.isNotEmpty(userdefineVOMap)) {
                for (UserdefineVO userdefineVO : userdefineVOMap.values()) {
                    Userdefine userdefine = new Userdefine();
                    userdefine.setEntityStatus(EntityStatus.Delete);
                    userdefine.setId((Object)userdefineVO.getId());
                    userDefineClass.userdefines().add(userdefine);
                }
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private UserDefineClassVO matchUserDefineClass(String matchRule, UserDefineClass userDefineClass) throws Exception {
        IQueryConditionGroup qryConditionGroup = QueryConditions.and((IConditionExpression[])new IConditionExpression[]{QueryConditions.eq((String)"classId", (Object)"productOrder"), QueryConditions.eq((String)"isDeleted", (Object)false)});
        if ("id".equals(matchRule) && userDefineClass.getId() != null) {
            qryConditionGroup = QueryConditions.and((IConditionExpression[])new IConditionExpression[]{qryConditionGroup, QueryConditions.eq((String)"id", (Object)Long.valueOf(userDefineClass.getId().toString()))});
        } else {
            if (userDefineClass.get("showItem") == null) return null;
            Map nameMap = (Map)userDefineClass.get("showItem");
            if (!ObjectUtils.isNotEmpty(nameMap.get("zh_CN"))) return null;
            qryConditionGroup = QueryConditions.and((IConditionExpression[])new IConditionExpression[]{qryConditionGroup, QueryConditions.eq((String)"showItem", (Object)((String)nameMap.get("zh_CN")))});
        }
        List<UserDefineClassVO> userDefineClassVOS = this.detailUserDefineClass(1, 10, qryConditionGroup);
        if (!ObjectUtils.isNotEmpty(userDefineClassVOS)) return null;
        UserDefineClassVO userDefineClassVO = userDefineClassVOS.get(0);
        return userDefineClassVO;
    }

    private UserDefineClass convertToUserDefineClass(String matchRule, UserDefineClassVO userDefineClassVO) {
        UserDefineClass userDefineClass;
        if (Objects.isNull(userDefineClassVO)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801155);
        }
        if (!"id".equals(matchRule)) {
            userDefineClassVO.setId(null);
        }
        if (ObjectUtils.isEmpty((Object)(userDefineClass = (UserDefineClass)JacksonUtils.parseObject((String)JacksonUtils.toJSONString((Object)userDefineClassVO), UserDefineClass.class)).get("showItem"))) {
            userDefineClass.set("showItem", (Object)userDefineClassVO.getShowItem().toMap());
        }
        if (ObjectUtils.isEmpty((Object)userDefineClass.get("userdefAlias"))) {
            userDefineClass.set("userdefAlias", (Object)userDefineClassVO.getUserdefAlias().toMap());
        }
        if (ObjectUtils.isNotEmpty((Object)userDefineClassVO.getStopstatus())) {
            userDefineClass.setIsEnabled(Boolean.valueOf(userDefineClassVO.getStopstatus() == false));
        }
        return userDefineClass;
    }

    public String deleteUserDefineClass(String id, String name) throws Exception {
        ArrayList<QueryConditionPO> queryConditionPOS = new ArrayList<QueryConditionPO>();
        if (ObjectUtils.isNotEmpty((Object)id)) {
            queryConditionPOS.add(new QueryConditionPO("id", QueryOperatorEnum.EQ, id));
        } else if (ObjectUtils.isNotEmpty((Object)name)) {
            queryConditionPOS.add(new QueryConditionPO("showItem", QueryOperatorEnum.EQ, name));
        } else {
            return null;
        }
        List userDefineClassPOList = this.coreDocBaseDao.queryEntityByCondition((CoreDocBaseEntity)new UserDefineClassPO(), queryConditionPOS);
        if (CollectionUtils.isEmpty((Collection)userDefineClassPOList)) {
            return null;
        }
        List userDefineClassList = userDefineClassPOList.stream().map(v -> {
            UserDefineClass userDefineClass = new UserDefineClass();
            userDefineClass.setId((Object)v.getId());
            return userDefineClass;
        }).collect(Collectors.toList());
        BillDataDto bill = new BillDataDto();
        bill.setData(userDefineClassList);
        bill.setBillnum("pc_productorderprolist");
        try {
            RuleExecuteResult result = BillBiz.delete((BillDataDto)bill);
            if (!CollectionUtils.isEmpty((Collection)result.getMessages())) {
                return result.getMessages().get(0).toString();
            }
        }
        catch (Exception e) {
            return "Error deleting product order property: " + e.getMessage();
        }
        return null;
    }

    private static IQueryConditionGroup getQryConditionGroup(BatchApiQueryParam batchApiQueryParam) {
        IQueryConditionGroup qryConditionGroup = QueryConditions.and((IConditionExpression[])new IConditionExpression[]{QueryConditions.eq((String)"classId", (Object)"productOrder"), QueryConditions.eq((String)"isDeleted", (Object)false)});
        if (!CollectionUtils.isEmpty((Collection)batchApiQueryParam.getIds())) {
            qryConditionGroup = QueryConditions.and((IConditionExpression[])new IConditionExpression[]{qryConditionGroup, QueryConditions.in((String)"id", (Collection)batchApiQueryParam.getIds())});
        } else if (StringUtils.hasLength((String)batchApiQueryParam.getId())) {
            qryConditionGroup = QueryConditions.and((IConditionExpression[])new IConditionExpression[]{qryConditionGroup, QueryConditions.eq((String)"id", (Object)batchApiQueryParam.getId())});
        }
        if (StringUtils.hasLength((String)batchApiQueryParam.getName())) {
            qryConditionGroup = QueryConditions.and((IConditionExpression[])new IConditionExpression[]{qryConditionGroup, QueryConditions.eq((String)"showItem", (Object)batchApiQueryParam.getName())});
        }
        if (batchApiQueryParam.getStartTs() != null) {
            qryConditionGroup = QueryConditions.and((IConditionExpression[])new IConditionExpression[]{qryConditionGroup, QueryConditions.egt((String)"pubts", (Object)batchApiQueryParam.getStartTs())});
        }
        if (batchApiQueryParam.getEndTs() != null) {
            qryConditionGroup = QueryConditions.and((IConditionExpression[])new IConditionExpression[]{qryConditionGroup, QueryConditions.lt((String)"pubts", (Object)batchApiQueryParam.getEndTs())});
        }
        return qryConditionGroup;
    }

    private int getRecordCount(IQueryConditionGroup qryConditionGroup) {
        int recordCount = 0;
        IDefaultQuerySchemaBuilder schemaBuilder = QueryBuilders.defaultBuilder().from("pc.userdef.UserDefineClass").distinct().select(new String[]{"count(id)"});
        IQuerySchema querySchema = schemaBuilder.condition(qryConditionGroup).build();
        List resultList = this.mapDataAccessApi.queryForList(querySchema);
        if (ObjectUtils.isNotEmpty((Object)resultList) && resultList.get(0) != null && ((Map)resultList.get(0)).get("count") != null) {
            recordCount = Integer.parseInt(((Map)resultList.get(0)).get("count").toString());
        }
        return recordCount;
    }
}


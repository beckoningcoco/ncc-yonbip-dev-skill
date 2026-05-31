/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.po.pub.BatchApiQueryParamWithOrg
 *  com.yonyou.iuap.apdoc.coredoc.po.pub.PubCommonVO
 *  com.yonyou.iuap.apdoc.coredoc.vo.materialcls.PresentationClassVO
 *  com.yonyou.iuap.basedoc.social.util.JacksonUtils
 *  com.yonyou.iuap.international.MultiLangText
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.upc.tools.CoreDocJsonResultForOpenApi
 *  com.yonyoucloud.iuap.ipass.presentationclass.PresentationClassIPassTreeRequest
 *  com.yonyoucloud.iuap.upc.dto.derivatives.PresentationClassDTO
 *  com.yonyoucloud.iuap.upc.dto.derivatives.PresentationClassQryDTO
 *  com.yonyoucloud.iuap.upc.dto.ext.UPCPager
 *  com.yonyoucloud.upc.pc.cls.PresentationClass
 *  com.yonyoucloud.upc.utils.CoreDocJsonResult
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
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
package com.yonyoucloud.iuap.ipass.impl.presentationclass;

import com.alibaba.fastjson.JSON;
import com.yonyou.iuap.apdoc.coredoc.api.service.APIIpassService;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.po.pub.BatchApiQueryParamWithOrg;
import com.yonyou.iuap.apdoc.coredoc.po.pub.PubCommonVO;
import com.yonyou.iuap.apdoc.coredoc.vo.materialcls.PresentationClassVO;
import com.yonyou.iuap.basedoc.social.util.JacksonUtils;
import com.yonyou.iuap.international.MultiLangText;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.upc.tools.CoreDocJsonResultForOpenApi;
import com.yonyoucloud.iuap.ipass.presentationclass.PresentationClassIPassTreeRequest;
import com.yonyoucloud.iuap.ipass.service.presentationclass.PresentationClassIPassService;
import com.yonyoucloud.iuap.upc.dto.derivatives.PresentationClassDTO;
import com.yonyoucloud.iuap.upc.dto.derivatives.PresentationClassQryDTO;
import com.yonyoucloud.iuap.upc.dto.ext.UPCPager;
import com.yonyoucloud.upc.pc.cls.PresentationClass;
import com.yonyoucloud.upc.service.api.PresentationClassServiceImpl;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
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
public class PresentationClassIPassServiceImpl
extends APIIpassService
implements PresentationClassIPassService {
    private static final Logger log = LoggerFactory.getLogger(PresentationClassIPassServiceImpl.class);
    @Autowired
    private PresentationClassServiceImpl presentationClassService;

    @Override
    public CoreDocJsonResultForOpenApi doPresentationClassQuery(PresentationClassIPassTreeRequest presentationClassIPassTreeRequest) {
        try {
            PresentationClassQryDTO presentationClassQryDTO = new PresentationClassQryDTO();
            BeanUtils.copyProperties((Object)presentationClassIPassTreeRequest, (Object)presentationClassQryDTO);
            if (presentationClassIPassTreeRequest.getBeginTime() != null) {
                presentationClassQryDTO.setBeganTime(presentationClassIPassTreeRequest.getBeginTime());
            }
            CoreDocJsonResult<PresentationClassDTO> coreDocJsonResult = this.presentationClassService.queryTree(presentationClassQryDTO);
            CoreDocJsonResultForOpenApi resultForOpenApi = new CoreDocJsonResultForOpenApi();
            BeanUtils.copyProperties(coreDocJsonResult, (Object)resultForOpenApi);
            if (!resultForOpenApi.isSuccess()) {
                return resultForOpenApi;
            }
            Integer recordCount = this.presentationClassService.queryPresentationClassCount(presentationClassQryDTO);
            UPCPager upcPager = new UPCPager();
            upcPager.setPageIndex(presentationClassIPassTreeRequest.getPageIndex());
            upcPager.setPageSize(presentationClassIPassTreeRequest.getPageSize());
            upcPager.setRecordCount(recordCount);
            upcPager.setHaveNextPage(Boolean.valueOf(false));
            if (recordCount != null && presentationClassIPassTreeRequest.getPageIndex() != null && presentationClassIPassTreeRequest.getPageSize() != null && recordCount > presentationClassIPassTreeRequest.getPageSize() * presentationClassIPassTreeRequest.getPageIndex()) {
                upcPager.setHaveNextPage(Boolean.valueOf(true));
            }
            upcPager.setRecordList((List)resultForOpenApi.getData());
            resultForOpenApi.setData((Object)upcPager);
            return resultForOpenApi;
        }
        catch (Exception e) {
            log.error("\u5546\u54c1\u5206\u7c7b\u6811\u67e5\u8be2\u7279\u5f81-\u96c6\u6210\u63a5\u53e3\u5f02\u5e38:" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResultForOpenApi.error((CoreDocBusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    public CoreDocJsonResult<PresentationClassVO> queryPresentationClass(BatchApiQueryParamWithOrg batchApiQueryParamWithOrg) throws Exception {
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
        Map result = MetaDaoHelper.queryOne((String)"pc.cls.PresentationClass", (QuerySchema)countSchema);
        if (result != null && result.get("count") != null) {
            recordCount = Integer.parseInt(result.get("count").toString());
        }
        if (recordCount > 0) {
            if (batchApiQueryParamWithOrg.getPageSize() > (long)UpcAPiTool.PAGE_MAX_SIZE.intValue()) {
                batchApiQueryParamWithOrg.setPageSize((long)UpcAPiTool.PAGE_MAX_SIZE.intValue());
            }
            QuerySchema schema = QuerySchema.create().addSelect("id, code, name, parent, parent.code as parent___code, level, order, manageClass, manageClass.code as manageClass___code, template, template.name as template___name, remark, stopstatus, isRecommend, isURecommend, showInFront, showInTouchpad, shareDescription, pageTitle, seoKeyword, seoDescription, presentationClassCharacter, iUOrderStatus").addCondition((ConditionExpression)queryConditionGroup).addPager(Long.valueOf(batchApiQueryParamWithOrg.getPageIndex()).intValue(), Long.valueOf(batchApiQueryParamWithOrg.getPageSize()).intValue()).addOrderBy("level");
            List presentationClassList = MetaDaoHelper.queryObject((String)"pc.cls.PresentationClass", (boolean)true, (QuerySchema)schema, null);
            ArrayList<PresentationClassVO> presentationClassVOList = new ArrayList<PresentationClassVO>();
            for (PresentationClass presentationClass : presentationClassList) {
                PresentationClassVO presentationClassVO = (PresentationClassVO)JSON.parseObject((String)JSON.toJSONString((Object)presentationClass), PresentationClassVO.class);
                if (presentationClass.get("name") != null) {
                    presentationClassVO.setName(new MultiLangText((Map)presentationClass.get("name")));
                }
                if (presentationClass.get("shareDescription") != null) {
                    presentationClassVO.setShareDescription(new MultiLangText((Map)presentationClass.get("shareDescription")));
                }
                if (presentationClass.get("pageTitle") != null) {
                    presentationClassVO.setPageTitle(new MultiLangText((Map)presentationClass.get("pageTitle")));
                }
                if (presentationClass.get("seoKeyword") != null) {
                    presentationClassVO.setSeoKeyword(new MultiLangText((Map)presentationClass.get("seoKeyword")));
                }
                if (presentationClass.get("seoDescription") != null) {
                    presentationClassVO.setSeoDescription(new MultiLangText((Map)presentationClass.get("seoDescription")));
                }
                if (presentationClass.get("remark") != null) {
                    presentationClassVO.setRemark(new MultiLangText((Map)presentationClass.get("remark")));
                }
                presentationClassVOList.add(presentationClassVO);
            }
            coreDocJsonResult = CoreDocJsonResult.success(presentationClassVOList);
        } else {
            coreDocJsonResult = CoreDocJsonResult.success(null);
        }
        coreDocJsonResult.setTotalCount(Integer.valueOf(recordCount));
        return coreDocJsonResult;
    }

    @Override
    public void extendPreprocessing(BizObject bizObject) throws Exception {
        QuerySchema schema;
        Map query;
        PresentationClass presentationClass = (PresentationClass)bizObject;
        if (EntityStatus.Insert == presentationClass.getEntityStatus() && presentationClass.getStopstatus() == null) {
            presentationClass.setStopstatus(Boolean.valueOf(false));
        }
        if (presentationClass.getParent() != null && (query = MetaDaoHelper.queryOne((String)"pc.cls.PresentationClass", (QuerySchema)(schema = QuerySchema.create().addSelect("level").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)presentationClass.getParent())}))))) != null && query.get("level") != null && (Integer)query.get("level") > 2) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801374, new Object[]{presentationClass.getCode()});
        }
    }

    @Override
    public BizObject convertBizObject(String matchRule, PubCommonVO pubCommonVO) {
        PresentationClassVO presentationClassVO = (PresentationClassVO)pubCommonVO;
        PresentationClass presentationClass = (PresentationClass)JacksonUtils.parseObject((String)JacksonUtils.toJSONString((Object)presentationClassVO), PresentationClass.class);
        if (ObjectUtils.isEmpty((Object)presentationClassVO.getName())) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.NAME_NOT_NULL);
        }
        presentationClass.set("name", (Object)presentationClassVO.getName().toMap());
        if (presentationClassVO.getManageClass() != null && !"".equals(presentationClassVO.getManageClass())) {
            presentationClass.setParent((Object)presentationClassVO.getManageClass());
            presentationClass.remove("manageClass___code");
        } else if (!StringUtils.isEmpty((Object)presentationClassVO.getManageClass___code())) {
            presentationClass.set("manageClass___code", (Object)presentationClassVO.getManageClass___code());
            presentationClass.remove("manageClass");
        }
        if (presentationClassVO.getParent() != null && !"".equals(presentationClassVO.getParent())) {
            presentationClass.setParent((Object)presentationClassVO.getParent());
            presentationClass.remove("parent___code");
        } else if (!StringUtils.isEmpty((Object)presentationClassVO.getParent___code())) {
            presentationClass.set("parent___code", (Object)presentationClassVO.getParent___code());
            presentationClass.remove("parent");
        }
        if (!ObjectUtils.isEmpty((Object)presentationClassVO.getShareDescription())) {
            presentationClass.set("shareDescription", (Object)presentationClassVO.getShareDescription().toMap());
        }
        if (!ObjectUtils.isEmpty((Object)presentationClassVO.getPageTitle())) {
            presentationClass.set("pageTitle", (Object)presentationClassVO.getPageTitle().toMap());
        }
        if (!ObjectUtils.isEmpty((Object)presentationClassVO.getSeoKeyword())) {
            presentationClass.set("seoKeyword", (Object)presentationClassVO.getSeoKeyword().toMap());
        }
        if (!ObjectUtils.isEmpty((Object)presentationClassVO.getSeoDescription())) {
            presentationClass.set("seoDescription", (Object)presentationClassVO.getSeoDescription().toMap());
        }
        if (!ObjectUtils.isEmpty((Object)presentationClassVO.getRemark())) {
            presentationClass.set("remark", (Object)presentationClassVO.getRemark().toMap());
        }
        return presentationClass;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.vo.materiallifecycle.LifeCycleTemplateVO
 *  com.yonyou.iuap.international.MultiLangText
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.iuap.upc.vo.LifeCycleTemplateQueryVO
 *  com.yonyoucloud.upc.utils.CoreDocJsonResult
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.api.materialLifeCycle;

import com.alibaba.fastjson.JSON;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.vo.materiallifecycle.LifeCycleTemplateVO;
import com.yonyou.iuap.international.MultiLangText;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.iuap.upc.vo.LifeCycleTemplateQueryVO;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class IMaterialLifeCycQueryService {
    private static final Logger log = LoggerFactory.getLogger(IMaterialLifeCycQueryService.class);

    public CoreDocJsonResult<LifeCycleTemplateVO> listMaterialLifeCycDetail(LifeCycleTemplateQueryVO lifeCycleTemplateQueryVO) throws Exception {
        List<LifeCycleTemplateVO> lifeCycleTemplateVOList = this.queryMaterialLifeCycList(lifeCycleTemplateQueryVO);
        CoreDocJsonResult result = CoreDocJsonResult.success(lifeCycleTemplateVOList);
        return result;
    }

    private List<LifeCycleTemplateVO> queryMaterialLifeCycList(LifeCycleTemplateQueryVO queryVO) throws Exception {
        if (null == queryVO) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801171);
        }
        ArrayList<LifeCycleTemplateVO> lifeCycleTemplateVOList = new ArrayList<LifeCycleTemplateVO>();
        ArrayList<QueryCondition> conditionExpressions = new ArrayList<QueryCondition>();
        if (!CollectionUtils.isEmpty((Collection)queryVO.getIdList())) {
            if (queryVO.getIdList().size() > UpcAPiTool.List_LENGTH) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801216, new Object[]{UpcAPiTool.List_LENGTH});
            }
            conditionExpressions.add(QueryCondition.name((String)"id").in((Collection)queryVO.getIdList()));
        } else if (!CollectionUtils.isEmpty((Collection)queryVO.getCodeList())) {
            if (queryVO.getCodeList().size() > UpcAPiTool.List_LENGTH) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801217, new Object[]{UpcAPiTool.List_LENGTH});
            }
            conditionExpressions.add(QueryCondition.name((String)"code").in((Collection)queryVO.getCodeList()));
        } else {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801171);
        }
        try {
            ConditionExpression[] ces = new ConditionExpression[conditionExpressions.size()];
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])conditionExpressions.toArray(ces));
            QuerySchema lifeCycleTemplateschema = QuerySchema.create().addSelect("id as id , code as code ,name as name,systemFlag as systemFlag,stopstatus as stopstatus").appendQueryCondition(new ConditionExpression[0]).addCondition((ConditionExpression)queryConditionGroup);
            QuerySchema lifeCycleTemplateDetailschema = QuerySchema.create().name("lifeCycleDetail").fullname("pc.manage.LifeCycleDetail").addSelect("id as id,lifeCycleTemplateId as lifeCycleTemplateId,materialStatusId as materialStatusId,materialStatusId.code as materialStatusId___code, materialStatusId.name as materialStatusId___name,isDefault as isDefault ");
            lifeCycleTemplateschema.addCompositionSchema(lifeCycleTemplateDetailschema);
            List lifeCycleTemplateList = MetaDaoHelper.query((String)"pc.manage.LifeCycleTemplate", (boolean)true, (QuerySchema)lifeCycleTemplateschema, null);
            if (null != lifeCycleTemplateList && lifeCycleTemplateList.size() > 0) {
                for (HashMap lifeCycleTemplate : lifeCycleTemplateList) {
                    LifeCycleTemplateVO lifeCycleTemplateVO = (LifeCycleTemplateVO)JSON.parseObject((String)JSON.toJSONString((Object)lifeCycleTemplate), LifeCycleTemplateVO.class);
                    this.dealMultiLangText(lifeCycleTemplateVO, "name", lifeCycleTemplate);
                    lifeCycleTemplateVOList.add(lifeCycleTemplateVO);
                }
            }
        }
        catch (Exception e) {
            log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080288", (String)"\u67e5\u8be2\u751f\u547d\u5468\u671f\u6a21\u677f\u4fe1\u606f\u6570\u636e\u5931\u8d25"), (Object)e.getMessage(), (Object)e);
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801218, new Object[]{e.getMessage()});
        }
        return lifeCycleTemplateVOList;
    }

    private void dealMultiLangText(LifeCycleTemplateVO lifeCycleTemplateVO, String multiLangText, Map<String, Object> map) {
        if (null == map.get(multiLangText)) {
            return;
        }
        lifeCycleTemplateVO.setName(new MultiLangText((Map)map.get(multiLangText)));
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.vo.materiallifecycle.MaterialStatusDetailActionVO
 *  com.yonyou.iuap.apdoc.coredoc.vo.materiallifecycle.MaterialStatusDetailVO
 *  com.yonyou.iuap.apdoc.coredoc.vo.materiallifecycle.MaterialStatusVO
 *  com.yonyou.iuap.international.MultiLangText
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.iuap.upc.vo.MaterialStatusQueryVO
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
import com.yonyou.iuap.apdoc.coredoc.vo.materiallifecycle.MaterialStatusDetailActionVO;
import com.yonyou.iuap.apdoc.coredoc.vo.materiallifecycle.MaterialStatusDetailVO;
import com.yonyou.iuap.apdoc.coredoc.vo.materiallifecycle.MaterialStatusVO;
import com.yonyou.iuap.international.MultiLangText;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.iuap.upc.vo.MaterialStatusQueryVO;
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
public class IMaterialStatusQueryService {
    private static final Logger log = LoggerFactory.getLogger(IMaterialStatusQueryService.class);

    public CoreDocJsonResult<MaterialStatusVO> listMaterialStatusDetail(MaterialStatusQueryVO materialStatusQueryVO) throws Exception {
        List<MaterialStatusVO> materialStatusVOList = this.queryMaterialStatusList(materialStatusQueryVO);
        CoreDocJsonResult result = CoreDocJsonResult.success(materialStatusVOList);
        return result;
    }

    private List<MaterialStatusVO> queryMaterialStatusList(MaterialStatusQueryVO queryVO) throws Exception {
        if (queryVO == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800075);
        }
        ArrayList<MaterialStatusVO> materialStatusVOList = new ArrayList<MaterialStatusVO>();
        ArrayList<QueryCondition> conditionExpressions = new ArrayList<QueryCondition>();
        if (!CollectionUtils.isEmpty((Collection)queryVO.getIdList())) {
            if (queryVO.getIdList().size() > UpcAPiTool.List_LENGTH) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801418, new Object[]{UpcAPiTool.List_LENGTH});
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
            QuerySchema materialStatusschema = QuerySchema.create().addSelect("id as id , code as code ,name as name,systemFlag as systemFlag,stopstatus as stopstatus").appendQueryCondition(new ConditionExpression[0]).addCondition((ConditionExpression)queryConditionGroup);
            QuerySchema materialStatusDetailschema = QuerySchema.create().name("materialStatusDetail").fullname("pc.manage.MaterialStatusDetail").addSelect("id as id,materialStatusId as materialStatusId,systemFlag as systemFlag,serviceCode as serviceCode,serviceName as serviceName,transType as transType,transType.name as transType_Name,transType.code as transType_Code, granularityControl as granularityControl, controlRule as controlRule");
            QuerySchema materialStatusDetalActionsschema = QuerySchema.create().name("materialStatusDetailAction").fullname("pc.manage.MaterialStatusDetailAction").addSelect("id as id,materialStatusDetailId as materialStatusDetailId,action as action,action.action as actionCode,action.actionName as actionName");
            materialStatusDetailschema.addCompositionSchema(materialStatusDetalActionsschema);
            materialStatusschema.addCompositionSchema(materialStatusDetailschema);
            List materialStatusList = MetaDaoHelper.query((String)"pc.manage.MaterialStatus", (boolean)true, (QuerySchema)materialStatusschema, null);
            if (null != materialStatusList && materialStatusList.size() > 0) {
                for (HashMap materialStatus : materialStatusList) {
                    MaterialStatusVO materialStatusVO = (MaterialStatusVO)JSON.parseObject((String)JSON.toJSONString((Object)materialStatus), MaterialStatusVO.class);
                    this.dealMultiLangText(materialStatusVO, "name", materialStatus);
                    if (null != materialStatus.get("materialStatusDetail")) {
                        ArrayList<MaterialStatusDetailVO> materialStatusDetailVOS = new ArrayList<MaterialStatusDetailVO>();
                        List materialStatusDetailList = (List)materialStatus.get("materialStatusDetail");
                        for (HashMap materialStatusDetail : materialStatusDetailList) {
                            MaterialStatusDetailVO materialStatusDetailVO = (MaterialStatusDetailVO)JSON.parseObject((String)JSON.toJSONString((Object)materialStatusDetail), MaterialStatusDetailVO.class);
                            if (null != materialStatusDetail.get("materialStatusDetailAction")) {
                                List materialStatusDetailAction = JSON.parseArray((String)JSON.toJSONString(materialStatusDetail.get("materialStatusDetailAction")), MaterialStatusDetailActionVO.class);
                                materialStatusDetailVO.setMaterialStatusDetailAction(materialStatusDetailAction);
                            }
                            materialStatusDetailVOS.add(materialStatusDetailVO);
                        }
                        materialStatusVO.setMaterialStatusDetail(materialStatusDetailVOS);
                    }
                    materialStatusVOList.add(materialStatusVO);
                }
            }
            return materialStatusVOList;
        }
        catch (Exception e) {
            log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040801B5", (String)"\u67e5\u8be2\u7269\u6599\u72b6\u6001\u4fe1\u606f\u6570\u636e\u5931\u8d25"), (Object)e.getMessage(), (Object)e);
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801419, new Object[]{e.getMessage()});
        }
    }

    private void dealMultiLangText(MaterialStatusVO materialStatusVO, String multiLangText, Map<String, Object> map) {
        if (null == map.get(multiLangText)) {
            return;
        }
        materialStatusVO.setName(new MultiLangText((Map)map.get(multiLangText)));
    }
}


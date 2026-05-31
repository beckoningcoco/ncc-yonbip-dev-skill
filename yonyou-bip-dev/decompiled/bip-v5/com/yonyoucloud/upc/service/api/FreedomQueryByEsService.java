/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.MerchantAPIUtils
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.service.elasticsearch.ElasticsearchManager
 *  com.yonyou.iuap.apdoc.coredoc.service.elasticsearch.ElasticsearchManager$MultiConditionalVOForES
 *  com.yonyou.iuap.yms.search.delegate.YmsSearchClientSessionHolder
 *  com.yonyou.ucf.mdd.common.model.Pager
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.workbench.dto.LangEnum
 *  com.yonyoucloud.iuap.upc.api.freedomconditonbyes.IFreedomQueryByEsService
 *  com.yonyoucloud.iuap.upc.api.freedomconditonbyes.freedomquery.FreedomQueryCondition
 *  com.yonyoucloud.iuap.upc.api.freedomconditonbyes.freedomquery.FreedomQueryConditionDetail
 *  com.yonyoucloud.iuap.upc.dto.MerchantDTO
 *  com.yonyoucloud.iuap.upc.dto.ext.UPCPager
 *  com.yonyoucloud.iuap.upc.util.OperatorEnum
 *  com.yonyoucloud.upc.utils.MerchantOpenApiUtils
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
import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.MerchantAPIUtils;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.service.elasticsearch.ElasticsearchManager;
import com.yonyou.iuap.yms.search.delegate.YmsSearchClientSessionHolder;
import com.yonyou.ucf.mdd.common.model.Pager;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.workbench.dto.LangEnum;
import com.yonyoucloud.iuap.upc.api.freedomconditonbyes.IFreedomQueryByEsService;
import com.yonyoucloud.iuap.upc.api.freedomconditonbyes.freedomquery.FreedomQueryCondition;
import com.yonyoucloud.iuap.upc.api.freedomconditonbyes.freedomquery.FreedomQueryConditionDetail;
import com.yonyoucloud.iuap.upc.dto.MerchantDTO;
import com.yonyoucloud.iuap.upc.dto.ext.UPCPager;
import com.yonyoucloud.iuap.upc.util.OperatorEnum;
import com.yonyoucloud.upc.utils.MerchantOpenApiUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
public class FreedomQueryByEsService
implements IFreedomQueryByEsService {
    private static final Logger log = LoggerFactory.getLogger(FreedomQueryByEsService.class);
    @Autowired
    private YMSParamConfig ymsParamConfig;
    @Autowired
    private ElasticsearchManager elasticsearchManager;
    public static final int ES_PAGE_SIZE = 5000;
    public static final String MERCHANT_CHARACTER = "merchantCharacter.";
    public static final int GENERAL_QUERY_FIELD_MAX_SIZE = 3;
    public static final int NO_DATA_COUNT = 0;
    public static final String MERCHANT = "merchant";
    public static final String C_NAME = "cName";
    public static final String C_CODE = "cCode";
    public static final String ES_US_NUMBER = "2";
    public static final String ES_TW_NUMBER = "3";
    public static final int ES_QUERY_FIELD_MAX_SIZE = 5;
    public static final int EXISTENCE_QUERY_CONDITION_LENGTH = 10;
    public static int totalCount = 5000;

    public UPCPager<MerchantDTO> queryMerchantByFreedomConditionPage(FreedomQueryCondition condition) throws Exception {
        Integer pageSize;
        if (condition == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801122);
        }
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((String[])condition.getFields());
        Integer pageIndex = condition.getPageIndex();
        if (pageIndex == null) {
            pageIndex = UpcAPiTool.DEFAULT_PAGE_INDEX;
        }
        if ((pageSize = condition.getPageSize()) == null || pageSize > UpcAPiTool.PAGE_MAX_SIZE) {
            pageSize = UpcAPiTool.PAGE_MAX_SIZE;
        }
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantAPIUtils.merchantAllFieldMapping, (String[])condition.getFields());
        QuerySchema schema = QuerySchema.create().addSelect(qryFields);
        String nameSelect = "name as nameMul";
        String shortnameSelect = "shortname as shortnameMul";
        schema.addSelect(new String[]{nameSelect, shortnameSelect});
        schema.addPager(pageIndex.intValue(), pageSize.intValue());
        schema.pager().setTotalCount(totalCount);
        UPCPager merchantDTOUPCPager = new UPCPager();
        merchantDTOUPCPager.setPageIndex(pageIndex);
        merchantDTOUPCPager.setPageSize(pageSize);
        if (!CollectionUtils.isEmpty((Collection)condition.getQryDTOList())) {
            QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
            QueryConditionGroup esConditionGroup = new QueryConditionGroup();
            List qryDTOList = condition.getQryDTOList();
            boolean esFlag = false;
            for (FreedomQueryConditionDetail qryDTO : qryDTOList) {
                String queryFieldCondition;
                if (qryDTO.getOperatorEnum() == null || qryDTO.getConditionFieldName() == null) continue;
                if (qryDTO.getMerchantCharacterFlag() != null && qryDTO.getMerchantCharacterFlag().booleanValue()) {
                    queryFieldCondition = MERCHANT_CHARACTER + qryDTO.getConditionFieldName();
                } else {
                    if (!MerchantAPIUtils.merchantAllFieldMapping.containsKey(qryDTO.getConditionFieldName())) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801158, new Object[]{qryDTO.getConditionFieldName()});
                    }
                    queryFieldCondition = (String)MerchantAPIUtils.merchantAllFieldMapping.get(qryDTO.getConditionFieldName());
                }
                if (qryDTO.getValue() == null && qryDTO.getValueList() == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801159);
                }
                if (qryDTO.getOperatorEnum() == OperatorEnum.EQ) {
                    queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)queryFieldCondition).eq(qryDTO.getValue()));
                    continue;
                }
                if (qryDTO.getOperatorEnum() == OperatorEnum.NEQ) {
                    queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)queryFieldCondition).not_eq(qryDTO.getValue()));
                    continue;
                }
                if (qryDTO.getOperatorEnum() != OperatorEnum.CONTAIN) continue;
                if (qryDTO.getValueList() == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801159);
                }
                List valueList = qryDTO.getValueList();
                if (valueList.size() > 3) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801160);
                }
                QueryCondition[] conditions = new QueryCondition[qryDTO.getValueList().size()];
                for (int i = 0; i < valueList.size(); ++i) {
                    conditions[i] = QueryCondition.name((String)queryFieldCondition).like(valueList.get(i));
                }
                if ("name".equals(qryDTO.getConditionFieldName()) || "code".equals(qryDTO.getConditionFieldName())) {
                    esFlag = true;
                    esConditionGroup.addCondition((ConditionExpression)QueryConditionGroup.or((ConditionExpression[])conditions));
                    continue;
                }
                queryConditionGroup.addCondition((ConditionExpression)QueryConditionGroup.or((ConditionExpression[])conditions));
            }
            try {
                if (this.ymsParamConfig.getEsReplaceLikeFlag().booleanValue() && esFlag) {
                    List<Long> idList = this.queryByEs(qryDTOList);
                    if (CollectionUtils.isEmpty(idList)) {
                        merchantDTOUPCPager.setRecordCount(Integer.valueOf(0));
                        return merchantDTOUPCPager;
                    }
                    queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").in(idList));
                } else if (esFlag) {
                    queryConditionGroup.addCondition((ConditionExpression)esConditionGroup);
                }
            }
            catch (Exception e) {
                queryConditionGroup.addCondition((ConditionExpression)esConditionGroup);
                log.error("queryMerchantByFreedomConditionPage\u63a5\u53e3ES\u67e5\u8be2\u5f02\u5e38{}", (Object)e.getMessage(), (Object)e);
            }
            schema.addCondition((ConditionExpression)queryConditionGroup);
        }
        BillContext billContext = new BillContext();
        billContext.setI18ndoc(true);
        billContext.setFullname("aa.merchant.Merchant");
        UpcAPiTool.dealNewModelCustomerAreas((String[])condition.getFields(), (QuerySchema)schema, (String)"aa.merchant.Merchant");
        UpcAPiTool.dealNewModelPrincipals((String[])condition.getFields(), (QuerySchema)schema);
        Pager pager = MetaDaoHelper.queryByPage((BillContext)billContext, (QuerySchema)schema);
        if (pager != null) {
            List merchantList = pager.getRecordList();
            if (!CollectionUtils.isEmpty((Collection)pager.getRecordList())) {
                merchantList.forEach(data -> {
                    Map merchant = data;
                    merchant.put("nameMul", MerchantOpenApiUtils.getMultilingualVO((Map)((Map)merchant.get("nameMul"))));
                    merchant.put("shortnameMul", MerchantOpenApiUtils.getMultilingualVO((Map)((Map)merchant.get("shortnameMul"))));
                });
                List merchantDTOS = JSON.parseArray((String)JSON.toJSONString((Object)merchantList), MerchantDTO.class);
                for (int i = 0; i < merchantDTOS.size() && i < merchantList.size(); ++i) {
                    if (((Map)merchantList.get(i)).get("merchantCharacter") == null) continue;
                    ((MerchantDTO)merchantDTOS.get(i)).setMerchantCharacter((HashMap)((Map)merchantList.get(i)).get("merchantCharacter"));
                }
                merchantDTOUPCPager.setRecordList(merchantDTOS);
            }
        }
        return merchantDTOUPCPager;
    }

    private List<Long> queryByEs(List<FreedomQueryConditionDetail> qryDTOList) {
        String esIndex = MERCHANT;
        ElasticsearchManager.MultiConditionalVOForES multiConditionalVOForES = new ElasticsearchManager.MultiConditionalVOForES();
        multiConditionalVOForES.setEsIndex(esIndex);
        multiConditionalVOForES.setValMap(new HashMap());
        for (FreedomQueryConditionDetail qryDTO : qryDTOList) {
            String esField;
            if (!OperatorEnum.CONTAIN.equals((Object)qryDTO.getOperatorEnum())) continue;
            if (qryDTO.getConditionFieldName().equals("name")) {
                esField = C_NAME;
            } else {
                if (!qryDTO.getConditionFieldName().equals("code")) continue;
                esField = C_CODE;
            }
            if (ElasticsearchManager.multiLangFieldMap.containsKey(esIndex + "_" + esField)) {
                if (LangEnum.en_US.getCode().equals(AppContext.getLocale())) {
                    esField = esField + ES_US_NUMBER;
                } else if (LangEnum.zh_TW.getCode().equals(AppContext.getLocale())) {
                    esField = esField + ES_TW_NUMBER;
                } else if (AppContext.getLocale() != null && !LangEnum.zh_CN.getCode().equals(AppContext.getLocale())) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801161);
                }
            }
            if (qryDTO.getValueList() == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801159);
            }
            ArrayList<String> valueList = new ArrayList<String>();
            for (Object o : qryDTO.getValueList()) {
                if (o == null) continue;
                valueList.add(o.toString());
            }
            if (valueList.size() > 5) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801162);
            }
            multiConditionalVOForES.getValMap().put(esField, valueList);
        }
        String dsl = this.elasticsearchManager.buildMultiConditionalDsl(multiConditionalVOForES);
        ArrayList<Long> reFields = new ArrayList<Long>();
        List list = new ArrayList();
        try {
            list = YmsSearchClientSessionHolder.searchClientSession((String)"iuap-apdoc-material-search-client").dslBatchSearch(esIndex, dsl, Map.class);
        }
        catch (Exception e) {
            log.error("\u4f01\u4e1a\u7ee9\u6548\u8c03\u7528\u667a\u80fd\u641c\u7d22ES\u5f02\u5e38" + e.getMessage(), (Throwable)e);
        }
        if (!CollectionUtils.isEmpty(list)) {
            list.stream().forEach(ids -> reFields.add(Long.valueOf(ids.get("id").toString())));
        }
        return reFields;
    }
}


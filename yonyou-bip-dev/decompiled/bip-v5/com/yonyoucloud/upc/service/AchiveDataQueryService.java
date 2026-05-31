/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.alibaba.fastjson.JSONObject
 *  com.yonyou.iuap.apdoc.basedoc.common.beans.ResultPager
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.customerdoc.service.dto.CustDocDTO
 *  com.yonyou.iuap.customerdoc.service.itf.ICustomerDocApiService
 *  com.yonyou.iuap.yms.http.YmsHttpClient
 *  com.yonyou.iuap.yms.http.YmsHttpHeader
 *  com.yonyou.iuap.yms.http.YmsHttpMethod
 *  com.yonyou.iuap.yms.http.YmsHttpRequest
 *  com.yonyou.iuap.yms.http.YmsHttpRequestBuilder
 *  com.yonyou.iuap.yms.http.YmsHttpResponse
 *  com.yonyou.ucf.CharacterDTO
 *  com.yonyou.ucf.CharacterDocValueDTO
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.userdef.dto.enums.DataType
 *  com.yonyoucloud.upc.utils.CollectionUtil
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QueryField
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yonyou.iuap.apdoc.basedoc.common.beans.ResultPager;
import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.customerdoc.service.dto.CustDocDTO;
import com.yonyou.iuap.customerdoc.service.itf.ICustomerDocApiService;
import com.yonyou.iuap.yms.http.YmsHttpClient;
import com.yonyou.iuap.yms.http.YmsHttpHeader;
import com.yonyou.iuap.yms.http.YmsHttpMethod;
import com.yonyou.iuap.yms.http.YmsHttpRequest;
import com.yonyou.iuap.yms.http.YmsHttpRequestBuilder;
import com.yonyou.iuap.yms.http.YmsHttpResponse;
import com.yonyou.ucf.CharacterDTO;
import com.yonyou.ucf.CharacterDocValueDTO;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.userdef.dto.enums.DataType;
import com.yonyoucloud.upc.utils.CollectionUtil;
import java.util.ArrayList;
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
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class AchiveDataQueryService {
    private static final Logger log = LoggerFactory.getLogger(AchiveDataQueryService.class);
    private static final int size = 10000;
    @Autowired
    ICustomerDocApiService iCustomerDocApiService;
    @Autowired
    @Qualifier(value="coredocYmsHttpClient")
    private YmsHttpClient ymsHttpClient;
    @Autowired
    private YMSParamConfig ymsParamConfig;

    public List<CharacterDTO> getCharacterDTOByIds(List<Long> characterIds) throws Exception {
        HashMap<String, String> headers = new HashMap<String, String>();
        headers.put("Content-Type", "application/json");
        headers.put("token", InvocationInfoProxy.getYhtAccessToken());
        headers.put("yht_access_token", InvocationInfoProxy.getYhtAccessToken());
        String characterDomainUrl = this.ymsParamConfig.getDomainIuapMetadataExtend();
        String characterUrl = characterDomainUrl + "/bill/characterquery/simplequerybyids";
        YmsHttpHeader ymsHttpHeader = new YmsHttpHeader();
        ymsHttpHeader.add("Content-Type", "application/json;charset=utf-8");
        YmsHttpRequest request = new YmsHttpRequestBuilder().url(characterUrl).method(YmsHttpMethod.POST).body((Object)JSON.toJSONString(characterIds)).addHeader(ymsHttpHeader.addAllMap(headers)).build();
        String result = "";
        try (YmsHttpResponse ymsHttpResponse = this.ymsHttpClient.execute(request);){
            result = ymsHttpResponse.getBodyString();
        }
        catch (Exception e) {
            log.error("The YmsHttp call 'execute' method failed because of the Exception!", (Throwable)e);
        }
        Map map = (Map)JSONObject.parseObject((String)result, Map.class);
        if (map == null || map.get("code") == null || !"200".equals(map.get("code").toString()) || map.get("data") == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800842);
        }
        Object data = map.get("data");
        List characterDTOList = JSON.parseArray((String)JSON.toJSONString(data), CharacterDTO.class);
        return characterDTOList;
    }

    public CharacterDTO getCharacterDTOById(Long characterId) throws Exception {
        ArrayList<Long> characterIds = new ArrayList<Long>();
        characterIds.add(characterId);
        return this.getCharacterDTOByIds(characterIds).get(0);
    }

    public CharacterDTO getCharacterByIdAndValueIds(Long characterId, List<String> valueIds, Boolean countCheck) throws Exception {
        CharacterDTO characterDTO = this.getCharacterDTOById(characterId);
        String refRetFieldName = characterDTO.getRefRetFieldName();
        String refDocDomain = characterDTO.getRefDocDomain();
        String refDocURI = characterDTO.getRefDocURI();
        characterDTO.getControlType();
        List<Map<String, Object>> characterData = null;
        if (String.valueOf(DataType.CustomizeDocument.getValue()).equals(characterDTO.getCharactorType()) || String.valueOf(DataType.CustomizeDocReferenceList.getValue()).equals(characterDTO.getEnumType())) {
            characterData = this.getCustdocByFullnameAndField(refDocURI, refRetFieldName, valueIds, refDocDomain, countCheck);
        } else if (String.valueOf(DataType.BasicDocument.getValue()).equals(characterDTO.getCharactorType()) || String.valueOf(DataType.BasicDocReferenceList.getValue()).equals(characterDTO.getEnumType())) {
            characterData = this.getBaseDataByFullnameAndField(refDocURI, refRetFieldName, valueIds, refDocDomain, countCheck);
        }
        ArrayList<CharacterDocValueDTO> characterDocValueDTOS = new ArrayList<CharacterDocValueDTO>();
        if (!CollectionUtils.isEmpty(characterData)) {
            for (Map<String, Object> data : characterData) {
                CharacterDocValueDTO characterDocValueDTO = new CharacterDocValueDTO();
                characterDocValueDTO.setId(data.get("id").toString());
                if (null != data.get("code")) {
                    characterDocValueDTO.setCode(data.get("code").toString());
                }
                if (null != data.get(refRetFieldName)) {
                    characterDocValueDTO.setName(data.get(refRetFieldName).toString());
                }
                characterDocValueDTO.setDoc(data);
                characterDocValueDTOS.add(characterDocValueDTO);
            }
        } else {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801633, new Object[]{refDocURI, CollectionUtil.concat((String[])valueIds.toArray(new String[valueIds.size()]), (String)",")});
        }
        characterDTO.setCharactorDocValueDTOList(characterDocValueDTOS);
        return characterDTO;
    }

    public List<Map<String, Object>> getCustDocByCodeAndNames(String custDocDefCode, List<String> names, List<String> codes, List<String> ids) throws Exception {
        CustDocDTO custDocDTO = new CustDocDTO();
        custDocDTO.setCustDocDefCode(custDocDefCode);
        if (!CollectionUtils.isEmpty(names)) {
            custDocDTO.setNames(names);
        }
        if (!CollectionUtils.isEmpty(codes)) {
            custDocDTO.setCodes(codes);
        }
        if (!CollectionUtils.isEmpty(ids)) {
            custDocDTO.setIds(ids);
        }
        custDocDTO.setPageSize(Integer.valueOf(1000));
        ResultPager resultPager = this.iCustomerDocApiService.queryByCondition(custDocDTO);
        List recordList = resultPager.getRecordList();
        return recordList;
    }

    private List<Map<String, Object>> getBaseDataByFullnameAndField(String fullname, String field, List<String> valueIds, String domain, Boolean countCheck) throws Exception {
        QuerySchema schema = QuerySchema.create().addSelect(new QueryField[]{new QueryField("id")}).addSelect(new QueryField[]{new QueryField(field)});
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        if (!CollectionUtils.isEmpty(valueIds)) {
            if (countCheck.booleanValue() && valueIds.size() > 10000) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800843, new Object[]{10000});
            }
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").in(valueIds));
            schema.addCondition((ConditionExpression)queryConditionGroup);
        } else {
            schema.setLimitCount(Integer.valueOf(10000));
        }
        List resultData = MetaDaoHelper.query((String)fullname, (QuerySchema)schema, (String)domain);
        return resultData;
    }

    private List<Map<String, Object>> getCustdocByFullnameAndField(String fullname, String field, List<String> valueIds, String domain, Boolean countCheck) throws Exception {
        QuerySchema schema = QuerySchema.create().addSelect(new QueryField[]{new QueryField("id")}).addSelect(new QueryField[]{new QueryField(field)});
        schema.addSelect(new QueryField[]{new QueryField("sort")});
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        if (!CollectionUtils.isEmpty(valueIds)) {
            if (countCheck.booleanValue() && valueIds.size() > 10000) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800843, new Object[]{10000});
            }
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").in(valueIds));
        } else {
            schema.setLimitCount(Integer.valueOf(10000));
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"dr").eq((Object)0));
        }
        schema.addCondition((ConditionExpression)queryConditionGroup);
        schema.addOrderBy("sort");
        List resultData = MetaDaoHelper.query((String)fullname, (QuerySchema)schema, (String)domain);
        for (Map map : resultData) {
            if (!map.containsKey("sort")) continue;
            map.put("sort", Math.abs(Integer.valueOf(String.valueOf(map.get("sort")))));
        }
        return resultData;
    }
}


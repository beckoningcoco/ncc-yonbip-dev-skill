/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.iuap.apdoc.coredoc.dao.merchant.MerchantQryDao
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.iuap.org.dto.BaseOrgDTO
 *  com.yonyou.iuap.org.dto.ConditionDTO
 *  com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.ResultList
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.utils.json.GsonHelper
 *  com.yonyou.ucf.mdd.ext.api.IBillService
 *  com.yonyou.ucf.mdd.ext.bill.biz.BillBiz
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.upc.aa.merchant.AddressInfo
 *  com.yonyoucloud.upc.aa.merchant.CustomerArea
 *  com.yonyoucloud.upc.aa.merchant.InvoicingCustomers
 *  com.yonyoucloud.upc.aa.merchant.IsTradeCustomers
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRange
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail
 *  com.yonyoucloud.upc.aa.merchant.Payway
 *  com.yonyoucloud.upc.aa.merchant.Principal
 *  com.yonyoucloud.upc.aa.merchant.StopStatusChar
 *  com.yonyoucloud.upc.attrcontrol.DocAttributeControlConfigDTO
 *  com.yonyoucloud.upc.data.merchant.MerchantGroupDao
 *  com.yonyoucloud.upc.service.attrcontrol.DocAttributeControlConfigService
 *  com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil
 *  com.yonyoucloud.upc.utils.MerchantUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.service;

import com.alibaba.fastjson.JSON;
import com.yonyou.iuap.apdoc.coredoc.dao.merchant.MerchantQryDao;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.iuap.org.dto.BaseOrgDTO;
import com.yonyou.iuap.org.dto.ConditionDTO;
import com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.ResultList;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.utils.json.GsonHelper;
import com.yonyou.ucf.mdd.ext.api.IBillService;
import com.yonyou.ucf.mdd.ext.bill.biz.BillBiz;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.iuap.upc.api.service.ApiDto;
import com.yonyoucloud.iuap.upc.api.service.IUPCMerchantInsertService;
import com.yonyoucloud.upc.aa.merchant.AddressInfo;
import com.yonyoucloud.upc.aa.merchant.CustomerArea;
import com.yonyoucloud.upc.aa.merchant.InvoicingCustomers;
import com.yonyoucloud.upc.aa.merchant.IsTradeCustomers;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRange;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail;
import com.yonyoucloud.upc.aa.merchant.Payway;
import com.yonyoucloud.upc.aa.merchant.Principal;
import com.yonyoucloud.upc.aa.merchant.StopStatusChar;
import com.yonyoucloud.upc.attrcontrol.DocAttributeControlConfigDTO;
import com.yonyoucloud.upc.data.merchant.MerchantGroupDao;
import com.yonyoucloud.upc.service.MerchantService;
import com.yonyoucloud.upc.service.attrcontrol.DocAttributeControlConfigService;
import com.yonyoucloud.upc.service.merchantapplyrangegroup.MerchantGroupService;
import com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil;
import com.yonyoucloud.upc.utils.MerchantUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

@Service
public class UPCMerchantInsertService
implements IUPCMerchantInsertService {
    private static final Logger log = LoggerFactory.getLogger(UPCMerchantInsertService.class);
    @Autowired
    @Qualifier(value="pc.billApiService")
    private IBillService billService;
    @Autowired
    private MerchantGroupService merchantGroupService;
    @Autowired
    PubOptionService pubOptionService;
    @Autowired
    private IOrgUnitQueryService iOrgUnitQueryService;
    @Autowired
    private MerchantService merchantService;
    @Autowired
    private MerchantQryDao merchantDao;
    @Autowired
    private DocAttributeControlConfigService docAttributeControlConfigService;
    @Autowired
    private MerchantGroupDao merchantGroupDao;
    @Autowired
    private PubOptionDataQueryUtil pubOptionDataQueryUtil;
    Logger logger = LoggerFactory.getLogger(UPCMerchantInsertService.class);
    private final String SHIP_REGION_ID = "shipregionId";

    @Override
    public void saveOrUpdate(ApiDto apiDto) throws Exception {
        if (StringUtils.isEmpty((Object)apiDto.getFullname())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800813);
        }
        String fullName = apiDto.getFullname();
        BizObject bizObject = new BizObject();
        Map infoMap = (Map)apiDto.getData();
        bizObject.init(infoMap);
        if (infoMap != null && infoMap.get("id") == null) {
            if (((Boolean)infoMap.get("isDefault")).booleanValue()) {
                QueryConditionGroup queryIdAndYxyUserID = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(infoMap.get("merchantId"))});
                queryIdAndYxyUserID.addCondition((ConditionExpression)QueryCondition.name((String)"isDefault").eq((Object)1));
                QuerySchema schemaId = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)queryIdAndYxyUserID);
                List bizObjectList = MetaDaoHelper.queryObject((String)fullName, (QuerySchema)schemaId, null);
                if (!CollectionUtils.isEmpty((Collection)bizObjectList)) {
                    bizObjectList.forEach(address -> {
                        address.put("isDefault", (Object)false);
                        address.setEntityStatus(EntityStatus.Update);
                    });
                    MetaDaoHelper.update((String)fullName, (List)bizObjectList);
                }
            }
            if (bizObject.getId() == null && bizObject.getEntityStatus() == EntityStatus.Insert) {
                bizObject.setId((Object)IdManager.getInstance().nextId());
            }
            MetaDaoHelper.insert((String)fullName, (BizObject)bizObject);
        } else if (infoMap != null && infoMap.get("id") != null && "Delete".equals(infoMap.get("_status"))) {
            bizObject.setEntityStatus(EntityStatus.Delete);
            MetaDaoHelper.delete((String)fullName, (BizObject)bizObject);
        } else {
            if (infoMap.get("id") == null) {
                return;
            }
            BizObject infos = MetaDaoHelper.findById((String)fullName, (Object)((Long)infoMap.get("id")));
            if (infos == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800962);
            }
            if (((Boolean)infoMap.get("isDefault")).booleanValue()) {
                QueryConditionGroup queryIdAndYxyUserID = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(infos.get("merchantId"))});
                queryIdAndYxyUserID.addCondition((ConditionExpression)QueryCondition.name((String)"isDefault").eq((Object)1));
                QuerySchema schemaId = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)queryIdAndYxyUserID);
                List bizObjectList = MetaDaoHelper.queryObject((String)fullName, (QuerySchema)schemaId, null);
                if (!CollectionUtils.isEmpty((Collection)bizObjectList)) {
                    bizObjectList.forEach(address -> {
                        address.put("isDefault", (Object)false);
                        address.setEntityStatus(EntityStatus.Update);
                    });
                    MetaDaoHelper.update((String)fullName, (List)bizObjectList);
                }
            }
            bizObject.setEntityStatus(EntityStatus.Update);
            MetaDaoHelper.update((String)fullName, (BizObject)bizObject);
        }
    }

    @Override
    public ResultList deleteContacters(ApiDto apiDto) throws Exception {
        Map data = (Map)apiDto.getData();
        if (!data.containsKey("contacters") && !data.containsKey("contacterIds")) {
            return new ResultList();
        }
        List erpList = (List)data.get("contacters");
        List idList = (List)data.get("contacterIds");
        QuerySchema schema = null;
        if (CollectionUtils.isEmpty((Collection)erpList) && CollectionUtils.isEmpty((Collection)idList)) {
            return new ResultList();
        }
        if (!CollectionUtils.isEmpty((Collection)erpList)) {
            schema = QuerySchema.create().addSelect("merchantId,id").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"erpCode").in((Collection)erpList)});
        } else if (!CollectionUtils.isEmpty((Collection)idList)) {
            schema = QuerySchema.create().addSelect("merchantId,id").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"id").in((Collection)idList)});
        }
        List mappings = MetaDaoHelper.query((String)"aa.merchant.Contacter", schema);
        if (CollectionUtils.isEmpty((Collection)mappings)) {
            return new ResultList();
        }
        List merchantIds = mappings.stream().map(m -> (Long)m.get("merchantId")).collect(Collectors.toList());
        schema = QuerySchema.create().addSelect("id,code,name,customerClass,createOrg,merchantAppliedDetail.merchantApplyRangeId,merchantAppliedDetail.professSalesman").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"id").in(merchantIds)}).appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"merchantAppliedDetail.merchantApplyRangeId.isCreator").eq((Object)true)});
        List merchants = MetaDaoHelper.query((String)"aa.merchant.Merchant", (QuerySchema)schema);
        ResultList result = new ResultList();
        result.setCount(merchants.size());
        int successCount = 0;
        int errorCount = 0;
        ArrayList<String> messages = new ArrayList<String>();
        for (Map merchant : merchants) {
            merchant.put("merchantAppliedDetail!merchantApplyRangeId", merchant.remove("merchantAppliedDetail_merchantApplyRangeId"));
            merchant.put("merchantAppliedDetail!professSalesman", merchant.remove("merchantAppliedDetail_professSalesman"));
            merchant.put("belongOrg", merchant.get("createOrg"));
            merchant.put("_status", EntityStatus.Update);
            ArrayList<Map> contacters = new ArrayList<Map>();
            List contacterIds = mappings.stream().filter(m -> ((Long)m.get("merchantId")).equals((Long)merchant.get("id"))).collect(Collectors.toList());
            for (Map contacter : contacterIds) {
                contacter.put("_status", EntityStatus.Delete);
                contacters.add(contacter);
            }
            merchant.put("merchantContacterInfos", contacters);
            try {
                BillDataDto saveDto = new BillDataDto();
                saveDto.setBillnum("aa_merchant");
                saveDto.setData((Object)JSON.toJSONString((Object)merchant));
                RuleExecuteResult saveRet = BillBiz.save((BillDataDto)saveDto);
                result.addInfo(saveRet.getData());
                ++successCount;
            }
            catch (Exception ex) {
                log.warn(String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408090C", (String)"Delete Merchant Contacter Error\u3002MerchantID=%s"), merchant.get("id")), (Throwable)ex);
                String ids = String.join((CharSequence)",", contacterIds.stream().map(m -> m.get("id").toString()).collect(Collectors.toList()));
                messages.add(String.format("%s[%s]:%s", merchant.get("id"), ids, ex.getMessage()));
                ++errorCount;
            }
        }
        result.setFailCount(errorCount);
        result.setSucessCount(successCount);
        result.setMessages(messages);
        return result;
    }

    @Override
    public Map saleSyncMerchantAddress(BillDataDto bill) throws Exception {
        List dataList = (List)bill.getData();
        HashMap<String, Object> messages = new HashMap<String, Object>();
        ArrayList<Object> insertAddressInfoList = new ArrayList<Object>();
        ArrayList<AddressInfo> updateAddressInfoList = new ArrayList<AddressInfo>();
        int update = 0;
        int insert = 0;
        HashSet<String> addressSet = new HashSet<String>();
        if (!CollectionUtils.isEmpty((Collection)dataList)) {
            for (Map data : dataList) {
                Boolean isDefault = false;
                if (data == null || data.isEmpty()) {
                    messages.put("code", "400");
                    messages.put("msg", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408090F", (String)"data{}\u683c\u5f0f\u9519\u8bef\u6216\u8005\u6ca1\u6709data{}\uff01"));
                    return messages;
                }
                if (!data.containsKey("agentId") && !data.containsKey("receiveAddress")) {
                    messages.put("code", "400");
                    messages.put("msg", String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080911", (String)"\u56e0\u4e3a\u5ba2\u6237ID\u548c\u6536\u8d27\u5730\u5740\u4e3a\u5fc5\u4f20\u5b57\u6bb5\u3002\u8bf7\u6b63\u786e\u586b\u5199\u7b2c%d\u6761\u53c2\u6570\u6570\u636e\uff01"), update + insert + 1));
                    return messages;
                }
                if ("".equals(data.get("agentId")) || "".equals(data.get("receiveAddress"))) {
                    messages.put("code", "400");
                    messages.put("msg", String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080911", (String)"\u56e0\u4e3a\u5ba2\u6237ID\u548c\u6536\u8d27\u5730\u5740\u4e3a\u5fc5\u4f20\u5b57\u6bb5\u3002\u8bf7\u6b63\u786e\u586b\u5199\u7b2c%d\u6761\u53c2\u6570\u6570\u636e\uff01"), update + insert + 1));
                    return messages;
                }
                AddressInfo addressInfo = new AddressInfo();
                addressInfo.setMerchantId((Long)data.get("agentId"));
                addressInfo.setAddress((String)data.get("receiveAddress"));
                addressInfo.setZipCode((String)data.get("receiveZipCode"));
                addressInfo.setTelePhone((String)data.get("receiveTelePhone"));
                addressInfo.setMobile((String)data.get("receiveMobile"));
                addressInfo.setReceiver((String)data.get("receiver"));
                addressInfo.setMergerName((String)data.get("receiveAddress"));
                if (data.get("shipregionId") != null) {
                    addressInfo.put("shipregion", data.get("shipregionId"));
                }
                if (data.containsKey("regionCode") && data.get("regionCode") != null) {
                    addressInfo.setRegionCode(data.get("regionCode").toString());
                }
                if ("0".equals(String.valueOf(data.get("stopStatus")))) {
                    addressInfo.setStopStatus(StopStatusChar.unStop);
                } else if ("1".equals(String.valueOf(data.get("stopStatus")))) {
                    addressInfo.setStopStatus(StopStatusChar.stop);
                }
                if (addressSet.contains(addressInfo.getAddress())) continue;
                addressSet.add(addressInfo.getAddress());
                QuerySchema querySchema = QuerySchema.create();
                querySchema.addSelect("id");
                querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(data.get("agentId")), QueryCondition.name((String)"isDefault").eq((Object)1)}));
                log.debug("saleSyncMerchantAddress:id{}", (Object)querySchema);
                List addressInfoList = MetaDaoHelper.query((String)"aa.merchant.AddressInfo", (QuerySchema)querySchema);
                if (!CollectionUtils.isEmpty((Collection)addressInfoList)) {
                    isDefault = true;
                }
                querySchema = QuerySchema.create();
                querySchema.addSelect("id");
                querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(data.get("agentId")), QueryCondition.name((String)"address").eq(data.get("receiveAddress"))}));
                log.debug("saleSyncMerchantAddress:id{}", (Object)querySchema);
                addressInfoList = MetaDaoHelper.query((String)"aa.merchant.AddressInfo", (QuerySchema)querySchema);
                if (!CollectionUtils.isEmpty((Collection)addressInfoList) && addressInfoList.size() == 1) {
                    addressInfo.setId(((Map)addressInfoList.get(0)).get("id"));
                    addressInfo.setEntityStatus(EntityStatus.Update);
                    updateAddressInfoList.add(addressInfo);
                    ++update;
                    continue;
                }
                if (CollectionUtils.isEmpty((Collection)addressInfoList)) {
                    addressInfo.remove("id");
                    if (!isDefault.booleanValue()) {
                        addressInfo.setIsDefault(Boolean.valueOf(true));
                    } else {
                        addressInfo.setIsDefault(Boolean.valueOf(false));
                    }
                    addressInfo.setId((Object)IdManager.getInstance().nextId());
                    addressInfo.setAddressCode(addressInfo.getId().toString());
                    addressInfo.setEntityStatus(EntityStatus.Insert);
                    insertAddressInfoList.add(addressInfo);
                    ++insert;
                    continue;
                }
                messages.put("code", "402");
                messages.put("msg", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408090D", (String)"\u6839\u636e\u5ba2\u6237id\u548c\u8be6\u7ec6\u5730\u5740\u67e5\u8be2\u5230\u591a\u6761\u6570\u636e\uff01"));
                return messages;
            }
            if (!CollectionUtils.isEmpty(updateAddressInfoList)) {
                log.debug(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080910", (String)"saleSyncMerchantAddress:\u5f00\u59cb\u66f4\u65b0\u6570\u636e{}"), (Object)JSON.toJSONString(updateAddressInfoList));
                MetaDaoHelper.update((String)"aa.merchant.AddressInfo", updateAddressInfoList);
                log.debug(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080912", (String)"saleSyncMerchantAddress:\u7ed3\u675f\u66f4\u65b0\u6570\u636e{}"), (Object)"UpdateSaleSyncMerchantAddress");
            }
            if (!CollectionUtils.isEmpty(insertAddressInfoList)) {
                log.debug(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080914", (String)"saleSyncMerchantAddress:\u5f00\u59cb\u65b0\u589e\u6570\u636e{}"), (Object)JSON.toJSONString(insertAddressInfoList));
                MetaDaoHelper.insert((String)"aa.merchant.AddressInfo", insertAddressInfoList);
                log.debug(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080915", (String)"saleSyncMerchantAddress:\u7ed3\u675f\u65b0\u589e\u6570\u636e{}"), (Object)"InsertSaleSyncMerchantAddress");
            }
        } else {
            messages.put("code", "400");
            messages.put("msg", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408090F", (String)"data{}\u683c\u5f0f\u9519\u8bef\u6216\u8005\u6ca1\u6709data{}\uff01"));
            return messages;
        }
        messages.put("code", "200");
        insertAddressInfoList.addAll(updateAddressInfoList);
        messages.put("msg", insertAddressInfoList);
        return messages;
    }

    @Override
    public ResultList merchantBusinessSave(Map map) throws Exception {
        ResultList result = new ResultList();
        HashMap<String, String> msgmap = new HashMap<String, String>();
        List datalist = (List)map.get("data");
        result.setCount(datalist.size());
        int sucessCount = 0;
        int failCount = 0;
        for (Map data : datalist) {
            try {
                MerchantApplyRangeDetail merchantApplyRangeDetail;
                String salResult;
                Long merchantApplyRangeId;
                if (!data.containsKey("merchantId") || data.get("merchantId") == null || StringUtils.isEmpty((Object)data.get("merchantId").toString()) || !data.containsKey("orgId") || data.get("orgId") == null || StringUtils.isEmpty((Object)data.get("orgId").toString())) {
                    throw new CoreDocBusinessException(null, "merchantId or orgId is empty");
                }
                this.checkMerchantBusinessSave(Long.parseLong(data.get("merchantId").toString()));
                HashMap params = new HashMap();
                List merchantApplyRangeDetailList = null;
                MerchantApplyRange merchantApplyRange = new MerchantApplyRange();
                InvoicingCustomers invoicingCustomers = new InvoicingCustomers();
                Principal principal = new Principal();
                CustomerArea customerArea = new CustomerArea();
                QuerySchema querySchema = QuerySchema.create();
                querySchema.addSelect("id");
                querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(data.get("merchantId")), QueryCondition.name((String)"orgId").eq(data.get("orgId")), QueryCondition.name((String)"isPotential").eq((Object)false)}));
                List merchantApplyRangeList = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRange", (QuerySchema)querySchema);
                if (CollectionUtils.isEmpty((Collection)merchantApplyRangeList)) {
                    merchantApplyRange = MerchantUtils.getMerchantApplyRange((Long)Long.parseLong(data.get("merchantId").toString()), (Integer)1, (String)data.get("orgId").toString());
                    merchantApplyRange.setIsApplied(Boolean.valueOf(true));
                    merchantApplyRangeId = (Long)merchantApplyRange.getId();
                } else {
                    merchantApplyRangeId = Long.parseLong(((Map)merchantApplyRangeList.get(0)).get("id").toString());
                    merchantApplyRange.setId((Object)merchantApplyRangeId);
                    merchantApplyRange.setIsApplied(Boolean.valueOf(true));
                    merchantApplyRange.setMerchantId(Long.valueOf(Long.parseLong(data.get("merchantId").toString())));
                    merchantApplyRange.setRangeType(Integer.valueOf(1));
                    merchantApplyRange.setOrgId(data.get("orgId").toString());
                    merchantApplyRange.setEntityStatus(EntityStatus.Update);
                }
                if (!this.pubOptionDataQueryUtil.isCloseMerchantModelDoubleWrite()) {
                    querySchema = QuerySchema.create();
                    querySchema.addSelect("id");
                    querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(data.get("merchantId")), QueryCondition.name((String)"merchantApplyRangeId").eq((Object)merchantApplyRangeId)}));
                    merchantApplyRangeDetailList = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRangeDetail", (QuerySchema)querySchema);
                }
                if (!CollectionUtils.isEmpty(merchantApplyRangeDetailList)) {
                    salResult = "update/MerchantApplyRangeDetail";
                    merchantApplyRangeDetail = this.getMerchantApplyRangeDetail(data, merchantApplyRangeId, false);
                } else {
                    salResult = "insert/MerchantApplyRangeDetail";
                    merchantApplyRangeDetail = this.getMerchantApplyRangeDetail(data, merchantApplyRangeId, true);
                }
                if (data.containsKey("invoicingCustomers")) {
                    querySchema = QuerySchema.create();
                    querySchema.addSelect("id");
                    querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(data.get("merchantId")), QueryCondition.name((String)"merchantApplyRangeId").eq((Object)merchantApplyRangeId), QueryCondition.name((String)"isDefault").eq((Object)true)}));
                    List invoicingCustomersListSql = MetaDaoHelper.query((String)"aa.merchant.InvoicingCustomers", (QuerySchema)querySchema);
                    if (!CollectionUtils.isEmpty((Collection)invoicingCustomersListSql)) {
                        invoicingCustomers = this.getInvoicingCustomers(data, data.get("invoicingCustomers"), merchantApplyRangeId, false, true);
                        invoicingCustomers.setId(((Map)invoicingCustomersListSql.get(0)).get("id"));
                    } else {
                        invoicingCustomers = this.getInvoicingCustomers(data, data.get("invoicingCustomers"), merchantApplyRangeId, true, true);
                    }
                }
                if (data.containsKey("specialManagementDep") || data.containsKey("professSalesman")) {
                    querySchema = QuerySchema.create();
                    querySchema.addSelect("id");
                    querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(data.get("merchantId")), QueryCondition.name((String)"merchantApplyRangeId").eq((Object)merchantApplyRangeId), QueryCondition.name((String)"isDefault").eq((Object)true)}));
                    List principalListSql = MetaDaoHelper.query((String)"aa.merchant.Principal", (QuerySchema)querySchema);
                    if (!CollectionUtils.isEmpty((Collection)principalListSql)) {
                        principal = this.getPrincipal(data, data.get("specialManagementDep"), data.get("professSalesman"), merchantApplyRangeId, false, true);
                        principal.setId(((Map)principalListSql.get(0)).get("id"));
                    } else {
                        principal = this.getPrincipal(data, data.get("specialManagementDep"), data.get("professSalesman"), merchantApplyRangeId, true, true);
                    }
                    if (!StringUtils.isEmpty(data.get("specialManagementDep"))) {
                        merchantApplyRangeDetail.setSpecialManagementDep(data.get("specialManagementDep").toString());
                    } else {
                        merchantApplyRangeDetail.setSpecialManagementDep(null);
                    }
                    if (!StringUtils.isEmpty(data.get("professSalesman"))) {
                        merchantApplyRangeDetail.setProfessSalesman(data.get("professSalesman").toString());
                    } else {
                        merchantApplyRangeDetail.setProfessSalesman(null);
                    }
                }
                if (data.containsKey("customerAreas")) {
                    querySchema = QuerySchema.create();
                    querySchema.addSelect("id");
                    querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(data.get("merchantId")), QueryCondition.name((String)"merchantApplyRangeId").eq((Object)merchantApplyRangeId), QueryCondition.name((String)"isDefault").eq((Object)true)}));
                    List customerAreaListSql = MetaDaoHelper.query((String)"aa.merchant.CustomerArea", (QuerySchema)querySchema);
                    if (!CollectionUtils.isEmpty((Collection)customerAreaListSql)) {
                        customerArea = this.getCustomerArea(data, data.get("customerAreas"), merchantApplyRangeId, false, true);
                        customerArea.setId(((Map)customerAreaListSql.get(0)).get("id"));
                    } else {
                        customerArea = this.getCustomerArea(data, data.get("customerAreas"), merchantApplyRangeId, true, true);
                    }
                    if (!StringUtils.isEmpty(data.get("customerAreas"))) {
                        merchantApplyRangeDetail.setCustomerArea(Long.valueOf(Long.parseLong(data.get("customerAreas").toString())));
                    } else {
                        merchantApplyRangeDetail.setCustomerArea(null);
                    }
                }
                if (!CollectionUtils.isEmpty((Map)merchantApplyRange)) {
                    this.merchantGroupService.setBusinessSaveMerchantApplyRangeGroup(merchantApplyRange, merchantApplyRangeDetail);
                    if (EntityStatus.Insert == merchantApplyRange.getEntityStatus()) {
                        MetaDaoHelper.insert((String)"aa.merchant.MerchantApplyRange", (BizObject)merchantApplyRange);
                    } else {
                        MetaDaoHelper.update((String)"aa.merchant.MerchantApplyRange", (BizObject)merchantApplyRange);
                    }
                }
                if (!CollectionUtils.isEmpty((Map)merchantApplyRangeDetail) && !this.pubOptionDataQueryUtil.isCloseMerchantModelDoubleWrite()) {
                    if (EntityStatus.Insert == merchantApplyRangeDetail.getEntityStatus()) {
                        MetaDaoHelper.insert((String)"aa.merchant.MerchantApplyRangeDetail", (BizObject)merchantApplyRangeDetail);
                    } else {
                        MetaDaoHelper.update((String)"aa.merchant.MerchantApplyRangeDetail", (BizObject)merchantApplyRangeDetail);
                    }
                }
                if (!CollectionUtils.isEmpty((Map)invoicingCustomers)) {
                    if (invoicingCustomers.getInvoicingCustomersId() == null) {
                        if (invoicingCustomers.getEntityStatus() == EntityStatus.Insert) {
                            invoicingCustomers.setEntityStatus(EntityStatus.Delete);
                        } else {
                            invoicingCustomers.setEntityStatus(EntityStatus.Delete);
                            MetaDaoHelper.delete((String)"aa.merchant.InvoicingCustomers", (BizObject)invoicingCustomers);
                        }
                    } else if (EntityStatus.Insert == invoicingCustomers.getEntityStatus()) {
                        MetaDaoHelper.insert((String)"aa.merchant.InvoicingCustomers", (BizObject)invoicingCustomers);
                    } else {
                        MetaDaoHelper.update((String)"aa.merchant.InvoicingCustomers", (BizObject)invoicingCustomers);
                    }
                }
                if (!CollectionUtils.isEmpty((Map)principal)) {
                    if (principal.getSpecialManagementDep() == null && principal.getProfessSalesman() == null) {
                        if (principal.getEntityStatus() == EntityStatus.Insert) {
                            principal.setEntityStatus(EntityStatus.Delete);
                        } else {
                            principal.setEntityStatus(EntityStatus.Delete);
                            MetaDaoHelper.delete((String)"aa.merchant.Principal", (BizObject)principal);
                        }
                    } else if (EntityStatus.Insert == principal.getEntityStatus()) {
                        MetaDaoHelper.insert((String)"aa.merchant.Principal", (BizObject)principal);
                    } else {
                        MetaDaoHelper.update((String)"aa.merchant.Principal", (BizObject)principal);
                    }
                }
                if (!CollectionUtils.isEmpty((Map)customerArea)) {
                    if (customerArea.getSaleAreaId() == null) {
                        if (customerArea.getEntityStatus() == EntityStatus.Insert) {
                            customerArea.setEntityStatus(EntityStatus.Delete);
                        } else {
                            customerArea.setEntityStatus(EntityStatus.Delete);
                            MetaDaoHelper.delete((String)"aa.merchant.CustomerArea", (BizObject)customerArea);
                        }
                    } else if (EntityStatus.Insert == customerArea.getEntityStatus()) {
                        MetaDaoHelper.insert((String)"aa.merchant.CustomerArea", (BizObject)customerArea);
                    } else {
                        MetaDaoHelper.update((String)"aa.merchant.CustomerArea", (BizObject)customerArea);
                    }
                }
                data.put("id", params.get("id"));
                msgmap.put(data.toString(), salResult);
                ++sucessCount;
                result.addInfo((Object)data);
            }
            catch (Exception e) {
                this.logger.error("merchantBusinessSave_error:", (Throwable)e);
                ++failCount;
                String logmsg = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408090E", (String)"\u62a5\u9519\u539f\u56e0\uff1a") + e.getLocalizedMessage() + e.getMessage();
                String resultmsg = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408090E", (String)"\u62a5\u9519\u539f\u56e0\uff1a") + e.getLocalizedMessage();
                msgmap.put(data.toString(), logmsg);
                result.addMessage(this.buildMessage(data, resultmsg));
            }
        }
        result.setSucessCount(sucessCount);
        result.setFailCount(failCount);
        String msgmapStr = GsonHelper.ToJSon(msgmap);
        this.logger.info("\u5ba2\u6237\u6863\u6848\u7ec4\u7ec7\u7ea7\u5b57\u6bb5\u540c\u6b65\u7ed3\u675f\u62a5\u544a:{}", (Object)msgmapStr);
        return result;
    }

    public void checkMerchantBusinessSave(Long merchantId) throws Exception {
        Merchant merchant = this.merchantGroupDao.getMerchantById(merchantId);
        if (merchant == null || merchant.getCreateOrg() == null) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.DATA_IS_NOT_EXISTS);
        }
        DocAttributeControlConfigDTO docAttributeControlConfig = this.docAttributeControlConfigService.queryAttrControlConfigForOrg("aa.merchant.Merchant", merchant.getCreateOrg());
        if (this.merchantGroupService.getIsExistControlType(docAttributeControlConfig)) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_SYNC_BUSINESS_SAVE, new Object[]{merchant.getCode()});
        }
    }

    private MerchantApplyRangeDetail getMerchantApplyRangeDetail(Map data, Long merchantApplyRangeId, boolean insert) {
        MerchantApplyRangeDetail detail = new MerchantApplyRangeDetail();
        detail.set("id", data.get("merchantId"));
        detail.setMerchantApplyRangeId(merchantApplyRangeId);
        if (!StringUtils.isEmpty(data.get("customerLevel"))) {
            detail.setCustomerLevel(Long.valueOf(Long.parseLong(data.get("customerLevel").toString())));
        } else if (data.containsKey("customerLevel")) {
            detail.setCustomerLevel(null);
        }
        if (!StringUtils.isEmpty(data.get("customerType"))) {
            detail.setCustomerType(Long.valueOf(Long.parseLong(data.get("customerType").toString())));
        } else if (data.containsKey("customerType")) {
            detail.setCustomerType(null);
        }
        if (!StringUtils.isEmpty(data.get("deliveryWarehouse"))) {
            detail.setDeliveryWarehouse(Long.valueOf(Long.parseLong(data.get("deliveryWarehouse").toString())));
        } else if (data.containsKey("deliveryWarehouse")) {
            detail.setDeliveryWarehouse(null);
        }
        if (!StringUtils.isEmpty(data.get("transactionCurrency"))) {
            detail.setTransactionCurrency(data.get("transactionCurrency").toString());
        } else if (data.containsKey("transactionCurrency")) {
            detail.setTransactionCurrency(null);
        }
        if (!StringUtils.isEmpty(data.get("taxRate"))) {
            detail.setTaxRate(data.get("taxRate").toString());
        } else if (data.containsKey("taxRate")) {
            detail.setTaxRate(null);
        }
        if (!StringUtils.isEmpty(data.get("creditServiceDay"))) {
            detail.setCreditServiceDay(Integer.valueOf(data.get("creditServiceDay").toString()));
        } else if (data.containsKey("creditServiceDay")) {
            detail.setCreditServiceDay(null);
        }
        if (!StringUtils.isEmpty(data.get("collectionAgreement"))) {
            detail.setCollectionAgreement(Long.valueOf(Long.parseLong(data.get("collectionAgreement").toString())));
        } else if (data.containsKey("collectionAgreement")) {
            detail.setCollectionAgreement(null);
        }
        if (!StringUtils.isEmpty(data.get("settlementMethod"))) {
            detail.setSettlementMethod(Long.valueOf(Long.parseLong(data.get("settlementMethod").toString())));
        } else if (data.containsKey("settlementMethod")) {
            detail.setSettlementMethod(null);
        }
        if (!StringUtils.isEmpty(data.get("shipmentMethod"))) {
            detail.setShipmentMethod(Long.valueOf(Long.parseLong(data.get("shipmentMethod").toString())));
        } else if (data.containsKey("shipmentMethod")) {
            detail.setShipmentMethod(null);
        }
        if (!StringUtils.isEmpty(data.get("exchangeratetype"))) {
            detail.setExchangeratetype((String)data.get("exchangeratetype"));
        } else {
            detail.setExchangeratetype(AppContext.getCurrentUser().getYhtTenantId());
        }
        if (!StringUtils.isEmpty(data.get("payway"))) {
            if (Long.valueOf(data.get("payway").toString()) == (long)Payway.others.getValue()) {
                detail.setPayway(Payway.others);
            } else if (Long.valueOf(data.get("payway").toString()) == (long)Payway.paymentDelivery.getValue()) {
                detail.setPayway(Payway.paymentDelivery);
            }
        } else {
            detail.setPayway(Payway.others);
        }
        if (data.get("signBack") != null) {
            detail.setSignBack((Boolean)data.get("signBack"));
        } else {
            detail.setSignBack(Boolean.valueOf(false));
        }
        if (data.get("stopstatus") != null) {
            detail.setStopstatus(Boolean.valueOf(Boolean.parseBoolean(data.get("stopstatus").toString())));
        }
        detail.setModifier(AppContext.getCurrentUser().getName());
        detail.setCreator(AppContext.getCurrentUser().getName());
        if (insert) {
            detail.setEntityStatus(EntityStatus.Insert);
        } else {
            detail.setEntityStatus(EntityStatus.Update);
        }
        detail.setIsTradeCustomers(IsTradeCustomers.tradeCustomers.getValue());
        return detail;
    }

    private InvoicingCustomers getInvoicingCustomers(Map data, Object invoicingCustomersTo, Long merchantApplyRangeId, boolean insert, boolean isDefault) {
        InvoicingCustomers invoicingCustomers = new InvoicingCustomers();
        invoicingCustomers.setId((Object)IdManager.getInstance().nextId());
        invoicingCustomers.setMerchantId(Long.valueOf(Long.parseLong(data.get("merchantId").toString())));
        invoicingCustomers.setMerchantApplyRangeId(merchantApplyRangeId);
        if (!StringUtils.isEmpty((Object)invoicingCustomersTo)) {
            invoicingCustomers.setInvoicingCustomersId(Long.valueOf(Long.parseLong(invoicingCustomersTo.toString())));
        } else {
            invoicingCustomers.setInvoicingCustomersId(null);
        }
        invoicingCustomers.setIsDefault(Boolean.valueOf(isDefault));
        if (insert) {
            invoicingCustomers.setEntityStatus(EntityStatus.Insert);
        } else {
            invoicingCustomers.setEntityStatus(EntityStatus.Update);
        }
        return invoicingCustomers;
    }

    private Principal getPrincipal(Map data, Object specialManagementDep, Object professSalesman, Long merchantApplyRangeId, boolean insert, boolean isDefault) {
        Principal principal = new Principal();
        principal.setId((Object)IdManager.getInstance().nextId());
        principal.setMerchantId(Long.valueOf(Long.parseLong(data.get("merchantId").toString())));
        principal.setMerchantApplyRangeId(merchantApplyRangeId);
        if (!StringUtils.isEmpty((Object)specialManagementDep)) {
            principal.setSpecialManagementDep(specialManagementDep.toString());
        } else {
            principal.setSpecialManagementDep(null);
        }
        if (!StringUtils.isEmpty((Object)professSalesman)) {
            principal.setProfessSalesman(professSalesman.toString());
        } else {
            principal.setProfessSalesman(null);
        }
        principal.setIsDefault(Boolean.valueOf(isDefault));
        if (insert) {
            principal.setEntityStatus(EntityStatus.Insert);
        } else {
            principal.setEntityStatus(EntityStatus.Update);
        }
        return principal;
    }

    private CustomerArea getCustomerArea(Map data, Object customerAreaTo, Long merchantApplyRangeId, boolean insert, boolean isDefault) {
        CustomerArea customerArea = new CustomerArea();
        customerArea.setId((Object)IdManager.getInstance().nextId());
        customerArea.setMerchantId(Long.valueOf(Long.parseLong(data.get("merchantId").toString())));
        customerArea.setmerchantApplyRangeId(merchantApplyRangeId);
        if (!StringUtils.isEmpty((Object)customerAreaTo)) {
            customerArea.setSaleAreaId(Long.valueOf(customerAreaTo.toString()));
        } else {
            customerArea.setSaleAreaId(null);
        }
        customerArea.setIsDefault(Boolean.valueOf(isDefault));
        if (insert) {
            customerArea.setEntityStatus(EntityStatus.Insert);
        } else {
            customerArea.setEntityStatus(EntityStatus.Update);
        }
        return customerArea;
    }

    private Map<String, Object> buildMessage(Map data, String msg) {
        HashMap<String, Object> message = new HashMap<String, Object>();
        message.putAll(data);
        message.put("message", msg);
        message.put("key", data.get("erpCode"));
        return message;
    }

    @Override
    public ResultList merchantRelationSave(Map map) throws Exception {
        ResultList result = new ResultList();
        if (this.pubOptionService.getOrgGlobalShare("aa.merchant.Merchant").booleanValue()) {
            return result;
        }
        List datalist = (List)map.get("data");
        if (datalist == null || datalist.isEmpty()) {
            result.addMessage(this.buildMessage(map, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1C80F6F4057000B7", (String)"data\u6570\u636e\u4e3a\u7a7a!")));
            return result;
        }
        if (datalist.size() > 300) {
            result.addMessage(this.buildMessage(map, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1C80F6F4057000BA", (String)"\u5206\u9875\u6570\u4e0d\u80fd\u8d85\u8fc7300!")));
            return result;
        }
        result.setCount(datalist.size());
        int successesCount = 0;
        int failCount = 0;
        HashSet<Long> merchantIdSet = new HashSet<Long>();
        HashSet<String> orgIdSet = new HashSet<String>();
        HashMap<String, List<String>> rangeOrgListMap = new HashMap<String, List<String>>();
        ArrayList<Map<String, String>> rangeList = new ArrayList<Map<String, String>>();
        for (Map data : datalist) {
            try {
                if (!data.containsKey("merchantId") || data.get("merchantId") == null || StringUtils.isEmpty((Object)data.get("merchantId").toString()) || !data.containsKey("orgId") || data.get("orgId") == null || StringUtils.isEmpty((Object)data.get("orgId").toString())) {
                    throw new CoreDocBusinessException(null, "merchantId or orgId is empty");
                }
                String merchantId = data.get("merchantId").toString();
                String orgId = data.get("orgId").toString();
                String erpCode = String.valueOf(data.get("erpCode"));
                Map<String, String> range = new HashMap<String, Long>();
                range.put("merchantId", (String)((Object)Long.valueOf(Long.parseLong(merchantId))));
                range.put("orgId", orgId);
                range.put("erpCode", erpCode);
                rangeList.add(range);
                orgIdSet.add(orgId);
                merchantIdSet.add(Long.parseLong(merchantId));
            }
            catch (Exception e) {
                this.logger.error("merchantRelationSave_error:" + e.getMessage(), (Throwable)e);
                ++failCount;
                String resultMsg = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408090E", (String)"\u62a5\u9519\u539f\u56e0\uff1a") + e.getLocalizedMessage();
                result.addMessage(this.buildMessage(data, resultMsg));
            }
        }
        if (CollectionUtils.isEmpty(merchantIdSet) || CollectionUtils.isEmpty(orgIdSet)) {
            result.setSucessCount(successesCount);
            result.setFailCount(datalist.size());
            result.setCount(datalist.size());
            return result;
        }
        List<Long> merchantIdListInDb = this.getMerchantIdInDb(merchantIdSet);
        if (CollectionUtils.isEmpty(merchantIdListInDb)) {
            result.setSucessCount(successesCount);
            result.setFailCount(datalist.size());
            result.setCount(datalist.size());
            result.addMessage(this.buildMessage(map, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1C80F6F4057000B9", (String)"\u5ba2\u6237\u5168\u90e8\u4e0d\u5b58\u5728%s"), merchantIdSet)));
            return result;
        }
        List<String> orgIdListInDb = this.getOrgIdInDb(orgIdSet);
        if (CollectionUtils.isEmpty(orgIdListInDb)) {
            result.setSucessCount(successesCount);
            result.setFailCount(datalist.size());
            result.setCount(datalist.size());
            result.addMessage(this.buildMessage(map, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1C80F6F4057000BB", (String)"\u7ec4\u7ec7\u5168\u90e8\u4e0d\u5b58\u5728%s"), orgIdSet)));
            return result;
        }
        if (!CollectionUtils.isEmpty(rangeList)) {
            Map<String, String> rangeMapInDb = this.getRangeMapInDb(merchantIdListInDb, orgIdListInDb);
            Map<String, MerchantApplyRangeDetail> creatorRangeDetailMapInDb = this.getCreatorRangeDetailMapInDb(merchantIdListInDb);
            if (CollectionUtils.isEmpty(creatorRangeDetailMapInDb)) {
                result.setSucessCount(successesCount);
                result.setFailCount(datalist.size());
                result.setCount(datalist.size());
                result.addMessage(this.buildMessage(map, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1C80F6F4057000B9", (String)"\u5ba2\u6237\u5168\u90e8\u4e0d\u5b58\u5728%s"), merchantIdSet)));
                return result;
            }
            ArrayList<MerchantApplyRange> merchantApplyRangeList = new ArrayList<MerchantApplyRange>();
            ArrayList<MerchantApplyRangeDetail> merchantApplyRangeDetailList = new ArrayList<MerchantApplyRangeDetail>();
            for (Map<String, String> range : rangeList) {
                Long merchantId = (Long)range.get("merchantId");
                String orgId = (String)range.get("orgId");
                if (!merchantIdListInDb.contains(merchantId)) {
                    result.addMessage(this.buildMessage(range, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1C80F6F4057000B6", (String)"\u5ba2\u6237\u4e0d\u5b58\u5728%s"), merchantId)));
                    ++failCount;
                    continue;
                }
                if (!orgIdListInDb.contains(orgId)) {
                    result.addMessage(this.buildMessage(range, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1C80F6F4057000B8", (String)"\u7ec4\u7ec7\u4e0d\u5b58\u5728%s"), orgId)));
                    ++failCount;
                    continue;
                }
                if (!creatorRangeDetailMapInDb.containsKey(merchantId.toString())) {
                    result.addMessage(this.buildMessage(range, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1C80F6F4057000B6", (String)"\u5ba2\u6237\u4e0d\u5b58\u5728%s"), orgIdSet)));
                    ++failCount;
                    continue;
                }
                if (CollectionUtils.isEmpty(rangeMapInDb) || !rangeMapInDb.containsKey(merchantId.toString() + orgId)) {
                    List<String> orgIdList;
                    MerchantApplyRange merchantApplyRange = this.getMerchantApplyRange(merchantId, orgId);
                    MerchantApplyRangeDetail merchantApplyRangeDetail = this.getMerchantApplyRangeDetail(merchantId, (Long)merchantApplyRange.getId(), creatorRangeDetailMapInDb.get(merchantId.toString()));
                    merchantApplyRangeList.add(merchantApplyRange);
                    merchantApplyRangeDetailList.add(merchantApplyRangeDetail);
                    ++successesCount;
                    if (!CollectionUtils.isEmpty((Collection)((Collection)rangeOrgListMap.get(merchantId.toString())))) {
                        orgIdList = (List)rangeOrgListMap.get(merchantId.toString());
                        if (!orgIdList.contains(orgId)) {
                            orgIdList.add(orgId);
                            rangeOrgListMap.put(merchantId.toString(), orgIdList);
                        }
                    } else {
                        orgIdList = new ArrayList<String>();
                        orgIdList.add(orgId);
                        rangeOrgListMap.put(merchantId.toString(), orgIdList);
                    }
                    range.put("id", (String)merchantApplyRange.getId());
                    result.addInfo(range);
                    continue;
                }
                ++successesCount;
                range.put("id", (String)((Object)Long.valueOf(rangeMapInDb.get(merchantId.toString() + orgId))));
                result.addInfo(range);
            }
            if (!CollectionUtils.isEmpty(merchantApplyRangeList)) {
                this.merchantService.setMerchantApplyRangeOrgFunc(merchantApplyRangeList);
                this.merchantDao.insertMerchantApplyRange(merchantApplyRangeList);
                this.merchantDao.insertMerchantApplyRangeDetail(merchantApplyRangeDetailList);
            }
        }
        result.setSucessCount(successesCount);
        result.setFailCount(failCount);
        return result;
    }

    private List<Long> getMerchantIdInDb(Set<Long> merchantIdList) throws Exception {
        ArrayList<Long> merchantIdInDbList = new ArrayList<Long>();
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(merchantIdList)}));
        List merchantInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (QuerySchema)querySchema, null);
        if (!CollectionUtils.isEmpty((Collection)merchantInDbList)) {
            for (Merchant merchant : merchantInDbList) {
                merchantIdInDbList.add((Long)merchant.getId());
            }
            return merchantIdInDbList;
        }
        return null;
    }

    private Map<String, String> getRangeMapInDb(List<Long> merchantIdList, List<String> orgIdList) throws Exception {
        HashMap<String, String> rangeMapInDb = new HashMap<String, String>();
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id,orgId,merchantId");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").in(merchantIdList), QueryCondition.name((String)"orgId").in(orgIdList), QueryCondition.name((String)"isPotential").eq((Object)false)}));
        List merchantApplyRangeInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRange", (QuerySchema)querySchema, null);
        if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeInDbList)) {
            for (MerchantApplyRange rangeInDb : merchantApplyRangeInDbList) {
                rangeMapInDb.put(rangeInDb.getMerchantId().toString() + rangeInDb.getOrgId(), rangeInDb.getId().toString());
            }
            return rangeMapInDb;
        }
        return null;
    }

    private Map<String, MerchantApplyRangeDetail> getCreatorRangeDetailMapInDb(List<Long> merchantIdList) throws Exception {
        HashMap<String, MerchantApplyRangeDetail> rangeDetailMapInDb = new HashMap<String, MerchantApplyRangeDetail>();
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id,searchcode,transactionCurrency,taxRate,deliveryWarehouse,creditServiceDay,collectionAgreement,settlementMethod,shipmentMethod,signBack,customerLevel,exchangeratetype,payway,customerType,orgDefaultAddress,stopstatus,stoptime,creator,createTime,createDate,modifier,modifyDate,modifyTime,isTradeCustomers,layoffId");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(merchantIdList), QueryCondition.name((String)"merchantApplyRangeId.isCreator").eq((Object)true)}));
        List merchantApplyRangeDetailInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRangeDetail", (QuerySchema)querySchema, null);
        if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeDetailInDbList)) {
            for (MerchantApplyRangeDetail rangeDetailInDb : merchantApplyRangeDetailInDbList) {
                rangeDetailMapInDb.put(rangeDetailInDb.get("id").toString(), rangeDetailInDb);
            }
            return rangeDetailMapInDb;
        }
        return null;
    }

    private List<String> getOrgIdInDb(Set<String> orgIdList) throws Exception {
        List funcOrgesByCodeList = this.iOrgUnitQueryService.getByCondition(AppContext.getYhtTenantId().toString(), ConditionDTO.newOrgCondition().andIdIn(new ArrayList<String>(orgIdList)));
        if (!CollectionUtils.isEmpty((Collection)funcOrgesByCodeList)) {
            return funcOrgesByCodeList.stream().map(BaseOrgDTO::getId).collect(Collectors.toList());
        }
        return null;
    }

    private MerchantApplyRange getMerchantApplyRange(Long merchantId, String orgId) {
        MerchantApplyRange range = new MerchantApplyRange();
        range.setId((Object)IdManager.getInstance().nextId());
        range.setMerchantId(merchantId);
        range.setRangeType(Integer.valueOf(1));
        range.setOrgId(orgId);
        range.setIsCreator(Boolean.valueOf(false));
        range.setIsApplied(Boolean.valueOf(false));
        range.setTenant((Long)AppContext.getCurrentUser().getTenant());
        range.setYTenant((String)AppContext.getYTenantId());
        range.setEntityStatus(EntityStatus.Insert);
        return range;
    }

    private MerchantApplyRangeDetail getMerchantApplyRangeDetail(Long merchantId, Long merchantApplyRangeId, MerchantApplyRangeDetail creatorRangeDetail) {
        MerchantApplyRangeDetail rangeDetail = new MerchantApplyRangeDetail();
        rangeDetail.putAll((Map)creatorRangeDetail);
        rangeDetail.set("id", (Object)merchantId);
        rangeDetail.setMerchantApplyRangeId(merchantApplyRangeId);
        rangeDetail.setTenant((Long)AppContext.getCurrentUser().getTenant());
        rangeDetail.setYTenant((String)AppContext.getYTenantId());
        rangeDetail.setEntityStatus(EntityStatus.Insert);
        return rangeDetail;
    }
}


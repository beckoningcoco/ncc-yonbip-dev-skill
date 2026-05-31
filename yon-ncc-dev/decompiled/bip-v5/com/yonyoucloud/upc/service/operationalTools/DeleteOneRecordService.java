/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.fasterxml.jackson.core.JsonProcessingException
 *  com.google.gson.Gson
 *  com.google.gson.reflect.TypeToken
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 *  com.yonyou.cloud.util.IrisDynamicInvokeUtil
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.apdoc.coredoc.utils.ListSplitUtil
 *  com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils
 *  com.yonyou.ucf.mdd.api.interfaces.rpc.IComOperateApi
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.poi.model.ProcessData
 *  com.yonyou.ucf.mdd.ext.util.Toolkit
 *  com.yonyoucloud.iuap.upc.deleteforce.IDeleteForceCallBackService
 *  com.yonyoucloud.iuap.upc.vo.deleteforce.DeleteForceVo
 *  com.yonyoucloud.upc.aa.billdeleteforce.BillDeleteForce
 *  com.yonyoucloud.upc.aa.billdeleteforce.DataStatus
 *  com.yonyoucloud.upc.aa.billdeleteforce.OperateType
 *  com.yonyoucloud.upc.utils.EncryptionUtil
 *  org.imeta.core.model.Property
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
 *  org.springframework.data.redis.core.RedisTemplate
 *  org.springframework.stereotype.Service
 *  org.springframework.transaction.annotation.Transactional
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.operationalTools;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyou.cloud.util.IrisDynamicInvokeUtil;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.apdoc.coredoc.utils.ListSplitUtil;
import com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils;
import com.yonyou.ucf.mdd.api.interfaces.rpc.IComOperateApi;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.poi.model.ProcessData;
import com.yonyou.ucf.mdd.ext.util.Toolkit;
import com.yonyoucloud.iuap.upc.deleteforce.IDeleteForceCallBackService;
import com.yonyoucloud.iuap.upc.vo.deleteforce.DeleteForceVo;
import com.yonyoucloud.upc.aa.billdeleteforce.BillDeleteForce;
import com.yonyoucloud.upc.aa.billdeleteforce.DataStatus;
import com.yonyoucloud.upc.aa.billdeleteforce.OperateType;
import com.yonyoucloud.upc.service.operationalTools.BillDeleteForceConfig;
import com.yonyoucloud.upc.service.operationalTools.DeleteToolDto;
import com.yonyoucloud.upc.service.operationalTools.TreeNode;
import com.yonyoucloud.upc.utils.EncryptionUtil;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import org.imeta.core.model.Property;
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
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

@Service
@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public class DeleteOneRecordService
implements IDeleteForceCallBackService {
    private static final Logger log = LoggerFactory.getLogger(DeleteOneRecordService.class);
    @Autowired
    RedisTemplate redisTemplate;
    private static final String AES_KEY = "productcenterAES";
    public final String sqlTemplate = " update %s set %s where ytenant_id='%s' and %s in (%s) ; ";

    private List<BizObject> dealDelData(List<Map<String, Object>> needDeleteRecordList, TreeNode node) throws JsonProcessingException {
        ArrayList<BizObject> updateEntityDataList = new ArrayList<BizObject>();
        String cExtProps = node.getCExtProps();
        Map deleteFieldJson = (Map)UpcJacksonUtils.OBJECT_MAPPER.readValue(cExtProps, Map.class);
        needDeleteRecordList.forEach(needDeleteRecord -> {
            Iterator deleteFields = deleteFieldJson.keySet().iterator();
            BizObject needDealData = new BizObject();
            needDealData.init(needDeleteRecord);
            EntityStatus status = EntityStatus.Unchanged;
            while (deleteFields.hasNext()) {
                String deleteField = (String)deleteFields.next();
                String deleteFieldRule = deleteFieldJson.get(deleteField).toString();
                if (needDeleteRecord.containsKey(deleteField)) {
                    if (("-" + deleteField).equals(deleteFieldRule) && !needDeleteRecord.get(deleteField).toString().startsWith("-")) {
                        needDealData.put(deleteField, (Object)("-" + needDeleteRecord.get(deleteField)));
                    } else if (deleteField.equals(deleteFieldRule)) {
                        needDealData.put(deleteField, needDeleteRecord.get(deleteField));
                    } else {
                        needDealData.put(deleteField, (Object)deleteFieldRule);
                    }
                }
                if ("ytenant".equals(deleteField) || "tenant".equals(deleteField)) continue;
                status = EntityStatus.Update;
            }
            needDealData.put("_status", (Object)status);
            updateEntityDataList.add(needDealData);
        });
        return updateEntityDataList;
    }

    @Transactional(rollbackFor={Throwable.class})
    public synchronized void dealDataOnTree(TreeNode rootNode, Map deleteData, String redisPrefix, DeleteToolDto deleteToolDto, List<BillDeleteForce> records, StringBuilder needDeleteSQL) throws Exception {
        HashSet<String> keysForRedis = new HashSet<String>();
        String domain = deleteToolDto.getDomain();
        try {
            deleteToolDto.SQLForOneRecord = new StringBuilder();
            boolean rootHasData = this.updateDataOnRootNode(rootNode, deleteData, redisPrefix, deleteToolDto, domain, keysForRedis);
            if (!rootHasData) {
                return;
            }
            this.updateChildrensData(rootNode, redisPrefix, domain, keysForRedis, deleteToolDto);
            this.insertRecordsByConf(rootNode, deleteData, deleteToolDto, records, keysForRedis);
            needDeleteSQL.append((CharSequence)deleteToolDto.SQLForOneRecord);
            deleteToolDto.resultList.incSucessCount();
        }
        catch (Exception e) {
            this.insertErrorRecordsByConf(rootNode, deleteData, deleteToolDto, records, e.toString());
            deleteToolDto.resultList.incFailCount();
            deleteToolDto.resultList.addInfo((Object)e.getMessage());
            deleteToolDto.resultList.addErrorMessage(e.getMessage());
            deleteToolDto.resultList.addFailInfo((Object)e.getMessage());
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801052, new Object[]{e.getMessage()});
        }
        finally {
            String percent = Toolkit.getPrecentValue((int)deleteToolDto.resultList.getCount(), (int)(deleteToolDto.resultList.getSucessCount() + deleteToolDto.resultList.getFailCount()));
            ProcessData.builder((int)1, (int)200, (Object)deleteToolDto.resultList, null).percentage(percent).build(deleteToolDto.getAsyncKey(), Integer.valueOf(deleteToolDto.getExpireTime()));
            this.redisTemplate.delete(keysForRedis);
        }
    }

    private void updateChildrensData(TreeNode rootNode, String redisPrefix, String domain, HashSet<String> keysForRedis, DeleteToolDto deleteToolDto) throws Exception {
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        if (rootNode.getChildNodes() != null) {
            for (TreeNode node : rootNode.getChildNodes()) {
                queue.offer(node);
            }
            while (!queue.isEmpty()) {
                TreeNode nodeChildren = (TreeNode)queue.poll();
                this.dealDataForOneNode(nodeChildren, redisPrefix, domain, keysForRedis, deleteToolDto);
                if (nodeChildren.getChildNodes() == null) continue;
                for (TreeNode treeNode : nodeChildren.getChildNodes()) {
                    queue.offer(treeNode);
                }
            }
        }
    }

    private boolean updateDataOnRootNode(TreeNode rootNode, Map deleteData, String redisPrefix, DeleteToolDto deleteToolDto, String domain, HashSet<String> keysForRedis) throws Exception {
        QueryConditionGroup conditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)deleteToolDto.getAnalyzeKey()).eq((Object)deleteData.get(deleteToolDto.getAnalyzeKey()).toString())});
        ArrayList<String> strings = new ArrayList<String>(Arrays.asList(rootNode.getSelectFields()));
        if (!strings.contains(deleteToolDto.getAnalyzeKey())) {
            strings.add(deleteToolDto.getAnalyzeKey());
        }
        QuerySchema querySchema = QuerySchema.create().addSelect(strings.toArray(new String[strings.size()])).addCondition((ConditionExpression)conditionGroup);
        List needDeleteRecordList = "productcenter".equals(domain) ? MetaDaoHelper.query((String)rootNode.getFullname(), (QuerySchema)querySchema) : MetaDaoHelper.query((String)rootNode.getFullname(), (QuerySchema)querySchema, (String)domain);
        if (needDeleteRecordList == null || needDeleteRecordList.size() == 0) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801053, new Object[]{deleteToolDto.getAnalyzeKey(), deleteData.get(deleteToolDto.getAnalyzeKey())});
        }
        if (((Map)needDeleteRecordList.get(0)).get("id") != null) {
            deleteData.put("id", ((Map)needDeleteRecordList.get(0)).get("id"));
        }
        this.redisTemplate.opsForList().leftPushAll((Object)(redisPrefix + rootNode.getFullname()), (Collection)needDeleteRecordList);
        keysForRedis.add(redisPrefix + rootNode.getFullname());
        this.redisTemplate.expire((Object)(redisPrefix + rootNode.getFullname()), 1L, TimeUnit.HOURS);
        List<BizObject> updateEntityDataList = this.dealDelData(needDeleteRecordList, rootNode);
        List<BizObject> updateYtenantDate = this.dealDelData(needDeleteRecordList, rootNode);
        boolean updateDateOnMetaDaoHelper = false;
        if (updateEntityDataList != null && updateEntityDataList.size() > 0 && !updateEntityDataList.get(0).get("_status").equals(EntityStatus.Unchanged)) {
            if ("productcenter".equals(domain)) {
                MetaDaoHelper.update((String)rootNode.getFullname(), updateEntityDataList, null);
            } else {
                MetaDaoHelper.update((String)rootNode.getFullname(), updateEntityDataList, (String)domain);
            }
            updateDateOnMetaDaoHelper = true;
        }
        if (updateYtenantDate.size() > 0 && (updateYtenantDate.get(0).containsKey((Object)"ytenant") || updateYtenantDate.get(0).containsKey((Object)"tenant")) && updateDateOnMetaDaoHelper) {
            this.updateDateFromSql(updateYtenantDate, domain, rootNode);
        } else if (!updateDateOnMetaDaoHelper) {
            this.generateSqlForYtenant(updateYtenantDate, domain, rootNode, deleteToolDto);
        }
        return true;
    }

    private void insertRecordsByConf(TreeNode rootNode, Map deleteData, DeleteToolDto deleteToolDto, List<BillDeleteForce> records, HashSet<String> keysForRedis) throws Exception {
        List<BillDeleteForceConfig> confgList = this.getConfgList(deleteToolDto.getRootFullName());
        BizObject bizObject = new BizObject(deleteData);
        String jsonString = JSON.toJSONString((Object)bizObject);
        BillDeleteForce bdf = new BillDeleteForce();
        bdf.setId((Object)IdManager.getInstance().nextId());
        bdf.setBatchcode(deleteToolDto.getBatchDealCode() == null ? null : deleteToolDto.getBatchDealCode());
        bdf.setBillname(deleteToolDto.getBillName() == null ? null : deleteToolDto.getBillName());
        bdf.setFullname(rootNode.getFullname());
        bdf.setTablename(rootNode.getTableName());
        bdf.setDomain(confgList.get(0).getDomain());
        bdf.setDatacode((String)bizObject.get("code"));
        bdf.setDataname((String)bizObject.get("name"));
        bdf.setOptype(OperateType.Delete);
        bdf.setDatastatus(DataStatus.Deleted);
        bdf.setDatajson(jsonString);
        bdf.setTenant(Long.valueOf(deleteToolDto.getSourceTenantId() == null ? (String)AppContext.getTenantId() : deleteToolDto.getSourceTenantId()));
        bdf.setYtenant(deleteToolDto.getSourceYTenantId());
        bdf.setYhttenant((String)AppContext.getYTenantId());
        bdf.setCreator(deleteToolDto.getSourceUserName());
        bdf.put("creatorId", (Object)deleteToolDto.getSourceUserId());
        Date createDate = new Date();
        bdf.setCreateTime(createDate);
        bdf.setCreateDate(createDate);
        String resumptionData = "";
        try {
            String[] split;
            for (String updateSQL : split = deleteToolDto.SQLForOneRecord.toString().split(";")) {
                int whereIndex = this.findWhereIndex(updateSQL);
                String beforeWhere = updateSQL.substring(0, whereIndex);
                String afterWhere = updateSQL.substring(whereIndex);
                beforeWhere = beforeWhere.replace("-", "");
                afterWhere = afterWhere.replace(deleteToolDto.targetYTenantId, "-" + deleteToolDto.targetYTenantId);
                resumptionData = resumptionData + beforeWhere + afterWhere + ";";
            }
        }
        catch (Exception e) {
            log.error("\u62fc\u63a5\u6062\u590d\u6570\u636e\u6240\u9700\u8981\u7684SQL\u5931\u8d25", (Throwable)e);
        }
        bdf.setResumptionData(EncryptionUtil.AESEncryptKeyWithNoDeal((String)resumptionData, (String)AES_KEY));
        if (deleteData.get("id") != null) {
            bdf.setDataid(deleteData.get("id").toString());
        }
        bdf.setEntityStatus(EntityStatus.Insert);
        records.add(bdf);
    }

    private int findWhereIndex(String sql) {
        char[] chars = sql.toCharArray();
        for (int i = 0; i <= chars.length - 5; ++i) {
            if (!this.equalsIgnoreCase(chars[i], 'w') || !this.equalsIgnoreCase(chars[i + 1], 'h') || !this.equalsIgnoreCase(chars[i + 2], 'e') || !this.equalsIgnoreCase(chars[i + 3], 'r') || !this.equalsIgnoreCase(chars[i + 4], 'e')) continue;
            return i;
        }
        return -1;
    }

    private boolean equalsIgnoreCase(char c1, char c2) {
        return Character.toLowerCase(c1) == Character.toLowerCase(c2);
    }

    private void insertErrorRecordsByConf(TreeNode rootNode, Map deleteData, DeleteToolDto deleteToolDto, List<BillDeleteForce> records, String errorMessage) throws Exception {
        List<BillDeleteForceConfig> confgList = this.getConfgList(deleteToolDto.getRootFullName());
        BizObject bizObject = new BizObject(deleteData);
        String jsonString = JSON.toJSONString((Object)bizObject);
        BillDeleteForce bdf = new BillDeleteForce();
        bdf.setId((Object)IdManager.getInstance().nextId());
        bdf.setBatchcode(deleteToolDto.getBatchDealCode() == null ? null : deleteToolDto.getBatchDealCode());
        bdf.setBillname(deleteToolDto.getBillName() == null ? null : deleteToolDto.getBillName());
        bdf.setFullname(rootNode.getFullname());
        bdf.setTablename(rootNode.getTableName());
        bdf.setDomain(confgList.get(0).getDomain());
        bdf.setDatacode((String)bizObject.get("code"));
        bdf.setDataname((String)bizObject.get("name"));
        bdf.setOptype(OperateType.Delete);
        bdf.setDatastatus(DataStatus.DeleteFail);
        bdf.setDatajson(jsonString);
        bdf.setTenant(Long.valueOf(deleteToolDto.getSourceTenantId() == null ? (String)AppContext.getTenantId() : deleteToolDto.getSourceTenantId()));
        bdf.setYtenant(deleteToolDto.getSourceYTenantId());
        bdf.setYhttenant((String)AppContext.getYTenantId());
        bdf.setCreator(deleteToolDto.getSourceUserName());
        bdf.put("creatorId", (Object)deleteToolDto.getSourceUserId());
        bdf.setErrorinfo(errorMessage);
        Date createDate = new Date();
        bdf.setCreateTime(createDate);
        bdf.setCreateDate(createDate);
        if (deleteData.get("id") != null) {
            bdf.setDataid(deleteData.get("id").toString());
        }
        bdf.setEntityStatus(EntityStatus.Insert);
        records.add(bdf);
    }

    private StringBuilder createResumptionSQL(TreeNode rootNode, List<BillDeleteForceConfig> confgList, BillDeleteForce bdf, HashSet<String> keysForRedis) throws JsonProcessingException {
        StringBuilder stringBuilder = new StringBuilder();
        for (String key : keysForRedis) {
            List mapList = this.redisTemplate.opsForList().range((Object)key, 0L, -1L);
            if (mapList == null || mapList.size() == 0) continue;
            String fullname = key.substring(19, key.length());
            List collect = confgList.stream().filter(s -> s.getFullname().equals(fullname)).collect(Collectors.toList());
            String tablename = ((BillDeleteForceConfig)((Object)collect.get(0))).getTablename();
            String cExtProps = ((BillDeleteForceConfig)((Object)collect.get(0))).getCExtProps();
            String fieldMapping = ((BillDeleteForceConfig)((Object)collect.get(0))).getFieldMapping();
            Map jsonObjectFieldMap = (Map)UpcJacksonUtils.OBJECT_MAPPER.readValue(fieldMapping, Map.class);
            Iterator keysFieldMap = jsonObjectFieldMap.keySet().iterator();
            HashMap<String, String> mapping = new HashMap<String, String>();
            while (keysFieldMap.hasNext()) {
                String keyJson = (String)keysFieldMap.next();
                mapping.put(keyJson, jsonObjectFieldMap.get(keyJson).toString());
            }
            Map jsonObject = (Map)UpcJacksonUtils.OBJECT_MAPPER.readValue(fieldMapping, Map.class);
            Iterator keys = jsonObject.keySet().iterator();
            HashSet<String> setField = new HashSet<String>();
            while (keys.hasNext()) {
                String value;
                String keyExt = (String)keys.next();
                if (keyExt.equals(value = jsonObject.get(keyExt).toString())) continue;
                setField.add(keyExt);
            }
            if (rootNode != null && bdf != null && fullname.equals(rootNode.getFullname())) {
                bdf.setDataid(((Map)mapList.get(0)).get("id").toString());
            }
            String id = "";
            String settext = "";
            int i = 0;
            String ytenantId = ((Map)mapList.get(0)).get("ytenant").toString();
            for (Map map : mapList) {
                for (Map.Entry entryOne : map.entrySet()) {
                    String key1 = (String)entryOne.getKey();
                    Object value = entryOne.getValue();
                    if ("id".equals(key1)) {
                        id = id + value.toString() + ",";
                        continue;
                    }
                    if (!setField.contains(key1) || i != 0) continue;
                    if (BooleanUtil.isTrue(value) || BooleanUtil.isFalse(value)) {
                        settext = settext + (String)mapping.get(key1) + "=" + value.toString() + ",";
                        continue;
                    }
                    settext = settext + (String)mapping.get(key1) + "='" + value.toString() + "',";
                }
                ++i;
            }
            stringBuilder.append(String.format(" update %s set %s where ytenant_id='%s' and %s in (%s) ; ", tablename, settext.substring(0, settext.length() - 1), "-" + ytenantId, id.substring(0, id.length() - 1)));
        }
        return stringBuilder;
    }

    private void updateDateFromSql(List<BizObject> updateYtenantDate, String domain, TreeNode node) throws Exception {
        StringBuilder stringBuilder = new StringBuilder();
        String setString = "";
        String ytenantId = updateYtenantDate.get(0).get("ytenant").toString();
        String tenantId = updateYtenantDate.get(0).get("tenant").toString();
        for (BizObject updateEntityData : updateYtenantDate) {
            if (!updateEntityData.containsKey((Object)"id")) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801054);
            }
            stringBuilder.append(updateEntityData.get("id").toString() + ",");
            if (setString != "") continue;
            if (updateEntityData.containsKey((Object)"ytenant")) {
                setString = setString + "ytenant_id='" + ytenantId + "',";
            }
            if (updateEntityData.containsKey((Object)"tenant")) {
                setString = setString + "tenant_id='" + tenantId + "',";
            }
            setString = setString.substring(0, setString.length() - 1);
        }
        stringBuilder = new StringBuilder(stringBuilder.substring(0, stringBuilder.length() - 1));
        String sqlString = String.format(" update %s set %s where ytenant_id='%s' and %s in (%s) ; ", node.getTableName(), setString, ytenantId, stringBuilder);
        int num = this.excuteSqlByMeta(domain, sqlString);
        log.error(String.format("\u66f4\u6539\u4e86\u79df\u6237\u6570\u636e\u4e2d\u7684\u9694\u79bb\u5c5e\u6027\uff0c\u66f4\u6539SQL\uff1a \u3010%s\u3011,\u6570\u636e\u6761\u6570\u3010%s\u3011", String.format(" update %s set %s where ytenant_id='%s' and %s in (%s) ; ", node.getTableName(), setString, ytenantId, stringBuilder), num));
    }

    public int excuteSqlByMeta(String domain, String sqlString) throws Exception {
        HashMap<String, String> params = new HashMap<String, String>(4);
        if (!"productcenter".equals(domain)) {
            params.put("domain", domain);
        }
        int num = 0;
        params.put("sql", sqlString);
        if ("productcenter".equals(domain)) {
            num = SqlHelper.update((String)"com.yonyou.ucf.mdd.ext.meta.dao.update", params);
        } else {
            IComOperateApi comOperateApi = (IComOperateApi)IrisDynamicInvokeUtil.getService((String)domain, (String)"c87e2267-1001-4c70-bb2a-ab41f3b81aa3", null, IComOperateApi.class);
            num = comOperateApi.executeSql("com.yonyou.ucf.mdd.ext.meta.dao.update", params);
        }
        return num;
    }

    private void generateSqlForYtenant(List<BizObject> updateYtenantDate, String domain, TreeNode node, DeleteToolDto deleteToolDto) throws Exception {
        StringBuilder stringBuilder = new StringBuilder();
        String setString = "";
        List updateYtenantDateGroup = ListSplitUtil.splitListByCapacity(updateYtenantDate, (int)999);
        ArrayList<String> idList = new ArrayList<String>();
        for (List updateYtenantDateLimit : updateYtenantDateGroup) {
            for (BizObject ytenantDate : updateYtenantDateLimit) {
                if (!ytenantDate.containsKey((Object)"id")) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801054);
                }
                if (node.isLongIdType()) {
                    stringBuilder.append(ytenantDate.get("id").toString()).append(",");
                    continue;
                }
                stringBuilder.append("'").append(ytenantDate.get("id").toString()).append("'").append(",");
            }
            idList.add(stringBuilder.substring(0, stringBuilder.length() - 1));
        }
        String ytenantId = updateYtenantDate.get(0).get("ytenant").toString();
        String tenantId = updateYtenantDate.get(0).get("tenant").toString();
        for (BizObject updateEntityData : updateYtenantDate) {
            if (setString != "") break;
            if (updateEntityData.containsKey((Object)"ytenant")) {
                setString = setString + "ytenant_id='" + ytenantId + "',";
            }
            if (updateEntityData.containsKey((Object)"tenant")) {
                setString = setString + "tenant_id='" + tenantId + "',";
            }
            setString = setString.substring(0, setString.length() - 1);
        }
        String keyColumnName = "";
        for (Property tenantProperty : node.getEntity().attributes()) {
            boolean key = tenantProperty.isKey();
            if (!key) continue;
            keyColumnName = tenantProperty.columnName();
        }
        for (String idString : idList) {
            deleteToolDto.SQLForOneRecord.append(String.format(" update %s set %s where ytenant_id='%s' and %s in (%s) ; ", node.getTableName(), setString, deleteToolDto.getTargetYTenantId(), keyColumnName, idString));
        }
    }

    private void dealDataForOneNode(TreeNode nodeChildren, String batchDealCode, String domain, HashSet<String> keysForRedis, DeleteToolDto deleteToolDto) throws Exception {
        if (deleteToolDto.SQLForOneRecord.toString().contains(nodeChildren.getTableName())) {
            return;
        }
        List parentNodeData = null;
        if (!this.redisTemplate.hasKey((Object)(batchDealCode + nodeChildren.getParentFullname())).booleanValue()) {
            log.error(String.format("\u5904\u7406\u5b50\u8282\u70b9\u65f6\uff0c\u7236\u8282\u70b9\u5bf9\u5e94\u7684\u8868\u627e\u4e0d\u5230\u6570\u636e\uff0c\u56e0\u4e3a\u8be5\u8282\u70b9\u7684\u6240\u6709\u5b50\u8282\u70b9\u4e0d\u5904\u7406\uff0c\u5b50\u8282\u70b9%s,\u7236\u8282\u70b9%s", nodeChildren.getFullname(), nodeChildren.getParentFullname()));
            return;
        }
        parentNodeData = this.redisTemplate.opsForList().range((Object)(batchDealCode + nodeChildren.getParentFullname()), 0L, -1L);
        if (CollectionUtils.isEmpty(nodeChildren.getChildNodes())) {
            Map FieldMapping = (Map)UpcJacksonUtils.OBJECT_MAPPER.readValue(nodeChildren.getFieldMapping(), Map.class);
            String whereSQL = " where ";
            for (Property tenantProperty : nodeChildren.getEntity().attributes()) {
                FieldMapping.put(tenantProperty.name(), tenantProperty.columnName());
            }
            String externalField = nodeChildren.getExternalField();
            Gson gson = new Gson();
            Type type = new TypeToken<List<Map<String, Object>>>(){}.getType();
            QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
            List list = (List)gson.fromJson(externalField, type);
            String tenant_id = "";
            boolean flag = false;
            for (Map map : list) {
                String parentField = map.get("parentField").toString();
                HashSet parentDatas = new HashSet();
                for (Map mapData : parentNodeData) {
                    if (!mapData.containsKey(parentField)) continue;
                    tenant_id = mapData.get("tenant").toString();
                    parentDatas.add(mapData.get(parentField));
                }
                String join = String.join((CharSequence)"','", ((Object)parentDatas).toString());
                String substring = join.trim().substring(1, join.length() - 1);
                whereSQL = FieldMapping.containsKey(map.get("name").toString()) ? whereSQL + FieldMapping.get(map.get("name").toString()) + " in ('" + substring + "') and " : whereSQL + map.get("name").toString() + " in ('" + substring + "') and ";
                flag = true;
            }
            if (!flag) {
                return;
            }
            whereSQL = whereSQL.substring(0, whereSQL.lastIndexOf("and")) + ";";
            String sql = "update " + nodeChildren.getTableName() + " set ytenant_id='-" + deleteToolDto.getTargetYTenantId() + "',tenant_id=-'" + tenant_id + "'  " + whereSQL;
            deleteToolDto.SQLForOneRecord.append(sql);
        } else {
            String externalField = nodeChildren.getExternalField();
            Gson gson = new Gson();
            Type type = new TypeToken<List<Map<String, Object>>>(){}.getType();
            QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
            List list = (List)gson.fromJson(externalField, type);
            for (Map map : list) {
                String parentField = map.get("parentField").toString();
                HashSet set = new HashSet();
                for (Map mapData : parentNodeData) {
                    if (!mapData.containsKey(parentField)) continue;
                    set.add(mapData.get(parentField));
                }
                queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)map.get("name").toString()).in(set));
            }
            QuerySchema querySchema = QuerySchema.create().addSelect(nodeChildren.getSelectFields()).addCondition((ConditionExpression)queryConditionGroup);
            List queryRes = "productcenter".equals(domain) ? MetaDaoHelper.query((String)nodeChildren.getFullname(), (QuerySchema)querySchema) : MetaDaoHelper.query((String)nodeChildren.getFullname(), (QuerySchema)querySchema, (String)domain);
            if (queryRes == null || queryRes.size() == 0) {
                return;
            }
            this.redisTemplate.opsForList().leftPushAll((Object)(batchDealCode + nodeChildren.getFullname()), (Collection)queryRes);
            keysForRedis.add(batchDealCode + nodeChildren.getFullname());
            this.redisTemplate.expire((Object)(batchDealCode + nodeChildren.getFullname()), 1L, TimeUnit.HOURS);
            List<BizObject> updateDate = this.dealDelData(queryRes, nodeChildren);
            List<BizObject> updateYtenantDate = this.dealDelData(queryRes, nodeChildren);
            boolean isUpdateOnMetaDaoHelper = false;
            if (updateDate != null && updateDate.size() > 0 && !updateDate.get(0).get("_status").equals(EntityStatus.Unchanged)) {
                if ("productcenter".equals(domain)) {
                    MetaDaoHelper.update((String)nodeChildren.getFullname(), updateDate, null);
                } else {
                    MetaDaoHelper.update((String)nodeChildren.getFullname(), updateDate, (String)domain);
                }
                isUpdateOnMetaDaoHelper = true;
            }
            if (updateYtenantDate.size() > 0 && (updateYtenantDate.get(0).containsKey((Object)"ytenant") || updateYtenantDate.get(0).containsKey((Object)"tenant")) && isUpdateOnMetaDaoHelper) {
                this.updateDateFromSql(updateYtenantDate, domain, nodeChildren);
            } else if (!isUpdateOnMetaDaoHelper) {
                this.generateSqlForYtenant(updateYtenantDate, domain, nodeChildren, deleteToolDto);
            }
        }
    }

    private List<BillDeleteForceConfig> getConfgList(String fullName) throws Exception {
        if (this.redisTemplate.hasKey((Object)fullName).booleanValue()) {
            return this.redisTemplate.opsForList().range((Object)fullName, 0L, -1L);
        }
        QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"rootentity").eq((Object)fullName)});
        QuerySchema querySchema = QuerySchema.create().addSelect("*").appendQueryCondition(new ConditionExpression[]{condition});
        querySchema.setPartitionable(false);
        ArrayList<BillDeleteForceConfig> bizObjectsList = new ArrayList<BillDeleteForceConfig>();
        List queryRes = MetaDaoHelper.query((String)"coredoc.pub.BillDeleteForceConfig", (QuerySchema)querySchema, null);
        for (Map quy : queryRes) {
            BillDeleteForceConfig one = new BillDeleteForceConfig();
            one.setAnalyzeKey(quy.get("analyzeKey") != null ? quy.get("analyzeKey").toString() : null);
            one.setDomain(quy.get("domain") != null ? quy.get("domain").toString() : null);
            one.setCExtProps(quy.get("cExtProps") != null ? quy.get("cExtProps").toString() : null);
            one.setFullname(quy.get("fullname") != null ? quy.get("fullname").toString() : null);
            one.setExternalField(quy.get("externalField") != null ? quy.get("externalField").toString() : null);
            one.setParentId(quy.get("parentId") != null ? Long.valueOf(quy.get("parentId").toString()) : null);
            one.setTablename(quy.get("tablename") != null ? quy.get("tablename").toString() : null);
            one.setId(quy.get("id") != null ? quy.get("id").toString() : null);
            one.setRootentity(quy.get("rootentity") != null ? quy.get("rootentity").toString() : null);
            one.setIsMain(quy.get("isMain") != null ? Integer.valueOf(quy.get("isMain").toString()) : null);
            one.setFieldMapping(quy.get("fieldMapping") != null ? quy.get("fieldMapping").toString() : null);
            one.setLongIdType(BooleanUtil.isTrue(quy.get("longIdType")));
            bizObjectsList.add(one);
        }
        this.redisTemplate.opsForList().leftPushAll((Object)fullName, bizObjectsList);
        this.redisTemplate.expire((Object)fullName, 10L, TimeUnit.MINUTES);
        return bizObjectsList;
    }

    public void sendForceDeleteResult(DeleteForceVo deleteForceVo) throws Exception {
        HashMap<String, Object> param;
        if (null == deleteForceVo.getOpType()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801055);
        }
        if (null == deleteForceVo.getBatchcode()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801056);
        }
        if (null == deleteForceVo.getFullname()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801057);
        }
        String fullname = deleteForceVo.getFullname();
        List successCodes = deleteForceVo.getSuccessCodes();
        List deleteForceDataVos = deleteForceVo.getDeleteForceDataVos();
        if (!CollectionUtils.isEmpty((Collection)successCodes)) {
            param = new HashMap<String, Object>();
            param.put("fullname", fullname);
            param.put("yTenantId", AppContext.getYhtTenantId());
            param.put("batchcode", deleteForceVo.getBatchcode());
            if (deleteForceVo.getOpType().equals(OperateType.Delete.getValue())) {
                param.put("dataStatus", DataStatus.Deleted.getValue());
                param.put("opType", OperateType.Delete.getValue());
            }
            if (deleteForceVo.getOpType().equals(OperateType.Repair.getValue())) {
                param.put("dataStatus", DataStatus.Repaired.getValue());
                param.put("opType", OperateType.Repair.getValue());
            }
            param.put("successCodes", successCodes);
            SqlHelper.update((String)"com.yonyoucloud.upc.dao.meta.init.updateSuccessDeleteData", param);
        }
        if (!CollectionUtils.isEmpty((Collection)deleteForceDataVos)) {
            param = new HashMap();
            param.put("fullname", fullname);
            param.put("yTenantId", AppContext.getYhtTenantId());
            param.put("batchcode", deleteForceVo.getBatchcode());
            if (deleteForceVo.getOpType().equals(OperateType.Delete.getValue())) {
                param.put("dataStatus", DataStatus.DeleteFail.getValue());
                param.put("opType", OperateType.Delete.getValue());
            }
            if (deleteForceVo.getOpType().equals(OperateType.Repair.getValue())) {
                param.put("dataStatus", DataStatus.RepaireFail.getValue());
                param.put("opType", OperateType.Repair.getValue());
            }
            param.put("deleteForceDataVos", deleteForceDataVos);
            SqlHelper.update((String)"com.yonyoucloud.upc.dao.meta.init.updateFailDeleteData", param);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.alibaba.fastjson.JSONObject
 *  com.fasterxml.jackson.databind.ObjectMapper
 *  com.google.gson.Gson
 *  com.google.gson.reflect.TypeToken
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 *  com.yonyou.cloud.util.IrisDynamicInvokeUtil
 *  com.yonyou.diwork.ott.exexutors.RobotExecutors
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.apdoc.coredoc.dao.batchModify.PubBatchModifyEntityDao
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.apdoc.coredoc.utils.ListSplitUtil
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.iuap.yms.config.IYmsConfigService
 *  com.yonyou.iuap.yms.config.YmsConfigManager
 *  com.yonyou.iuap.yms.http.YmsHttpClient
 *  com.yonyou.iuap.yms.http.YmsHttpHeader
 *  com.yonyou.iuap.yms.http.YmsHttpMethod
 *  com.yonyou.iuap.yms.http.YmsHttpRequest
 *  com.yonyou.iuap.yms.http.YmsHttpRequestBuilder
 *  com.yonyou.iuap.yms.http.YmsHttpResponse
 *  com.yonyou.iuap.yms.multitenant.UserExecutors
 *  com.yonyou.ucf.mdd.api.interfaces.rpc.IComOperateApi
 *  com.yonyou.ucf.mdd.common.model.ResultList
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.poi.model.ProcessData
 *  com.yonyou.ucf.mdd.ext.util.RedisTool
 *  com.yonyou.upc.utils.excel.bean.CellListOfRow
 *  com.yonyou.upc.utils.excel.util.ExcelType
 *  com.yonyou.upc.utils.excel.util.GridExcel
 *  com.yonyoucloud.iuap.upc.deleteforce.IDeleteForceCallBackService
 *  com.yonyoucloud.iuap.upc.deleteforce.IDeleteForceService
 *  com.yonyoucloud.iuap.upc.vo.deleteforce.DeleteForceVo
 *  com.yonyoucloud.upc.aa.billdeleteforce.BillDeleteForce
 *  com.yonyoucloud.upc.aa.billdeleteforce.BillDeleteForceConf
 *  com.yonyoucloud.upc.aa.billdeleteforce.CallType
 *  com.yonyoucloud.upc.aa.billdeleteforce.DataStatus
 *  com.yonyoucloud.upc.aa.billdeleteforce.OperateType
 *  com.yonyoucloud.upc.coredoc.batchentity.vo.PubBatchModifyEnumValue
 *  com.yonyoucloud.upc.utils.EncryptionUtil
 *  com.yonyoucloud.upc.utils.ExcelFileUtil
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
 *  org.springframework.data.redis.core.RedisTemplate
 *  org.springframework.stereotype.Service
 *  org.springframework.transaction.annotation.Transactional
 *  org.springframework.util.CollectionUtils
 *  org.springframework.web.multipart.MultipartFile
 */
package com.yonyoucloud.upc.service.operationalTools;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyou.cloud.util.IrisDynamicInvokeUtil;
import com.yonyou.diwork.ott.exexutors.RobotExecutors;
import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.apdoc.coredoc.dao.batchModify.PubBatchModifyEntityDao;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.apdoc.coredoc.utils.ListSplitUtil;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.iuap.yms.config.IYmsConfigService;
import com.yonyou.iuap.yms.config.YmsConfigManager;
import com.yonyou.iuap.yms.http.YmsHttpClient;
import com.yonyou.iuap.yms.http.YmsHttpHeader;
import com.yonyou.iuap.yms.http.YmsHttpMethod;
import com.yonyou.iuap.yms.http.YmsHttpRequest;
import com.yonyou.iuap.yms.http.YmsHttpRequestBuilder;
import com.yonyou.iuap.yms.http.YmsHttpResponse;
import com.yonyou.iuap.yms.multitenant.UserExecutors;
import com.yonyou.ucf.mdd.api.interfaces.rpc.IComOperateApi;
import com.yonyou.ucf.mdd.common.model.ResultList;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.poi.model.ProcessData;
import com.yonyou.ucf.mdd.ext.util.RedisTool;
import com.yonyou.upc.utils.excel.bean.CellListOfRow;
import com.yonyou.upc.utils.excel.util.ExcelType;
import com.yonyou.upc.utils.excel.util.GridExcel;
import com.yonyoucloud.iuap.upc.deleteforce.IDeleteForceCallBackService;
import com.yonyoucloud.iuap.upc.deleteforce.IDeleteForceService;
import com.yonyoucloud.iuap.upc.vo.deleteforce.DeleteForceVo;
import com.yonyoucloud.upc.aa.billdeleteforce.BillDeleteForce;
import com.yonyoucloud.upc.aa.billdeleteforce.BillDeleteForceConf;
import com.yonyoucloud.upc.aa.billdeleteforce.CallType;
import com.yonyoucloud.upc.aa.billdeleteforce.DataStatus;
import com.yonyoucloud.upc.aa.billdeleteforce.OperateType;
import com.yonyoucloud.upc.cache.BizCache;
import com.yonyoucloud.upc.coredoc.batchentity.vo.PubBatchModifyEnumValue;
import com.yonyoucloud.upc.service.ProductSkuService;
import com.yonyoucloud.upc.service.UPCBillService;
import com.yonyoucloud.upc.service.operationalTools.BillDeleteForceConfig;
import com.yonyoucloud.upc.service.operationalTools.DeleteOneRecordService;
import com.yonyoucloud.upc.service.operationalTools.DeleteToolDto;
import com.yonyoucloud.upc.service.operationalTools.TreeNode;
import com.yonyoucloud.upc.utils.EncryptionUtil;
import com.yonyoucloud.upc.utils.ExcelFileUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
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
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
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
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.web.multipart.MultipartFile;

@Service
@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public class DeleteForceService
implements IDeleteForceCallBackService {
    private static final Logger log = LoggerFactory.getLogger(DeleteForceService.class);
    @Autowired
    DeleteOneRecordService deleteOneRecordService;
    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    PubBatchModifyEntityDao pubBatchModifyEntityDao;
    @Autowired
    UPCBillService upcBillService;
    @Autowired
    @Qualifier(value="ymsLongTaskExecutorService")
    private ExecutorService ymsLongTaskExecutorService;
    @Autowired
    private ProductSkuService productSkuService;
    @Autowired
    private BizCache cache;
    @Autowired
    @Qualifier(value="coredocYmsHttpClient")
    private YmsHttpClient ymsHttpClient;
    private static final String DELETE_FORCE_PREFIX = "DELETE_FORCE_PREFIX_";
    private static final String AES_KEY = "productcenterAES";
    @Autowired
    private YMSParamConfig ymsParamConfig;

    public String deleteForceInNewThread(MultipartFile file, String fullname, DeleteToolDto deleteToolDto) throws Exception {
        String requestId = UUID.randomUUID().toString();
        String asyncKey = this.initProcessData(deleteToolDto, requestId);
        File excelFile = this.upcBillService.getExcelFile(file);
        String lockKey = "billdeleteforce_" + fullname;
        UserExecutors.executeInDetachedThread((ExecutorService)this.ymsLongTaskExecutorService, () -> {
            if (RedisTool.tryGetLock((String)lockKey, (String)requestId, (int)300)) {
                try {
                    this.billDeleteForce(excelFile, deleteToolDto);
                }
                catch (Exception e) {
                    deleteToolDto.resultList.addInfo((Object)e.getMessage());
                    deleteToolDto.resultList.addErrorMessage(e.getMessage());
                    deleteToolDto.resultList.addFailInfo((Object)e.getMessage());
                    ProcessData.builder((int)1, (int)200, (Object)deleteToolDto.resultList, (String)"\u5f3a\u5220\u5931\u8d25\uff01").percentage("100").successCount(deleteToolDto.resultList.getSucessCount()).failCount(deleteToolDto.resultList.getFailCount()).build(deleteToolDto.getAsyncKey(), Integer.valueOf(deleteToolDto.getExpireTime()));
                    log.error("\u5f3a\u5220\u5931\u8d25\uff1a" + e.getMessage(), (Throwable)e);
                }
                finally {
                    RedisTool.releaseLock((String)lockKey, (String)requestId);
                    excelFile.delete();
                }
            } else {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801058);
            }
        });
        return asyncKey;
    }

    private String initProcessData(DeleteToolDto deleteToolDto, String requestId) {
        String asyncKey = "billdeleteforce_" + AppContext.getCurrentUser().getYTenantId() + requestId;
        deleteToolDto.setAsyncKey(asyncKey);
        int expireTime = 600;
        try {
            String expireTimeConfig = this.ymsParamConfig.getMddExportProcessExpireTime();
            if (null != expireTimeConfig) {
                expireTime = Integer.parseInt(expireTimeConfig);
            }
        }
        catch (Exception var8) {
            log.error("\u83b7\u53d6\u7f13\u5b58\u8d85\u65f6\u65f6\u95f4\u5f02\u5e38\uff0c\u8d70\u9ed8\u8ba4\u914d\u7f6e600\u79d2");
        }
        deleteToolDto.setExpireTime(expireTime);
        ProcessData.builder((int)1, (int)200, null, null).percentage("0").build(deleteToolDto.getAsyncKey(), Integer.valueOf(deleteToolDto.getExpireTime()));
        return asyncKey;
    }

    public void billDeleteForce(File excelFile, DeleteToolDto deleteToolDto) throws Exception {
        List aaFullNameEnum = this.pubBatchModifyEntityDao.getEnumBuEnumType("aa_fullnameenum");
        if (aaFullNameEnum != null) {
            List collect = aaFullNameEnum.stream().filter(s -> deleteToolDto.getRootFullName().equals(s.getEnumCode())).collect(Collectors.toList());
            deleteToolDto.setBillName(((PubBatchModifyEnumValue)collect.get(0)).getEnumName().toString());
        }
        List titles = ExcelFileUtil.fetchExcelTitle((File)excelFile, (int)0, (int)0);
        FileInputStream inForTotal = new FileInputStream(excelFile);
        FileInputStream in = new FileInputStream(excelFile);
        GridExcel.readByEventModel((InputStream)inForTotal, Map.class, (ExcelType)ExcelType.XLSX).window(1000, deleteDatas -> deleteToolDto.resultList.setCount(deleteToolDto.resultList.getCount() + deleteDatas.size())).process(cs -> this.dealExcelData(titles, (CellListOfRow<String>)cs), 2);
        ((InputStream)inForTotal).close();
        GridExcel.readByEventModel((InputStream)in, Map.class, (ExcelType)ExcelType.XLSX).window(1000, deleteDatas -> {
            try {
                this.deleteDatas(deleteToolDto, (List<Map>)deleteDatas);
            }
            catch (Exception e) {
                log.error("\u5f3a\u5220\u5931\u8d25\uff1a" + e.getMessage());
                throw new CoreDocBusinessException(e.getMessage());
            }
        }).process(cs -> this.dealExcelData(titles, (CellListOfRow<String>)cs), 2);
        ((InputStream)in).close();
        ProcessData.builder((int)1, (int)200, (Object)deleteToolDto.resultList, (String)"\u5f3a\u5220\u5b8c\u6210\uff01").percentage("100").successCount(deleteToolDto.resultList.getSucessCount()).failCount(deleteToolDto.resultList.getFailCount()).build(deleteToolDto.getAsyncKey(), Integer.valueOf(deleteToolDto.getExpireTime()));
    }

    private Map<String, Object> dealExcelData(List<String> titles, CellListOfRow<String> cs) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        for (int y = 0; y < cs.size(); ++y) {
            map.put(titles.get(y), cs.get(y));
        }
        return map;
    }

    private void deleteDatas(DeleteToolDto deleteToolDto, List<Map> deleteDatas) {
        ListSplitUtil.processListInGroupsOfFifty(deleteDatas, subList -> RobotExecutors.runAs((String)deleteToolDto.getTargetYTenantId(), () -> {
            try {
                ArrayList<BillDeleteForce> records = new ArrayList<BillDeleteForce>();
                this.deleteHandle((List<Map>)subList, deleteToolDto, (List<BillDeleteForce>)records);
            }
            catch (Exception e) {
                for (Map deleteData : subList) {
                    deleteToolDto.resultList.incFailCount();
                    deleteToolDto.resultList.addInfo((Object)e.getMessage());
                    deleteToolDto.resultList.addErrorMessage(e.getMessage());
                    deleteToolDto.resultList.addFailInfo((Object)e.getMessage());
                }
                log.error("\u5f3a\u5220\u5931\u8d25\uff1a" + e.getMessage());
            }
        }, (ExecutorService)this.ymsLongTaskExecutorService), (int)500);
        ProcessData.builder((int)1, (int)200, (Object)deleteToolDto.resultList, (String)"\u5f3a\u5220\u5b8c\u6210\uff01").percentage("100").successCount(deleteToolDto.resultList.getSucessCount()).failCount(deleteToolDto.resultList.getFailCount()).build(deleteToolDto.getAsyncKey(), Integer.valueOf(deleteToolDto.getExpireTime()));
    }

    private void deleteHandle(List<Map> deleteDatas, DeleteToolDto deleteToolDto, List<BillDeleteForce> records) {
        try {
            String nodeCacheKey = "TreeNode" + deleteToolDto.getRootFullName();
            BillDeleteForceConf billDeleteForceConf = this.getDomainByFullName(deleteToolDto.getRootFullName(), OperateType.Delete.getValue());
            if (null != billDeleteForceConf) {
                deleteDatas.forEach(delData -> {
                    try {
                        this.insertRecordsByRegis((Map)delData, deleteToolDto, records);
                    }
                    catch (Exception e) {
                        throw new CoreDocBusinessException(e.getMessage());
                    }
                });
                this.deleteBillByDomain(billDeleteForceConf, deleteDatas, deleteToolDto.getBatchDealCode());
            } else {
                TreeNode rootNode = this.cache.get(nodeCacheKey, TreeNode.class);
                if (rootNode == null) {
                    List<BillDeleteForceConfig> confgList = this.getConfgList(deleteToolDto.getRootFullName());
                    if (confgList != null && confgList.size() > 0) {
                        BillDeleteForceConfig configMain = this.getConfgMain(confgList);
                        deleteToolDto.setAnalyzeKey(configMain.getAnalyzeKey());
                        deleteToolDto.setDomain(configMain.getDomain());
                        rootNode = this.convertToTree(confgList);
                    } else {
                        deleteToolDto.setAnalyzeKey("code");
                    }
                    this.cache.set(nodeCacheKey, rootNode);
                }
                HashSet<String> analyzeKeyData = new HashSet<String>();
                StringBuilder needDeleteSQL = new StringBuilder();
                for (Map deleteData : deleteDatas) {
                    if (!deleteData.containsKey(deleteToolDto.getAnalyzeKey()) || deleteData.get(deleteToolDto.getAnalyzeKey()) == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801059);
                    }
                    if (analyzeKeyData.contains(deleteData.get(deleteToolDto.getAnalyzeKey()).toString())) continue;
                    analyzeKeyData.add(deleteData.get(deleteToolDto.getAnalyzeKey()).toString());
                    String dealCodeForRedis = String.valueOf(IdManager.getInstance().nextId());
                    try {
                        this.deleteOneRecordService.dealDataOnTree(rootNode, deleteData, dealCodeForRedis, deleteToolDto, records, needDeleteSQL);
                    }
                    catch (Exception e) {
                        log.error("\u5355\u6761\u6570\u636e\u5220\u9664\u5931\u8d25\uff0c\u5931\u8d25\u5bf9\u5e94Excel\u89e3\u6790\u5b57\u6bb5\u4e3a\uff1a" + deleteData.get(deleteToolDto.getAnalyzeKey()).toString() + e.getMessage());
                    }
                }
                if (needDeleteSQL.length() > 0) {
                    this.deleteOneRecordService.excuteSqlByMeta(deleteToolDto.getDomain(), needDeleteSQL.toString());
                }
            }
        }
        catch (Exception e) {
            throw new CoreDocBusinessException(e.getMessage());
        }
        finally {
            if (records.size() > 0) {
                Runnable task = () -> {
                    try {
                        MetaDaoHelper.insertNoPartition((String)"coredoc.pub.BillDeleteForce", (List)records);
                    }
                    catch (Exception e) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801060, new Object[]{e.getMessage()});
                    }
                };
                RobotExecutors.runAs((String)deleteToolDto.getSourceYTenantId(), (Runnable)task);
            }
        }
    }

    private BillDeleteForceConfig getConfgMain(List<BillDeleteForceConfig> confgList) {
        BillDeleteForceConfig conf = null;
        for (BillDeleteForceConfig configONe : confgList) {
            if (configONe.get("isMain") == null || configONe.getIsMain() != 1) continue;
            conf = configONe;
        }
        if (conf == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801061);
        }
        return conf;
    }

    private void insertRecordsByRegis(Map datas, DeleteToolDto deleteToolDto, List<BillDeleteForce> records) throws Exception {
        BizObject bizObject = new BizObject(datas);
        String jsonString = JSON.toJSONString((Object)bizObject);
        BillDeleteForce bdf = new BillDeleteForce();
        bdf.setId((Object)IdManager.getInstance().nextId());
        bdf.setBatchcode(deleteToolDto.getBatchDealCode() == null ? null : deleteToolDto.getBatchDealCode());
        bdf.setBillname(deleteToolDto.getBillName() == null ? null : deleteToolDto.getBillName());
        bdf.setDatacode((String)bizObject.get("code"));
        bdf.setDataname((String)bizObject.get("name"));
        bdf.setOptype(OperateType.Delete);
        bdf.setDatastatus(DataStatus.Deleted);
        bdf.setDatajson(jsonString);
        bdf.setTenant(Long.valueOf(deleteToolDto.getSourceTenantId()));
        bdf.setYtenant(deleteToolDto.getSourceYTenantId());
        bdf.setYhttenant(deleteToolDto.getTargetYTenantId());
        bdf.setCreator(deleteToolDto.getSourceUserName());
        bdf.put("creatorId", (Object)deleteToolDto.getSourceUserId());
        Date createDate = new Date();
        bdf.setCreateTime(createDate);
        bdf.setCreateDate(createDate);
        bdf.setEntityStatus(EntityStatus.Insert);
        records.add(bdf);
    }

    private TreeNode convertToTree(List<BillDeleteForceConfig> confgList) throws Exception {
        TreeNode rootNode = null;
        HashMap<String, TreeNode> map = new HashMap<String, TreeNode>();
        if (confgList != null && confgList.size() > 0) {
            for (BillDeleteForceConfig conf : confgList) {
                if (map.containsKey(conf.getId())) continue;
                TreeNode node = this.createNode(conf);
                map.put((String)conf.getId(), node);
                if (!BooleanUtil.isTrue((Object)conf.getIsMain()) || conf.getParentId() != null) continue;
                rootNode = node;
            }
            for (BillDeleteForceConfig confSecond : confgList) {
                if (confSecond.getParentId() == null) continue;
                TreeNode childNode = (TreeNode)map.get(confSecond.getId());
                TreeNode parentNode = (TreeNode)map.get(confSecond.getParentId().toString());
                childNode.setParentFullname(parentNode.getFullname());
                List<TreeNode> childNodes = parentNode.getChildNodes();
                if (childNodes == null) {
                    childNodes = new ArrayList<TreeNode>();
                    parentNode.setChildNodes(childNodes);
                }
                parentNode.getChildNodes().add(childNode);
            }
        }
        this.findParentFields(rootNode);
        return rootNode;
    }

    private void findParentFields(TreeNode result) {
        if (result == null) {
            return;
        }
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(result);
        while (!queue.isEmpty()) {
            ArrayList<String> stringArrayList;
            TreeNode current = (TreeNode)queue.poll();
            HashSet<String> parentField = new HashSet<String>();
            if (current.getChildNodes() != null) {
                for (TreeNode child : current.getChildNodes()) {
                    String externalField = child.getExternalField();
                    Gson gson = new Gson();
                    Type type = new TypeToken<List<Map<String, Object>>>(){}.getType();
                    List list = (List)gson.fromJson(externalField, type);
                    for (Map map : list) {
                        parentField.add(map.get("parentField").toString());
                    }
                    queue.offer(child);
                }
                ArrayList<String> selectFields = new ArrayList<String>(Arrays.asList(current.getSelectFields()));
                selectFields.addAll(parentField);
                current.setSelectFields(selectFields.toArray(new String[selectFields.size()]));
            }
            if (!(stringArrayList = new ArrayList<String>(Arrays.asList(current.getSelectFields()))).contains("id")) {
                stringArrayList.add("id");
            }
            HashSet<String> setSelect = new HashSet<String>();
            for (String field : stringArrayList) {
                setSelect.add(field);
            }
            current.setSelectFields(setSelect.toArray(new String[setSelect.size()]));
        }
    }

    private TreeNode createNode(BillDeleteForceConfig conf) throws Exception {
        TreeNode node = new TreeNode();
        node.setFullname(conf.getFullname());
        node.setExternalField(conf.getExternalField());
        node.setCExtProps(conf.getCExtProps());
        node.setTableName(conf.getTablename());
        node.setLongIdType(conf.getLongIdType());
        node.setFieldMapping(conf.getFieldMapping());
        String cExtProps = conf.getCExtProps();
        ObjectMapper objectMapper = new ObjectMapper();
        Map jsonObject = (Map)objectMapper.readValue(cExtProps, Map.class);
        Iterator keys = jsonObject.keySet().iterator();
        ArrayList<String> strings = new ArrayList<String>();
        while (keys.hasNext()) {
            strings.add((String)keys.next());
        }
        node.setSelectFields(strings.toArray(new String[strings.size()]));
        return node;
    }

    private List<BillDeleteForceConfig> getConfgList(String fullName) throws Exception {
        String configRedisKey = this.getReidsKey(fullName);
        if (this.redisTemplate.hasKey((Object)configRedisKey).booleanValue()) {
            return this.redisTemplate.opsForList().range((Object)configRedisKey, 0L, -1L);
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
            one.setFieldMapping(quy.get("fieldMapping") != null ? quy.get("fieldMapping").toString() : null);
            one.setFullname(quy.get("fullname") != null ? quy.get("fullname").toString() : null);
            one.setExternalField(quy.get("externalField") != null ? quy.get("externalField").toString() : null);
            one.setParentId(quy.get("parentId") != null ? Long.valueOf(quy.get("parentId").toString()) : null);
            one.setTablename(quy.get("tablename") != null ? quy.get("tablename").toString() : null);
            one.setId(quy.get("id") != null ? quy.get("id").toString() : null);
            one.setRootentity(quy.get("rootentity") != null ? quy.get("rootentity").toString() : null);
            one.setIsMain(quy.get("isMain") != null ? Integer.valueOf(quy.get("isMain").toString()) : null);
            one.setFieldMapping(quy.get("fieldMapping") != null ? quy.get("fieldMapping").toString() : null);
            one.setLongIdType(quy.get("longIdType") != null ? Boolean.valueOf(quy.get("longIdType").toString()) : true);
            bizObjectsList.add(one);
        }
        this.redisTemplate.opsForList().leftPushAll((Object)configRedisKey, bizObjectsList);
        this.redisTemplate.expire((Object)configRedisKey, 10L, TimeUnit.MINUTES);
        return bizObjectsList;
    }

    private String getReidsKey(String fullName) {
        return fullName + (!this.isStaging() ? "" : "_Staging");
    }

    private boolean isStaging() {
        IYmsConfigService iYmsConfigService = YmsConfigManager.getYmsConfigService();
        return "default".equals(iYmsConfigService.getCurrentDimension());
    }

    private void deleteBillByDomain(BillDeleteForceConf billDeleteForceConf, List<Map> datas, String batchcode) throws Exception {
        if (CallType.Rpc == billDeleteForceConf.getCallType()) {
            IDeleteForceService deleteForceService = (IDeleteForceService)IrisDynamicInvokeUtil.getService((String)billDeleteForceConf.getDomain(), (String)"c87e2267-1001-4c70-bb2a-ab41f3b81aa3", null, IDeleteForceService.class);
            deleteForceService.batchDeleteBill(billDeleteForceConf.getFullname(), Short.valueOf(OperateType.Delete.getValue()), datas, batchcode);
        }
        if (CallType.Rest == billDeleteForceConf.getCallType()) {
            HashMap<String, Object> params = new HashMap<String, Object>();
            params.put("fullname", billDeleteForceConf.getFullname());
            params.put("datas", datas);
            params.put("opType", OperateType.Delete.getValue());
            params.put("batchcode", batchcode);
            HashMap<String, String> headers = new HashMap<String, String>();
            headers.put("Content-Type", "application/json");
            headers.put("token", InvocationInfoProxy.getYhtAccessToken());
            headers.put("yht_access_token", InvocationInfoProxy.getYhtAccessToken());
            String url = AppContext.getEnvConfig((String)billDeleteForceConf.getDomainKey()) + billDeleteForceConf.getUri();
            YmsHttpHeader ymsHttpHeader = new YmsHttpHeader();
            ymsHttpHeader.add("Content-Type", "application/json;charset=utf-8");
            String result = "";
            YmsHttpRequest request = new YmsHttpRequestBuilder().url(url).method(YmsHttpMethod.POST).body((Object)JSON.toJSONString(params)).addHeader(ymsHttpHeader.addAllMap(headers)).build();
            try (YmsHttpResponse ymsHttpResponse = this.ymsHttpClient.execute(request);){
                result = ymsHttpResponse.getBodyString();
            }
            catch (Exception e) {
                log.error("deleteBillByDomain Exception!", (Throwable)e);
            }
            Map resultMap = (Map)JSONObject.parseObject((String)result, Map.class);
            Object status = resultMap.get("code");
            if (status == null || "200".equals(status.toString())) {
                throw new CoreDocBusinessException(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1887C79805B0001A", (String)"\u5f3a\u5236\u5220\u9664\u6570\u636e\u5f02\u5e38\uff1a") + "\u5f3a\u5236\u5220\u9664\u6570\u636e\u5f02\u5e38\uff1a" + JSON.toJSONString((Object)resultMap));
            }
        }
    }

    private BillDeleteForceConf getDomainByFullName(String fullName, short opType) throws Exception {
        String key = DELETE_FORCE_PREFIX + fullName;
        BillDeleteForceConf billDeleteForceConf = this.cache.get(key, BillDeleteForceConf.class);
        if (null == billDeleteForceConf) {
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"fullname").eq((Object)fullName), QueryCondition.name((String)"optype").eq((Object)opType)});
            QuerySchema schema = QuerySchema.create().addSelect("name, domain, callType, domainKey, uri, fullname").addCondition((ConditionExpression)queryConditionGroup);
            List billDeleteForceConfs = this.productSkuService.query("coredoc.pub.BillDeleteForceConf", schema);
            if (!CollectionUtils.isEmpty((Collection)billDeleteForceConfs)) {
                billDeleteForceConf = (BillDeleteForceConf)billDeleteForceConfs.get(0);
                this.cache.set(key, billDeleteForceConf);
            }
        }
        return billDeleteForceConf;
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

    @Transactional(rollbackFor={Throwable.class})
    public ResultList repair(Map<String, Object> map, Object userId, String userName) throws Exception {
        HashSet<String> idSet = new HashSet<String>();
        if (map.get("data") != null) {
            List dataList = (List)map.get("data");
            for (Map map1 : dataList) {
                if (!map1.containsKey("id")) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801062);
                }
                idSet.add(map1.get("id").toString());
            }
        }
        if (idSet.size() == 0) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801063);
        }
        if (idSet.size() > 100) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801064, new Object[]{100});
        }
        HashMap<String, String> domainMap = new HashMap<String, String>();
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(idSet)});
        QuerySchema schema = QuerySchema.create().addSelect("id,datastatus,domain,resumptionData").addCondition((ConditionExpression)queryConditionGroup);
        List queryList = MetaDaoHelper.query((String)"coredoc.pub.BillDeleteForce", (QuerySchema)schema);
        for (Map queryResOne : queryList) {
            if (queryResOne.get("datastatus") == null && !"0".equals(queryResOne.get("datastatus").toString()) || queryResOne.get("domain") == null || queryResOne.get("resumptionData") == null) continue;
            String domain = queryResOne.get("domain").toString();
            String value = "";
            if (!"".equals(domainMap.getOrDefault(domain, ""))) {
                value = (String)domainMap.get(domain);
            }
            value = value + EncryptionUtil.AESDecrypKeyWithNoDeal((String)queryResOne.get("resumptionData").toString(), (String)AES_KEY);
            domainMap.put(domain, value);
        }
        ArrayList updateList = new ArrayList();
        for (Map.Entry entry : domainMap.entrySet()) {
            String domainKey = (String)entry.getKey();
            String valueSql = (String)entry.getValue();
            String valueSqlAfterDeal = this.mergeAndDealSQL(valueSql);
            HashMap<String, String> params = new HashMap<String, String>(2);
            if (!"productcenter".equals(domainKey)) {
                params.put("domain", domainKey);
            }
            params.put("sql", valueSqlAfterDeal);
            int num = 0;
            if ("productcenter".equals(domainKey)) {
                num = SqlHelper.update((String)"com.yonyou.ucf.mdd.ext.meta.dao.update", params);
            } else {
                IComOperateApi comOperateApi = (IComOperateApi)IrisDynamicInvokeUtil.getService((String)"productcenter", (String)"c87e2267-1001-4c70-bb2a-ab41f3b81aa3", null, IComOperateApi.class);
                num = comOperateApi.executeSql("com.yonyou.ucf.mdd.ext.meta.dao.update", params);
            }
            log.error(String.format("\u6267\u884c\u4fee\u590d\u529f\u80fd\uff0c\u5bf9\u5e94SQL\uff1a \u3010%s\u3011,\u6570\u636e\u6761\u6570\u3010%s\u3011", valueSqlAfterDeal, num));
            List collect = queryList.stream().filter(s -> domainKey.equals(s.get("domain"))).map(s -> {
                BizObject bizObject = new BizObject(s);
                bizObject.put("datastatus", (Object)DataStatus.Repaired.getValue());
                bizObject.put("optype", (Object)OperateType.Repair.getValue());
                bizObject.put("modifyTime", (Object)new Date());
                bizObject.put("modifyDate", (Object)new Date());
                bizObject.put("modifier", (Object)userName);
                bizObject.put("_status", (Object)EntityStatus.Update);
                return bizObject;
            }).collect(Collectors.toList());
            updateList.addAll(collect);
        }
        MetaDaoHelper.update((String)"coredoc.pub.BillDeleteForce", updateList);
        return new ResultList();
    }

    private String mergeAndDealSQL(String valueSql) {
        String[] sqlOne = valueSql.split(";");
        HashMap<String, String> mapTempSql = new HashMap<String, String>();
        HashMap<String, List> mapIdAndTableSql = new HashMap<String, List>();
        for (String sql : sqlOne) {
            if (!sql.trim().startsWith("update")) continue;
            int updateIndex = sql.indexOf("update");
            int setIndex = sql.indexOf("set");
            int whereIndex = sql.indexOf("where");
            int idStartIndex = sql.indexOf("(");
            int idEndIndex = sql.indexOf(")");
            String tableName = sql.substring(updateIndex + 6, setIndex).trim();
            String setString = sql.substring(setIndex + 3, whereIndex).trim();
            List<String> idArray = Arrays.asList(sql.substring(idStartIndex + 1, idEndIndex).trim().split(","));
            mapTempSql.put(tableName, setString);
            List idList = mapIdAndTableSql.getOrDefault(tableName, new ArrayList());
            idList.addAll(idArray);
            mapIdAndTableSql.put(tableName, idList);
        }
        StringBuilder valueSqlBuilder = new StringBuilder();
        for (Map.Entry entry : mapIdAndTableSql.entrySet()) {
            String tableName = (String)entry.getKey();
            List idList = (List)entry.getValue();
            String setString = (String)mapTempSql.get(tableName);
            List idListUnderThousandGroup = ListSplitUtil.splitListByCapacity((List)idList, (int)999);
            for (List idListUnderThousand : idListUnderThousandGroup) {
                String idString = String.join((CharSequence)",", idListUnderThousand);
                String sql = String.format(this.deleteOneRecordService.sqlTemplate, tableName, setString, idString);
                valueSqlBuilder.append(sql);
            }
        }
        return String.valueOf(valueSqlBuilder);
    }
}


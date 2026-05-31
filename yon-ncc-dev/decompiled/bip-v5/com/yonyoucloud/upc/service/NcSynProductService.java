/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.hutool.core.collection.CollectionUtil
 *  com.alibaba.fastjson.JSON
 *  com.alibaba.fastjson.JSONObject
 *  com.alibaba.fastjson.serializer.SerializerFeature
 *  com.yonyou.cloud.middleware.rpc.RPCStubBeanFactory
 *  com.yonyou.cloud.utils.StringUtils
 *  com.yonyou.diwork.ott.exexutors.RobotExecutors
 *  com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants
 *  com.yonyou.iuap.apdoc.coredoc.dao.materialtpl.MaterialTplQryDao
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.LanguagesEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.po.materialtpl.MaterialTplPO
 *  com.yonyou.iuap.apdoc.coredoc.po.pubfw.ProductNccPO
 *  com.yonyou.iuap.apdoc.coredoc.po.pubfw.ProductTplNccPO
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.iuap.yms.api.IYmsJdbcApi
 *  com.yonyou.iuap.yms.api.YmsJdbcApiProvider
 *  com.yonyou.iuap.yms.factory.YmsJdbcApiProviderFactory
 *  com.yonyou.iuap.yms.param.BaseEntity
 *  com.yonyou.iuap.yms.param.ResultSetProcessor
 *  com.yonyou.iuap.yms.processor.BeanListProcessor
 *  com.yonyou.ucf.CharacterDTO
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.util.RedisTool
 *  com.yonyou.ucf.userdef.api.ICharacterSaveSyncService
 *  com.yonyou.ucf.userdef.dto.CharacterDTORPC
 *  com.yonyou.ucf.userdef.dto.CharacteristicsSaveDTO
 *  com.yonyoucloud.upc.pc.product.BusinessAttributeEnum
 *  com.yonyoucloud.upc.pc.product.CharacteristicsTypeEnum
 *  com.yonyoucloud.upc.pc.productncc.HandleStatus
 *  com.yonyoucloud.upc.pc.productncc.ProductNcc
 *  com.yonyoucloud.upc.pc.productncc.ProductTplNcc
 *  com.yonyoucloud.upc.pc.tpl.ProductTpl
 *  com.yonyoucloud.upc.pc.tpl.ProductTplCharacter
 *  com.yonyoucloud.upc.utils.RedisLockKeyConstants
 *  com.yonyoucloud.upc.utils.UpcStringUtil
 *  org.apache.commons.lang3.ObjectUtils
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
 *  org.springframework.transaction.annotation.Transactional
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import cn.hutool.core.collection.CollectionUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.yonyou.cloud.middleware.rpc.RPCStubBeanFactory;
import com.yonyou.cloud.utils.StringUtils;
import com.yonyou.diwork.ott.exexutors.RobotExecutors;
import com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants;
import com.yonyou.iuap.apdoc.coredoc.dao.materialtpl.MaterialTplQryDao;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.LanguagesEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.po.materialtpl.MaterialTplPO;
import com.yonyou.iuap.apdoc.coredoc.po.pubfw.ProductNccPO;
import com.yonyou.iuap.apdoc.coredoc.po.pubfw.ProductTplNccPO;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.iuap.yms.api.IYmsJdbcApi;
import com.yonyou.iuap.yms.api.YmsJdbcApiProvider;
import com.yonyou.iuap.yms.factory.YmsJdbcApiProviderFactory;
import com.yonyou.iuap.yms.param.BaseEntity;
import com.yonyou.iuap.yms.param.ResultSetProcessor;
import com.yonyou.iuap.yms.processor.BeanListProcessor;
import com.yonyou.ucf.CharacterDTO;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.util.RedisTool;
import com.yonyou.ucf.userdef.api.ICharacterSaveSyncService;
import com.yonyou.ucf.userdef.dto.CharacterDTORPC;
import com.yonyou.ucf.userdef.dto.CharacteristicsSaveDTO;
import com.yonyoucloud.upc.pc.product.BusinessAttributeEnum;
import com.yonyoucloud.upc.pc.product.CharacteristicsTypeEnum;
import com.yonyoucloud.upc.pc.productncc.HandleStatus;
import com.yonyoucloud.upc.pc.productncc.ProductNcc;
import com.yonyoucloud.upc.pc.productncc.ProductTplNcc;
import com.yonyoucloud.upc.pc.tpl.ProductTpl;
import com.yonyoucloud.upc.pc.tpl.ProductTplCharacter;
import com.yonyoucloud.upc.service.AchiveDataQueryService;
import com.yonyoucloud.upc.service.MQSaveProductNewArchTaskService;
import com.yonyoucloud.upc.service.ProductSkuService;
import com.yonyoucloud.upc.service.UPCBillService;
import com.yonyoucloud.upc.utils.RedisLockKeyConstants;
import com.yonyoucloud.upc.utils.UpcStringUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.apache.commons.lang3.ObjectUtils;
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
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

@Service(value="mq.ncSynProductService")
public class NcSynProductService {
    private static final Logger log = LoggerFactory.getLogger(NcSynProductService.class);
    public static final String SPLIT = ";";
    public static final String AFFEC_PRE = "freeCTCharacterIds";
    public static final String AFFEC_SKU = "freeCTCharacterIds_sku";
    public static final String AFFEC_COST = "freeCTCharacterIds_cost";
    public static final String AFFEC_STOCK = "freeCTCharacterIds_stock";
    public static final String AFFEC_BATCH = "freeCTCharacterIds_batch";
    public static final String AFFEC_SN = "freeCTCharacterIds_SN";
    public static final String AFFEC_BOM = "freeCTCharacterIds_BOM";
    public static final String AFFEC_MANU = "freeCTCharacterIds_manu";
    public static final String AFFEC_PRICE = "freeCTCharacterIds_price";
    public static final Map<String, String> AFFECKEYSMAPPING = new HashMap<String, String>();
    @Autowired
    ProductSkuService productSkuService;
    @Autowired
    @Qualifier(value="pc.BillService")
    UPCBillService upcBillService;
    @Autowired
    MQSaveProductNewArchTaskService mqSaveProductNewArchTaskService;
    @Autowired
    AchiveDataQueryService achiveDataQueryService;
    @Autowired
    MaterialTplQryDao materialTplQryDao;

    public String getCharacteridsMd5(List<String> characterIdList) {
        return UpcStringUtil.sortStrMd5(characterIdList);
    }

    public String getCharacteridsAndSenMd5(Map<String, String> affecsMap) {
        ArrayList<String> characteridsAndSen = new ArrayList<String>();
        for (Map.Entry<String, String> next : AFFECKEYSMAPPING.entrySet()) {
            String[] characterIds;
            String senKey = next.getKey();
            if (!StringUtils.isNotEmpty((String)affecsMap.get(senKey))) continue;
            String senAttr = next.getValue();
            for (String characterId : characterIds = affecsMap.get(senKey).split(SPLIT)) {
                characteridsAndSen.add(characterId + senAttr);
            }
        }
        return this.getCharacteridsMd5(characteridsAndSen);
    }

    private CharacteristicsSaveDTO saveAndGetCharacteristic(List<String> characterIdsList) throws Exception {
        String characteridsMd5 = this.getCharacteridsMd5(characterIdsList);
        ArrayList<Long> characterIdsParam = new ArrayList<Long>();
        for (String characterId : characterIdsList) {
            characterIdsParam.add(Long.parseLong(characterId));
        }
        List<CharacterDTO> characterDTOList = this.getCharacterByIds(characterIdsParam);
        if (characterIdsList.size() != characterDTOList.size()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801528);
        }
        ArrayList<Map<String, Object>> charactristicSaveParam = new ArrayList<Map<String, Object>>();
        HashMap<String, Object> charactristicSaveMap = new HashMap<String, Object>(8);
        charactristicSaveMap.put("characteristicsType", CharacteristicsTypeEnum.IFreeCT.getValue());
        charactristicSaveMap.put("mappingId", characteridsMd5);
        charactristicSaveMap.put("characterIds", characterIdsParam);
        this.setCharacteristicCodeAndName(charactristicSaveMap, characterDTOList, characterIdsList);
        charactristicSaveParam.add(charactristicSaveMap);
        return this.saveCharacteristic(charactristicSaveParam);
    }

    private CharacteristicsSaveDTO saveCharacteristic(List<Map<String, Object>> charactristicSaveParam) throws Exception {
        RPCStubBeanFactory rpChainBeanFactory = new RPCStubBeanFactory("u8c-userdefine", "c87e2267-1001-4c70-bb2a-ab41f3b81aa3", "", ICharacterSaveSyncService.class);
        rpChainBeanFactory.afterPropertiesSet();
        ICharacterSaveSyncService iCharacterSaveSyncService = (ICharacterSaveSyncService)rpChainBeanFactory.getObject();
        List characteristicsSaveDTOS = iCharacterSaveSyncService.saveAndSyncCharateristics(charactristicSaveParam);
        return (CharacteristicsSaveDTO)characteristicsSaveDTOS.get(0);
    }

    private void setCharacteristicCodeAndName(Map<String, Object> charactristicSaveMap, List<CharacterDTO> characterByIds, List<String> characterIdsList) {
        Collections.sort(characterIdsList);
        HashMap<String, CharacterDTO> charactersMap = new HashMap<String, CharacterDTO>(characterByIds.size());
        for (CharacterDTO characterDTO : characterByIds) {
            charactersMap.put(characterDTO.getId().toString(), characterDTO);
        }
        StringBuilder code = new StringBuilder();
        StringBuilder name = new StringBuilder();
        for (String characterId : characterIdsList) {
            CharacterDTO characterDTO = (CharacterDTO)charactersMap.get(characterId);
            code.append(characterDTO.getCode());
            name.append(characterDTO.getName());
        }
        charactristicSaveMap.put("code", String.valueOf(IdManager.getInstance().nextId()));
        charactristicSaveMap.put("name", name.toString());
    }

    public Map<String, Map<String, Object>> getAllProducttplNcc(HandleStatus handleStatus) throws Exception {
        QuerySchema querySchema = QuerySchema.create().addSelect("freeCharacterIds, freeCharacterIdsMd5, characteristicId, tplId, handleStatus").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"handleStatus").eq((Object)handleStatus.getValue())}));
        List productTplNccList = MetaDaoHelper.query((String)"pc.productncc.ProductTplNcc", (QuerySchema)querySchema);
        if (!CollectionUtils.isEmpty((Collection)productTplNccList)) {
            HashMap<String, Map<String, Object>> result = new HashMap<String, Map<String, Object>>(productTplNccList.size());
            for (Map data : productTplNccList) {
                result.put(data.get("freeCharacterIdsMd5").toString(), data);
            }
            return result;
        }
        return null;
    }

    public ProductTplNcc writeTplToTplNcc(List<String> characterIds, Map<String, String> affecsMap) throws Exception {
        String characteridsMd5 = this.getCharacteridsAndSenMd5(affecsMap);
        QuerySchema querySchema = QuerySchema.create().addSelect("freeCharacterIds, freeCharacterIdsMd5, characteristicId, tplId, handleStatus").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"freeCharacterIdsMd5").eq((Object)characteridsMd5)}));
        List productTplNccList = this.productSkuService.query("pc.productncc.ProductTplNcc", querySchema);
        if (CollectionUtils.isEmpty((Collection)productTplNccList)) {
            CharacteristicsSaveDTO characteristicsSaveDTO = this.saveAndGetCharacteristic(characterIds);
            ProductTplNcc productTplNcc = new ProductTplNcc();
            productTplNcc.setId((Object)IdManager.getInstance().nextId());
            productTplNcc.setEntityStatus(EntityStatus.Insert);
            productTplNcc.setTenant((Long)AppContext.getTenantId());
            productTplNcc.setYtenant((String)AppContext.getYhtTenantId());
            productTplNcc.setFreeCharacterIdsMd5(characteridsMd5);
            productTplNcc.setAffecsJson(JSON.toJSONString(affecsMap));
            StringBuilder ids = new StringBuilder();
            for (String id : characterIds) {
                ids.append(id);
                ids.append(SPLIT);
            }
            productTplNcc.setFreeCharacterIds(ids.toString());
            productTplNcc.setHandleStatus(HandleStatus.dealing);
            productTplNcc.setCharacteristicId(characteristicsSaveDTO.getId().toString());
            productTplNcc.setLastTaskId(characteristicsSaveDTO.getLastTaskId());
            MetaDaoHelper.insert((String)"pc.productncc.ProductTplNcc", (BizObject)productTplNcc);
            return productTplNcc;
        }
        return (ProductTplNcc)productTplNccList.get(0);
    }

    public void writeProductToProductNcc(Map<String, Object> param, String characteridsMd5) throws Exception {
        try {
            List products = (List)param.get("data");
            for (Map product : products) {
                ProductNcc productNcc = new ProductNcc();
                productNcc.setEntityStatus(EntityStatus.Insert);
                productNcc.setId((Object)IdManager.getInstance().nextId());
                productNcc.setProductData(JSON.toJSONStringWithDateFormat(param, (String)"yyyy-MM-dd HH:mm:ss", (SerializerFeature[])new SerializerFeature[]{SerializerFeature.WriteDateUseDateFormat}));
                productNcc.setFreeCharacterIdsMd5(characteridsMd5);
                if (null != product.get("erpCode")) {
                    productNcc.setErpCode(product.get("erpCode").toString());
                }
                productNcc.setHandleStatus(HandleStatus.pending);
                productNcc.setTenant((Long)AppContext.getTenantId());
                productNcc.setYtenant((String)AppContext.getYhtTenantId());
                MetaDaoHelper.insert((String)"pc.productncc.ProductNcc", (BizObject)productNcc);
            }
        }
        catch (Exception e) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801529);
        }
    }

    private List<CharacterDTO> getCharacterByIds(List<Long> characterIds) throws Exception {
        ArrayList<CharacterDTORPC> characterDTORPCS = new ArrayList<CharacterDTORPC>();
        for (Long id : characterIds) {
            CharacterDTORPC characterDTORPC = new CharacterDTORPC();
            characterDTORPC.setId(id);
            characterDTORPCS.add(characterDTORPC);
        }
        return this.achiveDataQueryService.getCharacterDTOByIds(characterIds);
    }

    public CharacteristicsSaveDTO getCharacteristicById(Long characteristicId) {
        RPCStubBeanFactory rpChainBeanFactory = new RPCStubBeanFactory("u8c-userdefine", "c87e2267-1001-4c70-bb2a-ab41f3b81aa3", "", ICharacterSaveSyncService.class);
        rpChainBeanFactory.afterPropertiesSet();
        ICharacterSaveSyncService iCharacterSaveSyncService = (ICharacterSaveSyncService)rpChainBeanFactory.getObject();
        CharacteristicsSaveDTO characteristicsSaveDTO = iCharacterSaveSyncService.queryCharacteristicsById(characteristicId);
        return characteristicsSaveDTO;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void scanProductTplNccDealing() {
        String requestId = UUID.randomUUID().toString();
        try {
            if (RedisTool.tryGetLock((String)RedisLockKeyConstants.PRODUCTTPLNCC_TASK, (String)requestId, (int)UPCConstants.LOCK_EXPIRE_TIME)) {
                YmsJdbcApiProvider ymsJdbcApiProvider = YmsJdbcApiProviderFactory.getYmsJdbcApiProvider();
                Supplier federalYmsJdbcApi = ymsJdbcApiProvider.getFederalYmsJdbcApi("iuap-apdoc-material_main_dataSource");
                List iYmsJdbcApis = (List)federalYmsJdbcApi.get();
                for (IYmsJdbcApi ymsJdbcApi : iYmsJdbcApis) {
                    String querySQL;
                    List productTplNccList = ymsJdbcApi.queryForList(querySQL = "select id, chracter_ids as freeCharacterIds, affecs_json as affecsJson, chracter_ids_md5 as freeCharacterIdsMd5, characteristic_id as  characteristicId, tpl_id as `tplId`, handlestatus as handleStatus, tenant_id as tenant, ytenant_id as ytenant from producttpl_ncc where handleStatus in ('1', '3');", null, (ResultSetProcessor)new BeanListProcessor((BaseEntity)new ProductTplNccPO()));
                    if (CollectionUtils.isEmpty((Collection)productTplNccList)) continue;
                    for (ProductTplNcc productTplNcc : productTplNccList) {
                        String ytenant = productTplNcc.getYtenant();
                        RobotExecutors.runAs((String)ytenant, () -> {
                            try {
                                this.saveTplAndSendProductToMq(productTplNcc, true);
                            }
                            catch (Exception e) {
                                log.error("" + e.getMessage(), (Throwable)e);
                            }
                        });
                    }
                }
            }
        }
        catch (Exception e) {
            log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080C13", (String)"\u5b9a\u65f6\u626b\u63cf\u5ef6\u8fdf\u751f\u6548\u6570\u636e\u53d1\u9001\u4e8b\u4ef6\u5931\u8d25"), (Throwable)e);
        }
        finally {
            RedisTool.releaseLock((String)RedisLockKeyConstants.PRODUCTTPLNCC_TASK, (String)requestId);
        }
    }

    @Transactional(rollbackFor={Throwable.class})
    public void saveTplAndSendProductToMq(ProductTplNcc productTplNcc, Boolean dealProductData) throws Exception {
        String freeCharacterIdsMd5 = productTplNcc.getFreeCharacterIdsMd5();
        String characteristicId = productTplNcc.getCharacteristicId();
        CharacteristicsSaveDTO characteristic = this.getCharacteristicById(Long.parseLong(characteristicId));
        if (200 == characteristic.getSyncStatus()) {
            QuerySchema querySchema;
            List productNccs;
            boolean isException = false;
            String msg = null;
            ProductTpl productTpl = new ProductTpl();
            try {
                this.saveTpl(productTplNcc, freeCharacterIdsMd5, characteristicId, characteristic, productTpl);
                productTplNcc.setHandleStatus(HandleStatus.success);
                productTplNcc.setTplId(productTpl.getId().toString());
                productTplNcc.setEntityStatus(EntityStatus.Update);
            }
            catch (Exception e) {
                log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080C0F", (String)"\u4fdd\u5b58ncc\u7269\u6599\u6a21\u677f\u5f02\u5e38"), (Throwable)e);
                msg = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080C10", (String)"\u7269\u6599\u6a21\u677f\u4fdd\u5b58\u5f02\u5e38\uff1a") + e.getMessage();
                productTplNcc.setMsg(msg);
                productTplNcc.setHandleStatus(HandleStatus.fail);
                productTplNcc.setEntityStatus(EntityStatus.Update);
                isException = true;
            }
            if ((dealProductData.booleanValue() || isException) && !CollectionUtils.isEmpty((Collection)(productNccs = this.productSkuService.query("pc.productncc.ProductNcc", querySchema = QuerySchema.create().addSelect("productData, id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"handleStatus").in(new Object[]{HandleStatus.pending.getValue()}), QueryCondition.name((String)"freeCharacterIdsMd5").eq((Object)freeCharacterIdsMd5)})))))) {
                for (ProductNcc productNcc : productNccs) {
                    Map productDto = (Map)JSONObject.parseObject((String)productNcc.getProductData(), Map.class);
                    List datas = (List)productDto.get("data");
                    Map product = (Map)datas.get(0);
                    if (isException) {
                        productNcc.setEntityStatus(EntityStatus.Update);
                        productNcc.setHandleStatus(HandleStatus.fail);
                        MetaDaoHelper.update((String)"pc.productncc.ProductNcc", (BizObject)productNcc);
                        this.mqSaveProductNewArchTaskService.sendFailToNCC(msg, product.get("erpCode").toString(), productDto);
                        continue;
                    }
                    product.put("productTemplate", productTpl.getId());
                    this.upcBillService.mqSave(productDto);
                    productNcc.setEntityStatus(EntityStatus.Update);
                    productNcc.setHandleStatus(HandleStatus.dealing);
                    MetaDaoHelper.update((String)"pc.productncc.ProductNcc", (BizObject)productNcc);
                }
            }
        } else if (500 == characteristic.getSyncStatus() && dealProductData.booleanValue()) {
            String msg = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080C0E", (String)"\u7279\u5f81\u7ec4\u540c\u6b65\u5143\u6570\u636e\u5931\u8d25\uff0c\u8bf7\u624b\u5de5\u540c\u6b65\uff0c\u7279\u5f81\u7ec4\u7f16\u7801\uff1a") + characteristic.getCode();
            QuerySchema querySchema = QuerySchema.create().addSelect("productData, id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"handleStatus").in(new Object[]{HandleStatus.pending.getValue()}), QueryCondition.name((String)"freeCharacterIdsMd5").eq((Object)freeCharacterIdsMd5)}));
            List productNccs = this.productSkuService.query("pc.productncc.ProductNcc", querySchema);
            if (!CollectionUtils.isEmpty((Collection)productNccs)) {
                for (ProductNcc productNcc : productNccs) {
                    Map productDto = (Map)JSONObject.parseObject((String)productNcc.getProductData(), Map.class);
                    List datas = (List)productDto.get("data");
                    Map product = (Map)datas.get(0);
                    this.mqSaveProductNewArchTaskService.sendFailToNCC(msg, product.get("erpCode").toString(), productDto);
                }
            }
            productTplNcc.setMsg(msg);
            productTplNcc.setHandleStatus(HandleStatus.fail);
            productTplNcc.setEntityStatus(EntityStatus.Update);
        }
        MetaDaoHelper.update((String)"pc.productncc.ProductTplNcc", (BizObject)productTplNcc);
    }

    private void saveTpl(ProductTplNcc productTplNcc, String freeCharacterIdsMd5, String characteristicId, CharacteristicsSaveDTO characteristic, ProductTpl productTpl) throws Exception {
        String name = characteristic.getName();
        List materialTplPOList = this.materialTplQryDao.queryMaterialTplByNameLeftLike(name);
        if (!CollectionUtils.isEmpty((Collection)materialTplPOList)) {
            name = this.getTplName(name, materialTplPOList);
        }
        productTpl.setId((Object)IdManager.getInstance().nextId());
        productTpl.setFreeCT(Long.valueOf(Long.parseLong(characteristicId)));
        productTpl.setName(name);
        this.setProductTplFreeCharacter(productTpl, productTplNcc.getFreeCharacterIds(), characteristicId, productTplNcc.getAffecsJson());
        productTpl.setEntityStatus(EntityStatus.Insert);
        productTpl.setTenant((Long)AppContext.getTenantId());
        productTpl.set("ytenant", AppContext.getYhtTenantId());
        productTpl.setErpCode(freeCharacterIdsMd5);
        MetaDaoHelper.insert((String)"pc.tpl.ProductTpl", (BizObject)productTpl);
    }

    private String getTplName(String name, List<MaterialTplPO> materialTplPOList) {
        name = name + "-";
        int startNum = 2;
        for (MaterialTplPO materialTplPO : materialTplPOList) {
            String tplName = materialTplPO.getName().getText(LanguagesEnum.zh_CN.getName());
            if (!tplName.startsWith(name)) continue;
            String substring = tplName.substring(name.length());
            try {
                int i = Integer.parseInt(substring);
                if (startNum > i) continue;
                startNum = i + 1;
            }
            catch (NumberFormatException numberFormatException) {}
        }
        return name + startNum;
    }

    public void scanProductNcc(ProductNccPO productNccPO, ProductTplNccPO productTplNccPO) throws Exception {
        ProductNcc productNcc = new ProductNcc();
        productNcc.setId((Object)productNccPO.getId());
        productNcc.setEntityStatus(EntityStatus.Update);
        Map productDto = (Map)JSONObject.parseObject((String)productNccPO.getProductData(), Map.class);
        List datas = (List)productDto.get("data");
        Map product = (Map)datas.get(0);
        if (HandleStatus.success.getValue().equals(productTplNccPO.getHandleStatus())) {
            product.put("productTemplate", productTplNccPO.getTplId());
            this.upcBillService.mqSave(productDto);
            productNcc.setEntityStatus(EntityStatus.Update);
            productNcc.setHandleStatus(HandleStatus.dealing);
            MetaDaoHelper.update((String)"pc.productncc.ProductNcc", (BizObject)productNcc);
        } else if (HandleStatus.fail.getValue().equals(productTplNccPO.getHandleStatus())) {
            this.mqSaveProductNewArchTaskService.sendFailToNCC(productTplNccPO.getMsg(), product.get("erpCode").toString(), productDto);
            productNcc.setHandleStatus(HandleStatus.fail);
        }
        MetaDaoHelper.update((String)"pc.productncc.ProductNcc", (BizObject)productNcc);
    }

    private void setProductTplFreeCharacter(ProductTpl productTpl, String freeCharacterIds, String characteristicId, String affecsJson) throws Exception {
        String[] splitS;
        ArrayList<ProductTplCharacter> freeCharacters = new ArrayList<ProductTplCharacter>();
        ArrayList<Long> characterIds = new ArrayList<Long>();
        for (String idStr : splitS = freeCharacterIds.split(SPLIT)) {
            if (!StringUtils.isNotEmpty((String)idStr)) continue;
            characterIds.add(Long.parseLong(idStr));
        }
        Map affecs = new HashMap();
        if (StringUtils.isNotEmpty((String)affecsJson)) {
            affecs = (Map)JSONObject.parseObject((String)affecsJson, Map.class);
        }
        List<CharacterDTO> characterByIds = this.getCharacterByIds(characterIds);
        int order = 1;
        for (CharacterDTO characterDTO : characterByIds) {
            ProductTplCharacter productTplCharacter = new ProductTplCharacter();
            productTplCharacter.setId((Object)IdManager.getInstance().nextId());
            productTplCharacter.setEntityStatus(EntityStatus.Insert);
            productTplCharacter.setCharacter(characterDTO.getId());
            productTplCharacter.setCharacterCode(characterDTO.getCode());
            productTplCharacter.setCharacteristics(Long.valueOf(Long.parseLong(characteristicId)));
            productTplCharacter.setCharacteristicsType(Long.valueOf(3L));
            productTplCharacter.setDataType(Integer.valueOf(Integer.parseInt(characterDTO.getCharactorType())));
            if (StringUtils.isEmpty((String)affecsJson)) {
                productTplCharacter.setSkuSens(Integer.valueOf(1));
                productTplCharacter.setStockSens(Integer.valueOf(1));
            } else {
                for (Map.Entry<String, String> next : AFFECKEYSMAPPING.entrySet()) {
                    String key = next.getKey();
                    String value = next.getValue();
                    String affecCharacterIds = (String)affecs.get(key);
                    if (!StringUtils.isNotEmpty((String)affecCharacterIds) || !affecCharacterIds.contains(characterDTO.getId().toString())) continue;
                    if (AFFEC_SKU.equals(key)) {
                        productTplCharacter.setSkuSens(Integer.valueOf(1));
                        productTplCharacter.setStockSens(Integer.valueOf(1));
                        continue;
                    }
                    productTplCharacter.put(value, (Object)1);
                }
            }
            productTplCharacter.setIOrder(Integer.valueOf(order++));
            productTplCharacter.setTemplate((Long)productTpl.getId());
            freeCharacters.add(productTplCharacter);
        }
        if (!CollectionUtils.isEmpty(freeCharacters)) {
            productTpl.setFreeCharacters(freeCharacters);
        }
    }

    public List<String> getAllAffecs(Map<String, Object> product, Map<String, String> affecsMap) {
        HashSet<String> characterIds = new HashSet<String>();
        for (Map.Entry<String, Object> entry : product.entrySet()) {
            Object value = entry.getValue();
            if (!entry.getKey().contains(AFFEC_PRE) || !ObjectUtils.isNotEmpty((Object)value)) continue;
            String[] characterIdsAttr = entry.getValue().toString().split(SPLIT);
            if (AFFEC_PRE.equals(entry.getKey())) {
                affecsMap.put(AFFEC_SKU, entry.getValue().toString());
            } else {
                affecsMap.put(entry.getKey(), entry.getValue().toString());
            }
            for (String id : characterIdsAttr) {
                characterIds.add(id);
            }
        }
        if (!CollectionUtils.isEmpty(characterIds)) {
            return characterIds.stream().collect(Collectors.toList());
        }
        return null;
    }

    public void dealU8Datas(Map productData) {
        this.dealU8Enums(productData);
        this.dealU8InspectionType(productData);
    }

    private void dealU8InspectionType(Map productData) {
        Object inspectionControlPoint = productData.get("detail!inspectionControlPoint");
        if ((null == inspectionControlPoint || StringUtils.isEmpty((String)inspectionControlPoint.toString())) && BooleanUtil.isTrue(productData.get("detail!inspectionType"))) {
            productData.put("detail!inspectionControlPoint", 0);
        }
    }

    private void dealU8Enums(Map productData) {
        this.dealU8ProductAttribute(productData);
        this.dealU8BusinessAttribute(productData);
    }

    private void dealU8ProductAttribute(Map productData) {
        boolean isVirtual = true;
        if (BooleanUtil.isTrue(productData.get("bEquipment"))) {
            productData.put("realProductAttribute", "1");
            productData.put("realProductAttributeType", "4");
            isVirtual = false;
        } else if (BooleanUtil.isTrue(productData.get("bAccessary"))) {
            productData.put("realProductAttribute", "2");
            productData.put("virtualProductAttribute", "11");
        } else if (BooleanUtil.isTrue(productData.get("bInvType"))) {
            productData.put("realProductAttribute", "2");
            productData.put("virtualProductAttribute", "10");
        } else if (BooleanUtil.isTrue(productData.get("bPTOModel"))) {
            productData.put("realProductAttribute", "2");
            productData.put("virtualProductAttribute", "16");
        } else if (BooleanUtil.isTrue(productData.get("bStorCard"))) {
            productData.put("realProductAttribute", "2");
            productData.put("virtualProductAttribute", "1");
        } else if (BooleanUtil.isTrue(productData.get("bCoupon"))) {
            productData.put("realProductAttribute", "2");
            productData.put("virtualProductAttribute", "3");
        } else {
            productData.put("realProductAttribute", "1");
            productData.put("realProductAttributeType", "1");
            isVirtual = false;
        }
        if (BooleanUtil.isTrue(productData.get("bInvAsset"))) {
            productData.put("detail!valueManageType", 1);
        } else if (isVirtual) {
            productData.put("detail!valueManageType", 99);
        } else {
            productData.put("detail!valueManageType", 0);
        }
    }

    private void dealU8BusinessAttribute(Map productData) {
        HashSet<Short> businessAttribute = new HashSet<Short>();
        if (BooleanUtil.isTrue(productData.get("bSale")) || BooleanUtil.isTrue(productData.get("bExpSale"))) {
            businessAttribute.add(BusinessAttributeEnum.SALE.getValue());
            productData.put("detail!saleChannel", "1,2,3");
        }
        if (BooleanUtil.isTrue(productData.get("bPurchase"))) {
            businessAttribute.add(BusinessAttributeEnum.PURCHASE.getValue());
        }
        if (BooleanUtil.isTrue(productData.get("bSelf "))) {
            businessAttribute.add(BusinessAttributeEnum.SELF_CREATE.getValue());
        }
        if (BooleanUtil.isTrue(productData.get("bProxyForeign"))) {
            businessAttribute.add(BusinessAttributeEnum.OUT_SOURCING.getValue());
        }
        if (BooleanUtil.isTrue(productData.get("bPTOModel"))) {
            businessAttribute.add(BusinessAttributeEnum.SALE.getValue());
        }
        productData.put("detail!businessAttribute", CollectionUtil.join(businessAttribute, (CharSequence)","));
    }

    static {
        AFFECKEYSMAPPING.put(AFFEC_SKU, "skuSens");
        AFFECKEYSMAPPING.put(AFFEC_BATCH, "batchSens");
        AFFECKEYSMAPPING.put(AFFEC_SN, "SNSens");
        AFFECKEYSMAPPING.put(AFFEC_STOCK, "stockSens");
        AFFECKEYSMAPPING.put(AFFEC_COST, "costAffec");
        AFFECKEYSMAPPING.put(AFFEC_BOM, "BOMAffec");
        AFFECKEYSMAPPING.put(AFFEC_MANU, "manuAffec");
        AFFECKEYSMAPPING.put(AFFEC_PRICE, "priceAffec");
    }
}


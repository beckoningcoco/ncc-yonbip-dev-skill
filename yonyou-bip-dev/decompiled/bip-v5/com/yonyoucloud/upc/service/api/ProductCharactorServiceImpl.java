/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.googlecode.aviator.utils.ArrayHashMap
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 *  com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.apdoc.coredoc.utils.MultiLangUtils
 *  com.yonyou.iuap.fileservice.sdk.module.CooperationFileService
 *  com.yonyou.iuap.fileservice.sdk.module.pojo.BatchBusinessFilesRequest
 *  com.yonyou.iuap.fileservice.sdk.module.pojo.CooperationSuiteFile
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.CharacterDTO
 *  com.yonyou.ucf.CharacterDocValueDTO
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.util.RedisTool
 *  com.yonyou.ucf.userdef.dto.SyncCharacterResult
 *  com.yonyou.ucf.userdef.dto.SyncCharacteristicsDto
 *  com.yonyoucloud.iuap.upc.api.IProductCharactorService
 *  com.yonyoucloud.iuap.upc.dto.CharacterValueDTO
 *  com.yonyoucloud.iuap.upc.dto.ProductCharacterDTO
 *  com.yonyoucloud.iuap.upc.dto.ProductCharacterDocValueDTO
 *  com.yonyoucloud.iuap.upc.dto.ProductCharacterTplDTO
 *  com.yonyoucloud.iuap.upc.dto.ProductDTO
 *  com.yonyoucloud.iuap.upc.dto.ProductFreeCharacterDTO
 *  com.yonyoucloud.iuap.upc.dto.ProductFreeCharacterItemDto
 *  com.yonyoucloud.iuap.upc.dto.ProductFreeCharacterItemQryDto
 *  com.yonyoucloud.iuap.upc.dto.ProductSkuDTO
 *  com.yonyoucloud.iuap.upc.dto.ProductSkuQryDTO
 *  com.yonyoucloud.iuap.upc.dto.ProductSpecItemAlbumDTO
 *  com.yonyoucloud.iuap.upc.dto.ProductTplCharacterDTO
 *  com.yonyoucloud.iuap.upc.dto.SensitiveInfoAndProduct
 *  com.yonyoucloud.iuap.upc.dto.SkuFreeCharacterDTO
 *  com.yonyoucloud.iuap.upc.dto.SkuMatchDTO
 *  com.yonyoucloud.upc.pc.product.CharacteristicsTypeEnum
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductFreeCharacterItem
 *  com.yonyoucloud.upc.pc.product.ProductSKU
 *  com.yonyoucloud.upc.pc.product.SensitiveEnum
 *  com.yonyoucloud.upc.pc.product.SkuFreeCharacter
 *  com.yonyoucloud.upc.pc.tpl.ProductTplCharacter
 *  com.yonyoucloud.upc.utils.UpcStringUtil
 *  org.apache.commons.lang3.ObjectUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.jetbrains.annotations.NotNull
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.BeanUtils
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Service
 *  org.springframework.transaction.annotation.Transactional
 *  org.springframework.transaction.support.TransactionSynchronization
 *  org.springframework.transaction.support.TransactionSynchronizationManager
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.api;

import com.alibaba.fastjson.JSON;
import com.googlecode.aviator.utils.ArrayHashMap;
import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.apdoc.coredoc.utils.MultiLangUtils;
import com.yonyou.iuap.fileservice.sdk.module.CooperationFileService;
import com.yonyou.iuap.fileservice.sdk.module.pojo.BatchBusinessFilesRequest;
import com.yonyou.iuap.fileservice.sdk.module.pojo.CooperationSuiteFile;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.CharacterDTO;
import com.yonyou.ucf.CharacterDocValueDTO;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.util.RedisTool;
import com.yonyou.ucf.userdef.dto.SyncCharacterResult;
import com.yonyou.ucf.userdef.dto.SyncCharacteristicsDto;
import com.yonyoucloud.iuap.upc.api.IProductCharactorService;
import com.yonyoucloud.iuap.upc.api.IProductService;
import com.yonyoucloud.iuap.upc.api.ISkuService;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.iuap.upc.dto.CharacterValueDTO;
import com.yonyoucloud.iuap.upc.dto.ProductCharacterDTO;
import com.yonyoucloud.iuap.upc.dto.ProductCharacterDocValueDTO;
import com.yonyoucloud.iuap.upc.dto.ProductCharacterTplDTO;
import com.yonyoucloud.iuap.upc.dto.ProductDTO;
import com.yonyoucloud.iuap.upc.dto.ProductFreeCharacterDTO;
import com.yonyoucloud.iuap.upc.dto.ProductFreeCharacterItemDto;
import com.yonyoucloud.iuap.upc.dto.ProductFreeCharacterItemQryDto;
import com.yonyoucloud.iuap.upc.dto.ProductSkuDTO;
import com.yonyoucloud.iuap.upc.dto.ProductSkuQryDTO;
import com.yonyoucloud.iuap.upc.dto.ProductSpecItemAlbumDTO;
import com.yonyoucloud.iuap.upc.dto.ProductTplCharacterDTO;
import com.yonyoucloud.iuap.upc.dto.SensitiveInfoAndProduct;
import com.yonyoucloud.iuap.upc.dto.SkuFreeCharacterDTO;
import com.yonyoucloud.iuap.upc.dto.SkuMatchDTO;
import com.yonyoucloud.upc.pc.product.CharacteristicsTypeEnum;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductFreeCharacterItem;
import com.yonyoucloud.upc.pc.product.ProductSKU;
import com.yonyoucloud.upc.pc.product.SensitiveEnum;
import com.yonyoucloud.upc.pc.product.SkuFreeCharacter;
import com.yonyoucloud.upc.pc.tpl.ProductTplCharacter;
import com.yonyoucloud.upc.service.AchiveDataQueryService;
import com.yonyoucloud.upc.service.ProductCharacterService;
import com.yonyoucloud.upc.service.ProductSkuService;
import com.yonyoucloud.upc.service.api.ProductSpecServiceImpl;
import com.yonyoucloud.upc.service.utils.ProductUtil;
import com.yonyoucloud.upc.utils.UpcStringUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationManager;
import org.springframework.util.CollectionUtils;

@Service
@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public class ProductCharactorServiceImpl
implements IProductCharactorService {
    private static final Logger log = LoggerFactory.getLogger(ProductCharactorServiceImpl.class);
    @Autowired
    private CooperationFileService cooperationFileService;
    @Autowired
    private ISkuService skuService;
    @Autowired
    private IProductService productService;
    @Autowired
    private ProductCharacterService productCharacterService;
    @Autowired
    @Qualifier(value="pc.BillService")
    private IUPCBillService billService;
    @Autowired
    private AchiveDataQueryService achiveDataQueryService;
    @Autowired
    private ProductSpecServiceImpl productSpecService;
    @Autowired
    private ProductSkuService productSkuService;
    private static String FREECT_FIELD = "skuFreeCharacter.";
    private static String SKU_BUSINESS_DYNAMIC_ATTR = "skuBusinessDynamic";
    private static final String FREE_VALUE_IDS_MD5 = "freeValueIdsMd5";

    public ProductDTO getCharactorByProductId(Long productId, String[] fields) throws Exception {
        ProductDTO productDTO = this.productService.getProductById(productId, fields);
        if (null != productDTO) {
            List<CharacterDTO> CharacterDTOList = this.getCharactor(productId);
            productDTO.setCharacterDTOList(CharacterDTOList);
        }
        return productDTO;
    }

    public ProductSkuDTO skuMatchByProductAndCharactor(Long productId, List<CharacterValueDTO> characterDTOList, String[] fields) throws Exception {
        SkuMatchDTO skuMatchDTO = new SkuMatchDTO();
        skuMatchDTO.setProductId(productId);
        skuMatchDTO.setCharacterValueDTOList(characterDTOList);
        ArrayList lockKeys = new ArrayList();
        HashMap<String, String> lockKeyMap = new HashMap<String, String>();
        AtomicInteger lockCount = new AtomicInteger(0);
        List<SkuMatchDTO> matchedSkuList = this.matchSkuByCharacter(Arrays.asList(skuMatchDTO), lockKeyMap, lockCount);
        if (matchedSkuList != null && matchedSkuList.size() > 0) {
            return matchedSkuList.get(0).getMatchProductSkuDTO();
        }
        ProductDTO productDTO = this.productService.getProductById(productId, new String[]{"productTemplate", "productTemplateSkuDynamic"});
        if (productDTO.getProductTemplateSkuDynamic().booleanValue()) {
            skuMatchDTO.setProductTplId(productDTO.getProductTemplate());
            List<SkuMatchDTO> skuMatchDTOList = this.dynamicSkuByCharacter(Arrays.asList(skuMatchDTO));
            return skuMatchDTOList.get(0).getMatchProductSkuDTO();
        }
        return null;
    }

    private List<SkuMatchDTO> fetchUnMatchSKU(List<SkuMatchDTO> skuMatchDTOList) {
        ArrayList<SkuMatchDTO> unMatchSkuDTOList = new ArrayList<SkuMatchDTO>();
        for (SkuMatchDTO skuMatchDTO : skuMatchDTOList) {
            if (skuMatchDTO.getMatchProductSkuDTO() != null) continue;
            unMatchSkuDTOList.add(skuMatchDTO);
        }
        return unMatchSkuDTOList;
    }

    @Transactional(rollbackFor={Throwable.class})
    public List<SkuMatchDTO> skuMatchByProductAndCharacter(List<SkuMatchDTO> skuMatchDTOList) throws Exception {
        if (skuMatchDTOList != null && skuMatchDTOList.size() > 0) {
            List<SkuMatchDTO> unMatchedSkuList;
            ArrayList<SkuMatchDTO> resultMatchDTO = new ArrayList<SkuMatchDTO>();
            ArrayList lockKeys = new ArrayList();
            HashMap<String, String> lockKeyMap = new HashMap<String, String>();
            AtomicInteger lockCount = new AtomicInteger(0);
            List<SkuMatchDTO> matchedSkuList = this.matchSkuByCharacter(skuMatchDTOList, lockKeyMap, lockCount);
            if (matchedSkuList != null && matchedSkuList.size() > 0) {
                resultMatchDTO.addAll(matchedSkuList);
                unMatchedSkuList = this.fetchUnMatchSKU(skuMatchDTOList);
            } else {
                unMatchedSkuList = skuMatchDTOList;
            }
            if (unMatchedSkuList != null && unMatchedSkuList.size() > 0) {
                List<SkuMatchDTO> dynamicSkuList = this.filterSkuDynamic(unMatchedSkuList);
                if (dynamicSkuList != null && dynamicSkuList.size() > 0) {
                    dynamicSkuList = this.dynamicSkuByCharacter(dynamicSkuList);
                    resultMatchDTO.addAll(dynamicSkuList);
                    unMatchedSkuList = this.fetchUnMatchSKU(dynamicSkuList);
                    resultMatchDTO.addAll(unMatchedSkuList);
                } else {
                    resultMatchDTO.addAll(unMatchedSkuList);
                }
            }
            return resultMatchDTO;
        }
        return skuMatchDTOList;
    }

    private List<SkuMatchDTO> matchSkuByCharacter(List<SkuMatchDTO> skuMatchDTOList, Map<String, String> lockKeyMap, AtomicInteger lockCount) throws Exception {
        ArrayList<SkuMatchDTO> matchSkuList = new ArrayList<SkuMatchDTO>();
        ArrayList<String> md5StrList = new ArrayList<String>();
        for (SkuMatchDTO skuMatchDTO : skuMatchDTOList) {
            this.productSkuService.repairSkuMd5(skuMatchDTO.getProductId());
            ArrayList<String> idsList = new ArrayList<String>();
            idsList.add(skuMatchDTO.getProductId().toString());
            if (skuMatchDTO.getCharacterValueDTOList() != null && skuMatchDTO.getCharacterValueDTOList().size() > 0) {
                for (CharacterValueDTO characterValueDTO : skuMatchDTO.getCharacterValueDTOList()) {
                    if (characterValueDTO.getValue() != null) {
                        idsList.add(characterValueDTO.getValue().toString());
                        continue;
                    }
                    if (characterValueDTO.getValueList() == null || characterValueDTO.getValueList().size() <= 0 || null == characterValueDTO.getValueList().get(0)) continue;
                    idsList.add(characterValueDTO.getValueList().get(0).toString());
                }
            }
            String md5Key = UpcStringUtil.sortStrMd5(idsList);
            skuMatchDTO.setMd5Key(md5Key);
            md5StrList.add(md5Key);
        }
        ProductSkuQryDTO productSkuQryDTO = new ProductSkuQryDTO();
        productSkuQryDTO.setFields(new String[]{"id", "stopstatus", "code", "name", FREE_VALUE_IDS_MD5});
        productSkuQryDTO.setSkuMd5KeyList(md5StrList);
        List<ProductSkuDTO> skuDtoList = this.skuService.listSkuInfoNew(productSkuQryDTO);
        if (skuDtoList != null && skuDtoList.size() > 0) {
            HashMap<String, ProductSkuDTO> hashMap = new HashMap<String, ProductSkuDTO>(skuDtoList.size());
            for (ProductSkuDTO productSkuDTO : skuDtoList) {
                hashMap.put(productSkuDTO.getFreeValueIdsMd5(), productSkuDTO);
            }
            for (SkuMatchDTO skuMatchDTO : skuMatchDTOList) {
                String requestId;
                ProductSkuDTO productSkuDTO = (ProductSkuDTO)hashMap.get(skuMatchDTO.getMd5Key());
                if (productSkuDTO != null) {
                    skuMatchDTO.setMatchProductSkuDTO(productSkuDTO);
                    matchSkuList.add(skuMatchDTO);
                    continue;
                }
                final String lockKey = this.productSkuService.getProductSkuLockKey(skuMatchDTO.getProductId(), skuMatchDTO.getMd5Key());
                if (RedisTool.tryGetLock((String)lockKey, (String)(requestId = UUID.randomUUID().toString()), (int)120)) {
                    TransactionSynchronizationManager.registerSynchronization((TransactionSynchronization)new TransactionSynchronization(){

                        public void afterCompletion(int status) {
                            RedisTool.releaseLock((String)lockKey, (String)requestId);
                        }
                    });
                    lockKeyMap.put(lockKey, UUID.randomUUID().toString());
                    continue;
                }
                TimeUnit.MILLISECONDS.sleep(200L);
                lockCount.incrementAndGet();
                if (lockCount.get() > 60) {
                    this.releaseLockKeys(lockKeyMap);
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800839);
                }
                return this.matchSkuByCharacter(skuMatchDTOList, lockKeyMap, lockCount);
            }
        }
        return matchSkuList;
    }

    private void releaseLockKeys(Map<String, String> lockKeyMap) {
        if (lockKeyMap != null && !lockKeyMap.isEmpty()) {
            for (Map.Entry<String, String> next : lockKeyMap.entrySet()) {
                RedisTool.releaseLock((String)next.getKey(), (String)next.getValue());
            }
        }
    }

    public List<Long> getSkuIdByCharactorInfo(Long productId, List<CharacterValueDTO> characterDTOList) throws Exception {
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId)});
        for (CharacterValueDTO characterDTO : characterDTOList) {
            if (null == characterDTO.getCode() || null == characterDTO.getValueList() || characterDTO.getValueList().size() <= 0) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801375);
            }
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)(FREECT_FIELD + characterDTO.getCode())).in((Collection)characterDTO.getValueList()));
        }
        QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryConditionGroup);
        schema.distinct();
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        List productSKUList = MetaDaoHelper.query((String)"pc.product.ProductSKU", (QuerySchema)schema);
        ArrayList<Long> productSkuIdList = new ArrayList<Long>();
        if (productSKUList != null && productSKUList.size() > 0) {
            for (Map stringObjectMap : productSKUList) {
                productSkuIdList.add(Long.valueOf(stringObjectMap.get("id").toString()));
            }
        }
        return productSkuIdList;
    }

    public List<CharacterDTO> listCharactorByProductId(Long productId) {
        return this.getCharactor(productId);
    }

    public List<ProductCharacterDTO> listUsedCharactorByProductId(Long productId) throws Exception {
        Map<Long, ProductTplCharacter> productTplCharacterMap = this.getCharactorFromTemplateByProductId(productId, CharacteristicsTypeEnum.IFreeCT.getValue());
        if (productTplCharacterMap.isEmpty()) {
            return null;
        }
        List<SkuFreeCharacterDTO> skuFreeCharacterDTOList = this.getSkuFreeCharacter(productId);
        if (skuFreeCharacterDTOList != null && skuFreeCharacterDTOList.size() > 0) {
            ArrayList<Long> characterIdList = new ArrayList<Long>();
            HashMap<String, ArrayList<String>> characterValueMap = new HashMap<String, ArrayList<String>>();
            for (SkuFreeCharacterDTO skuFreeCharacterDTO : skuFreeCharacterDTOList) {
                if (null == skuFreeCharacterDTO.getCharacterId()) continue;
                if (!characterIdList.contains(skuFreeCharacterDTO.getCharacterId())) {
                    characterIdList.add(Long.valueOf(skuFreeCharacterDTO.getCharacterId()));
                }
                if (null == skuFreeCharacterDTO.getCharacterValueId() || characterIdList.contains(skuFreeCharacterDTO.getCharacterId())) continue;
                ArrayList<String> valueList = (ArrayList<String>)characterValueMap.get(skuFreeCharacterDTO.getCharacterId());
                if (valueList == null) {
                    valueList = new ArrayList<String>();
                }
                valueList.add(skuFreeCharacterDTO.getCharacterId() + "-" + skuFreeCharacterDTO.getCharacterValueId());
                characterValueMap.put(skuFreeCharacterDTO.getCharacterId(), valueList);
            }
            List<CharacterDTO> characterDTOList = this.getCharacterDTOBySkuFreeCharacter(skuFreeCharacterDTOList, true);
            if (characterDTOList != null && characterDTOList.size() > 0) {
                HashMap<Long, CharacterDTO> characterDTOHashMap = new HashMap<Long, CharacterDTO>();
                HashMap<String, CharacterDocValueDTO> characterValueHashMap = new HashMap<String, CharacterDocValueDTO>();
                for (CharacterDTO characterDTO : characterDTOList) {
                    characterDTOHashMap.put(characterDTO.getId(), characterDTO);
                    if (characterDTO.getCharactorDocValueDTOList() == null || characterDTO.getCharactorDocValueDTOList().size() <= 0) continue;
                    for (CharacterDocValueDTO characterDocValueDTO : characterDTO.getCharactorDocValueDTOList()) {
                        String key = characterDTO.getId() + "-" + characterDocValueDTO.getId();
                        characterValueHashMap.put(key, characterDocValueDTO);
                    }
                }
                ArrayList<ProductCharacterDTO> usedCharacterDTOList = new ArrayList<ProductCharacterDTO>();
                Iterator it = characterValueMap.entrySet().iterator();
                HashMap<String, List<ProductSpecItemAlbumDTO>> skuCharacterAlbumMap = this.getSkuCharacterAlbum(productId);
                while (it.hasNext()) {
                    Map.Entry entry = it.next();
                    String characterId = (String)entry.getKey();
                    List characterValueIdList = (List)entry.getValue();
                    CharacterDTO characterDTO = (CharacterDTO)characterDTOHashMap.get(Long.valueOf(characterId));
                    characterDTO.setCharactorDocValueDTOList(null);
                    ProductCharacterDTO productCharacterDTO = new ProductCharacterDTO();
                    BeanUtils.copyProperties((Object)characterDTO, (Object)productCharacterDTO);
                    ProductTplCharacter productTplCharacter = productTplCharacterMap.get(characterDTO.getId());
                    ArrayList<ProductCharacterDocValueDTO> characterDocValueDTOList = new ArrayList<ProductCharacterDocValueDTO>();
                    for (String characterValueId : characterValueIdList) {
                        CharacterDocValueDTO characterDocValueDTO = (CharacterDocValueDTO)characterValueHashMap.get(characterValueId);
                        if (characterDocValueDTO == null || characterDocValueDTOList.contains(characterDocValueDTO)) continue;
                        ProductCharacterDocValueDTO productCharacterDocValueDTO = new ProductCharacterDocValueDTO();
                        BeanUtils.copyProperties((Object)characterDocValueDTO, (Object)productCharacterDocValueDTO);
                        productCharacterDocValueDTO.setTemplateCharacterOrder(productTplCharacter.getIOrder());
                        String albumKey = characterDTO.getId() + "-" + productCharacterDocValueDTO.getId();
                        if (skuCharacterAlbumMap != null) {
                            List<ProductSpecItemAlbumDTO> productSpecItemAlbumDTOS = skuCharacterAlbumMap.get(albumKey);
                            productCharacterDocValueDTO.setAlbumDTOList(productSpecItemAlbumDTOS);
                        }
                        characterDocValueDTOList.add(productCharacterDocValueDTO);
                    }
                    productCharacterDTO.setCharactorValueDTOList(characterDocValueDTOList);
                    usedCharacterDTOList.add(productCharacterDTO);
                }
                return usedCharacterDTOList;
            }
        }
        return null;
    }

    private Map<Long, ProductTplCharacter> getCharactorFromTemplateByProductId(Long productId, Long characteristicsType) throws Exception {
        HashMap<Long, ProductTplCharacter> resultCharacterMap = new HashMap<Long, ProductTplCharacter>();
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").in(new Object[]{productId}));
        QuerySchema schema = QuerySchema.create().addSelect("productTemplate").addCondition((ConditionExpression)queryConditionGroup);
        List products = this.productSkuService.query("pc.product.Product", schema);
        if (CollectionUtils.isEmpty((Collection)products)) {
            return resultCharacterMap;
        }
        Long productTemplate = ((Product)products.get(0)).getProductTemplate();
        if (null == productTemplate) {
            return resultCharacterMap;
        }
        queryConditionGroup = new QueryConditionGroup();
        queryConditionGroup.addCondition(new ConditionExpression[]{QueryCondition.name((String)"characteristicsType").eq((Object)characteristicsType), QueryCondition.name((String)"template").eq((Object)productTemplate)});
        schema = QuerySchema.create().addSelect("character, iOrder").addCondition((ConditionExpression)queryConditionGroup);
        List productTplCharacterList = this.productSkuService.query("pc.tpl.ProductTplCharacter", schema);
        if (!CollectionUtils.isEmpty((Collection)productTplCharacterList)) {
            for (ProductTplCharacter productTplCharacter : productTplCharacterList) {
                resultCharacterMap.put(productTplCharacter.getCharacter(), productTplCharacter);
            }
        }
        return resultCharacterMap;
    }

    public List<CharacterDTO> listCharactorBySkuId(Long skuId) throws Exception {
        Map<Long, List<CharacterDTO>> skuCharacterMap = this.listCharactorBySkuIds(Arrays.asList(skuId));
        if (skuCharacterMap != null) {
            return skuCharacterMap.get(skuId);
        }
        return null;
    }

    public Map<Long, List<CharacterDTO>> listCharactorBySkuIds(List<Long> skuIdList, Boolean includeCharacter) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((List[])new List[]{skuIdList});
        List<SkuFreeCharacterDTO> skuFreeCharacterDTOList = this.getSkuFreeCharacter(skuIdList);
        HashMap<Long, ArrayList<SkuFreeCharacterDTO>> skuCharacterMap = new HashMap<Long, ArrayList<SkuFreeCharacterDTO>>();
        HashMap<String, CharacterDTO> characterDTOHashMap = new HashMap<String, CharacterDTO>();
        HashMap<String, CharacterDocValueDTO> characterValueDTOHashMap = new HashMap<String, CharacterDocValueDTO>();
        if (skuFreeCharacterDTOList != null && skuFreeCharacterDTOList.size() > 0) {
            ArrayList<Long> characterIdList = new ArrayList<Long>();
            for (SkuFreeCharacterDTO skuFreeCharacterDTO : skuFreeCharacterDTOList) {
                ArrayList<SkuFreeCharacterDTO> skuFreeCharacterDTOS = (ArrayList<SkuFreeCharacterDTO>)skuCharacterMap.get(skuFreeCharacterDTO.getSkuId());
                if (skuFreeCharacterDTOS == null) {
                    skuFreeCharacterDTOS = new ArrayList<SkuFreeCharacterDTO>();
                }
                skuFreeCharacterDTOS.add(skuFreeCharacterDTO);
                skuCharacterMap.put(skuFreeCharacterDTO.getSkuId(), skuFreeCharacterDTOS);
                characterIdList.add(Long.valueOf(skuFreeCharacterDTO.getCharacterId()));
            }
            List<CharacterDTO> characterDTOList = this.getCharacterDTOBySkuFreeCharacter(skuFreeCharacterDTOList, includeCharacter);
            if (characterDTOList != null) {
                for (CharacterDTO characterDTO : characterDTOList) {
                    characterDTOHashMap.put(characterDTO.getCode(), characterDTO);
                    for (CharacterDocValueDTO characterDocValueDTO : characterDTO.getCharactorDocValueDTOList()) {
                        characterValueDTOHashMap.put(characterDocValueDTO.getId(), characterDocValueDTO);
                    }
                }
            }
        }
        HashMap<Long, List<CharacterDTO>> skuCharacterListMap = new HashMap<Long, List<CharacterDTO>>(skuIdList.size());
        for (Long l : skuIdList) {
            List skuFreeCharacterDTO = (List)skuCharacterMap.get(l);
            if (null != skuFreeCharacterDTO) {
                ArrayList<CharacterDTO> skuCharacterDTOList = new ArrayList<CharacterDTO>();
                for (SkuFreeCharacterDTO freeCharacterDTO : skuFreeCharacterDTO) {
                    ArrayList<CharacterDocValueDTO> characterDocValueDTOS;
                    CharacterDTO characterDTO = new CharacterDTO();
                    CharacterDTO srcCharacterDTO = (CharacterDTO)characterDTOHashMap.get(freeCharacterDTO.getCharacterCode());
                    if (srcCharacterDTO != null) {
                        BeanUtils.copyProperties((Object)srcCharacterDTO, (Object)characterDTO);
                    }
                    CharacterDocValueDTO characterDocValueDTO = new CharacterDocValueDTO();
                    CharacterDocValueDTO srcCharacterDocValueDTO = (CharacterDocValueDTO)characterValueDTOHashMap.get(freeCharacterDTO.getCharacterValueId());
                    if (srcCharacterDocValueDTO != null) {
                        BeanUtils.copyProperties((Object)srcCharacterDocValueDTO, (Object)characterDocValueDTO);
                        characterDocValueDTOS = new ArrayList<CharacterDocValueDTO>();
                        characterDocValueDTOS.add(characterDocValueDTO);
                        characterDTO.setCharactorDocValueDTOList(characterDocValueDTOS);
                    } else {
                        characterDocValueDTO.setId(freeCharacterDTO.getCharacterValueId());
                        characterDocValueDTOS = new ArrayList();
                        characterDocValueDTOS.add(characterDocValueDTO);
                        characterDTO.setCharactorDocValueDTOList(characterDocValueDTOS);
                    }
                    skuCharacterDTOList.add(characterDTO);
                }
                skuCharacterListMap.put(l, skuCharacterDTOList);
                continue;
            }
            skuCharacterListMap.put(l, null);
        }
        return skuCharacterListMap;
    }

    public Map<Long, List<CharacterDTO>> listCharactorBySkuIds(List<Long> skuIdList) throws Exception {
        return this.listCharactorBySkuIds(skuIdList, true);
    }

    public List<String> listCharactorValueByProductId(Long productId, String charactorCode) throws Exception {
        if (null == charactorCode) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801376);
        }
        ProductDTO productDTO = this.productService.getProductById(productId, new String[]{"productTemplate"});
        if (productDTO != null && null != productDTO.getProductTemplate() && !this.isDynamicSKU(productDTO.getProductTemplate())) {
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId)});
            String field = FREECT_FIELD + charactorCode;
            QuerySchema schema = QuerySchema.create().addSelect(field).addCondition((ConditionExpression)queryConditionGroup);
            schema.distinct();
            List skuSensitiveList = MetaDaoHelper.query((String)"pc.product.ProductSKU", (QuerySchema)schema);
            if (skuSensitiveList != null && skuSensitiveList.size() > 0) {
                ArrayList<String> charactorValueList = new ArrayList<String>();
                skuSensitiveList.forEach(skuSensitive -> charactorValueList.add(skuSensitive.get(charactorCode).toString()));
                return charactorValueList;
            }
        }
        return null;
    }

    public List<Long> getProductIdsByCharactor(List<CharacterValueDTO> characterDTOList) throws Exception {
        UpcAPiTool.checkTenantInfo();
        if (characterDTOList != null && characterDTOList.size() > UpcAPiTool.List_LENGTH) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801377);
        }
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        for (CharacterValueDTO characterDTO : characterDTOList) {
            if (null == characterDTO.getCode() || null == characterDTO.getValue()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801375);
            }
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)(FREECT_FIELD + characterDTO.getCode())).eq(characterDTO.getValue()));
        }
        QuerySchema schema = QuerySchema.create().addSelect("productId").addCondition((ConditionExpression)queryConditionGroup);
        schema.distinct();
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        List productSKUList = MetaDaoHelper.query((String)"pc.product.ProductSKU", (QuerySchema)schema);
        if (productSKUList != null && productSKUList.size() > 0) {
            ArrayList<Long> productIdList = new ArrayList<Long>();
            for (Map stringObjectMap : productSKUList) {
                productIdList.add(Long.valueOf(stringObjectMap.get("productId").toString()));
            }
            return productIdList;
        }
        return null;
    }

    private List<Long> getProductSkuCharactor(Long productId) {
        List<Long> characterIds = this.productCharacterService.getSensitiveCharacterIdsByProduct(productId, CharacteristicsTypeEnum.IFreeCT.getValue(), SensitiveEnum.SKUSENS.getCode());
        return characterIds;
    }

    public List<CharacterDTO> getCharactorBySencitiveType(Integer characterType, Integer sensitiveType) throws Exception {
        return this.getCharactorBySencitiveType(characterType, sensitiveType, true);
    }

    private List<CharacterDTO> getCharactorBySencitiveType(Integer characterType, Integer sensitiveType, boolean needCharacterValue) throws Exception {
        HashMap<Long, List<Long>> characterIdMaps;
        SensitiveEnum sensitiveTypeEnum;
        CharacteristicsTypeEnum characteristicsType;
        Long characterTypeValue = null;
        String sensitiveTypeValue = null;
        if (characterType != null && (characteristicsType = CharacteristicsTypeEnum.find((Long)((Object)characterType))) != null) {
            characterTypeValue = characteristicsType.getValue();
        }
        if (sensitiveType != null && (sensitiveTypeEnum = SensitiveEnum.findByValue((Integer)sensitiveType)) != null) {
            sensitiveTypeValue = sensitiveTypeEnum.getCode();
        }
        if ((characterIdMaps = this.productCharacterService.getCharacterIdsByTplIds(null, characterTypeValue, sensitiveTypeValue)) != null && characterIdMaps.size() > 0) {
            ArrayList<Long> characterIds = new ArrayList<Long>();
            Iterator<Map.Entry<Long, List<Long>>> it = characterIdMaps.entrySet().iterator();
            while (it.hasNext()) {
                characterIds.addAll((Collection<Long>)it.next().getValue());
            }
            List<CharacterDTO> characterDTOList = this.getCharacterDTOByIds(characterIds, needCharacterValue);
            return characterDTOList;
        }
        return null;
    }

    public List<CharacterDTO> getCharacterBaseInfoBySensitiveType(Integer characterType, Integer sensitiveType) throws Exception {
        HashMap<Long, List<Long>> characterIdMaps;
        SensitiveEnum sensitiveTypeEnum;
        CharacteristicsTypeEnum characteristicsType;
        Long characterTypeValue = null;
        String sensitiveTypeValue = null;
        if (characterType != null && (characteristicsType = CharacteristicsTypeEnum.find((Long)((Object)characterType))) != null) {
            characterTypeValue = characteristicsType.getValue();
        }
        if (sensitiveType != null && (sensitiveTypeEnum = SensitiveEnum.findByValue((Integer)sensitiveType)) != null) {
            sensitiveTypeValue = sensitiveTypeEnum.getCode();
        }
        if ((characterIdMaps = this.productCharacterService.getCharacterIdsByTplIds(null, characterTypeValue, sensitiveTypeValue)) != null && characterIdMaps.size() > 0) {
            ArrayList<Long> characterIds = new ArrayList<Long>();
            Iterator<Map.Entry<Long, List<Long>>> it = characterIdMaps.entrySet().iterator();
            while (it.hasNext()) {
                characterIds.addAll((Collection<Long>)it.next().getValue());
            }
            List<CharacterDTO> characterDTOList = this.achiveDataQueryService.getCharacterDTOByIds(characterIds);
            return characterDTOList;
        }
        return null;
    }

    public HashMap<Long, List<CharacterDTO>> getCharactorByProductAndSencitiveType(List<Long> productIds, Integer characterType, Integer sensitiveType) throws Exception {
        return this.getCharactorByProductAndSencitiveType(productIds, characterType, sensitiveType, true);
    }

    public HashMap<Long, List<CharacterDTO>> getCharacterBaseInfoByProductAndSensitiveType(List<Long> productIds, Integer characterType, Integer sensitiveType) throws Exception {
        return this.getCharactorByProductAndSencitiveType(productIds, characterType, sensitiveType, false);
    }

    private HashMap<Long, List<CharacterDTO>> getCharactorByProductAndSencitiveType(List<Long> productIds, Integer characterType, Integer sensitiveType, boolean needCharacterValue) throws Exception {
        SensitiveEnum sensitiveTypeEnum;
        CharacteristicsTypeEnum characteristicsType;
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((List[])new List[]{productIds});
        Long characterTypeValue = null;
        String sensitiveTypeValue = null;
        if (characterType != null && (characteristicsType = CharacteristicsTypeEnum.find((Long)((Object)characterType))) != null) {
            characterTypeValue = characteristicsType.getValue();
        }
        if (sensitiveType != null && (sensitiveTypeEnum = SensitiveEnum.findByValue((Integer)sensitiveType)) != null) {
            sensitiveTypeValue = sensitiveTypeEnum.getCode();
        }
        ArrayList<Long> productTplIds = new ArrayList<Long>();
        if (productIds != null && productIds.size() > 0) {
            HashMap<Long, List<Long>> characterIdMaps;
            HashMap<Long, ArrayList<Long>> productTplMap = new HashMap<Long, ArrayList<Long>>();
            List<ProductDTO> productDTOList = this.productService.getProductByIds(productIds, new String[]{"id", "productTemplate"});
            for (ProductDTO productDTO : productDTOList) {
                if (productDTO.getProductTemplate() == null) continue;
                productTplIds.add(productDTO.getProductTemplate());
                ArrayList<Long> prodIdList = (ArrayList<Long>)productTplMap.get(productDTO.getProductTemplate());
                if (prodIdList == null) {
                    prodIdList = new ArrayList<Long>();
                }
                prodIdList.add(productDTO.getId());
                productTplMap.put(productDTO.getProductTemplate(), prodIdList);
            }
            if (null != productTplIds && productTplIds.size() > 0 && (characterIdMaps = this.productCharacterService.getCharacterIdsByTplIds(productTplIds, characterTypeValue, sensitiveTypeValue)) != null && characterIdMaps.size() > 0) {
                HashMap<Long, List<CharacterDTO>> productCharacterMap = new HashMap<Long, List<CharacterDTO>>();
                Iterator<Map.Entry<Long, List<Long>>> it = characterIdMaps.entrySet().iterator();
                ArrayList<Long> characterIds = new ArrayList<Long>();
                while (it.hasNext()) {
                    Map.Entry<Long, List<Long>> entry = it.next();
                    characterIds.addAll((Collection<Long>)entry.getValue());
                }
                List<CharacterDTO> characterDTOList = this.getCharacterDTOByIds(characterIds, needCharacterValue);
                if (characterDTOList != null && characterDTOList.size() > 0) {
                    HashMap characterDTOHashMap = new HashMap(characterDTOList.size());
                    characterDTOList.forEach(characterDTO -> characterDTOHashMap.put(characterDTO.getId(), characterDTO));
                    for (Map.Entry<Long, List<Long>> entry : characterIdMaps.entrySet()) {
                        Long tplId = entry.getKey();
                        List prodIdList = (List)productTplMap.get(tplId);
                        for (Long prodId : prodIdList) {
                            List<Long> tplCharacterIds = entry.getValue();
                            ArrayList characterDTOS = new ArrayList();
                            tplCharacterIds.forEach(characterId -> characterDTOS.add((CharacterDTO)characterDTOHashMap.get(characterId)));
                            productCharacterMap.put(prodId, characterDTOS);
                        }
                    }
                }
                return productCharacterMap;
            }
        }
        return null;
    }

    public SyncCharacterResult updateProductTplCharacter(SyncCharacteristicsDto syncCharacteristicsDto) throws Exception {
        SyncCharacterResult syncCharacterResult = new SyncCharacterResult();
        Long characteristicsType = syncCharacteristicsDto.getCharacteristicsType();
        Long characteristicsId = syncCharacteristicsDto.getCharacteristicsId();
        List newCharacters = syncCharacteristicsDto.getCharacters();
        if (null == characteristicsType || null == characteristicsId) {
            syncCharacterResult.setSuccess(false);
            syncCharacterResult.setResultMessage("characteristicsType or characteristicsId is null");
            return syncCharacterResult;
        }
        if (CollectionUtils.isEmpty((Collection)newCharacters)) {
            syncCharacterResult.setSuccess(true);
            return syncCharacterResult;
        }
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("ytenant", AppContext.getYTenantId());
        params.put("characteristicsId", characteristicsId);
        if (0 == syncCharacteristicsDto.getSyncType()) {
            List oldCharacters = SqlHelper.selectList((String)"com.yonyoucloud.upc.userdef.dao.ProductTplCharacter.selectInsertCharacters", params);
            if (!CollectionUtils.isEmpty((Collection)oldCharacters)) {
                List oldProductCharacterTplDTOList = JSON.parseArray((String)JSON.toJSONString((Object)oldCharacters), ProductCharacterTplDTO.class);
                ArrayList tplIdList = new ArrayList();
                ArrayList oldCharacterIdList = new ArrayList();
                oldProductCharacterTplDTOList.forEach(productCharacterTplDTO -> {
                    if (!tplIdList.contains(productCharacterTplDTO.getTplId())) {
                        tplIdList.add(productCharacterTplDTO.getTplId());
                    }
                    if (!oldCharacterIdList.contains(productCharacterTplDTO.getCharacterId())) {
                        oldCharacterIdList.add(productCharacterTplDTO.getCharacterId());
                    }
                });
                ArrayList insertCharacterTplDTOList = new ArrayList();
                newCharacters.forEach(newCharacter -> {
                    if (!oldCharacterIdList.contains(newCharacter.getId())) {
                        tplIdList.forEach(tplId -> {
                            ProductCharacterTplDTO productCharacterTplDTO = new ProductCharacterTplDTO();
                            productCharacterTplDTO.setId(Long.valueOf(IdManager.getInstance().nextId()));
                            productCharacterTplDTO.setTplId(tplId);
                            productCharacterTplDTO.setCharacteristicsTypeId(characteristicsType);
                            productCharacterTplDTO.setCharacteristicsId(characteristicsId);
                            productCharacterTplDTO.setDataType(Integer.valueOf(newCharacter.getType()));
                            productCharacterTplDTO.setCharacterId(newCharacter.getId());
                            productCharacterTplDTO.setCharacterCode(newCharacter.getCode());
                            productCharacterTplDTO.setYtenantId((String)AppContext.getYhtTenantId());
                            productCharacterTplDTO.setTenantId((Long)AppContext.getTenantId());
                            insertCharacterTplDTOList.add(productCharacterTplDTO);
                            if (insertCharacterTplDTOList.size() == 500) {
                                SqlHelper.insert((String)"com.yonyoucloud.upc.userdef.dao.ProductTplCharacter.insertProductTplCharacter", (Object)insertCharacterTplDTOList);
                                insertCharacterTplDTOList.clear();
                            }
                        });
                    }
                });
                if (insertCharacterTplDTOList.size() > 0) {
                    SqlHelper.insert((String)"com.yonyoucloud.upc.userdef.dao.ProductTplCharacter.insertProductTplCharacter", insertCharacterTplDTOList);
                }
            }
            syncCharacterResult.setSuccess(true);
            return syncCharacterResult;
        }
        if (1 == syncCharacteristicsDto.getSyncType()) {
            List referedTplProductList = SqlHelper.selectList((String)"com.yonyoucloud.upc.userdef.dao.ProductTplCharacter.selectReferedTplProduct", params);
            if (!CollectionUtils.isEmpty((Collection)referedTplProductList)) {
                int printLength = Math.min(referedTplProductList.size(), 10);
                StringBuilder errMsg = new StringBuilder();
                for (int i = 0; i < printLength; ++i) {
                    Map referedTplProduct = (Map)referedTplProductList.get(i);
                    String characterCode = referedTplProduct.get("characterCode").toString();
                    String tplName = referedTplProduct.get("tplName").toString();
                    String productName = referedTplProduct.get("productName").toString();
                    errMsg.append(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080905", (String)"\u7269\u6599\u6a21\u677f\uff1a")).append(tplName).append(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080906", (String)"\u5df2\u5173\u8054\u7279\u5f81(\uff1a")).append(characterCode).append(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080904", (String)")\uff0c\u5e76\u4e14\u8be5\u6a21\u677f\u5df2\u7ecf\u88ab\u7269\u6599\uff1a")).append(productName).append(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080907", (String)"\u5f15\u7528\uff0c\u65e0\u6cd5\u5220\u9664\u6a21\u677f\u7279\u5f81\u5173\u7cfb\n"));
                }
                syncCharacterResult.setSuccess(false);
                syncCharacterResult.setResultMessage(errMsg.toString());
                return syncCharacterResult;
            }
            SqlHelper.delete((String)"com.yonyoucloud.upc.userdef.dao.ProductTplCharacter.deleteTplCharacters", params);
            syncCharacterResult.setSuccess(true);
            return syncCharacterResult;
        }
        syncCharacterResult.setSuccess(true);
        return syncCharacterResult;
    }

    public List<ProductTplCharacterDTO> getSensitiveInfoByProduct(List<Long> productIds, Long characteristicsType) throws Exception {
        if (CollectionUtils.isEmpty(productIds) || Objects.isNull(characteristicsType)) {
            return null;
        }
        HashMap<String, Object> param = new HashMap<String, Object>(3);
        param.put("productIds", productIds);
        param.put("characteristicsType", characteristicsType);
        param.put("ytenant", AppContext.getYTenantId());
        List productTplCharacterMaps = SqlHelper.selectList((String)"com.yonyoucloud.upc.mapper.productcharacter.getSensitiveCharactersByProduct", param);
        if (CollectionUtils.isEmpty((Collection)productTplCharacterMaps)) {
            return null;
        }
        return JSON.parseArray((String)JSON.toJSONString((Object)productTplCharacterMaps), ProductTplCharacterDTO.class);
    }

    public List<ProductTplCharacterDTO> getSensitiveInfoByProductTpl(List<Long> productTplIds, Long characteristicsType) throws Exception {
        if (CollectionUtils.isEmpty(productTplIds) || Objects.isNull(characteristicsType)) {
            return null;
        }
        HashMap<String, Object> param = new HashMap<String, Object>(3);
        param.put("productTplIds", productTplIds);
        param.put("characteristicsType", characteristicsType);
        param.put("ytenant", AppContext.getYTenantId());
        List productTplCharacterMaps = SqlHelper.selectList((String)"com.yonyoucloud.upc.mapper.productcharacter.getSensitiveCharactersByProductTpl", param);
        if (CollectionUtils.isEmpty((Collection)productTplCharacterMaps)) {
            return null;
        }
        return JSON.parseArray((String)JSON.toJSONString((Object)productTplCharacterMaps), ProductTplCharacterDTO.class);
    }

    public List<Long> getCharacterIdsByProductAndSensitive(Long productId, Long characteristicsType, String sensitive) throws Exception {
        return this.productCharacterService.getSensitiveCharacterIdsByProduct(productId, characteristicsType, sensitive);
    }

    public List<CharacterDTO> getCharactor(Long productId) {
        List<Long> characterIds = this.getProductSkuCharactor(productId);
        List<CharacterDTO> CharacterDTOList = this.getCharacterDTOByIds(characterIds, true);
        return CharacterDTOList;
    }

    private List<SkuMatchDTO> dynamicSkuByCharacter(List<SkuMatchDTO> skuMatchDTOList) throws Exception {
        Object characterCode;
        Long productTplId;
        ArrayList<SkuMatchDTO> dynamicSkuList = new ArrayList<SkuMatchDTO>();
        ArrayList<Long> tplList = new ArrayList<Long>(skuMatchDTOList.size());
        ArrayList<Long> productIdList = new ArrayList<Long>(skuMatchDTOList.size());
        for (SkuMatchDTO skuMatchDTO : skuMatchDTOList) {
            tplList.add(skuMatchDTO.getProductTplId());
            productIdList.add(skuMatchDTO.getProductId());
        }
        List<ProductDTO> productDTOList = this.productService.getProductByIds(productIdList, new String[]{"id", "name"});
        HashMap<Long, String> productMap = new HashMap<Long, String>();
        for (ProductDTO productDTO : productDTOList) {
            productMap.put(productDTO.getId(), productDTO.getName());
        }
        HashMap<Long, List<ProductTplCharacter>> prodcutTplCharacterMap = this.productCharacterService.getCharacterByTplIds(tplList, CharacteristicsTypeEnum.IFreeCT.getValue(), SensitiveEnum.SKUSENS.getCode());
        HashMap<String, ProductTplCharacter> characterCodeAndObjMap = new HashMap<String, ProductTplCharacter>();
        Iterator<Map.Entry<Long, List<ProductTplCharacter>>> it = prodcutTplCharacterMap.entrySet().iterator();
        ArrayList<Long> characterIds = new ArrayList<Long>();
        while (it.hasNext()) {
            Map.Entry<Long, List<ProductTplCharacter>> entry = it.next();
            List<ProductTplCharacter> productTplCharacterList = entry.getValue();
            if (productTplCharacterList == null) continue;
            for (ProductTplCharacter productTplCharacter : productTplCharacterList) {
                characterIds.add(productTplCharacter.getCharacter());
                characterCodeAndObjMap.put(productTplCharacter.getCharacterCode(), productTplCharacter);
            }
        }
        HashMap<Long, Boolean> involveSKUNamingMap = new HashMap<Long, Boolean>();
        HashMap<Long, String> nameSpacerMap = new HashMap<Long, String>();
        String nameSpacerBytemplateId = "";
        HashMap<Long, List<String>> characterAndValuesMap = new HashMap<Long, List<String>>();
        for (SkuMatchDTO skuMatchDTO : skuMatchDTOList) {
            ProductTplCharacter productTplCharacter;
            Object characterValueDTO2;
            productTplId = skuMatchDTO.getProductTplId();
            if (null == nameSpacerMap.get(productTplId)) {
                this.queryTplData(involveSKUNamingMap, nameSpacerMap, productTplId);
            }
            nameSpacerBytemplateId = (String)nameSpacerMap.get(productTplId);
            List characterValueDTOList = skuMatchDTO.getCharacterValueDTOList();
            if (CollectionUtils.isEmpty((Collection)characterValueDTOList)) continue;
            HashMap<String, Object> characterIdValueMap = new HashMap<String, Object>(characterValueDTOList.size());
            for (Object characterValueDTO2 : characterValueDTOList) {
                characterIdValueMap.put(characterValueDTO2.getCode(), characterValueDTO2.getValue());
                productTplCharacter = (ProductTplCharacter)characterCodeAndObjMap.get(characterValueDTO2.getCode());
                Long characterId = productTplCharacter.getCharacter();
                if (!characterAndValuesMap.containsKey(characterId)) {
                    characterAndValuesMap.put(characterId, new ArrayList());
                }
                List valueIds = (List)characterAndValuesMap.get(characterId);
                if (ObjectUtils.isNotEmpty((Object)characterValueDTO2.getValue())) {
                    valueIds.add(characterValueDTO2.getValue().toString());
                }
                if (CollectionUtils.isEmpty((Collection)characterValueDTO2.getValueList())) continue;
                for (Object value : characterValueDTO2.getValueList()) {
                    if (!ObjectUtils.isNotEmpty(value)) continue;
                    valueIds.add(value.toString());
                }
            }
            List<ProductTplCharacter> productTplCharacters = prodcutTplCharacterMap.get(productTplId);
            characterValueDTO2 = productTplCharacters.iterator();
            while (characterValueDTO2.hasNext()) {
                productTplCharacter = (ProductTplCharacter)characterValueDTO2.next();
                characterCode = productTplCharacter.getCharacterCode();
                if (characterIdValueMap.containsKey(characterCode)) continue;
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801378, new Object[]{skuMatchDTO.toString(), productTplCharacter.getCharacter()});
            }
        }
        List<CharacterDTO> characterDTOList = this.getCharacterDTOByIdAndValues(characterIds, characterAndValuesMap);
        HashMap<String, String> characterNameMap = new HashMap<String, String>();
        HashMap<String, Long> characterValueMap = new HashMap<String, Long>();
        if (characterDTOList != null) {
            for (CharacterDTO characterDTO : characterDTOList) {
                characterNameMap.put(characterDTO.getId().toString(), characterDTO.getName());
                List charactorDocValueDTOList = characterDTO.getCharactorDocValueDTOList();
                if (charactorDocValueDTOList == null) continue;
                characterCode = charactorDocValueDTOList.iterator();
                while (characterCode.hasNext()) {
                    CharacterDocValueDTO characterDocValueDTO = (CharacterDocValueDTO)characterCode.next();
                    characterNameMap.put(characterDocValueDTO.getId(), characterDocValueDTO.getName());
                    characterValueMap.put(characterDocValueDTO.getId(), characterDTO.getId());
                }
            }
        }
        ArrayHashMap skuMatchDTOMap = new ArrayHashMap();
        HashMap<Long, Product> productIdSkusMap = new HashMap<Long, Product>();
        for (SkuMatchDTO skuMatchDTO : skuMatchDTOList) {
            Product product;
            SkuFreeCharacter skuFreeCharacter = new SkuFreeCharacter();
            skuFreeCharacter.setEntityStatus(EntityStatus.Insert);
            StringBuilder idStr = new StringBuilder();
            ArrayList<ProductFreeCharacterItem> productFreeCharacterItems = new ArrayList<ProductFreeCharacterItem>();
            StringBuilder sbFreeValues = new StringBuilder();
            StringBuilder specName = new StringBuilder();
            ArrayList<String> characterValueIds = new ArrayList<String>();
            HashMap<Long, Object> characterIdAndvalueIdsMap = new HashMap<Long, Object>();
            for (CharacterValueDTO characterValueDTO : skuMatchDTO.getCharacterValueDTOList()) {
                Object characterValue = null;
                if (characterValueDTO.getValue() != null) {
                    characterValue = characterValueDTO.getValue().toString();
                } else if (characterValueDTO.getValueList() != null && characterValueDTO.getValueList().size() > 0) {
                    characterValue = characterValueDTO.getValueList().get(0).toString();
                }
                characterValueIds.add((String)characterValue);
                skuFreeCharacter.put(characterValueDTO.getCode(), characterValue);
                idStr.append(";").append((String)characterValue);
                sbFreeValues.append((String)characterValue).append(";");
                Long characterId = (Long)characterValueMap.get(characterValue);
                String characterName = characterId == null ? "" : (String)characterNameMap.get(characterId.toString());
                String characterValueName = (String)characterNameMap.get(characterValue);
                characterIdAndvalueIdsMap.put(characterId, characterValue);
                specName.append(characterName).append(":").append(characterValueName).append(";");
                ProductFreeCharacterItem productFreeCharacterItem = new ProductFreeCharacterItem();
                List<ProductTplCharacter> productTplCharacterList = prodcutTplCharacterMap.get(skuMatchDTO.getProductTplId());
                if (productTplCharacterList != null) {
                    productFreeCharacterItem.setCharacteristicsId(productTplCharacterList.get(0).getCharacteristics());
                }
                productFreeCharacterItem.setCharacterCode(characterValueDTO.getCode());
                productFreeCharacterItem.setCharacterId(characterId);
                productFreeCharacterItem.setCharacterValueId((String)characterValue);
                productFreeCharacterItem.setHaveImg(Integer.valueOf(0));
                productFreeCharacterItem.setIOrder(Integer.valueOf(0));
                productFreeCharacterItem.setEntityStatus(EntityStatus.Insert);
                productFreeCharacterItems.add(productFreeCharacterItem);
            }
            StringBuilder skuName = new StringBuilder();
            productTplId = skuMatchDTO.getProductTplId();
            if (BooleanUtil.isTrue(involveSKUNamingMap.get(productTplId))) {
                skuName.append((String)productMap.get(skuMatchDTO.getProductId()));
            }
            List<ProductTplCharacter> productTplCharacters = prodcutTplCharacterMap.get(skuMatchDTO.getProductTplId());
            for (ProductTplCharacter productTplCharacter : productTplCharacters) {
                Long characterId = productTplCharacter.getCharacter();
                String characterValueId = (String)characterIdAndvalueIdsMap.get(characterId);
                String characterValueName = (String)characterNameMap.get(characterValueId);
                if (!StringUtils.isEmpty((CharSequence)skuName)) {
                    skuName.append(nameSpacerBytemplateId);
                }
                skuName.append(characterValueName);
            }
            if (!productIdSkusMap.containsKey(skuMatchDTO.getProductId())) {
                product = new Product();
                product.setId((Object)skuMatchDTO.getProductId());
                product.setProductfreecharacteritems(new ArrayList());
                product.setProductskus(new ArrayList());
                product.setEntityStatus(EntityStatus.Update);
                productIdSkusMap.put(skuMatchDTO.getProductId(), product);
            }
            product = (Product)productIdSkusMap.get(skuMatchDTO.getProductId());
            List productskus = product.productskus();
            ProductSKU sku = new ProductSKU();
            sku.put("skuFreeCharacter", (Object)skuFreeCharacter);
            sku.setFreeValueIds(idStr.substring(1, idStr.length()));
            if (skuName.length() > 255) {
                sku.setName(skuName.substring(0, 255));
            } else {
                sku.setName(skuName.toString());
            }
            sku.put("name", (Object)MultiLangUtils.buildMultilangText((String)sku.getName()).toMap());
            sku.setIsStandard(UPCConstants.TRUE_INT);
            sku.setSpecs(specName.toString());
            sku.setFreeValues(specName.toString());
            sku.setEntityStatus(EntityStatus.Insert);
            characterValueIds.add(skuMatchDTO.getProductId().toString());
            String md5Key = UpcStringUtil.sortStrMd5(characterValueIds);
            if (null == skuMatchDTOMap.get(md5Key)) {
                productskus.add(sku);
                skuMatchDTOMap.put(md5Key, new ArrayList());
                List productfreecharacteritems = product.productfreecharacteritems();
                productfreecharacteritems.addAll(productFreeCharacterItems);
            }
            List skuMatchDTOS = (List)skuMatchDTOMap.get(md5Key);
            skuMatchDTOS.add(skuMatchDTO);
        }
        if (!productIdSkusMap.isEmpty()) {
            for (Map.Entry next : productIdSkusMap.entrySet()) {
                Product product = (Product)next.getValue();
                BillDataDto bill = new BillDataDto();
                bill.setBillnum("pc_productsku_add");
                bill.setData((Object)product);
                RuleExecuteResult ruleExecuteResult = this.billService.executeUpdate("save", bill);
                Map data = (Map)ruleExecuteResult.getData();
                Object productskus = data.get("productskus");
                if (productskus == null) continue;
                List skuList = JSON.parseArray((String)JSON.toJSONString(productskus), Map.class);
                for (Map skuMap : skuList) {
                    ProductSkuDTO productSkuDTO = new ProductSkuDTO();
                    productSkuDTO.setId(Long.valueOf(skuMap.get("id").toString()));
                    productSkuDTO.setCode(skuMap.get("code").toString());
                    List skuMatchDTOS = (List)skuMatchDTOMap.get(skuMap.get(FREE_VALUE_IDS_MD5));
                    for (SkuMatchDTO skuMatchDTO : skuMatchDTOS) {
                        skuMatchDTO.setMatchProductSkuDTO(productSkuDTO);
                        dynamicSkuList.add(skuMatchDTO);
                    }
                }
            }
        }
        return dynamicSkuList;
    }

    private void queryTplData(Map<Long, Boolean> involveSKUNamingMap, Map<Long, String> nameSpacerMap, Long productTplId) throws Exception {
        Map templateMap = ProductUtil.getTplMap(productTplId);
        String nameSpacer = "";
        if (null != templateMap && null != templateMap.get("nameSpacer")) {
            nameSpacer = templateMap.get("nameSpacer").toString();
        }
        nameSpacer = ProductUtil.convertNameSpacer(nameSpacer);
        nameSpacerMap.put(productTplId, nameSpacer);
        if (BooleanUtil.isTrue(templateMap.get("involveSKUNaming"))) {
            involveSKUNamingMap.put(productTplId, true);
        } else {
            involveSKUNamingMap.put(productTplId, false);
        }
    }

    private List<SkuMatchDTO> filterSkuDynamic(List<SkuMatchDTO> skuMatchDTOList) throws Exception {
        ArrayList<Long> productIdList = new ArrayList<Long>();
        for (SkuMatchDTO skuMatchDTO : skuMatchDTOList) {
            productIdList.add(skuMatchDTO.getProductId());
        }
        List<ProductDTO> productDTOList = this.productService.getProductByIds(productIdList, new String[]{"id", "productTemplate", "productTemplateSkuDynamic"});
        if (productDTOList != null && productDTOList.size() > 0) {
            HashMap<Long, ProductDTO> productMap = new HashMap<Long, ProductDTO>(productDTOList.size());
            for (ProductDTO productDTO : productDTOList) {
                if (null == productDTO.getProductTemplateSkuDynamic() || !productDTO.getProductTemplateSkuDynamic().booleanValue()) continue;
                productMap.put(productDTO.getId(), productDTO);
            }
            ArrayList<SkuMatchDTO> dynamicSkuList = new ArrayList<SkuMatchDTO>();
            for (SkuMatchDTO skuMatchDTO : skuMatchDTOList) {
                ProductDTO productDTO = (ProductDTO)productMap.get(skuMatchDTO.getProductId());
                if (null == productDTO || null == productDTO.getProductTemplateSkuDynamic() || !productDTO.getProductTemplateSkuDynamic().booleanValue()) continue;
                skuMatchDTO.setSkuDynamicFlag(Boolean.valueOf(true));
                skuMatchDTO.setProductTplId(productDTO.getProductTemplate());
                dynamicSkuList.add(skuMatchDTO);
            }
            return dynamicSkuList;
        }
        return null;
    }

    private List<CharacterDTO> getCharacterDTOBySkuFreeCharacter(List<SkuFreeCharacterDTO> skuFreeCharacterDTOS, boolean includeCharacter) throws Exception {
        ArrayList<CharacterDTO> characterDTOList = new ArrayList<CharacterDTO>();
        HashMap<String, ArrayList<String>> characterIdAndValuesMap = new HashMap<String, ArrayList<String>>();
        for (SkuFreeCharacterDTO skuFreeCharacter : skuFreeCharacterDTOS) {
            String characterId = skuFreeCharacter.getCharacterId();
            ArrayList<String> values = (ArrayList<String>)characterIdAndValuesMap.get(characterId);
            if (null == values) {
                values = new ArrayList<String>();
                characterIdAndValuesMap.put(characterId, values);
            }
            values.add(skuFreeCharacter.getCharacterValueId());
        }
        for (Map.Entry next : characterIdAndValuesMap.entrySet()) {
            CharacterDTO characterDTO;
            String key = (String)next.getKey();
            Long characterId = Long.parseLong(key);
            List values = (List)next.getValue();
            if (includeCharacter) {
                characterDTO = this.achiveDataQueryService.getCharacterByIdAndValueIds(characterId, values, false);
                characterDTOList.add(characterDTO);
                continue;
            }
            characterDTO = this.achiveDataQueryService.getCharacterDTOById(characterId);
            characterDTOList.add(characterDTO);
        }
        return characterDTOList;
    }

    public List<CharacterDTO> getCharacterDTOByIds(List<Long> characterIds, boolean needCharacterValue) {
        ArrayList<CharacterDTO> characterDTOList = new ArrayList<CharacterDTO>();
        try {
            ArrayList distinctCharacterIds = ObjectUtils.isEmpty(characterIds) ? new ArrayList() : characterIds.stream().distinct().collect(Collectors.toList());
            for (Long characterId : distinctCharacterIds) {
                CharacterDTO characterDTO;
                if (needCharacterValue) {
                    characterDTO = this.achiveDataQueryService.getCharacterByIdAndValueIds(characterId, null, false);
                    characterDTOList.add(characterDTO);
                    continue;
                }
                characterDTO = this.achiveDataQueryService.getCharacterDTOById(characterId);
                characterDTOList.add(characterDTO);
            }
        }
        catch (Exception e) {
            log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040808FE", (String)"\u8c03\u7528\u7279\u5f81\u670d\u52a1\uff0c\u83b7\u53d6\u7279\u5f81\u4fe1\u606f\u5931\u8d25"), (Throwable)e);
        }
        return characterDTOList;
    }

    public List<CharacterDTO> getCharacterDTOByIdAndValues(List<Long> characterIds, Map<Long, List<String>> characterAndValuesMap) throws Exception {
        ArrayList<CharacterDTO> characterDTOList = new ArrayList<CharacterDTO>();
        for (Long characterId : characterIds) {
            CharacterDTO characterDTO = this.achiveDataQueryService.getCharacterByIdAndValueIds(characterId, characterAndValuesMap.get(characterId), false);
            characterDTOList.add(characterDTO);
        }
        return characterDTOList;
    }

    private boolean isDynamicSKU(Long productTplId) throws Exception {
        try {
            List productSKUMap = MetaDaoHelper.queryById((String)"pc.tpl.ProductTpl", (String)SKU_BUSINESS_DYNAMIC_ATTR, (Object)productTplId);
            if (productSKUMap != null && productSKUMap.size() > 0) {
                return Boolean.valueOf(((Map)productSKUMap.get(0)).get(SKU_BUSINESS_DYNAMIC_ATTR).toString());
            }
        }
        catch (Exception e) {
            log.error(e.getMessage(), (Throwable)e);
            throw e;
        }
        return Boolean.FALSE;
    }

    private List<SkuFreeCharacterDTO> getSkuFreeCharacter(List<Long> skuIdList) throws Exception {
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        if (skuIdList != null && skuIdList.size() > 0) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"skuId").in(skuIdList));
        }
        QuerySchema schema = QuerySchema.create().addSelect("skuId,characterId,characterCode,characterValueId").addCondition((ConditionExpression)queryConditionGroup);
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        try {
            List skuFreeCharacterList = MetaDaoHelper.query((String)"pc.product.SkuFreeCharacterItem", (QuerySchema)schema);
            if (skuFreeCharacterList != null && skuFreeCharacterList.size() > 0) {
                return JSON.parseArray((String)JSON.toJSONString((Object)skuFreeCharacterList), SkuFreeCharacterDTO.class);
            }
        }
        catch (Exception e) {
            log.error(e.getMessage(), (Throwable)e);
            throw e;
        }
        return null;
    }

    private List<SkuFreeCharacterDTO> getSkuFreeCharacter(Long productId) throws Exception {
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productId").in(new Object[]{productId}));
        QuerySchema schema = QuerySchema.create().addSelect("characterId,characterCode,characterValueId").addCondition((ConditionExpression)queryConditionGroup);
        schema.distinct();
        try {
            List skuFreeCharacterList = MetaDaoHelper.query((String)"pc.product.SkuFreeCharacterItem", (QuerySchema)schema);
            if (skuFreeCharacterList != null && skuFreeCharacterList.size() > 0) {
                return JSON.parseArray((String)JSON.toJSONString((Object)skuFreeCharacterList), SkuFreeCharacterDTO.class);
            }
        }
        catch (Exception e) {
            log.error(e.getMessage(), (Throwable)e);
            throw e;
        }
        return null;
    }

    private List<ProductFreeCharacterDTO> getProductFreeCharacter(List<Long> productIds) throws Exception {
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productId").in(productIds));
        QuerySchema schema = QuerySchema.create().addSelect("id,productId,characterId,characterCode,characterValueId, imgBusinessId").addCondition((ConditionExpression)queryConditionGroup);
        try {
            List skuFreeCharacterList = MetaDaoHelper.query((String)"pc.product.ProductFreeCharacterItem", (QuerySchema)schema);
            if (skuFreeCharacterList != null && skuFreeCharacterList.size() > 0) {
                return JSON.parseArray((String)JSON.toJSONString((Object)skuFreeCharacterList), ProductFreeCharacterDTO.class);
            }
        }
        catch (Exception e) {
            log.error(e.getMessage(), (Throwable)e);
            throw e;
        }
        return null;
    }

    private HashMap<String, List<ProductSpecItemAlbumDTO>> getSkuCharacterAlbum(Long productId) throws Exception {
        List<ProductFreeCharacterDTO> skuFreeCharacterList = this.getProductFreeCharacter(Arrays.asList(productId));
        if (skuFreeCharacterList != null && skuFreeCharacterList.size() > 0) {
            HashMap<String, List<ProductSpecItemAlbumDTO>> characterAlbumMap = new HashMap<String, List<ProductSpecItemAlbumDTO>>();
            ArrayList<String> businessIdList = new ArrayList<String>();
            HashMap<String, ProductFreeCharacterDTO> businessAndCharacterItemsMap = new HashMap<String, ProductFreeCharacterDTO>();
            for (ProductFreeCharacterDTO productFreeCharacterDTO : skuFreeCharacterList) {
                if (null == productFreeCharacterDTO.getImgBusinessId()) continue;
                businessIdList.add(productFreeCharacterDTO.getImgBusinessId());
                businessAndCharacterItemsMap.put(productFreeCharacterDTO.getImgBusinessId(), productFreeCharacterDTO);
            }
            if (!CollectionUtils.isEmpty(businessIdList)) {
                ArrayList<BatchBusinessFilesRequest> batchBusinessFilesRequestList = new ArrayList<BatchBusinessFilesRequest>();
                BatchBusinessFilesRequest batchBusinessFilesRequest = new BatchBusinessFilesRequest();
                batchBusinessFilesRequest.setBusinessType("iuap-apdoc-material");
                batchBusinessFilesRequest.setBusinessIds(businessIdList);
                batchBusinessFilesRequest.setCancelFileExit(Boolean.valueOf(true));
                batchBusinessFilesRequestList.add(batchBusinessFilesRequest);
                CooperationSuiteFile cooperationSuiteFile = this.cooperationFileService.batchBusinessFiles(batchBusinessFilesRequestList);
                List cooperationFileInfoList = cooperationSuiteFile.getData();
                if (!CollectionUtils.isEmpty((Collection)cooperationFileInfoList)) {
                    cooperationFileInfoList.forEach(cooperationFileVO -> {
                        String objectId = cooperationFileVO.getObjectId();
                        ProductFreeCharacterDTO productFreeCharacterDTO = (ProductFreeCharacterDTO)businessAndCharacterItemsMap.get(objectId);
                        if (null != productFreeCharacterDTO) {
                            String key = productFreeCharacterDTO.getCharacterId() + "-" + productFreeCharacterDTO.getCharacterValueId();
                            if (null == characterAlbumMap.get(key)) {
                                characterAlbumMap.put(key, new ArrayList());
                            }
                            List productSpecItemAlbumDTOS = (List)characterAlbumMap.get(key);
                            ProductSpecItemAlbumDTO productSpecItemAlbumDTO = new ProductSpecItemAlbumDTO();
                            productSpecItemAlbumDTO.setProductId(productId);
                            productSpecItemAlbumDTO.setProductFreeCharacterItemId(productFreeCharacterDTO.getId());
                            productSpecItemAlbumDTO.setFolder(cooperationFileVO.getBucketUrl());
                            productSpecItemAlbumDTO.setImgName(cooperationFileVO.getFileName());
                            productSpecItemAlbumDTOS.add(productSpecItemAlbumDTO);
                        }
                    });
                }
            }
            return characterAlbumMap;
        }
        return null;
    }

    public HashMap<String, List<Long>> listProductTplIdByCharactristicIds(List<String> characteristicsIds) throws Exception {
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"characteristics").in(characteristicsIds));
        QuerySchema schema = QuerySchema.create().addSelect("template,characteristics").addCondition((ConditionExpression)queryConditionGroup);
        try {
            List characterList = MetaDaoHelper.query((String)"pc.tpl.ProductTplCharacter", (QuerySchema)schema);
            HashMap<String, List<Long>> productTplMap = new HashMap<String, List<Long>>();
            if (characterList != null && characterList.size() > 0) {
                characterList.forEach(map -> {
                    String characteristicsId = map.get("characteristics").toString();
                    Long tplId = Long.valueOf(map.get("template").toString());
                    ArrayList<Long> tplIdList = (ArrayList<Long>)productTplMap.get(characteristicsId);
                    if (tplIdList == null) {
                        tplIdList = new ArrayList<Long>();
                    }
                    if (!tplIdList.contains(tplId)) {
                        tplIdList.add(tplId);
                    }
                    productTplMap.put(characteristicsId, tplIdList);
                });
            }
            return productTplMap;
        }
        catch (Exception e) {
            log.error(e.getMessage(), (Throwable)e);
            throw e;
        }
    }

    public SensitiveInfoAndProduct getSensitiveInfoAndProduct(List<Long> productIds, Long characteristicsType) {
        if (CollectionUtils.isEmpty(productIds)) {
            return null;
        }
        HashMap<String, Object> productListParam = new HashMap<String, Object>(3);
        productListParam.put("productIds", productIds);
        productListParam.put("ytenant", AppContext.getYTenantId());
        List productList = SqlHelper.selectList((String)"com.yonyoucloud.upc.mapper.productcharacter.getProductListByIds", productListParam);
        HashSet<Long> productTplIdSet = new HashSet<Long>();
        for (ProductDTO productDTO : productList) {
            productTplIdSet.add(productDTO.getProductTemplate());
        }
        if (!CollectionUtils.isEmpty(productTplIdSet)) {
            HashMap<String, Object> tplCharacterListParam = new HashMap<String, Object>(3);
            tplCharacterListParam.put("productTplIds", new ArrayList(productTplIdSet));
            tplCharacterListParam.put("characteristicsType", characteristicsType);
            tplCharacterListParam.put("ytenant", AppContext.getYTenantId());
            List tplCharacterList = SqlHelper.selectList((String)"com.yonyoucloud.upc.mapper.productcharacter.getSensitiveCharactersByProductTpl", tplCharacterListParam);
            return new SensitiveInfoAndProduct(productList, tplCharacterList);
        }
        return new SensitiveInfoAndProduct(productList, null);
    }

    public List<ProductFreeCharacterItemQryDto> listrFreeCharacterItemAndAlbums(List<ProductFreeCharacterItemQryDto> productFreeCharacterItemQryDtos) throws Exception {
        if (CollectionUtils.isEmpty(productFreeCharacterItemQryDtos)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801141);
        }
        if (productFreeCharacterItemQryDtos.size() > 10) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801379);
        }
        ArrayList<Long> productIdsList = new ArrayList<Long>();
        ArrayList characterValueIdsList = new ArrayList();
        for (ProductFreeCharacterItemQryDto productFreeCharacterItemQryDto : productFreeCharacterItemQryDtos) {
            Long productId = productFreeCharacterItemQryDto.getProductId();
            productIdsList.add(productId);
            List characterValueIds = productFreeCharacterItemQryDto.getCharacterValueIds();
            if (CollectionUtils.isEmpty((Collection)characterValueIds)) continue;
            characterValueIdsList.addAll(characterValueIds);
        }
        if (CollectionUtils.isEmpty(productIdsList)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801380);
        }
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        if (!CollectionUtils.isEmpty(characterValueIdsList)) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"characterValueId").in(characterValueIdsList));
        }
        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productId").in(productIdsList));
        QuerySchema schema = QuerySchema.create().addSelect("id, productId, characterId, characterCode, characterValueId,imgBusinessId").addCondition((ConditionExpression)queryConditionGroup);
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        List<ProductFreeCharacterItemQryDto> resultList = null;
        List productFreeCharacterItems = MetaDaoHelper.query((String)"pc.product.ProductFreeCharacterItem", (QuerySchema)schema);
        if (null != productFreeCharacterItems && productFreeCharacterItems.size() > 0) {
            resultList = this.getCharacterInfoWithCooperationAblume(productFreeCharacterItems);
        }
        return resultList;
    }

    @NotNull
    private List<ProductFreeCharacterItemQryDto> getCharacterInfoWithCooperationAblume(List<Map<String, Object>> productFreeCharacterItems) {
        ArrayList<ProductFreeCharacterItemDto> freeCharacterItemDtos = new ArrayList<ProductFreeCharacterItemDto>();
        HashMap<String, String> characterBusinessIdMap = new HashMap<String, String>();
        ArrayList<String> businessIds = new ArrayList<String>();
        for (Map<String, Object> item : productFreeCharacterItems) {
            Long productId = Long.parseLong(item.get("productId").toString());
            String characterId = item.get("characterId").toString();
            String characterValueId = item.get("characterValueId").toString();
            ProductFreeCharacterItemDto productFreeCharacterItemDto = new ProductFreeCharacterItemDto();
            productFreeCharacterItemDto.setProductId(productId);
            productFreeCharacterItemDto.setCharacterId(characterId);
            productFreeCharacterItemDto.setCharacterValueId(characterValueId);
            freeCharacterItemDtos.add(productFreeCharacterItemDto);
            Object imgBusinessId = item.get("imgBusinessId");
            if (null == imgBusinessId) continue;
            String businessKey = characterId + "#" + characterValueId;
            characterBusinessIdMap.put(businessKey, imgBusinessId.toString());
            businessIds.add(imgBusinessId.toString());
        }
        if (null != businessIds && businessIds.size() > 0) {
            HashMap<String, List<ProductSpecItemAlbumDTO>> albumMap = this.getAlbumByBusinessIds(businessIds);
            freeCharacterItemDtos.forEach(freeCharacterItemDto -> {
                String businessKey = freeCharacterItemDto.getCharacterId() + "#" + freeCharacterItemDto.getCharacterValueId();
                String businessId = (String)characterBusinessIdMap.get(businessKey);
                if (StringUtils.isNotEmpty((CharSequence)businessId)) {
                    freeCharacterItemDto.setProductSpecItemAlbumDTOs((List)albumMap.get(businessId));
                }
            });
        }
        Map<Long, List<ProductFreeCharacterItemDto>> groupedByProductIDMap = freeCharacterItemDtos.stream().collect(Collectors.groupingBy(ProductFreeCharacterItemDto::getProductId));
        List<ProductFreeCharacterItemQryDto> resultList = groupedByProductIDMap.entrySet().stream().map(entry -> new ProductFreeCharacterItemQryDto((Long)entry.getKey(), (List)entry.getValue())).collect(Collectors.toList());
        return resultList;
    }

    public HashMap<String, List<ProductSpecItemAlbumDTO>> getAlbumByBusinessIds(List<String> businessIdList) {
        HashMap<String, List<ProductSpecItemAlbumDTO>> albumMap = new HashMap<String, List<ProductSpecItemAlbumDTO>>();
        if (!CollectionUtils.isEmpty(businessIdList)) {
            ArrayList<BatchBusinessFilesRequest> batchBusinessFilesRequestList = new ArrayList<BatchBusinessFilesRequest>();
            BatchBusinessFilesRequest batchBusinessFilesRequest = new BatchBusinessFilesRequest();
            batchBusinessFilesRequest.setBusinessType("iuap-apdoc-material");
            batchBusinessFilesRequest.setBusinessIds(businessIdList);
            batchBusinessFilesRequest.setCancelFileExit(Boolean.valueOf(true));
            batchBusinessFilesRequestList.add(batchBusinessFilesRequest);
            CooperationSuiteFile cooperationSuiteFile = this.cooperationFileService.batchBusinessFiles(batchBusinessFilesRequestList);
            List cooperationFileInfoList = cooperationSuiteFile.getData();
            if (!CollectionUtils.isEmpty((Collection)cooperationFileInfoList)) {
                cooperationFileInfoList.forEach(cooperationFileVO -> {
                    String businessId = cooperationFileVO.getObjectId();
                    ArrayList<ProductSpecItemAlbumDTO> albumDTOList = (ArrayList<ProductSpecItemAlbumDTO>)albumMap.get(businessId);
                    if (null == albumDTOList) {
                        albumDTOList = new ArrayList<ProductSpecItemAlbumDTO>();
                    }
                    ProductSpecItemAlbumDTO productSpecItemAlbumDTO = new ProductSpecItemAlbumDTO();
                    productSpecItemAlbumDTO.setFolder(cooperationFileVO.getBucketUrl());
                    productSpecItemAlbumDTO.setImgName(cooperationFileVO.getFileName());
                    productSpecItemAlbumDTO.setImageThumbPath(cooperationFileVO.getImageThumbPath());
                    albumDTOList.add(productSpecItemAlbumDTO);
                    albumMap.put(businessId, albumDTOList);
                });
            }
        }
        return albumMap;
    }
}

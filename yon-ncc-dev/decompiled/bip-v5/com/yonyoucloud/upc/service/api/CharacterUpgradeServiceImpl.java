/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 *  com.yonyou.cloud.utils.StringUtils
 *  com.yonyou.diwork.ott.exexutors.RobotExecutors
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.customerdoc.service.itf.IEnumDefApiService
 *  com.yonyou.iuap.elasticdb.util.SHA256Util
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyoucloud.iuap.upc.api.ICharacterUpgradeService
 *  com.yonyoucloud.iuap.upc.dto.ProductFieldMapper
 *  com.yonyoucloud.iuap.upc.dto.UpgradeCharacterDTO
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductSKU
 *  com.yonyoucloud.upc.pc.tpl.ProductTplCharacter
 *  com.yonyoucloud.upc.utils.UpcStringUtil
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Service
 *  org.springframework.transaction.annotation.Transactional
 *  org.springframework.transaction.support.DefaultTransactionDefinition
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.api;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyou.cloud.utils.StringUtils;
import com.yonyou.diwork.ott.exexutors.RobotExecutors;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.customerdoc.service.itf.IEnumDefApiService;
import com.yonyou.iuap.elasticdb.util.SHA256Util;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyoucloud.iuap.upc.api.ICharacterUpgradeService;
import com.yonyoucloud.iuap.upc.dto.ProductFieldMapper;
import com.yonyoucloud.iuap.upc.dto.UpgradeCharacterDTO;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductSKU;
import com.yonyoucloud.upc.pc.tpl.ProductTplCharacter;
import com.yonyoucloud.upc.service.api.dto.ProductSpecCharacter;
import com.yonyoucloud.upc.service.api.dto.ProductTplDTO;
import com.yonyoucloud.upc.utils.UpcStringUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Semaphore;
import java.util.stream.Collectors;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.util.CollectionUtils;

@Service
@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public class CharacterUpgradeServiceImpl
implements ICharacterUpgradeService {
    @Autowired
    @Qualifier(value="ymsLongTaskExecutorService")
    private ExecutorService ymsLongTaskExecutorService;
    private Semaphore semaphore = new Semaphore(4);
    private static final Logger logger = LoggerFactory.getLogger(CharacterUpgradeServiceImpl.class);
    private final String CHARACTERUPGRADE_MAPPER = "com.yonyoucloud.upc.service.api.CharacterUpgradeServiceImpl";
    @Autowired
    private IEnumDefApiService enumDefApiService;

    public List<UpgradeCharacterDTO> listProductCharacterByIds(List<Long> productIdList) throws Exception {
        ArrayList<UpgradeCharacterDTO> UpgradeCharacterDTOs = new ArrayList<UpgradeCharacterDTO>(productIdList.size());
        List<Product> products = this.listProductInfoByIds(productIdList);
        for (Product product : products) {
            UpgradeCharacterDTO upgradeCharacterDTO = new UpgradeCharacterDTO();
            upgradeCharacterDTO.setProductId((Long)product.getId());
            upgradeCharacterDTO.setCharacterMap((HashMap)product.getProductPropCharacterDefine());
            UpgradeCharacterDTOs.add(upgradeCharacterDTO);
        }
        return UpgradeCharacterDTOs;
    }

    public List<UpgradeCharacterDTO> listSkuCharacterByIds(List<Long> skuIdList) throws Exception {
        ArrayList<UpgradeCharacterDTO> UpgradeCharacterDTOs = new ArrayList<UpgradeCharacterDTO>(skuIdList.size());
        List<ProductSKU> productSKUS = this.listSkuInfoByIds(skuIdList);
        for (ProductSKU sku : productSKUS) {
            UpgradeCharacterDTO upgradeCharacterDTO = new UpgradeCharacterDTO();
            upgradeCharacterDTO.setSkuId((Long)sku.getId());
            upgradeCharacterDTO.setCharacterMap((HashMap)sku.getSkuFreeCharacter());
            UpgradeCharacterDTOs.add(upgradeCharacterDTO);
        }
        return UpgradeCharacterDTOs;
    }

    public List<UpgradeCharacterDTO> listSkuCharacterByIdsAndSensitiveType(int sensitiveType, List<Long> skuIdList) throws Exception {
        ArrayList<UpgradeCharacterDTO> upgradeCharacterDTOS = new ArrayList<UpgradeCharacterDTO>();
        List<ProductSKU> productSKUS = this.listSkuInfoByIds(skuIdList);
        List<ProductTplCharacter> productTplCharacters = this.listTplCharacterSensitiveConfig(skuIdList);
        if (!CollectionUtils.isEmpty(productTplCharacters)) {
            Map<Long, List<ProductTplCharacter>> productTplCharactersMap = productTplCharacters.stream().collect(Collectors.groupingBy(ProductTplCharacter::getTemplate));
            String sensitive = this.getSensitive(sensitiveType);
            for (ProductSKU sku : productSKUS) {
                HashMap skuFreeCharacter = (HashMap)sku.getSkuFreeCharacter();
                UpgradeCharacterDTO upgradeCharacterDTO = new UpgradeCharacterDTO();
                if (skuFreeCharacter != null) {
                    HashMap<String, Object> sensitiveCharacterMap = this.getSensitiveCharacterMap(skuFreeCharacter, productTplCharactersMap.get(sku.getLong("productTemplate")), sensitive);
                    upgradeCharacterDTO.setCharacterMap(sensitiveCharacterMap);
                    String sensitiveUID = SHA256Util.paramCodeEncrypt((String)String.valueOf(sku.getProductId()), (String)sensitive, sensitiveCharacterMap);
                    upgradeCharacterDTO.setSensitiveId(sensitiveUID);
                }
                upgradeCharacterDTO.setProductId(sku.getProductId());
                upgradeCharacterDTO.setSkuId((Long)sku.getId());
                upgradeCharacterDTOS.add(upgradeCharacterDTO);
            }
        }
        return upgradeCharacterDTOS;
    }

    public void characterUpgradeRollbackStart(String yTenantId) throws Exception {
        try {
            this.rollbackUpgradeCharacterData(yTenantId);
            this.rollbackProductData(yTenantId);
            this.rollBackSkuData(yTenantId);
            this.rollbackCustomerEnum(yTenantId);
            this.clearSyncCharacteristic(yTenantId);
            this.clearProductSensitiveConfig(yTenantId);
            this.rollbackCustomerData(yTenantId);
        }
        catch (Exception e) {
            logger.error("\u7279\u5f81\u7269\u6599\u5347\u7ea7\u56de\u6eda\u5f02\u5e38" + e.getMessage(), (Throwable)e);
        }
    }

    private void rollbackUpgradeCharacterData(String yTenantId) throws Exception {
        SqlHelper.delete((String)"com.yonyoucloud.upc.service.api.CharacterUpgradeServiceImpl.rollbackUpgradeCharacterData", (Object)yTenantId);
    }

    private void rollbackCustomerData(String yTenantId) throws Exception {
        SqlHelper.update((String)"com.yonyoucloud.upc.service.api.CharacterUpgradeServiceImpl.rollbackCustomerData", (Object)yTenantId);
    }

    private void rollbackProductData(String yTenantId) throws Exception {
        SqlHelper.update((String)"com.yonyoucloud.upc.service.api.CharacterUpgradeServiceImpl.rollbackProductData", (Object)yTenantId);
    }

    public void rollBackSkuData(String yTenantId) throws Exception {
        List<ProductTplDTO> productTpls = this.getProductTplHasSpecOrPro(yTenantId);
        if (!CollectionUtils.isEmpty(productTpls)) {
            for (ProductTplDTO productTpl : productTpls) {
                this.rollBackSkuDataBYTpl(productTpl);
            }
        }
        SqlHelper.update((String)"com.yonyoucloud.upc.service.api.CharacterUpgradeServiceImpl.clearProductSkuData", (Object)yTenantId);
    }

    public void rollBackSkuDataBYTpl(ProductTplDTO productTpl) throws Exception {
        List<Map<String, Object>> products = this.getProductByTplId(productTpl.getId(), (String)AppContext.getYhtTenantId());
        StringBuilder sql = new StringBuilder();
        int count = 0;
        for (Map<String, Object> product : products) {
            Long productId = Long.parseLong(product.get("id").toString());
            List<Long> skuIds = this.getSkuIdByProductId(productId);
            List<ProductSpecCharacter> allspecValues = this.getSpecValues(productId, skuIds);
            Map<Long, List<ProductSpecCharacter>> skuIdAndSpecValues = allspecValues.stream().collect(Collectors.groupingBy(t -> t.getSkuId()));
            for (Long skuId : skuIds) {
                List<ProductSpecCharacter> specValues = skuIdAndSpecValues.get(skuId);
                String specIds = "";
                if (!CollectionUtils.isEmpty(specValues)) {
                    for (ProductSpecCharacter specCharacter : specValues) {
                        specIds = specIds + specCharacter.getSpecValueId() + ";";
                    }
                }
                StringBuilder rollBackskuSql = this.getRollBackskuSql(specIds, productId, skuId);
                sql.append((CharSequence)rollBackskuSql);
                if (500 != ++count) continue;
                this.semaphore.acquire();
                RobotExecutors.runAs((String)((String)AppContext.getYTenantId()), () -> {
                    HashMap<String, String> sqlMap = new HashMap<String, String>();
                    sqlMap.put("sql", sql.toString());
                    DefaultTransactionDefinition definition = new DefaultTransactionDefinition(0);
                    this.extracted(definition, sqlMap);
                }, (ExecutorService)this.ymsLongTaskExecutorService);
                count = 0;
                sql.setLength(0);
            }
            this.deleteFreeItemByProductId(productId, (String)AppContext.getYhtTenantId());
        }
        if (count > 0) {
            HashMap<String, String> sqlMap = new HashMap<String, String>();
            sqlMap.put("sql", sql.toString());
            SqlHelper.update((String)"com.yonyou.ucf.mdd.ext.meta.dao.update", sqlMap);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Transactional(rollbackFor={Throwable.class})
    public void extracted(DefaultTransactionDefinition definition, Map<String, String> sqlMap) {
        try {
            SqlHelper.update((String)"com.yonyou.ucf.mdd.ext.meta.dao.update", sqlMap);
        }
        catch (Exception e) {
            logger.error("\u7269\u6599\u7279\u5f81\u5347\u7ea7\u56de\u6edasku\u6570\u636e\u5931\u8d25\uff0c" + e.getMessage(), (Throwable)e);
        }
        finally {
            this.semaphore.release();
        }
    }

    private StringBuilder getRollBackskuSql(String specIds, Long productId, Long skuId) {
        String freeValueIdsMd5 = this.getFreeValueIdsMd5(specIds, productId);
        StringBuilder sql = new StringBuilder();
        sql.append("update productsku set ");
        sql.append(" skufreecharacter = ").append("'' ");
        sql.append(" , cspecids = ").append("'").append(specIds).append("' ");
        sql.append(" , free_value_ids = ").append("'' ");
        sql.append(" , free_value_ids_md5 = ").append("'").append(freeValueIdsMd5).append("' ");
        sql.append(" , free_values = cspecs ");
        sql.append(" where id = ").append(skuId).append("; ");
        return sql;
    }

    public String getFreeValueIdsMd5(String specIds, Long productId) {
        if (StringUtils.isNotEmpty((String)specIds)) {
            String[] idsArray = specIds.split(";");
            List<String> idList = Arrays.asList(idsArray);
            ArrayList<String> ids = new ArrayList<String>(idList);
            ids.add(productId.toString());
            return UpcStringUtil.sortStrMd5(ids);
        }
        return null;
    }

    public void deleteFreeItemByProductId(Long productId, String ytenantId) {
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("productId", productId);
        params.put("ytenantId", ytenantId);
        SqlHelper.selectList((String)"com.yonyoucloud.upc.service.api.CharacterUpgradeServiceImpl.deleteFreeItemByProductId", params);
    }

    public List<ProductSpecCharacter> getSpecValuesBySkuId(Long productId, Long skuId) {
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("productId", productId);
        params.put("skuId", skuId);
        params.put("ytenantId", AppContext.getYhtTenantId());
        return SqlHelper.selectList((String)"com.yonyoucloud.upc.service.api.CharacterUpgradeServiceImpl.selectSkuSpecItemBySkuId", params);
    }

    private List<ProductSpecCharacter> getSpecValues(Long productId, List<Long> skuIds) {
        List<ProductSpecCharacter> specValues = new ArrayList<ProductSpecCharacter>();
        if (!CollectionUtils.isEmpty(skuIds) && productId != null) {
            HashMap<String, Object> params = new HashMap<String, Object>();
            params.put("productId", productId);
            params.put("skuIds", skuIds);
            params.put("ytenantId", AppContext.getYhtTenantId());
            specValues = SqlHelper.selectList((String)"com.yonyoucloud.upc.service.api.CharacterUpgradeServiceImpl.selectSkuSpecItem", params);
        }
        return specValues;
    }

    public List<Long> getSkuIdByProductId(Long productId) {
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("productId", productId);
        params.put("ytenantId", AppContext.getYhtTenantId());
        return SqlHelper.selectList((String)"com.yonyoucloud.upc.service.api.CharacterUpgradeServiceImpl.selectSkuIdsByProductId", params);
    }

    public List<Map<String, Object>> getProductByTplId(Long tplId, String ytenantId) {
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("ytenantId", ytenantId);
        params.put("tplId", tplId);
        return SqlHelper.selectList((String)"com.yonyoucloud.upc.service.api.CharacterUpgradeServiceImpl.selectProductByTplId", params);
    }

    public List<ProductTplDTO> getProductTplHasSpecOrPro(String ytenantId) {
        HashMap<String, String> params = new HashMap<String, String>();
        params.put("ytenantId", ytenantId);
        return SqlHelper.selectList((String)"com.yonyoucloud.upc.service.api.CharacterUpgradeServiceImpl.selectProductTplByTenantId", params);
    }

    private void clearProductSensitiveConfig(String yTenantId) throws Exception {
        SqlHelper.update((String)"com.yonyoucloud.upc.service.api.CharacterUpgradeServiceImpl.clearCopyProductTpl", (Object)yTenantId);
        SqlHelper.update((String)"com.yonyoucloud.upc.service.api.CharacterUpgradeServiceImpl.updateProduct", (Object)yTenantId);
        SqlHelper.delete((String)"com.yonyoucloud.upc.service.api.CharacterUpgradeServiceImpl.clearProductSensitiveConfig", (Object)yTenantId);
    }

    private void clearSyncCharacteristic(String yTenantId) throws Exception {
        SqlHelper.update((String)"com.yonyoucloud.upc.service.api.CharacterUpgradeServiceImpl.updateProductTpl", (Object)yTenantId);
        SqlHelper.update((String)"com.yonyoucloud.upc.service.api.CharacterUpgradeServiceImpl.clearSyncCharacteristic", (Object)yTenantId);
    }

    private void clearDefineReferDoc(String yTenantId) throws Exception {
        SqlHelper.update((String)"com.yonyoucloud.upc.service.api.CharacterUpgradeServiceImpl.clearDefineReferDoc", (Object)yTenantId);
    }

    private void rollbackCustomerEnum(String yTenantId) throws Exception {
        List enumDefIdList = SqlHelper.selectList((String)"com.yonyoucloud.upc.service.api.CharacterUpgradeServiceImpl.getCustEnum", (Object)yTenantId);
        this.enumDefApiService.rollbackEnumList(enumDefIdList);
    }

    public boolean characterUpgradeRollbackResult() throws Exception {
        String yTenantId = (String)AppContext.getYTenantId();
        Map merchant = (Map)SqlHelper.selectOne((String)"com.yonyoucloud.upc.service.api.CharacterUpgradeServiceImpl.selectMerchant", (Object)yTenantId);
        Map merchantCharacter = (Map)SqlHelper.selectOne((String)"com.yonyoucloud.upc.service.api.CharacterUpgradeServiceImpl.selectMerchantCharacter", (Object)yTenantId);
        Map product = (Map)SqlHelper.selectOne((String)"com.yonyoucloud.upc.service.api.CharacterUpgradeServiceImpl.selectProduct", (Object)yTenantId);
        Map productPropCharacterDefine = (Map)SqlHelper.selectOne((String)"com.yonyoucloud.upc.service.api.CharacterUpgradeServiceImpl.selectProductPropCharacterDefine", (Object)yTenantId);
        Map productSku = (Map)SqlHelper.selectOne((String)"com.yonyoucloud.upc.service.api.CharacterUpgradeServiceImpl.selectProductSku", (Object)yTenantId);
        Map skufreecharacter = (Map)SqlHelper.selectOne((String)"com.yonyoucloud.upc.service.api.CharacterUpgradeServiceImpl.selectSkufreecharacter", (Object)yTenantId);
        Map skupropcharacter = (Map)SqlHelper.selectOne((String)"com.yonyoucloud.upc.service.api.CharacterUpgradeServiceImpl.selectSkupropcharacter", (Object)yTenantId);
        return product == null && productPropCharacterDefine == null && productSku == null && skufreecharacter == null && skupropcharacter == null && merchant == null && merchantCharacter == null;
    }

    public List<ProductFieldMapper> listProductFieldMapper() throws Exception {
        return SqlHelper.selectList((String)"com.yonyoucloud.upc.service.api.CharacterUpgradeServiceImpl.listProductFieldMapper", (Object)"0");
    }

    private HashMap<String, Object> getSensitiveCharacterMap(Map<String, Object> skuFreeCharacter, List<ProductTplCharacter> productTplCharacterList, String sensitive) {
        HashMap<String, Object> resultMap = new HashMap<String, Object>();
        if (skuFreeCharacter != null && !CollectionUtils.isEmpty(productTplCharacterList) && StringUtils.isNotEmpty((String)sensitive)) {
            for (ProductTplCharacter productTplCharacter : productTplCharacterList) {
                if (!"1".equals(productTplCharacter.get(sensitive).toString())) continue;
                resultMap.put(productTplCharacter.getCharacterCode(), skuFreeCharacter.get(productTplCharacter.getCharacterCode()));
            }
        }
        return resultMap;
    }

    private String getSensitive(int sensitiveType) {
        if (0 == sensitiveType) {
            return "skuSens";
        }
        if (1 == sensitiveType) {
            return "batchSens";
        }
        if (2 == sensitiveType) {
            return "SNSens";
        }
        if (3 == sensitiveType) {
            return "stockSens";
        }
        if (4 == sensitiveType) {
            return "costAffec";
        }
        if (5 == sensitiveType) {
            return "BOMAffec";
        }
        if (6 == sensitiveType) {
            return "manuAffec";
        }
        if (7 == sensitiveType) {
            return "PriceAffec";
        }
        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801239);
    }

    private List<ProductTplCharacter> listTplCharacterSensitiveConfig(List<Long> skuIdList) {
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("ytenant", AppContext.getYTenantId());
        params.put("skuIdList", skuIdList);
        return SqlHelper.selectList((String)"com.yonyoucloud.upc.service.api.CharacterUpgradeServiceImpl.listTplCharacterSensitiveConfig", params);
    }

    private List<Product> listProductInfoByIds(List<Long> productIdList) throws Exception {
        ArrayList<Product> products = new ArrayList<Product>();
        if (!CollectionUtils.isEmpty(productIdList)) {
            QuerySchema schema = QuerySchema.create().addSelect("id, productPropCharacterDefine").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(productIdList)}));
            schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
            List productList = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)schema);
            for (Map productMap : productList) {
                Product product = new Product();
                product.putAll(productMap);
                products.add(product);
            }
        }
        return products;
    }

    private List<ProductSKU> listSkuInfoByIds(List<Long> skuIdList) throws Exception {
        ArrayList<ProductSKU> productSKUS = new ArrayList<ProductSKU>();
        if (!CollectionUtils.isEmpty(skuIdList)) {
            QuerySchema schema = QuerySchema.create().addSelect("id, productId, productId.productTemplate as productTemplate, skuFreeCharacter, skuPropCharacter").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(skuIdList)}));
            schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
            List productSKUList = MetaDaoHelper.query((String)"pc.product.ProductSKU", (QuerySchema)schema);
            for (Map productSkuMap : productSKUList) {
                ProductSKU productSKU = new ProductSKU();
                productSKU.putAll(productSkuMap);
                productSKUS.add(productSKU);
            }
        }
        return productSKUS;
    }
}


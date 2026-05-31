/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.dao.material.MaterialUnitQryDao
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.po.material.MaterialAssistUnitPO
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.ucf.common.i18n.MessageUtils
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyoucloud.upc.pc.product.AssistUnitType
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductAssistUnitExchange
 *  com.yonyoucloud.upc.pc.product.ProductExtend
 *  com.yonyoucloud.upc.pc.product.UnitExchangeType
 *  com.yonyoucloud.upc.pc.product.UnitUseTypeEnum
 *  org.apache.commons.lang3.ObjectUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.spring.support.id.IdManager
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.bill.product;

import com.yonyou.iuap.apdoc.coredoc.dao.material.MaterialUnitQryDao;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.po.material.MaterialAssistUnitPO;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.ucf.common.i18n.MessageUtils;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyoucloud.upc.pc.product.AssistUnitType;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductAssistUnitExchange;
import com.yonyoucloud.upc.pc.product.ProductExtend;
import com.yonyoucloud.upc.pc.product.UnitExchangeType;
import com.yonyoucloud.upc.pc.product.UnitUseTypeEnum;
import com.yonyoucloud.upc.service.bill.BillBusinessHandleDTO;
import com.yonyoucloud.upc.service.bill.product.ProductCheckUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.commons.lang3.ObjectUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.spring.support.id.IdManager;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class ProductAssistUnitCheckUtil {
    public static void checkForInsert(Product product, boolean isOpenNultiFloat) {
        ProductAssistUnitCheckUtil.checkUnitUseType(product.getUnitUseType(), product.getProductTemplate());
        ProductAssistUnitCheckUtil.checkUnit(product.getUnit());
        ProductAssistUnitCheckUtil.checkEnableAssistUnit(product.getEnableAssistUnit(), product.getUnitUseType(), product.productAssistUnitExchanges(), product.getCode());
        ProductAssistUnitCheckUtil.checkAssistUnitExchange(isOpenNultiFloat, product.getUnit(), product.productAssistUnitExchanges(), product.getCode(), product.getEntityStatus(), (Long)product.getId());
        ProductAssistUnitCheckUtil.checkBusinessUnitInsert(isOpenNultiFloat, product.detail(), product.getUnit(), product.productAssistUnitExchanges(), product.getCode());
    }

    public static void checkForUpdate(BillBusinessHandleDTO checkDto, boolean isOpenNultiFloat) throws Exception {
        Product product = (Product)checkDto.getData();
        BizObject productInDB = checkDto.getDataInDB();
        if (product != null && productInDB != null) {
            Long unit;
            Short unitUseType;
            Short s = product.containsKey((Object)"unitUseType") ? product.getUnitUseType() : (unitUseType = productInDB.get("unitUseType") != null ? Short.valueOf(Short.parseShort(productInDB.get("unitUseType").toString())) : null);
            if (ProductCheckUtil.isModifyFieldValue((BizObject)product, "unitUseType", product.getUnitUseType(), productInDB.get("unitUseType")) || ProductCheckUtil.isModifyFieldValue((BizObject)product, "productTemplate", product.getProductTemplate(), productInDB.get("productTemplate"))) {
                Long productTemplate = product.containsKey((Object)"productTemplate") ? product.getProductTemplate() : (productInDB.get("productTemplate") != null ? Long.valueOf(Long.parseLong(productInDB.get("productTemplate").toString())) : null);
                ProductAssistUnitCheckUtil.checkUnitUseType(unitUseType, productTemplate);
            }
            if (ProductCheckUtil.isModifyFieldValue((BizObject)product, "unit", product.getUnit(), productInDB.get("unit"))) {
                ProductAssistUnitCheckUtil.checkUnit(product.getUnit());
            }
            if (ProductCheckUtil.isModifyFieldValue((BizObject)product, "enableAssistUnit", product.getEnableAssistUnit(), productInDB.get("enableAssistUnit")) || ObjectUtils.isNotEmpty((Object)product.productAssistUnitExchanges())) {
                Boolean enableAssistUnit = product.containsKey((Object)"enableAssistUnit") ? product.getEnableAssistUnit() : (productInDB.get("enableAssistUnit") != null ? Boolean.valueOf(BooleanUtil.isTrue((Object)productInDB.get("enableAssistUnit"))) : null);
                ProductAssistUnitCheckUtil.checkEnableAssistUnit(enableAssistUnit, unitUseType, product.productAssistUnitExchanges(), product.getCode());
            }
            Long l = product.getUnit() != null ? product.getUnit() : (unit = productInDB.get("unit") != null ? Long.valueOf(productInDB.get("unit").toString()) : null);
            if (ObjectUtils.isNotEmpty((Object)product.productAssistUnitExchanges())) {
                ProductAssistUnitCheckUtil.checkAssistUnitExchange(isOpenNultiFloat, unit, product.productAssistUnitExchanges(), product.getCode(), product.getEntityStatus(), (Long)product.getId());
            }
            ProductExtend detail = product.detail();
            List<ProductAssistUnitExchange> assistUnitExchangesResult = null;
            assistUnitExchangesResult = unitUseType != null && UnitUseTypeEnum.USE_TIMPLATE.getValue() == unitUseType.shortValue() ? product.productAssistUnitExchanges() : ProductAssistUnitCheckUtil.calculatSavedResult(product.productAssistUnitExchanges(), (List)productInDB.get("productAssistUnitExchanges"));
            Long floatingAssistUnit = ProductAssistUnitCheckUtil.calculatFloatingAssistUnit(assistUnitExchangesResult);
            ProductAssistUnitCheckUtil.checkFloatingAssistUnitUnique(isOpenNultiFloat, floatingAssistUnit, assistUnitExchangesResult);
            Set<Long> permissionUnit = ProductAssistUnitCheckUtil.getPermissionUnit(unit, assistUnitExchangesResult);
            for (AssistUnitType unitType : AssistUnitType.values()) {
                if (detail == null || !ProductCheckUtil.isModifyFieldValue((BizObject)detail, unitType.toString(), detail.get(unitType.toString()), productInDB.get("detail!" + unitType))) continue;
                Long businessUnit = detail.get(unitType.toString()) != null ? Long.valueOf(detail.get(unitType.toString()).toString()) : null;
                ProductAssistUnitCheckUtil.checkBusinessUnit(isOpenNultiFloat, unitType, businessUnit, permissionUnit, floatingAssistUnit, product.getCode());
            }
        }
    }

    private static void checkFloatingAssistUnitUnique(boolean isOpenNultiFloat, Long floatingAssistUnit, List<ProductAssistUnitExchange> assistUnitExchanges) {
        if (!isOpenNultiFloat && floatingAssistUnit != null && ObjectUtils.isNotEmpty(assistUnitExchanges) && assistUnitExchanges.size() > 1) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800570);
        }
    }

    private static void checkBusinessUnit(boolean isOpenNultiFloat, AssistUnitType unitType, Long businessUnit, Set<Long> permissionUnit, Long floatingAssistUnit, String productCode) {
        if (businessUnit == null) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_BUSINESS_UNIT_IS_NULL, new Object[]{productCode, MessageUtils.getMessage((String)unitType.getName())});
        }
        if (!permissionUnit.contains(businessUnit)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800569, new Object[]{productCode, MessageUtils.getMessage((String)unitType.getName())});
        }
        if (!(isOpenNultiFloat || floatingAssistUnit == null || ProductCheckUtil.areEqual(businessUnit, floatingAssistUnit) || AssistUnitType.offlineUnit.equals((Object)unitType) || AssistUnitType.purchasePriceUnit.equals((Object)unitType) || AssistUnitType.batchPriceUnit.equals((Object)unitType) || AssistUnitType.inspectionUnit.equals((Object)unitType) || AssistUnitType.demandPlanningUnit.equals((Object)unitType))) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800568, new Object[]{productCode, MessageUtils.getMessage((String)unitType.getName())});
        }
    }

    private static Long calculatFloatingAssistUnit(List<ProductAssistUnitExchange> assistUnitExchanges) {
        if (ObjectUtils.isNotEmpty(assistUnitExchanges) && assistUnitExchanges.size() == 1) {
            for (ProductAssistUnitExchange assistUnitExchange : assistUnitExchanges) {
                if (!UnitExchangeType.floating.equals((Object)assistUnitExchange.getUnitExchangeType())) continue;
                return assistUnitExchange.getAssistUnit();
            }
        }
        return null;
    }

    private static Set<Long> getPermissionUnit(Long unit, List<ProductAssistUnitExchange> assistUnitExchangesResult) {
        HashSet<Long> permissionUnit = new HashSet<Long>();
        permissionUnit.add(unit);
        if (ObjectUtils.isNotEmpty(assistUnitExchangesResult)) {
            for (ProductAssistUnitExchange assistUnitExchange : assistUnitExchangesResult) {
                permissionUnit.add(assistUnitExchange.getAssistUnit());
            }
        }
        return permissionUnit;
    }

    private static void checkUnit(Long unit) {
        if (unit == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800567);
        }
    }

    private static void checkUnitUseType(Short unitUseType, Long template) {
        if (unitUseType == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800565);
        }
        if (UnitUseTypeEnum.USE_TIMPLATE.getValue() == unitUseType.shortValue() && template == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800566);
        }
    }

    private static void checkBusinessUnitInsert(boolean isOpenNultiFloat, ProductExtend detail, Long unit, List<ProductAssistUnitExchange> assistUnitExchanges, String code) {
        if (ProductAssistUnitCheckUtil.containsBusinessUnit(detail)) {
            Set<Long> permissionUnit = ProductAssistUnitCheckUtil.getPermissionUnit(unit, assistUnitExchanges);
            Long floatingAssistUnit = ProductAssistUnitCheckUtil.calculatFloatingAssistUnit(assistUnitExchanges);
            for (AssistUnitType unitType : AssistUnitType.values()) {
                Long businessUnit = detail.get(unitType.toString()) != null ? Long.valueOf(detail.get(unitType.toString()).toString()) : null;
                ProductAssistUnitCheckUtil.checkBusinessUnit(isOpenNultiFloat, unitType, businessUnit, permissionUnit, floatingAssistUnit, code);
            }
        }
    }

    private static List<ProductAssistUnitExchange> calculatSavedResult(List<ProductAssistUnitExchange> assistUnitExchanges, List<ProductAssistUnitExchange> assistUnitExchangesDB) {
        Map<Object, Object> idAndExchangeMap = new HashMap();
        if (ObjectUtils.isNotEmpty(assistUnitExchangesDB)) {
            idAndExchangeMap = assistUnitExchangesDB.stream().filter(v -> v.get("id") != null).collect(Collectors.toMap(v -> v.get("id").toString(), x -> x));
        }
        if (ObjectUtils.isNotEmpty(assistUnitExchanges)) {
            for (ProductAssistUnitExchange assistUnitExchange : assistUnitExchanges) {
                ProductAssistUnitExchange assistUnitExchangeDB;
                if (assistUnitExchange.getId() == null) continue;
                String id = assistUnitExchange.getId().toString();
                ProductAssistUnitExchange productAssistUnitExchange = assistUnitExchangeDB = ObjectUtils.isNotEmpty(idAndExchangeMap) && idAndExchangeMap.containsKey(id) ? (ProductAssistUnitExchange)idAndExchangeMap.get(id) : null;
                if (assistUnitExchangeDB == null && EntityStatus.Insert.equals((Object)assistUnitExchange.getEntityStatus())) {
                    idAndExchangeMap.put(id, assistUnitExchange);
                    continue;
                }
                if (assistUnitExchangeDB == null) continue;
                if (EntityStatus.Delete.equals((Object)assistUnitExchange.getEntityStatus())) {
                    idAndExchangeMap.remove(assistUnitExchangeDB.getId().toString());
                    continue;
                }
                if (!EntityStatus.Update.equals((Object)assistUnitExchange.getEntityStatus())) continue;
                idAndExchangeMap.put(id, assistUnitExchange);
            }
        }
        if (ObjectUtils.isNotEmpty(idAndExchangeMap)) {
            return new ArrayList<ProductAssistUnitExchange>(idAndExchangeMap.values());
        }
        return null;
    }

    public void fillAssistUnitExchange(String billnum, Product product, List<ProductAssistUnitExchange> productAssistUnitExchanges) {
        if (null != product.productAssistUnitExchanges() && BooleanUtil.isTrue((Object)product.get("_fromApi")) && !"pc_productdetail_import".equals(billnum)) {
            if (ObjectUtils.isNotEmpty(productAssistUnitExchanges)) {
                Map<String, ProductAssistUnitExchange> assistUnitExchangeIdsMapDB = productAssistUnitExchanges.stream().filter(v -> v.get("assistUnit") != null).collect(Collectors.toMap(v -> v.get("assistUnit").toString(), x -> x));
                if (ObjectUtils.isNotEmpty(assistUnitExchangeIdsMapDB)) {
                    List<Object> assistUnitIds = new ArrayList();
                    if (product.productAssistUnitExchanges() != null) {
                        assistUnitIds = product.productAssistUnitExchanges().stream().filter(assistUnit -> assistUnit.get("assistUnit") != null).map(assistUnit -> assistUnit.get("assistUnit").toString()).collect(Collectors.toList());
                        product.productAssistUnitExchanges().forEach(assistUnitExchange -> {
                            Long assistUnit = assistUnitExchange.getAssistUnit();
                            if (null != assistUnit && assistUnitExchangeIdsMapDB.containsKey(assistUnit.toString())) {
                                assistUnitExchange.setEntityStatus(EntityStatus.Update);
                                assistUnitExchange.setId(((ProductAssistUnitExchange)assistUnitExchangeIdsMapDB.get(assistUnit.toString())).getId());
                            } else if (null != assistUnit) {
                                assistUnitExchange.setEntityStatus(EntityStatus.Insert);
                                assistUnitExchange.setId((Object)IdManager.getInstance().nextId());
                            }
                        });
                    }
                    for (Map.Entry<String, ProductAssistUnitExchange> entry : assistUnitExchangeIdsMapDB.entrySet()) {
                        if (assistUnitIds.contains(entry.getKey())) continue;
                        ProductAssistUnitExchange productAssistUnitExchange = new ProductAssistUnitExchange();
                        productAssistUnitExchange.putAll((Map)entry.getValue());
                        productAssistUnitExchange.setEntityStatus(EntityStatus.Delete);
                        if (product.productAssistUnitExchanges() == null) {
                            product.setProductAssistUnitExchanges(new ArrayList());
                        }
                        product.productAssistUnitExchanges().add(productAssistUnitExchange);
                    }
                }
            } else {
                product.productAssistUnitExchanges().forEach(assistUnitExchange -> {
                    assistUnitExchange.setEntityStatus(EntityStatus.Insert);
                    assistUnitExchange.setId((Object)IdManager.getInstance().nextId());
                });
            }
        }
    }

    public void dealBusinessUnit(Product product, List<ProductAssistUnitExchange> assistUnitListFromDB) {
        ProductExtend detail = product.detail();
        for (AssistUnitType type : AssistUnitType.values()) {
            if (detail.get(type.toString()) != null) continue;
            detail.remove(type.toString());
        }
    }

    private static void checkEnableAssistUnit(Boolean enableAssistUnit, Short unitUseType, List<ProductAssistUnitExchange> assistUnitExchanges, String code) {
        if (enableAssistUnit == null) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_ENABLE_ASSIST_UNIT_NOT_NULL);
        }
        if (UnitUseTypeEnum.USE_PRODUCT.getValue() == unitUseType.shortValue()) {
            if (BooleanUtil.isTrue((Object)enableAssistUnit) && ObjectUtils.isEmpty(assistUnitExchanges)) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800574, new Object[]{code});
            }
            if (BooleanUtil.isFalse((Object)enableAssistUnit) && ObjectUtils.isNotEmpty(assistUnitExchanges) && assistUnitExchanges.stream().anyMatch(v -> !EntityStatus.Delete.equals((Object)v.getEntityStatus()))) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800575, new Object[]{code});
            }
        }
    }

    private static void checkAssistUnitExchange(boolean isOpenNultiFloat, Long unit, List<ProductAssistUnitExchange> assistUnitExchanges, String code, EntityStatus entityStatus, Long productId) {
        if (ObjectUtils.isNotEmpty(assistUnitExchanges)) {
            MaterialUnitQryDao materialUnitQryDao;
            List materialAssistUnitPOList;
            boolean hasFloatingAssistUnit = false;
            ArrayList<Long> assistUnits = new ArrayList<Long>();
            if (EntityStatus.Update.equals((Object)entityStatus) && !CollectionUtils.isEmpty((Collection)(materialAssistUnitPOList = (materialUnitQryDao = (MaterialUnitQryDao)AppContext.getBean(MaterialUnitQryDao.class)).queryByProductId(productId)))) {
                List assistIds = assistUnitExchanges.stream().map(productAssistUnitExchange -> (Long)productAssistUnitExchange.getId()).collect(Collectors.toList());
                for (MaterialAssistUnitPO materialAssistUnitPO : materialAssistUnitPOList) {
                    if (assistIds.contains(materialAssistUnitPO.getId())) continue;
                    assistUnits.add(materialAssistUnitPO.getAssistUnit());
                    if (!UnitExchangeType.floating.equals((Object)UnitExchangeType.find((Number)materialAssistUnitPO.getUnitExchangeType()))) continue;
                    hasFloatingAssistUnit = true;
                }
            }
            for (ProductAssistUnitExchange assistUnitExchange : assistUnitExchanges) {
                if (assistUnitExchange == null || assistUnitExchange.getAssistUnit() == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800576, new Object[]{code});
                }
                if (!EntityStatus.Insert.equals((Object)assistUnitExchange.getEntityStatus()) && !EntityStatus.Update.equals((Object)assistUnitExchange.getEntityStatus())) continue;
                if (assistUnitExchange.getUnitExchangeType() == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800577, new Object[]{code});
                }
                if (assistUnitExchange.getAssistUnitCount() == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800578, new Object[]{code});
                }
                if (assistUnitExchange.getMainUnitCount() == null && assistUnitExchange.getMainUnitCountNew() == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800579, new Object[]{code});
                }
                if (unit != null && unit.equals(assistUnitExchange.getAssistUnit())) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800580, new Object[]{code});
                }
                if (assistUnits.contains(assistUnitExchange.getAssistUnit())) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800581, new Object[]{code});
                }
                assistUnits.add(assistUnitExchange.getAssistUnit());
                if (!UnitExchangeType.floating.equals((Object)assistUnitExchange.getUnitExchangeType())) continue;
                hasFloatingAssistUnit = true;
            }
            if (!isOpenNultiFloat && hasFloatingAssistUnit && assistUnits.size() > 1) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800570);
            }
        }
    }

    private boolean hasBusinessUnitIsNull(Product product) {
        ProductExtend detail = product.detail();
        if (product.detail() != null) {
            for (AssistUnitType unitType : AssistUnitType.values()) {
                if (detail.get(unitType.toString()) != null) continue;
                return true;
            }
        }
        return false;
    }

    private static boolean containsBusinessUnit(ProductExtend detail) {
        if (detail != null) {
            for (AssistUnitType unitType : AssistUnitType.values()) {
                if (!detail.containsKey((Object)unitType.toString())) continue;
                return true;
            }
        }
        return false;
    }

    private boolean enableFloatingAssistUnit(Product product) {
        return BooleanUtil.isTrue((Object)product.getEnableAssistUnit()) && !CollectionUtils.isEmpty((Collection)product.productAssistUnitExchanges()) && product.productAssistUnitExchanges().size() == 1 && product.productAssistUnitExchanges().get(0) != null && UnitExchangeType.floating.equals((Object)((ProductAssistUnitExchange)product.productAssistUnitExchanges().get(0)).getUnitExchangeType());
    }
}


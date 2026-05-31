/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.upc.data.product.ProductQueryDao
 *  com.yonyoucloud.upc.data.tpl.ProductTplDao
 *  com.yonyoucloud.upc.pc.product.AssistUnitType
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductAssistUnitExchange
 *  com.yonyoucloud.upc.pc.product.ProductExtend
 *  com.yonyoucloud.upc.pc.product.RealProductAttributeTypeEnum
 *  com.yonyoucloud.upc.pc.product.UnitUseTypeEnum
 *  com.yonyoucloud.upc.pc.tpl.ProductTplAssistUnitExchange
 *  com.yonyoucloud.upc.pc.tpl.ProductTplUnit
 *  org.apache.commons.lang3.ObjectUtils
 *  org.imeta.core.model.Entity
 *  org.imeta.core.model.Property
 *  org.imeta.core.model.PropertyMap
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.spring.support.id.IdManager
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.service.bill.product;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.upc.data.product.ProductQueryDao;
import com.yonyoucloud.upc.data.tpl.ProductTplDao;
import com.yonyoucloud.upc.pc.product.AssistUnitType;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductAssistUnitExchange;
import com.yonyoucloud.upc.pc.product.ProductExtend;
import com.yonyoucloud.upc.pc.product.RealProductAttributeTypeEnum;
import com.yonyoucloud.upc.pc.product.UnitUseTypeEnum;
import com.yonyoucloud.upc.pc.tpl.ProductTplAssistUnitExchange;
import com.yonyoucloud.upc.pc.tpl.ProductTplUnit;
import com.yonyoucloud.upc.service.bill.BillBusinessHandleDTO;
import com.yonyoucloud.upc.service.bill.product.ProductAssistUnitCheckUtil;
import com.yonyoucloud.upc.service.bill.product.ProductCheckUtil;
import com.yonyoucloud.upc.service.bill.product.ProductReferenceCheckService;
import com.yonyoucloud.upc.service.bill.product.ProductSetDefaultValueUtil;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.ObjectUtils;
import org.imeta.core.model.Entity;
import org.imeta.core.model.Property;
import org.imeta.core.model.PropertyMap;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.spring.support.id.IdManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value="productBusinessLegalCheckService")
public class ProductBusinessHandleService {
    private static final Logger log = LoggerFactory.getLogger(ProductBusinessHandleService.class);
    @Autowired
    @Qualifier(value="pc.billApiService")
    private IUPCBillService upcBillService;
    @Autowired
    private ProductReferenceCheckService referenceCheckService;
    @Autowired
    private ProductTplDao productTplDao;
    @Autowired
    private ProductQueryDao productQueryDao;
    @Autowired
    private PubOptionService pubOptionService;

    public void businessHandleForInsert(Product product) throws Exception {
        this.fillAssistUnitDataByTpl(product, EntityStatus.Insert);
        this.setDefaultValue(product);
        this.checkWhenInsert(product);
    }

    private void checkWhenInsert(Product product) throws Exception {
        ProductAssistUnitCheckUtil.checkForInsert(product, this.pubOptionService.isOpenMultiFloat());
        ProductCheckUtil.checkOptionBusinessForInsert(product, this.productQueryDao.getProduct(product.getOptionalMaterialId(), null));
    }

    private void setDefaultValue(Product product) {
        ProductSetDefaultValueUtil.setProductAttribute(product);
        ProductSetDefaultValueUtil.setAssistUnit(product, this.pubOptionService.isOpenMultiFloat());
        ProductSetDefaultValueUtil.setInspection(product);
        ProductSetDefaultValueUtil.setDistributionManagement(product);
    }

    public void businessHandleForUpdate(String billnum, Product product, Product productDB) throws Exception {
        this.fillInspectionControlPointData(product, productDB);
        this.fillDistributionManagementData(product, productDB);
        if ("pc_productimport".equals(billnum) || "pc_productdetail_import".equals(billnum)) {
            this.pickData(product, (BizObject)productDB);
        }
        this.fillDataFromRelaDoc(product, productDB);
        this.handlePrecisionForDecimalFields(product);
        BillBusinessHandleDTO businessHandleDTO = new BillBusinessHandleDTO(billnum, (BizObject)product, (BizObject)productDB);
        this.checkWhenUpdate(businessHandleDTO);
        this.referenceCheckService.productFieldUpdateReferenceCheck(businessHandleDTO.getUpdateFieldList());
    }

    private void handlePrecisionForDecimalFields(Product product) {
        if (product.detail() != null) {
            if (product.detail().get("compensationAmount") != null) {
                BigDecimal compensationAmount = (BigDecimal)product.detail().get("compensationAmount");
                product.detail().put("compensationAmount", (Object)compensationAmount.setScale(2, 4));
            }
            if (product.detail().get("moldingTime") != null) {
                BigDecimal moldingTime = (BigDecimal)product.detail().get("moldingTime");
                product.detail().put("moldingTime", (Object)moldingTime.setScale(2, 4));
            }
            if (product.detail().get("moldCavities") != null) {
                BigDecimal moldCavities = (BigDecimal)product.detail().get("moldCavities");
                product.detail().put("moldCavities", (Object)moldCavities.setScale(2, 4));
            }
        }
    }

    private void fillDistributionManagementData(Product product, Product productDB) {
        ProductExtend detail;
        if (product.detail() != null && !(detail = product.detail()).containsKey((Object)"deliveryMethod")) {
            detail.setDeliveryMethod((String)productDB.get("detail!deliveryMethod"));
        }
    }

    private void fillInspectionControlPointData(Product product, Product productDB) {
        ProductExtend detail = product.detail();
        if (ProductCheckUtil.isModifyFieldValue((BizObject)detail, "inspectionType", detail.getInspectionType(), productDB.get("detail!inspectionType")) && !detail.containsKey((Object)"inspectionControlPoint")) {
            if (BooleanUtil.isTrue((Object)detail.getInspectionType())) {
                detail.setInspectionControlPoint(Integer.valueOf(0));
            } else {
                detail.setInspectionControlPoint(null);
            }
        }
        if (!detail.containsKey((Object)"inspectionControlPoint")) {
            detail.setInspectionControlPoint((Integer)productDB.get("detail!inspectionControlPoint"));
        }
    }

    private void checkWhenUpdate(BillBusinessHandleDTO businessHandleDTO) throws Exception {
        ProductAssistUnitCheckUtil.checkForUpdate(businessHandleDTO, this.pubOptionService.isOpenMultiFloat());
    }

    private void fillDataFromRelaDoc(Product product, Product productDB) throws Exception {
        if (product.getUnitUseType() != null && UnitUseTypeEnum.USE_TIMPLATE.getValue() == product.getUnitUseType().shortValue() && !product.getUnitUseType().equals(productDB.getUnitUseType())) {
            if (product.getProductTemplate() == null) {
                product.setProductTemplate(productDB.getProductTemplate());
            }
            this.fillAssistUnitDataByTpl(product, EntityStatus.Insert);
        } else if (product.getProductTemplate() != null && !product.getProductTemplate().equals(productDB.getProductTemplate()) && (UnitUseTypeEnum.USE_TIMPLATE.getValue() == product.getUnitUseType().shortValue() || product.getUnitUseType() == null && UnitUseTypeEnum.USE_TIMPLATE.getValue() == productDB.getUnitUseType().shortValue())) {
            if (product.getUnitUseType() == null) {
                product.setUnitUseType(productDB.getUnitUseType());
            }
            this.fillAssistUnitDataByTpl(product, EntityStatus.Insert);
        } else if (this.containBusinessUnit(product.detail())) {
            Short unitUseType;
            Short s = unitUseType = product.getUnitUseType() != null ? product.getUnitUseType() : productDB.getUnitUseType();
            if (UnitUseTypeEnum.USE_TIMPLATE.getValue() == unitUseType.shortValue()) {
                product.setUnitUseType(unitUseType);
                Long tplId = product.getProductTemplate() != null ? product.getProductTemplate() : productDB.getProductTemplate();
                product.setProductTemplate(tplId);
                this.fillAssistUnitDataByTpl(product, EntityStatus.Update);
            }
        }
    }

    private boolean containBusinessUnit(ProductExtend detail) {
        if (detail != null) {
            for (AssistUnitType unitType : AssistUnitType.values()) {
                if (detail.get(unitType.toString()) == null) continue;
                return true;
            }
        }
        return false;
    }

    public void fillAssistUnitDataByTpl(Product product, EntityStatus status) throws Exception {
        if (product.getUnitUseType() != null && UnitUseTypeEnum.USE_TIMPLATE.getValue() == product.getUnitUseType().shortValue() && product.getProductTemplate() != null) {
            List<ProductAssistUnitExchange> assistUnitExchanges;
            ProductTplUnit tplUnit = this.productTplDao.queryTplUnitByTpl(product.getProductTemplate());
            if (ObjectUtils.isNotEmpty((Object)tplUnit)) {
                if (tplUnit.get("unit") != null) {
                    product.setUnit(Long.valueOf(Long.parseLong(tplUnit.get("unit").toString())));
                }
                if (tplUnit.get("enableAssistUnit") != null) {
                    product.setEnableAssistUnit(Boolean.valueOf(BooleanUtil.isTrue((Object)tplUnit.get("enableAssistUnit").toString())));
                }
                ProductExtend detail = product.detail();
                for (AssistUnitType unitType : AssistUnitType.values()) {
                    if (detail == null || detail.get(unitType.toString()) != null) continue;
                    detail.put(unitType.toString(), tplUnit.get(unitType.toString()));
                }
            }
            if (ObjectUtils.isNotEmpty(assistUnitExchanges = this.getAssistUnitExchangesByTpl(product.getProductTemplate())) && EntityStatus.Insert.equals((Object)status)) {
                assistUnitExchanges.forEach(v -> {
                    v.setId((Object)IdManager.getInstance().nextId());
                    v.setEntityStatus(EntityStatus.Insert);
                });
                product.setProductAssistUnitExchanges(assistUnitExchanges);
            } else if (ObjectUtils.isNotEmpty(assistUnitExchanges) && EntityStatus.Update.equals((Object)status)) {
                assistUnitExchanges.forEach(v -> v.setEntityStatus(EntityStatus.Unchanged));
                product.setProductAssistUnitExchanges(assistUnitExchanges);
            }
        }
    }

    private List<ProductAssistUnitExchange> getAssistUnitExchangesByTpl(Long tplId) throws Exception {
        List tplAssistUnitExchanges = this.productTplDao.queryTplAssistUnitExchangeByTpl(tplId);
        if (ObjectUtils.isNotEmpty((Object)tplAssistUnitExchanges)) {
            return this.buildProductAssistUnitExchange(tplAssistUnitExchanges);
        }
        return null;
    }

    private List<ProductAssistUnitExchange> buildProductAssistUnitExchange(List<ProductTplAssistUnitExchange> tplAssistUnitExchanges) {
        ArrayList<ProductAssistUnitExchange> assistUnitExchanges = new ArrayList<ProductAssistUnitExchange>();
        if (ObjectUtils.isNotEmpty(tplAssistUnitExchanges)) {
            for (ProductTplAssistUnitExchange tplAssistUnitExchange : tplAssistUnitExchanges) {
                ProductAssistUnitExchange assistUnitExchange = new ProductAssistUnitExchange();
                assistUnitExchange.setId((Object)IdManager.getInstance().nextId());
                assistUnitExchange.setUnitExchangeType(tplAssistUnitExchange.getUnitExchangeType());
                assistUnitExchange.setAssistUnit(tplAssistUnitExchange.getAssistUnit());
                assistUnitExchange.setAssistUnitCount(tplAssistUnitExchange.getAssistUnitCount());
                assistUnitExchange.setMainUnitCount(tplAssistUnitExchange.getMainUnitCount());
                assistUnitExchange.setMainUnitCountNew(tplAssistUnitExchange.getMainUnitCountNew());
                assistUnitExchange.setMainUnitRate(tplAssistUnitExchange.getMainUnitRate());
                assistUnitExchange.setAssistVersValue(tplAssistUnitExchange.getAssistVersValue());
                assistUnitExchange.setIOrder(tplAssistUnitExchange.getIOrder());
                assistUnitExchanges.add(assistUnitExchange);
            }
        }
        return assistUnitExchanges;
    }

    private void pickData(Product product, BizObject productInDb) {
        try {
            if (ObjectUtils.isNotEmpty((Object)product) && ObjectUtils.isNotEmpty((Object)productInDb)) {
                Entity entity = MetaDaoHelper.getEntity((String)"pc.product.Product");
                for (Map.Entry entry : productInDb.entrySet()) {
                    String key = (String)entry.getKey();
                    Object value = entry.getValue();
                    if (key == null || product.containsKey((Object)key)) continue;
                    if (key.indexOf("!") > -1) {
                        this.fillChildValue(product, key, entity.attrMap().get(key), value);
                        continue;
                    }
                    if (!ObjectUtils.isNotEmpty((Object)entity.attrMap()) || entity.attrMap().get(key) == null) continue;
                    this.fillFieldValue((Map<String, Object>)product, entity.attrMap().get(key), key, value);
                }
            }
        }
        catch (Exception e) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_UPDATE_COMPLETE_DATA_ERROR, new Object[]{e.getMessage()});
        }
    }

    private void processDataAfterPickData(Product product) {
        if (product.getRealProductAttribute() != null) {
            if (RealProductAttributeTypeEnum.PhysicalMaterials.getValue().equals(product.getRealProductAttribute().toString())) {
                product.setVirtualProductAttribute(null);
            } else if (RealProductAttributeTypeEnum.VirtualMaterials.getValue().equals(product.getRealProductAttribute().toString())) {
                product.setRealProductAttributeType(null);
            }
        }
    }

    private void fillChildValue(Product product, String key, Property property, Object value) throws Exception {
        if (property != null && ObjectUtils.isNotEmpty((Object)property.getTypeUri()) && MetaDaoHelper.getEntity((String)property.getTypeUri()) != null) {
            String prefix = key.substring(0, key.indexOf("!"));
            String childKey = key.substring(prefix.length() + 1);
            PropertyMap childProperties = MetaDaoHelper.getEntity((String)property.getTypeUri()).attrMap();
            Object child = product.get(prefix);
            if (child instanceof Map && !((Map)child).containsKey(key) && ObjectUtils.isNotEmpty((Object)childProperties) && childProperties.get(childKey) != null) {
                this.fillFieldValue((Map)child, childProperties.get(childKey), childKey, value);
            }
        }
    }

    private void fillFieldValue(Map<String, Object> target, Property property, String key, Object value) {
        if (target != null && property != null && key != null && value != null && !property.isElastic() && !BooleanUtil.isTrue((Object)property.isCompositionAttribute())) {
            target.put(key, value);
        }
    }

    public Product detailQueryProduct(String productId, String applyRangeId, Boolean isCreator, Boolean isApplied) throws Exception {
        Product product = new Product();
        if (productId != null && applyRangeId != null) {
            BillDataDto billtemp = new BillDataDto("pc_productdetail", productId);
            HashMap<String, Object> params = new HashMap<String, Object>();
            params.put("productApplyRangeId", applyRangeId);
            params.put("isCreator", isCreator);
            params.put("isApplied", isApplied);
            billtemp.setMapCondition(params);
            Map productMap = this.upcBillService.detail(billtemp);
            if (ObjectUtils.isNotEmpty((Object)productMap)) {
                product.init(productMap);
            } else {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_DETAIL_DATA_NOT_EXISTS);
            }
        }
        return product;
    }
}


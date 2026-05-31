/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.alibaba.fastjson.serializer.SerializerFeature
 *  com.yonyou.iuap.apdoc.coredoc.constants.CheckLimitConstant
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.org.dto.ConditionDTO
 *  com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.CommonRuleUtils
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.transtype.model.TransType
 *  com.yonyoucloud.iuap.upc.dto.MaterialClassDTO
 *  com.yonyoucloud.iuap.upc.dto.MaterialClassQryDTO
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.productapply.EffectType
 *  com.yonyoucloud.upc.pc.productapply.ProductApply
 *  com.yonyoucloud.upc.pc.productapply.ProductApplyType
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.billrule.product;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.yonyou.iuap.apdoc.coredoc.constants.CheckLimitConstant;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.org.dto.ConditionDTO;
import com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.bill.rule.base.CommonRuleUtils;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.transtype.model.TransType;
import com.yonyoucloud.iuap.upc.api.IProductService;
import com.yonyoucloud.iuap.upc.dto.MaterialClassDTO;
import com.yonyoucloud.iuap.upc.dto.MaterialClassQryDTO;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.productapply.EffectType;
import com.yonyoucloud.upc.pc.productapply.ProductApply;
import com.yonyoucloud.upc.pc.productapply.ProductApplyType;
import com.yonyoucloud.upc.service.CoredocTransTypeService;
import com.yonyoucloud.upc.service.ProductApplyService;
import com.yonyoucloud.upc.service.ProductDefaultValueService;
import com.yonyoucloud.upc.service.api.ProductCheckForApiService;
import com.yonyoucloud.upc.service.api.ProductSaveServiceImpl;
import com.yonyoucloud.upc.service.bill.product.ProductAssistUnitCheckUtil;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

@Component(value="productApplyImportRule")
public class ProductApplyImportRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(ProductApplyImportRule.class);
    @Autowired
    ProductApplyService productApplyService;
    @Autowired
    private IProductService productService;
    @Autowired
    private ProductDefaultValueService productDefaultValueService;
    @Autowired
    private ProductCheckForApiService productCheckForApiService;
    @Autowired
    private ProductSaveServiceImpl productSaveService;
    @Autowired
    ProductSaveServiceImpl productSaveServiceImpl;
    @Autowired
    ProductAssistUnitCheckUtil productAssistUnitModel;
    @Autowired
    CoredocTransTypeService coredocTransTypeService;
    @Autowired
    IOrgUnitQueryService orgUnitQueryService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        RuleExecuteResult result = new RuleExecuteResult();
        if (null == billContext || billDataDto == null) {
            return result;
        }
        List bills = this.getBills(billContext, map);
        Map externalData = (Map)billDataDto.getExternalData();
        if ("pc_productapply".equals(externalData.get("serviceCode"))) {
            for (BizObject bill : bills) {
                Product product = (Product)bill;
                ProductApply productApply = this.fillProductApply(product);
                this.productApplyService.saveProductApply(productApply);
                result.setCancel(true);
            }
        }
        return result;
    }

    private ProductApply fillProductApply(Product product) throws Exception {
        ProductApply productApply = new ProductApply();
        this.initProductApply(product, productApply);
        DataTransferUtils.fill((String)"pc_productapply", (String)"pc.productapply.ProductApply", (Object)productApply, (int)2);
        this.dataTransferCheck(productApply);
        this.productDefaultValueService.setDefaultValueForProductInsert(product);
        DataTransferUtils.fill((String)"pc_product", (String)"pc.product.Product", (Object)product, (int)2);
        this.productCheckForApiService.checkAndSetProductApplyOrg(product);
        this.productSaveService.handleUnitForProduct(product);
        if (!StringUtils.hasText((String)((String)product.get("transType_Name")))) {
            List<TransType> transTypes = this.coredocTransTypeService.getTransTypeByFormId("PC.pc_product");
            if (CollectionUtils.isEmpty(transTypes)) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.COMMON_TRANS_TYPE_NOT_FOUND);
            }
            product.setTransType(transTypes.get(0).getId());
            product.put("transType_Name", (Object)transTypes.get(0).getName().toString());
        }
        this.setMaterialClassNameAndCode(product);
        CommonRuleUtils.clearParent(Arrays.asList(product));
        this.changeBizObjectToViewModel(product, "detail", "detail");
        this.removePartProductAttr(product);
        product.setProductOrgs(product.productApplyRange());
        product.setProductApplyRange(null);
        this.changeBizObjectToViewModel(product, "description", "description");
        this.changeBizObjectToViewModel(product, "time", "time");
        this.removeProductId((Map)product, 0);
        this.productSaveServiceImpl.dealProductCharacterData(product, "productCharacterDef");
        this.productSaveServiceImpl.dealProductCharacterData(product, "productPropCharacterDefine");
        this.productSaveServiceImpl.dealProductCharacterData(product, "detail!productExtendCharacterDef");
        productApply.setProductData(JSON.toJSONStringWithDateFormat((Object)product, (String)"yyyy-MM-dd HH:mm:ss", (SerializerFeature[])new SerializerFeature[]{SerializerFeature.WriteDateUseDateFormat, SerializerFeature.WriteMapNullValue}));
        return productApply;
    }

    private void dataTransferCheck(ProductApply productApply) {
        ConditionDTO condition;
        if (StringUtils.hasText((String)((String)productApply.get("bizOperator_Code"))) && !StringUtils.hasText((String)productApply.getBizOperator())) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_BIZ_OPERATOR_CODE_NOT_FOUND, new Object[]{productApply.get("bizOperator_Code").toString()});
        }
        if (StringUtils.hasText((String)((String)productApply.get("applyDepartment_Code"))) && !StringUtils.hasText((String)productApply.getApplyDepartment())) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_DEPARTMENT_CODE_NOT_FOUND, new Object[]{productApply.get("applyDepartment_Code").toString()});
        }
        if (StringUtils.hasText((String)((String)productApply.get("applyOrg_Code"))) && !StringUtils.hasText((String)productApply.getApplyOrg())) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_APPLYORG_CODE_NOT_FOUND, new Object[]{productApply.get("applyOrg_Code").toString()});
        }
        if (StringUtils.hasText((String)productApply.getApplyDepartment())) {
            condition = ConditionDTO.newDeptCondition();
            condition.andIdIn(Arrays.asList(productApply.getApplyDepartment()));
            List departments = this.orgUnitQueryService.getByCondition(AppContext.getCurrentUser().getYTenantId(), condition);
            if (CollectionUtils.isEmpty((Collection)departments)) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_APPLY_DEPARTMENT_NOT_FOUND, new Object[]{productApply.getApplyCode(), productApply.get("applyDepartment_Code")});
            }
        }
        if (StringUtils.hasText((String)productApply.getApplyOrg())) {
            condition = ConditionDTO.newOrgCondition();
            condition.andIdIn(Arrays.asList(productApply.getApplyOrg()));
            List orgs = this.orgUnitQueryService.getByCondition(AppContext.getCurrentUser().getYTenantId(), condition);
            if (CollectionUtils.isEmpty((Collection)orgs)) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_APPLY_ORG_NOT_FOUND, new Object[]{productApply.getApplyCode(), productApply.get("applyOrg_Code")});
            }
        }
    }

    private void removePartProductAttr(Product product) {
        product.remove("id");
        product.remove("productApplyRangeId");
        product.remove("detail!id");
        product.remove("detail!productApplyRangeId");
    }

    private void initProductApply(Product product, ProductApply productApply) {
        productApply.setApplyType(ProductApplyType.add);
        productApply.setEntityStatus(EntityStatus.Insert);
        productApply.setApplyCode((String)product.get("productApply_code"));
        productApply.setApplyReason((String)product.get("productApply_reason"));
        productApply.put("bizOperator_Code", product.get("productApply_bizOperatorCode"));
        productApply.put("applyDepartment_Code", product.get("productApply_departmentCode"));
        productApply.put("applyOrg_Code", product.get("productApply_applyOrgCode"));
        productApply.setEffectType(EffectType.immediately);
        if (product.get("productApply_effectType") != null && String.valueOf(EffectType.timeing.getValue()).equals(product.get("productApply_effectType"))) {
            productApply.setEffectType(EffectType.timeing);
        }
        if (EffectType.timeing.equals((Object)productApply.getEffectType()) && product.get("productApply_effectTime") != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            try {
                Date effectTime = simpleDateFormat.parse((String)product.get("productApply_effectTime"));
                productApply.setEffectTime(effectTime);
            }
            catch (Exception e) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_EFFECT_TIME_FORMAT_ERROR);
            }
        }
    }

    private void changeBizObjectToViewModel(Product product, String sourceKey, String target) {
        if (product.get(sourceKey) != null && product.get(sourceKey) instanceof Map && ((Map)product.get(sourceKey)).size() < CheckLimitConstant.DEFAULT_LIMIT) {
            for (Map.Entry entry : ((Map)product.get(sourceKey)).entrySet()) {
                product.put(target + "!" + (String)entry.getKey(), entry.getValue());
            }
            product.remove(sourceKey);
        }
    }

    private void removeProductId(Map sourceMap, int level) {
        if (sourceMap == null || level > 3) {
            return;
        }
        sourceMap.remove("productId");
        Set keys = sourceMap.keySet();
        if (keys.size() > 0) {
            for (String key : keys) {
                if (!(sourceMap.get(key) instanceof Map)) continue;
                this.removeProductId((Map)sourceMap.get(key), ++level);
            }
        }
    }

    private void setMaterialClassNameAndCode(final Product product) throws Exception {
        MaterialClassQryDTO materialClassQryDTO = new MaterialClassQryDTO();
        if (product.getManageClass() != null) {
            materialClassQryDTO.setMaterialClassIdList((List)new ArrayList<Long>(){
                {
                    this.add(product.getManageClass());
                }
            });
        } else if (product.get("manageClass_Code") != null) {
            materialClassQryDTO.setMaterialClassCodeList((List)new ArrayList<String>(){
                {
                    this.add((String)product.get("manageClass_Code"));
                }
            });
        }
        List<MaterialClassDTO> materialClassByIdOrCode = this.productService.getMaterialClassByIdOrCode(materialClassQryDTO, new String[]{"name", "code", "id"});
        if (CollectionUtils.isEmpty(materialClassByIdOrCode)) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_MANAGE_CLASS_NOT_FOUND);
        }
        product.put("manageClass_Code", (Object)materialClassByIdOrCode.get(0).getCode());
        product.put("manageClass_Name", (Object)materialClassByIdOrCode.get(0).getName());
    }
}


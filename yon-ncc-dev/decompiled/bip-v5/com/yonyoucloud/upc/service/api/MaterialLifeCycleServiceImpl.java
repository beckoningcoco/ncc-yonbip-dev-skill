/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.option.util.OptionUtils
 *  com.yonyoucloud.iuap.upc.api.IMaterialLifeCycleService
 *  com.yonyoucloud.iuap.upc.dto.MaterialLifeCycleCheckDTO
 *  com.yonyoucloud.iuap.upc.dto.MaterialStatusDetailDTO
 *  com.yonyoucloud.iuap.upc.dto.ProductDTO
 *  com.yonyoucloud.iuap.upc.dto.ProductQryDTO
 *  com.yonyoucloud.iuap.upc.vo.MaterialLifeCycleCheckVO
 *  com.yonyoucloud.upc.pc.manage.ControlRule
 *  org.apache.commons.lang3.StringUtils
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.service.api;

import com.alibaba.fastjson.JSON;
import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.option.util.OptionUtils;
import com.yonyoucloud.iuap.upc.api.IMaterialLifeCycleService;
import com.yonyoucloud.iuap.upc.api.IProductService;
import com.yonyoucloud.iuap.upc.dto.MaterialLifeCycleCheckDTO;
import com.yonyoucloud.iuap.upc.dto.MaterialStatusDetailDTO;
import com.yonyoucloud.iuap.upc.dto.ProductDTO;
import com.yonyoucloud.iuap.upc.dto.ProductQryDTO;
import com.yonyoucloud.iuap.upc.vo.MaterialLifeCycleCheckVO;
import com.yonyoucloud.upc.pc.manage.ControlRule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public class MaterialLifeCycleServiceImpl
implements IMaterialLifeCycleService {
    private static final Logger log = LoggerFactory.getLogger(MaterialLifeCycleServiceImpl.class);
    @Autowired
    private YMSParamConfig ymsParamConfig;
    @Autowired
    private IProductService productService;

    public List<MaterialLifeCycleCheckVO> getControlRule(List<MaterialLifeCycleCheckDTO> checkDTOS) throws Exception {
        String lifeCycleIsOpen = this.ymsParamConfig.getMaterialLifecycle();
        boolean isOpen = StringUtils.isNotBlank((CharSequence)lifeCycleIsOpen) && ("true".equalsIgnoreCase(lifeCycleIsOpen) || Boolean.valueOf(lifeCycleIsOpen) == true);
        boolean isOpenLifeCycle = false;
        try {
            Object isLifeCycle = OptionUtils.getSysOptionByName((String)"isLifeCycle");
            if (isLifeCycle != null && Boolean.valueOf(isLifeCycle.toString()).booleanValue()) {
                isOpenLifeCycle = true;
            }
        }
        catch (Exception e) {
            log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408062F", (String)"\u83b7\u53d6\u516c\u5171\u53c2\u6570\u5f02\u5e38\uff1a") + e.getMessage(), (Throwable)e);
            isOpenLifeCycle = true;
        }
        ArrayList<MaterialLifeCycleCheckVO> materialLifeCycleCheckVOS = new ArrayList<MaterialLifeCycleCheckVO>();
        if (null == checkDTOS || checkDTOS.size() > UpcAPiTool.List_LENGTH) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801416, new Object[]{UpcAPiTool.List_LENGTH});
        }
        if (!isOpen || !isOpenLifeCycle) {
            return this.defaultReturn(checkDTOS);
        }
        ArrayList productIds = new ArrayList();
        ArrayList orgIds = new ArrayList();
        checkDTOS.forEach(checkDTO -> {
            productIds.add(checkDTO.getProductId());
            orgIds.add(checkDTO.getOrgId());
        });
        ArrayList materialStatusIds = new ArrayList();
        HashMap productStatusMap = new HashMap();
        HashMap productIdCodeMap = new HashMap();
        ProductQryDTO qryDTO = new ProductQryDTO();
        qryDTO.setProductIdList(productIds);
        qryDTO.setOrgStringList(orgIds);
        List<ProductDTO> productDTOList = this.productService.listProductInfo(qryDTO, new String[]{"id", "orgId", "createOrgId", "code", "materialStatus", "orgMaterialStatus"});
        if (productDTOList != null && productDTOList.size() > 0) {
            productDTOList.forEach(productDTO -> {
                productIdCodeMap.put(productDTO.getId().toString(), productDTO.getCode());
                if (null != productDTO.getMaterialStatus()) {
                    if (!materialStatusIds.contains(productDTO.getMaterialStatus())) {
                        materialStatusIds.add(productDTO.getMaterialStatus());
                    }
                    productStatusMap.put(productDTO.getId().toString(), productDTO.getMaterialStatus());
                }
                if (null != productDTO.getOrgMaterialStatus()) {
                    if (!materialStatusIds.contains(productDTO.getOrgMaterialStatus())) {
                        materialStatusIds.add(productDTO.getOrgMaterialStatus());
                    }
                    productStatusMap.put(productDTO.getId().toString() + "|" + productDTO.getOrgId(), productDTO.getOrgMaterialStatus());
                }
            });
            if (materialStatusIds.size() > 0) {
                HashMap<String, Object> params = new HashMap<String, Object>();
                params.put("tenantId", AppContext.getCurrentUser().getTenant());
                params.put("ytenantId", AppContext.getYTenantId());
                params.put("materialStatusIds", materialStatusIds);
                HashMap statusContrlMap = new HashMap();
                List materialStatusResult = SqlHelper.selectList((String)"com.yonyoucloud.upc.dao.MaterialStatus.listMaterailStatusByIds", params);
                if (materialStatusResult != null && materialStatusResult.size() > 0) {
                    List materialStatusDetailDTOList = JSON.parseArray((String)JSON.toJSONString((Object)materialStatusResult), MaterialStatusDetailDTO.class);
                    materialStatusDetailDTOList.forEach(materialStatusDetailDTO -> {
                        StringBuilder sb = new StringBuilder(materialStatusDetailDTO.getMaterialStatusId() + "-");
                        sb.append(materialStatusDetailDTO.getServiceCode() + "-");
                        sb.append(materialStatusDetailDTO.getActionCode());
                        if (materialStatusDetailDTO.getTransType() != null) {
                            sb.append("-" + materialStatusDetailDTO.getTransType());
                        }
                        statusContrlMap.put(sb.toString(), materialStatusDetailDTO.getControRule());
                    });
                }
                checkDTOS.forEach(checkDTO -> {
                    String materialStatusId = (String)productStatusMap.get(checkDTO.getProductId().toString());
                    String productCode = (String)productIdCodeMap.get(checkDTO.getProductId().toString());
                    ControlRule controlRule = this.getControlRule(materialStatusId, (MaterialLifeCycleCheckDTO)checkDTO, statusContrlMap);
                    if (controlRule == ControlRule.Forbid) {
                        MaterialLifeCycleCheckVO materialLifeCycleCheckVO = this.getCheckVO(checkDTO.getProductId(), productCode, ControlRule.Forbid);
                        materialLifeCycleCheckVOS.add(materialLifeCycleCheckVO);
                    } else {
                        String key = checkDTO.getProductId().toString() + "|" + checkDTO.getOrgId();
                        String materialOrgStatusId = (String)productStatusMap.get(key);
                        controlRule = this.getControlRule(materialOrgStatusId, (MaterialLifeCycleCheckDTO)checkDTO, statusContrlMap);
                        if (controlRule == ControlRule.Forbid) {
                            MaterialLifeCycleCheckVO materialLifeCycleCheckVO = this.getCheckVO(checkDTO.getProductId(), productCode, ControlRule.Forbid);
                            materialLifeCycleCheckVOS.add(materialLifeCycleCheckVO);
                        } else {
                            MaterialLifeCycleCheckVO materialLifeCycleCheckVO = this.getCheckVO(checkDTO.getProductId(), productCode, controlRule);
                            materialLifeCycleCheckVOS.add(materialLifeCycleCheckVO);
                        }
                    }
                });
            } else {
                checkDTOS.forEach(checkDTO -> materialLifeCycleCheckVOS.add(this.getCheckVO(checkDTO.getProductId(), (String)productIdCodeMap.get(checkDTO.getProductId().toString()), ControlRule.Permit)));
            }
        }
        return materialLifeCycleCheckVOS;
    }

    private List<MaterialLifeCycleCheckVO> defaultReturn(List<MaterialLifeCycleCheckDTO> checkDTOs) {
        ArrayList<MaterialLifeCycleCheckVO> materialLifeCycleCheckVOs = new ArrayList<MaterialLifeCycleCheckVO>();
        for (MaterialLifeCycleCheckDTO materialLifeCycleCheckDTO : checkDTOs) {
            MaterialLifeCycleCheckVO materialLifeCycleCheckVO = new MaterialLifeCycleCheckVO();
            materialLifeCycleCheckVO.setProductId(materialLifeCycleCheckDTO.getProductId());
            materialLifeCycleCheckVO.setControlRule(Integer.valueOf(ControlRule.Permit.getValue()));
            materialLifeCycleCheckVO.setDesc(ControlRule.Permit.getName());
            materialLifeCycleCheckVOs.add(materialLifeCycleCheckVO);
        }
        return materialLifeCycleCheckVOs;
    }

    private ControlRule getControlRule(String materialStatusId, MaterialLifeCycleCheckDTO checkDTO, HashMap<String, Integer> statusContrlMap) {
        Integer statusContrl;
        StringBuilder sb = new StringBuilder(materialStatusId + "-");
        sb.append(checkDTO.getServiceCode() + "-");
        sb.append(checkDTO.getAction());
        if (checkDTO.getTransType() != null && checkDTO.getTransType().length() > 0) {
            sb.append("-" + checkDTO.getTransType());
        }
        if ((statusContrl = statusContrlMap.get(sb.toString())) == null) {
            sb = new StringBuilder(materialStatusId + "-");
            sb.append(checkDTO.getServiceCode() + "-");
            sb.append(checkDTO.getAction());
            statusContrl = statusContrlMap.get(sb.toString());
            if (statusContrl == null) {
                return ControlRule.Permit;
            }
            return ControlRule.find((Number)statusContrl);
        }
        return ControlRule.find((Number)statusContrl);
    }

    private MaterialLifeCycleCheckVO getCheckVO(Long productId, String code, ControlRule controlRule) {
        MaterialLifeCycleCheckVO materialLifeCycleCheckVO = new MaterialLifeCycleCheckVO();
        materialLifeCycleCheckVO.setProductId(productId);
        materialLifeCycleCheckVO.setControlRule(Integer.valueOf(controlRule.getValue()));
        materialLifeCycleCheckVO.setDesc(String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080631", (String)"\u7269\u6599:%s \u72b6\u6001\u4e3a%s"), code, controlRule.getName()));
        return materialLifeCycleCheckVO;
    }
}


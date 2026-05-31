/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.constant.ApplicationCodeConstant
 *  com.yonyou.iuap.apdoc.coredoc.enums.LanguagesEnum
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.transtype.model.BdBillType
 *  com.yonyou.ucf.transtype.model.BdTransType
 *  com.yonyou.ucf.transtype.model.BillTypeQueryParam
 *  com.yonyou.ucf.transtype.model.TransType
 *  com.yonyou.ucf.transtype.model.TransTypeQueryParam
 *  com.yonyou.ucf.transtype.service.itf.IBillTypeService
 *  com.yonyou.ucf.transtype.service.itf.ITransTypeService
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.yonyou.iuap.apdoc.coredoc.constant.ApplicationCodeConstant;
import com.yonyou.iuap.apdoc.coredoc.enums.LanguagesEnum;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.transtype.model.BdBillType;
import com.yonyou.ucf.transtype.model.BdTransType;
import com.yonyou.ucf.transtype.model.BillTypeQueryParam;
import com.yonyou.ucf.transtype.model.TransType;
import com.yonyou.ucf.transtype.model.TransTypeQueryParam;
import com.yonyou.ucf.transtype.service.itf.IBillTypeService;
import com.yonyou.ucf.transtype.service.itf.ITransTypeService;
import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class CoredocTransTypeService {
    @Autowired
    private ITransTypeService iTransTypeService;
    @Autowired
    IBillTypeService iBillTypeService;

    public List<BdBillType> getBillTypeId() throws Exception {
        BillTypeQueryParam billTypeQueryParam = new BillTypeQueryParam();
        billTypeQueryParam.setSysid(ApplicationCodeConstant.getApplicationCodeByFullName((String)"pc.product.Product"));
        billTypeQueryParam.setFormId("PC.pc_product");
        billTypeQueryParam.setTenantId((String)AppContext.getYhtTenantId());
        List bdBillTypes = this.iBillTypeService.queryBillTypes(billTypeQueryParam);
        return bdBillTypes;
    }

    public List<BdTransType> getTransTypeIdAndNameByBillId(List<BdBillType> billTypeVOList) throws Exception {
        TransTypeQueryParam transTypeQueryParam = new TransTypeQueryParam();
        transTypeQueryParam.setBillTypeId(billTypeVOList.get(0).getId());
        transTypeQueryParam.setIsDefault(Integer.valueOf(1));
        transTypeQueryParam.setEnable(Integer.valueOf(1));
        transTypeQueryParam.setTenantId(AppContext.getCurrentUser().getYTenantId());
        List transTypeList = this.iTransTypeService.queryTransTypes(transTypeQueryParam);
        if (CollectionUtils.isEmpty((Collection)transTypeList)) {
            transTypeQueryParam.setIsDefault(null);
            transTypeQueryParam.setTransTypeCode("SYCSR002");
            transTypeList = this.iTransTypeService.queryTransTypes(transTypeQueryParam);
        }
        return transTypeList;
    }

    public List<TransType> getTransTypeByFormId(String formId) throws Exception {
        TransTypeQueryParam transTypeQueryParam = new TransTypeQueryParam();
        transTypeQueryParam.setFormId("PC.pc_product");
        transTypeQueryParam.setIsDefault(Integer.valueOf(1));
        transTypeQueryParam.setEnable(Integer.valueOf(1));
        transTypeQueryParam.setTenantId(AppContext.getCurrentUser().getYTenantId());
        return this.iTransTypeService.queryMultiLTransTypes(transTypeQueryParam);
    }

    public List<BdTransType> getTransTypeNameById(Object transtypeId) throws Exception {
        TransTypeQueryParam transTypeQueryParam = new TransTypeQueryParam();
        transTypeQueryParam.setId(transtypeId.toString());
        transTypeQueryParam.setEnable(Integer.valueOf(1));
        transTypeQueryParam.setTenantId(AppContext.getCurrentUser().getYTenantId());
        List bdTransTypeList = this.iTransTypeService.queryTransTypes(transTypeQueryParam);
        return bdTransTypeList;
    }

    public BdTransType getTransTypeDataById(String transtypeId) throws Exception {
        BdTransType bdTransType = this.iTransTypeService.getTransTypesById(AppContext.getCurrentUser().getYTenantId(), transtypeId);
        return bdTransType;
    }

    public String getTranstypeName(BdTransType bdTransType, String local) {
        String transTypeName = null;
        if (LanguagesEnum.zh_CN.getName().equals(local)) {
            transTypeName = bdTransType.getName();
        } else if (LanguagesEnum.en_US.getName().equals(local)) {
            transTypeName = bdTransType.getName2();
        } else if (LanguagesEnum.zh_TW.getName().equals(local)) {
            transTypeName = bdTransType.getName3();
        }
        return transTypeName;
    }
}


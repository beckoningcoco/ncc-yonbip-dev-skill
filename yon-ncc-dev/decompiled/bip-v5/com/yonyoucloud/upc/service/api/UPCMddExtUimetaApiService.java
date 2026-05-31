/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.uimeta.common.util.UnifiedMapKeyUtil
 *  com.yonyou.ucf.mdd.api.interfaces.rpc.IUimetaApi
 *  com.yonyou.ucf.mdd.common.dto.uimeta.staterule.BillStateRuleDTO
 *  com.yonyou.ucf.mdd.common.model.ref.RefEntity
 *  com.yonyou.ucf.mdd.common.model.uimeta.MetaInfo
 *  com.yonyou.ucf.mdd.common.model.uimeta.ui.Entity
 *  com.yonyou.ucf.mdd.common.model.uimeta.ui.Field
 *  com.yonyou.ucf.mdd.common.model.uimeta.ui.ViewModel
 *  com.yonyou.ucf.mdd.ext.bill.meta.service.BillMetaService
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.service.MddExtUimetaApiService
 *  com.yonyou.ucf.userdef.dto.SyncCharacterDto
 *  com.yonyou.ucf.userdef.dto.SyncCharacterResult
 *  com.yonyou.yonbuilder.uimeta.mdf.unified.itf.adaptor.UiMetaUnifiedCommonAdaptor
 *  com.yonyou.ypd.bill.basic.constant.BillErrorEnum
 *  com.yonyou.ypd.bill.basic.exception.YpdException
 *  com.yonyou.ypd.bill.infrastructure.service.api.BillMetaService
 *  com.yonyou.ypd.bill.infrastructure.service.api.IBillContextService
 *  com.yonyou.ypd.bill.infrastructure.service.api.IBillRefService
 *  com.yonyou.ypd.bill.infrastructure.service.api.IEnvService
 *  com.yonyou.ypd.bill.infrastructure.service.api.IYpdUITransfService
 *  com.yonyou.ypd.bill.utils.IrisRpcUtil
 *  com.yonyou.ypd.mdf.adapter.init.service.BathInitUiMetaService
 *  com.yonyou.ypd.mdf.adapter.service.IFilterService
 *  com.yonyou.ypd.mdf.adapter.service.impl.report.service.IReportSubscriptionService
 *  com.yonyou.ypd.mdf.adapter.service.impl.uimeta.YpdUimetaServiceImpl
 *  com.yonyou.ypd.mdf.runtime.character.UIMetaCharacterService
 *  com.yonyou.ypd.mdf.runtime.uimeta.service.BillItemSetExtService
 *  com.yonyou.ypd.mdf.runtime.uimeta.service.BillStateRuleService
 *  org.apache.commons.lang3.StringUtils
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.service.api;

import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.uimeta.common.util.UnifiedMapKeyUtil;
import com.yonyou.ucf.mdd.api.interfaces.rpc.IUimetaApi;
import com.yonyou.ucf.mdd.common.dto.uimeta.staterule.BillStateRuleDTO;
import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.common.model.uimeta.MetaInfo;
import com.yonyou.ucf.mdd.common.model.uimeta.ui.Entity;
import com.yonyou.ucf.mdd.common.model.uimeta.ui.Field;
import com.yonyou.ucf.mdd.common.model.uimeta.ui.ViewModel;
import com.yonyou.ucf.mdd.ext.bill.meta.service.BillMetaService;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.service.MddExtUimetaApiService;
import com.yonyou.ucf.userdef.dto.SyncCharacterDto;
import com.yonyou.ucf.userdef.dto.SyncCharacterResult;
import com.yonyou.yonbuilder.uimeta.mdf.unified.itf.adaptor.UiMetaUnifiedCommonAdaptor;
import com.yonyou.ypd.bill.basic.constant.BillErrorEnum;
import com.yonyou.ypd.bill.basic.exception.YpdException;
import com.yonyou.ypd.bill.infrastructure.service.api.IBillContextService;
import com.yonyou.ypd.bill.infrastructure.service.api.IBillRefService;
import com.yonyou.ypd.bill.infrastructure.service.api.IEnvService;
import com.yonyou.ypd.bill.infrastructure.service.api.IYpdUITransfService;
import com.yonyou.ypd.bill.utils.IrisRpcUtil;
import com.yonyou.ypd.mdf.adapter.init.service.BathInitUiMetaService;
import com.yonyou.ypd.mdf.adapter.service.IFilterService;
import com.yonyou.ypd.mdf.adapter.service.impl.report.service.IReportSubscriptionService;
import com.yonyou.ypd.mdf.adapter.service.impl.uimeta.YpdUimetaServiceImpl;
import com.yonyou.ypd.mdf.runtime.character.UIMetaCharacterService;
import com.yonyou.ypd.mdf.runtime.uimeta.service.BillItemSetExtService;
import com.yonyou.ypd.mdf.runtime.uimeta.service.BillStateRuleService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service(value="uPCMddExtUimetaApiService")
public class UPCMddExtUimetaApiService
extends MddExtUimetaApiService {
    private static final Logger logger = LoggerFactory.getLogger(UPCMddExtUimetaApiService.class);
    private BillMetaService billMetaService;
    private YpdUimetaServiceImpl ypdUimetaService;

    public UPCMddExtUimetaApiService(IFilterService filterService, IBillRefService refService, IEnvService envService, @Qualifier(value="ypdReportSubscriptionService") IReportSubscriptionService reportSubscriptionService, IYpdUITransfService iYpdUITransfService, BillMetaService mddBillMetaService, com.yonyou.ypd.bill.infrastructure.service.api.BillMetaService ypdBillMetaService, IBillContextService billContextService, UIMetaCharacterService uiMetaCharacterService, @Qualifier(value="ypdadapterInitUiMetaService") BathInitUiMetaService bathInitUiMetaService, UiMetaUnifiedCommonAdaptor uiMetaUnifiedCommonAdaptor, BillStateRuleService stateRuleService, BillItemSetExtService billItemSetExtService) {
        this.billMetaService = mddBillMetaService;
        this.ypdUimetaService = new YpdUimetaServiceImpl(filterService, refService, envService, reportSubscriptionService, iYpdUITransfService, ypdBillMetaService, billContextService, uiMetaCharacterService, bathInitUiMetaService, uiMetaUnifiedCommonAdaptor, stateRuleService, billItemSetExtService);
    }

    public ViewModel getSimpleVM(String billNo, Long tplid, Boolean isTplExport, Boolean isMain) throws Exception {
        boolean customerapplyFlag;
        ViewModel simpleVM = this.billMetaService.getSimpleVM(billNo, tplid, isTplExport, isMain);
        boolean productapplyFlag = "pc_productapplylist".equals(billNo) || "pc_productapply".equals(billNo);
        boolean bl = customerapplyFlag = "aa_customerapplylist".equals(billNo) || "aa_customerapply".equals(billNo);
        if (productapplyFlag || customerapplyFlag) {
            LinkedHashSet productapplyVMEntities = simpleVM.getEntities();
            Entity productApplyEntity = null;
            List<Field> productApplyInfofields = new ArrayList();
            for (Entity entity : productapplyVMEntities) {
                String code = entity.getCode();
                if (!"pc_productapply".equals(code) && !"aa_customerapply".equals(code)) continue;
                productApplyEntity = entity;
                productApplyInfofields = entity.getFields();
                break;
            }
            ViewModel productVM = null;
            if (productapplyFlag) {
                productVM = this.billMetaService.getSimpleVM("pc_product", Long.valueOf(this.getProductTplId("pc_product")), isTplExport, isMain);
            } else if (customerapplyFlag) {
                productVM = this.billMetaService.getSimpleVM("aa_merchant", Long.valueOf(this.getProductTplId("aa_merchant")), isTplExport, isMain);
            }
            LinkedHashSet productVMEntities = productVM.getEntities();
            for (Entity entity : productVMEntities) {
                List fields = entity.getFields();
                for (Field field : fields) {
                    Boolean hidden = field.getHidden();
                    Boolean showIt = field.getShowIt();
                    if (hidden.booleanValue() || !showIt.booleanValue()) continue;
                    productApplyInfofields.add(field);
                }
            }
            productApplyEntity.setFields(productApplyInfofields);
        }
        return simpleVM;
    }

    public long getProductTplId(String billno) throws Exception {
        HashMap<String, Object> paramMap = new HashMap<String, Object>(2);
        paramMap.put("billno", billno);
        paramMap.put("ytenant", AppContext.getYTenantId());
        Map productbill = (Map)SqlHelper.selectOne((String)"com.yonyoucloud.upc.product.dao.ProductQuery.getBillOfProduct", paramMap);
        if (null == productbill || null == productbill.get("iDefTplId")) {
            paramMap.put("tenantId", 0);
            productbill = (Map)SqlHelper.selectOne((String)"com.yonyoucloud.upc.product.dao.ProductQuery.getBillOfProduct", paramMap);
        }
        return Long.parseLong(productbill.get("iDefTplId").toString());
    }

    public void clearVmCache(List<String> bizObjCodes) {
        super.clearVmCache(bizObjCodes);
        this.ypdUimetaService.clearVmCache(bizObjCodes);
    }

    public void clearCacheByTenant() {
        super.clearCacheByTenant();
        this.ypdUimetaService.clearCacheByTenant();
    }

    public SyncCharacterResult clearTenantCacheByCharacterEntity(SyncCharacterDto syncCharacter) {
        this.ypdUimetaService.clearTenantCacheByCharacterEntity(syncCharacter);
        return super.clearTenantCacheByCharacterEntity(syncCharacter);
    }

    public Map<String, Object> getBillMeta(boolean bIncludeViewModel, boolean bIncludeView, Map<String, Object> params, boolean bDesignMode, boolean isSum) throws Exception {
        String refCode = UnifiedMapKeyUtil.getMapStringValueByKey((String)"refcode", params);
        if (UPCMddExtUimetaApiService.isTaxRevenueRef(refCode)) {
            logger.error("[TaxRevenueRef forward] UPCMddExtUimetaApiService#getBillMeta params - bIncludeViewModel:{}, bIncludeView:{}, params:{}, bDesignMode:{}, isSum:{}", new Object[]{bIncludeViewModel, bIncludeView, params, bDesignMode, isSum});
            IUimetaApi uimetaApi = (IUimetaApi)IrisRpcUtil.getIrisReference((String)"yonbip-fi-taxpubdoc", IUimetaApi.class);
            return uimetaApi.getBillMeta(bIncludeViewModel, bIncludeView, params, bDesignMode, isSum);
        }
        return super.getBillMeta(bIncludeViewModel, bIncludeView, params, bDesignMode, isSum);
    }

    public RefEntity getRefEntity(Map param) throws Exception {
        String refCode = (String)param.get("refCode");
        if (refCode.contains(".")) {
            String[] arr = refCode.split("\\.");
            refCode = arr[1];
        }
        if (UPCMddExtUimetaApiService.isTaxRevenueRef(refCode)) {
            logger.error("[TaxRevenueRef forward] UPCMddExtUimetaApiService#getRefEntity params - param:{}", (Object)param);
            IUimetaApi uimetaApi = (IUimetaApi)IrisRpcUtil.getIrisReference((String)"yonbip-fi-taxpubdoc", IUimetaApi.class);
            List refEntities = uimetaApi.findRefEntityByCode(param);
            if (refEntities != null && !refEntities.isEmpty()) {
                return (RefEntity)refEntities.get(0);
            }
            throw new YpdException(BillErrorEnum.YPD_REF_NOT_FOUND);
        }
        return super.getRefEntity(param);
    }

    public List<RefEntity> findTenantRefEntityByCode(Map param) throws Exception {
        String refCode = (String)param.get("refCode");
        if (refCode.contains(".")) {
            String[] arr = refCode.split("\\.");
            refCode = arr[1];
        }
        if (UPCMddExtUimetaApiService.isTaxRevenueRef(refCode)) {
            logger.error("[TaxRevenueRef forward] UPCMddExtUimetaApiService#findTenantRefEntityByCode params - param:{}", (Object)param);
            IUimetaApi uimetaApi = (IUimetaApi)IrisRpcUtil.getIrisReference((String)"yonbip-fi-taxpubdoc", IUimetaApi.class);
            return uimetaApi.findRefEntityByCode(param);
        }
        return super.findTenantRefEntityByCode(param);
    }

    public List<MetaInfo> getEntityInfoByBillNo(String billno, Boolean bSearchBox) throws Exception {
        if (UPCMddExtUimetaApiService.isTaxRevenueRef(billno)) {
            logger.error("[TaxRevenueRef forward] UPCMddExtUimetaApiService#getEntityInfoByBillNo params - billno:{}, bSearchBox:{}", (Object)billno, (Object)bSearchBox);
            IUimetaApi uimetaApi = (IUimetaApi)IrisRpcUtil.getIrisReference((String)"yonbip-fi-taxpubdoc", IUimetaApi.class);
            return uimetaApi.getEntityInfoByBillNo(billno, bSearchBox);
        }
        return super.getEntityInfoByBillNo(billno, bSearchBox);
    }

    public List<Map<String, Object>> getGroupControls(Map<String, Object> map) {
        String billno = (String)map.get("billno");
        if (UPCMddExtUimetaApiService.isTaxRevenueRef(billno)) {
            logger.error("[TaxRevenueRef forward] UPCMddExtUimetaApiService#getGroupControls params - map:{}", map);
            IUimetaApi uimetaApi = (IUimetaApi)IrisRpcUtil.getIrisReference((String)"yonbip-fi-taxpubdoc", IUimetaApi.class);
            return uimetaApi.getGroupControls(map);
        }
        return super.getGroupControls(map);
    }

    public Object getGroupControls(String billno, Long tplid, String groupcode, Object userId, boolean isSum) throws Exception {
        if (UPCMddExtUimetaApiService.isTaxRevenueRef(billno)) {
            logger.error("[TaxRevenueRef forward] UPCMddExtUimetaApiService#getGroupControls params - billno:{}, tplid:{}, groupcode:{}, userId:{}, isSum:{}", new Object[]{billno, tplid, groupcode, userId, isSum});
            IUimetaApi uimetaApi = (IUimetaApi)IrisRpcUtil.getIrisReference((String)"yonbip-fi-taxpubdoc", IUimetaApi.class);
            return uimetaApi.getGroupControls(billno, tplid, groupcode, (Object)InvocationInfoProxy.getUserid(), isSum);
        }
        return super.getGroupControls(billno, tplid, groupcode, (Object)InvocationInfoProxy.getUserid(), isSum);
    }

    public void saveUserItemsSet(Map<String, Object> map) {
        try {
            String refCode = (String)map.get("refCode");
            if (UPCMddExtUimetaApiService.isTaxRevenueRef(refCode)) {
                logger.error("[TaxRevenueRef forward] UPCMddExtUimetaApiService#saveUserItemsSet params - map:{}", map);
                IUimetaApi uimetaApi = (IUimetaApi)IrisRpcUtil.getIrisReference((String)"yonbip-fi-taxpubdoc", IUimetaApi.class);
                uimetaApi.saveUserItemsSet(map);
            } else {
                super.saveUserItemsSet(map);
            }
        }
        catch (Exception var5) {
            logger.error("UPCMddExtUimetaApiService.saveUserItemsSet", (Throwable)var5);
        }
    }

    public void restoreUserSet(Object userid, String billno, Long tplid, String groupcode) throws Exception {
        if (UPCMddExtUimetaApiService.isTaxRevenueRef(billno)) {
            logger.error("[TaxRevenueRef forward] UPCMddExtUimetaApiService#restoreUserSet params - userid:{}, billno:{}, tplid:{}, groupcode:{}", new Object[]{userid, billno, tplid, groupcode});
            IUimetaApi uimetaApi = (IUimetaApi)IrisRpcUtil.getIrisReference((String)"yonbip-fi-taxpubdoc", IUimetaApi.class);
            uimetaApi.restoreUserSet(userid, billno, tplid, groupcode);
        } else {
            super.restoreUserSet(userid, billno, tplid, groupcode);
        }
    }

    public void saveRefConditions(BillStateRuleDTO billStateRuleDTO) throws Exception {
        if (UPCMddExtUimetaApiService.isTaxRevenueRef(billStateRuleDTO.getCode())) {
            logger.error("[TaxRevenueRef forward] UPCMddExtUimetaApiService#saveRefConditions params - billStateRuleDTO:{}", (Object)billStateRuleDTO);
            IUimetaApi uimetaApi = (IUimetaApi)IrisRpcUtil.getIrisReference((String)"yonbip-fi-taxpubdoc", IUimetaApi.class);
            uimetaApi.saveRefConditions(billStateRuleDTO);
        } else {
            super.saveRefConditions(billStateRuleDTO);
        }
    }

    private static boolean isTaxRevenueRef(String refCode) {
        if (StringUtils.isEmpty((CharSequence)refCode)) {
            return false;
        }
        return "pc_taxrevenueref".equals(refCode) || "pc_taxrevenuepolicyref".equals(refCode);
    }
}


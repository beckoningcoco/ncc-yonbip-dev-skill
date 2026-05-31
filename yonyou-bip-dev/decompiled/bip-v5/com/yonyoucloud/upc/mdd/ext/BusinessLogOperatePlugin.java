/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.material.service.impl.MaterialQueryService
 *  com.yonyou.iuap.apdoc.coredoc.po.material.MaterialPO
 *  com.yonyou.iuap.apdoc.coredoc.po.merchant.MerchantPO
 *  com.yonyou.iuap.apdoc.coredoc.service.pub.CoredocYpdExtBillDataConvertService
 *  com.yonyou.iuap.log.cons.OperCodeTypes
 *  com.yonyou.iuap.log.model.BusinessArrayObject
 *  com.yonyou.iuap.log.model.BusinessBaseVo
 *  com.yonyou.iuap.yms.thread.IYmsExecutorService
 *  com.yonyou.ypd.bd.api.IBusinessLogOperateType
 *  com.yonyou.ypd.bd.basic.BatchActionResult
 *  com.yonyou.ypd.bd.service.impl.DefaultBDBusinessLogService
 *  com.yonyou.ypd.bd.util.BDBusinessLogUtil
 *  com.yonyou.ypd.bill.action.IBillBaseAction
 *  com.yonyou.ypd.bill.basic.BaseBillContext
 *  com.yonyou.ypd.bill.basic.BillActionInfo
 *  com.yonyou.ypd.bill.basic.entity.BillEntityInfo
 *  com.yonyou.ypd.bill.basic.entity.IBillDO
 *  com.yonyou.ypd.bill.basic.service.api.IBillActionService
 *  com.yonyou.ypd.bill.context.BillQueryContext
 *  com.yonyou.ypd.bill.context.YpdBillContext
 *  com.yonyou.ypd.bill.entity.manage.BillEntityInfoCache
 *  com.yonyou.ypd.bill.infrastructure.service.api.IBillContextService
 *  iuap.yms.thread.api.YmsExecutors
 *  org.apache.commons.collections4.CollectionUtils
 *  org.apache.commons.collections4.MapUtils
 *  org.imeta.biz.base.BizContext
 *  org.imeta.core.model.Entity
 *  org.imeta.orm.base.BizObject
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.mdd.ext;

import com.yonyou.iuap.apdoc.coredoc.material.service.impl.MaterialQueryService;
import com.yonyou.iuap.apdoc.coredoc.po.material.MaterialPO;
import com.yonyou.iuap.apdoc.coredoc.po.merchant.MerchantPO;
import com.yonyou.iuap.apdoc.coredoc.service.pub.CoredocYpdExtBillDataConvertService;
import com.yonyou.iuap.log.cons.OperCodeTypes;
import com.yonyou.iuap.log.model.BusinessArrayObject;
import com.yonyou.iuap.log.model.BusinessBaseVo;
import com.yonyou.iuap.yms.thread.IYmsExecutorService;
import com.yonyou.ypd.bd.api.IBusinessLogOperateType;
import com.yonyou.ypd.bd.basic.BatchActionResult;
import com.yonyou.ypd.bd.service.impl.DefaultBDBusinessLogService;
import com.yonyou.ypd.bd.util.BDBusinessLogUtil;
import com.yonyou.ypd.bill.action.IBillBaseAction;
import com.yonyou.ypd.bill.basic.BaseBillContext;
import com.yonyou.ypd.bill.basic.BillActionInfo;
import com.yonyou.ypd.bill.basic.entity.BillEntityInfo;
import com.yonyou.ypd.bill.basic.entity.IBillDO;
import com.yonyou.ypd.bill.basic.service.api.IBillActionService;
import com.yonyou.ypd.bill.context.BillQueryContext;
import com.yonyou.ypd.bill.context.YpdBillContext;
import com.yonyou.ypd.bill.entity.manage.BillEntityInfoCache;
import com.yonyou.ypd.bill.infrastructure.service.api.IBillContextService;
import iuap.yms.thread.api.YmsExecutors;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;
import org.imeta.biz.base.BizContext;
import org.imeta.core.model.Entity;
import org.imeta.orm.base.BizObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessLogOperatePlugin
extends DefaultBDBusinessLogService {
    private static final Logger log = LoggerFactory.getLogger(BusinessLogOperatePlugin.class);
    @Autowired
    private CoredocYpdExtBillDataConvertService coredocYpdExtBillDataConvertService;
    @Autowired
    MaterialQueryService materialQueryService;
    @Autowired
    private IBillContextService billContextService;
    @Autowired
    IBillActionService billActionService;

    public boolean support(YpdBillContext billContext) {
        if (billContext.getBillDOs() != null && billContext.getBillDOs()[0].getBillEntityInfo() != null && billContext.getBillDOs()[0].get_status() != 3) {
            return this.needReWriteLogObjs(billContext.getBillDOs()[0].getBillEntityInfo().getMetaFullName());
        }
        return super.support(billContext);
    }

    protected BusinessArrayObject buildBusinessObject(YpdBillContext billContext, OperCodeTypes operCodeTypes, IBusinessLogOperateType operateType, Collection<IBillDO> billDOs) {
        if (CollectionUtils.isEmpty(billDOs)) {
            return null;
        }
        List<BizObject> busiData = this.convertDOsToBizObjs(billContext, billDOs);
        BusinessArrayObject businessArrayObject = BDBusinessLogUtil.buildArrayObject((String)billContext.getBaseBillContext().getServiceCode(), (String)billContext.getBaseBillContext().getMetaFullName(), (OperCodeTypes)operCodeTypes, (String)billContext.getBaseBillContext().getcBillNo(), (String)billContext.getBaseBillContext().getBillName(), busiData);
        BillEntityInfo billEntityInfo = billContext.getBaseBillContext().getBillEntityInfo();
        Entity entity = BizContext.getMetaRepository().entity(billEntityInfo.getMetaFullName());
        if (entity != null) {
            businessArrayObject.setBusiObjTypeName(entity.getResId());
            businessArrayObject.setDefaultBusiObjTypeName(entity.title());
        }
        if ("pc_productimport".equals(billContext.getBaseBillContext().getcBillNo())) {
            businessArrayObject.setBusiObjTypeCode("pc_product");
        } else if ("pc_productdetail_import".equals(billContext.getBaseBillContext().getcBillNo())) {
            businessArrayObject.setBusiObjTypeCode("pc_productdetail");
        } else if ("aa_merchantexport".equals(billContext.getBaseBillContext().getcBillNo())) {
            businessArrayObject.setBusiObjTypeCode("aa_merchant");
        } else if ("aa_merchant_export_range".equals(billContext.getBaseBillContext().getcBillNo())) {
            businessArrayObject.setBusiObjTypeCode("aa_merchantdetail");
        }
        this.fillBusinessLogOperationName((BusinessBaseVo)businessArrayObject, operateType);
        return businessArrayObject;
    }

    protected List<BizObject> convertDOsToBizObjs(YpdBillContext billContext, Collection<IBillDO> billDOs) {
        if (this.needReWriteLogObjs(billDOs)) {
            ArrayList<BizObject> bizObjs = new ArrayList<BizObject>(billDOs.size());
            billDOs.forEach(billDO -> {
                BizObject bizObject = null;
                if ("pc.product.Product".equals(billDO.getBillEntityInfo().getMetaFullName()) && null != billDO.getId() && null != billDO.getAttrValue("productApplyRangeId") && billDO.get_status() != 3) {
                    Long materialApplyRangeId = Long.parseLong(billDO.getAttrValue("productApplyRangeId").toString());
                    bizObject = this.queryMaterialDetail(billContext, (Long)billDO.getId(), materialApplyRangeId);
                } else if ("aa.merchant.Merchant".equals(billDO.getBillEntityInfo().getMetaFullName()) && null != billDO.getId() && null != billDO.getAttrValue("merchantApplyRangeId") && billDO.get_status() != 3) {
                    Long merchantApplyRangeId = Long.parseLong(billDO.getAttrValue("merchantApplyRangeId").toString());
                    bizObject = this.queryMerchantDetail(billContext, (Long)billDO.getId(), merchantApplyRangeId);
                }
                if (null != bizObject && MapUtils.isNotEmpty(bizObject)) {
                    bizObjs.add(bizObject);
                } else {
                    bizObjs.addAll(this.convertDOsToBizObj((IBillDO)billDO));
                }
            });
            return bizObjs;
        }
        return super.convertDOsToBizObjs(billDOs);
    }

    public void insertBusinessLog(YpdBillContext billContext, IBillBaseAction action, BatchActionResult result) {
        IYmsExecutorService executorService = YmsExecutors.getYmsExecutor();
        executorService.execute(() -> super.insertBusinessLog(billContext, action, result));
    }

    protected void saveBusinessLog(BusinessArrayObject successBusiObjs, BusinessArrayObject faildBusiObjs) {
        try {
            if (successBusiObjs != null) {
                this.getBusinessLogService().saveBusinessLog(successBusiObjs);
            }
            if (faildBusiObjs != null) {
                faildBusiObjs.setOperResult("failed");
                this.getBusinessLogService().saveBusinessLog(faildBusiObjs);
            }
        }
        catch (Throwable e) {
            log.error("\u8bb0\u5f55\u4e1a\u52a1\u65e5\u5fd7\u5931\u8d25!", e);
        }
    }

    private <T> BizObject queryMerchantDetail(YpdBillContext billContext, Long id, Long merchantApplyRangeId) {
        try {
            boolean isFromMerchantCreator = billContext != null && billContext.getBaseBillContext() != null && billContext.getBaseBillContext().getcBillNo() != null && "aa_merchant".equals(billContext.getBaseBillContext().getcBillNo());
            BillActionInfo billActionInfo = new BillActionInfo("detail");
            billActionInfo.setBusiObj("productcenter.aa_merchant");
            billActionInfo.setBillNum("aa_merchantdetail");
            if (isFromMerchantCreator) {
                billActionInfo.setBillNum("aa_merchant");
            }
            billActionInfo.setExtendBodyParam("merchantApplyRangeId", (Object)merchantApplyRangeId);
            BaseBillContext baseBillContext = this.billContextService.createBillContext(billActionInfo.getBusiObj(), billActionInfo.getBillNum(), null, null, null, false);
            baseBillContext.setActionInfo(billActionInfo);
            BillEntityInfo billEntityInfo = BillEntityInfoCache.getInstance().getBillEntityInfo(baseBillContext.getMetaFullName());
            baseBillContext.setBillEntityInfo(billEntityInfo);
            baseBillContext.setServiceCode("aa_merchantlist_query");
            if (isFromMerchantCreator) {
                baseBillContext.setServiceCode("aa_merchant");
            }
            BillQueryContext billQueryContext = new BillQueryContext(baseBillContext);
            billQueryContext.setBillId(id.toString());
            Map result = this.billActionService.executeDetailQueryAction(billQueryContext);
            BizObject bizObject = new BizObject();
            bizObject.putAll(result);
            return bizObject;
        }
        catch (Exception e) {
            log.error("\u5ba2\u6237\u8be6\u60c5\u67e5\u8be2\u5f02\u5e38", (Throwable)e);
            return null;
        }
    }

    private <T> BizObject queryMaterialDetail(YpdBillContext billContext, Long id, Long materialApplyRangeId) {
        try {
            Map map = this.materialQueryService.queryMaterialDetail(billContext, id, materialApplyRangeId);
            BizObject bizObject = new BizObject();
            bizObject.putAll(map);
            return bizObject;
        }
        catch (Exception e) {
            log.error("\u7269\u6599\u8be6\u60c5\u67e5\u8be2\u5f02\u5e38", (Throwable)e);
            return null;
        }
    }

    private List<BizObject> convertDOsToBizObj(IBillDO billDO) {
        ArrayList<BizObject> bizObjList;
        switch (billDO.getBillEntityInfo().getMetaFullName()) {
            case "pc.product.Product": {
                MaterialPO materialPO = (MaterialPO)billDO;
                bizObjList = this.coredocYpdExtBillDataConvertService.convertBillDO2MaterialUIObject(materialPO);
                break;
            }
            case "aa.merchant.Merchant": {
                MerchantPO merchantPO = (MerchantPO)billDO;
                bizObjList = this.coredocYpdExtBillDataConvertService.convertBillDO2MerchantUIObject(merchantPO);
                break;
            }
            default: {
                bizObjList = new ArrayList();
                BizObject bizObj = new BizObject();
                bizObj.putAll(billDO.toMap());
                bizObjList.add(bizObj);
                break;
            }
        }
        return bizObjList;
    }

    private boolean needReWriteLogObjs(Collection<IBillDO> billDOs) {
        boolean flag = false;
        if (!billDOs.isEmpty()) {
            for (IBillDO billDO : billDOs) {
                String metaFullName = billDO.getBillEntityInfo().getMetaFullName();
                if (!this.needReWriteLogObjs(metaFullName)) continue;
                flag = true;
                break;
            }
        }
        return flag;
    }

    private boolean needReWriteLogObjs(String metaFullName) {
        boolean flag = false;
        if ("pc.product.Product".equals(metaFullName) || "aa.merchant.Merchant".equals(metaFullName)) {
            flag = true;
        }
        return flag;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.service.config.YmsThreadPoolConfig4UPC
 *  com.yonyou.iuap.basedoc.mc.service.GroupService
 *  com.yonyou.iuap.dto.transfermc.DataScopeDTO
 *  com.yonyou.iuap.dto.transfermc.RuleItemDTO
 *  com.yonyou.iuap.dto.transfermc.TransfermcDetailError
 *  com.yonyou.iuap.dto.transfermc.TransfermcProgressDTO
 *  com.yonyou.iuap.dto.transfermc.TransfermcResult
 *  com.yonyou.iuap.dto.transfermc.TransfermcStatus
 *  com.yonyou.iuap.dto.transfermc.TransfermcTaskDTO
 *  com.yonyou.iuap.service.transfermc.TransfermcTaskCallBackService
 *  com.yonyou.iuap.service.transfermc.TransfermcTaskService
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.ext.base.tenant.Tenant
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.util.OptionUtils
 *  com.yonyou.ucf.mdd.ext.util.RedisTool
 *  com.yonyoucloud.upc.aa.custcategory.CustCategory
 *  com.yonyoucloud.upc.aa.custcategory.CustCategoryApplyRange
 *  com.yonyoucloud.upc.aa.merchant.CustomerArea
 *  com.yonyoucloud.upc.aa.merchant.InvoicingCustomers
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRange
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail
 *  com.yonyoucloud.upc.aa.merchant.MerchantDetail
 *  com.yonyoucloud.upc.aa.merchant.Principal
 *  com.yonyoucloud.upc.common.enums.AddMerchantRangeSourceEnum
 *  com.yonyoucloud.upc.data.custcategory.CustCategoryDao
 *  com.yonyoucloud.upc.data.merchant.MerchantGroupDao
 *  com.yonyoucloud.upc.data.product.ProductGroupDao
 *  com.yonyoucloud.upc.pc.cls.ManagementClass
 *  com.yonyoucloud.upc.pc.cls.ManagementClassApplyRangeGroup
 *  com.yonyoucloud.upc.pc.org.PubOrgGroup
 *  com.yonyoucloud.upc.pc.org.PubOrgGroupDetail
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductApplyRange
 *  com.yonyoucloud.upc.service.IUPCMerchantQueryService
 *  com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil
 *  com.yonyoucloud.upc.utils.MerchantUtils
 *  com.yonyoucloud.upc.utils.MultilangUtil
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QueryPager
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.alibaba.fastjson.JSON;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.service.config.YmsThreadPoolConfig4UPC;
import com.yonyou.iuap.basedoc.mc.service.GroupService;
import com.yonyou.iuap.dto.transfermc.DataScopeDTO;
import com.yonyou.iuap.dto.transfermc.RuleItemDTO;
import com.yonyou.iuap.dto.transfermc.TransfermcDetailError;
import com.yonyou.iuap.dto.transfermc.TransfermcProgressDTO;
import com.yonyou.iuap.dto.transfermc.TransfermcResult;
import com.yonyou.iuap.dto.transfermc.TransfermcStatus;
import com.yonyou.iuap.dto.transfermc.TransfermcTaskDTO;
import com.yonyou.iuap.service.transfermc.TransfermcTaskCallBackService;
import com.yonyou.iuap.service.transfermc.TransfermcTaskService;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.ext.base.tenant.Tenant;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.util.OptionUtils;
import com.yonyou.ucf.mdd.ext.util.RedisTool;
import com.yonyoucloud.upc.aa.custcategory.CustCategory;
import com.yonyoucloud.upc.aa.custcategory.CustCategoryApplyRange;
import com.yonyoucloud.upc.aa.merchant.CustomerArea;
import com.yonyoucloud.upc.aa.merchant.InvoicingCustomers;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRange;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail;
import com.yonyoucloud.upc.aa.merchant.MerchantDetail;
import com.yonyoucloud.upc.aa.merchant.Principal;
import com.yonyoucloud.upc.common.enums.AddMerchantRangeSourceEnum;
import com.yonyoucloud.upc.data.custcategory.CustCategoryDao;
import com.yonyoucloud.upc.data.merchant.MerchantGroupDao;
import com.yonyoucloud.upc.data.product.ProductGroupDao;
import com.yonyoucloud.upc.event.EventService2;
import com.yonyoucloud.upc.pc.cls.ManagementClass;
import com.yonyoucloud.upc.pc.cls.ManagementClassApplyRangeGroup;
import com.yonyoucloud.upc.pc.org.PubOrgGroup;
import com.yonyoucloud.upc.pc.org.PubOrgGroupDetail;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductApplyRange;
import com.yonyoucloud.upc.service.IUPCMerchantQueryService;
import com.yonyoucloud.upc.service.MerchantService;
import com.yonyoucloud.upc.service.ProductApplyRangeGroupService;
import com.yonyoucloud.upc.service.merchantapplyrangegroup.MerchantGroupService;
import com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil;
import com.yonyoucloud.upc.service.utils.TreeApplyRangeUtils;
import com.yonyoucloud.upc.utils.MerchantUtils;
import com.yonyoucloud.upc.utils.MultilangUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QueryPager;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class ManagementTransferServiceImpl
implements TransfermcTaskService {
    Logger logger = LoggerFactory.getLogger(ManagementTransferServiceImpl.class);
    @Autowired
    private TransfermcTaskCallBackService transfermcTaskCallBackService;
    @Autowired
    private EventService2 eventService2;
    @Autowired
    private MerchantGroupDao merchantGroupDao;
    @Autowired
    GroupService groupService;
    @Autowired
    private MerchantGroupService merchantGroupService;
    @Autowired
    private IUPCMerchantQueryService upcMerchantQueryService;
    @Autowired
    private ProductGroupDao productGroupDao;
    @Autowired
    private ProductApplyRangeGroupService productApplyRangeGroupService;
    @Autowired
    private CustCategoryDao custCategoryDao;
    @Autowired
    private MerchantService merchantService;
    @Autowired
    PubOptionDataQueryUtil pubOptionDataQueryUtil;
    @Autowired
    YmsThreadPoolConfig4UPC ymsThreadPoolConfig4UPC;

    public void transfermcTaskAsync(TransfermcTaskDTO transfermcTaskDTO) {
        this.ymsThreadPoolConfig4UPC.getYmsLongTaskExecutorService().execute(() -> {
            String message;
            TransfermcResult transfermcResult;
            ArrayList<TransfermcDetailError> transfermcDetailErrorList;
            TransfermcDetailError transfermcDetailError;
            String lockValue;
            int lockOutTime;
            String lockKey;
            if ("customer".equals(transfermcTaskDTO.getDocId())) {
                lockKey = "transferTaskCustomer" + AppContext.getCurrentUser().getYTenantId();
                lockOutTime = 86400;
                lockValue = UUID.randomUUID().toString();
                try {
                    if (RedisTool.tryGetLock((String)lockKey, (String)lockValue, (int)lockOutTime)) {
                        this.transferTaskMerchant(transfermcTaskDTO);
                    } else {
                        transfermcDetailError = new TransfermcDetailError();
                        transfermcDetailErrorList = new ArrayList<TransfermcDetailError>();
                        transfermcResult = new TransfermcResult();
                        transfermcDetailError.setErrorCause(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408031B", (String)"\u5b58\u5728\u5176\u4ed6\u5ba2\u6237\u6863\u6848\u79fb\u4ea4\u4efb\u52a1\u6b63\u5728\u6267\u884c!"));
                        transfermcDetailErrorList.add(transfermcDetailError);
                        transfermcResult.setCount(1);
                        transfermcResult.setFailCount(1);
                        transfermcResult.setTotalCount(1);
                        transfermcResult.setErrorList(transfermcDetailErrorList);
                        transfermcTaskDTO.setTransfermcResult(transfermcResult);
                        this.transfermcTaskCallBackService.callbackTransfermcTask(transfermcTaskDTO);
                    }
                }
                catch (Exception e) {
                    this.logger.error("\u5ba2\u6237\u6863\u6848\u7ba1\u7406\u6743\u79fb\u4ea4\u62a5\u9519:{}", (Object)e.getMessage());
                }
                finally {
                    RedisTool.releaseLock((String)lockKey, (String)lockValue);
                }
            }
            if ("product".equals(transfermcTaskDTO.getDocId())) {
                lockKey = "transferTaskProduct" + AppContext.getCurrentUser().getYTenantId();
                lockOutTime = 86400;
                lockValue = UUID.randomUUID().toString();
                try {
                    if (RedisTool.tryGetLock((String)lockKey, (String)lockValue, (int)lockOutTime)) {
                        this.transferTaskProduct(transfermcTaskDTO);
                    } else {
                        transfermcDetailError = new TransfermcDetailError();
                        transfermcDetailErrorList = new ArrayList();
                        transfermcResult = new TransfermcResult();
                        message = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_21AA1C7E05180003", (String)"\u5b58\u5728\u5176\u4ed6\u7269\u6599\u6863\u6848\u79fb\u4ea4\u4efb\u52a1\u6b63\u5728\u6267\u884c!");
                        transfermcDetailError.setErrorCause(message);
                        transfermcDetailErrorList.add(transfermcDetailError);
                        transfermcResult.setCount(1);
                        transfermcResult.setFailCount(1);
                        transfermcResult.setTotalCount(1);
                        transfermcResult.setErrorList(transfermcDetailErrorList);
                        transfermcTaskDTO.setTransfermcResult(transfermcResult);
                        this.transfermcTaskCallBackService.callbackTransfermcTask(transfermcTaskDTO);
                    }
                }
                catch (Exception e) {
                    this.logger.error("\u7269\u6599\u6863\u6848\u7ba1\u7406\u6743\u79fb\u4ea4\u62a5\u9519:{}", (Object)e.getMessage());
                }
                finally {
                    RedisTool.releaseLock((String)lockKey, (String)lockValue);
                }
            }
            if ("category".equals(transfermcTaskDTO.getDocId())) {
                lockKey = "transferTaskCategory" + AppContext.getCurrentUser().getYTenantId();
                lockOutTime = 86400;
                lockValue = UUID.randomUUID().toString();
                try {
                    if (RedisTool.tryGetLock((String)lockKey, (String)lockValue, (int)lockOutTime)) {
                        this.transferTaskCustCategory(transfermcTaskDTO);
                    } else {
                        transfermcDetailError = new TransfermcDetailError();
                        transfermcDetailErrorList = new ArrayList();
                        transfermcResult = new TransfermcResult();
                        message = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_21AA1C7E05180004", (String)"\u5b58\u5728\u5176\u4ed6\u5ba2\u6237\u5206\u7c7b\u6863\u6848\u79fb\u4ea4\u4efb\u52a1\u6b63\u5728\u6267\u884c!");
                        transfermcDetailError.setErrorCause(message);
                        transfermcDetailErrorList.add(transfermcDetailError);
                        transfermcResult.setCount(1);
                        transfermcResult.setFailCount(1);
                        transfermcResult.setTotalCount(1);
                        transfermcResult.setErrorList(transfermcDetailErrorList);
                        transfermcTaskDTO.setTransfermcResult(transfermcResult);
                        this.transfermcTaskCallBackService.callbackTransfermcTask(transfermcTaskDTO);
                    }
                }
                catch (Exception e) {
                    this.logger.error("\u5ba2\u6237\u5206\u7c7b\u6863\u6848\u7ba1\u7406\u6743\u79fb\u4ea4\u62a5\u9519:{}", (Object)e.getMessage());
                }
                finally {
                    RedisTool.releaseLock((String)lockKey, (String)lockValue);
                }
            }
            if ("managementclass".equals(transfermcTaskDTO.getDocId())) {
                lockKey = "transferTaskManagementClass" + AppContext.getCurrentUser().getYTenantId();
                lockOutTime = 86400;
                lockValue = UUID.randomUUID().toString();
                try {
                    String message2;
                    if (!"666666".equals(transfermcTaskDTO.getTargetOrgId())) {
                        message2 = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1A96EA300470001A", (String)"\u7269\u6599\u5206\u7c7b\u79fb\u4ea4\u76ee\u6807\u7ec4\u7ec7\u53ea\u652f\u6301\u4f01\u4e1a\u8d26\u53f7\u7ea7\uff01");
                        this.errorCallback(transfermcTaskDTO, message2);
                    } else if (RedisTool.tryGetLock((String)lockKey, (String)lockValue, (int)lockOutTime)) {
                        this.transferTaskManagementClass(transfermcTaskDTO);
                    } else {
                        message2 = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1A96EA300470001D", (String)"\u5b58\u5728\u5176\u4ed6\u7269\u6599\u5206\u7c7b\u6863\u6848\u79fb\u4ea4\u4efb\u52a1\u6b63\u5728\u6267\u884c!");
                        this.errorCallback(transfermcTaskDTO, message2);
                    }
                }
                catch (Exception e) {
                    this.logger.error("\u7269\u6599\u5206\u7c7b\u6863\u6848\u7ba1\u7406\u6743\u79fb\u4ea4\u62a5\u9519:{}", (Object)e.getMessage());
                }
                finally {
                    RedisTool.releaseLock((String)lockKey, (String)lockValue);
                }
            }
        });
    }

    private void errorCallback(TransfermcTaskDTO transfermcTaskDTO, String message) {
        TransfermcDetailError transfermcDetailError = new TransfermcDetailError();
        ArrayList<TransfermcDetailError> transfermcDetailErrorList = new ArrayList<TransfermcDetailError>();
        TransfermcResult transfermcResult = new TransfermcResult();
        transfermcDetailError.setErrorCause(message);
        transfermcDetailError.setCode(transfermcTaskDTO.getDocId());
        transfermcDetailErrorList.add(transfermcDetailError);
        transfermcResult.setCount(1);
        transfermcResult.setFailCount(1);
        transfermcResult.setTotalCount(1);
        transfermcResult.setErrorList(transfermcDetailErrorList);
        transfermcResult.setStatus(TransfermcStatus.FAIL.getStatus());
        transfermcTaskDTO.setTransfermcResult(transfermcResult);
        this.transfermcTaskCallBackService.callbackTransfermcTask(transfermcTaskDTO);
    }

    public TransfermcProgressDTO askProgress(String taskId) {
        String totalCountUniqueKey = taskId + AppContext.getCurrentUser().getYhtTenantId() + "totalCount";
        String countUniqueKey = taskId + AppContext.getCurrentUser().getYhtTenantId() + "count";
        TransfermcProgressDTO transfermcProgressDTO = new TransfermcProgressDTO();
        String totalCount = AppContext.cache().get(totalCountUniqueKey);
        String count = AppContext.cache().get(countUniqueKey);
        if (totalCount != null && count != null) {
            transfermcProgressDTO.setCount(Integer.parseInt(count));
            transfermcProgressDTO.setTotalCount(Integer.parseInt(totalCount));
        }
        return transfermcProgressDTO;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void transferTaskMerchant(TransfermcTaskDTO transfermcTaskDTO) {
        TransfermcResult transfermcResult = new TransfermcResult();
        ArrayList<TransfermcDetailError> transfermcDetailErrorList = new ArrayList<TransfermcDetailError>();
        String totalCountUniqueKey = transfermcTaskDTO.getTaskId() + AppContext.getCurrentUser().getYhtTenantId() + "totalCount";
        String countUniqueKey = transfermcTaskDTO.getTaskId() + AppContext.getCurrentUser().getYhtTenantId() + "count";
        try {
            int successCount = 0;
            int failCount = 0;
            int pageSize = 500;
            Long totalCount = this.selectCountMerchant(transfermcTaskDTO);
            long divisor = this.getPageIndex(totalCount, pageSize);
            int pageIndex = 1;
            while ((long)pageIndex <= divisor) {
                List<Merchant> merchantList = this.selectMerchant(transfermcTaskDTO, pageSize);
                if (!CollectionUtils.isEmpty(merchantList)) {
                    for (Merchant merchant : merchantList) {
                        try {
                            this.checkMerchantApplyRangeGroup(merchant, transfermcTaskDTO);
                            if (!this.pubOptionDataQueryUtil.isCloseMerchantModelDoubleWrite()) {
                                this.setMerchant(merchant, transfermcTaskDTO.getTargetOrgId(), transfermcTaskDTO.getSourceOrgId(), transfermcTaskDTO.getSource());
                                this.setMerchantGroup(merchant, transfermcTaskDTO.getTargetOrgId(), transfermcTaskDTO.getSourceOrgId());
                            } else {
                                this.setNewMerchantGroup(merchant, transfermcTaskDTO.getTargetOrgId(), transfermcTaskDTO.getSourceOrgId(), transfermcTaskDTO.getSource());
                            }
                            ++successCount;
                        }
                        catch (Exception e) {
                            ++failCount;
                            String merchantName = String.valueOf(MultilangUtil.getAttr((String)"aa.merchant.Merchant", (String)"name", (BizObject)merchant, null));
                            TransfermcDetailError transfermcDetailError = new TransfermcDetailError();
                            transfermcDetailError.setTargetDocIdValue(merchant.getId().toString());
                            transfermcDetailError.setErrorCause(e.getMessage());
                            transfermcDetailError.setCode(merchant.getCode());
                            transfermcDetailError.setName(merchantName);
                            transfermcDetailErrorList.add(transfermcDetailError);
                        }
                        finally {
                            int count = successCount + failCount;
                            AppContext.cache().set(totalCountUniqueKey, String.valueOf(totalCount));
                            AppContext.cache().set(countUniqueKey, String.valueOf(count));
                        }
                    }
                }
                TransfermcProgressDTO transfermcProgressDTO = new TransfermcProgressDTO();
                transfermcProgressDTO.setTotalCount(totalCount.intValue());
                transfermcProgressDTO.setSuccessCount(successCount);
                transfermcProgressDTO.setFailCount(failCount);
                transfermcProgressDTO.setCount(failCount + successCount);
                if (transfermcProgressDTO.getTotalCount() != transfermcProgressDTO.getCount()) {
                    this.transfermcTaskCallBackService.replyProgress(transfermcTaskDTO.getTaskId(), AppContext.getCurrentUser().getYhtTenantId(), transfermcProgressDTO);
                }
                ++pageIndex;
            }
            transfermcResult.setCount(failCount + successCount);
            transfermcResult.setFailCount(failCount);
            transfermcResult.setSuccessCount(successCount);
            transfermcResult.setTotalCount(totalCount.intValue());
            if (failCount != 0) {
                transfermcResult.setStatus(TransfermcStatus.FAIL.getStatus());
            } else {
                transfermcResult.setStatus(TransfermcStatus.SUCESS.getStatus());
            }
            transfermcResult.setErrorList(transfermcDetailErrorList);
            transfermcTaskDTO.setTransfermcResult(transfermcResult);
        }
        catch (Exception e) {
            try {
                TransfermcDetailError transfermcDetailError = new TransfermcDetailError();
                transfermcDetailError.setErrorCause(e.getMessage());
                transfermcDetailErrorList.add(transfermcDetailError);
                transfermcResult.setCount(1);
                transfermcResult.setTotalCount(1);
                transfermcResult.setFailCount(1);
                transfermcResult.setStatus(TransfermcStatus.FAIL.getStatus());
                transfermcResult.setErrorList(transfermcDetailErrorList);
                transfermcTaskDTO.setTransfermcResult(transfermcResult);
            }
            catch (Throwable throwable) {
                this.transfermcTaskCallBackService.callbackTransfermcTask(transfermcTaskDTO);
                if ("yycrm".equals(transfermcTaskDTO.getSource())) {
                    try {
                        HashMap<String, Object> userObject = new HashMap<String, Object>(2);
                        userObject.put("transferTaskMerchant", transfermcTaskDTO);
                        this.eventService2.sendEvent("YXYBASEDOC", "AA_MERCHANT_TRANSFER_TASK", userObject);
                    }
                    catch (Exception e2) {
                        this.logger.error("\u5ba2\u6237\u6863\u6848\u7ba1\u7406\u6743\u79fb\u4ea4\u53d1\u9001\u4e8b\u4ef6\u62a5\u9519:{}", (Object)e2.getMessage());
                    }
                }
                AppContext.cache().del(new String[]{countUniqueKey});
                AppContext.cache().del(new String[]{totalCountUniqueKey});
                throw throwable;
            }
            this.transfermcTaskCallBackService.callbackTransfermcTask(transfermcTaskDTO);
            if ("yycrm".equals(transfermcTaskDTO.getSource())) {
                try {
                    HashMap<String, Object> userObject = new HashMap<String, Object>(2);
                    userObject.put("transferTaskMerchant", transfermcTaskDTO);
                    this.eventService2.sendEvent("YXYBASEDOC", "AA_MERCHANT_TRANSFER_TASK", userObject);
                }
                catch (Exception e3) {
                    this.logger.error("\u5ba2\u6237\u6863\u6848\u7ba1\u7406\u6743\u79fb\u4ea4\u53d1\u9001\u4e8b\u4ef6\u62a5\u9519:{}", (Object)e3.getMessage());
                }
            }
            AppContext.cache().del(new String[]{countUniqueKey});
            AppContext.cache().del(new String[]{totalCountUniqueKey});
        }
        this.transfermcTaskCallBackService.callbackTransfermcTask(transfermcTaskDTO);
        if ("yycrm".equals(transfermcTaskDTO.getSource())) {
            try {
                HashMap<String, Object> userObject = new HashMap<String, Object>(2);
                userObject.put("transferTaskMerchant", transfermcTaskDTO);
                this.eventService2.sendEvent("YXYBASEDOC", "AA_MERCHANT_TRANSFER_TASK", userObject);
            }
            catch (Exception e) {
                this.logger.error("\u5ba2\u6237\u6863\u6848\u7ba1\u7406\u6743\u79fb\u4ea4\u53d1\u9001\u4e8b\u4ef6\u62a5\u9519:{}", (Object)e.getMessage());
            }
        }
        AppContext.cache().del(new String[]{countUniqueKey});
        AppContext.cache().del(new String[]{totalCountUniqueKey});
    }

    private void setMerchant(Merchant originalMerchant, String targetOrgId, String sourceOrgId, String source) throws Exception {
        Merchant merchant = new Merchant();
        ArrayList<MerchantApplyRange> merchantApplyRangeList = new ArrayList<MerchantApplyRange>();
        ArrayList<MerchantApplyRangeDetail> merchantApplyRangeDetailList = new ArrayList<MerchantApplyRangeDetail>();
        merchant.setId(originalMerchant.getId());
        merchant.setCreateOrg(targetOrgId);
        if (this.checkMerchantCustomerClass(originalMerchant.getCustomerClass(), targetOrgId).booleanValue()) {
            merchant.setCustomerClass(originalMerchant.getCustomerClass());
        } else {
            merchant.setCustomerClass(null);
        }
        merchant.setEntityStatus(EntityStatus.Update);
        List originalDataBaseSourceMerchantApplyRangeList = this.merchantGroupDao.getMerchantApplyRangeAndDetailByMerchantIdAndOrgId(sourceOrgId, (Long)originalMerchant.getId());
        if (!CollectionUtils.isEmpty((Collection)originalDataBaseSourceMerchantApplyRangeList)) {
            MerchantApplyRange originalDataBaseSourceMerchantApplyRange = (MerchantApplyRange)originalDataBaseSourceMerchantApplyRangeList.get(0);
            originalDataBaseSourceMerchantApplyRange.setIsCreator(Boolean.valueOf(false));
            originalDataBaseSourceMerchantApplyRange.setIsApplied(Boolean.valueOf(false));
            originalDataBaseSourceMerchantApplyRange.setEntityStatus(EntityStatus.Update);
            merchantApplyRangeList.add(originalDataBaseSourceMerchantApplyRange);
            List originalDataBaseTargetMerchantApplyRangeList = this.merchantGroupDao.getMerchantApplyRangeAndDetailByMerchantIdAndOrgId(targetOrgId, (Long)originalMerchant.getId());
            if (!CollectionUtils.isEmpty((Collection)originalDataBaseTargetMerchantApplyRangeList)) {
                MerchantApplyRange originalDataBaseTargetMerchantApplyRange = (MerchantApplyRange)originalDataBaseTargetMerchantApplyRangeList.get(0);
                if (!originalDataBaseTargetMerchantApplyRange.getIsApplied().booleanValue()) {
                    originalDataBaseTargetMerchantApplyRange.setIsCreator(Boolean.valueOf(true));
                    originalDataBaseTargetMerchantApplyRange.setIsApplied(Boolean.valueOf(true));
                    originalDataBaseTargetMerchantApplyRange.setEntityStatus(EntityStatus.Update);
                    merchantApplyRangeList.add(originalDataBaseTargetMerchantApplyRange);
                } else {
                    originalDataBaseTargetMerchantApplyRange.setIsCreator(Boolean.valueOf(true));
                    originalDataBaseTargetMerchantApplyRange.setIsApplied(Boolean.valueOf(true));
                    originalDataBaseTargetMerchantApplyRange.setEntityStatus(EntityStatus.Update);
                    merchantApplyRangeList.add(originalDataBaseTargetMerchantApplyRange);
                    merchant.setCustomerArea(originalDataBaseTargetMerchantApplyRange.merchantAppliedDetail().getCustomerArea());
                    List originalDataBaseMerchantApplyRangeIsAppliedList = this.merchantGroupDao.getMerchantApplyRangeByMerchantIdAndIsApplied(Boolean.valueOf(false), (Long)merchant.getId());
                    if (!CollectionUtils.isEmpty((Collection)originalDataBaseMerchantApplyRangeIsAppliedList)) {
                        List originalDataBaseInvoicingCustomersIsAppliedList;
                        List originalDataBasePrincipalIsAppliedList;
                        ArrayList<CustomerArea> targetCustomerAreaIsAppliedList = new ArrayList<CustomerArea>();
                        ArrayList<Principal> targetPrincipalIsAppliedList = new ArrayList<Principal>();
                        ArrayList<InvoicingCustomers> targetInvoicingCustomersIsAppliedList = new ArrayList<InvoicingCustomers>();
                        String defaultOpen = "1";
                        Object isCustomerAreaIssueOrg = OptionUtils.getSystemOption((Object)AppContext.getTenantId(), (String)"isCustomerAreaIssueOrg");
                        List originalDataBaseTargetCustomerAreaList = new ArrayList();
                        if (defaultOpen.equals(isCustomerAreaIssueOrg)) {
                            originalDataBaseTargetCustomerAreaList = this.merchantGroupDao.getCustomerAreaByMerchantApplyRangeIdAndMerchantId((Long)merchant.getId(), (Long)originalDataBaseTargetMerchantApplyRange.getId());
                        }
                        Object isPrincipalIssueOrg = OptionUtils.getSystemOption((Object)AppContext.getTenantId(), (String)"isPrincipalIssueOrg");
                        List originalDataBaseTargetPrincipalList = new ArrayList();
                        if (defaultOpen.equals(isPrincipalIssueOrg)) {
                            originalDataBaseTargetPrincipalList = this.merchantGroupDao.getPrincipalByMerchantApplyRangeIdAndMerchantId((Long)merchant.getId(), (Long)originalDataBaseTargetMerchantApplyRange.getId());
                        }
                        List originalDataBaseTargetInvoicingCustomersList = this.merchantGroupDao.getInvoicingCustomersByMerchantApplyRangeIdAndMerchantId((Long)merchant.getId(), (Long)originalDataBaseTargetMerchantApplyRange.getId());
                        ArrayList<Long> merchantApplyRangeIsAppliedIdList = new ArrayList<Long>();
                        for (Object originalDataBaseMerchantApplyRangeIsApplied : originalDataBaseMerchantApplyRangeIsAppliedList) {
                            MerchantApplyRangeDetail merchantApplyRangeDetail = this.exchangeFromExtend(originalDataBaseTargetMerchantApplyRange.merchantAppliedDetail(), (Long)originalMerchant.getId(), (Long)originalDataBaseMerchantApplyRangeIsApplied.getId());
                            merchantApplyRangeDetail.setEntityStatus(EntityStatus.Update);
                            merchantApplyRangeDetailList.add(merchantApplyRangeDetail);
                            merchantApplyRangeIsAppliedIdList.add((Long)originalDataBaseMerchantApplyRangeIsApplied.getId());
                            if (!CollectionUtils.isEmpty(originalDataBaseTargetCustomerAreaList)) {
                                for (CustomerArea originalDataBaseTargetCustomerArea : originalDataBaseTargetCustomerAreaList) {
                                    CustomerArea targetCustomerAreaIsApplied = new CustomerArea();
                                    targetCustomerAreaIsApplied.setId((Object)IdManager.getInstance().nextId());
                                    targetCustomerAreaIsApplied.setMerchantId((Long)merchant.getId());
                                    targetCustomerAreaIsApplied.setmerchantApplyRangeId((Long)originalDataBaseMerchantApplyRangeIsApplied.getId());
                                    targetCustomerAreaIsApplied.setSaleAreaId(originalDataBaseTargetCustomerArea.getSaleAreaId());
                                    targetCustomerAreaIsApplied.setIsDefault(originalDataBaseTargetCustomerArea.getIsDefault());
                                    targetCustomerAreaIsApplied.setEntityStatus(EntityStatus.Insert);
                                    targetCustomerAreaIsAppliedList.add(targetCustomerAreaIsApplied);
                                    if (!originalDataBaseTargetCustomerArea.getIsDefault().booleanValue()) continue;
                                    merchantApplyRangeDetail.setCustomerArea(originalDataBaseTargetCustomerArea.getSaleAreaId());
                                }
                            } else {
                                merchantApplyRangeDetail.setCustomerArea(null);
                            }
                            if (!CollectionUtils.isEmpty(originalDataBaseTargetPrincipalList)) {
                                for (Principal originalDataBaseTargetPrincipal : originalDataBaseTargetPrincipalList) {
                                    Principal targetPrincipalIsApplied = new Principal();
                                    targetPrincipalIsApplied.setId((Object)IdManager.getInstance().nextId());
                                    targetPrincipalIsApplied.setMerchantId((Long)merchant.getId());
                                    targetPrincipalIsApplied.setMerchantApplyRangeId((Long)originalDataBaseMerchantApplyRangeIsApplied.getId());
                                    targetPrincipalIsApplied.setSpecialManagementDep(originalDataBaseTargetPrincipal.getSpecialManagementDep());
                                    targetPrincipalIsApplied.setProfessSalesman(originalDataBaseTargetPrincipal.getProfessSalesman());
                                    targetPrincipalIsApplied.setIsDefault(originalDataBaseTargetPrincipal.getIsDefault());
                                    targetPrincipalIsApplied.setEntityStatus(EntityStatus.Insert);
                                    targetPrincipalIsAppliedList.add(targetPrincipalIsApplied);
                                    if (!originalDataBaseTargetPrincipal.getIsDefault().booleanValue()) continue;
                                    merchantApplyRangeDetail.setSpecialManagementDep(originalDataBaseTargetPrincipal.getSpecialManagementDep());
                                    merchantApplyRangeDetail.setProfessSalesman(originalDataBaseTargetPrincipal.getProfessSalesman());
                                }
                            } else {
                                merchantApplyRangeDetail.setSpecialManagementDep(null);
                                merchantApplyRangeDetail.setProfessSalesman(null);
                            }
                            if (CollectionUtils.isEmpty((Collection)originalDataBaseTargetInvoicingCustomersList)) continue;
                            for (InvoicingCustomers originalDataBaseTargetInvoicingCustomers : originalDataBaseTargetInvoicingCustomersList) {
                                InvoicingCustomers targetInvoicingCustomerIsApplied = new InvoicingCustomers();
                                targetInvoicingCustomerIsApplied.setId((Object)IdManager.getInstance().nextId());
                                targetInvoicingCustomerIsApplied.setMerchantId((Long)merchant.getId());
                                targetInvoicingCustomerIsApplied.setMerchantApplyRangeId((Long)originalDataBaseMerchantApplyRangeIsApplied.getId());
                                targetInvoicingCustomerIsApplied.setInvoicingCustomersId(originalDataBaseTargetInvoicingCustomers.getInvoicingCustomersId());
                                targetInvoicingCustomerIsApplied.setIsDefault(originalDataBaseTargetInvoicingCustomers.getIsDefault());
                                targetInvoicingCustomerIsApplied.setEntityStatus(EntityStatus.Insert);
                                targetInvoicingCustomersIsAppliedList.add(targetInvoicingCustomerIsApplied);
                            }
                        }
                        List originalDataBaseCustomerAreaIsAppliedList = this.merchantGroupDao.getCustomerAreaByMerchantApplyRangeIdList(merchantApplyRangeIsAppliedIdList, (Long)originalMerchant.getId());
                        if (!CollectionUtils.isEmpty((Collection)originalDataBaseCustomerAreaIsAppliedList)) {
                            for (Object originalDataBaseCustomerAreaIsApplied : originalDataBaseCustomerAreaIsAppliedList) {
                                CustomerArea originalDataBaseCustomerAreaIsAppliedDelete = new CustomerArea();
                                originalDataBaseCustomerAreaIsAppliedDelete.setId(originalDataBaseCustomerAreaIsApplied.getId());
                                originalDataBaseCustomerAreaIsAppliedDelete.setEntityStatus(EntityStatus.Delete);
                                targetCustomerAreaIsAppliedList.add(originalDataBaseCustomerAreaIsAppliedDelete);
                            }
                        }
                        if (!CollectionUtils.isEmpty((Collection)(originalDataBasePrincipalIsAppliedList = this.merchantGroupDao.getPrincipalByMerchantApplyRangeIdList(merchantApplyRangeIsAppliedIdList, (Long)originalMerchant.getId())))) {
                            for (Principal originalDataBasePrincipalIsApplied : originalDataBasePrincipalIsAppliedList) {
                                Principal originalDataBasePrincipalIsAppliedDelete = new Principal();
                                originalDataBasePrincipalIsAppliedDelete.setId(originalDataBasePrincipalIsApplied.getId());
                                originalDataBasePrincipalIsAppliedDelete.setEntityStatus(EntityStatus.Delete);
                                targetPrincipalIsAppliedList.add(originalDataBasePrincipalIsAppliedDelete);
                            }
                        }
                        if (!CollectionUtils.isEmpty((Collection)(originalDataBaseInvoicingCustomersIsAppliedList = this.merchantGroupDao.getInvoicingCustomersByMerchantApplyRangeIdList(merchantApplyRangeIsAppliedIdList, (Long)originalMerchant.getId())))) {
                            for (InvoicingCustomers originalDataBaseInvoicingCustomersIsApplied : originalDataBaseInvoicingCustomersIsAppliedList) {
                                InvoicingCustomers originalDataBaseInvoicingCustomersIsAppliedDelete = new InvoicingCustomers();
                                originalDataBaseInvoicingCustomersIsAppliedDelete.setId(originalDataBaseInvoicingCustomersIsApplied.getId());
                                originalDataBaseInvoicingCustomersIsAppliedDelete.setEntityStatus(EntityStatus.Delete);
                                targetInvoicingCustomersIsAppliedList.add(originalDataBaseInvoicingCustomersIsAppliedDelete);
                            }
                        }
                    }
                }
            } else {
                List originalDataBaseSourceInvoicingCustomersList;
                List originalDataBaseSourcePrincipalList;
                MerchantApplyRangeDetail originalDataBaseMerchantApplyRangeDetail = originalDataBaseSourceMerchantApplyRange.merchantAppliedDetail();
                MerchantApplyRange merchantApplyRange = MerchantUtils.getMerchantApplyRange((Long)((Long)originalMerchant.getId()), (Integer)1, (String)targetOrgId);
                merchantApplyRange.setIsApplied(Boolean.valueOf(true));
                merchantApplyRange.setIsCreator(Boolean.valueOf(true));
                if (this.merchantService.judgeOrgFuncSalesOrg(targetOrgId) && !"666666".equals(merchantApplyRange.getOrgId())) {
                    merchantApplyRange.setIsSalesOrg(Boolean.valueOf(true));
                } else {
                    merchantApplyRange.setIsSalesOrg(Boolean.valueOf(false));
                }
                MerchantApplyRangeDetail merchantApplyRangeDetail = this.exchangeFromExtend(originalDataBaseMerchantApplyRangeDetail, (Long)originalMerchant.getId(), (Long)merchantApplyRange.getId());
                merchantApplyRangeDetail.setEntityStatus(EntityStatus.Insert);
                merchantApplyRangeList.add(merchantApplyRange);
                originalDataBaseSourceMerchantApplyRange.remove("merchantAppliedDetail");
                List originalDataBaseTargetCustomerAreaList = this.merchantGroupDao.getCustomerAreaByMerchantApplyRangeIdAndMerchantId((Long)merchant.getId(), (Long)originalDataBaseSourceMerchantApplyRange.getId());
                if (!CollectionUtils.isEmpty((Collection)originalDataBaseTargetCustomerAreaList)) {
                    for (Object customerArea : originalDataBaseTargetCustomerAreaList) {
                        customerArea.setId((Object)IdManager.getInstance().nextId());
                        customerArea.setmerchantApplyRangeId((Long)merchantApplyRange.getId());
                        customerArea.setEntityStatus(EntityStatus.Insert);
                        if (!customerArea.getIsDefault().booleanValue()) continue;
                        merchant.setCustomerArea(customerArea.getSaleAreaId());
                        merchantApplyRangeDetail.setCustomerArea(customerArea.getSaleAreaId());
                    }
                    merchant.setCustomerAreas(originalDataBaseTargetCustomerAreaList);
                }
                if (!CollectionUtils.isEmpty((Collection)(originalDataBaseSourcePrincipalList = this.merchantGroupDao.getPrincipalByMerchantApplyRangeIdAndMerchantId((Long)merchant.getId(), (Long)originalDataBaseSourceMerchantApplyRange.getId())))) {
                    for (Object principal : originalDataBaseSourcePrincipalList) {
                        principal.setId((Object)IdManager.getInstance().nextId());
                        principal.setMerchantApplyRangeId((Long)merchantApplyRange.getId());
                        principal.setEntityStatus(EntityStatus.Insert);
                        if (!principal.getIsDefault().booleanValue()) continue;
                        merchantApplyRangeDetail.setSpecialManagementDep(principal.getSpecialManagementDep());
                        merchantApplyRangeDetail.setProfessSalesman(principal.getProfessSalesman());
                    }
                    merchant.setPrincipals(originalDataBaseSourcePrincipalList);
                }
                if (!CollectionUtils.isEmpty((Collection)(originalDataBaseSourceInvoicingCustomersList = this.merchantGroupDao.getInvoicingCustomersByMerchantApplyRangeIdAndMerchantId((Long)merchant.getId(), (Long)originalDataBaseSourceMerchantApplyRange.getId())))) {
                    for (InvoicingCustomers invoicingCustomers : originalDataBaseSourceInvoicingCustomersList) {
                        invoicingCustomers.setId((Object)IdManager.getInstance().nextId());
                        invoicingCustomers.setMerchantApplyRangeId((Long)merchantApplyRange.getId());
                        invoicingCustomers.setEntityStatus(EntityStatus.Insert);
                    }
                    merchant.setInvoicingCustomerss(originalDataBaseSourceInvoicingCustomersList);
                }
                merchantApplyRangeDetailList.add(merchantApplyRangeDetail);
                List originalDataBaseMerchantApplyRangeIsAppliedList = this.merchantGroupDao.getMerchantApplyRangeByMerchantIdAndIsApplied(Boolean.valueOf(false), (Long)merchant.getId());
                if (!CollectionUtils.isEmpty((Collection)originalDataBaseMerchantApplyRangeIsAppliedList)) {
                    ArrayList<Long> merchantApplyRangeIsAppliedIdList = new ArrayList<Long>();
                    for (MerchantApplyRange originalDataBaseMerchantApplyRangeIsApplied : originalDataBaseMerchantApplyRangeIsAppliedList) {
                        MerchantApplyRangeDetail originalDataBaseMerchantApplyRangeDetailIsApplied = new MerchantApplyRangeDetail();
                        originalDataBaseMerchantApplyRangeDetailIsApplied.set("id", originalMerchant.getId());
                        originalDataBaseMerchantApplyRangeDetailIsApplied.setMerchantApplyRangeId((Long)originalDataBaseMerchantApplyRangeIsApplied.getId());
                        originalDataBaseMerchantApplyRangeDetailIsApplied.setCustomerArea(null);
                        originalDataBaseMerchantApplyRangeDetailIsApplied.setCollectionAgreement(null);
                        originalDataBaseMerchantApplyRangeDetailIsApplied.setEntityStatus(EntityStatus.Update);
                        merchantApplyRangeDetailList.add(originalDataBaseMerchantApplyRangeDetailIsApplied);
                        merchantApplyRangeIsAppliedIdList.add((Long)originalDataBaseMerchantApplyRangeIsApplied.getId());
                    }
                    List originalDataBaseCustomerAreaIsAppliedList = this.merchantGroupDao.getCustomerAreaByMerchantApplyRangeIdList(merchantApplyRangeIsAppliedIdList, (Long)originalMerchant.getId());
                    if (!CollectionUtils.isEmpty((Collection)originalDataBaseCustomerAreaIsAppliedList)) {
                        for (CustomerArea originalDataBaseCustomerAreaIsApplied : originalDataBaseCustomerAreaIsAppliedList) {
                            originalDataBaseCustomerAreaIsApplied.setEntityStatus(EntityStatus.Delete);
                        }
                        merchant.setCustomerAreas(originalDataBaseCustomerAreaIsAppliedList);
                    }
                }
            }
            merchant.setMerchantApplyRanges(merchantApplyRangeList);
            merchant.setMerchantAppliedDetail(merchantApplyRangeDetailList);
            if ("yycrm".equals(source)) {
                this.merchantService.assignerMerchantApplyRangeSource(merchant, AddMerchantRangeSourceEnum.CRM_SUIT_ORG);
            } else {
                this.merchantService.assignerMerchantApplyRangeSource(merchant, AddMerchantRangeSourceEnum.TRANSFER_MC_APPLY_SUIT_ORG);
            }
            this.logger.error("\u6863\u6848\u79fb\u4ea4-\u5ba2\u6237:{}", (Object)JSON.toJSONString((Object)merchant));
            MetaDaoHelper.update((String)"aa.merchant.Merchant", (BizObject)merchant);
        }
    }

    private void setMerchantGroup(Merchant originalMerchant, String targetOrgId, String sourceOrgId) throws Exception {
        this.merchantGroupService.updateDetailIdForManagementTransfer(originalMerchant, targetOrgId, sourceOrgId);
    }

    private void setNewMerchantGroup(Merchant originalMerchant, String targetOrgId, String sourceOrgId, String source) throws Exception {
        Merchant merchant = new Merchant();
        ArrayList<MerchantApplyRange> merchantApplyRangeList = new ArrayList<MerchantApplyRange>();
        ArrayList<MerchantDetail> merchantDetailList = new ArrayList<MerchantDetail>();
        merchant.setId(originalMerchant.getId());
        merchant.setCreateOrg(targetOrgId);
        if (this.checkMerchantCustomerClass(originalMerchant.getCustomerClass(), targetOrgId).booleanValue()) {
            merchant.setCustomerClass(originalMerchant.getCustomerClass());
        } else {
            merchant.setCustomerClass(null);
        }
        merchant.setEntityStatus(EntityStatus.Update);
        List originalDataBaseSourceMerchantApplyRangeList = this.merchantGroupDao.getMerchantApplyRangeByMerchantIdAndOrgId(sourceOrgId, (Long)originalMerchant.getId());
        if (!CollectionUtils.isEmpty((Collection)originalDataBaseSourceMerchantApplyRangeList)) {
            MerchantApplyRange originalDataBaseSourceMerchantApplyRange = (MerchantApplyRange)originalDataBaseSourceMerchantApplyRangeList.get(0);
            originalDataBaseSourceMerchantApplyRange.setIsCreator(Boolean.valueOf(false));
            originalDataBaseSourceMerchantApplyRange.setIsApplied(Boolean.valueOf(true));
            originalDataBaseSourceMerchantApplyRange.setEntityStatus(EntityStatus.Update);
            merchantApplyRangeList.add(originalDataBaseSourceMerchantApplyRange);
            List originalDataBaseTargetMerchantApplyRangeList = this.merchantGroupDao.getMerchantApplyRangeByMerchantIdAndOrgId(targetOrgId, (Long)originalMerchant.getId());
            if (!CollectionUtils.isEmpty((Collection)originalDataBaseTargetMerchantApplyRangeList)) {
                MerchantDetail originalDataBaseSourceMerchantDetail;
                MerchantApplyRange originalDataBaseTargetMerchantApplyRange = (MerchantApplyRange)originalDataBaseTargetMerchantApplyRangeList.get(0);
                if (originalDataBaseTargetMerchantApplyRange.getMerchantDetailId().equals(originalDataBaseSourceMerchantApplyRange.getMerchantDetailId())) {
                    originalDataBaseSourceMerchantDetail = new MerchantDetail();
                    originalDataBaseSourceMerchantDetail.setId((Object)originalDataBaseSourceMerchantApplyRange.getMerchantDetailId());
                    originalDataBaseSourceMerchantDetail.setBelongOrgId(originalDataBaseTargetMerchantApplyRange.getOrgId());
                    originalDataBaseSourceMerchantDetail.setEntityStatus(EntityStatus.Update);
                    merchantDetailList.add(originalDataBaseSourceMerchantDetail);
                } else {
                    originalDataBaseSourceMerchantDetail = new MerchantDetail();
                    originalDataBaseSourceMerchantDetail.setId((Object)originalDataBaseSourceMerchantApplyRange.getMerchantDetailId());
                    originalDataBaseSourceMerchantDetail.setIsCreator(Boolean.valueOf(false));
                    originalDataBaseSourceMerchantDetail.setEntityStatus(EntityStatus.Update);
                    merchantDetailList.add(originalDataBaseSourceMerchantDetail);
                    MerchantDetail originalDataBaseTargetMerchantDetail = new MerchantDetail();
                    originalDataBaseTargetMerchantDetail.setId((Object)originalDataBaseTargetMerchantApplyRange.getMerchantDetailId());
                    originalDataBaseTargetMerchantDetail.setIsCreator(Boolean.valueOf(true));
                    originalDataBaseTargetMerchantDetail.setEntityStatus(EntityStatus.Update);
                    merchantDetailList.add(originalDataBaseTargetMerchantDetail);
                }
                if (!originalDataBaseTargetMerchantApplyRange.getIsApplied().booleanValue()) {
                    originalDataBaseTargetMerchantApplyRange.setIsCreator(Boolean.valueOf(true));
                    originalDataBaseTargetMerchantApplyRange.setIsApplied(Boolean.valueOf(true));
                    originalDataBaseTargetMerchantApplyRange.setEntityStatus(EntityStatus.Update);
                    merchantApplyRangeList.add(originalDataBaseTargetMerchantApplyRange);
                } else {
                    originalDataBaseTargetMerchantApplyRange.setIsCreator(Boolean.valueOf(true));
                    originalDataBaseTargetMerchantApplyRange.setIsApplied(Boolean.valueOf(true));
                    originalDataBaseTargetMerchantApplyRange.setEntityStatus(EntityStatus.Update);
                    merchantApplyRangeList.add(originalDataBaseTargetMerchantApplyRange);
                    List originalDataBaseMerchantApplyRangeIsAppliedList = this.merchantGroupDao.getMerchantApplyRangeByMerchantIdAndIsApplied(Boolean.valueOf(false), (Long)merchant.getId());
                    if (!CollectionUtils.isEmpty((Collection)originalDataBaseMerchantApplyRangeIsAppliedList)) {
                        for (MerchantApplyRange originalDataBaseMerchantApplyRangeIsApplied : originalDataBaseMerchantApplyRangeIsAppliedList) {
                            originalDataBaseMerchantApplyRangeIsApplied.setMerchantDetailId(originalDataBaseTargetMerchantApplyRange.getMerchantDetailId());
                            originalDataBaseMerchantApplyRangeIsApplied.setEntityStatus(EntityStatus.Update);
                            merchantApplyRangeList.add(originalDataBaseMerchantApplyRangeIsApplied);
                        }
                    }
                }
            } else {
                List originalDataBaseMerchantApplyRangeIsAppliedList;
                List originalDataBaseSourceInvoicingCustomersList;
                List originalDataBaseSourcePrincipalList;
                MerchantDetail originalDataBaseSourceMerchantDetail = new MerchantDetail();
                originalDataBaseSourceMerchantDetail.setId((Object)originalDataBaseSourceMerchantApplyRange.getMerchantDetailId());
                originalDataBaseSourceMerchantDetail.setIsCreator(Boolean.valueOf(false));
                originalDataBaseSourceMerchantDetail.setEntityStatus(EntityStatus.Update);
                merchantDetailList.add(originalDataBaseSourceMerchantDetail);
                MerchantApplyRange merchantApplyRange = MerchantUtils.getMerchantApplyRange((Long)((Long)originalMerchant.getId()), (Integer)1, (String)targetOrgId);
                merchantApplyRange.setIsApplied(Boolean.valueOf(true));
                merchantApplyRange.setIsCreator(Boolean.valueOf(true));
                if (this.merchantService.judgeOrgFuncSalesOrg(targetOrgId) && !"666666".equals(merchantApplyRange.getOrgId())) {
                    merchantApplyRange.setIsSalesOrg(Boolean.valueOf(true));
                } else {
                    merchantApplyRange.setIsSalesOrg(Boolean.valueOf(false));
                }
                List newOriginalDataBaseMerchantDetailList = this.merchantGroupDao.getMerchantDetailById(originalDataBaseSourceMerchantApplyRange.getMerchantDetailId(), (Long)originalMerchant.getId());
                MerchantDetail userMerchantDetail = this.merchantGroupService.copyMerchantDetail((MerchantDetail)newOriginalDataBaseMerchantDetailList.get(0), merchantApplyRange.getOrgId(), (Long)originalMerchant.getId(), true);
                merchantApplyRange.setMerchantDetailId((String)userMerchantDetail.getId());
                merchantDetailList.add(userMerchantDetail);
                merchantApplyRangeList.add(merchantApplyRange);
                List originalDataBaseTargetCustomerAreaList = this.merchantGroupDao.getCustomerAreaByMerchantApplyRangeIdAndMerchantId((Long)merchant.getId(), (Long)originalDataBaseSourceMerchantApplyRange.getId());
                if (!CollectionUtils.isEmpty((Collection)originalDataBaseTargetCustomerAreaList)) {
                    for (Object customerArea : originalDataBaseTargetCustomerAreaList) {
                        customerArea.setId((Object)IdManager.getInstance().nextId());
                        customerArea.setmerchantApplyRangeId((Long)merchantApplyRange.getId());
                        customerArea.setEntityStatus(EntityStatus.Insert);
                        if (!customerArea.getIsDefault().booleanValue()) continue;
                        merchant.setCustomerArea(customerArea.getSaleAreaId());
                    }
                    merchant.setCustomerAreas(originalDataBaseTargetCustomerAreaList);
                }
                if (!CollectionUtils.isEmpty((Collection)(originalDataBaseSourcePrincipalList = this.merchantGroupDao.getPrincipalByMerchantApplyRangeIdAndMerchantId((Long)merchant.getId(), (Long)originalDataBaseSourceMerchantApplyRange.getId())))) {
                    for (Object principal : originalDataBaseSourcePrincipalList) {
                        principal.setId((Object)IdManager.getInstance().nextId());
                        principal.setMerchantApplyRangeId((Long)merchantApplyRange.getId());
                        principal.setEntityStatus(EntityStatus.Insert);
                    }
                    merchant.setPrincipals(originalDataBaseSourcePrincipalList);
                }
                if (!CollectionUtils.isEmpty((Collection)(originalDataBaseSourceInvoicingCustomersList = this.merchantGroupDao.getInvoicingCustomersByMerchantApplyRangeIdAndMerchantId((Long)merchant.getId(), (Long)originalDataBaseSourceMerchantApplyRange.getId())))) {
                    for (InvoicingCustomers invoicingCustomers : originalDataBaseSourceInvoicingCustomersList) {
                        invoicingCustomers.setId((Object)IdManager.getInstance().nextId());
                        invoicingCustomers.setMerchantApplyRangeId((Long)merchantApplyRange.getId());
                        invoicingCustomers.setEntityStatus(EntityStatus.Insert);
                    }
                    merchant.setInvoicingCustomerss(originalDataBaseSourceInvoicingCustomersList);
                }
                if (!CollectionUtils.isEmpty((Collection)(originalDataBaseMerchantApplyRangeIsAppliedList = this.merchantGroupDao.getMerchantApplyRangeByMerchantIdAndIsApplied(Boolean.valueOf(false), (Long)merchant.getId())))) {
                    ArrayList<Long> merchantApplyRangeIsAppliedIdList = new ArrayList<Long>();
                    for (MerchantApplyRange originalDataBaseMerchantApplyRangeIsApplied : originalDataBaseMerchantApplyRangeIsAppliedList) {
                        originalDataBaseMerchantApplyRangeIsApplied.setMerchantDetailId((String)userMerchantDetail.getId());
                        originalDataBaseMerchantApplyRangeIsApplied.setEntityStatus(EntityStatus.Update);
                        merchantApplyRangeList.add(originalDataBaseMerchantApplyRangeIsApplied);
                        merchantApplyRangeIsAppliedIdList.add((Long)originalDataBaseMerchantApplyRangeIsApplied.getId());
                    }
                    List originalDataBaseCustomerAreaIsAppliedList = this.merchantGroupDao.getCustomerAreaByMerchantApplyRangeIdList(merchantApplyRangeIsAppliedIdList, (Long)originalMerchant.getId());
                    if (!CollectionUtils.isEmpty((Collection)originalDataBaseCustomerAreaIsAppliedList)) {
                        for (CustomerArea originalDataBaseCustomerAreaIsApplied : originalDataBaseCustomerAreaIsAppliedList) {
                            originalDataBaseCustomerAreaIsApplied.setEntityStatus(EntityStatus.Delete);
                        }
                        merchant.setCustomerAreas(originalDataBaseCustomerAreaIsAppliedList);
                    }
                }
            }
            merchant.setMerchantApplyRanges(merchantApplyRangeList);
            merchant.setMerchantDetail(merchantDetailList);
            if ("yycrm".equals(source)) {
                this.merchantService.assignerMerchantApplyRangeSource(merchant, AddMerchantRangeSourceEnum.CRM_SUIT_ORG);
            } else {
                this.merchantService.assignerMerchantApplyRangeSource(merchant, AddMerchantRangeSourceEnum.TRANSFER_MC_APPLY_SUIT_ORG);
            }
            this.logger.error("\u6863\u6848\u79fb\u4ea4-\u5ba2\u6237:{}", (Object)JSON.toJSONString((Object)merchant));
            MetaDaoHelper.update((String)"aa.merchant.Merchant", (BizObject)merchant);
        }
    }

    private void checkMerchantApplyRangeGroup(Merchant originalMerchant, TransfermcTaskDTO transfermcTaskDTO) throws Exception {
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id,isApplied,controlRuleVersion");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(originalMerchant.getId()), QueryCondition.name((String)"orgId").eq((Object)transfermcTaskDTO.getTargetOrgId()), QueryCondition.name((String)"isCreator").eq((Object)false), QueryCondition.name((String)"isPotential").eq((Object)false)}));
        List merchantApplyRangeInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRange", (QuerySchema)querySchema, null);
        if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeInDbList)) {
            for (MerchantApplyRange merchantApplyRange : merchantApplyRangeInDbList) {
                if (merchantApplyRange.getControlRuleVersion() == null && !merchantApplyRange.getIsApplied().booleanValue()) continue;
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_TRANSFER_SOURCE_ORG_ID, new Object[]{originalMerchant.getCode()});
            }
        }
    }

    private MerchantApplyRangeDetail exchangeFromExtend(MerchantApplyRangeDetail originalDataBaseMerchantApplyRangeDetail, Long merchantId, Long merchantApplyRangeId) {
        HashMap<String, String> params = new HashMap<String, String>();
        params.put("billNo", "aa_merchant");
        MerchantApplyRangeDetail merchantApplyRangeDetail = new MerchantApplyRangeDetail();
        if (originalDataBaseMerchantApplyRangeDetail != null) {
            this.upcMerchantQueryService.exchangeFromExtend((BizObject)originalDataBaseMerchantApplyRangeDetail, (BizObject)merchantApplyRangeDetail, params);
        }
        merchantApplyRangeDetail.set("id", (Object)merchantId);
        merchantApplyRangeDetail.setMerchantApplyRangeId(merchantApplyRangeId);
        merchantApplyRangeDetail.remove("merchantApplyRangeExtId");
        merchantApplyRangeDetail.setCreateDate(new Date());
        merchantApplyRangeDetail.setCreateTime(new Date());
        merchantApplyRangeDetail.setModifyDate(new Date());
        merchantApplyRangeDetail.setModifyTime(new Date());
        return merchantApplyRangeDetail;
    }

    private long getPageIndex(Long totalCount, int pageSize) {
        long divisor = totalCount / (long)pageSize;
        long remainder = totalCount % (long)pageSize;
        if (remainder > 0L) {
            ++divisor;
        }
        return divisor;
    }

    private List<Merchant> selectMerchant(TransfermcTaskDTO transfermcTaskDTO, int pageSize) {
        try {
            QuerySchema querySchema = this.buildMerchantQuerySchema(transfermcTaskDTO);
            querySchema.addOrderBy("id");
            QueryPager queryPager = new QueryPager();
            queryPager.setPageIndex(1);
            queryPager.setPageSize(pageSize);
            querySchema.pager(queryPager);
            return MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (QuerySchema)querySchema, null);
        }
        catch (Exception e) {
            this.logger.error("\u5ba2\u6237\u6863\u6848\u7ba1\u7406\u6743\u79fb\u4ea4\u67e5\u8be2\u62a5\u9519" + e.getMessage(), (Throwable)e);
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801499);
        }
    }

    private Long selectCountMerchant(TransfermcTaskDTO transfermcTaskDTO) {
        try {
            Long totalCount = 0L;
            QuerySchema querySchema = this.buildMerchantQuerySchema(transfermcTaskDTO);
            querySchema.isCountSchema(true);
            List merchantList = MetaDaoHelper.query((String)"aa.merchant.Merchant", (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)merchantList)) {
                totalCount = (Long)((Map)merchantList.get(0)).get("totalCount");
            }
            return totalCount;
        }
        catch (Exception e) {
            this.logger.error("\u5ba2\u6237\u6863\u6848\u7ba1\u7406\u6743\u79fb\u4ea4\u67e5\u8be2\u603b\u6570\u62a5\u9519" + e.getMessage(), (Throwable)e);
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801500);
        }
    }

    private QuerySchema buildMerchantQuerySchema(TransfermcTaskDTO transfermcTaskDTO) throws Exception {
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id,code,name,customerClass");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"createOrg").eq((Object)transfermcTaskDTO.getSourceOrgId()), QueryCondition.name((String)"merchantApplyRanges.orgId").eq((Object)transfermcTaskDTO.getSourceOrgId()), QueryCondition.name((String)"merchantApplyRanges.isCreator").eq((Object)true)}));
        DataScopeDTO dataScopeDTO = transfermcTaskDTO.getDataScopeDTO();
        if (!dataScopeDTO.isAll()) {
            List ruleItemDTOList = dataScopeDTO.getRuleItems();
            ArrayList<QueryCondition> conditionExpressions = new ArrayList<QueryCondition>();
            if (!CollectionUtils.isEmpty((Collection)ruleItemDTOList)) {
                for (RuleItemDTO ruleItemDTO : ruleItemDTOList) {
                    ArrayList<Object> idList;
                    if ("aa_merchantref".equals(ruleItemDTO.getCode()) && !CollectionUtils.isEmpty((Collection)ruleItemDTO.getValues())) {
                        idList = new ArrayList<Object>();
                        for (String id : ruleItemDTO.getValues()) {
                            idList.add(Long.valueOf(id));
                        }
                        conditionExpressions.add(QueryCondition.name((String)"id").in(idList));
                    }
                    if ("aa_custcategoryref".equals(ruleItemDTO.getCode()) && !CollectionUtils.isEmpty((Collection)ruleItemDTO.getValues())) {
                        idList = new ArrayList();
                        for (String id : ruleItemDTO.getValues()) {
                            idList.add(Long.valueOf(id));
                        }
                        conditionExpressions.add(QueryCondition.name((String)"customerClass").in(idList));
                    }
                    if ("aa_salearearef".equals(ruleItemDTO.getCode()) && !CollectionUtils.isEmpty((Collection)ruleItemDTO.getValues())) {
                        idList = new ArrayList();
                        for (String id : ruleItemDTO.getValues()) {
                            idList.add(Long.valueOf(id));
                        }
                        conditionExpressions.add(QueryCondition.name((String)"customerArea").in(idList));
                        querySchema.distinct();
                    }
                    if (!"bd_staff_ref".equals(ruleItemDTO.getCode()) || CollectionUtils.isEmpty((Collection)ruleItemDTO.getValues())) continue;
                    idList = new ArrayList();
                    for (String id : ruleItemDTO.getValues()) {
                        idList.add(id);
                    }
                    QuerySchema query = QuerySchema.create();
                    query.addSelect("merchantId");
                    query.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"professSalesman").in(idList)}));
                    List principalList = MetaDaoHelper.queryObject((String)"aa.merchant.Principal", (QuerySchema)query, null);
                    if (CollectionUtils.isEmpty((Collection)principalList)) continue;
                    HashSet<Long> merchantIds = new HashSet<Long>();
                    for (Principal principal : principalList) {
                        merchantIds.add(principal.getMerchantId());
                    }
                    conditionExpressions.add(QueryCondition.name((String)"id").in(merchantIds));
                    querySchema.distinct();
                }
                if (conditionExpressions.size() > 0) {
                    ConditionExpression[] ces = new ConditionExpression[conditionExpressions.size()];
                    QueryConditionGroup condition = new QueryConditionGroup();
                    if ("and".equals(dataScopeDTO.getOperatorType())) {
                        condition = QueryConditionGroup.and((ConditionExpression[])conditionExpressions.toArray(ces));
                    } else if ("or".equals(dataScopeDTO.getOperatorType())) {
                        condition = QueryConditionGroup.or((ConditionExpression[])conditionExpressions.toArray(ces));
                    }
                    querySchema.appendQueryCondition(new ConditionExpression[]{condition});
                }
            }
        }
        return querySchema;
    }

    private Boolean checkMerchantCustomerClass(Long customerClass, String targetOrgId) throws Exception {
        if (customerClass == null) {
            return false;
        }
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"clsId").eq((Object)customerClass), QueryCondition.name((String)"orgId").eq((Object)targetOrgId)}));
        List custCategoryApplyRangeList = MetaDaoHelper.queryObject((String)"aa.custcategory.CustCategoryApplyRange", (QuerySchema)querySchema, null);
        if (!CollectionUtils.isEmpty((Collection)custCategoryApplyRangeList)) {
            return true;
        }
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void transferTaskProduct(TransfermcTaskDTO transfermcTaskDTO) {
        TransfermcResult transfermcResult = new TransfermcResult();
        ArrayList<TransfermcDetailError> transfermcDetailErrorList = new ArrayList<TransfermcDetailError>();
        String totalCountUniqueKey = transfermcTaskDTO.getTaskId() + AppContext.getCurrentUser().getYhtTenantId() + "totalCount";
        String countUniqueKey = transfermcTaskDTO.getTaskId() + AppContext.getCurrentUser().getYhtTenantId() + "count";
        try {
            int successCount = 0;
            int failCount = 0;
            int pageSize = 500;
            Long totalCount = this.selectCountByEntityName(transfermcTaskDTO, "pc.product.Product");
            long divisor = this.getPageIndex(totalCount, pageSize);
            int pageIndex = 1;
            while ((long)pageIndex <= divisor) {
                List<BizObject> productList = this.selectManagementData(transfermcTaskDTO, "pc.product.Product", pageSize);
                if (!CollectionUtils.isEmpty(productList)) {
                    for (BizObject bizObject : productList) {
                        Product product = (Product)bizObject;
                        try {
                            this.setProduct(product, transfermcTaskDTO.getTargetOrgId(), transfermcTaskDTO.getSourceOrgId());
                            this.dealProductOldRangeToNew((Long)product.getId());
                            ++successCount;
                        }
                        catch (Exception e) {
                            ++failCount;
                            String name = String.valueOf(MultilangUtil.getAttr((String)"pc.product.Product", (String)"name", (BizObject)product, null));
                            TransfermcDetailError transfermcDetailError = new TransfermcDetailError();
                            transfermcDetailError.setErrorCause(e.getMessage());
                            transfermcDetailError.setCode(product.getCode());
                            transfermcDetailError.setName(name);
                            transfermcDetailErrorList.add(transfermcDetailError);
                        }
                        finally {
                            int count = successCount + failCount;
                            AppContext.cache().set(totalCountUniqueKey, String.valueOf(totalCount));
                            AppContext.cache().set(countUniqueKey, String.valueOf(count));
                        }
                    }
                }
                TransfermcProgressDTO transfermcProgressDTO = new TransfermcProgressDTO();
                transfermcProgressDTO.setTotalCount(totalCount.intValue());
                transfermcProgressDTO.setSuccessCount(successCount);
                transfermcProgressDTO.setFailCount(failCount);
                transfermcProgressDTO.setCount(failCount + successCount);
                if (transfermcProgressDTO.getTotalCount() != transfermcProgressDTO.getCount()) {
                    this.transfermcTaskCallBackService.replyProgress(transfermcTaskDTO.getTaskId(), AppContext.getCurrentUser().getYhtTenantId(), transfermcProgressDTO);
                }
                ++pageIndex;
            }
            transfermcResult.setCount(failCount + successCount);
            transfermcResult.setFailCount(failCount);
            transfermcResult.setSuccessCount(successCount);
            transfermcResult.setTotalCount(totalCount.intValue());
            transfermcResult.setStatus(transfermcDetailErrorList.isEmpty() ? TransfermcStatus.SUCESS.getStatus() : TransfermcStatus.FAIL.getStatus());
            transfermcResult.setErrorList(transfermcDetailErrorList);
            transfermcTaskDTO.setTransfermcResult(transfermcResult);
        }
        catch (Exception e) {
            try {
                TransfermcDetailError transfermcDetailError = new TransfermcDetailError();
                transfermcDetailError.setErrorCause(e.getMessage());
                transfermcDetailErrorList.add(transfermcDetailError);
                transfermcResult.setCount(1);
                transfermcResult.setTotalCount(1);
                transfermcResult.setFailCount(1);
                transfermcResult.setStatus(TransfermcStatus.FAIL.getStatus());
                transfermcResult.setErrorList(transfermcDetailErrorList);
                transfermcTaskDTO.setTransfermcResult(transfermcResult);
            }
            catch (Throwable throwable) {
                this.transfermcTaskCallBackService.callbackTransfermcTask(transfermcTaskDTO);
                AppContext.cache().del(new String[]{countUniqueKey});
                AppContext.cache().del(new String[]{totalCountUniqueKey});
                throw throwable;
            }
            this.transfermcTaskCallBackService.callbackTransfermcTask(transfermcTaskDTO);
            AppContext.cache().del(new String[]{countUniqueKey});
            AppContext.cache().del(new String[]{totalCountUniqueKey});
        }
        this.transfermcTaskCallBackService.callbackTransfermcTask(transfermcTaskDTO);
        AppContext.cache().del(new String[]{countUniqueKey});
        AppContext.cache().del(new String[]{totalCountUniqueKey});
    }

    private Long selectCountByEntityName(TransfermcTaskDTO transfermcTaskDTO, String entityName) {
        try {
            Long totalCount = 0L;
            QuerySchema querySchema = this.buildQuerySchema(transfermcTaskDTO, entityName);
            querySchema.isCountSchema(true);
            List merchantList = MetaDaoHelper.query((String)entityName, (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)merchantList)) {
                totalCount = (Long)((Map)merchantList.get(0)).get("totalCount");
            }
            return totalCount;
        }
        catch (Exception e) {
            this.logger.error("\u6863\u6848\u7ba1\u7406\u6743\u79fb\u4ea4\u67e5\u8be2\u603b\u6570\u62a5\u9519", (Object)e.getMessage(), (Object)e);
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801501, new Object[]{e.getMessage()});
        }
    }

    private QuerySchema buildQuerySchema(TransfermcTaskDTO transfermcTaskDTO, String entityName) throws Exception {
        DataScopeDTO dataScopeDTO = transfermcTaskDTO.getDataScopeDTO();
        QuerySchema querySchema = QuerySchema.create();
        if ("pc.product.Product".equals(entityName)) {
            querySchema.addSelect("id,code,name,manageClass");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"orgId").eq((Object)transfermcTaskDTO.getSourceOrgId())}));
        }
        if (!dataScopeDTO.isAll()) {
            List ruleItemDTOList = dataScopeDTO.getRuleItems();
            ArrayList<QueryCondition> conditionExpressions = new ArrayList<QueryCondition>();
            if (!CollectionUtils.isEmpty((Collection)ruleItemDTOList)) {
                for (RuleItemDTO ruleItemDTO : ruleItemDTOList) {
                    ArrayList<Long> idList;
                    if ("productref".equals(ruleItemDTO.getCode()) && !CollectionUtils.isEmpty((Collection)ruleItemDTO.getValues())) {
                        idList = new ArrayList<Long>();
                        for (String id : ruleItemDTO.getValues()) {
                            idList.add(Long.valueOf(id));
                        }
                        conditionExpressions.add(QueryCondition.name((String)"id").in(idList));
                    }
                    if (!"pc_managementclassref".equals(ruleItemDTO.getCode()) || CollectionUtils.isEmpty((Collection)ruleItemDTO.getValues())) continue;
                    idList = new ArrayList();
                    for (String id : ruleItemDTO.getValues()) {
                        idList.add(Long.valueOf(id));
                    }
                    conditionExpressions.add(QueryCondition.name((String)"manageClass").in(idList));
                }
                if (conditionExpressions.size() > 0) {
                    ConditionExpression[] ces = new ConditionExpression[conditionExpressions.size()];
                    QueryConditionGroup condition = new QueryConditionGroup();
                    if ("and".equals(dataScopeDTO.getOperatorType())) {
                        condition = QueryConditionGroup.and((ConditionExpression[])conditionExpressions.toArray(ces));
                    } else if ("or".equals(dataScopeDTO.getOperatorType())) {
                        condition = QueryConditionGroup.or((ConditionExpression[])conditionExpressions.toArray(ces));
                    }
                    querySchema.appendQueryCondition(new ConditionExpression[]{condition});
                }
            }
        }
        return querySchema;
    }

    private List<BizObject> selectManagementData(TransfermcTaskDTO transfermcTaskDTO, String entityName, int pageSize) {
        try {
            QuerySchema querySchema = this.buildQuerySchema(transfermcTaskDTO, entityName);
            querySchema.addOrderBy("id");
            QueryPager queryPager = new QueryPager();
            queryPager.setPageIndex(1);
            queryPager.setPageSize(pageSize);
            querySchema.pager(queryPager);
            return MetaDaoHelper.queryObject((String)entityName, (QuerySchema)querySchema, null);
        }
        catch (Exception e) {
            this.logger.error("\u6863\u6848\u7ba1\u7406\u6743\u79fb\u4ea4\u5206\u6279\u67e5\u8be2\u62a5\u9519" + e.getMessage(), (Throwable)e);
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801502, new Object[]{e.getMessage()});
        }
    }

    public void setProduct(Product originalProduct, String targetOrgId, String sourceOrgId) throws Exception {
        Product product = new Product();
        ArrayList<ProductApplyRange> productApplyRangeList = new ArrayList<ProductApplyRange>();
        product.setId(originalProduct.getId());
        product.setOrgId(targetOrgId);
        if (!this.checkOrgPermission(originalProduct.getManageClass(), targetOrgId, "pc.cls.ManagementClass").booleanValue()) {
            Map managementMap = MetaDaoHelper.queryOne((String)"pc.cls.ManagementClass", (QuerySchema)QuerySchema.create().addSelect("code,name").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)originalProduct.getManageClass())})));
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801503, new Object[]{originalProduct.getCode(), managementMap.get("name")});
        }
        product.setManageClass(originalProduct.getManageClass());
        product.setEntityStatus(EntityStatus.Update);
        List sourceProductApplyRangeList = this.productGroupDao.getProductApplyRangeByProductIdAndOrgId(sourceOrgId, (Long)originalProduct.getId());
        if (!CollectionUtils.isEmpty((Collection)sourceProductApplyRangeList)) {
            Long originalProductApplyRangeId = (Long)((ProductApplyRange)sourceProductApplyRangeList.get(0)).getId();
            Long targetProductApplyRangeId = 0L;
            List targetProductApplyRangeList = this.productGroupDao.getProductApplyRangeByProductIdAndOrgId(targetOrgId, (Long)originalProduct.getId());
            if (!CollectionUtils.isEmpty((Collection)targetProductApplyRangeList)) {
                ProductApplyRange targetProductApplyRange = (ProductApplyRange)targetProductApplyRangeList.get(0);
                if (((ProductApplyRange)targetProductApplyRangeList.get(0)).getIsApplied().booleanValue()) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801504, new Object[]{originalProduct.getCode()});
                }
                if (null != ((ProductApplyRange)targetProductApplyRangeList.get(0)).getControlRuleVersion()) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_TRANSFER_SOURCE_VERDION_ERROR, new Object[]{originalProduct.getCode()});
                }
                targetProductApplyRangeId = (Long)targetProductApplyRange.getId();
                targetProductApplyRange.setIsCreator(Boolean.valueOf(true));
                targetProductApplyRange.setIsApplied(Boolean.valueOf(true));
                if (null == targetProductApplyRange.getAllocatorName()) {
                    targetProductApplyRange.setAllocatorName(AppContext.getCurrentUser().getName());
                }
                if (null == targetProductApplyRange.getAllocatorId()) {
                    targetProductApplyRange.setAllocatorId((Long)AppContext.getCurrentUser().getId());
                }
                if (null == targetProductApplyRange.getAllocateTime()) {
                    targetProductApplyRange.setAllocateTime(new Date());
                }
                targetProductApplyRange.setEntityStatus(EntityStatus.Update);
                productApplyRangeList.add(targetProductApplyRange);
            } else {
                ProductApplyRange newProductApplyRange = (ProductApplyRange)sourceProductApplyRangeList.get(0);
                newProductApplyRange.setId((Object)IdManager.getInstance().nextId());
                newProductApplyRange.setOrgId(targetOrgId);
                newProductApplyRange.setIsCreator(Boolean.valueOf(true));
                newProductApplyRange.setIsApplied(Boolean.valueOf(true));
                newProductApplyRange.setAllocatorName(AppContext.getCurrentUser().getName());
                newProductApplyRange.setAllocatorId((Long)AppContext.getCurrentUser().getId());
                newProductApplyRange.setAllocateTime(new Date());
                newProductApplyRange.setRangeType(Integer.valueOf(1));
                newProductApplyRange.setEntityStatus(EntityStatus.Insert);
                productApplyRangeList.add(newProductApplyRange);
                targetProductApplyRangeId = (Long)newProductApplyRange.getId();
            }
            product.setProductApplyRange(productApplyRangeList);
            this.logger.error("\u6863\u6848\u79fb\u4ea4-\u7269\u6599:{}", (Object)JSON.toJSONString((Object)product));
            MetaDaoHelper.update((String)"pc.product.Product", (BizObject)product);
            this.changeApplyRangeIdForManagementTransFer((Long)originalProduct.getId(), originalProductApplyRangeId, targetProductApplyRangeId, targetOrgId);
        }
    }

    private Boolean checkOrgPermission(Long checkId, String targetOrgId, String entityName) throws Exception {
        if (checkId == null) {
            return false;
        }
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id");
        if ("pc.cls.ManagementClass".equals(entityName)) {
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)checkId), QueryCondition.name((String)"orgGroupId.orgGroupDetailList.orgId").eq((Object)targetOrgId)}));
            if (!CollectionUtils.isEmpty((Collection)MetaDaoHelper.queryObject((String)entityName, (QuerySchema)querySchema, null))) {
                return true;
            }
        }
        return false;
    }

    private void changeApplyRangeIdForManagementTransFer(Long productId, Long productApplyRangeId, Long newProductApplyRangeId, String targetOrgId) throws Exception {
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("tenantId", AppContext.getCurrentUser().getTenant());
        params.put("yTenantId", AppContext.getCurrentUser().getYTenantId());
        params.put("productId", productId);
        params.put("productApplyRangeId", productApplyRangeId);
        params.put("newProductApplyRangeId", newProductApplyRangeId);
        params.put("targetOrgId", targetOrgId);
        this.productGroupDao.changeApplyRangeIdForManagementTransFer(params);
    }

    private void dealProductOldRangeToNew(Long productId) throws Exception {
        Tenant tenant = new Tenant();
        ArrayList<Long> productIdList = new ArrayList<Long>();
        productIdList.add(productId);
        tenant.setId(AppContext.getCurrentUser().getTenant());
        tenant.setYTenantId(AppContext.getCurrentUser().getYhtTenantId());
        HashMap<String, Object> deleteRangeGroupByProductIdParam = new HashMap<String, Object>();
        deleteRangeGroupByProductIdParam.put("productId", productId);
        deleteRangeGroupByProductIdParam.put("ytenant", AppContext.getCurrentUser().getYhtTenantId());
        SqlHelper.delete((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.deleteProductApplyRangeGroupByProductId", deleteRangeGroupByProductIdParam);
        this.productApplyRangeGroupService.dealOldRangeToNew(productIdList, tenant);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void transferTaskCustCategory(TransfermcTaskDTO transfermcTaskDTO) {
        TransfermcResult transfermcResult = new TransfermcResult();
        ArrayList<TransfermcDetailError> transfermcDetailErrorList = new ArrayList<TransfermcDetailError>();
        String totalCountUniqueKey = transfermcTaskDTO.getTaskId() + AppContext.getCurrentUser().getYhtTenantId() + "totalCount";
        String countUniqueKey = transfermcTaskDTO.getTaskId() + AppContext.getCurrentUser().getYhtTenantId() + "count";
        try {
            int successCount = 0;
            int failCount = 0;
            int pageSize = 500;
            Long totalCount = this.selectCountCustCategory(transfermcTaskDTO);
            long divisor = this.getPageIndex(totalCount, pageSize);
            int pageIndex = 1;
            while ((long)pageIndex <= divisor) {
                List<CustCategory> custCategoryList = this.selectCustCategory(transfermcTaskDTO, pageSize);
                if (!CollectionUtils.isEmpty(custCategoryList)) {
                    for (CustCategory custCategory : custCategoryList) {
                        try {
                            this.setCustCategory(custCategory, transfermcTaskDTO.getTargetOrgId(), transfermcTaskDTO.getSourceOrgId());
                            ++successCount;
                        }
                        catch (Exception e) {
                            ++failCount;
                            String name = String.valueOf(MultilangUtil.getAttr((String)"aa.custcategory.CustCategory", (String)"name", (BizObject)custCategory, null));
                            TransfermcDetailError transfermcDetailError = new TransfermcDetailError();
                            transfermcDetailError.setTargetDocIdValue(custCategory.getId().toString());
                            transfermcDetailError.setErrorCause(e.getMessage());
                            transfermcDetailError.setCode(custCategory.getCode());
                            transfermcDetailError.setName(name);
                            transfermcDetailErrorList.add(transfermcDetailError);
                        }
                        finally {
                            int count = successCount + failCount;
                            AppContext.cache().set(totalCountUniqueKey, String.valueOf(totalCount));
                            AppContext.cache().set(countUniqueKey, String.valueOf(count));
                        }
                    }
                }
                TransfermcProgressDTO transfermcProgressDTO = new TransfermcProgressDTO();
                transfermcProgressDTO.setTotalCount(totalCount.intValue());
                transfermcProgressDTO.setSuccessCount(successCount);
                transfermcProgressDTO.setFailCount(failCount);
                transfermcProgressDTO.setCount(failCount + successCount);
                if (transfermcProgressDTO.getTotalCount() != transfermcProgressDTO.getCount()) {
                    this.transfermcTaskCallBackService.replyProgress(transfermcTaskDTO.getTaskId(), AppContext.getCurrentUser().getYhtTenantId(), transfermcProgressDTO);
                }
                ++pageIndex;
            }
            transfermcResult.setCount(failCount + successCount);
            transfermcResult.setFailCount(failCount);
            transfermcResult.setSuccessCount(successCount);
            transfermcResult.setTotalCount(totalCount.intValue());
            transfermcResult.setStatus(TransfermcStatus.SUCESS.getStatus());
            transfermcResult.setErrorList(transfermcDetailErrorList);
            transfermcTaskDTO.setTransfermcResult(transfermcResult);
        }
        catch (Exception e) {
            try {
                TransfermcDetailError transfermcDetailError = new TransfermcDetailError();
                transfermcDetailError.setErrorCause(e.getMessage());
                transfermcDetailErrorList.add(transfermcDetailError);
                transfermcResult.setCount(1);
                transfermcResult.setTotalCount(1);
                transfermcResult.setFailCount(1);
                transfermcResult.setStatus(TransfermcStatus.FAIL.getStatus());
                transfermcResult.setErrorList(transfermcDetailErrorList);
                transfermcTaskDTO.setTransfermcResult(transfermcResult);
            }
            catch (Throwable throwable) {
                this.transfermcTaskCallBackService.callbackTransfermcTask(transfermcTaskDTO);
                AppContext.cache().del(new String[]{countUniqueKey});
                AppContext.cache().del(new String[]{totalCountUniqueKey});
                throw throwable;
            }
            this.transfermcTaskCallBackService.callbackTransfermcTask(transfermcTaskDTO);
            AppContext.cache().del(new String[]{countUniqueKey});
            AppContext.cache().del(new String[]{totalCountUniqueKey});
        }
        this.transfermcTaskCallBackService.callbackTransfermcTask(transfermcTaskDTO);
        AppContext.cache().del(new String[]{countUniqueKey});
        AppContext.cache().del(new String[]{totalCountUniqueKey});
    }

    private Long selectCountCustCategory(TransfermcTaskDTO transfermcTaskDTO) {
        try {
            Long totalCount = 0L;
            QuerySchema querySchema = this.buildCustCategoryQuerySchema(transfermcTaskDTO);
            querySchema.isCountSchema(true);
            List custCategoryList = MetaDaoHelper.query((String)"aa.custcategory.CustCategory", (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)custCategoryList)) {
                totalCount = (Long)((Map)custCategoryList.get(0)).get("totalCount");
            }
            return totalCount;
        }
        catch (Exception e) {
            this.logger.error("\u5ba2\u6237\u5206\u7c7b\u6863\u6848\u7ba1\u7406\u6743\u79fb\u4ea4\u67e5\u8be2\u603b\u6570\u62a5\u9519" + e.getMessage(), (Throwable)e);
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801505);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void transferTaskManagementClass(TransfermcTaskDTO transfermcTaskDTO) {
        TransfermcResult transfermcResult = new TransfermcResult();
        ArrayList<TransfermcDetailError> transfermcDetailErrorList = new ArrayList<TransfermcDetailError>();
        String totalCountUniqueKey = transfermcTaskDTO.getTaskId() + AppContext.getCurrentUser().getYhtTenantId() + "totalCount";
        String countUniqueKey = transfermcTaskDTO.getTaskId() + AppContext.getCurrentUser().getYhtTenantId() + "count";
        try {
            int successCount = 0;
            int failCount = 0;
            int pageSize = 500;
            Long totalCount = this.selectCountManagementClass(transfermcTaskDTO);
            long divisor = this.getPageIndex(totalCount, pageSize);
            int pageIndex = 1;
            while ((long)pageIndex <= divisor) {
                List<ManagementClass> managementClassList = this.selectManagementClass(transfermcTaskDTO, pageSize);
                if (!CollectionUtils.isEmpty(managementClassList)) {
                    for (ManagementClass managementClass : managementClassList) {
                        try {
                            this.setManagementClass(managementClass, transfermcTaskDTO.getTargetOrgId(), transfermcTaskDTO.getSourceOrgId());
                            ++successCount;
                        }
                        catch (Exception e) {
                            ++failCount;
                            String name = String.valueOf(MultilangUtil.getAttr((String)"pc.cls.ManagementClass", (String)"name", (BizObject)managementClass, null));
                            TransfermcDetailError transfermcDetailError = new TransfermcDetailError();
                            transfermcDetailError.setTargetDocIdValue(managementClass.getId().toString());
                            transfermcDetailError.setErrorCause(e.getMessage());
                            transfermcDetailError.setCode(managementClass.getCode());
                            transfermcDetailError.setName(name);
                            transfermcDetailErrorList.add(transfermcDetailError);
                        }
                        finally {
                            int count = successCount + failCount;
                            AppContext.cache().set(totalCountUniqueKey, String.valueOf(totalCount));
                            AppContext.cache().set(countUniqueKey, String.valueOf(count));
                        }
                    }
                }
                TransfermcProgressDTO transfermcProgressDTO = new TransfermcProgressDTO();
                transfermcProgressDTO.setTotalCount(totalCount.intValue());
                transfermcProgressDTO.setSuccessCount(successCount);
                transfermcProgressDTO.setFailCount(failCount);
                transfermcProgressDTO.setCount(failCount + successCount);
                if (transfermcProgressDTO.getTotalCount() != transfermcProgressDTO.getCount()) {
                    this.transfermcTaskCallBackService.replyProgress(transfermcTaskDTO.getTaskId(), AppContext.getCurrentUser().getYhtTenantId(), transfermcProgressDTO);
                }
                ++pageIndex;
            }
            transfermcResult.setCount(failCount + successCount);
            transfermcResult.setFailCount(failCount);
            transfermcResult.setSuccessCount(successCount);
            transfermcResult.setTotalCount(totalCount.intValue());
            transfermcResult.setStatus(TransfermcStatus.SUCESS.getStatus());
            transfermcResult.setErrorList(transfermcDetailErrorList);
            transfermcTaskDTO.setTransfermcResult(transfermcResult);
        }
        catch (Exception e) {
            try {
                TransfermcDetailError transfermcDetailError = new TransfermcDetailError();
                transfermcDetailError.setErrorCause(e.getMessage());
                transfermcDetailErrorList.add(transfermcDetailError);
                transfermcResult.setCount(1);
                transfermcResult.setTotalCount(1);
                transfermcResult.setFailCount(1);
                transfermcResult.setStatus(TransfermcStatus.FAIL.getStatus());
                transfermcResult.setErrorList(transfermcDetailErrorList);
                transfermcTaskDTO.setTransfermcResult(transfermcResult);
            }
            catch (Throwable throwable) {
                this.transfermcTaskCallBackService.callbackTransfermcTask(transfermcTaskDTO);
                AppContext.cache().del(new String[]{countUniqueKey});
                AppContext.cache().del(new String[]{totalCountUniqueKey});
                throw throwable;
            }
            this.transfermcTaskCallBackService.callbackTransfermcTask(transfermcTaskDTO);
            AppContext.cache().del(new String[]{countUniqueKey});
            AppContext.cache().del(new String[]{totalCountUniqueKey});
        }
        this.transfermcTaskCallBackService.callbackTransfermcTask(transfermcTaskDTO);
        AppContext.cache().del(new String[]{countUniqueKey});
        AppContext.cache().del(new String[]{totalCountUniqueKey});
    }

    private Long selectCountManagementClass(TransfermcTaskDTO transfermcTaskDTO) {
        try {
            Long totalCount = 0L;
            QuerySchema querySchema = this.buildManagementClassQuerySchema(transfermcTaskDTO);
            querySchema.isCountSchema(true);
            List managementClassList = MetaDaoHelper.query((String)"pc.cls.ManagementClass", (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)managementClassList)) {
                totalCount = (Long)((Map)managementClassList.get(0)).get("totalCount");
            }
            return totalCount;
        }
        catch (Exception e) {
            this.logger.error("\u7269\u6599\u5206\u7c7b\u6863\u6848\u7ba1\u7406\u6743\u79fb\u4ea4\u67e5\u8be2\u603b\u6570\u62a5\u9519" + e.getMessage(), (Throwable)e);
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801506);
        }
    }

    private QuerySchema buildCustCategoryQuerySchema(TransfermcTaskDTO transfermcTaskDTO) throws Exception {
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id,code,name,isEnd");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"orgId").eq((Object)transfermcTaskDTO.getSourceOrgId())}));
        DataScopeDTO dataScopeDTO = transfermcTaskDTO.getDataScopeDTO();
        if (!dataScopeDTO.isAll()) {
            List ruleItemDTOList = dataScopeDTO.getRuleItems();
            ArrayList<QueryCondition> conditionExpressions = new ArrayList<QueryCondition>();
            if (!CollectionUtils.isEmpty((Collection)ruleItemDTOList)) {
                for (RuleItemDTO ruleItemDTO : ruleItemDTOList) {
                    if (!"aa_custcategory_list".equals(ruleItemDTO.getCode()) || CollectionUtils.isEmpty((Collection)ruleItemDTO.getValues())) continue;
                    ArrayList<Long> idList = new ArrayList<Long>();
                    for (String id : ruleItemDTO.getValues()) {
                        idList.add(Long.valueOf(id));
                    }
                    conditionExpressions.add(QueryCondition.name((String)"firstLevel").in(idList));
                }
                if (conditionExpressions.size() > 0) {
                    ConditionExpression[] ces = new ConditionExpression[conditionExpressions.size()];
                    QueryConditionGroup condition = new QueryConditionGroup();
                    if ("and".equals(dataScopeDTO.getOperatorType())) {
                        condition = QueryConditionGroup.and((ConditionExpression[])conditionExpressions.toArray(ces));
                    } else if ("or".equals(dataScopeDTO.getOperatorType())) {
                        condition = QueryConditionGroup.or((ConditionExpression[])conditionExpressions.toArray(ces));
                    }
                    querySchema.appendQueryCondition(new ConditionExpression[]{condition});
                }
            }
        }
        return querySchema;
    }

    private QuerySchema buildManagementClassQuerySchema(TransfermcTaskDTO transfermcTaskDTO) throws Exception {
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id,code,name,isEnd");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"orgId").eq((Object)transfermcTaskDTO.getSourceOrgId())}));
        DataScopeDTO dataScopeDTO = transfermcTaskDTO.getDataScopeDTO();
        if (!dataScopeDTO.isAll()) {
            List ruleItemDTOList = dataScopeDTO.getRuleItems();
            ArrayList<QueryCondition> conditionExpressions = new ArrayList<QueryCondition>();
            if (!CollectionUtils.isEmpty((Collection)ruleItemDTOList)) {
                for (RuleItemDTO ruleItemDTO : ruleItemDTOList) {
                    if (!"pc_managementclasslist".equals(ruleItemDTO.getCode()) || CollectionUtils.isEmpty((Collection)ruleItemDTO.getValues())) continue;
                    ArrayList<Long> idList = new ArrayList<Long>();
                    for (String id : ruleItemDTO.getValues()) {
                        idList.add(Long.valueOf(id));
                    }
                    conditionExpressions.add(QueryCondition.name((String)"firstLevel").in(idList));
                }
                if (conditionExpressions.size() > 0) {
                    ConditionExpression[] ces = new ConditionExpression[conditionExpressions.size()];
                    QueryConditionGroup condition = new QueryConditionGroup();
                    if ("and".equals(dataScopeDTO.getOperatorType())) {
                        condition = QueryConditionGroup.and((ConditionExpression[])conditionExpressions.toArray(ces));
                    } else if ("or".equals(dataScopeDTO.getOperatorType())) {
                        condition = QueryConditionGroup.or((ConditionExpression[])conditionExpressions.toArray(ces));
                    }
                    querySchema.appendQueryCondition(new ConditionExpression[]{condition});
                }
            }
        }
        return querySchema;
    }

    private List<ManagementClass> selectManagementClass(TransfermcTaskDTO transfermcTaskDTO, int pageSize) {
        try {
            QuerySchema querySchema = this.buildManagementClassQuerySchema(transfermcTaskDTO);
            querySchema.addOrderBy("id");
            QueryPager queryPager = new QueryPager();
            queryPager.setPageIndex(1);
            queryPager.setPageSize(pageSize);
            querySchema.pager(queryPager);
            return MetaDaoHelper.queryObject((String)"pc.cls.ManagementClass", (QuerySchema)querySchema, null);
        }
        catch (Exception e) {
            this.logger.error("\u7269\u6599\u5206\u7c7b\u6863\u6848\u7ba1\u7406\u6743\u79fb\u4ea4\u67e5\u8be2\u62a5\u9519" + e.getMessage(), (Throwable)e);
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801507);
        }
    }

    private void setManagementClass(ManagementClass originalManagementClass, String targetOrgId, String sourceOrgId) throws Exception {
        ManagementClass managementClass = new ManagementClass();
        managementClass.setId(originalManagementClass.getId());
        managementClass.setOrgId(targetOrgId);
        managementClass.setEntityStatus(EntityStatus.Update);
        QueryConditionGroup managementClassRangeGroupCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"clsId").eq(managementClass.getId()), QueryCondition.name((String)"orgGroupType").eq((Object)"0")});
        QuerySchema managementClassRangeGroupSchema = QuerySchema.create().addSelect("id,orgGroupId,clsId,orgGroupType").addCondition((ConditionExpression)managementClassRangeGroupCondition);
        List originalManagementClassApplyRangeGroupList = MetaDaoHelper.query((String)"pc.cls.ManagementClassApplyRangeGroup", (QuerySchema)managementClassRangeGroupSchema);
        ManagementClassApplyRangeGroup managementClassApplyRangeGroup = (ManagementClassApplyRangeGroup)JSON.parseObject((String)JSON.toJSONString(originalManagementClassApplyRangeGroupList.get(0)), ManagementClassApplyRangeGroup.class);
        QueryConditionGroup originalManagementClassApplyRangeGroupDetailCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"groupId").eq((Object)managementClassApplyRangeGroup.getOrgGroupId())});
        QuerySchema originalManagementClassApplyRangeGroupDetailSchema = QuerySchema.create().addSelect("id,orgId,groupId,orgType").addCondition((ConditionExpression)originalManagementClassApplyRangeGroupDetailCondition);
        List originalPubOrgGroupDetailMapList = MetaDaoHelper.query((String)"pc.pub_org_group.PubOrgGroupDetail", (QuerySchema)originalManagementClassApplyRangeGroupDetailSchema);
        ArrayList<PubOrgGroupDetail> newPubOrgGroupDetailMapList = new ArrayList<PubOrgGroupDetail>();
        HashSet<String> orgSet = new HashSet<String>();
        for (Map originalPubOrgGroupDetailMap : originalPubOrgGroupDetailMapList) {
            PubOrgGroupDetail pubOrgGroupDetail = new PubOrgGroupDetail();
            pubOrgGroupDetail.setOrgId(originalPubOrgGroupDetailMap.get("orgId") == null ? null : originalPubOrgGroupDetailMap.get("orgId").toString());
            pubOrgGroupDetail.setGroupId(originalPubOrgGroupDetailMap.get("groupId") == null ? null : originalPubOrgGroupDetailMap.get("groupId").toString());
            pubOrgGroupDetail.setOrgType(originalPubOrgGroupDetailMap.get("orgType") == null ? null : originalPubOrgGroupDetailMap.get("orgType").toString());
            orgSet.add(pubOrgGroupDetail.getOrgId());
            newPubOrgGroupDetailMapList.add(pubOrgGroupDetail);
        }
        if (!orgSet.contains(targetOrgId)) {
            PubOrgGroupDetail pubOrgGroupDetail = new PubOrgGroupDetail();
            pubOrgGroupDetail.setOrgId(targetOrgId);
            pubOrgGroupDetail.setOrgGroupType("0");
            pubOrgGroupDetail.setOrgType("1");
            newPubOrgGroupDetailMapList.add(pubOrgGroupDetail);
            PubOrgGroup pubOrgGroup = new PubOrgGroup();
            pubOrgGroup.setOrgGroupType("0");
            pubOrgGroup.setOrgGroupDetailList(newPubOrgGroupDetailMapList);
            String groupId = this.groupService.saveGroup((Map)pubOrgGroup, "pc.pub_org_group.PubOrgGroup");
            managementClassApplyRangeGroup.setOrgGroupId(groupId);
            managementClassApplyRangeGroup.setEntityStatus(EntityStatus.Update);
            ArrayList<ManagementClassApplyRangeGroup> managementClassApplyRangeGroupList = new ArrayList<ManagementClassApplyRangeGroup>();
            managementClassApplyRangeGroupList.add(managementClassApplyRangeGroup);
            managementClass.set("managementClassApplyRanges", managementClassApplyRangeGroupList);
            managementClass.setOrgGroupId(groupId);
        }
        MetaDaoHelper.update((String)"pc.cls.ManagementClass", (BizObject)managementClass);
    }

    private List<CustCategory> selectCustCategory(TransfermcTaskDTO transfermcTaskDTO, int pageSize) {
        try {
            QuerySchema querySchema = this.buildCustCategoryQuerySchema(transfermcTaskDTO);
            querySchema.addOrderBy("id");
            QueryPager queryPager = new QueryPager();
            queryPager.setPageIndex(1);
            queryPager.setPageSize(pageSize);
            querySchema.pager(queryPager);
            return MetaDaoHelper.queryObject((String)"aa.custcategory.CustCategory", (QuerySchema)querySchema, null);
        }
        catch (Exception e) {
            this.logger.error("\u5ba2\u6237\u5206\u7c7b\u6863\u6848\u7ba1\u7406\u6743\u79fb\u4ea4\u67e5\u8be2\u62a5\u9519" + e.getMessage(), (Throwable)e);
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801508);
        }
    }

    private void setCustCategory(CustCategory originalCustCategory, String targetOrgId, String sourceOrgId) throws Exception {
        CustCategory custCategory = new CustCategory();
        ArrayList<CustCategoryApplyRange> custCategoryApplyRangeList = new ArrayList<CustCategoryApplyRange>();
        custCategory.setId(originalCustCategory.getId());
        custCategory.setOrgId(targetOrgId);
        custCategory.setEntityStatus(EntityStatus.Update);
        List targetApplyRangeList = this.custCategoryDao.getCustCategoryApplyRangeByOrgId(targetOrgId, (Long)originalCustCategory.getId());
        if (!CollectionUtils.isEmpty((Collection)targetApplyRangeList)) {
            CustCategoryApplyRange originalDataBaseSourceCustCategoryApplyRange = (CustCategoryApplyRange)targetApplyRangeList.get(0);
            originalDataBaseSourceCustCategoryApplyRange.setIsCreator(Boolean.valueOf(true));
            originalDataBaseSourceCustCategoryApplyRange.setIsApplied(Boolean.valueOf(false));
            originalDataBaseSourceCustCategoryApplyRange.setEntityStatus(EntityStatus.Update);
            custCategoryApplyRangeList.add(originalDataBaseSourceCustCategoryApplyRange);
        } else {
            CustCategoryApplyRange custCategoryApplyRange = TreeApplyRangeUtils.getInstance().getCustCatetoryApplyRange((Long)originalCustCategory.getId(), targetOrgId, originalCustCategory.getIsEnd(), true);
            custCategoryApplyRangeList.add(custCategoryApplyRange);
        }
        List originalDataBaseSourceCustCategoryApplyRangeList = this.custCategoryDao.getCustCategoryApplyRangeByOrgId(sourceOrgId, (Long)originalCustCategory.getId());
        if (!CollectionUtils.isEmpty((Collection)originalDataBaseSourceCustCategoryApplyRangeList)) {
            CustCategoryApplyRange originalDataBaseSourceCustCategoryApplyRange = (CustCategoryApplyRange)originalDataBaseSourceCustCategoryApplyRangeList.get(0);
            originalDataBaseSourceCustCategoryApplyRange.setIsCreator(Boolean.valueOf(false));
            originalDataBaseSourceCustCategoryApplyRange.setIsApplied(Boolean.valueOf(true));
            originalDataBaseSourceCustCategoryApplyRange.setEntityStatus(EntityStatus.Update);
            custCategoryApplyRangeList.add(originalDataBaseSourceCustCategoryApplyRange);
        }
        custCategory.setCustCategoryApplyRanges(custCategoryApplyRangeList);
        MetaDaoHelper.update((String)"aa.custcategory.CustCategory", (BizObject)custCategory);
    }
}


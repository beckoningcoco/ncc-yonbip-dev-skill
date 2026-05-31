/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.po.merchant.MerchantPrincipalPO
 *  com.yonyou.iuap.log.cons.BusinessLogMode
 *  com.yonyou.iuap.log.model.BusinessLogObjectBuilder
 *  com.yonyou.iuap.log.rpc.IBusiLogService
 *  com.yonyou.iuap.org.dto.ConditionDTO
 *  com.yonyou.iuap.org.dto.OrgUnitDTO
 *  com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.iuap.yms.multitenant.UserExecutors
 *  com.yonyou.ucf.mdd.common.model.ResultList
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.poi.model.ProcessData
 *  com.yonyou.ucf.mdd.ext.util.RedisTool
 *  com.yonyoucloud.upc.aa.merchant.AddressInfoEntity
 *  com.yonyoucloud.upc.aa.merchant.AgentFinancial
 *  com.yonyoucloud.upc.aa.merchant.AgentFinancialEntity
 *  com.yonyoucloud.upc.aa.merchant.AgentInvoiceEntity
 *  com.yonyoucloud.upc.aa.merchant.ContactEntity
 *  com.yonyoucloud.upc.aa.merchant.Contacter
 *  com.yonyoucloud.upc.aa.merchant.CustomerAreaEntity
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRange
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail
 *  com.yonyoucloud.upc.aa.merchant.MerchantBusinessLogDTO
 *  com.yonyoucloud.upc.aa.merchant.MerchantChildDeleteDTO
 *  com.yonyoucloud.upc.aa.merchant.Principal
 *  com.yonyoucloud.upc.data.merchant.MerchantGroupDao
 *  com.yonyoucloud.upc.service.IUPCMerchantSyncService
 *  com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil
 *  com.yonyoucloud.upc.utils.MerchantUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.BeanUtils
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.ObjectUtils
 */
package com.yonyoucloud.upc.service.merchant;

import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.po.merchant.MerchantPrincipalPO;
import com.yonyou.iuap.log.cons.BusinessLogMode;
import com.yonyou.iuap.log.model.BusinessLogObjectBuilder;
import com.yonyou.iuap.log.rpc.IBusiLogService;
import com.yonyou.iuap.org.dto.ConditionDTO;
import com.yonyou.iuap.org.dto.OrgUnitDTO;
import com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.iuap.yms.multitenant.UserExecutors;
import com.yonyou.ucf.mdd.common.model.ResultList;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.poi.model.ProcessData;
import com.yonyou.ucf.mdd.ext.util.RedisTool;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.upc.aa.merchant.AddressInfoEntity;
import com.yonyoucloud.upc.aa.merchant.AgentFinancial;
import com.yonyoucloud.upc.aa.merchant.AgentFinancialEntity;
import com.yonyoucloud.upc.aa.merchant.AgentInvoiceEntity;
import com.yonyoucloud.upc.aa.merchant.ContactEntity;
import com.yonyoucloud.upc.aa.merchant.Contacter;
import com.yonyoucloud.upc.aa.merchant.CustomerAreaEntity;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRange;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail;
import com.yonyoucloud.upc.aa.merchant.MerchantBusinessLogDTO;
import com.yonyoucloud.upc.aa.merchant.MerchantChildDeleteDTO;
import com.yonyoucloud.upc.aa.merchant.Principal;
import com.yonyoucloud.upc.billrule.merchant.MerchantContacterSyncCRMRule;
import com.yonyoucloud.upc.coredoc.pub.CheckDomainDeleteService;
import com.yonyoucloud.upc.data.merchant.MerchantGroupDao;
import com.yonyoucloud.upc.service.IUPCMerchantSyncService;
import com.yonyoucloud.upc.service.UpcCommonFieldCheckService;
import com.yonyoucloud.upc.service.merchant.AddressInfoEntityService;
import com.yonyoucloud.upc.service.merchant.AgentFinancialEntityService;
import com.yonyoucloud.upc.service.merchant.AgentInvoiceEntityService;
import com.yonyoucloud.upc.service.merchant.ContactEntityService;
import com.yonyoucloud.upc.service.merchant.CustomerAreaEntityService;
import com.yonyoucloud.upc.service.merchant.PrincipalEntityService;
import com.yonyoucloud.upc.service.merchantapplyrangegroup.MerchantGroupService;
import com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil;
import com.yonyoucloud.upc.utils.MerchantUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

@Service
public class MerchantDeleteService {
    private static final Logger log = LoggerFactory.getLogger(MerchantDeleteService.class);
    @Autowired
    @Qualifier(value="ymsLongTaskExecutorService")
    private ExecutorService ymsLongTaskExecutorService;
    @Autowired
    private YMSParamConfig ymsParamConfig;
    @Autowired
    private AddressInfoEntityService addressInfoEntityService;
    @Autowired
    private ContactEntityService contactEntityService;
    @Autowired
    private AgentFinancialEntityService agentFinancialEntityService;
    @Autowired
    private AgentInvoiceEntityService agentInvoiceEntityService;
    @Autowired
    private CustomerAreaEntityService customerAreaEntityService;
    @Autowired
    private PrincipalEntityService principalEntityService;
    @Autowired
    private MerchantGroupDao merchantGroupDao;
    @Autowired
    private IUPCMerchantSyncService iupcMerchantSyncService;
    @Autowired
    private UpcCommonFieldCheckService upcCommonFieldCheckService;
    @Autowired
    private CheckDomainDeleteService checkDomainDeleteService;
    @Autowired
    private MerchantGroupService merchantGroupService;
    @Autowired
    private IOrgUnitQueryService iOrgUnitQueryService;
    @Autowired
    private IBusiLogService busiLogService;
    @Autowired
    private IUPCBillService billService;
    @Autowired
    private PubOptionDataQueryUtil pubOptionDataQueryUtil;
    @Autowired
    private MerchantContacterSyncCRMRule merchantContacterSyncCRMRule;

    public ResultList deleteChildAsyncKey(MerchantChildDeleteDTO merchantChildDeleteDTO) {
        String requestId = UUID.randomUUID().toString();
        String asyncKey = merchantChildDeleteDTO.getBillNum() + AppContext.getCurrentUser().getYTenantId() + requestId;
        int expireTime = 600;
        try {
            String expireTimeConfig = this.ymsParamConfig.getMddExportProcessExpireTime();
            if (null != expireTimeConfig) {
                expireTime = Integer.parseInt(expireTimeConfig);
            }
        }
        catch (Exception var8) {
            log.error("\u5b50\u8868\u5220\u9664\u529f\u80fd\u83b7\u53d6\u7f13\u5b58\u8d85\u65f6\u65f6\u95f4\u5f02\u5e38\uff0c\u8d70\u9ed8\u8ba4\u914d\u7f6e600\u79d2");
        }
        merchantChildDeleteDTO.setAsyncKey(asyncKey);
        merchantChildDeleteDTO.setExpireTime(expireTime);
        ProcessData.builder((int)1, (int)200, null, null).percentage("0").build(merchantChildDeleteDTO.getAsyncKey(), Integer.valueOf(merchantChildDeleteDTO.getExpireTime()));
        UserExecutors.executeInDetachedThread((ExecutorService)this.ymsLongTaskExecutorService, () -> {
            try {
                this.deleteChild(merchantChildDeleteDTO);
            }
            catch (Exception e) {
                ResultList resultList = new ResultList();
                resultList.addFailInfo((Object)e.getMessage());
                resultList.addErrorMessage(e.getMessage());
                resultList.setFailCount(0);
                resultList.setCount(0);
                ProcessData.builder((int)1, (int)200, (Object)resultList, (String)InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_21A830A205380091", (String)"\u5220\u9664\u5931\u8d25")).percentage("100").successCount(0).failCount(1).build(merchantChildDeleteDTO.getAsyncKey(), Integer.valueOf(merchantChildDeleteDTO.getExpireTime()));
            }
        });
        return this.getResultList(merchantChildDeleteDTO.getAsyncKey());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void deleteChild(MerchantChildDeleteDTO merchantChildDeleteDTO) {
        if (CollectionUtils.isEmpty((Collection)merchantChildDeleteDTO.getIds())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800515);
        }
        String requestId = UUID.randomUUID().toString();
        String deleteChildLockKey = "deleteChild" + AppContext.getCurrentUser().getYTenantId();
        if (("aa_merchant_sale_area_delete".equals(merchantChildDeleteDTO.getBillNum()) || "aa_merchant_principal_delete".equals(merchantChildDeleteDTO.getBillNum())) && !RedisTool.tryGetLock((String)deleteChildLockKey, (String)requestId, (int)3600)) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_DELETE_CHILD_LOCK_KEY);
        }
        List ids = merchantChildDeleteDTO.getIds();
        int totalCount = ids.size();
        int successCount = 0;
        int failCount = 0;
        ResultList resultList = new ResultList();
        for (String id : ids) {
            try {
                if ("aa_merchant_address_delete".equals(merchantChildDeleteDTO.getBillNum())) {
                    this.deleteAddressInfo(Long.parseLong(id), merchantChildDeleteDTO.getServiceCode());
                } else if ("aa_merchant_contact_delete".equals(merchantChildDeleteDTO.getBillNum())) {
                    this.deleteContact(Long.parseLong(id), merchantChildDeleteDTO.getServiceCode());
                } else if ("aa_merchant_financial_delete".equals(merchantChildDeleteDTO.getBillNum())) {
                    this.deleteAgentFinancial(Long.parseLong(id), merchantChildDeleteDTO.getServiceCode());
                } else if ("aa_merchant_invoice_delete".equals(merchantChildDeleteDTO.getBillNum())) {
                    this.deleteAgentInvoice(Long.parseLong(id), merchantChildDeleteDTO.getServiceCode());
                } else if ("aa_merchant_sale_area_delete".equals(merchantChildDeleteDTO.getBillNum())) {
                    this.deleteCustomerArea(Long.parseLong(id), merchantChildDeleteDTO.getServiceCode());
                } else if ("aa_merchant_principal_delete".equals(merchantChildDeleteDTO.getBillNum())) {
                    this.deletePrincipal(Long.parseLong(id), merchantChildDeleteDTO.getServiceCode());
                }
                ++successCount;
            }
            catch (Exception e) {
                log.error("deleteChild_{}:{}", new Object[]{merchantChildDeleteDTO.getBillNum(), e.getMessage(), e});
                ++failCount;
                resultList.addInfo((Object)e.getMessage());
                resultList.addErrorMessage(e.getMessage());
                resultList.addFailInfo((Object)e.getMessage());
            }
            finally {
                String percentage = String.valueOf((successCount + failCount) * 100 / totalCount);
                ProcessData.builder((int)1, (int)200, null, null).percentage(percentage).build(merchantChildDeleteDTO.getAsyncKey(), Integer.valueOf(merchantChildDeleteDTO.getExpireTime()));
            }
        }
        if ("aa_merchant_sale_area_delete".equals(merchantChildDeleteDTO.getBillNum()) || "aa_merchant_principal_delete".equals(merchantChildDeleteDTO.getBillNum())) {
            RedisTool.releaseLock((String)deleteChildLockKey, (String)requestId);
        }
        resultList.setCount(failCount + successCount);
        resultList.setSucessCount(successCount);
        resultList.setFailCount(failCount);
        ProcessData.builder((int)1, (int)200, (Object)resultList, (String)InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_21A830A205380090", (String)"\u5220\u9664\u5b8c\u6210")).percentage("100").successCount(successCount).failCount(failCount).build(merchantChildDeleteDTO.getAsyncKey(), Integer.valueOf(merchantChildDeleteDTO.getExpireTime()));
    }

    public ResultList getResultList(String key) {
        ResultList resultList = new ResultList();
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("url", "/bill/status/getBatchDoProcess");
        map.put("asyncKey", key);
        resultList.addInfo(map);
        return resultList;
    }

    public void deleteAddressInfo(Long id, String serviceCode) throws Exception {
        AddressInfoEntity addressInfoEntity = this.addressInfoEntityService.queryAddressEntityById(id);
        if (!ObjectUtils.isEmpty((Object)addressInfoEntity)) {
            List<AddressInfoEntity> addressInfoEntityList;
            Merchant merchant = this.merchantGroupDao.getMerchantById(addressInfoEntity.getMerchantId());
            if (addressInfoEntity.getIsDefault().booleanValue() && !CollectionUtils.isEmpty(addressInfoEntityList = this.addressInfoEntityService.queryAddressEntityByNoId(addressInfoEntity.getMerchantId(), addressInfoEntity.getId()))) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_ADDRESS_DELETE_DEFAULT, new Object[]{merchant.getName()});
            }
            this.addressInfoEntityService.deleteAddressEntity(addressInfoEntity);
            MerchantBusinessLogDTO merchantBusinessLogDTO = MerchantUtils.builderMerchantBusinessLogDTO((String)serviceCode, (Long)((Long)merchant.getId()), (String)merchant.getCode(), (String)merchant.getName(), null, (String)"UID:P_COREDOC-BE_1D933A5805B00009", (String)"\u5ba2\u6237\u6863\u6848\u5217\u8868", (String)"UID:P_COREDOC-BE_1D933B7C05080008", (String)"\u5730\u5740\u4fe1\u606f\u5220\u9664");
            this.sendDeleteChildLog(merchantBusinessLogDTO);
        }
    }

    public void deleteContact(Long id, String serviceCode) throws Exception {
        ContactEntity contactEntity = this.contactEntityService.queryContactEntityById(id);
        if (!ObjectUtils.isEmpty((Object)contactEntity)) {
            List<ContactEntity> contactEntityList;
            Merchant merchant = this.merchantGroupDao.getMerchantById(contactEntity.getMerchantId());
            if (contactEntity.getIsDefault().booleanValue() && !CollectionUtils.isEmpty(contactEntityList = this.contactEntityService.queryContactEntityByNoId(contactEntity.getMerchantId(), contactEntity.getId()))) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_CONTACT_DELETE_DEFAULT, new Object[]{merchant.getName()});
            }
            Contacter contactor = this.convertContact(contactEntity);
            ArrayList<Contacter> contactorList = new ArrayList<Contacter>();
            contactorList.add(contactor);
            this.merchantContacterSyncCRMRule.synchronizeContactorToCRM(contactorList, merchant);
            this.contactEntityService.deleteContactEntity(contactEntity);
            MerchantBusinessLogDTO merchantBusinessLogDTO = MerchantUtils.builderMerchantBusinessLogDTO((String)serviceCode, (Long)((Long)merchant.getId()), (String)merchant.getCode(), (String)merchant.getName(), null, (String)"UID:P_COREDOC-BE_1D933A5805B00009", (String)"\u5ba2\u6237\u6863\u6848\u5217\u8868", (String)"UID:P_COREDOC-BE_1D933D8605B00006", (String)"\u8054\u7cfb\u4eba\u4fe1\u606f\u5220\u9664");
            this.sendDeleteChildLog(merchantBusinessLogDTO);
        }
    }

    private Contacter convertContact(ContactEntity contactEntity) {
        Contacter contactor = new Contacter();
        BeanUtils.copyProperties((Object)contactEntity, (Object)contactor);
        contactor.setEntityStatus(EntityStatus.Delete);
        contactor.setFullName(contactEntity.getFullName());
        return contactor;
    }

    public void deleteAgentFinancial(Long id, String serviceCode) throws Exception {
        AgentFinancialEntity agentFinancialEntity = this.agentFinancialEntityService.queryAgentFinancialEntityById(id);
        if (!ObjectUtils.isEmpty((Object)agentFinancialEntity)) {
            List<AgentFinancialEntity> agentFinancialEntityList;
            Merchant merchant = this.merchantGroupDao.getMerchantById(agentFinancialEntity.getMerchantId());
            if (agentFinancialEntity.getIsDefault().booleanValue() && !CollectionUtils.isEmpty(agentFinancialEntityList = this.agentFinancialEntityService.queryAgentFinancialEntityByNoId(agentFinancialEntity.getMerchantId(), agentFinancialEntity.getId()))) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_AGENT_FINANCIAL_DELETE_DEFAULT, new Object[]{merchant.getName()});
            }
            ArrayList<Long> agentFinancialIdList = new ArrayList<Long>();
            agentFinancialIdList.add(agentFinancialEntity.getId());
            ArrayList<AgentFinancial> agentFinancialList = new ArrayList<AgentFinancial>();
            AgentFinancial agentFinancial = new AgentFinancial();
            agentFinancial.setEntityStatus(EntityStatus.Delete);
            agentFinancial.setId((Object)agentFinancialEntity.getId());
            agentFinancialList.add(agentFinancial);
            merchant.setMerchantAgentFinancialInfos(agentFinancialList);
            merchant.setEntityStatus(EntityStatus.Unchanged);
            this.upcCommonFieldCheckService.checkMerchantBank((Long)merchant.getId(), agentFinancialIdList);
            this.checkDomainDeleteService.checkDomainDeleteDTO("aa.merchant.AgentFinancial", "aa_merchant", (BizObject)merchant);
            this.agentFinancialEntityService.deleteAgentFinancialEntity(agentFinancialEntity);
            MerchantBusinessLogDTO merchantBusinessLogDTO = MerchantUtils.builderMerchantBusinessLogDTO((String)serviceCode, (Long)((Long)merchant.getId()), (String)merchant.getCode(), (String)merchant.getName(), null, (String)"UID:P_COREDOC-BE_1D933A5805B00009", (String)"\u5ba2\u6237\u6863\u6848\u5217\u8868", (String)"UID:P_COREDOC-BE_1D933FAC05B00003", (String)"\u94f6\u884c\u4fe1\u606f\u5220\u9664");
            this.sendDeleteChildLog(merchantBusinessLogDTO);
        }
    }

    public void deleteAgentInvoice(Long id, String serviceCode) throws Exception {
        AgentInvoiceEntity agentInvoiceEntity = this.agentInvoiceEntityService.queryAgentInvoiceEntityById(id);
        if (!ObjectUtils.isEmpty((Object)agentInvoiceEntity)) {
            List<AgentInvoiceEntity> agentInvoiceEntityList;
            Merchant merchant = this.merchantGroupDao.getMerchantById(agentInvoiceEntity.getMerchantId());
            if (agentInvoiceEntity.getIsDefault().booleanValue() && !CollectionUtils.isEmpty(agentInvoiceEntityList = this.agentInvoiceEntityService.queryAgentInvoiceEntityByNoId(agentInvoiceEntity.getMerchantId(), agentInvoiceEntity.getId()))) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_AGENT_INVOICE_DELETE_DEFAULT, new Object[]{merchant.getName()});
            }
            this.agentInvoiceEntityService.deleteAgentInvoiceEntity(agentInvoiceEntity);
            MerchantBusinessLogDTO merchantBusinessLogDTO = MerchantUtils.builderMerchantBusinessLogDTO((String)serviceCode, (Long)((Long)merchant.getId()), (String)merchant.getCode(), (String)merchant.getName(), null, (String)"UID:P_COREDOC-BE_1D933A5805B00009", (String)"\u5ba2\u6237\u6863\u6848\u5217\u8868", (String)"UID:P_COREDOC-BE_1D93401005B00008", (String)"\u53d1\u7968\u4fe1\u606f\u5220\u9664");
            this.sendDeleteChildLog(merchantBusinessLogDTO);
        }
    }

    public void deleteCustomerArea(Long id, String serviceCode) throws Exception {
        CustomerAreaEntity customerAreaEntity = this.customerAreaEntityService.queryCustomerAreaEntityById(id);
        if (!ObjectUtils.isEmpty((Object)customerAreaEntity)) {
            Merchant merchant = this.merchantGroupDao.getMerchantById(customerAreaEntity.getMerchantId());
            if (customerAreaEntity.getIsDefault().booleanValue()) {
                List<CustomerAreaEntity> customerAreaEntityList = this.customerAreaEntityService.queryCustomerAreaEntityByNoId(customerAreaEntity.getMerchantId(), customerAreaEntity.getMerchantApplyRangeId(), customerAreaEntity.getId());
                if (!CollectionUtils.isEmpty(customerAreaEntityList)) {
                    String orgIdName = customerAreaEntity.getMerchantApplyRangeId().toString();
                    List<MerchantApplyRange> merchantApplyRangeInDbList = this.merchantGroupService.getMerchantApplyRangeById(customerAreaEntity.getMerchantApplyRangeId(), customerAreaEntity.getMerchantId());
                    if (!CollectionUtils.isEmpty(merchantApplyRangeInDbList)) {
                        ArrayList<String> idList = new ArrayList<String>();
                        idList.add(merchantApplyRangeInDbList.get(0).getOrgId());
                        List orgUnitList = this.iOrgUnitQueryService.getByCondition(AppContext.getYhtTenantId().toString(), ConditionDTO.newOrgCondition().andIdIn(idList).withEnabled());
                        if (!CollectionUtils.isEmpty((Collection)orgUnitList)) {
                            orgIdName = ((OrgUnitDTO)orgUnitList.get(0)).toMultiLang().getName().toString();
                        }
                    }
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_CUSTOMER_AREA_DELETE_DEFAULT, new Object[]{merchant.getName(), orgIdName});
                }
                if (!this.pubOptionDataQueryUtil.isCloseMerchantModelDoubleWrite()) {
                    MerchantApplyRangeDetail merchantApplyRangeDetail = new MerchantApplyRangeDetail();
                    merchantApplyRangeDetail.setMerchantApplyRangeId(customerAreaEntity.getMerchantApplyRangeId());
                    merchantApplyRangeDetail.setCustomerArea(null);
                    merchantApplyRangeDetail.setEntityStatus(EntityStatus.Update);
                    MetaDaoHelper.update((String)"aa.merchant.MerchantApplyRangeDetail", (BizObject)merchantApplyRangeDetail);
                }
            }
            MerchantApplyRange merchantApplyRange = new MerchantApplyRange();
            merchantApplyRange.setId((Object)customerAreaEntity.getMerchantApplyRangeId());
            merchantApplyRange.setIsApplied(Boolean.valueOf(true));
            merchantApplyRange.setEntityStatus(EntityStatus.Update);
            this.merchantGroupService.setMerchantApplyRangeGroup(merchantApplyRange, customerAreaEntity.getMerchantApplyRangeId(), customerAreaEntity.getMerchantId());
            MetaDaoHelper.update((String)"aa.merchant.MerchantApplyRange", (BizObject)merchantApplyRange);
            this.customerAreaEntityService.deleteCustomerAreaEntity(customerAreaEntity);
            MerchantBusinessLogDTO merchantBusinessLogDTO = MerchantUtils.builderMerchantBusinessLogDTO((String)serviceCode, (Long)((Long)merchant.getId()), (String)merchant.getCode(), (String)merchant.getName(), (Long)customerAreaEntity.getMerchantApplyRangeId(), (String)"UID:P_COREDOC-BE_1D933A5805B00009", (String)"\u5ba2\u6237\u6863\u6848\u5217\u8868", (String)"UID:P_COREDOC-BE_1D93407E05080001", (String)"\u9500\u552e\u533a\u57df\u5220\u9664");
            this.sendDeleteChildLog(merchantBusinessLogDTO);
        }
    }

    public void deletePrincipal(Long id, String serviceCode) throws Exception {
        MerchantPrincipalPO principalEntity = this.principalEntityService.queryPrincipalEntityById(id);
        if (!ObjectUtils.isEmpty((Object)principalEntity)) {
            Merchant merchant = this.merchantGroupDao.getMerchantById(principalEntity.getMerchantId());
            if (principalEntity.getIsDefault().booleanValue()) {
                List<MerchantPrincipalPO> principalEntityList = this.principalEntityService.queryPrincipalEntityByNoId(principalEntity.getMerchantId(), principalEntity.getMerchantApplyRangeId(), principalEntity.getId());
                if (!CollectionUtils.isEmpty(principalEntityList)) {
                    String orgIdName = principalEntity.getMerchantApplyRangeId().toString();
                    List<MerchantApplyRange> merchantApplyRangeInDbList = this.merchantGroupService.getMerchantApplyRangeById(principalEntity.getMerchantApplyRangeId(), principalEntity.getMerchantId());
                    if (!CollectionUtils.isEmpty(merchantApplyRangeInDbList)) {
                        ArrayList<String> idList = new ArrayList<String>();
                        idList.add(merchantApplyRangeInDbList.get(0).getOrgId());
                        List orgUnitList = this.iOrgUnitQueryService.getByCondition(AppContext.getYhtTenantId().toString(), ConditionDTO.newOrgCondition().andIdIn(idList).withEnabled());
                        if (!CollectionUtils.isEmpty((Collection)orgUnitList)) {
                            orgIdName = ((OrgUnitDTO)orgUnitList.get(0)).toMultiLang().getName().toString();
                        }
                    }
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_PRINCIPAL_DELETE_DEFAULT, new Object[]{merchant.getName(), orgIdName});
                }
                if (!this.pubOptionDataQueryUtil.isCloseMerchantModelDoubleWrite()) {
                    MerchantApplyRangeDetail merchantApplyRangeDetail = new MerchantApplyRangeDetail();
                    merchantApplyRangeDetail.setMerchantApplyRangeId(principalEntity.getMerchantApplyRangeId());
                    merchantApplyRangeDetail.setProfessSalesman(null);
                    merchantApplyRangeDetail.setSpecialManagementDep(null);
                    merchantApplyRangeDetail.setEntityStatus(EntityStatus.Update);
                    MetaDaoHelper.update((String)"aa.merchant.MerchantApplyRangeDetail", (BizObject)merchantApplyRangeDetail);
                }
            }
            MerchantApplyRange merchantApplyRange = new MerchantApplyRange();
            merchantApplyRange.setId((Object)principalEntity.getMerchantApplyRangeId());
            merchantApplyRange.setIsApplied(Boolean.valueOf(true));
            merchantApplyRange.setEntityStatus(EntityStatus.Update);
            this.merchantGroupService.setMerchantApplyRangeGroup(merchantApplyRange, principalEntity.getMerchantApplyRangeId(), principalEntity.getMerchantId());
            MetaDaoHelper.update((String)"aa.merchant.MerchantApplyRange", (BizObject)merchantApplyRange);
            Principal principal = this.convertPrincipal(principalEntity);
            ArrayList<Principal> principalList = new ArrayList<Principal>();
            principalList.add(principal);
            this.merchantContacterSyncCRMRule.synchronizePrincipalToCRM(principalList, merchant);
            this.principalEntityService.deletePrincipalEntity(principalEntity);
            MerchantBusinessLogDTO merchantBusinessLogDTO = MerchantUtils.builderMerchantBusinessLogDTO((String)serviceCode, (Long)((Long)merchant.getId()), (String)merchant.getCode(), (String)merchant.getName(), (Long)principalEntity.getMerchantApplyRangeId(), (String)"UID:P_COREDOC-BE_1D933A5805B00009", (String)"\u5ba2\u6237\u6863\u6848\u5217\u8868", (String)"UID:P_COREDOC-BE_1D93411005080009", (String)"\u8d1f\u8d23\u4eba\u5220\u9664");
            this.sendDeleteChildLog(merchantBusinessLogDTO);
        }
    }

    private Principal convertPrincipal(MerchantPrincipalPO principalEntity) {
        Principal principal = new Principal();
        BeanUtils.copyProperties((Object)principalEntity, (Object)principal);
        principal.setEntityStatus(EntityStatus.Delete);
        return principal;
    }

    public void sendDeleteChildLog(MerchantBusinessLogDTO merchantBusinessLogDTO) {
        try {
            BillDataDto billDataDtoMerchantLog = new BillDataDto("aa_merchant", merchantBusinessLogDTO.getId().toString());
            if (merchantBusinessLogDTO.getMerchantApplyRangeId() != null) {
                HashMap<String, Long> params = new HashMap<String, Long>(3);
                params.put("@merchantApplyRangeId", merchantBusinessLogDTO.getMerchantApplyRangeId());
                billDataDtoMerchantLog.setMapCondition(params);
            }
            Map merchantDetail = this.billService.detail(billDataDtoMerchantLog);
            BusinessLogObjectBuilder businessLogObjectBuilder = new BusinessLogObjectBuilder();
            businessLogObjectBuilder.uri("aa.merchant.Merchant").busiObjTypeCode("aa_merchant").busiObjTypeName(merchantBusinessLogDTO.getBusiObjTypeName()).defaultBusiObjTypeName(merchantBusinessLogDTO.getDefaultBusiObjTypeName()).operationName(merchantBusinessLogDTO.getOperationName()).defaultOperationName(merchantBusinessLogDTO.getDefaultOperationName()).logMode(BusinessLogMode.UI_META).domain("productcenter").serviceCode(merchantBusinessLogDTO.getServiceCode()).newObject((Object)merchantDetail).dataId(merchantBusinessLogDTO.getId().toString()).dataCode(merchantBusinessLogDTO.getCode()).dataName(merchantBusinessLogDTO.getName());
            this.busiLogService.saveBusinessLog(businessLogObjectBuilder.build());
        }
        catch (Exception e) {
            log.error("\u5b50\u8868\u5220\u9664\u4e8b\u4ef6\u53d1\u9001\u4e1a\u52a1\u65e5\u5fd7\u5f02\u5e38:{}", (Object)e.getMessage(), (Object)e);
        }
    }
}


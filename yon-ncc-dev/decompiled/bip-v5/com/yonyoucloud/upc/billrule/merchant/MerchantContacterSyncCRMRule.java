/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.util.IrisDynamicInvokeUtil
 *  com.yonyou.iuap.apdoc.coredoc.dao.merchant.MerchantPrincipalQryDao
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.AppOpenUtil
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.apdoc.coredoc.vo.merchant.MerchantPrincipalVO
 *  com.yonyou.iuap.apdoc.sdk.dto.merchant.MerchantContacterChangeDataDTO
 *  com.yonyou.iuap.apdoc.sdk.dto.merchant.MerchantContacterDataDTO
 *  com.yonyou.iuap.apdoc.sdk.dto.merchant.MerchantPrincipalChangeDataDTO
 *  com.yonyou.iuap.apdoc.sdk.dto.merchant.MerchantPrincipalDataDTO
 *  com.yonyou.iuap.apdoc.sdk.service.merchant.IContacterChangeService
 *  com.yonyou.iuap.apdoc.sdk.service.merchant.IPrincipalChangeService
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.international.MultiLangText
 *  com.yonyou.iuap.refcheck.utils.JsonUtil
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.iuap.upc.dto.ext.UPCEntityStatus
 *  com.yonyoucloud.upc.aa.merchant.Contacter
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRange
 *  com.yonyoucloud.upc.aa.merchant.Principal
 *  com.yonyoucloud.upc.data.merchant.MerchantGroupDao
 *  com.yonyoucloud.upc.utils.MerchantUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.BeanUtils
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.merchant;

import com.yonyou.cloud.util.IrisDynamicInvokeUtil;
import com.yonyou.iuap.apdoc.coredoc.dao.merchant.MerchantPrincipalQryDao;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.AppOpenUtil;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.apdoc.coredoc.vo.merchant.MerchantPrincipalVO;
import com.yonyou.iuap.apdoc.sdk.dto.merchant.MerchantContacterChangeDataDTO;
import com.yonyou.iuap.apdoc.sdk.dto.merchant.MerchantContacterDataDTO;
import com.yonyou.iuap.apdoc.sdk.dto.merchant.MerchantPrincipalChangeDataDTO;
import com.yonyou.iuap.apdoc.sdk.dto.merchant.MerchantPrincipalDataDTO;
import com.yonyou.iuap.apdoc.sdk.service.merchant.IContacterChangeService;
import com.yonyou.iuap.apdoc.sdk.service.merchant.IPrincipalChangeService;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.international.MultiLangText;
import com.yonyou.iuap.refcheck.utils.JsonUtil;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.upc.dto.ext.UPCEntityStatus;
import com.yonyoucloud.upc.aa.merchant.Contacter;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRange;
import com.yonyoucloud.upc.aa.merchant.Principal;
import com.yonyoucloud.upc.data.merchant.MerchantGroupDao;
import com.yonyoucloud.upc.service.utils.ProductUtil;
import com.yonyoucloud.upc.utils.MerchantUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="merchantContacterSyncCRMRule")
public class MerchantContacterSyncCRMRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(MerchantContacterSyncCRMRule.class);
    @Autowired
    MerchantGroupDao merchantGroupDao;
    @Autowired
    MerchantPrincipalQryDao merchantPrincipalQryDao;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List bills = this.getBills(billContext, paramMap);
        try {
            for (BizObject bill : bills) {
                Optional<Principal> optionalPrincipal;
                List principalList;
                Optional<Contacter> contacterHasChange;
                Merchant merchant = (Merchant)bill;
                if (MerchantUtils.isExists((Map)merchant, (String)"srcBill") && "CRM".equals(merchant.get("srcBill"))) continue;
                List contacterList = merchant.merchantContacterInfos();
                if (!CollectionUtils.isEmpty((Collection)contacterList) && (contacterHasChange = contacterList.stream().filter(contacter -> EntityStatus.Unchanged != contacter.getEntityStatus()).findFirst()).isPresent()) {
                    this.synchronizeContactorToCRM(contacterList, merchant);
                }
                if (CollectionUtils.isEmpty((Collection)(principalList = merchant.principals())) || !(optionalPrincipal = principalList.stream().filter(principal -> EntityStatus.Unchanged != principal.getEntityStatus()).findFirst()).isPresent()) continue;
                this.synchronizePrincipalToCRM(principalList, merchant);
            }
        }
        catch (Exception e) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.CRM_CONTACTER_CHANGE_ERROR, new Object[]{e.getMessage()});
        }
        return new RuleExecuteResult();
    }

    public void synchronizePrincipalToCRM(List<Principal> principalList, Merchant merchant) throws Exception {
        if (AppOpenUtil.isOpenCRM()) {
            List<MerchantPrincipalChangeDataDTO> merchantContacterChangeDataDTOList = this.convertToMerchantPrincipalChangeDataDTO(principalList, merchant);
            IPrincipalChangeService principalChangeService = (IPrincipalChangeService)IrisDynamicInvokeUtil.getService((String)"yycrm", (String)"c87e2267-1001-4c70-bb2a-ab41f3b81aa3", null, IPrincipalChangeService.class);
            if (principalChangeService != null) {
                principalChangeService.principalChange(merchantContacterChangeDataDTOList);
            }
        }
    }

    public List<MerchantPrincipalChangeDataDTO> convertToMerchantPrincipalChangeDataDTO(List<Principal> principalList, Merchant merchant) throws Exception {
        ArrayList<MerchantPrincipalChangeDataDTO> principalChangeDataDTOResList = new ArrayList<MerchantPrincipalChangeDataDTO>();
        if (!CollectionUtils.isEmpty(principalList)) {
            for (Principal principal2 : principalList) {
                MerchantPrincipalChangeDataDTO merchantPrincipalChangeDataDTO = this.convertPrincipalToChangeDataDTO(principal2);
                principalChangeDataDTOResList.add(merchantPrincipalChangeDataDTO);
            }
            HashMap applyRangeIdAndOrgIdMap = new HashMap();
            if (merchant != null && merchant.merchantApplyRanges() != null) {
                merchant.merchantApplyRanges().forEach(merchantApplyRange -> {
                    if (merchantApplyRange.getId() != null && merchantApplyRange.getOrgId() != null) {
                        applyRangeIdAndOrgIdMap.put((Long)merchantApplyRange.getId(), merchantApplyRange.getOrgId());
                    }
                });
            }
            Long merchantId = ((MerchantPrincipalChangeDataDTO)principalChangeDataDTOResList.get(0)).getMerchantId();
            List merchantApplyRangeByMerchantId = this.merchantGroupDao.getMerchantApplyRangeByMerchantId((String)AppContext.getYTenantId(), merchantId);
            if (!merchantApplyRangeByMerchantId.isEmpty()) {
                merchantApplyRangeByMerchantId.forEach(merchantApplyRange -> {
                    if (merchantApplyRange.getId() != null && merchantApplyRange.getOrgId() != null) {
                        applyRangeIdAndOrgIdMap.put((Long)merchantApplyRange.getId(), merchantApplyRange.getOrgId());
                    }
                });
            }
            principalChangeDataDTOResList.forEach(principalChangeDataDTO -> {
                if (principalChangeDataDTO.getMerchantApplyRangeId() != null && applyRangeIdAndOrgIdMap.containsKey(principalChangeDataDTO.getMerchantApplyRangeId())) {
                    principalChangeDataDTO.setOrgId((String)applyRangeIdAndOrgIdMap.get(principalChangeDataDTO.getMerchantApplyRangeId()));
                }
            });
            Optional<MerchantPrincipalChangeDataDTO> first = principalChangeDataDTOResList.stream().filter(principal -> principal.getOrgId() == null).findFirst();
            if (first.isPresent()) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.CRM_CONTACTER_CHANGE_ERROR, new Object[]{InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_21A830A205380080", (String)"\u8d1f\u8d23\u4eba\u5b50\u8868\u6570\u636e\uff0c\u8865\u5145\u7ec4\u7ec7ID\u5931\u8d25\uff01")});
            }
            List merchantPrincipalPOS = this.merchantPrincipalQryDao.listMerchantPrincipalVOById(Arrays.asList(merchantId), null, null);
            List updatePrincipalDataList = principalChangeDataDTOResList.stream().filter(s -> s.getEntityStatus() == UPCEntityStatus.Update).collect(Collectors.toList());
            for (MerchantPrincipalChangeDataDTO merchantPrincipalChangeDataDTO : updatePrincipalDataList) {
                Optional<MerchantPrincipalVO> firstPrincipal = merchantPrincipalPOS.stream().filter(p -> p.getId().equals(merchantPrincipalChangeDataDTO.getId())).findFirst();
                firstPrincipal.ifPresent(merchantPrincipalPO -> {
                    MerchantPrincipalDataDTO merchantPrincipalDataDTO = this.convertToMerchantPrincipalDataDTO((MerchantPrincipalVO)merchantPrincipalPO);
                    merchantPrincipalDataDTO.setOrgId(merchantPrincipalChangeDataDTO.getOrgId());
                    merchantPrincipalChangeDataDTO.setMerchantPrincipalBeforeSaveDataDTO(merchantPrincipalDataDTO);
                });
            }
        }
        return principalChangeDataDTOResList;
    }

    public MerchantPrincipalDataDTO convertToMerchantPrincipalDataDTO(MerchantPrincipalVO merchantPrincipalPO) {
        MerchantPrincipalDataDTO merchantPrincipalDataDTO = new MerchantPrincipalDataDTO();
        if (merchantPrincipalPO.getId() != null) {
            merchantPrincipalDataDTO.setId(merchantPrincipalPO.getId());
        }
        if (merchantPrincipalPO.getIsDefault() != null) {
            merchantPrincipalDataDTO.setIsDefault(merchantPrincipalPO.getIsDefault());
        }
        if (merchantPrincipalPO.getMerchantApplyRangeId() != null) {
            merchantPrincipalDataDTO.setMerchantApplyRangeId(merchantPrincipalPO.getMerchantApplyRangeId());
        }
        if (merchantPrincipalPO.getMerchantId() != null) {
            merchantPrincipalDataDTO.setMerchantId(merchantPrincipalPO.getMerchantId());
        }
        if (merchantPrincipalPO.getPrincipalCharacter() != null) {
            merchantPrincipalDataDTO.setPrincipalCharacter(merchantPrincipalPO.getPrincipalCharacter());
        }
        if (merchantPrincipalPO.getProfessSalesman() != null) {
            merchantPrincipalDataDTO.setProfessSalesman(String.valueOf(merchantPrincipalPO.getProfessSalesman()));
        }
        if (merchantPrincipalPO.getSpecialManagementDep() != null) {
            merchantPrincipalDataDTO.setSpecialManagementDep(String.valueOf(merchantPrincipalPO.getSpecialManagementDep()));
        }
        merchantPrincipalDataDTO.setTenant((Long)AppContext.getTenantId());
        merchantPrincipalDataDTO.setYtenant((String)AppContext.getYhtTenantId());
        return merchantPrincipalDataDTO;
    }

    private MerchantPrincipalChangeDataDTO convertPrincipalToChangeDataDTO(Principal principal) {
        MerchantPrincipalChangeDataDTO merchantPrincipalChangeDataDTO = new MerchantPrincipalChangeDataDTO();
        ArrayList<String> needBlankFieldList = new ArrayList<String>();
        if (principal.getId() != null) {
            merchantPrincipalChangeDataDTO.setId((Long)principal.getId());
        }
        if (principal.getIsDefault() != null) {
            merchantPrincipalChangeDataDTO.setIsDefault(principal.getIsDefault());
        }
        if (principal.getMerchantApplyRangeId() != null) {
            merchantPrincipalChangeDataDTO.setMerchantApplyRangeId(principal.getMerchantApplyRangeId());
        }
        if (principal.getMerchantId() != null) {
            merchantPrincipalChangeDataDTO.setMerchantId(principal.getMerchantId());
        }
        if (principal.get("principalCharacter") != null) {
            merchantPrincipalChangeDataDTO.setPrincipalCharacter((HashMap)principal.get("principalCharacter"));
        } else if (principal.containsKey((Object)"principalCharacter")) {
            needBlankFieldList.add("principalCharacter");
        }
        if (principal.getProfessSalesman() != null) {
            merchantPrincipalChangeDataDTO.setProfessSalesman(principal.getProfessSalesman());
        } else if (principal.containsKey((Object)"professSalesman")) {
            needBlankFieldList.add("professSalesman");
        }
        if (principal.getSpecialManagementDep() != null) {
            merchantPrincipalChangeDataDTO.setSpecialManagementDep(principal.getSpecialManagementDep());
        } else if (principal.containsKey((Object)"specialManagementDep")) {
            needBlankFieldList.add("specialManagementDep");
        }
        if (principal.getEntityStatus() == EntityStatus.Unchanged) {
            merchantPrincipalChangeDataDTO.setEntityStatus(UPCEntityStatus.Unchanged);
        } else if (principal.getEntityStatus() == EntityStatus.Update) {
            merchantPrincipalChangeDataDTO.setEntityStatus(UPCEntityStatus.Update);
        } else if (principal.getEntityStatus() == EntityStatus.Insert) {
            merchantPrincipalChangeDataDTO.setEntityStatus(UPCEntityStatus.Insert);
        } else if (principal.getEntityStatus() == EntityStatus.Delete) {
            merchantPrincipalChangeDataDTO.setEntityStatus(UPCEntityStatus.Delete);
        }
        merchantPrincipalChangeDataDTO.setTenant((Long)AppContext.getTenantId());
        merchantPrincipalChangeDataDTO.setYtenant((String)AppContext.getYhtTenantId());
        merchantPrincipalChangeDataDTO.setNeedBlankFieldList(needBlankFieldList);
        return merchantPrincipalChangeDataDTO;
    }

    public void synchronizeContactorToCRM(List<Contacter> contacterList, Merchant merchant) throws Exception {
        if (ProductUtil.checkOpenOption("u8c-config", "service:contact")) {
            List<MerchantContacterChangeDataDTO> merchantContacterChangeDataDTO = this.convertToMerchantContacterChangeDataDTO(contacterList);
            IContacterChangeService contactorChangeService = (IContacterChangeService)IrisDynamicInvokeUtil.getService((String)"yycrm", (String)"c87e2267-1001-4c70-bb2a-ab41f3b81aa3", null, IContacterChangeService.class);
            if (contactorChangeService != null) {
                String createOrgId = null;
                ArrayList<Long> merchantIdList = new ArrayList<Long>();
                Long merchantId = contacterList.get(0).getMerchantId();
                merchantIdList.add(merchantId);
                List merchantApplyRangeByMerchantIdList = this.merchantGroupDao.getMerchantApplyRangeByMerchantIdList(merchantIdList);
                if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeByMerchantIdList)) {
                    Optional<MerchantApplyRange> merchantApplyRangeCreateOrg = merchantApplyRangeByMerchantIdList.stream().filter(merchantApplyRange -> BooleanUtil.isTrue((Object)merchantApplyRange.getIsCreator())).findFirst();
                    if (merchantApplyRangeCreateOrg.isPresent()) {
                        createOrgId = merchantApplyRangeCreateOrg.get().getOrgId();
                    }
                } else {
                    createOrgId = merchant.get("createOrg").toString();
                }
                for (MerchantContacterChangeDataDTO merchantContacterChangeOneDataDTO : merchantContacterChangeDataDTO) {
                    merchantContacterChangeOneDataDTO.setCreateOrgId(createOrgId);
                }
                contactorChangeService.contacterChange(merchantContacterChangeDataDTO);
            }
        }
    }

    public List<MerchantContacterChangeDataDTO> convertToMerchantContacterChangeDataDTO(List<Contacter> contacterList) throws Exception {
        ArrayList<MerchantContacterChangeDataDTO> merchantContacterChangeDataDTOS = new ArrayList<MerchantContacterChangeDataDTO>();
        if (!CollectionUtils.isEmpty(contacterList)) {
            for (Contacter contacter2 : contacterList) {
                MerchantContacterChangeDataDTO merchantContacterChangeDataDTO = this.convertContacterToChangeDataDTO(contacter2);
                merchantContacterChangeDataDTOS.add(merchantContacterChangeDataDTO);
            }
            List<Long> updateContactorIdList = contacterList.stream().filter(contacter -> contacter.getEntityStatus() == EntityStatus.Update).map(contacter -> {
                if (contacter.getId() != null) {
                    return Long.parseLong(contacter.getId().toString());
                }
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.CRM_CONTACTER_CHANGE_ERROR, new Object[]{InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_21A830A205380081", (String)"\u66f4\u65b0\u65f6\uff0c\u8054\u7cfb\u4ebaID\u4e0d\u53ef\u4e3a\u7a7a\uff01")});
            }).collect(Collectors.toList());
            if (!CollectionUtils.isEmpty(updateContactorIdList)) {
                List<Contacter> contactorUpdateList = this.queryDBContactorList(updateContactorIdList);
                for (Map map : contactorUpdateList) {
                    Contacter contacter3 = (Contacter)JsonUtil.toObject((String)JsonUtil.toJsonString((Object)map), Contacter.class);
                    MerchantContacterDataDTO merchantContacterSaveBeforeDataDTO = this.convertContacterToDataDTO(contacter3);
                    Optional<MerchantContacterChangeDataDTO> merchantContacterChangeDataDTO = merchantContacterChangeDataDTOS.stream().filter(contacterDataDTO -> contacterDataDTO.getEntityStatus() == UPCEntityStatus.Update && contacterDataDTO.getId().equals(contacter3.getId())).findFirst();
                    merchantContacterChangeDataDTO.ifPresent(contacterChangeDataDTO -> contacterChangeDataDTO.setMerchantContacterBeforeSaveDataDTO(merchantContacterSaveBeforeDataDTO));
                }
            }
        }
        return merchantContacterChangeDataDTOS;
    }

    private MerchantContacterChangeDataDTO convertContacterToChangeDataDTO(Contacter contacter) {
        MerchantContacterChangeDataDTO merchantContacterChangeDataDTO = new MerchantContacterChangeDataDTO();
        ArrayList<String> needBlankFieldList = new ArrayList<String>();
        merchantContacterChangeDataDTO.setId(Long.valueOf(Long.parseLong(contacter.getId().toString())));
        merchantContacterChangeDataDTO.setMerchantId(Long.valueOf(Long.parseLong(contacter.getMerchantId().toString())));
        if (contacter.getAreaCodeMobile() != null) {
            merchantContacterChangeDataDTO.setAreaCodeMobile(contacter.getAreaCodeMobile());
        } else if (contacter.containsKey((Object)"areaCodeMobile")) {
            needBlankFieldList.add("areaCodeMobile");
        }
        if (contacter.getContactDepartment() != null) {
            merchantContacterChangeDataDTO.setContactDepartment(contacter.getContactDepartment());
        } else if (contacter.containsKey((Object)"contactDepartment")) {
            needBlankFieldList.add("contactDepartment");
        }
        if (contacter.getCrmContact() != null) {
            merchantContacterChangeDataDTO.setCrmContact(contacter.getCrmContact());
        } else if (contacter.containsKey((Object)"crmContact")) {
            needBlankFieldList.add("crmContact");
        }
        if (contacter.getCustContact() != null) {
            merchantContacterChangeDataDTO.setCustContact(contacter.getCustContact());
        } else if (contacter.containsKey((Object)"custContact")) {
            needBlankFieldList.add("custContact");
        }
        if (contacter.getEmail() != null) {
            merchantContacterChangeDataDTO.setEmail(contacter.getEmail());
        } else if (contacter.containsKey((Object)"email")) {
            needBlankFieldList.add("email");
        }
        if (contacter.get("fullName") instanceof BizObject) {
            merchantContacterChangeDataDTO.setFullName(new MultiLangText((Map)contacter.get("fullName")));
        } else if (contacter.get("fullName") instanceof String) {
            HashMap<String, String> multiLangText = new HashMap<String, String>();
            multiLangText.put(InvocationInfoProxy.getLocale(), (String)contacter.get("fullName"));
            merchantContacterChangeDataDTO.setFullName(new MultiLangText(multiLangText));
        } else if (contacter.containsKey((Object)"fullName") && contacter.get("fullName") == null) {
            needBlankFieldList.add("fullName");
        }
        if (contacter.getGender() != null) {
            merchantContacterChangeDataDTO.setGender(String.valueOf(contacter.getGender().getValue()));
        } else if (contacter.containsKey((Object)"gender")) {
            needBlankFieldList.add("gender");
        }
        if (contacter.getIsCreatorYhtUserType() != null) {
            merchantContacterChangeDataDTO.setIsCreatorYhtUserType(String.valueOf(contacter.getIsCreatorYhtUserType().getValue()));
        } else if (contacter.containsKey((Object)"isCreatorYhtUserType")) {
            needBlankFieldList.add("isCreatorYhtUserType");
        }
        if (contacter.getIsDefault() != null) {
            merchantContacterChangeDataDTO.setIsDefault(contacter.getIsDefault());
        } else if (contacter.containsKey((Object)"isDefault")) {
            needBlankFieldList.add("isDefault");
        }
        if (contacter.getMallContact() != null) {
            merchantContacterChangeDataDTO.setMallContact(contacter.getMallContact());
        } else if (contacter.containsKey((Object)"mallContact")) {
            needBlankFieldList.add("mallContact");
        }
        if (contacter.getMobile() != null) {
            merchantContacterChangeDataDTO.setMobile(contacter.getMobile());
        } else if (contacter.containsKey((Object)"mobile")) {
            needBlankFieldList.add("mobile");
        }
        if (contacter.getOrderContact() != null) {
            merchantContacterChangeDataDTO.setOrderContact(contacter.getOrderContact());
        } else if (contacter.containsKey((Object)"orderContact")) {
            needBlankFieldList.add("orderContact");
        }
        if (contacter.getPositionName() != null) {
            merchantContacterChangeDataDTO.setPositionName(contacter.getPositionName());
        } else if (contacter.containsKey((Object)"positionName")) {
            needBlankFieldList.add("positionName");
        }
        if (contacter.getQq() != null) {
            merchantContacterChangeDataDTO.setQq(contacter.getQq());
        } else if (contacter.containsKey((Object)"qq")) {
            needBlankFieldList.add("qq");
        }
        if (contacter.getRemarks() != null) {
            merchantContacterChangeDataDTO.setRemarks(contacter.getRemarks());
        } else if (contacter.containsKey((Object)"remarks")) {
            needBlankFieldList.add("remarks");
        }
        if (contacter.getStopStatus() != null) {
            merchantContacterChangeDataDTO.setStopStatus(contacter.getStopStatus());
        } else if (contacter.containsKey((Object)"stopStatus")) {
            needBlankFieldList.add("stopStatus");
        }
        if (contacter.getTelePhone() != null) {
            merchantContacterChangeDataDTO.setTelePhone(contacter.getTelePhone());
        } else if (contacter.containsKey((Object)"telePhone")) {
            needBlankFieldList.add("telePhone");
        }
        if (contacter.getWeChat() != null) {
            merchantContacterChangeDataDTO.setWeChat(contacter.getWeChat());
        } else if (contacter.containsKey((Object)"weChat")) {
            needBlankFieldList.add("weChat");
        }
        if (contacter.getErpCode() != null) {
            merchantContacterChangeDataDTO.setErpCode(contacter.getErpCode());
        } else if (contacter.containsKey((Object)"erpCode")) {
            needBlankFieldList.add("erpCode");
        }
        merchantContacterChangeDataDTO.setContacterCharacter((HashMap)contacter.get("contacterCharacter"));
        MerchantContacterSyncCRMRule.dealEntityStatus(contacter, (MerchantContacterDataDTO)merchantContacterChangeDataDTO);
        merchantContacterChangeDataDTO.setNeedBlankFieldList(needBlankFieldList);
        return merchantContacterChangeDataDTO;
    }

    private MerchantContacterDataDTO convertContacterToDataDTO(Contacter contacter) {
        MerchantContacterDataDTO merchantContacterDataDTO = new MerchantContacterDataDTO();
        String[] fields = new String[]{"pubts"};
        BeanUtils.copyProperties((Object)contacter, (Object)merchantContacterDataDTO, (String[])fields);
        merchantContacterDataDTO.setId(Long.valueOf(Long.parseLong(contacter.getId().toString())));
        if (contacter.get("fullName") instanceof BizObject) {
            merchantContacterDataDTO.setFullName(new MultiLangText((Map)contacter.get("fullName")));
        } else if (contacter.get("fullName") instanceof String) {
            HashMap<String, String> multiLangText = new HashMap<String, String>();
            multiLangText.put(InvocationInfoProxy.getLocale(), (String)contacter.get("fullName"));
            merchantContacterDataDTO.setFullName(new MultiLangText(multiLangText));
        }
        merchantContacterDataDTO.setGender(contacter.getGender() != null ? String.valueOf(contacter.getGender().getValue()) : null);
        merchantContacterDataDTO.setIsCreatorYhtUserType(contacter.getIsCreatorYhtUserType() != null ? String.valueOf(contacter.getIsCreatorYhtUserType().getValue()) : null);
        merchantContacterDataDTO.setContacterCharacter((HashMap)contacter.get("contacterCharacter"));
        return merchantContacterDataDTO;
    }

    private static void dealEntityStatus(Contacter contacter, MerchantContacterDataDTO merchantContacterChangeDataDTO) {
        if (contacter.getEntityStatus() == EntityStatus.Insert) {
            merchantContacterChangeDataDTO.setEntityStatus(UPCEntityStatus.Insert);
        } else if (contacter.getEntityStatus() == EntityStatus.Update) {
            merchantContacterChangeDataDTO.setEntityStatus(UPCEntityStatus.Update);
        } else if (contacter.getEntityStatus() == EntityStatus.Delete) {
            merchantContacterChangeDataDTO.setEntityStatus(UPCEntityStatus.Delete);
        } else if (contacter.getEntityStatus() == EntityStatus.Unchanged) {
            merchantContacterChangeDataDTO.setEntityStatus(UPCEntityStatus.Unchanged);
        } else if (contacter.getEntityStatus() == null) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.CRM_CONTACTER_CHANGE_ERROR, new Object[]{InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_21A830A20538007F", (String)"\u5b9e\u4f53\u72b6\u6001\u4e0d\u53ef\u4e3a\u7a7a\uff01")});
        }
    }

    private List<Contacter> queryDBContactorList(List<Long> updateDataID) throws Exception {
        QueryConditionGroup queryMerchantContacterCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(updateDataID)});
        QuerySchema queryMerchantContacterSchema = QuerySchema.create().addSelect("*,contacterCharacter").addCondition((ConditionExpression)queryMerchantContacterCondition);
        return MetaDaoHelper.query((String)"aa.merchant.Contacter", (QuerySchema)queryMerchantContacterSchema);
    }
}


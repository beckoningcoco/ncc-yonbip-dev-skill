/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSONObject
 *  com.alibaba.fastjson.serializer.SerializerFeature
 *  com.yonyou.diwork.model.ControlPointStatus
 *  com.yonyou.diwork.model.LicenseDimensionType
 *  com.yonyou.diwork.model.dto.ControlPointDTO
 *  com.yonyou.diwork.ott.exexutors.RobotExecutors
 *  com.yonyou.diwork.service.ILicenseQueryDiworkService
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.apdoc.coredoc.constants.CheckLimitConstant
 *  com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants
 *  com.yonyou.iuap.apdoc.coredoc.dao.merchant.MerchantPrincipalQryDao
 *  com.yonyou.iuap.apdoc.coredoc.dao.merchant.MerchantQryDao
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.merchant.service.IMerchantApplyRangeService
 *  com.yonyou.iuap.apdoc.coredoc.merchant.service.IMerchantSyncService
 *  com.yonyou.iuap.apdoc.coredoc.po.merchant.MerchantApplyRangeDetailPO
 *  com.yonyou.iuap.apdoc.coredoc.po.merchant.MerchantApplyRangePO
 *  com.yonyou.iuap.apdoc.coredoc.po.merchant.MerchantDetailPO
 *  com.yonyou.iuap.apdoc.coredoc.service.common.IBankDotQueryService
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.apdoc.coredoc.utils.CoredocContextUtils
 *  com.yonyou.iuap.apdoc.coredoc.utils.ListSplitUtil
 *  com.yonyou.iuap.apdoc.coredoc.vo.merchant.MerchantFinancialVO
 *  com.yonyou.iuap.apdoc.coredoc.vo.merchant.MerchantPrincipalVO
 *  com.yonyou.iuap.apdoc.coredoc.vo.merchant.MerchantVO
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.data.service.itf.OrgExternalQryService
 *  com.yonyou.iuap.licenseclient.service.UserCountService
 *  com.yonyou.iuap.log.cons.BusinessLogMode
 *  com.yonyou.iuap.log.cons.OperCodeTypes
 *  com.yonyou.iuap.log.model.BusinessLogObjectBuilder
 *  com.yonyou.iuap.log.model.BusinessObject
 *  com.yonyou.iuap.log.rpc.IBusiLogService
 *  com.yonyou.iuap.log.rpc.IBusinessLogService
 *  com.yonyou.iuap.log.util.BusiObjectBuildUtil
 *  com.yonyou.iuap.org.dto.ConditionDTO
 *  com.yonyou.iuap.org.dto.OrgUnitDTO
 *  com.yonyou.iuap.org.service.itf.IExternalOrgManagerService
 *  com.yonyou.iuap.org.service.itf.core.IFinOrgQueryService
 *  com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.iuap.yms.api.IYmsJdbcApi
 *  com.yonyou.iuap.yms.multitenant.UserExecutors
 *  com.yonyou.iuap.yms.param.SQLParameter
 *  com.yonyou.ucf.basedoc.model.BankAcctCurrencyVO
 *  com.yonyou.ucf.basedoc.model.BankdotVO
 *  com.yonyou.ucf.basedoc.model.EnterpriseBankAcctVO
 *  com.yonyou.ucf.basedoc.model.rpcparams.EnterpriseParams
 *  com.yonyou.ucf.basedoc.service.itf.IEnterpriseBankAcctService
 *  com.yonyou.ucf.mdd.common.model.ResultList
 *  com.yonyou.ucf.mdd.ext.base.user.UserType
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.poi.model.ProcessData
 *  com.yonyou.ucf.mdd.ext.util.RedisTool
 *  com.yonyou.ucf.mdd.ext.util.rpc.RpcCommonUtil
 *  com.yonyou.ucf.transtype.model.BdTransType
 *  com.yonyou.ucf.transtype.model.TransTypeQueryParam
 *  com.yonyou.ucf.transtype.service.itf.ITransTypeService
 *  com.yonyou.ypd.bd.api.IBDQueryRepository
 *  com.yonyoucloud.iuap.upc.dto.MerchantBaseDTO
 *  com.yonyoucloud.iuap.upc.dto.MerchantQryDTO
 *  com.yonyoucloud.iuap.upc.dto.MerchantQualificationDocumentQryDTO
 *  com.yonyoucloud.upc.aa.merchant.AddressInfo
 *  com.yonyoucloud.upc.aa.merchant.AgentFinancial
 *  com.yonyoucloud.upc.aa.merchant.AgentInvoice
 *  com.yonyoucloud.upc.aa.merchant.Contacter
 *  com.yonyoucloud.upc.aa.merchant.CustomerArea
 *  com.yonyoucloud.upc.aa.merchant.IsExistPotential
 *  com.yonyoucloud.upc.aa.merchant.IsTradeCustomers
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.aa.merchant.MerchantAllocateDTO
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRange
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail
 *  com.yonyoucloud.upc.aa.merchant.MerchantDetail
 *  com.yonyoucloud.upc.aa.merchant.Principal
 *  com.yonyoucloud.upc.common.enums.AddMerchantRangeSourceEnum
 *  com.yonyoucloud.upc.data.salearea.SaleAreaApplyRangeDao
 *  com.yonyoucloud.upc.service.IUPCMerchantQueryService
 *  com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil
 *  com.yonyoucloud.upc.utils.MerchantUtils
 *  org.apache.commons.lang3.StringUtils
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
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Service
 *  org.springframework.transaction.annotation.Transactional
 *  org.springframework.transaction.support.TransactionSynchronization
 *  org.springframework.transaction.support.TransactionSynchronizationAdapter
 *  org.springframework.transaction.support.TransactionSynchronizationManager
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.yonyou.diwork.model.ControlPointStatus;
import com.yonyou.diwork.model.LicenseDimensionType;
import com.yonyou.diwork.model.dto.ControlPointDTO;
import com.yonyou.diwork.ott.exexutors.RobotExecutors;
import com.yonyou.diwork.service.ILicenseQueryDiworkService;
import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.apdoc.coredoc.constants.CheckLimitConstant;
import com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants;
import com.yonyou.iuap.apdoc.coredoc.dao.merchant.MerchantPrincipalQryDao;
import com.yonyou.iuap.apdoc.coredoc.dao.merchant.MerchantQryDao;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.merchant.service.IMerchantApplyRangeService;
import com.yonyou.iuap.apdoc.coredoc.merchant.service.IMerchantSyncService;
import com.yonyou.iuap.apdoc.coredoc.po.merchant.MerchantApplyRangeDetailPO;
import com.yonyou.iuap.apdoc.coredoc.po.merchant.MerchantApplyRangePO;
import com.yonyou.iuap.apdoc.coredoc.po.merchant.MerchantDetailPO;
import com.yonyou.iuap.apdoc.coredoc.service.common.IBankDotQueryService;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.apdoc.coredoc.utils.CoredocContextUtils;
import com.yonyou.iuap.apdoc.coredoc.utils.ListSplitUtil;
import com.yonyou.iuap.apdoc.coredoc.vo.merchant.MerchantFinancialVO;
import com.yonyou.iuap.apdoc.coredoc.vo.merchant.MerchantPrincipalVO;
import com.yonyou.iuap.apdoc.coredoc.vo.merchant.MerchantVO;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.data.service.itf.OrgExternalQryService;
import com.yonyou.iuap.licenseclient.service.UserCountService;
import com.yonyou.iuap.log.cons.BusinessLogMode;
import com.yonyou.iuap.log.cons.OperCodeTypes;
import com.yonyou.iuap.log.model.BusinessLogObjectBuilder;
import com.yonyou.iuap.log.model.BusinessObject;
import com.yonyou.iuap.log.rpc.IBusiLogService;
import com.yonyou.iuap.log.rpc.IBusinessLogService;
import com.yonyou.iuap.log.util.BusiObjectBuildUtil;
import com.yonyou.iuap.org.dto.ConditionDTO;
import com.yonyou.iuap.org.dto.OrgUnitDTO;
import com.yonyou.iuap.org.service.itf.IExternalOrgManagerService;
import com.yonyou.iuap.org.service.itf.core.IFinOrgQueryService;
import com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.iuap.yms.api.IYmsJdbcApi;
import com.yonyou.iuap.yms.multitenant.UserExecutors;
import com.yonyou.iuap.yms.param.SQLParameter;
import com.yonyou.ucf.basedoc.model.BankAcctCurrencyVO;
import com.yonyou.ucf.basedoc.model.BankdotVO;
import com.yonyou.ucf.basedoc.model.EnterpriseBankAcctVO;
import com.yonyou.ucf.basedoc.model.rpcparams.EnterpriseParams;
import com.yonyou.ucf.basedoc.service.itf.IEnterpriseBankAcctService;
import com.yonyou.ucf.mdd.common.model.ResultList;
import com.yonyou.ucf.mdd.ext.base.user.UserType;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.poi.model.ProcessData;
import com.yonyou.ucf.mdd.ext.util.RedisTool;
import com.yonyou.ucf.mdd.ext.util.rpc.RpcCommonUtil;
import com.yonyou.ucf.transtype.model.BdTransType;
import com.yonyou.ucf.transtype.model.TransTypeQueryParam;
import com.yonyou.ucf.transtype.service.itf.ITransTypeService;
import com.yonyou.ypd.bd.api.IBDQueryRepository;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.iuap.upc.dto.MerchantBaseDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantQryDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantQualificationDocumentQryDTO;
import com.yonyoucloud.upc.aa.merchant.AddressInfo;
import com.yonyoucloud.upc.aa.merchant.AgentFinancial;
import com.yonyoucloud.upc.aa.merchant.AgentInvoice;
import com.yonyoucloud.upc.aa.merchant.Contacter;
import com.yonyoucloud.upc.aa.merchant.CustomerArea;
import com.yonyoucloud.upc.aa.merchant.IsExistPotential;
import com.yonyoucloud.upc.aa.merchant.IsTradeCustomers;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.aa.merchant.MerchantAllocateDTO;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRange;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail;
import com.yonyoucloud.upc.aa.merchant.MerchantDetail;
import com.yonyoucloud.upc.aa.merchant.Principal;
import com.yonyoucloud.upc.billrule.merchant.MerchantContacterSyncCRMRule;
import com.yonyoucloud.upc.common.enums.AddMerchantRangeSourceEnum;
import com.yonyoucloud.upc.coredoc.pub.CheckDomainDeleteService;
import com.yonyoucloud.upc.data.salearea.SaleAreaApplyRangeDao;
import com.yonyoucloud.upc.event.EventService2;
import com.yonyoucloud.upc.event.EventType;
import com.yonyoucloud.upc.service.DataSourceService;
import com.yonyoucloud.upc.service.IUPCMerchantQueryService;
import com.yonyoucloud.upc.service.UpcCommonFieldCheckService;
import com.yonyoucloud.upc.service.api.dto.ApplyRangeOrgDTO;
import com.yonyoucloud.upc.service.merchantapplyrangegroup.MerchantGroupService;
import com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil;
import com.yonyoucloud.upc.utils.MerchantUtils;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
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
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationAdapter;
import org.springframework.transaction.support.TransactionSynchronizationManager;
import org.springframework.util.CollectionUtils;

@Service
public class MerchantService
implements IMerchantSyncService {
    private static final Logger log = LoggerFactory.getLogger(MerchantService.class);
    @Autowired
    private MerchantQryDao merchantDao;
    @Autowired
    private IUPCMerchantQueryService iupcMerchantQueryService;
    @Autowired
    private IExternalOrgManagerService iExternalOrgManagerService;
    @Autowired
    private ITransTypeService iTransTypeService;
    @Autowired
    private DataSourceService dataSourceService;
    @Autowired
    private IUPCBillService billService;
    @Autowired
    OrgExternalQryService orgExternalQryService;
    @Autowired
    IFinOrgQueryService iFinOrgQueryService;
    @Autowired
    private IOrgUnitQueryService orgUnitQueryService;
    @Autowired
    private MerchantGroupService merchantGroupService;
    @Autowired
    private IEnterpriseBankAcctService iEnterpriseBankAcctService;
    @Autowired
    private EventService2 eventService2;
    @Autowired
    private IBusinessLogService businessLogService;
    @Autowired
    MerchantPrincipalQryDao merchantPrincipalQryDao;
    @Autowired
    @Qualifier(value="ymsLongTaskExecutorService")
    private ExecutorService ymsLongTaskExecutorService;
    @Autowired
    private YMSParamConfig ymsParamConfig;
    @Autowired
    private SaleAreaApplyRangeDao saleAreaApplyRangeDao;
    @Autowired
    private IBusiLogService busiLogService;
    @Autowired
    private IUPCMerchantQueryService upcMerchantQueryService;
    @Autowired
    private PubOptionDataQueryUtil pubOptionDataQueryUtil;
    @Autowired
    private IBankDotQueryService bankDotQueryService;
    @Autowired
    protected IYmsJdbcApi ymsJdbcApi;
    @Autowired
    private UpcCommonFieldCheckService upcCommonFieldCheckService;
    @Autowired
    private CheckDomainDeleteService checkDomainDeleteService;
    @Autowired
    private MerchantContacterSyncCRMRule merchantContacterSyncCRMRule;
    @Autowired
    private ILicenseQueryDiworkService licenseQueryDiworkService;
    @Autowired
    private IMerchantApplyRangeService merchantApplyRangeService;
    @Autowired
    private IBDQueryRepository billQueryRepository;
    private static final List CONTROL_POINT_LIST = Arrays.asList("ChannelOperateCenter", "ChannelOperateCenter_spe", "MKTMLD");
    Logger logger = LoggerFactory.getLogger(MerchantService.class);
    private static String SQL_SYNC_STOPSTATUS_BY_YTENANTID = "update merchantapplyrange t1 \n  left join merchant_detail t2 on t1.merchant_detail_id=t2.id and t2.ytenant_id='%s' \n  left join merchantapplyrangedetail t3 on t3.merchantApplyRangeId=t1.id and t3.ytenant_id='%s'\n  left join merchant t4 on t4.id=t1.merchantid and t4.ytenant_id='%s'\n   set t3.stopstatus=t2.stopstatus,t3.is_trade_customers=t2.is_trade_customers,\n       t3.iTaxRate=t2.tax_rate_id, \n       t3.cTransactionCurrency=t2.transaction_currency_id, \n       t3.cDeliveryWarehouse=t2.delivery_warehouse_id,\n       t3.iCreditServiceDay=t2.credit_service_day_id,\n       t3.cCollectionAgreement=t2.collection_agreement_id,\n       t3.iShipmentMethodId=t2.shipment_method_id,\n       t3.bSignBack=t2.sign_back,\n       t3.stop_time=t2.stop_time,\n       t3.erpCode=t2.erpCode,\n       t3.oCustomerLevel_id=t2.merchant_level_id,\n       t3.cExchangeratetypeId=t2.exchange_rate_type_Id,\n       t3.cPayWay=t2.pay_way,\n       t3.iCustomerTypeId=t2.merchant_type_id,\n       t3.cFreezingLink=t2.freeze_link,\n       t3.bfrozenstate=t2.frozen_state,\n       t3.locker=t2.locker,\n       t3.lock_Date=t2.lock_Date,\n       t3.lock_time=t2.lock_time,\n       t3.orgdefaultaddress=t2.org_default_address,\n       t3.layoff_id=t2.layoff_id,\n       t3.cPriceMarking=t2.cPriceMarking\n where t1.ytenant_id='%s'\n";

    public List<Map> receivingWarehouse(Map merchant) throws Exception {
        List warehouse = this.billQueryRepository.queryMapBySchema("aa.warehouse.Warehouse", QuerySchema.create().addSelect("id,name").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"cust").eq(merchant.get("id")), QueryCondition.name((String)"shopDefault").eq((Object)true)})));
        return warehouse == null ? new ArrayList<Map>() : warehouse.stream().map(w -> {
            HashMap map = new HashMap();
            map.putAll(w);
            return map;
        }).collect(Collectors.toList());
    }

    public Map automatic(Map merchant) throws Exception {
        if (merchant.containsKey("user_id")) {
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("id as id,name as name,mainJobList.dept_id as dept_id,mainJobList.dept_id.name as dept_name,mainJobList.dept_id.code as dept_code");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"user_id").eq(merchant.get("user_id")), QueryCondition.name((String)"biz_man_tag").eq((Object)true), QueryCondition.name((String)"enable").eq((Object)1), QueryCondition.name((String)"dr").eq((Object)0), QueryCondition.name((String)"mainJobList.dr").eq((Object)0), QueryCondition.name((String)"mainJobList.enable").eq((Object)1)}));
            List staffList = MetaDaoHelper.query((String)"bd.staff.Staff", (QuerySchema)querySchema, (String)"ucf-staff-center");
            if (!CollectionUtils.isEmpty((Collection)staffList)) {
                return (Map)staffList.get(0);
            }
        }
        return merchant;
    }

    public void setUnionKeyCheckLicense(boolean enableRollback) {
        this.setUnionKeyCheckLicenseRedis();
        this.getUnionKeyCheckLicense(enableRollback);
    }

    private void setUnionKeyCheckLicenseRedis() {
        final String requestId = UUID.randomUUID().toString();
        String useAmountUnionKey = "ChannelMerchantMeteringAndBillingControlUseAmount" + AppContext.getYhtTenantId();
        final String useAmountLock = "ChannelMerchantMeteringAndBillingControlUseAmountLock" + AppContext.getYhtTenantId();
        String useAmountUnionKeyValueRedis = AppContext.cache().get(useAmountUnionKey);
        if (StringUtils.isEmpty((CharSequence)useAmountUnionKeyValueRedis)) {
            if (RedisTool.tryGetLock((String)useAmountLock, (String)requestId, (int)UPCConstants.LOCK_EXPIRE_TIME)) {
                this.setUnionKeyCheckLicenseAfterLock(useAmountUnionKey, useAmountLock, requestId);
                TransactionSynchronization transactionSynchronization = new TransactionSynchronization(){

                    public void afterCompletion(int status) {
                        RedisTool.releaseLock((String)useAmountLock, (String)requestId);
                    }
                };
            } else {
                for (int tryLockCount = 0; tryLockCount < 10; ++tryLockCount) {
                    try {
                        TimeUnit.SECONDS.sleep(1L);
                    }
                    catch (InterruptedException e) {
                        log.error(e.getMessage(), (Throwable)e);
                    }
                    useAmountUnionKeyValueRedis = AppContext.cache().get(useAmountUnionKey);
                    if (!StringUtils.isEmpty((CharSequence)useAmountUnionKeyValueRedis)) break;
                }
            }
        }
    }

    private void setUnionKeyCheckLicenseAfterLock(String useAmountUnionKey, String useAmountLock, String requestId) {
        int amountUnionKeyValue = this.getControlPointDTO(useAmountLock, requestId);
        HashMap<String, String> params = new HashMap<String, String>(1);
        params.put("yTenantId", AppContext.getCurrentUser().getYTenantId());
        Map result = (Map)SqlHelper.selectFirst((String)"com.yonyoucloud.upc.merchant.dao.merchantCheck.selectMerchantLicenseAmount", params);
        if (CollectionUtils.isEmpty((Map)result)) {
            result.put("useAmount", 0);
        }
        int useAmountUnionKeyValue = amountUnionKeyValue - Integer.valueOf(result.get("useAmount").toString());
        AppContext.cache().setnx(useAmountUnionKey, String.valueOf(useAmountUnionKeyValue), 3600);
    }

    private void getUnionKeyCheckLicense(boolean enableRollback) {
        final String useAmountUnionKey = "ChannelMerchantMeteringAndBillingControlUseAmount" + AppContext.getYhtTenantId();
        if (Integer.valueOf(AppContext.cache().get(useAmountUnionKey)) > 0) {
            AppContext.cache().decr(useAmountUnionKey);
            this.regUserCountLicense();
            if (enableRollback) {
                TransactionSynchronizationManager.registerSynchronization((TransactionSynchronization)new TransactionSynchronizationAdapter(){

                    public void afterCompletion(int status) {
                        if (0 != status) {
                            MerchantService.this.setUnionKeyCheckLicenseRedis();
                            AppContext.cache().incr(useAmountUnionKey);
                            MerchantService.this.cancelUserCountLicense();
                        }
                    }
                });
            }
        } else {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800495);
        }
    }

    public int getControlPointDTO(String useAmountLock, String requestId) {
        Map controlPointMap = this.licenseQueryDiworkService.getCurrentByStandardCodes(AppContext.getCurrentUser().getYTenantId(), CONTROL_POINT_LIST);
        List controlPointList = controlPointMap.entrySet().stream().map(entry -> (ControlPointDTO)entry.getValue()).collect(Collectors.toList());
        if (!CollectionUtils.isEmpty(controlPointList)) {
            for (ControlPointDTO controlPoint : controlPointList) {
                if (controlPoint.getStatus() != ControlPointStatus.VALID) continue;
                if (controlPoint != null && "*".equals(controlPoint.getCode())) {
                    return controlPoint.getDimension(LicenseDimensionType.USER).getAmount();
                }
                return controlPoint.getDimension(LicenseDimensionType.AMOUNT).getAmount();
            }
        }
        String useAmountUnionKey = "ChannelMerchantMeteringAndBillingControlUseAmount" + AppContext.getYhtTenantId();
        AppContext.cache().del(new String[]{useAmountUnionKey});
        RedisTool.releaseLock((String)useAmountLock, (String)requestId);
        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800496);
    }

    public List<Map<String, Object>> selectMerchantOf2B(BizObject bill) throws Exception {
        QuerySchema querySchema1 = QuerySchema.create();
        querySchema1.addSelect("id");
        querySchema1.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"businessRole").like((Object)"3"), QueryCondition.name((String)"merchantId").eq(bill.getId())}));
        List merchantRoleInfo = MetaDaoHelper.query((String)"aa.merchant.MerchantRoleInfo", (QuerySchema)querySchema1);
        return merchantRoleInfo;
    }

    public List<Map<String, Object>> selectMerchantStopStatus(MerchantApplyRangeDetail merchantApplyRangeDetail, Long merchantId) throws Exception {
        List merchantApplyRangeDetailList;
        if (merchantApplyRangeDetail.getId() == null) {
            return null;
        }
        if (this.pubOptionDataQueryUtil.isCloseMerchantModelDoubleWrite()) {
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("stopstatus");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq((Object)merchantId), QueryCondition.name((String)"isCreator").eq((Object)true)}));
            merchantApplyRangeDetailList = MetaDaoHelper.query((String)"aa.merchant.MerchantDetail", (QuerySchema)querySchema);
        } else {
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("stopstatus");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantApplyRangeId").eq((Object)merchantApplyRangeDetail.getId())}));
            merchantApplyRangeDetailList = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRangeDetail", (QuerySchema)querySchema);
        }
        return merchantApplyRangeDetailList;
    }

    public List<Map<String, Object>> selectCreateMerchantStopStatus(Long merchantId) throws Exception {
        List merchantApplyRangeDetailList;
        if (this.pubOptionDataQueryUtil.isCloseMerchantModelDoubleWrite()) {
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("stopstatus");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq((Object)merchantId), QueryCondition.name((String)"isCreator").eq((Object)true)}));
            merchantApplyRangeDetailList = MetaDaoHelper.query((String)"aa.merchant.MerchantDetail", (QuerySchema)querySchema);
        } else {
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("stopstatus");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)merchantId), QueryCondition.name((String)"merchantApplyRangeId.isCreator").eq((Object)true)}));
            merchantApplyRangeDetailList = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRangeDetail", (QuerySchema)querySchema);
        }
        return merchantApplyRangeDetailList;
    }

    public void decrUnionKeyCheckLicense(BizObject bill, boolean enableRollback) throws Exception {
        List<Map<String, Object>> merchantRoleInfo = this.selectMerchantOf2B(bill);
        if (!CollectionUtils.isEmpty(merchantRoleInfo)) {
            this.setUnionKeyCheckLicense(enableRollback);
        }
    }

    public void incrUnionKeyCheckLicense(BizObject bill, boolean enableRollback) throws Exception {
        List<Map<String, Object>> merchantRoleInfo = this.selectMerchantOf2B(bill);
        if (!CollectionUtils.isEmpty(merchantRoleInfo)) {
            final String useAmountUnionKey = "ChannelMerchantMeteringAndBillingControlUseAmount" + AppContext.getYhtTenantId();
            String useAmountUnionKeyValueRedis = AppContext.cache().get(useAmountUnionKey);
            if (!StringUtils.isEmpty((CharSequence)useAmountUnionKeyValueRedis)) {
                AppContext.cache().incr(useAmountUnionKey);
                this.cancelUserCountLicense();
            } else {
                this.setUnionKeyCheckLicenseRedis();
                AppContext.cache().incr(useAmountUnionKey);
                this.cancelUserCountLicense();
            }
            if (enableRollback) {
                TransactionSynchronizationManager.registerSynchronization((TransactionSynchronization)new TransactionSynchronizationAdapter(){

                    public void afterCompletion(int status) {
                        if (0 != status) {
                            MerchantService.this.setUnionKeyCheckLicenseRedis();
                            AppContext.cache().decr(useAmountUnionKey);
                            MerchantService.this.regUserCountLicense();
                        }
                    }
                });
            }
        }
    }

    public void cancelUserCountLicense() {
        if (this.dataSourceService.isPremises()) {
            try {
                UserCountService.cancelLicense((String)UUID.randomUUID().toString(), (String)"ppm0000072808");
            }
            catch (Exception e) {
                log.error("incrUserCountLicense_error:{}", (Object)e.getMessage(), (Object)e);
            }
        }
    }

    public void regUserCountLicense() {
        if (this.dataSourceService.isPremises()) {
            try {
                UserCountService.regLicense((String)UUID.randomUUID().toString(), (String)InvocationInfoProxy.getUsername(), (String)"ppm0000072808");
            }
            catch (Exception e) {
                log.error("decrUserCountLicense_error:{}", (Object)e.getMessage(), (Object)e);
            }
        }
    }

    public void setMerchantApplyRangeOrgFunc(List<MerchantApplyRange> merchantApplyRangeList) throws Exception {
        List<Map<String, Object>> salesOrgList;
        ArrayList<String> orgIdList = new ArrayList<String>();
        for (MerchantApplyRange merchantApplyRange : merchantApplyRangeList) {
            orgIdList.add(merchantApplyRange.getOrgId());
        }
        if (!CollectionUtils.isEmpty(orgIdList) && !CollectionUtils.isEmpty(salesOrgList = this.getSalesOrgListById(orgIdList))) {
            HashMap<Object, String> salesOrgMap = new HashMap<Object, String>();
            for (Map<String, Object> salesOrgId : salesOrgList) {
                salesOrgMap.put(salesOrgId.get("id"), "isSalesOrg");
            }
            for (MerchantApplyRange merchantApplyRange : merchantApplyRangeList) {
                if ("isSalesOrg".equals(salesOrgMap.get(merchantApplyRange.getOrgId())) && !"666666".equals(merchantApplyRange.getOrgId())) {
                    merchantApplyRange.setIsSalesOrg(Boolean.valueOf(true));
                } else {
                    merchantApplyRange.setIsSalesOrg(Boolean.valueOf(false));
                }
                if (merchantApplyRange.getShop() != null) continue;
                if (CoredocContextUtils.isShopUser()) {
                    merchantApplyRange.setShop(Long.valueOf(AppContext.getCurrentUser().getDocId()));
                    continue;
                }
                merchantApplyRange.setShop(Long.valueOf(-1L));
            }
        }
    }

    private String getShopId() {
        boolean isshop;
        String shopId = null;
        boolean bl = isshop = UserType.ShopAdminUser == AppContext.getCurrentUser().getUserType() || UserType.ShopUser == AppContext.getCurrentUser().getUserType();
        if (isshop) {
            shopId = AppContext.getCurrentUser().getDocId();
        }
        return shopId;
    }

    public void setMerchantIsExistPotential(Merchant merchant) throws Exception {
        List merchantApplyRangeList = merchant.merchantApplyRanges();
        boolean potential = false;
        boolean notPotential = false;
        for (MerchantApplyRange merchantApplyRange : merchantApplyRangeList) {
            if (merchantApplyRange.getIsPotential() == null || !merchantApplyRange.getIsPotential().booleanValue()) {
                notPotential = true;
                continue;
            }
            potential = true;
        }
        if (potential && notPotential) {
            merchant.setIsExistPotential(IsExistPotential.partProspectCust.getValue());
        } else if (potential && !notPotential) {
            merchant.setIsExistPotential(IsExistPotential.allProspectCust.getValue());
        } else if (!potential && notPotential) {
            merchant.setIsExistPotential(IsExistPotential.allRegularCust.getValue());
        }
    }

    public void setMerchantIsExistPotential(Long merchantId) throws Exception {
        Merchant merchant = new Merchant();
        if (merchantId == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800497);
        }
        merchant.setId((Object)merchantId);
        merchant.setEntityStatus(EntityStatus.Update);
        boolean potential = false;
        boolean notPotential = false;
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id,isPotential");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq((Object)merchantId), QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())}));
        querySchema.setPartitionable(false);
        List merchantApplyRangeList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRange", (QuerySchema)querySchema, null);
        if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeList)) {
            for (MerchantApplyRange merchantApplyRange : merchantApplyRangeList) {
                if (merchantApplyRange.getIsPotential() == null || !merchantApplyRange.getIsPotential().booleanValue()) {
                    notPotential = true;
                    continue;
                }
                potential = true;
            }
        }
        if (potential && notPotential) {
            merchant.setIsExistPotential(IsExistPotential.partProspectCust.getValue());
        } else if (potential && !notPotential) {
            merchant.setIsExistPotential(IsExistPotential.allProspectCust.getValue());
        } else if (!potential && notPotential) {
            merchant.setIsExistPotential(IsExistPotential.allRegularCust.getValue());
        } else {
            merchant.setIsExistPotential(IsExistPotential.allRegularCust.getValue());
        }
        MetaDaoHelper.update((String)"aa.merchant.Merchant", (BizObject)merchant);
    }

    public List<Map<String, Object>> getSalesOrgListById(List<String> orgIdList) throws Exception {
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(orgIdList)}));
        List salesOrgList = MetaDaoHelper.query((String)"org.func.SalesOrg", (QuerySchema)querySchema, (String)"ucf-org-center");
        return salesOrgList;
    }

    public List<Map<String, Object>> selectExchangeRateTypeVO(Object where, String identifying) throws Exception {
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)identifying).eq(where), QueryCondition.name((String)"dr").eq((Object)0)}));
        List exchangeRateTypeVOList = MetaDaoHelper.query((String)"bd.exchangeRate.ExchangeRateTypeVO", (QuerySchema)querySchema, (String)"ucfbasedoc");
        return exchangeRateTypeVOList;
    }

    public Map<String, Object> updateOptionForMerchant(String systemCode) throws Exception {
        this.logger.info("\u66f4\u6539\u5f00\u901a\u53c2\u6570\u4e3a:{}", (Object)systemCode);
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("optionName", systemCode);
        params.put("tenantId", AppContext.getTenantId());
        params.put("ytenant_id", AppContext.getYTenantId());
        SqlHelper.update((String)"com.yonyoucloud.upc.dao.meta.init.updateOptionData", params);
        ArrayList<String> isOpen = new ArrayList<String>();
        isOpen.add("option_" + AppContext.getYTenantId() + "_" + RpcCommonUtil.getProfile());
        isOpen.add("sysOption_" + AppContext.getYTenantId() + "_" + RpcCommonUtil.getProfile());
        this.logger.info("\u66f4\u6539\u4e1a\u52a1\u53c2\u6570\u6e05\u7406\u7f13\u5b58\u4e3a{}", isOpen);
        AppContext.cache().del(isOpen.toArray(new String[isOpen.size()]));
        return params;
    }

    public Map<String, Object> compensationCustomerArea(Map param) throws Exception {
        HashMap<String, Object> resultList = new HashMap<String, Object>();
        if (param.containsKey("data")) {
            List merchantIdList = (List)param.get("data");
            if (CollectionUtils.isEmpty((Collection)merchantIdList)) {
                resultList.put("msg", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408000F", (String)"\u5165\u53c2\u4e3a\u7a7a"));
                return resultList;
            }
            assert (merchantIdList.size() < CheckLimitConstant.DEFAULT_LIMIT);
            for (Long merchantId : merchantIdList) {
                QuerySchema querySchema = QuerySchema.create();
                querySchema.addSelect("*");
                querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"saleAreaId").is_not_null(), QueryCondition.name((String)"merchantId").eq((Object)merchantId)}));
                List customerAreaList = MetaDaoHelper.query((String)"aa.merchant.CustomerArea", (QuerySchema)querySchema, null);
                if (CollectionUtils.isEmpty((Collection)customerAreaList)) {
                    resultList.put(merchantId.toString(), InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080010", (String)"\u8be5\u5ba2\u6237\u6ca1\u6709\u9500\u552e\u533a\u57df"));
                    continue;
                }
                HashMap<String, String> merchantApplyRangeNoMap = new HashMap<String, String>();
                ArrayList<Map> isCreatorCustomerAreaList = new ArrayList<Map>();
                ArrayList<CustomerArea> customerAreaList1 = new ArrayList<CustomerArea>();
                ArrayList<MerchantApplyRangeDetail> merchantApplyRangeDetailList = new ArrayList<MerchantApplyRangeDetail>();
                querySchema = QuerySchema.create();
                querySchema.addSelect("id,merchantId,isCreator");
                querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq((Object)merchantId)}));
                List merchantApplyRangeList = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRange", (QuerySchema)querySchema, null);
                if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeList)) {
                    for (Map merchantApplyRange : merchantApplyRangeList) {
                        for (Map customerArea : customerAreaList) {
                            if (Boolean.valueOf(merchantApplyRange.get("isCreator").toString()).booleanValue() && merchantApplyRange.get("id").equals(customerArea.get("merchantApplyRangeId"))) {
                                isCreatorCustomerAreaList.add(customerArea);
                            }
                            if (!merchantApplyRange.get("id").equals(customerArea.get("merchantApplyRangeId")) || merchantApplyRangeNoMap.containsKey(merchantApplyRange.get("id").toString())) continue;
                            merchantApplyRangeNoMap.put(merchantApplyRange.get("id").toString(), "1");
                        }
                    }
                    if (!CollectionUtils.isEmpty(merchantApplyRangeNoMap)) {
                        for (Map merchantApplyRange : merchantApplyRangeList) {
                            if (merchantApplyRangeNoMap.containsKey(merchantApplyRange.get("id").toString())) continue;
                            for (Map isCreatorCustomerArea : isCreatorCustomerAreaList) {
                                CustomerArea customerArea = new CustomerArea();
                                MerchantApplyRangeDetail merchantApplyRangeDetail = new MerchantApplyRangeDetail();
                                customerArea.setId((Object)IdManager.getInstance().nextId());
                                customerArea.setEntityStatus(EntityStatus.Insert);
                                customerArea.setMerchantId(merchantId);
                                customerArea.setmerchantApplyRangeId(Long.valueOf(merchantApplyRange.get("id").toString()));
                                customerArea.setSaleAreaId(Long.valueOf(isCreatorCustomerArea.get("saleAreaId").toString()));
                                customerArea.setIsDefault(Boolean.valueOf(Boolean.parseBoolean(isCreatorCustomerArea.get("isDefault").toString())));
                                customerAreaList1.add(customerArea);
                                merchantApplyRangeDetail.setCustomerArea(Long.valueOf(isCreatorCustomerArea.get("saleAreaId").toString()));
                                merchantApplyRangeDetail.setMerchantApplyRangeId(Long.valueOf(merchantApplyRange.get("id").toString()));
                                merchantApplyRangeDetail.setEntityStatus(EntityStatus.Update);
                                merchantApplyRangeDetailList.add(merchantApplyRangeDetail);
                            }
                        }
                    }
                }
                if (!CollectionUtils.isEmpty(customerAreaList1)) {
                    MetaDaoHelper.insert((String)"aa.merchant.CustomerArea", customerAreaList1);
                }
                if (!CollectionUtils.isEmpty(merchantApplyRangeDetailList)) {
                    MetaDaoHelper.update((String)"aa.merchant.MerchantApplyRangeDetail", merchantApplyRangeDetailList);
                }
                resultList.put(merchantId.toString(), customerAreaList1);
            }
        }
        return resultList;
    }

    public Map<String, Object> compensationCustomerArea1(Map param) throws Exception {
        HashMap<String, Object> resultList = new HashMap<String, Object>();
        if (param.containsKey("data")) {
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("*");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"saleAreaId").is_not_null()}));
            List customerAreaList = MetaDaoHelper.query((String)"aa.merchant.CustomerArea", (QuerySchema)querySchema, null);
            querySchema = QuerySchema.create();
            querySchema.addSelect("id,merchantId,isCreator");
            List merchantApplyRangeList = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRange", (QuerySchema)querySchema, null);
            ArrayList<Map> isCreatorCustomerAreaList = new ArrayList<Map>();
            ArrayList<Map> isCreatorMerchantApplyRangeList = new ArrayList<Map>();
            HashMap<String, String> map = new HashMap<String, String>();
            ArrayList<CustomerArea> newCustomerAreaList = new ArrayList<CustomerArea>();
            ArrayList<MerchantApplyRangeDetail> merchantApplyRangeDetailList = new ArrayList<MerchantApplyRangeDetail>();
            HashMap<String, String> isCreatorFalseMap = new HashMap<String, String>();
            if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeList)) {
                for (Map merchantApplyRange : merchantApplyRangeList) {
                    if (!Boolean.valueOf(merchantApplyRange.get("isCreator").toString()).booleanValue()) continue;
                    isCreatorMerchantApplyRangeList.add(merchantApplyRange);
                    map.put(merchantApplyRange.get("id").toString(), "isCreator1");
                }
            }
            if (!CollectionUtils.isEmpty((Collection)customerAreaList)) {
                for (Map customerArea : customerAreaList) {
                    if ("isCreator1".equals(map.get(customerArea.get("merchantApplyRangeId").toString()))) {
                        isCreatorCustomerAreaList.add(customerArea);
                        continue;
                    }
                    isCreatorFalseMap.put(customerArea.get("merchantApplyRangeId").toString(), "isCreatorFalse");
                }
            }
            if (!CollectionUtils.isEmpty(isCreatorCustomerAreaList)) {
                for (Map isCreatorCustomer : isCreatorCustomerAreaList) {
                    for (Map merchantApplyRange : merchantApplyRangeList) {
                        if (!isCreatorCustomer.get("merchantId").equals(merchantApplyRange.get("merchantId")) || isCreatorCustomer.get("merchantApplyRangeId").equals(merchantApplyRange.get("id")) || isCreatorFalseMap.containsKey(merchantApplyRange.get("id").toString())) continue;
                        CustomerArea customerArea = new CustomerArea();
                        MerchantApplyRangeDetail merchantApplyRangeDetail = new MerchantApplyRangeDetail();
                        customerArea.setId((Object)IdManager.getInstance().nextId());
                        customerArea.setEntityStatus(EntityStatus.Insert);
                        customerArea.setMerchantId(Long.valueOf(isCreatorCustomer.get("merchantId").toString()));
                        customerArea.setmerchantApplyRangeId(Long.valueOf(merchantApplyRange.get("id").toString()));
                        customerArea.setSaleAreaId(Long.valueOf(isCreatorCustomer.get("saleAreaId").toString()));
                        customerArea.setIsDefault(Boolean.valueOf(Boolean.parseBoolean(isCreatorCustomer.get("isDefault").toString())));
                        newCustomerAreaList.add(customerArea);
                        merchantApplyRangeDetail.setCustomerArea(Long.valueOf(isCreatorCustomer.get("saleAreaId").toString()));
                        merchantApplyRangeDetail.setMerchantApplyRangeId(Long.valueOf(merchantApplyRange.get("id").toString()));
                        merchantApplyRangeDetail.setEntityStatus(EntityStatus.Update);
                        merchantApplyRangeDetailList.add(merchantApplyRangeDetail);
                    }
                }
            }
            if (!CollectionUtils.isEmpty(newCustomerAreaList)) {
                MetaDaoHelper.insert((String)"aa.merchant.CustomerArea", newCustomerAreaList);
            }
            if (!CollectionUtils.isEmpty(merchantApplyRangeDetailList)) {
                MetaDaoHelper.update((String)"aa.merchant.MerchantApplyRangeDetail", merchantApplyRangeDetailList);
            }
            resultList.put("no1", newCustomerAreaList);
        }
        return resultList;
    }

    public Map<String, Object> compensationPrincipal(Map param) throws Exception {
        HashMap<String, Object> resultList = new HashMap<String, Object>();
        if (param.containsKey("data")) {
            List merchantIdList = (List)param.get("data");
            if (CollectionUtils.isEmpty((Collection)merchantIdList)) {
                resultList.put("msg", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408000F", (String)"\u5165\u53c2\u4e3a\u7a7a"));
                return resultList;
            }
            assert (merchantIdList.size() < CheckLimitConstant.DEFAULT_LIMIT);
            for (Long merchantId : merchantIdList) {
                QuerySchema querySchema = QuerySchema.create();
                querySchema.addSelect("*");
                querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"professSalesman").is_not_null(), QueryCondition.name((String)"merchantId").eq((Object)merchantId)}));
                List principalList = MetaDaoHelper.query((String)"aa.merchant.Principal", (QuerySchema)querySchema, null);
                if (CollectionUtils.isEmpty((Collection)principalList)) {
                    resultList.put(merchantId.toString(), InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080016", (String)"\u8be5\u5ba2\u6237\u6ca1\u6709\u8d1f\u8d23\u4eba"));
                    continue;
                }
                HashMap<String, String> merchantApplyRangeNoMap = new HashMap<String, String>();
                ArrayList<Map> isCreatorPrincipalList = new ArrayList<Map>();
                ArrayList<Principal> principalList1 = new ArrayList<Principal>();
                ArrayList<MerchantApplyRangeDetail> merchantApplyRangeDetailList = new ArrayList<MerchantApplyRangeDetail>();
                querySchema = QuerySchema.create();
                querySchema.addSelect("id,merchantId,isCreator");
                querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq((Object)merchantId)}));
                List merchantApplyRangeList = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRange", (QuerySchema)querySchema, null);
                if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeList)) {
                    for (Map merchantApplyRange : merchantApplyRangeList) {
                        for (Map principal : principalList) {
                            if (Boolean.valueOf(merchantApplyRange.get("isCreator").toString()).booleanValue() && merchantApplyRange.get("id").equals(principal.get("merchantApplyRangeId"))) {
                                isCreatorPrincipalList.add(principal);
                            }
                            if (!merchantApplyRange.get("id").equals(principal.get("merchantApplyRangeId")) || merchantApplyRangeNoMap.containsKey(merchantApplyRange.get("id").toString())) continue;
                            merchantApplyRangeNoMap.put(merchantApplyRange.get("id").toString(), "1");
                        }
                    }
                    if (!CollectionUtils.isEmpty(merchantApplyRangeNoMap)) {
                        for (Map merchantApplyRange : merchantApplyRangeList) {
                            if (merchantApplyRangeNoMap.containsKey(merchantApplyRange.get("id").toString())) continue;
                            for (Map isCreatorPrincipal : isCreatorPrincipalList) {
                                Principal principal = new Principal();
                                MerchantApplyRangeDetail merchantApplyRangeDetail = new MerchantApplyRangeDetail();
                                principal.setId((Object)IdManager.getInstance().nextId());
                                principal.setEntityStatus(EntityStatus.Insert);
                                principal.setMerchantId(merchantId);
                                principal.setMerchantApplyRangeId(Long.valueOf(merchantApplyRange.get("id").toString()));
                                if (isCreatorPrincipal.containsKey("specialManagementDep")) {
                                    principal.setSpecialManagementDep(isCreatorPrincipal.get("specialManagementDep").toString());
                                    merchantApplyRangeDetail.setSpecialManagementDep(isCreatorPrincipal.get("specialManagementDep").toString());
                                }
                                if (isCreatorPrincipal.containsKey("professSalesman")) {
                                    principal.setProfessSalesman(isCreatorPrincipal.get("professSalesman").toString());
                                    merchantApplyRangeDetail.setProfessSalesman(isCreatorPrincipal.get("professSalesman").toString());
                                }
                                principal.setIsDefault(Boolean.valueOf(Boolean.parseBoolean(isCreatorPrincipal.get("isDefault").toString())));
                                principalList1.add(principal);
                                merchantApplyRangeDetail.setMerchantApplyRangeId(Long.valueOf(merchantApplyRange.get("id").toString()));
                                merchantApplyRangeDetail.setEntityStatus(EntityStatus.Update);
                                merchantApplyRangeDetailList.add(merchantApplyRangeDetail);
                            }
                        }
                    }
                }
                if (!CollectionUtils.isEmpty(principalList1)) {
                    MetaDaoHelper.insert((String)"aa.merchant.Principal", principalList1);
                }
                if (!CollectionUtils.isEmpty(merchantApplyRangeDetailList)) {
                    MetaDaoHelper.update((String)"aa.merchant.MerchantApplyRangeDetail", merchantApplyRangeDetailList);
                }
                resultList.put(merchantId.toString(), principalList1);
            }
        }
        return resultList;
    }

    public Map<String, Object> compensationPrincipal1(Map param) throws Exception {
        HashMap<String, Object> resultList = new HashMap<String, Object>();
        if (param.containsKey("data")) {
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("*");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"specialManagementDep").is_not_null(), QueryCondition.name((String)"professSalesman").is_not_null()}));
            List principalList = MetaDaoHelper.query((String)"aa.merchant.Principal", (QuerySchema)querySchema, null);
            querySchema = QuerySchema.create();
            querySchema.addSelect("id,merchantId,isCreator");
            List merchantApplyRangeList = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRange", (QuerySchema)querySchema, null);
            ArrayList<Map> isCreatorPrincipalList = new ArrayList<Map>();
            ArrayList<Map> isCreatorMerchantApplyRangeList = new ArrayList<Map>();
            HashMap<String, String> map = new HashMap<String, String>();
            ArrayList<Principal> newPrincipalList = new ArrayList<Principal>();
            ArrayList<MerchantApplyRangeDetail> merchantApplyRangeDetailList = new ArrayList<MerchantApplyRangeDetail>();
            HashMap<String, String> isCreatorFalseMap = new HashMap<String, String>();
            if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeList)) {
                for (Map merchantApplyRange : merchantApplyRangeList) {
                    if (!Boolean.valueOf(merchantApplyRange.get("isCreator").toString()).booleanValue()) continue;
                    isCreatorMerchantApplyRangeList.add(merchantApplyRange);
                    map.put(merchantApplyRange.get("id").toString(), "isCreator1");
                }
            }
            if (!CollectionUtils.isEmpty((Collection)principalList)) {
                for (Map principal : principalList) {
                    if ("isCreator1".equals(map.get(principal.get("merchantApplyRangeId").toString()))) {
                        isCreatorPrincipalList.add(principal);
                        continue;
                    }
                    isCreatorFalseMap.put(principal.get("merchantApplyRangeId").toString(), "isCreatorFalse");
                }
            }
            if (!CollectionUtils.isEmpty(isCreatorPrincipalList)) {
                for (Map isCreatorPrincipal : isCreatorPrincipalList) {
                    for (Map merchantApplyRange : merchantApplyRangeList) {
                        if (!isCreatorPrincipal.get("merchantId").equals(merchantApplyRange.get("merchantId")) || isCreatorPrincipal.get("merchantApplyRangeId").equals(merchantApplyRange.get("id")) || isCreatorFalseMap.containsKey(merchantApplyRange.get("id").toString())) continue;
                        Principal principal = new Principal();
                        MerchantApplyRangeDetail merchantApplyRangeDetail = new MerchantApplyRangeDetail();
                        principal.setId((Object)IdManager.getInstance().nextId());
                        principal.setEntityStatus(EntityStatus.Insert);
                        principal.setMerchantId(Long.valueOf(isCreatorPrincipal.get("merchantId").toString()));
                        principal.setMerchantApplyRangeId(Long.valueOf(merchantApplyRange.get("id").toString()));
                        if (isCreatorPrincipal.containsKey("specialManagementDep")) {
                            principal.setSpecialManagementDep(isCreatorPrincipal.get("specialManagementDep").toString());
                            merchantApplyRangeDetail.setSpecialManagementDep(isCreatorPrincipal.get("specialManagementDep").toString());
                        }
                        if (isCreatorPrincipal.containsKey("professSalesman")) {
                            principal.setProfessSalesman(isCreatorPrincipal.get("professSalesman").toString());
                            merchantApplyRangeDetail.setProfessSalesman(isCreatorPrincipal.get("professSalesman").toString());
                        }
                        principal.setIsDefault(Boolean.valueOf(Boolean.parseBoolean(isCreatorPrincipal.get("isDefault").toString())));
                        newPrincipalList.add(principal);
                        merchantApplyRangeDetail.setMerchantApplyRangeId(Long.valueOf(merchantApplyRange.get("id").toString()));
                        merchantApplyRangeDetail.setEntityStatus(EntityStatus.Update);
                        merchantApplyRangeDetailList.add(merchantApplyRangeDetail);
                    }
                }
            }
            if (!CollectionUtils.isEmpty(newPrincipalList)) {
                MetaDaoHelper.insert((String)"aa.merchant.Principal", newPrincipalList);
            }
            if (!CollectionUtils.isEmpty(merchantApplyRangeDetailList)) {
                MetaDaoHelper.update((String)"aa.merchant.MerchantApplyRangeDetail", merchantApplyRangeDetailList);
            }
            resultList.put("no1", newPrincipalList);
        }
        return resultList;
    }

    public void setMerchantMaintenanceUpdate(List<MerchantApplyRangeDetail> merchantApplyRangeDetailList, List<CustomerArea> customerAreaList, List<Principal> principalList) {
        if (!CollectionUtils.isEmpty(merchantApplyRangeDetailList)) {
            for (MerchantApplyRangeDetail merchantApplyRangeDetail : merchantApplyRangeDetailList) {
                if (!CollectionUtils.isEmpty(customerAreaList)) {
                    for (CustomerArea customerArea : customerAreaList) {
                        if (!merchantApplyRangeDetail.getMerchantApplyRangeId().equals(customerArea.getmerchantApplyRangeId()) || !customerArea.getIsDefault().booleanValue()) continue;
                        merchantApplyRangeDetail.setCustomerArea(customerArea.getSaleAreaId());
                    }
                }
                if (CollectionUtils.isEmpty(principalList)) continue;
                for (Principal principal : principalList) {
                    if (!merchantApplyRangeDetail.getMerchantApplyRangeId().equals(principal.getMerchantApplyRangeId()) || !principal.getIsDefault().booleanValue()) continue;
                    merchantApplyRangeDetail.setSpecialManagementDep(principal.getSpecialManagementDep());
                    merchantApplyRangeDetail.setProfessSalesman(principal.getProfessSalesman());
                }
            }
        }
    }

    public List<Map<String, Object>> selectMerchantOfShop(BizObject bill) throws Exception {
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(bill.getId()), QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"businessRole").like((Object)"3"), QueryCondition.name((String)"businessRole").like((Object)"4"), QueryCondition.name((String)"businessRole").like((Object)"5")})}));
        List merchantRoleInfo = MetaDaoHelper.query((String)"aa.merchant.MerchantRoleInfo", (QuerySchema)querySchema);
        return merchantRoleInfo;
    }

    public void unStopExternalOrg(BizObject bill) throws Exception {
        List<Map<String, Object>> merchantRoleInfo = this.selectMerchantOfShop(bill);
        if (!CollectionUtils.isEmpty(merchantRoleInfo)) {
            this.iExternalOrgManagerService.enable(AppContext.getCurrentUser().getYhtTenantId(), null, bill.getId().toString());
        }
    }

    public void stopExternalOrg(BizObject bill) throws Exception {
        List<Map<String, Object>> merchantRoleInfo = this.selectMerchantOfShop(bill);
        if (!CollectionUtils.isEmpty(merchantRoleInfo)) {
            this.iExternalOrgManagerService.disable(AppContext.getCurrentUser().getYhtTenantId(), null, bill.getId().toString());
        }
    }

    public List<BdTransType> getBillTransTypeIdIsDefault() throws Exception {
        TransTypeQueryParam transTypeQueryParam = new TransTypeQueryParam();
        transTypeQueryParam.setFormId("AA.aa_merchant");
        transTypeQueryParam.setIsDefault(Integer.valueOf(1));
        transTypeQueryParam.setEnable(Integer.valueOf(1));
        transTypeQueryParam.setTenantId(AppContext.getCurrentUser().getYTenantId());
        List bdTransTypeList = this.iTransTypeService.queryTransTypes(transTypeQueryParam);
        if (CollectionUtils.isEmpty((Collection)bdTransTypeList)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800498);
        }
        return bdTransTypeList;
    }

    public List<BdTransType> checkBillTransTypeId(String transTypeId) throws Exception {
        if (StringUtils.isEmpty((CharSequence)transTypeId)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800499);
        }
        TransTypeQueryParam transTypeQueryParam = new TransTypeQueryParam();
        transTypeQueryParam.setId(transTypeId);
        transTypeQueryParam.setFormId("AA.aa_merchant");
        transTypeQueryParam.setTenantId(AppContext.getCurrentUser().getYTenantId());
        return this.iTransTypeService.queryTransTypes(transTypeQueryParam);
    }

    public Map<String, Object> setMerchantApply(String name, String orgId, String creditCode) throws Exception {
        Map resultMerchant;
        if (name == null || name.length() == 0 || orgId == null || orgId.length() == 0) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800500);
        }
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("yTenantId", AppContext.getCurrentUser().getYTenantId());
        params.put("name", name);
        if (creditCode != null && creditCode.length() > 0) {
            params.put("creditCode", creditCode);
        }
        if (CollectionUtils.isEmpty((Map)(resultMerchant = this.merchantDao.checkMerchant(params)))) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800501);
        }
        Merchant merchant = new Merchant();
        merchant.setId(resultMerchant.get("id"));
        if (resultMerchant.get("cName").toString() != null && resultMerchant.get("cCode").toString() != null) {
            merchant.setName(resultMerchant.get("cName").toString());
            merchant.setCode(resultMerchant.get("cCode").toString());
        }
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("merchantId,orgId");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(resultMerchant.get("id")), QueryCondition.name((String)"orgId").eq((Object)orgId), QueryCondition.name((String)"isPotential").eq((Object)false)}));
        List queryObject = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRange", (QuerySchema)querySchema, null);
        if (!CollectionUtils.isEmpty((Collection)queryObject)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800502, new Object[]{orgId});
        }
        if (creditCode == null || creditCode.length() > 0) {
            querySchema = QuerySchema.create();
            querySchema.addSelect("id");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"name").eq((Object)name)}));
            List queryMerchants = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)queryMerchants) && queryMerchants.size() > 1) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800503, new Object[]{name});
            }
        }
        List<MerchantApplyRange> creatorMerchantApplyRangeList = this.merchantGroupService.getCreatorMerchantApplyRangeById((Long)merchant.getId());
        ArrayList<MerchantApplyRange> merchantApplyRangeList = new ArrayList<MerchantApplyRange>();
        MerchantApplyRange merchantApplyRange = new MerchantApplyRange();
        merchantApplyRange.setId((Object)IdManager.getInstance().nextId());
        merchantApplyRange.setMerchantId((Long)merchant.getId());
        merchantApplyRange.setIsCreator(Boolean.valueOf(false));
        merchantApplyRange.setIsApplied(Boolean.valueOf(false));
        merchantApplyRange.setOrgId(orgId);
        merchantApplyRange.setRangeType(Integer.valueOf(1));
        merchantApplyRange.setShop(Long.valueOf(-1L));
        merchantApplyRange.setMerchantDetailId(creatorMerchantApplyRangeList.get(0).getMerchantDetailId());
        merchantApplyRange.setEntityStatus(EntityStatus.Insert);
        merchantApplyRangeList.add(merchantApplyRange);
        ArrayList<MerchantApplyRangeDetail> merchantApplyRangeDetailList = new ArrayList<MerchantApplyRangeDetail>();
        MerchantApplyRangeDetail merchantApplyRangeDetail = new MerchantApplyRangeDetail();
        merchantApplyRangeDetail.set("id", merchant.getId());
        merchantApplyRangeDetail.setMerchantApplyRangeId((Long)merchantApplyRange.getId());
        merchantApplyRangeDetail.setEntityStatus(EntityStatus.Insert);
        merchantApplyRangeDetail.setIsTradeCustomers(IsTradeCustomers.tradeCustomers.getValue());
        merchantApplyRangeDetailList.add(merchantApplyRangeDetail);
        merchant.setMerchantApplyRanges(merchantApplyRangeList);
        merchant.setMerchantAppliedDetail(merchantApplyRangeDetailList);
        merchant.setEntityStatus(EntityStatus.Update);
        MetaDaoHelper.update((String)"aa.merchant.Merchant", (BizObject)merchant);
        BizObject merchantName = new BizObject();
        merchantName.put("zh_CN", resultMerchant.get("cName"));
        merchantName.put("en_US", resultMerchant.get("cName2"));
        merchantName.put("zh_TW", resultMerchant.get("cName3"));
        resultMerchant.put("name", merchantName);
        BizObject merchantShortName = new BizObject();
        merchantShortName.put("zh_CN", resultMerchant.get("shortName"));
        merchantShortName.put("en_US", resultMerchant.get("shortName2"));
        merchantShortName.put("zh_TW", resultMerchant.get("shortName3"));
        resultMerchant.put("shortname", merchantShortName);
        resultMerchant.put("belongOrg", orgId);
        ArrayList<String> orgIdList = new ArrayList<String>();
        orgIdList.add(resultMerchant.get("createOrg").toString());
        orgIdList.add(orgId);
        List orgDTOS = this.orgUnitQueryService.getByCondition((String)AppContext.getYTenantId(), ConditionDTO.newCondition().withExternalOrg().andIdIn(orgIdList));
        if (!CollectionUtils.isEmpty((Collection)orgDTOS)) {
            for (OrgUnitDTO orgDto : orgDTOS) {
                if (orgDto != null && orgDto.getId() == resultMerchant.get("createOrg").toString()) {
                    resultMerchant.put("createOrg_name", orgDto.getName());
                    resultMerchant.put("createOrg_code", orgDto.getCode());
                }
                if (orgDto == null || orgDto.getId() != orgId) continue;
                resultMerchant.put("belongOrg_Name", orgDto.getName());
            }
        }
        BillDataDto bill = new BillDataDto("aa_merchant", resultMerchant.get("id").toString());
        params = new HashMap();
        params.put("@merchantApplyRangeId", merchantApplyRange.getId());
        bill.setMapCondition(params);
        resultMerchant.putAll(this.billService.detail(bill));
        return resultMerchant;
    }

    public List<Map<String, Object>> getMergerNameByRegionCode(String regionCode) throws Exception {
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("mergerName");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)regionCode)}));
        List regionCorpList = this.billQueryRepository.queryMapBySchema("aa.regioncorp.RegionCorp", querySchema);
        return regionCorpList;
    }

    public Map<String, Object> getRegionCorpByRegionName(String name) throws Exception {
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id,name,code,mergerName");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"name").eq((Object)name)}));
        List regionCorpList = MetaDaoHelper.query((String)"aa.regioncorp.RegionCorp", (QuerySchema)querySchema);
        if (!CollectionUtils.isEmpty((Collection)regionCorpList)) {
            return (Map)regionCorpList.get(0);
        }
        return null;
    }

    public List<AgentFinancial> pullOrgFinBankAcct(String internalOrgId) throws Exception {
        if (StringUtils.isEmpty((CharSequence)internalOrgId) || "".equals(internalOrgId)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800504);
        }
        ArrayList<AgentFinancial> agentFinancialList = new ArrayList<AgentFinancial>();
        EnterpriseParams enterpriseParams = new EnterpriseParams();
        enterpriseParams.setOrgid(internalOrgId);
        enterpriseParams.setPageIndex(1);
        enterpriseParams.setPageSize(2000);
        List enterpriseBankAcctVOList = this.iEnterpriseBankAcctService.queryByCondition(enterpriseParams);
        if (!CollectionUtils.isEmpty((Collection)enterpriseBankAcctVOList)) {
            for (EnterpriseBankAcctVO enterpriseBankAcctVO : enterpriseBankAcctVOList) {
                this.convertEnterpriseBankAcctVO(enterpriseBankAcctVO, agentFinancialList);
            }
            return agentFinancialList;
        }
        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800505);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String batchPullOrgFinBankAcct(List<MerchantBaseDTO> merchantBaseDTOs) throws Exception {
        String syncKey;
        block4: {
            String lockKey = "SYNC_MERCHANT_BANK_LOCKMERCHANT" + AppContext.getYTenantId();
            String lockValue = UUID.randomUUID().toString();
            syncKey = "SYNC_MERCHANT_BANK_LOCK" + AppContext.getYTenantId() + lockValue;
            try {
                if (RedisTool.tryGetLock((String)lockKey, (String)lockValue, (int)600)) {
                    ProcessData.builder((int)1, (int)200, null, null).percentage("20").build(syncKey, Integer.valueOf(600));
                    int totalCount = merchantBaseDTOs.size();
                    AtomicInteger successCount = new AtomicInteger();
                    AtomicInteger failCount = new AtomicInteger();
                    int capacity = 50;
                    ResultList resultList = new ResultList();
                    List paramSplitList = ListSplitUtil.splitListByCapacity(merchantBaseDTOs, (int)capacity);
                    RobotExecutors.runAs((String)((String)AppContext.getYTenantId()), () -> {
                        for (List merchantBaseDTOList : paramSplitList) {
                            int count = merchantBaseDTOList.size();
                            try {
                                this.pullOrgFinBankAcct(merchantBaseDTOList);
                                successCount.set(successCount.get() + count);
                            }
                            catch (Exception e) {
                                log.error("batchPullOrgFinBankAcct_error: ", (Object)e.getMessage(), (Object)e);
                                failCount.set(failCount.get() + count);
                                resultList.addInfo((Object)e.getMessage());
                                resultList.addErrorMessage(e.getMessage());
                                resultList.addFailInfo((Object)e.getMessage());
                            }
                            finally {
                                String percentage = String.valueOf((successCount.get() + failCount.get()) * 70 / totalCount + 20);
                                ProcessData.builder((int)1, (int)200, null, null).percentage(percentage).build(syncKey, Integer.valueOf(600));
                            }
                        }
                        resultList.setCount(failCount.get() + successCount.get());
                        resultList.setSucessCount(successCount.get());
                        resultList.setFailCount(failCount.get());
                        ProcessData.builder((int)1, (int)200, (Object)resultList, null).percentage("100").successCount(successCount.get()).failCount(failCount.get()).build(syncKey, Integer.valueOf(600));
                    }, (ExecutorService)this.ymsLongTaskExecutorService);
                    break block4;
                }
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_BATCH_PULL_ORG_FINBANKACCT);
            }
            finally {
                RedisTool.releaseLock((String)lockKey, (String)lockValue);
            }
        }
        return syncKey;
    }

    public void pullOrgFinBankAcct(List<MerchantBaseDTO> merchantBaseDTOs) throws Exception {
        if (!CollectionUtils.isEmpty(merchantBaseDTOs)) {
            List<AgentFinancial> saveAgentFinancialList;
            HashMap<String, Long> internalOrgIdMerchantIdMap = new HashMap<String, Long>();
            ArrayList<String> internalOrgIds = new ArrayList<String>();
            ArrayList<Long> merchantIds = new ArrayList<Long>();
            for (MerchantBaseDTO merchantBaseDTO : merchantBaseDTOs) {
                if (merchantBaseDTO == null || merchantBaseDTO.getId() == null || merchantBaseDTO.getInternalOrgId() == null) continue;
                internalOrgIds.add(merchantBaseDTO.getInternalOrgId());
                merchantIds.add(merchantBaseDTO.getId());
                internalOrgIdMerchantIdMap.put(merchantBaseDTO.getInternalOrgId(), merchantBaseDTO.getId());
            }
            if (CollectionUtils.isEmpty(internalOrgIds)) {
                return;
            }
            QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").in(merchantIds)});
            QuerySchema schema = QuerySchema.create().addSelect("id,merchantId,currency,bank,openBank,bankAccount").addCondition((ConditionExpression)condition);
            List agentFinancialList = MetaDaoHelper.queryObject((String)"aa.merchant.AgentFinancial", (QuerySchema)schema, null);
            HashMap<AgentFinancial, Long> agentFinancialMap = new HashMap<AgentFinancial, Long>();
            HashSet<Long> merchantIdSet = new HashSet<Long>();
            if (!CollectionUtils.isEmpty((Collection)agentFinancialList)) {
                for (AgentFinancial agentFinancial : agentFinancialList) {
                    Long id = (Long)agentFinancial.getId();
                    merchantIdSet.add(agentFinancial.getMerchantId());
                    agentFinancial.remove("id");
                    AgentFinancial agentFinancialSet = new AgentFinancial();
                    agentFinancialSet.setCurrency(agentFinancial.getCurrency());
                    agentFinancialSet.setBank(agentFinancial.getBank());
                    agentFinancialSet.setBankAccount(agentFinancial.getBankAccount());
                    agentFinancialSet.setOpenBank(agentFinancial.getOpenBank());
                    agentFinancialSet.setMerchantId(agentFinancial.getMerchantId());
                    if (agentFinancialMap.get(agentFinancialSet) != null) continue;
                    agentFinancialMap.put(agentFinancialSet, id);
                }
            }
            EnterpriseParams enterpriseParams = new EnterpriseParams();
            enterpriseParams.setOrgidList(internalOrgIds);
            enterpriseParams.setPageIndex(1);
            enterpriseParams.setPageSize(2000);
            List enterpriseBankAcctVOList = this.iEnterpriseBankAcctService.queryByCondition(enterpriseParams);
            if (!CollectionUtils.isEmpty((Collection)enterpriseBankAcctVOList) && !CollectionUtils.isEmpty(saveAgentFinancialList = this.buildAgentFinancial(enterpriseBankAcctVOList, internalOrgIdMerchantIdMap, merchantIdSet, agentFinancialMap))) {
                MetaDaoHelper.update((String)"aa.merchant.AgentFinancial", saveAgentFinancialList);
            }
        }
    }

    private List<AgentFinancial> buildAgentFinancial(List<EnterpriseBankAcctVO> enterpriseBankAcctVOList, Map<String, Long> internalOrgIdMerchantIdMap, Set<Long> merchantIdSet, Map<AgentFinancial, Long> agentFinancialMap) {
        ArrayList<AgentFinancial> saveAgentFinancialList = new ArrayList<AgentFinancial>();
        for (EnterpriseBankAcctVO enterpriseBankAcctVO : enterpriseBankAcctVOList) {
            Long merchantId = internalOrgIdMerchantIdMap.get(enterpriseBankAcctVO.getOrgid());
            List bankAcctCurrencyVOList = enterpriseBankAcctVO.getCurrencyList();
            if (!CollectionUtils.isEmpty((Collection)bankAcctCurrencyVOList)) {
                for (BankAcctCurrencyVO bankAcctCurrencyVO : bankAcctCurrencyVOList) {
                    AgentFinancial agentFinancial = this.convertEnterpriseBankAcctVO(enterpriseBankAcctVO);
                    if (!merchantIdSet.contains(merchantId) && "0".equals(enterpriseBankAcctVO.getAcctType())) {
                        agentFinancial.setIsDefault(Boolean.valueOf(true));
                        merchantIdSet.add(merchantId);
                    }
                    agentFinancial.setCurrency(bankAcctCurrencyVO.getCurrency());
                    agentFinancial.setMerchantId(merchantId);
                    saveAgentFinancialList.add(agentFinancial);
                }
                continue;
            }
            AgentFinancial agentFinancial = this.convertEnterpriseBankAcctVO(enterpriseBankAcctVO);
            if (!merchantIdSet.contains(merchantId) && "0".equals(enterpriseBankAcctVO.getAcctType())) {
                agentFinancial.setIsDefault(Boolean.valueOf(true));
                merchantIdSet.add(merchantId);
            }
            agentFinancial.setMerchantId(merchantId);
            saveAgentFinancialList.add(agentFinancial);
        }
        for (AgentFinancial saveAgentFinancial : saveAgentFinancialList) {
            AgentFinancial agentFinancialSet = new AgentFinancial();
            agentFinancialSet.setCurrency(saveAgentFinancial.getCurrency());
            agentFinancialSet.setBank(saveAgentFinancial.getBank());
            agentFinancialSet.setBankAccount(saveAgentFinancial.getBankAccount());
            agentFinancialSet.setOpenBank(saveAgentFinancial.getOpenBank());
            agentFinancialSet.setMerchantId(saveAgentFinancial.getMerchantId());
            if (agentFinancialMap.get(agentFinancialSet) != null) {
                saveAgentFinancial.setId((Object)agentFinancialMap.get(agentFinancialSet));
                saveAgentFinancial.setEntityStatus(EntityStatus.Update);
                continue;
            }
            saveAgentFinancial.setId((Object)IdManager.getInstance().nextId());
            if (saveAgentFinancial.getIsDefault() == null) {
                saveAgentFinancial.setIsDefault(Boolean.valueOf(false));
            }
            saveAgentFinancial.setEntityStatus(EntityStatus.Insert);
        }
        return saveAgentFinancialList;
    }

    public void convertEnterpriseBankAcctVO(EnterpriseBankAcctVO enterpriseBankAcctVO, List<AgentFinancial> agentFinancialList) {
        List bankAcctCurrencyVOList = enterpriseBankAcctVO.getCurrencyList();
        if (!CollectionUtils.isEmpty((Collection)bankAcctCurrencyVOList)) {
            for (BankAcctCurrencyVO bankAcctCurrencyVO : bankAcctCurrencyVOList) {
                AgentFinancial agentFinancial = this.convertEnterpriseBankAcctVO(enterpriseBankAcctVO);
                agentFinancial.setCurrency(bankAcctCurrencyVO.getCurrency());
                agentFinancial.set("currency_name", (Object)bankAcctCurrencyVO.getCurrencyName());
                agentFinancialList.add(agentFinancial);
            }
        } else {
            AgentFinancial agentFinancial = this.convertEnterpriseBankAcctVO(enterpriseBankAcctVO);
            agentFinancialList.add(agentFinancial);
        }
    }

    public AgentFinancial convertEnterpriseBankAcctVO(EnterpriseBankAcctVO enterpriseBankAcctVO) {
        AgentFinancial agentFinancial = new AgentFinancial();
        agentFinancial.setOrgFinBankAcct(enterpriseBankAcctVO.getId());
        agentFinancial.set("orgFinBankAcct_code", (Object)enterpriseBankAcctVO.getCode());
        agentFinancial.set("orgFinBankAcct_name", (Object)enterpriseBankAcctVO.getName());
        agentFinancial.setAccountType(Integer.valueOf(0));
        agentFinancial.setBank(enterpriseBankAcctVO.getBank());
        agentFinancial.set("bank_name", (Object)enterpriseBankAcctVO.getBankName());
        agentFinancial.setOpenBank(enterpriseBankAcctVO.getBankNumber());
        agentFinancial.set("openBank_name", (Object)enterpriseBankAcctVO.getBankNumberName());
        agentFinancial.setBankAccount(enterpriseBankAcctVO.getAccount());
        agentFinancial.setBankAccountName(enterpriseBankAcctVO.getAcctName());
        agentFinancial.setJointLineNo(enterpriseBankAcctVO.getLineNumber());
        agentFinancial.set("accountOpeningDate", (Object)enterpriseBankAcctVO.getAccountOpenDate());
        if (enterpriseBankAcctVO.getEnable() == 1) {
            agentFinancial.setStopstatus(Boolean.valueOf(false));
            agentFinancial.setStoptime(null);
        } else if (enterpriseBankAcctVO.getEnable() == 2) {
            agentFinancial.setStopstatus(Boolean.valueOf(true));
        }
        return agentFinancial;
    }

    public List<AgentFinancial> getAgentFinancialByOrgFinBankAcctId(String orgFinBankAcctId) throws Exception {
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id,currency");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"orgFinBankAcct").eq((Object)orgFinBankAcctId)}));
        List agentFinancialList = MetaDaoHelper.queryObject((String)"aa.merchant.AgentFinancial", (QuerySchema)querySchema, null);
        if (!CollectionUtils.isEmpty((Collection)agentFinancialList)) {
            return agentFinancialList;
        }
        return null;
    }

    public void updateOrgFinBankAcctSyncAgentFinancial(JSONObject orgFinBankAcctObject) throws Exception {
        String orgFinBankAcctId = String.valueOf(orgFinBankAcctObject.get((Object)"id"));
        List<AgentFinancial> originDataAgentFinancialList = this.getAgentFinancialByOrgFinBankAcctId(orgFinBankAcctId);
        if (!CollectionUtils.isEmpty(originDataAgentFinancialList)) {
            ArrayList<AgentFinancial> agentFinancialList = new ArrayList<AgentFinancial>();
            EnterpriseParams enterpriseParams = new EnterpriseParams();
            enterpriseParams.setId(orgFinBankAcctId);
            enterpriseParams.setPageIndex(1);
            enterpriseParams.setPageSize(2000);
            enterpriseParams.setEnables((List)new ArrayList(){
                {
                    this.add(0);
                    this.add(1);
                    this.add(2);
                }
            });
            List enterpriseBankAcctVOList = this.iEnterpriseBankAcctService.queryByCondition(enterpriseParams);
            if (!CollectionUtils.isEmpty((Collection)enterpriseBankAcctVOList)) {
                for (AgentFinancial originDataAgentFinancial : originDataAgentFinancialList) {
                    AgentFinancial agentFinancial = this.convertEnterpriseBankAcctVO((EnterpriseBankAcctVO)enterpriseBankAcctVOList.get(0));
                    agentFinancial.setId(originDataAgentFinancial.getId());
                    agentFinancial.setEntityStatus(EntityStatus.Update);
                    agentFinancialList.add(agentFinancial);
                }
                MetaDaoHelper.update((String)"aa.merchant.AgentFinancial", agentFinancialList);
            }
        }
    }

    public boolean judgeOrgFuncSalesOrg(String orgId) throws Exception {
        ArrayList<String> orgIdList = new ArrayList<String>();
        orgIdList.add(orgId);
        List<Map<String, Object>> salesOrgList = this.getSalesOrgListById(orgIdList);
        return !CollectionUtils.isEmpty(salesOrgList);
    }

    public void setLayoffIdForStopStatus(Merchant merchant) {
        List merchantApplyRangeDetails = merchant.merchantAppliedDetail();
        if (CollectionUtils.isEmpty((Collection)merchantApplyRangeDetails)) {
            return;
        }
        MerchantApplyRangeDetail merchantApplyRangeDetail = (MerchantApplyRangeDetail)merchantApplyRangeDetails.get(0);
        Boolean stopStatus = merchantApplyRangeDetail.getStopstatus();
        if (stopStatus == null || !stopStatus.booleanValue()) {
            merchantApplyRangeDetail.setLayoffId(null);
        } else {
            merchantApplyRangeDetail.setLayoffId((Long)AppContext.getCurrentUser().getId());
        }
    }

    public void setDefaultMobileForAreaMobile(List<Contacter> contacterList) {
        if (!CollectionUtils.isEmpty(contacterList)) {
            for (Contacter contacter : contacterList) {
                if (!StringUtils.isNotBlank((CharSequence)contacter.getAreaCodeMobile()) || !StringUtils.isBlank((CharSequence)contacter.getMobile())) continue;
                contacter.setMobile(contacter.getAreaCodeMobile());
            }
        }
    }

    public void getBillCodeDetail(Merchant merchant) {
        MerchantApplyRangeDetail merchantApplyRangeDetail;
        if (!CollectionUtils.isEmpty((Collection)merchant.merchantAppliedDetail()) && !StringUtils.isEmpty((CharSequence)(merchantApplyRangeDetail = (MerchantApplyRangeDetail)merchant.merchantAppliedDetail().get(0)).getSearchcode())) {
            merchant.set("merchantAppliedDetail!searchcode", (Object)merchantApplyRangeDetail.getSearchcode());
        }
    }

    public List<Map> checkBusinessterm(MerchantQryDTO merchantQryDTO) throws Exception {
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id,code,name,businessterm,creator,creatorId.yhtUserId as creatorId,principals.professSalesman.user_id as professSalesman,principals.specialManagementDep as specialManagementDep");
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        if (merchantQryDTO.getWarningDay() == null || merchantQryDTO.getWarningDay() >= 366) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800507);
        }
        Instant dateTime = Instant.now();
        Instant plus = dateTime.plus((long)merchantQryDTO.getWarningDay().intValue(), ChronoUnit.DAYS);
        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"businessterm").elt((Object)new Date(plus.toEpochMilli())));
        if (merchantQryDTO.getCreatorName() != null && merchantQryDTO.getCreatorName().length() > 0) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"creator").eq((Object)merchantQryDTO.getCreatorName()));
        }
        if (merchantQryDTO.getSpecialManagementDepCode() != null && merchantQryDTO.getSpecialManagementDepCode().length() > 0) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"principals.specialManagementDep.code").eq((Object)merchantQryDTO.getSpecialManagementDepCode()));
        }
        if (merchantQryDTO.getProfessSalesmanCode() != null && merchantQryDTO.getProfessSalesmanCode().length() > 0) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"principals.professSalesman.code").eq((Object)merchantQryDTO.getProfessSalesmanCode()));
        }
        querySchema.addCondition((ConditionExpression)queryConditionGroup);
        querySchema.addPager(1, 500);
        querySchema.distinct();
        List merchants = MetaDaoHelper.query((String)"aa.merchant.Merchant", (QuerySchema)querySchema, null);
        if (!CollectionUtils.isEmpty((Collection)merchants)) {
            for (Map merchant : merchants) {
                Instant instant = ((Date)merchant.get("businessterm")).toInstant();
                LocalDateTime endTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
                Long day = Duration.between(endTime, LocalDateTime.now()).toDays();
                merchant.put("day", day);
            }
            return merchants;
        }
        return null;
    }

    public List<Map> merchantQualsDocDueDateWarning(MerchantQualificationDocumentQryDTO qryDTO) throws Exception {
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("merchantId, merchantId.code as code, merchantId.name as name, licenseName, dueDate, licenseName.name as certificateName");
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        if (qryDTO.getWarningDay() == null || qryDTO.getWarningDay() >= 366) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800507);
        }
        Instant dateTime = Instant.now();
        Instant plus = dateTime.plus((long)qryDTO.getWarningDay().intValue(), ChronoUnit.DAYS);
        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"dueDate").elt((Object)new Date(plus.toEpochMilli())));
        if (StringUtils.isNotBlank((CharSequence)qryDTO.getLicenseName())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"licenseName").eq((Object)qryDTO.getLicenseName()));
        }
        querySchema.addCondition((ConditionExpression)queryConditionGroup);
        querySchema.addPager(1, 100);
        List merchants = MetaDaoHelper.query((String)"aa.merchant.MerchantQualificationDocument", (QuerySchema)querySchema, null);
        if (!CollectionUtils.isEmpty((Collection)merchants)) {
            for (Map merchant : merchants) {
                Instant instant = ((Date)merchant.get("dueDate")).toInstant();
                LocalDateTime endTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
                Long day = Duration.between(endTime, LocalDateTime.now()).toDays();
                merchant.put("day", day);
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                String formattedDateTime = endTime.format(formatter);
                merchant.put("dueDate", formattedDateTime);
                merchant.put("warningDay", qryDTO.getWarningDay());
            }
            return merchants;
        }
        return null;
    }

    public void cascadeDisable(Long merchantId) throws Exception {
        boolean channelOperateCenter = MerchantUtils.getChannelOperateCenter();
        Merchant merchant = new Merchant();
        merchant.setId((Object)merchantId);
        try {
            HashMap<String, Object> params = new HashMap<String, Object>();
            if (channelOperateCenter) {
                this.incrUnionKeyCheckLicense((BizObject)merchant, false);
            }
            params.put("merchantid", merchantId);
            params.put("layoff_id", AppContext.getCurrentUser().getId());
            params.put("yTenantId", AppContext.getCurrentUser().getYTenantId());
            SqlHelper.update((String)"com.yonyoucloud.upc.option.dao.merchant.disableMerchant", params);
            SqlHelper.update((String)"com.yonyoucloud.upc.merchant.dao.merchantGroup.disableMerchantDetail", params);
            List<MerchantApplyRange> merchantApplyRangeList = this.getMerchantApplyRangeByMerchantId(merchantId);
            this.cascadeOldEvent(merchantApplyRangeList, true);
            this.cascadeNewEvent(merchantApplyRangeList, true);
            this.cascadeBusiness(merchantApplyRangeList, "stop", "cascadeDisable", "UID:P_COREDOC-BE_194796BA04F00004");
        }
        catch (Exception e) {
            if (channelOperateCenter) {
                this.decrUnionKeyCheckLicense((BizObject)merchant, false);
            }
            throw new RuntimeException(e);
        }
    }

    public void cascadeEnable(Long merchantId) throws Exception {
        boolean channelOperateCenter = MerchantUtils.getChannelOperateCenter();
        Merchant merchant = new Merchant();
        merchant.setId((Object)merchantId);
        try {
            HashMap<String, Object> params = new HashMap<String, Object>();
            if (channelOperateCenter) {
                this.decrUnionKeyCheckLicense((BizObject)merchant, false);
            }
            params.put("merchantid", merchantId);
            params.put("yTenantId", AppContext.getCurrentUser().getYTenantId());
            SqlHelper.update((String)"com.yonyoucloud.upc.option.dao.merchant.enableMerchant", params);
            SqlHelper.update((String)"com.yonyoucloud.upc.merchant.dao.merchantGroup.enableMerchantDetail", params);
            List<MerchantApplyRange> merchantApplyRangeList = this.getMerchantApplyRangeByMerchantId(merchantId);
            this.cascadeOldEvent(merchantApplyRangeList, false);
            this.cascadeNewEvent(merchantApplyRangeList, false);
            this.cascadeBusiness(merchantApplyRangeList, "unstop", "cascadeEnable", "UID:P_COREDOC-BE_1947968805580000");
        }
        catch (Exception e) {
            if (channelOperateCenter) {
                this.incrUnionKeyCheckLicense((BizObject)merchant, false);
            }
            throw new RuntimeException(e);
        }
    }

    public void cascadeOldEvent(List<MerchantApplyRange> merchantApplyRangeList, boolean stopStatus) {
        if (CollectionUtils.isEmpty(merchantApplyRangeList)) {
            return;
        }
        Runnable runnable = () -> {
            for (MerchantApplyRange merchantApplyRange : merchantApplyRangeList) {
                try {
                    HashMap<String, Object> businessObject = new HashMap<String, Object>();
                    ArrayList<Object> merchantApplyRangeIds = new ArrayList<Object>();
                    merchantApplyRangeIds.add(merchantApplyRange.getId());
                    businessObject.put("ids", merchantApplyRangeIds);
                    businessObject.put("fullname", "aa.merchant.Merchant");
                    if (stopStatus) {
                        this.eventService2.sendEvent("YXYBASEDOC", "STOP_NOTIFY", businessObject);
                        continue;
                    }
                    this.eventService2.sendEvent("YXYBASEDOC", "UNSTOP_NOTIFY", businessObject);
                }
                catch (Exception e) {
                    this.logger.error("\u7ea7\u8054\u542f\u7528\u3001\u505c\u7528\u53d1\u9001\u6d88\u606f\u5f02\u5e38" + e.getMessage(), (Throwable)e);
                }
            }
        };
        RobotExecutors.runAs((String)((String)AppContext.getYTenantId()), (Runnable)runnable, (ExecutorService)this.ymsLongTaskExecutorService);
    }

    public void cascadeNewEvent(List<MerchantApplyRange> merchantApplyRangeList, boolean stopStatus) {
        if (CollectionUtils.isEmpty(merchantApplyRangeList)) {
            return;
        }
        Runnable runnable = () -> {
            for (MerchantApplyRange merchantApplyRange : merchantApplyRangeList) {
                try {
                    HashMap<String, Object> businessObject = new HashMap<String, Object>();
                    HashMap<String, Object> archive = new HashMap<String, Object>();
                    archive.put("id", merchantApplyRange.getMerchantId());
                    archive.put("_entityName", "aa.merchant.Merchant");
                    String jsonStr = JSONObject.toJSONString(archive, (SerializerFeature[])new SerializerFeature[]{SerializerFeature.WriteDateUseDateFormat});
                    businessObject.put("archive", jsonStr);
                    businessObject.put("fullname", "aa.merchant.Merchant");
                    if (stopStatus) {
                        this.eventService2.sendEvent("YXYBASEDOC", EventType.AA_MERCHANTLIST_STOP.toString(), businessObject);
                        continue;
                    }
                    this.eventService2.sendEvent("YXYBASEDOC", EventType.AA_MERCHANTLIST_UNSTOP.toString(), businessObject);
                }
                catch (Exception e) {
                    this.logger.error("\u7ea7\u8054\u542f\u7528\u3001\u505c\u7528\u53d1\u9001\u6d88\u606f\u5f02\u5e38" + e.getMessage(), (Throwable)e);
                }
            }
        };
        RobotExecutors.runAs((String)((String)AppContext.getYTenantId()), (Runnable)runnable, (ExecutorService)this.ymsLongTaskExecutorService);
    }

    public void cascadeBusiness(List<MerchantApplyRange> merchantApplyRangeList, String action, String typeCode, String typeName) {
        if (CollectionUtils.isEmpty(merchantApplyRangeList)) {
            return;
        }
        Runnable runnable = () -> {
            for (MerchantApplyRange merchantApplyRange : merchantApplyRangeList) {
                try {
                    HashMap<String, Object> params = new HashMap<String, Object>(3);
                    params.put("@merchantApplyRangeId", merchantApplyRange.getId());
                    params.put("isCreator", merchantApplyRange.getIsCreator());
                    params.put("isApplied", merchantApplyRange.getIsApplied());
                    BillDataDto bill = new BillDataDto("aa_merchant", merchantApplyRange.getMerchantId().toString());
                    bill.setMapCondition(params);
                    Map detail = this.billService.detail(bill);
                    BusinessObject businessObject = BusiObjectBuildUtil.buildByField((String)"id", (String)"code", (String)"name", (String)"aa_merchant", (OperCodeTypes)OperCodeTypes.getByCode((String)action), (String)typeCode, (String)typeName, (Object)detail);
                    this.businessLogService.saveBusinessLog(businessObject);
                }
                catch (Exception e) {
                    this.logger.error("\u7ea7\u8054\u542f\u7528\u3001\u505c\u7528\u4e1a\u52a1\u65e5\u5fd7\u5f02\u5e38" + e.getMessage(), (Throwable)e);
                }
            }
        };
        RobotExecutors.runAs((String)((String)AppContext.getYTenantId()), (Runnable)runnable, (ExecutorService)this.ymsLongTaskExecutorService);
    }

    public List<MerchantApplyRange> getMerchantApplyRangeByMerchantId(Long merchantId) throws Exception {
        QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq((Object)merchantId), QueryCondition.name((String)"isPotential").eq((Object)false)});
        QuerySchema schema = QuerySchema.create().addSelect("id,merchantId,isCreator,isApplied").addCondition((ConditionExpression)condition);
        return MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRange", (QuerySchema)schema, null);
    }

    public void updateOpenBankSyncAgentFinancial(JSONObject openBankObject) throws Exception {
        if (MerchantUtils.getBankInfoAutoUpdate()) {
            AgentFinancial agentFinancial = this.buildUpdateOpenBankSyncAgentFinancial(openBankObject);
            if (agentFinancial == null) {
                return;
            }
            SqlHelper.update((String)"com.yonyoucloud.upc.option.dao.merchant.updateOpenBankSyncAgentFinancial", (Object)agentFinancial);
            List<AgentFinancial> originDataAgentFinancialList = this.getAgentFinancialByOpenBank(agentFinancial.getOpenBank());
            if (!CollectionUtils.isEmpty(originDataAgentFinancialList)) {
                HashSet<Long> merchantIdSet = new HashSet<Long>();
                for (AgentFinancial originDataAgentFinancial : originDataAgentFinancialList) {
                    merchantIdSet.add(originDataAgentFinancial.getMerchantId());
                }
                this.updateOpenBankSyncBusiness(merchantIdSet, "update", "updateOpenBankSyncAgentFinancial", "\u94f6\u884c\u7f51\u70b9\u53d8\u66f4");
            }
        }
    }

    public List<AgentFinancial> getAgentFinancialByOpenBank(String openBankId) throws Exception {
        Long id = 0L;
        int realMaxRowsValue = this.ymsParamConfig.getResultMaxRowsValue() - 1;
        List<AgentFinancial> agentFinancialInDbList = this.getAgentFinancialByOpenBankByMinId(openBankId, id, realMaxRowsValue);
        ArrayList<AgentFinancial> agentFinancialInDb = new ArrayList<AgentFinancial>(agentFinancialInDbList);
        while (agentFinancialInDbList.size() >= realMaxRowsValue) {
            id = (Long)agentFinancialInDbList.get(agentFinancialInDbList.size() - 1).getId();
            agentFinancialInDbList = this.getAgentFinancialByOpenBankByMinId(openBankId, id, realMaxRowsValue);
            agentFinancialInDb.addAll(agentFinancialInDbList);
        }
        return agentFinancialInDb;
    }

    public List<AgentFinancial> getAgentFinancialByOpenBankByMinId(String openBankId, Long minId, int realMaxRowsValue) throws Exception {
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id,merchantId");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").gt((Object)minId), QueryCondition.name((String)"openBank").eq((Object)openBankId)}));
        querySchema.addOrderBy("id");
        QueryPager queryPager = new QueryPager();
        queryPager.setPageIndex(1);
        queryPager.setPageSize(realMaxRowsValue);
        querySchema.pager(queryPager);
        return MetaDaoHelper.queryObject((String)"aa.merchant.AgentFinancial", (QuerySchema)querySchema, null);
    }

    public void updateOpenBankSyncBusiness(HashSet<Long> merchantIdList, String action, String typeCode, String typeName) {
        if (CollectionUtils.isEmpty(merchantIdList)) {
            return;
        }
        for (Long merchantId : merchantIdList) {
            try {
                BillDataDto bill = new BillDataDto("aa_merchant", merchantId.toString());
                Map detail = this.billService.detail(bill);
                BusinessObject businessObject = BusiObjectBuildUtil.buildByField((String)"id", (String)"code", (String)"name", (String)"aa_merchant", (OperCodeTypes)OperCodeTypes.getByCode((String)action), (String)typeCode, (String)typeName, (Object)detail);
                this.businessLogService.saveBusinessLog(businessObject);
            }
            catch (Exception e) {
                this.logger.error("\u76d1\u542c\u94f6\u884c\u7f51\u70b9\u53d8\u66f4\u4e8b\u4ef6\u53d1\u9001\u4e1a\u52a1\u65e5\u5fd7\u5f02\u5e38" + e.getMessage(), (Throwable)e);
            }
        }
    }

    public Set<String> checkCustCategoryOrg(ApplyRangeOrgDTO dto) throws Exception {
        HashSet<String> orgIdSet = new HashSet<String>();
        if (dto.getId() == null || CollectionUtils.isEmpty(dto.getOrgIds())) {
            return orgIdSet;
        }
        QuerySchema schema = QuerySchema.create().addSelect("createOrg").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"customerClass").eq((Object)dto.getId()), QueryCondition.name((String)"createOrg").in(dto.getOrgIds())}));
        List merchantList = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (QuerySchema)schema, null);
        if (!CollectionUtils.isEmpty((Collection)merchantList)) {
            for (Merchant merchant : merchantList) {
                if (merchant.getCreateOrg() == null) continue;
                orgIdSet.add(merchant.getCreateOrg());
            }
        }
        return orgIdSet;
    }

    public Set<String> checkSaleareaOrg(ApplyRangeOrgDTO dto) throws Exception {
        HashSet<String> orgIdSet = new HashSet<String>();
        if (dto.getId() == null || CollectionUtils.isEmpty(dto.getOrgIds())) {
            return orgIdSet;
        }
        QuerySchema schema = QuerySchema.create().addSelect("merchantId.createOrg as orgId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"saleAreaId").eq((Object)dto.getId()), QueryCondition.name((String)"merchantId.createOrg").in(dto.getOrgIds())}));
        List merchantList = MetaDaoHelper.query((String)"aa.merchant.CustomerArea", (QuerySchema)schema);
        if (!CollectionUtils.isEmpty((Collection)merchantList)) {
            for (Map merchant : merchantList) {
                if (merchant.get("orgId") == null) continue;
                orgIdSet.add(merchant.get("orgId").toString());
            }
        }
        return orgIdSet;
    }

    private AgentFinancial buildUpdateOpenBankSyncAgentFinancial(JSONObject openBankObject) {
        String openBankId = String.valueOf(openBankObject.get((Object)"id"));
        if ("null".equals(openBankId)) {
            return null;
        }
        String bank = String.valueOf(openBankObject.get((Object)"bank"));
        String country = String.valueOf(openBankObject.get((Object)"country"));
        String jointLineNo = String.valueOf(openBankObject.get((Object)"linenumber"));
        String swiftCode = String.valueOf(openBankObject.get((Object)"swiftCode"));
        if ("null".equals(bank) && "null".equals(country) && "null".equals(jointLineNo) && "null".equals(swiftCode)) {
            return null;
        }
        AgentFinancial agentFinancial = new AgentFinancial();
        agentFinancial.setOpenBank(openBankId);
        if (!"null".equals(bank)) {
            agentFinancial.setBank(bank);
        }
        if (!"null".equals(country)) {
            agentFinancial.setCountry(country);
        }
        if (!"null".equals(jointLineNo)) {
            agentFinancial.setJointLineNo(jointLineNo);
        }
        if (!"null".equals(swiftCode)) {
            agentFinancial.setSwiftCode(swiftCode);
        }
        agentFinancial.set("ytenant", (Object)AppContext.getCurrentUser().getYTenantId());
        return agentFinancial;
    }

    public void inspectCharacterStatus(Merchant merchant) throws Exception {
        if (merchant.containsKey((Object)"importSpecialKey_merchant") || merchant.containsKey((Object)"data_from") || merchant.containsKey((Object)"_fromApi")) {
            this.inspectMerchantCharacterStatus(merchant);
            this.inspectAddressInfoCharacterStatus(merchant.merchantAddressInfos());
            this.inspectContactCharacterStatus(merchant.merchantContacterInfos());
            this.inspectAgentFinancialCharacterStatus(merchant.merchantAgentFinancialInfos());
            this.inspectAgentInvoiceCharacterStatus(merchant.merchantAgentInvoiceInfos());
            this.inspectPrincipalCharacterStatus(merchant.principals());
            this.inspectCustomerAreaCharacterStatus(merchant.customerAreas());
        }
    }

    public void updateMerchantDetailCharacter(Merchant merchant, MerchantApplyRange currentSaveMerchantApplyRange, MerchantDetail updateMerchantDetail, MerchantApplyRangeDetail updateMerchantApplyRangeDetail) throws Exception {
        if (merchant.containsKey((Object)"importSpecialKey_merchant") || merchant.containsKey((Object)"data_from") || merchant.containsKey((Object)"_fromApi")) {
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("id, merchantApplyRangeDetailCharacter");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(new Object[]{currentSaveMerchantApplyRange.getMerchantDetailId()})}));
            Map merchantDetailCharacter = MetaDaoHelper.queryOne((String)"aa.merchant.MerchantDetail", (QuerySchema)querySchema);
            String merchantDetailCharacterId = null;
            if (merchantDetailCharacter != null) {
                if (merchantDetailCharacter.get("merchantApplyRangeDetailCharacter") instanceof String) {
                    merchantDetailCharacterId = (String)merchantDetailCharacter.get("merchantApplyRangeDetailCharacter");
                    updateMerchantDetail.setMerchantApplyRangeDetailCharacter(merchantDetailCharacterId);
                } else if (merchantDetailCharacter.get("merchantApplyRangeDetailCharacter") instanceof Map && ((HashMap)merchantDetailCharacter.get("merchantApplyRangeDetailCharacter")).get("id") != null) {
                    HashMap merchantDetailCharacterMap = (HashMap)merchantDetailCharacter.get("merchantApplyRangeDetailCharacter");
                    merchantDetailCharacterId = merchantDetailCharacterMap.get("id").toString();
                    updateMerchantDetail.setMerchantApplyRangeDetailCharacter(merchantDetailCharacterId);
                }
            }
            if (merchantDetailCharacterId != null) {
                if (updateMerchantApplyRangeDetail.get("merchantApplyRangeDetailCharacter") instanceof String) {
                    updateMerchantApplyRangeDetail.put("merchantApplyRangeDetailCharacter", (Object)merchantDetailCharacterId);
                } else if (updateMerchantApplyRangeDetail.get("merchantApplyRangeDetailCharacter") instanceof Map) {
                    ((HashMap)updateMerchantApplyRangeDetail.get("merchantApplyRangeDetailCharacter")).put("id", merchantDetailCharacterId);
                    ((HashMap)updateMerchantApplyRangeDetail.get("merchantApplyRangeDetailCharacter")).put("_status", EntityStatus.Update);
                }
            }
        }
    }

    public void inspectMerchantCharacterStatus(Merchant merchant) throws Exception {
        if (merchant.getEntityStatus() == EntityStatus.Update && merchant.containsKey((Object)"merchantCharacter")) {
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("merchantCharacter.id as characterId");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(merchant.getId())}));
            List merchantInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)merchantInDbList)) {
                BizObject merchantCharacter = merchant.getBizObject("merchantCharacter", BizObject.class);
                merchantCharacter.setId(((Merchant)merchantInDbList.get(0)).get("characterId"));
                merchantCharacter.setEntityStatus(EntityStatus.Update);
            }
        }
    }

    public <T extends BizObject> void inspectLongIdListCharacterStatus(List<T> bizObjectList, String characterFullName, String entityFullName) throws Exception {
        if (!CollectionUtils.isEmpty(bizObjectList)) {
            ArrayList<Long> inspectBizObjectIdList = new ArrayList<Long>();
            for (BizObject bizObject : bizObjectList) {
                if (bizObject.getEntityStatus() != EntityStatus.Update || !bizObject.containsKey((Object)characterFullName)) continue;
                inspectBizObjectIdList.add((Long)bizObject.getId());
            }
            if (!CollectionUtils.isEmpty(inspectBizObjectIdList)) {
                QuerySchema querySchema = QuerySchema.create();
                String select = "id," + characterFullName + ".id as characterId";
                querySchema.addSelect(select);
                querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(inspectBizObjectIdList)}));
                List bizObjectInDbList = MetaDaoHelper.queryObject((String)entityFullName, (QuerySchema)querySchema, null);
                if (!CollectionUtils.isEmpty((Collection)bizObjectInDbList)) {
                    String bizObjectId;
                    HashMap<String, String> bizObjectMap = new HashMap<String, String>();
                    for (BizObject bizObject : bizObjectInDbList) {
                        bizObjectId = bizObject.getId().toString();
                        String characterId = null;
                        if (bizObject.get("characterId") != null) {
                            characterId = bizObject.get("characterId").toString();
                        }
                        bizObjectMap.put(bizObjectId, characterId);
                    }
                    for (BizObject bizObject : bizObjectList) {
                        if (bizObject.getEntityStatus() != EntityStatus.Update || bizObject.getId() == null || !bizObject.containsKey((Object)characterFullName) || bizObjectMap.get(bizObjectId = bizObject.getId().toString()) == null) continue;
                        BizObject character = bizObject.getBizObject(characterFullName, BizObject.class);
                        character.setId(bizObjectMap.get(bizObjectId));
                        character.setEntityStatus(EntityStatus.Update);
                    }
                }
            }
        }
    }

    public void inspectMerchantDetailCharacterStatus(List<MerchantApplyRangeDetail> merchantApplyRangeDetailList) throws Exception {
        if (this.pubOptionDataQueryUtil.isCloseMerchantModelDoubleWrite()) {
            return;
        }
        if (!CollectionUtils.isEmpty(merchantApplyRangeDetailList)) {
            ArrayList<Long> inspectBizObjectIdList = new ArrayList<Long>();
            for (MerchantApplyRangeDetail merchantApplyRangeDetail : merchantApplyRangeDetailList) {
                if (merchantApplyRangeDetail.getEntityStatus() != EntityStatus.Update || !merchantApplyRangeDetail.containsKey((Object)"merchantApplyRangeDetailCharacter")) continue;
                inspectBizObjectIdList.add(merchantApplyRangeDetail.getMerchantApplyRangeId());
            }
            if (!CollectionUtils.isEmpty(inspectBizObjectIdList)) {
                QuerySchema querySchema = QuerySchema.create();
                querySchema.addSelect("merchantApplyRangeId,merchantApplyRangeDetailCharacter.id as characterId");
                querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantApplyRangeId").in(inspectBizObjectIdList)}));
                List bizObjectInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRangeDetail", (QuerySchema)querySchema, null);
                if (!CollectionUtils.isEmpty((Collection)bizObjectInDbList)) {
                    String bizObjectId;
                    HashMap<String, String> bizObjectMap = new HashMap<String, String>();
                    for (MerchantApplyRangeDetail merchantApplyRangeDetail : bizObjectInDbList) {
                        bizObjectId = merchantApplyRangeDetail.getMerchantApplyRangeId().toString();
                        String characterId = null;
                        if (merchantApplyRangeDetail.get("characterId") != null) {
                            characterId = merchantApplyRangeDetail.get("characterId").toString();
                        }
                        bizObjectMap.put(bizObjectId, characterId);
                    }
                    for (MerchantApplyRangeDetail merchantApplyRangeDetail : merchantApplyRangeDetailList) {
                        if (merchantApplyRangeDetail.getEntityStatus() != EntityStatus.Update || merchantApplyRangeDetail.getMerchantApplyRangeId() == null || !merchantApplyRangeDetail.containsKey((Object)"merchantApplyRangeDetailCharacter") || bizObjectMap.get(bizObjectId = merchantApplyRangeDetail.getMerchantApplyRangeId().toString()) == null) continue;
                        BizObject character = merchantApplyRangeDetail.getBizObject("merchantApplyRangeDetailCharacter", BizObject.class);
                        character.setId(bizObjectMap.get(bizObjectId));
                        character.setEntityStatus(EntityStatus.Update);
                    }
                }
            }
        }
    }

    public void inspectAddressInfoCharacterStatus(List<AddressInfo> addressInfoList) throws Exception {
        this.inspectLongIdListCharacterStatus(addressInfoList, "addressInfoCharacter", "aa.merchant.AddressInfo");
    }

    public void inspectContactCharacterStatus(List<Contacter> contacterList) throws Exception {
        this.inspectLongIdListCharacterStatus(contacterList, "contacterCharacter", "aa.merchant.Contacter");
    }

    public void inspectAgentFinancialCharacterStatus(List<AgentFinancial> agentFinancialList) throws Exception {
        this.inspectLongIdListCharacterStatus(agentFinancialList, "agentFinancialCharacter", "aa.merchant.AgentFinancial");
    }

    public void inspectAgentInvoiceCharacterStatus(List<AgentInvoice> agentInvoiceList) throws Exception {
        this.inspectLongIdListCharacterStatus(agentInvoiceList, "agentInvoiceCharacter", "aa.merchant.AgentInvoice");
    }

    public void inspectPrincipalCharacterStatus(List<Principal> principalList) throws Exception {
        this.inspectLongIdListCharacterStatus(principalList, "principalCharacter", "aa.merchant.Principal");
    }

    public void inspectCustomerAreaCharacterStatus(List<CustomerArea> customerAreaList) throws Exception {
        this.inspectLongIdListCharacterStatus(customerAreaList, "customerAreaCharacter", "aa.merchant.CustomerArea");
    }

    public void assignerMerchantApplyRange(Merchant merchant, BillDataDto billDataDto) {
        if (CollectionUtils.isEmpty((Collection)merchant.merchantApplyRanges())) {
            return;
        }
        if (MerchantUtils.isExists((Map)merchant, (String)"srcBill") && "CRM".equals(merchant.get("srcBill"))) {
            this.assignerMerchantApplyRangeSource(merchant, AddMerchantRangeSourceEnum.CRM_SUIT_ORG);
        } else if ("customerapply".equals(merchant.get("customerapply"))) {
            this.assignerMerchantApplyRangeSource(merchant, AddMerchantRangeSourceEnum.CUSTOMER_APPLY_SUIT_ORG);
        } else if (Integer.valueOf(2).equals(billDataDto.getConvertType()) || Integer.valueOf(3).equals(billDataDto.getConvertType())) {
            this.assignerMerchantApplyRangeSource(merchant, AddMerchantRangeSourceEnum.API_SUIT_ORG);
        } else if (Integer.valueOf(1).equals(billDataDto.getConvertType()) || merchant.containsKey((Object)"data_from")) {
            this.assignerMerchantApplyRangeSource(merchant, AddMerchantRangeSourceEnum.YQL_SUIT_ORG);
        } else if (Integer.valueOf(0).equals(billDataDto.getConvertType()) && "aa_merchantexport".equals(billDataDto.getBillnum())) {
            this.assignerMerchantApplyRangeSource(merchant, AddMerchantRangeSourceEnum.IMPORT_SUIT_ORG);
        } else if (Integer.valueOf(0).equals(billDataDto.getConvertType()) && "aa_merchant".equals(billDataDto.getBillnum()) && merchant.containsKey((Object)"importSpecialKey_merchant")) {
            this.assignerMerchantApplyRangeSource(merchant, AddMerchantRangeSourceEnum.IMPORT_SUIT_ORG);
        } else if (!CollectionUtils.isEmpty((Map)billDataDto.getMapCondition()) && BooleanUtil.isTrue(billDataDto.getMapCondition().get("isChannelCustomer"))) {
            this.assignerMerchantApplyRangeSource(merchant, AddMerchantRangeSourceEnum.UDH_SUIT_ORG);
        } else {
            this.assignerMerchantApplyRangeSource(merchant, AddMerchantRangeSourceEnum.SAVE_SUIT_ORG);
        }
    }

    public void assignerMerchantApplyRangeSource(Merchant merchant, AddMerchantRangeSourceEnum source) {
        List merchantApplyRangeList = merchant.merchantApplyRanges();
        if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeList)) {
            for (MerchantApplyRange merchantApplyRange : merchantApplyRangeList) {
                if (merchantApplyRange.getEntityStatus() != EntityStatus.Insert) continue;
                if (merchantApplyRange.getAllocatorName() == null) {
                    merchantApplyRange.setAllocatorName(AppContext.getCurrentUser().getName());
                }
                if (merchantApplyRange.getAllocatorId() == null) {
                    merchantApplyRange.setAllocatorId((Long)AppContext.getCurrentUser().getId());
                }
                merchantApplyRange.setAllocateSource(source.getName());
                merchantApplyRange.setAllocateTime(new Date());
            }
        }
    }

    public void assignerMerchantApplyRangeFromCustomerApply(Merchant merchant) {
        List merchantApplyRangeList = merchant.merchantApplyRanges();
        if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeList)) {
            for (MerchantApplyRange merchantApplyRange : merchantApplyRangeList) {
                if (merchantApplyRange.getEntityStatus() != EntityStatus.Insert) continue;
                if (merchantApplyRange.getAllocatorName() == null) {
                    merchantApplyRange.setAllocatorName(AppContext.getCurrentUser().getName());
                }
                if (merchantApplyRange.get("allocatorId") != null || AppContext.getCurrentUser().getId() == null) continue;
                merchantApplyRange.set("allocatorId", (Object)AppContext.getCurrentUser().getId().toString());
            }
        }
    }

    public String allocateSaleAreaAsyncKey(MerchantAllocateDTO merchantAllocateDTO) {
        String requestId = UUID.randomUUID().toString();
        String asyncKey = "allocateSaleArea" + AppContext.getCurrentUser().getYTenantId() + requestId;
        String allocateMerchantLockKey = "allocateMerchantLockKey" + AppContext.getCurrentUser().getYTenantId();
        int expireTime = 600;
        try {
            String expireTimeConfig = this.ymsParamConfig.getMddExportProcessExpireTime();
            if (null != expireTimeConfig) {
                expireTime = Integer.parseInt(expireTimeConfig);
            }
        }
        catch (Exception var8) {
            log.error("\u6279\u6539-\u5f02\u6b65\u83b7\u53d6\u7f13\u5b58\u8d85\u65f6\u65f6\u95f4\u5f02\u5e38\uff0c\u8d70\u9ed8\u8ba4\u914d\u7f6e600\u79d2");
        }
        merchantAllocateDTO.setAsyncKey(asyncKey);
        merchantAllocateDTO.setExpireTime(expireTime);
        ProcessData.builder((int)1, (int)200, null, null).percentage("0").build(merchantAllocateDTO.getAsyncKey(), Integer.valueOf(merchantAllocateDTO.getExpireTime()));
        UserExecutors.executeInDetachedThread((ExecutorService)this.ymsLongTaskExecutorService, () -> {
            block6: {
                try {
                    if (RedisTool.tryGetLock((String)allocateMerchantLockKey, (String)requestId, (int)3600)) {
                        this.allocateSaleArea(merchantAllocateDTO);
                        break block6;
                    }
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800508);
                }
                catch (Exception e) {
                    ResultList resultList = new ResultList();
                    resultList.addFailInfo((Object)e.getMessage());
                    resultList.addErrorMessage(e.getMessage());
                    resultList.setFailCount(1);
                    resultList.setCount(1);
                    ProcessData.builder((int)1, (int)200, (Object)resultList, (String)InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1CAB224004380039", (String)"\u5206\u914d\u9500\u552e\u533a\u57df\u5931\u8d25")).percentage("100").successCount(0).failCount(1).build(merchantAllocateDTO.getAsyncKey(), Integer.valueOf(merchantAllocateDTO.getExpireTime()));
                }
                finally {
                    RedisTool.releaseLock((String)allocateMerchantLockKey, (String)requestId);
                }
            }
        });
        return asyncKey;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void allocateSaleArea(MerchantAllocateDTO merchantAllocateDTO) throws Exception {
        if (CollectionUtils.isEmpty((Collection)merchantAllocateDTO.getMerchantApplyRangeIdList())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800509);
        }
        ArrayList<Long> merchantApplyRangeIdList = new ArrayList<Long>();
        for (Object merchantApplyRangeId : merchantAllocateDTO.getMerchantApplyRangeIdList()) {
            merchantApplyRangeIdList.add(Long.parseLong((String)merchantApplyRangeId));
        }
        HashSet<Long> merchantIdSet = new HashSet<Long>();
        for (String merchantId : merchantAllocateDTO.getMerchantIdList()) {
            merchantIdSet.add(Long.parseLong(merchantId));
        }
        List saleAreaApplyRangeOrgList = this.saleAreaApplyRangeDao.getApplyRangeOrgIdByAreaId(Long.valueOf(Long.parseLong(merchantAllocateDTO.getSaleAreaId())));
        if (CollectionUtils.isEmpty((Collection)saleAreaApplyRangeOrgList)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800510);
        }
        Map<Long, List<CustomerArea>> allocateSaleAreaMap = this.getAllocateSaleAreaMap(merchantApplyRangeIdList, merchantIdSet);
        Map<Long, MerchantApplyRange> allocateApplyRangeMap = this.getAllocateMerchantApplyRangeMap(merchantApplyRangeIdList, merchantIdSet);
        ProcessData.builder((int)1, (int)200, null, null).percentage("20").build(merchantAllocateDTO.getAsyncKey(), Integer.valueOf(merchantAllocateDTO.getExpireTime()));
        int totalCount = merchantApplyRangeIdList.size();
        int successCount = 0;
        int failCount = 0;
        ResultList resultList = new ResultList();
        HashSet<Long> successMerchantIdSet = new HashSet<Long>();
        for (Long merchantApplyRangeId : merchantApplyRangeIdList) {
            try {
                MerchantApplyRange allocateApplyRange = allocateApplyRangeMap.get(merchantApplyRangeId);
                if (allocateApplyRange == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800511);
                }
                if (!saleAreaApplyRangeOrgList.contains(allocateApplyRange.getOrgId())) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800512, new Object[]{(String)allocateApplyRange.get("orgName"), (String)allocateApplyRange.get("merchantName"), merchantAllocateDTO.getSaleAreaName()});
                }
                Long customerAreaDefaultId = null;
                List<CustomerArea> customerAreaInDbList = allocateSaleAreaMap.get(merchantApplyRangeId);
                if (!CollectionUtils.isEmpty(customerAreaInDbList)) {
                    for (CustomerArea customerArea : customerAreaInDbList) {
                        if (customerArea.getIsDefault().booleanValue()) {
                            customerAreaDefaultId = (Long)customerArea.getId();
                        }
                        if (!merchantAllocateDTO.getSaleAreaId().equals(customerArea.getSaleAreaId().toString())) continue;
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800513, new Object[]{(String)allocateApplyRange.get("orgName"), (String)allocateApplyRange.get("merchantName"), merchantAllocateDTO.getSaleAreaName()});
                    }
                } else if (!BooleanUtil.isTrue((Object)merchantAllocateDTO.getSaleAreaDefault())) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800514, new Object[]{(String)allocateApplyRange.get("orgName"), (String)allocateApplyRange.get("merchantName")});
                }
                MerchantApplyRange merchantApplyRange = this.getAllocateApplyRange(merchantApplyRangeId);
                MerchantApplyRangeDetail merchantApplyRangeDetail = this.getAllocateApplyRangeDetail(merchantAllocateDTO, merchantApplyRangeId);
                CustomerArea customerArea = this.getAllocateCustomerArea(merchantAllocateDTO, merchantApplyRangeId, allocateApplyRange.getMerchantId());
                if (customerArea.getIsDefault().booleanValue() && customerAreaDefaultId != null) {
                    customerArea.setId((Object)customerAreaDefaultId);
                    customerArea.setEntityStatus(EntityStatus.Update);
                    MetaDaoHelper.update((String)"aa.merchant.CustomerArea", (BizObject)customerArea);
                } else {
                    customerArea.setId((Object)IdManager.getInstance().nextId());
                    customerArea.setEntityStatus(EntityStatus.Insert);
                    MetaDaoHelper.insert((String)"aa.merchant.CustomerArea", (BizObject)customerArea);
                }
                this.merchantGroupService.setMerchantApplyRangeGroup(merchantApplyRange, merchantApplyRangeId, allocateApplyRange.getMerchantId());
                MetaDaoHelper.update((String)"aa.merchant.MerchantApplyRange", (BizObject)merchantApplyRange);
                MetaDaoHelper.update((String)"aa.merchant.MerchantApplyRangeDetail", (BizObject)merchantApplyRangeDetail);
                this.sendAllocateSaleAreaLog(allocateApplyRange);
                successMerchantIdSet.add(allocateApplyRange.getMerchantId());
                ++successCount;
            }
            catch (Exception e) {
                log.error("allocateSaleArea_error:{}", (Object)e.getMessage(), (Object)e);
                ++failCount;
                resultList.addInfo((Object)e.getMessage());
                resultList.addErrorMessage(e.getMessage());
                resultList.addFailInfo((Object)e.getMessage());
            }
            finally {
                String percentage = String.valueOf((successCount + failCount) * 70 / totalCount + 20);
                ProcessData.builder((int)1, (int)200, null, null).percentage(percentage).build(merchantAllocateDTO.getAsyncKey(), Integer.valueOf(merchantAllocateDTO.getExpireTime()));
            }
        }
        resultList.setCount(failCount + successCount);
        resultList.setSucessCount(successCount);
        resultList.setFailCount(failCount);
        ProcessData.builder((int)1, (int)200, (Object)resultList, (String)InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1CAB22400438003A", (String)"\u5206\u914d\u9500\u552e\u533a\u57df\u5b8c\u6210")).percentage("100").successCount(successCount).failCount(failCount).build(merchantAllocateDTO.getAsyncKey(), Integer.valueOf(merchantAllocateDTO.getExpireTime()));
    }

    public String allocatePrincipalAsyncKey(MerchantAllocateDTO merchantAllocateDTO) {
        String requestId = UUID.randomUUID().toString();
        String asyncKey = "allocatePrincipal" + AppContext.getCurrentUser().getYTenantId() + requestId;
        String allocateMerchantLockKey = "allocateMerchantLockKey" + AppContext.getCurrentUser().getYTenantId();
        int expireTime = 600;
        try {
            String expireTimeConfig = this.ymsParamConfig.getMddExportProcessExpireTime();
            if (null != expireTimeConfig) {
                expireTime = Integer.parseInt(expireTimeConfig);
            }
        }
        catch (Exception var8) {
            log.error("\u6279\u6539-\u5f02\u6b65\u83b7\u53d6\u7f13\u5b58\u8d85\u65f6\u65f6\u95f4\u5f02\u5e38\uff0c\u8d70\u9ed8\u8ba4\u914d\u7f6e600\u79d2");
        }
        merchantAllocateDTO.setAsyncKey(asyncKey);
        merchantAllocateDTO.setExpireTime(expireTime);
        ProcessData.builder((int)1, (int)200, null, null).percentage("0").build(merchantAllocateDTO.getAsyncKey(), Integer.valueOf(merchantAllocateDTO.getExpireTime()));
        UserExecutors.executeInDetachedThread((ExecutorService)this.ymsLongTaskExecutorService, () -> {
            block6: {
                try {
                    if (RedisTool.tryGetLock((String)allocateMerchantLockKey, (String)requestId, (int)3600)) {
                        this.allocatePrincipal(merchantAllocateDTO);
                        break block6;
                    }
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800508);
                }
                catch (Exception e) {
                    ResultList resultList = new ResultList();
                    resultList.addFailInfo((Object)e.getMessage());
                    resultList.addErrorMessage(e.getMessage());
                    resultList.setFailCount(1);
                    resultList.setCount(1);
                    ProcessData.builder((int)1, (int)200, (Object)resultList, (String)InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1CAB22400438003B", (String)"\u5206\u914d\u8d1f\u8d23\u4eba\u5931\u8d25")).percentage("100").successCount(0).failCount(1).build(merchantAllocateDTO.getAsyncKey(), Integer.valueOf(merchantAllocateDTO.getExpireTime()));
                }
                finally {
                    RedisTool.releaseLock((String)allocateMerchantLockKey, (String)requestId);
                }
            }
        });
        return asyncKey;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void allocatePrincipal(MerchantAllocateDTO merchantAllocateDTO) throws Exception {
        if (CollectionUtils.isEmpty((Collection)merchantAllocateDTO.getMerchantApplyRangeIdList())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800515);
        }
        ArrayList<Long> merchantApplyRangeIdList = new ArrayList<Long>();
        for (Object merchantApplyRangeId : merchantAllocateDTO.getMerchantApplyRangeIdList()) {
            merchantApplyRangeIdList.add(Long.parseLong((String)merchantApplyRangeId));
        }
        HashSet<Long> merchantIdSet = new HashSet<Long>();
        for (String merchantId : merchantAllocateDTO.getMerchantIdList()) {
            merchantIdSet.add(Long.parseLong(merchantId));
        }
        Map<Long, List<Principal>> allocatePrincipalMap = this.getAllocatePrincipalMap(merchantApplyRangeIdList, merchantIdSet);
        Map<Long, MerchantApplyRange> allocateApplyRangeMap = this.getAllocateMerchantApplyRangeMap(merchantApplyRangeIdList, merchantIdSet);
        ProcessData.builder((int)1, (int)200, null, null).percentage("20").build(merchantAllocateDTO.getAsyncKey(), Integer.valueOf(merchantAllocateDTO.getExpireTime()));
        int totalCount = merchantApplyRangeIdList.size();
        int successCount = 0;
        int failCount = 0;
        ResultList resultList = new ResultList();
        HashSet<Long> successMerchantIdSet = new HashSet<Long>();
        for (Long merchantApplyRangeId : merchantApplyRangeIdList) {
            try {
                ArrayList<Principal> principalArrayList = new ArrayList<Principal>();
                MerchantApplyRange allocateApplyRange = allocateApplyRangeMap.get(merchantApplyRangeId);
                if (allocateApplyRange == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800511);
                }
                Long principalDefaultId = null;
                List<Principal> allocatePrincipalList = allocatePrincipalMap.get(merchantApplyRangeId);
                if (!CollectionUtils.isEmpty(allocatePrincipalList)) {
                    for (Principal principalOne : allocatePrincipalList) {
                        if (principalOne.getIsDefault().booleanValue()) {
                            principalDefaultId = (Long)principalOne.getId();
                        }
                        if (!merchantAllocateDTO.getProfessSalesman().equals(principalOne.getProfessSalesman())) continue;
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800516, new Object[]{(String)allocateApplyRange.get("orgName"), (String)allocateApplyRange.get("merchantName")});
                    }
                } else if (!BooleanUtil.isTrue((Object)merchantAllocateDTO.getPrincipalDefault())) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800517, new Object[]{(String)allocateApplyRange.get("orgName"), (String)allocateApplyRange.get("merchantName")});
                }
                MerchantApplyRange merchantApplyRange = this.getAllocateApplyRange(merchantApplyRangeId);
                MerchantApplyRangeDetail merchantApplyRangeDetail = this.getAllocateApplyRangeDetail(merchantAllocateDTO, merchantApplyRangeId);
                Principal principal = this.getAllocatePrincipal(merchantAllocateDTO, merchantApplyRangeId, allocateApplyRange.getMerchantId());
                if (principal.getIsDefault().booleanValue() && principalDefaultId != null) {
                    principal.setId((Object)principalDefaultId);
                    List longList = merchantIdSet.stream().collect(Collectors.toList());
                    List merchantPrincipalPOS = this.merchantPrincipalQryDao.listMerchantPrincipalVOById(longList, null, null);
                    Long finalPrincipalDefaultId = principalDefaultId;
                    Optional<MerchantPrincipalVO> firstPrincipal = merchantPrincipalPOS.stream().filter(p -> p.getId().equals(finalPrincipalDefaultId)).findFirst();
                    firstPrincipal.ifPresent(merchantPrincipalPO -> {
                        Principal principalDelete = new Principal();
                        principalDelete.setId((Object)merchantPrincipalPO.getId());
                        principalDelete.setMerchantId(merchantPrincipalPO.getMerchantId());
                        principalDelete.setMerchantApplyRangeId(merchantPrincipalPO.getMerchantApplyRangeId());
                        principalDelete.setIsDefault(merchantPrincipalPO.getIsDefault());
                        principalDelete.setProfessSalesman(merchantPrincipalPO.getProfessSalesman());
                        principalDelete.setSpecialManagementDep(merchantPrincipalPO.getSpecialManagementDep());
                        principalDelete.setEntityStatus(EntityStatus.Delete);
                        principalArrayList.add(principalDelete);
                    });
                    principal.setEntityStatus(EntityStatus.Update);
                    MetaDaoHelper.update((String)"aa.merchant.Principal", (BizObject)principal);
                } else {
                    principal.setId((Object)IdManager.getInstance().nextId());
                    principal.setEntityStatus(EntityStatus.Insert);
                    MetaDaoHelper.insert((String)"aa.merchant.Principal", (BizObject)principal);
                }
                this.merchantGroupService.setMerchantApplyRangeGroup(merchantApplyRange, merchantApplyRangeId, allocateApplyRange.getMerchantId());
                principalArrayList.add(principal);
                this.merchantContacterSyncCRMRule.synchronizePrincipalToCRM(principalArrayList, null);
                MetaDaoHelper.update((String)"aa.merchant.MerchantApplyRange", (BizObject)merchantApplyRange);
                MetaDaoHelper.update((String)"aa.merchant.MerchantApplyRangeDetail", (BizObject)merchantApplyRangeDetail);
                this.sendAllocatePrincipalLog(allocateApplyRange);
                successMerchantIdSet.add(allocateApplyRange.getMerchantId());
                ++successCount;
            }
            catch (Exception e) {
                log.error("allocatePrincipal_error:{}", (Object)e.getMessage(), (Object)e);
                ++failCount;
                resultList.addInfo((Object)e.getMessage());
                resultList.addErrorMessage(e.getMessage());
                resultList.addFailInfo((Object)e.getMessage());
            }
            finally {
                String percentage = String.valueOf((successCount + failCount) * 70 / totalCount + 20);
                ProcessData.builder((int)1, (int)200, null, null).percentage(percentage).build(merchantAllocateDTO.getAsyncKey(), Integer.valueOf(merchantAllocateDTO.getExpireTime()));
            }
        }
        resultList.setCount(failCount + successCount);
        resultList.setSucessCount(successCount);
        resultList.setFailCount(failCount);
        ProcessData.builder((int)1, (int)200, (Object)resultList, (String)InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1CAB224004380038", (String)"\u5206\u914d\u8d1f\u8d23\u4eba\u5b8c\u6210")).percentage("100").successCount(successCount).failCount(failCount).build(merchantAllocateDTO.getAsyncKey(), Integer.valueOf(merchantAllocateDTO.getExpireTime()));
    }

    public void sendAllocateSaleAreaLog(MerchantApplyRange merchantApplyRange) {
        try {
            HashMap<String, Object> params = new HashMap<String, Object>(3);
            params.put("@merchantApplyRangeId", merchantApplyRange.getId());
            params.put("isCreator", merchantApplyRange.getIsCreator());
            params.put("isApplied", true);
            BillDataDto billDataDtoMerchantLog = new BillDataDto("aa_merchant", merchantApplyRange.getMerchantId().toString());
            billDataDtoMerchantLog.setMapCondition(params);
            Map merchantDetail = this.billService.detail(billDataDtoMerchantLog);
            BusinessLogObjectBuilder businessLogObjectBuilder = new BusinessLogObjectBuilder();
            businessLogObjectBuilder.uri("aa.merchant.Merchant").busiObjTypeCode("aa_merchant").busiObjTypeName("UID:P_COREDOC-BE_1CA405DA04780003").defaultBusiObjTypeName("\u5ba2\u6237\u5206\u914d\u9500\u552e\u533a\u57df").operationName("UID:P_COREDOC-BE_1CA4063604780007").defaultOperationName("\u5206\u914d\u9500\u552e\u533a\u57df").logMode(BusinessLogMode.UI_META).domain("productcenter").serviceCode("aa_merchant").newObject((Object)merchantDetail).dataId(merchantApplyRange.getMerchantId().toString()).dataCode(merchantApplyRange.get("merchantCode") == null ? "" : merchantApplyRange.get("merchantCode").toString()).dataName(merchantApplyRange.get("merchantName") == null ? "" : merchantApplyRange.get("merchantName").toString());
            this.busiLogService.saveBusinessLog(businessLogObjectBuilder.build());
        }
        catch (Exception e) {
            this.logger.error("\u5206\u914d\u9500\u552e\u533a\u57df\u4e8b\u4ef6\u53d1\u9001\u4e1a\u52a1\u65e5\u5fd7\u5f02\u5e38:{}", (Object)e.getMessage(), (Object)e);
        }
    }

    public void sendAllocatePrincipalLog(MerchantApplyRange merchantApplyRange) {
        try {
            HashMap<String, Object> params = new HashMap<String, Object>(3);
            params.put("@merchantApplyRangeId", merchantApplyRange.getId());
            params.put("isCreator", merchantApplyRange.getIsCreator());
            params.put("isApplied", true);
            BillDataDto billDataDtoMerchantLog = new BillDataDto("aa_merchant", merchantApplyRange.getMerchantId().toString());
            billDataDtoMerchantLog.setMapCondition(params);
            Map merchantDetail = this.billService.detail(billDataDtoMerchantLog);
            BusinessLogObjectBuilder businessLogObjectBuilder = new BusinessLogObjectBuilder();
            businessLogObjectBuilder.uri("aa.merchant.Merchant").busiObjTypeCode("aa_merchant").busiObjTypeName("UID:P_COREDOC-BE_1CA67AB604C00003").defaultBusiObjTypeName("\u5ba2\u6237\u5206\u914d\u8d1f\u8d23\u4eba").operationName("UID:P_COREDOC-BE_1CA5E5EA04780003").defaultOperationName("\u5206\u914d\u8d1f\u8d23\u4eba").logMode(BusinessLogMode.UI_META).domain("productcenter").serviceCode("aa_merchant").newObject((Object)merchantDetail).dataId(merchantApplyRange.getMerchantId().toString()).dataCode(merchantApplyRange.get("merchantCode") == null ? "" : merchantApplyRange.get("merchantCode").toString()).dataName(merchantApplyRange.get("merchantName") == null ? "" : merchantApplyRange.get("merchantName").toString());
            this.busiLogService.saveBusinessLog(businessLogObjectBuilder.build());
        }
        catch (Exception e) {
            this.logger.error("\u5206\u914d\u8d1f\u8d23\u4eba\u4e8b\u4ef6\u53d1\u9001\u4e1a\u52a1\u65e5\u5fd7\u5f02\u5e38:{}", (Object)e.getMessage(), (Object)e);
        }
    }

    public Map<Long, MerchantApplyRange> getAllocateMerchantApplyRangeMap(List<Long> merchantApplyRangeIdList, Set<Long> merchantIdList) throws Exception {
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id,merchantId,merchantId.name as merchantName,merchantId.code as merchantCode,orgId,orgId.name as orgName,isCreator,isApplied");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(merchantApplyRangeIdList), QueryCondition.name((String)"merchantId").in(merchantIdList), QueryCondition.name((String)"isPotential").eq((Object)false)}));
        List bizObjectInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRange", (QuerySchema)querySchema, null);
        HashMap<Long, MerchantApplyRange> merchantApplyRangeMap = new HashMap<Long, MerchantApplyRange>();
        if (!CollectionUtils.isEmpty((Collection)bizObjectInDbList)) {
            for (MerchantApplyRange merchantApplyRange : bizObjectInDbList) {
                merchantApplyRangeMap.put((Long)merchantApplyRange.getId(), merchantApplyRange);
            }
        }
        return merchantApplyRangeMap;
    }

    public Map<Long, List<CustomerArea>> getAllocateSaleAreaMap(List<Long> merchantApplyRangeIdList, Set<Long> merchantIdList) throws Exception {
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id,merchantApplyRangeId,merchantId,saleAreaId,isDefault");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantApplyRangeId").in(merchantApplyRangeIdList), QueryCondition.name((String)"merchantId").in(merchantIdList)}));
        List bizObjectInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.CustomerArea", (QuerySchema)querySchema, null);
        HashMap<Long, List<CustomerArea>> customerAreaMap = new HashMap<Long, List<CustomerArea>>();
        if (!CollectionUtils.isEmpty((Collection)bizObjectInDbList)) {
            for (CustomerArea customerArea : bizObjectInDbList) {
                List<CustomerArea> customerAreaList;
                if (customerAreaMap.containsKey(customerArea.getmerchantApplyRangeId())) {
                    customerAreaList = (List)customerAreaMap.get(customerArea.getmerchantApplyRangeId());
                    if (!CollectionUtils.isEmpty(customerAreaList)) {
                        customerAreaList.add(customerArea);
                        continue;
                    }
                    customerAreaList = new ArrayList();
                    customerAreaList.add(customerArea);
                    continue;
                }
                customerAreaList = new ArrayList<CustomerArea>();
                customerAreaList.add(customerArea);
                customerAreaMap.put(customerArea.getmerchantApplyRangeId(), customerAreaList);
            }
        }
        return customerAreaMap;
    }

    public Map<Long, List<Principal>> getAllocatePrincipalMap(List<Long> merchantApplyRangeIdList, Set<Long> merchantIdList) throws Exception {
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id,merchantApplyRangeId,merchantId,specialManagementDep,professSalesman,isDefault");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantApplyRangeId").in(merchantApplyRangeIdList), QueryCondition.name((String)"merchantId").in(merchantIdList)}));
        List bizObjectInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.Principal", (QuerySchema)querySchema, null);
        HashMap<Long, List<Principal>> principalMap = new HashMap<Long, List<Principal>>();
        if (!CollectionUtils.isEmpty((Collection)bizObjectInDbList)) {
            for (Principal principal : bizObjectInDbList) {
                List<Principal> principalList;
                if (principalMap.containsKey(principal.getMerchantApplyRangeId())) {
                    principalList = (List)principalMap.get(principal.getMerchantApplyRangeId());
                    if (!CollectionUtils.isEmpty(principalList)) {
                        principalList.add(principal);
                        continue;
                    }
                    principalList = new ArrayList();
                    principalList.add(principal);
                    continue;
                }
                principalList = new ArrayList<Principal>();
                principalList.add(principal);
                principalMap.put(principal.getMerchantApplyRangeId(), principalList);
            }
        }
        return principalMap;
    }

    public MerchantApplyRange getAllocateApplyRange(Long merchantApplyRangeId) {
        MerchantApplyRange merchantApplyRange = new MerchantApplyRange();
        merchantApplyRange.setId((Object)merchantApplyRangeId);
        merchantApplyRange.setIsApplied(Boolean.valueOf(true));
        merchantApplyRange.setEntityStatus(EntityStatus.Update);
        return merchantApplyRange;
    }

    public MerchantApplyRangeDetail getAllocateApplyRangeDetail(MerchantAllocateDTO merchantAllocateDTO, Long merchantApplyRangeId) {
        MerchantApplyRangeDetail merchantApplyRangeDetail = new MerchantApplyRangeDetail();
        merchantApplyRangeDetail.setId(merchantApplyRangeId);
        merchantApplyRangeDetail.setModifier(AppContext.getCurrentUser().getName());
        merchantApplyRangeDetail.setModifierId((Long)AppContext.getCurrentUser().getId());
        merchantApplyRangeDetail.setModifyDate(new Date());
        merchantApplyRangeDetail.setModifyTime(new Date());
        if (BooleanUtil.isTrue((Object)merchantAllocateDTO.getSaleAreaDefault())) {
            merchantApplyRangeDetail.setCustomerArea(Long.valueOf(Long.parseLong(merchantAllocateDTO.getSaleAreaId())));
        }
        if (BooleanUtil.isTrue((Object)merchantAllocateDTO.getPrincipalDefault())) {
            merchantApplyRangeDetail.setSpecialManagementDep(merchantAllocateDTO.getSpecialManagementDep());
            merchantApplyRangeDetail.setProfessSalesman(merchantAllocateDTO.getProfessSalesman());
        }
        merchantApplyRangeDetail.setEntityStatus(EntityStatus.Update);
        return merchantApplyRangeDetail;
    }

    public CustomerArea getAllocateCustomerArea(MerchantAllocateDTO merchantAllocateDTO, Long merchantApplyRangeId, Long merchantId) {
        CustomerArea customerArea = new CustomerArea();
        customerArea.setSaleAreaId(Long.valueOf(Long.parseLong(merchantAllocateDTO.getSaleAreaId())));
        customerArea.setIsDefault(Boolean.valueOf(BooleanUtil.isTrue((Object)merchantAllocateDTO.getSaleAreaDefault())));
        customerArea.setmerchantApplyRangeId(merchantApplyRangeId);
        customerArea.setMerchantId(merchantId);
        return customerArea;
    }

    public Principal getAllocatePrincipal(MerchantAllocateDTO merchantAllocateDTO, Long merchantApplyRangeId, Long merchantId) {
        Principal principal = new Principal();
        principal.setSpecialManagementDep(merchantAllocateDTO.getSpecialManagementDep());
        principal.setProfessSalesman(merchantAllocateDTO.getProfessSalesman());
        principal.setIsDefault(Boolean.valueOf(BooleanUtil.isTrue((Object)merchantAllocateDTO.getPrincipalDefault())));
        principal.setMerchantApplyRangeId(merchantApplyRangeId);
        principal.setMerchantId(merchantId);
        return principal;
    }

    public BillContext updateBillContext(List<BizObject> bizObjects, BillContext billContext) throws Exception {
        if (bizObjects == null) {
            return billContext;
        }
        BizObject biz = bizObjects.get(0);
        if (biz == null || biz.get("id") == null) {
            return billContext;
        }
        String belongOrg = null;
        if (biz.get("belongOrg") != null) {
            belongOrg = biz.get("belongOrg").toString();
        }
        Map params = this.upcMerchantQueryService.setParams(Long.valueOf(biz.get("id").toString()), null, belongOrg, null, null);
        billContext.setMasterOrgField("merchantApplyRanges.orgId");
        billContext.setContext(params);
        return billContext;
    }

    public Merchant contacterSave(Merchant merchant) throws Exception {
        List contacters = merchant.merchantContacterInfos();
        Long merchantId = Long.valueOf((String)merchant.getId());
        if (!CollectionUtils.isEmpty((Collection)contacters)) {
            boolean merchantNeedDefaultContact;
            ArrayList<Long> contacterIdList = new ArrayList<Long>();
            int isDefaultNum = 0;
            for (Contacter contacter : contacters) {
                if (contacter.getEntityStatus() == EntityStatus.Insert) {
                    contacter.setId((Object)IdManager.getInstance().nextId());
                }
                contacter.setMerchantId(merchantId);
                if (contacter.getIsDefault() == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800428, new Object[]{merchant.getCode()});
                }
                if (contacter.getIsDefault().booleanValue() && contacter.getEntityStatus() != EntityStatus.Delete) {
                    ++isDefaultNum;
                }
                contacterIdList.add((Long)contacter.getId());
            }
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("id");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq((Object)merchantId), QueryCondition.name((String)"isDefault").eq((Object)1), QueryCondition.name((String)"id").not_in(contacterIdList)}));
            List isDefault = MetaDaoHelper.query((String)"aa.merchant.Contacter", (QuerySchema)querySchema);
            if (!CollectionUtils.isEmpty((Collection)isDefault)) {
                isDefaultNum += isDefault.size();
            }
            if ((merchantNeedDefaultContact = MerchantUtils.getMerchantNeedDefault((String)"customerNeedDefaultContact")) && isDefaultNum != 1) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800429, new Object[]{merchant.getCode()});
            }
            if (!merchantNeedDefaultContact && isDefaultNum > 1) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800429, new Object[]{merchant.getCode()});
            }
            MetaDaoHelper.update((String)"aa.merchant.Contacter", (List)contacters);
        }
        return merchant;
    }

    public void handleAgentFinancial(List<AgentFinancial> agentFinancialList) throws Exception {
        if (!CollectionUtils.isEmpty(agentFinancialList)) {
            ArrayList<String> openBankIds = new ArrayList<String>();
            for (AgentFinancial agentFinancial : agentFinancialList) {
                if (agentFinancial != null && agentFinancial.getOpenBank() != null) {
                    openBankIds.add(agentFinancial.getOpenBank());
                }
                if (agentFinancial == null || agentFinancial.getStopstatus() != null || EntityStatus.Insert != agentFinancial.getEntityStatus()) continue;
                agentFinancial.setStopstatus(Boolean.valueOf(false));
            }
            List bankdotVOS = this.bankDotQueryService.queryBankDotByIds(openBankIds);
            if (!CollectionUtils.isEmpty((Collection)bankdotVOS)) {
                HashMap<String, BankdotVO> bankVOMap = new HashMap<String, BankdotVO>();
                for (BankdotVO bankdotVO : bankdotVOS) {
                    bankVOMap.put(bankdotVO.getId(), bankdotVO);
                }
                for (AgentFinancial agentFinancial : agentFinancialList) {
                    BankdotVO bankdotVO;
                    if (agentFinancial.getOpenBank() == null || agentFinancial.getEntityStatus() == EntityStatus.Delete || (bankdotVO = (BankdotVO)bankVOMap.get(agentFinancial.getOpenBank())) == null) continue;
                    if (agentFinancial.getCountry() != null) {
                        if (!agentFinancial.getCountry().equals(bankdotVO.getCountry())) {
                            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_AGENT_COUNTRY_ERROR, new Object[]{bankdotVO.getCode()});
                        }
                    } else {
                        agentFinancial.setCountry(bankdotVO.getCountry());
                    }
                    if (agentFinancial.getBank() != null) {
                        if (!agentFinancial.getBank().equals(bankdotVO.getBank())) {
                            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_AGENT_BANK_ERROR, new Object[]{bankdotVO.getCode()});
                        }
                    } else {
                        agentFinancial.setBank(bankdotVO.getBank());
                    }
                    if (agentFinancial.getJointLineNo() != null) {
                        if (!agentFinancial.getJointLineNo().equals(bankdotVO.getLinenumber())) {
                            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_AGENT_JOINLINE_ERROR, new Object[]{bankdotVO.getCode()});
                        }
                    } else {
                        agentFinancial.setJointLineNo(bankdotVO.getLinenumber());
                    }
                    if (agentFinancial.getSwiftCode() != null) {
                        if (agentFinancial.getSwiftCode().equals(bankdotVO.getSwiftCode())) continue;
                        throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_AGENT_SWIFT_ERROR, new Object[]{bankdotVO.getCode()});
                    }
                    agentFinancial.setSwiftCode(bankdotVO.getSwiftCode());
                }
            }
        }
    }

    public void handleAgentFinancialByInternaOrg(List<AgentFinancial> agentFinancialList, String internaOrg, Long merchantId) throws Exception {
        block18: {
            EnterpriseParams enterpriseParams = new EnterpriseParams();
            ArrayList<String> orgIds = new ArrayList<String>();
            orgIds.add(internaOrg);
            enterpriseParams.setOrgidList(orgIds);
            enterpriseParams.setPageIndex(1);
            enterpriseParams.setPageSize(2000);
            HashMap<String, AgentFinancial> orgFinBankAcctMap = new HashMap<String, AgentFinancial>();
            HashMap<String, String> accountMap = new HashMap<String, String>();
            List enterpriseBankAcctVOList = this.iEnterpriseBankAcctService.queryByCondition(enterpriseParams);
            if (CollectionUtils.isEmpty((Collection)enterpriseBankAcctVOList)) break block18;
            for (EnterpriseBankAcctVO enterpriseBankAcctVO : enterpriseBankAcctVOList) {
                List bankAcctCurrencyVOList = enterpriseBankAcctVO.getCurrencyList();
                if (!CollectionUtils.isEmpty((Collection)bankAcctCurrencyVOList)) {
                    for (BankAcctCurrencyVO bankAcctCurrencyVO : bankAcctCurrencyVOList) {
                        AgentFinancial agentFinancial = this.convertEnterpriseBankAcctVO(enterpriseBankAcctVO);
                        agentFinancial.setCurrency(bankAcctCurrencyVO.getCurrency());
                        orgFinBankAcctMap.put(agentFinancial.getOrgFinBankAcct(), agentFinancial);
                        accountMap.put(agentFinancial.getBankAccount(), agentFinancial.getOrgFinBankAcct());
                    }
                    continue;
                }
                AgentFinancial agentFinancial = this.convertEnterpriseBankAcctVO(enterpriseBankAcctVO);
                orgFinBankAcctMap.put(agentFinancial.getOrgFinBankAcct(), agentFinancial);
                accountMap.put(agentFinancial.getBankAccount(), agentFinancial.getOrgFinBankAcct());
            }
            if (!CollectionUtils.isEmpty(agentFinancialList)) {
                for (AgentFinancial agentFinancial : agentFinancialList) {
                    if (agentFinancial != null && agentFinancial.getEntityStatus() != EntityStatus.Delete && agentFinancial.getOrgFinBankAcct() != null) {
                        AgentFinancial orgFinBankAcct = (AgentFinancial)orgFinBankAcctMap.get(agentFinancial.getOrgFinBankAcct());
                        if (orgFinBankAcct == null) continue;
                        if (agentFinancial.getBank() != null && !agentFinancial.getBank().equals(orgFinBankAcct.getBank())) {
                            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_AGENT_ORG_BANK_ERROR, (Object[])orgFinBankAcct.get("orgFinBankAcct_code"));
                        }
                        if (agentFinancial.getOpenBank() != null && !agentFinancial.getOpenBank().equals(orgFinBankAcct.getOpenBank())) {
                            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_AGENT_ORG_OPEN_BANK_ERROR, (Object[])orgFinBankAcct.get("orgFinBankAcct_code"));
                        }
                        if (agentFinancial.getBankAccount() != null && !agentFinancial.getBankAccount().equals(orgFinBankAcct.getBankAccount())) {
                            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_AGENT_ORG_BANK_ACCOUNT_ERROR, (Object[])orgFinBankAcct.get("orgFinBankAcct_code"));
                        }
                        if (agentFinancial.getBankAccountName() != null && !agentFinancial.getBankAccountName().equals(orgFinBankAcct.getBankAccountName())) {
                            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_AGENT_ORG_BANK_ACCOUNT_NAME_ERROR, (Object[])orgFinBankAcct.get("orgFinBankAcct_code"));
                        }
                        if (agentFinancial.getJointLineNo() != null && !agentFinancial.getJointLineNo().equals(orgFinBankAcct.getJointLineNo())) {
                            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_AGENT_ORG_JOINLINE_ERROR, (Object[])orgFinBankAcct.get("orgFinBankAcct_code"));
                        }
                        if (agentFinancial.get("accountOpeningDate") == null || agentFinancial.get("accountOpeningDate").equals(orgFinBankAcct.get("accountOpeningDate"))) continue;
                        throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_AGENT_ORG_OPEN_DATE_ERROR, (Object[])orgFinBankAcct.get("orgFinBankAcct_code"));
                    }
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_AGENT_ORG_FIN_ACCOUNT_ERROR);
                }
            } else {
                QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq((Object)merchantId)});
                QuerySchema schema = QuerySchema.create().addSelect("id,merchantId,bankAccount,orgFinBankAcct,isDefault").addCondition((ConditionExpression)condition);
                List queryAgentList = MetaDaoHelper.queryObject((String)"aa.merchant.AgentFinancial", (QuerySchema)schema, null);
                HashSet<String> orgFinIdSet = new HashSet<String>();
                ArrayList<AgentFinancial> saveAgentFinancialList = new ArrayList<AgentFinancial>();
                boolean isDefault = false;
                if (!CollectionUtils.isEmpty((Collection)queryAgentList)) {
                    for (AgentFinancial query : queryAgentList) {
                        if (query.getOrgFinBankAcct() == null && query.getBankAccount() != null && accountMap.get(query.getBankAccount()) != null) {
                            query.setOrgFinBankAcct((String)accountMap.get(query.getBankAccount()));
                            query.setEntityStatus(EntityStatus.Update);
                            saveAgentFinancialList.add(query);
                            orgFinIdSet.add((String)accountMap.get(query.getBankAccount()));
                        }
                        if (query.getOrgFinBankAcct() != null) {
                            orgFinIdSet.add(query.getOrgFinBankAcct());
                        }
                        if (!query.getIsDefault().booleanValue()) continue;
                        isDefault = true;
                    }
                }
                for (String orgFinBankId : orgFinBankAcctMap.keySet()) {
                    if (orgFinIdSet.contains(orgFinBankId)) continue;
                    AgentFinancial saveData = (AgentFinancial)orgFinBankAcctMap.get(orgFinBankId);
                    saveData.setId((Object)IdManager.getInstance().nextId());
                    saveData.setEntityStatus(EntityStatus.Insert);
                    if (!isDefault) {
                        saveData.setIsDefault(Boolean.valueOf(true));
                        isDefault = true;
                    }
                    saveAgentFinancialList.add((AgentFinancial)orgFinBankAcctMap.get(orgFinBankId));
                }
            }
        }
    }

    public void upgradeRange(Map<String, Object> param) throws Exception {
        Long id = Long.valueOf(param.get("id").toString());
        String orgId = param.get("orgId").toString();
        String merchantDetailId = param.get("detail").toString();
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq((Object)id), QueryCondition.name((String)"isCreator").eq((Object)1)}));
        Map rang = MetaDaoHelper.queryOne((String)"aa.merchant.MerchantApplyRange", (QuerySchema)querySchema);
        if (CollectionUtils.isEmpty((Map)rang)) {
            MerchantApplyRange merchantApplyRange = new MerchantApplyRange();
            merchantApplyRange.setMerchantId(id);
            merchantApplyRange.setOrgId(orgId);
            merchantApplyRange.setRangeType(Integer.valueOf(1));
            merchantApplyRange.setId((Object)IdManager.getInstance().nextId());
            merchantApplyRange.setMerchantDetailId(merchantDetailId);
            merchantApplyRange.setIsApplied(Boolean.valueOf(true));
            merchantApplyRange.setIsCreator(Boolean.valueOf(true));
            merchantApplyRange.setEntityStatus(EntityStatus.Insert);
            MetaDaoHelper.insert((String)"aa.merchant.MerchantApplyRange", (BizObject)merchantApplyRange);
            MerchantApplyRangeDetail rangeDetail = new MerchantApplyRangeDetail();
            rangeDetail.set("id", (Object)id);
            rangeDetail.setMerchantApplyRangeId((Long)merchantApplyRange.getId());
            rangeDetail.setEntityStatus(EntityStatus.Insert);
            MetaDaoHelper.insert((String)"aa.merchant.MerchantApplyRangeDetail", (BizObject)rangeDetail);
        }
    }

    @Transactional(rollbackFor={Exception.class})
    public int syncStopStatus(List<String> codeList) {
        if (!CollectionUtils.isEmpty(codeList)) {
            String ytenantId = InvocationInfoProxy.getTenantid();
            SQLParameter sqlParameter = new SQLParameter();
            String sql = String.format(SQL_SYNC_STOPSTATUS_BY_YTENANTID, ytenantId, ytenantId, ytenantId, ytenantId);
            sql = sql + " and t4.ccode in ('" + String.join((CharSequence)"','", codeList) + "')";
            int count = this.ymsJdbcApi.update(sql, sqlParameter);
            return count;
        }
        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800137);
    }

    @Transactional(rollbackFor={Exception.class})
    public int syncStopStatus(String ytenantId) {
        SQLParameter sqlParameter = new SQLParameter();
        String sql = String.format(SQL_SYNC_STOPSTATUS_BY_YTENANTID, ytenantId, ytenantId, ytenantId, ytenantId);
        int count = this.ymsJdbcApi.update(sql, sqlParameter);
        return count;
    }

    public void insertRangeDetail(List<Long> merchantRangeIdList, List<String> merchantDetailIdList) {
        if (!CollectionUtils.isEmpty(merchantRangeIdList) && !CollectionUtils.isEmpty(merchantDetailIdList) && merchantDetailIdList.size() == merchantRangeIdList.size()) {
            HashMap merchantRangeIdMap = new HashMap();
            AtomicInteger i = new AtomicInteger();
            merchantRangeIdList.forEach(merchantRangeId -> merchantRangeIdMap.put(merchantRangeId, (String)merchantDetailIdList.get(i.getAndIncrement())));
            ArrayList<String> objectAddressInfoIdList = new ArrayList<String>(merchantDetailIdList);
            List merchantDetailPOList = this.billQueryRepository.findByIds("aa.merchant.MerchantDetail", objectAddressInfoIdList, 0);
            if (!CollectionUtils.isEmpty((Collection)merchantDetailPOList)) {
                Map<String, MerchantDetailPO> merchantDetailPOMap = merchantDetailPOList.stream().collect(Collectors.toMap(MerchantDetailPO::getId, item -> item));
                ArrayList<MerchantApplyRangeDetailPO> merchantApplyRangeDetailPOList = new ArrayList<MerchantApplyRangeDetailPO>();
                List merchantApplyRangePOList = this.merchantApplyRangeService.queryByIds(merchantRangeIdList);
                merchantApplyRangePOList.forEach(merchantApplyRangePO -> {
                    String merchantDetailPOId = (String)merchantRangeIdMap.get(merchantApplyRangePO.getId());
                    MerchantDetailPO merchantDetailPO = (MerchantDetailPO)merchantDetailPOMap.get(merchantDetailPOId);
                    MerchantApplyRangeDetailPO merchantApplyRangeDetailPO = this.getMerchantApplyRangeDetailPO(merchantApplyRangePO.getId(), merchantDetailPOId, merchantDetailPO);
                    merchantApplyRangeDetailPO.setBelongOrg(merchantApplyRangePO.getOrgId());
                    merchantApplyRangeDetailPOList.add(merchantApplyRangeDetailPO);
                    if (merchantApplyRangeDetailPOList.size() == 500) {
                        this.saveMerchantApplyRangeDetail(merchantApplyRangeDetailPOList);
                        merchantApplyRangeDetailPOList.clear();
                    }
                });
                if (!CollectionUtils.isEmpty(merchantApplyRangeDetailPOList)) {
                    this.saveMerchantApplyRangeDetail(merchantApplyRangeDetailPOList);
                }
            }
        }
    }

    @Transactional(rollbackFor={Exception.class})
    public void saveMerchantApplyRangeDetail(List<MerchantApplyRangeDetailPO> merchantApplyRangeDetailPOList) {
        this.ymsJdbcApi.insertWithPK(merchantApplyRangeDetailPOList);
    }

    private MerchantApplyRangeDetailPO getMerchantApplyRangeDetailPO(Long merchantRangeId, String merchantDetailPOId, MerchantDetailPO merchantDetailPO) {
        MerchantApplyRangeDetailPO merchantApplyRangeDetailPO = new MerchantApplyRangeDetailPO();
        merchantApplyRangeDetailPO.setMerchantApplyRangeId(merchantRangeId);
        merchantApplyRangeDetailPO.setId(merchantDetailPO.getMerchantId());
        merchantApplyRangeDetailPO.setBelongOrg(merchantDetailPO.getBelongOrgId());
        merchantApplyRangeDetailPO.setBelongMerchant(merchantDetailPO.getBelongMerchantId());
        merchantApplyRangeDetailPO.setSearchcode(merchantDetailPO.getSearchCode());
        merchantApplyRangeDetailPO.setTransactionCurrency(merchantDetailPO.getTransactionCurrencyId());
        merchantApplyRangeDetailPO.setTaxRate(merchantDetailPO.getTaxRateId() == null ? null : merchantDetailPO.getTaxRateId().toString());
        merchantApplyRangeDetailPO.setDeliveryWarehouse(merchantDetailPO.getDeliveryWarehouseId());
        merchantApplyRangeDetailPO.setCreditServiceDay(merchantDetailPO.getCreditServiceDayId());
        merchantApplyRangeDetailPO.setCollectionAgreement(merchantDetailPO.getCollectionAgreementId());
        merchantApplyRangeDetailPO.setShipmentMethod(merchantDetailPO.getShipmentMethodId());
        merchantApplyRangeDetailPO.setSignBack(Boolean.valueOf(BooleanUtil.isTrue((Object)merchantDetailPO.getSignBack())));
        merchantApplyRangeDetailPO.setTenant(merchantDetailPO.getTenant());
        merchantApplyRangeDetailPO.setYtenant(merchantDetailPO.getYtenant());
        merchantApplyRangeDetailPO.setStopstatus(merchantDetailPO.getStopstatus());
        merchantApplyRangeDetailPO.setStoptime(merchantDetailPO.getStoptime());
        merchantApplyRangeDetailPO.setCreateTime(merchantDetailPO.getCreateTime());
        merchantApplyRangeDetailPO.setCreateDate(merchantDetailPO.getCreateDate());
        merchantApplyRangeDetailPO.setCreator(merchantDetailPO.getCreator());
        merchantApplyRangeDetailPO.setCreatorId(merchantDetailPO.getCreatorId());
        merchantApplyRangeDetailPO.setErpCode(merchantDetailPO.getErpCode());
        merchantApplyRangeDetailPO.setCustomerLevel(merchantDetailPO.getMerchantLevelId());
        merchantApplyRangeDetailPO.setExchangeratetype(merchantDetailPO.getExchangeRateTypeId());
        merchantApplyRangeDetailPO.setPayway(merchantDetailPO.getPayWay());
        merchantApplyRangeDetailPO.setCustomerType(merchantDetailPO.getMerchantTypeId());
        merchantApplyRangeDetailPO.setFreezingLink(merchantDetailPO.getFreezeLink());
        merchantApplyRangeDetailPO.setFrozenState(merchantDetailPO.getFrozenState());
        merchantApplyRangeDetailPO.setLocker(merchantDetailPO.getLocker());
        merchantApplyRangeDetailPO.setLockTime(merchantDetailPO.getLockTime());
        merchantApplyRangeDetailPO.setLockDate(merchantDetailPO.getLockDate());
        merchantApplyRangeDetailPO.setOrgDefaultAddress(merchantDetailPO.getOrgDefaultAddress());
        merchantApplyRangeDetailPO.setIsTradeCustomers(merchantDetailPO.getIsTradeCustomers());
        merchantApplyRangeDetailPO.setDeleteLog("0");
        merchantApplyRangeDetailPO.setLayoffId(merchantDetailPO.getLayoffId());
        merchantApplyRangeDetailPO.setPriceMarking(merchantDetailPO.getPriceMarking());
        merchantApplyRangeDetailPO.set_status(Integer.valueOf(2));
        return merchantApplyRangeDetailPO;
    }

    @Transactional(rollbackFor={Exception.class})
    public void insertRangeDetailByTenantId(String ytenantId) {
        String selectSQL = "select id as id,merchant_detail_id as merchantDetailId \n  from merchantapplyrange \n where ytenant_id = '%s'\n   and id not in (select merchantApplyRangeId \n                    from merchantapplyrangedetail \n                   where ytenant_id = '%s') ";
        List merchantApplyRangePOList = this.ymsJdbcApi.queryForDTOList(String.format(selectSQL, ytenantId, ytenantId), MerchantApplyRangePO.class);
        if (!CollectionUtils.isEmpty((Collection)merchantApplyRangePOList)) {
            ArrayList<Long> merchantRangeIdList = new ArrayList<Long>();
            ArrayList<String> merchantDetailIdList = new ArrayList<String>();
            merchantApplyRangePOList.forEach(merchantApplyRangePO -> {
                if (null != merchantApplyRangePO.getId() && null != merchantApplyRangePO.getMerchantDetailId()) {
                    merchantRangeIdList.add(merchantApplyRangePO.getId());
                    merchantDetailIdList.add(merchantApplyRangePO.getMerchantDetailId());
                }
            });
            this.insertRangeDetail(merchantRangeIdList, merchantDetailIdList);
        }
    }

    public void batchCheckMerchantBank(MerchantVO merchantVO) throws Exception {
        if (merchantVO != null && !CollectionUtils.isEmpty((Collection)merchantVO.getMerchantAgentFinancialInfos())) {
            Long merchantId = Long.valueOf(merchantVO.getId());
            ArrayList<Long> agentFinancialIdList = new ArrayList<Long>();
            ArrayList<AgentFinancial> agentFinancialList = new ArrayList<AgentFinancial>();
            for (MerchantFinancialVO merchantFinancialVO : merchantVO.getMerchantAgentFinancialInfos()) {
                agentFinancialIdList.add(merchantFinancialVO.getId());
                AgentFinancial agentFinancial = new AgentFinancial();
                agentFinancial.setEntityStatus(EntityStatus.Delete);
                agentFinancial.setId((Object)merchantFinancialVO.getId());
                agentFinancialList.add(agentFinancial);
            }
            this.upcCommonFieldCheckService.checkMerchantBank(merchantId, agentFinancialIdList);
            Merchant merchant = new Merchant();
            merchant.setMerchantAgentFinancialInfos(agentFinancialList);
            merchant.setEntityStatus(EntityStatus.Unchanged);
            this.checkDomainDeleteService.checkDomainDeleteDTO("aa.merchant.AgentFinancial", "aa_merchant", (BizObject)merchant);
        }
    }
}


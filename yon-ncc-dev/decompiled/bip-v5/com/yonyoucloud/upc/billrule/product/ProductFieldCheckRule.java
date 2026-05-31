/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.rule.RuleRegister
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.IRpcRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.other.CheckFieldEntity
 *  com.yonyoucloud.upc.utils.AsyncCheckUtil
 *  com.yonyoucloud.upc.utils.BizObjectUtils
 *  org.apache.commons.lang3.SerializationUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.BizObject
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.product;

import com.google.gson.Gson;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.rule.RuleRegister;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.bill.rule.base.IRpcRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.upc.api.service.IBizReferenceCheckService;
import com.yonyoucloud.upc.other.CheckFieldEntity;
import com.yonyoucloud.upc.service.ProductSkuService;
import com.yonyoucloud.upc.service.utils.ProductUtil;
import com.yonyoucloud.upc.utils.AsyncCheckUtil;
import com.yonyoucloud.upc.utils.BizObjectUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import org.apache.commons.lang3.SerializationUtils;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.base.BizObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value="productFieldCheckRule")
public class ProductFieldCheckRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(ProductFieldCheckRule.class);
    private static Logger logger = LoggerFactory.getLogger(ProductFieldCheckRule.class);
    private static final String SPECDEL_KEY = "specKey";
    private static final String SPECDEL_VAL = "specDel";
    public static final HashMap<String, String> CHECK_DOMAIN = new HashMap();
    public static final HashMap<String, String> DOMAIN_RULE_CHECK_PART_FILE;
    public static final HashMap<String, List<String>> CHECK_FIELDS_DOMAIN_PART_FILE;
    private static final List<Map<String, String>> CHECK_DOMAIN_RULE_SUB;
    public static final HashMap<String, String> DOMAIN_RULE;
    public static final HashMap<String, String> DOMAIN_RULE_ORG;
    private static final List<String> CHECK_FIELDS_ALL;
    @Autowired
    @Qualifier(value="ymsExecutorService")
    private ExecutorService ymsExecutorService;
    private static final List<String> CHECK_FIELDS_ALL_ORG_DOMAIN;
    public static final HashMap<String, List<String>> CHECK_FIELDS_DOMAIN;
    public static final HashMap<String, List<String>> CHECK_FIELDS_DOMAIN_ORG;
    public static final HashSet<String> CHECK_Field_Specialty;
    private static final Map<Double, List<String>> SPECFREES_CHECK_DOMAIN;
    private static final List<CheckFieldEntity> CHECK_FIELDS_RULE;
    @Autowired
    private IBizReferenceCheckService checkService;
    @Autowired
    ProductSkuService productSkuService;

    public RuleExecuteResult execute(final BillContext billContext, final Map<String, Object> paramMap) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800137);
        }
        List data = (List)billDataDto.getData();
        List bills = this.getBills(billContext, paramMap);
        final Map field = (Map)new Gson().fromJson(billDataDto.getItem(), Map.class);
        if (field.get("key").toString().contains("freeDefine")) {
            RuleExecuteResult ruleExecuteResult = new RuleExecuteResult();
            ruleExecuteResult.setCancel(true);
            return ruleExecuteResult;
        }
        if (null != field.get("key") && !data.isEmpty()) {
            for (Map map2 : data) {
                if (null != map2.get("changeFileName")) continue;
                String changeFileName = field.get("key").toString().contains("detail!") ? field.get("key").toString().replace("detail!", "") : field.get("key").toString();
                map2.put("changeFileName", changeFileName);
            }
        }
        for (final BizObject bill : bills) {
            Long time2;
            RuleExecuteResult ruleResult;
            Long time1;
            RuleRegister billRuleRegister;
            IRpcRule rpcRule;
            if (!bill.containsKey((Object)"id") || bill.get("id") == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800197);
            }
            if (!bill.containsKey((Object)"productApplyRangeId") || bill.get("productApplyRangeId") == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800198);
            }
            if (!bill.containsKey((Object)"isCreator") || bill.get("isCreator") == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800199);
            }
            if (null != bill.get("productApplyRange_OrgId")) {
                bill.set("productApplyRange_orgId", bill.get("productApplyRange_OrgId"));
            }
            if (!field.get("key").toString().contains("detail!") && bill.get("isCreator").equals(false)) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800200, new Object[]{((Map)field.get("value")).get("text")});
            }
            BizObjectUtils.clearMapParent((Map)bill);
            ArrayList<15> arrayList = new ArrayList<15>();
            if (CHECK_FIELDS_ALL.contains(field.get("key").toString())) {
                Object productId;
                String fieldKey = field.get("key").toString();
                if ("productTemplate_Name".equals(fieldKey) || "useSku".equals(fieldKey) && null == field.get(SPECDEL_KEY)) {
                    this.productSkuService.checkFieldBySku(bill.getId(), fieldKey);
                }
                if ("productTemplate_Name".equals(fieldKey) && ProductUtil.isReferencedByDerivedMaterial((Long)(productId = Long.valueOf(Long.parseLong(bill.get("id").toString()))))) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_OPTIONAL_MATERIAL_REF_NOT_SUPPORT_UPDATE_TEMPLATE);
                }
                productId = CHECK_DOMAIN.entrySet().iterator();
                while (productId.hasNext()) {
                    final Map.Entry entry = (Map.Entry)productId.next();
                    Callable callable = new Callable(){

                        public Object call() throws Exception {
                            if ("cpu-base".equals(entry.getKey())) {
                                if (ProductUtil.checkOpenOption("u8c-config", (String)entry.getValue())) {
                                    return ProductFieldCheckRule.this.excuteRule(billContext, paramMap, DOMAIN_RULE.get(entry.getKey()), (String)entry.getKey(), "pc_product", "delete");
                                }
                                return null;
                            }
                            if ("quote".equals(entry.getKey())) {
                                if (ProductUtil.checkOpenOption("u8c-config", (String)entry.getValue())) {
                                    Object productApplyRangeOrgId = bill.get("productApplyRange_OrgId");
                                    if (field.containsKey("key") && Objects.nonNull(field.get("key")) && "productApplyRange".equals(field.get("key")) && field.containsKey("value") && Objects.nonNull(field.get("value")) && ((Map)field.get("value")).containsKey("orgId") && null != ((Map)field.get("value")).get("orgId")) {
                                        bill.put("productApplyRange_orgId", ((Map)field.get("value")).get("orgId"));
                                    }
                                    String excuteRuleRes = ProductFieldCheckRule.this.excuteRule(billContext, paramMap, DOMAIN_RULE_ORG.get(entry.getKey()), (String)entry.getKey(), "pc_productlist_query", "delete");
                                    bill.put("productApplyRange_orgId", productApplyRangeOrgId);
                                    return excuteRuleRes;
                                }
                                return null;
                            }
                            if ("productApplyRange".equals(field.get("key").toString()) && CHECK_FIELDS_ALL_ORG_DOMAIN.contains(entry.getKey())) {
                                if (ProductUtil.checkOpenOption("u8c-config", (String)entry.getValue())) {
                                    if ("retail".equals(entry.getKey())) {
                                        Object productApplyRangeOrgId = bill.get("productApplyRange_OrgId");
                                        if (field.containsKey("value") && Objects.nonNull(field.get("value")) && ((Map)field.get("value")).containsKey("orgId") && null != ((Map)field.get("value")).get("orgId")) {
                                            bill.put("productApplyRange_orgId", ((Map)field.get("value")).get("orgId"));
                                        }
                                        String excuteRuleRes = ProductFieldCheckRule.this.excuteRule(billContext, paramMap, DOMAIN_RULE_ORG.get(entry.getKey()), (String)entry.getKey(), "pc_productlist_query", "delete");
                                        bill.put("productApplyRange_orgId", productApplyRangeOrgId);
                                        return excuteRuleRes;
                                    }
                                    HashMap<String, Object> contMap = new HashMap<String, Object>();
                                    if (null != field.get("value")) {
                                        ArrayList result = new ArrayList();
                                        HashMap content = new HashMap();
                                        if (null != ((Map)field.get("value")).get("orgName")) {
                                            content.put("productApplyRange_OrgId_Name", ((Map)field.get("value")).get("orgName"));
                                        }
                                        if (null != ((Map)field.get("value")).get("orgId")) {
                                            content.put("productApplyRange_orgId", ((Map)field.get("value")).get("orgId"));
                                        }
                                        if (null != ((Map)field.get("value")).get("productId")) {
                                            content.put("id", ((Map)field.get("value")).get("productId"));
                                        }
                                        BillDataDto checkBillDataDto = new BillDataDto();
                                        checkBillDataDto.setBillnum("pc_product");
                                        result.add(content);
                                        checkBillDataDto.setData(result);
                                        contMap.put("param", checkBillDataDto);
                                    }
                                    return ProductFieldCheckRule.this.excuteRule(billContext, contMap, DOMAIN_RULE_ORG.get(entry.getKey()), (String)entry.getKey(), "pc_product", "delete");
                                }
                            } else if (ProductUtil.checkOpenOption("u8c-config", (String)entry.getValue())) {
                                return ProductFieldCheckRule.this.excuteRule(billContext, paramMap, DOMAIN_RULE.get(entry.getKey()), (String)entry.getKey(), "pc_product", "delete");
                            }
                            return null;
                        }
                    };
                    arrayList.add(callable);
                }
                String res = AsyncCheckUtil.check(arrayList, (ExecutorService)this.ymsExecutorService);
                if (StringUtils.isNotEmpty((CharSequence)res)) {
                    throw new CoreDocBusinessException(res);
                }
                Map<String, Object> result = this.checkService.checkReference("pc.product.Product", (List<Long>)new ArrayList<Long>(){
                    {
                        this.add((Long)bill.get("id"));
                    }
                });
                if (result.containsKey("error") && result.get("error") != null) {
                    throw new CoreDocBusinessException(result.get("error").toString());
                }
            }
            if (CHECK_FIELDS_DOMAIN.keySet().contains(field.get("key").toString())) {
                for (String domain : CHECK_FIELDS_DOMAIN.get(field.get("key").toString())) {
                    if (!CHECK_DOMAIN.keySet().contains(domain) || !ProductUtil.checkOpenOption("u8c-config", CHECK_DOMAIN.get(domain)) || null == (rpcRule = (IRpcRule)AppContext.getBean(IRpcRule.class))) continue;
                    billRuleRegister = ProductUtil.getBillRuleRegister("pc_product", "delete", DOMAIN_RULE.get(domain), domain);
                    time1 = System.currentTimeMillis();
                    log.info(String.format("Product@RPC: start. group = %s", domain));
                    if ("ustock".equals(domain) && "detail!isBatchManage".equals(field.get("key").toString())) {
                        ((Map)((List)((BillDataDto)paramMap.get("param")).getData()).get(0)).put("isBatchManage_Change", "true");
                    }
                    ruleResult = rpcRule.execute(billRuleRegister, billContext, paramMap);
                    log.info("ProductFieldCheckRule check field:[{}] execute rule:[{}], domain:[{}], result:[{}]", new Object[]{field.get("key"), billRuleRegister.getRuleId(), billRuleRegister.getDomain(), ruleResult});
                    time2 = System.currentTimeMillis();
                    log.info(String.format("Product@RPC: return. group = %s, time=%d", domain, time2 - time1));
                    if (null == ruleResult || ruleResult.getMsgCode() == 1) continue;
                    throw new CoreDocBusinessException(ruleResult.getMessage());
                }
            }
            if (CHECK_FIELDS_DOMAIN_PART_FILE.keySet().contains(field.get("key").toString())) {
                for (String domain : CHECK_FIELDS_DOMAIN_PART_FILE.get(field.get("key").toString())) {
                    if (!CHECK_DOMAIN.keySet().contains(domain) || !ProductUtil.checkOpenOption("u8c-config", CHECK_DOMAIN.get(domain)) || null == (rpcRule = (IRpcRule)AppContext.getBean(IRpcRule.class))) continue;
                    billRuleRegister = ProductUtil.getBillRuleRegister("pc_product", "delete", DOMAIN_RULE_CHECK_PART_FILE.get(domain), domain);
                    time1 = System.currentTimeMillis();
                    log.info(String.format("Product@RPC: start. group = %s", domain));
                    ruleResult = rpcRule.execute(billRuleRegister, billContext, paramMap);
                    log.info("ProductFieldCheckRule check field:[{}] execute rule:[{}], domain:[{}], result:[{}]", new Object[]{field.get("key"), billRuleRegister.getRuleId(), billRuleRegister.getDomain(), ruleResult});
                    time2 = System.currentTimeMillis();
                    log.info(String.format("Product@RPC: return. group = %s, time=%d", domain, time2 - time1));
                    if (null == ruleResult || ruleResult.getMsgCode() == 1) continue;
                    throw new CoreDocBusinessException(ruleResult.getMessage());
                }
            }
            if (CHECK_FIELDS_DOMAIN_ORG.keySet().contains(field.get("key").toString())) {
                for (String domain : CHECK_FIELDS_DOMAIN_ORG.get(field.get("key").toString())) {
                    IRpcRule rpcRule2;
                    if (CHECK_DOMAIN.keySet().contains(domain)) {
                        if (!ProductUtil.checkOpenOption("u8c-config", CHECK_DOMAIN.get(domain)) || null == (rpcRule = (IRpcRule)AppContext.getBean(IRpcRule.class))) continue;
                        billRuleRegister = CHECK_Field_Specialty.contains(field.get("key").toString()) && ((Boolean)bill.get("isCreator") != false || "productionorder".equals(domain)) ? ProductUtil.getBillRuleRegister("pc_product", "delete", DOMAIN_RULE.get(domain), domain) : ProductUtil.getBillRuleRegister("pc_product", "delete", DOMAIN_RULE_ORG.get(domain), domain);
                        time1 = System.currentTimeMillis();
                        if ("ustock".equals(domain) && "detail!isBatchManage".equals(field.get("key").toString())) {
                            ((Map)((List)((BillDataDto)paramMap.get("param")).getData()).get(0)).put("isBatchManage_Change", "true");
                        }
                        log.info(String.format("Product@RPC: start. group = %s", domain));
                        ruleResult = rpcRule.execute(billRuleRegister, billContext, paramMap);
                        log.info("ProductFieldCheckRule check field:[{}] execute rule:[{}], domain:[{}], result:[{}]", new Object[]{field.get("key"), billRuleRegister.getRuleId(), billRuleRegister.getDomain(), ruleResult});
                        time2 = System.currentTimeMillis();
                        log.info(String.format("Product@RPC: return. group = %s, time=%d", domain, time2 - time1));
                        if (null == ruleResult || ruleResult.getMsgCode() == 1) continue;
                        throw new CoreDocBusinessException(ruleResult.getMessage());
                    }
                    Optional<Map> optionalMap = CHECK_DOMAIN_RULE_SUB.stream().filter(map -> ((String)map.get("subId")).equals(domain)).findAny();
                    if (!optionalMap.isPresent() || !ProductUtil.checkOpenOption("u8c-config", (String)((Map)optionalMap.get()).get("option")) || null == (rpcRule2 = (IRpcRule)AppContext.getBean(IRpcRule.class))) continue;
                    RuleRegister billRuleRegister2 = ProductUtil.getBillRuleRegister("pc_product", "delete", (String)((Map)optionalMap.get()).get("ruleId"), (String)((Map)optionalMap.get()).get("domain"));
                    Long time12 = System.currentTimeMillis();
                    log.info(String.format("Product@RPC: start. group = %s", domain));
                    RuleExecuteResult ruleResult2 = rpcRule2.execute(billRuleRegister2, billContext, paramMap);
                    log.info("ProductFieldCheckRule check field:[{}] execute rule:[{}], domain:[{}], result:[{}]", new Object[]{field.get("key"), billRuleRegister2.getRuleId(), billRuleRegister2.getDomain(), ruleResult2});
                    Long time22 = System.currentTimeMillis();
                    log.info(String.format("Product@RPC: return. group = %s, time=%d", domain, time22 - time12));
                    if (null == ruleResult2 || ruleResult2.getMsgCode() == 1) continue;
                    throw new CoreDocBusinessException(ruleResult2.getMessage());
                }
            }
            if ("ProductCheckFree".equals(field.get("key").toString())) {
                if (field.containsKey("freeType") && field.get("freeType") != null) {
                    Double freeType = Double.valueOf(field.get("freeType").toString());
                    List<String> domains = SPECFREES_CHECK_DOMAIN.get(freeType);
                    if (null != domains) {
                        for (String domain : domains) {
                            IRpcRule rpcRule3;
                            if (!ProductUtil.checkOpenOption("u8c-config", CHECK_DOMAIN.get(domain)) || null == (rpcRule3 = (IRpcRule)AppContext.getBean(IRpcRule.class))) continue;
                            RuleRegister billRuleRegister3 = ProductUtil.getBillRuleRegister("pc_product", "delete", DOMAIN_RULE.get(domain), domain);
                            Long time13 = System.currentTimeMillis();
                            log.info(String.format("Product@RPC: start. group = %s", domain));
                            RuleExecuteResult ruleResult3 = rpcRule3.execute(billRuleRegister3, billContext, paramMap);
                            log.info("ProductFieldCheckRule check field:[{}] execute rule:[{}], domain:[{}], result:[{}]", new Object[]{field.get("key"), billRuleRegister3.getRuleId(), billRuleRegister3.getDomain(), ruleResult3});
                            Long time23 = System.currentTimeMillis();
                            log.info(String.format("Product@RPC: return. group = %s, time=%d", domain, time23 - time13));
                            if (null == ruleResult3 || ruleResult3.getMsgCode() == 1) continue;
                            throw new CoreDocBusinessException(ruleResult3.getMessage());
                        }
                    }
                } else {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800201);
                }
            }
            for (CheckFieldEntity checkFieldEntity : CHECK_FIELDS_RULE) {
                if (!checkFieldEntity.getFieldName().equals(field.get("key")) || !ProductUtil.checkOpenOption(checkFieldEntity.getOptionDataDomain(), checkFieldEntity.getOptionDataName()) || null == (rpcRule = (IRpcRule)AppContext.getBean(IRpcRule.class))) continue;
                Long time14 = System.currentTimeMillis();
                log.info(String.format("Product@RPC: start. group = %s", checkFieldEntity.getRuleRegister().getDomain()));
                RuleExecuteResult ruleResult4 = rpcRule.execute(checkFieldEntity.getRuleRegister(), billContext, paramMap);
                log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080856", (String)"ProductFieldCheckRule check field:[{}] execute rule:[{}], domain:[{}], result:[{}]\uff0ctime: [{}]"), new Object[]{field.get("key"), checkFieldEntity.getRuleRegister().getRuleId(), checkFieldEntity.getRuleRegister().getDomain(), ruleResult4, System.currentTimeMillis() - time14});
                if (null == ruleResult4 || ruleResult4.getMsgCode() == 1 || ruleResult4.getMessage() == null) continue;
                throw new CoreDocBusinessException(ruleResult4.getMessage());
            }
        }
        return new RuleExecuteResult();
    }

    public String excuteRule(BillContext billContext, Map<String, Object> paramMap, String ruleId, String domain, String billnum, String action) throws Exception {
        IRpcRule rpcRule = (IRpcRule)AppContext.getBean(IRpcRule.class);
        if (null != rpcRule) {
            if (null != domain && "yonyoufi".equalsIgnoreCase(domain)) {
                return null;
            }
            RuleRegister billRuleRegister = ProductUtil.getBillRuleRegister(billnum, action, ruleId, domain);
            HashMap param = (HashMap)SerializationUtils.clone((Serializable)((HashMap)paramMap));
            try {
                RuleExecuteResult ruleResult = rpcRule.execute(billRuleRegister, billContext, (Map)param);
                if (null != ruleResult) {
                    if (ruleResult.getMsgCode() == 1) {
                        return null;
                    }
                    return ruleResult.getMessage();
                }
            }
            catch (Exception e) {
                logger.error("domain:" + domain + ", ruldId:" + ruleId + ", exception:" + e.getMessage(), (Throwable)e);
                return InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080851", (String)"rule\u6821\u9a8c\u5f02\u5e38\uff0cdomain:") + domain + ", ruldId:" + ruleId + ", exception:" + e.getMessage();
            }
        }
        return null;
    }

    static {
        CHECK_DOMAIN.put("ustock", "app:ST");
        CHECK_DOMAIN.put("marketingbill", "app:BBSMK,app:B2Bpricing,app:ChannelOperateCenter,app:creditManG,app:B2Bpromoting,service:allowlimitsalelist");
        CHECK_DOMAIN.put("yonyoufi", "app:IA");
        CHECK_DOMAIN.put("upu", "app:PU");
        CHECK_DOMAIN.put("engineeringdata", "app:ED");
        CHECK_DOMAIN.put("retail", "app:RM");
        CHECK_DOMAIN.put("uinttrade", "app:UIT");
        CHECK_DOMAIN.put("dst", "app:SDOC");
        CHECK_DOMAIN.put("sact", "app:SACT");
        CHECK_DOMAIN.put("cpu-base", "service:ycSupplierCategory");
        CHECK_DOMAIN.put("udinghuo", "app:SCMSA");
        CHECK_DOMAIN.put("quote", "service:salesquotationlist");
        CHECK_DOMAIN.put("productionorder", "app:PO");
        CHECK_DOMAIN.put("mf-ecn", "app:ECN");
        CHECK_DOMAIN.put("requirementsplanning", "app:MR");
        CHECK_DOMAIN.put("yycrm", "app:CRMC");
        CHECK_DOMAIN.put("IMP-WIM", "app:IMPWIM");
        CHECK_DOMAIN_RULE_SUB = new ArrayList<Map<String, String>>();
        CHECK_DOMAIN_RULE_SUB.add((Map<String, String>)new HashMap<String, String>(){
            {
                this.put("domain", "yonyoufi");
                this.put("subId", "ia");
                this.put("option", "app:IA");
                this.put("ruleId", "productReferByIACheckRule");
            }
        });
        DOMAIN_RULE = new HashMap();
        DOMAIN_RULE.put("ustock", "ustockProductQuoteNoOrgCheckRule");
        DOMAIN_RULE.put("marketingbill", "productReferCheckByProductIdRule");
        DOMAIN_RULE.put("yonyoufi", "productIdReferCheckRule");
        DOMAIN_RULE.put("upu", "upuProductQuoteNoOrgCheckRule");
        DOMAIN_RULE.put("engineeringdata", "deleteMaterialCheckRule");
        DOMAIN_RULE.put("retail", "retailProductQuoteNoOrgCheckRule");
        DOMAIN_RULE.put("uinttrade", "uinttradeProductQuoteNoOrgCheckRule");
        DOMAIN_RULE.put("dst", "dstProductQuoteNoOrgCheckRule");
        DOMAIN_RULE.put("sact", "sact.ProductNoOrgRefCheckRule");
        DOMAIN_RULE.put("cpu-base", "cpuProductUpdateCheckRule");
        DOMAIN_RULE.put("udinghuo", "productReferCheckByIdRule");
        DOMAIN_RULE.put("quote", "productNoOrgRefCheckRule");
        DOMAIN_RULE.put("productionorder", "ProductQuoteCheckRule");
        DOMAIN_RULE.put("mf-ecn", "ecnProductQuoteNoOrgCheckRule");
        DOMAIN_RULE.put("requirementsplanning", "productQuoteCheckRule");
        DOMAIN_RULE.put("IMP-WIM", "wimMaterialRefCheckRule");
        DOMAIN_RULE_CHECK_PART_FILE = new HashMap();
        DOMAIN_RULE_CHECK_PART_FILE.put("ustock", "ustockProductQuoteCheckBillRule");
        DOMAIN_RULE_CHECK_PART_FILE.put("engineeringdata", "deleteMaterialCheckRule");
        DOMAIN_RULE_ORG = new HashMap();
        DOMAIN_RULE_ORG.put("ustock", "ustockProductQuoteCheckRule");
        DOMAIN_RULE_ORG.put("uinttrade", "uinttradeProductQuoteOrgCheckRule");
        DOMAIN_RULE_ORG.put("udinghuo", "productReferCheckRule");
        DOMAIN_RULE_ORG.put("yonyoufi", "productReferCheckRule");
        DOMAIN_RULE_ORG.put("upu", "upuProductQuoteCheckRule");
        DOMAIN_RULE_ORG.put("retail", "retailProductQuoteCheckRule");
        DOMAIN_RULE_ORG.put("dst", "dstProductQuoteCheckRule");
        DOMAIN_RULE_ORG.put("engineeringdata", "EdProductOrgQuoteCheckRule");
        DOMAIN_RULE_ORG.put("quote", "productRefCheckRule");
        DOMAIN_RULE_ORG.put("IMP-WIM", "wimMaterialRefCheckRule");
        DOMAIN_RULE_ORG.put("sact", "sact.ProductRefCheckRule");
        DOMAIN_RULE_ORG.put("yycrm", "deleteProductCheckForCRMRule");
        CHECK_FIELDS_ALL = new ArrayList<String>();
        CHECK_FIELDS_ALL.add("realProductAttribute");
        CHECK_FIELDS_ALL.add("realProductAttributeType");
        CHECK_FIELDS_ALL.add("virtualProductAttribute");
        CHECK_FIELDS_ALL.add("productTemplate_Name");
        CHECK_FIELDS_ALL.add("unit_Name");
        CHECK_FIELDS_ALL.add("unit");
        CHECK_FIELDS_ALL.add("unitUseType");
        CHECK_FIELDS_ALL.add("enableAssistUnit");
        CHECK_FIELDS_ALL.add("assistUnit");
        CHECK_FIELDS_ALL.add("assistUnit_Name");
        CHECK_FIELDS_ALL.add("mainUnitCountNew");
        CHECK_FIELDS_ALL.add("unitExchangeType");
        CHECK_FIELDS_ALL.add("productApplyRange");
        CHECK_FIELDS_ALL.add("assistUnitCount");
        CHECK_FIELDS_ALL_ORG_DOMAIN = new ArrayList<String>();
        CHECK_FIELDS_ALL_ORG_DOMAIN.add("ustock");
        CHECK_FIELDS_ALL_ORG_DOMAIN.add("uinttrade");
        CHECK_FIELDS_ALL_ORG_DOMAIN.add("dst");
        CHECK_FIELDS_ALL_ORG_DOMAIN.add("udinghuo");
        CHECK_FIELDS_ALL_ORG_DOMAIN.add("upu");
        CHECK_FIELDS_ALL_ORG_DOMAIN.add("engineeringdata");
        CHECK_FIELDS_ALL_ORG_DOMAIN.add("retail");
        CHECK_FIELDS_ALL_ORG_DOMAIN.add("yonyoufi");
        CHECK_FIELDS_ALL_ORG_DOMAIN.add("sact");
        CHECK_FIELDS_ALL_ORG_DOMAIN.add("quote");
        CHECK_FIELDS_ALL_ORG_DOMAIN.add("yycrm");
        CHECK_FIELDS_DOMAIN = new HashMap();
        CHECK_FIELDS_DOMAIN.put("optionalType", (List<String>)new ArrayList<String>(){
            {
                this.add("engineeringdata");
            }
        });
        CHECK_FIELDS_DOMAIN_PART_FILE = new HashMap();
        CHECK_FIELDS_DOMAIN_PART_FILE.put("ptoPriceType", (List<String>)new ArrayList<String>(){
            {
                this.add("engineeringdata");
            }
        });
        CHECK_FIELDS_DOMAIN_ORG = new HashMap();
        CHECK_FIELDS_DOMAIN_ORG.put("detail!isSerialNoManage", (List<String>)new ArrayList<String>(){
            {
                this.add("ustock");
            }
        });
        CHECK_FIELDS_DOMAIN_ORG.put("detail!checkByBatch", (List<String>)new ArrayList<String>(){
            {
                this.add("ia");
                this.add("retail");
            }
        });
        CHECK_FIELDS_DOMAIN_ORG.put("detail!isCheckFree", (List<String>)new ArrayList<String>(){
            {
                this.add("ia");
                this.add("retail");
            }
        });
        CHECK_FIELDS_DOMAIN_ORG.put("detail!valueManageType", (List<String>)new ArrayList<String>(){
            {
                this.add("ia");
            }
        });
        CHECK_FIELDS_DOMAIN_ORG.put("detail!costValuation", (List<String>)new ArrayList<String>(){
            {
                this.add("ia");
            }
        });
        CHECK_FIELDS_DOMAIN_ORG.put("detail!isBatchManage", (List<String>)new ArrayList<String>(){
            {
                this.add("ustock");
                this.add("udinghuo");
                this.add("productionorder");
                this.add("IMP-WIM");
            }
        });
        CHECK_FIELDS_DOMAIN_ORG.put("detail!isExpiryDateManage", (List<String>)new ArrayList<String>(){
            {
                this.add("ustock");
                this.add("productionorder");
            }
        });
        CHECK_FIELDS_DOMAIN_ORG.put("detail!manageByInventory", (List<String>)new ArrayList<String>(){
            {
                this.add("ustock");
                this.add("udinghuo");
            }
        });
        CHECK_FIELDS_DOMAIN_ORG.put("detail!atpInspection", (List<String>)new ArrayList<String>(){
            {
                this.add("udinghuo");
                this.add("ustock");
                this.add("upu");
                this.add("productionorder");
            }
        });
        CHECK_Field_Specialty = new HashSet();
        CHECK_Field_Specialty.add("detail!isBatchManage");
        CHECK_Field_Specialty.add("detail!isExpiryDateManage");
        CHECK_Field_Specialty.add("detail!manageByInventory");
        CHECK_Field_Specialty.add("detail!atpInspection");
        CHECK_Field_Specialty.add("detail!isSerialNoManage");
        SPECFREES_CHECK_DOMAIN = new HashMap<Double, List<String>>();
        SPECFREES_CHECK_DOMAIN.put(0.0, (List<String>)new ArrayList<String>(){
            {
                this.add("yonyoufi");
                this.add("retail");
            }
        });
        SPECFREES_CHECK_DOMAIN.put(1.0, (List<String>)new ArrayList<String>(){
            {
                this.add("engineeringdata");
            }
        });
        CHECK_FIELDS_RULE = new ArrayList<CheckFieldEntity>(5);
        CHECK_FIELDS_RULE.add(new CheckFieldEntity(ProductUtil.getBillRuleRegister("pc_product", "delete", "checkCurrentStockRule", "ustock"), "u8c-config", "app:ST", "detail!reservation", "ustock"));
        CHECK_FIELDS_RULE.add(new CheckFieldEntity(ProductUtil.getBillRuleRegister("pc_product", "delete", "pcm.saveProductCheckSingleRule", "fipcm"), "u8c-config", "app:PCM", "detail!accountingByItem", "fipcm"));
        CHECK_FIELDS_RULE.add(new CheckFieldEntity(ProductUtil.getBillRuleRegister("pc_product", "delete", "IAMaterialDocCheckRule", "yonbip-fi-eia"), "u8c-config", "app:EIA", "realProductAttribute", "yonbip-fi-eia"));
        CHECK_FIELDS_RULE.add(new CheckFieldEntity(ProductUtil.getBillRuleRegister("pc_product", "delete", "IAMaterialDocCheckRule", "yonbip-fi-eia"), "u8c-config", "app:EIA", "detail!valueManageType", "yonbip-fi-eia"));
        CHECK_FIELDS_RULE.add(new CheckFieldEntity(ProductUtil.getBillRuleRegister("pc_product", "delete", "IAMaterialDocCheckRule", "yonbip-fi-eia"), "u8c-config", "app:EIA", "detail!costValuation", "yonbip-fi-eia"));
        CHECK_FIELDS_RULE.add(new CheckFieldEntity(ProductUtil.getBillRuleRegister("pc_product", "delete", "IAMaterialDocCheckRule", "yonbip-fi-eia"), "u8c-config", "app:EIA", "detail!checkByBatch", "yonbip-fi-eia"));
        CHECK_FIELDS_RULE.add(new CheckFieldEntity(ProductUtil.getBillRuleRegister("pc_product", "delete", "IAMaterialDocCheckRule", "yonbip-fi-eia"), "u8c-config", "app:EIA", "detail!checkByProject", "yonbip-fi-eia"));
        CHECK_FIELDS_RULE.add(new CheckFieldEntity(ProductUtil.getBillRuleRegister("pc_product", "delete", "IAMaterialDocCheckRule", "yonbip-fi-eia"), "u8c-config", "app:EIA", "detail!checkBySalesOrders", "yonbip-fi-eia"));
        CHECK_FIELDS_RULE.add(new CheckFieldEntity(ProductUtil.getBillRuleRegister("pc_product", "delete", "IAMaterialDocCheckRule", "yonbip-fi-eia"), "u8c-config", "app:EIA", "detail!checkByClient", "yonbip-fi-eia"));
        CHECK_FIELDS_RULE.add(new CheckFieldEntity(ProductUtil.getBillRuleRegister("pc_product", "delete", "IAMaterialDocCheckRule", "yonbip-fi-eia"), "u8c-config", "app:EIA", "detail!checkByOutsourcing", "yonbip-fi-eia"));
        CHECK_FIELDS_RULE.add(new CheckFieldEntity(ProductUtil.getBillRuleRegister("pc_product", "delete", "IAMaterialDocCheckRule", "yonbip-fi-eia"), "u8c-config", "app:EIA", "productTemplate_Name", "yonbip-fi-eia"));
        CHECK_FIELDS_RULE.add(new CheckFieldEntity(ProductUtil.getBillRuleRegister("pc_product", "delete", "EditProductTemplateCheckForCRMRule", "yycrm"), "u8c-config", "app:MKA,app:SFA,app:DSFA", "productTemplate_Name", "yycrm"));
        CHECK_FIELDS_RULE.add(new CheckFieldEntity(ProductUtil.getBillRuleRegister("pc_product", "delete", "cosmCheckMaterialRefRule", "ucf-amc-aum"), "u8c-config", "app:AUM", "detail!turnoverMaterials", "ucf-amc-aum"));
    }
}

